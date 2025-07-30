import java.util.Scanner;

public class Rd8arr910 {
    public static void main(String[] args) {
         Scanner scan =new Scanner(System.in);
        System.out.println("enter the range");
        int n=scan.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        //sorting
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    

                }
        }
    }
    System.out.println("the sorted array is");
    for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");

    }
    //Second largest element
    System.out.println(arr[n-2]);
        scan.close();

    }
    
}
