public class Admin extends Person{
    // TODO: maybe Company company;
    Admin(String username, String password){
        super(username, password, true);
    }

    void changeCompanyInfo(String info){}
    void leaveManagement(){}
    void changePayment(){}
    void addEmplyee(String username, String password){}
    void addEmployeeDetails(int id, Details details){}
}