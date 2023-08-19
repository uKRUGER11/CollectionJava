package ListInterface.Assortment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AssortmentPeople {
    private List<Person> peopleList;

    public AssortmentPeople() {
        this.peopleList = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height) {
        peopleList.add(new Person(name, age, height));
    }

    public List<Person> sortedPerAge() {
        List<Person> peoplePerAge = new ArrayList<>(peopleList);
        Collections.sort(peoplePerAge);
        return peoplePerAge;
    }

    public List<Person> sortedPerHeight() {
        List<Person> peoplePerHeight = new ArrayList<>(peopleList);
        Collections.sort(peoplePerHeight, new ComparatorPerHeight());
        return peoplePerHeight;
    }
}
