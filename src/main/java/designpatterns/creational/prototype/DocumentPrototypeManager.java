package designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * DocumentPrototypeManager
 * + the HashMap acts as a registry of the prototypes
 * + TAndC and NDAgreement prototypes are added to the Map
 * + getClonedDocument - static method based on string parameter receives a prototype from the map and calls the
 *      clonedDocument() method on the prototype for a copy/clone and returns it.
 */
public class DocumentPrototypeManager {
    private static Map<String, PrototypeCapableDocument> prototypes = new HashMap<String, PrototypeCapableDocument>();

    /**
     * Static Initialization Block in Java
     *
     * A Static Initialization Block in Java is a block that runs before the main( ) method in Java.
     *
     * Java does not care if this block is written after the main( ) method or before the main( ) method, it will be executed before the main method( ) regardless.
     *
     * In the entire program, the Static Initialization Block will execute only one time.
     *
     * There can be many Static Initialization Blocks in a specific class.
     *
     * If we have many Static Initialization Blocks in Java then they are called in a manner in the order they are written in the program.
     *
     * This block will not return anything.
     *
     * Checked exceptions cannot be thrown.
     *
     * We cannot use the "this" keyword since it does not have any instance.
     *
     * Static block is executed once in cases multiple instances of the class.
     *
     * Static Initialization Block is not stored in the Heap but in the Stack because it is executed only once.
     */
    static {
        TAndC tAndC = new TAndC();
        tAndC.setVendorName("Vendor Name Placeholder");
        /* Retrieve Terms and conditions from database/network call/disk I/O here */
        tAndC.setContent("Please read and accept the terms and conditions...");
        prototypes.put("tandc", tAndC);

        AuthorizedSignatory authorizedSignatory = new AuthorizedSignatory();
        authorizedSignatory.setName("Andrew Clark");
        authorizedSignatory.setDesignation("Operation Head");
        NDAgreement nda = new NDAgreement();
        nda.setVendorName("Vendor Name Placeholder");
        /* Retrieve Non Disclosure Agreement from database/network call/ disk I/O here */
        nda.setContent("Please read and accept the NDA...");
        nda.setAuthorizedSignatory(authorizedSignatory);
        prototypes.put("nda", nda);
    }

    public static PrototypeCapableDocument getClonedDocument(final String type) {
        PrototypeCapableDocument clonedDoc = null;
        try {
            PrototypeCapableDocument doc = prototypes.get(type);
            clonedDoc = doc.cloneDocument();
        } catch (CloneNotSupportedException | NullPointerException e) {
            e.printStackTrace();
        }

        return clonedDoc;
    }
}
