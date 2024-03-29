/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphtheory;
import java.util.*;
import java.io.*;
/**
 *
 * @author Joshua
 */
public class GraphTheoryClass {
    
    ArrayList<Integer> nodes[];
    ArrayList<Integer> nodeDistance[];
    public GraphTheoryClass(int size) {
        nodes = new ArrayList[size+1];
        nodeDistance = new ArrayList[size+1];
        for(int i=0; i<=size; i++){
            nodes[i]= new ArrayList<Integer>();
            nodeDistance[i]= new ArrayList<Integer>();
        }
    }
    
    void addBranch(int beginningNode, int endingNode, int distance, boolean isBiDirectional){
        if(isBiDirectional){
            nodeDistance[beginningNode].add(distance);
            nodeDistance[endingNode].add(distance);
            nodes[beginningNode].add(endingNode);
            nodes[endingNode].add(beginningNode);
        }else{
            nodeDistance[beginningNode].add(distance);
            nodes[beginningNode].add(endingNode);
        }
    }
    
    int longestBranch(int startNode){
        //Something is wrong with this algorithm but im not sure what it is
        Queue<Integer> q = new LinkedList<Integer>();
        boolean visited[] = new boolean[nodes.length];
        int distance[] = new int[nodes.length];
        q.add(startNode);
        while(!q.isEmpty()){
            int position = q.remove();
            if(!nodes[position].isEmpty()){
                int nodeSize = nodes[position].size();
                for(int i=0; i<nodeSize; i++){
                    int pointing = nodes[position].get(i);
                    if(!visited[pointing]){
                        q.add(pointing);
                        distance[pointing]=distance[position]+nodeDistance[position].get(i);
                        visited[pointing]=true;
                    }
                }
            }
        }
        int max = 0;
        for(int i=0; i<nodes.length; i++){
            if(distance[i]>max){
                max=distance[i];
            }
        }
        return max;
    }
    int dijkstra(int startNode, int endNode){
        Queue<Integer> q = new LinkedList<Integer>();
        boolean visited[] = new boolean[nodes.length];
        int distance[] = new int[nodes.length];
        q.add(startNode);
        while(!q.isEmpty()){
            int nodePos = q.remove();
            for(int i=0; i<nodes[nodePos].size(); i++){
                //update the node distance
                if(nodeDistance[nodePos].get(i)+distance[nodePos]>distance[nodes[nodePos].get(i)]){
                    distance[nodes[nodePos].get(i)]=nodeDistance[nodePos].get(i)+distance[nodePos];
                }
            }
            //add node positions to queue from least to most based on distance
            //Not the most efficient in terms of sorting
            //IDK how to do this... rip
            
        }
        return distance[endNode];
    }
}
