package SxxMachine.pterm;

import java.util.Map;

import SxxMachine.Term;

/**
 * A term to represent errors, extends {@link Term}, additionally holds
 * reference to {@link Throwable}, which this term represents.
 *
 * @author a.semenov@unipro.ru
 *
 */
public class ErrorTerm extends StructureTerm {
    // @Override
    public boolean isError() {
        return true;
    }

    private final Throwable error;

    public ErrorTerm(Throwable error, String name, Term... args) {
        super(name, args);
        this.error = error;
    }

    public ErrorTerm(Throwable error, Term _functor, Term... _args) {
        super(_functor, _args);
        this.error = error;
    }

    public Throwable getThrowable() {
        return this.error;
    }

    @Override
    protected Term copyImpl(Map<Object, Term> copyHash, int deeply) {
        Term[] a = new Term[arity()];
        for (int i = 0; i < a.length; i++) {
            a[i] = arg0(i).copy(copyHash, deeply);
        }
        return TermData.createErrorTerm(this.error, functor(), a);
    }
}
