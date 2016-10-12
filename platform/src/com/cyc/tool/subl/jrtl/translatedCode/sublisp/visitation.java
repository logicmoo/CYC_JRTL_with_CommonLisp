/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class visitation extends SubLTranslatedFile {

	//// Constructor

	public static SubLFile me = new visitation();

	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation";
	@SubL(source = "sublisp/visitation.lisp", position = 492)
	public static SubLSymbol $visit_defstruct_object_method_table$ = null;

	//// Definitions

	public static SubLInteger $int0$256 = SubLObjectFactory.makeInteger(256);

	public static SubLString $str1$No_visitation_function_defined_fo = SubLObjectFactory
			.makeString("No visitation function defined for ~A.");

	public static SubLSymbol $sym2$VISIT_DEFSTRUCT_OBJECT_INTEGER_METHOD = SubLObjectFactory
			.makeSymbol("VISIT-DEFSTRUCT-OBJECT-INTEGER-METHOD");

	public static SubLSymbol $sym3$VISIT_DEFSTRUCT_OBJECT_FLOAT_METHOD = SubLObjectFactory
			.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FLOAT-METHOD");

	public static SubLSymbol $sym4$VISIT_DEFSTRUCT_OBJECT_STRING_METHOD = SubLObjectFactory
			.makeSymbol("VISIT-DEFSTRUCT-OBJECT-STRING-METHOD");

	public static SubLSymbol $sym5$VISIT_DEFSTRUCT_OBJECT_CHARACTER_METHOD = SubLObjectFactory
			.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CHARACTER-METHOD");

	public static SubLSymbol $sym6$VISIT_DEFSTRUCT_OBJECT_SYMBOL_METHOD = SubLObjectFactory
			.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SYMBOL-METHOD");

	public static SubLSymbol $sym7$VISIT_DEFSTRUCT_OBJECT_VECTOR_METHOD = SubLObjectFactory
			.makeSymbol("VISIT-DEFSTRUCT-OBJECT-VECTOR-METHOD");

	public static SubLSymbol $sym8$VISIT_DEFSTRUCT_OBJECT_CONS_METHOD = SubLObjectFactory
			.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CONS-METHOD");

	public static SubLSymbol $sym9$VISIT_DEFSTRUCT_OBJECT_HASH_TABLE_METHOD = SubLObjectFactory
			.makeSymbol("VISIT-DEFSTRUCT-OBJECT-HASH-TABLE-METHOD");

	public static SubLString $str10$_A__A__A___A__ = SubLObjectFactory.makeString("~A ~A ~A: ~A~%");

	public static SubLObject declare_visitation_file() {
		SubLFiles.declareFunction(visitation.myName, "visit_defstruct", "VISIT-DEFSTRUCT", 2, 0, false);
		SubLFiles.declareFunction(visitation.myName, "visit_defstruct_object", "VISIT-DEFSTRUCT-OBJECT", 2, 0, false);
		SubLFiles.declareFunction(visitation.myName, "visit_defstruct_noop", "VISIT-DEFSTRUCT-NOOP", 2, 0, false);
		SubLFiles.declareFunction(visitation.myName, "visit_defstruct_object_integer_method",
				"VISIT-DEFSTRUCT-OBJECT-INTEGER-METHOD", 2, 0, false);
		SubLFiles.declareFunction(visitation.myName, "visit_defstruct_object_float_method",
				"VISIT-DEFSTRUCT-OBJECT-FLOAT-METHOD", 2, 0, false);
		SubLFiles.declareFunction(visitation.myName, "visit_defstruct_object_string_method",
				"VISIT-DEFSTRUCT-OBJECT-STRING-METHOD", 2, 0, false);
		SubLFiles.declareFunction(visitation.myName, "visit_defstruct_object_character_method",
				"VISIT-DEFSTRUCT-OBJECT-CHARACTER-METHOD", 2, 0, false);
		SubLFiles.declareFunction(visitation.myName, "visit_defstruct_object_symbol_method",
				"VISIT-DEFSTRUCT-OBJECT-SYMBOL-METHOD", 2, 0, false);
		SubLFiles.declareFunction(visitation.myName, "visit_defstruct_object_vector_method",
				"VISIT-DEFSTRUCT-OBJECT-VECTOR-METHOD", 2, 0, false);
		SubLFiles.declareFunction(visitation.myName, "visit_defstruct_object_cons_method",
				"VISIT-DEFSTRUCT-OBJECT-CONS-METHOD", 2, 0, false);
		SubLFiles.declareFunction(visitation.myName, "visit_defstruct_object_hash_table_method","VISIT-DEFSTRUCT-OBJECT-HASH-TABLE-METHOD", 2, 0, false);
		SubLFiles.declareFunction(visitation.myName, "print_visitor", "PRINT-VISITOR", 4, 0, false);
		return CommonSymbols.NIL;
	}

	public static SubLObject init_visitation_file() {
		visitation.$visit_defstruct_object_method_table$ = SubLFiles.deflexical("*VISIT-DEFSTRUCT-OBJECT-METHOD-TABLE*",
				Vectors.make_vector(visitation.$int0$256, CommonSymbols.NIL));
		return CommonSymbols.NIL;
	}

	/** @stub implementation */
	@SubL(source = "sublisp/visitation.lisp", position = 1755)
	public static SubLObject print_visitor(SubLObject obj, SubLObject phase, SubLObject slot, SubLObject value) {
		return PrintLow.format(CommonSymbols.T, visitation.$str10$_A__A__A___A__,
				new SubLObject[] { phase, obj, slot, value });
	}

	public static SubLObject setup_visitation_file() {
		// CVS_ID("Id");
		Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(),
				Types.$dtp_bignum$.getGlobalValue(),
				Symbols.symbol_function(visitation.$sym2$VISIT_DEFSTRUCT_OBJECT_INTEGER_METHOD));
		Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(),
				Types.$dtp_fixnum$.getGlobalValue(),
				Symbols.symbol_function(visitation.$sym2$VISIT_DEFSTRUCT_OBJECT_INTEGER_METHOD));
		Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(),
				Types.$dtp_float$.getGlobalValue(),
				Symbols.symbol_function(visitation.$sym3$VISIT_DEFSTRUCT_OBJECT_FLOAT_METHOD));
		Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(),
				Types.$dtp_string$.getGlobalValue(),
				Symbols.symbol_function(visitation.$sym4$VISIT_DEFSTRUCT_OBJECT_STRING_METHOD));
		Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(),
				Types.$dtp_character$.getGlobalValue(),
				Symbols.symbol_function(visitation.$sym5$VISIT_DEFSTRUCT_OBJECT_CHARACTER_METHOD));
		Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(),
				Types.$dtp_symbol$.getGlobalValue(),
				Symbols.symbol_function(visitation.$sym6$VISIT_DEFSTRUCT_OBJECT_SYMBOL_METHOD));
		Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(),
				Types.$dtp_vector$.getGlobalValue(),
				Symbols.symbol_function(visitation.$sym7$VISIT_DEFSTRUCT_OBJECT_VECTOR_METHOD));
		Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(),
				Types.$dtp_cons$.getGlobalValue(),
				Symbols.symbol_function(visitation.$sym8$VISIT_DEFSTRUCT_OBJECT_CONS_METHOD));
		Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(),
				Types.$dtp_hash_table$.getGlobalValue(),
				Symbols.symbol_function(visitation.$sym9$VISIT_DEFSTRUCT_OBJECT_HASH_TABLE_METHOD));
		return CommonSymbols.NIL;
	}

	/** The entry point into the type-dispatched visitation methods. */
	@SubL(source = "sublisp/visitation.lisp", position = 283)
	public static SubLObject visit_defstruct(SubLObject obj, SubLObject visitor_fn) {
		return visitation.visit_defstruct_object(obj, visitor_fn);
	}

	//// Internal Constants

	/** Default method called by all non defstructs in the common system. */
	@SubL(source = "sublisp/visitation.lisp", position = 700)
	public static SubLObject visit_defstruct_noop(SubLObject obj, SubLObject visitor_fn) {
		return obj;
	}

	/** The per-type implementation of the defstruct visitor. */
	@SubL(source = "sublisp/visitation.lisp", position = 492)
	public static SubLObject visit_defstruct_object(SubLObject obj, SubLObject visitor_fn) {
		{
			SubLObject method_function = Structures.method_func(obj,
					visitation.$visit_defstruct_object_method_table$.getGlobalValue());
			if (CommonSymbols.NIL != method_function)
				return Functions.funcall(method_function, obj, visitor_fn);
			return Errors.error(visitation.$str1$No_visitation_function_defined_fo, Types.type_of(obj));
		}
	}

	@SubL(source = "sublisp/visitation.lisp", position = 1190)
	public static SubLObject visit_defstruct_object_character_method(SubLObject obj, SubLObject visitor_fn) {
		return visitation.visit_defstruct_noop(obj, visitor_fn);
	}

	@SubL(source = "sublisp/visitation.lisp", position = 1529)
	public static SubLObject visit_defstruct_object_cons_method(SubLObject obj, SubLObject visitor_fn) {
		return visitation.visit_defstruct_noop(obj, visitor_fn);
	}

	@SubL(source = "sublisp/visitation.lisp", position = 967)
	public static SubLObject visit_defstruct_object_float_method(SubLObject obj, SubLObject visitor_fn) {
		return visitation.visit_defstruct_noop(obj, visitor_fn);
	}

	@SubL(source = "sublisp/visitation.lisp", position = 1639)
	public static SubLObject visit_defstruct_object_hash_table_method(SubLObject obj, SubLObject visitor_fn) {
		return visitation.visit_defstruct_noop(obj, visitor_fn);
	}

	@SubL(source = "sublisp/visitation.lisp", position = 853)
	public static SubLObject visit_defstruct_object_integer_method(SubLObject obj, SubLObject visitor_fn) {
		return visitation.visit_defstruct_noop(obj, visitor_fn);
	}

	@SubL(source = "sublisp/visitation.lisp", position = 1078)
	public static SubLObject visit_defstruct_object_string_method(SubLObject obj, SubLObject visitor_fn) {
		return visitation.visit_defstruct_noop(obj, visitor_fn);
	}

	@SubL(source = "sublisp/visitation.lisp", position = 1305)
	public static SubLObject visit_defstruct_object_symbol_method(SubLObject obj, SubLObject visitor_fn) {
		return visitation.visit_defstruct_noop(obj, visitor_fn);
	}

	@SubL(source = "sublisp/visitation.lisp", position = 1417)
	public static SubLObject visit_defstruct_object_vector_method(SubLObject obj, SubLObject visitor_fn) {
		return visitation.visit_defstruct_noop(obj, visitor_fn);
	}

	private visitation() {
	}

	//// Initializers

	public void declareFunctions() {
		visitation.declare_visitation_file();
	}

	public void initializeVariables() {
		visitation.init_visitation_file();
	}

	public void runTopLevelForms() {
		visitation.setup_visitation_file();
	}

}
