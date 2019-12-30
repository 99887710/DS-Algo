package codewithjeff.linkedlist;

import java.util.Arrays;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
        linkedList.addLast(50);

        linkedList.reverse();
        linkedList.getKthFromTheEnd(2);

        int[] arr = linkedList.toArray();
        System.out.println(linkedList.size());
        System.out.println(Arrays.toString(arr));

    }
}
