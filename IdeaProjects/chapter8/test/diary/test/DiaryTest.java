package diary.test;

import diary.Diary;
import diary.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class DiaryTest {

    Diary myDiary;
    Entry myEntry;

    @BeforeEach
    void setUp(){
        myDiary = new Diary();
        myEntry = new Entry("1212","firstTitle", "HowAreYouDoing");
    }

    @Test
    void testThatDiaryHasEmptyEntryWhenCreated(){
        assertTrue(myDiary.hasEmptyEntry());
    }

    @Test
    void testThatWhenDiaryAddAnEntry_diaryNotEmpty(){
        myDiary.addAnEntry(myEntry);
        assertTrue(myDiary.hasEmptyEntry());
    }

    @Test
    void testThatDiaryCanGetSingleEntry(){

    }

    @Test
    void testThatADiaryCanGetAllEntry(){

    }

    @Test
    void testThatEntryCanBeDeletedFromDiary(){

    }
}
