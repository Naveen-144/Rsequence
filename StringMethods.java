public class StringMethods {
    public static void main(String[] args) {
        String a="naveen";

        // length
        System.out.println(a.length());

        //concatenate
        String b=" kumar";
        System.out.println(a.concat(b));
        System.out.println(b.concat(a));

        //charAt
        System.out.println(a.charAt(5));
        System.out.println(a.charAt(3));

        //touppercase
        System.out.println(a.toUpperCase());

        //tolowercase
        System.out.println(b.toLowerCase());

        //split
        System.out.println(a.split("e"));

        //contains
        System.out.println(a.contains("naveen"));

        //replace
        System.out.println(a.replace("n", "k"));

        //replaceall
         System.out.println(a.replaceAll("e","g"));

       //substring
       System.out.println(a.substring(3));
       System.out.println(a.substring(1, 4));
       

    }
    
}
