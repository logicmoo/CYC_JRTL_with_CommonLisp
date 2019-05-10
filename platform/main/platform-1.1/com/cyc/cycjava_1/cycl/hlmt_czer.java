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

package  com.cyc.cycjava_1.cycl;

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


import com.cyc.cycjava_1.cycl.access_macros;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.czer_main;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.hlmt;
import com.cyc.cycjava_1.cycl.kb_control_vars;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.mt_vars;
import com.cyc.cycjava_1.cycl.precanonicalizer;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.wff_macros;

public  final class hlmt_czer extends SubLTranslatedFile {

  //// Constructor

  private hlmt_czer() {}
  public static final SubLFile me = new hlmt_czer();
  public static final String myName = "com.cyc.cycjava_1.cycl.hlmt_czer";

  //// Definitions

  /** Returns the mt that MT denotes, in a canonical form.
   Will reify the monad if it is a closed nat.
   Returns NIL if MT is ill-formed. */
  @SubL(source = "cycl/hlmt-czer.lisp", position = 921) 
  public static final SubLObject canonicalize_hlmt(SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(mt, $sym0$POSSIBLY_MT_P);
      thread.resetMultipleValues();
      {
        SubLObject new_mt = precanonicalizer.safe_precanonicalizations(mt, $const1$BaseKB);
        SubLObject dummy_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        mt = new_mt;
      }
      if ((NIL != mt)) {
        mt = hlmt.reduce_hlmt(mt, control_vars.within_queryP());
        mt = cycl_utilities.reify_when_closed_naut(mt);
        if ((NIL != kb_control_vars.within_forward_inferenceP())) {
          if ((NIL == wff_macros.within_wffP())) {
            if ((NIL != el_utilities.possibly_naut_p(hlmt.hlmt_monad_mt(mt)))) {
              if ((NIL != list_utilities.tree_find_if(Symbols.symbol_function($sym2$SKOLEMIZE_FORWARD_), hlmt.hlmt_monad_mt(mt), UNPROVIDED))) {
                mt = czer_main.canonicalize_term(mt, mt_vars.$mt_mt$.getGlobalValue());
              }
            }
          }
        }
        mt = canonicalize_hlmt_int(mt);
      }
      return mt;
    }
  }

  @SubL(source = "cycl/hlmt-czer.lisp", position = 2291) 
  public static final SubLObject canonicalize_hlmt_int(SubLObject v_hlmt) {
    if ((NIL != hlmt.mt_space_naut_p(v_hlmt))) {
      {
        SubLObject dimensions = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12283");
        dimensions = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32149");
        v_hlmt = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12326");
      }
    }
    if (((NIL != control_vars.within_assertP())
         && (NIL != hlmt.hlmt_with_anytime_psc_p(v_hlmt)))) {
      v_hlmt = NIL;
    }
    return v_hlmt;
  }

  public static final SubLObject declare_hlmt_czer_file() {
    declareFunction(myName, "canonicalize_hlmt", "CANONICALIZE-HLMT", 1, 0, false);
    declareFunction(myName, "coerce_to_hlmt", "COERCE-TO-HLMT", 1, 0, false);
    declareFunction(myName, "canonicalize_hlmt_int", "CANONICALIZE-HLMT-INT", 1, 0, false);
    declareFunction(myName, "sort_hlmt_dimensions", "SORT-HLMT-DIMENSIONS", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_hlmt_czer_file() {
    return NIL;
  }

  public static final SubLObject setup_hlmt_czer_file() {
    // CVS_ID("Id: hlmt-czer.lisp 128779 2009-09-16 15:24:48Z pace ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$POSSIBLY_MT_P = makeSymbol("POSSIBLY-MT-P");
  public static final SubLObject $const1$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));
  public static final SubLSymbol $sym2$SKOLEMIZE_FORWARD_ = makeSymbol("SKOLEMIZE-FORWARD?");
  public static final SubLSymbol $sym3$HLMT_ = makeSymbol("HLMT?");
  public static final SubLSymbol $sym4$SINGLE_DIMENSION_MT_DIMENSION = makeSymbol("SINGLE-DIMENSION-MT-DIMENSION");

  //// Initializers

  public void declareFunctions() {
    declare_hlmt_czer_file();
  }

  public void initializeVariables() {
    init_hlmt_czer_file();
  }

  public void runTopLevelForms() {
    setup_hlmt_czer_file();
  }

}
