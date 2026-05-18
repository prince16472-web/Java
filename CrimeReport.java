
public class CrimeReport {

    private int id;
    private String caseTitle;
    private String description;
    private String status;
    private Person reportingOfficer;

    public CrimeReport(int id, String caseTitle, String description, String status, Person reportingOfficer) {
        this.id = id;
        this.caseTitle = caseTitle;
        this.description = description;
        this.status = status;
        this.reportingOfficer = reportingOfficer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaseTitle() {
        return caseTitle;
    }

    public void setCaseTitle(String caseTitle) {
        this.caseTitle = caseTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Person getReportingOfficer() {
        return reportingOfficer;
    }

    public void setReportingOfficer(Person reportingOfficer) {
        this.reportingOfficer = reportingOfficer;
    }

    @Override
    public String toString() {
        return "Report ID: " + id + "\n"
                + "Title: " + caseTitle + "\n"
                + "Description: " + description + "\n"
                + "Status: " + status + "\n"
                + "Officer: " + reportingOfficer.getName() + " (" + reportingOfficer.getBadgeNumber() + ")\n"
                + "Station: " + ((PoliceOfficer) reportingOfficer).getStationName() + "\n";
    }
}
