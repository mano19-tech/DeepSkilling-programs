public class GPayAdapter implements PaymentProcessor{
    private GPay Gpay;

    public GPayAdapter(GPay Gpay) {
        this.Gpay = Gpay;
    }

    @Override
    public void processPayment(double amount) {
        Gpay.sendPayment(amount);
    }
}
