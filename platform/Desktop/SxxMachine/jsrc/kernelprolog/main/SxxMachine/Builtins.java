package SxxMachine;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import SxxMachine.pterm.Clause;
import SxxMachine.pterm.Sink;
import SxxMachine.pterm.Source;
import SxxMachine.pterm.TermData;

/**
 * This class contains a dictionary of all builtins i.e. Java based classes
 * callable from Prolog. They should provide a constructor and an exec method.
 *
 * @author Paul Tarau
 */
public class Builtins extends HashDict {

    // static class STermUnused implements ISTerm {
    // Term[] argz;
    //
    // STermUnused(ExecProg ep, Term[] args) {
    // exp = ep;
    // argz = args;
    // }
    //
    // }

    private static final Map builtinsMap = new HashMap();

    /**
     * This constructor registers builtins. Please put a header here if you add a
     * builtin at the bottom of this file.
     */
    public Builtins() {
        super(builtinsMap);
        // add a line here for each new builtin

        // basics
        registerBI(new is_builtin());
        registerBI(Prolog.True, true_.class);
        registerBI(Prolog.aFail, fail_.class);
        registerBI(new halt());
        registerBI(new compute());

        // I/O and trace related
        registerBI(new get_stdin());
        registerBI(new get_stdout());
        registerBI(new set_max_answers());
        registerBI(new set_trace());
        registerBI(new stack_dump());
        registerBI(new consult());
        registerBI(new reconsult());
        registerBI(new reconsult_again());

        // database
        registerBI(new at_key());
        registerBI(new pred_to_string());
        registerBI(new db_to_string());

        registerBI(new new_db());
        registerBI(new get_default_db());
        registerBI(new db_remove());
        registerBI(new db_add());
        registerBI(new db_collect());
        registerBI(new db_source());

        // data structure builders/converters
        registerBI(new arg());
        registerBI(new new_fun());
        registerBI(new get_arity());
        registerBI(new name_to_chars());
        registerBI(new chars_to_name());
        registerBI(new numbervars());

        // fluent constructors
        registerBI(new unfolder_source());
        registerBI(new answer_source());

        registerBI(new source_list());
        registerBI(new list_source());

        registerBI(new term_source());
        registerBI(new source_term());

        registerBI(new integer_source());
        registerBI(new source_loop());

        // Fluent Modifiers

        registerBI(new set_persistent());
        registerBI(new get_persistent());

        // Input Sources
        registerBI(new file_char_reader());
        registerBI(new char_file_writer());

        registerBI(new file_clause_reader());
        registerBI(new clause_file_writer());

        // writable Sinks
        registerBI(new term_string_collector());
        registerBI(new term_collector());

        registerBI(new string_char_reader());
        registerBI(new string_clause_reader());

        // fluent controllers
        registerBI(new getfl());
        registerBI(new putfl());
        registerBI(new stop());
        registerBI(new collect());

        // fluent combinators
        registerBI(new split_source());
        registerBI(new merge_sources());
        // see compose_sources,append_sources,merge_sources in lib.pro

        // discharges a Source to a Sink
        registerBI(new discharge());

        // OS and process interface
        registerBI(new system());
        registerBI(new ctime());
    }

