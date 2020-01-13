package codewithjeff.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class DoublyLinkedList {
    private List<Integer> list = new ArrayList<>();
    private class Node {
        private int val;
        private Node left;
        private Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    Node head = null;
    Node tail = null;

    public boolean isEmpty(){
        return (head == null) && (tail == null);
    }

    public void addToTail(int val){
        if (isEmpty()) {
            head = tail = new Node(val);
            return;
        }
        Node newNode = new Node(val);
        tail.right = newNode;
        newNode.left = tail;
        tail = newNode;
    }

    private void traverse(){
        if (isEmpty()) {
            return;
        }
        list.clear();
        Node p = head;
        while (p != null) {
            list.add(p.val);
            p = p.right;
        }
    }

    public void addToHead(int val) {
        if (isEmpty()) {
            head = tail = new Node(val);
            return;
        }
        Node newNode = new Node(val);
        head.left = newNode;
        newNode.right = head;
        head = newNode;
    }

    public void print(){
        traverse();
        System.out.println(list);
    }

    public int size(){
        traverse();
        return list.size();
    }
}
