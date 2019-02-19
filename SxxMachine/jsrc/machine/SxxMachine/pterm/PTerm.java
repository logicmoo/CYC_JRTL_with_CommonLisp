package SxxMachine.pterm;

import static SxxMachine.pterm.TermData.C;
import static SxxMachine.pterm.TermData.S;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

import SxxMachine.Compound;
import SxxMachine.Functor;
import SxxMachine.IllegalTypeException;
import SxxMachine.NumberTerm;
import SxxMachine.OpVisitor;
import SxxMachine.Prolog;
import SxxMachine.PrologException;
import SxxMachine.Term;
import SxxMachine.Trail;
import SxxMachine.Undoable;
import SxxMachine.Var;
import SxxMachine.sxxtensions;

@SuppressWarnings({ "rawtypes" })
abstract class PTerm extends KPTerm implements Term {

    @Override
    public final SxxMachine.Functor asConst() {
        // TODO Auto-generated method stub
        return super.asConst();
    }

    @Override
    public boolean isSymbol() {
        return isAtom();
    }

    protected int containsTermImpl(Term variableTerm, OpVisitor comparison) {
        return 0;
    }

    int loopContainsTerm = 0;

    @Override
    final public int containsTerm(Term variableTerm, OpVisitor equalsidentical) {
        if (loopContainsTerm > 0) {
            return loopContainsTerm;
        }
        try {
            loopContainsTerm++;
            return containsTermImpl(variableTerm, equalsidentical);
        } finally {
            loopContainsTerm--;
        }
    }

    /** One of the {@code TYPE_*} constants from {@code Term}. */
    @Override
    public abstract int type();

    @Override
    final public int hashCode() {
        return termHashCode();
    }

    int loopedHashCodeTerm = 0;

    @Override
    final public int termHashCode() {
        if (loopedHashCodeTerm > 0)
            return 1;
        try {
            loopedHashCodeTerm++;
            return termHashCodeImpl();
        } catch (Throwable e) {
            e.printStackTrace();
            return System.identityHashCode(this);
        } finally {
            loopedHashCodeTerm--;
        }
    }

    abstract public int termHashCodeImpl() throws Throwable;

    /**
     * Holds a term to which this variable is bound. Initial value is
     * <code>this</code> (self-reference). Moved from VariableTerm here in order to
     * force inlining of method {@link #drefAttrs()}
     */
    // public Term val = this;
    /**
     * Checks whether the argument term is unified with this one.
     *
     * @param t
     *            the term to be unified with.
     * @param trail
     *            Trail Stack.
     * @return <code>true</code> if succeeds, otherwise <code>false</code>.
     */
    int loopedUnifyTerm = 0;

    @Override
    final public boolean unify(Term t, Trail trail) {
        Term dref = drefAttrs();
        if (dref != this) {
            return dref.unify(t, trail);
        }
        if (loopedUnifyTerm > 0)
            return true;
        try {
            loopedUnifyTerm++;
            return unifyImpl(t, trail);
        } catch (Throwable e) {
            e.printStackTrace();
            return false;
        } finally {
            loopedUnifyTerm--;
        }
    }

    abstract public boolean unifyImpl(Term t, Trail trail);

    /**
     *
     * @return true if this term is immutable, i.e. can not be changed
     */
    @Override
    public abstract boolean isImmutable();

    /**
     * Check whether this term is a logical variable.
     *
     * @return <code>true</code> if <code>this .isVariable()</code>, otherwise
     *         <code>false</code>.
     * @see VariableTerm
     */
    @Override
    public boolean isVar() {
        return false;
    }

    /**
     * Check whether this term is an integer.
     *
     * @return <code>true</code> if <code>this .isInteger()</code>, otherwise
     *         <code>false</code>.
     * @see IntegerTerm
     */
    @Override
    public boolean isInteger() {
        return false;
    }

    /**
     * Check whether this term is a float.
     *
     * @return <code>true</code> if <code>this .isDouble()</code>, otherwise
     *         <code>false</code>.
     * @see DoubleTerm
     */
    @Override
    public boolean isDouble() {
        return false;
    }

    /**
     * Check whether this term is a long.
     *
     * @return <code>true</code> if <code>this .isLong()</code>, otherwise
     *         <code>false</code>.
     * @see LongTerm
     */
    @Override
    public boolean isLong() {
        return false;
    }

