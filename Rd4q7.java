import java.util.Scanner;

public class Rd4q7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the angles of triangles");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b+c==180){
            System.out.println("the triangle is valid");
        }
        else{
            System.out.println("the triangle is not valid");
        }
        sc.close();
    }
    
}
