public class Admin extends Person {
    // TODO: maybe Company company;
    Admin(String username, String password, boolean isAdmin, int age, String firstName, String surName) {
        super(username, password, isAdmin, age, firstName, surName);
    }

    /**
     * this method is used to edit the company information
     *
     * @param info
     */
    void changeCompanyInfo(String info) { //what info does it change exactly ?
    }

    /**
     * this method is used to manage the leave status for employees
     */
    void leaveManagement() {
    }

    /**
     * this method is used to change the salary for employees
     */
    void changePayment() {
    }

    /**
     * this method is used to add an employee to the database
     *
     * @param username
     * @param password
     */
    void addEmplyee(String username, String password) {
        
    }

    /**
     * this method is used to add information for an employee
     *
     * @param id
     */
    void addEmployeeDetails(int id) { // what details exactly ?
    }
}
