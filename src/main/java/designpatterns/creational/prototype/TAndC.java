package designpatterns.creational.prototype;

/**
 * TAndC - ConcretePrototype
 */
public class TAndC extends PrototypeCapableDocument {

    @Override
    public PrototypeCapableDocument cloneDocument() {

        /**
         * Clone with Shallow copy
         */
        TAndC tAndC = null;

        try {
            tAndC = (TAndC) super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return tAndC;
    }

    @Override
    public String toString() {
        return "[TAndC: Vendor Name - " + getVendorName() + ", Content = " + getContent() + "]";
    }
}
