import java.util.ArrayList;

public class Main {
    public static void main(){
        Company company = new Company("Innopolis", "Succi");
        Admin admin = new Admin("admin", "admin", 18, "Smith", "Smith", company.getId());

        admin.changeCompanyInfo("Good company yes");
        admin.leaveManagement();
        admin.changePayment();

        Employee mosab = new Employee("mosab", "mosab", 16, "Mosab", "Mohammad");
        Employee ilya = new Employee("ilya", "pas$word", 21, "Ilya", "Mirzazhanov");

        double mosabSalary = mosab.checkSalary();
        ArrayList<Boolean> ilyaIsOnHoliday = ilya.checkHoliday();

        mosab.resign(); // Because his salary is too low

    }
}
