package designpatterns.creational.abstractFactory;

import designpatterns.creational.prototype.DocumentPrototypeManager;
import designpatterns.creational.prototype.PrototypeCapableDocument;
import org.junit.jupiter.api.Test;

public class DocumentPrototypeManagerTest {

    @Test
    public void testGetClonedDocument() throws Exception {
        PrototypeCapableDocument clonedTAndC = DocumentPrototypeManager.getClonedDocument("tandc");
        clonedTAndC.setVendorName("Mary J.");
        System.out.println(clonedTAndC);

        PrototypeCapableDocument clonedNDAgreement = DocumentPrototypeManager.getClonedDocument("nda");
        clonedNDAgreement.setVendorName("Mahesh Nair");
        System.out.println(clonedNDAgreement);
    }
}
