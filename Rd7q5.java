import java.util.Scanner;

public class Rd7q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=sc.nextInt();
        System.out.println("Enter the number of coloumn");
        int m=sc.nextInt();
        int[][] matrix=new int[n][m];
        System.out.println("enter the values in array");

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int tsum=0;
        System.out.println();
        int sum =0;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=0;j<m;j++){
                sum=sum + matrix[i][j];
            }
            tsum=tsum+sum;
            System.out.println(sum);
            System.out.println();


        }
        System.out.println(tsum);
        sc.close();
    }

    
}
