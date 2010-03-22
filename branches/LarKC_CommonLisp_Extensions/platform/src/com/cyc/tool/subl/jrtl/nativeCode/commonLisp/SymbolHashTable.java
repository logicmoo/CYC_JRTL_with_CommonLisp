/*
 * SymbolHashTable.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: SymbolHashTable.java 12298 2009-12-18 21:50:54Z ehuelsmann $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import java.util.ArrayList;
import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public final class SymbolHashTable
{
    private static final float LOAD_FACTOR = 0.75f;

    private int threshold;
    private HashEntry[] buckets;
    private int count;

    private int mask;

    public SymbolHashTable(int size)
    {
        buckets = new HashEntry[calculateInitialCapacity(size)];
        threshold = (int) (size * LOAD_FACTOR);
        mask = buckets.length - 1;
    }

    private static int calculateInitialCapacity(int size)
    {
        int capacity = 1;
        while (capacity < size)
            capacity <<= 1;
        return capacity;
    }

    public SubLSymbol getHT(SubLString key)
    {
        HashEntry e = buckets[key.sxhash() & mask];
        while (e != null) {
            if (key.equal(e.symbol.getSubLName()))
                return e.symbol; // Return the symbol.
            e = e.next;
        }
        return null;
    }

    public SubLSymbol getHT(SubLString key, int hash)
    {
        HashEntry e = buckets[hash & mask];
        while (e != null) {
            if (key.equal(e.symbol.getSubLName()))
                return e.symbol; // Return the symbol.
            e = e.next;
        }
        return null;
    }

    public void putHT(final SubLString key, final SubLSymbol symbol)
    {
        int index = key.sxhash() & mask;
        HashEntry e = buckets[index];
        while (e != null) {
            if (key.equal(e.symbol.getSubLName())) {
                if (e.symbol != symbol) {
                    Debug.trace("replacing existing key for " + key.getString() +
                                " in package " + e.symbol.getLispPackage().writeToString());
                    Thread.dumpStack();
                    e.symbol = symbol;
                }
                return;
            }
            e = e.next;
        }
        // Not found. We need to add a new entry.
        if (++count > threshold) {
            rehash();
            // We need a new index for the bigger table.
            index = key.sxhash() & mask;
        }
        e = new HashEntry(symbol);
        e.next = buckets[index];
        buckets[index] = e;
    }

    public void putHT(SubLSymbol symbol)
    {
        int index = symbol.sxhash() & mask;
        HashEntry e = buckets[index];
        while (e != null) {
            if (symbol.getSubLName().equal(e.symbol.getSubLName())) {
                if (e.symbol != symbol) {
                    Debug.trace("replacing existing key for " + symbol.getJavaSymbolName());
                    Thread.dumpStack();
                    e.symbol = symbol; // Replace existing key.
                }
                return;
            }
            e = e.next;
        }
        // Not found. We need to add a new entry.
        if (++count > threshold) {
            rehash();
            // Need a new hash value to suit the bigger table.
            index = symbol.sxhash() & mask;
        }
        e = new HashEntry(symbol);
        e.next = buckets[index];
        buckets[index] = e;
    }

    public SubLObject removeHT(SubLObject key)
    {
        if (key instanceof SubLSymbol)
            key = ((SubLSymbol)key).getSubLName();
        int index = key.sxhash() & mask;
        HashEntry e = buckets[index];
        HashEntry last = null;
        while (e != null) {
            if (key.equal(e.symbol.getSubLName())) {
                if (last == null)
                    buckets[index] = e.next;
                else
                    last.next = e.next;
                --count;
                return e.symbol; // The key is the value!
            }
            last = e;
            e = e.next;
        }
        return null;
    }

    private void rehash()
    {
        HashEntry[] oldBuckets = buckets;
        int newCapacity = buckets.length * 2;
        threshold = (int) (newCapacity * LOAD_FACTOR);
        buckets = new HashEntry[newCapacity];
        mask = buckets.length - 1;
        for (int i = oldBuckets.length; i-- > 0;) {
            HashEntry e = oldBuckets[i];
            while (e != null) {
                final int index = e.symbol.sxhash() & mask;
                HashEntry dest = buckets[index];
                if (dest != null) {
                    while (dest.next != null)
                        dest = dest.next;
                    dest.next = e;
                } else
                    buckets[index] = e;
                HashEntry next = e.next;
                e.next = null;
                e = next;
            }
        }
    }

    public List<SubLSymbol> getSymbols()
    {
        ArrayList<SubLSymbol> list = new ArrayList<SubLSymbol>();
        for (int i = 0; i < buckets.length; i++) {
            HashEntry e = buckets[i];
            while (e != null) {
                list.add(e.symbol);
                e = e.next;
            }
        }
        return list;
    }

    private static class HashEntry
    {
        SubLSymbol symbol;
        HashEntry next;

        HashEntry(SubLSymbol symbol)
        {
            this.symbol = symbol;
        }
    }
}
