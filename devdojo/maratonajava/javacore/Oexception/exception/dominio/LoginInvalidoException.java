package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
    }

    public LoginInvalidoException(String message) {
        super("Login invalido");
    }
}
