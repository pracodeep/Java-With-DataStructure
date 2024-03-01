import java.util.Scanner;

public class ReverseStringUsingRecursion {


    //without using indexes

    static String Reverse2(String s){
        if(s.length()==0){
            return "";
        }
        //recursive work
        String SmallAns=Reverse2(s.substring(1));
        char CurrentChar=s.charAt(0);
        //self work

        return SmallAns+CurrentChar;
    }

static String ReverseS(String s,int idx){
    //base case
    if(idx==s.length()){
        return "";
    }
    //recursive work
    String SmallAns=ReverseS(s,idx+1);
    char CurrentChar=s.charAt(idx);
    //self work

     return SmallAns+CurrentChar;


}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(ReverseS(s,0));
        System.out.println(Reverse2(s));
    }
}
