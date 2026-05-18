
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CrimeManager manager = new CrimeManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Crime Report Management System ===");
            System.out.println("1. Add crime report");
            System.out.println("2. View all crime reports");
            System.out.println("3. Search report by ID");
            System.out.println("4. Update case status");
            System.out.println("5. Delete report");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int option;
            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (option) {
                case 1:
                    System.out.print("Enter case title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter case description: ");
                    String description = scanner.nextLine();
                    System.out.print("Officer name: ");
                    String officerName = scanner.nextLine();
                    System.out.print("Officer badge number: ");
                    String badgeNumber = scanner.nextLine();
                    System.out.print("Officer station name: ");
                    String stationName = scanner.nextLine();

                    Person officer = new PoliceOfficer(officerName, badgeNumber, stationName);
                    manager.addReport(title, description, officer);
                    System.out.println("Crime report added successfully.");
                    break;

                case 2:
                    manager.viewAllReports();
                    break;

                case 3:
                    System.out.print("Enter report ID to search: ");
                    int searchId = Integer.parseInt(scanner.nextLine());
                    CrimeReport foundReport = manager.searchReportById(searchId);
                    if (foundReport != null) {
                        System.out.println("Report found:\n" + foundReport);
                        System.out.println("Reporting officer role: " + foundReport.getReportingOfficer().getRole());
                    } else {
                        System.out.println("Report not found with ID " + searchId + ".");
                    }
                    break;

                case 4:
                    System.out.print("Enter report ID to update: ");
                    int updateId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter new status (Solved/Pending): ");
                    String newStatus = scanner.nextLine();
                    boolean updated = manager.updateStatus(updateId, newStatus);
                    if (updated) {
                        System.out.println("Case status updated successfully.");
                    } else {
                        System.out.println("Failed to update status. Report ID " + updateId + " not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter report ID to delete: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    boolean deleted = manager.deleteReport(deleteId);
                    if (deleted) {
                        System.out.println("Crime report deleted successfully.");
                    } else {
                        System.out.println("Failed to delete. Report ID " + deleteId + " not found.");
                    }
                    break;

                case 6:
                    running = false;
                    System.out.println("Exiting Crime Report Management System. Goodbye!");
                    break;

                default:
                    System.out.println("Please choose a valid option from 1 to 6.");
            }
        }

        scanner.close();
    }
}
