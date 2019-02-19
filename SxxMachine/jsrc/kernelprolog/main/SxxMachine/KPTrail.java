package SxxMachine;

import java.util.ArrayList;

/**
 * Implements a stack of undo actions for backtracking, and in particular,
 * resetting a Var's Ref fiels to unbound (i.e. this).
 *
 *
 * @see Undoable
 * @see Var
 */
public class KPTrail {
    public final void push(Undoable var) {
        add(var);
    }

    public final Undoable pop() {
        return (Undoable) remove(size() - 1);
    }

    ArrayList<Undoable> stack = new ArrayList<Undoable>();

    private Object remove(int i) {
        return stack.remove(i);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    private void add(Undoable x) {
        stack.add(x);
    }

    public KPTrail() {
        super();
    }

    public String name() {
        return "trail" + hashCode() % 64;
    }

    public String pprint() {
        return name() + "\n" + super.toString() + "\n";
    }

    /**
     * Used to undo bindings after unification, if we intend to leave no side
     * effects.
     */

    // synchronized
    final public void unwind(int to) {
        // IO.mes("unwind TRAIL: "+name()+": "+size()+"=>"+to);
        // if(to>size())
        // IO.assertion("unwind attempted from smaller to larger top");
        for (int i = size() - to; i > 0; i--) {
            Undoable O = pop();
            O.undo();
        }
    }

    public String stat() {
        return "Trail=" + size();
    }
}
