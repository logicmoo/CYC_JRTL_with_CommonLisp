/*
 * Function.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Function.java,v 1.5 2003-03-03 18:15:21 piso Exp $
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

public abstract class Function extends LispObject
{
    private final Module module;
    private final String name;
    protected final int index;

    protected Function()
    {
        module = null;
        name = null;
        index = 0;
    }

    public Function(String name)
    {
        module = null;
        this.name = name != null ? name.toUpperCase() : null;
        index = 0;
        if (name != null)
            Symbol.addFunction(this);
    }

    public Function(String name, Package pkg)
    {
        module = null;
        this.name = name != null ? name.toUpperCase() : null;
        index = 0;
        if (name != null) {
            Symbol symbol = pkg.intern(this.name);
            symbol.setSymbolFunction(this);
        }
    }

    public Function(Module module, String name, int index)
    {
        this.module = module;
        this.name = name.toUpperCase();
        this.index = index;
        Symbol.addFunction(this);
    }

    public LispObject typeOf()
    {
        return Symbol.FUNCTION;
    }

    public LispObject typep(LispObject typeSpecifier) throws LispError
    {
        if (typeSpecifier == Symbol.FUNCTION)
            return T;
        return super.typep(typeSpecifier);
    }

    public final String getName()
    {
        return name;
    }

    // Primitive
    public LispObject execute(LispObject[] args) throws Condition
    {
        return module.dispatch(args, index);
    }

    // Primitive1
    public LispObject execute(LispObject arg) throws Condition
    {
        return module.dispatch(arg, index);
    }

    // Primitive2
    public LispObject execute(LispObject first, LispObject second)
        throws Condition
    {
        return module.dispatch(first, second, index);
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#<FUNCTION ");
        sb.append(name);
        sb.append(">");
        return sb.toString();
    }
}
