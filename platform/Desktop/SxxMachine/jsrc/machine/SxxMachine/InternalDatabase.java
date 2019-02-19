package SxxMachine;

import java.util.LinkedList;
import java.util.Map;

/**
 * Internal database for dynamic predicates.<br>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.1
 */
public class InternalDatabase {

    protected static final int DEFAULT_SIZE = 1000000;

    /** Maximum size of enties. Initial size is <code>1000000</code>. */
    protected int maxContents;
    /** An array of <code>Term</code> entries. */
    protected Term[] buffer;
    /* For GC */
    /** A list of reusable entry indices. */
    protected final LinkedList<Integer> reusableIndices;
    /** the top index of this <code>InternalDatabase</code>. */
    protected int top;

    /** Constructs a new internal dababase. */
    public InternalDatabase() {
        this(DEFAULT_SIZE);
    }

    /** Constructs a new internal dababase with the given size. */
    public InternalDatabase(int n) {
        this.maxContents = n;
        this.buffer = new Term[Math.min(this.maxContents, DEFAULT_SIZE)];
        this.reusableIndices = new LinkedList<Integer>();
        this.top = -1;
    }

    public InternalDatabase copyInternalDatabase(boolean deepCopy, Map<Object, Term> copyHash) {
        return new InternalDatabase(this, deepCopy, copyHash);
    }

    private InternalDatabase(InternalDatabase src, boolean deepCopy, Map<Object, Term> copyHash) {
        this.maxContents = src.maxContents;
        this.buffer = new Term[src.buffer.length];
        this.reusableIndices = new LinkedList<Integer>(src.reusableIndices);
        this.top = src.top;
        int deeply = (deepCopy ? Term.COPY_DEEPLY : 0);
        if (deepCopy) {
            for (int i = 0; i <= this.top; i++) {
                Term s = src.buffer[i];
                if (s != null) {
                    this.buffer[i] = s.copy(copyHash, deeply);
                }
            }
        } else if (0 <= this.top) {
            System.arraycopy(src.buffer, 0, this.buffer, 0, this.top + 1);
        }
    }

    /** Inserts an entry to this <code>InternalDatabase</code>. */
    public int insert(Term t) {
        try {
            if (this.reusableIndices.isEmpty()) {
                this.buffer[++this.top] = t;
                return this.top;
            } else {
                int i = this.reusableIndices.remove();
                this.buffer[i] = t;
                return i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            if (this.maxContents <= this.buffer.length)
                throw new SystemException("internal database capacity reached");
            int len = this.buffer.length;
            Term[] new_buffer = new Term[Math.min(len + 10000, this.maxContents)];
            System.arraycopy(this.buffer, 0, new_buffer, 0, len);
            this.buffer = new_buffer;
            this.buffer[this.top] = t;
            return this.top;
        }
    }

    /**
     * Returns an entry with the given index from this
     * <code>InternalDatabase</code>.
     */
    public Term get(int i) {
        return this.buffer[i];
    }

    /**
     * Erases an entry with the given index from this <code>InternalDatabase</code>.
     */
    public Term erase(int i) {
        Term t = this.buffer[i];
        this.buffer[i] = null;
        this.reusableIndices.add(i);
        return t;
    }

    /** Tests if this has no entry. */
    private boolean empty() {
        return this.top == -1;
    }

    /** Shows the contents of this <code>InternalDatabase</code>. */
    public void show() {
        if (empty())
            System.out.println("{internal database is empty!}");
        System.out.println("{reusable indices: " + this.reusableIndices.toString() + "}");
        for (int i = 0; i <= this.top; i++) {
            System.out.print("internal database[" + i + "]: ");
            System.out.println(this.buffer[i]);
        }
    }
}
