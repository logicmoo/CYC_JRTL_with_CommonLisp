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

package com.cyc.cycjava_1.cycl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;

 import com.cyc.cycjava.cycl.*;
 import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;



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


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.file_hash_table;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.red_infrastructure_macros;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class file_backed_cache extends SubLTranslatedFile {

  //// Constructor

  private file_backed_cache() {}
  public static final SubLFile me = new file_backed_cache();
  public static final String myName = "com.cyc.cycjava_1.cycl.file_backed_cache";

  //// Definitions

  /** Lock used to ensure resets of file backed caches are done atomically. */
  @SubL(source = "cycl/file-backed-cache.lisp", position = 1134) 
  private static SubLSymbol $fbc_reset_lock$ = null;

  /** Where the cache files live. */
  @SubL(source = "cycl/file-backed-cache.lisp", position = 1276) 
  public static SubLSymbol $file_backed_cache_base_path$ = null;

  public static final class $file_backed_cache_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $file_hash_table_cache; }
    public SubLObject getField3() { return $local_cache; }
    public SubLObject getField4() { return $file_hash_table_path; }
    public SubLObject getField5() { return $should_preload_cache; }
    public SubLObject getField6() { return $is_fort_cache; }
    public SubLObject getField7() { return $fht_cache_percentage; }
    public SubLObject getField8() { return $test; }
    public SubLObject getField9() { return $mode; }
    public SubLObject getField10() { return $is_busy; }
    public SubLObject setField2(SubLObject value) { return $file_hash_table_cache = value; }
    public SubLObject setField3(SubLObject value) { return $local_cache = value; }
    public SubLObject setField4(SubLObject value) { return $file_hash_table_path = value; }
    public SubLObject setField5(SubLObject value) { return $should_preload_cache = value; }
    public SubLObject setField6(SubLObject value) { return $is_fort_cache = value; }
    public SubLObject setField7(SubLObject value) { return $fht_cache_percentage = value; }
    public SubLObject setField8(SubLObject value) { return $test = value; }
    public SubLObject setField9(SubLObject value) { return $mode = value; }
    public SubLObject setField10(SubLObject value) { return $is_busy = value; }
    public SubLObject $file_hash_table_cache = NIL;
    public SubLObject $local_cache = NIL;
    public SubLObject $file_hash_table_path = NIL;
    public SubLObject $should_preload_cache = NIL;
    public SubLObject $is_fort_cache = NIL;
    public SubLObject $fht_cache_percentage = NIL;
    public SubLObject $test = NIL;
    public SubLObject $mode = NIL;
    public SubLObject $is_busy = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($file_backed_cache_native.class, $sym5$FILE_BACKED_CACHE, $sym6$FILE_BACKED_CACHE_P, $list7, $list8, new String[] {"$file_hash_table_cache", "$local_cache", "$file_hash_table_path", "$should_preload_cache", "$is_fort_cache", "$fht_cache_percentage", "$test", "$mode", "$is_busy"}, $list9, $list10, $sym11$PRINT_FBC);
  }

  @SubL(source = "cycl/file-backed-cache.lisp", position = 1796) 
  public static SubLSymbol $dtp_file_backed_cache$ = null;

  @SubL(source = "cycl/file-backed-cache.lisp", position = 1796) 
  public static final SubLObject file_backed_cache_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7781");
    return NIL;
  }

  public static final class $file_backed_cache_p$UnaryFunction extends UnaryFunction {
    public $file_backed_cache_p$UnaryFunction() { super(extractFunctionNamed("FILE-BACKED-CACHE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7779"); }
  }

  public static final SubLObject declare_file_backed_cache_file() {
    declareFunction(myName, "file_backed_cache_print_function_trampoline", "FILE-BACKED-CACHE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "file_backed_cache_p", "FILE-BACKED-CACHE-P", 1, 0, false); new $file_backed_cache_p$UnaryFunction();
    //declareFunction(myName, "fbc_file_hash_table_cache", "FBC-FILE-HASH-TABLE-CACHE", 1, 0, false);
    //declareFunction(myName, "fbc_local_cache", "FBC-LOCAL-CACHE", 1, 0, false);
    //declareFunction(myName, "fbc_file_hash_table_path", "FBC-FILE-HASH-TABLE-PATH", 1, 0, false);
    //declareFunction(myName, "fbc_should_preload_cache", "FBC-SHOULD-PRELOAD-CACHE", 1, 0, false);
    //declareFunction(myName, "fbc_is_fort_cache", "FBC-IS-FORT-CACHE", 1, 0, false);
    //declareFunction(myName, "fbc_fht_cache_percentage", "FBC-FHT-CACHE-PERCENTAGE", 1, 0, false);
    //declareFunction(myName, "fbc_test", "FBC-TEST", 1, 0, false);
    //declareFunction(myName, "fbc_mode", "FBC-MODE", 1, 0, false);
    //declareFunction(myName, "fbc_is_busy", "FBC-IS-BUSY", 1, 0, false);
    //declareFunction(myName, "_csetf_fbc_file_hash_table_cache", "_CSETF-FBC-FILE-HASH-TABLE-CACHE", 2, 0, false);
    //declareFunction(myName, "_csetf_fbc_local_cache", "_CSETF-FBC-LOCAL-CACHE", 2, 0, false);
    //declareFunction(myName, "_csetf_fbc_file_hash_table_path", "_CSETF-FBC-FILE-HASH-TABLE-PATH", 2, 0, false);
    //declareFunction(myName, "_csetf_fbc_should_preload_cache", "_CSETF-FBC-SHOULD-PRELOAD-CACHE", 2, 0, false);
    //declareFunction(myName, "_csetf_fbc_is_fort_cache", "_CSETF-FBC-IS-FORT-CACHE", 2, 0, false);
    //declareFunction(myName, "_csetf_fbc_fht_cache_percentage", "_CSETF-FBC-FHT-CACHE-PERCENTAGE", 2, 0, false);
    //declareFunction(myName, "_csetf_fbc_test", "_CSETF-FBC-TEST", 2, 0, false);
    //declareFunction(myName, "_csetf_fbc_mode", "_CSETF-FBC-MODE", 2, 0, false);
    //declareFunction(myName, "_csetf_fbc_is_busy", "_CSETF-FBC-IS-BUSY", 2, 0, false);
    //declareFunction(myName, "make_file_backed_cache", "MAKE-FILE-BACKED-CACHE", 0, 1, false);
    //declareFunction(myName, "file_backed_cache_create", "FILE-BACKED-CACHE-CREATE", 1, 5, false);
    //declareFunction(myName, "print_fbc", "PRINT-FBC", 3, 0, false);
    //declareFunction(myName, "fbc_initialize", "FBC-INITIALIZE", 1, 0, false);
    //declareFunction(myName, "fbc_initialize_internal", "FBC-INITIALIZE-INTERNAL", 2, 0, false);
    //declareFunction(myName, "file_backed_cache_reconnect", "FILE-BACKED-CACHE-RECONNECT", 1, 1, false);
    //declareFunction(myName, "file_backed_cache_reset", "FILE-BACKED-CACHE-RESET", 1, 1, false);
    //declareFunction(myName, "file_backed_cache_finalize", "FILE-BACKED-CACHE-FINALIZE", 1, 0, false);
    //declareFunction(myName, "preload_entire_file_hash_table", "PRELOAD-ENTIRE-FILE-HASH-TABLE", 1, 0, false);
    //declareFunction(myName, "file_backed_cache_lookup", "FILE-BACKED-CACHE-LOOKUP", 2, 2, false);
    //declareFunction(myName, "file_backed_cache_enter", "FILE-BACKED-CACHE-ENTER", 3, 0, false);
    //declareFunction(myName, "file_backed_cache_file_hash_table_path", "FILE-BACKED-CACHE-FILE-HASH-TABLE-PATH", 1, 0, false);
    //declareFunction(myName, "file_backed_cache_local_cache_count", "FILE-BACKED-CACHE-LOCAL-CACHE-COUNT", 1, 0, false);
    //declareFunction(myName, "replicate_file_backed_cache", "REPLICATE-FILE-BACKED-CACHE", 2, 4, false);
    //declareFunction(myName, "replicate_file_backed_cache_int", "REPLICATE-FILE-BACKED-CACHE-INT", 6, 0, false);
    return NIL;
  }

  public static final SubLObject init_file_backed_cache_file() {
    $fbc_reset_lock$ = deflexical("*FBC-RESET-LOCK*", Locks.make_lock($str0$fbc_reset_lock));
    $file_backed_cache_base_path$ = deflexical("*FILE-BACKED-CACHE-BASE-PATH*", red_infrastructure_macros.red_def_helper(($list1.isSymbol() ? ((SubLObject) Symbols.symbol_value($list1)) : $list1), $sym2$_FILE_BACKED_CACHE_BASE_PATH_, ($str3$data_caches_.isSymbol() ? ((SubLObject) Symbols.symbol_value($str3$data_caches_)) : $str3$data_caches_), $kw4$LEXICAL, UNPROVIDED));
    $dtp_file_backed_cache$ = defconstant("*DTP-FILE-BACKED-CACHE*", $sym5$FILE_BACKED_CACHE);
    return NIL;
  }

  public static final SubLObject setup_file_backed_cache_file() {
    // CVS_ID("Id: file-backed-cache.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_file_backed_cache$.getGlobalValue(), Symbols.symbol_function($sym12$FILE_BACKED_CACHE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym13$FBC_FILE_HASH_TABLE_CACHE, $sym14$_CSETF_FBC_FILE_HASH_TABLE_CACHE);
    Structures.def_csetf($sym15$FBC_LOCAL_CACHE, $sym16$_CSETF_FBC_LOCAL_CACHE);
    Structures.def_csetf($sym17$FBC_FILE_HASH_TABLE_PATH, $sym18$_CSETF_FBC_FILE_HASH_TABLE_PATH);
    Structures.def_csetf($sym19$FBC_SHOULD_PRELOAD_CACHE, $sym20$_CSETF_FBC_SHOULD_PRELOAD_CACHE);
    Structures.def_csetf($sym21$FBC_IS_FORT_CACHE, $sym22$_CSETF_FBC_IS_FORT_CACHE);
    Structures.def_csetf($sym23$FBC_FHT_CACHE_PERCENTAGE, $sym24$_CSETF_FBC_FHT_CACHE_PERCENTAGE);
    Structures.def_csetf($sym25$FBC_TEST, $sym26$_CSETF_FBC_TEST);
    Structures.def_csetf($sym27$FBC_MODE, $sym28$_CSETF_FBC_MODE);
    Structures.def_csetf($sym29$FBC_IS_BUSY, $sym30$_CSETF_FBC_IS_BUSY);
    Equality.identity($sym5$FILE_BACKED_CACHE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLString $str0$fbc_reset_lock = makeString("fbc-reset-lock");
  public static final SubLList $list1 = list(makeString("application.file-backed-cache.base-path"));
  public static final SubLSymbol $sym2$_FILE_BACKED_CACHE_BASE_PATH_ = makeSymbol("*FILE-BACKED-CACHE-BASE-PATH*");
  public static final SubLString $str3$data_caches_ = makeString("data/caches/");
  public static final SubLSymbol $kw4$LEXICAL = makeKeyword("LEXICAL");
  public static final SubLSymbol $sym5$FILE_BACKED_CACHE = makeSymbol("FILE-BACKED-CACHE");
  public static final SubLSymbol $sym6$FILE_BACKED_CACHE_P = makeSymbol("FILE-BACKED-CACHE-P");
  public static final SubLList $list7 = list(new SubLObject[] {makeSymbol("FILE-HASH-TABLE-CACHE"), makeSymbol("LOCAL-CACHE"), makeSymbol("FILE-HASH-TABLE-PATH"), makeSymbol("SHOULD-PRELOAD-CACHE"), makeSymbol("IS-FORT-CACHE"), makeSymbol("FHT-CACHE-PERCENTAGE"), makeSymbol("TEST"), makeSymbol("MODE"), makeSymbol("IS-BUSY")});
  public static final SubLList $list8 = list(new SubLObject[] {makeKeyword("FILE-HASH-TABLE-CACHE"), makeKeyword("LOCAL-CACHE"), makeKeyword("FILE-HASH-TABLE-PATH"), makeKeyword("SHOULD-PRELOAD-CACHE"), makeKeyword("IS-FORT-CACHE"), makeKeyword("FHT-CACHE-PERCENTAGE"), makeKeyword("TEST"), makeKeyword("MODE"), makeKeyword("IS-BUSY")});
  public static final SubLList $list9 = list(new SubLObject[] {makeSymbol("FBC-FILE-HASH-TABLE-CACHE"), makeSymbol("FBC-LOCAL-CACHE"), makeSymbol("FBC-FILE-HASH-TABLE-PATH"), makeSymbol("FBC-SHOULD-PRELOAD-CACHE"), makeSymbol("FBC-IS-FORT-CACHE"), makeSymbol("FBC-FHT-CACHE-PERCENTAGE"), makeSymbol("FBC-TEST"), makeSymbol("FBC-MODE"), makeSymbol("FBC-IS-BUSY")});
  public static final SubLList $list10 = list(new SubLObject[] {makeSymbol("_CSETF-FBC-FILE-HASH-TABLE-CACHE"), makeSymbol("_CSETF-FBC-LOCAL-CACHE"), makeSymbol("_CSETF-FBC-FILE-HASH-TABLE-PATH"), makeSymbol("_CSETF-FBC-SHOULD-PRELOAD-CACHE"), makeSymbol("_CSETF-FBC-IS-FORT-CACHE"), makeSymbol("_CSETF-FBC-FHT-CACHE-PERCENTAGE"), makeSymbol("_CSETF-FBC-TEST"), makeSymbol("_CSETF-FBC-MODE"), makeSymbol("_CSETF-FBC-IS-BUSY")});
  public static final SubLSymbol $sym11$PRINT_FBC = makeSymbol("PRINT-FBC");
  public static final SubLSymbol $sym12$FILE_BACKED_CACHE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FILE-BACKED-CACHE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym13$FBC_FILE_HASH_TABLE_CACHE = makeSymbol("FBC-FILE-HASH-TABLE-CACHE");
  public static final SubLSymbol $sym14$_CSETF_FBC_FILE_HASH_TABLE_CACHE = makeSymbol("_CSETF-FBC-FILE-HASH-TABLE-CACHE");
  public static final SubLSymbol $sym15$FBC_LOCAL_CACHE = makeSymbol("FBC-LOCAL-CACHE");
  public static final SubLSymbol $sym16$_CSETF_FBC_LOCAL_CACHE = makeSymbol("_CSETF-FBC-LOCAL-CACHE");
  public static final SubLSymbol $sym17$FBC_FILE_HASH_TABLE_PATH = makeSymbol("FBC-FILE-HASH-TABLE-PATH");
  public static final SubLSymbol $sym18$_CSETF_FBC_FILE_HASH_TABLE_PATH = makeSymbol("_CSETF-FBC-FILE-HASH-TABLE-PATH");
  public static final SubLSymbol $sym19$FBC_SHOULD_PRELOAD_CACHE = makeSymbol("FBC-SHOULD-PRELOAD-CACHE");
  public static final SubLSymbol $sym20$_CSETF_FBC_SHOULD_PRELOAD_CACHE = makeSymbol("_CSETF-FBC-SHOULD-PRELOAD-CACHE");
  public static final SubLSymbol $sym21$FBC_IS_FORT_CACHE = makeSymbol("FBC-IS-FORT-CACHE");
  public static final SubLSymbol $sym22$_CSETF_FBC_IS_FORT_CACHE = makeSymbol("_CSETF-FBC-IS-FORT-CACHE");
  public static final SubLSymbol $sym23$FBC_FHT_CACHE_PERCENTAGE = makeSymbol("FBC-FHT-CACHE-PERCENTAGE");
  public static final SubLSymbol $sym24$_CSETF_FBC_FHT_CACHE_PERCENTAGE = makeSymbol("_CSETF-FBC-FHT-CACHE-PERCENTAGE");
  public static final SubLSymbol $sym25$FBC_TEST = makeSymbol("FBC-TEST");
  public static final SubLSymbol $sym26$_CSETF_FBC_TEST = makeSymbol("_CSETF-FBC-TEST");
  public static final SubLSymbol $sym27$FBC_MODE = makeSymbol("FBC-MODE");
  public static final SubLSymbol $sym28$_CSETF_FBC_MODE = makeSymbol("_CSETF-FBC-MODE");
  public static final SubLSymbol $sym29$FBC_IS_BUSY = makeSymbol("FBC-IS-BUSY");
  public static final SubLSymbol $sym30$_CSETF_FBC_IS_BUSY = makeSymbol("_CSETF-FBC-IS-BUSY");
  public static final SubLSymbol $kw31$FILE_HASH_TABLE_CACHE = makeKeyword("FILE-HASH-TABLE-CACHE");
  public static final SubLSymbol $kw32$LOCAL_CACHE = makeKeyword("LOCAL-CACHE");
  public static final SubLSymbol $kw33$FILE_HASH_TABLE_PATH = makeKeyword("FILE-HASH-TABLE-PATH");
  public static final SubLSymbol $kw34$SHOULD_PRELOAD_CACHE = makeKeyword("SHOULD-PRELOAD-CACHE");
  public static final SubLSymbol $kw35$IS_FORT_CACHE = makeKeyword("IS-FORT-CACHE");
  public static final SubLSymbol $kw36$FHT_CACHE_PERCENTAGE = makeKeyword("FHT-CACHE-PERCENTAGE");
  public static final SubLSymbol $kw37$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw38$MODE = makeKeyword("MODE");
  public static final SubLSymbol $kw39$IS_BUSY = makeKeyword("IS-BUSY");
  public static final SubLString $str40$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $kw41$IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");
  public static final SubLString $str42$_FILE_BACKED_CACHE__A_ = makeString("<FILE-BACKED-CACHE ~A>");
  public static final SubLString $str43$_INVALID_FILE_BACKED_CACHE_ = makeString("<INVALID FILE-BACKED-CACHE>");
  public static final SubLString $str44$Unable_to_find_file_hashtable___A = makeString("Unable to find file hashtable: ~A");
  public static final SubLSymbol $sym45$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLInteger $int46$100 = makeInteger(100);
  public static final SubLString $str47$Preloading_file_backed_cache_ = makeString("Preloading file-backed cache.");
  public static final SubLSymbol $kw48$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $kw49$NOT_FOUND = makeKeyword("NOT-FOUND");
  public static final SubLSymbol $kw50$FBC_NOT_FOUND_VALUE = makeKeyword("FBC-NOT-FOUND-VALUE");
  public static final SubLString $str51$_S_has_no_associated_file_hash_ta = makeString("~S has no associated file hash table.");
  public static final SubLSymbol $kw52$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym53$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLString $str54$tmp_ = makeString("tmp/");
  public static final SubLString $str55$The_Not_Present_Marker = makeString("The Not Present Marker");
  public static final SubLString $str56$__Pass_I____copying_unchanged_con = makeString(" (Pass I -- copying unchanged contents)");
  public static final SubLString $str57$__Pass_II____writing_local_change = makeString(" (Pass II -- writing local changes)");

  //// Initializers

  public void declareFunctions() {
    declare_file_backed_cache_file();
  }

  public void initializeVariables() {
    init_file_backed_cache_file();
  }

  public void runTopLevelForms() {
    setup_file_backed_cache_file();
  }

}
