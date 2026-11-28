
class Student {

    // Method Overloading
    void display() {
        System.out.println("Student Details");
    }

    void display(String name) {
        System.out.println("Student Name: " + name);
    }

    void display(String name, int age) {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {

        Student obj1 = new Student();

        // Calling overloaded methods
        obj1.display();
        obj1.display("Aman");
        obj1.display("Aman", 21);

        // Creating object of child class
        CollegeStudent obj2 = new CollegeStudent();

        // Calling overridden method
        obj2.showCourse();
    }
}

// Parent class
class Person {

    void showCourse() {
        System.out.println("Course: General Studies");
    }
}

// Child class
class CollegeStudent extends Person {

    // Method Overriding
    @Override
    void showCourse() {
        System.out.println("Course: BTech CSE");
    }
}
