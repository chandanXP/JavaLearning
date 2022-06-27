package com.company.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertionFirst(10);
        list.insertionFirst(20);
        list.insertionFirst(30);
        list.insertionFirst(40);
        list.display();

        LL l2 = new LL();
        l2.insertion(100,0);
        l2.insertionLast(22);
        l2.insertionLast(23);
        l2.insertion(20, 1);
        l2.display();

    }
}
