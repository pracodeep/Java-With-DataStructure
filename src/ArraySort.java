import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

    static int[] sorting(int arr[]) {
        Arrays.sort(arr);
        int ans[] = {arr[0], arr[arr.length - 1]};
        //for(int i=0;i<arr.length;i++){
        //  System.out.println(arr[i]);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("enter the element");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        // System.out.println("enter x");
        //int x=sc.nextInt();
        int [] ans=sorting(arr);
        System.out.println("Smallest"  + ans[0]);
        System.out.println("laregest"  +ans[1]);






    }
}

