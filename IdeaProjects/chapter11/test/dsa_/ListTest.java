package dsa_;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    List list;

    @BeforeEach
    void setUp() {
        list = new ArrayList();
    }

    @Test
    void testListIsEmpty() {
        assertTrue(list.isEmpty());
    }

    @Test
    void addItem_listNotEmptyTest() {
        list.add("G-string");
        assertFalse(list.isEmpty());
    }

    @Test
    void addItem_andRemoveItem_fromListTest() {
        list.add("E-string");
        list.delete("E-string");
        assertTrue(list.isEmpty());
    }

    @Test
    void addItem_listSizeIncreasesTest() {
        list.add("G-string");
        list.add("A-string");
        assertEquals(2, list.size());
    }

    @Test
    void addX_addY_removeX_sizeReduceTest() {
        list.add("G-String");
        list.add("A-String");
        list.delete("G-String");
        assertEquals(1, list.size());
    }

    @Test
    void addX_addY_removeX_sizeIsNotEmptyTest() {
        list.add("G-string");
        list.add("A-string");
        list.add("F-string");
        list.delete("G-string");
        assertFalse(list.isEmpty());
    }

    @Test
    void addX_addY_removeX_retrieveYTest() {
        list.add("G-String");
        list.add("A-String");
        assertEquals("A-String",list.get(1));
    }

    @Test
    void addX_addY_removeX_retrieveXTest() {
        list.add("G-String");
        list.add("A-String");
        String gotten = list.get(0);
        assertEquals("G-String", gotten);
    }

    @Test
    void addX_addY_removeX_getX_ShouldReturnYTest() {
        list.add("G-String");
        list.add("A-String");
        list.add("E-String");
        list.delete("G-String");
        String gotten = list.get(0);
        assertEquals("A-String", gotten);
    }

    @Test
    void addSixElement_CapacityShouldDoubleTest() {
        assertEquals(5, list.capacity());
        list.add("G-String");
        list.add("A-String");
        list.add("E-String");
        list.add("G-String");
        list.add("A-String");
        list.add("E-String");
        assertEquals(10, list.capacity());
    }
}