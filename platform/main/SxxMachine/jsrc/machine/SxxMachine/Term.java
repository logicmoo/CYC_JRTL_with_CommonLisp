package SxxMachine;

import java.util.Iterator;
import java.util.Map;

import SxxMachine.pterm.Clause;
import SxxMachine.pterm.ClosureTerm;
import SxxMachine.pterm.MapTerm;
import SxxMachine.pterm.Source;

/**
 * The superclass of classes for term structures. The subclasses of
 * <code>Term</code> must override the <code>unify</code> method.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public interface Term extends Comparable<Term> {
    /** Holds an integer value <code>0</code>. */
    public static final int EQUAL = 0;
    /** Holds an integer value <code>1</code>. */
    public static final int AFTER = 1;
    /** Holds an integer value <code>-1</code>. */
    public static final int BEFORE = -1;

    public final static int JAVA = -4;
    public final static int FLOAT = -3;
    public final static int INT = -2;
    public final static int VAR = -1;
    public final static int CONST = 0;

    public static final int TYPE_CLOSURE = -6;
    public static final int TYPE_JAVA_OBJECT = -4;
    public static final int TYPE_DOUBLE_OR_CONST = -3;
    public static final int TYPE_INTEGER = -2;
    public static final int TYPE_VARIABLE = -1;
    public static final int TYPE_SYMBOL = 0;
    public static final int TYPE_STRUCTURE = 1;
    public static final int TYPE_LIST = 2;

    public static final int COPY_ALL = 0;
    public static final int COPY_DEEPLY = 1;
    public static final int COPY_NO_ATTRS = 2;
    public static final int COPY_SAVE_ATTRS_COPY = 4;

    public static final OpVisitor StrictEquals = new OpVisitor();
    public static final OpVisitor Unifiable = null;
    public static final OpVisitor Subsumes = null;

    public Term dref();

    Term toClone() throws CloneNotSupportedException;

    public boolean Unify_TO(Term dref, KPTrail trail);

    public Term arg0(int i);

    public boolean equalsTerm(Term name, OpVisitor strictequals2);

    public boolean bind(Term cons, Trail trail);

    public boolean isAttvar();

    public Term frozenGoals();

    public Term cdr();

    public Term copy(Map<Object, Term> copyHash, int deeply);

    public SxxMachine.Functor asSymbolTerm();

    public Term car();

    public NumberTerm asLongTerm();

    public boolean isCompound();

    public NumberTerm asIntegerTerm();

    public SxxMachine.Functor asConst();

    public boolean equalsTerm(Term v);

    public double doubleValue();

    public boolean isImmutable();

    public int containsTerm(Term variableTerm, OpVisitor strictequals2);

    public boolean isVar();

    public boolean equalsIdentical(Term t);

    public Term freeze(Trail trail, Term newval);

    public String getString();

    public Term findOrAttrValue(Trail trail, boolean b, Term a2);

    public boolean unify(Term arg0, Trail trail);

    public boolean unify(Compound arg0, Trail trail);

    public Term getAttrs();

    public void setAttrs(Term newval);

    public Term getGoals();

    public Term setGoals(Term newval);

    public Term functor();

    public int intValue();

    //public FrozenData getFdata();

    public int arity();

    public int arityOrType();

    public ClosureTerm asClosureTerm();

    public boolean convertible(Class type);

    public boolean isDouble();

    public boolean isCons();

    public Var asVariableTerm();

    public boolean isJavaObject();

    public String getFAKey();

    public Term[] args();

    public boolean isFVar();

    public boolean isGround();

    public boolean isFunctor(String string);

    public int type();

    public boolean unifyS(Functor functorPrime1, Trail trail, Term... a3);

    public boolean unifyInt(int b0, Trail trail);

    public boolean isMap();

    public Object toJava();

    public Term toValue();

    public void toQuotedString(int i, StringBuilder sb);

    public int termHashCode();

    public String pprint();

    public Object object();

    public Class getIntendedClass();

    public boolean isVariable();

    public boolean isInteger();

    public boolean isClosure();

    public boolean DO_Unify(Term t, KPTrail trail);

    public boolean isNumber();

    public boolean isNil();

    public boolean isConj();

    public boolean isLong();

    public Compound append(Term goal);

    public long longValue();

    public void setGoals(Trail trail, Term newval);

    public boolean isConst();

    public boolean isAtom();

    public boolean isAtomicValue();

    public boolean isCharReader();

    public Term ArgDeRef(int j);

    public Compound asListTerm();

    public NumberTerm asNumberTerm();

    public void setarg0(Trail trail, int i0, Term value);

    public Compound add(Term term);

    public boolean bind(Term that, KPTrail trail);

    public Term carTokenOrSelf();

    public Object toObject();

    public Clause toClause();

    public Term action(Term term);

    public boolean isNonvar();

    public boolean isClause();

    public boolean isFrozen();

    public boolean isBuiltin();

    public Term reaction(Term that);

    public int length();

    public Source asSource();

    public Term asStructureTerm();

    public void putAttrValue(Trail trail, Term name, Term val);

    public void setArg(int i, Term tail);

    public void setAttrs(Trail trail, Term dref);

    public Var toVar();

    public String toQuotedString();

    public MapTerm join(Term term);

    public boolean isTrueProc();

    public Term copy();

    public MapTerm asMapTerm();

    public Term numbervars();

    public Term drefAttrs();

    public boolean isAlias();

    public Term matching_copy(Term fXs);

    public int exec(Prog prog);

    public boolean matches(Term sym);

    public boolean matches(Term first, KPTrail trail);

    public boolean pbind(Term variableTerm, Trail trail);

    public Iterator<Term> iterator(boolean includeSyntax);

    public boolean isSymbol();

    public Term listify();

    public String fname();

}
