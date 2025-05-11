package graph;

import java.util.List;

public class GraphMatriceAdjacence<T> implements Graph<T> {
    private String a;

    public GraphMatriceAdjacence() {
        this.a = "A";
    }



    @Override
    public List<Arc<T>> getSucc(T sommet) {
        return List.of();
    }

}
