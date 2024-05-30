public class LeaveRequest {
    private int requestID;
    private int employeeID;
    private String startDate;
    private String endDate;
    private String typeOfLeave;
    private String status;

    public LeaveRequest(int requestID, int employeeID, String startDate, String endDate, String typeOfLeave) {
        this.requestID = requestID;
        this.employeeID = employeeID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.typeOfLeave = typeOfLeave;
        this.status = "pending"; // default status
    }

    public void approveRequest() {
        this.status = "approved";
    }

    public void denyRequest() {
        this.status = "denied";
    }
}
