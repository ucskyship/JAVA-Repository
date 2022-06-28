package StudentManagementSystem;

public class Course {

    private String courseName;
    private String courseCode;

    public Course(String nameOfCourse, String codeOfCourse) {
        courseName = nameOfCourse;
        courseCode = codeOfCourse;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    @Override
    public String toString() {
        return String.format("""
                Course name: %s
                Course Code: %s
                """,getCourseName(),getCourseCode());
    }
}
