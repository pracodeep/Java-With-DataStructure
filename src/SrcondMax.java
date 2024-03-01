import java.util.Scanner;

public class SrcondMax {
    static int findMax(int[] arr){
        int mx=Integer.MIN_VALUE; //for min value -infilty
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static int secondMax(int []arr){
        int mx=findMax(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;

            }
        }
        int secondMax=findMax(arr);
        return secondMax;
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

        System.out.println(secondMax(arr));
    }
}


