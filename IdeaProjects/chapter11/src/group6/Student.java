package group6;

import java.util.List;

public class Student {
    private List<Course> coursesOffered;
    private String studentName;
    private int studentId;
    private static int id = 1000;

    public Student(String NameOfStudent){
        this.studentName = NameOfStudent;
        studentId = ++id;
    }

    public String getStudentName(){
        return studentName;
    }

    public int getStudentId(){
        return studentId;
    }

    @Override
    public String toString() {
        return String.format("""
                course id: %d
                course name: %s
                """, getStudentId(), getStudentName());
    }
}
