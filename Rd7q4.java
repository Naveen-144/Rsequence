import java.util.Scanner;

public class Rd7q4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the range");
        int n=sc.nextInt();
        System.out.println("enter the elements in array");
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        System.out.println("Duplicate elements are:");
        for (int i = 0; i < n; i++) {
            boolean isAlreadyPrinted = false;

            
            for (int k = 0; k < i; k++) {
                if (b[i] == b[k]) {
                    isAlreadyPrinted = true;
                    break;
                }
            }

            if (isAlreadyPrinted) continue;

            
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
    

