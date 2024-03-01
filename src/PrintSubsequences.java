public class PrintSubsequences {
static void printssq(String s, String currAns){//s=>abs , currAns=""
    if(s.length()==0){
        System.out.println(currAns);
        return;
    }

    //current charecter
    char curr=s.charAt(0);  //a

    //Remainning String
    String RemString=s.substring(1);//bc

    //curr char->chooses to be a part of currAns
    //recursive call 1
        printssq(RemString,currAns+curr);   //bc,a

    //curr char=>does not choose to be a part of curr ans
    printssq(RemString,currAns);//bc
}
    public static void main(String[] args) {

    printssq("abc","");

    }
}
