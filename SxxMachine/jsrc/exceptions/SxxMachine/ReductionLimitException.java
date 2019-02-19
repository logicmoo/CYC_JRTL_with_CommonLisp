package SxxMachine;

/**
 * Thrown if a goal exceeds the configured reduction limit.
 *
 * @see SxxMachine.PrologControl#setReductionLimit(long)
 */
public class ReductionLimitException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ReductionLimitException(long limit) {
        super(String.format("exceeded reduction limit of %d", limit));
    }
}