    /**
     * registers a symbol as name of a builtin
     */
    public void registerBI(NameArity proto) {
        String key = proto.getFAKey();
        try {
            Method m = proto.getClass().getDeclaredMethod("st_exec", Prog.class, ISTerm.class);
            // IO.mes("registering builtin: "+key);
            this.put(key, m);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void registerBI(NameArity proto, Class c) {
        String key = proto.getFAKey();
        try {
            Method m = c.getDeclaredMethod("st_exec", Prog.class, ISTerm.class);
            // IO.mes("registering builtin: "+key);
            this.put(key, m);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Creates a new builtin
     */
    public Nonvar asBuiltin(NameArity S) {
        Method b = getBuiltin(S);
        if (b != null) {
            b.setAccessible(true);
            S.setMethod(b);
        }
        return (Nonvar) S;
    }

    /**
     * @param S
     * @return
     */
    public Method getBuiltin(NameArity S) {
        String key = S.getFAKey();
        Method b = (Method) this.get(key);
        return b;
    }

    public static Nonvar toConstBuiltin(NameArity c) {
        if (c.fname().length() == 0)
            return (Nonvar) c;
        if (c.fname().equals(Prolog.Nil.fname()))
            return (Nonvar) Prolog.Nil;
        if (c.fname().equals(Prolog.aNo.fname()))
            return (Nonvar) Prolog.aNo;
        if (c.fname().equals(Prolog.aYes.fname()))
            return (Nonvar) Prolog.aYes;

        Nonvar B = Init.builtinDict.asBuiltin(c);
        if (null == B) {
            // IO.mes("not a builtin:"+this);
            return (Nonvar) c;
        }
        return B;
    }

    public static Term toFunBuiltin(Compound f) {
        if (f.fname().equals(":-") && f.arityOrType() == 2) {
            return new Clause(f.car(), f.cdr());
        }
        if (f.fname().equals(",") && f.arityOrType() == 2) {
            return TermData.AND(f.car(), f.cdr());
        }
        final Nonvar asBuiltin = Init.builtinDict.asBuiltin((NameArity)f);
        Term B = (Compound) asBuiltin.asStructureTerm();
        if (null == B)
            return f;
        //B = B.toClone();
        // B.Arguments = f.Arguments;
        return B;
    }

    public static Method getBuiltin(Compound f) {
        return Init.builtinDict.getBuiltin((NameArity) f);
    }

} // end Builtins

// Code for actual kernel Builtins:
// add your own builtins in UserBuiltins.java, by cloning the closest example:-)

/**
 * checks if something is a builtin
 */
final class is_builtin extends FunBuiltin {
    is_builtin() {
        super("is_builtin", 1);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        return thiz.ArgDeRef(0).isBuiltin() ? 1 : 0;
    }
}

/**
 * does its best to halt the program:-)
 */
final class halt extends ConstBuiltin {
    halt() {
        super("halt");
    }

    static public int st_exec(Prog p, ISTerm thiz) {
        Runtime.getRuntime().exit(0);
        return 1;
    }
}

/**
 * Calls an external program
 */
final class system extends FunBuiltin {
    system() {
        super("system", 1);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        String cmd = TermData.asConst(thiz.ArgDeRef(0)).fname();
        return IO.system(cmd);
    }
}

/**
 * opens a reader returning the content of a file char by char
 */
final class file_char_reader extends FunBuiltin {
    file_char_reader() {
        super("file_char_reader", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        Term I = thiz.ArgDeRef(0);
        Fluent f;
        if (I.isCharReader())
            f = new CharReader(TermData.asCharReader(I).reader, p);
        else {
            String s = TermData.asConst(I).fname();
            f = new CharReader(s, p);
        }
        return thiz.unifyArg(1, f, p);
    }
}

/**
 * opens a reader returning clauses from a file
 */
final class file_clause_reader extends FunBuiltin {
    file_clause_reader() {
        super("file_clause_reader", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        Term I = thiz.ArgDeRef(0);
        Fluent f;
        if (I.isCharReader())
            f = new ClauseReader(TermData.asCharReader(I).reader, p);
        else {
            String s = TermData.asConst(thiz.ArgDeRef(0)).fname();
            f = new ClauseReader(s, p);
        }
        return thiz.unifyArg(1, f, p);
    }
}

/**
 * opens a writer which puts characters to a file one by one
 */
final class char_file_writer extends FunBuiltin {
    char_file_writer() {
        super("char_file_writer", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        String s = TermData.asConst(thiz.ArgDeRef(0)).fname();
        Fluent f = new CharWriter(s, p);
        return thiz.unifyArg(1, f, p);
    }
}

/**
 * opens a writer which puts characters to a file one by one
 */
final class clause_file_writer extends FunBuiltin {
    clause_file_writer() {
        super("clause_file_writer", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        String s = TermData.asConst(thiz.ArgDeRef(0)).fname();
        Fluent f = new ClauseWriter(s, p);
        return thiz.unifyArg(1, f, p);
    }
}

/**
 * get the standard output (a reader)
 */
final class get_stdin extends FunBuiltin {
    get_stdin() {
        super("get_stdin", 1);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        return thiz.unifyArg(0, new ClauseReader(p), p);
    }
}

/**
 * get standard output (a writer)
 */
final class get_stdout extends FunBuiltin {
    get_stdout() {
        super("get_stdout", 1);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        return thiz.unifyArg(0, new ClauseWriter(p), p);
    }
}

/**
 * gets an arity for any term: n>0 for f(A1,...,An) 0 for a constant like a -1
 * for a variable like X -2 for an integer like 13 -3 for real like 3.14 -4 for
 * a wrapped JavaObject;
 *
 * @see Term#getArity
 */
final class get_arity extends FunBuiltin {
    get_arity() {
        super("get_arity", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        NumberTerm N = TermData.Integer(thiz.ArgDeRef(0).arityOrType());
        return thiz.unifyArg(1, N, p);
    }
}

/**
 * Dumps the current Java Stack
 */
final class stack_dump extends FunBuiltin {

    stack_dump() {
        super("stack_dump", 1);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        String s = thiz.ArgDeRef(0).pprint();
        IO.errmes("User requested dump", (new Exception(s)));
        return 1;
    }
}

/**
 * returns the real time spent up to now
 */
final class ctime extends FunBuiltin {

    ctime() {
        super("ctime", 1);
    }

    private final static long t0 = System.currentTimeMillis();

    static public int st_exec(Prog p, ISTerm thiz) {

        Term T = Long(System.currentTimeMillis() - t0);
        return thiz.unifyArg(0, T, p);
    }
}

/**
 * sets max answer counter for toplevel query if == 0, it will prompt the user
 * for more answers if > 0 it will not print more than IO.maxAnswers if < 0 it
 * will print them out all
 */
final class set_max_answers extends FunBuiltin {
    set_max_answers() {
        super("set_max_answers", 1);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        IO.maxAnswers = thiz.getIntArg(0);
        return 1;
    }
}

/**
 * reconsults a file of clauses while overwriting old predicate definitions
 *
 * @see consult
 *
 */

final class reconsult extends FunBuiltin {
    reconsult() {
        super("reconsult", 1);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        Term a = thiz.ArgDeRef(0);
        String f = TermData.asConst(a).fname();
        return DataBase.fromFile(f) ? 1 : 0;
    }
}

/**
 * consults a file of clauses while adding clauses to existing predicate
 * definitions
 *
 * @see reconsult
 */
final class consult extends FunBuiltin {
    consult() {
        super("consult", 1);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        String f = TermData.asConst(thiz.ArgDeRef(0)).fname();
        IO.trace("consulting: " + f);
        return DataBase.fromFile(f, false) ? 1 : 0;
    }
}

/**
 * shorthand for reconsulting the last file
 */
final class reconsult_again extends ConstBuiltin {
    reconsult_again() {
        super("reconsult_again");
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        return DataBase.fromFile() ? 1 : 0;
    }
}

/**
 * gets default database
 */
final class get_default_db extends FunBuiltin {
    get_default_db() {
        super("get_default_db", 1);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        return thiz.unifyArg(0, TermData.FFIObject(Init.default_db), p);
    }
}

// databse operations

/**
 * creates new database
 */
final class new_db extends FunBuiltin {
    new_db() {
        super("new_db", 1);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        return thiz.unifyArg(0, TermData.FFIObject(new DataBase(new HashMap())), p);
    }
}

/**
 * Puts a term on the local blackboard
 */
final class db_add extends FunBuiltin {

    db_add() {
        super("db_add", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        DataBase db = (DataBase) (thiz.ArgDeRef(0)).toObject();
        Term X = thiz.ArgDeRef(1);
        // IO.mes("X==>"+X);
        String key = X.getFAKey();
        // IO.mes("key==>"+key);
        if (null == key)
            return 0;
        db.out(key, X);
        // IO.mes("res==>"+R);
        return 1;
    }
}

/**
 * removes a matching term if available, fails otherwise
 */
final class db_remove extends FunBuiltin {

    db_remove() {
        super("db_remove", 3);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        DataBase db = (DataBase) (thiz.ArgDeRef(0)).toObject();
        Term X = thiz.ArgDeRef(1);
        Term R = db.cin(X.getFAKey(), X);
        return thiz.unifyArg(2, R, p);
    }
}

/**
 * collects all matching terms in a (possibly empty) list
 *
 * @see out
 * @see in
 */
final class db_collect extends FunBuiltin {

    db_collect() {
        super("db_collect", 3);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        DataBase db = (DataBase) (thiz.ArgDeRef(0)).toObject();
        Term X = thiz.ArgDeRef(1);
        Term R = db.all(X.getFAKey(), X);
        return thiz.unifyArg(2, R, p);
    }
}

/**
 * Maps a DataBase to a Source enumerating its elements
 */
final class db_source extends FunBuiltin {

    db_source() {
        super("db_source", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        DataBase db = (DataBase) (thiz.ArgDeRef(0)).toObject();
        Source S = new IterableSource(db.toEnumeration(), p);
        return thiz.unifyArg(1, S, p);
    }
}

/**
 * collects all matching terms in a (possibly empty) list
 */
final class at_key extends FunBuiltin {

    at_key() {
        super("at_key", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        Term R = Init.default_db.all(thiz.ArgDeRef(0).getFAKey(), TermData.V());
        return thiz.unifyArg(1, R, p);
    }
}

/**
 * Returns a representation of predicate as a string constant
 */
final class pred_to_string extends FunBuiltin {

    pred_to_string() {
        super("pred_to_string", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        String key = thiz.ArgDeRef(0).getFAKey();
        String listing = Init.default_db.pred_to_string(key);
        if (null == listing)
            return 0;
        Nonvar R = (Nonvar) TermData.SYM(listing);
        return thiz.unifyArg(1, R, p);
    }
}

/**
 * lists all the local blackboard to a string (Linda terms + clauses)
 */
final class db_to_string extends FunBuiltin {
    db_to_string() {
        super("db_to_string", 1);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        final String pprint = Init.default_db.pprint();
        final Term sym = TermData.createAtomic(pprint);
        return thiz.unifyArg(0, sym, p);
    }
}

/**
 * arg(I,Term,X) unifies X with the I-the argument of functor T
 */
final class arg extends FunBuiltin {
    arg() {
        super("arg", 3);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        int i = thiz.getIntArg(0);
        Term F = thiz.ArgDeRef(1);
        Term A = (i == 0) ? TermData.SYM(F.fname()) : ((i == -1) ? TermData.Integer(F.arityOrType()) : F.args()[i - 1]);
        return thiz.unifyArg(2, A, p);
    }
}

/**
 * new_fun(F,N,T) creates a term T based on functor F with arity N and new free
 * varables as arguments
 */
final class new_fun extends FunBuiltin {
    new_fun() {
        super("new_fun", 3);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        String s = TermData.asConst(thiz.ArgDeRef(0)).fname();
        int i = thiz.getIntArg(1);
        Term T;
        if (i == 0)
            T = Builtins.toConstBuiltin(TermData.SYM(s));
        else {
            Compound F = TermData.S(s);
            F.init(i);
            T = Builtins.toFunBuiltin(F);
        }
        return thiz.unifyArg(2, T, p);
    }
}

/**
 * converts a name to a list of chars
 */
final class name_to_chars extends FunBuiltin {
    name_to_chars() {
        super("name_to_chars", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        Term Cs = ((Nonvar) thiz.ArgDeRef(0)).toChars();
        return thiz.unifyArg(1, Cs, p);
    }
}

/**
 * converts a name to a list of chars
 */
final class chars_to_name extends FunBuiltin {
    chars_to_name() {
        super("chars_to_name", 3);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        int convert = thiz.getIntArg(0);
        final Nonvar argDeRef = (Nonvar) thiz.ArgDeRef(1);
        String s = TermData.charsToString(argDeRef);
        Nonvar T = (Nonvar) TermData.SYM(s);
        if (convert > 0) {
            try {
                double r = Double.valueOf(s).doubleValue();
                T = TermData.NarrowDouble(r);
            } catch (NumberFormatException e) {
            }
        }
        return thiz.unifyArg(2, T, p);
    }

}

/**
 * returns a copy of a Term with variables uniformly replaced with constants
 */
final class numbervars extends FunBuiltin {
    numbervars() {
        super("numbervars", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        Term T = thiz.ArgDeRef(0).numbervars();
        return thiz.unifyArg(1, T, p);
    }
}

/**
 * Performs simple arithmetic operations like compute('+',1,2,Result)
 */
final class compute extends FunBuiltin {
    compute() {
        super("compute", 4);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        Term o = thiz.ArgDeRef(0);
        Term a = thiz.ArgDeRef(1);
        Term b = thiz.ArgDeRef(2);
        if (!(o.isConst()) || !(a.isNumber()) || !(b.isNumber()))
            IO.errmes("bad arithmetic operation (" + o + "): " + a + "," + b + "\nprog: " + p.toString());
        String opname = TermData.asConst(o).fname();
        double x = a.doubleValue();
        double y = b.doubleValue();
        double r;
        char op = opname.charAt(0);
        switch (op) {
            case '+':
                r = x + y;
                break;
            case '-':
                r = x - y;
                break;
            case '*':
                r = x * y;
                break;
            case '/':
                r = x / y;
                break;
            case ':':
                r = (int) (x / y);
                break;
            case '%':
                r = x % y;
                break;
            case '?':
                r = (x < y) ? (-1) : (x == y ? 0 : 1);
                break; // compares!
            case 'p':
                r = Math.pow(x, y);
                break;
            case 'l':
                r = Math.log(y) / Math.log(x);
                break;
            case 'r':
                r = x * Math.random() + y;
                break;
            case '<':
                r = (long) x << (long) y;
                break;
            case '>':
                r = (long) x >> (long) y;
                break;

            default:
                IO.errmes("bad arithmetic operation <" + op + "> on " + x + " and " + y);
                return 0;
        }
        Term R = TermData.NarrowDouble(r);
        return thiz.unifyArg(3, R, p);
    }
}

/**
 * controls trace levels for debugging
 */
final class set_trace extends FunBuiltin {
    set_trace() {
        super("set_trace", 1);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        Prog.tracing = thiz.getIntArg(0);
        return 1;
    }
}

/**
 * Explores a finite iterator and return its successive values as a list.
 */

final class source_list extends FunBuiltin {
    source_list() {
        super("source_list", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        Source S = (Source) thiz.ArgDeRef(0);
        Term Xs = S.toList();
        return thiz.unifyArg(1, Xs, p);
    }
}

/**
 * maps a List to a Source
 */
final class list_source extends FunBuiltin {

    list_source() {
        super("list_source", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        Source E = new ListSource((Nonvar) thiz.ArgDeRef(0), p);
        return thiz.unifyArg(1, E, p);
    }
}

/**
 * maps a Term to a Source
 */
final class term_source extends FunBuiltin {

    term_source() {
        super("term_source", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        TermSource E = new TermSource((Nonvar) thiz.ArgDeRef(0), p);
        return thiz.unifyArg(1, E, p);
    }
}

/**
 * Creates an Integer Source which advances at most Fuel (infinite if Fule==0)
 * Steps computing each time x:= a*x+b. Called as:
 * integer_source(Fuel,A,X,B,NewSource)
 */
final class integer_source extends FunBuiltin {

    integer_source() {
        super("integer_source", 5);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        IntegerSource E = new IntegerSource(TermData.asInt(thiz.ArgDeRef(0)).longValue(),
                TermData.asInt(thiz.ArgDeRef(1)).longValue(), TermData.asInt(thiz.ArgDeRef(2)).longValue(),
                TermData.asInt(thiz.ArgDeRef(3)).longValue(), p);
        return thiz.unifyArg(4, E, p);
    }
}

/**
 * Builds a Looping Source from a Source.
 */
final class source_loop extends FunBuiltin {
    source_loop() {
        super("source_loop", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        Source s = (Source) thiz.ArgDeRef(0);
        return thiz.unifyArg(1, new SourceLoop(s, p), p);
    }
}

/**
 * Builds a Source from a Term
 */
final class source_term extends FunBuiltin {

    source_term() {
        super("source_term", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        Source S = (Source) thiz.ArgDeRef(0);
        Term Xs = Builtins.toFunBuiltin(TermData.asStruct(S.toFun()));
        return thiz.unifyArg(1, Xs, p);
    }
}

// Solvers and iterators over clauses

/**
 * When called as answer_source(X,G,R), it builds a new clause and maps it to an
 * AnswerSource LD-resolution interpreter which will return one answer at a time
 * of the form "the(X)" using G as initial resolvent and "no" when no more
 * answers are available.
 */
final class answer_source extends FunBuiltin {
    answer_source() {
        super("answer_source", 3);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        Clause goal = new Clause(thiz.ArgDeRef(0), thiz.ArgDeRef(1));
        Prog U = new Prog(goal, p);
        return thiz.unifyArg(2, U, p);
    }
}

/**
 * Builds a new clause H:-B and maps it to an iterator
 */
final class unfolder_source extends FunBuiltin {
    unfolder_source() {
        super("unfolder_source", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        Clause goal = thiz.ArgDeRef(0).toClause();
        Prog newp = new Prog(goal, p);
        Unfolder S = new Unfolder(goal, newp);
        return thiz.unifyArg(1, S, p);
    }
}

/**
 * generic Source advancement step, similar to an iterator's nextElement
 * operation, gets one element from the Source
 */

final class getfl extends FunBuiltin {
    getfl() {
        super("getfl", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        // IO.mes("<<"+thiz.ArgNoDeRef(0)+"\n"+p+p.getTrail().pprint());
        Term t = thiz.ArgDeRef(0);
        Source S = t.asSource();
        Term A = TermData.the(S.getElement());
        // if(null==A) A=Nonvar.aNo;
        // else A=new Fun("the",A);
        // IO.mes(">>"+A+"\n"+p+p.getTrail().pprint());
        return thiz.unifyArg(1, A, p);
    }
}

/**
 * generic Sink advancement step, sends one element to the Sink
 */

final class putfl extends FunBuiltin {
    putfl() {
        super("putfl", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        Sink S = (Sink) thiz.ArgDeRef(0);
        Term X = thiz.ArgDeRef(1);
        if (0 == S.putElement(X)) {
            IO.errmes("error in putElement: " + X);
        }
        return 1;
    }
}

/**
 * frees a Fluent's resources and ensures it cannot produce/consume any new
 * values
 */
final class stop extends FunBuiltin {
    stop() {
        super("stop", 1);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        Fluent S = (Fluent) thiz.ArgDeRef(0);
        S.stop();
        return 1;
    }
}

/**
 * Splits a (finite) Source in two new ones which inherit the current state of
 * the parent.
 */
final class split_source extends FunBuiltin {
    split_source() {
        super("split_source", 3);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        Source original = (Source) thiz.ArgDeRef(0);
        Nonvar Xs = original.toList();
        return (thiz.unifyArg(1, CONS(Xs, p), p) > 0 && thiz.unifyArg(2, CONS(Xs, p), p) > 0) ? 1 : 0;
    }
}

/**
 * Merges all Sources contained in a List into one Source.
 */
final class merge_sources extends FunBuiltin {
    merge_sources() {
        super("merge_sources", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        Nonvar list = (Nonvar) thiz.ArgDeRef(0);
        return thiz.unifyArg(1, new SourceMerger(list, p), p);
    }
}

/**
 * Flushes to a Sink the content of a Source Fluent
 */
final class discharge extends FunBuiltin {
    discharge() {
        super("discharge", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        Source from = (Source) thiz.ArgDeRef(0);
        Sink to = (Sink) thiz.ArgDeRef(1);
        for (;;) {
            Term X = from.getElement();
            if (null == X) {
                to.stop();
                break;
            } else
                to.putElement(X);
        }
        return 1;
    }
}

/**
 * Collects a reference to or the content of a Sink
 */

final class collect extends FunBuiltin {
    collect() {
        super("collect", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        Sink s = (Sink) thiz.ArgDeRef(0);
        Term X = s.collect();
        if (null == X)
            X = Prolog.aNo;
        else
            X = TermData.S("the", X);
        return thiz.unifyArg(1, X, p);
    }
}

/**
 * Builds a StringSink which concatenates String representations of Terms with
 * put/1 and the return their concatenation with collect/1
 */
final class term_string_collector extends FunBuiltin {
    term_string_collector() {
        super("term_string_collector", 1);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        return thiz.unifyArg(0, new StringSink(p), p);
    }
}

/**
 * Builds a TermCollector Sink which accumulates Terms with put/1 and the return
 * them with collect/1
 */
final class term_collector extends FunBuiltin {
    term_collector() {
        super("term_collector", 1);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        return thiz.unifyArg(0, new TermCollector(p), p);
    }
}

/**
 * Creates a char reader from a String.
 */
final class string_char_reader extends FunBuiltin {
    string_char_reader() {
        super("string_char_reader", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        return thiz.unifyArg(1, new CharReader(thiz.ArgDeRef(0), p), p);
    }
}

/**
 * Creates a clause reader from a String.
 */
final class string_clause_reader extends FunBuiltin {
    string_clause_reader() {
        super("string_clause_reader", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        return thiz.unifyArg(1, new ClauseReader(thiz.ArgDeRef(0), p), p);
    }
}

/**
 * set_persistent(Fluent,yes) makes a Fluent persistent - i.e. likely to keep
 * its state on backtracking. This assumes that the Fluent remains accessible by
 * being saved in a Database or as element of a Fluent with longer life span.
 *
 * set_persistent(Fluent,no) makes the Fluent perish on backtracking (default
 * behavior)
 */
final class set_persistent extends FunBuiltin {
    set_persistent() {
        super("set_persistent", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        Fluent F = (Fluent) thiz.ArgDeRef(0);
        Nonvar R = (Nonvar) thiz.ArgDeRef(1);
        boolean yesno = !R.equalsTerm(Prolog.aNo);
        F.setPersistent(yesno);
        return 1;
    }
}

/**
 * Gets the yes/no persistentcy value of a Fluent.
 */
final class get_persistent extends FunBuiltin {
    get_persistent() {
        super("get_persistent", 2);
    }

    static public int st_exec(Prog p, ISTerm thiz) {

        Fluent F = (Fluent) thiz.ArgDeRef(0);
        Term R = F.getPersistent() ? Prolog.aYes : Prolog.aNo;
        return thiz.unifyArg(1, R, p);
    }

}
