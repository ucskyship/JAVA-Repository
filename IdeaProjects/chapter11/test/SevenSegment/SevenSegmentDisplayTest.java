package SevenSegment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SevenSegmentDisplayTest {
    SevenSegmentDisplay segmentDisplay;

    @BeforeEach
    void setUp() {
        segmentDisplay = new SevenSegmentDisplay(5,4);
    }

    @Test
    void testThatWeHaveAMultiDimensionalArray(){
        assertEquals(5, segmentDisplay.length()); /*get can get the length of array by the length of the row not column*/
    }

    @Test
    void testThatCanDisplayBoard(){
        segmentDisplay.display();
    }
}