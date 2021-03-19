package com.company;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

    }


    private Node first;
    private Node last;

    //addFirst
    //addLast
    //deleteFirst
    //deleteLast
    //contains
    //indexOf

    public void addLast(int item) {
        Node node = new Node(item);

        //First check if list is empty or not

        if (first == null)
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item) {
        Node node = new Node(item);

        if (first == null)
            first = last = node;
        else {

            node.next = first;
            first = node;
        }


    }

    public int indexof(int item) {
        int index = 0;
        Node current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public Boolean contains(int item) {
        return indexof(item) != -1;

    }

    public void removeFirst() {

        if(first == null)
            throw new NoSuchElementException();
        else if(first == last){
            first = last = null;
        }
        else {
            Node second = first.next;
            first.next = null;
            first = second;
        }
    }

    public void removeLast(){

        if(first == null || first == last)
        {
            first = last = null;
            return;
        }

        Node previous = getPrevious(last);
        last = previous;
        last.next = null;

    }

    private Node getPrevious(Node node){

        Node current = first;
        while (current != null){
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }



}


