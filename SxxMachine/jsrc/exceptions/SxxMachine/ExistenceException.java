package SxxMachine;

import SxxMachine.pterm.TermData;

/**
 * Existence error.<br>
 * There will be an existence error when the object on which an operation is to
 * be performed does not exist.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class ExistenceException extends BuiltinException {
    /** A functor symbol of <code>existence_error/5</code>. */
    public static final Functor EXISTENCE_ERROR = TermData.F("existence_error", 5);
    /* objType ::= procedure | source_sink | stream | hash */
    /** Holds a string representation of object type. */
    public final String objType;
    /** Holds the argument or one of its components which caused the error. */
    public final Term culprit;
    /** Holds a string representation of detail message. */
    public final String message;

    /**
     * Constructs a new <code>ExistenceException</code> with a object type, its
     * culprit, and message.
     */
    public ExistenceException(String _objType, Term _culprit, String _message) {
        this.objType = _objType;
        this.culprit = _culprit;
        this.message = _message.intern();
    }

    /**
     * Constructs a new <code>ExistenceException</code> with the given arguments.
     */
    public ExistenceException(Operation _goal, int _argNo, String _objType, Term _culprit, String _message) {
        this.goal = _goal;
        this.argNo = _argNo;
        this.objType = _objType;
        this.culprit = _culprit;
        this.message = _message.intern();
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    /**
     * Returns a term representation of this <code>ExistenceException</code>:
     * <code>existence_error(goal,argNo,objType,culprit,message)</code>.
     */
    @Override
    public Term getMessageTerm() {
        if (messageTerm == null) {
            Term[] args = { TermData.FFIObject(this.goal), TermData.Integer(this.argNo),
                    TermData.createAtomic(this.objType), this.culprit, TermData.createAtomic(this.message) };
            messageTerm = TermData.createErrorTerm(this, EXISTENCE_ERROR, args);
        }
        return messageTerm;
    }

    /** Returns a string representation of this <code>ExistenceException</code>. */
    @Override
    public String toString() {
        String s = "{EXISTENCE ERROR:";
        if (this.argNo > 0)
            s += " " + this.goal.toString() + " - arg " + this.argNo + ":";
        s += this.objType + " " + this.culprit.pprint() + " does not exist";
        s += "}";
        return s;
    }
}
