import java.util.Scanner;

public class Rd5q3 {
     public static void main(String[] args) {
            try (Scanner scan = new Scanner(System.in)) {
                System.out.println("Enter the word");
                String sc=scan.nextLine();
                //uppercase to lowercase;]
                sc=sc.toLowerCase();
                System.out.println(sc);
                //lowercase to uppercase
                sc=sc.toUpperCase();
                System.out.println(sc);
            }
        }
}
