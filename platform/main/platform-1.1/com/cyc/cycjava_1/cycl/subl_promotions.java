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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.os_process_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.tcp_server_utilities;

public  final class subl_promotions extends SubLTranslatedFile {

  //// Constructor

  private subl_promotions() {}
  public static final SubLFile me = new subl_promotions();
  public static final String myName = "com.cyc.cycjava_1.cycl.subl_promotions";

  //// Definitions

  /** Storage point for arguments passed to threads created by MAKE-PROCESS-WITH-ARGS */
  @SubL(source = "cycl/subl-promotions.lisp", position = 827) 
  private static SubLSymbol $make_process_with_args_table$ = null;

  /** Lock controlling access to *MAKE-PROCESS-WITH-ARGS-TABLE* */
  @SubL(source = "cycl/subl-promotions.lisp", position = 1051) 
  private static SubLSymbol $make_process_with_args_table_lock$ = null;

  /** Storage point for arguments passed to threads interrupted by INTERRUPT-PROCESS-WITH-ARGS */
  @SubL(source = "cycl/subl-promotions.lisp", position = 2383) 
  private static SubLSymbol $interrupt_process_with_args_table$ = null;

  /** Lock controlling access to *INTERRUPT-PROCESS-WITH-ARGS-TABLE* */
  @SubL(source = "cycl/subl-promotions.lisp", position = 2637) 
  private static SubLSymbol $interrupt_process_with_args_table_lock$ = null;

  /** Return the elements of LIST as multiple values. */
  @SubL(source = "cycl/subl-promotions.lisp", position = 5710) 
  public static final SubLObject values_list(SubLObject list) {
    return Functions.apply(Symbols.symbol_function($sym20$VALUES), list);
  }

  /** Return T iff OBJECT is a symbol with a function definition. */
  @SubL(source = "cycl/subl-promotions.lisp", position = 5986) 
  public static final SubLObject function_symbol_p(SubLObject object) {
    return makeBoolean((object.isSymbol()
           && (NIL != Symbols.fboundp(object))
           && Symbols.symbol_function(object).isFunction()));
  }

  /** Return the arglist of FUNCTION-SYMBOL */
  @SubL(source = "cycl/subl-promotions.lisp", position = 6268) 
  public static final SubLObject function_symbol_arglist(SubLObject function_symbol) {
    checkType(function_symbol, $sym21$FUNCTION_SYMBOL_P);
    return Functions.funcall($sym22$ARGLIST, function_symbol);
  }

