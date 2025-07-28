import java.util.Scanner;

public class Rd6arrq1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] d= new int[n];
        for(int j=0;j<n;j++){
            d[j]=scan.nextInt();
        }
        int small =d[0];
        int max=d[0];
        for(int i=1;i<n;i++){
            if(d[i]<=small){
                small=d[i];
                

            }
            if(d[i]>=max){
                max=d[i];
            }
        }
        System.out.println(small);
        System.out.println(max);
    scan.close();
    }
    
}
