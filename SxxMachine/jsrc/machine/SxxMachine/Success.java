package SxxMachine;

/**
 * Initial continuation goal.<br>
 * That is to say, this <code>Success</code> will be executed every time the
 * Prolog Cafe system finds an answer.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class Success extends Predicate.P0 implements Operation {
    public static final Success SUCCESS = new Success();

    private Success() {
    }

    /**
     * Backtracks and returns a next clause after invoking the
     * <code>PrologControl.success()</code>.
     *
     * @param engine
     *            Prolog engine
     * @see PrologControl#success
     */
    @Override
    public Operation exec(Prolog engine) {
        engine.control.success();
        return engine.fail();
    }

    /** Returns a string representation of this <code>Success</code>. */
    @Override
    public String toString() {
        return "Success";
    }
}
