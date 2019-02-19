package SxxMachine;

import java.util.Arrays;

//import java.util.function.BiConsumer;
/**
 * Choice point frame stack.<br>
 * The <code>CPFStack</code> class represents a stack of choice point frames.<br>
 * Each choice point frame has the following fields:
 * <ul>
 * <li><em>arguments</em>
 * <li><em>continuation goal</em>
 * <li><em>next clause</em>
 * <li><em>trail pointer</em>
 * <li><em>cut point</em>
 * <li><em>time stamp</em>
 * </ul>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public final class ChoicePointStack {
    /** Trail of the associated Prolog instance. */
    private final Trail trail;
    /** Top of the stack. */
    ChoicePointFrame top;
    /**
     * Current level/depth of the stack.
     * <p>
     * This matches the length of the chain stored in {@link #top}.
     */
    private int level;
    private ChoicePointFrame[] frames;

    ChoicePointStack(Trail trail) {
        this.trail = trail;
        this.level = -1;
        this.frames = new ChoicePointFrame[256];
    }

    private void doubleFramesCapacity() {
        ChoicePointFrame[] newFrames = new ChoicePointFrame[this.frames.length << 2];
        System.arraycopy(this.frames, 0, newFrames, 0, this.frames.length);
        this.frames = newFrames;
    }

    ChoicePointFrame push(Prolog engine, Operation next, BiConsumer<ChoicePointFrame, Prolog> restore) {
        this.level++;
        if (this.level >= this.frames.length) {
            doubleFramesCapacity();
        }
        if (this.frames[this.level] == null) {
            this.frames[this.level] = new ChoicePointFrame();
        }
        this.top = this.frames[this.level];
        this.top.b0 = engine.B0;
        this.top.tr = engine.trail.top();
        this.top.bp = next;
        this.top.timeStamp = this.trail.timeStamp;
        this.top.cont = engine.cont;
        this.top.restore = restore;
        return this.top;
    }

    ChoicePointFrame push(Prolog engine, int arity, Operation next) {
        return push(engine, engine.AREGS, arity, next);
    }

    ChoicePointFrame push(Prolog engine, Term AREGS[], int arity, Operation next) {
        ChoicePointFrame topFrame = push(engine, next, ChoicePointStack::restoreN);
        if (topFrame.arity != arity) {
            topFrame.arity = arity;
            topFrame.AREGS = new Term[arity];
        }
        System.arraycopy(AREGS, 0, topFrame.AREGS, 0, topFrame.AREGS.length);
        return topFrame;
    }

    private static void restoreN(ChoicePointFrame frame, Prolog engine) {
        engine.cont = frame.cont;
        engine.AREGS = frame.AREGS;
        //System.arraycopy(frame.AREGS, 0, engine.AREGS, 0, frame.arity);
    }

    static void restore0(ChoicePointFrame frame, Prolog engine) {
        engine.cont = frame.cont;
    }

    /** Discards all choice points after the value of <code>i</code>. */
    public void cut(int i) {
        if (this.level > i) {
            Arrays.fill(this.frames, i + 1, this.level + 1, null);
            this.level = i;
            this.top = this.frames[this.level];
        }
        this.trail.timeStamp = this.top.timeStamp;
    }

    /** Discards the top of choice points. */
    void delete() {
        this.level--;
        this.top = this.frames[this.level];
        this.trail.timeStamp = this.top.timeStamp;
    }

    /** Discards all choice points. */
    void init() {
        this.top = null;
        this.level = -1;
        this.trail.timeStamp = Long.MIN_VALUE;
        Arrays.fill(this.frames, null);
    }

    @SuppressWarnings("unused")
    private void updateTrailTimeStamp() {
        this.trail.timeStamp = this.top != null ? this.top.timeStamp : Long.MIN_VALUE;
    }

    /** Get the current top of the stack. */
    public int top() {
        return this.level;
    }

    /** Get the maximum number of choice points permitted on the stack. */
    public int max() {
        // Since the stack is represented as a linked list, there is no limit.
        return Integer.MAX_VALUE;
    }
    /** Shows the contents of this <code>CPFStack</code>. */
    /*  public void show() {
    if (top == null) {
      System.out.println("{choice point stack is empty!}");
      return;
    }
    for (ChoicePointFrame e = top; e != null; e = e.prior) {
      System.out.println(e);
    }
      }*/
}
