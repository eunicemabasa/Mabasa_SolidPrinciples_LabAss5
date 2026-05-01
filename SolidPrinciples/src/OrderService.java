public class OrderService {

    private OrderCalculator calculator;
    private OrderPlacer placer;
    private InvoiceGenerator invoiceGenerator;
    private NotificationService notificationService;

    public OrderService(OrderCalculator calculator,
                        OrderPlacer placer,
                        InvoiceGenerator invoiceGenerator,
                        NotificationService notificationService) {
        this.calculator = calculator;
        this.placer = placer;
        this.invoiceGenerator = invoiceGenerator;
        this.notificationService = notificationService;
    }

    public void processOrder(double price, int quantity,
                             String customerName, String address,
                             String fileName, String email) {

        calculator.calculateTotal(price, quantity);
        placer.placeOrder(customerName, address);

        if (invoiceGenerator != null) {
            invoiceGenerator.generateInvoice(fileName);
        }

        if (notificationService != null) {
            notificationService.sendEmailNotification(email);
        }
    }
}