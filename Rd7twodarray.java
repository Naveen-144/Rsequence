import java.util.Scanner;

public class Rd7twodarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] matrix=new int[3][3];
        int[][] a={{1,2,3},{2,3,4},{5,6,4}};
        
        System.out.println("enter the matrx elemnts");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=sc.nextInt();
                
            }
            
        }
        System.out.println();
    
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
    
}
