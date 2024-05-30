public class Admin {
    private int adminID;
    private String name;
    private String email;

    public Admin(int adminID, String name, String email) {
        this.adminID = adminID;
        this.name = name;
        this.email = email;
    }

    public void createEmployeeAccount(String name, String birthday, String number, String position, String email) {
        // Implementation code
    }

    public void modifyEmployeeSalary(int employeeID, double newSalary) {
        // Implementation code
    }

    public void manageLeaveRequest(int requestID, String action) {
        // Implementation code
    }

    public void modifySalaryDeduction(int employeeID, double newDeduction) {
        // Implementation code
    }

    public void uploadGovernmentForm(String formType, byte[] formData) {
        // Implementation code
    }
}
