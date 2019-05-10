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
//dm import com.cyc.cycjava_1.cycl.agenda;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;

public  final class encapsulation extends SubLTranslatedFile {

  //// Constructor

  private encapsulation() {}
  public static final SubLFile me = new encapsulation();
  public static final String myName = "com.cyc.cycjava_1.cycl.encapsulation";

  //// Definitions

  @SubL(source = "cycl/encapsulation.lisp", position = 708) 
  public static SubLSymbol $encapsulate_method_table$ = null;

  @SubL(source = "cycl/encapsulation.lisp", position = 708) 
  public static final SubLObject encapsulate(SubLObject object) {
    {
      SubLObject method_function = Structures.method_func(object, $encapsulate_method_table$.getGlobalValue());
      if ((NIL != method_function)) {
        return Functions.funcall(method_function, object);
      }
      return object;
    }
  }

  @SubL(source = "cycl/encapsulation.lisp", position = 761) 
  public static final SubLObject encapsulate_cons_method(SubLObject object) {
    return list_utilities.recons(encapsulate(object.first()), encapsulate(object.rest()), object);
  }

  @SubL(source = "cycl/encapsulation.lisp", position = 900) 
  public static final SubLObject encapsulate_constant_method(SubLObject object) {
    return encapsulate_constant(object);
  }

