package com.company.LinkedList;

import org.w3c.dom.Node;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        //Singly Linked List
//        LL list = new LL();
//        list.insertionFirst(10);
//        list.insertionFirst(20);
//        list.insertionFirst(30);
//        list.insertionFirst(40);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//
//
//        LL l2 = new LL();
//        l2.insertion(100,0);
//        l2.insertionLast(22);
//        l2.insertionLast(23);
//        l2.insertionLast(25);
//        l2.insertionLast(26);
//        l2.insertion(20, 1);
//        //System.out.println(l2.deleteLast());
//        l2.display();
//        System.out.println(l2.delete(2));
//        l2.display();

        //DLL
//        DLL list = new DLL();
//        list.insertionLast(10);
//        list.insertionFirst(20);
//        list.insertionFirst(30);
//        list.insertionLast(40);
//        list.insertion(15 ,1);
//        list.insertAfter(20, 45);
//        list.display();
        //System.out.println(list.deleteFirst());
        //list.display();


//        CLL list = new CLL();
//        list.insert(23);
//        list.insert(3);
//        list.insert(19);
//        list.insert(75);
//        list.display();
//        list.delete(19);
//        list.display();

        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        //l.remove(0+2);
        Iterator<Integer> i = l.iterator();
        //System.out.println(i.next());
        //System.out.println(l.getLast());
        //System.out.println(l.getFirst());

        while(i.hasNext()){
            l.remove(0+2);
            //System.out.println(i.next());
        }

    }
}
