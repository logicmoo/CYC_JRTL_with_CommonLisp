/*
 * BitVector.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: BitVector.java,v 1.3 2003-02-27 18:39:52 piso Exp $
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

public final class BitVector extends Vector
{
    public BitVector(int length)
    {
        super(length);
        for (int i = length; i-- > 0;)
            set(i, new Fixnum(0));
    }

    public BitVector(String s)
    {
        super(s.length());
        for (int i = s.length(); i-- > 0;) {
            char c = s.charAt(i);
            if (c == '0')
                set(i, new Fixnum(0));
            else if (c == '1')
                set(i, new Fixnum(1));
            else
                Debug.assertTrue(false);
        }
    }

    public LispObject typeOf()
    {
        if (isSimpleVector())
            return list(Symbol.SIMPLE_BIT_VECTOR, new Fixnum(length()));
        return list(Symbol.BIT_VECTOR, new Fixnum(length()));
    }

    public boolean isSimpleVector()
    {
        return fillPointer < 0;
    }

    public void fill(LispObject obj) throws LispError
    {
        long n = Fixnum.getValue(obj);
        if (n == 0 || n == 1) {
            for (int i = length(); i-- > 0;)
                set(i, new Fixnum(n));
        } else
            throw new TypeError(obj, "bit");
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#*");
        final int limit = length();
        for (int i = 0; i < limit; i++)
            sb.append(get(i));
        return sb.toString();
    }
}
