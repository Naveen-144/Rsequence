public class typecasting {
    public static void main(String[] args) {
        //Implicit typecasting
        //smalll to large
        int a=10;
        double b=a;
        System.out.println(b);
        //Explicit typecasting
        //large to small
        //int c= b;
        int c=(int)b;
        System.out.println(c);
        short d=123;
        long e = (long)d;
        System.out.println(e);
        System.out.println(((Object)e).getClass().getSimpleName());
    }
    
}
 