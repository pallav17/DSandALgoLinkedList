package com.company;



public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.addFirst(5);
        list.addFirst(20);
        list.addFirst(2);

        list.removeFirst();

        list.removeLast();

        System.out.println(list.indexof(2));

        System.out.println(list.contains(90));

    }
}
