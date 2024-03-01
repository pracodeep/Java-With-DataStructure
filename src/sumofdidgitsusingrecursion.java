import java.util.Scanner;

public class sumofdidgitsusingrecursion {

    static int Sumofdigit(int n){
        //base case
        if(n>0&&n<9){
            return n;
        }
        //recursive work-small ans
        int smallAns=Sumofdigit(n/10);

//        int lastDighits=Sumofdigit(n%10);

        int ans=smallAns+n%10;
        return ans;

    }

    public static void main(String[] args) {




        System.out.println(Sumofdigit(1234));


    }

}
