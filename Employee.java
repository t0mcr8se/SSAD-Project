import java.util.ArrayList;

public class Employee extends Person {
    protected boolean isOnLeave;
    protected double salary;

    Employee(String username, String password, int age, String firstName, String surName) {
        super(username, password, false, age, firstName, surName);
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
     * @return a list of 365 booleans that state if the ith day of the year is a holiday or not
     */
    ArrayList<Boolean> checkHoliday() {
        ArrayList<Boolean> holidays = new ArrayList<Boolean>();
        return holidays;
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
        System.out.println("Deleting person from database");
    }

}
