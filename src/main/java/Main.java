import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please provide the following String:");

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

        StringBuilder String = new StringBuilder();
        String.append(fullName).append("\n");
        String.append("Billing Address:\n");
        String.append(billingStreet).append("\n");
        String.append(billingCity).append(", ").append(billingState).append(" ").append(billingZip).append("\n");
        String.append("Shipping Address:\n");
        String.append(shippingStreet).append("\n");
        String.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip).append("\n");

        System.out.println("\nDisplay the customer String");
        System.out.println(String);
    }
}
