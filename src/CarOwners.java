public class CarOwners implements IDiscount {
    @Override
    public void applyDiscount() {
        System.out.println("Car Owners service visit costs $" + BASE_PRICE);
    }
}
