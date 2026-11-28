
class Calculator {

    double number1 = 20;
    double number2 = 10;

    void add() {
        System.out.println("Addition: " + (number1 + number2));
    }

    void subtract() {
        System.out.println("Subtraction: " + (number1 - number2));
    }

    void multiply() {
        System.out.println("Multiplication: " + (number1 * number2));
    }

    void divide() {
        if (number2 != 0) {
            System.out.println("Division: " + (number1 / number2));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

    public static void main(String[] args) {

        Calculator obj1 = new Calculator();

        // Perform calculations
        obj1.add();
        obj1.subtract();
        obj1.multiply();
        obj1.divide();
    }
}
