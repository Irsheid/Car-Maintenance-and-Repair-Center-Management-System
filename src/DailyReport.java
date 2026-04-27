import java.io.FileWriter;
import java.io.IOException;

public class DailyReport implements IDailyReport, IAppointmentList, IServiceReportList, IDiagnosticReportList{

    public void generateDailyReport() {

        try (FileWriter writer = new FileWriter("DailyReport.txt")) {
            writer.write("=== DAILY REPORT ===\n\n");

            writer.write("Scheduled Appointments:\n");
            for (Appointment appointment : scheduledAppointments) {
                writer.write(appointment.toString() + "\n");
            }

            writer.write("\nService Reports:\n");
            for (ServiceReport report : serviceReports) {
                writer.write(report.toString() + "\n");
            }

            writer.write("\nDiagnostic Reports:\n");
            for (DiagnosticReport report : diagnosticReports) {
                writer.write(report.toString() + "\n");
            }

            System.out.println("Daily report generated successfully: DailyReport.txt");

        } catch (IOException e) {
            System.out.println("Error generating daily report: " + e.getMessage());
        }
    }

}

