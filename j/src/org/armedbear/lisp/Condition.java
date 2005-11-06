/*
 * Condition.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: Condition.java,v 1.47 2005-11-06 20:40:17 piso Exp $
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
    protected String message;

    public Condition() throws ConditionThrowable
    {
        super(StandardClass.CONDITION);
        Debug.assertTrue(slots.length == 2);
        setFormatArguments(NIL);
    }

    protected Condition(LispClass cls) throws ConditionThrowable
    {
        super(cls);
        Debug.assertTrue(slots.length >= 2);
        setFormatArguments(NIL);
    }

    public Condition(LispClass cls, int length)
    {
        super(cls, length);
    }

    public Condition(LispObject initArgs) throws ConditionThrowable
    {
        super(StandardClass.CONDITION);
        Debug.assertTrue(slots.length == 2);
        initialize(initArgs);
    }

    protected void initialize(LispObject initArgs) throws ConditionThrowable
    {
        LispObject control = null;
        LispObject arguments = null;
        LispObject first, second;
        while (initArgs instanceof Cons) {
            first = initArgs.car();
            initArgs = initArgs.cdr();
            second = initArgs.car();
            initArgs = initArgs.cdr();
            if (first == Keyword.FORMAT_CONTROL) {
                if (control == null)
                    control = second;
            } else if (first == Keyword.FORMAT_ARGUMENTS) {
                if (arguments == null)
                    arguments = second;
            }
        }
        if (control != null)
            setFormatControl(control);
        if (arguments == null)
            arguments = NIL;
        setFormatArguments(arguments);
    }

    public Condition(String message)
    {
        this.message = message;
    }

    public final LispObject getFormatControl() throws ConditionThrowable
    {
        return getInstanceSlotValue(Symbol.FORMAT_CONTROL);
    }

    public final void setFormatControl(LispObject formatControl)
        throws ConditionThrowable
    {
        setInstanceSlotValue(Symbol.FORMAT_CONTROL, formatControl);
    }

    public final void setFormatControl(String s) throws ConditionThrowable
    {
        setFormatControl(new SimpleString(s));
    }

    public final LispObject getFormatArguments() throws ConditionThrowable
    {
        return getInstanceSlotValue(Symbol.FORMAT_ARGUMENTS);
    }

    public final void setFormatArguments(LispObject formatArguments)
        throws ConditionThrowable
    {
        setInstanceSlotValue(Symbol.FORMAT_ARGUMENTS, formatArguments);
    }

    public String getMessage() throws ConditionThrowable
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

    public LispObject classOf()
    {
        LispClass c = getLispClass();
        if (c != null)
            return c;
        return StandardClass.CONDITION;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.CONDITION)
            return T;
        if (type == StandardClass.CONDITION)
            return T;
        return super.typep(type);
    }

    public String getConditionReport() throws ConditionThrowable
    {
        String s = getMessage();
        if (s != null)
            return s;
        LispObject formatControl = getFormatControl();
        if (formatControl != NIL) {
            try {
                return format(formatControl, getFormatArguments());
            }
            catch (Throwable t) {}
        }
        return unreadableString(typeOf().writeToString());
    }

    public String writeToString() throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        if (Symbol.PRINT_ESCAPE.symbolValue(thread) == NIL) {
            String s = getMessage();
            if (s != null)
                return s;
            LispObject formatControl = getFormatControl();
            if (formatControl instanceof Function) {
                StringOutputStream stream = new StringOutputStream();
                Symbol.APPLY.execute(formatControl, stream, getFormatArguments());
                return stream.getString().getStringValue();
            }
            if (formatControl instanceof AbstractString) {
                LispObject f = Symbol.FORMAT.getSymbolFunction();
                if (f == null || f instanceof Autoload)
                    return format(formatControl, getFormatArguments());
                return Symbol.APPLY.execute(f, NIL, formatControl, getFormatArguments()).getStringValue();
            }
        }
        final int maxLevel;
        LispObject printLevel = Symbol.PRINT_LEVEL.symbolValue(thread);
        if (printLevel instanceof Fixnum)
            maxLevel = ((Fixnum)printLevel).value;
        else
            maxLevel = Integer.MAX_VALUE;
        LispObject currentPrintLevel =
            _CURRENT_PRINT_LEVEL_.symbolValue(thread);
        int currentLevel = ((Fixnum)currentPrintLevel).value;
        if (currentLevel >= maxLevel)
            return "#";
        return unreadableString(typeOf().writeToString());
    }
}
