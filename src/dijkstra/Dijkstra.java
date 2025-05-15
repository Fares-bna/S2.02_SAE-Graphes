package dijkstra;

import graph.Graph;
import graph.ShortestPath;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Dijkstra<T> implements ShortestPath<T> {

	private HashMap<T, Integer> dist;
	private HashMap<T, T> pred;
	private PriorityQueue<Pair<T>> file;

	@Override
	public Distances<T> compute(Graph<T> g, T src, Animator<T> animator) throws IllegalArgumentException {
		initDijkstra(src);
		while (!file.isEmpty()) {}
		{
			Pair<T> actuelle = file.poll();
			T u = actuelle.getSommet();
			int d = actuelle.getDist();


		}

		return null;
	}

	private void initDijkstra(T src) {
		HashMap<T, Integer> dist = new HashMap<>();
		HashMap<T, T> pred = new HashMap<>();
		PriorityQueue<Pair<T>> file = new PriorityQueue<>();

		dist.put(src, 0);
		pred.put(src, null);
		file.add(new Pair<>(src, 0));
	}

}
