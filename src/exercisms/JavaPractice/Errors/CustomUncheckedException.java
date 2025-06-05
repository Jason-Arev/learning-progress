package exercisms.Errors;

class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException() {
        super();
    }

    public CustomUncheckedException(String message) {
        super(message);
    }
}
