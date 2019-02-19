package SxxMachine;

import SxxMachine.pterm.TermData;

/**
 * Java error.<br>
 * There will be a Java error when a Java exception is threw during
 * interoperating with Java in Prolog Cafe. The class <code>JavaException</code>
 * wraps a subclass of <code>java.lang.Exception</code>.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class JavaException extends BuiltinException {
    private static final long serialVersionUID = -7510890457700984457L;
    /** A functor symbol of <code>java_error/3</code>. */
    public static final Functor JAVA_ERROR = TermData.F("java_error", 3);
    /** Holds a Java exception. */
    protected final Exception e;

    /** Constructs a new <code>JavaException</code> with a Java exception. */
    public JavaException(Exception _e) {
        initCause(_e);
        this.e = _e;
    }

    /** Constructs a new <code>JavaException</code> with the given arguments. */
    public JavaException(Operation _goal, int _argNo, Exception _e) {
        this(_e);
        this.goal = _goal;
        this.argNo = _argNo;
    }

    /**
     * Returns a term representation of this <code>JavaException</code>:
     * <code>java_error(goal,argNo,exception)</code>.
     */
    @Override
    public Term getMessageTerm() {
        Term[] args = { (this.goal == null) ? TermData.createAtomic("<Goal unknown>") : TermData.FFIObject(this.goal),
                TermData.Integer(this.argNo), TermData.FFIObject(this.e) };
        return TermData.createErrorTerm(this, JAVA_ERROR, args);
    }

    /** Returns a underlying Java exception. */
    public Exception getException() {
        return this.e;
    }

    /** Returns a string representation of this <code>JavaException</code>. */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{JAVA ERROR: ");
        sb.append(this.goal);
        if (this.argNo > 0) {
            sb.append(" - arg ").append(this.argNo);
        }
        sb.append(", occurs ").append(this.e);
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String getMessage() {
        return toString();
    }

}
