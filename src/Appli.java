import Graphes.Graph;
import Graphes.GraphMatriceAdjacence;

public class Appli {
    public static void main(String[] args) {
        Graph<String> g = new GraphMatriceAdjacence<>();
        Graph.Arc<String> ab = new Graph.Arc<>(1, "B");
        System.out.println(g);
    }
}
