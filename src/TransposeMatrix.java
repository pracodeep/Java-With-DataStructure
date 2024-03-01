import java.util.Scanner;

public class TransposeMatrix {

    //transpose matrix by third array
    static void printarray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] transpose(int matrix[][],int r1,int c1){
        int [][]ans=new int[c1][r1];
        for(int i=0;i<c1;i++){
            for(int j=0;j<r1;j++){
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;
    }

//transpose matrix by same array it is possible for squere matrix as 3*3,4*4 etc
    static void findTransposeInplace(int[][]matrix,int r1,int c1){
        for(int i=0;i<c1;i++){
            for(int j=i;j<r1;j++){
                //swap matrix[i][j],matrix[j][i]
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }

        }

    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the raws");
        int r1 = sc.nextInt();
        System.out.println("Enter the coloumn");
        int c1 = sc.nextInt();
        int[][] matrix = new int[r1][c1];
        System.out.println("Enter the raw" + r1 + "abd column" + c1);
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("input matrix");
        printarray(matrix);
        System.out.println("transpose matrix");
        //int [][]ans=transpose(matrix,r1,c1);
        findTransposeInplace(matrix,r1,c1);
        printarray(matrix);


    }
}