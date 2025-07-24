import java.util.Scanner;

public class Rd5q5 {
    public static void main(String[] args) {
        System.out.println("Enter the character");
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        if (st.equals("a")||st.equals("e")||st.equals("i")||st.equals("o")||st.equals("u")) {
            System.out.println("vowels");
            
        }
        else{
            System.out.println("consonants");
        }

        // in character mode
        System.out.println("Enter character");
        char a=sc.next().charAt(0);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
            System.out.println("vowels");
        }
        else{
            System.out.println("consonants");
        }
        sc.close();

    }
    
}
