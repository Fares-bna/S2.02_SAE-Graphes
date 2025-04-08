package Graphes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
