package SxxMachine;

/**
 * Created by semenov on 04.05.2017.
 */
public class StopEngineException extends RuntimeException {
    public StopEngineException() {
    }

    public StopEngineException(String message) {
        super(message);
    }

    public StopEngineException(String message, Throwable cause) {
        super(message, cause);
    }

    public StopEngineException(Throwable cause) {
        super(cause);
    }

    public StopEngineException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
