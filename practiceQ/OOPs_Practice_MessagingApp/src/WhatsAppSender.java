public class WhatsAppSender implements MessageSender{
    @Override
    public String send_message() {
        return "sends whatsapp text";
    }

    @Override
    public String toString() {
        return send_message();
    }
}
