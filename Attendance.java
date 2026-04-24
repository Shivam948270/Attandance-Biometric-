
package BioApp;

public class Attendance {
    private String userId;
    private String punchTime;
    private int status;

    public Attendance(String userId, String punchTime, int status) {
        this.userId = userId;
        this.punchTime = punchTime;
        this.status = status;
    }

    public String getUserId() { return userId; }
    public String getPunchTime() { return punchTime; }
    public int getStatus() { return status; }
}