    /**
     * Check whether this term is a number.
     *
     * @return <code>true</code> if
     *         <code>this .isInteger() || this .isDouble()</code>, otherwise
     *         <code>false</code>.
     * @see IntegerTerm
     * @see DoubleTerm
     */
    @Override
    public boolean isNumber() {
        return false;
    }

    @Override
    public boolean isAtomicValue() {
        return true;
    }

    /**
     * Check whether this term is an atom.
     *
     * @return <code>true</code> if <code>this .isSymbol()</code>, otherwise
     *         <code>false</code>.
     * @see Functor
     */
    @Override
    public boolean isAtom() {
        return false;
    }

    /** Check whether this term is an empty list. */
    @Override
    public boolean isNil() {
        return Prolog.Nil.equalsTerm(this, StrictEquals);
    }

    /**
     * Check whether this term is a list structure.
     *
     * @return <code>true</code> if <code>this .isList()</code>, otherwise
     *         <code>false</code>. []/0 == false;
     * @see Compound
     */
    @Override
    public boolean isCons() {
        return false;
    }

    /**
     * Check whether this term is a compound term.
     *
     * @return <code>true</code> if <code>this .isStructure()</code>, otherwise
     *         <code>false</code>.
     * @see Term
     */
    @Override
    public boolean isCompound() {
        return false;
    }

    /**
     * Check whether this term is a java term.
     *
     * @return <code>true</code> if <code>this .isJavaObject()</code>, otherwise
     *         <code>false</code>.
     * @see JavaObjectTerm
     */
    @Override
    public boolean isJavaObject() {
        return false;
    }

    /**
     * Check whether this term is a closure term.
     *
     * @return <code>true</code> if <code>this .isClosure()</code>, otherwise
     *         <code>false</code>.
     * @see ClosureTerm
     */
    @Override
    public boolean isClosure() {
        return false;
    }

    /** @return the name of this Term, if {@link #isCompound()}.
     * @throws Exception */
    @Override
    public abstract String getString() throws IllegalTypeException;

    /** @return the arity of this Term, if {@link #isCompound()}. */
    @Override
    public int arity() {
        oopsy("arity reason");
        return 0;
    }

    @Override
    public Term[] args() {
        oopsy("missing method reason");
        throw new ArrayIndexOutOfBoundsException(666);
    }

    @Override
    public Term arg0(int nth) {
        oopsy("missing method reason");
        throw new ArrayIndexOutOfBoundsException(nth);
    }

    /**
     * @return get the nth argument of {@link #isCompound()} or {@link #isCons()}.
     */
    public Term nth0(int nth) {
        oopsy("missing method reason");
        throw new ArrayIndexOutOfBoundsException(nth);
    }

    @Override
    public Term car() {
        oopsy("missing method reason");
        throw new ArrayIndexOutOfBoundsException(-1);
    }

    @Override
    public Term cdr() {
        oopsy("missing method reason");
        throw new ArrayIndexOutOfBoundsException(-2);
    }

    @Override
    public int length() {
        oopsy("missing method reason");
        throw new ArrayIndexOutOfBoundsException(-3);
    }

    @Override
    public Compound add(Term t) {
        oopsy("missing method reason");
        throw new ArrayIndexOutOfBoundsException(-5);
    }

    @Override
    public Compound append(Term t) {
        oopsy("missing method reason");
        throw new ArrayIndexOutOfBoundsException(-5);
    }

    /**
     * Check whether this object is convertible with the given Java class type.
     *
     * @param type
     *            the Java class type to compare with.
     * @return <code>true</code> if this is convertible with <code>type</code>.
     *         Otherwise <code>false</code>.
     * @see #convertible(Class, Class)
     */

    @Override
    public boolean convertible(Class type) {
        return convertible(getClass(), type);
    }

    /**
     * Returns a copy of this object.
     *
     * @param deeply
     *            TODO
     */
    protected Term copyImpl(Map<Object, Term> copyHash, int deeply) {
        return this;
    }

    int loopingCopyTerm = 0;

