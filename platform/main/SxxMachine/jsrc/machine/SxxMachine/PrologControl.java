package SxxMachine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.PushbackReader;
import java.util.Set;

import SxxMachine.pterm.HashtableOfTerm;
import SxxMachine.pterm.TermData;
import SxxMachine.pterm.TermData.StaticPred;

/**
 * Tracks current evaluation goal and results.
 * <p>
 * On success/1 or fail/1 the corresponding methods in this class are invoked,
 * allowing the implementation to message the results to the application. During
 * any reduction loops the {@link #isEngineStopped()} method is consulted to
 * determine if the loop should terminate.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.2
 */
public abstract class PrologControl {
    /** Holds a Prolog engine. */
    protected final Prolog engine;
    /** Holds a Prolog goal to be executed. */
    public Operation code;

    /** How many operations can be executed before exceeding cost limit. */
    private long reductionLimit = 1 << 20;
    private long reductionsUsed;

    private InputStream userInput = System.in;
    private PrintStream userOuput = System.out;

    private PrintStream userError = System.err;
    private int steps;

    /** Constructs a new <code>PrologControl</code>. */
    public PrologControl() {
        this.engine = new Prolog(this);
    }

    /** Constructs a new <code>PrologControl</code>. */
    public PrologControl(PrologMachineCopy pmc) {
        this.engine = new Prolog(this, pmc);
    }

    public PrologControl(Prolog pmc) {
        this.engine = pmc;
    }

    public boolean isEnabled(Prolog.Feature f) {
        return this.engine.features.contains(f);
    }

    public void setEnabled(Prolog.Feature f, boolean on) {
        if (on)
            this.engine.features.add(f);
        else
            this.engine.features.remove(f);
    }

    public void setEnabled(Set<Prolog.Feature> f, boolean on) {
        if (on)
            this.engine.features.addAll(f);
        else
            this.engine.features.removeAll(f);
    }

    /**
     * @param err
     *            stack trace to print (or log).
     */
    public void printStackTrace(Throwable err) {
        this.engine.getLogger().printStackTrace(err);
    }

    public void setUserInput(InputStream userInput) {
        this.userInput = userInput;
    }

    public void setUserOuput(PrintStream userOuput) {
        this.userOuput = userOuput;
    }

    public int getMaxDatabaseSize() {
        if (this.engine.internalDB != null)
            return this.engine.internalDB.maxContents;
        return InternalDatabase.DEFAULT_SIZE;
    }

    public void setMaxDatabaseSize(int size) {
        // if (this.engine.aregs != null)
        // throw new IllegalStateException("Prolog already initialized");
        if (this.engine.internalDB != null)
            this.engine.internalDB.maxContents = size;
        else
            this.engine.internalDB = new InternalDatabase(size);
    }

    public PrologClassLoader getPrologClassLoader() {
        if (this.engine.pcl == null)
            this.engine.pcl = new PrologClassLoader();
        return this.engine.pcl;
    }

    public void setPrologClassLoader(PrologClassLoader cl) {
        if (this.engine.AREGS != null)
            throw new IllegalStateException("Prolog already initialized");
        this.engine.pcl = cl;
    }

    public int getMaxArity() {
        return this.engine.getMaxArity();
    }

    public void setMaxArity(int max) {
        if (max < 8)
            throw new IllegalStateException("invalid arity " + max);
        if (this.engine.AREGS != null)
            throw new IllegalStateException("Prolog already initialized");
        this.engine.maxArity = max;
    }

    /**
     * Registers {@code user_input}, {@code user_output}, and {@code user_error}
     * streams.
     */
    public void configureUserIO(InputStream in, OutputStream out, OutputStream err) {
        if (this.engine.streamManager == null) {
            this.engine.streamManager = new HashtableOfTerm(7);
        }
        if (in != null) {
            this.engine.streamManager.put(TermData.SYM("user_input"), TermData.FFIObject(new PushbackReader(
                    new BufferedReader(new InputStreamReader(in)), Prolog.PUSHBACK_SIZE)));
        }
        if (out != null) {
            this.engine.streamManager.put(TermData.SYM("user_output"), TermData
                    .FFIObject(new PrintWriter(new BufferedWriter(new OutputStreamWriter(out)), true)));
        }
        if (err != null) {
            this.engine.streamManager.put(TermData.SYM("user_error"), TermData
                    .FFIObject(new PrintWriter(new BufferedWriter(new OutputStreamWriter(err)), true)));
        }
    }

    /**
     * Sets a goal and its arguments to this Prolog thread. An initial continuation
     * goal (a <code>Success</code> object) is set to the <code>cont</code> field of
     * goal <code>p</code> as continuation.
     */
    public void setPredicate(Operation operation) {
        ((Predicate) operation).cont = Success.SUCCESS;
        this.code = operation;
    }

    /**
     * Sets a goal <code>call(t)</code> to this Prolog thread. An initial
     * continuation goal (a <code>Success</code> object) is set to the
     * <code>cont</code> field of goal <code>p</code> as continuation.
     */
    public void setPredicate(String pkg, String functor, Term... args) {
        setPredicate(getPrologClassLoader().predicate(pkg, functor, args));
    }

    /**
     * Sets a goal <code>call(t)</code> to this Prolog thread. An initial
     * continuation goal (a <code>Success</code> object) is set to the
     * <code>cont</code> field of <code>call(t)</code> as continuation.
     */
    public void setPredicate(Term t) {
        setPredicate(Prolog.BUILTIN, "call", t);
    }

    /**
     * Is invoked when the system succeeds to find a solution.<br>
     *
     * This method is invoked from the initial continuation goal (a
     * <code>Success</code> object).
     */
    protected abstract void success();

