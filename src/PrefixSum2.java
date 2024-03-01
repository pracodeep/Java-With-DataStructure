import java.util.Scanner;

public class PrefixSum2 {

    static int[] MakePrefix(int arr[] ,int n, int pref[]){
        // n= arr.length;

        pref[0]=arr[0];
        for(int i=0;i<n;i++)

        pref[i]=pref[i-1]+arr[i];

        return pref;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elemt");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        n=arr.length;
        int pref[]=new int[n];
        MakePrefix(arr,n,pref);
        for(int i=0;i<n;i++){
            System.out.println(pref[i]);
        }


        //int pref[]=new int[n];
        //System.out.println("enter the ");

    }

}
