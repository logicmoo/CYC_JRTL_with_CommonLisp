/*
 * Readtable.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: Readtable.java,v 1.12 2004-03-12 00:37:17 piso Exp $
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

public final class Readtable extends LispObject
{
    private final Function[] readerMacroFunctions = new Function[CHAR_MAX];

    private ArrayList table;
    private LispObject readtableCase;

    public Readtable()
    {
        readerMacroFunctions[';'] = LispReader.READ_COMMENT;
        readerMacroFunctions['"'] = LispReader.READ_STRING;
        readerMacroFunctions[')'] = LispReader.READ_RIGHT_PAREN;
        readerMacroFunctions['\''] = LispReader.READ_QUOTE;
        table = new ArrayList();
        readtableCase = Keyword.UPCASE;
    }

    private Readtable(Readtable rt)
    {
        synchronized (rt) {
            System.arraycopy(rt.readerMacroFunctions, 0, readerMacroFunctions, 0,
                             CHAR_MAX);
            table = new ArrayList(rt.table);
            readtableCase = rt.readtableCase;
        }
    }

    // FIXME synchronization
    private static void copyReadtable(Readtable from, Readtable to)
    {
        System.arraycopy(from.readerMacroFunctions, 0, to.readerMacroFunctions, 0,
                         CHAR_MAX);
        to.table = new ArrayList(from.table);
        to.readtableCase = from.readtableCase;
    }

    public LispObject getReaderMacroFunction(char c)
    {
        if (c < CHAR_MAX)
            return readerMacroFunctions[c];
        else
            return null;
    }

    public LispObject getReadtableCase()
    {
        return readtableCase;
    }

    public LispObject typeOf()
    {
        return Symbol.READTABLE;
    }

    public LispClass classOf()
    {
        return BuiltInClass.READTABLE;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.READTABLE)
            return T;
        if (type == BuiltInClass.READTABLE)
            return T;
        return super.typep(type);
    }

    public String toString()
    {
        return unreadableString("READTABLE");
    }

    public LispObject getDispatchMacroCharacter(char dispChar, char subChar)
    {
        synchronized (table) {
            for (int i = 0; i < table.size(); i++) {
                Entry e = (Entry) table.get(i);
                if (e.dispChar == dispChar && e.subChar == subChar)
                    return e.function;
            }
        }
        return NIL;
    }

    public LispObject setDispatchMacroCharacter(char dispChar, char subChar,
                                                LispObject function)
    {
        synchronized (table) {
            for (int i = 0; i < table.size(); i++) {
                Entry e = (Entry) table.get(i);
                if (e.dispChar == dispChar && e.subChar == subChar) {
                    e.function = function;
                    return T;
                }
            }
            // Not found.
            table.add(new Entry(dispChar, subChar, function));
            return T;
        }
    }

    private static class Entry
    {
        char dispChar;
        char subChar;
        LispObject function;

        Entry(char dispChar, char subChar, LispObject function)
        {
            this.dispChar = dispChar;
            this.subChar = subChar;
            this.function = function;
        }
    }

    // ### readtablep
    private static final Primitive1 READTABLEP =
        new Primitive1("readtablep", "object")
    {
        public LispObject execute(LispObject arg)
        {
            return arg instanceof Readtable ? T : NIL;
        }
    };

    // ### copy-readtable
    private static final Primitive COPY_READTABLE =
        new Primitive("copy-readtable", "&optional from-readtable to-readtable")
    {
        public LispObject execute()
        {
            return new Readtable(getCurrentReadtable());
        }

        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg == NIL)
                return new Readtable();
            else
                return new Readtable(checkReadtable(arg));
        }

        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            Readtable from = checkReadtable(first);
            if (second == NIL)
                return new Readtable(from);
            Readtable to = checkReadtable(second);
            copyReadtable(from, to);
            return to;
        }
    };

    // ### get-dispatch-macro-character
    // get-dispatch-macro-character disp-char sub-char &optional readtable
    // => function
    private static final Primitive GET_DISPATCH_MACRO_CHARACTER =
        new Primitive("get-dispatch-macro-character",
                      "disp-char sub-char &optional readtable")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 2 || args.length > 3)
                return signal(new WrongNumberOfArgumentsException(this));
            char dispChar = LispCharacter.getValue(args[0]);
            char subChar = LispCharacter.getValue(args[1]);
            Readtable readtable;
            if (args.length == 3)
                readtable = checkReadtable(args[2]);
            else
                readtable = getCurrentReadtable();
            return readtable.getDispatchMacroCharacter(dispChar, subChar);
        }
    };

    // ### set-dispatch-macro-character
    // set-dispatch-macro-character disp-char sub-char new-function &optional readtable
    // => t
    private static final Primitive SET_DISPATCH_MACRO_CHARACTER =
        new Primitive("set-dispatch-macro-character",
                      "disp-char sub-char new-function &optional readtable")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 3 || args.length > 4)
                return signal(new WrongNumberOfArgumentsException(this));
            char dispChar = LispCharacter.getValue(args[0]);
            char subChar = LispCharacter.getValue(args[1]);
            LispObject function = coerceToFunction(args[2]);
            Readtable readtable;
            if (args.length == 4)
                readtable = checkReadtable(args[3]);
            else
                readtable = getCurrentReadtable();
            return readtable.setDispatchMacroCharacter(dispChar, subChar, function);
        }
    };

    // ### readtable-case readtable => mode
    private static final Primitive1 READTABLE_CASE =
        new Primitive1("readtable-case", "readtable")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((Readtable)arg).readtableCase;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.READTABLE));
            }
        }
    };

    // ### %set-readtable-case readtable new-mode => new-mode
    private static final Primitive2 _SET_READTABLE_CASE =
        new Primitive2("%set-readtable-case", PACKAGE_SYS, false,
                       "readtable new-mode")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                Readtable readtable = (Readtable) first;
                if (second == Keyword.UPCASE || second == Keyword.DOWNCASE ||
                    second == Keyword.INVERT || second == Keyword.PRESERVE)
                {
                    readtable.readtableCase = second;
                    return second;
                }
                return signal(new TypeError(second, list5(Symbol.MEMBER,
                                                          Keyword.INVERT,
                                                          Keyword.PRESERVE,
                                                          Keyword.DOWNCASE,
                                                          Keyword.UPCASE)));
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, Symbol.READTABLE));
            }
        }
    };
}
