package code;

import java.util.HashSet;
import java.util.LinkedList;

public class EdgesListGraph {
    public static class Node {
        private int num;
        private LinkedList < Edge > edgeList;

        public Node(int num) {
            this.num = num;
            edgeList = new LinkedList < > ();
        }

        public LinkedList < Edge > getEdges() {
            return edgeList;
        }
    }

    public static class Edge {
        private int weight;
        private Node destVertex;

        public Edge(Node dest, int w) {
            this.destVertex = dest;
            this.weight = w;
        }

        public Edge(Node dest) {
            this.destVertex = dest;
            this.weight = 1;
        }

        public int getWeight() {
            return weight;
        }

        public Node getDestVertex() {
            return destVertex;
        }
    }

    public static class Graph {
        private HashSet<Node> nodes;

        public Graph() {
            nodes = new HashSet<>();
        }

        //if adds - true (found)
        public boolean AddEdge(Node v1, Node v2, int weight) {
            return v1.getEdges().add(new Edge(v2, weight)) && v2.getEdges().add(new Edge(v1, weight));
        }

        //if removes - false (not found)
        public boolean RemoveEdge(Node v1, Node v2, int weight) {
            return v1.getEdges().remove(new Edge(v2, weight)) && v2.getEdges().add(new Edge(v1, weight));
        }

        public boolean AddVertex(Node v) {
            return nodes.add(v);
        }
    }
}
