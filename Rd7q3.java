import java.util.Scanner;

public class Rd7q3 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range");
        int n=sc.nextInt();
        System.out.println("enter the elements in array");
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        System.out.println("enter the alue to be searhed");
        int s=sc.nextInt();
        for(int i=0;i<n;i++){
            if(s==b[i]){
                System.out.println("the element is presented at index: "+i);
                
            }
        }
        
        sc.close();
     }
}