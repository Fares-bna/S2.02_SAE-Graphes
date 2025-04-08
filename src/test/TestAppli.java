package test;

import Graphes.Graph;
import Graphes.GraphMatriceAdjacence;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

public class TestAppli {
    @Test
    public void testAppli() {

        Graph<String> g = new GraphMatriceAdjacence<>();
        Graph.Arc<String> ab= new Graph.Arc<>(1,"B");
        Graph.Arc<String> ac= new Graph.Arc<>(1,"A");
        g.addArc("A",ab);
        g.addArc("B",ac);
    }
}
