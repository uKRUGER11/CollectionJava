package ListInterface.Assortment;

public class Main {
    public static void main(String[] args) {
        AssortmentPeople assortmentPeople = new AssortmentPeople();

        assortmentPeople.addPerson("Gabriel", 19, 1.80);
        assortmentPeople.addPerson("Maria Eduarda", 14, 1.65);
        assortmentPeople.addPerson("Mel Gibson", 46, 1.85);
        assortmentPeople.addPerson("Fernanda", 45, 1.55);

        System.out.println(assortmentPeople.sortedPerAge());
        System.out.println(assortmentPeople.sortedPerHeight());
    }
}
