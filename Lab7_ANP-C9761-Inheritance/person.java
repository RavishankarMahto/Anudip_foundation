public class person {
    // Attributes
    private String name;
    private int age;

    // Constructor to initialize name and age
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    public void speak() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }

    // Main method to test the program
    public static void main(String[] args) {
        // Create a Person object with name "Ravishankar" and age 22
        person person = new person("Ravishankar", 22);
        // Call the speak method
        person.speak();
    }
}
