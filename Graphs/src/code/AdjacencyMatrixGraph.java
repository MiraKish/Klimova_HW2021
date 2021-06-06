package code;

public class AdjacencyMatrixGraph {
    private boolean adjMatrix[][];
    private int numVertices;

    // Initialize the matrix
    public AdjacencyMatrixGraph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }
}
