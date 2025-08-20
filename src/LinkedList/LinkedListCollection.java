package LinkedList;

import java.util.LinkedList;

public class LinkedListCollection {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        add() - add in last by default
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        LinkedList<String> listdata = new LinkedList<>();
//        insert Value
        listdata.addFirst("a");
        listdata.addFirst("is");
        listdata.addFirst("This");

        listdata.addLast("list");
        System.out.println(listdata);

        System.out.println(listdata.size());

//        print value
        for (int i = 0; i <listdata.size() ; i++) {
            System.out.print(listdata.get(i)+" --> ");
        }
        System.out.println("Null");


//        search value
        String value = "This";
        for (int i = 0; i <listdata.size() ; i++) {
            if(listdata.get(i)==value)
            System.out.print(listdata.get(i)+" --> ");
        }
        System.out.println("Null");

//      delete value
        listdata.removeFirst();
        System.out.println(listdata);

        listdata.removeLast();
        System.out.println(listdata);

        listdata.remove(1);
        System.out.println(listdata);

        listdata.remove("is");
        System.out.println(listdata);


    }
}
