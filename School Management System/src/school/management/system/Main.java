package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher john = new Teacher(3, "John", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(john);

        Student tamara = new Student(1, "Tamara", 4);
        Student fiona = new Student(2, "Fiona", 12);
        Student samantha = new Student(3, "Samantha", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamara);
        studentList.add(fiona);
        studentList.add(samantha);

        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(john);

        School pwr = new School(teacherList, studentList);
        System.out.println("PWr has earned $" + pwr.getTotalMoneyEarned());

        tamara.payFees(5000);
        samantha.payFees(6000);
        System.out.println("PWr has earned $" + pwr.getTotalMoneyEarned());

        System.out.println("----------------- PWr pays salary -----------------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("PWr has spent for salary to " + lizzy.getName() + " and now has " + pwr.getTotalMoneyEarned());

        mellisa.receiveSalary(mellisa.getSalary());
        System.out.println("PWr has spent for salary to " + lizzy.getName() + " and now has " + pwr.getTotalMoneyEarned());

    }
}