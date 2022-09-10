package school.management.system;

/*
    This class is responsible for keeping the track of students fees, name, grade and fees paid.
 */

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

// --------------------------------------- CONSTRUCTOR --------------------------------------- //


/*
    - creating a constructor
    - The role of constructor is to create a new student object by initializing the values.
    - id - id for the student: unique value.
    - name - name of the student.
    - grade - grade of the student
 */

    /**
     *     - creating a constructor
     *     - The role of constructor is to create a new student object by initializing the values.
     *     - Fees for every student is $30,000.
     *     - Fees paid initially (at the beginning) is 0.
     *
     * @param id id - id for the student: unique value.
     * @param name name - name of the student.
     * @param grade grade - grade of the student
     */

    public Student(int id, String name, int grade) {

        // basic setup
        // initialize all the values

        // !!! 'this' - needed only when the variable appear more than once,
        //              but we can use 'this' in every variable, it is up to us
        // every student has to pay $30,000
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

// --------------------------------------- GETTERS --------------------------------------- //


    // getters - code -> generate ->  - automatic setters or/and getters
    // - or shortcut alt + insert
    // getters return the variables values

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

// --------------------------------------- SETTERS --------------------------------------- //

    // Not going to alter (change) student's name.
    // We don't have to do 'setters' when student's name and id won't be changed.

    // do premonition to alter the value
    // setters always 'void', getters always returning something

    /**
     *      - Used to update the student's grade.
     * @param grade new grade of the student.
     */


    public void setGrade(int grade) {
        this.grade = grade;
    }

// --------------------------------------- METHODS --------------------------------------- //


    /**
     *      - Keep adding the fees to feesPaid Field.
     *      - Add the fees to the fees paid.
     *      - The school is going to receive the funds.
     *
     * @param fees the fees that the student pays.
     */

    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

// --------------------------------------- * * * * --------------------------------------- //











}
