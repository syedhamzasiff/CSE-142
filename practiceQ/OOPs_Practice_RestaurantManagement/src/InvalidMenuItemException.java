public class InvalidMenuItemException extends Exception{
    private String message;

    public InvalidMenuItemException(String message) {
        this.message = message;
    }

    public String toString() {
        return message;
    }

}
