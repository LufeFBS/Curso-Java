package je18_exceptions;

public class EstadoValidateException extends RuntimeException {
    public EstadoValidateException() {
        super ("O estado não foi localizado.");
    }

}
