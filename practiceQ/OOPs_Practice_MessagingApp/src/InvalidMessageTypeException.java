public class InvalidMessageTypeException extends Exception{

    private String message;

    public InvalidMessageTypeException(String message) {
        this.message = message;
    }

    public String toString() {
        return message;
    }
}