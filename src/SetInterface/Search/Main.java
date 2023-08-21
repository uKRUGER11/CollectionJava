package SetInterface.Search;

public class Main {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();

        contactBook.addContact("Carlos", 123451);
        contactBook.addContact("Denis", 345234);
        contactBook.addContact("Bob Alves", 224089);
        contactBook.addContact("Maria", 566346);
        contactBook.addContact("Carlos DIO", 3344556);

        contactBook.findAll();

        System.out.println(contactBook.findByName("Carlos"));
        System.out.println("Contato atualizado: " + contactBook.updateContact("Carlos", 1010188));
        contactBook.findAll();
    }
}
