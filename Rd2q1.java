import java.util.Scanner;
public class Rd2q1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
            System.out.println("Enter the prinipal amount :");
            int p=a.nextInt();
            System.out.println("Enter rate of interest :");
            int r=a.nextInt();
            System.out.println("Enter duration in years :");
            int t=a.nextInt();
            int s=(p*r*t)/100;
            System.out.println("your Simple interest is :"+s);
            a.close();

        
    }
    
}
