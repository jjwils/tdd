package uk.me.johnwilson;

public class MySet {

    private int[] backingArray = new int[10];
    private int counter = 0;

    public boolean isEmpty() {
        return counter == 0;
    }

    public boolean add(int i) {

        System.out.println("Counter " + counter);

       //check for duplicates
        if (contains(i)){
            return false;
        }

        backingArray[counter] = i;
        counter = counter + 1;

        System.out.println("Counter " + counter);


        return true;

    }

    public boolean contains(int i) {
        for (int j = 0; j < counter; j++) {
            if (backingArray[j] == i){
                return true;
            }


        }

        return false;
    }

    public boolean remove(int i) {
        if (!contains(i)){
            return false;
        }

        for (int j = 0; j < counter; j++) {

            if (backingArray[j] == i){
                backingArray[j] = 0;
            }

        }

        return true;
    }

    public int chrome(int index) {

       return backingArray[index];
    }

    public int[] get() {
        return backingArray;

    }
}
