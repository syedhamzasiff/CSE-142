public class EmailSender implements MessageSender{
    @Override
    public String send_message() {
        return "send email";
    }

    public EmailSender() {
    }

    @Override
    public String toString() {
        return send_message();
    }
}
