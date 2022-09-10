package school.management.system;

import java.util.List;

/**
 * Many teachers, many students.
 * Implements teachers and students using an ArrayList.
 *
 */

public class School {

    // we can't create an array because in an array we have to define the amount of students and teachers
    // instead we can create an ArrayList

    private List<Teacher> teachers;
    private List<Student> students;

    private static int totalMoneyEarned;
    private static int totalMoneySpent;

// --------------------------------------- CONSTRUCTOR --------------------------------------- //

    // alt + insert -> generate - creating constructor - choose arguments

    /**
     * new school object is created.
     *
     * @param teachers list of teachers in the school.
     * @param students list of students.
     */

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

// ----------------------------------- GETTERS AND SETTERS ----------------------------------- //

    // alt + insert - getters and setters


    public List<Teacher> getTeachers() {
        return teachers;
    }
    // -------------------------------------------------------------
    // !!! CHANGE IN TEACHER SETTER
        // Adds a teacher to the school

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    // !!! CHANGE IN STUDENT SETTER
        // this method adds students to the school

    public void addStudents(Student student) {
        students.add(student);
    }

    // -------------------------------------------------------------

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school.
     * @param MoneyEarned money that is supposed to be added.
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     *
     * @return the total money spent by the school.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school which is the salary given by the school to it's teachers.
     * @param MoneySpent the money - teachers salary
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent -= moneySpent;
    }

// ----------------------------------- *************** ----------------------------------- //





}

