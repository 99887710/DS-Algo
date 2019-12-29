package codewithjeff.linkedlist;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addFirst(-10);

        linkedList.print();
    }
}
