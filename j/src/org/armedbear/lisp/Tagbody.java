/*
 * Tagbody.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: Tagbody.java,v 1.1 2003-02-19 17:48:53 piso Exp $
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

import java.util.ArrayList;

public final class Tagbody extends Lisp
{
    private final ArrayList tags = new ArrayList();

    public Tagbody(LispObject body) throws LispError
    {
        LispObject remaining = body;
        while (remaining != NIL) {
            LispObject current = remaining.car();
            remaining = remaining.cdr();
            if (!(current instanceof Cons))
                tags.add(new Pair(current, remaining));
        }
    }

    public LispObject getCode(LispObject tag)
    {
        for (int i = tags.size(); i-- > 0;) {
            Pair pair = (Pair) tags.get(i);
            if (eql(pair.first, tag))
                return pair.second;
        }
        return null;
    }

    private static class Pair
    {
        LispObject first;
        LispObject second;

        Pair(LispObject first, LispObject second)
        {
            this.first = first;
            this.second = second;
        }
    }
}
