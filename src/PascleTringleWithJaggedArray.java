import java.util.Scanner;

public class PascleTringleWithJaggedArray {

    //static void printarray(int arr[][]){
      //  for(int i=0)
    //}

static void printarrar(int[][]matrix){
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }

    }
    static int[][] pascle(int n){
    int[][] ans=new int[n][];
    for(int i=0;i<n;i++){
        //ith raw has i+1 colloumn

        ans[i]=new int[i+1];
        //fist and last element of every raw equall
        ans[i][0]=ans[i][i]=1;  //here i-firstelemnt and last elemnt

        for(int j=1;j<i;j++){
            ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
        }
    }


    return ans;

    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  n value");
        int n=sc.nextInt();
         //n=sc.nextInt();
        int ans[][]=pascle(n);
        printarrar(ans);
    }
}

