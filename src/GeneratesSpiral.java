import java.util.Scanner;

public class GeneratesSpiral {

        static void printMatrix(int[][] matrix){
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
        }
        static int [][] generatesSpiral(int n){
            int matrix[][]=new int[n][n];
            int topraw=0;
            int bottomraw=n-1;
            int leftcol=0;
            int rightcol=n-1;
            int current=1;
            while(current<=  n*n){
                //top raw=left col to right col

                for(int j=leftcol;j<=rightcol && current <=  n*n;j++){
                    matrix[topraw][j]=current; //here j is coloum  and rwa is same
                    current++;
                }
                topraw++;


                //last or right col==top raw to bottom raw
                for(int i=topraw;i<=bottomraw && current<= n*n ;i++){
                    matrix[i][rightcol]=current;
                    current++;
                }
                rightcol--;
                //bottom raw=right col to left col
                for(int j=rightcol;j>=leftcol && current<= n*n;j--){
                    matrix[bottomraw][j]=current;
                    current++;
                }

                bottomraw--;

                //left col=bottom raw to top raw
                for(int i=bottomraw;i>=topraw && current<= n*n;i--){
                    matrix[i][leftcol]=current;
                    current++;

                }
                leftcol++;


            }
            return matrix;

        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter n");
            int n=sc.nextInt();

            // int r=sc.nextInt();
            int matrix [][]=generatesSpiral(n);
            printMatrix(matrix);

        }


    }




