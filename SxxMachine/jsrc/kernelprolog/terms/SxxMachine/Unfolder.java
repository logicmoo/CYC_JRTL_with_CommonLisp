package SxxMachine;

import java.util.Iterator;

import SxxMachine.pterm.Clause;
import SxxMachine.pterm.Source;

//!depends

/**
 * For a given clause g= A0:-<Guard>,A1,A2...,An, used as resolvent iterates
 * over its possible unfoldings (LD-resolution steps) with clauses of the form
 * B0:-B1,...,Bm in the default database. For each such step, a new clause
 * (A0:-B1,...,Bm,A2...,An)mgu(A1,B0) is built and returned by the Unfolder's
 * getElement method. Before the actual unfolding operations, builtins in Guard
 * are executed, possibly providing bindings for some variables or failing. In
 * case of failure of Guard or of unification, getElement() returns null.
 */
public class Unfolder extends Source {
    public Unfolder(int oldtop, Iterator e, Clause goal, Prog prog) {
        super(null);
        this.oldtop = oldtop;
        this.e = e;
        this.goal = goal;
        this.prog = prog;
    }

    @Override
    public Unfolder toClone() {
        return new Unfolder(oldtop, e, goal, prog);
    }

    private int oldtop;

    @SuppressWarnings("rawtypes")
    private Iterator e;

    private Clause goal;

    private Prog prog;

    /**
     * Creates an Unfolder based on goal clause g for resolution step in program p.
     * Iterator e is set to range over matching clauses in the database of program
     * p.
     */
    public Unfolder(Clause g, Prog p) {
        super(p);
        this.goal = g;
        this.prog = p;
        this.e = null;
        trace_goal(g);
        reduceBuiltins();
        if (null != goal) {
            Term first = goal.getFirst();
            if (null != first) {
                oldtop = prog.getTrail().size();
                this.e = Init.default_db.toEnumerationFor(first);
                if (!e.hasNext())
                    trace_nomatch(first);
            }
        } else
            trace_failing(g);
    }

    /**
     * Overrides default trailing by empty action
     */
    @Override
    protected void trailMe(Prog p) {
        // IO.mes("not trailing"+this);
    };

    /**
     * Extracts an answer at the end of an AND-derivation
     */
    Clause getAnswer() {
        if (null != goal && goal.getBody().isTrueProc())
            return goal.ccopy();
        else
            return null;
    }

    /**
     * Checks if this clause is the last one, allowing LCO
     */
    final boolean notLastClause() {
        return (null != e) && e.hasNext();
    }

    /**
     * Reduces builtin functions after the neck of a clause, before a "real" atom is
     * unfolded
     */
    final void reduceBuiltins() {
        for (;;) {
            Term first = goal.getFirst();
            if (null == first)
                break; // cannot reduce further
            if (first.isConj()) { // advances to next (possibly) inline builtin
                goal = new Clause(goal.getHead(), Clause.appendConj(first, goal.getRest()));
                first = goal.getFirst();
            }

            int ok = first.exec(prog); // (possibly) executes builtin

            switch (ok) {

                case -1: // nothing to do, this is not a builtin
                    break;

                case 1: // builtin suceeds
                        // IO.mes("advancing: "+goal);
                    goal = new Clause(goal.getHead(), goal.getRest());
                    continue; // advance

                case 0: // builtin fails
                    goal = null;
                    break; // get out

                default: // unexpected code: programming error
                    IO.errmes("Bad return code:" + ok + ") in builtin: " + first);
                    goal = null;
                    break;
            }
            // IO.mes("leaving reduceBuiltins: "+goal);
            break; // leaves loop
        }
    }

    /**
     * Returns a new clause by unfolding the goal with a matching clause in the
     * database, or null if no such clause exists.
     */
    @Override
    public Clause getElement() {
        if (null == e)
            return null;
        Clause unfolded_goal = null;
        while (e.hasNext()) {
            Term T = (Term) e.next();
            if (!(T.isClause()))
                continue;
            // resolution step, over goal/resolvent of the form:
            // Answer:-G1,G2,...,Gn.
            prog.getTrail().unwind(oldtop);
            // unify() happens here !!!
            unfolded_goal = T.toClause().unfold_with_goal(goal, prog.getTrail());
            if (null != unfolded_goal)
                break;
        }
        return unfolded_goal;
    }

    /**
     * Stops production of more alternatives by setting the clause enumerator to
     * null
     */
    @Override
    public void stop() {
        e = null;
    }

    /**
     * Tracer on entering g
     */
    final void trace_goal(Clause g) {
        switch (Prog.tracing) {
            case 2:
                IO.println(">>>: " + g.getFirst());
                break;
            case 3:
                IO.println(">>>: " + g.pprint());
                break;
        }
    }

    /**
     * Tracer on exiting g
     */
    final void trace_failing(Clause g) {
        switch (Prog.tracing) {
            case 2:
                IO.println("FAILING CALL IN<<<: " + g.getFirst());
                break;
            case 3:
                IO.println("FAILING CALL IN<<<: " + g.pprint());
                break;
        }
    }

    /**
     * Tracer for undefined predicates
     */
    final void trace_nomatch(Term first) {
        if (Prog.tracing > 0) {
            IO.println("*** UNDEFINED CALL: " + first.pprint());
        }
    }

    /**
     * Returns a string representation of this unfolder, based on the original
     * clause it is based on.
     */
    @Override
    public String pprint() {
        return (null == goal) ? "{Unfolder}" : "{Unfolder=> " + goal.pprint() + "}";
    }

}
