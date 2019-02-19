package SxxMachine;

import static SxxMachine.pterm.TermData.S;

import java.util.StringTokenizer;

import SxxMachine.pterm.TermData;

/**
 * Prolog Cafe launcher. The <code>PrologMain</code> class launchs the Prolog
 * Cafe system.<br>
 * The usage is as follows, where <code>package</code> is a package name, and
 * <code>predicate</code> is a predicate name (only atom).
 *
 * <pre>
 *   % java -cp $PLCAFEDIR/plcafe.jar SxxMachine.PrologMain package:predicate
 *   % java -cp $PLCAFEDIR/plcafe.jar SxxMachine.PrologMain predicate
 * </pre>
 *
 * Let us show a sample session for launching a small Prolog interpreter:
 * <code>SxxMachine:cafeteria/0</code>.<br>
 *
 * <pre>
 *    % java  -cp $PLCAFEDIR/plcafe.jar:$CLASSPATH SxxMachine.PrologMain SxxMachine:cafeteria
 *    Prolog Cafe X.X.X (YYY)
 *    Copyright(C) 1997-200X M.Banbara and N.Tamura
 *    | ?-
 * </pre>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class PrologMain2 {
    /** Version information */
    public static final String VERSION = "Prolog Cafe 1.2.5 (mantis)";
    /** Copyright information */
    public static final String COPYRIGHT = "Copyright(C) 1997-2009 M.Banbara and N.Tamura";

    public static void main(String argv[]) {
        BlockingPrologControl p;
        try {
            System.err.println("\n" + VERSION);
            System.err.println(COPYRIGHT);
            if (argv.length != 1) {
                usage();
                // exit(999);
                argv = new String[] { "cafeteria" };
            }
            Term arg1 = Prolog.Nil;
            arg1 = TermData.CONS(TermData.SYM("user"), arg1);
            arg1 = TermData.CONS(TermData.SYM(Prolog.BUILTIN), arg1);
            Term arg2 = parseAtomicGoal(argv[0]);
            if (arg2 == null) {
                usage();
                System.exit(1);
            }
            p = new BlockingPrologControl();
            p.setPredicate(Prolog.BUILTIN, "initialization", arg1, arg2);
            for (boolean r = p.call(); r; r = p.redo()) {
            }
            System.exit(0);
        } catch (HaltException e) {
            System.exit(e.getStatus());
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    /**
     * Returns a term for given string representation of atom goal, or
     * <code>null</code> if parsing fails.
     *
     * @param s
     *            a string representation of initial goal (ex. foge:main).
     * @return a term which corresponds to a given string, or <code>null</code> if
     *         parsing fails.
     */
    protected static Term parseAtomicGoal(String s) {
        StringTokenizer st = new StringTokenizer(s, ":");
        int i = st.countTokens();
        if (i == 1) {
            Term[] args = { TermData.SYM("user"), TermData.createAtomic(st.nextToken()) };
            return S(TermData.F(":", 2), args);
        } else if (i == 2) {
            Term[] args = { TermData.createAtomic(st.nextToken()), TermData.createAtomic(st.nextToken()) };
            return S(TermData.F(":", 2), args);
        } else {
            return null;
        }
    }

    /** Shows usage */
    protected static void usage() {
        String s = "Usage:\n";
        s += "java -cp $PLCAFEDIR/plcafe.jar";
        s += " SxxMachine.PrologMain package:predicate\n";
        s += "java -cp $PLCAFEDIR/plcafe.jar";
        s += " SxxMachine.PrologMain predicate\n";
        s += "    package:        package name\n";
        s += "    predicate:      predicate name (only atom)";
        System.out.println(s);
    }
}