    @Override
    final public Term copy(Map<Object, Term> copyHash, int deeply) {
        Term copy = copyHash.get(this);
        if (copy != null)
            return copy;
        Term drefAttrs = drefAttrs();
        if (drefAttrs != this) {
            if (drefAttrs.type() == this.type()) {
                return drefAttrs.copy(copyHash, deeply);
            } else {
                // oopsy();
                /// return drefAttrs.copy(copyHash, deeply);
            }
        }
        if (loopingCopyTerm == 1) {
            VariableTerm vt = new VariableTerm(Prolog.M);
            Term cp = vt.copyImpl(copyHash, deeply);
            // copyHash.put(vt, cp);
            vt.val = this;
            copyHash.put(this, cp);
            return cp;
        }
        // if(loopingCopyTerm==2) return copyHash.get(this);
        try {
            loopingCopyTerm++;
            copy = copyImpl(copyHash, deeply);
            copyHash.put(this, copy);
            if ((deeply & COPY_SAVE_ATTRS_COPY) != 0) {
                Term GoalsKey = Prolog.GOALS;
                if (this.isFVar()) {
                    Term goals1 = frozenGoals().copy(copyHash, deeply);
                    Term sofar = copyHash.get(GoalsKey);
                    Term newsofar = sxxtensions.appendGoals(sofar, goals1);
                    copyHash.put(GoalsKey, newsofar);
                }
                if (isAttvar()) {
                    Term attrs = getAttrs().copy(copyHash, deeply);
                    Term goals1 = sxxtensions.get_attribute_goals(copy, attrs);
                    Term sofar = copyHash.get(GoalsKey);
                    Term newsofar = sxxtensions.appendGoals(sofar, goals1);
                    copyHash.put(GoalsKey, newsofar);
                }
            } else if ((deeply & COPY_NO_ATTRS) == 0) {
                if (this.isFVar()) {
                    Term frozen = frozenGoals();
                    Term newfroze = frozen.copy(copyHash, deeply);
                    copy.setGoals(newfroze);
                    assert copy.isFVar();
                }
                if (isAttvar()) {
                    copy.setAttrs(getAttrs().copy(copyHash, deeply));
                }
            }
            return copy;
        } finally {
            loopingCopyTerm--;
            // TODO: handle finally clause
        }
    }

    /** Returns the dereference value of this term. */
    @Override
    public Term dref() {
        return this;
    }

    /**
     * Check whether this term is a ground term.
     *
     * @return <code>true</code> if ground, otherwise <code>false</code>.
     */
    @Override
    public boolean isGround() {
        return true;
    }

    /**
     * Returns a Java object that corresponds to this term if defined in <em>Prolog
     * Cafe interoperability with Java</em>. Otherwise, returns <code>this</code>.
     *
     * @return a Java object if defined in <em>Prolog Cafe interoperability with
     *         Java</em>, otherwise <code>this</code>.
     */
    @Override
    public Object toJava() {
        return this;
    }

    /**
     * Check whether there is a widening conversion from <code>from</code> to
     * <code>to</code>.
     */
    protected static boolean convertible(Class from, Class<?> to) {
        if (from == null)
            return !to.isPrimitive();
        if (to.isAssignableFrom(from)) {
            return true;
        } else if (to.isPrimitive()) {
            if (from.equals(Boolean.class)) {
                return to.equals(Boolean.TYPE);
            } else if (from.equals(Byte.class)) {
                return to.equals(Byte.TYPE) || to.equals(Short.TYPE) || to.equals(Integer.TYPE) || to.equals(Long.TYPE)
                        || to.equals(Float.TYPE) || to.equals(Double.TYPE);
            } else if (from.equals(Short.class)) {
                return to.equals(Short.TYPE) || to.equals(Integer.TYPE) || to.equals(Long.TYPE) || to.equals(Float.TYPE)
                        || to.equals(Double.TYPE);
            } else if (from.equals(Character.class)) {
                return to.equals(Character.TYPE) || to.equals(Integer.TYPE) || to.equals(Long.TYPE)
                        || to.equals(Float.TYPE) || to.equals(Double.TYPE);
            } else if (from.equals(Integer.class)) {
                return to.equals(Integer.TYPE) || to.equals(Long.TYPE) || to.equals(Float.TYPE)
                        || to.equals(Double.TYPE);
            } else if (from.equals(Long.class)) {
                return to.equals(Long.TYPE) || to.equals(Float.TYPE) || to.equals(Double.TYPE);
            } else if (from.equals(Float.class)) {
                return to.equals(Float.TYPE) || to.equals(Double.TYPE);
            } else if (from.equals(Double.class)) {
                return to.equals(Double.TYPE);
            }
        }
        return false;
    }

    /**
     * <p>
     * Returns Iterator over terms that make up this term. Should return empty
     * iterator if this term is not compound, i.e SymbolTerm, NumberTerm, etc.
     * <p>
     * The method is used in non-recursive implementation of {@link #toString()}
     */
    @Override
    public Iterator<Term> iterator(boolean includeSyntax) {
        return Collections.<Term>emptyIterator();
    }

