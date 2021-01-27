package school.management.system;

/**
 * This class is responsible for keeping track of thacher's name, id and salary
 */

public class Teacher {
    private int id;
    private String name;
    private int salary;

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
}
