package SxxMachine.pterm;

import static SxxMachine.pterm.TermData.CONS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import SxxMachine.Compound;
import SxxMachine.Functor;
import SxxMachine.Nonvar;
import SxxMachine.OpVisitor;
import SxxMachine.Prolog;
import SxxMachine.Term;
import SxxMachine.Trail;

@SuppressWarnings({ "rawtypes" })
abstract class ListTerm extends ANonvar implements Compound {

    @Override
    public Nonvar toNonVar() {
        return this;
    }

    @Override
    public Term ArgNoDeRef(int i) {
        return argz[i];
    }

    protected boolean immutable;

    @Override
    public boolean isCons() {
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
    ListTerm() {
        // super(s);
    }

    ListTerm(Term... _argz) {
        // super(".");
        // // TODO assert _car!=null;
        // // TODO assert _cdr!=null;
        // //this.car = _car;
        // //this.cdr = _cdr;
        argz = _argz;// VA(_car, _cdr);
        // //this.immutable = this.argz[0].isImmutable() && this.argz[1].isImmutable();
    }

    /**
     * Returns the value of <code>car</code>.
     *
     * @see #car
     */
    @Override
    public Term car() {
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
    public boolean unifyImpl(Term t, Trail trail) {
        Term p = this;
        t = t.dref();
        while (t.isCons() && p.isCons() && p.car().unify(t.car(), trail)) {
            p = p.cdr().dref();
            t = t.cdr().dref();
        }
        if (t.isVar())
            return t.bind(p, trail);
        if (p.isVar())
            return p.bind(t, trail);
        return !(t.isCons()) && !(p.isCons()) && p.unify(t, trail);
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.IStruct#setCar(SxxMachine.Term)
     */
    @Override
    public void setCar(Term t) {
        this.argz[0] = t;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.IStruct#setCdr(SxxMachine.Term)
     */
    @Override
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
    protected Term copyImpl(Map<Object, Term> copyHash, int deepCopy) {
        if (this.isImmutable()) {
            return this;
        }
        Deque<ListTerm> stack = new ArrayDeque<ListTerm>();
        Term p = this;
        while (p.isCons() && !p.asListTerm().isImmutable()) {
            ListTerm lt = (ListTerm) p;
            stack.push(lt);
            p = lt.cdr().dref();
        }
        p = p.copy(copyHash, deepCopy);
        while (!stack.isEmpty()) {
            ListTerm lt = stack.pop();
            p = CONS(lt.car().copy(copyHash, deepCopy), p);
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
    public Term functor() {
        return Prolog.FUNCTOR_DOT_2;
    }

    @Override
    public String getString() {
        oopsy("unusual getString");
        return TermData.charsToString(this);
    }

    public String fname() {
        return functor().fname();
    }

    @Override
    public Term arg0(int nth) {
        return nth0(nth);
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.IStruct#nth0(int)
     */
    @Override
    public Term nth0(int nth) {
        Term t = this;
        int old_nth = nth;
        while ((t.isCons()) && 0 < nth) {
            nth--;
            t = (t).cdr().dref();
        }
        if ((t.isCons()))
            return t.car();
        throw new ArrayIndexOutOfBoundsException(old_nth);
    }

    /** Returns the length of this <code>ListTerm</code>. */
    @Override
    public int length() {
        int count = 0;
        Term t = this;
        while ((t.isCons())) {
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
    public Object toJava() {
        List<Object> vec = new ArrayList<Object>();
        Term t = this;
        while ((t.isCons())) {
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
            if (!(x.isCons()))
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
        return obj.isCons() && this.argz[0].equalsTerm((obj).car().dref(), comparator)
                && cdr().equalsTerm((obj).cdr().dref(), comparator);
    }

    public Term[] argz;

    @Override
    public int termHashCodeImpl() {
        int h = 1;
        h = 31 * h + Prolog.FUNCTOR_DOT_2.termHashCode();
        h = 31 * h + this.car().dref().termHashCode();
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
    public static class ListTermIterator implements Iterator<Term> {
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
            } else if (this.current.isCons()) {
                result = (this.current).car();
                this.current = (this.current).cdr().dref();
                this.comma = (this.current.isCons());
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
     * @param otherterm
     *            the term to compared with. It must be dereferenced.
     * @return the value <code>0</code> if two terms are identical; a value less
     *         than <code>0</code> if this term is <em>before</em> the
     *         <code>otherterm</code>; and a value greater than <code>0</code> if
     *         this term is <em>after</em> the <code>otherterm</code>.
     */
    @Override
    public int compareTo(Term otherterm) { // otherterm must be dereferenced.
        if ((otherterm.isVar()) || (otherterm.isNumber()) || (otherterm.isAtom()))
            return AFTER;
        if ((otherterm.isCompound())) {
            int arity = otherterm.arity();
            if (2 != arity)
                return (2 - arity);
            Term functor = (otherterm).functor();
            if (!Prolog.FUNCTOR_DOT_2.equalsTerm(functor, StrictEquals))
                return Prolog.FUNCTOR_DOT_2.compareTo(functor);
        }
        Term[] args = new Term[2];
        if ((otherterm.isCons())) {
            args[0] = (otherterm).car();
            args[1] = (otherterm).cdr();
        } else if ((otherterm.isCompound())) {
            args = (otherterm).args();
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

    /* (non-Javadoc)
     * @see SxxMachine.pterm.IStruct#isImmutable()
     */
    @Override
    public boolean isImmutable() {
        return this.immutable;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.IStruct#add(SxxMachine.Term)
     */
    @Override
    public Compound add(Term term) {
        if (isImmutable()) {
            return addToCopy(term);
        }
        final Term cdr = argz[1];
        if (cdr.isCons())
            return cdr.add(term);
        if (cdr == Prolog.Nil) {
            // proper list
            Compound acdr = CONS(term, cdr);
            argz[1] = acdr;

        } else {
            // improper list?
            Compound acdr = CONS(term, cdr);
            argz[1] = acdr;
        }
        return this;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.IStruct#addToCopy(SxxMachine.Term)
     */
    @Override
    public Compound addToCopy(Term term) {
        Deque<Term> stack = new ArrayDeque<Term>();
        Term t = this;
        while (t.isCons()) {
            ListTerm lt = (ListTerm) t;
            stack.push(lt.argz[0].dref());
            t = lt.cdr().dref();
        }
        t = term.isNil() ? term : CONS(term, Prolog.Nil);
        while (!stack.isEmpty()) {
            t = CONS(stack.pop(), t);
        }
        return (Compound) t;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.IStruct#append(SxxMachine.Term)
     */
    @Override
    public Compound append(Term term) {
        if (isImmutable()) {
            throw new NoSuchElementException("isImmutable: " + this);
            // return addToCopy(term);
        }
        final Term cdr = argz[1];
        if (cdr.isCons())
            return cdr.add(term);
        if (cdr == Prolog.Nil) {
            // proper list
            Compound acdr = CONS(term, cdr);
            argz[1] = acdr;
            return acdr;
        } else {
            // improper list?
            Compound acdr = CONS(cdr, term);
            argz[1] = acdr;
            return acdr;
        }
    }
}
