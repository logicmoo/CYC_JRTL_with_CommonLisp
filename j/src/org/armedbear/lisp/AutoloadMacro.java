/*
 * AutoloadMacro.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: AutoloadMacro.java,v 1.11 2004-03-31 00:57:33 piso Exp $
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

public final class AutoloadMacro extends Autoload
{
    private AutoloadMacro(Symbol symbol)
    {
        super(symbol);
    }

    private AutoloadMacro(Symbol symbol, String fileName)
    {
        super(symbol, fileName, null);
    }

    private static void installAutoloadMacro(Symbol symbol, String fileName)
    {
        symbol.setSymbolFunction(new AutoloadMacro(symbol, fileName));
    }

    public void load() throws ConditionThrowable
    {
        Load.loadSystemFile(getFileName(), true);
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("AUTOLOAD-MACRO ");
        sb.append(symbol);
        sb.append(" \"");
        sb.append(getFileName());
        sb.append('"');
        return unreadableString(sb.toString());
    }

    // ### autoload-macro
    private static final Primitive AUTOLOAD_MACRO =
        new Primitive("autoload-macro", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject first) throws ConditionThrowable
        {
            if (first instanceof Symbol) {
                Symbol symbol = (Symbol) first;
                installAutoloadMacro(symbol, null);
                return T;
            }
            if (first instanceof Cons) {
                for (LispObject list = first; list != NIL; list = list.cdr()) {
                    Symbol symbol = checkSymbol(list.car());
                    installAutoloadMacro(symbol, null);
                }
                return T;
            }
            return signal(new TypeError(first));
        }
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            final String fileName = second.getStringValue();
            if (first instanceof Symbol) {
                Symbol symbol = (Symbol) first;
                installAutoloadMacro(symbol, fileName);
                return T;
            }
            if (first instanceof Cons) {
                for (LispObject list = first; list != NIL; list = list.cdr()) {
                    Symbol symbol = checkSymbol(list.car());
                    installAutoloadMacro(symbol, fileName);
                }
                return T;
            }
            return signal(new TypeError(first));
        }
    };
}
