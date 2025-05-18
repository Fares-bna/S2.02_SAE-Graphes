import graph.IGraph;
import graph.GrapheHHAdj;

public class Appli {
    public static void main(String[] args) {
        IVarIGraph g = new GrapheHHAdj();
        g.peupler("A-B(6), A-C(1), A-D(2), B-E(1), C-E(4), D-B(1), E-F(1)");
        for(IGraph.Arc a : g.getSucc("A"))
        {
            System.out.println(a);
        }
    }
}
