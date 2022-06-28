package diary.test;

import diary.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EntryTest {
//    private LocalDateTime = new LocalDate.now();
    Entry entry, entry1;

    @BeforeEach
    void setUp() {
        entry = new Entry("testTittle", "testBody");
        entry1 = new Entry("121", "me", "iam doing well");
    }

    @Test
    void testThatEntryCanCanSetTittleAndBody(){
        assertEquals("testTittle", entry.getTittle());
        assertEquals("testBody", entry.getBody());

        assertEquals("me", entry1.getTittle());
        assertEquals("iam doing well", entry1.getBody());
        assertEquals("121", entry1.getId());
    }

    @Test
    void testThatAnEntryHaveSpecificNumberOfPages(){

    }
}