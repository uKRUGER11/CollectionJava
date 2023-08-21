package MapInterface.Search.Basic;

import java.util.HashMap;
import java.util.Map;

public class ContactBook {
    private Map<String, Integer> contactBookMap;

    public ContactBook() {
        this.contactBookMap = new HashMap<>();
    }

    public void addContact(String name, Integer number) {
        contactBookMap.put(name, number);
    }

    public void removeContact(String name) {
        if (!contactBookMap.isEmpty()) {
            contactBookMap.remove(name);
        }
    }

    public void findAll() {
        System.out.println(contactBookMap);
    }

    public Integer findByName(String name) {
        Integer numberPerName = null;
        if (!contactBookMap.isEmpty()) {
            numberPerName = contactBookMap.get(name);
        }
        return numberPerName;
    }
}
