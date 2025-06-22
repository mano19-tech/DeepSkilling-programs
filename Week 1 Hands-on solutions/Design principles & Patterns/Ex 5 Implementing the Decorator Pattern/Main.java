//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Notifier baseNotifier = new EmailNotifier();
        Notifier smsDecorator = new SMSNotifierDecorator(baseNotifier);

        Notifier fullNotifier = new SlackNotifierDecorator(smsDecorator);

        fullNotifier.send("System update at 10 PM.");

    }
}