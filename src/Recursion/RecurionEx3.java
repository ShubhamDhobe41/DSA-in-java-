package Recursion;

public class RecurionEx3 {
    public static void main(String[] args) {
        int res= recursion(3);
        System.out.println(res);
    }

    private static int recursion(int n) {
        int result;
        if(n==1){
            return 1;
        }
        result=recursion(n-1)*n;
        return result ;
    }

}
