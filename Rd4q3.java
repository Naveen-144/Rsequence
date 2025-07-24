import java.util.Scanner;

public class Rd4q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
        int a=0;
        while(num!=0){
            int d=num%10;
            a=d+a;
            num=num/10;
        }
        System.out.println("sum is "+a);
        scan.close();
        
        //Another trick
        int b=123;
        if(b%9 == 0){
            System.out.println("sum is :"+9);
        }
        else{
            System.out.println("sum is: "+b%9);
        }
        
    }
    
}
