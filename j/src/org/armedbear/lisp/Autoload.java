/*
 * Autoload.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: Autoload.java,v 1.3 2003-06-10 18:18:46 piso Exp $
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

public final class Autoload extends Function
{
    final Symbol symbol;
    final String fileName;

    public Autoload(Symbol symbol, String fileName)
    {
        this.symbol = symbol;
        this.fileName = fileName;
    }

    public final Symbol getSymbol()
    {
        return symbol;
    }

    public final String getFileName()
    {
        return fileName;
    }

    public final int getFunctionalType()
    {
        return FTYPE_AUTOLOAD;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#<AUTOLOAD ");
        sb.append(symbol);
        sb.append(" \"");
        sb.append(fileName);
        sb.append("\">");
        return sb.toString();
    }

    private static final Primitive2 AUTOLOAD = new Primitive2("autoload") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            final String fileName = LispString.getValue(second);
            if (first instanceof Symbol) {
                Symbol symbol = (Symbol) first;
                symbol.setSymbolFunction(new Autoload(symbol, fileName));
                return T;
            }
            if (first instanceof Cons) {
                for (LispObject list = first; list != NIL; list = list.cdr()) {
                    Symbol symbol = checkSymbol(list.car());
                    symbol.setSymbolFunction(new Autoload(symbol, fileName));
                }
                return T;
            }
            throw new TypeError(first);
        }
    };
}
