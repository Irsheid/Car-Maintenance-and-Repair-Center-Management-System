public class DiagnosticReport {

    private String issuesFound;
    private String recommendedActions;
    private Appointment appointment;

    public DiagnosticReport(Appointment appointment, String issuesFound, String recommendedActions) {
        this.appointment = appointment;
        this.issuesFound = issuesFound;
        this.recommendedActions = recommendedActions;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public String getIssuesFound() {
        return issuesFound;
    }

    public String getRecommendedActions() {
        return recommendedActions;
    }


    @Override
    public String toString() {
        return "Diagnostic Report for Appointment at " + appointment.getAppointmentTime() + ":00 for customer with ID Number " + appointment.getCustomer().getIdNumber() + " and Car plat number " + appointment.getCustomer().getCar().getPlateNumber() +
                "\n    Issues Found: " + (issuesFound != null ? issuesFound : "None") +
                "\n    Recommended Actions: " + (recommendedActions != null ? recommendedActions : "None");
    }
}

