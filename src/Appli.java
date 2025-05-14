import graph.IGraphList;

import java.util.ArrayList;

public class Appli {
    public static void main(String[] args) {
        int[] i = {1, 2, 2, 3, 2, 1, 3, 3, 0};
        ArrayList<Integer> l = new ArrayList<>();
        for(int k : i)
        {
            l.add(k);
        }
        IGraphList g = new IGraphList(l);
    }
}
