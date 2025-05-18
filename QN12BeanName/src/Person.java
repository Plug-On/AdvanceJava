//12. Write a java program to create a simple JavaBean with properties for first name, last
//name, and age. Implement getter and setter methods


public class Person {
    // Private properties
    private String firstName;
    private String lastName;
    private int age;

    // No-argument constructor (required for JavaBean)
    public Person() {}

    // Getter and Setter for firstName
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for lastName
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
