public class Withoutswap {

    static void withoutSwapp(int a,int b){
        System.out.println("the vlue before swap");
        System.out.println("a:" +a);
        System.out.println("b:" +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value after swap");
        System.out.println("a:" +a);
        System.out.println("b:" +b);
    }

    public static void main(String[] args) {
        int a=9;
        int b=3;
        withoutSwapp(a,b);

    }

}
