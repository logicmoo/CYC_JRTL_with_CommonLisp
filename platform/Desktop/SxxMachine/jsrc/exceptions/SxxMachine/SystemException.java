package SxxMachine;

import SxxMachine.pterm.TermData;

/**
 * System error.<br>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class SystemException extends PrologException {
    /** A functor symbol of <code>system_error/1</code>. */
    public static final Functor SYSTEM_ERROR = TermData.F("system_error", 1);
    /** Holds a message. */
    public final String message;

    @Override
    public String getMessage() {
        return message;
    }

    /** Constructs a new <code>SystemException</code> with a message. */
    public SystemException(String _message) {
        this.message = _message;
    }

    /**
     * Returns a term representation of this <code>SystemException</code>:
     * <code>system_error(message)</code>.
     */
    @Override
    public Term getMessageTerm() {
        Term[] args = { TermData.createAtomic(this.message) };
        return TermData.createErrorTerm(this, SYSTEM_ERROR, args);
    }

    /** Returns a string representation of this <code>SystemException</code>. */
    @Override
    public String toString() {
        String s = "{SYSTEM ERROR: " + this.message;
        s += "}";
        return s;
    }
}
