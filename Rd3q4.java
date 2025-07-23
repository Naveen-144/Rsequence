import java.util.Scanner;

public class Rd3q4 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter your mark :");
        int mark=scan.nextInt();
        if(mark>75){
            System.out.println("outstanding");
        }
        else if(mark>=50 && mark<=75){
            System.out.println("Average");
        }
        else{
            System.out.println("Fail");
        }
        scan.close();
    }

}
