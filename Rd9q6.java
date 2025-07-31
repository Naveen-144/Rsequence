public class Rd9q6 {
    void display(String name){
        System.out.println("name is: " + name);
    }    

    void display(int age){
        System.out.println("age is: " + age);
    }

    void display(String name, int age){
        System.out.println("name is: " + name + ", age is: " + age);
    }

    void display(String name, int age, String city){
        System.out.println("name is: " + name + ", age is: " + age + ", city is: " + city);
    }

    void display(String name, int age, int marks){
        System.out.println("name is: " + name + ", age is: " + age + ", marks are: " + marks);
    }

    public static void main(String[] args) {
        Rd9q6 obj = new Rd9q6();
        
        obj.display("Naveen");
        obj.display(25);
        obj.display("Naveen", 21);
        obj.display("Naveen", 21, "Chennai");
        obj.display("Naveen", 21, 90);
    }
}
