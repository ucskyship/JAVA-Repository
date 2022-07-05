package dsa_;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {

    Set mySet;

    @BeforeEach
    void setUp() {
        mySet = new HashSet();
    }

    @Test
    @DisplayName("test that the set is empty when created")
    void testSetIsEmpty() {
        assertTrue(mySet.isEmpty());
    }

    @Test
    @DisplayName("test that item can be added to the set")
    void testThatItemCanBeAddedToSet() {
        mySet.add("BlackBottle");
        assertEquals(1, mySet.size());
    }

    @Test
    @DisplayName("test that item can be gotten at a particular index")
    void testThatItemCanBeGottenAtIndex() {
        mySet.add("BlackBottle");
        mySet.add("Drinks");
        mySet.add("Bear");
        assertEquals("BlackBottle", mySet.get(0));
        System.out.println(mySet.get(0));
    }

    @Test
    @DisplayName("Test that set cannot add duplicate items")
    void testThatSetContainsUniqueItem() {
        mySet.add("BlackBottle");
        mySet.add("BlackBottle");
        var size = mySet.size();
        assertEquals(1, size);
        assertEquals("BlackBottle", mySet.get(0));
    }

    @Test
    @DisplayName("test that we can remove from a set")
    void testThatWeCanRemoveFromSet(){
        mySet.add("BlackBottle");
        mySet.delete("BlackBottle");
        assertTrue(mySet.isEmpty());
    }

    @Test
    @DisplayName("test that we can delete from a set with index")
    void testThatWeCanDeleteFromSetAtAParticularIndex() {
        mySet.add("BlackBottle");
//        mySet.deleteIndex("BlackBottle");
    }
}
