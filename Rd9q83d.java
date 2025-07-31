import java.util.Scanner; 

public class Rd9q83d {

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
        

        for(int i=0;i<n;i++)
        {System.out.println("___the "+(i+1)+" matrix is__");
            for(int j=0;j<m;j++){
                for(int k=0;k<d;k++){
                   System.out.print(a[i][j][k]+" ");    
                }
                System.out.println();
                 
            }
           
           System.out.println();
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int k=0;k<d;k++){
                  if(a[i][j][k]%2==0){
                   count=count+1;
                   System.out.print(a[i][j][k]+" ");

                  }
                }
                //System.out.println();
            }
            
        }
        System.out.println();
        System.out.println("the number of even numbers are: "+count);


        
        scan.close();

    

        
    }
}
