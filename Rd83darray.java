import java.util.Scanner;

public class Rd83darray {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter how many matrix");
        int n=scan.nextInt();
        System.out.println("Enter the row");
        int m= scan.nextInt();
        System.out.println("enter the coloumn");
        int d=scan.nextInt();
        int[][][] a= new int[n][m][d];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int k=0;k<d;k++){
                    a[i][j][k]=scan.nextInt();

                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int k=0;k<d;k++){
                   System.out.print(a[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        scan.close();

    

        
    }
    
}
