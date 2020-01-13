package codewithjeff.linkedlist;

public class DoublyLinkedListDemo {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addToTail(1);
        doublyLinkedList.addToTail(2);
        doublyLinkedList.addToTail(3);

        doublyLinkedList.addToHead(0);
        doublyLinkedList.addToHead(-1);
        doublyLinkedList.addToHead(-2);

        doublyLinkedList.print();
        System.out.println(doublyLinkedList.size());
    }
}
