package github.kishor.bookstore.bookstoredomain.model;

public class BookPublisher {

    private String id;
    private String name;
    private ContactDetails contactDetails;

    public BookPublisher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
