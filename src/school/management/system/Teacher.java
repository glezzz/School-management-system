package school.management.system;

/**
 * This class is responsible for keeping track of thacher's name, id and salary
 */

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new Teacher object
     * @param id id for teacher
     * @param name name of teacher
     * @param salary salary of teacher
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     * @return id for current teacher
     */
    public int getId() {
        return id;
    }

    /**
     * @return name of teacher
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return salary of teacher
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Set the salary
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Adds to salary
     * Removes from school total money earned
     * @param salary
     */
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher's name: " + name + "\n" +
                "Total salary earned so far $" + salaryEarned;
    }
}
