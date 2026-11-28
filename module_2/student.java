class Student {

    String name = "Aman";
    int rollNumber = 101;
    int age = 21;
    String course = "BTech CSE";

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {

        Student obj1 = new Student();

        // Display student details
        obj1.displayDetails();
    }
}