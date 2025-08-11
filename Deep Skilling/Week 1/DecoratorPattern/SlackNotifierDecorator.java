// SlackNotifierDecorator.java
// Concrete Decorator for Slack
public class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Send previous notifications
        System.out.println("Sending Slack notification: " + message);
    }
}