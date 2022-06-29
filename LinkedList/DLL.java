package com.company.LinkedList;

public class DLL {
    private Node head;
    private int size;
    //private Node tail;

    DLL(){
        this.size = 0;
    }

    public void insertionFirst(int val){
        Node node =  new Node(val);
        node.next = head;
        node.prev = null;

        if(head!=null){
            head.prev = node;
        }

        head = node;
        size++;

    }

    public void insertionLast(int value){
        if(head==null){
            insertionFirst(value);
        }
        Node node = new Node(value);
        node.next = null;

        Node Last = get(size-1);
        Last.next = node;
        node.prev = Last;

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

        for(int i=0 ; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(value);
        node.next = temp.next.next;
        temp.next.next.prev = node;
        temp.next =node;
        node.prev= temp;
        size++;

    }

    public void insertAfter(int after, int value){
        Node p = find(after);

        if(p==null){
            System.out.println("Not exists! ");
            return;
        }

        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev= p;
        if(node.next != null){
            p.next.next.prev =node;
        }
        size++;

    }


    public Node get(int index){
        Node node = head;
        for(int i =0; i<index;i++){
            node = node.next;
        }
        return  node;
    }

    public Node find(int value){
        Node node = head;
        while (node!=null){
            if(node.value== value){
                return node;
            }
            node= node.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while (temp!= null){
            System.out.print(temp.value + "-->");
            last = temp;
            temp =temp.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse: ");
        while (last!=null){
            System.out.print(last.value+"-->");
            last = last.prev;
        }
        System.out.println("HEAD");
    }

    public void displayReverse(){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.value + "-->");
            temp =temp.next;
        }
        System.out.println("END");
    }



    public class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this .prev =prev;
        }

    }
}
