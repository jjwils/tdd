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

//    @Test
//    void retrieveElement(){
//
//    }

//    @Test
//    void removeSuccessful(){
//
//        set.remove();
//        Assertions.assertEquals(1, set.size());
//    }
}
