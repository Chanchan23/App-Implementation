import java.util.List;
import java.util.ArrayList;

public class Portal {
    private int portalID;
    private List<Admin> admins;
    private List<Employee> employees;

    public Portal(int portalID) {
        this.portalID = portalID;
        this.admins = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public void addAdmin(Admin admin) {
        admins.add(admin);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void login(int userID, String password) {
        // Implementation code
    }

    public void logout(int userID) {
        // Implementation code
    }
}
