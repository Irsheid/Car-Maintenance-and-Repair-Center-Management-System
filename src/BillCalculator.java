public class BillCalculator implements IBillCalculator{
    @Override
    public void calculateBill(int idNumber) {
        for (Customer customer : registeredCustomers) {
            if (customer.getIdNumber() == idNumber) {
                System.out.println("Customer with ID number: " + customer.getIdNumber());
                customer.getDiscountStrategy().applyDiscount();
                return;
            }
        }
        System.out.println("Customer with ID " + idNumber + " not found.");
    }
}
