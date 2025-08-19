package Recursion;

public class RecursionEx1 {
    static int count =0;
    public static void main(String[] args) {
        printValue();
    }

    private static void printValue() {
        if(count==3){
            return;
        }
        System.out.println(count);
        count++;
        printValue();


    }
}
