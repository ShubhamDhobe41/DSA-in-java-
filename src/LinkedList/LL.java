package LinkedList;

public class LL {
    Node head;
//   check size
    LL(){
       this.size=0;
    }
    private int size ;
    class Node{
        String data ;
        Node next;

        Node(String data){
            this.data=data;
            this.next = null;
//           when we create new Node
            size++;
        }
    }
//// ----------------INSERT----------------------------
    public void addFirst(String data){
//        create Node
        Node newNode = new Node(data);


//        check linked list exist or not
        if(head == null){
            head = newNode;
           return;
        }
        newNode.next=head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
//        check current node's(dummy) next is null
        while(currNode.next != null){
//            traverse forward if current node of next is null
            currNode = currNode.next;
        }
//        if current node next is null then assign to new node
        currNode.next = newNode;

    }
////----------------------DELETE--------------------------------
     public void deleteFirst(){
//        check linked list exist or not
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        size--;
        head = head.next;
     }
     public void deleteLast(){
         if(head == null){
             System.out.println("List is Empty");
             return;
         }
         size--;
//        if single node then delete it
         if(head.next == null){
            head = null;
            return;
         }

         Node secondLast = head;
         Node lastNode = head.next;
         while(lastNode.next != null ){
             lastNode = lastNode.next;
             secondLast = secondLast.next;
         }
         secondLast.next = null;
     }

////----------------------PRINT--------------------------------
    public void printList(){
        if(head == null){
            System.out.println("List is empty......");
        }
        Node currNode = head;
//        check current node's(dummy) next is null
        while(currNode != null){
//            print data
            System.out.print(currNode.data+" --> ");
//            traverse forward if current node of next is null
            currNode = currNode.next;
        }
        System.out.println("Null");


        }
    ////----------------------SIZE--------------------------------
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("linkedList");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        int size =  list.getSize();
        System.out.println("Size : "+ size);

    }
}