  /** Like SUBLIS except ALIST is interpreted as (VALUE . KEY) pairs. */
  @SubL(source = "cycl/subl-promotions.lisp", position = 6631) 
  public static final SubLObject rsublis(SubLObject alist, SubLObject tree, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    checkType(test, $sym3$FUNCTION_SPEC_P);
    checkType(key, $sym3$FUNCTION_SPEC_P);
    if ((Symbols.symbol_function(IDENTITY) != key)) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12400");
    } else if ((Symbols.symbol_function(EQL) != test)) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12397");
    } else {
      return rsublis_2(alist, tree);
    }
  }

  /** Like NSUBLIS except ALIST is interpreted as (VALUE . KEY) pairs. */
  @SubL(source = "cycl/subl-promotions.lisp", position = 7133) 
  public static final SubLObject nrsublis(SubLObject alist, SubLObject tree, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    checkType(test, $sym3$FUNCTION_SPEC_P);
    checkType(key, $sym3$FUNCTION_SPEC_P);
    if ((Symbols.symbol_function(IDENTITY) != key)) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12384");
    } else if ((Symbols.symbol_function(EQL) != test)) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12381");
    } else {
      return nrsublis_2(alist, tree);
    }
  }

  @SubL(source = "cycl/subl-promotions.lisp", position = 7579) 
  public static final SubLObject rsublis_2(SubLObject alist, SubLObject tree) {
    {
      SubLObject cdolist_list_var = alist;
      SubLObject entry = NIL;
      for (entry = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), entry = cdolist_list_var.first()) {
        if ((NIL != entry)) {
          if (entry.rest().eql(tree)) {
            return entry.first();
          }
        }
      }
    }
    if (tree.isAtom()) {
      return tree;
    } else {
      {
        SubLObject tree_car = tree.first();
        SubLObject tree_cdr = tree.rest();
        SubLObject new_car = rsublis_2(alist, tree_car);
        SubLObject new_cdr = rsublis_2(alist, tree_cdr);
        return list_utilities.recons(new_car, new_cdr, tree);
      }
    }
  }

  @SubL(source = "cycl/subl-promotions.lisp", position = 7976) 
  public static final SubLObject nrsublis_2(SubLObject alist, SubLObject tree) {
    {
      SubLObject cdolist_list_var = alist;
      SubLObject entry = NIL;
      for (entry = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), entry = cdolist_list_var.first()) {
        if ((NIL != entry)) {
          if (entry.rest().eql(tree)) {
            return entry.first();
          }
        }
      }
    }
    if (tree.isAtom()) {
      return tree;
    } else {
      {
        SubLObject tree_car = tree.first();
        SubLObject tree_cdr = tree.rest();
        SubLObject new_car = nrsublis_2(alist, tree_car);
        SubLObject new_cdr = nrsublis_2(alist, tree_cdr);
        return list_utilities.ncons(new_car, new_cdr, tree);
      }
    }
  }

  /** Funcall FUNC on ARG1.
   FUNC must specify a function that takes exactly 1 argument. */
  @SubL(source = "cycl/subl-promotions.lisp", position = 11637) 
  public static final SubLObject funcall_1(SubLObject func, SubLObject arg1) {
    return Functions.funcall(func, arg1);
  }

  /** Funcall FUNC on ARG1 and ARG2.
   FUNC must specify a function that takes exactly 2 arguments. */
  @SubL(source = "cycl/subl-promotions.lisp", position = 11833) 
  public static final SubLObject funcall_2(SubLObject func, SubLObject arg1, SubLObject arg2) {
    return Functions.funcall(func, arg1, arg2);
  }

  /** Return the number of elapsed seconds from the current time to PAST-TIME.
   If non-nil, CURRENT-TIME is used as the current time. */
  @SubL(source = "cycl/subl-promotions.lisp", position = 12531) 
  public static final SubLObject elapsed_universal_time(SubLObject past_time, SubLObject current_time) {
    if ((current_time == UNPROVIDED)) {
      current_time = NIL;
    }
    if ((NIL == current_time)) {
      current_time = Time.get_universal_time();
    }
    return Numbers.subtract(current_time, past_time);
  }

  /** @param PATHNAME; stringp
   @return stringp
   Convert PATHNAME to a physical pathname (performing any logical pathname translations) */
  @SubL(source = "cycl/subl-promotions.lisp", position = 14058) 
  public static final SubLObject ensure_physical_pathname(SubLObject pathname) {
    checkType(pathname, $sym2$STRINGP);
    {
      SubLObject result = pathname;
      return result;
    }
  }

  @SubL(source = "cycl/subl-promotions.lisp", position = 14617) 
  public static final SubLObject memberP(SubLObject item, SubLObject list, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    return makeBoolean((NIL != Sequences.position(item, list, test, key, UNPROVIDED, UNPROVIDED)));
  }

  /** Return T iff OBJECT is an integer > 0 */
  @SubL(source = "cycl/subl-promotions.lisp", position = 14813) 
  public static final SubLObject positive_integer_p(SubLObject object) {
    return makeBoolean((object.isInteger()
           && object.isPositive()));
  }

  /** Return T iff OBJECT is an integer >= 0 */
  @SubL(source = "cycl/subl-promotions.lisp", position = 15117) 
  public static final SubLObject non_negative_integer_p(SubLObject object) {
    return makeBoolean((object.isInteger()
           && (!(object.isNegative()))));
  }

  public static final class $non_negative_integer_p$UnaryFunction extends UnaryFunction {
    public $non_negative_integer_p$UnaryFunction() { super(extractFunctionNamed("NON-NEGATIVE-INTEGER-P")); }
    public SubLObject processItem(SubLObject arg1) { return non_negative_integer_p(arg1); }
  }

  public static final SubLObject declare_subl_promotions_file() {
    //declareFunction(myName, "make_process_with_args", "MAKE-PROCESS-WITH-ARGS", 2, 1, false);
    //declareFunction(myName, "make_process_with_args_internal", "MAKE-PROCESS-WITH-ARGS-INTERNAL", 0, 0, false);
    //declareFunction(myName, "interrupt_process_with_args", "INTERRUPT-PROCESS-WITH-ARGS", 2, 1, false);
    //declareFunction(myName, "interrupt_process_with_args_internal", "INTERRUPT-PROCESS-WITH-ARGS-INTERNAL", 0, 0, false);
    //declareFunction(myName, "open_tcp_stream_with_timeout", "OPEN-TCP-STREAM-WITH-TIMEOUT", 2, 2, false);
    //declareFunction(myName, "open_tcp_stream_with_access", "OPEN-TCP-STREAM-WITH-ACCESS", 2, 1, false);
    //declareFunction(myName, "stream_access_mode_p", "STREAM-ACCESS-MODE-P", 1, 0, false);
    declareFunction(myName, "values_list", "VALUES-LIST", 1, 0, false);
    declareFunction(myName, "function_symbol_p", "FUNCTION-SYMBOL-P", 1, 0, false);
    declareFunction(myName, "function_symbol_arglist", "FUNCTION-SYMBOL-ARGLIST", 1, 0, false);
    declareFunction(myName, "rsublis", "RSUBLIS", 2, 2, false);
    declareFunction(myName, "nrsublis", "NRSUBLIS", 2, 2, false);
    declareFunction(myName, "rsublis_2", "RSUBLIS-2", 2, 0, false);
    declareFunction(myName, "nrsublis_2", "NRSUBLIS-2", 2, 0, false);
    //declareFunction(myName, "rsublis_3", "RSUBLIS-3", 3, 0, false);
    //declareFunction(myName, "nrsublis_3", "NRSUBLIS-3", 3, 0, false);
    //declareFunction(myName, "rsublis_4", "RSUBLIS-4", 4, 0, false);
    //declareFunction(myName, "nrsublis_4", "NRSUBLIS-4", 4, 0, false);
    //declareFunction(myName, "initial_process", "INITIAL-PROCESS", 0, 0, false);
    //declareFunction(myName, "set_elt", "SET-ELT", 3, 0, false);
    //declareFunction(myName, "funcall_0", "FUNCALL-0", 1, 0, false);
    declareFunction(myName, "funcall_1", "FUNCALL-1", 2, 0, false);
    declareFunction(myName, "funcall_2", "FUNCALL-2", 3, 0, false);
    //declareFunction(myName, "funcall_3", "FUNCALL-3", 4, 0, false);
    //declareFunction(myName, "funcall_4", "FUNCALL-4", 5, 0, false);
    declareFunction(myName, "elapsed_universal_time", "ELAPSED-UNIVERSAL-TIME", 1, 1, false);
    //declareFunction(myName, "copy_file", "COPY-FILE", 2, 0, false);
    declareFunction(myName, "ensure_physical_pathname", "ENSURE-PHYSICAL-PATHNAME", 1, 0, false);
    declareFunction(myName, "memberP", "MEMBER?", 2, 2, false);
    declareFunction(myName, "positive_integer_p", "POSITIVE-INTEGER-P", 1, 0, false);
    declareFunction(myName, "non_negative_integer_p", "NON-NEGATIVE-INTEGER-P", 1, 0, false); new $non_negative_integer_p$UnaryFunction();
    //declareFunction(myName, "non_positive_integer_p", "NON-POSITIVE-INTEGER-P", 1, 0, false);
    //declareFunction(myName, "negative_integer_p", "NEGATIVE-INTEGER-P", 1, 0, false);
    //declareFunction(myName, "non_zero_integer_p", "NON-ZERO-INTEGER-P", 1, 0, false);
    //declareFunction(myName, "tcp_stream_remote_hostname", "TCP-STREAM-REMOTE-HOSTNAME", 1, 0, false);
    //declareFunction(myName, "tcp_stream_remote_address", "TCP-STREAM-REMOTE-ADDRESS", 1, 0, false);
    //declareFunction(myName, "global_initialization_type", "GLOBAL-INITIALIZATION-TYPE", 1, 0, false);
    //declareFunction(myName, "initialization_type_p", "INITIALIZATION-TYPE-P", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_subl_promotions_file() {
    $make_process_with_args_table$ = deflexical("*MAKE-PROCESS-WITH-ARGS-TABLE*", maybeDefault( $sym0$_MAKE_PROCESS_WITH_ARGS_TABLE_, $make_process_with_args_table$, NIL));
    $make_process_with_args_table_lock$ = deflexical("*MAKE-PROCESS-WITH-ARGS-TABLE-LOCK*", Locks.make_lock($str1$MAKE_PROCESS_WITH_ARGS_TABLE));
    $interrupt_process_with_args_table$ = deflexical("*INTERRUPT-PROCESS-WITH-ARGS-TABLE*", maybeDefault( $sym8$_INTERRUPT_PROCESS_WITH_ARGS_TABLE_, $interrupt_process_with_args_table$, NIL));
    $interrupt_process_with_args_table_lock$ = deflexical("*INTERRUPT-PROCESS-WITH-ARGS-TABLE-LOCK*", Locks.make_lock($str9$INTERRUPT_PROCESS_WITH_ARGS_TABLE));
    return NIL;
  }

  public static final SubLObject setup_subl_promotions_file() {
    // CVS_ID("Id: subl-promotions.lisp 128498 2009-08-05 22:38:47Z daves ");
    subl_macro_promotions.declare_defglobal($sym0$_MAKE_PROCESS_WITH_ARGS_TABLE_);
    subl_macro_promotions.declare_defglobal($sym8$_INTERRUPT_PROCESS_WITH_ARGS_TABLE_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_MAKE_PROCESS_WITH_ARGS_TABLE_ = makeSymbol("*MAKE-PROCESS-WITH-ARGS-TABLE*");
  public static final SubLString $str1$MAKE_PROCESS_WITH_ARGS_TABLE = makeString("MAKE-PROCESS-WITH-ARGS-TABLE");
  public static final SubLSymbol $sym2$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym3$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym4$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym5$MAKE_PROCESS_WITH_ARGS_INTERNAL = makeSymbol("MAKE-PROCESS-WITH-ARGS-INTERNAL");
  public static final SubLString $str6$Unable_to_get_make_process_args_f = makeString("Unable to get make-process args for ~S");
  public static final SubLList $list7 = list(makeSymbol("PROCESS"), makeSymbol("FUNCTION"), makeSymbol("ARGS"));
  public static final SubLSymbol $sym8$_INTERRUPT_PROCESS_WITH_ARGS_TABLE_ = makeSymbol("*INTERRUPT-PROCESS-WITH-ARGS-TABLE*");
  public static final SubLString $str9$INTERRUPT_PROCESS_WITH_ARGS_TABLE = makeString("INTERRUPT-PROCESS-WITH-ARGS-TABLE");
  public static final SubLSymbol $sym10$PROCESSP = makeSymbol("PROCESSP");
  public static final SubLSymbol $sym11$INTERRUPT_PROCESS_WITH_ARGS_INTERNAL = makeSymbol("INTERRUPT-PROCESS-WITH-ARGS-INTERNAL");
  public static final SubLString $str12$Unable_to_get_interrupt_process_a = makeString("Unable to get interrupt-process args for ~S");
  public static final SubLSymbol $kw13$PUBLIC = makeKeyword("PUBLIC");
  public static final SubLSymbol $sym14$NON_NEGATIVE_NUMBER_P = makeSymbol("NON-NEGATIVE-NUMBER-P");
  public static final SubLSymbol $sym15$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLString $str16$_A = makeString("~A");
  public static final SubLSymbol $sym17$STREAM_ACCESS_MODE_P = makeSymbol("STREAM-ACCESS-MODE-P");
  public static final SubLSymbol $kw18$PRIVATE = makeKeyword("PRIVATE");
  public static final SubLList $list19 = list(makeKeyword("PUBLIC"), makeKeyword("PRIVATE"));
  public static final SubLSymbol $sym20$VALUES = makeSymbol("VALUES");
  public static final SubLSymbol $sym21$FUNCTION_SYMBOL_P = makeSymbol("FUNCTION-SYMBOL-P");
  public static final SubLSymbol $sym22$ARGLIST = makeSymbol("ARGLIST", "SUBLISP");
  public static final SubLSymbol $sym23$SEQUENCEP = makeSymbol("SEQUENCEP");
  public static final SubLString $str24$cp = makeString("cp");
  public static final SubLString $str25$_p = makeString("-p");
  public static final SubLSymbol $kw26$INPUT = makeKeyword("INPUT");
  public static final SubLString $str27$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLSymbol $kw28$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLSymbol $kw29$EOF = makeKeyword("EOF");
  public static final SubLList $list30 = list(makeSymbol("SIGN"), makeSymbol("B0"), makeSymbol("B1"), makeSymbol("B2"), makeSymbol("B3"), makeSymbol("&OPTIONAL"), makeSymbol("B4"), makeSymbol("B5"));
  public static final SubLString $str31$_D__D__D__D__D__D = makeString("~D.~D.~D.~D.~D.~D");
  public static final SubLString $str32$_D__D__D__D = makeString("~D.~D.~D.~D");
  public static final SubLSymbol $kw33$INITIALIZATION_TYPE = makeKeyword("INITIALIZATION-TYPE");
  public static final SubLSymbol $kw34$UNSPECIFIED = makeKeyword("UNSPECIFIED");
  public static final SubLList $list35 = list(makeKeyword("INITIALIZER"), makeKeyword("WORLD"));

  //// Initializers

  public void declareFunctions() {
    declare_subl_promotions_file();
  }

  public void initializeVariables() {
    init_subl_promotions_file();
  }

  public void runTopLevelForms() {
    setup_subl_promotions_file();
  }

}
