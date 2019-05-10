package SxxMachine;

import SxxMachine.pterm.TermData;

/**
 * Type error.<br>
 * There will be a type error when the type of an argument or one of its
 * components is incorrect, but not a variable.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class IllegalTypeException extends BuiltinException {
    /** A functor symbol of <code>type_error/4</code>. */
    public static final Functor TYPE_ERROR = TermData.F("type_error", 4);
    /*
     * type ::= atom | atomic | byte | callable | character | compound | evaluable |
     * in_byte | in_character | integer | list | number | predicate_indicator |
     * variable | flaot | java
     */
    /** Holds a string representation of valid type. */
    public final String type;
    /** Holds the argument or one of its components which caused the error. */
    public final Term culprit;

    /**
     * Constructs a new <code>IllegalTypeException</code> with a valid type and its
     * culprit.
     */
    public IllegalTypeException(String _type, Term _culprit) {
        this.type = _type;
        this.culprit = _culprit;
    }

    /**
     * Constructs a new <code>IllegalTypeException</code> with the given arguments.
     */
    public IllegalTypeException(Operation _goal, int _argNo, String _type, Term _culprit) {
        this.goal = _goal;
        this.argNo = _argNo;
        this.type = _type;
        this.culprit = _culprit;
    }

    /**
     * Returns a term representation of this <code>IllegalTypeException</code>:
     * <code>type_error(goal,argNo,type,culprit)</code>.
     */
    @Override
    public Term getMessageTerm() {
        Term[] args = { (this.goal == null) ? TermData.createAtomic("<Goal unknown>") : TermData.FFIObject(this.goal),
                TermData.Integer(this.argNo), TermData.createAtomic(this.type), this.culprit };
        return TermData.createErrorTerm(this, TYPE_ERROR, args);
    }

    /**
     * Returns a string representation of this <code>IllegalTypeException</code>.
     */
    @Override
    public String toString() {
        String s = "{TYPE ERROR: " + this.goal;
        if (this.argNo > 0)
            s += " - arg " + this.argNo;
        s += ": expected " + this.type;
        s += ", found " + this.culprit.pprint();
        s += "}";
        return s;
    }

    @Override
    public String getMessage() {
        return toString();
    }

}
