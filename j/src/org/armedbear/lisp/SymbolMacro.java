/*
 * SymbolMacro.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id$
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

public final class SymbolMacro extends LispObject
{
    private LispObject expansion;

    public SymbolMacro(LispObject expansion)
    {
        this.expansion = expansion;
    }

    public LispObject getExpansion()
    {
        return expansion;
    }

    // ### make-symbol-macro
    private static final Primitive MAKE_MACRO =
        new Primitive("make-symbol-macro", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return new SymbolMacro(arg);
        }
    };
}
