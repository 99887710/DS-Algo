package codewithjeff.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {

    private Node first = null;
    private Node last = null;
    private int size = 0;

    private class Node {
        private Node next = null;
        private int value;

        public Node(int value) {
            this.value = value;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void addLast(int value){
        Node newNode = new Node(value);

        if (isEmpty())
            first = last = newNode;
        else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public void addFirst(int value){
        if (isEmpty())
            throw new IllegalArgumentException();
        Node newNode = new Node(value);
        Node temp = first;
        first = newNode;
        first.next = temp;
        size++;
    }

    public int indexOf(int value){
        int index = 0;
        Node current = first;
        while (current != null) {
            if (current.value == value)
                return index;
            index++;
            current = current.next;
        }
        return -1;
    }

    public boolean contains(int value){
        return indexOf(value) != -1;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last){
            first = last = null;
        } else {
            Node second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    public void removeLast(){

        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
        } else {
            Node prev = getPrevious();
            prev.next = null;
            last = prev;
        }
        size--;
    }

    private Node getPrevious(){
        Node current = first;
        while (current != null) {
            if (current.next == last)
                return current;
            current = current.next;
        }
        return null;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] arr = new int[size];
        int count = 0;
        Node current = first;

        if (!isEmpty()) {
            while (current != null) {
                arr[count++] = current.value;
                current = current.next;
            }
        }
        return arr;
    }

    public void reverse(){
        Node newHead = null;
        Node newTail = first;
        Node current = first;
        Node next;

        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last)
            return;

        while (current != null) {
            next = current.next;
            current.next = newHead;
            newHead = current;
            current = next;
        }

        first = newHead;
        last = newTail;
    }

    //two pointers and diff
    public void getKthFromTheEnd(int k) {
        Node kth = null;
        Node p1 = first;
        Node p2 = first;
        int diff = 0;

        if (isEmpty())
            throw new NoSuchElementException();
        while (p1 != last) {
            if (diff >= k-1)
                p2 = p2.next;

            p1 = p1.next;
            diff++;
        }

        kth = p2;

        if (k-1 >= diff)
            throw new IllegalArgumentException();

        System.out.println(kth.value);
    }

    public void printMiddle(){
        Node fast = first;
        Node slow = first;
        if (isEmpty())
            throw new IllegalArgumentException();

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.value);
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
