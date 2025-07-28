import java.util.Scanner;

public class Rd6Array {
    public static void main(String[] args) {
        // Array deleration
        int a[]={1,2,3,4,5};
        int[] b=new int[]{1,2,3,4,5,6,'n'};
        String[] c =new String[]{"naeen","123","don"};
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<=a.length-1;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println();
        for(int i=0;i<=b.length-1;i++){
            System.out.print(" "+b[i]);
        }
        System.out.println();
        for(int i=0;i<=c.length-1;i++){
            System.out.print(" "+c[i]);
        }
        System.out.println();
        //getting value drom user
        System.out.println("enter the n value");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] d= new int[n];
        for(int j=0;j<n;j++){
            d[j]=scan.nextInt();
        }
        for(int i=0;i<=d.length-1;i++){
            System.out.print(" "+d[i]);
        }
        scan.close();

        
    }
    
}
