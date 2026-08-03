import java.util.*;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Rahul", 87.5));
        students.add(new Student(102, "Priya", 91.0));
        students.add(new Student(103, "Arjun", 78.0));

        System.out.println("Student Records");
        for(Student s : students){
            System.out.println(s);
        }
    }
}
