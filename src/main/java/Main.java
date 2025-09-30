import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please provide the following information:");

        System.out.print("Full name: ");
        String fullName = myScanner.nextLine();

        System.out.print("Billing Street: ");
        String billingStreet = myScanner.nextLine();

        System.out.print("Billing City: ");
        String billingCity = myScanner.nextLine();

        System.out.print("Billing State: ");
        String billingState = myScanner.nextLine();

        System.out.print("Billing Zip: ");
        String billingZip = myScanner.nextLine();

        System.out.print("Shipping Street: ");
        String shippingStreet = myScanner.nextLine();

        System.out.print("Shipping City: ");
        String shippingCity = myScanner.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = myScanner.nextLine();

        System.out.print("Shipping Zip: ");
        String shippingZip = myScanner.nextLine();
    }
}
