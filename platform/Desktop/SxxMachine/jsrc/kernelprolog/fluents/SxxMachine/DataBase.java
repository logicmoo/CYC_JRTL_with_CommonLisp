package SxxMachine;

import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import SxxMachine.pterm.Clause;
import SxxMachine.pterm.Parser;
import SxxMachine.pterm.TermData;

/**
 * Implements a Term and Clause objects based blackboard (database).
 */
public class DataBase extends BlackBoard {

    public DataBase(HashMap map) {
        super(map);
    }

    private static Functor yes = Prolog.aYes;

    private static Functor no = Prolog.aNo;

    /**
     * Removes a matching Term from the blackboards and signals failure if no such
     * term is found.
     */
    public Term cin(String k, Term pattern) {
        Term found = take(k, pattern);
        // if(found!=null) {
        // found=found.matching_copy(pattern);
        // }
        if (found == null)
            found = no;
        else
            found = TermData.S("the", found.copy());
        return found;
    }

    /**
     * Adds a Term to the blackboard
     */
    public Term out(String k, Term pattern, boolean copying) {
        add(k, copying ? pattern.copy() : pattern);
        return yes;
    }

    /**
     * Adds a copy of a Term to the blackboard
     */

    // synchronized
    public Term out(String key, Term pattern) {
        return out(key, pattern, true); // copies pattern
    }

    private void all0(int max, ArrayList To, String k, Term FXs) {
        if (0 == max)
            max = -1;
        O1Queue Q = (O1Queue) get(k);
        if (Q == null)
            return;
        // todo: use always the same "server's" trail
        for (Iterator e = Q.toEnumeration(); e.hasNext();) {
            Term t = (Term) e.next();
            if (null == t)
                break;
            t = t.matching_copy(FXs);
            if (t != null && 0 != max--)
                To.add(t);
        }
    }

    private Term all1(int max, Term FXs) {
        ArrayList<Term> To = new ArrayList<Term>();
        for (Iterator e = keySet().iterator(); e.hasNext();) {
            all0(max, To, (String) e.next(), FXs);
        }
        Object O = To.toArray(new Term[0]);
        Term R = TermData.S("$", (Term[]) O);
        // IO.mes("RR"+R);
        // To.copyInto(R.args);
        return TermData.asCons(R.listify()).arg0(1);
    }

    private Term all2(int max, String k, Term FXs) {
        if (k == null) {
            // IO.mes("expensive operation: all/2 with unknown key");
            return all1(max, FXs);
        }
        ArrayList To = new ArrayList();
        all0(max, To, k, FXs);
        if (To.size() == 0)
            return Prolog.Nil;
        Nonvar R = TermData.S("$", (Term[]) To.toArray());
        // To.copyInto(R.args);
        Term T = TermData.asCons(R.listify()).arg0(1);
        return T;
    }

    /**
     * Returns a (possibly empty) list of matching Term objects
     */
    public Term all(String k, Term FX) {
        FX = all2(0, k, FX);
        return FX;
    }

    /**
     * Gives an Iterator view to the O1Queue of Term or Clause objects stored at key
     * k
     *
     * @see O1Queue
     * @see Term
     * @see Clause
     */
    @Override
    public Iterator toEnumerationFor(String k) {
        Iterator E = super.toEnumerationFor(k);
        return E;
    }

    public Iterator toEnumerationFor(Term first) {
        return toEnumerationFor(first.getFAKey());
    }

    /**
     * Returns a formatted String representation of this PrologBlackboard object
     */
    public String pprint() {
        StringBuffer s = new StringBuffer(name());
        Iterator e = keySet().iterator();
        while (e.hasNext()) {
            s.append(pred_to_string((String) e.next()));
            s.append("\n");
        }
        return s.toString();
    }

    public String pred_to_string(String key) {
        O1Queue Q = (O1Queue) get(key);
        if (null == Q)
            return null;
        Iterator e = Q.toEnumeration();
        StringBuffer s = new StringBuffer("% " + key + "\n\n");
        while (e.hasNext()) {
            s.append(((Term) e.next()).pprint());
            s.append(".\n");
        }
        s.append("\n");
        return s.toString();
    }

    /**
     * consults or reconsults a Prolog file by adding or overriding existing
     * predicates to be extended to load from URLs transparently
     */
    static public boolean fromFile(String f, boolean overwrite) {
        IO.trace("last consulted file was: " + lastFile);
        boolean ok = fileToProg(f, overwrite);
        if (ok) {
            IO.trace("last consulted file set to: " + f);
            lastFile = f;
        } else
            IO.errmes("error in consulting file: " + f);
        return ok;
    }

    /**
     * reconsults a file by overwritting similar predicates in memory
     */
    static public boolean fromFile(String f) {
        return fromFile(f, true);
    }

    private static String lastFile = Init.default_lib;

    /**
     * reconsults the last reconsulted file
     */
    static public boolean fromFile() {
        IO.println("begin('" + lastFile + "')");
        boolean ok = fromFile(lastFile);
        if (ok)
            IO.println("end('" + lastFile + "')");
        return ok;
    }

    static private boolean fileToProg(String namef, boolean overwrite) {
        Reader sname = IO.toFileReader(namef);
        if (null == sname)
            return false;
        return streamToProg(namef, sname, overwrite);
    }

    /**
     * Reads a set of clauses from a stream and adds them to the blackboard.
     * Overwrites old predicates if asked to. Returns true if all went well.
     */
    static public boolean streamToProg(Reader sname, boolean overwrite) {
        return streamToProg(sname.toString(), sname, overwrite);
    }

    @Override
    public DataBase toClone() {
        HashMap map2 = new HashMap();
        DataBase other = new DataBase(map2);
        map.putAll(map2);
        return other;
    }

    static private boolean streamToProg(String fname, Reader sname, boolean overwrite) {
        try {
            BlackBoard ktable = overwrite ? (BlackBoard) Init.default_db.toClone() : null;
            // Clause Err=new Clause(new Const("error"),new Var());
            Parser p = new Parser(sname);
            apply_parser(p, fname, ktable);
        } catch (Exception e) { // already catched by readClause
            IO.errmes("unexpected error in streamToProg", e);
            return false;
        }
        return true;
    }

    static private void apply_parser(Parser p, String fname, BlackBoard ktable) {
        for (;;) {
            if (p.atEOF())
                return;
            int begins_at = p.lineno();
            Clause C = p.readClause();
            if (null == C)
                return;
            if (Parser.isError(C))
                Parser.showError(C);
            else {
                // IO.mes("ADDING= "+C.pprint());
                processClause(C, ktable);
                C.setFile(fname, begins_at, p.lineno());
            }
        }
    }

    /**
     * adds a Clause to the joint Linda and Predicate table
     */
    static public void addClause(Clause C, HashDict ktable) {
        String k = C.getFAKey();
        // overwrites previous definitions
        if (null != ktable && null != ktable.get(k)) {
            ktable.remove(k);
            Init.default_db.remove(k);
        }
        Init.default_db.out(k, C, false);
    }

    /**
     * adds a Clause to the joint Linda and Predicate table
     *
     * @see Clause
     */
    static public void processClause(Clause C, HashDict ktable) {
        if (C.getHead().matches(TermData.SYM("init"))) {
            // IO.mes("init: "+C.getBody());
            Prog.firstSolution(C.getHead(), C.getBody());
        } else {
            // IO.mes("ADDING= "+C.pprint());
            addClause(C, ktable);
        }
    }

}
