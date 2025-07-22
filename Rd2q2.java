import java.util.Scanner;

public class Rd2q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the two numbers :");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c=a+b;
        double avg = c/2;
        System.out.println("The average of two numbers are :"+avg);
        scan.close();
    }
    
}
