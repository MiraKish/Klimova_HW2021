package code;

import java.util.*;

public class AdjacencyListGraph {
    int n;
    LinkedList<LinkedList<Integer> > adj;

    private String outOfBorders = "Your edges are out of borders!";

    private void throwsOutOfBordersExc() {
        throw new RuntimeException(outOfBorders);
    }

    public AdjacencyListGraph(int n0) {
        n = n0;
        adj = new LinkedList<LinkedList<Integer>>();
        for (int i = 0; i < n; ++i) {
            adj.add(new LinkedList<Integer>());
        }
    }

    public void addEdge(int i, int j) {
        if (i > n || j > n) {
            throwsOutOfBordersExc();
        }
        adj.get(i).add(j);
        adj.get(j).add(i);
    }

    public void removeEdge(int i, int j) {
        for (int k = 0; k < adj.get(i).size(); k++) {
            if (adj.get(i).get(k) == j) {
                adj.get(i).remove(k);
                return;
            }
        }
    }

    public boolean hasEdge(int i, int j) {
        return adj.get(i).contains(j);
    }
}
