/*
 * TypeError.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: TypeError.java,v 1.12 2003-12-12 15:55:17 piso Exp $
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
    protected LispObject datum;
    protected LispObject expectedType;
    private String typeString;

    public TypeError()
    {
        datum = NIL;
        expectedType = NIL;
    }

    public TypeError(LispObject datum, LispObject expectedType)
    {
        this.datum = datum;
        this.expectedType = expectedType;
    }

    public TypeError(LispObject initArgs) throws ConditionThrowable
    {
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
        this.datum = datum;
        this.expectedType = expectedType;
        this.typeString = String.valueOf(expectedType);
    }

    public TypeError(String message)
    {
        super(message);
    }

    public TypeError(LispObject datum, String typeString)
    {
        this.datum = datum;
        this.typeString = typeString;
    }

    public LispObject typeOf()
    {
        return Symbol.TYPE_ERROR;
    }

    public LispClass classOf()
    {
        return BuiltInClass.TYPE_ERROR;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.TYPE_ERROR)
            return T;
        if (type == BuiltInClass.TYPE_ERROR)
            return T;
        return super.typep(type);
    }

    public String getMessage()
    {
        String s = super.getMessage();
        if (s != null)
            return s;
        StringBuffer sb = new StringBuffer("wrong type");
        String name = datum != null ? String.valueOf(datum) : null;
        if (typeString != null) {
            if (name == null)
                name = "datum";
            sb.append(": ");
            sb.append(name);
            sb.append(" is not a");
            if ("aeiou".indexOf(typeString.charAt(0)) >= 0)
                sb.append('n');
            sb.append(' ');
            sb.append(typeString);
        } else if (name != null) {
            sb.append(": ");
            sb.append(name);
        }
        return sb.toString();
    }

    // ### type-error-datum
    private static final Primitive1 TYPE_ERROR_DATUM =
        new Primitive1("type-error-datum", "condition")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof TypeError)
                return ((TypeError)arg).datum;
            throw new ConditionThrowable(new TypeError(arg, Symbol.TYPE_ERROR));
        }
    };

    // ### type-error-expected-type
    private static final Primitive1 TYPE_ERROR_EXPECTED_TYPE =
        new Primitive1("type-error-expected-type", "condition")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof TypeError)
                return ((TypeError)arg).expectedType;
            throw new ConditionThrowable(new TypeError(arg, Symbol.TYPE_ERROR));
        }
    };
}
