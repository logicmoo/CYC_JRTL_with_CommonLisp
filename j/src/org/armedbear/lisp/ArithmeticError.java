/*
 * ArithmeticError.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: ArithmeticError.java,v 1.10 2004-03-18 01:41:11 piso Exp $
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

public class ArithmeticError extends LispError
{
    private final LispObject operation;
    private final LispObject operands;

    public ArithmeticError()
    {
        operation = NIL;
        operands = NIL;
    }

    public ArithmeticError(LispObject initArgs) throws ConditionThrowable
    {
        super(initArgs);
        LispObject operation = NIL;
        LispObject operands = NIL;
        LispObject first, second;
        while (initArgs != NIL) {
            first = initArgs.car();
            initArgs = initArgs.cdr();
            second = initArgs.car();
            initArgs = initArgs.cdr();
            if (first == Keyword.OPERATION)
                operation = second;
            else if (first == Keyword.OPERANDS)
                operands = second;
        }
        this.operation = operation;
        this.operands = operands;
    }

    public ArithmeticError(String message)
    {
        super(message);
        operation = NIL;
        operands = NIL;
    }

    public LispObject typeOf()
    {
        return Symbol.ARITHMETIC_ERROR;
    }

    public LispClass classOf()
    {
        return BuiltInClass.ARITHMETIC_ERROR;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.ARITHMETIC_ERROR)
            return T;
        if (type == BuiltInClass.ARITHMETIC_ERROR)
            return T;
        return super.typep(type);
    }

    // ### arithmetic-error-operation
    private static final Primitive1 ARITHMETIC_ERROR_OPERATION =
        new Primitive1("arithmetic-error-operation", "condition")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((ArithmeticError)arg).operation;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.ARITHMETIC_ERROR));
            }
        }
    };
    // ### arithmetic-error-operands
    private static final Primitive1 ARITHMETIC_ERROR_OPERANDS =
        new Primitive1("arithmetic-error-operands", "condition")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((ArithmeticError)arg).operands;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.ARITHMETIC_ERROR));
            }
        }
    };
}
