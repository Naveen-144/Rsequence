import java.util.Scanner;

public class Rd6q2 {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the word");
        String a =scan.nextLine();
        System.out.println(a); 

        // Using StringBuilder to reverse the string
        //String c = new StringBuffer(input).toString();  // OK
        //System.out.println(c);
        String b="";
        for(int i=a.length()-1;i>=0;i--){
            b=b+a.charAt(i);
            System.out.print(a.charAt(i));
        }
        System.out.println();
        //System.out.println(b);
        if(a.equals(b)){
            System.out.println("Entered word is pallindrome");
        }
        else{
            System.out.println("It is not pallindrome");
        }

        scan.close();
    }
    
}

