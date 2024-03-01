public class Swap {

    static void swapp(int a,int b){
        System.out.println("original value before swap");
        System.out.println("a:" + a);
        System.out.println("b:" +b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("value after swap");
        System.out.println("a:" +a);
        System.out.println("b:" +b);

    }

    public static void main(String[] args) {
        int a=3;
        int b=9;
        swapp(a,b);

    }


}
