package code;

public class AdjacencyMatrixGraph {
    private boolean adjMatrix[][];
    private int numVertices;

    // Initialize the matrix
    public AdjacencyMatrixGraph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }

    // Add edges
    public void addEdge(int i, int j) {
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }
}
