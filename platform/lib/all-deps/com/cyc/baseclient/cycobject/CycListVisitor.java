package com.cyc.baseclient.cycobject;

import com.cyc.baseclient.CycObjectFactory;
import java.util.*;

/**
 * Implements an <tt>Enumeration</tt> for <tt>CycArrayList</tt> objects which traverses
 recursively into embedded CycArrayLists, in a depth-first fashion, returning the
 objects which are both non-CycArrayList and non-nil.
 *
 * @version $0.1$
 * @author Stephen L. Reed
 */
public class CycListVisitor implements Enumeration {

    /**
     * Contains the next <tt>Object</tt> in the sequence of non-CycArrayList
 elements of the <tt>CycArrayList</tt> tree structure.
     */
    protected Object nextElement = null;

    /**
     * Stack of <tt>CycArrayList</tt> <tt>Iterators</tt>
     */
    protected Stack iterators = new Stack();


    /**
     * Constructs a new <tt>CycArrayListEnumeration</tt> object.
     *
     * @param cycList the <tt>CycArrayList</tt> for recursive enumeration.
     */
    public CycListVisitor(CycArrayList cycList) {
        iterators.push(cycList.iterator());
        getNextElement();
    }

    /**
     * Tests if this enumeration contains more elements.
     *
     * @return  <tt>true</tt> if and only if this enumeration object
     *           contains at least one more element to provide;
     *          <tt>false</tt> otherwise.
     */
    public boolean hasMoreElements() {
        return nextElement != null;
    }

    /**
     * Returns the next element of this enumeration if this enumeration
     * object has at least one more element to provide.
     *
     * @return     the next element of this <tt>Enumeration</tt>.
   * @throws NoSuchElementException if no more elements exist.
     */
    public Object nextElement() {
        if (nextElement == null)
            throw new NoSuchElementException();
        Object answer = nextElement;
        // Stay one ahead to facilitate the determination of hasMoreElements.
        getNextElement();
        return answer;
    }

    /**
     * Gets the next element in the sequence.  This method uses recursive descent.
     */
    protected void getNextElement() {
        nextElement = null;
        while (true) {
            if (iterators.empty())
                // Reached the end of the whole CycArrayList.
                return;
            Iterator iterator = (Iterator) iterators.peek();
            if (! iterator.hasNext()) {
                iterators.pop();
                // Reached the end of an embedded CycArrayList.
                continue;
            }
            Object element = iterator.next();
            if (element.equals(CycObjectFactory.nil))
                // bypass nils.
                continue;
            if (! (element instanceof CycArrayList)) {
                nextElement = element;
                // Found the next non-nil element.
                return;
            }
            // Iterate over the embedded CycArrayList.
            iterators.push(((CycArrayList) element).iterator());
        }
    }

}
