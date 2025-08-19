package Recursion;

public class RecursionEx2 {
    static int count =0;
    static int i=1;
    public static void main(String[] args) {
        int n=18;
//        printValue(1,n);
        printNumbers(5);
    }

    private static void printValue(int index , int n) {
        if(index > n){
            return;
        }
        System.out.println("shubham");
        printValue (index+1,n);
    }
    public static void printNumbers(int n) {
        if(i>n){
            return;
        }
        System.out.println(i);
        i++;
        printNumbers(n);
    }
}
