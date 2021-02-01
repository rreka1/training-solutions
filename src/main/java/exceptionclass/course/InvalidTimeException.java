package exceptionclass.course;

public class InvalidTimeException extends RuntimeException {

    public InvalidTimeException(String message) {
        super(message);
    }

    public String getMessage() {
        return super.getMessage();
    }
}
