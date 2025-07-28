import java.util.Scanner;

public class Rd6hashcode {

    
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S =sc.nextLine();
        System.out.println(S);
        System.out.println(S.hashCode());
        S+="java";
        System.out.println(S);
        System.out.println(S.hashCode());
        System.out.println(System.identityHashCode(S));
        sc.close();

    }
}   
