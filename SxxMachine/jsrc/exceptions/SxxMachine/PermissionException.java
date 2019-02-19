package SxxMachine;

import SxxMachine.pterm.TermData;

/**
 * Permission error.<br>
 * There will be a permission error when it is not permitted to perform a
 * specific operation.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class PermissionException extends BuiltinException {
    /** A functor symbol of <code>permission_error/5</code>. */
    public static final Functor PERMISSION_ERROR = TermData.F("permission_error", 5);
    /*
     * operation ::= access | create | input | modify | open | output | reposition |
     * new
     */
    /** Holds a string representation of operation. */
    public final String operation;
    /*
     * permissionType ::= binary_stream | flag | operator | past_end_of_stream
     * private_procedure | static_procedure | source_sink stream | text_stream
     */
    /** Holds a string representation of permission type. */
    public final String permissionType;
    /** Holds the argument or one of its components which caused the error. */
    public final Term culprit;
    /** Holds a string representation of detail message. */
    public final String message;

    /**
     * Constructs a new <code>PermissionException</code> with the given arguments.
     */
    public PermissionException(Operation _goal, String _operation, String _permissionType, Term _culprit,
            String _message) {
        this.goal = _goal;
        this.operation = _operation;
        this.permissionType = _permissionType;
        this.culprit = _culprit;
        this.message = _message;
    }

    @Override
    public String getMessage() {
        return toString();
    }

    /**
     * Returns a term representation of this <code>PermissionException</code>:
     * <code>permission_error(goal,argNo,operation,permissionType,culprit,message)</code>.
     */
    @Override
    public Term getMessageTerm() {
        Term[] args = { TermData.FFIObject(this.goal), TermData.createAtomic(this.operation),
                TermData.createAtomic(this.permissionType), this.culprit, TermData.createAtomic(this.message) };
        return TermData.createErrorTerm(this, PERMISSION_ERROR, args);
    }

    /** Returns a string representation of this <code>PermissionException</code>. */
    @Override
    public String toString() {
        String s = "{PERMISSION ERROR: " + this.goal.toString();
        s += " - can not " + this.operation + " " + this.permissionType + " " + this.culprit.pprint();
        s += ": " + this.message;
        s += "}";
        return s;
    }
}
