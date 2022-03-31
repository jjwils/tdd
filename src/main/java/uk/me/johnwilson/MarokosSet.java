package uk.me.johnwilson;

public class MarokosSet {
    private int length;

    public MarokosSet(int length) {
        this.length = length;
    }
    public int size() {
        return length;
    }

    public void add(int i) {
        length++;

    }
}
