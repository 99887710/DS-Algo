package codewithjeff.linkedlist;

public class LinkedList {

    private Node first = null;
    private Node last = null;

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

    public void addFirst(int value){
        if (first == null)
            throw new IllegalArgumentException();
        Node newNode = new Node(value);
        Node temp = first;
        first = newNode;
        first.next = temp;
    }

    public void print(){
        Node p = first;
        if (p == null)
            throw new IllegalArgumentException("This linkedlist is empty");
        do {
            System.out.println(p.value);
            p = p.next;
        } while (p != null);
    }
}
