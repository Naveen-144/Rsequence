public class Rq6 {
    
    public static void main(String[] args) {
       int a=Integer.MIN_VALUE;
        System.out.println(a+1);
        int b=78;
        System.out.println(b++ + ++b);
        System.out.println(b);
        int c =56;
        System.out.println(c-- + --c + --c);
        System.out.println(c);
        int d=96;
        System.out.println(d-- + ++d - d++ + --d);
        System.out.println(d);
    }
}