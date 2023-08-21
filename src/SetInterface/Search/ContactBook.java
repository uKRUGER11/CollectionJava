package SetInterface.Search;

import java.util.HashSet;
import java.util.Set;

public class ContactBook {
    private Set<Contact> contactSet;

    public ContactBook() {
        this.contactSet = new HashSet<>();
    }

    public void addContact(String name, int number) {
        contactSet.add(new Contact(name, number));
    }

    public void findAll() {
        System.out.println(contactSet);
    }

    public Set<Contact> findByName(String name) {
        Set<Contact> contactsByname = new HashSet<>();
        for (Contact c : contactSet) {
            if (c.getName().startsWith(name)) {
                contactsByname.add(c);
            }
        }
        return contactsByname;
    }

    public Contact updatedContact(String name, int newNumber) {
        Contact updateContact = null;
        for (Contact c : contactSet) {
            if (c.getName().equalsIgnoreCase(name)) {
                c.setNumber(newNumber);
                updateContact = c;
                break;
            }
        }
        return updateContact;
    }
}
