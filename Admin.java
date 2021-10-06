public class Admin extends Person{
    // TODO: maybe Company company;
    Admin(String username, String password, boolean isAdmin, int age, String firstName, String surName){
        super(username, password, isAdmin, age, firstName, surName);
    }

    void changeCompanyInfo(String info){}
    void leaveManagement(){}
    void changePayment(){}
    void addEmplyee(String username, String password){}
    void addEmployeeDetails(int id, Details details){}
}
