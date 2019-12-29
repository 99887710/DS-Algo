package codewithjeff.linkedlist;

import java.util.Arrays;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addFirst(-10);
        linkedList.addFirst(-20);
        linkedList.removeFirst();
        linkedList.removeLast();

        int[] arr = linkedList.toArray();
        System.out.println(linkedList.size());
        System.out.println(Arrays.toString(arr));
    }
}
