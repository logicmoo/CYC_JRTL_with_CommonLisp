/*
 * Autoload.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: Autoload.java,v 1.9 2003-06-20 17:44:22 piso Exp $
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
    final String className;

    private Autoload(Symbol symbol)
    {
        this.symbol = symbol;
        fileName = null;
        className = null;
    }

    private Autoload(Symbol symbol, String fileName, String className)
    {
        this.symbol = symbol;
        this.fileName = fileName;
        this.className = className;
    }

    public static void autoload(String symbolName, String className)
    {
        Symbol symbol = intern(symbolName.toUpperCase(), PACKAGE_CL);
        symbol.setSymbolFunction(new Autoload(symbol, null, className));
    }

    public void load() throws Condition
    {
        if (className != null) {
            try {
                CharacterOutputStream out = getStandardOutput();
                out.writeString("; Loading ");
                out.writeString(className);
                out.writeLine(" ...");
                out.finishOutput();
                long start = System.currentTimeMillis();
                Class.forName(className);
                long elapsed = System.currentTimeMillis() - start;
                out.writeString("; Loaded ");
                out.writeString(className);
                out.writeString(" (");
                out.writeString(String.valueOf(((float)elapsed)/1000));
                out.writeLine(" seconds)");
                out.finishOutput();
            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else
            Load._load(getFileName(), true, false);
    }

    public final Symbol getSymbol()
    {
        return symbol;
    }

    private final String getFileName()
    {
        if (fileName != null)
            return fileName;
        return symbol.getName().toLowerCase().concat(".lisp");
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
        sb.append(getFileName());
        sb.append("\">");
        return sb.toString();
    }

    private static final Primitive AUTOLOAD = new Primitive("autoload") {
        public LispObject execute(LispObject first) throws LispError
        {
            if (first instanceof Symbol) {
                Symbol symbol = (Symbol) first;
                symbol.setSymbolFunction(new Autoload(symbol));
                return T;
            }
            if (first instanceof Cons) {
                for (LispObject list = first; list != NIL; list = list.cdr()) {
                    Symbol symbol = checkSymbol(list.car());
                    symbol.setSymbolFunction(new Autoload(symbol));
                }
                return T;
            }
            throw new TypeError(first);
        }
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            final String fileName = LispString.getValue(second);
            if (first instanceof Symbol) {
                Symbol symbol = (Symbol) first;
                symbol.setSymbolFunction(new Autoload(symbol, fileName, null));
                return T;
            }
            if (first instanceof Cons) {
                for (LispObject list = first; list != NIL; list = list.cdr()) {
                    Symbol symbol = checkSymbol(list.car());
                    symbol.setSymbolFunction(new Autoload(symbol, fileName, null));
                }
                return T;
            }
            throw new TypeError(first);
        }
    };

    static {
        autoload("%make-hash-table", "org.armedbear.lisp.HashTable");
        autoload("coerce", "org.armedbear.lisp.coerce");
        autoload("gethash", "org.armedbear.lisp.HashTable");
        autoload("puthash", "org.armedbear.lisp.HashTable");
        autoload("remhash", "org.armedbear.lisp.HashTable");
        autoload("room", "org.armedbear.lisp.room");
        autoload("sxhash", "org.armedbear.lisp.HashTable");
    }
}
