package uk.me.johnwilson;

import java.util.List;

public class MarokosSet {
    private int length;
    private int[] array = new int[100];

    public MarokosSet(int length) {

        this.length = length;
        for(int i=0;i<length;i++){
            array[i] = -1;
        }
    }
    public int size() {
        return length;
    }

    public void add(int i) {
        array[length] = i;
        length++;

    }

    public boolean contains(int element) {
        if (element < 0)
            return false;

        for(int i = 0;i<length;i++){
            if(array[i]==element){
                return true;
            }
        }
        return false;
    }
}
