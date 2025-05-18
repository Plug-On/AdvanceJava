public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();

        // Set simple properties
        student.setName("Raja");
        student.setAge(20);

        // Set indexed properties
        student.setMark(0, 85);
        student.setMark(1, 90);
        student.setMark(2, 78);

        // Display data
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Marks:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Subject " + (i + 1) + ": " + student.getMark(i));
        }
    }
}
