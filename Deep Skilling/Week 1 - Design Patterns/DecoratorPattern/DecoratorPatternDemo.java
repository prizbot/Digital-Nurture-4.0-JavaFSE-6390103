// DecoratorPatternDemo.java
// Test class
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Base notifier: Email
        Notifier emailNotifier = new EmailNotifier();

        // Add SMS notification
        Notifier emailAndSMS = new SMSNotifierDecorator(emailNotifier);

        // Add Slack on top of Email + SMS
        Notifier emailSMSSlack = new SlackNotifierDecorator(emailAndSMS);

        System.out.println("---- Sending via Email only ----");
        emailNotifier.send("Hello via Email!");

        System.out.println("\n---- Sending via Email + SMS ----");
        emailAndSMS.send("Hello via Email and SMS!");

        System.out.println("\n---- Sending via Email + SMS + Slack ----");
        emailSMSSlack.send("Hello via Email, SMS, and Slack!");
    }
}