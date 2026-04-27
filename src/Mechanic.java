public class Mechanic {

    private IDailyAppointment dailyAppointment;
    private IServiceReport serviceReport;

    public Mechanic() {
        this.dailyAppointment = new DailyAppointment();
        this.serviceReport = new ServiceReportManager();
    }

    public void viewAllScheduledAppointment() {
        dailyAppointment.printDailyAppointment();
    }

    public void addServiceReport(int appointment, String repairsPerformed, String partsUsed) {

        serviceReport.addServiceReport(appointment,repairsPerformed, partsUsed);

    }

}
