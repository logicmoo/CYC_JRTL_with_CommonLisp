//
// For LarKC
//
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class compatibility extends SubLTranslatedFile {
	public static SubLObject declare_compatibility_file() {
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility", "open_text",
				"OPEN-TEXT", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility", "open_binary",
				"OPEN-BINARY", 2, 0, false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility",
				"with_streamed_file_internal", "WITH-STREAMED-FILE-INTERNAL");
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility", "with_text_file",
				"WITH-TEXT-FILE");
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility", "with_private_text_file",
				"WITH-PRIVATE-TEXT-FILE");
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility", "with_binary_file",
				"WITH-BINARY-FILE");
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility",
				"with_private_binary_file", "WITH-PRIVATE-BINARY-FILE");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility", "get_file_position",
				"GET-FILE-POSITION", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility", "set_file_position",
				"SET-FILE-POSITION", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility",
				"default_struct_print_function", "DEFAULT-STRUCT-PRINT-FUNCTION", 3, 0, false);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/compatibility.lisp", position = 4859L)
	public static SubLObject default_struct_print_function(SubLObject object, SubLObject stream, SubLObject depth) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL != print_high.$print_readably$.getDynamicValue(thread))
			print_high.print_not_readable(object, stream);
		else {
			print_macros.print_unreadable_object_preamble(stream, object, CommonSymbols.T, SubLNil.NIL);
			print_macros.print_unreadable_object_postamble(stream, object, CommonSymbols.T, CommonSymbols.T);
		}
		return object;
	}

	@SubL(source = "sublisp/compatibility.lisp", position = 4667L)
	public static SubLObject get_file_position(SubLObject stream) {
		return streams_high.file_position(stream, CommonSymbols.UNPROVIDED);
	}

	public static SubLObject init_compatibility_file() {
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/compatibility.lisp", position = 1470L)
	public static SubLObject open_binary(SubLObject filename, SubLObject direction) {
		if (direction == compatibility.$kw0$INPUT)
			return StreamsLow.open(filename,
					new SubLObject[] { compatibility.$kw1$DIRECTION, compatibility.$kw0$INPUT,
							compatibility.$kw2$IF_DOES_NOT_EXIST, SubLNil.NIL, compatibility.$kw3$ELEMENT_TYPE,
							compatibility.$kw12$BINARY });
		if (direction == compatibility.$kw5$OUTPUT || direction == compatibility.$kw13$IO)
			return StreamsLow.open(filename,
					new SubLObject[] { compatibility.$kw1$DIRECTION, direction, compatibility.$kw6$IF_EXISTS,
							compatibility.$kw7$NEW_VERSION, compatibility.$kw2$IF_DOES_NOT_EXIST,
							compatibility.$kw8$CREATE, compatibility.$kw3$ELEMENT_TYPE, compatibility.$kw12$BINARY });
		if (direction == compatibility.$kw9$APPEND)
			return StreamsLow.open(filename, new SubLObject[] { compatibility.$kw1$DIRECTION, compatibility.$kw5$OUTPUT,
					compatibility.$kw6$IF_EXISTS, compatibility.$kw9$APPEND, compatibility.$kw2$IF_DOES_NOT_EXIST,
					compatibility.$kw8$CREATE, compatibility.$kw3$ELEMENT_TYPE, compatibility.$kw12$BINARY });
		Errors.error(compatibility.$str14$_S_called_with_invalid_direction_, compatibility.$sym15$OPEN_BINARY,
				direction);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/compatibility.lisp", position = 347L)
	public static SubLObject open_text(SubLObject filename, SubLObject direction) {
		if (direction == compatibility.$kw0$INPUT)
			return StreamsLow.open(filename,
					new SubLObject[] { compatibility.$kw1$DIRECTION, compatibility.$kw0$INPUT,
							compatibility.$kw2$IF_DOES_NOT_EXIST, SubLNil.NIL, compatibility.$kw3$ELEMENT_TYPE,
							compatibility.$kw4$TEXT });
		if (direction == compatibility.$kw5$OUTPUT)
			return StreamsLow.open(filename, new SubLObject[] { compatibility.$kw1$DIRECTION, compatibility.$kw5$OUTPUT,
					compatibility.$kw6$IF_EXISTS, compatibility.$kw7$NEW_VERSION, compatibility.$kw2$IF_DOES_NOT_EXIST,
					compatibility.$kw8$CREATE, compatibility.$kw3$ELEMENT_TYPE, compatibility.$kw4$TEXT });
		if (direction == compatibility.$kw9$APPEND)
			return StreamsLow.open(filename, new SubLObject[] { compatibility.$kw1$DIRECTION, compatibility.$kw5$OUTPUT,
					compatibility.$kw6$IF_EXISTS, compatibility.$kw9$APPEND, compatibility.$kw2$IF_DOES_NOT_EXIST,
					compatibility.$kw8$CREATE, compatibility.$kw3$ELEMENT_TYPE, compatibility.$kw4$TEXT });
		Errors.error(compatibility.$str10$_S_called_with_invalid_direction_, compatibility.$sym11$OPEN_TEXT, direction);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/compatibility.lisp", position = 4784L)
	public static SubLObject set_file_position(SubLObject stream, SubLObject n) {
		return streams_high.file_position(stream, n);
	}

	public static SubLObject setup_compatibility_file() {
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/compatibility.lisp", position = 4314L)
	public static SubLObject with_binary_file(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
		SubLObject temp = current.rest();
		current = current.first();
		SubLObject stream = SubLNil.NIL;
		SubLObject filename = SubLNil.NIL;
		SubLObject direction = SubLNil.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
		stream = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
		filename = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
		direction = current.first();
		current = current.rest();
		if (SubLNil.NIL == current) {
			SubLObject body;
			current = body = temp;
			return ConsesLow.listS(compatibility.$sym19$WITH_STREAMED_FILE_INTERNAL,
					ConsesLow.listS(stream, filename, direction, compatibility.$list37),
					ConsesLow.append(body, SubLNil.NIL));
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, compatibility.$list34);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/compatibility.lisp", position = 4486L)
	public static SubLObject with_private_binary_file(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
		SubLObject temp = current.rest();
		current = current.first();
		SubLObject stream = SubLNil.NIL;
		SubLObject filename = SubLNil.NIL;
		SubLObject direction = SubLNil.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
		stream = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
		filename = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
		direction = current.first();
		current = current.rest();
		if (SubLNil.NIL == current) {
			SubLObject body;
			current = body = temp;
			return ConsesLow.listS(compatibility.$sym19$WITH_STREAMED_FILE_INTERNAL,
					ConsesLow.listS(stream, filename, direction, compatibility.$list38),
					ConsesLow.append(body, SubLNil.NIL));
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, compatibility.$list34);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/compatibility.lisp", position = 4137L)
	public static SubLObject with_private_text_file(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
		SubLObject temp = current.rest();
		current = current.first();
		SubLObject stream = SubLNil.NIL;
		SubLObject filename = SubLNil.NIL;
		SubLObject direction = SubLNil.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
		stream = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
		filename = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
		direction = current.first();
		current = current.rest();
		if (SubLNil.NIL == current) {
			SubLObject body;
			current = body = temp;
			return ConsesLow.listS(compatibility.$sym19$WITH_STREAMED_FILE_INTERNAL,
					ConsesLow.listS(stream, filename, direction, compatibility.$list36),
					ConsesLow.append(body, SubLNil.NIL));
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, compatibility.$list34);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/compatibility.lisp", position = 2559L)
	public static SubLObject with_streamed_file_internal(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list16);
		SubLObject temp = current.rest();
		current = current.first();
		SubLObject stream = SubLNil.NIL;
		SubLObject filename = SubLNil.NIL;
		SubLObject direction = SubLNil.NIL;
		SubLObject access = SubLNil.NIL;
		SubLObject type = SubLNil.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list16);
		stream = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list16);
		filename = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list16);
		direction = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list16);
		access = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list16);
		type = current.first();
		current = current.rest();
		if (SubLNil.NIL == current) {
			SubLObject body;
			current = body = temp;
			SubLObject stream_var = Symbols.make_symbol(compatibility.$str17$STREAM);
			SubLObject open_func = SubLNil.NIL;
			SubLObject open_clause = SubLNil.NIL;
			if (type == compatibility.$kw12$BINARY)
				open_func = compatibility.$sym15$OPEN_BINARY;
			else if (type == compatibility.$kw4$TEXT)
				open_func = compatibility.$sym11$OPEN_TEXT;
			else
				Errors.error(compatibility.$str18$_S_invoked_with_invalid_file_type,
						compatibility.$sym19$WITH_STREAMED_FILE_INTERNAL, type);
			open_clause = ConsesLow.list(compatibility.$sym20$CSETQ, stream_var,
					ConsesLow.list(open_func, filename, direction));
			if (access == compatibility.$kw21$PRIVATE)
				open_clause = ConsesLow.list(compatibility.$sym22$ENSURE_PRIVATE_STREAM, open_clause);
			else if (access != compatibility.$kw23$PUBLIC)
				Errors.error(compatibility.$str24$_S_invoked_with_invalid_access_se,
						compatibility.$sym19$WITH_STREAMED_FILE_INTERNAL, access);
			return ConsesLow.list(compatibility.$sym25$CLET, ConsesLow.list(stream_var),
					ConsesLow.list(compatibility.$sym26$CUNWIND_PROTECT,
							ConsesLow.list(compatibility.$sym27$PROGN, open_clause,
									ConsesLow.list(compatibility.$sym28$PUNLESS,
											ConsesLow.list(compatibility.$sym29$STREAMP, stream_var),
											ConsesLow.list(compatibility.$sym30$ERROR,
													compatibility.$str31$Unable_to_open__S, filename)),
									ConsesLow.listS(compatibility.$sym25$CLET,
											ConsesLow.list(ConsesLow.list(stream, stream_var)),
											ConsesLow.append(body, SubLNil.NIL))),
							ConsesLow.list(compatibility.$sym32$PWHEN,
									ConsesLow.list(compatibility.$sym29$STREAMP, stream_var),
									ConsesLow.list(compatibility.$sym33$CLOSE, stream_var))));
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, compatibility.$list16);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/compatibility.lisp", position = 3937L)
	public static SubLObject with_text_file(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
		SubLObject temp = current.rest();
		current = current.first();
		SubLObject stream = SubLNil.NIL;
		SubLObject filename = SubLNil.NIL;
		SubLObject direction = SubLNil.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
		stream = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
		filename = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
		direction = current.first();
		current = current.rest();
		if (SubLNil.NIL == current) {
			SubLObject body;
			current = body = temp;
			return ConsesLow.listS(compatibility.$sym19$WITH_STREAMED_FILE_INTERNAL,
					ConsesLow.listS(stream, filename, direction, compatibility.$list35),
					ConsesLow.append(body, SubLNil.NIL));
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, compatibility.$list34);
		return SubLNil.NIL;
	}

	public static SubLFile me;
	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility";
	private static SubLSymbol $kw0$INPUT;
	private static SubLSymbol $kw1$DIRECTION;
	private static SubLSymbol $kw2$IF_DOES_NOT_EXIST;
	private static SubLSymbol $kw3$ELEMENT_TYPE;
	private static SubLSymbol $kw4$TEXT;
	private static SubLSymbol $kw5$OUTPUT;
	private static SubLSymbol $kw6$IF_EXISTS;
	private static SubLSymbol $kw7$NEW_VERSION;
	private static SubLSymbol $kw8$CREATE;
	private static SubLSymbol $kw9$APPEND;
	private static SubLString $str10$_S_called_with_invalid_direction_;
	private static SubLSymbol $sym11$OPEN_TEXT;
	private static SubLSymbol $kw12$BINARY;
	private static SubLSymbol $kw13$IO;
	private static SubLString $str14$_S_called_with_invalid_direction_;
	private static SubLSymbol $sym15$OPEN_BINARY;
	private static SubLList $list16;
	private static SubLString $str17$STREAM;
	private static SubLString $str18$_S_invoked_with_invalid_file_type;
	private static SubLSymbol $sym19$WITH_STREAMED_FILE_INTERNAL;
	private static SubLSymbol $sym20$CSETQ;
	private static SubLSymbol $kw21$PRIVATE;
	private static SubLSymbol $sym22$ENSURE_PRIVATE_STREAM;
	private static SubLSymbol $kw23$PUBLIC;
	private static SubLString $str24$_S_invoked_with_invalid_access_se;
	private static SubLSymbol $sym25$CLET;
	private static SubLSymbol $sym26$CUNWIND_PROTECT;
	private static SubLSymbol $sym27$PROGN;
	private static SubLSymbol $sym28$PUNLESS;
	private static SubLSymbol $sym29$STREAMP;
	private static SubLSymbol $sym30$ERROR;
	private static SubLString $str31$Unable_to_open__S;
	private static SubLSymbol $sym32$PWHEN;
	private static SubLSymbol $sym33$CLOSE;
	private static SubLList $list34;
	private static SubLList $list35;
	private static SubLList $list36;
	private static SubLList $list37;
	private static SubLList $list38;
	static {
		me = new compatibility();
		$kw0$INPUT = SubLObjectFactory.makeKeyword("INPUT");
		$kw1$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
		$kw2$IF_DOES_NOT_EXIST = SubLObjectFactory.makeKeyword("IF-DOES-NOT-EXIST");
		$kw3$ELEMENT_TYPE = SubLObjectFactory.makeKeyword("ELEMENT-TYPE");
		$kw4$TEXT = SubLObjectFactory.makeKeyword("TEXT");
		$kw5$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
		$kw6$IF_EXISTS = SubLObjectFactory.makeKeyword("IF-EXISTS");
		$kw7$NEW_VERSION = SubLObjectFactory.makeKeyword("NEW-VERSION");
		$kw8$CREATE = SubLObjectFactory.makeKeyword("CREATE");
		$kw9$APPEND = SubLObjectFactory.makeKeyword("APPEND");
		$str10$_S_called_with_invalid_direction_ = SubLObjectFactory
				.makeString("~S called with invalid direction argument of ~S.");
		$sym11$OPEN_TEXT = SubLObjectFactory.makeSymbol("OPEN-TEXT");
		$kw12$BINARY = SubLObjectFactory.makeKeyword("BINARY");
		$kw13$IO = SubLObjectFactory.makeKeyword("IO");
		$str14$_S_called_with_invalid_direction_ = SubLObjectFactory
				.makeString("~S called with invalid direction argument of ~A");
		$sym15$OPEN_BINARY = SubLObjectFactory.makeSymbol("OPEN-BINARY");
		$list16 = ConsesLow.list(
				ConsesLow.list(SubLObjectFactory.makeSymbol("STREAM"), SubLObjectFactory.makeSymbol("FILENAME"),
						SubLObjectFactory.makeSymbol("DIRECTION"), SubLObjectFactory.makeSymbol("ACCESS"),
						SubLObjectFactory.makeSymbol("TYPE")),
				SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
		$str17$STREAM = SubLObjectFactory.makeString("STREAM");
		$str18$_S_invoked_with_invalid_file_type = SubLObjectFactory
				.makeString("~S invoked with invalid file type ~S specified.");
		$sym19$WITH_STREAMED_FILE_INTERNAL = SubLObjectFactory.makeSymbol("WITH-STREAMED-FILE-INTERNAL");
		$sym20$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
		$kw21$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
		$sym22$ENSURE_PRIVATE_STREAM = SubLObjectFactory.makeSymbol("ENSURE-PRIVATE-STREAM");
		$kw23$PUBLIC = SubLObjectFactory.makeKeyword("PUBLIC");
		$str24$_S_invoked_with_invalid_access_se = SubLObjectFactory
				.makeString("~S invoked with invalid access setting ~S.");
		$sym25$CLET = SubLObjectFactory.makeSymbol("CLET");
		$sym26$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
		$sym27$PROGN = SubLObjectFactory.makeSymbol("PROGN");
		$sym28$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
		$sym29$STREAMP = SubLObjectFactory.makeSymbol("STREAMP");
		$sym30$ERROR = SubLObjectFactory.makeSymbol("ERROR");
		$str31$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
		$sym32$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
		$sym33$CLOSE = SubLObjectFactory.makeSymbol("CLOSE");
		$list34 = ConsesLow.list(
				ConsesLow.list(SubLObjectFactory.makeSymbol("STREAM"), SubLObjectFactory.makeSymbol("FILENAME"),
						SubLObjectFactory.makeSymbol("DIRECTION")),
				SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
		$list35 = ConsesLow.list(SubLObjectFactory.makeKeyword("PUBLIC"), SubLObjectFactory.makeKeyword("TEXT"));
		$list36 = ConsesLow.list(SubLObjectFactory.makeKeyword("PRIVATE"), SubLObjectFactory.makeKeyword("TEXT"));
		$list37 = ConsesLow.list(SubLObjectFactory.makeKeyword("PUBLIC"), SubLObjectFactory.makeKeyword("BINARY"));
		$list38 = ConsesLow.list(SubLObjectFactory.makeKeyword("PRIVATE"), SubLObjectFactory.makeKeyword("BINARY"));
	}

	@Override
	public void declareFunctions() {
		declare_compatibility_file();
	}

	@Override
	public void initializeVariables() {
		init_compatibility_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_compatibility_file();
	}

	public static SubLObject open_text(SubLObject filename, SubLObject direction, SubLObject unprovided) {
		return open_text(filename, direction);
	}

	public static SubLObject open_binary(SubLObject filename, SubLObject direction, SubLObject unprovided) {
		return open_binary(filename, direction);
	}
}
