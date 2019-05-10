package SxxMachine;

import static SxxMachine.pterm.TermData.CONS;
import static SxxMachine.pterm.TermData.S;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.PushbackReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
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
public class PrologMain {
    /** Version information */
    public static final String VERSION = "Prolog Cafe 1.2.5 (mantis)";
    /** Copyright information */
    private static final String COPYRIGHT = "Copyright(C) 1997-2009 M.Banbara and N.Tamura";
    private static final String HEADER = "Prolog Cafe (" + COPYRIGHT + ")";

    public static void main(String argv[]) {
        try {
            System.err.println(HEADER);

            BlockingPrologControl p = new BlockingPrologControl();
            p.configureUserIO(System.in, System.out, System.err);
            p.setMaxDatabaseSize(InternalDatabase.DEFAULT_SIZE);

            List<File> toLoad = new ArrayList<>(4);
            long reductionLimit = Long.MAX_VALUE;
            Term goal = null;
            for (int i = 0; i < argv.length; i++) {
                String arg = argv[i];
                if (arg.equals("--enable-io")) {
                    p.setEnabled(Prolog.Feature.IO, true);
                } else if (arg.equals("--enable-statistics")) {
                    p.setEnabled(Prolog.Feature.STATISTICS_RUNTIME, true);
                } else if (arg.startsWith("--max-database-size=")) {
                    String v = arg.substring(arg.indexOf('=') + 1);
                    p.setMaxDatabaseSize(Integer.parseInt(v, 10));
                } else if (arg.startsWith("--reduction-limit=")) {
                    String v = arg.substring(arg.indexOf('=') + 1);
                    reductionLimit = Long.parseLong(v, 10);
                } else if (arg.equals("-f") && i + 1 < argv.length) {
                    toLoad.add(new File(argv[++i]));
                } else if (arg.startsWith("-")) {
                    usage();
                    exit(1);
                } else if (i == argv.length - 1) {
                    goal = parseAtomicGoal(arg);
                } else {
                    usage();
                    goal = null;// "cafeteria";
                    // exit(1);
                }
            }

            initializePackages(p, goal);
            for (File file : toLoad) {
                try (FileReader src = new FileReader(file);
                        BufferedReader buf = new BufferedReader(src);
                        PushbackReader in = new PushbackReader(buf, Prolog.PUSHBACK_SIZE)) {
                    Term path = TermData.createAtomic(file.getPath());
                    if (!p.execute(Prolog.BUILTIN, "consult_stream", path, TermData.FFIObject(in))) {
                        System.err.println();
                        System.err.flush();
                        System.exit(1);
                    }
                }
                System.err.println();
                System.err.flush();
            }

            if (goal == null) {
                System.err.println();
                System.err.flush();
                goal = S(TermData
                        .F(":", 2), new Term[] { TermData.SYM(Prolog.BUILTIN), TermData.createAtomic("cafeteria") });
            }

            p.setReductionLimit(reductionLimit);
            p.execute(Prolog.BUILTIN, "call", goal);
        } catch (HaltException e) {
            exit(e.getStatus());
        } catch (Exception e) {
            e.printStackTrace();
            exit(1);
        } catch (Throwable e) {
            e.printStackTrace();
            exit(2);
        }
    }

    private static void exit(int i) {
        System.exit(i);
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

            return S(TermData.F(":", 2), TermData.SYM("user"), TermData.createAtomic(st.nextToken()));
        } else if (i == 2) {
            return TermData.S(":", TermData.SYM(st.nextToken()), TermData.SYM(st.nextToken()));
        } else {
            return null;
        }
    }

    private static void initializePackages(BlockingPrologControl p, Term goal) {
        LinkedHashSet<String> set = new LinkedHashSet<>(3);
        set.add(Prolog.BUILTIN);
        set.add("user");
        if (goal != null) {
            set.add(goal.arg0(0).getString());
        }

        List<String> list = new ArrayList<>(set);
        Term done = TermData.SYM("true");
        Term head = Prolog.Nil;
        for (int i = list.size() - 1; 0 <= i; i--) {
            head = CONS(TermData.SYM(list.get(i)), head);
        }
        p.execute(Prolog.BUILTIN, "initialization", head, done);
        PredTable.runInits(p.engine);
    }

    private static void usage() {
        PrintStream e = System.err;
        e.println("usage:  java -jar cafeteria.jar [options] [goal]");
        e.println();
        e.println("  --enable-io           : enable file system access");
        e.println("  --enable-statistics   : enable statistics/2");
        e.println("  --max-database-size=N : maximum entries in dynamic database");
        e.println("  --reduction-limit=N   : max reductions during execution");
        e.println();
        e.println("   -f source.pl         : load file.pl  (may be repeated)");
        e.println();
        e.println("  goal :          predicate or package:predicate");
        e.println("                  (if not specified, runs interactive loop)");
    }
}
