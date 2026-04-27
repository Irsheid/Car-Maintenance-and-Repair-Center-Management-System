public interface ICustomerRegistry extends ICustomerList{
    void registerCustomer(String fullName, String address, int idNumber, String contactNumber, String maker, String model, String plateNumber, IDiscount discount);
}
