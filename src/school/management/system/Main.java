package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher maria = new Teacher(1, "Maria", 1500);
        Teacher martha = new Teacher(2, "Martha", 1700);
        Teacher john = new Teacher(3, "John", 1600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(maria);
        teacherList.add(martha);
        teacherList.add(john);

        Student alex = new Student(1, "Alex", 4);
        Student vanessa = new Student(2, "Vanessa", 7);
        Student jessica = new Student(3, "Jessica", 3);

        List<Student> studentList = new ArrayList<>();

        studentList.add(alex);
        studentList.add(vanessa);
        studentList.add(jessica);

        School rvs = new School(teacherList, studentList);

        Teacher megan = new Teacher(6, "Megan", 1800);
        rvs.addTeacher(megan);

        alex.payFees(5000);
        System.out.println("rvs has earned: $" + rvs.getTotalMoneyEarned());
        vanessa.payFees(2000);
        System.out.println("rvs has earned: $" + rvs.getTotalMoneyEarned());

        System.out.println("-----MAKING SCHOOL PAY SALARY------");
        maria.receiveSalary(maria.getSalary());
        System.out.println("rvs has spent for salary to " + maria.getName() + " and now has $" + rvs.getTotalMoneyEarned());

        System.out.println(alex);

        john.receiveSalary(john.getSalary());
        System.out.println(john);
    }
}
