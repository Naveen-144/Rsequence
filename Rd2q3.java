import java.util.Scanner;

public class Rd2q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the minutes");
        int m =scan.nextInt();
        int h=m/60;
        int M=m%60;
        System.out.println("the equialent hour is "+h+" hours and "+M+" minutes");
        scan.close();
        

    }
    
}
