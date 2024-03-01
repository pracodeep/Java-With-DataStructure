import java.util.Scanner;

public class SortedArray {

    static boolean issorted(int arr[]){
        boolean check=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                check=false;
                break;
            }
        }
        return check;

    }




        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the size of array");
            int n=sc.nextInt();

            int arr[]=new int[n];

            System.out.println("enter the element");

            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }

           // System.out.println("enter x");
            //int x=sc.nextInt();
            System.out.println("is sorted"+ issorted(arr));


        }
    }


