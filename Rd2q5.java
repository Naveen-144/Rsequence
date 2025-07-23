import java.util.Scanner;

public class Rd2q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the character");
        char n=scan.next().charAt(0);
        int ASIIC=(int)n;
        System.out.println("the ASIIC value is: "+ASIIC);
        scan.close();
    }
    
}

