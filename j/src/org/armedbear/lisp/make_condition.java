/*
 * make_condition.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: make_condition.java,v 1.14 2004-01-18 20:10:02 piso Exp $
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

public final class make_condition extends Primitive2
{
    private make_condition()
    {
        super("%make-condition", PACKAGE_SYS, false);
    }

    // ### %make-condition
    // %make-condition type slot-initializations => condition
    public LispObject execute(LispObject type, LispObject initArgs)
        throws ConditionThrowable
    {
        if (type == Symbol.ARITHMETIC_ERROR)
            return new ArithmeticError(initArgs);
        if (type == Symbol.CELL_ERROR)
            return new CellError(initArgs);
        if (type == Symbol.CONDITION)
            return new Condition(initArgs);
        if (type == Symbol.CONTROL_ERROR)
            return new ControlError(initArgs);
        if (type == Symbol.DIVISION_BY_ZERO)
            return new DivisionByZero(initArgs);
        if (type == Symbol.END_OF_FILE)
            return new EndOfFile(initArgs);
        if (type == Symbol.ERROR)
            return new LispError(initArgs);
        if (type == Symbol.FILE_ERROR)
            return new FileError(initArgs);
        if (type == Symbol.PACKAGE_ERROR)
            return new PackageError(initArgs);
        if (type == Symbol.PARSE_ERROR)
            return new ParseError(initArgs);
        if (type == Symbol.PROGRAM_ERROR)
            return new ProgramError(initArgs);
        if (type == Symbol.READER_ERROR)
            return new ReaderError(initArgs);
        if (type == Symbol.SERIOUS_CONDITION)
            return new SeriousCondition(initArgs);
        if (type == Symbol.SIMPLE_CONDITION)
            return new SimpleCondition(initArgs);
        if (type == Symbol.SIMPLE_ERROR)
            return new SimpleError(initArgs);
        if (type == Symbol.SIMPLE_TYPE_ERROR)
            return new SimpleTypeError(initArgs);
        if (type == Symbol.SIMPLE_WARNING)
            return new SimpleWarning(initArgs);
        if (type == Symbol.STREAM_ERROR)
            return new StreamError(initArgs);
        if (type == Symbol.TYPE_ERROR)
            return new TypeError(initArgs);
        if (type == Symbol.UNBOUND_SLOT)
            return new UnboundSlot(initArgs);
        if (type == Symbol.UNBOUND_VARIABLE)
            return new UnboundVariable(initArgs);
        if (type == Symbol.UNDEFINED_FUNCTION)
            return new UndefinedFunction(initArgs);
        if (type == Symbol.WARNING)
            return new Warning(initArgs);

        return NIL;
    }

    private static final Primitive2 MAKE_CONDITION = new make_condition();
}
