/*
 * Nil.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Nil.java,v 1.2 2003-02-15 16:48:17 piso Exp $
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

public final class Nil extends LispObject implements SequenceType
{
    public LispObject car()
    {
        return NIL;
    }

    public LispObject cdr()
    {
        return NIL;
    }

    public final LispObject cadr()
    {
        return NIL;
    }

    public final LispObject cddr()
    {
        return NIL;
    }

    public int length()
    {
        return 0;
    }

    public LispObject elt(long index) throws LispError
    {
        throw new LispError("ELT: invalid index " + index + " for " + this);
    }

    public LispObject[] copyToArray()
    {
        return new LispObject[0];
    }

    public boolean listp()
    {
        return true;
    }

    public LispObject remove(LispObject item) throws LispError
    {
        return NIL;
    }

    public String toString()
    {
        return "NIL";
    }
}
