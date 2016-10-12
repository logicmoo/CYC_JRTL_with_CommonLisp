/*
 * WrongNumberOfArgumentsException.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: WrongNumberOfArgumentsException.java 12431 2010-02-08 08:05:15Z mevenson $
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

public class WrongNumberOfArgumentsException extends ProgramError {
	private Operator operator;
	private int expectedArgs;
	// private String message;

	public WrongNumberOfArgumentsException(Operator operator) {
		this(operator, -1);
	}

	public WrongNumberOfArgumentsException(Operator operator, int expectedArgs) {
		// This is really just an ordinary PROGRAM-ERROR, broken out into its
		// own Java class as a convenience for the implementation.
		super(StandardClass.PROGRAM_ERROR);
		this.operator = operator;
		this.expectedArgs = expectedArgs;
		this.setFormatControl(this.getMessage());
		this.setFormatArguments(Lisp.NIL);
	}

	public WrongNumberOfArgumentsException(String message) {
		super(StandardClass.PROGRAM_ERROR);
		if (message == null)
			throw new NullPointerException("message can not be null");
		this.message = message;
		this.setFormatControl(this.getMessage());
		this.setFormatArguments(Lisp.NIL);
	}

	public String getMessage() {
		if (this.message != null)
			return this.message;
		StringBuilder sb = new StringBuilder("Wrong number of arguments");
		SubLObject lambdaName = this.operator.getLambdaName();
		if (lambdaName != null && lambdaName != Lisp.NIL) {
			sb.append(" for ");
			sb.append(this.operator.getLambdaName().writeToString());
		}
		if (this.expectedArgs >= 0) {
			sb.append("; ");
			sb.append(this.expectedArgs);
			sb.append(" expected");
		}
		sb.append('.');
		return this.message = sb.toString();
	}
}
