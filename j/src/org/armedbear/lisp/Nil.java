/*
 * Nil.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: Nil.java,v 1.30 2004-01-14 02:23:43 piso Exp $
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

public final class Nil extends Symbol
{
    public Nil(Package pkg)
    {
        super("NIL", pkg);
        pkg.addSymbol(this);
        setSymbolValue(this);
    }

    public LispObject typeOf()
    {
        return Symbol.NULL;
    }

    public LispClass classOf()
    {
        return BuiltInClass.NULL;
    }

    public boolean getBooleanValue()
    {
        return false;
    }

    public LispObject typep(LispObject typeSpecifier) throws ConditionThrowable
    {
        if (typeSpecifier == Symbol.NULL)
            return T;
        if (typeSpecifier == Symbol.LIST)
            return T;
        if (typeSpecifier == Symbol.SEQUENCE)
            return T;
        if (typeSpecifier == Symbol.SYMBOL)
            return T;
        if (typeSpecifier == Symbol.BOOLEAN)
            return T;
        if (typeSpecifier == BuiltInClass.NULL)
            return T;
        if (typeSpecifier == BuiltInClass.LIST)
            return T;
        if (typeSpecifier == BuiltInClass.SEQUENCE)
            return T;
        if (typeSpecifier == BuiltInClass.SYMBOL)
            return T;
        return super.typep(typeSpecifier);
    }

    public LispObject CONSTANTP()
    {
        return T;
    }

    public final LispObject getSymbolValue()
    {
        return this;
    }

    public LispObject car()
    {
        return this;
    }

    public LispObject cdr()
    {
        return this;
    }

    public final LispObject cadr()
    {
        return this;
    }

    public final LispObject cddr()
    {
        return this;
    }

    public int length()
    {
        return 0;
    }

    public LispObject elt(int index) throws ConditionThrowable
    {
        return signal(new TypeError("ELT: invalid index " + index + " for " + this));
    }

    public LispObject nreverse()
    {
        return this;
    }

    public LispObject[] copyToArray()
    {
        return new LispObject[0];
    }

    public boolean listp()
    {
        return true;
    }

    public LispObject LISTP()
    {
        return T;
    }

    public LispObject ENDP()
    {
        return T;
    }

    public LispObject NOT()
    {
        return T;
    }

    public final LispObject getSymbolFunction()
    {
        return null;
    }

    public LispObject remove(LispObject item) throws ConditionThrowable
    {
        return this;
    }

    public String toString()
    {
        return "NIL";
    }
}
