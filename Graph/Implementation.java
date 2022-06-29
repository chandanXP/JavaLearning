package com.company.Graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class Implementation {
    public static void main(String[] args) {
        int v = 5;
        int e= 10;

        //implementing by using adjacency Matrix
        int [][]g = new int[v+1][v+1];

        //implementing by using adjacency list

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0; i<v; i++){
            //adding default linked list,
            //so that in future we don't have to care about it
            list.add(new ArrayList<>());
        }


    }
    static void addEdge(int [][]graph, int source, int dest){
        graph[source][dest] =1;
        graph[dest][source] =1;

    }
    static void addEdge(ArrayList<ArrayList<Integer>> graph, int source, int dest) {
        graph.get(source).add(dest);
        graph.get(dest).add(source);

    }


}
