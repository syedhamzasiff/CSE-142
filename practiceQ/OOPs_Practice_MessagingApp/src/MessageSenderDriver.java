import java.util.Scanner;

public class MessageSenderDriver {
    public static void main(String[] args) throws InvalidMessageTypeException {
        MessageSenderFactory messageSenderFactory = new MessageSenderFactory();
        Scanner sc = new Scanner(System.in);

        System.out.println("what type of message do you want to send?");
        String messageType = sc.next();
        MessageSender messageSender = messageSenderFactory.create_message_sender(messageType);
        System.out.println(messageSender);
    }

    /*
    Consider a scenario where you are building a messaging application.
    You have different types of message senders, such as EmailSender, SMSSender, and WhatsAppSender.
    Implement the Factory Design Pattern to create an object for each type of message sender.
    Your task is to create a MessageSender interface or base class
    Next, create concrete classes that implement the MessageSender interface: EmailSender, SMSSender, and WhatsAppSender.
    Each concrete class should have its own implementation of the send_message() method.
    Then, implement a MessageSenderFactory class that contains a static method, create_message_sender().
    This method should take a sender_type parameter (e.g., "email", "sms", "whatsapp") and
    return an instance of the corresponding message sender object. If the sender_type is not recognized,
    it should raise an exception or return None.
     */


}
