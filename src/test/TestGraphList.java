package test;

import graph.Graph;
import graph.GraphList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class TestGraphList {

    @Test
    public void TestGraphList() {
        int[] i = {1, 2, 2, 3, 2, 1, 3, 3, 0};
        GraphList g = new GraphList(i);
        ArrayList<Graph.Arc<Integer>> succ1 = (ArrayList<Graph.Arc<Integer>>) g.getSucc(1);
        assertEquals(succ1.getFirst().destination(), 2);
        assertEquals(succ1.getLast().destination(), 3);
    }
}
