public class Employee extends Person {
    boolean isOnLeave;
    double salary;
    Employee(String username, String password, boolean isAdmin, int age, String firstName, String surName){
        super(username, password, isAdmin, age, firstName, surName);
    }
    // TODO: change the return value for all functions below
    boolean checkLeaveStatus(){ return true; }
    double checkSalary(){ return 0.0; }
    boolean checkHoliday(int day, int month, int year){ return false; }
    void voiceGrievance(String report){}
    void resign(){}

}
