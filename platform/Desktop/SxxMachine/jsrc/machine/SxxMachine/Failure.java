package SxxMachine;

/**
 * Initial backtrak point.<br>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.2
 */
public class Failure extends Predicate.P0 implements Operation {
    public static final Failure FAILURE = new Failure();

    private Failure() {
    }

    @Override
    public Operation exec(Prolog engine) {
        engine.control.fail();
        engine.halt = 1; // halt(0)
        return null;
    }

    /** Returns a string representation of this <code>Failure</code>. */
    @Override
    public String toString() {
        return "Failure";
    }

    public static final Operation fail_0 = new PRED_fail_0();

    private static final class PRED_fail_0 implements Operation {
        @Override
        public Operation exec(Prolog engine) throws PrologException {
            engine.setB0();
            return engine.fail();
        }
    }
}
