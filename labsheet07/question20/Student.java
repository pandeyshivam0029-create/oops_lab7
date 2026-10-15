package college.students;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Student name: " + name);
    }
}
