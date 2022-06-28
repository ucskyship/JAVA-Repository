package group6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    Course course;

    @BeforeEach
    void setUp() {
        course = new Course("Java");
    }

    @Test
    void testThatCourseHasBeenCreated(){
        assertNotNull(course);
    }


//    @Test
//    void testThatCourseCanBeAddedToList() {
//        course.addCourse("Python");
//        assertEquals("Python", course.getCourse().get(0));
//        course.addCourse("DataBase");
//        assertEquals("DataBase", course.getCourse().get(1));
//        course.addCourse("javaScript");
//        assertEquals("javaScript", course.getCourse().get(2));
//    }

}