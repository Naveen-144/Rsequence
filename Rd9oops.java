import java.util.*;
public class Rd9oops {
    
        public void display(){
            System.out.println("hello");
        }

        public void add(double a,double b){
            System.out.println(a+b);
        }

        public int addd(double a,double b){ 
            return (int) (a+b);        
        }

        public double sub(double a,double b){
            return (a-b);
        }
        
        public String name(){
            return (String)"naveeen";
        }
            

    public static void main(String[] args) {
        Rd9oops obj = new Rd9oops(); // creating object
        Scanner scan=new Scanner(System.in);
        obj.display();
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        obj.add(a,b);

        System.out.println(obj.addd(a, b));
        System.out.println(obj.sub(a, b));
        System.out.println(obj.name());
        scan.close();
        
    }
}

