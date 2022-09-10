package school.management.system;

/*
    This class is responsible for keeping the track of teacher's name, id, salary.
 */

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     *      - Create a new Teacher object.
     *
     * @param id - id for the teacher.
     * @param name - name of the teacher.
     * @param salary - salary of the teacher.
     */

    // constructor

    public Teacher(int id, String name, int salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;

    }

    // getters - return the values of our variables (id, name, salary)

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    // setters only for values which can change in the future

    /**
     * Set the salary.
     * @param salary
     */

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Adds to salaryEarned.
     * Remove from the total money earned by the school.
     * @param salary
     */
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }


}
