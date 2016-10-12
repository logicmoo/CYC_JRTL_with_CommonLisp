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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class compatibility extends SubLTranslatedFile {

	//// Constructor

	public static SubLFile me = new compatibility();

	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility";
	public static SubLSymbol $kw0$INPUT = SubLObjectFactory.makeKeyword("INPUT");

	//// Definitions

	public static SubLSymbol $kw1$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");

	public static SubLSymbol $kw2$IF_DOES_NOT_EXIST = SubLObjectFactory.makeKeyword("IF-DOES-NOT-EXIST");

	public static SubLSymbol $kw3$ELEMENT_TYPE = SubLObjectFactory.makeKeyword("ELEMENT-TYPE");

	public static SubLSymbol $kw4$TEXT = SubLObjectFactory.makeKeyword("TEXT");

	public static SubLSymbol $kw5$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");

	public static SubLSymbol $kw6$IF_EXISTS = SubLObjectFactory.makeKeyword("IF-EXISTS");

	public static SubLSymbol $kw7$NEW_VERSION = SubLObjectFactory.makeKeyword("NEW-VERSION");

	public static SubLSymbol $kw8$CREATE = SubLObjectFactory.makeKeyword("CREATE");

	public static SubLSymbol $kw9$APPEND = SubLObjectFactory.makeKeyword("APPEND");

	public static SubLString $str10$_S_called_with_invalid_direction_ = SubLObjectFactory
			.makeString("~S called with invalid direction argument of ~S.");

	public static SubLSymbol $sym11$OPEN_TEXT = SubLObjectFactory.makeSymbol("OPEN-TEXT");

	public static SubLSymbol $kw12$BINARY = SubLObjectFactory.makeKeyword("BINARY");

	public static SubLSymbol $kw13$IO = SubLObjectFactory.makeKeyword("IO");

	//// Internal Constants

	public static SubLString $str14$_S_called_with_invalid_direction_ = SubLObjectFactory
			.makeString("~S called with invalid direction argument of ~A");
	public static SubLSymbol $sym15$OPEN_BINARY = SubLObjectFactory.makeSymbol("OPEN-BINARY");
	public static SubLList $list16 = ConsesLow.list(
			ConsesLow.list(SubLObjectFactory.makeSymbol("STREAM"), SubLObjectFactory.makeSymbol("FILENAME"),
					SubLObjectFactory.makeSymbol("DIRECTION"), SubLObjectFactory.makeSymbol("ACCESS"),
					SubLObjectFactory.makeSymbol("TYPE")),
			SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
	public static SubLString $str17$STREAM = SubLObjectFactory.makeString("STREAM");
	public static SubLString $str18$_S_invoked_with_invalid_file_type = SubLObjectFactory
			.makeString("~S invoked with invalid file type ~S specified.");
	public static SubLSymbol $sym19$WITH_STREAMED_FILE_INTERNAL = SubLObjectFactory
			.makeSymbol("WITH-STREAMED-FILE-INTERNAL");
	public static SubLSymbol $sym20$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
	public static SubLSymbol $kw21$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
	public static SubLSymbol $sym22$ENSURE_PRIVATE_STREAM = SubLObjectFactory.makeSymbol("ENSURE-PRIVATE-STREAM");
	public static SubLSymbol $kw23$PUBLIC = SubLObjectFactory.makeKeyword("PUBLIC");
	public static SubLString $str24$_S_invoked_with_invalid_access_se = SubLObjectFactory
			.makeString("~S invoked with invalid access setting ~S.");
	public static SubLSymbol $sym25$CLET = SubLObjectFactory.makeSymbol("CLET");
	public static SubLSymbol $sym26$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
	public static SubLSymbol $sym27$PROGN = SubLObjectFactory.makeSymbol("PROGN");
	public static SubLSymbol $sym28$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
	public static SubLSymbol $sym29$STREAMP = SubLObjectFactory.makeSymbol("STREAMP");
	public static SubLSymbol $sym30$ERROR = SubLObjectFactory.makeSymbol("ERROR");
	public static SubLString $str31$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
	public static SubLSymbol $sym32$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
	public static SubLSymbol $sym33$CLOSE = SubLObjectFactory.makeSymbol("CLOSE");
	public static SubLList $list34 = ConsesLow.list(
			ConsesLow.list(SubLObjectFactory.makeSymbol("STREAM"), SubLObjectFactory.makeSymbol("FILENAME"),
					SubLObjectFactory.makeSymbol("DIRECTION")),
			SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
	public static SubLList $list35 = ConsesLow.list(SubLObjectFactory.makeKeyword("PUBLIC"),
			SubLObjectFactory.makeKeyword("TEXT"));
	public static SubLList $list36 = ConsesLow.list(SubLObjectFactory.makeKeyword("PRIVATE"),
			SubLObjectFactory.makeKeyword("TEXT"));
	public static SubLList $list37 = ConsesLow.list(SubLObjectFactory.makeKeyword("PUBLIC"),
			SubLObjectFactory.makeKeyword("BINARY"));
	public static SubLList $list38 = ConsesLow.list(SubLObjectFactory.makeKeyword("PRIVATE"),
			SubLObjectFactory.makeKeyword("BINARY"));
	public static SubLString $str39$__ = SubLObjectFactory.makeString("#<");
	public static SubLSymbol $kw40$STREAM = SubLObjectFactory.makeKeyword("STREAM");
	public static SubLSymbol $kw41$BASE = SubLObjectFactory.makeKeyword("BASE");

	public static SubLObject declare_compatibility_file() {
		SubLFiles.declareFunction(compatibility.myName, "open_text", "OPEN-TEXT", 2, 0, false);
		SubLFiles.declareFunction(compatibility.myName, "open_binary", "OPEN-BINARY", 2, 0, false);
		SubLFiles.declareMacro(compatibility.myName, "with_streamed_file_internal", "WITH-STREAMED-FILE-INTERNAL");
		SubLFiles.declareMacro(compatibility.myName, "with_text_file", "WITH-TEXT-FILE");
		SubLFiles.declareMacro(compatibility.myName, "with_private_text_file", "WITH-PRIVATE-TEXT-FILE");
		SubLFiles.declareMacro(compatibility.myName, "with_binary_file", "WITH-BINARY-FILE");
		SubLFiles.declareMacro(compatibility.myName, "with_private_binary_file", "WITH-PRIVATE-BINARY-FILE");
		SubLFiles.declareFunction(compatibility.myName, "get_file_position", "GET-FILE-POSITION", 1, 0, false);
		SubLFiles.declareFunction(compatibility.myName, "set_file_position", "SET-FILE-POSITION", 2, 0, false);
		SubLFiles.declareFunction(compatibility.myName, "default_struct_print_function",
				"DEFAULT-STRUCT-PRINT-FUNCTION", 3, 0, false);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/compatibility.lisp", position = 4857)
	public static SubLObject default_struct_print_function(SubLObject object, SubLObject stream, SubLObject depth) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != print_high.$print_readably$.getDynamicValue(thread))
				print_high.print_not_readable(object, stream);
			else {
				SubLObject object_1 = object;
				SubLObject stream_2 = stream;
				streams_high.write_string(compatibility.$str39$__, stream_2, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED);
				PrintLow.write(Types.type_of(object_1), new SubLObject[] { compatibility.$kw40$STREAM, stream_2 });
				streams_high.write_char(Characters.CHAR_space, stream_2);
				PrintLow.write(Equality.pointer(object_1), new SubLObject[] { compatibility.$kw40$STREAM, stream_2,
						compatibility.$kw41$BASE, CommonSymbols.SIXTEEN_INTEGER });
				streams_high.write_char(Characters.CHAR_greater, stream_2);
			}
			return object;
		}
	}

	@SubL(source = "sublisp/compatibility.lisp", position = 4665)
	public static SubLObject get_file_position(SubLObject stream) {
		return streams_high.file_position(stream, CommonSymbols.UNPROVIDED);
	}

	public static SubLObject init_compatibility_file() {
		return CommonSymbols.NIL;
	}

	/**
	 * Attempts to open the file FILENAME. If successful, returns an 8-bit
	 * binary byte stream. If DIRECTION is :input, then input operations can be
	 * performed on the stream. If DIRECTION is output, then output is directed
	 * to the file FILENAME, overwriting any existing file. If DIRECTION is
	 * :append, then output is appended to the file. For either output case, a
	 * new file is created if no file named FILENAME already exists.
	 */
	@SubL(source = "sublisp/compatibility.lisp", position = 1468)
	public static SubLObject open_binary(SubLObject filename, SubLObject direction) {
		if (direction == compatibility.$kw0$INPUT)
			return StreamsLow.open(filename,
					new SubLObject[] { compatibility.$kw1$DIRECTION, compatibility.$kw0$INPUT,
							compatibility.$kw2$IF_DOES_NOT_EXIST, CommonSymbols.NIL, compatibility.$kw3$ELEMENT_TYPE,
							compatibility.$kw12$BINARY });
		else if (direction == compatibility.$kw5$OUTPUT || direction == compatibility.$kw13$IO)
			return StreamsLow.open(filename,
					new SubLObject[] { compatibility.$kw1$DIRECTION, direction, compatibility.$kw6$IF_EXISTS,
							compatibility.$kw7$NEW_VERSION, compatibility.$kw2$IF_DOES_NOT_EXIST,
							compatibility.$kw8$CREATE, compatibility.$kw3$ELEMENT_TYPE, compatibility.$kw12$BINARY });
		else if (direction == compatibility.$kw9$APPEND)
			return StreamsLow.open(filename, new SubLObject[] { compatibility.$kw1$DIRECTION, compatibility.$kw5$OUTPUT,
					compatibility.$kw6$IF_EXISTS, compatibility.$kw9$APPEND, compatibility.$kw2$IF_DOES_NOT_EXIST,
					compatibility.$kw8$CREATE, compatibility.$kw3$ELEMENT_TYPE, compatibility.$kw12$BINARY });
		else
			Errors.error(compatibility.$str14$_S_called_with_invalid_direction_, compatibility.$sym15$OPEN_BINARY,
					direction);
		return CommonSymbols.NIL;
	}

	/**
	 * Attempts to open the file FILENAME. If successful, returns an 8-bit
	 * character text stream. If DIRECTION is :input, then input operations can
	 * be performed on the stream. If DIRECTION is output, then output is
	 * directed to the file FILENAME, overwriting any existing file. If
	 * DIRECTION is :append, then output is appended to the file. For either
	 * output case, a new file is created if no file named FILENAME already
	 * exists.
	 */
	@SubL(source = "sublisp/compatibility.lisp", position = 345)
	public static SubLObject open_text(SubLObject filename, SubLObject direction) {
		if (direction == compatibility.$kw0$INPUT)
			return StreamsLow.open(filename,
					new SubLObject[] { compatibility.$kw1$DIRECTION, compatibility.$kw0$INPUT,
							compatibility.$kw2$IF_DOES_NOT_EXIST, CommonSymbols.NIL, compatibility.$kw3$ELEMENT_TYPE,
							compatibility.$kw4$TEXT });
		else if (direction == compatibility.$kw5$OUTPUT)
			return StreamsLow.open(filename, new SubLObject[] { compatibility.$kw1$DIRECTION, compatibility.$kw5$OUTPUT,
					compatibility.$kw6$IF_EXISTS, compatibility.$kw7$NEW_VERSION, compatibility.$kw2$IF_DOES_NOT_EXIST,
					compatibility.$kw8$CREATE, compatibility.$kw3$ELEMENT_TYPE, compatibility.$kw4$TEXT });
		else if (direction == compatibility.$kw9$APPEND)
			return StreamsLow.open(filename, new SubLObject[] { compatibility.$kw1$DIRECTION, compatibility.$kw5$OUTPUT,
					compatibility.$kw6$IF_EXISTS, compatibility.$kw9$APPEND, compatibility.$kw2$IF_DOES_NOT_EXIST,
					compatibility.$kw8$CREATE, compatibility.$kw3$ELEMENT_TYPE, compatibility.$kw4$TEXT });
		else
			Errors.error(compatibility.$str10$_S_called_with_invalid_direction_, compatibility.$sym11$OPEN_TEXT,
					direction);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/compatibility.lisp", position = 4782)
	public static SubLObject set_file_position(SubLObject stream, SubLObject n) {
		return streams_high.file_position(stream, n);
	}

	public static SubLObject setup_compatibility_file() {
		// CVS_ID("Id: compatibility.lisp 127883 2009-05-28 14:39:29Z daves ");
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/compatibility.lisp", position = 4312)
	public static SubLObject with_binary_file(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject stream = CommonSymbols.NIL;
					SubLObject filename = CommonSymbols.NIL;
					SubLObject direction = CommonSymbols.NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
					stream = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
					filename = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
					direction = current.first();
					current = current.rest();
					if (CommonSymbols.NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							return ConsesLow.listS(compatibility.$sym19$WITH_STREAMED_FILE_INTERNAL,
									ConsesLow.listS(stream, filename, direction, compatibility.$list37),
									ConsesLow.append(body, CommonSymbols.NIL));
						}
					} else
						cdestructuring_bind.cdestructuring_bind_error(datum, compatibility.$list34);
				}
			}
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/compatibility.lisp", position = 4484)
	public static SubLObject with_private_binary_file(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject stream = CommonSymbols.NIL;
					SubLObject filename = CommonSymbols.NIL;
					SubLObject direction = CommonSymbols.NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
					stream = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
					filename = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
					direction = current.first();
					current = current.rest();
					if (CommonSymbols.NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							return ConsesLow.listS(compatibility.$sym19$WITH_STREAMED_FILE_INTERNAL,
									ConsesLow.listS(stream, filename, direction, compatibility.$list38),
									ConsesLow.append(body, CommonSymbols.NIL));
						}
					} else
						cdestructuring_bind.cdestructuring_bind_error(datum, compatibility.$list34);
				}
			}
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/compatibility.lisp", position = 4135)
	public static SubLObject with_private_text_file(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject stream = CommonSymbols.NIL;
					SubLObject filename = CommonSymbols.NIL;
					SubLObject direction = CommonSymbols.NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
					stream = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
					filename = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
					direction = current.first();
					current = current.rest();
					if (CommonSymbols.NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							return ConsesLow.listS(compatibility.$sym19$WITH_STREAMED_FILE_INTERNAL,
									ConsesLow.listS(stream, filename, direction, compatibility.$list36),
									ConsesLow.append(body, CommonSymbols.NIL));
						}
					} else
						cdestructuring_bind.cdestructuring_bind_error(datum, compatibility.$list34);
				}
			}
		}
		return CommonSymbols.NIL;
	}

	/**
	 * Given the access styles :private and :public, and the types :binary and
	 * :text for the files, we define this macro to implement the matrix of
	 * choices computationally.
	 */
	@SubL(source = "sublisp/compatibility.lisp", position = 2557)
	public static SubLObject with_streamed_file_internal(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list16);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject stream = CommonSymbols.NIL;
					SubLObject filename = CommonSymbols.NIL;
					SubLObject direction = CommonSymbols.NIL;
					SubLObject access = CommonSymbols.NIL;
					SubLObject type = CommonSymbols.NIL;
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
					if (CommonSymbols.NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							SubLObject stream_var = Symbols.make_symbol(compatibility.$str17$STREAM);
							SubLObject open_func = CommonSymbols.NIL;
							SubLObject open_clause = CommonSymbols.NIL;
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
															ConsesLow.append(body, CommonSymbols.NIL))),
											ConsesLow.list(compatibility.$sym32$PWHEN,
													ConsesLow.list(compatibility.$sym29$STREAMP, stream_var),
													ConsesLow.list(compatibility.$sym33$CLOSE, stream_var))));
						}
					} else
						cdestructuring_bind.cdestructuring_bind_error(datum, compatibility.$list16);
				}
			}
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/compatibility.lisp", position = 3935)
	public static SubLObject with_text_file(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject stream = CommonSymbols.NIL;
					SubLObject filename = CommonSymbols.NIL;
					SubLObject direction = CommonSymbols.NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
					stream = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
					filename = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, compatibility.$list34);
					direction = current.first();
					current = current.rest();
					if (CommonSymbols.NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							return ConsesLow.listS(compatibility.$sym19$WITH_STREAMED_FILE_INTERNAL,
									ConsesLow.listS(stream, filename, direction, compatibility.$list35),
									ConsesLow.append(body, CommonSymbols.NIL));
						}
					} else
						cdestructuring_bind.cdestructuring_bind_error(datum, compatibility.$list34);
				}
			}
		}
		return CommonSymbols.NIL;
	}

	private compatibility() {
	}

	//// Initializers

	public void declareFunctions() {
		compatibility.declare_compatibility_file();
	}

	public void initializeVariables() {
		compatibility.init_compatibility_file();
	}

	public void runTopLevelForms() {
		compatibility.setup_compatibility_file();
	}

}
