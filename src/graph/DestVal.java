package graph;

public record DestVal(String dest, int val) {

    public String getDest() {
        return dest;
    }
    public int getVal() {
        return val;
    }
}
