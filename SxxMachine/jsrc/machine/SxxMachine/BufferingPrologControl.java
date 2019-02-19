package SxxMachine;

import java.util.ArrayList;
import java.util.List;

import SxxMachine.pterm.TermData;
import SxxMachine.pterm.VariableTerm;

/**
 * Executes Prolog on the current thread, buffering all solutions.
 * <p>
 * Whenever a solution is found for the predicate the arguments are deep-copied
 * and buffered in a result collection.
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class BufferingPrologControl extends PrologControl {
    private int resLimit;
    private List resBuffer;
    private boolean engineStopped;
    private boolean resSingle;
    private Term[] resTemplate;

    public BufferingPrologControl() {
    }

    public BufferingPrologControl(PrologMachineCopy pmc) {
        super(pmc);
    }

    /**
     * Initialize one or more packages in the interpreter.
     *
     * @param pkgs
     *            list of package names to initialize.
     * @return true if initialization was successful.
     */
    public boolean initialize(String... pkgs) {
        Term goal = TermData.SYM("true");
        Term head = Prolog.Nil;
        for (int i = pkgs.length - 1; 0 <= i; i--)
            head = TermData.CONS(TermData.SYM(pkgs[i]), head);
        return execute(Prolog.BUILTIN, "initialization", head, goal);
    }

    /**
     * Determine if the predicate completes successfully.
     *
     * @param pkg
     *            package the functor is declared in. Typically "user".
     * @param functor
     *            a prolog predicate to execute.
     * @param args
     *            arguments to pass.
     * @return true if the function has at least one solution; false otherwise.
     */
    @Override
    public boolean execute(String pkg, String functor, Term... args) {
        return once(pkg, functor, args) != null;
    }

    /**
     * Execute a function and return one solution.
     *
     * @param pkg
     *            package the functor is declared in. Typically "user".
     * @param functor
     *            a prolog predicate to execute.
     * @param arg
     *            argument to pass in, and template to return the result with. If
     *            this is an {@link VariableTerm} the value will be saved and
     *            returned on success. If this is a structure or list containing
     *            variables, the variables will be materialized in the result.
     * @return a deep copy of {@code arg} for the first solution; null on failure.
     */
    public Term once(String pkg, String functor, Term arg) {
        setPredicate(pkg, functor, arg);
        setResultTemplate(arg);
        return (Term) (run(1) ? this.resBuffer.get(0) : null);
    }

    /**
     * Execute a function and return one solution.
     *
     * @param pkg
     *            package the functor is declared in. Typically "user".
     * @param functor
     *            a prolog predicate to execute.
     * @param args
     *            argument to pass in, and template to return the result with. If
     *            this is an {@link VariableTerm} the value will be saved and
     *            returned on success. If this is a structure or list containing
     *            variables, the variables will be materialized in the result.
     * @return a deep copy of {@code args} for the first solution; null on failure.
     */
    public Term[] once(String pkg, String functor, Term... args) {
        setPredicate(pkg, functor, args);
        setResultTemplate(args);
        return (Term[]) (run(1) ? this.resBuffer.get(0) : null);
    }

    /**
     * Execute a function and return all solutions.
     *
     * @param pkg
     *            package the functor is declared in. Typically "user".
     * @param functor
     *            a prolog predicate to execute.
     * @param arg
     *            argument to pass in, and template to return the result with. If
     *            this is an {@link VariableTerm} the value will be saved and
     *            returned on success. If this is a structure or list containing
     *            variables, the variables will be materialized in the result.
     * @return a deep copy of {@code arg} for each solution found. Empty list if
     *         there are no solutions.
     */
    public List<Term> all(String pkg, String functor, Term arg) {
        setPredicate(pkg, functor, arg);
        setResultTemplate(arg);
        run(Integer.MAX_VALUE);
        return this.resBuffer;
    }

    /**
     * Execute a function and return all solutions.
     *
     * @param pkg
     *            package the functor is declared in. Typically "user".
     * @param functor
     *            a prolog predicate to execute.
     * @param args
     *            argument to pass in, and template to return the result with. If
     *            this is an {@link VariableTerm} the value will be saved and
     *            returned on success. If this is a structure or list containing
     *            variables, the variables will be materialized in the result.
     * @return a deep copy of {@code args} for each solution found. Empty list if
     *         there are no solutions.
     */

    public List<Term[]> all(String pkg, String functor, Term... args) {
        setPredicate(pkg, functor, args);
        setResultTemplate(args);
        run(Integer.MAX_VALUE);
        return this.resBuffer;
    }

    private void setResultTemplate(Term t) {
        this.resTemplate = new Term[] { t };
        this.resSingle = true;
    }

    private void setResultTemplate(Term[] t) {
        this.resTemplate = t;
        this.resSingle = false;
    }

    /**
     * Execute until the limit is reached.
     *
     * @param newLimit
     *            maximum number of results. Set to 1 if only a single attempt is
     *            required.
     * @return true if at least one result was discovered; false if there are no
     *         solutions to the predicate.
     */
    private boolean run(int newLimit) {
        this.resLimit = newLimit;
        this.resBuffer = new ArrayList(Math.min(newLimit, 16));
        this.engineStopped = (this.resLimit <= this.resBuffer.size());
        executePredicate();
        return 0 < this.resBuffer.size();
    }

    @Override
    public boolean isEngineStopped() {
        return this.engineStopped || this.resLimit <= this.resBuffer.size();
    }

    @Override
    protected void success() {
        Term[] r = new Term[this.resTemplate.length];
        for (int i = 0; i < this.resTemplate.length; i++) {
            r[i] = this.engine.copy(this.resTemplate[i]);
        }
        this.resBuffer.add(this.resSingle ? r[0] : r);
        this.engineStopped = (this.resLimit <= this.resBuffer.size());
        if (this.engineStopped) {
            throw new StopEngineException("success");
        }
    }

    @Override
    protected void fail() {
        this.resLimit = 0;
        this.engineStopped = (this.resLimit <= this.resBuffer.size());
        if (this.engineStopped) {
            throw new StopEngineException("failure");
        }
    }
}
