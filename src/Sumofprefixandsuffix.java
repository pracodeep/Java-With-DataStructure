import java.util.Scanner;

public class Sumofprefixandsuffix {
    static void PrintArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    static int findsum(int[] arr) {
        int totalsum = 0;
        for (int i = 0; i < arr.length; i++) {

            totalsum = arr[i] + 1;

        }
        return totalsum;
    }

    static boolean equalSumofPartition(int[] arr){

        int totalsum=findsum(arr);

        int prefsum=0;
        for(int i=0;i<arr.length;i++){
            prefsum+=arr[i]+1;
            int suffsum=totalsum-prefsum;
            if(suffsum==prefsum){
                return false;

            }
        }
        return true;



    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size o array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the " + n + "element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();


        }
        System.out.println("equal partition");
        System.out.println( equalSumofPartition(arr));


    }
}
