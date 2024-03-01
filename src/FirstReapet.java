import java.util.Scanner;

public class FirstReapet {

    static int FirstReapingNumber(int [] arr){

        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){//found answer
                    return arr[i];
                   // break;
                }
            }
        }

        return -1;








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

        System.out.println(FirstReapingNumber(arr));
    }
}

