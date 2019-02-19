package SxxMachine;

/**
 * A trail entry for out-of-scope flag.<br>
 * This <code>OutOfScope</code> class is used in subclasses of
 * <code>BlockPredicate</code>.<br>
 * <font color="red">This document is under construction.</font>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class OutOfScope implements Undoable {
    final BlockPredicate p;

    public OutOfScope(BlockPredicate _p) {
        this.p = _p;
    }

    @Override
    public void undo() {
        this.p.outOfScope = false;
    }
}
