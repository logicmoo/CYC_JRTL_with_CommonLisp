/*
 * make_condition.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: make_condition.java 12481 2010-02-14 21:29:58Z ehuelsmann $
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
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;


public final class ConditionFunctions {
  private static final Primitive MAKE_CONDITION = new make_condition();
	
  public static final class make_condition extends JavaPrimitive
  {
    make_condition()
    {
        super("%make-condition", PACKAGE_SYS, true);
    }

    // ### %make-condition
    // %make-condition type slot-initializations => condition
    @Override
    public SubLObject execute(SubLObject type, SubLObject initArgs)

    {
        final SubLSymbol symbol;
        if (type instanceof SubLSymbol)
            symbol = (SubLSymbol) type;
        else if (type instanceof LispClass)
            symbol = checkSymbol(((LispClass)type).getLispClassName());
        else {
            // This function only works on symbols and classes.
            return NIL;
        }

        if (symbol == LispSymbols.ARITHMETIC_ERROR)
            return new ArithmeticError(initArgs);
        if (symbol == LispSymbols.CELL_ERROR)
            return new CellError(initArgs);
        if (symbol == LispSymbols.CONDITION)
            return new Condition(initArgs);
        if (symbol == LispSymbols.CONTROL_ERROR)
            return new ControlError(initArgs);
        if (symbol == LispSymbols.DIVISION_BY_ZERO)
            return new DivisionByZero(initArgs);
        if (symbol == LispSymbols.END_OF_FILE)
            return new EndOfFile(initArgs);
        if (symbol == LispSymbols.ERROR)
            return new LispError(initArgs);
        if (symbol == LispSymbols.FILE_ERROR)
            return new FileError(initArgs);
        if (symbol == LispSymbols.FLOATING_POINT_INEXACT)
            return new FloatingPointInexact(initArgs);
        if (symbol == LispSymbols.FLOATING_POINT_INVALID_OPERATION)
            return new FloatingPointInvalidOperation(initArgs);
        if (symbol == LispSymbols.FLOATING_POINT_OVERFLOW)
            return new FloatingPointOverflow(initArgs);
        if (symbol == LispSymbols.FLOATING_POINT_UNDERFLOW)
            return new FloatingPointUnderflow(initArgs);
        if (symbol == LispSymbols.PACKAGE_ERROR)
            return new PackageError(initArgs);
        if (symbol == LispSymbols.PARSE_ERROR)
            return new ParseError(initArgs);
        if (symbol == LispSymbols.PRINT_NOT_READABLE)
            return new PrintNotReadable(initArgs);
        if (symbol == LispSymbols.PROGRAM_ERROR)
            return new ProgramError(initArgs);
        if (symbol == LispSymbols.READER_ERROR)
            return new ReaderError(initArgs);
        if (symbol == LispSymbols.SERIOUS_CONDITION)
            return new SeriousCondition(initArgs);
        if (symbol == LispSymbols.SIMPLE_CONDITION)
            return new SimpleCondition(initArgs);
        if (symbol == LispSymbols.SIMPLE_ERROR)
            return new SimpleError(initArgs);
        if (symbol == LispSymbols.SIMPLE_TYPE_ERROR)
            return new SimpleTypeError(initArgs);
        if (symbol == LispSymbols.SIMPLE_WARNING)
            return new SimpleWarning(initArgs);
        if (symbol == LispSymbols.STORAGE_CONDITION)
            return new StorageCondition(initArgs);
        if (symbol == LispSymbols.STREAM_ERROR)
            return new StreamError(initArgs);
        if (symbol == LispSymbols.STYLE_WARNING)
            return new StyleWarning(initArgs);
        if (symbol == LispSymbols.TYPE_ERROR)
            return new TypeError(initArgs);
        if (symbol == LispSymbols.UNBOUND_SLOT)
            return new UnboundSlot(initArgs);
        if (symbol == LispSymbols.UNBOUND_VARIABLE)
            return new UnboundVariable(initArgs);
        if (symbol == LispSymbols.UNDEFINED_FUNCTION)
            return new UndefinedFunction(initArgs);
        if (symbol == LispSymbols.WARNING)
            return new Warning(initArgs);

        if (symbol == LispSymbols.COMPILER_ERROR)
            return new CompilerError(initArgs);
        if (symbol == LispSymbols.COMPILER_UNSUPPORTED_FEATURE_ERROR)
            return new CompilerUnsupportedFeatureError(initArgs);

        return NIL;
    }
  }
    // ### cell-error-name
    private static final Primitive CELL_ERROR_NAME = new cell_error_name();
    public static final class cell_error_name extends JavaPrimitive
    {
        cell_error_name()
        {
            super(LispSymbols.CELL_ERROR_NAME, "condition");
        }

        @Override
        public SubLObject execute(SubLObject arg)
        {
            final StandardObject obj;
            if (arg instanceof StandardObject) {
                obj = (StandardObject) arg;
            }
            else {
                return type_error(arg, LispSymbols.STANDARD_OBJECT);
            }
            return obj.getInstanceSlotValue(LispSymbols.NAME);
        }
    }
    
    private static final Primitive PACKAGE_ERROR_PACKAGE =
      new package_error_package();

   // ### package-error-package
    public final static class package_error_package extends JavaPrimitive
    {
        package_error_package()
        {
            super("package-error-package");
        }

        @Override
        public SubLObject execute(SubLObject arg)
        {
            if (arg instanceof PackageError)
                return ((PackageError)arg).getLispPackage();
            return type_error(arg, LispSymbols.PACKAGE_ERROR);
        }
    }

  // ### unbound-slot-instance
    private static final unbound_slot_instance UNBOUND_SLOT_INSTANCE =
      new unbound_slot_instance();
    public final static class unbound_slot_instance extends JavaPrimitive
    {
        unbound_slot_instance()
        {
            super("unbound-slot-instance");
        }

        @Override
        public SubLObject execute(SubLObject arg)
        {
            if (arg instanceof UnboundSlot)
                return ((UnboundSlot)arg).getInstance();
            return error(new TypeError(arg, LispSymbols.UNBOUND_SLOT));
        }

    }
}
