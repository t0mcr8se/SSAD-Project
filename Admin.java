public class Admin extends Person {
    private Company company;

    Admin(String username, String password, int age, String firstName, String surName, int companyId) {
        super(username, password, true, age, firstName, surName);
        this.company = new Company(companyId);
    }

    /**
     * this method is used to edit the company information
     *
     * @param info
     */
    void changeCompanyInfo(String info) {
        System.out.println("Changing info");
    }

    /**
     * this method is used to manage the leave status for employees
     */
    void leaveManagement() {
        System.out.println("Managing leave status");
    }

    /**
     * this method is used to change the salary for employees
     */
    void changePayment() {
        System.out.println("Changing payment");
    }

    /**
     * this method is used to add an employee to the database
     *
     * @param username
     * @param password
     */
    void addEmployee(String username, String password) {
        System.out.println("Adding employee to database");
    }

    /**
     * this method is used to add information for an employee
     *
     * @param id
     */
    void addEmployeeDetails(int id) {
        System.out.println("Adding details of employee");
    }
}
