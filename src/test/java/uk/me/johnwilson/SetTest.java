package uk.me.johnwilson;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {

    AlexSet alexSet = null;


    @Test
    void isNull(){

        assertEquals(null,alexSet);
    }

    @Test
    void isNotNull(){

        alexSet = new AlexSet();

        assertNotNull(alexSet);
    }

    @Test
    void isEmpty(){

        alexSet = new AlexSet();

        assertTrue(alexSet.isEmpty());
    }

    @Test
    void givenItemsExistShouldReturnNotEmpty(){

        alexSet = new AlexSet();

        alexSet.addItem(1);

        assertFalse(alexSet.isEmpty());
    }

    @Test
    void whatIsEmpty(){
        alexSet = new AlexSet();
        System.out.println(alexSet.getItemAt(0));

    }



}
