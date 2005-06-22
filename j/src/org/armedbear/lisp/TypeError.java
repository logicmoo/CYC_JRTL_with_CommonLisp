/*
 * TypeError.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: TypeError.java,v 1.28 2005-06-22 15:31:46 piso Exp $
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

public class TypeError extends LispError
{
    private String typeString;

    public TypeError()
    {
        super(StandardClass.TYPE_ERROR);
        setDatum(NIL);
        setExpectedType(NIL);
    }

    protected TypeError(LispClass cls)
    {
        super(cls);
    }

    public TypeError(LispObject datum, LispObject expectedType)
    {
        super(StandardClass.TYPE_ERROR);
        setDatum(datum);
        setExpectedType(expectedType);
    }

    public TypeError(LispObject initArgs) throws ConditionThrowable
    {
        super(StandardClass.TYPE_ERROR);
        initialize(initArgs);
    }

    protected void initialize(LispObject initArgs) throws ConditionThrowable
    {
        super.initialize(initArgs);
        LispObject datum = NIL;
        LispObject expectedType = NIL;
        LispObject first, second;
        while (initArgs != NIL) {
            first = initArgs.car();
            initArgs = initArgs.cdr();
            second = initArgs.car();
            initArgs = initArgs.cdr();
            if (first == Keyword.DATUM)
                datum = second;
            else if (first == Keyword.EXPECTED_TYPE)
                expectedType = second;
        }
        setDatum(datum);
        setExpectedType(expectedType);
        this.typeString = expectedType.writeToString();
    }

    public TypeError(String message)
    {
        super(StandardClass.TYPE_ERROR);
        setFormatControl(message);
        setDatum(NIL);
        setExpectedType(NIL);
    }

    public TypeError(String message, LispObject datum, LispObject expectedType)
    {
        super(StandardClass.TYPE_ERROR);
        setFormatControl(message);
        setDatum(datum);
        setExpectedType(expectedType);
    }

    public TypeError(LispObject datum, String typeString)
    {
        super(StandardClass.TYPE_ERROR);
        setDatum(datum);
        setExpectedType(NIL);
        this.typeString = typeString;
    }

    public LispObject typeOf()
    {
        return Symbol.TYPE_ERROR;
    }

    public LispObject classOf()
    {
        return StandardClass.TYPE_ERROR;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.TYPE_ERROR)
            return T;
        if (type == StandardClass.TYPE_ERROR)
            return T;
        return super.typep(type);
    }

    public String getMessage()
    {
        // FIXME
        try {
            final LispThread thread = LispThread.currentThread();
            final SpecialBinding lastSpecialBinding = thread.lastSpecialBinding;
            thread.bindSpecial(_PRINT_ESCAPE_, T);
            try {
                String s = super.getMessage();
                if (s != null)
                    return s;
                final LispObject datum = getDatum();
                final LispObject expectedType = getExpectedType();
                StringBuffer sb = new StringBuffer();
                String name = datum != null ? datum.writeToString() : null;
                String type = null;
                if (typeString != null)
                    type = typeString;
                else if (expectedType != null)
                    type = expectedType.writeToString();
                if (type != null) {
                    if (name != null) {
                        sb.append("The value ");
                        sb.append(name);
                    } else
                        sb.append("Value");
                    sb.append(" is not of type ");
                    sb.append(type);
                } else if (name != null) {
                    sb.append("Wrong type: ");
                    sb.append(name);
                }
                sb.append('.');
                return sb.toString();
            }
            catch (Throwable t) {
                // FIXME
                Debug.trace(t);
                return toString();
            }
            finally {
                thread.lastSpecialBinding = lastSpecialBinding;
            }
        }
        catch (Throwable t) {
            return toString();
        }
    }

    public final LispObject getDatum()
    {
        Debug.assertTrue(layout != null);
        int index = layout.getSlotIndex(Symbol.DATUM);
        Debug.assertTrue(index >= 0);
        return slots[index];
    }

    private final void setDatum(LispObject datum)
    {
        Debug.assertTrue(layout != null);
        int index = layout.getSlotIndex(Symbol.DATUM);
        Debug.assertTrue(index >= 0);
        slots[index] = datum;
    }

    public final LispObject getExpectedType()
    {
        Debug.assertTrue(layout != null);
        int index = layout.getSlotIndex(Symbol.EXPECTED_TYPE);
        Debug.assertTrue(index >= 0);
        return slots[index];
    }

    private final void setExpectedType(LispObject expectedType)
    {
        Debug.assertTrue(layout != null);
        int index = layout.getSlotIndex(Symbol.EXPECTED_TYPE);
        Debug.assertTrue(index >= 0);
        slots[index] = expectedType;
    }

    // ### type-error-datum
    private static final Primitive TYPE_ERROR_DATUM =
        new Primitive("type-error-datum", "condition")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((TypeError)arg).getDatum();
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.TYPE_ERROR));
            }
        }
    };

    // ### type-error-expected-type
    private static final Primitive TYPE_ERROR_EXPECTED_TYPE =
        new Primitive("type-error-expected-type", "condition")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((TypeError)arg).getExpectedType();
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.TYPE_ERROR));
            }
        }
    };
}
