package dsa_;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MayBankListTest {
    MayBankList myList;

    @BeforeEach
    void setUp() {
        myList = new MayBankArrayList();
    }

    @Test    /* this is to test that we have an empty list**/
    void testThatListIsEmpty(){
        assertTrue(myList.isEmpty());
    }

    @Test    /* this is to test that we can add to an empty list**/
    void testThaWhenItemIsAddedToList_IsNotEmpty(){
        myList.add("BluetoothDevice");
        assertFalse(myList.isEmpty());
    }

    @Test   /*  to add and remove added item from list* */
    void testThaWhenItemIsAddedToList_itemCanBeRemoved_andSizeReduces(){
        myList.add("BluetoothDevice");
        myList.add("iPhone");
        myList.delete("iPhone");
        assertEquals(1, myList.size());
    }

    @Test   /* to ensure list is empty after 1 added item is deleted */
    void testThatWhenItemIsAddedToList_listIsEmptyAfterItemIsDeleted(){
        myList.add("iPhone");
        myList.delete("iPhone");
        assertTrue(myList.isEmpty());
    }

    @Test    /*  to test that when an item is added to the list can expand */
    void testThatListSizeIncreasesWhenItemIsAdded (){
        myList.add("iPhone");
        myList.add("BluetoothDevice");
        myList.add("computer");
        assertEquals(3, myList.size());
    }

    @Test    /*  to test that item can be gotten at a particular index */
    void testThatAnItemCanBeGottenAtAnIndex(){
        myList.add("iPhone");
        myList.add("BluetoothDevice");
        myList.add("computer");
        assertEquals("iPhone", myList.get(0));
        assertEquals("computer", myList.get(2));
    }

    @Test    /*  to test that an item can remove from a particular index in the list */
    void tesToRemoveFromAParticularIndex() {
        myList.add("iPhone");
        myList.add("BluetoothDevice");
        myList.add("computer");
        myList.deleteFromAParticularIndex(0);
        assertNull(myList.get(0));
    }
}
