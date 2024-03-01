import java.util.Scanner;

public class Rotatematrixnintydegree {


    static void printarry(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void transpose(int matrix[][],int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;

            }
        }
    }
    static void reverseArray(int [] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            //swap
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
    }
static void rotate(int [][] matrix,int r,int c){
        //transpose
    transpose(matrix,r,c);
        //reverse each raw of transpose matrix
    for(int i=0;i<r;i++){
        reverseArray(matrix[i]);
    }
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the raw of matrix");
        int r=sc.nextInt();
        System.out.println("Enter the coloumn of matrix");
        int c=sc.nextInt();
        int matrix[][]=new int[r][c];
        System.out.println("enter the"+r+"and coloumn"+c);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("input matrix");
        printarry(matrix);

        rotate(matrix,r,c);
        System.out.println("Rotate array 90 degree");
        printarry(matrix);
    }
}
