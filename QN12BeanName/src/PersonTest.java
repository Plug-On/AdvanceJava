//12. Write a java program to create a simple JavaBean with properties for first name, last
//name, and age. Implement getter and setter methods

public class PersonTest {
    public static void main(String[] args) {
        // Create JavaBean object
        Person person = new Person();

        // Set properties using setters
        person.setFirstName("Raja");
        person.setLastName("Thapa");
        person.setAge(22);

        // Get and print properties using getters
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
    }
}
