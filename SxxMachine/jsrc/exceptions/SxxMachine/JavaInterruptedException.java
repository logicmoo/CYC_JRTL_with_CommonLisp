package SxxMachine;

/**
 * Thown when '$print_stack_trace/1' receives an InterruptedException
 *
 * @author Shawn Pearce (sop@google.com)
 */
@SuppressWarnings("serial")
public class JavaInterruptedException extends RuntimeException {
    public JavaInterruptedException(InterruptedException cause) {
        super(cause);
    }
}
