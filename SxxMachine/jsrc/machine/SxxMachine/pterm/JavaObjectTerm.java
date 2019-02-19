package SxxMachine.pterm;

import SxxMachine.OpVisitor;
import SxxMachine.PrologException;
import SxxMachine.Term;
import SxxMachine.Trail;

/**
 * Java-term.<br>
 * The <code>JavaObjectTerm</code> class wraps a java object.<br>
 *
 * <pre>
 *  import java.util.Hashtable;
 *  Term t = new JavaObjectTerm(new Hashtable());
 *  Hashtable hash = (Hashtable)(t.asJavaObjectlTerm().object());
 * </pre>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
@SuppressWarnings("rawtypes")
public class JavaObjectTerm extends AtomicConst {

    @Override
    public JavaObjectTerm toClone() {
        return TermData.createJavaObjectTerm(val);
    }

    @Override
    public Object toObject() {
        return val;
    }

    @Override
    public boolean isObject() {
        return true;
    }

    Object val;

    /*
     * private boolean available;
     *
     * synchronized public void suspend() { available=false; while(!available) { try
     * { wait(); } catch(InterruptedException e) {} } }
     *
     * synchronized public void resume() { available=true; notifyAll(); }
     */
    @Override
    public final boolean isImmutable() {
        return immutable;
        // FIXME this.obj is not final
    }

    @Override
    public String pprint() throws PrologException {
        return "" + obj;
    }

    /** Holds a java object that this <code>JavaObjectTerm</code> wraps. */
    final private Object obj;
    public boolean immutable = true;

    @Override
    public boolean isJavaObject() {
        return true;
    }

    /** Constructs a new Prolog java-term that wraps the argument object. */
    JavaObjectTerm(Object _obj) {
        if (_obj == null) {
            throw new NullPointerException("Error: constructing JavaObjectTerm around null");
        }
        this.obj = _obj;
    }

    /** Sets the argument object to this <code>JavaObjectTerm</code>. */
    // public void setObject(Object _obj) {
    // if ( _obj==null) {
    // throw new NullPointerException("Error: JavaObjectTerm can not wrap null");
    // }
    // this.obj = _obj;
    // }
    /** Returns the object wrapped by this <code>JavaObjectTerm</code>. */
    @Override
    public Object object() {
        return this.obj;
    }

    /**
     * Returns a <code>java.lang.Class</code> of object wrapped by this
     * <code>JavaObjectTerm</code>.
     */
    @Override
    public Class getIntendedClass() {
        return this.obj.getClass();
    }

    @Override
    public String getString() {
        oopsy("unknown getString");
        return "" + obj;
    }

    /* Term */
    @Override
    public boolean unifyImpl(Term t, Trail trail) {
        t = t.dref();
        return (t.isVar()) ? t.bind(this, trail) : ((t.isJavaObject()) && this.obj == ((t).object()));
    }

    /**
     * Check whether the wrapped object is convertible with the given Java class
     * type.
     *
     * @return the <code>boolean</code> whose value is
     *         <code>convertible(getClazz(), type)</code>.
     * @see #getIntendedClass()
     * @see Term#convertible(Class, Class)
     */
    @Override
    public boolean convertible(Class type) {
        return convertible(this.obj.getClass(), type);
    }

    /**
     * Returns the object wrapped by this <code>JavaObjectTerm</code>.
     *
     * @return the value of <code>obj</code>.
     * @see #obj
     */
    @Override
    public Object toJava() {
        return this.obj;
    }

    /* Object */
    /**
     * Checks <em>term equality</em> of two terms. The result is <code>true</code>
     * if and only if the argument is an instance of <code>JavaObjectTerm</code>,
     * and both terms point to the same java object.
     *
     * @param o
     *            the object to compare with. This must be dereferenced.
     * @return <code>true</code> if the given object represents a java-term
     *         equivalent to this <code>JavaObjectTerm</code>, false otherwise.
     * @see #compareTo
     */
    @Override
    public boolean equalsTerm(Term o, OpVisitor comparator) {
        return o.isJavaObject() && this.obj == ((o).object());
    }

    @Override
    public int termHashCodeImpl() {
        return System.identityHashCode(this.obj);
    }

    /**
     * Adds a string representation of this <code>JavaObjectTerm</code> to given
     * StringBuilder instance.
     */
    @Override
    public void toStringImpl(int printFlags, StringBuilder sb) {
        sb.append(this.obj.getClass().getName());
        sb.append("(0x");
        sb.append(Integer.toHexString(termHashCode()));
        sb.append(")");
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
        if ((anotherTerm.isVar()) || (anotherTerm.isNumber()) || (anotherTerm.isAtom()) || (anotherTerm.isCons())
                || (anotherTerm.isCompound()))
            return AFTER;
        if (!(anotherTerm.isJavaObject()))
            return BEFORE;
        if (this.obj == ((anotherTerm).object()))
            return EQUAL;
        return this.obj.hashCode() - (anotherTerm).object().hashCode(); // ???
    }

    @Override
    public int type() {
        return TYPE_JAVA_OBJECT;
    }

    @Override
    public int arityOrType() {
        return TYPE_JAVA_OBJECT;
    }

}
