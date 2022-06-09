package uk.me.johnwilson;

public class AlexSet {

    int[] dataStructure = new int[10];

    public boolean isEmpty() {
        for (int i = 0; i < dataStructure.length-1; i++) {
            if (dataStructure[i] != 0){
                return false;
            }
            //what happens now?

        }

        return true;
    }


    public int getItemAt(int i) {

        return dataStructure[i];
    }

    public void addItem(int i) {

        dataStructure[0] = 1;
    }
}
