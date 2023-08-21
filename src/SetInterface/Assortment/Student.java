package SetInterface.Assortment;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private long matriculation;
    private double average;

    public Student(String name, long matriculation, double average) {
        this.name = name;
        this.matriculation = matriculation;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public long getMatriculation() {
        return matriculation;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public int compareTo(Student s) {
        return name.compareTo(s.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matriculation == student.matriculation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matriculation);
    }

    @Override
    public String toString() {
        return "(" + name + " - " + matriculation + " - " + average + ")";
    }
}

class ComparatorPerAverage implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getAverage(), s2.getAverage());
    }
}

class Application {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        studentManager.addStudent("Samuel", 123456l, 5);
        studentManager.addStudent("Albert", 1234567l, 8);
        studentManager.addStudent("Gabriel", 12345678l, 3);
        studentManager.addStudent("Wesley", 123456789l, 9);
        studentManager.addStudent("Denis", 123455589l, 2);
        studentManager.findAll();

        studentManager.removeStudent(123455589l);
        studentManager.findAll();

        studentManager.findAllByName();

        studentManager.findAllByAverage();
    }
}

