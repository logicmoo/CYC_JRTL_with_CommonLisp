/*
 * StandardClass.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: StandardClass.java 12481 2010-02-14 21:29:58Z ehuelsmann $
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

public class StandardClass extends SlotClass {

	private static SubLSymbol symName = Lisp.PACKAGE_MOP.intern("NAME");
	private static SubLSymbol symLayout = Lisp.PACKAGE_MOP.intern("LAYOUT");
	private static SubLSymbol symDirectSuperclasses = Lisp.PACKAGE_MOP.intern("DIRECT-SUPERCLASSES");
	private static SubLSymbol symDirectSubclasses = Lisp.PACKAGE_MOP.intern("DIRECT-SUBCLASSES");
	private static SubLSymbol symClassPrecedenceList = Lisp.PACKAGE_MOP.intern("CLASS-PRECEDENCE-LIST");
	private static SubLSymbol symDirectMethods = Lisp.PACKAGE_MOP.intern("DIRECT-METHODS");
	private static SubLSymbol symDocumentation = Lisp.PACKAGE_MOP.intern("DOCUMENTATION");
	private static SubLSymbol symDirectSlots = Lisp.PACKAGE_MOP.intern("DIRECT-SLOTS");
	private static SubLSymbol symSlots = Lisp.PACKAGE_MOP.intern("SLOTS");
	private static SubLSymbol symDirectDefaultInitargs = Lisp.PACKAGE_MOP.intern("DIRECT-DEFAULT-INITARGS");
	private static SubLSymbol symDefaultInitargs = Lisp.PACKAGE_MOP.intern("DEFAULT-INITARGS");

	static Layout layoutStandardClass = new Layout(null,
			Lisp.list(StandardClass.symName, StandardClass.symLayout, StandardClass.symDirectSuperclasses,
					StandardClass.symDirectSubclasses, StandardClass.symClassPrecedenceList,
					StandardClass.symDirectMethods, StandardClass.symDocumentation, StandardClass.symDirectSlots,
					StandardClass.symSlots, StandardClass.symDirectDefaultInitargs, StandardClass.symDefaultInitargs),
			Lisp.NIL) {

		public LispClass getLispClass() {
			return StandardClass.STANDARD_CLASS;
		}
	};

	// At this point, BuiltInClass.java has not been completely loaded yet, and
	// BuiltInClass.CLASS_T is null. So we need to call setDirectSuperclass()
	// for STANDARD_CLASS and STANDARD_OBJECT in initializeStandardClasses()
	// below.
	public static StandardClass STANDARD_CLASS = StandardClass.addStandardClass(LispSymbols.STANDARD_CLASS,
			Lisp.list(BuiltInClass.CLASS_T));

	public static StandardClass STANDARD_OBJECT = StandardClass.addStandardClass(LispSymbols.STANDARD_OBJECT,
			Lisp.list(BuiltInClass.CLASS_T));

	public static StandardClass SLOT_DEFINITION = new SlotDefinitionClass();

	static {
		LispClass.addClass(LispSymbols.SLOT_DEFINITION, StandardClass.SLOT_DEFINITION);

		StandardClass.STANDARD_CLASS.setClassLayout(StandardClass.layoutStandardClass);
		StandardClass.STANDARD_CLASS
				.setDirectSlotDefinitions(StandardClass.STANDARD_CLASS.getClassLayout().generateSlotDefinitions());
	}

	// BuiltInClass.FUNCTION is also null here (see previous comment).
	public static StandardClass GENERIC_FUNCTION = StandardClass.addStandardClass(LispSymbols.GENERIC_FUNCTION,
			Lisp.list(BuiltInClass.FUNCTION, StandardClass.STANDARD_OBJECT));

	public static StandardClass CLASS = StandardClass.addStandardClass(LispSymbols.CLASS,
			Lisp.list(StandardClass.STANDARD_OBJECT));

	public static StandardClass BUILT_IN_CLASS = StandardClass.addStandardClass(LispSymbols.BUILT_IN_CLASS,
			Lisp.list(StandardClass.CLASS));

	public static StandardClass JAVA_CLASS = StandardClass.addStandardClass(LispSymbols.JAVA_CLASS,
			Lisp.list(StandardClass.CLASS));

	public static StandardClass FORWARD_REFERENCED_CLASS = StandardClass
			.addStandardClass(LispSymbols.FORWARD_REFERENCED_CLASS, Lisp.list(StandardClass.CLASS));

	public static StandardClass STRUCTURE_CLASS = StandardClass.addStandardClass(LispSymbols.STRUCTURE_CLASS,
			Lisp.list(StandardClass.CLASS));

	public static StandardClass CONDITION = StandardClass.addStandardClass(LispSymbols.CONDITION,
			Lisp.list(StandardClass.STANDARD_OBJECT));

	public static StandardClass SIMPLE_CONDITION = StandardClass.addStandardClass(LispSymbols.SIMPLE_CONDITION,
			Lisp.list(StandardClass.CONDITION));

	public static StandardClass WARNING = StandardClass.addStandardClass(LispSymbols.WARNING,
			Lisp.list(StandardClass.CONDITION));

	public static StandardClass SIMPLE_WARNING = StandardClass.addStandardClass(LispSymbols.SIMPLE_WARNING,
			Lisp.list(StandardClass.SIMPLE_CONDITION, StandardClass.WARNING));

	public static StandardClass STYLE_WARNING = StandardClass.addStandardClass(LispSymbols.STYLE_WARNING,
			Lisp.list(StandardClass.WARNING));

	public static StandardClass SERIOUS_CONDITION = StandardClass.addStandardClass(LispSymbols.SERIOUS_CONDITION,
			Lisp.list(StandardClass.CONDITION));

	public static StandardClass STORAGE_CONDITION = StandardClass.addStandardClass(LispSymbols.STORAGE_CONDITION,
			Lisp.list(StandardClass.SERIOUS_CONDITION));

	public static StandardClass ERROR = StandardClass.addStandardClass(LispSymbols.ERROR,
			Lisp.list(StandardClass.SERIOUS_CONDITION));

	public static StandardClass ARITHMETIC_ERROR = StandardClass.addStandardClass(LispSymbols.ARITHMETIC_ERROR,
			Lisp.list(StandardClass.ERROR));

	public static StandardClass CELL_ERROR = StandardClass.addStandardClass(LispSymbols.CELL_ERROR,
			Lisp.list(StandardClass.ERROR));

	public static StandardClass CONTROL_ERROR = StandardClass.addStandardClass(LispSymbols.CONTROL_ERROR,
			Lisp.list(StandardClass.ERROR));

	public static StandardClass FILE_ERROR = StandardClass.addStandardClass(LispSymbols.FILE_ERROR,
			Lisp.list(StandardClass.ERROR));

	public static StandardClass DIVISION_BY_ZERO = StandardClass.addStandardClass(LispSymbols.DIVISION_BY_ZERO,
			Lisp.list(StandardClass.ARITHMETIC_ERROR));

	public static StandardClass FLOATING_POINT_INEXACT = StandardClass
			.addStandardClass(LispSymbols.FLOATING_POINT_INEXACT, Lisp.list(StandardClass.ARITHMETIC_ERROR));

	public static StandardClass FLOATING_POINT_INVALID_OPERATION = StandardClass
			.addStandardClass(LispSymbols.FLOATING_POINT_INVALID_OPERATION, Lisp.list(StandardClass.ARITHMETIC_ERROR));

	public static StandardClass FLOATING_POINT_OVERFLOW = StandardClass
			.addStandardClass(LispSymbols.FLOATING_POINT_OVERFLOW, Lisp.list(StandardClass.ARITHMETIC_ERROR));

	public static StandardClass FLOATING_POINT_UNDERFLOW = StandardClass
			.addStandardClass(LispSymbols.FLOATING_POINT_UNDERFLOW, Lisp.list(StandardClass.ARITHMETIC_ERROR));

	public static StandardClass PROGRAM_ERROR = StandardClass.addStandardClass(LispSymbols.PROGRAM_ERROR,
			Lisp.list(StandardClass.ERROR));

	public static StandardClass PACKAGE_ERROR = StandardClass.addStandardClass(LispSymbols.PACKAGE_ERROR,
			Lisp.list(StandardClass.ERROR));

	public static StandardClass STREAM_ERROR = StandardClass.addStandardClass(LispSymbols.STREAM_ERROR,
			Lisp.list(StandardClass.ERROR));
	public static StandardClass PARSE_ERROR = StandardClass.addStandardClass(LispSymbols.PARSE_ERROR,
			Lisp.list(StandardClass.ERROR));

	public static StandardClass PRINT_NOT_READABLE = StandardClass.addStandardClass(LispSymbols.PRINT_NOT_READABLE,
			Lisp.list(StandardClass.ERROR));
	public static StandardClass READER_ERROR = StandardClass.addStandardClass(LispSymbols.READER_ERROR,
			Lisp.list(StandardClass.PARSE_ERROR, StandardClass.STREAM_ERROR));

	public static StandardClass END_OF_FILE = StandardClass.addStandardClass(LispSymbols.END_OF_FILE,
			Lisp.list(StandardClass.STREAM_ERROR));

	public static StandardClass SIMPLE_ERROR = StandardClass.addStandardClass(LispSymbols.SIMPLE_ERROR,
			Lisp.list(StandardClass.SIMPLE_CONDITION, StandardClass.ERROR));

	public static StandardClass TYPE_ERROR = StandardClass.addStandardClass(LispSymbols.TYPE_ERROR,
			Lisp.list(StandardClass.ERROR));

	public static StandardClass SIMPLE_TYPE_ERROR = StandardClass.addStandardClass(LispSymbols.SIMPLE_TYPE_ERROR,
			Lisp.list(StandardClass.SIMPLE_CONDITION, StandardClass.TYPE_ERROR));

	public static StandardClass UNBOUND_SLOT = StandardClass.addStandardClass(LispSymbols.UNBOUND_SLOT,
			Lisp.list(StandardClass.CELL_ERROR));

	public static StandardClass UNBOUND_VARIABLE = StandardClass.addStandardClass(LispSymbols.UNBOUND_VARIABLE,
			Lisp.list(StandardClass.CELL_ERROR));

	public static StandardClass UNDEFINED_FUNCTION = StandardClass.addStandardClass(LispSymbols.UNDEFINED_FUNCTION,
			Lisp.list(StandardClass.CELL_ERROR));

	public static StandardClass COMPILER_ERROR = StandardClass.addStandardClass(LispSymbols.COMPILER_ERROR,
			Lisp.list(StandardClass.CONDITION));

	public static StandardClass COMPILER_UNSUPPORTED_FEATURE_ERROR = StandardClass
			.addStandardClass(LispSymbols.COMPILER_UNSUPPORTED_FEATURE_ERROR, Lisp.list(StandardClass.CONDITION));

	public static StandardClass JAVA_EXCEPTION = StandardClass.addStandardClass(LispSymbols.JAVA_EXCEPTION,
			Lisp.list(StandardClass.ERROR));

	public static StandardClass METHOD = StandardClass.addStandardClass(LispSymbols.METHOD,
			Lisp.list(StandardClass.STANDARD_OBJECT));

	public static StandardClass STANDARD_METHOD = new StandardMethodClass();

	static {
		LispClass.addClass(LispSymbols.STANDARD_METHOD, StandardClass.STANDARD_METHOD);
	}

	public static StandardClass STANDARD_READER_METHOD = new StandardReaderMethodClass();

	static {
		LispClass.addClass(LispSymbols.STANDARD_READER_METHOD, StandardClass.STANDARD_READER_METHOD);
	}

	public static StandardClass STANDARD_GENERIC_FUNCTION = new StandardGenericFunctionClass();

	static {
		LispClass.addClass(LispSymbols.STANDARD_GENERIC_FUNCTION, StandardClass.STANDARD_GENERIC_FUNCTION);
	}

	private static StandardClass addStandardClass(SubLSymbol name, SubLObject directSuperclasses) {
		StandardClass c = new StandardClass(name, directSuperclasses);
		LispClass.addClass(name, c);
		return c;
	}

	public static void initializeStandardClasses() {
		// We need to call setDirectSuperclass() here for classes that have a
		// BuiltInClass as a superclass. See comment above (at first mention of
		// STANDARD_OBJECT).
		StandardClass.STANDARD_CLASS.setDirectSuperclass(StandardClass.CLASS);
		StandardClass.STANDARD_OBJECT.setDirectSuperclass(BuiltInClass.CLASS_T);
		StandardClass.GENERIC_FUNCTION
				.setDirectSuperclasses(Lisp.list(BuiltInClass.FUNCTION, StandardClass.STANDARD_OBJECT));

		StandardClass.ARITHMETIC_ERROR.setCPL(StandardClass.ARITHMETIC_ERROR, StandardClass.ERROR,
				StandardClass.SERIOUS_CONDITION, StandardClass.CONDITION, StandardClass.STANDARD_OBJECT,
				BuiltInClass.CLASS_T);
		StandardClass.ARITHMETIC_ERROR.setDirectSlotDefinitions(Lisp.list(
				new SlotDefinitionObject(LispSymbols.OPERATION,
						Lisp.list(Lisp.PACKAGE_CL.intern("ARITHMETIC-ERROR-OPERATION"))),
				new SlotDefinitionObject(LispSymbols.OPERANDS,
						Lisp.list(Lisp.PACKAGE_CL.intern("ARITHMETIC-ERROR-OPERANDS")))));
		StandardClass.BUILT_IN_CLASS.setCPL(StandardClass.BUILT_IN_CLASS, StandardClass.CLASS,
				StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.JAVA_CLASS.setCPL(StandardClass.JAVA_CLASS, StandardClass.CLASS, StandardClass.STANDARD_OBJECT,
				BuiltInClass.CLASS_T);
		StandardClass.CELL_ERROR.setCPL(StandardClass.CELL_ERROR, StandardClass.ERROR, StandardClass.SERIOUS_CONDITION,
				StandardClass.CONDITION, StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.CELL_ERROR.setDirectSlotDefinitions(
				Lisp.list(new SlotDefinitionObject(LispSymbols.NAME, Lisp.list(LispSymbols.CELL_ERROR_NAME))));
		StandardClass.CLASS.setCPL(StandardClass.CLASS, StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.COMPILER_ERROR.setCPL(StandardClass.COMPILER_ERROR, StandardClass.CONDITION,
				StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.COMPILER_UNSUPPORTED_FEATURE_ERROR.setCPL(StandardClass.COMPILER_UNSUPPORTED_FEATURE_ERROR,
				StandardClass.CONDITION, StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.CONDITION.setCPL(StandardClass.CONDITION, StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.CONDITION.setDirectSlotDefinitions(Lisp.list(
				new SlotDefinitionObject(LispSymbols.FORMAT_CONTROL,
						Lisp.list(LispSymbols.SIMPLE_CONDITION_FORMAT_CONTROL)),
				new SlotDefinitionObject(LispSymbols.FORMAT_ARGUMENTS,
						Lisp.list(LispSymbols.SIMPLE_CONDITION_FORMAT_ARGUMENTS), Lisp.NIL)));
		StandardClass.CONDITION.setDirectDefaultInitargs(Lisp.list(Keyword.FORMAT_ARGUMENTS,
				// FIXME
				new Closure(Lisp.list(LispSymbols.LAMBDA, Lisp.NIL, Lisp.NIL), new Environment())));
		StandardClass.CONTROL_ERROR.setCPL(StandardClass.CONTROL_ERROR, StandardClass.ERROR,
				StandardClass.SERIOUS_CONDITION, StandardClass.CONDITION, StandardClass.STANDARD_OBJECT,
				BuiltInClass.CLASS_T);
		StandardClass.DIVISION_BY_ZERO.setCPL(StandardClass.DIVISION_BY_ZERO, StandardClass.ARITHMETIC_ERROR,
				StandardClass.ERROR, StandardClass.SERIOUS_CONDITION, StandardClass.CONDITION,
				StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.END_OF_FILE.setCPL(StandardClass.END_OF_FILE, StandardClass.STREAM_ERROR, StandardClass.ERROR,
				StandardClass.SERIOUS_CONDITION, StandardClass.CONDITION, StandardClass.STANDARD_OBJECT,
				BuiltInClass.CLASS_T);
		StandardClass.ERROR.setCPL(StandardClass.ERROR, StandardClass.SERIOUS_CONDITION, StandardClass.CONDITION,
				StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.FILE_ERROR.setCPL(StandardClass.FILE_ERROR, StandardClass.ERROR, StandardClass.SERIOUS_CONDITION,
				StandardClass.CONDITION, StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.FILE_ERROR.setDirectSlotDefinitions(Lisp.list(new SlotDefinitionObject(LispSymbols.PATHNAME,
				Lisp.list(Lisp.PACKAGE_CL.intern("FILE-ERROR-PATHNAME")))));
		StandardClass.FLOATING_POINT_INEXACT.setCPL(StandardClass.FLOATING_POINT_INEXACT,
				StandardClass.ARITHMETIC_ERROR, StandardClass.ERROR, StandardClass.SERIOUS_CONDITION,
				StandardClass.CONDITION, StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.FLOATING_POINT_INVALID_OPERATION.setCPL(StandardClass.FLOATING_POINT_INVALID_OPERATION,
				StandardClass.ARITHMETIC_ERROR, StandardClass.ERROR, StandardClass.SERIOUS_CONDITION,
				StandardClass.CONDITION, StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.FLOATING_POINT_OVERFLOW.setCPL(StandardClass.FLOATING_POINT_OVERFLOW,
				StandardClass.ARITHMETIC_ERROR, StandardClass.ERROR, StandardClass.SERIOUS_CONDITION,
				StandardClass.CONDITION, StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.FLOATING_POINT_UNDERFLOW.setCPL(StandardClass.FLOATING_POINT_UNDERFLOW,
				StandardClass.ARITHMETIC_ERROR, StandardClass.ERROR, StandardClass.SERIOUS_CONDITION,
				StandardClass.CONDITION, StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.FORWARD_REFERENCED_CLASS.setCPL(StandardClass.FORWARD_REFERENCED_CLASS, StandardClass.CLASS,
				BuiltInClass.CLASS_T);
		StandardClass.GENERIC_FUNCTION.setCPL(StandardClass.GENERIC_FUNCTION, StandardClass.STANDARD_OBJECT,
				BuiltInClass.FUNCTION, BuiltInClass.CLASS_T);
		StandardClass.JAVA_EXCEPTION.setCPL(StandardClass.JAVA_EXCEPTION, StandardClass.ERROR,
				StandardClass.SERIOUS_CONDITION, StandardClass.CONDITION, StandardClass.STANDARD_OBJECT,
				BuiltInClass.CLASS_T);
		StandardClass.JAVA_EXCEPTION.setDirectSlotDefinitions(
				Lisp.list(new SlotDefinitionObject(LispSymbols.CAUSE, Lisp.list(LispSymbols.JAVA_EXCEPTION_CAUSE))));
		StandardClass.METHOD.setCPL(StandardClass.METHOD, StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.PACKAGE_ERROR.setCPL(StandardClass.PACKAGE_ERROR, StandardClass.ERROR,
				StandardClass.SERIOUS_CONDITION, StandardClass.CONDITION, StandardClass.STANDARD_OBJECT,
				BuiltInClass.CLASS_T);
		StandardClass.PACKAGE_ERROR.setDirectSlotDefinitions(Lisp.list(new SlotDefinitionObject(LispSymbols.PACKAGE,
				Lisp.list(Lisp.PACKAGE_CL.intern("PACKAGE-ERROR-PACKAGE")))));
		StandardClass.PARSE_ERROR.setCPL(StandardClass.PARSE_ERROR, StandardClass.ERROR,
				StandardClass.SERIOUS_CONDITION, StandardClass.CONDITION, StandardClass.STANDARD_OBJECT,
				BuiltInClass.CLASS_T);
		StandardClass.PRINT_NOT_READABLE.setCPL(StandardClass.PRINT_NOT_READABLE, StandardClass.ERROR,
				StandardClass.SERIOUS_CONDITION, StandardClass.CONDITION, StandardClass.STANDARD_OBJECT,
				BuiltInClass.CLASS_T);
		StandardClass.PRINT_NOT_READABLE.setDirectSlotDefinitions(Lisp.list(new SlotDefinitionObject(LispSymbols.OBJECT,
				Lisp.list(Lisp.PACKAGE_CL.intern("PRINT-NOT-READABLE-OBJECT")))));
		StandardClass.PROGRAM_ERROR.setCPL(StandardClass.PROGRAM_ERROR, StandardClass.ERROR,
				StandardClass.SERIOUS_CONDITION, StandardClass.CONDITION, StandardClass.STANDARD_OBJECT,
				BuiltInClass.CLASS_T);
		StandardClass.READER_ERROR.setCPL(StandardClass.READER_ERROR, StandardClass.PARSE_ERROR,
				StandardClass.STREAM_ERROR, StandardClass.ERROR, StandardClass.SERIOUS_CONDITION,
				StandardClass.CONDITION, StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.SERIOUS_CONDITION.setCPL(StandardClass.SERIOUS_CONDITION, StandardClass.CONDITION,
				StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.SIMPLE_CONDITION.setCPL(StandardClass.SIMPLE_CONDITION, StandardClass.CONDITION,
				StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.SIMPLE_ERROR.setCPL(StandardClass.SIMPLE_ERROR, StandardClass.SIMPLE_CONDITION,
				StandardClass.ERROR, StandardClass.SERIOUS_CONDITION, StandardClass.CONDITION,
				StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.SIMPLE_TYPE_ERROR
				.setDirectSuperclasses(Lisp.list(StandardClass.SIMPLE_CONDITION, StandardClass.TYPE_ERROR));
		StandardClass.SIMPLE_TYPE_ERROR.setCPL(StandardClass.SIMPLE_TYPE_ERROR, StandardClass.SIMPLE_CONDITION,
				StandardClass.TYPE_ERROR, StandardClass.ERROR, StandardClass.SERIOUS_CONDITION, StandardClass.CONDITION,
				StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.SIMPLE_WARNING
				.setDirectSuperclasses(Lisp.list(StandardClass.SIMPLE_CONDITION, StandardClass.WARNING));
		StandardClass.SIMPLE_WARNING.setCPL(StandardClass.SIMPLE_WARNING, StandardClass.SIMPLE_CONDITION,
				StandardClass.WARNING, StandardClass.CONDITION, StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.STANDARD_CLASS.setCPL(StandardClass.STANDARD_CLASS, StandardClass.CLASS,
				StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.STANDARD_OBJECT.setCPL(StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.STORAGE_CONDITION.setCPL(StandardClass.STORAGE_CONDITION, StandardClass.SERIOUS_CONDITION,
				StandardClass.CONDITION, StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.STREAM_ERROR.setCPL(StandardClass.STREAM_ERROR, StandardClass.ERROR,
				StandardClass.SERIOUS_CONDITION, StandardClass.CONDITION, StandardClass.STANDARD_OBJECT,
				BuiltInClass.CLASS_T);
		StandardClass.STREAM_ERROR.setDirectSlotDefinitions(Lisp.list(new SlotDefinitionObject(LispSymbols.STREAM,
				Lisp.list(Lisp.PACKAGE_CL.intern("STREAM-ERROR-STREAM")))));
		StandardClass.STRUCTURE_CLASS.setCPL(StandardClass.STRUCTURE_CLASS, StandardClass.CLASS,
				StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.STYLE_WARNING.setCPL(StandardClass.STYLE_WARNING, StandardClass.WARNING, StandardClass.CONDITION,
				StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.TYPE_ERROR.setCPL(StandardClass.TYPE_ERROR, StandardClass.ERROR, StandardClass.SERIOUS_CONDITION,
				StandardClass.CONDITION, StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.TYPE_ERROR.setDirectSlotDefinitions(Lisp.list(
				new SlotDefinitionObject(LispSymbols.DATUM, Lisp.list(Lisp.PACKAGE_CL.intern("TYPE-ERROR-DATUM"))),
				new SlotDefinitionObject(LispSymbols.EXPECTED_TYPE,
						Lisp.list(Lisp.PACKAGE_CL.intern("TYPE-ERROR-EXPECTED-TYPE")))));
		StandardClass.UNBOUND_SLOT.setCPL(StandardClass.UNBOUND_SLOT, StandardClass.CELL_ERROR, StandardClass.ERROR,
				StandardClass.SERIOUS_CONDITION, StandardClass.CONDITION, StandardClass.STANDARD_OBJECT,
				BuiltInClass.CLASS_T);
		StandardClass.UNBOUND_SLOT.setDirectSlotDefinitions(Lisp.list(new SlotDefinitionObject(LispSymbols.INSTANCE,
				Lisp.list(Lisp.PACKAGE_CL.intern("UNBOUND-SLOT-INSTANCE")))));
		StandardClass.UNBOUND_VARIABLE.setCPL(StandardClass.UNBOUND_VARIABLE, StandardClass.CELL_ERROR,
				StandardClass.ERROR, StandardClass.SERIOUS_CONDITION, StandardClass.CONDITION,
				StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.UNDEFINED_FUNCTION.setCPL(StandardClass.UNDEFINED_FUNCTION, StandardClass.CELL_ERROR,
				StandardClass.ERROR, StandardClass.SERIOUS_CONDITION, StandardClass.CONDITION,
				StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.WARNING.setCPL(StandardClass.WARNING, StandardClass.CONDITION, StandardClass.STANDARD_OBJECT,
				BuiltInClass.CLASS_T);

		// Condition classes.
		StandardClass.ARITHMETIC_ERROR.finalizeClass();
		StandardClass.CELL_ERROR.finalizeClass();
		StandardClass.COMPILER_ERROR.finalizeClass();
		StandardClass.COMPILER_UNSUPPORTED_FEATURE_ERROR.finalizeClass();
		StandardClass.CONDITION.finalizeClass();
		StandardClass.CONTROL_ERROR.finalizeClass();
		StandardClass.DIVISION_BY_ZERO.finalizeClass();
		StandardClass.END_OF_FILE.finalizeClass();
		StandardClass.ERROR.finalizeClass();
		StandardClass.FILE_ERROR.finalizeClass();
		StandardClass.FLOATING_POINT_INEXACT.finalizeClass();
		StandardClass.FLOATING_POINT_INVALID_OPERATION.finalizeClass();
		StandardClass.FLOATING_POINT_OVERFLOW.finalizeClass();
		StandardClass.FLOATING_POINT_UNDERFLOW.finalizeClass();
		StandardClass.JAVA_EXCEPTION.finalizeClass();
		StandardClass.PACKAGE_ERROR.finalizeClass();
		StandardClass.PARSE_ERROR.finalizeClass();
		StandardClass.PRINT_NOT_READABLE.finalizeClass();
		StandardClass.PROGRAM_ERROR.finalizeClass();
		StandardClass.READER_ERROR.finalizeClass();
		StandardClass.SERIOUS_CONDITION.finalizeClass();
		StandardClass.SIMPLE_CONDITION.finalizeClass();
		StandardClass.SIMPLE_ERROR.finalizeClass();
		StandardClass.SIMPLE_TYPE_ERROR.finalizeClass();
		StandardClass.SIMPLE_WARNING.finalizeClass();
		StandardClass.STORAGE_CONDITION.finalizeClass();
		StandardClass.STREAM_ERROR.finalizeClass();
		StandardClass.STYLE_WARNING.finalizeClass();
		StandardClass.TYPE_ERROR.finalizeClass();
		StandardClass.UNBOUND_SLOT.finalizeClass();
		StandardClass.UNBOUND_VARIABLE.finalizeClass();
		StandardClass.UNDEFINED_FUNCTION.finalizeClass();
		StandardClass.WARNING.finalizeClass();

		// SYS:SLOT-DEFINITION is constructed and finalized in
		// SlotDefinitionClass.java, but we need to fill in a few things here.
		Debug.assertTrue(StandardClass.SLOT_DEFINITION.isFinalized());
		StandardClass.SLOT_DEFINITION.setCPL(StandardClass.SLOT_DEFINITION, StandardClass.STANDARD_OBJECT,
				BuiltInClass.CLASS_T);
		StandardClass.SLOT_DEFINITION
				.setDirectSlotDefinitions(StandardClass.SLOT_DEFINITION.getClassLayout().generateSlotDefinitions());
		// There are no inherited slots.
		StandardClass.SLOT_DEFINITION.setSlotDefinitions(StandardClass.SLOT_DEFINITION.getDirectSlotDefinitions());

		// STANDARD-METHOD
		Debug.assertTrue(StandardClass.STANDARD_METHOD.isFinalized());
		StandardClass.STANDARD_METHOD.setCPL(StandardClass.STANDARD_METHOD, StandardClass.METHOD,
				StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.STANDARD_METHOD
				.setDirectSlotDefinitions(StandardClass.STANDARD_METHOD.getClassLayout().generateSlotDefinitions());
		// There are no inherited slots.
		StandardClass.STANDARD_METHOD.setSlotDefinitions(StandardClass.STANDARD_METHOD.getDirectSlotDefinitions());

		// STANDARD-READER-METHOD
		Debug.assertTrue(StandardClass.STANDARD_READER_METHOD.isFinalized());
		StandardClass.STANDARD_READER_METHOD.setCPL(StandardClass.STANDARD_READER_METHOD, StandardClass.STANDARD_METHOD,
				StandardClass.METHOD, StandardClass.STANDARD_OBJECT, BuiltInClass.CLASS_T);
		StandardClass.STANDARD_READER_METHOD
				.setSlotDefinitions(StandardClass.STANDARD_READER_METHOD.getClassLayout().generateSlotDefinitions());
		// All but the last slot are inherited.
		StandardClass.STANDARD_READER_METHOD.setDirectSlotDefinitions(
				Lisp.list(StandardClass.STANDARD_READER_METHOD.getSlotDefinitions().reverse().first()));

		// STANDARD-GENERIC-FUNCTION
		Debug.assertTrue(StandardClass.STANDARD_GENERIC_FUNCTION.isFinalized());
		StandardClass.STANDARD_GENERIC_FUNCTION.setCPL(StandardClass.STANDARD_GENERIC_FUNCTION,
				StandardClass.GENERIC_FUNCTION, StandardClass.STANDARD_OBJECT, BuiltInClass.FUNCTION,
				BuiltInClass.CLASS_T);
		StandardClass.STANDARD_GENERIC_FUNCTION.setDirectSlotDefinitions(
				StandardClass.STANDARD_GENERIC_FUNCTION.getClassLayout().generateSlotDefinitions());
		// There are no inherited slots.
		StandardClass.STANDARD_GENERIC_FUNCTION
				.setSlotDefinitions(StandardClass.STANDARD_GENERIC_FUNCTION.getDirectSlotDefinitions());
	}

	public StandardClass() {
		super(StandardClass.layoutStandardClass);
		this.setDirectSuperclasses(Lisp.NIL);
		this.setDirectSubclasses(Lisp.NIL);
		this.setCPL(Lisp.NIL);
		this.setDirectMethods(Lisp.NIL);
		this.setDocumentation(Lisp.NIL);
		this.setDirectSlotDefinitions(Lisp.NIL);
		this.setSlotDefinitions(Lisp.NIL);
		this.setDirectDefaultInitargs(Lisp.NIL);
		this.setDefaultInitargs(Lisp.NIL);
	}

	public StandardClass(SubLSymbol symbol, SubLObject directSuperclasses) {
		super(StandardClass.layoutStandardClass, symbol, directSuperclasses);
		this.setDirectSubclasses(Lisp.NIL);
		this.setCPL(Lisp.NIL);
		this.setDirectMethods(Lisp.NIL);
		this.setDocumentation(Lisp.NIL);
		this.setDirectSlotDefinitions(Lisp.NIL);
		this.setSlotDefinitions(Lisp.NIL);
		this.setDirectDefaultInitargs(Lisp.NIL);
		this.setDefaultInitargs(Lisp.NIL);
	}

	public SubLObject allocateInstance() {
		Layout layout = this.getClassLayout();
		if (layout == null)
			LispSymbols.ERROR.execute(LispSymbols.SIMPLE_ERROR, Keyword.FORMAT_CONTROL,
					LispObjectFactory.makeString("No layout for class ~S."), Keyword.FORMAT_ARGUMENTS, Lisp.list(this));
		return new StandardObject(this, layout.getLength());
	}

	public SubLObject classOf() {
		return StandardClass.STANDARD_CLASS;
	}

	public Layout getClassLayout() {
		SubLObject layout = this.getInstanceSlotValue(StandardClass.symLayout);
		return layout == Lisp.UNBOUND_VALUE ? super.getClassLayout() : (Layout) layout;
	}

	public SubLObject getCPL() {
		return this.getInstanceSlotValue(StandardClass.symClassPrecedenceList);
	}

	public SubLObject getDefaultInitargs() {
		return this.getInstanceSlotValue(StandardClass.symDefaultInitargs);
	}

	public SubLObject getDirectDefaultInitargs() {
		return this.getInstanceSlotValue(StandardClass.symDirectDefaultInitargs);
	}

	public SubLObject getDirectMethods() {
		return this.getInstanceSlotValue(StandardClass.symDirectMethods);
	}

	public SubLObject getDirectSlotDefinitions() {
		return this.getInstanceSlotValue(StandardClass.symDirectSlots);
	}

	public SubLObject getDirectSubclasses() {
		return this.getInstanceSlotValue(StandardClass.symDirectSubclasses);
	}

	public SubLObject getDirectSuperclasses() {
		return this.getInstanceSlotValue(StandardClass.symDirectSuperclasses);
	}

	public SubLObject getDocumentation() {
		return this.getInstanceSlotValue(StandardClass.symDocumentation);
	}

	public SubLObject getLispClassName() {
		return this.getInstanceSlotValue(StandardClass.symName);
	}

	public SubLObject getSlotDefinitions() {
		return this.getInstanceSlotValue(StandardClass.symSlots);
	}

	public void setClassLayout(Layout newLayout) {
		super.setClassLayout(newLayout);
		this.setInstanceSlotValue(StandardClass.symLayout, newLayout);
	}

	public void setCPL(SubLObject... cpl) {
		SubLObject obj1 = cpl[0];
		if (obj1.isList() && cpl.length == 1)
			this.setInstanceSlotValue(StandardClass.symClassPrecedenceList, obj1);
		else {
			Debug.assertTrue(obj1 == this);
			SubLObject l = Lisp.NIL;
			for (int i = cpl.length; i-- > 0;)
				l = LispObjectFactory.makeCons(cpl[i], l);
			this.setInstanceSlotValue(StandardClass.symClassPrecedenceList, l);
		}
	}

	public void setDefaultInitargs(SubLObject defaultInitargs) {
		this.setInstanceSlotValue(StandardClass.symDefaultInitargs, defaultInitargs);
	}

	public void setDirectDefaultInitargs(SubLObject directDefaultInitargs) {
		this.setInstanceSlotValue(StandardClass.symDirectDefaultInitargs, directDefaultInitargs);
	}

	public void setDirectMethods(SubLObject methods) {
		this.setInstanceSlotValue(StandardClass.symDirectMethods, methods);
	}

	public void setDirectSlotDefinitions(SubLObject directSlotDefinitions) {
		this.setInstanceSlotValue(StandardClass.symDirectSlots, directSlotDefinitions);
	}

	public void setDirectSubclasses(SubLObject directSubclasses) {
		this.setInstanceSlotValue(StandardClass.symDirectSubclasses, directSubclasses);
	}

	public void setDirectSuperclasses(SubLObject directSuperclasses) {
		this.setInstanceSlotValue(StandardClass.symDirectSuperclasses, directSuperclasses);
	}

	public void setDocumentation(SubLObject doc) {
		this.setInstanceSlotValue(StandardClass.symDocumentation, doc);
	}

	public void setLispClassName(SubLObject newName) {
		this.setInstanceSlotValue(StandardClass.symName, newName);
	}

	public void setSlotDefinitions(SubLObject slotDefinitions) {
		this.setInstanceSlotValue(StandardClass.symSlots, slotDefinitions);
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.STANDARD_CLASS)
			return Lisp.T;
		if (type == StandardClass.STANDARD_CLASS)
			return Lisp.T;
		return super.typep(type);
	}

	public String writeToString() {
		StringBuilder sb = new StringBuilder(LispSymbols.STANDARD_CLASS.writeToString());
		if (this.getLispClassName() != null) {
			sb.append(' ');
			sb.append(this.getLispClassName().writeToString());
		}
		return this.unreadableString(sb.toString());
	}
}
