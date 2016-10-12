/*
 * ArithmeticError.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: ArithmeticError.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class ArithmeticError extends LispError {
	// ### arithmetic-error-operation
	private static Primitive ARITHMETIC_ERROR_OPERATION = new JavaPrimitive("arithmetic-error-operation", "condition") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof ArithmeticError)
				return ((ArithmeticError) arg).getOperation();
			else
				return Lisp.error(new TypeError(arg, LispSymbols.ARITHMETIC_ERROR));
		}
	};

	// ### arithmetic-error-operands
	private static Primitive ARITHMETIC_ERROR_OPERANDS = new JavaPrimitive("arithmetic-error-operands", "condition") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof ArithmeticError)
				return ((ArithmeticError) arg).getOperands();
			else
				return Lisp.error(new TypeError(arg, LispSymbols.ARITHMETIC_ERROR));
		}
	};

	protected ArithmeticError(LispClass cls) {
		super(cls);
	}

	public ArithmeticError(String message) {
		super(StandardClass.ARITHMETIC_ERROR);
		this.setFormatControl(message);
		this.setFormatArguments(Lisp.NIL);
		this.setOperation(Lisp.NIL);
		this.setOperands(Lisp.NIL);
	}

	public ArithmeticError(SubLObject initArgs) {
		super(StandardClass.ARITHMETIC_ERROR);
		this.initialize(initArgs);
	}

	public SubLObject classOf() {
		return StandardClass.ARITHMETIC_ERROR;
	}

	SubLObject getOperands() {
		return this.getInstanceSlotValue(LispSymbols.OPERANDS);
	}

	SubLObject getOperation() {
		return this.getInstanceSlotValue(LispSymbols.OPERATION);
	}

	protected void initialize(SubLObject initArgs) {
		super.initialize(initArgs);
		SubLObject operation = Lisp.NIL;
		SubLObject operands = Lisp.NIL;
		SubLObject first, second;
		while (initArgs != Lisp.NIL) {
			first = initArgs.first();
			initArgs = initArgs.rest();
			second = initArgs.first();
			initArgs = initArgs.rest();
			if (first == Keyword.OPERATION)
				operation = second;
			else if (first == Keyword.OPERANDS)
				operands = second;
		}
		this.setOperation(operation);
		this.setOperands(operands);
	}

	private void setOperands(SubLObject operands)

	{
		this.setInstanceSlotValue(LispSymbols.OPERANDS, operands);
	}

	private void setOperation(SubLObject operation)

	{
		this.setInstanceSlotValue(LispSymbols.OPERATION, operation);
	}

	public SubLObject typeOf() {
		return LispSymbols.ARITHMETIC_ERROR;
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.ARITHMETIC_ERROR)
			return Lisp.T;
		if (type == StandardClass.ARITHMETIC_ERROR)
			return Lisp.T;
		return super.typep(type);
	}
}
