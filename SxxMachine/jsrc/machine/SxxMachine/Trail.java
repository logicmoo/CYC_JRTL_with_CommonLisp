package SxxMachine;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Trail stack.<br>
 * The class <code>Trail</code> represents a trail stack.<br>
 * Entries pushed to this trail stack must implement
 * the <code>Undoable</code> interface.
 * @see Undoable
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public final class Trail {
    /** list of already filled buffers */
    private final Deque<Undoable[]> buffersList;
    private final int pageSize;
    /** An array of <code>Undoable</code> entries. */
    private Undoable[] buffer;
    /** the top index of this <code>Trail</code>. */
    private int top;
    private int base;
    /** Current timestamp of the top of {@link ChoicePointStack}. */
    public long timeStamp;
    final Prolog mach;

    /** Constructs a new trail stack. */
    public Trail(Prolog m) {
        this(m, 2048);
    }

    /** Constructs a new trail stack with the given page size. */
    public Trail(Prolog m, int pageSize) {
        this(m, pageSize, 1000);
    }

    /**
     * Constructs a new trail stack with the given page size and initial number of
     * pages.
     */
    public Trail(Prolog m, int pageSize, int pages) {
        this.mach = m;
        this.pageSize = pageSize;
        this.buffersList = new ArrayDeque<Undoable[]>(pages);
        this.buffer = new Undoable[pageSize];
        this.top = -1;
        this.base = 0;
    }

    /** Discards all entries. */
    public void init() {
        deleteAll();
    }

    /** Pushs an entry to this <code>Trail</code>. */
    public void push(Undoable t) {
        if (++this.top >= this.pageSize) {
            this.buffersList.addLast(this.buffer);
            this.buffer = new Undoable[this.pageSize];
            this.top = 0;
            this.base += this.pageSize;
        }
        this.buffer[this.top] = t;
    }

    /** Pops an entry from this <code>Trail</code>. */
    public Undoable pop() {
        Undoable t = this.buffer[this.top];
        this.buffer[this.top--] = null;
        if (this.top < 0 && this.base > 0) {
            this.buffer = this.buffersList.pollLast();
            this.top = this.buffer.length - 1;
            this.base -= this.pageSize;
        }
        return t;
    }

    /** Discards all entries. */
    private void deleteAll() {
        this.buffersList.clear();
        this.buffer = new Undoable[this.buffer.length];
        this.top = -1;
        this.base = 0;
    }

    /** Tests if this stack has no entry. */
    public boolean empty() {
        return this.base == 0 && this.top == -1;
    }

    /** Current allocation of the trail storage array. */
    public int max() {
        return this.base + this.pageSize;
    }

    /**
     * Returns the value of <code>top</code>.
     *
     * @see #top
     */
    public int top() {
        return this.base + this.top;
    }

    /** Unwinds all entries after the value of <code>i</code>. */
    public void unwind(int i) {
        while (this.base + this.top > i) {
            Undoable t = this.buffer[this.top];
            this.buffer[this.top--] = null;
            if (this.top < 0 && this.base > 0) {
                this.buffer = this.buffersList.pollLast();
                this.top = this.pageSize - 1;
                this.base -= this.pageSize;
            }
            t.undo();
        }
    }

    // /** Shows the contents of this <code>Trail</code>. */
    // public void show() {
    // if (empty()) {
    // System.out.println("{trail stack is empty!}");
    // return;
    // }
    // for (int i=0; i<=top; i++) {
    // System.out.print("trail[" + i + "]: ");
    // System.out.println(buffer[i]);
    // }
    // }
    public Prolog getProlog() {
        // TODO Auto-generated method stub
        return this.mach;
    }
}
