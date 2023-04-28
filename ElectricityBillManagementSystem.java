import java.util.Scanner;

public class ElectricityBillManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Electricity Bill Management System!");

        
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter customer type (residential or commercial): ");
        String customerType = scanner.next();
        System.out.print("Enter previous meter reading: ");
        double previousReading = scanner.nextDouble();
        System.out.print("Enter current meter reading: ");
        double currentReading = scanner.nextDouble();

       
        double unitsUsed = currentReading - previousReading;


        double billAmount;
        if (customerType.equalsIgnoreCase("residential")) {
            billAmount = calculateResidentialBill(unitsUsed);
        } else if (customerType.equalsIgnoreCase("commercial")) {
            billAmount = calculateCommercialBill(unitsUsed);
        } else {
            System.out.println("Invalid customer type entered.");
            return;
        }

        
        System.out.println("Customer name: " + name);
        System.out.println("Customer ID: " + id);
        System.out.println("Customer type: " + customerType);
        System.out.println("Units used: " + unitsUsed);
        System.out.println("Bill amount: " + billAmount);
    }

    public static double calculateResidentialBill(double unitsUsed) {
        double billAmount;
        if (unitsUsed <= 100) {
            billAmount = unitsUsed * 1.50;
        } else if (unitsUsed <= 200) {
            billAmount = 100 * 1.50 + (unitsUsed - 100) * 2.00;
        } else if (unitsUsed <= 500) {
            billAmount = 100 * 1.50 + 100 * 2.00 + (unitsUsed - 200) * 3.00;
        } else {
            billAmount = 100 * 1.50 + 100 * 2.00 + 300 * 3.00 + (unitsUsed - 500) * 4.50;
        }
        return billAmount;
    }

    public static double calculateCommercialBill(double unitsUsed) {
        double billAmount;
        if (unitsUsed <= 100) {
            billAmount = unitsUsed * 2.50;
        } else if (unitsUsed <= 200) {
            billAmount = 100 * 2.50 + (unitsUsed - 100) * 4.00;
        } else if (unitsUsed <= 500) {
            billAmount = 100 * 2.50 + 100 * 4.00 + (unitsUsed - 200) * 5.00;
        } else {
            billAmount = 100 * 2.50 + 100 * 4.00 + 300 * 5.00 + (unitsUsed - 500) * 6.50;
        }
        return billAmount;
    }

}
