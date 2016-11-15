/*
 * BuiltInClass.java
 *
 * Copyright (C) 2003-2007 Peter Graves
 * $Id: BuiltInClass.java 12516 2010-03-03 21:05:41Z astalla $
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class BuiltInClass extends LispClass {
	public static BuiltInClass CLASS_T = BuiltInClass.addBuiltinClass(Lisp.T);

	public static BuiltInClass ARRAY = BuiltInClass.addBuiltinClass(LispSymbols.ARRAY);

	public static BuiltInClass BIGNUM = BuiltInClass.addBuiltinClass(LispSymbols.BIGNUM);

	public static BuiltInClass BASE_STRING = BuiltInClass.addBuiltinClass(LispSymbols.BASE_STRING);

	public static BuiltInClass BIT_VECTOR = BuiltInClass.addBuiltinClass(LispSymbols.BIT_VECTOR);

	public static BuiltInClass CHARACTER = BuiltInClass.addBuiltinClass(LispSymbols.CHARACTER);

	public static BuiltInClass COMPLEX = BuiltInClass.addBuiltinClass(LispSymbols.COMPLEX);

	public static BuiltInClass CONS = BuiltInClass.addBuiltinClass(LispSymbols.CONS);

	public static BuiltInClass DOUBLE_FLOAT = BuiltInClass.addBuiltinClass(LispSymbols.DOUBLE_FLOAT);
	public static BuiltInClass ENVIRONMENT = BuiltInClass.addBuiltinClass(LispSymbols.ENVIRONMENT);
	public static BuiltInClass FIXNUM = BuiltInClass.addBuiltinClass(LispSymbols.FIXNUM);
	public static BuiltInClass FLOAT = BuiltInClass.addBuiltinClass(LispSymbols.FLOAT);
	public static BuiltInClass FUNCTION = BuiltInClass.addBuiltinClass(LispSymbols.FUNCTION);
	public static BuiltInClass HASH_TABLE = BuiltInClass.addBuiltinClass(LispSymbols.HASH_TABLE);
	public static BuiltInClass INTEGER = BuiltInClass.addBuiltinClass(LispSymbols.INTEGER);
	public static BuiltInClass JAVA_OBJECT = BuiltInClass.addBuiltinClass(LispSymbols.JAVA_OBJECT);
	public static BuiltInClass LIST = BuiltInClass.addBuiltinClass(LispSymbols.LIST);
	public static BuiltInClass LOGICAL_PATHNAME = BuiltInClass.addBuiltinClass(LispSymbols.LOGICAL_PATHNAME);
	public static BuiltInClass MAILBOX = BuiltInClass.addBuiltinClass(LispSymbols.MAILBOX);
	public static BuiltInClass METHOD_COMBINATION = BuiltInClass.addBuiltinClass(LispSymbols.METHOD_COMBINATION);
	public static BuiltInClass MUTEX = BuiltInClass.addBuiltinClass(LispSymbols.MUTEX);
	public static BuiltInClass NIL_VECTOR = BuiltInClass.addBuiltinClass(LispSymbols.NIL_VECTOR);
	public static BuiltInClass NULL = BuiltInClass.addBuiltinClass(LispSymbols.NULL);
	public static BuiltInClass NUMBER = BuiltInClass.addBuiltinClass(LispSymbols.NUMBER);
	public static BuiltInClass PACKAGE = BuiltInClass.addBuiltinClass(LispSymbols.PACKAGE);
	public static BuiltInClass PATHNAME = BuiltInClass.addBuiltinClass(LispSymbols.PATHNAME);
	public static BuiltInClass RANDOM_STATE = BuiltInClass.addBuiltinClass(LispSymbols.RANDOM_STATE);
	public static BuiltInClass RATIO = BuiltInClass.addBuiltinClass(LispSymbols.RATIO);
	public static BuiltInClass RATIONAL = BuiltInClass.addBuiltinClass(LispSymbols.RATIONAL);
	public static BuiltInClass READTABLE = BuiltInClass.addBuiltinClass(LispSymbols.READTABLE);
	public static BuiltInClass REAL = BuiltInClass.addBuiltinClass(LispSymbols.REAL);
	public static BuiltInClass RESTART = BuiltInClass.addBuiltinClass(LispSymbols.RESTART);
	public static BuiltInClass SIMPLE_ARRAY = BuiltInClass.addBuiltinClass(LispSymbols.SIMPLE_ARRAY);
	public static BuiltInClass SIMPLE_BASE_STRING = BuiltInClass.addBuiltinClass(LispSymbols.SIMPLE_BASE_STRING);
	public static BuiltInClass SIMPLE_BIT_VECTOR = BuiltInClass.addBuiltinClass(LispSymbols.SIMPLE_BIT_VECTOR);
	public static BuiltInClass SIMPLE_STRING = BuiltInClass.addBuiltinClass(LispSymbols.SIMPLE_STRING);
	public static BuiltInClass SIMPLE_VECTOR = BuiltInClass.addBuiltinClass(LispSymbols.SIMPLE_VECTOR);
	public static BuiltInClass SINGLE_FLOAT = BuiltInClass.addBuiltinClass(LispSymbols.SINGLE_FLOAT);
	public static BuiltInClass STRING = BuiltInClass.addBuiltinClass(LispSymbols.STRING);
	public static BuiltInClass SYMBOL = BuiltInClass.addBuiltinClass(LispSymbols.SYMBOL);
	public static BuiltInClass THREAD = BuiltInClass.addBuiltinClass(LispSymbols.THREAD);
	public static BuiltInClass VECTOR = BuiltInClass.addBuiltinClass(LispSymbols.VECTOR);
	public static BuiltInClass STACK_FRAME = BuiltInClass.addBuiltinClass(LispSymbols.STACK_FRAME);
	public static BuiltInClass LISP_STACK_FRAME = BuiltInClass.addBuiltinClass(LispSymbols.LISP_STACK_FRAME);
	public static BuiltInClass JAVA_STACK_FRAME = BuiltInClass.addBuiltinClass(LispSymbols.JAVA_STACK_FRAME);
	public static StructureClass STRUCTURE_OBJECT = (StructureClass) LispClass.addClass(LispSymbols.STRUCTURE_OBJECT,
			new StructureClass(LispSymbols.STRUCTURE_OBJECT, Lisp.list(BuiltInClass.CLASS_T)));
	public static SlotClass SEQUENCE = (SlotClass) LispClass.addClass(LispSymbols.SEQUENCE,
			new SlotClass(LispSymbols.SEQUENCE, Lisp.list(BuiltInClass.CLASS_T)));
	public static LispClass STREAM = LispClass.addClass(LispSymbols.STREAM,
			new StructureClass(LispSymbols.STREAM, Lisp.list(BuiltInClass.STRUCTURE_OBJECT)));
	public static LispClass SYSTEM_STREAM = LispClass.addClass(LispSymbols.SYSTEM_STREAM,
			new StructureClass(LispSymbols.SYSTEM_STREAM, Lisp.list(BuiltInClass.STREAM)));
	public static LispClass TWO_WAY_STREAM = LispClass.addClass(LispSymbols.TWO_WAY_STREAM,
			new StructureClass(LispSymbols.TWO_WAY_STREAM, Lisp.list(BuiltInClass.SYSTEM_STREAM)));
	public static LispClass BROADCAST_STREAM = LispClass.addClass(LispSymbols.BROADCAST_STREAM,
			new StructureClass(LispSymbols.BROADCAST_STREAM, Lisp.list(BuiltInClass.SYSTEM_STREAM)));
	public static LispClass ECHO_STREAM = LispClass.addClass(LispSymbols.ECHO_STREAM,
			new StructureClass(LispSymbols.ECHO_STREAM, Lisp.list(BuiltInClass.SYSTEM_STREAM)));

	public static LispClass CASE_FROB_STREAM = LispClass.addClass(LispSymbols.CASE_FROB_STREAM,
			new StructureClass(LispSymbols.CASE_FROB_STREAM, Lisp.list(BuiltInClass.SYSTEM_STREAM)));

	public static LispClass STRING_STREAM = LispClass.addClass(LispSymbols.STRING_STREAM,
			new StructureClass(LispSymbols.STRING_STREAM, Lisp.list(BuiltInClass.SYSTEM_STREAM)));

	/*
	 * All the stream classes below are being defined as structure classes but
	 * won't be available as such until further action is taken: the 'defstruct'
	 * internal administration is missing.
	 *
	 * For STREAM and SYSTEM-STREAM, that bit is added in boot.lisp
	 */

	public static LispClass STRING_INPUT_STREAM = LispClass.addClass(LispSymbols.STRING_INPUT_STREAM,
			new StructureClass(LispSymbols.STRING_INPUT_STREAM, Lisp.list(BuiltInClass.STRING_STREAM)));
	public static LispClass STRING_OUTPUT_STREAM = LispClass.addClass(LispSymbols.STRING_OUTPUT_STREAM,
			new StructureClass(LispSymbols.STRING_OUTPUT_STREAM, Lisp.list(BuiltInClass.STRING_STREAM)));
	public static LispClass SYNONYM_STREAM = LispClass.addClass(LispSymbols.SYNONYM_STREAM,
			new StructureClass(LispSymbols.SYNONYM_STREAM, Lisp.list(BuiltInClass.SYSTEM_STREAM)));
	public static LispClass FILE_STREAM = LispClass.addClass(LispSymbols.FILE_STREAM,
			new StructureClass(LispSymbols.FILE_STREAM, Lisp.list(BuiltInClass.SYSTEM_STREAM)));
	public static LispClass CONCATENATED_STREAM = LispClass.addClass(LispSymbols.CONCATENATED_STREAM,
			new StructureClass(LispSymbols.CONCATENATED_STREAM, Lisp.list(BuiltInClass.SYSTEM_STREAM)));
	// Implementation defined streams
	public static LispClass SOCKET_STREAM = LispClass.addClass(LispSymbols.SOCKET_STREAM,
			new StructureClass(LispSymbols.SOCKET_STREAM, Lisp.list(BuiltInClass.TWO_WAY_STREAM)));
	public static LispClass SLIME_INPUT_STREAM = LispClass.addClass(LispSymbols.SLIME_INPUT_STREAM,
			new StructureClass(LispSymbols.SLIME_INPUT_STREAM, Lisp.list(BuiltInClass.STRING_STREAM)));
	public static LispClass SLIME_OUTPUT_STREAM = LispClass.addClass(LispSymbols.SLIME_OUTPUT_STREAM,
			new StructureClass(LispSymbols.SLIME_OUTPUT_STREAM, Lisp.list(BuiltInClass.STRING_STREAM)));
	static {
		BuiltInClass.ARRAY.setDirectSuperclass(BuiltInClass.CLASS_T);
		BuiltInClass.ARRAY.setCPL(BuiltInClass.ARRAY, BuiltInClass.CLASS_T);
		BuiltInClass.BASE_STRING.setDirectSuperclass(BuiltInClass.STRING);
		BuiltInClass.BASE_STRING.setCPL(BuiltInClass.BASE_STRING, BuiltInClass.STRING, BuiltInClass.VECTOR,
				BuiltInClass.ARRAY, BuiltInClass.SEQUENCE, BuiltInClass.CLASS_T);
		BuiltInClass.BIGNUM.setDirectSuperclass(BuiltInClass.INTEGER);
		BuiltInClass.BIGNUM.setCPL(BuiltInClass.BIGNUM, BuiltInClass.INTEGER, BuiltInClass.RATIONAL, BuiltInClass.REAL,
				BuiltInClass.NUMBER, BuiltInClass.CLASS_T);
		BuiltInClass.BIT_VECTOR.setDirectSuperclass(BuiltInClass.VECTOR);
		BuiltInClass.BIT_VECTOR.setCPL(BuiltInClass.BIT_VECTOR, BuiltInClass.VECTOR, BuiltInClass.ARRAY,
				BuiltInClass.SEQUENCE, BuiltInClass.CLASS_T);
		BuiltInClass.BROADCAST_STREAM.setCPL(BuiltInClass.BROADCAST_STREAM, BuiltInClass.SYSTEM_STREAM,
				BuiltInClass.STREAM, BuiltInClass.STRUCTURE_OBJECT, BuiltInClass.CLASS_T);
		BuiltInClass.CASE_FROB_STREAM.setCPL(BuiltInClass.CASE_FROB_STREAM, BuiltInClass.SYSTEM_STREAM,
				BuiltInClass.STREAM, BuiltInClass.STRUCTURE_OBJECT, BuiltInClass.CLASS_T);
		BuiltInClass.CHARACTER.setDirectSuperclass(BuiltInClass.CLASS_T);
		BuiltInClass.CHARACTER.setCPL(BuiltInClass.CHARACTER, BuiltInClass.CLASS_T);
		BuiltInClass.CLASS_T.setCPL(BuiltInClass.CLASS_T);
		BuiltInClass.COMPLEX.setDirectSuperclass(BuiltInClass.NUMBER);
		BuiltInClass.COMPLEX.setCPL(BuiltInClass.COMPLEX, BuiltInClass.NUMBER, BuiltInClass.CLASS_T);
		BuiltInClass.CONCATENATED_STREAM.setCPL(BuiltInClass.CONCATENATED_STREAM, BuiltInClass.SYSTEM_STREAM,
				BuiltInClass.STREAM, BuiltInClass.STRUCTURE_OBJECT, BuiltInClass.CLASS_T);
		BuiltInClass.CONS.setDirectSuperclass(BuiltInClass.LIST);
		BuiltInClass.CONS.setCPL(BuiltInClass.CONS, BuiltInClass.LIST, BuiltInClass.SEQUENCE, BuiltInClass.CLASS_T);
		BuiltInClass.DOUBLE_FLOAT.setDirectSuperclass(BuiltInClass.FLOAT);
		BuiltInClass.DOUBLE_FLOAT.setCPL(BuiltInClass.DOUBLE_FLOAT, BuiltInClass.FLOAT, BuiltInClass.REAL,
				BuiltInClass.NUMBER, BuiltInClass.CLASS_T);
		BuiltInClass.ECHO_STREAM.setCPL(BuiltInClass.ECHO_STREAM, BuiltInClass.SYSTEM_STREAM, BuiltInClass.STREAM,
				BuiltInClass.STRUCTURE_OBJECT, BuiltInClass.CLASS_T);
		BuiltInClass.ENVIRONMENT.setDirectSuperclass(BuiltInClass.CLASS_T);
		BuiltInClass.ENVIRONMENT.setCPL(BuiltInClass.ENVIRONMENT, BuiltInClass.CLASS_T);
		BuiltInClass.FIXNUM.setDirectSuperclass(BuiltInClass.INTEGER);
		BuiltInClass.FIXNUM.setCPL(BuiltInClass.FIXNUM, BuiltInClass.INTEGER, BuiltInClass.RATIONAL, BuiltInClass.REAL,
				BuiltInClass.NUMBER, BuiltInClass.CLASS_T);
		BuiltInClass.FILE_STREAM.setCPL(BuiltInClass.FILE_STREAM, BuiltInClass.SYSTEM_STREAM, BuiltInClass.STREAM,
				BuiltInClass.STRUCTURE_OBJECT, BuiltInClass.CLASS_T);
		BuiltInClass.FLOAT.setDirectSuperclass(BuiltInClass.REAL);
		BuiltInClass.FLOAT.setCPL(BuiltInClass.FLOAT, BuiltInClass.REAL, BuiltInClass.NUMBER, BuiltInClass.CLASS_T);
		BuiltInClass.FUNCTION.setDirectSuperclass(BuiltInClass.CLASS_T);
		BuiltInClass.FUNCTION.setCPL(BuiltInClass.FUNCTION, BuiltInClass.CLASS_T);
		BuiltInClass.HASH_TABLE.setDirectSuperclass(BuiltInClass.CLASS_T);
		BuiltInClass.HASH_TABLE.setCPL(BuiltInClass.HASH_TABLE, BuiltInClass.CLASS_T);
		BuiltInClass.INTEGER.setDirectSuperclass(BuiltInClass.RATIONAL);
		BuiltInClass.INTEGER.setCPL(BuiltInClass.INTEGER, BuiltInClass.RATIONAL, BuiltInClass.REAL, BuiltInClass.NUMBER,
				BuiltInClass.CLASS_T);
		BuiltInClass.JAVA_OBJECT.setDirectSuperclass(BuiltInClass.CLASS_T);
		BuiltInClass.JAVA_OBJECT.setCPL(BuiltInClass.JAVA_OBJECT, BuiltInClass.CLASS_T);
		BuiltInClass.LIST.setDirectSuperclass(BuiltInClass.SEQUENCE);
		BuiltInClass.LIST.setCPL(BuiltInClass.LIST, BuiltInClass.SEQUENCE, BuiltInClass.CLASS_T);
		BuiltInClass.LOGICAL_PATHNAME.setDirectSuperclass(BuiltInClass.PATHNAME);
		BuiltInClass.LOGICAL_PATHNAME.setCPL(BuiltInClass.LOGICAL_PATHNAME, BuiltInClass.PATHNAME,
				BuiltInClass.CLASS_T);
		BuiltInClass.MAILBOX.setDirectSuperclass(BuiltInClass.CLASS_T);
		BuiltInClass.MAILBOX.setCPL(BuiltInClass.MAILBOX, BuiltInClass.CLASS_T);
		BuiltInClass.METHOD_COMBINATION.setDirectSuperclass(BuiltInClass.CLASS_T);
		BuiltInClass.METHOD_COMBINATION.setCPL(BuiltInClass.METHOD_COMBINATION, BuiltInClass.CLASS_T);
		BuiltInClass.MUTEX.setDirectSuperclass(BuiltInClass.CLASS_T);
		BuiltInClass.MUTEX.setCPL(BuiltInClass.MUTEX, BuiltInClass.CLASS_T);
		BuiltInClass.NIL_VECTOR.setDirectSuperclass(BuiltInClass.STRING);
		BuiltInClass.NIL_VECTOR.setCPL(BuiltInClass.NIL_VECTOR, BuiltInClass.STRING, BuiltInClass.VECTOR,
				BuiltInClass.ARRAY, BuiltInClass.SEQUENCE, BuiltInClass.CLASS_T);
		BuiltInClass.NULL.setDirectSuperclass(BuiltInClass.LIST);
		BuiltInClass.NULL.setCPL(BuiltInClass.NULL, BuiltInClass.SYMBOL, BuiltInClass.LIST, BuiltInClass.SEQUENCE,
				BuiltInClass.CLASS_T);
		BuiltInClass.NUMBER.setDirectSuperclass(BuiltInClass.CLASS_T);
		BuiltInClass.NUMBER.setCPL(BuiltInClass.NUMBER, BuiltInClass.CLASS_T);
		BuiltInClass.PACKAGE.setDirectSuperclass(BuiltInClass.CLASS_T);
		BuiltInClass.PACKAGE.setCPL(BuiltInClass.PACKAGE, BuiltInClass.CLASS_T);
		BuiltInClass.PATHNAME.setDirectSuperclass(BuiltInClass.CLASS_T);
		BuiltInClass.PATHNAME.setCPL(BuiltInClass.PATHNAME, BuiltInClass.CLASS_T);
		BuiltInClass.RANDOM_STATE.setDirectSuperclass(BuiltInClass.CLASS_T);
		BuiltInClass.RANDOM_STATE.setCPL(BuiltInClass.RANDOM_STATE, BuiltInClass.CLASS_T);
		BuiltInClass.RATIO.setDirectSuperclass(BuiltInClass.RATIONAL);
		BuiltInClass.RATIO.setCPL(BuiltInClass.RATIO, BuiltInClass.RATIONAL, BuiltInClass.REAL, BuiltInClass.NUMBER,
				BuiltInClass.CLASS_T);
		BuiltInClass.RATIONAL.setDirectSuperclass(BuiltInClass.REAL);
		BuiltInClass.RATIONAL.setCPL(BuiltInClass.RATIONAL, BuiltInClass.REAL, BuiltInClass.NUMBER,
				BuiltInClass.CLASS_T);
		BuiltInClass.READTABLE.setDirectSuperclass(BuiltInClass.CLASS_T);
		BuiltInClass.READTABLE.setCPL(BuiltInClass.READTABLE, BuiltInClass.CLASS_T);
		BuiltInClass.REAL.setDirectSuperclass(BuiltInClass.NUMBER);
		BuiltInClass.REAL.setCPL(BuiltInClass.REAL, BuiltInClass.NUMBER, BuiltInClass.CLASS_T);
		BuiltInClass.RESTART.setDirectSuperclass(BuiltInClass.CLASS_T);
		BuiltInClass.RESTART.setCPL(BuiltInClass.RESTART, BuiltInClass.CLASS_T);
		BuiltInClass.SEQUENCE.setDirectSuperclass(BuiltInClass.CLASS_T);
		BuiltInClass.SEQUENCE.setCPL(BuiltInClass.SEQUENCE, BuiltInClass.CLASS_T);
		BuiltInClass.SIMPLE_ARRAY.setDirectSuperclass(BuiltInClass.ARRAY);
		BuiltInClass.SIMPLE_ARRAY.setCPL(BuiltInClass.SIMPLE_ARRAY, BuiltInClass.ARRAY, BuiltInClass.CLASS_T);
		BuiltInClass.SIMPLE_BASE_STRING
				.setDirectSuperclasses(Lisp.list(BuiltInClass.BASE_STRING, BuiltInClass.SIMPLE_STRING));
		BuiltInClass.SIMPLE_BASE_STRING.setCPL(BuiltInClass.SIMPLE_BASE_STRING, BuiltInClass.BASE_STRING,
				BuiltInClass.SIMPLE_STRING, BuiltInClass.STRING, BuiltInClass.VECTOR, BuiltInClass.SIMPLE_ARRAY,
				BuiltInClass.ARRAY, BuiltInClass.SEQUENCE, BuiltInClass.CLASS_T);
		BuiltInClass.SIMPLE_BIT_VECTOR
				.setDirectSuperclasses(Lisp.list(BuiltInClass.BIT_VECTOR, BuiltInClass.SIMPLE_ARRAY));
		BuiltInClass.SIMPLE_BIT_VECTOR.setCPL(BuiltInClass.SIMPLE_BIT_VECTOR, BuiltInClass.BIT_VECTOR,
				BuiltInClass.VECTOR, BuiltInClass.SIMPLE_ARRAY, BuiltInClass.ARRAY, BuiltInClass.SEQUENCE,
				BuiltInClass.CLASS_T);
		BuiltInClass.SIMPLE_STRING.setDirectSuperclasses(
				Lisp.list(BuiltInClass.BASE_STRING, BuiltInClass.STRING, BuiltInClass.SIMPLE_ARRAY));
		BuiltInClass.SIMPLE_STRING.setCPL(BuiltInClass.SIMPLE_STRING, BuiltInClass.BASE_STRING, BuiltInClass.STRING,
				BuiltInClass.VECTOR, BuiltInClass.SIMPLE_ARRAY, BuiltInClass.ARRAY, BuiltInClass.SEQUENCE,
				BuiltInClass.CLASS_T);
		BuiltInClass.SIMPLE_VECTOR.setDirectSuperclasses(Lisp.list(BuiltInClass.VECTOR, BuiltInClass.SIMPLE_ARRAY));
		BuiltInClass.SIMPLE_VECTOR.setCPL(BuiltInClass.SIMPLE_VECTOR, BuiltInClass.VECTOR, BuiltInClass.SIMPLE_ARRAY,
				BuiltInClass.ARRAY, BuiltInClass.SEQUENCE, BuiltInClass.CLASS_T);
		BuiltInClass.SINGLE_FLOAT.setDirectSuperclass(BuiltInClass.FLOAT);
		BuiltInClass.SINGLE_FLOAT.setCPL(BuiltInClass.SINGLE_FLOAT, BuiltInClass.FLOAT, BuiltInClass.REAL,
				BuiltInClass.NUMBER, BuiltInClass.CLASS_T);
		BuiltInClass.SLIME_INPUT_STREAM.setCPL(BuiltInClass.SLIME_INPUT_STREAM, BuiltInClass.STRING_STREAM,
				BuiltInClass.SYSTEM_STREAM, BuiltInClass.STREAM, BuiltInClass.STRUCTURE_OBJECT, BuiltInClass.CLASS_T);
		BuiltInClass.SLIME_OUTPUT_STREAM.setCPL(BuiltInClass.SLIME_OUTPUT_STREAM, BuiltInClass.STRING_STREAM,
				BuiltInClass.SYSTEM_STREAM, BuiltInClass.STREAM, BuiltInClass.STRUCTURE_OBJECT, BuiltInClass.CLASS_T);
		BuiltInClass.SOCKET_STREAM.setCPL(BuiltInClass.SOCKET_STREAM, BuiltInClass.TWO_WAY_STREAM,
				BuiltInClass.SYSTEM_STREAM, BuiltInClass.STREAM, BuiltInClass.STRUCTURE_OBJECT, BuiltInClass.CLASS_T);
		BuiltInClass.STREAM.setCPL(BuiltInClass.STREAM, BuiltInClass.STRUCTURE_OBJECT, BuiltInClass.CLASS_T);
		BuiltInClass.STRING.setDirectSuperclass(BuiltInClass.VECTOR);
		BuiltInClass.STRING.setCPL(BuiltInClass.STRING, BuiltInClass.VECTOR, BuiltInClass.ARRAY, BuiltInClass.SEQUENCE,
				BuiltInClass.CLASS_T);
		BuiltInClass.STRING_INPUT_STREAM.setCPL(BuiltInClass.STRING_INPUT_STREAM, BuiltInClass.STRING_STREAM,
				BuiltInClass.SYSTEM_STREAM, BuiltInClass.STREAM, BuiltInClass.STRUCTURE_OBJECT, BuiltInClass.CLASS_T);
		BuiltInClass.STRING_OUTPUT_STREAM.setCPL(BuiltInClass.STRING_OUTPUT_STREAM, BuiltInClass.STRING_STREAM,
				BuiltInClass.SYSTEM_STREAM, BuiltInClass.STREAM, BuiltInClass.STRUCTURE_OBJECT, BuiltInClass.CLASS_T);
		BuiltInClass.STRING_STREAM.setCPL(BuiltInClass.STRING_STREAM, BuiltInClass.SYSTEM_STREAM, BuiltInClass.STREAM,
				BuiltInClass.STRUCTURE_OBJECT, BuiltInClass.CLASS_T);
		BuiltInClass.STRUCTURE_OBJECT.setCPL(BuiltInClass.STRUCTURE_OBJECT, BuiltInClass.CLASS_T);
		BuiltInClass.SYMBOL.setDirectSuperclass(BuiltInClass.CLASS_T);
		BuiltInClass.SYMBOL.setCPL(BuiltInClass.SYMBOL, BuiltInClass.CLASS_T);
		BuiltInClass.SYNONYM_STREAM.setCPL(BuiltInClass.SYNONYM_STREAM, BuiltInClass.SYSTEM_STREAM, BuiltInClass.STREAM,
				BuiltInClass.STRUCTURE_OBJECT, BuiltInClass.CLASS_T);
		BuiltInClass.SYSTEM_STREAM.setCPL(BuiltInClass.SYSTEM_STREAM, BuiltInClass.STREAM,
				BuiltInClass.STRUCTURE_OBJECT, BuiltInClass.CLASS_T);
		BuiltInClass.THREAD.setDirectSuperclass(BuiltInClass.CLASS_T);
		BuiltInClass.THREAD.setCPL(BuiltInClass.THREAD, BuiltInClass.CLASS_T);
		BuiltInClass.TWO_WAY_STREAM.setCPL(BuiltInClass.TWO_WAY_STREAM, BuiltInClass.SYSTEM_STREAM, BuiltInClass.STREAM,
				BuiltInClass.STRUCTURE_OBJECT, BuiltInClass.CLASS_T);
		BuiltInClass.VECTOR.setDirectSuperclasses(Lisp.list(BuiltInClass.ARRAY, BuiltInClass.SEQUENCE));
		BuiltInClass.VECTOR.setCPL(BuiltInClass.VECTOR, BuiltInClass.ARRAY, BuiltInClass.SEQUENCE,
				BuiltInClass.CLASS_T);
		BuiltInClass.STACK_FRAME.setDirectSuperclasses(BuiltInClass.CLASS_T);
		BuiltInClass.STACK_FRAME.setCPL(BuiltInClass.STACK_FRAME, BuiltInClass.CLASS_T);
		BuiltInClass.LISP_STACK_FRAME.setDirectSuperclasses(BuiltInClass.STACK_FRAME);
		BuiltInClass.LISP_STACK_FRAME.setCPL(BuiltInClass.LISP_STACK_FRAME, BuiltInClass.STACK_FRAME,
				BuiltInClass.CLASS_T);
		BuiltInClass.JAVA_STACK_FRAME.setDirectSuperclasses(BuiltInClass.STACK_FRAME);
		BuiltInClass.JAVA_STACK_FRAME.setCPL(BuiltInClass.JAVA_STACK_FRAME, BuiltInClass.STACK_FRAME,
				BuiltInClass.CLASS_T);
	}
	static {
		StandardClass.initializeStandardClasses();
	}

	private static BuiltInClass addBuiltinClass(SubLSymbol symbol) {
		BuiltInClass c = new BuiltInClass(symbol);
		LispClass.addClass(symbol, c);
		return c;
	}

	private BuiltInClass(SubLSymbol symbol) {
		super(symbol);
	}

	public SubLObject classOf() {
		return StandardClass.BUILT_IN_CLASS;
	}

	public SubLObject getDescription() {
		return LispObjectFactory.makeString(this.writeToString());
	}

	public SubLObject typeOf() {
		return LispSymbols.BUILT_IN_CLASS;
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.BUILT_IN_CLASS)
			return Lisp.T;
		if (type == StandardClass.BUILT_IN_CLASS)
			return Lisp.T;
		return super.typep(type);
	}

	public String writeToString() {
		StringBuilder sb = new StringBuilder("#<BUILT-IN-CLASS ");
		sb.append(this.getLispClassName().writeToString());
		sb.append('>');
		return sb.toString();
	}
}
