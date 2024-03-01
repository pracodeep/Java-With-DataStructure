import java.util.Scanner;

public class PrefixSum{


    static void PrintArray(int arr[]){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    static int[] MakePrefixSum(int arr[]){
        int n=arr.length;
        int pref[]=new int[n];
        pref[0]=arr[0];
        for(int i=1; i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;



    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size o array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the "+n+"element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();



        }
        System.out.println("The array input");
        PrintArray(arr);
        int pref[]=MakePrefixSum(arr);
        PrintArray(pref);

    }


}