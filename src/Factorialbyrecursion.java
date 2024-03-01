public class Factorialbyrecursion {

    static int factorial(int n){
        //basr case
        if(n==0){
            return 1;

        }
        //recrsive work smaller problem work
        int smallans=factorial(n-1);//call factorial (4)==24

        //self work
        int ans=n*smallans;
        return ans;
    }

    public static void main(String args[]){
        factorial(5);
        System.out.println(factorial(5));
    }

}
