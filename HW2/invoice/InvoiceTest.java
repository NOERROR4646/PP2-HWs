package HW2.invoice;
import java.util.*;

public class InvoiceTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ne bilim, yaz numberi");
        String number = sc.next();
        System.out.println("Indi yaz descriptioni");
        String desc = sc.next();
        System.out.println("molodec, indi quantity");
        int quantity = sc.nextInt();
        System.out.println("Finally PRICEEEE!!!!!");
        double pricePerItem = sc.nextDouble();

        Invoice testInvoice = new Invoice(number, desc, quantity, pricePerItem);

        System.out.println("Okay so the final results:");
        System.out.println("Item number: " + testInvoice.getPartNumber());
        System.out.println("Item description: " + testInvoice.getPartDescription());
        System.out.println("Quantity of items: " + testInvoice.getQuantity());
        System.out.println("Price per item: " + testInvoice.getPricePerItem());
        System.out.println("Final invoice amount: " + testInvoice.getInvoiceAmount());

        System.out.println("Now try changing some stuff.");
        System.out.println("New number: ");
        testInvoice.setPartNumber(sc.next());
        System.out.println("New description: ");
        testInvoice.setPartDescription(sc.next());
        System.out.println("New quantity: ");
        testInvoice.setQuantity(sc.nextInt());
        System.out.println("New pricePerItem: ");
        testInvoice.setPricePerItem(sc.nextDouble());

        System.out.println("Okay so the new final results:");
        System.out.println("Item number: " + testInvoice.getPartNumber());
        System.out.println("Item description: " + testInvoice.getPartDescription());
        System.out.println("Quantity of items: " + testInvoice.getQuantity());
        System.out.println("Price per item: " + testInvoice.getPricePerItem());
        System.out.println("Final invoice amount: " + testInvoice.getInvoiceAmount());

    }
}
