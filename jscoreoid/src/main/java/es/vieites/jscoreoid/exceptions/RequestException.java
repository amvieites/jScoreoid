package es.vieites.jscoreoid.exceptions;

/**
 * JScoreoid custom exception.
 * 
 * @author Alejandro Martínez Vieites
 */
public class RequestException extends RuntimeException {

    /** The serial version UID. */
    private static final long serialVersionUID = 1002749825278673211L;

    public RequestException(String message) {
        super(message);
    }
    
    public RequestException(String message, Throwable error) {
        super(message, error);
    }
}
