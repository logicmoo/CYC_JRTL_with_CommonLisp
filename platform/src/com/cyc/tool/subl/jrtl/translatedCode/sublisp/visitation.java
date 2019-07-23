//
// For LarKC
//
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class visitation extends SubLTranslatedFile {
	public static SubLObject declare_visitation_file() {
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation", "visit_defstruct",
				"VISIT-DEFSTRUCT", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation", "visit_defstruct_object",
				"VISIT-DEFSTRUCT-OBJECT", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation", "visit_defstruct_noop",
				"VISIT-DEFSTRUCT-NOOP", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation",
				"visit_defstruct_object_integer_method", "VISIT-DEFSTRUCT-OBJECT-INTEGER-METHOD", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation",
				"visit_defstruct_object_float_method", "VISIT-DEFSTRUCT-OBJECT-FLOAT-METHOD", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation",
				"visit_defstruct_object_string_method", "VISIT-DEFSTRUCT-OBJECT-STRING-METHOD", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation",
				"visit_defstruct_object_character_method", "VISIT-DEFSTRUCT-OBJECT-CHARACTER-METHOD", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation",
				"visit_defstruct_object_symbol_method", "VISIT-DEFSTRUCT-OBJECT-SYMBOL-METHOD", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation",
				"visit_defstruct_object_vector_method", "VISIT-DEFSTRUCT-OBJECT-VECTOR-METHOD", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation",
				"visit_defstruct_object_cons_method", "VISIT-DEFSTRUCT-OBJECT-CONS-METHOD", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation",
				"visit_defstruct_object_hash_table_method", "VISIT-DEFSTRUCT-OBJECT-HASH-TABLE-METHOD", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation", "print_visitor",
				"PRINT-VISITOR", 4, 0, false);
		return SubLNil.NIL;
	}

	public static SubLObject init_visitation_file() {
		visitation.$visit_defstruct_object_method_table$ = SubLFiles.deflexical("*VISIT-DEFSTRUCT-OBJECT-METHOD-TABLE*",
				Vectors.make_vector(visitation.$int$256, SubLNil.NIL));
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/visitation.lisp", position = 1754L)
	public static SubLObject print_visitor(SubLObject obj, SubLObject phase, SubLObject slot, SubLObject value) {
		return PrintLow.format(CommonSymbols.T, visitation.$str10$_A__A__A___A__,
				new SubLObject[] { phase, obj, slot, value });
	}

	public static SubLObject setup_visitation_file() {
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
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/visitation.lisp", position = 333L)
	public static SubLObject visit_defstruct(SubLObject obj, SubLObject visitor_fn) {
		return visit_defstruct_object(obj, visitor_fn);
	}

	@SubL(source = "sublisp/visitation.lisp", position = 699L)
	public static SubLObject visit_defstruct_noop(SubLObject obj, SubLObject visitor_fn) {
		return obj;
	}

	@SubL(source = "sublisp/visitation.lisp", position = 490L)
	public static SubLObject visit_defstruct_object(SubLObject obj, SubLObject visitor_fn) {
		SubLObject method_function = Structures.method_func(obj,
				visitation.$visit_defstruct_object_method_table$.getGlobalValue());
		if (SubLNil.NIL != method_function)
			return Functions.funcall(method_function, obj, visitor_fn);
		return Errors.error(visitation.$str1$No_visitation_function_defined_fo, Types.type_of(obj));
	}

	@SubL(source = "sublisp/visitation.lisp", position = 1189L)
	public static SubLObject visit_defstruct_object_character_method(SubLObject obj, SubLObject visitor_fn) {
		return visit_defstruct_noop(obj, visitor_fn);
	}

	@SubL(source = "sublisp/visitation.lisp", position = 1528L)
	public static SubLObject visit_defstruct_object_cons_method(SubLObject obj, SubLObject visitor_fn) {
		return visit_defstruct_noop(obj, visitor_fn);
	}

	@SubL(source = "sublisp/visitation.lisp", position = 966L)
	public static SubLObject visit_defstruct_object_float_method(SubLObject obj, SubLObject visitor_fn) {
		return visit_defstruct_noop(obj, visitor_fn);
	}

	@SubL(source = "sublisp/visitation.lisp", position = 1638L)
	public static SubLObject visit_defstruct_object_hash_table_method(SubLObject obj, SubLObject visitor_fn) {
		return visit_defstruct_noop(obj, visitor_fn);
	}

	@SubL(source = "sublisp/visitation.lisp", position = 852L)
	public static SubLObject visit_defstruct_object_integer_method(SubLObject obj, SubLObject visitor_fn) {
		return visit_defstruct_noop(obj, visitor_fn);
	}

	@SubL(source = "sublisp/visitation.lisp", position = 1077L)
	public static SubLObject visit_defstruct_object_string_method(SubLObject obj, SubLObject visitor_fn) {
		return visit_defstruct_noop(obj, visitor_fn);
	}

	@SubL(source = "sublisp/visitation.lisp", position = 1304L)
	public static SubLObject visit_defstruct_object_symbol_method(SubLObject obj, SubLObject visitor_fn) {
		return visit_defstruct_noop(obj, visitor_fn);
	}

	@SubL(source = "sublisp/visitation.lisp", position = 1416L)
	public static SubLObject visit_defstruct_object_vector_method(SubLObject obj, SubLObject visitor_fn) {
		return visit_defstruct_noop(obj, visitor_fn);
	}

	public static SubLFile me;
	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation";
	@SubL(source = "sublisp/visitation.lisp", position = 490L)
	public static SubLSymbol $visit_defstruct_object_method_table$;
	private static SubLInteger $int$256;
	private static SubLString $str1$No_visitation_function_defined_fo;
	private static SubLSymbol $sym2$VISIT_DEFSTRUCT_OBJECT_INTEGER_METHOD;
	private static SubLSymbol $sym3$VISIT_DEFSTRUCT_OBJECT_FLOAT_METHOD;
	private static SubLSymbol $sym4$VISIT_DEFSTRUCT_OBJECT_STRING_METHOD;
	private static SubLSymbol $sym5$VISIT_DEFSTRUCT_OBJECT_CHARACTER_METHOD;
	private static SubLSymbol $sym6$VISIT_DEFSTRUCT_OBJECT_SYMBOL_METHOD;
	private static SubLSymbol $sym7$VISIT_DEFSTRUCT_OBJECT_VECTOR_METHOD;
	private static SubLSymbol $sym8$VISIT_DEFSTRUCT_OBJECT_CONS_METHOD;
	private static SubLSymbol $sym9$VISIT_DEFSTRUCT_OBJECT_HASH_TABLE_METHOD;
	private static SubLString $str10$_A__A__A___A__;
	static {
		me = new visitation();
		visitation.$visit_defstruct_object_method_table$ = null;
		$int$256 = SubLObjectFactory.makeInteger(256);
		$str1$No_visitation_function_defined_fo = SubLObjectFactory
				.makeString("No visitation function defined for ~A.");
		$sym2$VISIT_DEFSTRUCT_OBJECT_INTEGER_METHOD = SubLObjectFactory
				.makeSymbol("VISIT-DEFSTRUCT-OBJECT-INTEGER-METHOD");
		$sym3$VISIT_DEFSTRUCT_OBJECT_FLOAT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FLOAT-METHOD");
		$sym4$VISIT_DEFSTRUCT_OBJECT_STRING_METHOD = SubLObjectFactory
				.makeSymbol("VISIT-DEFSTRUCT-OBJECT-STRING-METHOD");
		$sym5$VISIT_DEFSTRUCT_OBJECT_CHARACTER_METHOD = SubLObjectFactory
				.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CHARACTER-METHOD");
		$sym6$VISIT_DEFSTRUCT_OBJECT_SYMBOL_METHOD = SubLObjectFactory
				.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SYMBOL-METHOD");
		$sym7$VISIT_DEFSTRUCT_OBJECT_VECTOR_METHOD = SubLObjectFactory
				.makeSymbol("VISIT-DEFSTRUCT-OBJECT-VECTOR-METHOD");
		$sym8$VISIT_DEFSTRUCT_OBJECT_CONS_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CONS-METHOD");
		$sym9$VISIT_DEFSTRUCT_OBJECT_HASH_TABLE_METHOD = SubLObjectFactory
				.makeSymbol("VISIT-DEFSTRUCT-OBJECT-HASH-TABLE-METHOD");
		$str10$_A__A__A___A__ = SubLObjectFactory.makeString("~A ~A ~A: ~A~%");
	}

	@Override
	public void declareFunctions() {
		declare_visitation_file();
	}

	@Override
	public void initializeVariables() {
		init_visitation_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_visitation_file();
	}
}
