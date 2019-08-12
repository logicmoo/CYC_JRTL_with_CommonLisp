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

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.string_utilities;

public  final class user_actions extends SubLTranslatedFile {

  //// Constructor

  private user_actions() {}
  public static final SubLFile me = new user_actions();
  public static final String myName = "com.cyc.cycjava_1.cycl.user_actions";

  //// Definitions

  public static final class $action_type_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $key; }
    public SubLObject getField3() { return $summary_fn; }
    public SubLObject getField4() { return $display_fn; }
    public SubLObject getField5() { return $handler_fn; }
    public SubLObject setField2(SubLObject value) { return $key = value; }
    public SubLObject setField3(SubLObject value) { return $summary_fn = value; }
    public SubLObject setField4(SubLObject value) { return $display_fn = value; }
    public SubLObject setField5(SubLObject value) { return $handler_fn = value; }
    public SubLObject $key = NIL;
    public SubLObject $summary_fn = NIL;
    public SubLObject $display_fn = NIL;
    public SubLObject $handler_fn = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($action_type_native.class, $sym0$ACTION_TYPE, $sym1$ACTION_TYPE_P, $list2, $list3, new String[] {"$key", "$summary_fn", "$display_fn", "$handler_fn"}, $list4, $list5, $sym6$PRINT_ACTION_TYPE);
  }

  @SubL(source = "cycl/user-actions.lisp", position = 2550) 
  public static SubLSymbol $dtp_action_type$ = null;

  @SubL(source = "cycl/user-actions.lisp", position = 2550) 
  public static final SubLObject action_type_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29497");
    return NIL;
  }

  public static final class $action_type_p$UnaryFunction extends UnaryFunction {
    public $action_type_p$UnaryFunction() { super(extractFunctionNamed("ACTION-TYPE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29494"); }
  }

  /** A hash to find a user action from its key. */
  @SubL(source = "cycl/user-actions.lisp", position = 3206) 
  public static SubLSymbol $action_types_by_key$ = null;

  public static final class $user_action_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $id_string; }
    public SubLObject getField3() { return $type_key; }
    public SubLObject getField4() { return $cyclist; }
    public SubLObject getField5() { return $creation_time; }
    public SubLObject getField6() { return $data; }
    public SubLObject setField2(SubLObject value) { return $id_string = value; }
    public SubLObject setField3(SubLObject value) { return $type_key = value; }
    public SubLObject setField4(SubLObject value) { return $cyclist = value; }
    public SubLObject setField5(SubLObject value) { return $creation_time = value; }
    public SubLObject setField6(SubLObject value) { return $data = value; }
    public SubLObject $id_string = NIL;
    public SubLObject $type_key = NIL;
    public SubLObject $cyclist = NIL;
    public SubLObject $creation_time = NIL;
    public SubLObject $data = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($user_action_native.class, $sym34$USER_ACTION, $sym35$USER_ACTION_P, $list36, $list37, new String[] {"$id_string", "$type_key", "$cyclist", "$creation_time", "$data"}, $list38, $list39, $sym40$PRINT_USER_ACTION);
  }

  @SubL(source = "cycl/user-actions.lisp", position = 3772) 
  public static SubLSymbol $dtp_user_action$ = null;

  @SubL(source = "cycl/user-actions.lisp", position = 3772) 
  public static final SubLObject user_action_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29498");
    return NIL;
  }

  public static final class $user_action_p$UnaryFunction extends UnaryFunction {
    public $user_action_p$UnaryFunction() { super(extractFunctionNamed("USER-ACTION-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29499"); }
  }

  /** A lock of the user-action structures to prevent clobbering. */
  @SubL(source = "cycl/user-actions.lisp", position = 4348) 
  public static SubLSymbol $user_actions_lock$ = null;

  /** All the user actions that have been defined. */
  @SubL(source = "cycl/user-actions.lisp", position = 4488) 
  public static SubLSymbol $user_actions$ = null;

  /** A hash to find a user action from its id-string. */
  @SubL(source = "cycl/user-actions.lisp", position = 4583) 
  public static SubLSymbol $user_actions_by_id_string$ = null;

  public static final SubLObject declare_user_actions_file() {
    declareFunction(myName, "action_type_print_function_trampoline", "ACTION-TYPE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "action_type_p", "ACTION-TYPE-P", 1, 0, false); new $action_type_p$UnaryFunction();
    declareFunction(myName, "action_type_key", "ACTION-TYPE-KEY", 1, 0, false);
    declareFunction(myName, "action_type_summary_fn", "ACTION-TYPE-SUMMARY-FN", 1, 0, false);
    declareFunction(myName, "action_type_display_fn", "ACTION-TYPE-DISPLAY-FN", 1, 0, false);
    declareFunction(myName, "action_type_handler_fn", "ACTION-TYPE-HANDLER-FN", 1, 0, false);
    declareFunction(myName, "_csetf_action_type_key", "_CSETF-ACTION-TYPE-KEY", 2, 0, false);
    declareFunction(myName, "_csetf_action_type_summary_fn", "_CSETF-ACTION-TYPE-SUMMARY-FN", 2, 0, false);
    declareFunction(myName, "_csetf_action_type_display_fn", "_CSETF-ACTION-TYPE-DISPLAY-FN", 2, 0, false);
    declareFunction(myName, "_csetf_action_type_handler_fn", "_CSETF-ACTION-TYPE-HANDLER-FN", 2, 0, false);
    declareFunction(myName, "make_action_type", "MAKE-ACTION-TYPE", 0, 1, false);
    declareFunction(myName, "print_action_type", "PRINT-ACTION-TYPE", 3, 0, false);
    declareMacro(myName, "defaction_type", "DEFACTION-TYPE");
    declareFunction(myName, "action_type_by_key", "ACTION-TYPE-BY-KEY", 1, 0, false);
    declareFunction(myName, "user_action_print_function_trampoline", "USER-ACTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "user_action_p", "USER-ACTION-P", 1, 0, false); new $user_action_p$UnaryFunction();
    declareFunction(myName, "user_action_id_string", "USER-ACTION-ID-STRING", 1, 0, false);
    declareFunction(myName, "user_action_type_key", "USER-ACTION-TYPE-KEY", 1, 0, false);
    declareFunction(myName, "user_action_cyclist", "USER-ACTION-CYCLIST", 1, 0, false);
    declareFunction(myName, "user_action_creation_time", "USER-ACTION-CREATION-TIME", 1, 0, false);
    declareFunction(myName, "user_action_data", "USER-ACTION-DATA", 1, 0, false);
    declareFunction(myName, "_csetf_user_action_id_string", "_CSETF-USER-ACTION-ID-STRING", 2, 0, false);
    declareFunction(myName, "_csetf_user_action_type_key", "_CSETF-USER-ACTION-TYPE-KEY", 2, 0, false);
    declareFunction(myName, "_csetf_user_action_cyclist", "_CSETF-USER-ACTION-CYCLIST", 2, 0, false);
    declareFunction(myName, "_csetf_user_action_creation_time", "_CSETF-USER-ACTION-CREATION-TIME", 2, 0, false);
    declareFunction(myName, "_csetf_user_action_data", "_CSETF-USER-ACTION-DATA", 2, 0, false);
    declareFunction(myName, "make_user_action", "MAKE-USER-ACTION", 0, 1, false);
    declareFunction(myName, "print_user_action", "PRINT-USER-ACTION", 3, 0, false);
    declareFunction(myName, "user_actions_emptyP", "USER-ACTIONS-EMPTY?", 0, 0, false);
    declareFunction(myName, "user_actions_size", "USER-ACTIONS-SIZE", 0, 0, false);
    declareFunction(myName, "new_user_action", "NEW-USER-ACTION", 1, 0, false);
    declareFunction(myName, "delete_user_action", "DELETE-USER-ACTION", 1, 0, false);
    declareFunction(myName, "user_action_by_id_string", "USER-ACTION-BY-ID-STRING", 1, 0, false);
    declareFunction(myName, "user_action_type", "USER-ACTION-TYPE", 1, 0, false);
    declareFunction(myName, "user_action_summary_fn", "USER-ACTION-SUMMARY-FN", 1, 0, false);
    declareFunction(myName, "user_action_display_fn", "USER-ACTION-DISPLAY-FN", 1, 0, false);
    declareFunction(myName, "user_action_handler_fn", "USER-ACTION-HANDLER-FN", 1, 0, false);
    declareFunction(myName, "all_actions_for_cyclist", "ALL-ACTIONS-FOR-CYCLIST", 1, 0, false);
    declareFunction(myName, "all_actions_for_cyclist_of_type", "ALL-ACTIONS-FOR-CYCLIST-OF-TYPE", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_user_actions_file() {
    $dtp_action_type$ = defconstant("*DTP-ACTION-TYPE*", $sym0$ACTION_TYPE);
    $action_types_by_key$ = defparameter("*ACTION-TYPES-BY-KEY*", Hashtables.make_hash_table($int25$64, UNPROVIDED, UNPROVIDED));
    $dtp_user_action$ = defconstant("*DTP-USER-ACTION*", $sym34$USER_ACTION);
    $user_actions_lock$ = deflexical("*USER-ACTIONS-LOCK*", Locks.make_lock($str57$User_Actions_Lock));
    $user_actions$ = defparameter("*USER-ACTIONS*", NIL);
    $user_actions_by_id_string$ = defparameter("*USER-ACTIONS-BY-ID-STRING*", Hashtables.make_hash_table($int25$64, Symbols.symbol_function(EQUAL), UNPROVIDED));
    return NIL;
  }

  public static final SubLObject setup_user_actions_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_action_type$.getGlobalValue(), Symbols.symbol_function($sym7$ACTION_TYPE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$ACTION_TYPE_KEY, $sym9$_CSETF_ACTION_TYPE_KEY);
    Structures.def_csetf($sym10$ACTION_TYPE_SUMMARY_FN, $sym11$_CSETF_ACTION_TYPE_SUMMARY_FN);
    Structures.def_csetf($sym12$ACTION_TYPE_DISPLAY_FN, $sym13$_CSETF_ACTION_TYPE_DISPLAY_FN);
    Structures.def_csetf($sym14$ACTION_TYPE_HANDLER_FN, $sym15$_CSETF_ACTION_TYPE_HANDLER_FN);
    Equality.identity($sym0$ACTION_TYPE);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_user_action$.getGlobalValue(), Symbols.symbol_function($sym41$USER_ACTION_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym42$USER_ACTION_ID_STRING, $sym43$_CSETF_USER_ACTION_ID_STRING);
    Structures.def_csetf($sym44$USER_ACTION_TYPE_KEY, $sym45$_CSETF_USER_ACTION_TYPE_KEY);
    Structures.def_csetf($sym46$USER_ACTION_CYCLIST, $sym47$_CSETF_USER_ACTION_CYCLIST);
    Structures.def_csetf($sym48$USER_ACTION_CREATION_TIME, $sym49$_CSETF_USER_ACTION_CREATION_TIME);
    Structures.def_csetf($sym50$USER_ACTION_DATA, $sym51$_CSETF_USER_ACTION_DATA);
    Equality.identity($sym34$USER_ACTION);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$ACTION_TYPE = makeSymbol("ACTION-TYPE");
  public static final SubLSymbol $sym1$ACTION_TYPE_P = makeSymbol("ACTION-TYPE-P");
  public static final SubLList $list2 = list(makeSymbol("KEY"), makeSymbol("SUMMARY-FN"), makeSymbol("DISPLAY-FN"), makeSymbol("HANDLER-FN"));
  public static final SubLList $list3 = list(makeKeyword("KEY"), makeKeyword("SUMMARY-FN"), makeKeyword("DISPLAY-FN"), makeKeyword("HANDLER-FN"));
  public static final SubLList $list4 = list(makeSymbol("ACTION-TYPE-KEY"), makeSymbol("ACTION-TYPE-SUMMARY-FN"), makeSymbol("ACTION-TYPE-DISPLAY-FN"), makeSymbol("ACTION-TYPE-HANDLER-FN"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-ACTION-TYPE-KEY"), makeSymbol("_CSETF-ACTION-TYPE-SUMMARY-FN"), makeSymbol("_CSETF-ACTION-TYPE-DISPLAY-FN"), makeSymbol("_CSETF-ACTION-TYPE-HANDLER-FN"));
  public static final SubLSymbol $sym6$PRINT_ACTION_TYPE = makeSymbol("PRINT-ACTION-TYPE");
  public static final SubLSymbol $sym7$ACTION_TYPE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ACTION-TYPE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$ACTION_TYPE_KEY = makeSymbol("ACTION-TYPE-KEY");
  public static final SubLSymbol $sym9$_CSETF_ACTION_TYPE_KEY = makeSymbol("_CSETF-ACTION-TYPE-KEY");
  public static final SubLSymbol $sym10$ACTION_TYPE_SUMMARY_FN = makeSymbol("ACTION-TYPE-SUMMARY-FN");
  public static final SubLSymbol $sym11$_CSETF_ACTION_TYPE_SUMMARY_FN = makeSymbol("_CSETF-ACTION-TYPE-SUMMARY-FN");
  public static final SubLSymbol $sym12$ACTION_TYPE_DISPLAY_FN = makeSymbol("ACTION-TYPE-DISPLAY-FN");
  public static final SubLSymbol $sym13$_CSETF_ACTION_TYPE_DISPLAY_FN = makeSymbol("_CSETF-ACTION-TYPE-DISPLAY-FN");
  public static final SubLSymbol $sym14$ACTION_TYPE_HANDLER_FN = makeSymbol("ACTION-TYPE-HANDLER-FN");
  public static final SubLSymbol $sym15$_CSETF_ACTION_TYPE_HANDLER_FN = makeSymbol("_CSETF-ACTION-TYPE-HANDLER-FN");
  public static final SubLSymbol $kw16$KEY = makeKeyword("KEY");
  public static final SubLSymbol $kw17$SUMMARY_FN = makeKeyword("SUMMARY-FN");
  public static final SubLSymbol $kw18$DISPLAY_FN = makeKeyword("DISPLAY-FN");
  public static final SubLSymbol $kw19$HANDLER_FN = makeKeyword("HANDLER-FN");
  public static final SubLString $str20$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str21$_ = makeString("#");
  public static final SubLString $str22$__ = makeString("#<");
  public static final SubLSymbol $kw23$STREAM = makeKeyword("STREAM");
  public static final SubLSymbol $kw24$BASE = makeKeyword("BASE");
  public static final SubLInteger $int25$64 = makeInteger(64);
  public static final SubLList $list26 = list(makeSymbol("NAME"), makeSymbol("&REST"), makeSymbol("ARGLIST"));
  public static final SubLSymbol $sym27$NEW_ACTION_TYPE = makeUninternedSymbol("NEW-ACTION-TYPE");
  public static final SubLSymbol $sym28$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym29$MAKE_ACTION_TYPE = makeSymbol("MAKE-ACTION-TYPE");
  public static final SubLSymbol $sym30$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym31$CSETF = makeSymbol("CSETF");
  public static final SubLSymbol $sym32$SETHASH = makeSymbol("SETHASH");
  public static final SubLSymbol $sym33$_ACTION_TYPES_BY_KEY_ = makeSymbol("*ACTION-TYPES-BY-KEY*");
  public static final SubLSymbol $sym34$USER_ACTION = makeSymbol("USER-ACTION");
  public static final SubLSymbol $sym35$USER_ACTION_P = makeSymbol("USER-ACTION-P");
  public static final SubLList $list36 = list(makeSymbol("ID-STRING"), makeSymbol("TYPE-KEY"), makeSymbol("CYCLIST"), makeSymbol("CREATION-TIME"), makeSymbol("DATA"));
  public static final SubLList $list37 = list(makeKeyword("ID-STRING"), makeKeyword("TYPE-KEY"), makeKeyword("CYCLIST"), makeKeyword("CREATION-TIME"), makeKeyword("DATA"));
  public static final SubLList $list38 = list(makeSymbol("USER-ACTION-ID-STRING"), makeSymbol("USER-ACTION-TYPE-KEY"), makeSymbol("USER-ACTION-CYCLIST"), makeSymbol("USER-ACTION-CREATION-TIME"), makeSymbol("USER-ACTION-DATA"));
  public static final SubLList $list39 = list(makeSymbol("_CSETF-USER-ACTION-ID-STRING"), makeSymbol("_CSETF-USER-ACTION-TYPE-KEY"), makeSymbol("_CSETF-USER-ACTION-CYCLIST"), makeSymbol("_CSETF-USER-ACTION-CREATION-TIME"), makeSymbol("_CSETF-USER-ACTION-DATA"));
  public static final SubLSymbol $sym40$PRINT_USER_ACTION = makeSymbol("PRINT-USER-ACTION");
  public static final SubLSymbol $sym41$USER_ACTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("USER-ACTION-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym42$USER_ACTION_ID_STRING = makeSymbol("USER-ACTION-ID-STRING");
  public static final SubLSymbol $sym43$_CSETF_USER_ACTION_ID_STRING = makeSymbol("_CSETF-USER-ACTION-ID-STRING");
  public static final SubLSymbol $sym44$USER_ACTION_TYPE_KEY = makeSymbol("USER-ACTION-TYPE-KEY");
  public static final SubLSymbol $sym45$_CSETF_USER_ACTION_TYPE_KEY = makeSymbol("_CSETF-USER-ACTION-TYPE-KEY");
  public static final SubLSymbol $sym46$USER_ACTION_CYCLIST = makeSymbol("USER-ACTION-CYCLIST");
  public static final SubLSymbol $sym47$_CSETF_USER_ACTION_CYCLIST = makeSymbol("_CSETF-USER-ACTION-CYCLIST");
  public static final SubLSymbol $sym48$USER_ACTION_CREATION_TIME = makeSymbol("USER-ACTION-CREATION-TIME");
  public static final SubLSymbol $sym49$_CSETF_USER_ACTION_CREATION_TIME = makeSymbol("_CSETF-USER-ACTION-CREATION-TIME");
  public static final SubLSymbol $sym50$USER_ACTION_DATA = makeSymbol("USER-ACTION-DATA");
  public static final SubLSymbol $sym51$_CSETF_USER_ACTION_DATA = makeSymbol("_CSETF-USER-ACTION-DATA");
  public static final SubLSymbol $kw52$ID_STRING = makeKeyword("ID-STRING");
  public static final SubLSymbol $kw53$TYPE_KEY = makeKeyword("TYPE-KEY");
  public static final SubLSymbol $kw54$CYCLIST = makeKeyword("CYCLIST");
  public static final SubLSymbol $kw55$CREATION_TIME = makeKeyword("CREATION-TIME");
  public static final SubLSymbol $kw56$DATA = makeKeyword("DATA");
  public static final SubLString $str57$User_Actions_Lock = makeString("User Actions Lock");
  public static final SubLSymbol $sym58$NOT_EQ = makeSymbol("NOT-EQ");

  //// Initializers

  public void declareFunctions() {
    declare_user_actions_file();
  }

  public void initializeVariables() {
    init_user_actions_file();
  }

  public void runTopLevelForms() {
    setup_user_actions_file();
  }

}
