package SxxMachine.pterm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import SxxMachine.Term;

/**
 * <code>Hashtable&lt;Term,Term></code>.<br>
 * <font color="red">This document is under construction.</font>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class HashtableOfTerm/* implements Map<Term, Term> */ {
    // private static final long serialVersionUID = 1L;
    public final Map<Term, Term> termMap;

    public HashtableOfTerm() {
        termMap = new HashMap<Term, Term>();
    }

    public HashtableOfTerm(int initialCapacity) {
        termMap = new HashMap<Term, Term>(initialCapacity);
    }

    public static boolean isHashtableOfTerm(Object hash) {
        return hash instanceof HashtableOfTerm;
    }

    public boolean containsKey(Term key) {
        return termMap.containsKey(key);
    }

    public void clear() {
        termMap.clear();
    }

    public Term get(Term key) {
        return termMap.get(key);
    }

    public Term put(Term key, Term value) {
        return termMap.put(key, value);
    }

    public void remove(Term key) {
        termMap.remove(key);
    }

    public int size() {
        return termMap.size();
    }

    public Set<Term> keySet() {
        return termMap.keySet();
    }

    public boolean isEmpty() {
        return termMap.isEmpty();
    }

    private Set<Entry<Term, Term>> entrySet() {
        return termMap.entrySet();
    }

    public HashtableOfTerm copyDeep(Map<Object, Term> copyHash) {
        return copyDeep(this, copyHash);
    }

    private static HashtableOfTerm copyDeep(HashtableOfTerm src, Map<Object, Term> copyHash) {
        int deeply = Term.COPY_DEEPLY;
        HashtableOfTerm hm = new HashtableOfTerm();
        for (Map.Entry<Term, Term> e : src.entrySet()) {
            Term val = e.getValue().copy(copyHash, deeply);
            if ((val.isJavaObject())) {
                Term o = val;
                Object oobj = o.toJava();
                if (HashtableOfTerm.isHashtableOfTerm(oobj)) {
                    val = TermData.FFIObject(copyDeep((HashtableOfTerm) oobj, copyHash));

                }
            }
            hm.put(e.getKey().copy(copyHash, deeply), val);
        }
        return hm;
    }

    private static HashtableOfTerm copyShallow(HashtableOfTerm src) {
        HashtableOfTerm hm = new HashtableOfTerm();
        for (Map.Entry<Term, Term> e : src.entrySet()) {
            Term val = e.getValue();
            if ((val.isJavaObject())) {
                Term o = val;
                Object oobj = o.toJava();
                if (HashtableOfTerm.isHashtableOfTerm(oobj)) {
                    val = TermData.FFIObject(copyShallow((HashtableOfTerm) oobj));
                }
            }
            hm.put(e.getKey(), val);
        }
        return hm;
    }

    public HashtableOfTerm copyShallow() {
        return copyShallow(this);
    }

}
