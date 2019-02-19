package SxxMachine.pterm;

import static SxxMachine.pterm.TermData.V;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import SxxMachine.OpVisitor;
import SxxMachine.Prolog;
import SxxMachine.Term;
import SxxMachine.Trail;

/**
 * List term that allows tail addition to the list without recreating the list.
 * This class behaves like a view for underlying List instance.
 */
@SuppressWarnings("rawtypes")
public class ListViewTerm extends ListTerm implements Term {
    // the class is necessary to make ListTerm.isImmutable() to return false

    private static final class MutableMarkerForLists extends SystemObject {
        @Override
        public int type() {
            return TYPE_LIST;
        }

        @Override
        public boolean unifyImpl(Term t, Trail trail) {
            return false;
        }

        @Override
        public boolean isImmutable() {
            return false;
        }

        @Override
        public final String pprint() {
            StringBuilder sb = new StringBuilder();
            toStringImpl(1, sb);
            return sb.toString();
        }

        @Override
        public void toStringImpl(int printFlags, StringBuilder sb) {
        }

        @Override
        public int compareTo(Term o) {
            return 0;
        }

        @Override
        public int termHashCodeImpl() {
            return System.identityHashCode(this);
        }

        @Override
        public boolean equalsTerm(Term obj, OpVisitor comparator) {
            return this == obj;
        }
    }

    @Override
    public String pprint() {
        return super.toQuotedString();
    }

    @Override
    public boolean isImmutable() {
        return false;
    }

    private final static Term NOT_IMMUTABLE = new MutableMarkerForLists();

    /** the list of terms */
    private final List<Term> list;
    /**
     * index of element in the {@link SxxMachine.pterm.ListViewTerm#list} represented by
     * this instance
     */
    private final int index;
    /**
     * holds next {@link SxxMachine.pterm.ListViewTerm} instance, the value is lazy
     * initialized
     */
    private Term next = null;

    // final Term[] argz;

    public ListViewTerm(Term head) {
        super(head, NOT_IMMUTABLE);
        // this.argz = VA(head, NOT_IMMUTABLE);
        this.list = new ArrayList<>();
        this.list.add(head);
        this.index = 0;
    }

    private ListViewTerm(List<Term> list, int index) {
        super(list.get(index), NOT_IMMUTABLE);
        // this.argz = VA(list.get(index), NOT_IMMUTABLE);//super(list.get(index),
        // NOT_IMMUTABLE); // makes isImmutable to return false
        this.list = list;
        this.index = index;
    }

    @Override
    public ListTerm add(Term term) {
        this.list.add(term);
        return this;
    }

    @Override
    public Term cdr() {
        if (this.next != null) {
            return this.next;
        } else if (this.index + 1 < this.list.size()) {
            return this.next = new ListViewTerm(this.list, this.index + 1);
        } else {
            return Prolog.Nil;
        }
    }

    @Override
    protected Term copyImpl(Map<Object, Term> copyHash, int deeply) {
        Term result = Prolog.Nil;
        for (int i = this.list.size() - 1; i >= this.index; i--) {
            result = TermData.CONS(this.list.get(i).copy(copyHash, deeply), result);
        }
        return result;
    }

    @Override
    public Term nth0(int nth) {
        return this.list.get(this.index + nth);
    }

    @Override
    public int length() {
        return this.list.size() - this.index;
    }

    @Override
    public List toJava() {
        return Collections.unmodifiableList(this.list.subList(this.index, this.list.size()));
    }

    @Override
    public boolean isGround() {
        for (int i = this.list.size() - 1; i >= this.index; i--) {
            if (!this.list.get(i).isGround()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Term car() {
        // TODO Auto-generated method stub
        return nth0(0);
    }

    @Override
    public void setCar(Term t) {
        Prolog.Break("SETCAR");
        argz[0] = t;

    }

    @Override
    public void setCdr(Term t) {
        Prolog.Break("SETCDR");
        argz[1] = t;
    }

    @Override
    public Term[] args() {
        // TODO Auto-generated method stub
        Prolog.Break("ARGS");
        return argz;
    }

    @Override
    public String fname() {
        return Prolog.FUNCTOR_DOT_2.fname();
    }

    @Override
    public Term toClone() throws CloneNotSupportedException {
        return new ListViewTerm(list, index);
    }

    @Override
    public int arityOrType() {
        return type();
    }

    @Override
    public void init(int arity) {
        argz = new Term[arity];
        for (int i = 0; i < arity; i++) {
            argz[i] = V();
        }
    }
}
