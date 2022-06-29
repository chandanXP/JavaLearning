package com.company.Graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class MinDist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v=6;
        int e=8;
        boolean vis[] = new boolean[v];
        int []pred = new int[v+1];
        int []dist = new int[v+1];

        boolean isReached = BFS(adj, 1,6, v,pred, dist);


        int components = 0;//give the count of unvisited nodes
        //to check un-visited node pass the visited array in BFS method in args
//        for (int i =0; i<=v; i++){
//            if(!vis[i]){
//                components++;
//                BFS(adj, 1,6, v,pred, dist, vis);
//            }
//        }
    }

    public static boolean BFS(
            ArrayList<ArrayList<Integer>> adj, int src, int dest,int v, int pred[], int dist[]){
        LinkedList<Integer> queue = new LinkedList<>();
        boolean visited [] = new boolean[v];

        for(int i=0; i<v;i++){
            // initial values
            visited[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;//tell the neighbors of a node
        }

        visited[src] = true;
        dist[src] = 0;
        queue.add(src);

        while (!queue.isEmpty()){
            int curr = queue.remove();
            for (int i=0; i<adj.get(curr).size(); i++){
                int neighbor  = adj.get(curr).get(i);
                if(visited[neighbor]==false){
                    visited[neighbor]= true;
                    dist[neighbor] = dist[curr]+1;
                    pred[neighbor] = curr;
                    queue.add(neighbor);
                    if(neighbor ==dest){
                        return true;
                    }
                }
            }

        }

        return  false;
    }

}
