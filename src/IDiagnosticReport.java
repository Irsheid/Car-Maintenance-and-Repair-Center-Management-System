public interface IDiagnosticReport extends IDiagnosticReportList {
    void addDiagnosticReport(int appointment, String issueFound, String recommendedActions);
}