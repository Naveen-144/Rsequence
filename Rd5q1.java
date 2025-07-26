
import java.util.Scanner;

public class Rd5q1 {
    
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the word");
            String sc=scan.next();
            sc=sc.toLowerCase();
            int count=0;
            for(int i=0;i<=sc.length()-1;i++){
                if((sc.charAt(i)=='a')||(sc.charAt(i)=='e')||(sc.charAt(i)=='i')||(sc.charAt(i)=='o')||(sc.charAt(i)=='u')){
                    count++;
                }
            }
            System.out.println("the number of vowels are:"+count);
        }
    }
}
