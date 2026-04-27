public class FleetClients implements IDiscount{
    @Override
    public void applyDiscount() {
        System.out.println("Fleet Clients service visit costs $" + BASE_PRICE * 0.7);
    }
}
