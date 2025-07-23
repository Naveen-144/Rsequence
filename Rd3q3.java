import java.util.Scanner;

public class Rd3q3 {

    public static void main(String[] args) {
        try(Scanner n=new Scanner(System.in)){
            System.out.println("1.+");
            System.out.println("2.-");
            System.out.println("3.*");
            System.out.println("4./");
            System.out.println("choose the correct option");
            int d=n.nextInt();
            System.out.println("enter the two numbers");
            int a=n.nextInt();
            int b=n.nextInt();
            switch(d){  
                case 1:{
                System.out.println(a+b);
                break;
                }
                case 2:{
                    System.out.println(a-b);
                    break;
                }
                case 3:{
                    System.out.println(a*b);
                    break ;
                }
                case 4:{
                    System.out.println(a/b);
                    break;
                }



            }

        }
    }
    
}
