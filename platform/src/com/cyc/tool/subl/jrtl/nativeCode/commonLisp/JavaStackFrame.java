/*
 * JavaStackFrame.java
 *
 * Copyright (C) 2009 Mark Evenson
 * $Id: JavaStackFrame.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class JavaStackFrame extends StackFrame {
	static SubLSymbol CLASS = Lisp.internKeyword("CLASS");

	static SubLSymbol METHOD = Lisp.internKeyword("METHOD");

	static SubLSymbol FILE = Lisp.internKeyword("FILE");

	static SubLSymbol LINE = Lisp.internKeyword("LINE");

	static SubLSymbol NATIVE_METHOD = Lisp.internKeyword("NATIVE-METHOD");

	public StackTraceElement javaFrame;

	public JavaStackFrame(StackTraceElement javaFrame) {
		this.javaFrame = javaFrame;
	}

	public SubLObject classOf() {
		return BuiltInClass.JAVA_STACK_FRAME;
	}

	public SubLObject getParts()

	{
		SubLObject result = Lisp.NIL;
		result = result
				.push(LispObjectFactory.makeCons("CLASS", LispObjectFactory.makeString(this.javaFrame.getClassName())));
		result = result.push(
				LispObjectFactory.makeCons("METHOD", LispObjectFactory.makeString(this.javaFrame.getMethodName())));
		result = result
				.push(LispObjectFactory.makeCons("FILE", LispObjectFactory.makeString(this.javaFrame.getFileName())));
		result = result.push(
				LispObjectFactory.makeCons("LINE", LispObjectFactory.makeInteger(this.javaFrame.getLineNumber())));
		result = result.push(LispObjectFactory.makeCons("NATIVE-METHOD",
				LispObjectFactory.makeBoolean(this.javaFrame.isNativeMethod())));
		return result.nreverse();
	}

	public void incrementCalls() {
		// TODO Auto-generated method stub

	}

	public SubLObject toLispList() {
		SubLObject result = Lisp.NIL;

		if (this.javaFrame == null)
			return result;

		result = result.push(JavaStackFrame.CLASS);
		result = result.push(LispObjectFactory.makeString(this.javaFrame.getClassName()));
		result = result.push(JavaStackFrame.METHOD);
		result = result.push(LispObjectFactory.makeString(this.javaFrame.getMethodName()));
		result = result.push(JavaStackFrame.FILE);
		result = result.push(LispObjectFactory.makeString(this.javaFrame.getFileName()));
		result = result.push(JavaStackFrame.LINE);
		result = result.push(LispObjectFactory.makeInteger(this.javaFrame.getLineNumber()));
		if (this.javaFrame.isNativeMethod()) {
			result = result.push(JavaStackFrame.NATIVE_METHOD);
			result = result.push(LispSymbols.T);
		}

		return result.nreverse();
	}

	public SubLString toLispString()

	{
		return LispObjectFactory.makeString(this.javaFrame.toString());
	}

	public SubLObject typeOf() {
		return LispSymbols.JAVA_STACK_FRAME;
	}

	public SubLObject typep(SubLObject typeSpecifier)

	{
		if (typeSpecifier == LispSymbols.JAVA_STACK_FRAME)
			return Lisp.T;
		if (typeSpecifier == BuiltInClass.JAVA_STACK_FRAME)
			return Lisp.T;
		return super.typep(typeSpecifier);
	}

	public String writeToString() {
		String JAVA_STACK_FRAME = "JAVA-STACK-FRAME";
		return this.unreadableString(JAVA_STACK_FRAME + " " + this.toLispString().getString());
	}
}
