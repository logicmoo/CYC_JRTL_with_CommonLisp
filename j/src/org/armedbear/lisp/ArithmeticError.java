/*
 * ArithmeticError.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: ArithmeticError.java,v 1.16 2007-02-23 21:17:32 piso Exp $
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
    protected ArithmeticError(LispClass cls) throws ConditionThrowable
    {
        super(cls);
    }

    public ArithmeticError(LispObject initArgs) throws ConditionThrowable
    {
        super(StandardClass.ARITHMETIC_ERROR);
        initialize(initArgs);
    }

    protected void initialize(LispObject initArgs) throws ConditionThrowable
    {
        super.initialize(initArgs);
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
        setOperation(operation);
        setOperands(operands);
    }

    public ArithmeticError(String message) throws ConditionThrowable
    {
        super(StandardClass.ARITHMETIC_ERROR);
        setFormatControl(message);
        setFormatArguments(NIL);
        setOperation(NIL);
        setOperands(NIL);
    }

    public LispObject typeOf()
    {
        return Symbol.ARITHMETIC_ERROR;
    }

    public LispObject classOf()
    {
        return StandardClass.ARITHMETIC_ERROR;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.ARITHMETIC_ERROR)
            return T;
        if (type == StandardClass.ARITHMETIC_ERROR)
            return T;
        return super.typep(type);
    }

    private final LispObject getOperation() throws ConditionThrowable
    {
        return getInstanceSlotValue(Symbol.OPERATION);
    }

    private final void setOperation(LispObject operation)
        throws ConditionThrowable
    {
        setInstanceSlotValue(Symbol.OPERATION, operation);
    }

    private final LispObject getOperands() throws ConditionThrowable
    {
        return getInstanceSlotValue(Symbol.OPERANDS);
    }

    private final void setOperands(LispObject operands)
        throws ConditionThrowable
    {
        setInstanceSlotValue(Symbol.OPERANDS, operands);
    }

    // ### arithmetic-error-operation
    private static final Primitive ARITHMETIC_ERROR_OPERATION =
        new Primitive("arithmetic-error-operation", "condition")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((ArithmeticError)arg).getOperation();
            }
            catch (ClassCastException e) {
                return error(new TypeError(arg, Symbol.ARITHMETIC_ERROR));
            }
        }
    };
    // ### arithmetic-error-operands
    private static final Primitive ARITHMETIC_ERROR_OPERANDS =
        new Primitive("arithmetic-error-operands", "condition")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((ArithmeticError)arg).getOperands();
            }
            catch (ClassCastException e) {
                return error(new TypeError(arg, Symbol.ARITHMETIC_ERROR));
            }
        }
    };
}
