package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class SMSDriverClass {
    static School school;
    static Student student;

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        school = new School();
        autoGenerateStudentsAndCourse();
        int sentinel = 0;
        while (sentinel != -1) {
            System.out.println("""
                    1. Admin
                    2. Student
                    0. end
                    """);
            int userInput = input.nextInt();
            switch (userInput) {
                case 1 -> {
                    adminPage();
                }
                case 2 -> {
                    studentPage();
                }
                case 0 -> sentinel = -1;
                default -> main(args);
            }
        }

    }

    private static void studentPage() {
        int sentinel = 0;
        while (sentinel != -1) {
            System.out.println("""
                    1. Select a course
                    2. View a course
                    3. Drop a course
                    0. Quit
                    """);
            int userInput = input.nextInt();
            switch (userInput) {
                case 1 -> courseList();
                case 2 -> {
                    System.out.println("Enter course name and course code: ");
                    String userResponse = input.next();
                    String userResponseTwo = input.next();
                    student.viewCourse(userResponse, userResponseTwo);
                }
                case 3 -> {
                    System.out.println("Enter course name and course code here: ");
                    String userResponse = input.next();
                    String userResponseTwo = input.next();
                    student.dropCourse(userResponse, userResponseTwo);
                }
                case 0 -> sentinel = -1;
            }
        }
    }


    private static void adminPage() {
        int sentinel = 0;
        while (sentinel != -1) {
            System.out.println("""
                    1. Admit student
                    2. Add courses
                    3. Remove Student
                    4. Remove Course
                    5. View all Courses
                    6. View all students
                    0. Exit
                    """);
            int userInput = input.nextInt();
            switch (userInput) {
                case 1 -> {
                    System.out.println("Enter student name: ");
                    String name = input.next();
                    school.addStudents(name);
                }
                case 2 -> {
                    System.out.println("Enter name of course and course code here: ");
                    String courseName = input.next();
                    String courseCode = input.next();
                    school.addCourse(courseName, courseCode);
                }
                case 3 -> {
                    System.out.println("Enter student Id here: ");
                    int studentId = input.nextInt();
                    school.deleteStudent(studentId);
                }
                case 4 -> {
                    System.out.println("Enter course name here: ");
                    String courseName = input.next();
                    school.removeCourse(courseName);
                }
                case 5 -> {
                    ArrayList<Course> myCourse = school.getCourses();
                    for (Course course : myCourse) {
                        System.out.println(course);
                    }
                }
                case 6 -> {
                    ArrayList<Student> myStudent = school.getStudents();
                    for (Student student : myStudent) {
                        System.out.println(student);
                    }
                }
                case 0 -> sentinel = -1;
            }

        }


    }

    private static void autoGenerateStudentsAndCourse() {
        String[] names = {"John", "Ife", "Boyo", "Eden", "Kiki"};
        for (String name : names) {
            school.addStudents(name);
        }
        String[] courses = {"Math", "English", "Geography", "Literature", "Physics"};
        for (int index = 0; index < courses.length; index++) {
            school.addCourse(courses[index], String.valueOf(index + 1));

        }
        for (int index = 0; index < courses.length; index++) {
            Student student = new Student(names[index]);
            Course course = new Course(courses[index], String.valueOf(index));
            student.selectCourse(course);
        }
    }

    public static void courseList() {
        ArrayList<Course> courseList = school.getCourses();
        System.out.println("Choose a course code from the list below: ");

        for (Course course : courseList) {
            System.out.println(course);
        }
        int userInput = input.nextInt();
        for (Course course : courseList) {
            if (Objects.equals(course.getCourseCode(), String.valueOf(userInput))) {
                student.selectCourse(course);
                System.out.println("Successful!");
            }
        }
    }
}
