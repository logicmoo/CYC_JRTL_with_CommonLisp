package com.cyc.baseclient.datatype;

import java.util.Stack;

/**
 * Extends the <tt>Stack</tt> class to provide a stack pointer.
 *
 * @version $0.1$
 * @author Stephen L. Reed
 */
public class StackWithPointer extends Stack {

    /**
     * Stack pointer.
     */
    public int sp = 0;

    /**
     * Constructs a new empty <tt>StackWithPointer</tt> object.
     */
    public StackWithPointer() {
    }

    /**
     * Pushes the argument onto the stack.
     *
     * @param item object to be pushed onto the <tt>Stack</tt>
     * @return Object that was pushed onto the <tt>Stack</tt>
     */
    public Object push ( Object item ) {
        sp++;
        return super.push(item);
    }

    /**
     * Returns the top of the stack, setting the new top of stack item.
     *
     * @return <tt>Object</tt> that was on the top of the <tt>Stack</tt>
     */
    public Object pop() {
        --sp;
        return super.pop();
    }
}
