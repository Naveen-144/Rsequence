import java.util.Scanner;

public class Rd7q4a {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int n = sc.nextInt();

        System.out.println("Enter the elements in array:");
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements are:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (b[i] == b[j]) {
                    System.out.println(b[i]);
                    break;
                }
            }
        }

        sc.close();
    }
    
}
