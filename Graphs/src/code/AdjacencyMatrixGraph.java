package code;

public class AdjacencyMatrixGraph {
    private boolean adjMatrix[][];
    private int numVertices;

    private String outOfBorders = "Your edges are out of borders!";

    private void throwsOutOfBordersExc() {
        throw new RuntimeException(outOfBorders);
    }

    // Initialize the matrix
    public AdjacencyMatrixGraph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }

    // Add edges
    public void addEdge(int i, int j) {
        if (i > numVertices || j > numVertices) {
            throwsOutOfBordersExc();
        }
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }

    // Remove edges
    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }

    // Checks whether graph has an edge or not
    public boolean hasEdge(int i, int j) {
        return adjMatrix[i][j];
    }
}
