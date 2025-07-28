
import java.util.Scanner;

public class Rd6buffer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S =sc.nextLine();
        StringBuffer D=new StringBuffer();
        D.append(S);
        //System.out.println(S);
        System.out.println(D.hashCode());
        D.append("welome");
        System.out.println(D);
        System.out.println(D.hashCode());
        sc.close();

    }
    
} 