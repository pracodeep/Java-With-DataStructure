import java.util.Scanner;

public class Querry {
    static int [] makeFrequencyArray(int arr[]){  //make frequency array

        int[] freq=new int[100005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int [] arr= new int[n];

        System.out.println("enter the " +n +"element");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int []freq=makeFrequencyArray(arr);
        System.out.println("enetr the number of querry");
        int q=sc.nextInt();
        while(q>0){ //for query input
            System.out.println("enter number to be search");
            int x=sc.nextInt();
            if(freq[x]>0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
            q--;
        }
    }

}
