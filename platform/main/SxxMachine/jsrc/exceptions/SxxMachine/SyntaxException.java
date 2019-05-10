package SxxMachine;

import SxxMachine.pterm.TermData;

/**
 * Syntax error.<br>
 * There will be a syntax error when a sequence of characters which are being
 * input as read-term do not conform to the syntax.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class SyntaxException extends BuiltinException {
    /** A functor symbol of <code>syntax_error/5</code>. */
    public static final Functor SYNTAX_ERROR = TermData.F("syntax_error", 5);
    /** Holds a string representation of valid type. */
    public final String type;
    /** Holds the argument or one of its components which caused the error. */
    public final Term culprit;
    /** Holds a string representation of detail message. */
    public final String message;

    /**
     * Constructs a new <code>SyntaxException</code> with a valid type, its culprit,
     * and message.
     */
    @Override
    public String getMessage() {
        return message;
    }

    public SyntaxException(String _type, Term _culprit, String _message) {
        this.type = _type;
        this.culprit = _culprit;
        this.message = _message;
    }

    /** Constructs a new <code>SyntaxException</code> with the given arguments. */
    public SyntaxException(Operation _goal, int _argNo, String _type, Term _culprit, String _message) {
        this.goal = _goal;
        this.argNo = _argNo;
        this.type = _type;
        this.culprit = _culprit;
        this.message = _message;
    }

    /**
     * Returns a term representation of this <code>SyntaxException</code>:
     * <code>syntax_error(goal,argNo,type,culprit,message)</code>.
     */
    @Override
    public Term getMessageTerm() {
        Term[] args = { TermData.FFIObject(this.goal), TermData.Integer(this.argNo), TermData.createAtomic(this.type),
                this.culprit, TermData.createAtomic(this.message) };
        return TermData.createErrorTerm(this, SYNTAX_ERROR, args);
    }

    /** Returns a string representation of this <code>SyntaxException</code>. */
    @Override
    public String toString() {
        String s = "{SYNTAX ERROR: " + this.goal.toString();
        if (this.argNo > 0)
            s += " - arg " + this.argNo;
        s += ": expected " + this.type;
        s += ", found " + this.culprit.pprint();
        s += "}";
        return s;
    }
}
