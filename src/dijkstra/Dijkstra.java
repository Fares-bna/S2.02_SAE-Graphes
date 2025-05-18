package dijkstra;
import graph.IGraph;
import graph.IGraph.Arc;

import java.util.*;

public class Dijkstra<T> implements IShortestPath<T> {

	@Override
	public Distances<T> compute(IGraph<T> g, T src, Animator<T> animator) throws IllegalArgumentException {
		Map<T, Integer> dist = new HashMap();
		Map<T, T> pred = new HashMap();
		Set<T> visited = new HashSet<>();

		dist.put(src, 0);

		while(true)
		{
			T current = null;
			int minDist = Integer.MAX_VALUE;

			for(Map.Entry<T, Integer> en :  dist.entrySet())
			{
				if(!visited.contains(en.getKey()) && en.getValue() < minDist)
				{
					current = en.getKey();
					minDist = en.getValue();
				}
			}

			if(current == null) break;

			visited.add(current);

			for(Arc<T> arc : g.getSucc(current))
			{
				if(arc.val() < 0) throw new IllegalArgumentException();
				T voisin = arc.destination();
				int nDist = dist.get(current) + arc.val();

				if(!dist.containsKey(voisin) || nDist < dist.get(voisin))
				{
					dist.put(voisin, nDist);
					pred.put(voisin, current);
				}
			}
		}

		return new Distances<T>(dist, pred);
	}
}
