public class ServiceReport{

    private String repairsPerformed;
    private String partsUsed;
    private Appointment appointment;

    public ServiceReport(Appointment appointment, String repairsPerformed, String partsUsed) {
        this.appointment = appointment;
        this.repairsPerformed = repairsPerformed;
        this.partsUsed = partsUsed;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public String getRepairsPerformed() {
        return repairsPerformed;
    }

    public String getPartsUsed() {
        return partsUsed;
    }


    @Override
    public String toString() {
        return "Service Report for Appointment at " + appointment.getAppointmentTime() + ":00 for customer with ID Number " + appointment.getCustomer().getIdNumber() + " and Car plat number " + appointment.getCustomer().getCar().getPlateNumber() +
                "\n    Repairs Performed: " + (repairsPerformed != null ? repairsPerformed : "None") +
                "\n    Parts Used: " + (partsUsed != null ? partsUsed : "None");
    }
}

