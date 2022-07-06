package dsa_;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack myStack2;
   HashStack myStack;

    @BeforeEach
    void setUp() {
        myStack = new HashStack();
        myStack2 = new HashStack(10);
    }

    @Test
    void  testStackDefiniteSize() {
        System.out.println(myStack2.size());
        myStack2.push("BlackBottle");
        myStack2.push("BlackBottle");
        myStack2.push("BlackBottle");
        myStack2.push("BlackBottle");
        myStack2.push("BlackBottle");
        myStack2.push("BlackBottle");
        myStack2.push("BlackBottle");
        myStack2.push("BlackBottle");
        myStack2.push("BlackBottle");
        myStack2.push("BlackBottle");
        myStack2.push("BlackBottle");
        myStack2.push("BlackBottle");
        for (int i = 0; i <myStack2.size();  i++) {
            System.out.println(myStack2.getItem(i));
        }
        assertEquals(10, myStack2.size());


    }

    @Test
    @DisplayName("To test that stack is empty")
    void testEmptyStack() {
        assertTrue(myStack.empty());
    }

    @Test
    @DisplayName("To test that stack is not empty when an item is added")
    void testThatStackCanPushItems() {
        myStack.push("BlackBottle");
        assertFalse(myStack.empty());
    }

    @Test
    @DisplayName("To test that empty stack throws underflow exception when popped")
    void testThatStackIsEmptyWhenPushedToZero() {
        myStack.push("BlackBottle");
        myStack.pop();
        assertTrue(myStack.empty());
    }

    @Test
    @DisplayName("To test that when push item to stack size increment")
    void testThatSizeIncrementsWhenPushed(){
        myStack.push("BlackBottle");
        myStack.push("GreenBottle");
        assertEquals(myStack.size(), 2);
    }

    @Test
    @DisplayName("To test that stack can push x and be pop y")
    void testThatStackCanPopItem() {
        myStack.push("drugs");
        myStack.push("BlackBottle");
        myStack.push("Water");
        myStack.pop();
        assertEquals(2, myStack.size());
    }

    @Test
    @DisplayName("To test that stack can peek item correctly")
    void tesThatStackCanPeekItem() {
        myStack.push("BlackBottle");
        myStack.push("BlackRemote");
        assertEquals("BlackRemote",  myStack.peek());
    }

    @Test
    @DisplayName("To test that we can search item pushed to stack")
    void testThatWeCanSearchItem() {
        myStack.push("BlackBottle");
        myStack.push("BlackRemote");
        myStack.push("Bag");
        assertEquals(1, myStack.search("BlackRemote"));
    }
}