package uk.me.johnwilson;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetTest {
    MarokosSet set = new MarokosSet(0);

    @Test
    void setExists() {
        Assertions.assertNotNull(set);
    }

    @Test
    void setSizeMoreThanZero() {
        MarokosSet set = new MarokosSet(1);
        Assertions.assertTrue(set.size() > 0);
    }

    @Test
    void isEmpty() {
        Assertions.assertEquals(0, set.size());
    }

    @Test
    void addSuccessful(){
        set.add(1);
        Assertions.assertEquals(1, set.size());
    }

    @Test
    void containsElement(){
        MarokosSet set = new MarokosSet(1);
        set.add(10);
        Assertions.assertTrue(set.contains(10));

    }

    @Test
    void dymanicAllocationSuccessful(){
        MarokosSet set = new MarokosSet(0);
        set.add(1);
        set.add(2);
        Assertions.assertEquals(2, set.size());


    }

    @Test
    void dymanicAllocation10Successful(){
        MarokosSet set = new MarokosSet(10);
        set.add(1);
        set.add(2);
        Assertions.assertEquals(12, set.size());
    }

    @Test
    void doesntContainMinusOne() {
        MarokosSet set = new MarokosSet(10);
        Assertions.assertFalse(set.contains(-1));
    }


//    @Test
//    void removeSuccessful(){
//
//        set.remove();
//        Assertions.assertEquals(1, set.size());
//    }
}
