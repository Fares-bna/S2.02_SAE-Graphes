package Graphes;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GraphList implements Graph<Integer> {

    private List<Integer> listGraph;
    private HashMap<Integer, ArrayList<Arc<Integer>>> allArcs;

    public GraphList(List<Integer> l) {
        listGraph = l;
        allArcs = allArcs();
    }

    private HashMap<Integer, ArrayList<Arc<Integer>>> allArcs() {
        HashMap<Integer, ArrayList<Arc<Integer>>> allArcs = new HashMap<>();
        for(int i = 1; i < listGraph.size(); i += 2) {
            ArrayList<Arc<Integer>> arcs = new ArrayList<>();
            int dep = listGraph.get(i - 1);
            int stop = listGraph.get(i);
            for(int j = 0; j < stop ; ++j)
            {
                ++i;
                if(i < listGraph.size()) {
                    Arc<Integer> a = new Arc(1, listGraph.get(i));
                    arcs.add(a);
                }
            }
            allArcs.put(dep, arcs);
        }
        return allArcs;
    }

    @Override
    public List<Arc<Integer>> getSucc(Integer sommet) {
        return allArcs.get(sommet);
    }
}
