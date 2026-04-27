import java.util.Scanner;

public class Menu {

    private final Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean exitProgram = false;

        while (!exitProgram) {
            System.out.println("=== Welcome to the Car Maintenance System ===");
            System.out.println("Who are you?");
            System.out.println("1. Front Desk Staff");
            System.out.println("2. Mechanic");
            System.out.println("3. Technician");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int roleChoice = scanner.nextInt();
            scanner.nextLine();

            switch (roleChoice) {
                case 1:
                    handleFrontDesk();
                    break;
                case 2:
                    handleMechanic();
                    break;
                case 3:
                    handleTechnician();
                    break;
                case 4:
                    exitProgram = true;
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }

    private void handleFrontDesk() {
        FrontDeskStaff staff = new FrontDeskStaff();

        while (true) {
            System.out.println("\n--- Front Desk Staff Menu ---");
            System.out.println("1. Register Customer");
            System.out.println("2. Schedule Appointment");
            System.out.println("3. Calculate Bill");
            System.out.println("4. Print Daily Appointments");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Full Name: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Address: ");
                    String address = scanner.nextLine();
                    System.out.print("ID Number: ");
                    int idNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Contact Number: ");
                    String contact = scanner.nextLine();
                    System.out.print("Car Maker: ");
                    String maker = scanner.nextLine();
                    System.out.print("Car Model: ");
                    String model = scanner.nextLine();
                    System.out.print("Plate Number: ");
                    String plate = scanner.nextLine();

                    System.out.println("Select Customer Type:");
                    System.out.println("1. Car Owner");
                    System.out.println("2. Center Staff");
                    System.out.println("3. Fleet Client");
                    int discountChoice = scanner.nextInt();
                    scanner.nextLine();

                    IDiscount discount;
                    if (discountChoice == 2) {
                        discount = new CenterStaff();
                    } else if (discountChoice == 3) {
                        discount = new FleetClients();
                    } else {
                        discount = new CarOwners();
                    }

                    staff.registerCustomers(fullName, address, idNumber, contact, maker, model, plate, discount);
                    break;

                case 2:
                    System.out.print("Enter Customer ID: ");
                    int scheduleId = scanner.nextInt();
                    scanner.nextLine();
                    staff.scheduleSameDayAppointment(scheduleId);
                    break;

                case 3:
                    System.out.print("Enter Customer ID: ");
                    int billId = scanner.nextInt();
                    scanner.nextLine();
                    staff.calculateBill(billId);
                    break;

                case 4:
                    staff.printDailyAppointment();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void handleMechanic() {
        Mechanic mechanic = new Mechanic();

        while (true) {
            System.out.println("\n--- Mechanic Menu ---");
            System.out.println("1. View Scheduled Appointments");
            System.out.println("2. Add Service Report");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    mechanic.viewAllScheduledAppointment();
                    break;

                case 2:
                    System.out.print("Enter Appointment Time (09:00 - 17:00): ");
                    int time = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Repairs Performed: ");
                    String repairs = scanner.nextLine();
                    System.out.print("Parts Used: ");
                    String parts = scanner.nextLine();
                    mechanic.addServiceReport(time, repairs, parts);
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void handleTechnician() {
        Technician technician = new Technician();

        while (true) {
            System.out.println("\n--- Technician Menu ---");
            System.out.println("1. Add Diagnostic Report");
            System.out.println("2. Generate Daily Report");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Appointment Time (09:00 - 17:00): ");
                    int time = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Issues Found: ");
                    String issues = scanner.nextLine();
                    System.out.print("Recommended Actions: ");
                    String actions = scanner.nextLine();
                    technician.addDiagnosticResult(time, issues, actions);
                    break;

                case 2:
                    technician.generateDailyReport();
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }



}

