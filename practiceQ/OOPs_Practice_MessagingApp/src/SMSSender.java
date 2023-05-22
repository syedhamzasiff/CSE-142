public class SMSSender implements MessageSender {
    @Override
    public String send_message() {
        return "sends sms";
    }

    @Override
    public String toString() {
        return send_message();
    }
}
