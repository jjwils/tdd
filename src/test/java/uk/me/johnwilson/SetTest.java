package uk.me.johnwilson;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetTest {

    BenJohnSet benJohnSet;


    @Test
    public void isEmpty(){
        benJohnSet = new BenJohnSet();
        assertTrue(benJohnSet.isEmpty());
    }


    @Test
    public void isNotEmpty(){

        benJohnSet = new BenJohnSet();
        benJohnSet.add();
        assertFalse(benJohnSet.isEmpty());

    }

    @Test
    public void size(){
        benJohnSet = new BenJohnSet();
        assertTrue(benJohnSet.size() == 0);

        benJohnSet.add();
        assertTrue(benJohnSet.size() == 1);


    }



}
