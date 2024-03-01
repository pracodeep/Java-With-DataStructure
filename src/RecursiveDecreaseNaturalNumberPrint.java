import java.util.Scanner;

public class RecursiveDecreaseNaturalNumberPrint {





        static void printDecreasing(int n){

            //base case
            if(n==1){

                System.out.println(n);
                return;
            }
                //Self work
            System.out.println(n);

            //recursive work
            printDecreasing(n-1);

        }
        public static void main(String Args[]){

            Scanner sc =new Scanner(System.in);
            int n=sc.nextInt();
            printDecreasing(n);

        }



    }


