import java.util.Scanner;

public class SortAnArrayEvenAndOdd {

    static void PrintArray(int [] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[i]=temp;

    }
    static void sortArrayByParrity(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }

            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 == 1) {
                right--;
            }

        }
    }


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
        sortArrayByParrity(arr);
        System.out.println("sorete arrey");
        PrintArray(arr);

    }
}
