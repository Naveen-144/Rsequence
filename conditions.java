import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int a=S.nextInt();
        if(a==69){
            System.out.println("yes");
        }
        else if(a>50 && a<=60){
            System.out.println("Average");

        }
        else {
            System.out.println("No");
        }
        S.close();
    }
    
}
