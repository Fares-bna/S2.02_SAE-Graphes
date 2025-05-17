import graph.Graph;
import graph.GrapheHHAdj;
import graph.VarGraph;
import graph.IGraphList;
import java.util.ArrayList;

public class Appli {
    public static void main(String[] args) {
        VarGraph g = new GrapheHHAdj();
        g.peupler("A-B(6), A-C(1), A-D(2), B-E(1), C-E(4), D-B(1), E-F(1)");
        for(Graph.Arc a : g.getSucc("A"))
        {
            System.out.println(a);
        }
    }
}
