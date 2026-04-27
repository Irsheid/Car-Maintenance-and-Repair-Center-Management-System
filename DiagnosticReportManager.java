public class DiagnosticReportManager implements IDiagnosticReport, IAppointmentList{
    @Override
    public void addDiagnosticReport(int appointmentTime, String issueFound, String recommendedActions) {
        for (Appointment appointment : scheduledAppointments) {
            if (appointment.getAppointmentTime() == appointmentTime) {
                DiagnosticReport diagnosticReport = new DiagnosticReport(appointment, issueFound, recommendedActions);
                diagnosticReports.add(diagnosticReport);
                return;
            }
        }
        System.out.println("No appointment found at " + appointmentTime + ":00");
    }
}