public class Rd9q8 {
    
    // 1️⃣ Addition methods
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    // 2️⃣ Subtraction methods
    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    // 3️⃣ Multiplication methods
    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    // 4️⃣ Division methods
    double divide(int a, int b) {
        return (double) a / b;
    }

    double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Rd9q8 calc = new Rd9q8();

        // Addition examples
        System.out.println("Add 2 ints: " + calc.add(5, 10));
        System.out.println("Add 3 ints: " + calc.add(5, 10, 15));
        System.out.println("Add 2 doubles: " + calc.add(5.5, 10.2));

        // Subtraction examples
        System.out.println("Subtract ints: " + calc.subtract(20, 7));
        System.out.println("Subtract doubles: " + calc.subtract(15.5, 4.2));

        // Multiplication examples
        System.out.println("Multiply ints: " + calc.multiply(3, 4));
        System.out.println("Multiply doubles: " + calc.multiply(2.5, 4.0));

        // Division examples
        System.out.println("Divide ints: " + calc.divide(10, 3));
        System.out.println("Divide doubles: " + calc.divide(7.5, 2.5));
    }
    
}
