package designpatterns.creational.prototype;

public class NDAgreement extends PrototypeCapableDocument {

    private AuthorizedSignatory authorizedSignatory;

    public AuthorizedSignatory getAuthorizedSignatory() {
        return authorizedSignatory;
    }

    public void setAuthorizedSignatory(AuthorizedSignatory authorizedSignatory) {
        this.authorizedSignatory = authorizedSignatory;
    }

    @Override
    public PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException {
        /**
         * Clone with deep copy
         */
        NDAgreement nda;
        nda = (NDAgreement) super.clone();
        // cloning AuthorizedSignatory object
        AuthorizedSignatory clonedAuthorizedSignatory = (AuthorizedSignatory) nda.getAuthorizedSignatory().clone();
        nda.setAuthorizedSignatory(clonedAuthorizedSignatory);
        return nda;
    }

    @Override
    public String toString() {
        return "NDAgreement{" +
                "vendorName='" + getVendorName() +
                "',content='" + getContent() +
                "',authorizedSignatory='" + getAuthorizedSignatory() +
                "'}";
    }
}
