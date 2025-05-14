package graph;

import java.util.List;

public class GrapheMatriceAdj implements Graph<String> {
    private String a;

    public GrapheMatriceAdj() {
        this.a = "A";
    }

    @Override
    public List<Arc<String>> getSucc(String sommet) {
        return List.of();
    }
}
