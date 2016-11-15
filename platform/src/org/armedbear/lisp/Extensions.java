/*
 * Extensions.java
 *
 * Copyright (C) 2002-2007 Peter Graves
 * $Id: Extensions.java 12440 2010-02-10 16:14:22Z mevenson $
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
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
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

import java.io.File;
import java.io.IOException;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class Extensions {
	private static class adjoin_eql extends JavaPrimitive {
		adjoin_eql() {
			super(LispSymbols.ADJOIN_EQL, "item list");
		}

		public SubLObject execute(SubLObject item, SubLObject list) {
			return Lisp.memql(item, list) ? list : LispObjectFactory.makeCons(item, list);
		}
	}

	private static class dump_java_stack extends JavaPrimitive {
		dump_java_stack() {
			super("dump-java-stack", Lisp.PACKAGE_EXT, true);
		}

		public SubLObject execute() {
			Thread.dumpStack();
			return LispThread.currentThread().nothing();
		}
	}

	private static class exit extends JavaPrimitive {
		exit() {
			super("exit", Lisp.PACKAGE_EXT, true, "&key status");
		}

		public SubLObject execute() {
			Lisp.exit(0);
			return LispThread.currentThread().nothing();
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			int status = 0;
			if (first == Keyword.STATUS)
				if (second instanceof Fixnum)
					status = ((Fixnum) second).value;
			Lisp.exit(status);
			return LispThread.currentThread().nothing();
		}
	}

	private static class getenv extends JavaPrimitive {
		getenv() {
			super("getenv", Lisp.PACKAGE_EXT, true, "variable",
					"Return the value of the environment VARIABLE if it exists, otherwise return NIL.");
		}

		public SubLObject execute(SubLObject arg) {
			SubLString string;
			if (arg instanceof SubLString)
				string = (SubLString) arg;
			else
				return Lisp.type_error(arg, LispSymbols.STRING);
			String result = System.getenv(string.getString());
			if (result != null)
				return LispObjectFactory.makeString(result);
			else
				return Lisp.NIL;
		}
	}

	private static class interrupt_lisp extends JavaPrimitive {
		interrupt_lisp() {
			super("interrupt-lisp", Lisp.PACKAGE_EXT, true, "");
		}

		public SubLObject execute() {
			Lisp.setInterrupted(true);
			return Lisp.T;
		}
	}

	private static class make_temp_file extends JavaPrimitive {
		make_temp_file() {
			super("make-temp-file", Lisp.PACKAGE_EXT, true, "");
		}

		public SubLObject execute() {
			try {
				File file = File.createTempFile("abcl", null, null);
				if (file != null)
					return new Pathname(file.getPath());
			} catch (IOException e) {
				Debug.trace(e);
			}
			return Lisp.NIL;
		}
	}

	private static class memq extends JavaPrimitive {
		memq() {
			super(LispSymbols.MEMQ, "item list");
		}

		public SubLObject execute(SubLObject item, SubLObject list) {
			while (list instanceof SubLCons) {
				if (item == ((SubLCons) list).first())
					return list;
				list = ((SubLCons) list).rest();
			}
			if (list != Lisp.NIL)
				Lisp.type_error(list, LispSymbols.LIST);
			return Lisp.NIL;
		}
	}

	private static class memql extends JavaPrimitive {
		memql() {
			super(LispSymbols.MEMQL, "item list");
		}

		public SubLObject execute(SubLObject item, SubLObject list) {
			while (list instanceof SubLCons) {
				if (item.eql(((SubLCons) list).first()))
					return list;
				list = ((SubLCons) list).rest();
			}
			if (list != Lisp.NIL)
				Lisp.type_error(list, LispSymbols.LIST);
			return Lisp.NIL;
		}
	}

	private static class neq extends JavaPrimitive {
		neq() {
			super(LispSymbols.NEQ, "obj1 obj2");
		}

		public SubLObject execute(SubLObject first, SubLObject second) {
			return first != second ? Lisp.T : Lisp.NIL;
		}
	}

	private static class quit extends JavaPrimitive {
		quit() {
			super("quit", Lisp.PACKAGE_EXT, true, "&key status");
		}

		public SubLObject execute() {
			Lisp.exit(0);
			return LispThread.currentThread().nothing();
		}

		public SubLObject execute(SubLObject first, SubLObject second) {
			int status = 0;
			if (first == Keyword.STATUS)
				if (second instanceof Fixnum)
					status = ((Fixnum) second).value;
			Lisp.exit(status);
			return LispThread.currentThread().nothing();
		}
	}

	private static class source extends JavaPrimitive {
		source() {
			super("source", Lisp.PACKAGE_EXT, true);
		}

		public SubLObject execute(SubLObject arg) {
			return Lisp.get(arg, LispSymbols._SOURCE, Lisp.NIL);
		}
	}

	private static class source_file_position extends JavaPrimitive {
		source_file_position() {
			super("source-file-position", Lisp.PACKAGE_EXT, true);
		}

		public SubLObject execute(SubLObject arg) {
			SubLObject obj = Lisp.get(arg, LispSymbols._SOURCE, Lisp.NIL);
			if (obj instanceof SubLCons)
				return obj.rest();
			return Lisp.NIL;
		}
	}

	private static class source_pathname extends JavaPrimitive {
		source_pathname() {
			super("source-pathname", Lisp.PACKAGE_EXT, true);
		}

		public SubLObject execute(SubLObject arg) {
			SubLObject obj = Lisp.get(arg, LispSymbols._SOURCE, Lisp.NIL);
			if (obj instanceof SubLCons)
				return obj.first();
			return obj;
		}
	}

	private static class special_variable_p extends JavaPrimitive {
		special_variable_p() {
			super("special-variable-p", Lisp.PACKAGE_EXT, true);
		}

		public SubLObject execute(SubLObject arg) {
			return arg.isSpecialVariable() ? Lisp.T : Lisp.NIL;
		}
	}

	private static class truly_the extends SpecialOperator {
		truly_the() {
			super("truly-the", Lisp.PACKAGE_EXT, true, "type value");
		}

		public SubLObject execute(SubLObject args, Environment env) {
			if (args.cl_length() != 2)
				return Lisp.error(new WrongNumberOfArgumentsException(this));
			return Lisp.eval(args.second(), env, LispThread.currentThread());
		}
	}

	// ### *ed-functions*
	public static SubLSymbol _ED_FUNCTIONS_ = Lisp.exportSpecial("*ED-FUNCTIONS*", Lisp.PACKAGE_EXT,
			Lisp.list(Lisp.intern("DEFAULT-ED-FUNCTION", Lisp.PACKAGE_SYS)));

	// ### truly-the value-type form => result*
	private static SpecialOperator TRULY_THE = new truly_the();

	// ### neq
	private static Primitive NEQ = new neq();

	// ### memq item list => tail
	private static Primitive MEMQ = new memq();

	// ### memql item list => tail
	private static Primitive MEMQL = new memql();

	// ### adjoin-eql item list => new-list
	private static Primitive ADJOIN_EQL = new adjoin_eql();

	// ### special-variable-p
	private static Primitive SPECIAL_VARIABLE_P = new special_variable_p();

	// ### source symbol
	private static Primitive SOURCE = new source();

	// ### source-file-position symbol
	private static Primitive SOURCE_FILE_POSITION = new source_file_position();

	// ### source-pathname
	public static Primitive SOURCE_PATHNAME = new source_pathname();

	// ### exit
	private static Primitive EXIT = new exit();

	// ### quit
	private static Primitive QUIT = new quit();

	// ### dump-java-stack
	private static Primitive DUMP_JAVA_STACK = new dump_java_stack();

	// ### make-temp-file => pathname
	private static Primitive MAKE_TEMP_FILE = new make_temp_file();

	// ### interrupt-lisp
	private static Primitive INTERRUPT_LISP = new interrupt_lisp();

	// ### getenv variable => string
	private static Primitive GETENV = new getenv();
}
