package SxxMachine.pterm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import SxxMachine.Functor;
import SxxMachine.OpVisitor;
import SxxMachine.Prolog;
import SxxMachine.Term;
import SxxMachine.Trail;

/**
 * List.<br>
 * The class <code>ListTerm</code> represents a list structure.<br>
 *
 * <pre>
 *  % [1,2]
 *  Term Nil = SymbolTerm.makeSymbol("[]");
 *  Term  n1 = IntegerTerm(1);
 *  Term  n2 = IntegerTerm(2);
 *  Term   t = TermData.CONS(n1, TermData.CONS(n2, Nil));
 *
 *  Term car = ( t).car();
 *  Term cdr = ( t).cdr();
 * </pre>
 *
 * Here is sample program for creating a list from <code>1</code> to
 * <code>n</code>.
 *
 * <pre>
 * public static Term makeList(int n) {
 * 	Term t = SymbolTerm.makeSymbol("[]");
 * 	for (int i = n; i > 0; i--) {
 * 		t = TermData.CONS(new IntegerTerm(i), t);
 * 	}
 * 	return t;
 * }
 * </pre>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
@SuppressWarnings({ "rawtypes", "unused" })
public class MapTerm extends SystemObject {
    /** A functor <code>'.' /2</code>. */
    protected static final Functor SYM_DOT_2 = TermData.F(".", 2);

    private boolean immutable;

    @Override
    public boolean isMap() {
        return true;
    }

    @Override
    public boolean isAtomicValue() {
        return false;
    }

    @Override
    public int containsTermImpl(Term variableTerm, OpVisitor comparison) {
        return car().containsTerm(variableTerm, comparison) + cdr().containsTerm(variableTerm, comparison);
    }

    /** Holds the first element of this <code>ListTerm</code>. */
    // private Term car;
    /**
     * Holds the list consisting of all the rest of the elements of this
     * <code>ListTerm</code> but the first one.
     */

    // private Term cdr;
    /**
     * Constructs a new Prolog list structure such that <code>_car</code> is the
     * first element of this list, and <code>_cdr</code> is the list consisting of
     * all the rest of the elements of this list but the first one.
     */
    MapTerm(Term... _ca_cdr) {
        // TODO assert _car!=null;
        // TODO assert _cdr!=null;
        // this.car = _car;
        // this.cdr = _cdr;
        argz = _ca_cdr;
        // this.immutable = this.argz[0].isImmutable() && this.argz[1].isImmutable();
    }

    /**
     * Returns the value of <code>car</code>.
     *
     * @see #car
     */
    @Override
    public final Term car() {
        return this.argz[0];
    }

    /**
     * Returns the value of <code>cdr</code>.
     *
     * @see #cdr
     */
    @Override
    public Term cdr() {
        return this.argz[1];
    }

    /* Term */
    @Override
    public final boolean unifyImpl(Term t, Trail trail) {
        Term p = this;
        t = t.dref();
        while ((t.isMap()) && (p.isMap()) && (p).car().unify((t).car(), trail)) {
            p = (p).cdr().dref();
            t = (t).cdr().dref();
        }
        if (t.isVar()) {
            return t.asVariableTerm().bind(p, trail);
        }
        if (p.isVar()) {
            return p.asVariableTerm().bind(t, trail);
        }
        if (true) {
            return !(t.isMap()) && !(p.isMap()) && p.unify(t, trail);
        }

        if (t.isMap()) {
            if (p.isAtomicValue())
                return false;
            return t.unify(p, trail);
        }
        if (p.isMap()) {
            if (t.isAtomicValue())
                return false;
            return p.unify(t, trail);
        }
        return p.unify(t, trail);
    }

    /**
     * Sets the value to <code>car</code>.
     *
     * @see #car
     */
    public void setCar(Term t) {
        this.argz[0] = t;
    }

    /**
     * Sets the value to <code>cdr</code>.
     *
     * @see #cdr
     */
    public void setCdr(Term t) {
        this.argz[1] = t;
    }

    @Override
    public int type() {
        return TYPE_LIST;
    }

    /**
     * @return the <code>boolean</code> whose value is
     *         <code>convertible(List.class, type)</code>.
     * @see Term#convertible(Class, Class)
     */
    @Override
    public boolean convertible(Class type) {
        return convertible(List.class, type);
    }

    @Override
    protected Term copyImpl(Map<Object, Term> copyHash, int deeply) {
        if (this.immutable) {
            return this;
        }
        Deque<MapTerm> stack = new ArrayDeque<MapTerm>();
        Term p = this;
        while (p.isMap() && !p.asMapTerm().immutable) {
            MapTerm lt = (MapTerm) p;
            stack.push(lt);
            p = lt.cdr().dref();
        }
        p = p.copy(copyHash, deeply);
        while (!stack.isEmpty()) {
            MapTerm lt = stack.pop();
            p = MAP(lt.argz[0].copy(copyHash, deeply), p);
        }
        return p;
    }

    @Override
    public boolean isGround() {
        return this.argz[0].isGround() && cdr().isGround();
    }

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Term[] args() {
        return argz;
    }

    @Override
    public Functor functor() {
        return SYM_DOT_2;
    }

    @Override
    public final String pprint() {
        StringBuilder sb = new StringBuilder();
        toStringImpl(1, sb);
        return sb.toString();
    }

    @Override
    public Term arg0(int nth) {
        Term t = this;
        int old_nth = nth;
        while ((t.isMap()) && 0 < nth) {
            nth--;
            t = (t).cdr().dref();
        }
        if ((t.isMap()))
            return t.car();
        throw new ArrayIndexOutOfBoundsException(old_nth);
    }

    /** Returns the length of this <code>ListTerm</code>. */
    @Override
    public int length() {
        int count = 0;
        Term t = this;
        while ((t.isMap())) {
            count++;
            t = (t).cdr().dref();
        }
        return count;
    }

    /**
     * Returns a {@code java.util.List} corresponds to this <code>ListTerm</code>
     * according to <em>Prolog Cafe interoperability with Java</em>.
     *
     * @return a {@link java.util.List} object equivalent to this
     *         <code>IntegerTerm</code>.
     */
    @Override
    public List toJava() {
        List<Object> vec = new ArrayList<Object>();
        Term t = this;
        while ((t.isMap())) {
            vec.add((t).car().dref().toJava());
            t = (t).cdr().dref();
        }
        if (!t.isNil()) {
            vec.add(t);
        }
        return vec;
    }

    /**
     * Adds a string representation of this <code>ListTerm</code> to given
     * StringBuilder instance. Non recursive implementation
     */
    public void toQuotedString_old(int printFlags, StringBuilder sb) {
        TermTreeIterator it = new TermTreeIterator(this, true);
        while (it.hasNext()) {
            Term t = it.next();
            t.toQuotedString(0, sb);
        }
    }

    @Override
    public void toStringImpl(int printingFlags, StringBuilder sb) {
        Term x = this;
        sb.append("[");
        for (;;) {
            x.car().dref().toQuotedString(1, sb);
            x = x.cdr().dref();
            if (!(x.isMap()))
                break;
            sb.append(",");
        }
        if (!Prolog.Nil.equals(x)) {
            sb.append("|");
            x.toQuotedString(printingFlags, sb);
        }
        sb.append("]");
    }

    /* Object */
    /**
     * Checks <em>term equality</em> of two terms. The result is <code>true</code>
     * if and only if the argument is an instance of <code>ListTerm</code>, and all
     * corresponding pairs of elements in the two lists are <em>term-equal</em>.
     *
     * @param obj
     *            the object to compare with. This must be dereferenced.
     * @return <code>true</code> if the given object represents a Prolog list
     *         equivalent to this <code>ListTerm</code>, false otherwise.
     * @see #compareTo
     */
    @Override
    public boolean equalsTerm(Term obj, OpVisitor comparator) {
        return obj.isMap() && this.argz[0].equalsTerm((obj).car().dref(), comparator)
                && cdr().equalsTerm((obj).cdr().dref(), comparator);
    }

    final public Term[] argz;

    @Override
    public int termHashCodeImpl() {
        int h = 1;
        h = 31 * h + SYM_DOT_2.termHashCode();
        h = 31 * h + this.argz[0].dref().termHashCode();
        h = 31 * h + cdr().dref().termHashCode();
        return h;
    }

    @Override
    public Iterator<Term> iterator(boolean includeSyntax) {
        return new ListTermIterator(this, includeSyntax);
    }

    /**
     * Iterator over terms that make up this ListTerm.
     */
    private static class ListTermIterator implements Iterator<Term> {
        private static final Functor LEFT_BRACKET = TermData.internToken("[");
        private static final Functor SEPARATOR = TermData.internToken("|");
        private static final Functor RIGHT_BRACKET = TermData.internToken("]");
        private static final Functor COMMA = TermData.internToken(",");

        private Term current;
        private int index = 0;
        private Term[] tail = null;
        private boolean comma = false;
        private boolean first = true;
        private boolean includeSyntax;

        ListTermIterator(Term start, boolean includeSyntax) {
            this.includeSyntax = includeSyntax;
            this.current = start;
        }

        @Override
        public boolean hasNext() {
            return this.current != null && (this.tail == null || this.index < this.tail.length);
        }

        @Override
        public Term next() {
            Term result;
            if (this.first && includeSyntax) {
                this.first = false;
                return LEFT_BRACKET;
            } else if (this.comma && includeSyntax) {
                this.comma = false;
                return COMMA;
            } else if (this.current.isMap()) {
                result = (this.current).car();
                this.current = (this.current).cdr().dref();
                this.comma = (this.current.isMap());
            } else if (this.current.isNil() && includeSyntax) {
                result = RIGHT_BRACKET;
                this.current = null;
            } else if (this.tail == null) {
                this.tail = new Term[] { this.current, RIGHT_BRACKET };
                result = SEPARATOR;
                this.index = 0;
            } else if (this.index < this.tail.length) {
                result = this.tail[this.index];
                this.index++;
            } else {
                throw new NoSuchElementException();
            }
            return result;
        }
    }

    /* Comparable */
    /**
     * Compares two terms in <em>Prolog standard order of terms</em>.<br>
     * It is noted that <code>t1.compareTo(t2) == 0</code> has the same
     * <code>boolean</code> value as <code>t1.equals(t2)</code>.
     *
     * @param anotherTerm
     *            the term to compared with. It must be dereferenced.
     * @return the value <code>0</code> if two terms are identical; a value less
     *         than <code>0</code> if this term is <em>before</em> the
     *         <code>anotherTerm</code>; and a value greater than <code>0</code> if
     *         this term is <em>after</em> the <code>anotherTerm</code>.
     */
    @Override
    public int compareTo(Term anotherTerm) { // anotherTerm must be dereferenced.
        if ((anotherTerm.isVar()) || (anotherTerm.isNumber()) || (anotherTerm.isAtom()))
            return AFTER;
        if ((anotherTerm.isCompound())) {
            int arity = anotherTerm.arity();
            if (2 != arity)
                return (2 - arity);
            Term functor = (anotherTerm).functor();
            if (!SYM_DOT_2.equalsTerm(functor))
                return SYM_DOT_2.compareTo(functor);
        }
        Term[] args = new Term[2];
        if ((anotherTerm.isMap())) {
            args[0] = (anotherTerm).car();
            args[1] = (anotherTerm).cdr();
        } else if ((anotherTerm.isCompound())) {
            args = (anotherTerm).args();
        } else {
            return BEFORE;
        }
        Term tmp = this.argz[0];
        int rc;
        for (int i = 0; i < 2; i++) {
            rc = tmp.compareTo(args[i].dref());
            if (rc != EQUAL)
                return rc;
            tmp = cdr();
        }
        return EQUAL;
    }

    @Override
    public final boolean isImmutable() {
        return this.immutable;
    }

    /**
     * joins given term to the end of the list. Default implementation recreates the
     * whole list and returns reference to new list, because the original list can
     * be immutable.
     */
    @Override
    public MapTerm join(Term term) {
        if (isImmutable()) {
            return joinToCopy(term);
        }
        final Term cdr = argz[1];
        if (cdr.isMap())
            return cdr.join(term);
        if (cdr == Prolog.Nil) {
            // proper list
            MapTerm acdr = MAP(term, cdr);
            argz[1] = acdr;

        } else {
            // improper list?
            MapTerm acdr = MAP(term, cdr);
            argz[1] = acdr;
        }
        return this;
    }

    public MapTerm joinToCopy(Term term) {
        Deque<Term> stack = new ArrayDeque<Term>();
        Term t = this;
        while (t.isMap()) {
            MapTerm lt = (MapTerm) t;
            stack.push(lt.argz[0].dref());
            t = lt.cdr().dref();
        }
        t = term.isNil() ? term : MAP(term, Prolog.Nil);
        while (!stack.isEmpty()) {
            t = MAP(stack.pop(), t);
        }
        return (MapTerm) t;
    }

    public MapTerm joinTo(Term term) {
        if (isImmutable()) {
            throw new NoSuchElementException("isImmutable: " + this);
            // return joinToCopy(term);
        }
        final Term cdr = argz[1];
        if (cdr.isMap())
            return cdr.join(term);
        if (cdr == Prolog.Nil) {
            // proper list
            MapTerm acdr = MAP(term, cdr);
            argz[1] = acdr;
            return acdr;
        } else {
            // improper list?
            MapTerm acdr = MAP(cdr, term);
            argz[1] = acdr;
            return acdr;
        }
    }

    static MapTerm MAP(Term _car, Term _cdr) {
        // TODO Auto-generated method stub
        return new MapTerm(_car, _cdr);
    }
}