    /** Is invoked after failure of all trials. */
    protected abstract void fail();

    /**
     * Check if evaluation should continue.
     * <p>
     * This method gets invoked on every predicate reduction. If the control class
     * wants to halt execution (for example sufficient results were obtained, or a
     * limit on running time or reduction count has been reached) the method must
     * return true to stop execution.
     *
     * @return true if the engine is no longer supposed to execute; false if another
     *         predicate reduction can take place.
     */
    public abstract boolean isEngineStopped();

    /**
     * Execute the predicate on the current thread.
     * <p>
     * This method does not return until {@link #isEngineStopped()} returns true.
     * Implementors of the class are expected to invoke this method to perform
     * evaluation, and terminate out of the loop at the proper time based on an
     * invocation to {@link #success()} or {@link #fail()}.
     *
     * @throws PrologException
     * @throws JavaInterruptedException
     */
    protected void executePredicate() {
        executePredicate(true);
    }

    // @SuppressWarnings("null")
    public void executePredicate(boolean isOutter) throws PrologException, JavaInterruptedException {
        Prolog engine = this.engine;
        PrologLogger logger = engine.getLogger();
        Operation code = this.code;
        Operation nextCode = this.code;
        System.err.flush();

        try {
            if (isOutter) {
                engine.init(this.userInput, this.userOuput, this.userError);
            }
            mainLoop: do {
                try {
                    do {
                        if (isOutter) {
                            code = insertPendingGoals(code);
                        }
                        if (!Prolog.BE_SAFE)
                            logger.beforeExec(code);
                        if (code == null) {
                            break;
                        }
                        engine.pred = code;
                        //code.toString();
                        nextCode = code.exec(engine);
                        if (!"off".equals(PrologFlags.current.getDebug())) {
                            Class c = code.getClass();
                            steps++;
                            if (c == StaticPred.class) {
                                System.err.println(" O: " + code);
                            } else {
                                if (!c.getName().contains("$$Lambda$")) {
                                    Class c2 = c.getDeclaringClass();
                                    c2 = c.getSuperclass();
                                    System.err.println(" CC: " + code);
                                }

                            }
                        }
                        if (nextCode == code || nextCode == null) {
                            break;
                        }
                        code = nextCode;
                    } while (true);
                } catch (StopEngineException see) {
                    see.printStackTrace();
                    return; // escape execution loop
                } catch (RuntimeException t) {
                    PrologException e = logger.execThrows(t);
                    final int b = engine.peekCatcherB();
                    if (b >= 0) {
                        engine.setException(engine.copy(e.getMessageTerm()));
                        engine.cut(b);
                        code = engine.fail(); // set next operation to execute
                        continue mainLoop;
                    } else {
                        t.printStackTrace();
                        throw e;
                    }
                }
                if (engine.halt > 0) {
                    throw new HaltException(engine.halt - 1);
                }
            } while (code != null);
        } finally {
            if (isOutter) {
                this.code = insertPendingGoals(code);
            } else {
                this.code = code;
            }

            if (isOutter) {
                TermData.gc();
                logger.close();
            }
        }
    }

    abstract public boolean execute(String pkg, String functor, Term... args);

    private Operation insertPendingGoals(Operation after) {
        // there are pending goals - deal with them
        // ExceptionRaised = 0;
        // Continuation c = new Continuation(Areg, GetArity(code), code);
        // Areg[0] = new StructureTerm("execpendinggoals".intern(), pendingGoals, c);
        // pendingGoals = SymbolTerm.intern("[]");
        // code = Prolog.Call1;

        if (engine.halt != 0)
            return after;
        Term pendingGoals = engine.popPendingGoals();
        if (pendingGoals == Prolog.Nil)
            return after;
        engine.push(new SxxMachine.sxxtensions.PopPendingGoals(engine, engine.pendingGoals));
        // code = Prolog.Call1;
        return insertCode(pendingGoals, after);
        // executePredicate(false);
    }

    private Operation insertCode(Term pendingGoals, Operation after) {
        if (pendingGoals == Prolog.Nil)
            return after;
        while (pendingGoals.isCons()) {
            Term goal = pendingGoals.car();
            after = insertCode(goal, after);
            pendingGoals = pendingGoals.cdr();
        }
        return new TermData.StaticPred("call", FILE_builtins::PRED_call_1_static_exec, TermData.VA(pendingGoals),
                after);
    }

    protected void executePredicate_goog() throws PrologException {
        Prolog engine = this.engine;
        Operation code = this.code;
        long reductionsRemaining = this.reductionLimit;
        try {
            // engine.init();

            do {
                if (isEngineStopped())
                    return;
                // if (--reductionsRemaining <= 0) throw new
                // ReductionLimitException(reductionLimit);
                code = code.exec(engine);
            } while (engine.halt == 0);

            if (engine.halt != 1) {
                throw new HaltException(engine.halt - 1);
            }
        } finally {
            this.reductionsUsed = this.reductionLimit - reductionsRemaining;
            this.code = code;
            TermData.gc();
        }
    }

    /** @return number of reductions used by execution. */
    public long getReductions() {
        return this.reductionsUsed;
    }

    /** Applies an upper limit on number of reductions. */
    public void setReductionLimit(long limit) {
        this.reductionLimit = Math.max(0, limit);
    }

    public void setUserError(PrintStream userError) {
        this.userError = userError;
    }

    public Object getExternalData(String key) {
        return this.engine.getExternalData(key);
    }

    public void setExternalData(String key, Object value) {
        this.engine.setExternalData(key, value);
    }

    public PrologLogger getLogger() {
        return engine.getLogger();
    }
}
