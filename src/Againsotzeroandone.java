import java.util.Scanner;

public class Againsotzeroandone {

    static void sortAnArrayZeroAndOne(int arr[]){
        int n=arr.length;
        int left=0;
        int right=n-1;

        while(left<right){
            if(arr[left]==1&& arr[right]==0){
                swap(arr ,left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
                right--;
            }
            if(arr[right]==1){
                right--;
            }
        }

    }



    static void PrintArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
//    static void sortArrayZeroOrOne(int [] arr){
//        int n=arr.length;
//        int zeros=0;
//        //count the zero
//
//
//        for(int i=0;i<n;i++){
//            if(arr[i]==0){
//                zeros++;
//            }
//        }
//        //o to zeros-1:0,zeros to n-1
//        for(int i=0;i<n;i++){
//            if(i<zeros){
//                arr[i]=0;
//            }else{
//                arr[i]=1;
//            }
//        }
//
//    }
//


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("enter the " +n+"element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array");
        PrintArray(arr);
        sortAnArrayZeroAndOne(arr);
        System.out.println("sorete arrey");
        PrintArray(arr);

    }
}


