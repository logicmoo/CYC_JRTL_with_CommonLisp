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

package  com.cyc.cycjava.cycl;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeChar;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeGuid;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;


import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.unicode_strings;

public  final class unicode_streams extends SubLTranslatedFile {

  //// Constructor

  private unicode_streams() {}
  public static final SubLFile me = new unicode_streams();
  public static final String myName = "com.cyc.cycjava.cycl.unicode_streams";

  //// Definitions

  @SubL(source = "cycl/unicode-streams.lisp", position = 912) 
  private static SubLSymbol $unicode_linefeed$ = null;

  @SubL(source = "cycl/unicode-streams.lisp", position = 955) 
  private static SubLSymbol $unicode_carriage_return$ = null;

  public static final class $utf8_stream_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $stream; }
    public SubLObject getField3() { return $cache; }
    public SubLObject setField2(SubLObject value) { return $stream = value; }
    public SubLObject setField3(SubLObject value) { return $cache = value; }
    public SubLObject $stream = NIL;
    public SubLObject $cache = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($utf8_stream_native.class, $sym0$UTF8_STREAM, $sym1$UTF8_STREAM_P, $list2, $list3, new String[] {"$stream", "$cache"}, $list4, $list5, $sym6$PRINT_UTF8_STREAM);
  }

  @SubL(source = "cycl/unicode-streams.lisp", position = 1005) 
  public static SubLSymbol $dtp_utf8_stream$ = null;

  @SubL(source = "cycl/unicode-streams.lisp", position = 1005) 
  public static final SubLObject utf8_stream_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7064");
    return NIL;
  }

  public static final class $utf8_stream_p$UnaryFunction extends UnaryFunction {
    public $utf8_stream_p$UnaryFunction() { super(extractFunctionNamed("UTF8-STREAM-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7072"); }
  }

  public static final SubLObject declare_unicode_streams_file() {
    declareFunction(myName, "utf8_stream_print_function_trampoline", "UTF8-STREAM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "utf8_stream_p", "UTF8-STREAM-P", 1, 0, false); new $utf8_stream_p$UnaryFunction();
    //declareFunction(myName, "utf8_stream_stream", "UTF8-STREAM-STREAM", 1, 0, false);
    //declareFunction(myName, "utf8_stream_cache", "UTF8-STREAM-CACHE", 1, 0, false);
    //declareFunction(myName, "_csetf_utf8_stream_stream", "_CSETF-UTF8-STREAM-STREAM", 2, 0, false);
    //declareFunction(myName, "_csetf_utf8_stream_cache", "_CSETF-UTF8-STREAM-CACHE", 2, 0, false);
    //declareFunction(myName, "make_utf8_stream", "MAKE-UTF8-STREAM", 0, 1, false);
    //declareFunction(myName, "utf8_stream_create", "UTF8-STREAM-CREATE", 1, 0, false);
    //declareFunction(myName, "print_utf8_stream", "PRINT-UTF8-STREAM", 3, 0, false);
    //declareFunction(myName, "open_utf8", "OPEN-UTF8", 2, 0, false);
    //declareFunction(myName, "close_utf8", "CLOSE-UTF8", 1, 0, false);
    //declareFunction(myName, "write_unicode_char_to_utf8", "WRITE-UNICODE-CHAR-TO-UTF8", 1, 1, false);
    //declareFunction(myName, "write_unicode_string_to_utf8", "WRITE-UNICODE-STRING-TO-UTF8", 1, 3, false);
    //declareFunction(myName, "write_unicode_string_to_utf8_line", "WRITE-UNICODE-STRING-TO-UTF8-LINE", 1, 3, false);
    //declareFunction(myName, "read_utf8_char", "READ-UTF8-CHAR", 0, 4, false);
    //declareFunction(myName, "read_utf8_char_helper", "READ-UTF8-CHAR-HELPER", 0, 4, false);
    //declareFunction(myName, "read_utf8_line", "READ-UTF8-LINE", 0, 4, false);
    return NIL;
  }

  public static final SubLObject init_unicode_streams_file() {
    $unicode_linefeed$ = defconstant("UNICODE-LINEFEED", TEN_INTEGER);
    $unicode_carriage_return$ = defconstant("UNICODE-CARRIAGE-RETURN", THIRTEEN_INTEGER);
    $dtp_utf8_stream$ = defconstant("*DTP-UTF8-STREAM*", $sym0$UTF8_STREAM);
    return NIL;
  }

  public static final SubLObject setup_unicode_streams_file() {
    // CVS_ID("Id: unicode-streams.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_utf8_stream$.getGlobalValue(), Symbols.symbol_function($sym7$UTF8_STREAM_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$UTF8_STREAM_STREAM, $sym9$_CSETF_UTF8_STREAM_STREAM);
    Structures.def_csetf($sym10$UTF8_STREAM_CACHE, $sym11$_CSETF_UTF8_STREAM_CACHE);
    Equality.identity($sym0$UTF8_STREAM);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$UTF8_STREAM = makeSymbol("UTF8-STREAM");
  public static final SubLSymbol $sym1$UTF8_STREAM_P = makeSymbol("UTF8-STREAM-P");
  public static final SubLList $list2 = list(makeSymbol("STREAM"), makeSymbol("CACHE"));
  public static final SubLList $list3 = list(makeKeyword("STREAM"), makeKeyword("CACHE"));
  public static final SubLList $list4 = list(makeSymbol("UTF8-STREAM-STREAM"), makeSymbol("UTF8-STREAM-CACHE"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-UTF8-STREAM-STREAM"), makeSymbol("_CSETF-UTF8-STREAM-CACHE"));
  public static final SubLSymbol $sym6$PRINT_UTF8_STREAM = makeSymbol("PRINT-UTF8-STREAM");
  public static final SubLSymbol $sym7$UTF8_STREAM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("UTF8-STREAM-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$UTF8_STREAM_STREAM = makeSymbol("UTF8-STREAM-STREAM");
  public static final SubLSymbol $sym9$_CSETF_UTF8_STREAM_STREAM = makeSymbol("_CSETF-UTF8-STREAM-STREAM");
  public static final SubLSymbol $sym10$UTF8_STREAM_CACHE = makeSymbol("UTF8-STREAM-CACHE");
  public static final SubLSymbol $sym11$_CSETF_UTF8_STREAM_CACHE = makeSymbol("_CSETF-UTF8-STREAM-CACHE");
  public static final SubLSymbol $kw12$STREAM = makeKeyword("STREAM");
  public static final SubLSymbol $kw13$CACHE = makeKeyword("CACHE");
  public static final SubLString $str14$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str15$__utf8_stream__s_cache___s_ = makeString("#<utf8-stream ~s cache: ~s>");
  public static final SubLSymbol $kw16$CLOSED = makeKeyword("CLOSED");
  public static final SubLString $str17$Invalid_utf8_stream___s__ = makeString("Invalid utf8 stream: ~s~%");
  public static final SubLSymbol $sym18$UNICODE_CHARACTER_P = makeSymbol("UNICODE-CHARACTER-P");
  public static final SubLSymbol $sym19$UNICODE_STRING_P = makeSymbol("UNICODE-STRING-P");
  public static final SubLSymbol $sym20$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLString $str21$Invalid_Unicode_character_in_Stre = makeString("Invalid Unicode character in Stream ~s, its first byte was ~x~%");
  public static final SubLString $str22$Invalid_Unicode_character_in_Stre = makeString("Invalid Unicode character in Stream ~s, Stream EOF in the middle of unicode character, its first byte was ~x~%");
  public static final SubLInteger $int23$256 = makeInteger(256);
  public static final SubLString $str24$EOF_in_Unicode_stream___s__ = makeString("EOF in Unicode stream: ~s~%");
  public static final SubLSymbol $kw25$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym26$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLString $str27$Internal_Error_in_Unicode_stream_ = makeString("Internal Error in Unicode stream: ~s~%");

  //// Initializers

  public void declareFunctions() {
    declare_unicode_streams_file();
  }

  public void initializeVariables() {
    init_unicode_streams_file();
  }

  public void runTopLevelForms() {
    setup_unicode_streams_file();
  }

}
