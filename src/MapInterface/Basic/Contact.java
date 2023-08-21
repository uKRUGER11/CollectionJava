package MapInterface.Basic;

public class Contact {
    private String name;
    private int number;

    public Contact (String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "(" + name + ", " + number + ")";
    }
}


class Application {
    public static void main(String[] args) {
       ContactBook contactBook = new ContactBook();

        contactBook.addContact("Carlos", 123451);
        contactBook.addContact("Denis", 345234);
        contactBook.addContact("Bob Alves", 224089);
        contactBook.addContact("Maria", 566346);
        contactBook.addContact("Carlos DIO", 3344556);
        contactBook.addContact("Carlos", 124451);
        contactBook.findAll();

        contactBook.removeContact("Bob Alves");
        contactBook.findAll();

        System.out.println("O número desse contato é: " + contactBook.findByName("Carlos DIO"));
    }
}