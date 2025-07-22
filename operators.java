public class operators {
    public static void main(String[] args) {
        //Assignment operators
        int a=96;
        a+=89;
        System.out.println(a);
        // ex or operator
        int b=5;
        b^=6;
        System.out.println(b);

        //Relational  operators
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a>b);

        //logial operator and bitwise operator
        int c=10;
        int d=10;
        int e=9;
        int f=2;
        System.out.println(c&d);
        System.out.println(c|d);
        System.out.println((c==d)&&(e>f));
        System.out.println((c==d)||(e<f));
        System.out.println(~c);

        // tereneray operator
        //syntax (condition)?(statement 1):(statement 2)
        System.out.println((c==d)?"true":2);

        }
        }  


    
    
