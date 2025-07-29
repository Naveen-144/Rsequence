import java.util.Scanner;  
public class Rd7q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range");
        int n=sc.nextInt();
        System.out.println("enter the elements in array");
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+b[i];
        }
        int avg=sum/n;
        System.out.println("the average is: "+avg);
        sc.close();
    }
}
 