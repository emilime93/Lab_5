package se.kth.emibra.lab5.provided;

import se.kth.id1020.Graph;
import se.kth.id1020.DataSource;
public class Paths {
    public static void main(String[] args) {
        Graph g = DataSource.load();
        // work on g
        System.out.println(g.numberOfVertices());
    }
}