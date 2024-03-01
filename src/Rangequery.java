import java.util.Scanner;

public class Rangequery {

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
        int arr[]=new int[n+1];
        System.out.println("enter the "+n+"element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();



        }
        System.out.println("The array input");
        PrintArray(arr);
        int pref[]=MakePrefixSum(arr);
        PrintArray(pref);

        System.out.println("enter the number of query");
        int q=sc.nextInt();
        while(q-->0){
            System.out.println("enter range");
            int l=sc.nextInt();
            int r=sc.nextInt();

            int ans=pref[r]-pref[l-1];
            System.out.println( "sum"+ans);
        }

    }



}
