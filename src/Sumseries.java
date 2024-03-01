import java.util.Scanner;

public class Sumseries {

    static int SeriesSum(int n){
        if(n==0) return 0;
        //even
        if(n%2==0){
            return SeriesSum(n-1)-n;
            //odd
        }else {
            return SeriesSum(n-1)+n;
        }
    }

    static int seriesSum(int n){
        if(n==0){
            return 0;
        }

       // return seriesSum(n-1)+n;  or
        int ans=seriesSum(n-1);
        int ans2=ans+n;
        return ans2;

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(SeriesSum(n));
    }
}
