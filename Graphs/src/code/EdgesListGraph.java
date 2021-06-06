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
}
