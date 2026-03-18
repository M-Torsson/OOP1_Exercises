package Lexcon;

public class Student {

    private int studentId;
    private String name;
    private int age;
    private String major;

    public Student(int studentId, String name, int age, String major) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public String getName() {
        return name;
    }
}