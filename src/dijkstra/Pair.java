package dijkstra;

public class Pair<T> implements Comparable<Pair<T>> {

    private T sommet;
    private int dist;

    public Pair(T sommet, int dist) {
        this.sommet = sommet;
        this.dist = dist;
    }

    public T getSommet() {
        return sommet;
    }

    public int getDist() {
        return dist;
    }

    @Override
    public int compareTo(Pair<T> o) {
        return Integer.compare(this.dist, o.dist);
    }
}
