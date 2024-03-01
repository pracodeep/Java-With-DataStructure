import java.util.Scanner;

public class TwodArrayInitilization {

    static void printArray(int[][]arr){
        for(int i=0;i < arr.length;i++){  //row
            for(int j=0;j < arr[i].length; j++){ //colom
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("  ");
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the raws");
        int r=sc.nextInt();
        System.out.println("Enter the coloumn");
        int c=sc.nextInt();
        int [][] arr=new int[r][c];
        System.out.println("Enter the raw"+r+"abd column"+c);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        printArray(arr);
    }
}
