package school.management.system;

import java.util.List;

/**
 * Many teachers, many students
 * Implements teachers & students using an ArrayList
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * New school object is created
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * 
     * @return list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school
     * @param teacher to be added
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to the list
     * @param student to be added
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     *
     * @return Total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school
     * @param moneyEarned money that is supposed to be added
     */
    public void updateTotalMoneyEarned(int moneyEarned) {
        this.totalMoneyEarned += moneyEarned;
    }

    /**
     *
     * @return total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Update money that is spent by the school, which is the salary to teachers
     * @param moneySpent money spent in salaries
     */
    public void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
