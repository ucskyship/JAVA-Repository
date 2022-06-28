package StudentManagementSystemTest;

import StudentManagementSystem.Course;
import StudentManagementSystem.School;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    School mySchool;

    @BeforeEach
    void setUp() {
        mySchool = new School();
    }


    @Test
    void getAllCourses() {
        mySchool.addCourse("Java", "Java301");
        mySchool.addCourse("Python", "Py101");
        mySchool.addCourse("Sex Education", "SexEd101");
        assertEquals(3, mySchool.getCourses().size());
    }

    @Test
    void addCourse() {
        mySchool.addCourse("Java", "Java301");
        Course result = mySchool.getCourse("Java301", "Java");
        assertNotNull(result);
    }

    @Test
    void addCourseTwo() {
        mySchool.addCourse("Java", "Java301");
        assertThrows(IllegalArgumentException.class,
                () -> mySchool.getCourse("test", "test101"));
    }

    @Test
    void deleteCourse() {
        mySchool.addCourse("Java", "Java301");
        mySchool.removeCourse("Java");
        assertEquals(0, mySchool.getCourses().size());
    }

    @Test
    void deleteCourseTwo() {
        assertThrows(IllegalArgumentException.class,
                () -> mySchool.removeCourse("Java"));
    }

    @Test
    void getAllStudents() {
        mySchool.addStudents("Chibobo");
        mySchool.addStudents("My Priest");
        mySchool.addStudents("Tunde The Fool");
        mySchool.addStudents("Dorcas My Love");
        assertEquals(4, mySchool.getStudents().size());
    }

    @Test
    void addStudent() {
        mySchool.addStudents("Grace");
        assertEquals(1, mySchool.getStudents().size());
    }

    @Test
    void addStudentTwo() {
        mySchool.addStudents("Grace");
        assertThrows(IllegalArgumentException.class,
                () -> mySchool.getStudent(5));
    }

    @Test
    void deleteStudent() {
        mySchool.addStudents("Grace");
        mySchool.deleteStudent(1);
        assertEquals(0, mySchool.getStudents().size());
    }

    @Test
    void deleteStudentTwo() {
        assertThrows(IllegalArgumentException.class,
                () -> mySchool.deleteStudent(1));
    }
}