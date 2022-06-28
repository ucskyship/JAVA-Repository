package group6;

public class Course {

    private final String courseName;
    private final int courseId;
    private static int id = 100;

    public Course(String courseName){
        courseId = ++id;
        this.courseName = courseName;
    }


    public int getCourseId() {
        return courseId;
    }

    public String getCourseName(){
        return courseName;
    }

    @Override
    public String toString() {
        return String.format("""
                course id: %d
                course name: %s
                """, getCourseId(), getCourseName());
    }
}
