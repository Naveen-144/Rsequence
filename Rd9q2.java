import java.util.Scanner;

public class Rd9q2 {
    static void check(int a){
        if(a%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it is even or odd:");
        int number = scan.nextInt();
        check(number);
        scan.close();
    }
    
}
