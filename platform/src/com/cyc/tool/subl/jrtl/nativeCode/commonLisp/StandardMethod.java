/*
 * StandardMethod.java
 *
 * Copyright (C) 2005 Peter Graves
 * $Id: StandardMethod.java 12481 2010-02-14 21:29:58Z ehuelsmann $
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
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;

public class StandardMethod extends StandardObject {
	// ### method-lambda-list
	// generic function
	private static Primitive METHOD_LAMBDA_LIST = new JavaPrimitive("method-lambda-list", Lisp.PACKAGE_SYS, true,
			"method") {

		public SubLObject execute(SubLObject arg) {
			return StandardMethod.checkStandardMethod(arg).slots[StandardMethodClass.SLOT_INDEX_LAMBDA_LIST];
		}
	};

	// ### set-method-lambda-list
	private static Primitive SET_METHOD_LAMBDA_LIST = new JavaPrimitive("set-method-lambda-list", Lisp.PACKAGE_SYS,
			true, "method lambda-list") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			StandardMethod.checkStandardMethod(first).slots[StandardMethodClass.SLOT_INDEX_LAMBDA_LIST] = second;
			return second;
		}
	};

	// ### method-qualifiers
	private static Primitive _METHOD_QUALIFIERS = new JavaPrimitive("%method-qualifiers", Lisp.PACKAGE_SYS, true,
			"method") {

		public SubLObject execute(SubLObject arg) {
			return StandardMethod.checkStandardMethod(arg).slots[StandardMethodClass.SLOT_INDEX_QUALIFIERS];
		}
	};

	// ### set-method-qualifiers
	private static Primitive SET_METHOD_QUALIFIERS = new JavaPrimitive("set-method-qualifiers", Lisp.PACKAGE_SYS, true,
			"method qualifiers") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			StandardMethod.checkStandardMethod(first).slots[StandardMethodClass.SLOT_INDEX_QUALIFIERS] = second;
			return second;
		}
	};

	// ### method-documentation
	private static Primitive METHOD_DOCUMENTATION = new JavaPrimitive("method-documentation", Lisp.PACKAGE_SYS, true,
			"method") {

		public SubLObject execute(SubLObject arg) {
			return StandardMethod.checkStandardMethod(arg).slots[StandardMethodClass.SLOT_INDEX_DOCUMENTATION];
		}
	};

	// ### set-method-documentation
	private static Primitive SET_METHOD_DOCUMENTATION = new JavaPrimitive("set-method-documentation", Lisp.PACKAGE_SYS,
			true, "method documentation") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			StandardMethod.checkStandardMethod(first).slots[StandardMethodClass.SLOT_INDEX_DOCUMENTATION] = second;
			return second;
		}
	};

	// ### %method-generic-function
	private static Primitive _METHOD_GENERIC_FUNCTION = new JavaPrimitive("%method-generic-function", Lisp.PACKAGE_SYS,
			true) {

		public SubLObject execute(SubLObject arg) {
			return StandardMethod.checkStandardMethod(arg).slots[StandardMethodClass.SLOT_INDEX_GENERIC_FUNCTION];
		}
	};

	// ### %set-method-generic-function
	private static Primitive _SET_METHOD_GENERICFUNCTION = new JavaPrimitive("%set-method-generic-function",
			Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			StandardMethod.checkStandardMethod(first).slots[StandardMethodClass.SLOT_INDEX_GENERIC_FUNCTION] = second;
			return second;
		}
	};

	// ### %method-function
	private static Primitive _METHOD_FUNCTION = new JavaPrimitive("%method-function", Lisp.PACKAGE_SYS, true,
			"method") {

		public SubLObject execute(SubLObject arg) {
			return StandardMethod.checkStandardMethod(arg).slots[StandardMethodClass.SLOT_INDEX_FUNCTION];
		}
	};

	// ### %set-method-function
	private static Primitive _SET_METHOD_FUNCTION = new JavaPrimitive("%set-method-function", Lisp.PACKAGE_SYS, true,
			"method function") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			StandardMethod.checkStandardMethod(first).slots[StandardMethodClass.SLOT_INDEX_FUNCTION] = second;
			return second;
		}
	};

	// ### %method-fast-function
	private static Primitive _METHOD_FAST_FUNCTION = new JavaPrimitive("%method-fast-function", Lisp.PACKAGE_SYS, true,
			"method") {

		public SubLObject execute(SubLObject arg) {
			return StandardMethod.checkStandardMethod(arg).slots[StandardMethodClass.SLOT_INDEX_FAST_FUNCTION];
		}
	};

	// ### %set-method-fast-function
	private static Primitive _SET_METHOD_FAST_FUNCTION = new JavaPrimitive("%set-method-fast-function",
			Lisp.PACKAGE_SYS, true, "method fast-function") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			StandardMethod.checkStandardMethod(first).slots[StandardMethodClass.SLOT_INDEX_FAST_FUNCTION] = second;
			return second;
		}
	};

	// ### %method-specializers
	private static Primitive _METHOD_SPECIALIZERS = new JavaPrimitive("%method-specializers", Lisp.PACKAGE_SYS, true,
			"method") {

		public SubLObject execute(SubLObject arg) {
			return StandardMethod.checkStandardMethod(arg).slots[StandardMethodClass.SLOT_INDEX_SPECIALIZERS];
		}
	};

	// ### %set-method-specializers
	private static Primitive _SET_METHOD_SPECIALIZERS = new JavaPrimitive("%set-method-specializers", Lisp.PACKAGE_SYS,
			true, "method specializers") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			StandardMethod.checkStandardMethod(first).slots[StandardMethodClass.SLOT_INDEX_SPECIALIZERS] = second;
			return second;
		}
	};

	private static StandardGenericFunction METHOD_SPECIALIZERS = new StandardGenericFunction("method-specializers",
			Lisp.PACKAGE_MOP, true, StandardMethod._METHOD_SPECIALIZERS, Lisp.list(LispSymbols.METHOD),
			Lisp.list(StandardClass.STANDARD_METHOD));

	private static StandardGenericFunction METHOD_QUALIFIERS = new StandardGenericFunction("method-qualifiers",
			Lisp.PACKAGE_MOP, true, StandardMethod._METHOD_QUALIFIERS, Lisp.list(LispSymbols.METHOD),
			Lisp.list(StandardClass.STANDARD_METHOD));

	public static StandardMethod checkStandardMethod(SubLObject first) {
		if (first instanceof StandardMethod)
			return (StandardMethod) first;
		return (StandardMethod) Lisp.type_error(first, LispSymbols.METHOD);
	}

	public StandardMethod() {
		super(StandardClass.STANDARD_METHOD, StandardClass.STANDARD_METHOD.getClassLayout().getLength());
	}

	protected StandardMethod(LispClass cls, int length) {
		super(cls, length);
	}

	public StandardMethod(StandardGenericFunction gf, Function fastFunction, SubLObject lambdaList,
			SubLObject specializers) {
		this();
		this.slots[StandardMethodClass.SLOT_INDEX_GENERIC_FUNCTION] = gf;
		this.slots[StandardMethodClass.SLOT_INDEX_LAMBDA_LIST] = lambdaList;
		this.slots[StandardMethodClass.SLOT_INDEX_SPECIALIZERS] = specializers;
		this.slots[StandardMethodClass.SLOT_INDEX_QUALIFIERS] = Lisp.NIL;
		this.slots[StandardMethodClass.SLOT_INDEX_FUNCTION] = Lisp.NIL;
		this.slots[StandardMethodClass.SLOT_INDEX_FAST_FUNCTION] = fastFunction;
		this.slots[StandardMethodClass.SLOT_INDEX_DOCUMENTATION] = Lisp.NIL;
	}

	public SubLOperator getFunction() {
		return (SubLOperator) this.slots[StandardMethodClass.SLOT_INDEX_FUNCTION];
	}

	public String writeToString() {
		SubLObject genericFunction = this.slots[StandardMethodClass.SLOT_INDEX_GENERIC_FUNCTION];
		if (genericFunction instanceof StandardGenericFunction) {
			SubLObject name = ((StandardGenericFunction) genericFunction).getGenericFunctionName();
			if (name != null) {
				StringBuilder sb = new StringBuilder();
				sb.append(this.getLispClass().getLispClassName().writeToString());
				sb.append(' ');
				sb.append(name.writeToString());
				SubLObject specializers = this.slots[StandardMethodClass.SLOT_INDEX_SPECIALIZERS];
				if (specializers != null) {
					SubLObject specs = specializers;
					SubLObject names = Lisp.NIL;
					while (specs != Lisp.NIL) {
						SubLObject spec = specs.first();
						if (spec instanceof LispClass)
							names = names.push(((LispClass) spec).getLispClassName());
						else
							names = names.push(spec);
						specs = specs.rest();
					}
					sb.append(' ');
					sb.append(names.nreverse().writeToString());
				}
				return this.unreadableString(sb.toString());
			}
		}
		return super.writeToString();
	}

}
