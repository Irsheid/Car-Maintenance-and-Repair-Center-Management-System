public class ServiceReportManager implements IServiceReport, IAppointmentList {
    @Override
    public void addServiceReport(int appointmentTime, String repairsPerformed, String partsUsed) {
        for (Appointment appointment : scheduledAppointments) {
            if (appointment.getAppointmentTime() == appointmentTime) {
                ServiceReport serviceReport = new ServiceReport(appointment, repairsPerformed, partsUsed);
                serviceReports.add(serviceReport);
                return;
            }
        }
        System.out.println("No appointment found at " + appointmentTime + ":00");
    }
}