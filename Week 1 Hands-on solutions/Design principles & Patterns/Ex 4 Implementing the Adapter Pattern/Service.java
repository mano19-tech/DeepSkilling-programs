public class Service {
    public static void main(String[] args) {

        System.out.println();

        Paytm paytm = new Paytm();
        PaymentProcessor paytmProcessor = new PaytmAdapter(paytm);
        paytmProcessor.processPayment(100.0);

        System.out.println();

        GPay Gpay = new GPay();
        PaymentProcessor GpayProcessor = new GPayAdapter(Gpay);
        GpayProcessor.processPayment(250.0);
    }
}
