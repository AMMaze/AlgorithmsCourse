package Lesson_7;

public class Vertex {
    public String label;

    public boolean wasVisited;

    public Vertex(String label) {
        this.label = label;
        this.wasVisited = false;
    }

    @Override
    public String toString() {
        return label;
    }
}
