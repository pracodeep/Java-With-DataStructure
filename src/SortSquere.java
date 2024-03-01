import java.util.Scanner;

public class SortSquere {

    static void PrintArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    static int[] sortArray(int [] arr){
        int n= arr.length;
        int left=0;
        int right=n-1;
        int ans[]=new int[n];
        int k=0;
        while(left<right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k]=arr[left]*arr[left];
                k++;
                left++;
            }else{
                ans[k++]=arr[right]*arr[right];
                right++;
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter tye size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("original array");
        PrintArray(arr);
        int []ans=sortArray(arr);
        System.out.println("Array After sort");
        PrintArray(ans);

    }

}
