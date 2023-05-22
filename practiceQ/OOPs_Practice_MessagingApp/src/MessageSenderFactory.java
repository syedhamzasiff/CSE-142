public class MessageSenderFactory {
    public MessageSender create_message_sender(String messageType) throws InvalidMessageTypeException {
        switch (messageType){
            case "Email":
                return new EmailSender();
            case "SMS":
                return new SMSSender();
            case "Whatsapp":
                return new WhatsAppSender();
            default:
                throw new InvalidMessageTypeException(messageType);
        }
    }
}
