import java.util.Scanner;

public class StringPallindrawnWithoutUsingReverseFunction {

static Boolean PallinDraw(String s,int l,int r){

    //base condition
    if(l>=r){
        return true;
    }
     return (s.charAt(l)==s.charAt(r) && PallinDraw(s,l+1,r-1));


}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(PallinDraw(s,0,s.length()-1 ));
    }
}
