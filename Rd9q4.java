import java.util.Scanner;

public class Rd9q4 {
    void area(double r) {
        double area = Math.PI * r * r;
        System.out.println("Area of the circle: " + area);
    }
    void area(double l, double b) {
        double area = l * b;
        System.out.println("Area of the rectangle: " + area);
    }
    void area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of the triangle: " + area);
    }
    void area(double a, double b, double c, double d) {
        double area = (a + b) * c / 2;
        System.out.println("Area of the trapezium: " + area);
    }
    void area(double a, double b, double c, double d, double e) {
        double area = (a + b + c + d + e) / 5;
        System.out.println("Area of the pentagon: " + area);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rd9q4 obj = new Rd9q4();
        System.out.println("Enter radius of circle:");
        double r = scan.nextDouble();
        obj.area(r);
        System.out.println("Enter length and breadth of rectangle:");
        double l = scan.nextDouble();
        double b = scan.nextDouble();
        obj.area(l, b);
        System.out.println("Enter sides of triangle:");
        double a = scan.nextDouble();
        double b1 = scan.nextDouble();
        double c = scan.nextDouble();
        obj.area(a, b1, c);
        System.out.println("Enter sides of trapezium:");
        double a1 = scan.nextDouble();
        double b2 = scan.nextDouble();
        double c1 = scan.nextDouble();
        double d1 = scan.nextDouble();
        obj.area(a1, b2, c1, d1);
        System.out.println("Enter sides of pentagon:");
        double a2 = scan.nextDouble();
        double b3 = scan.nextDouble();
        double c2 = scan.nextDouble();
        double d2 = scan.nextDouble();
        double e = scan.nextDouble();
        obj.area(a2, b3, c2, d2, e);
        scan.close();   
    }
    
}