  @SubL(source = "cycl/encapsulation.lisp", position = 1191) 
  public static final SubLObject encapsulate_nart_method(SubLObject object) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30834");
  }

  @SubL(source = "cycl/encapsulation.lisp", position = 1270) 
  public static final SubLObject encapsulate_constant(SubLObject constant) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((NIL == constant_handles.valid_constantP(constant, UNPROVIDED))) {
          Errors.error($str4$Attempt_to_encapsulate_invalid_co, constant);
        }
      }
      {
        SubLObject external_id = constants_high.constant_external_id(constant);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((NIL == constants_high.constant_external_id_p(external_id))) {
            Errors.error($str5$Attempt_to_encapsulate_a_constant, constant);
          }
        }
      }
      {
        SubLObject name = constants_high.constant_name(constant);
        if (($kw6$UNNAMED != name)) {
          if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
            if ((!(name.isString()))) {
              Errors.error($str7$Attempt_to_encapsulate_a_constant, constant, name);
            }
          }
        }
      }
      return encapsulate_constant_internal(constant);
    }
  }

  @SubL(source = "cycl/encapsulation.lisp", position = 2116) 
  public static final SubLObject encapsulate_constant_internal(SubLObject constant) {
    {
      SubLObject external_id = constants_high.constant_external_id(constant);
      SubLObject name = constants_high.constant_name(constant);
      SubLObject v_encapsulation = list($kw9$HP, name, external_id);
      return v_encapsulation;
    }
  }

  /** Do we believe the names when the ids fail to match? */
  @SubL(source = "cycl/encapsulation.lisp", position = 2524) 
  public static SubLSymbol $unencapsulate_believe_names$ = null;

  @SubL(source = "cycl/encapsulation.lisp", position = 4021) 
  private static SubLSymbol $unencapsulated_common_symbols$ = null;

  @SubL(source = "cycl/encapsulation.lisp", position = 5340) 
  private static SubLSymbol $unencapsulate_constant_via_name_optimizationP$ = null;

  @SubL(source = "cycl/encapsulation.lisp", position = 6049) 
  private static SubLSymbol $unencapsulate_find_constant_lookaside_table$ = null;

  @SubL(source = "cycl/encapsulation.lisp", position = 6120) 
  private static SubLSymbol $unencapsulate_find_constant_capacity$ = null;

  public static final SubLObject declare_encapsulation_file() {
    declareFunction(myName, "encapsulate", "ENCAPSULATE", 1, 0, false);
    declareFunction(myName, "encapsulate_cons_method", "ENCAPSULATE-CONS-METHOD", 1, 0, false);
    declareFunction(myName, "encapsulate_constant_method", "ENCAPSULATE-CONSTANT-METHOD", 1, 0, false);
    declareFunction(myName, "encapsulate_nart_method", "ENCAPSULATE-NART-METHOD", 1, 0, false);
    declareFunction(myName, "encapsulate_constant", "ENCAPSULATE-CONSTANT", 1, 0, false);
    declareFunction(myName, "encapsulate_nart", "ENCAPSULATE-NART", 1, 0, false);
    declareFunction(myName, "encapsulate_constant_internal", "ENCAPSULATE-CONSTANT-INTERNAL", 1, 0, false);
    declareFunction(myName, "encapsulate_nart_internal", "ENCAPSULATE-NART-INTERNAL", 1, 0, false);
    declareFunction(myName, "unencapsulate", "UNENCAPSULATE", 1, 0, false);
    declareFunction(myName, "unencapsulate_partial", "UNENCAPSULATE-PARTIAL", 1, 0, false);
    declareFunction(myName, "unencapsulate_internal", "UNENCAPSULATE-INTERNAL", 2, 0, false);
    declareFunction(myName, "unencapsulate_token_equal_p", "UNENCAPSULATE-TOKEN-EQUAL-P", 2, 0, false);
    declareFunction(myName, "unencapsulate_common_symbol", "UNENCAPSULATE-COMMON-SYMBOL", 1, 0, false);
    declareFunction(myName, "unencapsulate_cons", "UNENCAPSULATE-CONS", 2, 0, false);
    declareFunction(myName, "unencapsulate_constant_marker", "UNENCAPSULATE-CONSTANT-MARKER", 2, 0, false);
    declareFunction(myName, "unencapsulate_constant_marker_int", "UNENCAPSULATE-CONSTANT-MARKER-INT", 2, 0, false);
    declareFunction(myName, "unencapsulate_find_constant", "UNENCAPSULATE-FIND-CONSTANT", 1, 0, false);
    declareFunction(myName, "unencapsulate_nart_marker", "UNENCAPSULATE-NART-MARKER", 2, 0, false);
    declareFunction(myName, "handle_unencapsulate_constant_problem", "HANDLE-UNENCAPSULATE-CONSTANT-PROBLEM", 2, 0, false);
    declareFunction(myName, "handle_unencapsulate_unnamed_constant_problem", "HANDLE-UNENCAPSULATE-UNNAMED-CONSTANT-PROBLEM", 2, 0, false);
    declareFunction(myName, "handle_unencapsulate_nart_problem", "HANDLE-UNENCAPSULATE-NART-PROBLEM", 2, 0, false);
    declareFunction(myName, "handle_unencapsulation_error", "HANDLE-UNENCAPSULATION-ERROR", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_encapsulation_file() {
    $encapsulate_method_table$ = deflexical("*ENCAPSULATE-METHOD-TABLE*", Vectors.make_vector($int0$256, NIL));
    $unencapsulate_believe_names$ = defparameter("*UNENCAPSULATE-BELIEVE-NAMES*", NIL);
    $unencapsulated_common_symbols$ = deflexical("*UNENCAPSULATED-COMMON-SYMBOLS*", $list11);
    $unencapsulate_constant_via_name_optimizationP$ = defparameter("*UNENCAPSULATE-CONSTANT-VIA-NAME-OPTIMIZATION?*", NIL);
    $unencapsulate_find_constant_lookaside_table$ = deflexical("*UNENCAPSULATE-FIND-CONSTANT-LOOKASIDE-TABLE*", maybeDefault( $sym13$_UNENCAPSULATE_FIND_CONSTANT_LOOKASIDE_TABLE_, $unencapsulate_find_constant_lookaside_table$, NIL));
    $unencapsulate_find_constant_capacity$ = deflexical("*UNENCAPSULATE-FIND-CONSTANT-CAPACITY*", TWENTY_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_encapsulation_file() {
    // CVS_ID("Id: encapsulation.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method($encapsulate_method_table$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function($sym1$ENCAPSULATE_CONS_METHOD));
    Structures.register_method($encapsulate_method_table$.getGlobalValue(), constant_handles.$dtp_constant$.getGlobalValue(), Symbols.symbol_function($sym2$ENCAPSULATE_CONSTANT_METHOD));
    Structures.register_method($encapsulate_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), Symbols.symbol_function($sym3$ENCAPSULATE_NART_METHOD));
    subl_macro_promotions.declare_defglobal($sym13$_UNENCAPSULATE_FIND_CONSTANT_LOOKASIDE_TABLE_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLInteger $int0$256 = makeInteger(256);
  public static final SubLSymbol $sym1$ENCAPSULATE_CONS_METHOD = makeSymbol("ENCAPSULATE-CONS-METHOD");
  public static final SubLSymbol $sym2$ENCAPSULATE_CONSTANT_METHOD = makeSymbol("ENCAPSULATE-CONSTANT-METHOD");
  public static final SubLSymbol $sym3$ENCAPSULATE_NART_METHOD = makeSymbol("ENCAPSULATE-NART-METHOD");
  public static final SubLString $str4$Attempt_to_encapsulate_invalid_co = makeString("Attempt to encapsulate invalid constant ~S.");
  public static final SubLString $str5$Attempt_to_encapsulate_a_constant = makeString("Attempt to encapsulate a constant ~S with an invalid external ID.");
  public static final SubLSymbol $kw6$UNNAMED = makeKeyword("UNNAMED");
  public static final SubLString $str7$Attempt_to_encapsulate_a_constant = makeString("Attempt to encapsulate a constant ~S with a non-string name ~S.");
  public static final SubLString $str8$Attempt_to_encapsulate_the_NART__ = makeString("Attempt to encapsulate the NART ~S with an invalid HL formula ~S.");
  public static final SubLSymbol $kw9$HP = makeKeyword("HP");
  public static final SubLSymbol $kw10$NAT = makeKeyword("NAT");
  public static final SubLList $list11 = list(list(makeSymbol("MONOTONIC"), makeKeyword("MONOTONIC")), list(makeSymbol("DEFAULT"), makeKeyword("DEFAULT")), list(makeSymbol("FORWARD"), makeKeyword("FORWARD")), list(makeSymbol("BACKWARD"), makeKeyword("BACKWARD")), list(makeSymbol("CODE"), makeKeyword("CODE")));
  public static final SubLList $list12 = list(makeSymbol("HP"), makeSymbol("NAME-SPEC"), makeSymbol("EXTERNAL-ID"));
  public static final SubLSymbol $sym13$_UNENCAPSULATE_FIND_CONSTANT_LOOKASIDE_TABLE_ = makeSymbol("*UNENCAPSULATE-FIND-CONSTANT-LOOKASIDE-TABLE*");
  public static final SubLList $list14 = list(makeSymbol("NAT"), makeSymbol("NART-HL-FORMULA-SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("ID"));
  public static final SubLSymbol $kw15$IGNORE = makeKeyword("IGNORE");
  public static final SubLString $str16$__Last_operation___S___This_objec = makeString("~%Last operation: ~S ~%This object did not yield a term: ~S");
  public static final SubLString $str17$Skip_this_operation = makeString("Skip this operation");
  public static final SubLString $str18$_S_did_not_yield_a_term = makeString("~S did not yield a term");
  public static final SubLSymbol $kw19$UNENCAPSULATION_ERROR = makeKeyword("UNENCAPSULATION-ERROR");

  //// Initializers

  public void declareFunctions() {
    declare_encapsulation_file();
  }

  public void initializeVariables() {
    init_encapsulation_file();
  }

  public void runTopLevelForms() {
    setup_encapsulation_file();
  }

}
