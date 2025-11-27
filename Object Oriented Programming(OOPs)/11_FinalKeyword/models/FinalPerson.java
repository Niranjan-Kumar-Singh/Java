package models;

public class FinalPerson {
    private String name;
    private int age;

    public FinalPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int a) {
        this.age = a;
    }

    // The toString() method returns a readable text representation of the object.
    // When we print the object (e.g., System.out.println(person)),
    // Java automatically calls this method to decide what to display.
    // Overriding it helps us see meaningful information instead of the default memory address.
    @Override
    public String toString() {
        return "FinalPerson[name=" + name + ", age=" + age + "]";
    }
}