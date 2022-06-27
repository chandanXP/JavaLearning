package com.company.LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size = 0;

    public LL(){
        this.size=0;
    }

    public void insertionFirst(int value){
        Node node = new Node(value);
        node.next= head;
        head = node;

        if(tail == null){
            tail =head;
        }
        size +=1;
    }

    public void insertionLast(int value){
        Node node = new Node(value);
        if(tail==null){
            insertionFirst(value);
        }
        else{
            tail.next  = node;
            tail = node;
        }

        size+=1;
    }
    public void insertion(int value, int index){
        Node temp = head;
        if(index==0){
            insertionFirst(value);
            return;
        }
        if(index ==size){
            insertionLast(value);
            return;
        }

        for(int i=1 ; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next =node;
        size++;


    }

    public void display(){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.value + "-->");
            temp =temp.next;
        }
        System.out.println("END");
    }



    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value , Node next){
            this.value = value;
            this.next = next;
        }
    }





}
