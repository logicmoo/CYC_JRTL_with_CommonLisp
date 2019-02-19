package SxxMachine;

import static SxxMachine.pterm.TermData.S;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import SxxMachine.pterm.TermData;

/**
 * Prolog class loader.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.1
 */
public class PrologClassLoader extends ClassLoader {

    static {
        Prolog.startLevel = 1;
        bootpreds.loadFile();
        sxxtensions.loadFile();
        FILE_builtins.loadPreds();
        FILE_cafeteria.loadPreds();
        FILE_io.loadPreds();
        FILE_swi_supp.loadPreds();
        FILE_system.loadPreds();
        FILE_animal_string.loadPreds();
        FILE_animal.loadPreds();

        //  FILE_dra.loadPreds();
        Prolog.startLevel = 2;
    }
    // private final static Logger logger =
    // Logger.getLogger(PrologClassLoader.class.getName());
    private final Map<Key, Operation> predicateCache = new ConcurrentHashMap<>();

    private static class NotFoundPredicate implements Operation {
        public NotFoundPredicate() {
        }

        @Override
        public Operation exec(Prolog engine) throws PrologException {
            return null;
        }
    }

    private final static Operation NOT_FOUND = new NotFoundPredicate();

    /**
     * Initialize using the {@link ClassLoader#getSystemClassLoader()}.
     */
    public PrologClassLoader() {
    }

    /**
     * Initialize using a specific parent ClassLoader.
     *
     * @param parent
     *            source for all predicates in this context.
     */
    public PrologClassLoader(ClassLoader parent) {
        super(parent);
    }

    /**
     * Check whether the predicate class for the given arguments is defined.
     *
     * @param pkg
     *            package name
     * @param functor
     *            predicate name
     * @param arity
     *            predicate arity
     * @return <code>true</code> if the predicate <code>pkg:functor/arity</code> is
     *         defined, otherwise <code>false</code>.
     */
    public boolean definedPredicate(String pkg, String functor, int arity) {
        try {
            return findPredicate(pkg, functor, arity) != NOT_FOUND;
        } catch (ClassNotFoundException cnfe) {
            return false;
        }
    }

    /**
     * Allocate a predicate and configure it with the specified arguments.
     *
     * @param pkg
     *            package the predicate is in.
     * @param functor
     *            name of the predicate.
     * @param args
     *            arguments to pass. The arity is derived from the arguments.
     * @return the predicate encapsulating the logic and the arguments.
     */
    public Operation predicate(String pkg, String functor, Term... args) {
        return predicate(pkg, functor, Success.SUCCESS, args);
    }

    /**
     * Allocate a predicate and configure it with the specified arguments.
     *
     * @param pkg
     *            package the predicate is in.
     * @param functor
     *            name of the predicate.
     * @param cont
     *            operation to execute if the predicate is successful. Usually this
     *            is {@link Success#SUCCESS}.
     * @param args
     *            arguments to pass. The arity is derived from the arguments.
     * @return the predicate encapsulating the logic and the arguments.
     */
    public Operation predicate(String pkg, String functor, Operation cont, Term... args) {
        int arity = args.length;
        try {
            Operation constructor = findPredicate(pkg, functor, arity);
            if (constructor != NOT_FOUND) {
                Predicate pred = new TermData.StaticPred(pkg + "::" + functor + "/" + arity, constructor, args, cont);
                return pred;
            }
        } catch (Exception cause) {
            if (cause instanceof RuntimeException) {
                cause.printStackTrace();
            }
            ExistenceException err2 = new ExistenceException("procedure", term(pkg, functor, arity), cause.toString());
            err2.initCause(cause);
            throw err2;
        }
        throw new ExistenceException("procedure", term(pkg, functor, arity), "NOT_FOUND");
    }

    private static Term term(String pkg, String functor, int arity) {
        return S(":", TermData.SYM(pkg), S("/", TermData.SYM(functor), TermData.Integer(arity)));
    }

    // private Constructor<? extends Predicate> getConstructor(String pkg, String functor, int arity) throws ClassNotFoundException {
    // Class<?> clazz = Class.forName(
    // encode(pkg, functor, arity),
    // false /* avoid resolve */,
    // this);
    //
    // if (!Predicate.class.isAssignableFrom(clazz)) {
    // throw new ClassNotFoundException(clazz.getName(),
    // new ClassCastException("Does not extend " + Predicate.class));
    // }
    //
    // Class[] params = new Class[arity + 1];
    // Arrays.fill(params, 0, arity, Term.class);
    // params[arity] = Operation.class;
    //
    // Constructor<? extends Predicate> cons;
    // try {
    //			cons = (Constructor<? extends Predicate>) clazz.getDeclaredConstructor(params);
    // } catch (NoSuchMethodException e) {
    //			throw new ClassNotFoundException("Wrong constructor on " + clazz.getName(), e);
    //
    // } catch (SecurityException e) {
    //			throw new ClassNotFoundException("Constructor not visible " + clazz.getName(), e);
    // }
    // cons.setAccessible(true);
    //
    // try {
    // Class.forName(clazz.getName(), true /* resolve now */, this);
    // } catch (ClassNotFoundException e) {
    //			throw new ClassNotFoundException("Cannot initialize " + clazz.getName(), e);
    //
    // } catch (RuntimeException e) {
    //			throw new ClassNotFoundException("Cannot initialize " + clazz.getName(), e);
    //
    // } catch (LinkageError e) {
    //			throw new ClassNotFoundException("Cannot initialize " + clazz.getName(), e);
    // }
    // return cons;
    // }
    private Operation findPredicate(String pkg, String functor, int arity) throws ClassNotFoundException {
        int paren = functor.indexOf("(");
        if (paren > 0) {
            functor = functor.substring(0, paren);
        }
        final Key key = new Key(pkg, functor, arity);
        Operation constructor = this.predicateCache.get(key);
        if (constructor == null) {
            constructor = getConstructor(pkg, functor, arity);
            if (constructor == null)
                throw new ClassNotFoundException("" + pkg + ":" + functor + "/" + arity + " " + key);
            this.predicateCache.put(key, constructor);
        }
        return constructor;
    }

    private Operation getConstructor(String pkg, String functor, int arity) {
        return PredTable.findPredicateOp(pkg, functor, arity);
    }

    public static final class Key {
        private final String pkg;
        private final String functor;
        private final int arity;

        Key(String pkg, String functor, int arity) {
            this.pkg = pkg;
            this.functor = functor;
            this.arity = arity;
        }

        @Override
        public int hashCode() {
            int h = this.pkg.hashCode();
            h = (h * 31) + this.functor.hashCode();
            h = (h * 31) + this.arity;
            return h;
        }

        @Override
        public boolean equals(Object other) {
            if (other instanceof Key) {
                Key b = (Key) other;
                return this.arity == b.arity && this.pkg.equals(b.pkg) && this.functor.equals(b.functor);
            }
            return false;
        }
    }
}
