public class CenterStaff implements IDiscount{
    @Override
    public void applyDiscount() {
        System.out.println("Center Staff service visit costs $" + BASE_PRICE * 0.5);
    }
}
