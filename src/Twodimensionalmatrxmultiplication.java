import java.util.Scanner;

public class Twodimensionalmatrxmultiplication {

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {  //row
            for (int j = 0; j < arr[i].length; j++) { //colom
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("  ");
        }
    }

    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {

        if(c1!=r2){
            System.out.println(" wron dimensional-multiplication note possible");
            return;
        }
        int[][] mul=new int[r1][c2]; //because resultaned metrices is r1*c2
        for(int i=0;i<r1;i++){//raw number
            for(int j=0;j<c2;j++){    //column number

                for(int k=0;k<c1;k++){
                    mul[i][j]+=(a[i][k]*b[k][j]);
                }

            }


        }
        System.out.println("multiplication of two matrix");
        printArray(mul);
    }





        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the raws");
            int r1 = sc.nextInt();
            System.out.println("Enter the coloumn");
            int c1 = sc.nextInt();
            int[][] a = new int[r1][c1];
            System.out.println("Enter the raw" + r1 + "abd column" + c1);
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("enter the raw and column");
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();
            int[][] b = new int[r2][c2];
            System.out.println("enter the element of r2 and c2");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    b[i][j] = sc.nextInt();
                }
            }
            System.out.println("matrix one");
            printArray(a);
            System.out.println("matrix 2");
            printArray(b);
            System.out.println("matrix of multiply");
            multiply(a,r1,c1,b,r2,c2);
        }

    }

