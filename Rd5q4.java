import java.util.Scanner;

public class Rd5q4 {
    public static void main(String[] args) {
            try (Scanner scan = new Scanner(System.in)) {
                System.out.println("Enter the word");
                String sc=scan.nextLine();
                //remove spaces
                System.out.println(sc.replace(" ", ""));
            }
        }
    
}
