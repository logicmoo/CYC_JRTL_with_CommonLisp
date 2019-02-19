package SxxMachine;

import SxxMachine.pterm.TermData;

/**
 * Evaluation error.<br>
 * There will be an evaluation error when the operands of an evaluable functor
 * are such that the operation has an exceptional value.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class EvaluationException extends BuiltinException {
    /** A functor symbol of <code>evaluation_error/3</code>. */
    public static final Functor EVALUATION_ERROR = TermData.F("evaluation_error", 3);
    /*
     * errorType ::= float_overflow | int_overflow | undefined | underflow |
     * zero_devisor
     */
    /** Holds a string representation of error type. */
    public final String errorType;

    /** Constructs a new <code>EvaluationException</code> with an error type. */
    public EvaluationException(String _errorType) {
        this.errorType = _errorType;
    }

    /**
     * Constructs a new <code>EvaluationException</code> with the given arguments.
     */
    public EvaluationException(Operation _goal, int _argNo, String _errorType) {
        this.goal = _goal;
        this.argNo = _argNo;
        this.errorType = _errorType;
    }

    /**
     * Returns a term representation of this <code>EvaluationException</code>:
     * <code>evaluation_error(goal,argNo,errorType)</code>.
     */
    @Override
    public Term getMessageTerm() {
        Term[] args = { TermData.FFIObject(this.goal), TermData.Integer(this.argNo),
                TermData.createAtomic(this.errorType) };
        return (Term) TermData.createErrorTerm(this, EVALUATION_ERROR, args);
    }

    /** Returns a string representation of this <code>EvaluationException</code>. */
    @Override
    public String toString() {
        String s = "{EVALUATION ERROR: " + this.goal;
        if (this.argNo > 0)
            s += " - arg " + this.argNo;
        s += ", found " + this.errorType;
        s += "}";
        return s;
    }

    @Override
    public String getMessage() {
        return toString();
    }

}
