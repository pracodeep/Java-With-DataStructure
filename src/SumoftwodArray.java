import java.util.Scanner;

public class SumoftwodArray {

    static void printArray(int[][]arr){
        for(int i=0;i < arr.length;i++){  //row
            for(int j=0;j < arr[i].length; j++){ //colom
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("  ");
        }
    }

    static void sum(int[][] a,int r1,int c1,int [][] b,int r2,int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("wrong input Addition not possible");
            return;
        }
        int[][] sum=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }

        }
       // System.out.println("the sum of matrix");
        printArray(sum);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the raws");
        int r1=sc.nextInt();
        System.out.println("Enter the coloumn");
        int c1=sc.nextInt();
        int [][] a=new int[r1][c1];
        System.out.println("Enter the raw"+r1+"abd column"+c1);
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the raw and column");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int [][]b=new int[r2][c2];
        System.out.println("enter the element of r2 and c2");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix one");
        printArray(a);
        System.out.println("matrix 2");
        printArray(b);
        System.out.println("sum of matrix");
        sum(a,r1,c1,b,r2,c2);
    }

    }

