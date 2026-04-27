public class CustomerRegistry implements ICustomerRegistry {
    @Override
    public void registerCustomer(String fullName, String address, int idNumber, String contactNumber, String maker, String model, String plateNumber, IDiscount discount) {
        
        Customer customer = new CustomerBuilder().withFullName(fullName).withAddress(address).withIdNumber(idNumber).withContactNumber(contactNumber).withCar(new Car(maker, model, plateNumber)).withDiscountStrategy(discount).build();

        registeredCustomers.add(customer);
    }
}