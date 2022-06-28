package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Objects;

public class School {
    private final ArrayList<Course> courses = new ArrayList<>();
    private final ArrayList<Student> students = new ArrayList<>();


    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addCourse(String courseName, String courseCode) {
        Course myCourse = new Course(courseName, courseCode);
        courses.add(myCourse);
    }

    public void removeCourse(String courseName) {
        for (Course course : courses) {
            if (Objects.equals(course.getCourseName(), courseName)) {
                courses.remove(course);
                System.out.println(courseName + " has been successfully deleted!");
                return;
            }
        }
        throw new IllegalArgumentException(courseName + " does not exist!");

    }

    public Course getCourse(String courseCode, String courseName) {
        for (Course course : courses) {
            if (course.getCourseCode().equals(courseCode) && course.getCourseName().equals(courseName))
                return course;
        }
        throw new IllegalArgumentException("course with " + courseCode + courseName + " is not found!");
    }

    public void addStudents(String name) {
        Student myStudent = new Student(name);
        students.add(myStudent);
    }

    public Student getStudent(int Id) {
        for (Student student : students) {
            if (student.getId() == Id) {
                return student;
            }
        }
        throw new IllegalArgumentException(Id + " does not exist!");
    }

    public void deleteStudent(int Id) {
        for (Student student : students) {
            if (student.getId() == Id) {
                students.remove(student);
                System.out.println("Student with Id number " + student.getId() + " and name : " + student.getName() + "" +
                        " has been deleted!");
                return;
            }
        }
        throw new IllegalArgumentException("Student does not exist!");
    }

    public int getNumberOfStudentsOfferingACourse(String courseCode) {
        int number = 0;
        for (Student student : students) {
            ArrayList<Course> courses = student.getEnrolledCourses();
            for (Course course : courses) {
                if (course.getCourseCode().equalsIgnoreCase(courseCode)) {
                    number++;
                }
            }
        }
        return number;
    }
}





