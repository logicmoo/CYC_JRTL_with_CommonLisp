/*
 * HashTable.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: HashTable.java,v 1.1 2003-01-17 19:43:14 piso Exp $
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
 */

package org.armedbear.lisp;

import java.util.HashMap;

// FIXME This implementation only supports EQ hash tables.
public final class HashTable extends LispObject
{
    private HashMap map = new HashMap();

    public HashTable() {}

    // gethash key hash-table &optional default => value, present-p
    public synchronized LispObject gethash(LispObject key,
        LispObject defaultValue)
    {
        LispObject[] values = new LispObject[2];
        LispObject value = (LispObject) map.get(key);
        if (value == null) {
            value = defaultValue;
            values[1] = NIL;
        } else
            values[1] = T;
        values[0] = value;
        setValues(values);
        return value;
    }

    public synchronized LispObject puthash(LispObject key, LispObject newValue)
    {
        map.put(key, newValue);
        return newValue;
    }

    // remhash key hash-table => generalized-boolean
    public synchronized LispObject remhash(LispObject key)
    {
        // A value in a Lisp hash table can never be null, so...
        return map.remove(key) != null ? T : NIL;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#<EQ hash table, ");
        sb.append(map.size());
        if (map.size() == 1)
            sb.append(" entry>");
        else
            sb.append(" entries>");
        return sb.toString();
    }
}
