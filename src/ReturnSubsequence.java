import java.util.ArrayList;

public class ReturnSubsequence {

//    s="abc"
    static ArrayList<String> getssq(String  s){

        ArrayList<String> ans=new ArrayList<>();
        //base case
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        char curr=s.charAt(0);//a

        ArrayList<String> smallAns=getssq(s.substring(1)); //["bc" ,"b" ,"c", ""]

        //smallAns=["bc","b","c",""]
        //ans=["bc","abc","b","ab","ac","c","a"]
        for(String ss:smallAns){

            ans.add(ss);//bc
            ans.add(curr+ss);//abc

        }
        return ans;

    }

    public static void main(String[] args) {

        ArrayList<String> ans=getssq("abc");
        for(String ss:ans){
            System.out.println(ss);
        }

    }

}
