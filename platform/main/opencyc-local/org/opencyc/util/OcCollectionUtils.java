package org.opencyc.util;

import java.util.Iterator;
import java.util.HashSet;
import java.util.Collection;

public class OcCollectionUtils
{
    public static boolean hasIntersection(final Collection a, final Collection b) {
        if (a.size() < 50 && b.size() < 50) {
            final Iterator it = a.iterator();
            while (it.hasNext()) {
                if (b.contains(it.next())) {
                    return true;
                }
            }
        }
        else if (a.size() < b.size()) {
            final HashSet bSet = new HashSet(b);
            final Iterator it2 = a.iterator();
            while (it2.hasNext()) {
                if (bSet.contains(it2.next())) {
                    return true;
                }
            }
        }
        else {
            final HashSet aSet = new HashSet(a);
            final Iterator it2 = b.iterator();
            while (it2.hasNext()) {
                if (aSet.contains(it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean hasDuplicates(final Collection collection) {
        final HashSet aSet = new HashSet(collection);
        return collection.size() != aSet.size();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 30 ms
	
	Decompiled with Procyon 0.5.32.
*/