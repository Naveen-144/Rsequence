import java.util.Scanner;

public class Rd3q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        if(a%2==0){
            System.out.println("the enterd number is even ");
        }
        else{
            System.out.println("the number is odd");
        }
        scan.close();

        
    }
    
}
