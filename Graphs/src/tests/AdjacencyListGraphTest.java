package tests;

import code.AdjacencyListGraph;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AdjacencyListGraphTest extends Assertions {
    @Test
    public void addEdge_adds3NewEdges_allNewEdgesEqualsTrue() {
        AdjacencyListGraph graph = new AdjacencyListGraph(5);

        graph.addEdge(1, 2);
        graph.addEdge(2,4);
        graph.addEdge(3,4);

        assertEquals(true, graph.hasEdge(1,2));
        assertEquals(true, graph.hasEdge(2,4));
        assertEquals(true, graph.hasEdge(3,4));
    }
    
}
