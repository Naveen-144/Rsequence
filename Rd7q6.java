import java.util.Scanner;

public class Rd7q6 {
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
        System.out.println("the diagonal elements are");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (i==j) {
                     System.out.print(matrix[i][j]+" ");
                }
               
            }
            System.out.println();

        }
        sc.close();
    }
    
}
