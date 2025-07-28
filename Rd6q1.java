import java.util.Scanner;

public class Rd6q1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the word");
        String a =scan.nextLine();
        //System.out.println(a);
        String b="";
        for(int i=a.length()-1;i>=0;i--){
            b=b+a.charAt(i);
            System.out.print(a.charAt(i));
        }
        //System.out.println();
        //heSystem.out.println(b);
        scan.close();
    }
    
    
}
