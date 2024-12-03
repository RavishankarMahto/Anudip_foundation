// Base class Person
class Person {
    // Attributes
    private String name;
    private int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    public void speak() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}

// Derived class Student
class Student extends Person {
    // Additional attribute
    private String grade;

    // Constructor to initialize name, age, and grade
    public Student(String name, int age, String grade) {
        super(name, age); // Call the constructor of the Person class
        this.grade = grade;
    }

    // Method to display study message
    public void study() {
        System.out.println("I am studying for grade: " + grade + ".");
    }
}

// Main class to test the program
public class Main1 {
    public static void main(String[] args) {
        // Create a Student object using the constructor
        Student student = new Student("Ravishankar", 22, "12th");

        // Call speak() and study() methods
        student.speak(); // Method from Person class
        student.study(); // Method from Student class
    }
}
