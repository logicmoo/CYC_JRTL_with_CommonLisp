package com.cyc.baseclient.util;
import java.util.*;

/**
 * Provides <tt>Collection</tt> utilities not otherwise provided by Jakarta Commons.  All methods
 * are static.  There is no need to instantiate this class.<p>
 *
 * @version $Id: OcCollectionUtils.java 150787 2014-04-26 01:55:03Z nwinant $
 * @author Stephen L. Reed
 */
public class OcCollectionUtils {

    /**
     * Returns <tt>true</tt> iff the given {@link Collection}s.
     * have any elements in common.  Performs HashSet search for
     * larger collections.
     *
     * @param a the first collection considered for intersection
     * @param b the second collection considered for intersection
     * @return <tt>true</tt> if the given {@link Collection}s.
     * have any elements in common.
     */
    public static boolean hasIntersection(final Collection a, final Collection b) {
        if (a.size() < 50 && b.size() < 50) {
            Iterator it = a.iterator();
            while(it.hasNext())
                if (b.contains(it.next()))
                    return true;
        }
        else if (a.size() < b.size()) {
            HashSet bSet = new HashSet(b);
            Iterator it = a.iterator();
            while(it.hasNext())
                if (bSet.contains(it.next()))
                    return true;
        }
        else {
            HashSet aSet = new HashSet(a);
            Iterator it = b.iterator();
            while(it.hasNext())
                if (aSet.contains(it.next()))
                    return true;
        }
        return false;
    }

    /**
     * Returns <tt>true</tt> iff the given {@link Collection} has any
     * duplicated elements.
     *
     * @param collection the collection under consideration for having duplicate elements
     * @return <tt>true</tt> the given {@link Collection} has any duplicated elements
     */
    public static boolean hasDuplicates(final Collection collection) {
        HashSet aSet = new HashSet(collection);
        return collection.size() != aSet.size();
    }

}
