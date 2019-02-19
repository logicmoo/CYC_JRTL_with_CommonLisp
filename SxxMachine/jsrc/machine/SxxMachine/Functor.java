package SxxMachine;

import java.lang.reflect.Method;

public interface Functor extends NameArity, Atomic {

    @Override
    int exec(Prog p);

    @Override
    boolean isConst();

    @Override
    boolean isTrueProc();

    @Override
    Functor toClone() throws CloneNotSupportedException;

    @Override
    boolean bind(Term that, KPTrail trail);

    @Override
    String getFAKey();

    /**
     * returns an arity normally defined as 0
     *
     * @see Term#CONST
     */
    @Override
    int arityOrType();

    /**
     * creates a ConstBuiltin from a Const known to be registered as being a builtin
     * while returning its argument unchanged if it is just a plain Prolog constant
     * with no builtin code attached to it
     */

    String toUnquoted();

    @Override
    int getIntArg(int i);

    @Override
    int unifyArg(int i, Term a, Prog p);

    Term ArgNoDeRef(int i);

    int exec(Prog p, ISTerm thiz);

    @Override
    void setMethod(Method b);

    @Override
    int type();

    @Override
    boolean isAtom();

    /**
     * Returns the arity of this <code>SymbolTerm</code>.
     *
     * @return the value of <code>arity</code>.
     * @see #arity
     */
    @Override
    int arity();

    /**
     * Returns the string representation of this <code>SymbolTerm</code>.
     *
     * @return the value of <code>name</code>.
     * @see #name
     */
    @Override
    String getString();

    int start();

    int finish();

    String base();

    /**
     * Creates and return new {@link Functor} instance that shares the name
     * string with this instance, but name of new instance is a substring of this
     * name starting from given beginIndex.
     *
     * @param beginIndex
     * @return
     */
    Functor subsymbol(int beginIndex);

    /**
     * Creates and return new {@link Functor} instance that shares the name
     * string with this instance, but name of new instance is a substring of this
     * name starting from given beginIndex and ending before endIndex.
     *
     * @param beginIndex
     * @param endIndex
     * @return
     */
    Functor subsymbol(int beginIndex, int endIndex);

    Term concat(Functor that);

    /**
     * Returns the name length
     *
     * @return
     */
    @Override
    int length();

    // TODO startsWith(), endsWith(), indexOf()
    /* Term */
    boolean unifyImpl(Term t, Trail trail);

    int termHashCodeImpl();

    @Override
    boolean equalsTerm(Term obj, OpVisitor comparator);

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
    /**
     * @return the <code>boolean</code> whose value is
     *         <code>convertible(String.class, type)</code>.
     * @see Term#convertible(Class, Class)
     */
    @Override
    boolean convertible(Class type);

    /**
     * Returns a <code>java.lang.String</code> corresponds to this
     * <code>SymbolTerm</code> according to <em>Prolog Cafe interoperability with
     * Java</em>.
     *
     * @return a <code>java.lang.String</code> object equivalent to this
     *         <code>SymbolTerm</code>.
     */
    @Override
    Object toJava();

    @Override
    void toStringImpl(int printingFlags, StringBuilder sb);

    @Override
    String pprint() throws PrologException;

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
    int compareTo(Term anotherTerm);

    @Override
    boolean isImmutable();

    @Override
    boolean isNil();

    @Override
    Functor functor();

}