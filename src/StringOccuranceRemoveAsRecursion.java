import java.util.Scanner;

public class StringOccuranceRemoveAsRecursion {

    //without index using recursion
    static String RemoveA2(String s) {

        if (s.length() == 0) {
            return "";
        }
        String SmallAns = RemoveA2(s.substring(1));

        char currenChar = s.charAt(0);
        if (currenChar != 'a') {
            return currenChar + SmallAns;
        } else {
            return SmallAns;

        }
    }


//using with indexes by recursion
    static String removeA(String s,int idx){  //if string is aabcda
        //base case
        if(idx==s.length()){
            return "";
        }

        //recursive work
        String smallAns=removeA(s,idx+1); //bcd
        char currentChar=s.charAt(idx); //current charecter  a
        //self work
        if(currentChar!='a'){
            return currentChar+smallAns; //ans=bcd
        } else{
            return smallAns;
        }






    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(removeA(s,0));
        System.out.println(RemoveA2(s));
    }

}
