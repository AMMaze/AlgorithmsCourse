package Lesson_7;

import Lesson_3.queue.QueueImpl;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Graph {
    private final int MAX_VERTS = 32;
    private Vertex[] vertexList;
    private int[][] adjMat;
    private int size;

    public Graph(){
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        size = 0;
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j] = 0;
            }

        }
    }

    public void addVertex(String label){
        vertexList[size++] = new Vertex(label);
    }

    public void addEdge(int start, int end){
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex(int vertex){
        System.out.println(vertexList[vertex]);
    }

    public static Graph randomGraph (int vertexNumber, int maxEdges) {
        Graph graph = new Graph();
        for (int i = 0; i < vertexNumber; i++) {
            graph.addVertex("v" + i);
        }
        Random random = new Random();
        for (int i = 0; i < maxEdges; i++) {
            graph.addEdge(random.nextInt(vertexNumber), random.nextInt(vertexNumber));
        }
        return graph;
    }

    private int getAdjUnvisitedVertex(int ver) {
        for (int i = 0; i < size; i++) {
            if(adjMat[ver][i] == 1 && !vertexList[i].wasVisited) {
                return i;
            }
        }
        return -1;
    }

    public void bfs(){
        vertexList[0].wasVisited = true;
        displayVertex(0);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0); // Вставка в конец очереди
        int v2;
        while(!queue.isEmpty()){
            int v1 = queue.remove();
            while((v2=getAdjUnvisitedVertex(v1)) != -1){
                vertexList[v2].wasVisited = true; // Пометка
                displayVertex(v2); // Вывод
                queue.add(v2);
            }
        }
        for(int i=0; i<size; i++) // Сброс флагов
            vertexList[i].wasVisited = false;
    }

}
