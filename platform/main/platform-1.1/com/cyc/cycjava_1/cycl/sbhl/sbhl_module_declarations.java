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

package com.cyc.cycjava_1.cycl.sbhl;
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
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.mt_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class sbhl_module_declarations extends SubLTranslatedFile {

  //// Constructor

  private sbhl_module_declarations() {}
  public static final SubLFile me = new sbhl_module_declarations();
  public static final String myName = "com.cyc.cycjava_1.cycl.sbhl.sbhl_module_declarations";

  //// Definitions

  @SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 550) 
  public static final SubLObject initialize_genls_module() {
    sbhl_module_utilities.init_sbhl_module_data($const0$genls, list(new SubLObject[] {list($kw1$LINK_PRED, $const0$genls), list($kw2$LINK_STYLE, $const3$DirectedMultigraph), list($kw4$NAUT_FORWARD_TRUE_GENERATORS, $list5), list($kw6$MODULE_TYPE, $kw7$SIMPLE_REFLEXIVE), list($kw8$TYPE_TEST, $sym9$COLLECTION_P), list($kw10$DISJOINS_MODULE, $const11$disjointWith), list($kw12$PATH_TERMINATING_MARK__FN, $sym13$SBHL_MARKED_P), list($kw14$MARKING_FN, $sym15$SET_SBHL_MARKING_STATE_TO_MARKED), list($kw16$UNMARKING_FN, $sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED), list($kw18$ROOT, $const19$Thing), list($kw20$INDEX_ARG, ONE_INTEGER)}));
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 1292) 
  public static final SubLObject initialize_disjoint_with_module() {
    sbhl_module_utilities.init_sbhl_module_data($const11$disjointWith, list(new SubLObject[] {list($kw1$LINK_PRED, $const11$disjointWith), list($kw2$LINK_STYLE, $const21$Multigraph), list($kw6$MODULE_TYPE, $kw22$DISJOINS), list($kw8$TYPE_TEST, $sym9$COLLECTION_P), list($kw12$PATH_TERMINATING_MARK__FN, $sym13$SBHL_MARKED_P), list($kw14$MARKING_FN, $sym15$SET_SBHL_MARKING_STATE_TO_MARKED), list($kw16$UNMARKING_FN, $sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED), list($kw20$INDEX_ARG, ONE_INTEGER), list($kw23$TRANSFERS_THROUGH_MODULE, $const0$genls), list($kw24$TRANSFERS_VIA_ARG, ONE_INTEGER)}));
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 1914) 
  public static final SubLObject initialize_isa_module() {
    sbhl_module_utilities.init_sbhl_module_data($const25$isa, list(new SubLObject[] {list($kw1$LINK_PRED, $const25$isa), list($kw2$LINK_STYLE, $const3$DirectedMultigraph), list($kw4$NAUT_FORWARD_TRUE_GENERATORS, $list26), list($kw6$MODULE_TYPE, $kw27$TRANSFERS_THROUGH), list($kw12$PATH_TERMINATING_MARK__FN, $sym13$SBHL_MARKED_P), list($kw14$MARKING_FN, $sym15$SET_SBHL_MARKING_STATE_TO_MARKED), list($kw16$UNMARKING_FN, $sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED), list($kw20$INDEX_ARG, ONE_INTEGER), list($kw23$TRANSFERS_THROUGH_MODULE, $const0$genls), list($kw24$TRANSFERS_VIA_ARG, TWO_INTEGER)}));
    sbhl_link_methods.initialize_isa_arg2_naut_table();
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 2696) 
  public static final SubLObject initialize_quoted_isa_module() {
    sbhl_module_utilities.init_sbhl_module_data($const28$quotedIsa, list(new SubLObject[] {list($kw1$LINK_PRED, $const28$quotedIsa), list($kw2$LINK_STYLE, $const3$DirectedMultigraph), list($kw4$NAUT_FORWARD_TRUE_GENERATORS, $list29), list($kw6$MODULE_TYPE, $kw27$TRANSFERS_THROUGH), list($kw12$PATH_TERMINATING_MARK__FN, $sym13$SBHL_MARKED_P), list($kw14$MARKING_FN, $sym15$SET_SBHL_MARKING_STATE_TO_MARKED), list($kw16$UNMARKING_FN, $sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED), list($kw20$INDEX_ARG, ONE_INTEGER), list($kw23$TRANSFERS_THROUGH_MODULE, $const0$genls), list($kw24$TRANSFERS_VIA_ARG, TWO_INTEGER)}));
    sbhl_link_methods.initialize_quoted_isa_arg2_naut_table();
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 3413) 
  public static final SubLObject initialize_genl_mt_module() {
    sbhl_module_utilities.init_sbhl_module_data($const30$genlMt, list(new SubLObject[] {list($kw1$LINK_PRED, $const30$genlMt), list($kw2$LINK_STYLE, $const3$DirectedMultigraph), list($kw4$NAUT_FORWARD_TRUE_GENERATORS, $list31), list($kw6$MODULE_TYPE, $kw7$SIMPLE_REFLEXIVE), list($kw8$TYPE_TEST, $sym32$MICROTHEORY_P), list($kw10$DISJOINS_MODULE, $const33$negationMt), list($kw12$PATH_TERMINATING_MARK__FN, $sym13$SBHL_MARKED_P), list($kw14$MARKING_FN, $sym15$SET_SBHL_MARKING_STATE_TO_MARKED), list($kw16$UNMARKING_FN, $sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED), list($kw18$ROOT, mt_vars.$mt_root$.getGlobalValue()), list($kw20$INDEX_ARG, ONE_INTEGER)}));
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 4079) 
  public static final SubLObject initialize_negation_mt_module() {
    sbhl_module_utilities.init_sbhl_module_data($const33$negationMt, list(new SubLObject[] {list($kw1$LINK_PRED, $const33$negationMt), list($kw2$LINK_STYLE, $const21$Multigraph), list($kw6$MODULE_TYPE, $kw22$DISJOINS), list($kw8$TYPE_TEST, $sym32$MICROTHEORY_P), list($kw12$PATH_TERMINATING_MARK__FN, $sym13$SBHL_MARKED_P), list($kw14$MARKING_FN, $sym15$SET_SBHL_MARKING_STATE_TO_MARKED), list($kw16$UNMARKING_FN, $sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED), list($kw20$INDEX_ARG, ONE_INTEGER), list($kw23$TRANSFERS_THROUGH_MODULE, $const30$genlMt), list($kw24$TRANSFERS_VIA_ARG, ONE_INTEGER)}));
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 4692) 
  public static final SubLObject initialize_genl_preds_module() {
    sbhl_module_utilities.init_sbhl_module_data($const34$genlPreds, list(new SubLObject[] {list($kw1$LINK_PRED, $const34$genlPreds), list($kw2$LINK_STYLE, $const3$DirectedMultigraph), list($kw6$MODULE_TYPE, $kw7$SIMPLE_REFLEXIVE), list($kw8$TYPE_TEST, $sym35$PREDICATE_P), list($kw10$DISJOINS_MODULE, $const36$negationPreds), list($kw37$MODULE_INVERTS_ARGUMENTS, $const38$genlInverse), list($kw12$PATH_TERMINATING_MARK__FN, $sym39$SBHL_PREDICATE_PATH_TERMINATION_P), list($kw14$MARKING_FN, $sym40$SBHL_PREDICATE_MARKING_FN), list($kw16$UNMARKING_FN, $sym41$SBHL_PREDICATE_UNMARKING_FN), list($kw42$PREDICATE_SEARCH_P, T), list($kw43$ADD_NODE_TO_RESULT_TEST, $sym44$NOT_GENL_INVERSE_MODE_P), list($kw45$ACCESSIBLE_LINK_PREDS, $list46), list($kw20$INDEX_ARG, ONE_INTEGER)}));
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 5600) 
  public static final SubLObject initialize_genl_inverse_module() {
    sbhl_module_utilities.init_sbhl_module_data($const38$genlInverse, list(new SubLObject[] {list($kw1$LINK_PRED, $const38$genlInverse), list($kw2$LINK_STYLE, $const3$DirectedMultigraph), list($kw6$MODULE_TYPE, $kw47$SIMPLE_NON_REFLEXIVE), list($kw8$TYPE_TEST, $sym35$PREDICATE_P), list($kw48$INVERTS_ARGUMENTS_OF_MODULE, $const34$genlPreds), list($kw10$DISJOINS_MODULE, $const49$negationInverse), list($kw12$PATH_TERMINATING_MARK__FN, $sym39$SBHL_PREDICATE_PATH_TERMINATION_P), list($kw14$MARKING_FN, $sym40$SBHL_PREDICATE_MARKING_FN), list($kw16$UNMARKING_FN, $sym41$SBHL_PREDICATE_UNMARKING_FN), list($kw42$PREDICATE_SEARCH_P, T), list($kw43$ADD_NODE_TO_RESULT_TEST, $sym50$GENL_INVERSE_MODE_P), list($kw45$ACCESSIBLE_LINK_PREDS, $list51), list($kw20$INDEX_ARG, ONE_INTEGER)}));
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 6417) 
  public static final SubLObject initialize_negation_preds_module() {
    sbhl_module_utilities.init_sbhl_module_data($const36$negationPreds, list(new SubLObject[] {list($kw1$LINK_PRED, $const36$negationPreds), list($kw2$LINK_STYLE, $const21$Multigraph), list($kw6$MODULE_TYPE, $kw22$DISJOINS), list($kw8$TYPE_TEST, $sym35$PREDICATE_P), list($kw37$MODULE_INVERTS_ARGUMENTS, $const49$negationInverse), list($kw12$PATH_TERMINATING_MARK__FN, $sym39$SBHL_PREDICATE_PATH_TERMINATION_P), list($kw14$MARKING_FN, $sym40$SBHL_PREDICATE_MARKING_FN), list($kw16$UNMARKING_FN, $sym41$SBHL_PREDICATE_UNMARKING_FN), list($kw42$PREDICATE_SEARCH_P, T), list($kw43$ADD_NODE_TO_RESULT_TEST, $sym44$NOT_GENL_INVERSE_MODE_P), list($kw45$ACCESSIBLE_LINK_PREDS, $list52), list($kw20$INDEX_ARG, ONE_INTEGER), list($kw23$TRANSFERS_THROUGH_MODULE, $const34$genlPreds), list($kw24$TRANSFERS_VIA_ARG, ONE_INTEGER)}));
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 7276) 
  public static final SubLObject initialize_negation_inverse_module() {
    sbhl_module_utilities.init_sbhl_module_data($const49$negationInverse, list(new SubLObject[] {list($kw1$LINK_PRED, $const49$negationInverse), list($kw2$LINK_STYLE, $const21$Multigraph), list($kw6$MODULE_TYPE, $kw22$DISJOINS), list($kw8$TYPE_TEST, $sym35$PREDICATE_P), list($kw48$INVERTS_ARGUMENTS_OF_MODULE, $const36$negationPreds), list($kw12$PATH_TERMINATING_MARK__FN, $sym39$SBHL_PREDICATE_PATH_TERMINATION_P), list($kw14$MARKING_FN, $sym40$SBHL_PREDICATE_MARKING_FN), list($kw16$UNMARKING_FN, $sym41$SBHL_PREDICATE_UNMARKING_FN), list($kw42$PREDICATE_SEARCH_P, T), list($kw43$ADD_NODE_TO_RESULT_TEST, $sym50$GENL_INVERSE_MODE_P), list($kw45$ACCESSIBLE_LINK_PREDS, $list53), list($kw20$INDEX_ARG, ONE_INTEGER), list($kw23$TRANSFERS_THROUGH_MODULE, $const34$genlPreds), list($kw24$TRANSFERS_VIA_ARG, ONE_INTEGER)}));
    return NIL;
  }

  /** Flag for whether the SBHL modules have been initialized. */
  @SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 11755) 
  private static SubLSymbol $sbhl_modules_initializedP$ = null;

  @SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 11951) 
  public static final SubLObject sbhl_modules_initializedP() {
    return $sbhl_modules_initializedP$.getGlobalValue();
  }

  @SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 12036) 
  public static final SubLObject note_sbhl_modules_initialized() {
    $sbhl_modules_initializedP$.setGlobalValue(T);
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 12141) 
  public static final SubLObject initialize_sbhl_modules(SubLObject forceP) {
    if ((forceP == UNPROVIDED)) {
      forceP = NIL;
    }
    if (((NIL != forceP)
        || (NIL == sbhl_modules_initializedP()))) {
      sbhl_module_vars.reset_sbhl_modules();
      initialize_genls_module();
      initialize_disjoint_with_module();
      initialize_isa_module();
      initialize_quoted_isa_module();
      initialize_genl_mt_module();
      initialize_negation_mt_module();
      initialize_genl_preds_module();
      initialize_genl_inverse_module();
      initialize_negation_preds_module();
      initialize_negation_inverse_module();
      note_sbhl_modules_initialized();
    }
    return NIL;
  }

  public static final SubLObject declare_sbhl_module_declarations_file() {
    declareFunction(myName, "initialize_genls_module", "INITIALIZE-GENLS-MODULE", 0, 0, false);
    declareFunction(myName, "initialize_disjoint_with_module", "INITIALIZE-DISJOINT-WITH-MODULE", 0, 0, false);
    declareFunction(myName, "initialize_isa_module", "INITIALIZE-ISA-MODULE", 0, 0, false);
    declareFunction(myName, "initialize_quoted_isa_module", "INITIALIZE-QUOTED-ISA-MODULE", 0, 0, false);
    declareFunction(myName, "initialize_genl_mt_module", "INITIALIZE-GENL-MT-MODULE", 0, 0, false);
    declareFunction(myName, "initialize_negation_mt_module", "INITIALIZE-NEGATION-MT-MODULE", 0, 0, false);
    declareFunction(myName, "initialize_genl_preds_module", "INITIALIZE-GENL-PREDS-MODULE", 0, 0, false);
    declareFunction(myName, "initialize_genl_inverse_module", "INITIALIZE-GENL-INVERSE-MODULE", 0, 0, false);
    declareFunction(myName, "initialize_negation_preds_module", "INITIALIZE-NEGATION-PREDS-MODULE", 0, 0, false);
    declareFunction(myName, "initialize_negation_inverse_module", "INITIALIZE-NEGATION-INVERSE-MODULE", 0, 0, false);
    declareFunction(myName, "sbhl_modules_initializedP", "SBHL-MODULES-INITIALIZED?", 0, 0, false);
    declareFunction(myName, "note_sbhl_modules_initialized", "NOTE-SBHL-MODULES-INITIALIZED", 0, 0, false);
    declareFunction(myName, "initialize_sbhl_modules", "INITIALIZE-SBHL-MODULES", 0, 1, false);
    //declareFunction(myName, "convert_legacy_sbhl_modules_to_structs", "CONVERT-LEGACY-SBHL-MODULES-TO-STRUCTS", 0, 1, false);
    //declareFunction(myName, "verify_sbhl_modules", "VERIFY-SBHL-MODULES", 0, 1, false);
    return NIL;
  }

  public static final SubLObject init_sbhl_module_declarations_file() {
    $sbhl_modules_initializedP$ = deflexical("*SBHL-MODULES-INITIALIZED?*", maybeDefault( $sym54$_SBHL_MODULES_INITIALIZED__, $sbhl_modules_initializedP$, NIL));
    return NIL;
  }

  public static final SubLObject setup_sbhl_module_declarations_file() {
    // CVS_ID("Id: sbhl-module-declarations.lisp 128885 2009-10-02 20:37:07Z rck ");
    subl_macro_promotions.declare_defglobal($sym54$_SBHL_MODULES_INITIALIZED__);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLSymbol $kw1$LINK_PRED = makeKeyword("LINK-PRED");
  public static final SubLSymbol $kw2$LINK_STYLE = makeKeyword("LINK-STYLE");
  public static final SubLObject $const3$DirectedMultigraph = constant_handles.reader_make_constant_shell(makeString("DirectedMultigraph"));
  public static final SubLSymbol $kw4$NAUT_FORWARD_TRUE_GENERATORS = makeKeyword("NAUT-FORWARD-TRUE-GENERATORS");
  public static final SubLList $list5 = list(makeSymbol("SBHL-RESULT-GENL"), makeSymbol("RESULT-GENL-ARGS"), makeSymbol("RESULT-INTER-ARG-GENL"), makeSymbol("RESULT-INTER-ARG-GENL-RELN"), makeSymbol("RESULT-GENL-VIA-ARG-ARG-GENL"));
  public static final SubLSymbol $kw6$MODULE_TYPE = makeKeyword("MODULE-TYPE");
  public static final SubLSymbol $kw7$SIMPLE_REFLEXIVE = makeKeyword("SIMPLE-REFLEXIVE");
  public static final SubLSymbol $kw8$TYPE_TEST = makeKeyword("TYPE-TEST");
  public static final SubLSymbol $sym9$COLLECTION_P = makeSymbol("COLLECTION-P");
  public static final SubLSymbol $kw10$DISJOINS_MODULE = makeKeyword("DISJOINS-MODULE");
  public static final SubLObject $const11$disjointWith = constant_handles.reader_make_constant_shell(makeString("disjointWith"));
  public static final SubLSymbol $kw12$PATH_TERMINATING_MARK__FN = makeKeyword("PATH-TERMINATING-MARK?-FN");
  public static final SubLSymbol $sym13$SBHL_MARKED_P = makeSymbol("SBHL-MARKED-P");
  public static final SubLSymbol $kw14$MARKING_FN = makeKeyword("MARKING-FN");
  public static final SubLSymbol $sym15$SET_SBHL_MARKING_STATE_TO_MARKED = makeSymbol("SET-SBHL-MARKING-STATE-TO-MARKED");
  public static final SubLSymbol $kw16$UNMARKING_FN = makeKeyword("UNMARKING-FN");
  public static final SubLSymbol $sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED = makeSymbol("SET-SBHL-MARKING-STATE-TO-UNMARKED");
  public static final SubLSymbol $kw18$ROOT = makeKeyword("ROOT");
  public static final SubLObject $const19$Thing = constant_handles.reader_make_constant_shell(makeString("Thing"));
  public static final SubLSymbol $kw20$INDEX_ARG = makeKeyword("INDEX-ARG");
  public static final SubLObject $const21$Multigraph = constant_handles.reader_make_constant_shell(makeString("Multigraph"));
  public static final SubLSymbol $kw22$DISJOINS = makeKeyword("DISJOINS");
  public static final SubLSymbol $kw23$TRANSFERS_THROUGH_MODULE = makeKeyword("TRANSFERS-THROUGH-MODULE");
  public static final SubLSymbol $kw24$TRANSFERS_VIA_ARG = makeKeyword("TRANSFERS-VIA-ARG");
  public static final SubLObject $const25$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLList $list26 = list(makeSymbol("SBHL-RESULT-ISA"), makeSymbol("RESULT-ISA-ARGS"), makeSymbol("RESULT-INTER-ARG-ISA"), makeSymbol("RESULT-INTER-ARG-ISA-RELN"), makeSymbol("RESULT-ISA-VIA-ARG-ARG-ISA"), makeSymbol("RESULT-ISA-ARG-ISAS"), makeSymbol("RESULT-ISA-VIA-CLOSED-UNDER"));
  public static final SubLSymbol $kw27$TRANSFERS_THROUGH = makeKeyword("TRANSFERS-THROUGH");
  public static final SubLObject $const28$quotedIsa = constant_handles.reader_make_constant_shell(makeString("quotedIsa"));
  public static final SubLList $list29 = list(makeSymbol("SBHL-EVALUATION-RESULT-QUOTED-ISA"), makeSymbol("SBHL-RESULT-QUOTED-ISA"));
  public static final SubLObject $const30$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));
  public static final SubLList $list31 = list(makeSymbol("SBHL-NAUT-FORWARD-GENL-MTS"));
  public static final SubLSymbol $sym32$MICROTHEORY_P = makeSymbol("MICROTHEORY-P");
  public static final SubLObject $const33$negationMt = constant_handles.reader_make_constant_shell(makeString("negationMt"));
  public static final SubLObject $const34$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLSymbol $sym35$PREDICATE_P = makeSymbol("PREDICATE-P");
  public static final SubLObject $const36$negationPreds = constant_handles.reader_make_constant_shell(makeString("negationPreds"));
  public static final SubLSymbol $kw37$MODULE_INVERTS_ARGUMENTS = makeKeyword("MODULE-INVERTS-ARGUMENTS");
  public static final SubLObject $const38$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));
  public static final SubLSymbol $sym39$SBHL_PREDICATE_PATH_TERMINATION_P = makeSymbol("SBHL-PREDICATE-PATH-TERMINATION-P");
  public static final SubLSymbol $sym40$SBHL_PREDICATE_MARKING_FN = makeSymbol("SBHL-PREDICATE-MARKING-FN");
  public static final SubLSymbol $sym41$SBHL_PREDICATE_UNMARKING_FN = makeSymbol("SBHL-PREDICATE-UNMARKING-FN");
  public static final SubLSymbol $kw42$PREDICATE_SEARCH_P = makeKeyword("PREDICATE-SEARCH-P");
  public static final SubLSymbol $kw43$ADD_NODE_TO_RESULT_TEST = makeKeyword("ADD-NODE-TO-RESULT-TEST");
  public static final SubLSymbol $sym44$NOT_GENL_INVERSE_MODE_P = makeSymbol("NOT-GENL-INVERSE-MODE-P");
  public static final SubLSymbol $kw45$ACCESSIBLE_LINK_PREDS = makeKeyword("ACCESSIBLE-LINK-PREDS");
  public static final SubLList $list46 = list(constant_handles.reader_make_constant_shell(makeString("genlPreds")), constant_handles.reader_make_constant_shell(makeString("genlInverse")));
  public static final SubLSymbol $kw47$SIMPLE_NON_REFLEXIVE = makeKeyword("SIMPLE-NON-REFLEXIVE");
  public static final SubLSymbol $kw48$INVERTS_ARGUMENTS_OF_MODULE = makeKeyword("INVERTS-ARGUMENTS-OF-MODULE");
  public static final SubLObject $const49$negationInverse = constant_handles.reader_make_constant_shell(makeString("negationInverse"));
  public static final SubLSymbol $sym50$GENL_INVERSE_MODE_P = makeSymbol("GENL-INVERSE-MODE-P");
  public static final SubLList $list51 = list(constant_handles.reader_make_constant_shell(makeString("genlInverse")), constant_handles.reader_make_constant_shell(makeString("genlPreds")));
  public static final SubLList $list52 = list(constant_handles.reader_make_constant_shell(makeString("negationPreds")), constant_handles.reader_make_constant_shell(makeString("negationInverse")));
  public static final SubLList $list53 = list(constant_handles.reader_make_constant_shell(makeString("negationInverse")), constant_handles.reader_make_constant_shell(makeString("negationPreds")));
  public static final SubLSymbol $sym54$_SBHL_MODULES_INITIALIZED__ = makeSymbol("*SBHL-MODULES-INITIALIZED?*");
  public static final SubLSymbol $kw55$SBHL_GRAPH = makeKeyword("SBHL-GRAPH");
  public static final SubLSymbol $kw56$GRAPH = makeKeyword("GRAPH");
  public static final SubLString $str57$sbhl_module__A__graph__A__tt_modu = makeString("sbhl-module ~A: graph=~A  tt-module=~A~%");
  public static final SubLString $str58$missing = makeString("missing");

  //// Initializers

  public void declareFunctions() {
    declare_sbhl_module_declarations_file();
  }

  public void initializeVariables() {
    init_sbhl_module_declarations_file();
  }

  public void runTopLevelForms() {
    setup_sbhl_module_declarations_file();
  }

}
