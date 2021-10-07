public class Employee extends Person {
    protected boolean isOnLeave;
    protected double salary;

    Employee(String username, String password, boolean isAdmin, int age, String firstName, String surName) {
        super(username, password, isAdmin, age, firstName, surName);
    }
    // TODO: change the return value for all functions below

    /**
     * This method is used to show if the employee is on leave or not
     *
     * @return
     */
    boolean checkLeaveStatus() {
        return isOnLeave;
    }

    /**
     * This method is used to show the salary of the employee
     *
     * @return
     */
    double checkSalary() {
        return salary;
    }

    /**
     * This method is used to view the yearly holiday list
     *
     * @param day
     * @param month
     * @param year
     * @return
     */
    boolean checkHoliday(int day, int month, int year) {//this shouldn't have any parameters and it should return a list
        return false;
    }

    /**
     * this method is used to voice grievances
     *
     * @param report
     */
    void voiceGrievance(String report) { //this should add the grievance to the list initialized in class company
    }

    /**
     * this method is used to resign which will result in deleting the person from the database
     */
    void resign() {
    }

}
