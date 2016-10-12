/*
 * JavaException.java
 *
 * Copyright (C) 2005 Peter Graves
 * $Id: JavaException.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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

import java.io.PrintWriter;
import java.io.StringWriter;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class JavaException extends LispError {
	// ### java-exception-cause java-exception => cause
	private static Primitive JAVA_EXCEPTION_CAUSE = new JavaPrimitive(LispSymbols.JAVA_EXCEPTION_CAUSE,
			"java-exception", "Returns the cause of JAVA-EXCEPTION. (The cause is the Java Throwable\n"
					+ "  object that caused JAVA-EXCEPTION to be signalled.)") {

		public SubLObject execute(SubLObject arg) {
			return LispSymbols.STD_SLOT_VALUE.execute(arg, LispSymbols.CAUSE);
		}
	};

	private Throwable throwable;

	public JavaException(Throwable throwable) {
		super(StandardClass.JAVA_EXCEPTION);
		Debug.assertTrue(this.slots.length == 3);
		Debug.assertTrue(throwable != null);
		this.throwable = throwable;
		this.setInstanceSlotValue(LispSymbols.CAUSE, new ABCLJavaObject(throwable));
	}

	public SubLObject classOf() {
		return StandardClass.JAVA_EXCEPTION;
	}

	public String getMessage() {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		this.throwable.printStackTrace(pw);
		String s = sw.toString();
		String separator = System.getProperty("line.separator");
		if (s.endsWith(separator))
			s = s.substring(0, s.length() - separator.length());
		return s;
	}

	public SubLObject typeOf() {
		return LispSymbols.JAVA_EXCEPTION;
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.JAVA_EXCEPTION)
			return Lisp.T;
		if (type == StandardClass.JAVA_EXCEPTION)
			return Lisp.T;
		return super.typep(type);
	}
}
