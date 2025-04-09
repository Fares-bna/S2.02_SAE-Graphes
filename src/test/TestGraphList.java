package test;

import Graphes.Graph;
import Graphes.GraphList;
import Graphes.GraphMatriceAdjacence;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class TestGraphList {

    @Test
    public void TestGraphList() {
        int[] i = {1, 2, 2, 3, 2, 1, 3, 3, 0};
        ArrayList<Integer> l = new ArrayList<>();
        for(int k : i)
        {
            l.add(k);
        }
        GraphList g = new GraphList(l);
        ArrayList<Graph.Arc<Integer>> succ1 = (ArrayList<Graph.Arc<Integer>>) g.getSucc(1);
        assertEquals(succ1.getFirst().destination(), 2);
        assertEquals(succ1.getLast().destination(), 3);
    }
}
