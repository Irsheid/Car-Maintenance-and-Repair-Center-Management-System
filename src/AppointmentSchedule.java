public class AppointmentSchedule implements IScheduleAppointment, ICustomerList{

    private int maxAppointments = 9;

    @Override
    public void scheduleSameDayAppointment(int idNumber) {

        if (scheduledAppointments.size() >= maxAppointments) {
            System.out.println("No more available slots for today.");
            return;
        }

        for (Customer customer : registeredCustomers) {
            if (customer.getIdNumber() == idNumber) {
                int nextSlot = 9 + scheduledAppointments.size();
                Appointment appointment = new Appointment(nextSlot, customer);
                scheduledAppointments.add(appointment);
                //System.out.println("Appointment scheduled for " + customer.getFullName() + " at " + nextSlot + ":00");
                return;
            }
        }

        System.out.println("Customer with ID " + idNumber + " not found.");
    }
}

