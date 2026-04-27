public class Appointment {

    private int appointmentTime;
    private Customer customer;

    public Appointment(int appointmentTime, Customer customer) {
        this.appointmentTime = appointmentTime;
        this.customer = customer;
    }

    public int getAppointmentTime() {
        return appointmentTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Appointment at " + appointmentTime + ":00 with " + customer.getFullName() + " ID Number = " + customer.getIdNumber() +
                " - Car: " + customer.getCar();
    }
}

