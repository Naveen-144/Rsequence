
import java.util.Scanner;

public class Rd4q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=scan.nextInt();
        int reversed=0;
        while(num!=0){
            int d=num%10;
            reversed=reversed*10+d;
            num=num/10;
        }
        System.out.println("reversed: "+reversed);

        //by reersinih
        System.out.println("Enter the number:");
        String a=scan.next();
        for(int i=a.length()-1;i>=0;i--){
            System.out.print(a.charAt(i));
        }
        scan.close();
    }
    
}
