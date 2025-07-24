import java.util.Scanner;

public class Rd4q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
        //int a;
        for(int i=1;i<=10;i++){
            //a=num*i;
            System.out.println(i+" * "+num+" = "+num*i );

        }
        scan.close();
    }
    
}
