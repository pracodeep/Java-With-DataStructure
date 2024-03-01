public class KeyPadCombination {


    static void Combination(String dig, String []kp, String result){ //253

        if(dig.length()==0){
            System.out.println(result+"");
            return;
        }

        int curNumm=dig.charAt(0)-'0';// 2 convert String in to integer
        String currChoice=kp[curNumm];//abc

        for(int i=0;i<currChoice.length();i++){
            Combination(dig.substring(1),kp,result +currChoice.charAt(i));

        }





    }

    public static void main(String[] args) {
        String dig="253";
        //kp[7]="[qrs
        String [] kp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        //             0  1    2    3    4      5     6      7     8     9

    Combination(dig,kp,"");
    }


}
