package Array;
// pass by value
public class ValuePassByMethood {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a);
        System.out.println(b);
        changeValue(a,b);
    }

//    value of a and b in changeValue will store in new address
//    that's why a and b value will not change
    private static void changeValue(int a, int b) {
        a=90;
        b=80;
        System.out.println(a);
        System.out.println(b);
    }
}
