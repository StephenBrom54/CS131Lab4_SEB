public class StringTooLongException extends Exception {
    public StringTooLongException() throws StringTooLongException {
        super("String is too long!");
        int stringLength = 10;
        String myString = "This string is too long";

        if (myString.length() > stringLength) {
            throw new StringTooLongException();
        }

    }
}
