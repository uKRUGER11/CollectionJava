package ListInterface.Assortment;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public int compareTo(Person p) {
        return Integer.compare(age, p.getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}

class ComparatorPerHeight implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Double.compare(p1.getHeight(),  p2.getHeight());
    }
}
