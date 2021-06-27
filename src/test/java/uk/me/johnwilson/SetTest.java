package uk.me.johnwilson;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetTest {
    MySet mySet = new MySet();
    

    // @BeforeEach
    // void newSet(){
    //      mySet = new MySet();

    // }


@Test
void testEmpty(){

    assertTrue(mySet.isEmpty());
}

@Test
void testAdd(){
    mySet.add(100);
    assertFalse(mySet.isEmpty());

    mySet.add(200);
    assertFalse(mySet.isEmpty());

    assertEquals(2, mySet.size());


}

@Test
void testGet(){

    


}

}