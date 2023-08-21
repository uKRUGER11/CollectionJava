package SetInterface.Assortment;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentManager {
    private Set<Student> studentSet;

    public StudentManager() {
        this.studentSet = new HashSet<>();
    }

    public void addStudent(String name, long matriculation, double average) {
        studentSet.add(new Student(name, matriculation, average));
    }

    public void removeStudent(long matriculation) {
        Student studentToRemove = null;
        for (Student s : studentSet) {
            if (s.getMatriculation() == matriculation) {
                studentToRemove = s;
                break;
            }
        }
       studentSet.remove(studentToRemove);
    }

    public void findAllByName() {
        Set<Student> studentsPerName = new TreeSet<>(studentSet);
        System.out.println(studentsPerName);
    }

    public void findAllByAverage() {
        Set<Student> studentsPerAverage = new TreeSet<>(new ComparatorPerAverage());
        studentsPerAverage.addAll(studentSet);
        System.out.println(studentsPerAverage);
    }

    public void findAll() {
        System.out.println(studentSet);
    }
}
