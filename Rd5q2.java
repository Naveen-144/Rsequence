    import java.util.Scanner;

    public class Rd5q2 {
        public static void main(String[] args) {
            try (Scanner scan = new Scanner(System.in)) {
                System.out.println("Enter the word");
                String sc=scan.nextLine();
                System.out.println(sc.replace(" ", "-"));
            }
        }

        
    }
