/*
 * TypeError.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: TypeError.java 12431 2010-02-08 08:05:15Z mevenson $
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

public class TypeError extends LispError {
	// ### type-error-datum
	private static Primitive TYPE_ERROR_DATUM = new JavaPrimitive(LispSymbols.TYPE_ERROR_DATUM, "condition") {

		public SubLObject execute(SubLObject arg) {
			StandardObject obj;
			if (arg instanceof StandardObject)
				obj = (StandardObject) arg;
			else
				return Lisp.type_error(arg, LispSymbols.STANDARD_OBJECT);
			return obj.getInstanceSlotValue(LispSymbols.DATUM);
		}
	};

	// ### type-error-expected-type
	private static Primitive TYPE_ERROR_EXPECTED_TYPE = new JavaPrimitive(LispSymbols.TYPE_ERROR_EXPECTED_TYPE,
			"condition") {

		public SubLObject execute(SubLObject arg) {
			StandardObject obj;
			if (arg instanceof StandardObject)
				obj = (StandardObject) arg;
			else
				return Lisp.type_error(arg, LispSymbols.STANDARD_OBJECT);
			return obj.getInstanceSlotValue(LispSymbols.EXPECTED_TYPE);
		}
	};

	public TypeError() {
		super(StandardClass.TYPE_ERROR);
	}

	protected TypeError(LispClass cls) {
		super(cls);
	}

	public TypeError(String message) {
		super(StandardClass.TYPE_ERROR);
		this.setFormatControl(message);
		this.setDatum(Lisp.NIL);
		this.setExpectedType(Lisp.NIL);
	}

	public TypeError(String message, SubLObject datum, SubLObject expectedType)

	{
		super(StandardClass.TYPE_ERROR);
		this.setFormatControl(message);
		this.setDatum(datum);
		this.setExpectedType(expectedType);
	}

	public TypeError(SubLObject initArgs) {
		super(StandardClass.TYPE_ERROR);
		this.initialize(initArgs);
	}

	public TypeError(SubLObject datum, SubLObject expectedType)

	{
		super(StandardClass.TYPE_ERROR);
		this.setDatum(datum);
		this.setExpectedType(expectedType);
	}

	public SubLObject classOf() {
		return StandardClass.TYPE_ERROR;
	}

	public SubLObject getDatum() {
		return this.getInstanceSlotValue(LispSymbols.DATUM);
	}

	public SubLObject getExpectedType() {
		return this.getInstanceSlotValue(LispSymbols.EXPECTED_TYPE);
	}

	public String getMessage() {
		LispThread thread = LispThread.currentThread();
		SpecialBindingsMark mark = thread.markSpecialBindings();
		thread.bindSpecial(LispSymbols.PRINT_ESCAPE, Lisp.T);
		try {
			String s = super.getMessage();
			if (s != null)
				return s;
			SubLObject datum = this.getDatum();
			SubLObject expectedType = this.getExpectedType();
			StringBuilder sb = new StringBuilder();
			String name = datum != null ? datum.writeToString() : null;
			String type = null;
			if (expectedType != null)
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
		} finally {
			thread.resetSpecialBindings(mark);
		}
	}

	protected void initialize(SubLObject initArgs) {
		super.initialize(initArgs);
		SubLObject datum = null;
		SubLObject expectedType = null;
		SubLObject first, second;
		while (initArgs != Lisp.NIL) {
			first = initArgs.first();
			initArgs = initArgs.rest();
			second = initArgs.first();
			initArgs = initArgs.rest();
			if (first == Keyword.DATUM) {
				if (datum == null)
					datum = second;
			} else if (first == Keyword.EXPECTED_TYPE)
				if (expectedType == null)
					expectedType = second;
		}
		if (datum != null)
			this.setDatum(datum);
		if (expectedType != null)
			this.setExpectedType(expectedType);
	}

	private void setDatum(SubLObject datum) {
		this.setInstanceSlotValue(LispSymbols.DATUM, datum);
	}

	private void setExpectedType(SubLObject expectedType)

	{
		this.setInstanceSlotValue(LispSymbols.EXPECTED_TYPE, expectedType);
	}

	public SubLObject typeOf() {
		return LispSymbols.TYPE_ERROR;
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.TYPE_ERROR)
			return Lisp.T;
		if (type == StandardClass.TYPE_ERROR)
			return Lisp.T;
		return super.typep(type);
	}
}
