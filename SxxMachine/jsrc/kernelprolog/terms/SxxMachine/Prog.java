package SxxMachine;

import SxxMachine.pterm.Clause;
import SxxMachine.pterm.Source;
import SxxMachine.pterm.TermData;

/**
 * Basic toplevel Prolog Engine. Loads and executes Prolog programs and can be
 * extended to spawn threads executing on new Prolog Engine objects as well as
 * networking threads and synced local and remote Linda transactions
 */
public class Prog extends Source implements Runnable {
    // CONSTRUCTORS

    @Override
    public Prog toClone() {
        return new Prog(trail, orStack, parent);
    }

    public Prog(KPTrail trail, ObjectStack orStack, Prog parent) {
        super(null);
        this.trail = trail;
        this.orStack = orStack;
        this.parent = parent;
    }

    /**
     * Creates a Prog starting execution with argument "goal"
     */
    public Prog(Clause goal, Prog parent) {
        super(parent);
        this.parent = parent;
        goal = goal.ccopy();
        this.trail = new KPTrail();
        this.orStack = new ObjectStack();
        if (null != goal)
            orStack.push(new Unfolder(goal, this));

    }

    // INSTANCE FIELDS

    private KPTrail trail;

    /**
     * Contains Unfolders that may produce answers.
     */
    private ObjectStack orStack;

    private Prog parent;

    public final KPTrail getTrail() {
        return trail;
    }

    public final Prog getParent() {
        return parent;
    }

    // CLASS FIELDS

    public static int tracing = 1;

    // INSTANCE METHODS

    /**
     * Here is where actual LD-resolution computation happens. It consists of a
     * chain of "unfolding" steps, possibly involving backtracking, which is managed
     * by the OrStack.
     */
    @Override
    public Term getElement() {
        if (null == orStack)
            return null;
        Term answer = null;
        while (!orStack.isEmpty()) {
            Unfolder I = (Unfolder) orStack.pop();
            answer = I.getAnswer();
            if (null != answer)
                break;
            Clause nextgoal = I.getElement();
            if (null != nextgoal) {
                if (I.notLastClause())
                    orStack.push(I);
                else
                    I.stop();
                if (null == answer)
                    orStack.push(new Unfolder(nextgoal, this));
            }
        }
        Term head;
        if (null == answer) {
            head = null;
            stop();
        } else
            head = answer.car();
        return head;
    }

    @Override
    public void stop() {
        if (null != trail) {
            trail.unwind(0);
            trail = null;
        }
        orStack = null;
    }

    /**
     * Computes a copy of the first solution X of Goal G.
     */

    static public Term firstSolution(Term X, Term G) {
        Prog p = new_engine(X, G);
        Term A = ask_engine(p);
        if (A != null) {
            A = TermData.S("the", A);
            p.stop();
        } else
            A = Prolog.aNo;
        return A;
    }

    /**
     * creates a new logic engine
     */
    static public Prog new_engine(Term X, Term G) {
        Clause C = new Clause(X, G);
        Prog p = new Prog(C, null);
        return p;
    }

    /**
     * asks a logic engine to return a solution
     */

    static public Term ask_engine(Prog p) {
        return p.getElement();
    }

    /**
     * usable for launching on a separate thread
     */
    @Override
    public void run() {
        for (;;) {
            Term Answer = getElement();
            if (null == Answer)
                break;
        }
    }

}