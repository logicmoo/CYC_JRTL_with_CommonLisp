package SxxMachine;

import SxxMachine.pterm.TermData;

/**
 * Domain error.<br>
 * There will be a domain error when the type of an argument is correct, but the
 * value is outside the domain for which the procedure is defined.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class IllegalDomainException extends BuiltinException {
    /** A functor symbol of <code>domain_error/4</code>. */
    public static final Functor DOMAIN_ERROR = TermData.F("domain_error", 4);
    /*
     * domain ::= character_code_list | close_option | flag_value | io_mode |
     * non_empty_list | not_less_than_zero | operator_priority | operator_specifier
     * | prolog_flag | read_option | source_sink | stream | steam_option |
     * stream_or_alias | stream_position | stream_property | write_option |
     * hash_or_alias| hash_option | 'arithmetic expression'
     */
    /** Holds a string representation of valid domain. */
    public final String domain;
    /** Holds the argument or one of its components which caused the error. */
    public final Term culprit;

    /**
     * Constructs a new <code>IllegalDomainException</code> with a valid domain and
     * its culprit.
     */
    public IllegalDomainException(String _domain, Term _culprit) {
        this.domain = _domain;
        this.culprit = _culprit;
        Prolog.Break("" + culprit);
    }

    /**
     * Constructs a new <code>IllegalDomainException</code> with the given
     * arguments.
     */
    public IllegalDomainException(Operation _goal, int _argNo, String _domain, Term _culprit) {
        this.goal = _goal;
        this.argNo = _argNo;
        this.domain = _domain;
        this.culprit = _culprit;
    }

    /**
     * Returns a term representation of this <code>IllegalDomainException</code>:
     * <code>domain_error(goal,argNo,type,culprit)</code>.
     */
    @Override
    public Term getMessageTerm() {
        Term[] args = { TermData.FFIObject(this.goal), TermData.Integer(this.argNo), TermData.createAtomic(this.domain),
                this.culprit };
        return TermData.createErrorTerm(this, DOMAIN_ERROR, args);
    }

    /**
     * Returns a string representation of this <code>IllegalDomainException</code>.
     */
    @Override
    public String toString() {
        String s = "{DOMAIN ERROR: " + this.goal.toString();
        if (this.argNo > 0)
            s += " - arg " + this.argNo;
        s += ": expected " + this.domain;
        s += ", found " + this.culprit.pprint();
        s += "}";
        return s;
    }

    @Override
    public String getMessage() {
        return toString();
    }

}
