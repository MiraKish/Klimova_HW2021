package tests;
import code.EdgesListGraph;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class EdgesListGraphTest extends Assertions {
    @Test
    public void addEdge_adds1NewEdges_newEdgeEqualsTrue() {
        EdgesListGraph.Graph graph = new EdgesListGraph.Graph();

        EdgesListGraph.Node v0 = new EdgesListGraph.Node(0);
        EdgesListGraph.Node v1 = new EdgesListGraph.Node(1);

        graph.AddVertex(v0);
        graph.AddVertex(v1);

        assertEquals(true, graph.AddEdge(v0, v1, 2));
    }

    @Test
    public void removeEdge_removesEdge_oldEdgeEqualsFalse() {
        EdgesListGraph.Graph graph = new EdgesListGraph.Graph();

        EdgesListGraph.Node v0 = new EdgesListGraph.Node(0);
        EdgesListGraph.Node v1 = new EdgesListGraph.Node(1);

        graph.AddVertex(v0);
        graph.AddVertex(v1);

        assertEquals(false, graph.RemoveEdge(v0, v1, 2));
    }
}
