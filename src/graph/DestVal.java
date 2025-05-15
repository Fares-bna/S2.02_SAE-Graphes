package graph;

public record DestVal(String suc, int val) {

    public String getsuc() {
        return suc;
    }
    public int getVal() {
        return val;
    }
}
