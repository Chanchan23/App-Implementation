import java.util.ArrayList;
import java.util.List;

// Admin Class
class Admin {
    private int adminID;
    private String name;
    private String email;

    public Admin(int adminID,   String name,   String email) {
        this.adminID = adminID;
        this.name = name;
        this.email = email;
    }

    public void createEmployeeAccount(String name,   String birthday,   String number,   String position,   String email) {
        System.out.println("Employee account created:   " + name);
    }

    public void modifyEmployeeSalary(int employeeID,   double newSalary) {
        System.out.println("Employee salary modified for employee ID " + employeeID + " to " + newSalary);
    }

    public void manageLeaveRequest(int requestID,   String action) {
        System.out.println("Leave request " + requestID + " has been " + action);
    }

    public void modifySalaryDeduction(int employeeID,   double newDeduction) {
        System.out.println("Salary deduction modified for employee ID " + employeeID + " to " + newDeduction);
    }

    public void uploadGovernmentForm(String formType,   byte[] formData) {
        System.out.println("Government form " + formType + " uploaded.");
    }
}

// Employee Class
class Employee {
    private int employeeID;
    private String name;
    private String position;
    private String email;

    public Employee(int employeeID,   String name,   String position,   String email) {
        this.employeeID = employeeID;
        this.name = name;
        this.position = position;
        this.email = email;
    }

    public void viewWorkHoursSummary() {
        System.out.println("Displaying work hours summary for " + name);
    }

    public void viewSalaryComputation() {
        System.out.println("Displaying salary computation for " + name);
    }

    public void viewSalaryDeductions() {
        System.out.println("Displaying salary deductions for " + name);
    }

    public void viewTaxInformation() {
        System.out.println("Displaying tax information for " + name);
    }

    public void requestLeave(String startDate,   String endDate,   String typeOfLeave) {
        System.out.println("Leave requested by " + name + " from " + startDate + " to " + endDate + " for " + typeOfLeave);
    }
}

// Portal Class
class Portal {
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
        System.out.println("Admin added:   " + admin);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added:   " + employee);
    }

    public void login(int userID,   String password) {
        System.out.println("User " + userID + " logged in.");
    }

    public void logout(int userID) {
        System.out.println("User " + userID + " logged out.");
    }
}

// LeaveRequest Class
class LeaveRequest {
    private int requestID;
    private int employeeID;
    private String startDate;
    private String endDate;
    private String typeOfLeave;
    private String status;

    public LeaveRequest(int requestID,   int employeeID,   String startDate,   String endDate,   String typeOfLeave) {
        this.requestID = requestID;
        this.employeeID = employeeID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.typeOfLeave = typeOfLeave;
        this.status = "pending"; // default status
    }

    public void approveRequest() {
        this.status = "approved";
        System.out.println("Leave request " + requestID + " approved.");
    }

    public void denyRequest() {
        this.status = "denied";
        System.out.println("Leave request " + requestID + " denied.");
    }
}

// GovernmentForm Class
class GovernmentForm {
    private int formID;
    private String formType;

    public GovernmentForm(int formID,   String formType) {
        this.formID = formID;
        this.formType = formType;
    }

    public void downloadForm() {
        System.out.println("Form " + formType + " downloaded.");
    }
}

// Main Class for Testing
public class Main {
    public static void main(String[] args) {
        Portal portal = new Portal(1);
        
        Admin admin1 = new Admin(1,   "Admin One",   "admin1@motorph.com");
        Employee employee1 = new Employee(1,   "Employee One",   "Developer",   "employee1@motorph.com");
        
        portal.addAdmin(admin1);
        portal.addEmployee(employee1);
        
        admin1.createEmployeeAccount("Employee Two",   "1990-01-01",   "1234567890",   "Tester",   "employee2@motorph.com");
        admin1.modifyEmployeeSalary(1,   50000);
        
        LeaveRequest leaveRequest1 = new LeaveRequest(1,   1,   "2024-06-01",   "2024-06-10",   "vacation");
        leaveRequest1.approveRequest();
        
        GovernmentForm form1 = new GovernmentForm(1,   "BIR Form");
        form1.downloadForm();
        
        employee1.viewWorkHoursSummary();
        employee1.viewSalaryComputation();
        employee1.viewSalaryDeductions();
        employee1.viewTaxInformation();
        employee1.requestLeave("2024-07-01",   "2024-07-10",   "sick leave");
        
        portal.login(1,   "password");
        portal.logout(1);
    }
}
