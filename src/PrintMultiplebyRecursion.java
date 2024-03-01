import java.util.Scanner;

public class PrintMultiplebyRecursion {

static void printmultiple(int n,int k){
    if(k==1){
        System.out.println(n);
        return;
    }
    //recursive work
    printmultiple(n,k-1);

    //self work
    System.out.println(n*k);


}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        printmultiple(n,k);



    }


}
