/*
 * LispObject.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: LispObject.java,v 1.8 2003-03-03 03:04:50 piso Exp $
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

public class LispObject extends Lisp
{
    public int getType()
    {
        return 0;
    }

    public LispObject typeOf()
    {
        return T;
    }

    public LispObject typep(LispObject typeSpecifier) throws LispError
    {
        return typeSpecifier == T ? T : NIL;
    }

    public LispObject constantp()
    {
        return NIL;
    }

    public String getName()
    {
        return null;
    }

    public LispObject car() throws LispError
    {
        throw new TypeError(this, "list");
    }

    public void setCar(LispObject obj) throws LispError
    {
        throw new TypeError(this, "cons");
    }

    public LispObject cdr() throws LispError
    {
        throw new TypeError(this, "list");
    }

    public void setCdr(LispObject obj) throws LispError
    {
        throw new TypeError(this, "cons");
    }

    public LispObject cadr() throws LispError
    {
        throw new TypeError(this, "list");
    }

    public LispObject cddr() throws LispError
    {
        throw new TypeError(this, "list");
    }

    public int length() throws LispError
    {
        throw new TypeError(this, "sequence");
    }

    public LispObject elt(long index) throws LispError
    {
        throw new TypeError(this, "sequence");
    }

    public LispObject[] copyToArray() throws LispError
    {
        throw new TypeError(this, "list");
    }

    public boolean listp()
    {
        return false;
    }

    public boolean isSpecialVariable()
    {
        return false;
    }

    public LispObject getSymbolValue() throws LispError
    {
        throw new TypeError(this, "symbol");
    }

    public LispObject getSymbolFunction() throws LispError
    {
        throw new TypeError(this, "symbol");
    }

    public String toString()
    {
        return super.toString();
    }

    // Special operator
    public LispObject execute(LispObject args, Environment env)
        throws Condition
    {
        throw new LispError();
    }

    // Primitive
    public LispObject execute(LispObject[] args) throws Condition
    {
        throw new LispError();
    }

    // Primitive0
    public LispObject execute() throws Condition
    {
        throw new LispError();
    }

    // Primitive1
    public LispObject execute(LispObject arg) throws Condition
    {
        throw new LispError();
    }

    // Primitive2
    public LispObject execute(LispObject first, LispObject second)
        throws Condition
    {
        throw new LispError();
    }

    // Primitive3
    public LispObject execute(LispObject first, LispObject second,
        LispObject third) throws Condition
    {
        throw new LispError();
    }
}
