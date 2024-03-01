import java.util.Scanner;

public class StringPallindrwanUsingRecursion {
//without using reverse fu

    //using reverse function
    static String reverse(String s,int idx){
        if(idx==s.length()){
            return "";
        }
        //recursive work
        String SmallAns=reverse(s,idx+1);
        char CurrentChar=s.charAt(idx);
        //self work

        return SmallAns+CurrentChar;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String rev=reverse(s,0);
        if(rev.equals(s)){  //using rev==s
            System.out.println("String is Pallindraw");
        }else{
            System.out.println("not PALIINDRAWN");
        }

    }

}
