package uk.me.johnwilson;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {

    MySet mySet = null;

    @BeforeEach
    void before() {
        mySet = new MySet();
    }

    @Test
    void isNotNull(){
        assertNotNull(mySet);
    }

    @Test
    void isEmpty(){
        assertTrue(mySet.isEmpty());
    }

    @Test
    void isNotEmpty() {
        mySet.add(1);
        assertFalse(mySet.isEmpty());
    }

    @Test
    void contains(){
        mySet.add(2);
        mySet.contains(2);
        assertTrue(mySet.contains(2));

    }

    @Test
    void noDuplicates(){
        assertTrue(mySet.add(2));
       assertFalse(mySet.add(2));
    }

    @Test
    void remove(){
        mySet = new MySet();
        mySet.add(2);
        assertTrue(mySet.remove(2));
        assertFalse(mySet.contains(2));

    }

    @Test
    void intialElementsAreZero(){
        assertEquals(0,mySet.getItemAt(0));
    }

    @Test
    void add(){
        mySet = new MySet();
        assertTrue(mySet.add(2));

        //debug
        for (int i = 0; i < 10; i++) {
            System.out.println(mySet.getItemAt(i));


        }
        assertEquals(2,mySet.getItemAt(0));


    }



}
