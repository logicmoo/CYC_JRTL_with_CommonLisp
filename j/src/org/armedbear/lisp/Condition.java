/*
 * Condition.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: Condition.java,v 1.24 2004-04-24 12:33:11 piso Exp $
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

public class Condition extends StandardObject
{
    private LispObject formatControl = NIL;
    private LispObject formatArguments = NIL;

    private String message = null;

    public Condition()
    {
        message = null;
    }

    public Condition(LispClass cls, SimpleVector slots)
    {
        super(cls, slots);
        message = null;
    }

    public Condition(LispObject initArgs) throws ConditionThrowable
    {
        super(BuiltInClass.CONDITION, null);
        LispObject formatControl = NIL;
        LispObject formatArguments = NIL;
        LispObject first, second;
        while (initArgs instanceof Cons) {
            first = initArgs.car();
            initArgs = initArgs.cdr();
            second = initArgs.car();
            initArgs = initArgs.cdr();
            if (first == Keyword.FORMAT_CONTROL)
                formatControl = second;
            else if (first == Keyword.FORMAT_ARGUMENTS)
                formatArguments = second;
        }
        setFormatControl(formatControl);
        setFormatArguments(formatArguments);
    }

    public Condition(String message)
    {
        this.message = message;
    }

    public final LispObject getFormatControl()
    {
        return formatControl;
    }

    public final void setFormatControl(LispObject formatControl)
    {
        this.formatControl = formatControl;
    }

    public final LispObject getFormatArguments()
    {
        return formatArguments;
    }

    public final void setFormatArguments(LispObject formatArguments)
    {
        this.formatArguments = formatArguments;
    }

    public String getMessage()
    {
        return message;
    }

    public LispObject typeOf()
    {
        LispClass c = getLispClass();
        if (c != null)
            return c.getSymbol();
        return Symbol.CONDITION;
    }

    public LispClass classOf()
    {
        LispClass c = getLispClass();
        if (c != null)
            return c;
        return BuiltInClass.CONDITION;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.CONDITION)
            return T;
        if (type == BuiltInClass.CONDITION)
            return T;
        return super.typep(type);
    }

    public String getConditionReport()
    {
        String s = getMessage();
        if (s != null)
            return s;
        if (formatControl != NIL) {
            try {
                return format(formatControl, formatArguments);
            }
            catch (Throwable t) {}
        }
        return unreadableString(String.valueOf(typeOf()));
    }

    public String writeToString() throws ConditionThrowable
    {
        if (_PRINT_ESCAPE_.symbolValue() == NIL) {
            String s = getMessage();
            if (s != null)
                return s;
            if (formatControl != NIL)
                return format(formatControl, formatArguments);
        }
        return unreadableString(typeOf().writeToString());
    }

    // ### condition-report
    private static final Primitive1 CONDITION_REPORT =
        new Primitive1("condition-report", PACKAGE_SYS, false, "condition")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                String s = ((Condition)arg).getMessage();
                return s != null ? new SimpleString(s) : NIL;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.CONDITION));
            }
        }
    };
}
