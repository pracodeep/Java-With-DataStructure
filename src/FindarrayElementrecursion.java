import java.util.Scanner;

public class FindarrayElementrecursion {

    //return index of an array if target present in array otherwise return -1
    static int FindIndexArray(int arr[], int n, int target, int idx) {
        //base case
        if (arr[idx] >= n) {
            return -1;

        }

        //self work

        if (arr[idx] == target) {
            return idx;
        }

        //recursive work
         return FindIndexArray(arr, n, target, idx + 1);




    }

    static boolean FindElementArray(int arr[], int n, int target, int idx) {
        //base case
        if (arr[idx] >= n) {
            return false;
        }

        //self work

        if (arr[idx] == target) {
            return true;
        }

        //recursive work
        if (FindElementArray(arr, n, target, idx + 1)) {
            return true;

        } else {
            return false;
        }


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int target = sc.nextInt();
        int n = arr.length;

        System.out.println(FindIndexArray(arr, n, target, 0));




    }
}