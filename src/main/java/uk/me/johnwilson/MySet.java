package uk.me.johnwilson;


public class MySet {

    int[] set;

    boolean isEmpty(){
        return set == null;
    }

    public void add(int i) {
        if (set == null){
            set = new int[1];
        }
        set[0] = i;
    }

    public Integer size() {
        return set.length;
    }

}
