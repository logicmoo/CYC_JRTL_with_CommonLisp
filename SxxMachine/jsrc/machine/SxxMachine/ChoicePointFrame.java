
// Copyright 2011 Google Inc. All Rights Reserved.
package SxxMachine;

import java.util.Objects;
//import java.util.function.BiConsumer;

@FunctionalInterface
interface BiConsumer<T, U> {

    /**
     * Performs this operation on the given arguments.
     *
     * @param t
     *            the first input argument
     * @param u
     *            the second input argument
     */
    void accept(T t, U u);

    /**
     * Returns a composed {@code BiConsumer} that performs, in sequence, this
     * operation followed by the {@code after} operation. If performing either
     * operation throws an exception, it is relayed to the caller of the composed
     * operation. If performing this operation throws an exception, the
     * {@code after} operation will not be performed.
     *
     * @param after
     *            the operation to perform after this operation
     * @return a composed {@code BiConsumer} that performs in sequence this
     *         operation followed by the {@code after} operation
     * @throws NullPointerException
     *             if {@code after} is null
     */
    default BiConsumer<T, U> andThen(BiConsumer<? super T, ? super U> after) {
        Objects.requireNonNull(after);

        return (l, r) -> {
            accept(l, r);
            after.accept(l, r);
        };
    }
}

/**
 * Choice point frame.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
class ChoicePointFrame {
    // public final Term[] AREGS = null;
    long timeStamp;
    Operation cont; // continuation goal
    Operation bp; // next clause
    int tr; // trail pointer
    int b0; // cut point
    Operation ownerPredicate; // used in PrologLogger
    int loggerStackTop; // used in PrologLogger
    BiConsumer<ChoicePointFrame, Prolog> restore; // method to restore the engine from stack
    public Term[] AREGS;
    int arity = -1;

    // Term[] aregs;
    // public ChoicePointFrame prior;
    void restore(Prolog engine) {
        engine.cont = this.cont;
    }

    @Override
    public String toString() {
        return ChoicePointFrame.class.getName() + '{' + "time:" + this.timeStamp + " cont:" + this.cont + " bp:"
                + this.bp + " tr:" + this.tr + " b0:" + this.b0 + '}';
    }
}
