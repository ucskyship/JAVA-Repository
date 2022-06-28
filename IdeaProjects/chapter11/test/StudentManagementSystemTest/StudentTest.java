package StudentManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student myStudent;

    @BeforeEach
    void setUp() {
        myStudent = new Student("Grace");
    }

    @Test
    void thatACourseCanBeSelected() {
        Course math = new Course("math", "math001");
        Course english = new Course("English", "Eng101");
        myStudent.selectCourse(math);
        myStudent.selectCourse(english);
        assertEquals(2, myStudent.getEnrolledCourses().size());
    }

    @Test
    void testThatACourseCanBeViewed() {
        Course courseOne = new Course("Java", "Java101");
        myStudent.selectCourse(courseOne);
        Course result = myStudent.viewCourse("Java", "Java101");
        assertEquals(courseOne, result);
        Course courseTwo = new Course("Python", "Py101");
        myStudent.selectCourse(courseTwo);
        Course resultTwo = myStudent.viewCourse("Python", "Py101");
        assertEquals(courseTwo, resultTwo);
    }

    @Test
    void testThatACourseCanBeViewedTwo() {
        assertThrows(IllegalArgumentException.class,
                ()-> myStudent.viewCourse("Physics", "Phy101"));
    }

    @Test
    void testThatACourseCanBeDropped() {
    Course courseOne = new Course("Java", "Java101");
    myStudent.selectCourse(courseOne);
    myStudent.dropCourse("Java", "Java101");
    assertEquals(0, myStudent.getEnrolledCourses().size());
    }
}