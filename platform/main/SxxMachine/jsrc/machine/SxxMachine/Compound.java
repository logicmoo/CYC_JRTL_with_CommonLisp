package SxxMachine;

public interface Compound extends Nonvar {

    public void init(int arity);

    /**
     * Sets the value to <code>car</code>.
     *
     * @see #car
     */
    void setCar(Term t);

    /**
     * Sets the value to <code>cdr</code>.
     *
     * @see #cdr
     */
    void setCdr(Term t);

    Term nth0(int nth);

    @Override
    boolean isImmutable();

    /**
     * adds given term to the end of the list. Default implementation recreates the
     * whole list and returns reference to new list, because the original list can
     * be immutable.
     */
    @Override
    Compound add(Term term);

    Compound addToCopy(Term term);

    @Override
    Compound append(Term term);

    @Override
    Term car();

    @Override
    Term cdr();

    Nonvar toNonVar();

}