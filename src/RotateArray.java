import java.util.Scanner;

public class RotateArray  {

    static void PrintArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    static int[] Rotate(int [] arr,int k){

        int n=arr.length;
        k=k%n;
        int ans[]=new int [n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0; i<n-k;i++){
            ans[j++]=arr[i];
        }

        return ans;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6};
        System.out.println("enter the k");
        int k=sc.nextInt();
        int [] ans=Rotate(arr,k);
        PrintArray(ans);
    }

}
