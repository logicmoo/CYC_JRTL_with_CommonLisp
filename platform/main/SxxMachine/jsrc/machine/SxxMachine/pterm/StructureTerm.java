
package SxxMachine.pterm;

import static SxxMachine.pterm.TermData.CONS;
import static SxxMachine.pterm.TermData.SYM;
import static SxxMachine.pterm.TermData.V;
import static SxxMachine.pterm.TermData.isQuoted;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import SxxMachine.Compound;
import SxxMachine.Functor;
import SxxMachine.ISTerm;
import SxxMachine.Init;
import SxxMachine.InternalException;
import SxxMachine.KPTrail;
import SxxMachine.NameArity;
import SxxMachine.OpVisitor;
import SxxMachine.Prog;
import SxxMachine.Prolog;
import SxxMachine.Term;
import SxxMachine.Token;
import SxxMachine.Trail;
import SxxMachine.sxxtensions;

/**
 * Compound term. <br>
 * The <code>StructureTerm</code> class represents a compound term but list.<br>
 *
 * <pre>
 *  % father(abraham, X)
 *  Term a1 = SymbolTerm.makeSymbol("abraham");
 *  Term a2 = new VariableTerm();
 *  Term[] a3 = {a1, a2};
 *  Term a4 = SymbolTerm.makeSymbol("father", 2);
 *  Term  t = new StructureTerm(a4, a3);
 *
 *  Term functor = (t).functor();
 *  Term[]  args = (t).args();
 *  int    arity = (t).arity();
 * </pre>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
class StructureTerm extends ListTerm implements Cloneable, Compound, ISTerm, NameArity {

    /**
     * Executed when a builtin is called. Needs to be overriden. Returns a run-time
     * warning if this is forgotten.
     */

    @Override
    public int exec(Prog p) {
        //IO.println("this should be overriden, prog="+p.to);
        Method m = getBuiltin();
        try {
            if (m == null)
                return -1;
            final Object invoke = m.invoke(null, p, this);
            return (int) (Integer) invoke;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return -1;
        }
    }

    public Method getBuiltin() {
        return Init.builtinDict.getBuiltin((NameArity) this);
    }

    @Override
    public String getFAKey() {
        return fname() + "/" + arity();
    }

    static public final Term getHead(Term T) {
        T = T.dref();
        return (T.isConj()) ? TermData.asConj(T).ArgDeRef(0) : T;
    }

    static public final Term getTail(Term T) {
        T = T.dref();
        return (T.isConj()) ? TermData.asConj(T).ArgDeRef(1) : Prolog.True;
    }

    // public Term argz[];

    @Override
    public boolean isConj() {
        return name == "," && arityOrType() == 2;
    }

    // @Override
    // public boolean isCons() {
    // return name == "." && arityOrType() == 2;
    // }

    @Override
    public boolean isConst() {
        // TODO Auto-generated method stub
        oopsy("?isConst reason");
        return isImmutable();
    }

    // private String Name;

    @Override
    public final int arityOrType() {
        return argz.length;
    }

    /*
     * public StructureTerm(int arity) { //setDefaultName(); Arguments=new
     * Term[arity]; }
     */
    StructureTerm(String name, int arity) {
        this(name, makeVars(arity));
    }
    // public StructureTerm(String name, Term... x0) {
    // super(name);
    // argz = x0;
    // }

    private static Term[] makeVars(int arity) {
        // TODO Auto-generated method stub
        Term[] t = new Term[arity];
        for (int i = 0; i < t.length; i++) {
            t[i] = V();
        }
        return t;
    }

    @Override
    public void init(int arity) {
        argz = new Term[arity];
        for (int i = 0; i < arity; i++) {
            argz[i] = V();
        }
    }

    @Override
    public final Term ArgDeRef(int i) {
        return argz[i].dref();
    }

    @Override
    public final Term ArgNoDeRef(int i) {
        return argz[i];
    }

    @Override
    public final int getIntArg(int i) {
        return (int) TermData.asInt(ArgDeRef(i)).doubleValue();
    }

    @Override
    public final void setArg(int i, Term T) {
        argz[i] = T;
    }

    @Override
    public final int unifyArg(int i, Term T, Prog p) {
        // return getArg(i).unify(T,p.getTrail())?1:0;
        return argz[i].DO_Unify(T, p.getTrail()) ? 1 : 0;
    }

    protected final String funToString() {
        StringBuilder sb = new StringBuilder();
        toStringImpl(1, sb);
        return sb.toString();
    }

    @Override
    public String pprint() {
        if (isCons())
            return toListString();
        return funToString();
    }

    /**
     * List printer.
     */
    public String toListString() {
        Term h = ArgDeRef(0);
        Term t = ArgDeRef(1);
        StringBuffer s = new StringBuffer("[" + watchNull(h));
        for (;;) {
            if (t.isNil()) {
                s.append("]");
                break;
            } else if (t.isCons()) {
                h = t.ArgDeRef(0);
                t = TermData.asCons(t).ArgDeRef(1);
                s.append("," + watchNull(h));
            } else {
                s.append("|" + watchNull(t) + "]");
                break;
            }
        }
        return s.toString();
    }

    public String conjToString() {
        Term h = argz[0].dref();
        Term t = argz[1].dref();
        StringBuffer s = new StringBuffer(watchNull(h));
        for (;;) {
            if (!(t.isConj())) {
                s.append("," + t);
                break;
            } else {
                h = TermData.asConj(t).car().dref();
                t = TermData.asConj(t).cdr().dref();
                s.append("," + watchNull(h));
            }
        }
        return s.toString();
    }

    protected static String watchNull(Term x) {
        return ((null == x) ? "null" : x.pprint());
    }

    @Override
    public boolean bind(Term that, KPTrail trail) {
        return super.bind(that, trail) && argz.length == TermData.asStruct(that).arity();
    }

    @Override
    public boolean Unify_TO(Term that, KPTrail trail) {
        if (bind(that, trail)) {
            Term other = that;
            Term[] otherargz = other.args();
            for (int i = 0; i < argz.length; i++) {
                if (!argz[i].DO_Unify(otherargz[i], trail))
                    return false;
            }
            return true;
        } else
            return that.bind(this, trail);
    }

    @Override
    public Term carTokenOrSelf() {
        return argz[0];
    }

    // stuff allowing polymorphic cloning of StructureTerm subclasses
    // without using reflection - should be probaly faster than
    // reflection classes - to check
    @Override
    public StructureTerm toClone() {
        StructureTerm f = null;
        assert getClass() == StructureTerm.class;
        // use of clone is needed for "polymorphic" copy
        if (functor != null)
            return new StructureTerm(functor, argz);
        f = new StructureTerm(name, argz);

        return f;
    }

    protected StructureTerm unInitializedClone() {
        StructureTerm f = toClone();
        f.argz = new Term[argz.length];
        return f;
    }

    protected StructureTerm initializedClone() {
        StructureTerm f = toClone();
        f.init(argz.length);
        return f;
    }

    @Override
    public Term reaction(Term that) {
        // IO.mes("TRACE>> "+name());
        StructureTerm f = toClone();
        f.argz = new Term[argz.length];
        for (int i = 0; i < argz.length; i++) {
            f.argz[i] = argz[i].reaction(that);
        }
        return f;
    }

    @Override
    public Compound listify() {
        Compound l = CONS(SYM(fname()), Prolog.Nil);
        Compound curr = l;
        for (int i = 0; i < argz.length; i++) {
            Compound tail = CONS(argz[i], Prolog.Nil);
            curr.setCdr(tail);
            curr = tail;
        }
        return l;
    }

    @Override
    public boolean isClause() {
        return arityOrType() == 2 && fname().equals(":-");
    }

    //    public static StructureTerm CONS(Term x0, Term x1) {
    //        return CONS(x0, x1).asStructureTerm();
    //    }

    public static StructureTerm createCons(String cons, Term x0, Term x1) {
        return S(cons, x0, x1);
    }

    public static StructureTerm S(String string, Term... x01) {
        // TODO Auto-generated method stub
        return new StructureTerm(string, x01);
    }

    public static StructureTerm S(String getName, int arity) {
        // TODO Auto-generated method stub
        return createStructureTerm(getName, arity);
    }

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

    @Override
    public boolean isCons() {
        return argz.length == 2 && (functor() == Prolog.FUNCTOR_DOT_2);
    }

    @Override
    public int type() {
        if (isCons())
            return TYPE_LIST;
        return TYPE_STRUCTURE;
    }

    private final boolean isConsOL() {
        return false && isCons();
    }

    /** Holds the functor symbol of this <code>StructureTerm</code>. */
    // private final String name;
    // protected String name;
    protected Term functor;
    private String name;

    /** Holds the argument terms of this <code>StructureTerm</code>. */
    // public Term[] argz;
    // protected boolean immutable;
    @Override
    public boolean isCompound() {
        return !isCons() || true;
    }

    @Override
    public boolean isAtomicValue() {
        return false;
    }

    /**
     * Constructs a new Prolog compound term such that <code>name</code> is the
     * functor symbol, and <code>args</code> is the argument terms respectively.
     */
    public StructureTerm(String _name, Term... _args) {
        // this.name = name.intern();
        super();
        name = _name.intern();
        this.argz = _args;
        if (!Prolog.BE_FAST)
            checkImmuatble();
    }

    private void checkImmuatble() {
        if (this.argz != null) {
            int i = this.argz.length - 1;
            while (i >= 0 && this.argz[i].isImmutable()) {
                i--;
            }
            this.immutable = i < 0;
        }
    }

    @Override
    public Object toJava() {
        if (isConsOL())
            return super.toJava();
        return this;
    }

    /**
     * Constructs a new Prolog compound term such that <code>_functor</code> is the
     * functor symbol, and <code>_args</code> is the argument terms respectively.
     */
    public StructureTerm(Term _functor, Term... _args) {
        this(checkFunctor(_functor, _args), _args);
        this.functor = _functor;
    }

    /**
     * @return the <code>boolean</code> whose value is
     *         <code>convertible(List.class, type)</code>.
     * @see Term#convertible(Class, Class)
     */
    @Override
    public boolean convertible(Class type) {
        if (isConsOL())
            return convertible(List.class, type);
        return true;
    }

    private static String checkFunctor(Term _functor, Term[] _args) {
        if (_functor == null)
            return null;
        if (_args != null && _functor.arity() != _args.length)
            throw new InternalException("Invalid argument length in StructureTerm");
        return _functor.fname();
    }

    /*
     * public StructureTerm(String string, Term a0,Term a1, Term a2,Term a3, Term
     * a4, Term a5) { this(string, new Term[] {a0,a1,a2,a3,a4,a5}); } public
     * StructureTerm(String string, Term a0,Term a1, Term a2,Term a3, Term a4) {
     * this(string, new Term[] {a0,a1,a2,a3,a4}); } public StructureTerm(String
     * string, Term a0,Term a1, Term a2,Term a3) { this(string, new Term[]
     * {a0,a1,a2,a3}); } public StructureTerm(String string, Term a0,Term a1, Term
     * a2) { this(string, new Term[] {a0,a1,a2}); } public StructureTerm(String
     * string, Term a0,Term a1) { this(string, new Term[] {a0,a1}); } public
     * StructureTerm(String string, Term a0) { this(string, new Term[] {a0}); }
     * public StructureTerm(SymbolTerm string, Term a0,Term a1, Term a2,Term a3,
     * Term a4, Term a5) { this(string, new Term[] {a0,a1,a2,a3,a4,a5}); } public
     * StructureTerm(SymbolTerm string, Term a0,Term a1, Term a2,Term a3, Term a4) {
     * this(string, new Term[] {a0,a1,a2,a3,a4}); } public StructureTerm(SymbolTerm
     * string, Term a0,Term a1, Term a2,Term a3) { this(string, new Term[]
     * {a0,a1,a2,a3}); } public StructureTerm(SymbolTerm string, Term a0,Term a1,
     * Term a2) { this(string, new Term[] {a0,a1,a2}); } public
     * StructureTerm(SymbolTerm string, Term a0,Term a1) { this(string, new Term[]
     * {a0,a1}); } public StructureTerm(SymbolTerm string, Term a0) { this(string,
     * new Term[] {a0}); }
     *
     * /** Returns the functor symbol of this <code>StructureTerm</code>.
     *
     * @return the value of <code>functor</code>.
     *
     * @see #functor
     */
    @Override
    public final Term functor() {
        return this.functor != null ? this.functor : (this.functor = TermData.F(this.name, this.argz.length));
    }

    /**
     * Returns the arity of this <code>StructureTerm</code>.
     *
     * @return the value of <code>arity</code>.
     * @see #arity
     */
    @Override
    public int arity() {
        return this.argz.length;
    }

    /**
     * Returns the argument terms of this <code>StructureTerm</code>.
     *
     * @return the value of <code>args</code>.
     * @see #argsIt
     */
    @Override
    public final Term[] args() {
        return this.argz;
    }

    /**
     * Returns the string representation of functor symbol of this
     * <code>StructureTerm</code>.
     *
     * @return a <code>String</code> whose value is <code>functor.name()</code>.
     * @see #functor
     * @see Functor#name
     */
    @Override
    public final String fname() {
        if (name == null) {
            name = functor.fname();
            // name = name.intern();
        }
        return name;
    }

    @Override
    public String getString() {
        oopsy("unknown reason");
        // TODO Auto-generated method stub
        return super.getString();
    }

    @Override
    public final Term arg0(int nth) {
        if (isConsOL()) {
            return super.arg0(nth);
        }
        return this.argz[nth];
    }

    @Override
    public final boolean unifyImpl(Term t, Trail trail) {
        if (isConsOL()) {
            return super.unifyImpl(t, trail);
        }
        t = t.dref(); // fast dereference //t = t.dereference();
        if (t.isVar()) {
            return t.bind(this, trail);
        }
        // if ((t .isCons())) {
        // if(arity()!=2) return false;
        // if (!name().equals("."))return false;
        // Prolog.M.getLogger().getJLogger().warning("Unify Cons<>Structure");

        // return false;
        // }
        if (!(t.isCompound()) && !(t.isCons())) {
            return false;
        }

        ListTerm st = (ListTerm) t;
        if (this.argz.length != st.argz.length) {
            return false;
        }
        if (this.name != null) {
            if (!this.name.equals(st.fname()))
                return false;
        } else {
            if (!this.functor.unify(st.functor(), trail)) {
                return false;
            }
        }

        for (int i = 0; i < this.argz.length; i++) {
            if (!this.argz[i].unify(st.argz[i], trail)) {
                return false;
            }
        }
        return true;
    }

    @Override
    protected Term copyImpl(Map<Object, Term> copyHash, int deeply) {
        if (isConsOL())
            return super.copyImpl(copyHash, deeply);
        if (this.immutable) {
            return this;
        }
        Term[] a = new Term[this.argz.length];
        int len = this.argz.length;
        boolean cyclic = false;
        for (int i = 0; i < len; i++) {
            try {
                a[i] = this.argz[i].copy(copyHash, deeply);
            } catch (StackOverflowError e) {
                // TODO: handle exception
                e.printStackTrace();
                cyclic = true;
                break;
            }
        }
        if (cyclic) {
            if (this.functor != null)
                return new StructureTerm(this.functor, a);
            return new StructureTerm(fname(), a);
        }
        if (this.functor != null)
            return new StructureTerm(this.functor, a);
        return new StructureTerm(fname(), a);
    }

    @Override
    public final boolean isImmutable() {
        if (isConsOL()) {
            return true;
        }
        return this.immutable;
    }

    @Override
    public boolean isGround() {
        for (Term t : this.argz) {
            if (!t.isGround()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int containsTermImpl(Term variableTerm, OpVisitor comparison) {
        int contains = 0;
        for (Term t : this.argz) {
            contains += t.containsTerm(variableTerm, comparison);
        }
        if (functor != null)
            return functor.containsTerm(variableTerm, comparison) + contains;
        return contains;
    }

    /* Object */
    /**
     * Checks <em>term equality</em> of two terms. The result is <code>true</code>
     * if and only if the argument is an instance of <code>StructureTerm</code>, has
     * the same functor symbol and arity, and all corresponding pairs of arguments
     * in the two compound terms are <em>term-equal</em>.
     *
     * @param obj
     *            the object to compare with. This must be dereferenced.
     * @return <code>true</code> if the given object represents a Prolog compound
     *         term equivalent to this <code>StructureTerm</code>, false otherwise.
     * @see #compareTo
     */
    @Override
    public boolean equalsTerm(Term obj, OpVisitor comparator) {
        if (isConsOL())
            return super.equalsTerm(obj, comparator);
        if (obj == this)
            return true;
        if (!(obj.isCompound()))
            return false;
        Term st = obj;
        if (this.name != null) {
            if (!this.name.equals(st.fname()))
                return false;
        } else {
            if (!this.functor.equalsTerm(st.functor(), comparator)) {
                return false;
            }
        }
        for (int i = 0; i < this.argz.length; i++) {
            if (!this.argz[i].equalsTerm(st.arg0(i).dref(), comparator))
                return false;
        }
        return true;
    }

    @Override
    public int termHashCodeImpl() {
        if (isConsOL())
            return super.termHashCodeImpl();
        int h = 1;
        h = 31 * h + fname().hashCode();
        for (Term arg : this.argz) {
            h = 31 * h + arg.dref().termHashCode();
        }
        return h;
    }

    /**
     * Adds a string representation of this <code>StructureTerm</code> to given
     * StringBuilder instance. Non recursive implementation
     */
    @Override
    public void toStringImpl(int printingFlags, StringBuilder sb) {
        if (isCons()) {
            toListStringImpl(printingFlags, sb);
            return;
        }
        final String fname = fname();
        if (arity() == 2) {
            final boolean printInfix = "/".equals(fname) || ":".equals(fname) || ":-".equals(fname);
            if (printInfix) {
                toArgString(printingFlags, sb, this.argz[0]);
                sb.append(fname);
                toArgString(printingFlags, sb, this.argz[1]);
                return;
            }
        }
        if (!isQuoted(printingFlags)) {
            sb.append(fname);
        } else {
            Token.toQuotedString(fname, sb);
        }
        sb.append('(');
        Term term = this.argz[0];
        toArgString(printingFlags, sb, term);
        for (int i = 1; i < this.argz.length; i++) {
            sb.append(',');
            term = this.argz[i];
            toArgString(printingFlags, sb, term);

        }
        sb.append(')');
        /*
         * TermTreeIterator it = new TermTreeIterator(this); while(it.hasNext()){
         * it.next().toQuotedString(printingFlags, sb); }
         */
    }

    /**
     * @param printingFlags
     * @param sb
     * @param term
     */
    public static void toArgString(int printingFlags, StringBuilder sb, Term term) {
        if (term != null) {
            term.toQuotedString(printingFlags, sb);
        } else {
            sb.append("@NULL@");
        }
    }

    public static StructureTerm createStructureTerm(String name, int arity) {
        return new StructureTerm(name, arity);
    }

    public void toListStringImpl(int printingFlags, StringBuilder sb) {
        Term x = this;
        sb.append("[");
        for (;;) {
            toArgString(printingFlags, sb, x.car().dref());
            x = x.cdr().dref();
            if (!(x.isCons()))
                break;
            sb.append(",");
        }
        if (!Prolog.Nil.equals(x)) {
            sb.append("|");
            toArgString(printingFlags, sb, x);
        }
        sb.append("]");
    }

    public Iterator<Term> listIterator(boolean includeSyntax) {
        return new ListTermIterator(this, includeSyntax);
    }

    @Override
    public Iterator<Term> iterator(boolean includeSyntax) {
        if (isConsOL())
            return listIterator(includeSyntax);
        return new StructureTermIterator(functor(), this.argz, includeSyntax);
    }

    private static class StructureTermIterator implements Iterator<Term> {
        private static final Functor COMMA = TermData.SYM(",");
        private static final Functor RIGHT_BRACKET = TermData.SYM(")");
        private static final Functor LEFT_BRACKET = TermData.SYM("(");
        private int index = -2;
        private final Term functorIt;
        private final Term[] argsIt;
        private final int length;
        private boolean comma = false;
        private boolean includeSyntax;

        StructureTermIterator(Term functor, Term[] args, boolean includeSyntax) {
            this.includeSyntax = includeSyntax;
            this.functorIt = functor;
            this.argsIt = args;
            this.length = args.length;
        }

        @Override
        public boolean hasNext() {
            return this.index <= this.length;
        }

        @Override
        public Term next() {
            if (!includeSyntax) {
                if (index == -1) {
                    index++;
                } else {
                    if (index == length) {
                        index++;
                    }
                }
            }
            Term result;
            if (this.index == -2) {
                result = this.functorIt;
            } else if (this.index == -1) {
                result = LEFT_BRACKET;
            } else if (this.comma) {
                this.comma = false;
                return COMMA;
            } else if (this.index < this.length) {
                result = this.argsIt[this.index];
                this.comma = (this.index != this.length - 1);
            } else {
                result = RIGHT_BRACKET;
            }
            this.index++;
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
        if (isConsOL())
            return compareTo(anotherTerm);
        Term functor, functor2;
        Term[] args2;
        int arity2, rc;
        if ((anotherTerm.isVar()) || (anotherTerm.isNumber()) || (anotherTerm.isAtom()))
            return AFTER;
        if ((anotherTerm.isCons())) {
            ListTerm t = (ListTerm) anotherTerm;
            functor2 = Prolog.FUNCTOR_DOT_2;
            args2 = new Term[2];
            args2[0] = t.car();
            args2[1] = t.cdr();
            arity2 = 2;
        } else if ((anotherTerm.isCompound())) {
            Term s = anotherTerm;
            functor2 = s.functor();
            args2 = s.args();
            arity2 = s.arity();
        } else {
            return BEFORE;
        }
        if (this.argz.length != arity2)
            return (this.argz.length - arity2);
        functor = functor();
        if (!functor.equalsTerm(functor2, StrictEquals))
            return functor.compareTo(functor2);
        for (int i = 0; i < this.argz.length; i++) {
            rc = this.argz[i].compareTo(args2[i].dref());
            if (rc != EQUAL)
                return rc;
        }
        return EQUAL;
    }

    @Override
    public void setarg0(Trail trail, int i, Term val) {
        if (isConsOL()) {
            super.setarg0(trail, i, val);
            return;
        }
        if (trail == null) {
            argz[i] = val;
        } else {
            sxxtensions.DoSetArg3_p2(trail.getProlog(), i + 1, this, val);
        }
    }

    // @Override
    @Override
    public void setCar(Term t) {
        assert isCons();
        argz[0] = t;

    }

    // @Override
    @Override
    public void setCdr(Term t) {
        assert isCons();
        argz[1] = t;

    }

    @Override
    public void setMethod(Method b) {
        ((NameArity) functor()).setMethod(b);
    }

}
