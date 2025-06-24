package candidatura.exceptions;

public class ParametrosInvalidosException extends RuntimeException {
    
    public ParametrosInvalidosException(String message) {
        super(message);
    }
    
    public ParametrosInvalidosException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ParametrosInvalidosException(Throwable cause) {
        super(cause);
    }
    
    public ParametrosInvalidosException() {
        super("Parâmetros inválidos fornecidos. Segundo Parametro deve ser maior que o primeiro.");
    }

}
