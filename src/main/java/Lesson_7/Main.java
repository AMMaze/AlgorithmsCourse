package Lesson_7;

public class Main {
    public static void main (String[] args) {
        Graph graph = new Graph();

        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Рязань");
        graph.addVertex("Калуга");

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);

        graph.addVertex("Липецк");
        graph.addVertex("Тамбов");
        graph.addVertex("Орёл");
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 6);

        graph.addVertex("Воронеж");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");
        graph.addEdge(4, 7);
        graph.addEdge(5, 8);
        graph.addEdge(6, 9);
        graph.addEdge(8, 7);
        graph.addEdge(9, 7);

        System.out.println(graph.minbfs(0, 7));
    }
}
