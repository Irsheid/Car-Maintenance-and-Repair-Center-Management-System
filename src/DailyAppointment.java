public class DailyAppointment implements IDailyAppointment{
    @Override
    public void printDailyAppointment() {
        if (scheduledAppointments.isEmpty()) {
            System.out.println("No appointments scheduled today.");
        } else {
            for (Appointment appointment : scheduledAppointments) {
                System.out.println(appointment);
            }
        }
    }
}
