public class Student {
    // Simple properties
    private String name;
    private int age;

    // Indexed property
    private int[] marks;

    // No-argument constructor
    public Student() {
        marks = new int[5]; // default array size
    }

    // Getter and setter for name (simple property)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for age (simple property)
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Setter and getter for indexed property
    public void setMark(int index, int value) {
        marks[index] = value;
    }
    public int getMark(int index) {
        return marks[index];
    }

    // Optionally, set/get full array
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public int[] getMarks() {
        return marks;
    }
}
