package ch11exception.book.exercise.p07;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {}
    public WrongPasswordException(String message) {
        super(message);
    }
}
