import java.sql.SQLOutput;
import java.util.Scanner;

public class PairSum {

    static int pair(int[] arr,int target){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){  //first number
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    ans++;

                }
            }


        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size os Array");
        int n= sc.nextInt();

        int arr[]=new int[n];

        System.out.println("enter the element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();


        }
        System.out.println("enter the target sum");
        int target=sc.nextInt();
        System.out.println(pair(arr,target));
    }
}
