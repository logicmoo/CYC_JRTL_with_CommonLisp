/*
 * Readtable.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: Readtable.java,v 1.3 2003-12-16 02:22:47 piso Exp $
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
    private ArrayList table = new ArrayList();

    public Readtable()
    {
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

    public LispObject getDispatchMacroCharacter(char dispChar,
        char subChar)
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

    public LispObject setDispatchMacroCharacter(char dispChar,
        char subChar, LispObject function)
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

    // ### get-dispatch-macro-character
    // get-dispatch-macro-character disp-char sub-char &optional readtable
    // => function
    private static final Primitive GET_DISPATCH_MACRO_CHARACTER =
        new Primitive("get-dispatch-macro-character", "disp-char sub-char &optional readtable")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 2 || args.length > 3)
                signal(new WrongNumberOfArgumentsException(this));
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
        new Primitive("set-dispatch-macro-character", "disp-char sub-char new-function &optional readtable")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 3 || args.length > 4)
                signal(new WrongNumberOfArgumentsException(this));
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
}
