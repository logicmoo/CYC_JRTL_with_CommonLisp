package SxxMachine;

import static SxxMachine.pterm.TermData.Op;
import static SxxMachine.pterm.TermData.VA;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <p>
 * Logs executed predicates and their arguments to {@link Logger} instance given
 * in constructor.
 * <p>
 * Writes the following data:
 * <ul>
 * <li>level SEVERE - exception stack traces reported by
 * {@link PrologControl#printStackTrace(Throwable)}
 * <li>level WARNING - nothing
 * <li>level INFO - nothing
 * <li>level CONFIG - nothing
 * <li>level FINE - logs executed {@link Predicate}, their arguments .
 * Intercepted exception stack traces.
 * <li>level FINER - info about engine try, retry, trust, fail and executed
 * {@link Operation}
 * <li>level FINEST - nothing
 * </ul>
 *
 *
 * @author semenov
 *
 */
public class PrologLogger {
    private final Logger logger;
    private Predicate[] stackFrame;
    private int stackTop;
    private boolean normalExecution = true;
    private final StringBuilder stringBuilder = new StringBuilder(2048);
    private char[] indent;
    public boolean loggerEnable = true;

    Logger getJLogger() {
        return this.logger;
    }

    PrologLogger(Logger logger) {
        this.logger = logger;
        this.stackFrame = new Predicate[256];
        this.indent = new char[256];
    }

    final void init(ChoicePointFrame initialChoicePointFrame) {
        this.stackTop = 0;
        // Arrays.fill(stackFrame, null);
        this.stackFrame[0] = Op(SxxMachine.FILE_builtins::PRED_true_0_static_exec, VA(), null); // TODO check if null is
                                                                                                // ok
        this.normalExecution = true;
        initialChoicePointFrame.ownerPredicate = this.stackFrame[this.stackTop];
        initialChoicePointFrame.loggerStackTop = this.stackTop;
    }

    final void fail(Operation next, ChoicePointFrame entry) {
        // write to log
        if (this.loggerEnable)
            this.logger.log(Level.FINER, () -> {
                stringBuilder.setLength(0);
                stringBuilder.append(this.indent, 1, this.stackTop).append("failure => ");
                stringBuilder.append(next);
                return stringBuilder.toString();
            });
        this.normalExecution = false;
        this.stackTop = entry.loggerStackTop;
        this.stackFrame[this.stackTop] = (Predicate) entry.ownerPredicate;
    }

    /**
     * @param next
     */
    final void jtry(Operation p, Operation next, ChoicePointFrame entry) {
        entry.ownerPredicate = this.stackFrame[this.stackTop];
        entry.loggerStackTop = this.stackTop;
        // write to log
        if (this.loggerEnable)
            this.logger.log(Level.FINER, () -> {
                stringBuilder.setLength(0);
                stringBuilder.append(this.indent, 1, this.stackTop).append("try ");
                stringBuilder.append(this.stackFrame[this.stackTop].toString());
                stringBuilder.append(" => ");
                stringBuilder.append(p);
                return stringBuilder.toString();
            });
    }

    /**
     * @param next
     */
    final void retry(Operation p, Operation next, ChoicePointFrame entry) {
        // write to log
        if (this.loggerEnable)
            this.logger.log(Level.FINER, () -> {
                stringBuilder.setLength(0);
                stringBuilder.append(this.indent, 1, this.stackTop).append("retry ");
                stringBuilder.append(entry.ownerPredicate.toString());
                stringBuilder.append(" => ");
                stringBuilder.append(p);
                return stringBuilder.toString();
            });
        this.normalExecution = false;
        this.stackTop = entry.loggerStackTop;
        this.stackFrame[this.stackTop] = (Predicate) entry.ownerPredicate;
    }

    final void trust(Operation p, ChoicePointFrame entry) {
        // write to log
        if (this.loggerEnable)
            this.logger.log(Level.FINER, () -> {
                stringBuilder.setLength(0);
                stringBuilder.append(this.indent, 1, this.stackTop).append("trust ");
                stringBuilder.append(entry.ownerPredicate.toString());
                stringBuilder.append(" => ");
                stringBuilder.append(p);
                return stringBuilder.toString();
            });
        this.normalExecution = false;
        this.stackTop = entry.loggerStackTop;
        this.stackFrame[this.stackTop] = (Predicate) entry.ownerPredicate;
    }

    public final void beforeExec(Operation code) {
        Level level;
        // do afterExec
        if (code instanceof Predicate) {
            if (this.normalExecution) {
                while (this.stackTop >= 0 && this.stackFrame[this.stackTop].cont == code) {
                    this.stackTop--;
                }
                this.stackTop++;
                if (this.stackTop >= this.stackFrame.length) {
                    ensureCapacity();
                }
            }
            // most important
            this.stackFrame[this.stackTop] = (Predicate) code;
            level = Level.FINE;
        } else {
            level = Level.FINER;
        }
        this.normalExecution = true;
        // if logger.isLoggable(Level.FINE) write code to log
        if (this.loggerEnable)
            this.logger.log(level, () -> {
                stringBuilder.setLength(0);
                stringBuilder.append(this.indent, 1, this.stackTop).append(": ");
                if (code instanceof Predicate) {
                    ((Predicate) code).toString(stringBuilder);
                } else {
                    stringBuilder.append(code);
                }
                return stringBuilder.toString();
            });
    }

    public final void printStack(Operation codeP, StringBuilder stringBuilder) {
        int stackTop = this.stackTop;
        Operation code = null;
        String indent = "\n" + " ";
        for (int i = 0; i < stackTop; i++) {
            code = this.stackFrame[i];
            stringBuilder.append(indent);
            if (code == codeP) {
                break;
            } else {
                stringBuilder.append("ABOVE: ");
            }
            if (code instanceof Predicate) {
                ((Predicate) code).toString(stringBuilder);
            } else {
                stringBuilder.append(code.toString());
            }
        }
        code = codeP;
        stringBuilder.append("\nHERE: ");
        if (code instanceof Predicate) {
            ((Predicate) code).toRest(indent + "  GOTO: ", stringBuilder);
        }
    }

    private void ensureCapacity() {
        Predicate[] array = new Predicate[this.stackFrame.length * 2];
        System.arraycopy(this.stackFrame, 0, array, 0, this.stackFrame.length);
        this.stackFrame = array;
        this.indent = new char[this.stackFrame.length];
        Arrays.fill(this.indent, ' ');
    }

    public final PrologException execThrows(RuntimeException t) {
        if (!(t instanceof PrologException) || !((PrologException) t).hasPrologStackTrace()) {
            Operation[] array = new Operation[this.stackTop];
            for (int i = this.stackTop, k = 0; i > 0; i--) {
                array[k] = this.stackFrame[i];
                k++;
            }
            // wrap t into JavaException if it is not PrologException
            if (!(t instanceof PrologException)) {
                t.printStackTrace();
                t = new JavaException(t);
            }
            // add stacktrace into t
            ((PrologException) t).setPrologStackTrace(array);
            if (t instanceof BuiltinException) {
                ((BuiltinException) t).goal = this.stackFrame[this.stackTop];
            }
        }
        // write to log
        this.logger.log(Level.FINE, "", t);
        return (PrologException) t;
    }

    final void printStackTrace(Throwable err) {
        this.logger.log(Level.SEVERE, "", err);
        if (!this.logger.getUseParentHandlers()) { // propagate error outside
            Logger.getLogger("").log(Level.SEVERE, "", err);
        }
    }

    final void close() {
        Arrays.fill(this.stackFrame, this.stackTop + 1, this.stackFrame.length, null);
    }
}
