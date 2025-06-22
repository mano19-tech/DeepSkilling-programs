//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456", "Mano Kumar");
        context.setPaymentStrategy(creditCard);
        context.payAmount(2500.00);


        PaymentStrategy paypal = new PayPalPayment("manokumar@example.com");
        context.setPaymentStrategy(paypal);
        context.payAmount(1500.00);

    }
}