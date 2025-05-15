package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GrapheHHAdj implements VarGraph {

	ArrayList<String> allSommets;
	HashMap<String, ArrayList<DestVal>> allArcs;

	public GrapheHHAdj() {
		this.allSommets = new ArrayList<>();
		allArcs = new HashMap<>();
	}

	@Override
	public List<Arc<String>> getSucc(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterSommet(String noeud) {
		allSommets.add(noeud);
	}

	@Override
	public void ajouterArc(String source, String destination, Integer valeur) {
		DestVal suc = new DestVal(destination, valeur);
		if(allArcs.containsKey(source)) {
			allArcs.get(source).add(suc);
		}
		else {
			ArrayList<DestVal> sucs = new ArrayList<>();
			sucs.add(suc);
			allArcs.put(source, sucs);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (String s : allSommets) {
			if(allArcs.containsKey(s)) {
				for (DestVal d : allArcs.get(s)) {
					sb.append(s + " - " + d.getsuc() + " (" + d.getVal() + ")");
					sb.append("\n");
				}
			}
		}
		return sb.toString();
	}
}
