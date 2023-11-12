package Exception;

public class CepNotFoundException extends RuntimeException{
    public CepNotFoundException(String msg) {
        super(msg);
    }
}
