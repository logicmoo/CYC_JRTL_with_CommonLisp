package SxxMachine.pterm;

import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.isQuoted;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

import SxxMachine.ExecProg;
import SxxMachine.Functor;
import SxxMachine.ISTerm;
import SxxMachine.Init;
import SxxMachine.KPTrail;
import SxxMachine.NameArity;
import SxxMachine.OpVisitor;
import SxxMachine.Prog;
import SxxMachine.Prolog;
import SxxMachine.PrologException;
import SxxMachine.Term;
import SxxMachine.Token;
import SxxMachine.Trail;

/**
 * Atom.<br>
 * The <code>SymbolTerm</code> class represents a Prolog atom.<br>
 *
 * <pre>
 * Term t = SymbolTerm.makeSymbol("kobe");
 * String name = t.asSymbolTerm().name();
 * </pre>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
@SuppressWarnings({ "unused", "rawtypes" })
abstract class SymbolTerm extends AtomicConst implements NameArity, ISTerm, Functor {

    @Override
    public SymbolTerm asSymbolTerm() {
        return this;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#exec(SxxMachine.Prog)
     */
    @Override
    public int exec(Prog p) {
        try {
            if (st_exec == null) {
                Init.builtinDict.asBuiltin(this);
            }
            if (st_exec == null) {
                return -1;
            }
            return (int) st_exec.invoke(null, p, this);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return -1;
        }
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#isConst()
     */
    @Override
    public boolean isConst() {
        return true;
    }

    public String name;

    private String _quoted_cache;

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#isTrueProc()
     */
    @Override
    public boolean isTrueProc() {
        // TODO Auto-generated method stub
        return getString() == "true" && arity == 0;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#qname()
     */
    public String qname() {
        if (_quoted_cache == null)
            _quoted_cache = MaybeQuoted(atomString());
        return _quoted_cache;
    }

    static public String MaybeQuoted(String sym) {
        if (true) {
            return Token.toQuotedString(sym);
        }
        if (0 == sym.length())
            return "''";
        if (!sym.contains("\n")) {
            return Token.toQuotedString(sym);
        }
        for (int i = 0; i < sym.length(); i++) {
            if (!Character.isLowerCase(sym.charAt(i)))
                return '\'' + sym + '\'';
        }
        return sym;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#toClone()
     */
    @Override
    public Functor toClone() throws CloneNotSupportedException {
        return this;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#bind(SxxMachine.pterm.Term, SxxMachine.KPTrail)
     */
    @Override
    public boolean bind(Term that, KPTrail trail) {
        if (!super.bind(that, trail))
            return false;
        if (name != null) {
            // name = name.intern();
            String thatn = TermData.asConst(that).getString();
            if (thatn == name)
                return true;
        }
        Term thizf = functor();
        Term thatf = that.functor();
        return thizf == thatf;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#getKey()
     */
    @Override
    public String getFAKey() {
        return getString() + "/" + arity();
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#arityOrType()
     */
    @Override
    public int arityOrType() {
        return Term.CONST;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#toUnquoted()
     */

    @Override
    public String toUnquoted() {
        return getString();
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#getIntArg(int)
     */
    @Override
    public int getIntArg(int i) {
        // TODO Auto-generated method stub
        oopsy("not for symbols");
        return super.getIntArg(i);
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#unifyArg(int, SxxMachine.pterm.Term, SxxMachine.Prog)
     */
    @Override
    public int unifyArg(int i, Term a, Prog p) {
        oopsy("not for symbols");
        return super.unifyArg(i, a, p);
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#ArgNoDeRef(int)
     */
    @Override
    public Term ArgNoDeRef(int i) {
        oopsy("not for symbols");
        return super.ArgNoDeRef(i);
    }

    ExecProg exp;

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#exec(SxxMachine.Prog, SxxMachine.ISTerm)
     */
    @Override
    public int exec(Prog p, ISTerm thiz) {
        return exp.exec(p, this);
    }

    private Method st_exec;

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#setMethod(java.lang.reflect.Method)
     */
    @Override
    public void setMethod(Method b) {
        st_exec = b;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#type()
     */
    @Override
    public int type() {
        return TYPE_SYMBOL;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#isAtomString()
     */
    @Override
    public boolean isAtom() {
        return true;
    }

    /** Symbol table. */
    static final ConcurrentHashMap<Key, InternRef> SYMBOL_TABLE = new ConcurrentHashMap<Key, InternRef>();

    private static final ReferenceQueue<Interned> DEAD = new ReferenceQueue<Interned>();

    static final class Key {
        final String name;
        final int arity;

        Key(String n, int a) {
            this.name = n;
            this.arity = a;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode();
        }

        @Override
        public boolean equals(Object other) {
            Key k = (Key) other;
            return this.arity == k.arity && this.name.equals(k.name);
        }
    }

    static final class InternRef extends WeakReference<Interned> {
        final Key key;

        InternRef(Key key, Interned sym) {
            super(sym, DEAD);
            this.key = key;
        }
    }

    public static class Dynamic extends SymbolTerm {
        protected Dynamic(String name, int arity) {
            super(name, arity);
        }

        protected Dynamic(String name) {
            super(name, -1);
        }

        @Override
        public String toString() {
            int arity = arity();
            return "/*D*/" + getString() + "/" + arity;
        }
    }

    public static final class Interned extends SymbolTerm {
        Interned(String _name, int arity) {
            super(checkName(_name, arity), arity);
        }

        @Override
        public String toString() {
            int arity = arity();
            if (arity == 0)
                return getString();
            return getString() + "/" + arity;
        }
    }

    public static final class Partial extends SymbolTerm {
        private int hash = 0;

        Partial(String name, int arity, int start, int finish) {
            super(name, arity, start, finish);
        }

        @Override
        public String toString() {
            int arity = arity();
            return "/*P" + start + ":" + finish + "*/ " + getString() + "/" + arity;
        }

        @Override
        public boolean equalsTerm(Term obj, OpVisitor comparator) {
            if (this == obj) {
                return true;
            } else if (obj.isAtom()) {
                SymbolTerm that = (SymbolTerm) obj.asSymbolTerm();
                int thisLength = this.finish - this.start;
                int thatLength = that.finish - that.start;
                return this.arity == that.arity && (thisLength == thatLength)
                        && this.name.regionMatches(this.start, that.name, that.start, thisLength);
            }
            return false;
        }

        @Override
        public boolean unifyImpl(Term t, Trail trail) {
            t = t.dref();
            OpVisitor comparator = Term.Unifiable;
            return (t.isVar()) ? (t).bind(this, trail) : equalsTerm(t, comparator);
        }

        @Override
        public int termHashCodeImpl() {
            int h = this.hash;
            if (h == 0 && this.finish - this.start > 0) {
                h = this.name.substring(this.start, this.finish).hashCode(); // use the same hashCode function as in
                                                                             // SymbolTerm
                this.hash = h;
            }
            return h;
        }

        @Override
        public Object toJava() {
            return getString();
        }

        @Override
        public void toStringImpl(int printingFlags, StringBuilder sb) {
            String name = this.getString();
            if (TermData.isQuoted(printingFlags))
                Token.toQuotedString(name, sb);
            else
                sb.append(name);
        }
    }

    private static final Functor colon2 = TermData.F(":", 2);

    /** Returns a Prolog atom for the given name.
     * Use {@link TermData#createAtomic(String)} instead*/
    public static Term screateDynamic(String _name) {
        return new SymbolTerm.Dynamic(_name.intern(), 0);
    }

    /** Returns a Prolog atom for the given name.
     * Use {@link TermData#createF(String,int)} instead*/
    static Functor screateF(String _name, int arity) {
        // For a non-zero arity try to reuse the term, its probable this is a
        // structure term and those are more commonly declared in code
        // to be a type of object the code manipulates, therefore also very
        // likely to already be in the cache.
        if (arity != 0)
            return softReuse(_name, arity);
        return new SymbolTerm.Dynamic(_name, 0);
    }

    /** Returns a Prolog functor for the given name and arity. */
    public static Term create(String pkg, String name, int arity) {
        // This is likely a specific function that exists in code, so try to reuse
        // the symbols that are involved in the term.
        return S(colon2, softReuse(pkg, 0), softReuse(name, arity));
    }

    /** Returns a Prolog functor for the given name and arity. */
    public static Functor intern(String _name, int _arity) {
        _name = checkName(_name, _arity);
        SymbolTerm.Key key = new SymbolTerm.Key(_name, _arity);
        Reference<? extends Interned> ref = SymbolTerm.SYMBOL_TABLE.get(key);
        if (ref != null) {
            Interned sym = ref.get();
            if (sym != null)
                return sym;
            SYMBOL_TABLE.remove(key, ref);
            ref.enqueue();
        }
        atom_gc();
        Interned sym = new Interned(_name, _arity);
        InternRef nref = new InternRef(key, sym);
        InternRef oref = SYMBOL_TABLE.putIfAbsent(key, nref);
        if (oref != null) {
            Functor osym = oref.get();
            if (osym != null)
                return osym;
        }
        return sym;
    }

    /**
     * @param _name
     * @return
     */
    static boolean badInteredAtom0(String _name) {
        return _name.length() > 10 && (_name.contains(" ") || _name.contains("\n")) && !_name.endsWith(":");

    }

    @Override
    public boolean isNumber() {
        return false && isChar();
    }

    public boolean isChar() {
        return getString().length() == 1;
    }

    @Override
    public long longValue() {
        String s = getString();
        return s.charAt(s.length() - 1);
    }

    /**
     * @param _name
     * @param arity2
     * @throws RuntimeException
     */
    static String checkName(String _name, int _arity) throws RuntimeException {
        if (_name == null || (_arity == 0 && badInteredAtom0(_name))) {
            if (Prolog.startLevel > 2)
                TermData.soopsy();
        }
        if (_name != null && _name != "." && _name != ":-") {
            String is = _name.intern();
            if (Prolog.startLevel > 1) {
                if (_name.contains("(") && _name.length() != 1) {
                    Prolog.Break(_name);
                }
                if (is != _name) {
                    Prolog.Break(_name);
                    throw new RuntimeException("const got uninterned string");
                }
            }
        }
        return _name.intern();
    }

    public static void atom_gc() {
        Reference<? extends Interned> ref;
        while ((ref = DEAD.poll()) != null) {
            SYMBOL_TABLE.remove(((InternRef) ref).key, ref);
        }
    }

    public static Functor softReuse(String _name, int _arity) {
        Key key = new Key(_name, _arity);
        Reference<? extends Interned> ref = SYMBOL_TABLE.get(key);
        if (ref != null) {
            Interned sym = ref.get();
            if (sym != null)
                return sym;
            SYMBOL_TABLE.remove(key, ref);
            ref.enqueue();
        }
        // If reuse wasn't possible, construct the term dynamically.
        return new Dynamic(_name, _arity);
    }

    /**
     * Holds a string representation of this <code>SymbolTerm</code>. The string can
     * be shared (partially) with other <code>SymbolTerm</code> instances
     */
    // protected final String name;
    //protected final String quoted;
    /** Holds the arity of this <code>SymbolTerm</code>. */
    protected final int arity;
    /** Holds start index in name */
    protected final int start;
    /** Holds end Index in name */
    protected final int finish;

    /**
     * Constructs a new Prolog atom (or functor) with the given symbol name and
     * arity.
     */
    protected SymbolTerm(String _name, int _arity) {
        name = _name;
        this.arity = _arity;
        this.start = 0;
        this.finish = this.name.length();
    }

    /**
     * Constructs a new Prolog atom (or functor) with the given symbol name, arity
     * and start/finish.
     */
    protected SymbolTerm(String _name, int _arity, int start, int finish) {
        // super(_name);
        name = _name;
        this.arity = _arity;
        this.start = start;
        this.finish = finish;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#arity()
     */
    @Override
    public final int arity() {
        return this.arity;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#fname()
     */
    public final String atomString() {
        return this.name.substring(this.start, this.finish);
    }

    @Override
    public String getString() {
        return atomString();
    }

    @Override
    public String fname() {
        return atomString();
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#start()
     */
    @Override
    public final int start() {
        return this.start;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#finish()
     */
    @Override
    public final int finish() {
        return this.finish;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#base()
     */
    @Override
    public final String base() {
        return this.name;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#subsymbol(int)
     */
    @Override
    public Functor subsymbol(int beginIndex) {
        if (beginIndex < 0) {
            throw new StringIndexOutOfBoundsException(beginIndex);
        }
        int subLen = this.finish - this.start - beginIndex;
        if (subLen < 0) {
            throw new StringIndexOutOfBoundsException(subLen);
        }
        return (beginIndex == 0) ? this : new Partial(this.name, this.arity, this.start + beginIndex, this.finish);
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#subsymbol(int, int)
     */
    @Override
    public Functor subsymbol(int beginIndex, int endIndex) {
        if (beginIndex < 0) {
            throw new StringIndexOutOfBoundsException(beginIndex);
        }
        if (endIndex > this.finish - this.start) {
            throw new StringIndexOutOfBoundsException(endIndex);
        }
        int subLen = endIndex - beginIndex;
        if (subLen < 0) {
            throw new StringIndexOutOfBoundsException(subLen);
        }
        return ((beginIndex == 0) && (endIndex == this.finish - this.start)) ? this
                : new Partial(this.name, this.arity, this.start + beginIndex, this.start + endIndex);
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#concat(SxxMachine.pterm.SymbolTerm)
     */
    @Override
    public Term concat(Functor thatf) {
        SymbolTerm that = (SymbolTerm) thatf;
        StringBuilder sb = new StringBuilder(this.finish - this.start + that.finish - that.start());
        sb.append(this.name, this.start, this.finish);
        sb.append(that.name, that.start, that.finish);
        return TermData.createAtomic(sb.toString());
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#length()
     */
    @Override
    public int length() {
        return this.finish - this.start;
    }

    // TODO startsWith(), endsWith(), indexOf()
    /* Term */
    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#unifyImpl(SxxMachine.pterm.Term, SxxMachine.Trail)
     */
    @Override
    public boolean unifyImpl(Term t, Trail trail) {
        t = t.dref(); // fast dereference
        return (t.isVar()) ? t.bind(this, trail)
                : ((t instanceof Partial) ? t.unify(this, trail)
                        : ((t.isAtom()) && (this.arity == (t.asSymbolTerm()).arity())
                                && this.name.equals(t.asSymbolTerm().getString())));
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#termHashCodeImpl()
     */
    @Override
    public int termHashCodeImpl() {
        return this.name.hashCode();
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#equalsTerm(SxxMachine.pterm.Term, SxxMachine.OpVisitor)
     */
    @Override
    public boolean equalsTerm(Term obj, OpVisitor comparator) {
        return (obj instanceof Partial) ? ((Partial) obj).equalsTerm(this, comparator)
                : ((obj.isAtom()) && (this.arity == obj.asSymbolTerm().arity())
                        && this.name.equals(obj.asSymbolTerm().getString()));
    }

    // private static boolean eq(SymbolTerm a, Term b0) {
    // if (a == b0) {
    //      return true;
    //      } else if (b0 instanceof SymbolTerm && (a instanceof Dynamic || b0 instanceof Dynamic)) {
    // SymbolTerm b = (SymbolTerm) b0;
    // return a.arity == b.arity && a.name.equals(b.name);
    // } else {
    // return false;
    // }
    // }
    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#convertible(java.lang.Class)
     */
    @Override
    public boolean convertible(Class type) {
        return convertible(String.class, type);
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#toJava()
     */
    @Override
    public Object toJava() {
        return this.name;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#toStringImpl(int, java.lang.StringBuilder)
     */
    @Override
    public void toStringImpl(int printingFlags, StringBuilder sb) {
        String name = this.name;
        if (isQuoted(printingFlags)) {
            sb.append(qname());
        } else {
            sb.append(name);
        }
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#pprint()
     */
    @Override
    public String pprint() throws PrologException {
        return getString();
    }

    /* Comparable */
    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#compareTo(SxxMachine.pterm.Term)
     */
    @Override
    public int compareTo(Term anotherTerm) { // anotherTerm must be dereferenced.
        if ((anotherTerm.isVar()) || (anotherTerm.isNumber()))
            return AFTER;
        if (!(anotherTerm.isAtom()))
            return BEFORE;
        if (this == anotherTerm)
            return EQUAL;
        int x = getString().compareTo(anotherTerm.asSymbolTerm().getString());
        if (x != 0)
            return x;
        int y = this.arity - anotherTerm.asSymbolTerm().arity();
        // if (y != 0)
        return y;
        // throw new InternalException("SymbolTerm is not unique");
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#isImmutable()
     */
    @Override
    public final boolean isImmutable() {
        return true;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#isNil()
     */
    @Override
    public boolean isNil() {
        if (arity != 0)
            return false;
        if (Prolog.Nil == this)
            return true;
        if (this.getString().equals("[]")) {
            // throw
        }
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#functor()
     */
    @Override
    public Functor functor() {
        return this;
    }

}
