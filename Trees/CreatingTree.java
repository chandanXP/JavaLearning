package com.company.Trees;

import java.util.Scanner;

public class CreatingTree {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        Node root = creatingTree();
        inOrder(root);
        preOrder(root);
        postOrder(root);


    }
    static Node creatingTree(){
        Node root = null;
        System.out.println("Enter data: ");

        int data = sc.nextInt();
        if(data ==-1)return null;

        root = new Node(data);

        System.out.println("enter left for " + data);
        root.left  = creatingTree();

        System.out.println("enter right for " + data);
        root.right = creatingTree();

        return root;
    }

    static void inOrder(Node root){
        if(root==null)return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void postOrder(Node root){
        if(root==null)return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    static void preOrder(Node root){
        if(root==null)return;

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

    }

    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
        }
    }

}
