public class Technician {

    private IDiagnosticReport diagnosticReport;
    private IDailyReport dailyReport;


    public Technician() {
        this.diagnosticReport = new DiagnosticReportManager();
        this.dailyReport = new DailyReport();
    }

    public void addDiagnosticResult(int appointmentTime, String issuesFound, String recommendedAction) {
        diagnosticReport.addDiagnosticReport(appointmentTime, issuesFound, recommendedAction);
    }

    public void generateDailyReport() {
        dailyReport.generateDailyReport();
    }
}
