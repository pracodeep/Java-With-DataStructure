public class FibonaccibyRecursion {

    static int fibanancci(int n){
        //basecase
        if(n==0||n==1){
            return n;

        }
        //sub problem
        int prev=fibanancci(n-1);
        int prevprev=fibanancci(n-2);
        //self work
        int finalAns=prev+prevprev;
        return finalAns;


    }

    public static void main(String[] args) {
        for(int i=0;i<=10;i++)
        System.out.println(fibanancci(i));
    }


}
