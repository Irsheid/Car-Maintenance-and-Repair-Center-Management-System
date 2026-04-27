public class CustomerBuilder {

     private String fullName;
     private String address;
     private int idNumber;
     private String contactNumber;
     private Car car;
     private IDiscount discountStrategy;

    CustomerBuilder withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    CustomerBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    CustomerBuilder withIdNumber(int idNumber) {
        this.idNumber = idNumber;
        return this;
    }

    CustomerBuilder withContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }

    CustomerBuilder withCar(Car car) {
        this.car = car;
        return this;
    }

    CustomerBuilder withDiscountStrategy(IDiscount discountStrategy) {
        this.discountStrategy = discountStrategy;
        return this;
    }

    Customer build() {
         return new Customer(this);
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

}
