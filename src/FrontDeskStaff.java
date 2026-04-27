public class FrontDeskStaff {

    private ICustomerRegistry customerRegistry;
    private IScheduleAppointment scheduleAppointment;
    private IDailyAppointment dailyAppointment;
    private IBillCalculator billCalculator;

    public FrontDeskStaff() {
        this.customerRegistry = new CustomerRegistry();
        this.scheduleAppointment = new AppointmentSchedule();
        this.dailyAppointment = new DailyAppointment();
        this.billCalculator = new BillCalculator();
    }

    public void registerCustomers(String fullName, String address, int idNumber, String contactNumber, String maker, String model, String plateNumber, IDiscount discount) {
            customerRegistry.registerCustomer(fullName, address, idNumber, contactNumber, maker, model, plateNumber,discount);
        }

        public void scheduleSameDayAppointment(int idNumber) {
            scheduleAppointment.scheduleSameDayAppointment(idNumber);
        }

        public void calculateBill(int idNumber) {
            billCalculator.calculateBill(idNumber);
        }

        public void printDailyAppointment() {
           dailyAppointment.printDailyAppointment();
        }
    }


