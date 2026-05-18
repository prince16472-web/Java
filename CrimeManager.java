
import java.util.ArrayList;
import java.util.List;

public class CrimeManager {

    private final List<CrimeReport> reports = new ArrayList<>();
    private int nextReportId = 1;

    public void addReport(String title, String description, Person reportingOfficer) {
        int id = generateReportId();
        CrimeReport report = new CrimeReport(id, title, description, "Pending", reportingOfficer);
        reports.add(report);
    }

    public void viewAllReports() {
        if (reports.isEmpty()) {
            System.out.println("No crime reports have been added yet.");
            return;
        }

        System.out.println("\nAll Crime Reports:");
        for (CrimeReport report : reports) {
            System.out.println(report);
        }
    }

    public CrimeReport searchReportById(int id) {
        for (CrimeReport report : reports) {
            if (report.getId() == id) {
                return report;
            }
        }
        return null;
    }

    public boolean updateStatus(int id, String status) {
        CrimeReport report = searchReportById(id);
        if (report != null) {
            report.setStatus(status);
            return true;
        }
        return false;
    }

    public boolean deleteReport(int id) {
        CrimeReport report = searchReportById(id);
        if (report != null) {
            reports.remove(report);
            return true;
        }
        return false;
    }

    private int generateReportId() {
        return nextReportId++;
    }
}
