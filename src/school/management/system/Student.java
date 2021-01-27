package school.management.system;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * @param id for the student: unique
     * @param name name of the student
     * @param grade grade of the student
     * Fees for every student is $30,000
     * Fees paid initially is 0
     */
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        feesPaid = 0;
        feesTotal = 30000;
    }

    /**
     * Used to update student's grade
     * @param grade new grade of student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Add the fees to fees paid
     * Keep adding the fees to feesPaid field
     * School is going to receive the funds
     * @param fees fees that student pays
     */
    public void payFees(int fees) {
        this.feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return id of student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return grade of student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return total fees of the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees
     */
    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: " + name + "\n" + "Total fees paid so far: $" + feesPaid;
    }
}
