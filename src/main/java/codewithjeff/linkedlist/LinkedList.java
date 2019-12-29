package codewithjeff.linkedlist;

public class LinkedList {

    private Node first;
    private Node last;

    private class Node {
        private Node next = null;
        private int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public void addLast(int value){
        Node newNode = new Node(value);

        if (first == null)
            first = last = newNode;
        else {
            last.next = newNode;
            last = newNode;
        }
    }
}
