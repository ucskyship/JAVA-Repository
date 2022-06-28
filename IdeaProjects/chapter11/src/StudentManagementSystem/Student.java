package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Objects;

public class Student {

    private final ArrayList<Course> enrolledCourses = new ArrayList<>();
    private static int idNumber = 1;
    private int id;
    private final String name;

    public ArrayList<Course> getEnrolledCourses() {
        return enrolledCourses;
    }


    public Student(String name) {
        this.name = name;
        this.id = idNumber;
        idNumber++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void selectCourse(Course course) {
        enrolledCourses.add(course);
    }

    public Course viewCourse(String courseName, String courseCode) {
        for (Course course : enrolledCourses) {
            if (Objects.equals(course.getCourseName(), courseName) && Objects.equals(course.getCourseCode(), courseCode)) {
                return course;
            }
        }
        throw new IllegalArgumentException(courseName + " " + courseCode + " does not exist!");
    }

    public void dropCourse(String courseName, String courseCode) {
        for (Course course : enrolledCourses) {
            if (Objects.equals(course.getCourseName(), courseName) && Objects.equals(course.getCourseCode(), courseCode)) {
                enrolledCourses.remove(course);
                System.out.println(courseName + " " + courseCode + " has been removed!");
                return;
            }
        }
        throw new IllegalArgumentException(courseName + courseCode + " does not exist!");
    }

    @Override
    public String toString() {
        return String.format("""
                Student Name: %s
                Student Id: %d
                """, getName(), getId());
    }
}
