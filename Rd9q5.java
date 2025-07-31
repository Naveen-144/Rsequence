public class Rd9q5 {
     // Method with 2 parameters
     int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with 3 parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Rd9q5 calc = new Rd9q5();

        System.out.println("Sum of 2 numbers: " + calc.add(5, 10));
        System.out.println("Sum of 3 numbers: " + calc.add(5, 10, 15));
    }
    
}
