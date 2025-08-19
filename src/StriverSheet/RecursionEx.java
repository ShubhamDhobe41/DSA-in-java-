package StriverSheet;

public class RecursionEx {
    static int  count =0;
   static void print(){
       System.out.println("printed");
       count++;
       print();

    }
    public static void main(String[] args) {
//         when a function calls itself until a specified condition is met
      print();
    }
}
