package tests;

import code.AdjacencyMatrixGraph;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AdjacencyMatrixGraphTest extends Assertions {
    @Test
    public void addEdge_addes3NewEdges_allNewEdgesEqualsTrue() {
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(5);

        graph.addEdge(1, 2);
        graph.addEdge(2,4);
        graph.addEdge(3,4);

        assertEquals(true, graph.hasEdge(1,2));
        assertEquals(true, graph.hasEdge(2,4));
        assertEquals(true, graph.hasEdge(3,4));
    }

    @Test
    public void removeEdge_removesAllEdges_oldEdgesEqualsFalse() {
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(5);

        graph.addEdge(1, 2);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.removeEdge(1, 2);
        graph.removeEdge(2, 4);
        graph.removeEdge(3, 4);

        assertEquals(false, graph.hasEdge(1, 2));
        assertEquals(false, graph.hasEdge(2, 4));
        assertEquals(false, graph.hasEdge(3, 4));
    }

    @Test
    public void addEdge_outOfBorders_throwsExc() {
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(5);

        assertThrows(RuntimeException.class, () -> graph.addEdge(2,5));
    }
}
