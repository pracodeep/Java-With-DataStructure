import java.sql.SQLOutput;
import java.util.Scanner;

public class RectengleSumInTwoDMatrix {

    static void PrintArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print("the array matrix is"+"");
            }
            System.out.println();
        }
    }
    static int findSum(int[][] matrix,int l1,int r1,int l2,int r2){
        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum+=matrix[i][j];
            }
        }


        return sum;
    }

    static void FindprefixSumMatrix(int [][] matrix){
        int r=matrix.length;
        int c=matrix[0].length;
        //traverse horizontally to calculate rawwiese prefix sum
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }
    }
    static int findSu2(int[][] matrix,int l1,int r1,int l2,int r2) {
    int sum=0;
    FindprefixSumMatrix(matrix);
    for(int i=l1;i<=l2;i++){
        //r1 to r2 sum for row i
        if(r1>=1) {


            sum += matrix[i][r2] - matrix[i][r1 - 1];
        }

        else{
            sum+=matrix[i][r2];
        }
        return sum;

        }
    return sum;
        }











    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the raw and coloumn");
        int r=sc.nextInt();
        int c=sc.nextInt();

        int [][] matrix=new int[r][c];
        int totalElement=r*c;
        System.out.println("Enter the element " +totalElement+"");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the rectangle boundry l1,r1,l2,r2");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();

        System.out.println("Rectangle sum is"+findSum(matrix,l1,r1,l2,r2));
        System.out.println("Rectangle sum is"+findSu2(matrix,l1,r1,l2,r2));
    }
}
