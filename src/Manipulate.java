import java.util.Scanner;

public class Manipulate {
static int FindUniq(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                arr[i] = -1;
                arr[j] = -1;
            }
        }


    }
    int ans = -1;
    for (int i = 0; i < n; i++) {
        if (arr[i] > 0) {
            ans = arr[i];
        }

    }
    return ans;

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
        System.out.println(FindUniq(arr));
    }
}


