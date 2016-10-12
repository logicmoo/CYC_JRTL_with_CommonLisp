/*
 * LispStackFrame.java
 *
 * Copyright (C) 2009 Mark Evenson
 * $Id: LispStackFrame.java 12376 2010-01-14 22:07:57Z astalla $
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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;

public class LispStackFrame extends StackFrame {
	private class UnavailableArgument extends AbstractLispObject {
		public UnavailableArgument() {
		}

		public String writeToString() {
			return this.unreadableString("unavailable arg", false);
		}
	}

	public SubLObject operator;
	int arity;
	private SubLObject first;
	private SubLObject second;
	private SubLObject third;

	private SubLObject[] args;

	private SubLObject UNAVAILABLE_ARG = new UnavailableArgument();

	public LispStackFrame(SubLObject operator) {
		this.operator = operator;
		this.arity = 0;
		this.first = null;
		this.second = null;
		this.third = null;
		this.args = null;
	}

	public LispStackFrame(SubLObject operator, SubLObject arg) {
		this.operator = operator;
		this.arity = 1;
		this.first = arg;
		this.second = null;
		this.third = null;
		this.args = null;
	}

	public LispStackFrame(SubLObject operator, SubLObject... args) {
		this.operator = operator;
		this.first = null;
		this.second = null;
		this.third = null;
		this.arity = args.length;
		this.args = args;
	}

	public LispStackFrame(SubLObject operator, SubLObject first, SubLObject second) {
		this.operator = operator;
		this.first = first;
		this.second = second;
		this.arity = 2;
		this.third = null;
		this.args = null;
	}

	public LispStackFrame(SubLObject operator, SubLObject first, SubLObject second, SubLObject third)

	{
		this.operator = operator;
		this.first = first;
		this.second = second;
		this.third = third;
		this.arity = 3;
		this.args = null;
	}

	private SubLObject argsToLispList()

	{
		SubLObject result = Lisp.NIL;
		if (this.args != null) {
			for (int i = 0; i < this.args.length; i++)
				// `args' come here from LispThread.execute. I don't know
				// how it comes that some callers pass NULL ptrs around but
				// we better do not create conses with their CAR being NULL;
				// it'll horribly break printing such a cons; and probably
				// other bad things may happen, too. --TCR, 2009-09-17.
				if (this.args[i] == null)
					result = result.push(this.UNAVAILABLE_ARG);
				else
					result = result.push(this.args[i]);
		} else
			do {
				if (this.first != null)
					result = result.push(this.first);
				else
					break;
				if (this.second != null)
					result = result.push(this.second);
				else
					break;
				if (this.third != null)
					result = result.push(this.third);
				else
					break;
			} while (false);
		return result.nreverse();
	}

	public SubLObject classOf() {
		return BuiltInClass.LISP_STACK_FRAME;
	}

	public int getArity() {
		return this.arity;
	}

	public SubLObject getOperator() {
		return this.operator;
	}

	public SubLObject getParts()

	{
		SubLObject result = Lisp.NIL;
		result = result.push(LispObjectFactory.makeCons("OPERATOR", this.getOperator()));
		SubLObject args = this.argsToLispList();
		if (args != Lisp.NIL)
			result = result.push(LispObjectFactory.makeCons("ARGS", args));

		return result.nreverse();
	}

	public void incrementCalls() {
		this.operator.incrementCallCount(this.arity);
	}

	public SubLObject toLispList()

	{
		SubLObject result = this.argsToLispList();
		if (this.operator instanceof Operator) {
			SubLObject lambdaName = ((Operator) this.operator).getLambdaName();
			if (lambdaName != null && lambdaName != Lisp.NIL)
				return result.push(lambdaName);
		}
		return result.push(this.operator);
	}

	public SubLString toLispString()

	{
		String result;
		try {
			result = this.toLispList().writeToString();
		} catch (Throwable t) { // error while printing stack
			Debug.trace("Serious printing error: ");
			Debug.trace(t);
			result = this.unreadableString("LISP-STACK-FRAME");
		}
		return LispObjectFactory.makeString(result);
	}

	public SubLObject typeOf() {
		return LispSymbols.LISP_STACK_FRAME;
	}

	public SubLObject typep(SubLObject typeSpecifier)

	{
		if (typeSpecifier == LispSymbols.LISP_STACK_FRAME)
			return Lisp.T;
		if (typeSpecifier == BuiltInClass.LISP_STACK_FRAME)
			return Lisp.T;
		return super.typep(typeSpecifier);
	}

	public String writeToString() {
		String result = "";
		String LISP_STACK_FRAME = "LISP-STACK-FRAME";
		try {
			result = LispSymbols.PRIN1_TO_STRING.execute(this.toLispList()).writeToString();
		} catch (Throwable t) { // error while printing stack
			Debug.trace("Serious printing error: ");
			Debug.trace(t);
			result = this.unreadableString(LISP_STACK_FRAME);
		}
		return result;
	}
}
