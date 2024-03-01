import java.util.Scanner;

public class SpiralMatrix {

    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void printSpiralOrder(int[][] matrix,int r,int c){

        int topraw=0;
        int bottomraw=r-1;
        int leftcol=0;
        int rightcol=c-1;
        int totalele=0;
        while(totalele<  r*c){
            //top raw=left col to right col

            for(int j=leftcol;j<=rightcol && totalele <  r*c;j++){
                System.out.print(matrix[topraw][j]); //here j is coloum  and rwa is same
                totalele++;
            }
            topraw++;


            //last or right col==top raw to bottom raw
            for(int i=topraw;i<=bottomraw && totalele<=  r*c ;i++){
                System.out.print(matrix[i][rightcol]);
                totalele++;
            }
            rightcol--;
            //bottom raw=right col to left col
            for(int j=rightcol;j>=leftcol && totalele<= r*c;j--){
                System.out.print(matrix[bottomraw][j]);
                totalele++;
            }

            bottomraw--;

            //left col=bottom raw to top raw
            for(int i=bottomraw;i>=topraw && totalele<= r*c;i--){
                System.out.print(matrix[i][leftcol]);
                totalele++;

            }
            leftcol++;


        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the raw and colomn");
        int r=sc.nextInt();
        int c=sc.nextInt();
       // int r=sc.nextInt();
        int matrix [][]=new int[r][c];
        System.out.println("Enter the raw"+r+"and coloumn"+c);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("input matrix");
        printMatrix(matrix);
        System.out.println("spiral order");
        printSpiralOrder(matrix,r,c);


    }


}