    /**
     * Adds a string representation of this term to given StringBuilder instance.
     *
     * @param printFlags
     *            && 1 = quoted
     */
    @Override
    public String toQuotedString() throws PrologException {
        if (loopPrintingTerm > 0) {
            return "/*looped " + this.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(this))
                    + "*/";
        }
        StringBuilder sb = new StringBuilder();
        loopPrintingTerm++;
        try {
            toStringImpl(1, sb);
        } finally {
            loopPrintingTerm--;
        }
        return sb.toString();
    }

    protected int loopPrintingTerm = 0;

    /** Returns a string representation of this term. */
    @Override
    public String toString() {
        try {
            return toQuotedString();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            try {
                return pprint();
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            return e.toString();
        }
    }

    @Override
    protected abstract void toStringImpl(int printFlags, StringBuilder sb);

    /** Returns a string representation of this term. */
    @Override
    final public void toQuotedString(int printFlags, StringBuilder sb) {
        if (loopPrintingTerm > 0) {
            sb.append("/*looped*/");
            return;
        }
        loopPrintingTerm++;
        try {
            toStringImpl(printFlags, sb);
        } finally {
            loopPrintingTerm--;
        }
    }

    final public void toQuotedString_OLD(int printFlags, StringBuilder sb) {
        TermTreeIterator it = new TermTreeIterator(this, true);
        while (it.hasNext()) {
            it.next().toQuotedString(printFlags, sb);
        }
    }

    /** Returns a unquoted string representation of this term. */
    @Override
    public String pprint() throws PrologException {
        StringBuilder sb = new StringBuilder();
        toStringImpl(0, sb);
        return sb.toString();
    }

    /**
    * Iterator over all terms that make up this term.
    * Uses DFS to iterate over terms tree.
     */
    public static class TermTreeIterator implements Iterator<Term> {
        private final Deque<Iterator<Term>> stack = new ArrayDeque<Iterator<Term>>();
        boolean includeSyntax;

        public TermTreeIterator(Term start, boolean includeSyntax) {
            this.includeSyntax = includeSyntax;
            this.stack.push(Collections.singleton(start).iterator());
        }

        @Override
        public boolean hasNext() {
            while (!this.stack.isEmpty() && !this.stack.peek().hasNext()) {
                this.stack.pop();
            }
            return !this.stack.isEmpty();
        }

        @Override
        public Term next() {
            while (!this.stack.isEmpty()) {
                Iterator<Term> i = this.stack.peek();
                if (i.hasNext()) {
                    Term t = i.next();
                    Iterator<Term> it = t.iterator(includeSyntax);
                    if (it.hasNext()) {
                        this.stack.push(it);
                    } else {
                        return t;
                    }
                } else {
                    this.stack.pop();
                }
            }
            throw new NoSuchElementException();
        }
    }

    @Override
    public boolean equalsTerm(Term head) {
        if (head == this)
            return true;
        return equalsTerm(head, StrictEquals);
    }

    @Override
    abstract public boolean equalsTerm(Term obj, OpVisitor comparator);

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Term) {
            return equalsTerm((Term) obj, StrictEquals);
        }
        return false;
    }

    @Override
    public boolean isVariable() {
        return isVar();
    }

    @Override
    public boolean isNonvar() {
        return true;
    }

    @Override
    public boolean bind(Term partial, Trail trail) {
        if (partial == this)
            return true;
        throw new NoSuchElementException("no bind on genral terms");
    }

    @Override
    public boolean equalsIdentical(Term t) {
        return equalsTerm(t, StrictEquals);
    }

    static final class UndoAttributeReplacement implements Undoable {
        private final Term wasAttrs;
        private final Term Termthis;

        UndoAttributeReplacement(Term thiz, Term wasAttrs) {
            this.Termthis = thiz;
            this.wasAttrs = wasAttrs;
        }

        @Override
        public void undo() {
            this.Termthis.setAttrs(this.wasAttrs);
        }
    }

    @Override
    public Term drefAttrs() {
        // TODO Auto-generated method stub
        if (fdata != null)
            return this;
        Term attterm = dref();
        if (attterm == this)
            return attterm;
        return attterm.drefAttrs();
    }

    public Term ArgNoDeRef(int i) {
        return this.arg0(i);
    }

    @Override
    public Term findOrAttrValue(Trail trail, boolean createIfMissing, Term name) {
        Term drefAttrs = drefAttrs();
        if (drefAttrs != this)
            return drefAttrs.findOrAttrValue(trail, createIfMissing, name);
        if (sxxtensions.isNoGoal(this.getAttrs())) {
            if (!createIfMissing)
                return Prolog.Nil;
            Term wasAttrs = this.getAttrs();
            Term newatts = null;
            this.setAttrs(Prolog.Nil);
            newatts = C("att", name, null, Prolog.Nil);
            if (trail != null) {
                trail.push(new UndoAttributeReplacement(this, wasAttrs));
            }
            return newatts;
        } else {
            Term next = this.getAttrs();
            do {
                if (next.arg0(0).equalsTerm(name, StrictEquals)) {
                    return next;
                }
                Term nnext = next.arg0(2);
                if (!nnext.getString().equals("att")) {
                    break;
                }
                next = nnext;
            } while (true);
            if (!createIfMissing)
                return Prolog.Nil;
            next.setarg0(trail, 2, C("att", name, null, Prolog.Nil));
            return next;
        }
    }

    @Override
    public Term freeze(Trail trail, Term newval) {
        Term drefAttrs = drefAttrs();
        if (drefAttrs != this)
            return drefAttrs.freeze(trail, newval);
        Term prev = this.frozenGoals();
        Term newgoals = sxxtensions.appendGoals(newval, prev);
        trail.push(new Undoable() {
            @Override
            public void undo() {
                PTerm.this.setGoals(prev);
            }
        });
        return this.setGoals(newgoals);
    }

    @Override
    public Term frozenGoals() {
        Term drefAttrs = drefAttrs();
        if (drefAttrs != this)
            return drefAttrs.frozenGoals();
        return nullIs(this.getGoals(), Prolog.True);
    }

    @Override
    public boolean isAttvar() {
        Term drefAttrs = drefAttrs();
        if (drefAttrs != this)
            return drefAttrs.isAttvar();
        if (fdata == null)
            return false;
        return this.getAttrs() != null && this.getAttrs() != Prolog.Nil;
    }

    @Override
    public boolean isFrozen() {
        Term drefAttrs = drefAttrs();
        if (drefAttrs != this)
            return drefAttrs.isFrozen();
        if (fdata == null)
            return false;
        return this.frozenGoals() != Prolog.True;
    }

    public boolean IsList() {
        return false;
    }

    @Override
    public long longValue() {
        Term deref = this.drefAttrs();
        if (deref != this)
            return deref.longValue();
        System.out.println("general LongValue on terms not available");
        return -1;
    }

    static Term nullIs(Term attrs2, Term valeu) {
        return attrs2 == null ? valeu : attrs2;
    }

    @Override
    public void putAttrValue(Trail trail, Term name, Term val) {
        Term drefAttrs = drefAttrs();
        if (drefAttrs != this) {
            putAttrValue(trail, name, val);
            return;
        }

        Term wasAttrs = this.getAttrs();
        if (wasAttrs == null || wasAttrs == Prolog.Nil) {
            Term newatts = null;
            newatts = C("att", name, val, Prolog.Nil);
            if (trail != null) {
                trail.push(new Undoable() {
                    @Override
                    public void undo() {
                        PTerm.this.setAttrs(wasAttrs);
                    }
                });
            }
            this.setAttrs(newatts);
            return;
        } else {
            Term next = wasAttrs;
            do {
                if (wasAttrs.arg0(0).equalsTerm(name, StrictEquals)) {
                    (wasAttrs).setarg0(trail, 1, val);
                    return;
                }
                Term nnext = next.arg0(2);
                if (!nnext.getString().equals("att")) {
                    break;
                }
                next = nnext;
            } while (true);
            next.setarg0(trail, 2, C("att", name, val, Prolog.Nil));
        }
    }

    @Override
    public void setAttrs(Trail trail, Term newval) {
        Term drefAttrs = drefAttrs();
        if (drefAttrs != this) {
            setAttrs(trail, newval);
            return;
        }

        Term prev = nullIs(this.getAttrs(), Prolog.Nil);
        trail.push(new Undoable() {
            @Override
            public void undo() {
                PTerm.this.setAttrs(prev);
            }
        });
        this.setAttrs(newval);
    }

    @Override
    public void setGoals(Trail trail, Term newval) {
        Term drefAttrs = drefAttrs();
        if (drefAttrs != this) {
            drefAttrs.setGoals(trail, newval);
            return;
        }
        final Term prev = nullIs(this.getGoals(), Prolog.True);
        trail.push(new Undoable() {
            @Override
            public void undo() {
                PTerm.this.setGoals(prev);
            }
        });
        this.setGoals(newval);
    }

    @Override
    public void setarg0(Trail trail, int i0, Term value) {
        System.out.println("general SetArg on terms not available");
    }

    @Override
    public Term setGoals(Term newval) {
        Term drefAttrs = drefAttrs();
        if (drefAttrs != this)
            return drefAttrs.setGoals(newval);
        return getFdata().setGoals(newval);
    }

    @Override
    public Term getGoals() {
        Term drefAttrs = drefAttrs();
        if (drefAttrs != this)
            return drefAttrs.getGoals();
        if (fdata == null)
            return Prolog.True;
        return getFdata().getGoals();
    }

    @Override
    public void setAttrs(Term newval) {
        Term drefAttrs = drefAttrs();
        if (drefAttrs != this) {
            drefAttrs.setAttrs(newval);
            return;
        }
        getFdata().setAttrs(newval);
    }

    @Override
    public Term getAttrs() {
        Term drefAttrs = drefAttrs();
        if (drefAttrs != this)
            return drefAttrs.getAttrs();
        if (fdata == null)
            return Prolog.Nil;
        return getFdata().getAttrs();
    }

    @Override
    public boolean isFVar() {
        Term drefAttrs = drefAttrs();
        if (drefAttrs != this)
            return drefAttrs.isFVar();
        return isVariable() && isFrozen();
    }

    @Override
    public int intValue() {
        return (int) longValue();
    }

    @Override
    public boolean unifyInt(int i, Trail trail) {
        return intValue() == i;
    }

    @Override
    public SxxMachine.Functor asSymbolTerm() {
        return (SxxMachine.Functor) this;
    }

    /**
     * @return the value
     */
    public Term getValue() {
        return this;
    }

    /**
     * @return the fdata
     */
    public FrozenData getFdata() {
        if (fdata == null)
            fdata = new FrozenData();
        return fdata;
    }

    private FrozenData fdata = null;

    /**
     * @param fdata
     *            the fdata to set
     */
    // public void setFdata(FrozenData fdata) {
    // this.fdata = fdata;
    // }
    @Override
    public boolean isAlias() {
        return false;
    }

    @Override
    public double doubleValue() {
        return longValue();
    }

    @Override
    public Term functor() {
        // TODO Auto-generated method stub
        System.out.println("general functor on terms not available");
        return null;
    }

    Term zowner;

    @Override
    public MapTerm join(Term term) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isMap() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean pbind(Term variableTerm, Trail trail) {
        // TODO Auto-generated method stub
        oopsy("missing method reason");
        return false;
    }

    public void toString(StringBuilder sb) {
        toStringImpl(1, sb);
    }

    @Override
    public Object object() {
        // TODO Auto-generated method stub
        return this;
    }

    @Override
    public Class getIntendedClass() {
        return object().getClass();
    }

    @Override
    public String fname() {
        oopsy("missing method reason");
        return "" + object();
    }

    @Override
    public Term asStructureTerm() {
        // TODO Auto-generated method stub
        return (Term) this;
    }

    @Override
    public void setArg(int i, Term value) {
        setarg0(null, i, value);
    }

    @Override
    public Compound asListTerm() {
        // TODO Auto-generated method stub
        return (Compound) object();
    }

    @Override
    public LongTerm asIntegerTerm() {
        // TODO Auto-generated method stub
        return (LongTerm) object();
    }

    @Override
    public ClosureTerm asClosureTerm() {
        // TODO Auto-generated method stub
        return (ClosureTerm) object();
    }

    @Override
    public Var asVariableTerm() {
        // TODO Auto-generated method stub
        return (VariableTerm) object();
    }

    @Override
    public NumberTerm asLongTerm() {
        // TODO Auto-generated method stub
        return (LongTerm) object();
    }

    public HashtableOfTerm asHashtableOfTerm() {
        // TODO Auto-generated method stub
        return (HashtableOfTerm) object();
    }

    @Override
    public NumberTerm asNumberTerm() {
        // TODO Auto-generated method stub
        return (NumberTerm) object();
    }

    @Override
    public MapTerm asMapTerm() {
        // TODO Auto-generated method stub
        return (MapTerm) object();
    }

    @Override
    public boolean unifyS(Functor f, Trail trail, Term... va) {
        // TODO Auto-generated method stub
        return unify(S(f, va), trail);
    }

    @Override
    public boolean unify(Compound arg0, Trail trail) {
        // TODO Auto-generated method stub
        return unify((Term) arg0, trail);
    }
}