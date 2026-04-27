public class Customer {

    private String fullName;
    private String address;
    private int idNumber;
    private String contactNumber;
    private Car car;
    private IDiscount discountStrategy;

    public Customer(CustomerBuilder e) {
        this.fullName = e.getFullName();
        this.address = e.getAddress();
        this.idNumber = e.getIdNumber();
        this.contactNumber = e.getContactNumber();
        this.car = e.getCar();
        this.discountStrategy = e.getDiscountStrategy();
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public Car getCar() {
        return car;
    }

    public IDiscount getDiscountStrategy() {
        return discountStrategy;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", idNumber=" + idNumber +
                ", contactNumber='" + contactNumber + '\'' +
                ", car=" + car +
                '}';
    }
}
