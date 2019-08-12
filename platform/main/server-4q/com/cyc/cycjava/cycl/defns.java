/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.hash_table_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      DEFNS
 * source file: /cyc/top/cycl/defns.lisp
 * created:     2019/07/03 17:37:34
 */
public final class defns extends SubLTranslatedFile implements V12 {
    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $quoted_nec_defns$ = makeSymbol("*QUOTED-NEC-DEFNS*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $nec_defns$ = makeSymbol("*NEC-DEFNS*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $quoted_suf_defns$ = makeSymbol("*QUOTED-SUF-DEFNS*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $suf_defns$ = makeSymbol("*SUF-DEFNS*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $quoted_iff_defns$ = makeSymbol("*QUOTED-IFF-DEFNS*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $iff_defns$ = makeSymbol("*IFF-DEFNS*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $has_quoted_suf_defn_cache$ = makeSymbol("*HAS-QUOTED-SUF-DEFN-CACHE*");

    // Definitions
    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $has_suf_defn_cache$ = makeSymbol("*HAS-SUF-DEFN-CACHE*");

    public static final SubLFile me = new defns();

 public static final String myName = "com.cyc.cycjava.cycl.defns";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $has_suf_defn_cache_index$ = makeSymbol("*HAS-SUF-DEFN-CACHE-INDEX*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $has_quoted_suf_defn_cache_index$ = makeSymbol("*HAS-QUOTED-SUF-DEFN-CACHE-INDEX*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $iff_defns_index$ = makeSymbol("*IFF-DEFNS-INDEX*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $quoted_iff_defns_index$ = makeSymbol("*QUOTED-IFF-DEFNS-INDEX*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $suf_defns_index$ = makeSymbol("*SUF-DEFNS-INDEX*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $quoted_suf_defns_index$ = makeSymbol("*QUOTED-SUF-DEFNS-INDEX*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $nec_defns_index$ = makeSymbol("*NEC-DEFNS-INDEX*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $quoted_nec_defns_index$ = makeSymbol("*QUOTED-NEC-DEFNS-INDEX*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $suf_defn_cache_index$ = makeSymbol("*SUF-DEFN-CACHE-INDEX*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $suf_quoted_defn_cache_index$ = makeSymbol("*SUF-QUOTED-DEFN-CACHE-INDEX*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $suf_function_cache_index$ = makeSymbol("*SUF-FUNCTION-CACHE-INDEX*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $suf_quoted_function_cache_index$ = makeSymbol("*SUF-QUOTED-FUNCTION-CACHE-INDEX*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $defn_term$ = makeSymbol("*DEFN-TERM*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $org_collection$ = makeSymbol("*ORG-COLLECTION*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $failing_suf_defns$ = makeSymbol("*FAILING-SUF-DEFNS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $new_defns_admitP_meters$ = makeSymbol("*NEW-DEFNS-ADMIT?-METERS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $new_defns_rejectP_meters$ = makeSymbol("*NEW-DEFNS-REJECT?-METERS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $new_quoted_defns_admitP_meters$ = makeSymbol("*NEW-QUOTED-DEFNS-ADMIT?-METERS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $new_quoted_defns_rejectP_meters$ = makeSymbol("*NEW-QUOTED-DEFNS-REJECT?-METERS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $nec_defn_rejectsP_meters$ = makeSymbol("*NEC-DEFN-REJECTS?-METERS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $min_defn_admits_map$ = makeSymbol("*MIN-DEFN-ADMITS-MAP*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $min_quoted_defn_admits_map$ = makeSymbol("*MIN-QUOTED-DEFN-ADMITS-MAP*");

    private static final SubLSymbol $index_to_defns_cache_vector$ = makeSymbol("*INDEX-TO-DEFNS-CACHE-VECTOR*");

    private static final SubLInteger $int$200 = makeInteger(200);

    private static final SubLSymbol DEFNS_CACHE_INDEX_P = makeSymbol("DEFNS-CACHE-INDEX-P");

    private static final SubLList $list5 = list(list(makeSymbol("KEY"), makeSymbol("VAL"), makeSymbol("DEFN-CACHE-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list6 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol GET_DEFN_CACHE_FROM_INDEX = makeSymbol("GET-DEFN-CACHE-FROM-INDEX");

    private static final SubLSymbol PROGRESS_CDOHASH = makeSymbol("PROGRESS-CDOHASH");

    private static final SubLSymbol $sym12$_NEW_DEFNS_ADMIT__METERS_ = makeSymbol("*NEW-DEFNS-ADMIT?-METERS*");

    private static final SubLList $list18 = list(makeSymbol("COL"), makeSymbol("TERM"), makeSymbol("MT"));

    private static final SubLSymbol $sym20$NEW_DEFNS_ADMIT_ = makeSymbol("NEW-DEFNS-ADMIT?");

    private static final SubLSymbol $sym22$RESET_NEW_DEFNS_ADMIT__METERS = makeSymbol("RESET-NEW-DEFNS-ADMIT?-METERS");

    private static final SubLSymbol $sym25$_NEW_DEFNS_REJECT__METERS_ = makeSymbol("*NEW-DEFNS-REJECT?-METERS*");

    private static final SubLSymbol $sym26$NEW_DEFNS_REJECT_ = makeSymbol("NEW-DEFNS-REJECT?");

    private static final SubLSymbol $sym27$RESET_NEW_DEFNS_REJECT__METERS = makeSymbol("RESET-NEW-DEFNS-REJECT?-METERS");

    private static final SubLSymbol $sym28$_NEW_QUOTED_DEFNS_ADMIT__METERS_ = makeSymbol("*NEW-QUOTED-DEFNS-ADMIT?-METERS*");

    private static final SubLSymbol $sym29$NEW_QUOTED_DEFNS_ADMIT_ = makeSymbol("NEW-QUOTED-DEFNS-ADMIT?");

    private static final SubLSymbol $sym30$RESET_NEW_QUOTED_DEFNS_ADMIT__METERS = makeSymbol("RESET-NEW-QUOTED-DEFNS-ADMIT?-METERS");

    private static final SubLSymbol $sym31$_NEW_QUOTED_DEFNS_REJECT__METERS_ = makeSymbol("*NEW-QUOTED-DEFNS-REJECT?-METERS*");

    private static final SubLSymbol $sym32$NEW_QUOTED_DEFNS_REJECT_ = makeSymbol("NEW-QUOTED-DEFNS-REJECT?");

    private static final SubLSymbol $sym33$RESET_NEW_QUOTED_DEFNS_REJECT__METERS = makeSymbol("RESET-NEW-QUOTED-DEFNS-REJECT?-METERS");

    private static final SubLString $str39$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str44$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");



    private static final SubLString $str46$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str47$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str48$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol $sym50$COL_QUOTED_DEFN_ADMITS_ = makeSymbol("COL-QUOTED-DEFN-ADMITS?");

    private static final SubLSymbol $sym51$COL_DEFN_ADMITS_ = makeSymbol("COL-DEFN-ADMITS?");

    private static final SubLList $list52 = list(makeSymbol("CONSTRAINT-RELN"), makeSymbol("VIA"), makeSymbol("CONSTRAINT-GAF"));

    private static final SubLSymbol $AT_CONSTRAINT_GAF = makeKeyword("AT-CONSTRAINT-GAF");

    private static final SubLSymbol $MAL_ARG_WRT_QUOTED_SUF_DEFNS = makeKeyword("MAL-ARG-WRT-QUOTED-SUF-DEFNS");

    private static final SubLSymbol $MAL_ARG_WRT_SUF_DEFNS = makeKeyword("MAL-ARG-WRT-SUF-DEFNS");

    private static final SubLSymbol $MAL_ARG_WRT_QUOTED_IFF_DEFN = makeKeyword("MAL-ARG-WRT-QUOTED-IFF-DEFN");

    private static final SubLSymbol $MAL_ARG_WRT_IFF_DEFN = makeKeyword("MAL-ARG-WRT-IFF-DEFN");

    private static final SubLSymbol $sym58$_NEC_DEFN_REJECTS__METERS_ = makeSymbol("*NEC-DEFN-REJECTS?-METERS*");

    private static final SubLList $list59 = list(makeSymbol("COL"), makeSymbol("TERM"), makeSymbol("MT"), makeSymbol("QUOTED?"), makeSymbol("CONSIDER-IFF-AS-NEC?"));

    private static final SubLSymbol $sym60$NEC_DEFN_REJECTS_ = makeSymbol("NEC-DEFN-REJECTS?");

    private static final SubLSymbol $sym61$RESET_NEC_DEFN_REJECTS__METERS = makeSymbol("RESET-NEC-DEFN-REJECTS?-METERS");

    private static final SubLSymbol $MAL_ARG_WRT_QUOTED_NEC_DEFN = makeKeyword("MAL-ARG-WRT-QUOTED-NEC-DEFN");

    private static final SubLSymbol $MAL_ARG_WRT_NEC_DEFN = makeKeyword("MAL-ARG-WRT-NEC-DEFN");



    private static final SubLSymbol ADMITTING_QUOTED_DEFN_ASSERTION = makeSymbol("ADMITTING-QUOTED-DEFN-ASSERTION");

    private static final SubLSymbol ADMITTING_DEFN_ASSERTION = makeSymbol("ADMITTING-DEFN-ASSERTION");

    private static final SubLSymbol ADMITTING_QUOTED_DEFN_ASSERTIONS = makeSymbol("ADMITTING-QUOTED-DEFN-ASSERTIONS");

    private static final SubLSymbol ADMITTING_DEFN_ASSERTIONS = makeSymbol("ADMITTING-DEFN-ASSERTIONS");

    private static final SubLList $list70 = list(list(makeSymbol("STRINGP"), reader_make_constant_shell("CharacterString")), list(makeSymbol("POSITIVE-INTEGER-P"), reader_make_constant_shell("PositiveInteger")), list(makeSymbol("NON-NEGATIVE-INTEGER-P"), reader_make_constant_shell("NonNegativeInteger")), list(makeSymbol("INTEGERP"), reader_make_constant_shell("Integer")), list(makeSymbol("FLOATP"), reader_make_constant_shell("RealNumber")), list(makeSymbol("TRUE"), reader_make_constant_shell("Thing")));

    private static final SubLList $list71 = list(makeSymbol("DEFN"), makeSymbol("COLLECTION"));

    private static final SubLList $list73 = list(list(makeSymbol("STRINGP"), reader_make_constant_shell("SubLString")), list(makeSymbol("INTEGERP"), reader_make_constant_shell("SubLInteger")), list(makeSymbol("FLOATP"), reader_make_constant_shell("SubLRealNumber")), list(makeSymbol("SYMBOLP"), reader_make_constant_shell("SubLSymbol")), list(makeSymbol("CONSTANT-P"), reader_make_constant_shell("CycLConstant")), list(makeSymbol("NART-P"), reader_make_constant_shell("CycLNonAtomicReifiedTerm")), list(makeSymbol("ASSERTION-P"), reader_make_constant_shell("CycLAssertion")), list(makeSymbol("TRUE"), reader_make_constant_shell("CycLExpression")));

    private static final SubLList $list74 = list(makeSymbol("QUOTED-DEFN"), makeSymbol("COLLECTION"));







    private static final SubLSymbol NEW_ADD_IFF_DEFN = makeSymbol("NEW-ADD-IFF-DEFN");

    private static final SubLSymbol NEW_REMOVE_IFF_DEFN = makeSymbol("NEW-REMOVE-IFF-DEFN");

    private static final SubLSymbol NEW_ADD_SUF_DEFN = makeSymbol("NEW-ADD-SUF-DEFN");

    private static final SubLSymbol NEW_REMOVE_SUF_DEFN = makeSymbol("NEW-REMOVE-SUF-DEFN");

    private static final SubLSymbol ADD_NEC_DEFN = makeSymbol("ADD-NEC-DEFN");

    private static final SubLSymbol REMOVE_NEC_DEFN = makeSymbol("REMOVE-NEC-DEFN");

    private static final SubLSymbol NEW_ADD_IFF_QUOTED_DEFN = makeSymbol("NEW-ADD-IFF-QUOTED-DEFN");

    private static final SubLSymbol NEW_REMOVE_IFF_QUOTED_DEFN = makeSymbol("NEW-REMOVE-IFF-QUOTED-DEFN");

    private static final SubLSymbol NEW_ADD_SUF_QUOTED_DEFN = makeSymbol("NEW-ADD-SUF-QUOTED-DEFN");

    private static final SubLSymbol NEW_REMOVE_SUF_QUOTED_DEFN = makeSymbol("NEW-REMOVE-SUF-QUOTED-DEFN");

    private static final SubLSymbol ADD_NEC_QUOTED_DEFN = makeSymbol("ADD-NEC-QUOTED-DEFN");

    private static final SubLSymbol REMOVE_NEC_QUOTED_DEFN = makeSymbol("REMOVE-NEC-QUOTED-DEFN");

    public static final SubLSymbol $new_handle_added_genl_for_suf_defns_meters$ = makeSymbol("*NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS*");

    private static final SubLList $list98 = list(makeSymbol("SPEC"), makeSymbol("GENL"));

    private static final SubLSymbol NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS = makeSymbol("NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS");

    private static final SubLSymbol RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS = makeSymbol("RESET-NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS");

    public static final SubLSymbol $new_handle_added_genl_for_suf_quoted_defns_meters$ = makeSymbol("*NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*");

    private static final SubLSymbol NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS = makeSymbol("NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS");

    private static final SubLSymbol RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS = makeSymbol("RESET-NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS");

    public static final SubLSymbol $new_handle_removed_genl_for_suf_defns_meters$ = makeSymbol("*NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS*");

    private static final SubLSymbol NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS = makeSymbol("NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS");

    private static final SubLSymbol RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS = makeSymbol("RESET-NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS");

    public static final SubLSymbol $new_handle_removed_genl_for_suf_quoted_defns_meters$ = makeSymbol("*NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*");

    private static final SubLSymbol NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS = makeSymbol("NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS");

    private static final SubLSymbol RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS = makeSymbol("RESET-NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS");

    private static final SubLInteger $int$400 = makeInteger(400);

    private static final SubLString $str112$Initializing_defns___ = makeString("Initializing ..");













    public static SubLObject get_index_to_defns_cache_vector() {
        if (NIL == $index_to_defns_cache_vector$.getGlobalValue()) {
            $index_to_defns_cache_vector$.setGlobalValue(make_vector(TWELVE_INTEGER, UNPROVIDED));
            set_aref($index_to_defns_cache_vector$.getGlobalValue(), $has_suf_defn_cache_index$.getGlobalValue(), NIL);
            set_aref($index_to_defns_cache_vector$.getGlobalValue(), $has_quoted_suf_defn_cache_index$.getGlobalValue(), NIL);
            set_aref($index_to_defns_cache_vector$.getGlobalValue(), $iff_defns_index$.getGlobalValue(), NIL);
            set_aref($index_to_defns_cache_vector$.getGlobalValue(), $quoted_iff_defns_index$.getGlobalValue(), NIL);
            set_aref($index_to_defns_cache_vector$.getGlobalValue(), $suf_defns_index$.getGlobalValue(), NIL);
            set_aref($index_to_defns_cache_vector$.getGlobalValue(), $quoted_suf_defns_index$.getGlobalValue(), NIL);
            set_aref($index_to_defns_cache_vector$.getGlobalValue(), $nec_defns_index$.getGlobalValue(), NIL);
            set_aref($index_to_defns_cache_vector$.getGlobalValue(), $quoted_nec_defns_index$.getGlobalValue(), NIL);
            set_aref($index_to_defns_cache_vector$.getGlobalValue(), $suf_defn_cache_index$.getGlobalValue(), make_hash_table($int$256, UNPROVIDED, UNPROVIDED));
            set_aref($index_to_defns_cache_vector$.getGlobalValue(), $suf_quoted_defn_cache_index$.getGlobalValue(), make_hash_table($int$200, UNPROVIDED, UNPROVIDED));
            set_aref($index_to_defns_cache_vector$.getGlobalValue(), $suf_function_cache_index$.getGlobalValue(), make_hash_table($int$256, UNPROVIDED, UNPROVIDED));
            set_aref($index_to_defns_cache_vector$.getGlobalValue(), $suf_quoted_function_cache_index$.getGlobalValue(), make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
        }
        return $index_to_defns_cache_vector$.getGlobalValue();
    }

    public static SubLObject get_defn_cache_from_index(final SubLObject defn_cache_index) {
        assert NIL != defns_cache_index_p(defn_cache_index) : "! defns.defns_cache_index_p(defn_cache_index) " + ("defns.defns_cache_index_p(defn_cache_index) " + "CommonSymbols.NIL != defns.defns_cache_index_p(defn_cache_index) ") + defn_cache_index;
        final SubLObject defns_cache = aref(get_index_to_defns_cache_vector(), defn_cache_index);
        return defns_cache;
    }

    public static SubLObject defns_cache_index_p(final SubLObject possible_index) {
        return (possible_index.isInteger() && possible_index.numGE(ZERO_INTEGER)) && possible_index.numL(TWELVE_INTEGER) ? T : NIL;
    }

    public static SubLObject defns_cache_make_hash_table(final SubLObject defn_cache_index, final SubLObject size) {
        assert NIL != defns_cache_index_p(defn_cache_index) : "! defns.defns_cache_index_p(defn_cache_index) " + ("defns.defns_cache_index_p(defn_cache_index) " + "CommonSymbols.NIL != defns.defns_cache_index_p(defn_cache_index) ") + defn_cache_index;
        set_aref(get_index_to_defns_cache_vector(), defn_cache_index, make_hash_table(size, UNPROVIDED, UNPROVIDED));
        return T;
    }

    public static SubLObject defns_cache_definedP(final SubLObject defn_cache_index) {
        assert NIL != defns_cache_index_p(defn_cache_index) : "! defns.defns_cache_index_p(defn_cache_index) " + ("defns.defns_cache_index_p(defn_cache_index) " + "CommonSymbols.NIL != defns.defns_cache_index_p(defn_cache_index) ") + defn_cache_index;
        return NIL != get_defn_cache_from_index(defn_cache_index) ? T : NIL;
    }

    public static SubLObject defns_cache_hash_table_p(final SubLObject defn_cache_index) {
        assert NIL != defns_cache_index_p(defn_cache_index) : "! defns.defns_cache_index_p(defn_cache_index) " + ("defns.defns_cache_index_p(defn_cache_index) " + "CommonSymbols.NIL != defns.defns_cache_index_p(defn_cache_index) ") + defn_cache_index;
        return hash_table_p(get_defn_cache_from_index(defn_cache_index));
    }

    public static SubLObject defns_cache_hash_table_empty_p(final SubLObject defn_cache_index) {
        assert NIL != defns_cache_index_p(defn_cache_index) : "! defns.defns_cache_index_p(defn_cache_index) " + ("defns.defns_cache_index_p(defn_cache_index) " + "CommonSymbols.NIL != defns.defns_cache_index_p(defn_cache_index) ") + defn_cache_index;
        return hash_table_utilities.hash_table_empty_p(get_defn_cache_from_index(defn_cache_index));
    }

    public static SubLObject defns_cache_clrhash(final SubLObject defn_cache_index) {
        assert NIL != defns_cache_index_p(defn_cache_index) : "! defns.defns_cache_index_p(defn_cache_index) " + ("defns.defns_cache_index_p(defn_cache_index) " + "CommonSymbols.NIL != defns.defns_cache_index_p(defn_cache_index) ") + defn_cache_index;
        return clrhash(get_defn_cache_from_index(defn_cache_index));
    }

    public static SubLObject defns_cache_gethash(final SubLObject key, final SubLObject defn_cache_index) {
        assert NIL != defns_cache_index_p(defn_cache_index) : "! defns.defns_cache_index_p(defn_cache_index) " + ("defns.defns_cache_index_p(defn_cache_index) " + "CommonSymbols.NIL != defns.defns_cache_index_p(defn_cache_index) ") + defn_cache_index;
        return gethash(key, get_defn_cache_from_index(defn_cache_index), UNPROVIDED);
    }

    public static SubLObject defns_cache_sethash(final SubLObject key, final SubLObject defn_cache_index, final SubLObject value) {
        assert NIL != defns_cache_index_p(defn_cache_index) : "! defns.defns_cache_index_p(defn_cache_index) " + ("defns.defns_cache_index_p(defn_cache_index) " + "CommonSymbols.NIL != defns.defns_cache_index_p(defn_cache_index) ") + defn_cache_index;
        return sethash(key, get_defn_cache_from_index(defn_cache_index), value);
    }

    public static SubLObject defns_cache_remhash(final SubLObject key, final SubLObject defn_cache_index) {
        assert NIL != defns_cache_index_p(defn_cache_index) : "! defns.defns_cache_index_p(defn_cache_index) " + ("defns.defns_cache_index_p(defn_cache_index) " + "CommonSymbols.NIL != defns.defns_cache_index_p(defn_cache_index) ") + defn_cache_index;
        return remhash(key, get_defn_cache_from_index(defn_cache_index));
    }

    public static SubLObject defns_cache_remove_value_from_hash(final SubLObject key, final SubLObject value, final SubLObject defn_cache_index) {
        assert NIL != defns_cache_index_p(defn_cache_index) : "! defns.defns_cache_index_p(defn_cache_index) " + ("defns.defns_cache_index_p(defn_cache_index) " + "CommonSymbols.NIL != defns.defns_cache_index_p(defn_cache_index) ") + defn_cache_index;
        return hash_table_utilities.remove_value_from_hash(key, value, get_defn_cache_from_index(defn_cache_index), UNPROVIDED);
    }

    public static SubLObject defns_cache_push_hash(final SubLObject key, final SubLObject value, final SubLObject defn_cache_index) {
        assert NIL != defns_cache_index_p(defn_cache_index) : "! defns.defns_cache_index_p(defn_cache_index) " + ("defns.defns_cache_index_p(defn_cache_index) " + "CommonSymbols.NIL != defns.defns_cache_index_p(defn_cache_index) ") + defn_cache_index;
        return hash_table_utilities.push_hash(key, value, get_defn_cache_from_index(defn_cache_index));
    }

    public static SubLObject defns_cache_gethash_without_values(final SubLObject key, final SubLObject defn_cache_index) {
        assert NIL != defns_cache_index_p(defn_cache_index) : "! defns.defns_cache_index_p(defn_cache_index) " + ("defns.defns_cache_index_p(defn_cache_index) " + "CommonSymbols.NIL != defns.defns_cache_index_p(defn_cache_index) ") + defn_cache_index;
        return gethash_without_values(key, get_defn_cache_from_index(defn_cache_index), UNPROVIDED);
    }

    public static SubLObject defns_cache_hash_table_to_alist(final SubLObject defn_cache_index) {
        assert NIL != defns_cache_index_p(defn_cache_index) : "! defns.defns_cache_index_p(defn_cache_index) " + ("defns.defns_cache_index_p(defn_cache_index) " + "CommonSymbols.NIL != defns.defns_cache_index_p(defn_cache_index) ") + defn_cache_index;
        return hash_table_utilities.hash_table_to_alist(get_defn_cache_from_index(defn_cache_index));
    }

    public static SubLObject defns_cache_hash_table_count(final SubLObject defn_cache_index) {
        assert NIL != defns_cache_index_p(defn_cache_index) : "! defns.defns_cache_index_p(defn_cache_index) " + ("defns.defns_cache_index_p(defn_cache_index) " + "CommonSymbols.NIL != defns.defns_cache_index_p(defn_cache_index) ") + defn_cache_index;
        return hash_table_count(get_defn_cache_from_index(defn_cache_index));
    }

    public static SubLObject do_defns_cache_hash(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject val = NIL;
        SubLObject defn_cache_index = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        val = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        defn_cache_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list5);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list5);
            if (NIL == member(current_$1, $list6, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list5);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(CDOHASH, list(key, val, list(GET_DEFN_CACHE_FROM_INDEX, defn_cache_index)), append(body, NIL));
    }

    public static SubLObject progress_do_defns_cache_hash(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject val = NIL;
        SubLObject defn_cache_index = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        val = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        defn_cache_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list5);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list5);
            if (NIL == member(current_$2, $list6, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list5);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(PROGRESS_CDOHASH, list(key, val, list(GET_DEFN_CACHE_FROM_INDEX, defn_cache_index)), append(body, NIL));
    }

    public static final SubLObject suf_defn_count_alt(SubLObject col, SubLObject quotedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != $has_suf_defn_cache$.getDynamicValue(thread)) || (NIL != $has_quoted_suf_defn_cache$.getDynamicValue(thread)))) {
                com.cyc.cycjava.cycl.defns.initialize_defns_cache();
            }
            if (NIL != quotedP) {
                return gethash(col, $has_quoted_suf_defn_cache$.getDynamicValue(thread), UNPROVIDED);
            } else {
                return gethash(col, $has_suf_defn_cache$.getDynamicValue(thread), UNPROVIDED);
            }
        }
    }

    public static SubLObject suf_defn_count(final SubLObject col, final SubLObject quotedP) {
        if ((NIL == defns_cache_definedP($has_suf_defn_cache_index$.getGlobalValue())) && (NIL == defns_cache_definedP($has_quoted_suf_defn_cache_index$.getGlobalValue()))) {
            initialize_defns_cache();
        }
        if (NIL != quotedP) {
            return defns_cache_gethash(col, $has_quoted_suf_defn_cache_index$.getGlobalValue());
        }
        return defns_cache_gethash(col, $has_suf_defn_cache_index$.getGlobalValue());
    }

    public static final SubLObject has_suf_defn_somewhereP_alt(SubLObject col, SubLObject quotedP) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.defns.suf_defn_count(col, quotedP));
    }

    public static SubLObject has_suf_defn_somewhereP(final SubLObject col, final SubLObject quotedP) {
        return list_utilities.sublisp_boolean(suf_defn_count(col, quotedP));
    }

    public static final SubLObject set_suf_defn_count_alt(SubLObject col, SubLObject count, SubLObject quotedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != $has_suf_defn_cache$.getDynamicValue(thread)) || (NIL != $has_quoted_suf_defn_cache$.getDynamicValue(thread)))) {
                com.cyc.cycjava.cycl.defns.initialize_defns_cache();
            }
            if (NIL != quotedP) {
                return sethash(col, $has_quoted_suf_defn_cache$.getDynamicValue(thread), count);
            } else {
                return sethash(col, $has_suf_defn_cache$.getDynamicValue(thread), count);
            }
        }
    }

    public static SubLObject set_suf_defn_count(final SubLObject col, final SubLObject count, final SubLObject quotedP) {
        if ((NIL == defns_cache_definedP($has_suf_defn_cache_index$.getGlobalValue())) && (NIL == defns_cache_definedP($has_quoted_suf_defn_cache_index$.getGlobalValue()))) {
            initialize_defns_cache();
        }
        if (NIL != quotedP) {
            return defns_cache_sethash(col, $has_quoted_suf_defn_cache_index$.getGlobalValue(), count);
        }
        return defns_cache_sethash(col, $has_suf_defn_cache_index$.getGlobalValue(), count);
    }

    public static final SubLObject rem_suf_defn_count_alt(SubLObject col, SubLObject quotedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != $has_suf_defn_cache$.getDynamicValue(thread)) || (NIL != $has_quoted_suf_defn_cache$.getDynamicValue(thread)))) {
                com.cyc.cycjava.cycl.defns.initialize_defns_cache();
            }
            if (NIL != quotedP) {
                return remhash(col, $has_quoted_suf_defn_cache$.getDynamicValue(thread));
            } else {
                return remhash(col, $has_suf_defn_cache$.getDynamicValue(thread));
            }
        }
    }

    public static SubLObject rem_suf_defn_count(final SubLObject col, final SubLObject quotedP) {
        if ((NIL == defns_cache_definedP($has_suf_defn_cache_index$.getGlobalValue())) && (NIL == defns_cache_definedP($has_quoted_suf_defn_cache_index$.getGlobalValue()))) {
            initialize_defns_cache();
        }
        if (NIL != quotedP) {
            return defns_cache_remhash(col, $has_quoted_suf_defn_cache_index$.getGlobalValue());
        }
        return defns_cache_remhash(col, $has_suf_defn_cache_index$.getGlobalValue());
    }

    public static final SubLObject iff_defn_alt(SubLObject col, SubLObject quotedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != $iff_defns$.getDynamicValue(thread)) || (NIL != $quoted_iff_defns$.getDynamicValue(thread)))) {
                com.cyc.cycjava.cycl.defns.initialize_defns_cache();
            }
            if (NIL != quotedP) {
                return gethash(col, $quoted_iff_defns$.getDynamicValue(thread), UNPROVIDED);
            } else {
                return gethash(col, $iff_defns$.getDynamicValue(thread), UNPROVIDED);
            }
        }
    }

    public static SubLObject iff_defn(final SubLObject col, final SubLObject quotedP) {
        if ((NIL == defns_cache_definedP($iff_defns_index$.getGlobalValue())) && (NIL == defns_cache_definedP($quoted_iff_defns_index$.getGlobalValue()))) {
            initialize_defns_cache();
        }
        if (NIL != quotedP) {
            return defns_cache_gethash(col, $quoted_iff_defns_index$.getGlobalValue());
        }
        return defns_cache_gethash(col, $iff_defns_index$.getGlobalValue());
    }

    public static final SubLObject rem_iff_defn_alt(SubLObject col, SubLObject quotedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != $iff_defns$.getDynamicValue(thread)) || (NIL != $quoted_iff_defns$.getDynamicValue(thread)))) {
                com.cyc.cycjava.cycl.defns.initialize_defns_cache();
            }
            if (NIL != quotedP) {
                return remhash(col, $quoted_iff_defns$.getDynamicValue(thread));
            } else {
                return remhash(col, $iff_defns$.getDynamicValue(thread));
            }
        }
    }

    public static SubLObject rem_iff_defn(final SubLObject col, final SubLObject quotedP) {
        if ((NIL == defns_cache_definedP($iff_defns_index$.getGlobalValue())) && (NIL == defns_cache_definedP($quoted_iff_defns_index$.getGlobalValue()))) {
            initialize_defns_cache();
        }
        if (NIL != quotedP) {
            return defns_cache_remhash(col, $quoted_iff_defns_index$.getGlobalValue());
        }
        return defns_cache_remhash(col, $iff_defns_index$.getGlobalValue());
    }

    public static final SubLObject suf_defns_alt(SubLObject col, SubLObject quotedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != $suf_defns$.getDynamicValue(thread)) || (NIL != $quoted_suf_defns$.getDynamicValue(thread)))) {
                com.cyc.cycjava.cycl.defns.initialize_defns_cache();
            }
            if (NIL != quotedP) {
                return gethash(col, $quoted_suf_defns$.getDynamicValue(thread), UNPROVIDED);
            } else {
                return gethash(col, $suf_defns$.getDynamicValue(thread), UNPROVIDED);
            }
        }
    }

    public static SubLObject suf_defns(final SubLObject col, final SubLObject quotedP) {
        if ((NIL == defns_cache_definedP($suf_defns_index$.getGlobalValue())) && (NIL == defns_cache_definedP($quoted_suf_defns_index$.getGlobalValue()))) {
            initialize_defns_cache();
        }
        if (NIL != quotedP) {
            return defns_cache_gethash(col, $quoted_suf_defns_index$.getGlobalValue());
        }
        return defns_cache_gethash(col, $suf_defns_index$.getGlobalValue());
    }

    public static final SubLObject rem_suf_defn_alt(SubLObject col, SubLObject assertion, SubLObject quotedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != $suf_defns$.getDynamicValue(thread)) || (NIL != $quoted_suf_defns$.getDynamicValue(thread)))) {
                com.cyc.cycjava.cycl.defns.initialize_defns_cache();
            }
            if (NIL != quotedP) {
                return remove_value_from_hash(col, assertion, $quoted_suf_defns$.getDynamicValue(thread), UNPROVIDED);
            } else {
                return remove_value_from_hash(col, assertion, $suf_defns$.getDynamicValue(thread), UNPROVIDED);
            }
        }
    }

    public static SubLObject rem_suf_defn(final SubLObject col, final SubLObject assertion, final SubLObject quotedP) {
        if ((NIL == defns_cache_definedP($suf_defns_index$.getGlobalValue())) && (NIL == defns_cache_definedP($quoted_suf_defns_index$.getGlobalValue()))) {
            initialize_defns_cache();
        }
        if (NIL != quotedP) {
            return defns_cache_remove_value_from_hash(col, assertion, $quoted_suf_defns_index$.getGlobalValue());
        }
        return defns_cache_remove_value_from_hash(col, assertion, $suf_defns_index$.getGlobalValue());
    }

    public static final SubLObject new_suf_defnP_alt(SubLObject col, SubLObject defn, SubLObject quotedP) {
        if (quotedP == UNPROVIDED) {
            quotedP = NIL;
        }
        {
            SubLObject foundP = NIL;
            if (NIL == foundP) {
                {
                    SubLObject csome_list_var = com.cyc.cycjava.cycl.defns.suf_defns(col, quotedP);
                    SubLObject assertion = NIL;
                    for (assertion = csome_list_var.first(); !((NIL != foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , assertion = csome_list_var.first()) {
                        if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                            foundP = eq(defn, cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion)));
                        }
                    }
                }
            }
            return foundP;
        }
    }

    public static SubLObject new_suf_defnP(final SubLObject col, final SubLObject defn, SubLObject quotedP) {
        if (quotedP == UNPROVIDED) {
            quotedP = NIL;
        }
        SubLObject foundP = NIL;
        if (NIL == foundP) {
            SubLObject csome_list_var = suf_defns(col, quotedP);
            SubLObject assertion = NIL;
            assertion = csome_list_var.first();
            while ((NIL == foundP) && (NIL != csome_list_var)) {
                if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                    foundP = eq(defn, cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion)));
                }
                csome_list_var = csome_list_var.rest();
                assertion = csome_list_var.first();
            } 
        }
        return foundP;
    }

    public static final SubLObject nec_defns_alt(SubLObject col, SubLObject quotedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != $nec_defns$.getDynamicValue(thread)) || (NIL != $quoted_nec_defns$.getDynamicValue(thread)))) {
                com.cyc.cycjava.cycl.defns.initialize_defns_cache();
            }
            if (NIL != quotedP) {
                return gethash(col, $quoted_nec_defns$.getDynamicValue(thread), UNPROVIDED);
            } else {
                return gethash(col, $nec_defns$.getDynamicValue(thread), UNPROVIDED);
            }
        }
    }

    public static SubLObject nec_defns(final SubLObject col, final SubLObject quotedP) {
        if ((NIL == defns_cache_definedP($nec_defns_index$.getGlobalValue())) && (NIL == defns_cache_definedP($quoted_nec_defns_index$.getGlobalValue()))) {
            initialize_defns_cache();
        }
        if (NIL != quotedP) {
            return defns_cache_gethash(col, $quoted_nec_defns_index$.getGlobalValue());
        }
        return defns_cache_gethash(col, $nec_defns_index$.getGlobalValue());
    }

    public static final SubLObject rem_nec_defn_alt(SubLObject col, SubLObject assertion, SubLObject quotedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != $nec_defns$.getDynamicValue(thread)) || (NIL != $quoted_nec_defns$.getDynamicValue(thread)))) {
                com.cyc.cycjava.cycl.defns.initialize_defns_cache();
            }
            if (NIL != quotedP) {
                return remove_value_from_hash(col, assertion, $quoted_nec_defns$.getDynamicValue(thread), UNPROVIDED);
            } else {
                return remove_value_from_hash(col, assertion, $nec_defns$.getDynamicValue(thread), UNPROVIDED);
            }
        }
    }

    public static SubLObject rem_nec_defn(final SubLObject col, final SubLObject assertion, final SubLObject quotedP) {
        if ((NIL == defns_cache_definedP($nec_defns_index$.getGlobalValue())) && (NIL == defns_cache_definedP($quoted_nec_defns_index$.getGlobalValue()))) {
            initialize_defns_cache();
        }
        if (NIL != quotedP) {
            return defns_cache_remove_value_from_hash(col, assertion, $quoted_nec_defns_index$.getGlobalValue());
        }
        return defns_cache_remove_value_from_hash(col, assertion, $nec_defns_index$.getGlobalValue());
    }

    public static final SubLObject has_some_defnP_alt(SubLObject col, SubLObject quotedP) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.defns.iff_defn(col, quotedP)) || (NIL != com.cyc.cycjava.cycl.defns.suf_defns(col, quotedP))) || (NIL != com.cyc.cycjava.cycl.defns.nec_defns(col, quotedP)));
    }

    public static SubLObject has_some_defnP(final SubLObject col, final SubLObject quotedP) {
        return makeBoolean(((NIL != iff_defn(col, quotedP)) || (NIL != suf_defns(col, quotedP))) || (NIL != nec_defns(col, quotedP)));
    }

    public static final SubLObject reset_new_defns_admitP_meters_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash($CALLS, $new_defns_admitP_meters$.getDynamicValue(thread), ZERO_INTEGER);
            sethash($TIMES, $new_defns_admitP_meters$.getDynamicValue(thread), NIL);
            sethash($RESULTS, $new_defns_admitP_meters$.getDynamicValue(thread), NIL);
            sethash($ARGS, $new_defns_admitP_meters$.getDynamicValue(thread), NIL);
            sethash($ARG_LIST, $new_defns_admitP_meters$.getDynamicValue(thread), $list_alt7);
            sethash($FUNCTION, $new_defns_admitP_meters$.getDynamicValue(thread), $sym9$NEW_DEFNS_ADMIT_);
            return NIL;
        }
    }

    public static SubLObject reset_new_defns_admitP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $new_defns_admitP_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $new_defns_admitP_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $new_defns_admitP_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $new_defns_admitP_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $new_defns_admitP_meters$.getDynamicValue(thread), $list18);
        sethash($FUNCTION, $new_defns_admitP_meters$.getDynamicValue(thread), $sym20$NEW_DEFNS_ADMIT_);
        return NIL;
    }

    public static final SubLObject new_defns_admitP_metered_alt(SubLObject col, SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.defns.defns_admitP_int(col, v_term, mt, NIL);
    }

    public static SubLObject new_defns_admitP_metered(final SubLObject col, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return defns_admitP_int(col, v_term, mt, NIL);
    }

    public static final SubLObject new_defns_admitP_alt(SubLObject col, SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
                {
                    SubLObject result = NIL;
                    SubLObject run_time = NIL;
                    SubLObject time_var = get_internal_real_time();
                    result = com.cyc.cycjava.cycl.defns.new_defns_admitP_metered(col, v_term, mt);
                    run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    sethash($CALLS, $new_defns_admitP_meters$.getDynamicValue(thread), add(gethash($CALLS, $new_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
                    sethash($TIMES, $new_defns_admitP_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $new_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
                    sethash($RESULTS, $new_defns_admitP_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $new_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
                    sethash($ARGS, $new_defns_admitP_meters$.getDynamicValue(thread), cons(list(col, v_term, mt), gethash($ARGS, $new_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
                    return result;
                }
            } else {
                return com.cyc.cycjava.cycl.defns.new_defns_admitP_metered(col, v_term, mt);
            }
        }
    }

    public static SubLObject new_defns_admitP(final SubLObject col, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = new_defns_admitP_metered(col, v_term, mt);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $new_defns_admitP_meters$.getDynamicValue(thread), add(gethash($CALLS, $new_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $new_defns_admitP_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $new_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $new_defns_admitP_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $new_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $new_defns_admitP_meters$.getDynamicValue(thread), cons(list(col, v_term, mt), gethash($ARGS, $new_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return new_defns_admitP_metered(col, v_term, mt);
    }

    public static final SubLObject defns_admitP_int_alt(SubLObject col, SubLObject v_term, SubLObject mt, SubLObject quotedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != obsolete.reifiable_natP(col, UNPROVIDED, UNPROVIDED)) {
                col = narts_high.find_nart(col);
            }
            if (NIL != at_vars.permitting_denotational_terms_admitted_by_defn_via_isaP()) {
                if (NIL != quotedP) {
                    if (NIL != isa.quoted_isaP(v_term, col, mt, UNPROVIDED)) {
                        return T;
                    }
                } else {
                    if (NIL != isa.isaP(v_term, col, mt, UNPROVIDED)) {
                        return T;
                    }
                }
            }
            if (!((NIL != forts.fort_p(col)) || (NIL != com.cyc.cycjava.cycl.defns.has_suf_defn_somewhereP(col, quotedP)))) {
                return NIL;
            }
            {
                SubLObject admittedP = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
                    SubLObject _prev_bind_2 = at_vars.$defn_col_history$.currentBinding(thread);
                    SubLObject _prev_bind_3 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
                    try {
                        at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
                        at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
                        at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
                        at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
                        try {
                            {
                                SubLObject pcase_var = com.cyc.cycjava.cycl.defns.initial_check_defn_admit_status(col, v_term, mt, quotedP);
                                if (pcase_var.eql($ADMITTED)) {
                                    admittedP = T;
                                } else {
                                    if (pcase_var.eql($REJECTED)) {
                                        admittedP = NIL;
                                    } else {
                                        if (NIL != com.cyc.cycjava.cycl.defns.defns_walk_admitP(col, v_term, mt, quotedP)) {
                                            admittedP = T;
                                        } else {
                                            if ((NIL == quotedP) && (NIL != cycl_grammar.fast_quote_term_p(v_term))) {
                                                {
                                                    SubLObject denoted_term = czer_main.unquote_quoted_term(v_term, UNPROVIDED);
                                                    if ((NIL != denoted_term) && (NIL != at_defns.quoted_defns_admitP(col, denoted_term, mt))) {
                                                        admittedP = T;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    at_defns.clear_defn_space();
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        at_vars.$quoted_defn_col_history$.rebind(_prev_bind_3, thread);
                        at_vars.$defn_col_history$.rebind(_prev_bind_2, thread);
                        at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_1, thread);
                        at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
                    }
                }
                return admittedP;
            }
        }
    }

    public static SubLObject defns_admitP_int(SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != obsolete.reifiable_natP(col, UNPROVIDED, UNPROVIDED)) {
            col = narts_high.find_nart(col);
        }
        if (NIL != at_vars.permitting_denotational_terms_admitted_by_defn_via_isaP()) {
            if (NIL != quotedP) {
                if (NIL != isa.quoted_isaP(v_term, col, mt, UNPROVIDED)) {
                    return T;
                }
            } else
                if (NIL != isa.isaP(v_term, col, mt, UNPROVIDED)) {
                    return T;
                }

        }
        if ((NIL == forts.fort_p(col)) && (NIL == has_suf_defn_somewhereP(col, quotedP))) {
            return NIL;
        }
        SubLObject admittedP = NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject pcase_var = initial_check_defn_admit_status(col, v_term, mt, quotedP);
                if (pcase_var.eql($ADMITTED)) {
                    admittedP = T;
                } else
                    if (pcase_var.eql($REJECTED)) {
                        admittedP = NIL;
                    } else
                        if (NIL != defns_walk_admitP(col, v_term, mt, quotedP)) {
                            admittedP = T;
                        } else
                            if ((NIL == quotedP) && (NIL != cycl_grammar.fast_quote_term_p(v_term))) {
                                final SubLObject denoted_term = czer_main.unquote_quoted_term(v_term, UNPROVIDED);
                                if ((NIL != denoted_term) && (NIL != at_defns.quoted_defns_admitP(col, denoted_term, mt))) {
                                    admittedP = T;
                                }
                            }



            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    at_defns.clear_defn_space();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return admittedP;
    }

    public static final SubLObject reset_new_defns_rejectP_meters_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash($CALLS, $new_defns_rejectP_meters$.getDynamicValue(thread), ZERO_INTEGER);
            sethash($TIMES, $new_defns_rejectP_meters$.getDynamicValue(thread), NIL);
            sethash($RESULTS, $new_defns_rejectP_meters$.getDynamicValue(thread), NIL);
            sethash($ARGS, $new_defns_rejectP_meters$.getDynamicValue(thread), NIL);
            sethash($ARG_LIST, $new_defns_rejectP_meters$.getDynamicValue(thread), $list_alt7);
            sethash($FUNCTION, $new_defns_rejectP_meters$.getDynamicValue(thread), $sym16$NEW_DEFNS_REJECT_);
            return NIL;
        }
    }

    public static SubLObject reset_new_defns_rejectP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $new_defns_rejectP_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $new_defns_rejectP_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $new_defns_rejectP_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $new_defns_rejectP_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $new_defns_rejectP_meters$.getDynamicValue(thread), $list18);
        sethash($FUNCTION, $new_defns_rejectP_meters$.getDynamicValue(thread), $sym26$NEW_DEFNS_REJECT_);
        return NIL;
    }

    public static final SubLObject new_defns_rejectP_metered_alt(SubLObject col, SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.defns.defns_rejectP_int(col, v_term, mt, NIL);
    }

    public static SubLObject new_defns_rejectP_metered(final SubLObject col, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return defns_rejectP_int(col, v_term, mt, NIL);
    }

    public static final SubLObject new_defns_rejectP_alt(SubLObject col, SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
                {
                    SubLObject result = NIL;
                    SubLObject run_time = NIL;
                    SubLObject time_var = get_internal_real_time();
                    result = com.cyc.cycjava.cycl.defns.new_defns_rejectP_metered(col, v_term, mt);
                    run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    sethash($CALLS, $new_defns_rejectP_meters$.getDynamicValue(thread), add(gethash($CALLS, $new_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
                    sethash($TIMES, $new_defns_rejectP_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $new_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
                    sethash($RESULTS, $new_defns_rejectP_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $new_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
                    sethash($ARGS, $new_defns_rejectP_meters$.getDynamicValue(thread), cons(list(col, v_term, mt), gethash($ARGS, $new_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
                    return result;
                }
            } else {
                return com.cyc.cycjava.cycl.defns.new_defns_rejectP_metered(col, v_term, mt);
            }
        }
    }

    public static SubLObject new_defns_rejectP(final SubLObject col, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = new_defns_rejectP_metered(col, v_term, mt);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $new_defns_rejectP_meters$.getDynamicValue(thread), add(gethash($CALLS, $new_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $new_defns_rejectP_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $new_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $new_defns_rejectP_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $new_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $new_defns_rejectP_meters$.getDynamicValue(thread), cons(list(col, v_term, mt), gethash($ARGS, $new_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return new_defns_rejectP_metered(col, v_term, mt);
    }

    public static final SubLObject defns_rejectP_int_alt(SubLObject col, SubLObject v_term, SubLObject mt, SubLObject quotedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != obsolete.reifiable_natP(col, UNPROVIDED, UNPROVIDED)) {
                col = narts_high.find_nart(col);
            }
            if (NIL != at_vars.permitting_denotational_terms_admitted_by_defn_via_isaP()) {
                if (NIL != quotedP) {
                    if (NIL != isa.quoted_isaP(v_term, col, mt, UNPROVIDED)) {
                        return NIL;
                    }
                } else {
                    if (NIL != isa.isaP(v_term, col, mt, UNPROVIDED)) {
                        return NIL;
                    }
                }
            }
            if (NIL == forts.fort_p(col)) {
                return NIL;
            }
            {
                SubLObject rejectedP = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
                    SubLObject _prev_bind_2 = at_vars.$defn_col_history$.currentBinding(thread);
                    SubLObject _prev_bind_3 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
                    try {
                        at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
                        at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
                        at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
                        at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
                        try {
                            {
                                SubLObject pcase_var = com.cyc.cycjava.cycl.defns.initial_check_defn_admit_status(col, v_term, mt, quotedP);
                                if (pcase_var.eql($ADMITTED)) {
                                    rejectedP = NIL;
                                } else {
                                    if (pcase_var.eql($REJECTED)) {
                                        rejectedP = T;
                                    } else {
                                        if (NIL != com.cyc.cycjava.cycl.defns.nec_defn_rejectsP(col, v_term, mt, quotedP, UNPROVIDED)) {
                                            rejectedP = T;
                                        } else {
                                            if ((NIL == quotedP) && (NIL != cycl_grammar.fast_quote_term_p(v_term))) {
                                                {
                                                    SubLObject denoted_term = czer_main.unquote_quoted_term(v_term, UNPROVIDED);
                                                    if ((NIL != denoted_term) && (NIL != at_defns.quoted_defns_rejectP(col, denoted_term, mt))) {
                                                        rejectedP = T;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    at_defns.clear_defn_space();
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                }
                            }
                        }
                    } finally {
                        at_vars.$quoted_defn_col_history$.rebind(_prev_bind_3, thread);
                        at_vars.$defn_col_history$.rebind(_prev_bind_2, thread);
                        at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_1, thread);
                        at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
                    }
                }
                return rejectedP;
            }
        }
    }

    public static SubLObject defns_rejectP_int(SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != obsolete.reifiable_natP(col, UNPROVIDED, UNPROVIDED)) {
            col = narts_high.find_nart(col);
        }
        if (NIL != at_vars.permitting_denotational_terms_admitted_by_defn_via_isaP()) {
            if (NIL != quotedP) {
                if (NIL != isa.quoted_isaP(v_term, col, mt, UNPROVIDED)) {
                    return NIL;
                }
            } else
                if (NIL != isa.isaP(v_term, col, mt, UNPROVIDED)) {
                    return NIL;
                }

        }
        if (NIL == forts.fort_p(col)) {
            return NIL;
        }
        SubLObject rejectedP = NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject pcase_var = initial_check_defn_admit_status(col, v_term, mt, quotedP);
                if (pcase_var.eql($ADMITTED)) {
                    rejectedP = NIL;
                } else
                    if (pcase_var.eql($REJECTED)) {
                        rejectedP = T;
                    } else
                        if (NIL != nec_defn_rejectsP(col, v_term, mt, quotedP, UNPROVIDED)) {
                            rejectedP = T;
                        } else
                            if ((NIL == quotedP) && (NIL != cycl_grammar.fast_quote_term_p(v_term))) {
                                final SubLObject denoted_term = czer_main.unquote_quoted_term(v_term, UNPROVIDED);
                                if ((NIL != denoted_term) && (NIL != at_defns.quoted_defns_rejectP(col, denoted_term, mt))) {
                                    rejectedP = T;
                                }
                            }



            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    at_defns.clear_defn_space();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        if ((NIL == rejectedP) && ($REJECTED == final_check_defn_admit_status(col, v_term, mt, quotedP))) {
            rejectedP = T;
        }
        return rejectedP;
    }

    public static final SubLObject reset_new_quoted_defns_admitP_meters_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash($CALLS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), ZERO_INTEGER);
            sethash($TIMES, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), NIL);
            sethash($RESULTS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), NIL);
            sethash($ARGS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), NIL);
            sethash($ARG_LIST, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), $list_alt7);
            sethash($FUNCTION, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), $sym20$NEW_QUOTED_DEFNS_ADMIT_);
            return NIL;
        }
    }

    public static SubLObject reset_new_quoted_defns_admitP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), $list18);
        sethash($FUNCTION, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), $sym29$NEW_QUOTED_DEFNS_ADMIT_);
        return NIL;
    }

    public static final SubLObject new_quoted_defns_admitP_metered_alt(SubLObject col, SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.defns.defns_admitP_int(col, v_term, mt, T);
    }

    public static SubLObject new_quoted_defns_admitP_metered(final SubLObject col, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return defns_admitP_int(col, v_term, mt, T);
    }

    public static final SubLObject new_quoted_defns_admitP_alt(SubLObject col, SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
                {
                    SubLObject result = NIL;
                    SubLObject run_time = NIL;
                    SubLObject time_var = get_internal_real_time();
                    result = com.cyc.cycjava.cycl.defns.new_quoted_defns_admitP_metered(col, v_term, mt);
                    run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    sethash($CALLS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), add(gethash($CALLS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
                    sethash($TIMES, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
                    sethash($RESULTS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
                    sethash($ARGS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), cons(list(col, v_term, mt), gethash($ARGS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
                    return result;
                }
            } else {
                return com.cyc.cycjava.cycl.defns.new_quoted_defns_admitP_metered(col, v_term, mt);
            }
        }
    }

    public static SubLObject new_quoted_defns_admitP(final SubLObject col, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = new_quoted_defns_admitP_metered(col, v_term, mt);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), add(gethash($CALLS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), cons(list(col, v_term, mt), gethash($ARGS, $new_quoted_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return new_quoted_defns_admitP_metered(col, v_term, mt);
    }

    public static final SubLObject reset_new_quoted_defns_rejectP_meters_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash($CALLS, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), ZERO_INTEGER);
            sethash($TIMES, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), NIL);
            sethash($RESULTS, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), NIL);
            sethash($ARGS, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), NIL);
            sethash($ARG_LIST, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), $list_alt7);
            sethash($FUNCTION, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), $sym24$NEW_QUOTED_DEFNS_REJECT_);
            return NIL;
        }
    }

    public static SubLObject reset_new_quoted_defns_rejectP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), $list18);
        sethash($FUNCTION, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), $sym32$NEW_QUOTED_DEFNS_REJECT_);
        return NIL;
    }

    public static final SubLObject new_quoted_defns_rejectP_metered_alt(SubLObject col, SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.defns.defns_rejectP_int(col, v_term, mt, T);
    }

    public static SubLObject new_quoted_defns_rejectP_metered(final SubLObject col, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return defns_rejectP_int(col, v_term, mt, T);
    }

    public static final SubLObject new_quoted_defns_rejectP_alt(SubLObject col, SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
                {
                    SubLObject result = NIL;
                    SubLObject run_time = NIL;
                    SubLObject time_var = get_internal_real_time();
                    result = com.cyc.cycjava.cycl.defns.new_quoted_defns_rejectP_metered(col, v_term, mt);
                    run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    sethash($CALLS, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), add(gethash($CALLS, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
                    sethash($TIMES, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
                    sethash($RESULTS, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
                    sethash($ARGS, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), cons(list(col, v_term, mt), gethash($ARGS, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
                    return result;
                }
            } else {
                return com.cyc.cycjava.cycl.defns.new_quoted_defns_rejectP_metered(col, v_term, mt);
            }
        }
    }

    public static SubLObject new_quoted_defns_rejectP(final SubLObject col, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = new_quoted_defns_rejectP_metered(col, v_term, mt);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), add(gethash($CALLS, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), cons(list(col, v_term, mt), gethash($ARGS, $new_quoted_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return new_quoted_defns_rejectP_metered(col, v_term, mt);
    }

    /**
     * If the defnIff of the COL explicitly admits or rejects TERM, return result.
     * Otherwise, return :rejected if a  necessaryDefn of genls of COL rejects the TERM.
     * Will delegate to the correct defns checks for quoted/non-quoted using QUOTED?
     */
    @LispMethod(comment = "If the defnIff of the COL explicitly admits or rejects TERM, return result.\r\nOtherwise, return :rejected if a  necessaryDefn of genls of COL rejects the TERM.\r\nWill delegate to the correct defns checks for quoted/non-quoted using QUOTED?\nIf the defnIff of the COL explicitly admits or rejects TERM, return result.\nOtherwise, return :rejected if a  necessaryDefn of genls of COL rejects the TERM.\nWill delegate to the correct defns checks for quoted/non-quoted using QUOTED?")
    public static final SubLObject initial_check_defn_admit_status_alt(SubLObject col, SubLObject v_term, SubLObject mt, SubLObject quotedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject admit_status = com.cyc.cycjava.cycl.defns.defining_defns_admitsP(col, v_term, mt, quotedP);
                SubLObject doneP = NIL;
                SubLObject pcase_var = admit_status;
                if (pcase_var.eql($ADMITTED)) {
                } else {
                    if (pcase_var.eql($REJECTED)) {
                    } else {
                        if (NIL != at_vars.$at_apply_necessary_defnsP$.getDynamicValue(thread)) {
                            {
                                SubLObject _prev_bind_0 = at_vars.$defn_collection$.currentBinding(thread);
                                try {
                                    at_vars.$defn_collection$.bind(col, thread);
                                    if (NIL == doneP) {
                                        {
                                            SubLObject node_var = col;
                                            SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                            SubLObject recur_deck = deck.create_deck(deck_type);
                                            {
                                                SubLObject _prev_bind_0_3 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                    {
                                                        SubLObject mt_var = mt;
                                                        {
                                                            SubLObject _prev_bind_0_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                            try {
                                                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                                {
                                                                    SubLObject tv_var = NIL;
                                                                    {
                                                                        SubLObject _prev_bind_0_5 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_6 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                                            if (NIL != tv_var) {
                                                                                if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                                    if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                        {
                                                                                            SubLObject pcase_var_7 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                                            if (pcase_var_7.eql($ERROR)) {
                                                                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                            } else {
                                                                                                if (pcase_var_7.eql($CERROR)) {
                                                                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                } else {
                                                                                                    if (pcase_var_7.eql($WARN)) {
                                                                                                        Errors.warn($str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                                    } else {
                                                                                                        Errors.warn($str_alt36$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                                        Errors.cerror($$$continue_anyway, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            {
                                                                                SubLObject _prev_bind_0_8 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_9 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                                SubLObject _prev_bind_2_10 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_11 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1_12 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_2_13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                                                while ((NIL != node_var) && (NIL == doneP)) {
                                                                                                    {
                                                                                                        SubLObject genl = node_var;
                                                                                                        if (genl != col) {
                                                                                                            if (NIL != com.cyc.cycjava.cycl.defns.nec_defn_rejectsP(genl, v_term, mt, quotedP, T)) {
                                                                                                                doneP = T;
                                                                                                                admit_status = $REJECTED;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    {
                                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                                                        SubLObject rest = NIL;
                                                                                                        for (rest = accessible_modules; !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                                                                                            {
                                                                                                                SubLObject module_var = rest.first();
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_14 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                                    SubLObject _prev_bind_1_15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                                        {
                                                                                                                            SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                                {
                                                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                    if (NIL != d_link) {
                                                                                                                                        {
                                                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                            if (NIL != mt_links) {
                                                                                                                                                {
                                                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                                    while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        {
                                                                                                                                                            SubLObject mt_16 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_16)) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject _prev_bind_0_17 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                                    try {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_16, thread);
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject iteration_state_18 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                            while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_18)))) {
                                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_18);
                                                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                                        {
                                                                                                                                                                                            SubLObject _prev_bind_0_19 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                            try {
                                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                                {
                                                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                                    SubLObject rest_20 = NIL;
                                                                                                                                                                                                    for (rest_20 = new_list; !((NIL != doneP) || (NIL == rest_20)); rest_20 = rest_20.rest()) {
                                                                                                                                                                                                        {
                                                                                                                                                                                                            SubLObject node_vars_link_node = rest_20.first();
                                                                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            } finally {
                                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_19, thread);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    iteration_state_18 = dictionary_contents.do_dictionary_contents_next(iteration_state_18);
                                                                                                                                                                                }
                                                                                                                                                                            } 
                                                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_18);
                                                                                                                                                                        }
                                                                                                                                                                    } finally {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_17, thread);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                                        }
                                                                                                                                                    } 
                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt38$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                                    {
                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                        SubLObject rest_21 = NIL;
                                                                                                                                        for (rest_21 = new_list; !((NIL != doneP) || (NIL == rest_21)); rest_21 = rest_21.rest()) {
                                                                                                                                            {
                                                                                                                                                SubLObject generating_fn = rest_21.first();
                                                                                                                                                {
                                                                                                                                                    SubLObject _prev_bind_0_22 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                                    try {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                                        {
                                                                                                                                                            SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                                            SubLObject new_list_23 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                            SubLObject rest_24 = NIL;
                                                                                                                                                            for (rest_24 = new_list_23; !((NIL != doneP) || (NIL == rest_24)); rest_24 = rest_24.rest()) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject node_vars_link_node = rest_24.first();
                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } finally {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_22, thread);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_15, thread);
                                                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_14, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    node_var = deck.deck_pop(recur_deck);
                                                                                                } 
                                                                                            } finally {
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_13, thread);
                                                                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_12, thread);
                                                                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_11, thread);
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt39$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_10, thread);
                                                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_9, thread);
                                                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_8, thread);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_6, thread);
                                                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_5, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_4, thread);
                                                            }
                                                        }
                                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                    }
                                                } finally {
                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_3, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    at_vars.$defn_collection$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return admit_status;
            }
        }
    }

    /**
     * If the defnIff of the COL explicitly admits or rejects TERM, return result.
     * Otherwise, return :rejected if a  necessaryDefn of genls of COL rejects the TERM.
     * Will delegate to the correct defns checks for quoted/non-quoted using QUOTED?
     */
    @LispMethod(comment = "If the defnIff of the COL explicitly admits or rejects TERM, return result.\r\nOtherwise, return :rejected if a  necessaryDefn of genls of COL rejects the TERM.\r\nWill delegate to the correct defns checks for quoted/non-quoted using QUOTED?\nIf the defnIff of the COL explicitly admits or rejects TERM, return result.\nOtherwise, return :rejected if a  necessaryDefn of genls of COL rejects the TERM.\nWill delegate to the correct defns checks for quoted/non-quoted using QUOTED?")
    public static SubLObject initial_check_defn_admit_status(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject admit_status = defining_defns_admitsP(col, v_term, mt, quotedP);
        SubLObject doneP = NIL;
        final SubLObject pcase_var = admit_status;
        if (!pcase_var.eql($ADMITTED)) {
            if (!pcase_var.eql($REJECTED)) {
                if (NIL != at_vars.$at_apply_necessary_defnsP$.getDynamicValue(thread)) {
                    final SubLObject _prev_bind_0 = at_vars.$defn_collection$.currentBinding(thread);
                    try {
                        at_vars.$defn_collection$.bind(col, thread);
                        if (NIL == doneP) {
                            SubLObject node_var = col;
                            final SubLObject deck_type = $STACK;
                            final SubLObject recur_deck = deck.create_deck(deck_type);
                            final SubLObject _prev_bind_0_$5 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                try {
                                    final SubLObject _prev_bind_0_$6 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                                        final SubLObject tv_var = NIL;
                                        final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                                final SubLObject pcase_var_$9 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                if (pcase_var_$9.eql($ERROR)) {
                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                } else
                                                    if (pcase_var_$9.eql($CERROR)) {
                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else
                                                        if (pcase_var_$9.eql($WARN)) {
                                                            Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                        } else {
                                                            Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                            Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                        }


                                            }
                                            final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$9 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$12 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                    final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$10 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                        while ((NIL != node_var) && (NIL == doneP)) {
                                                            final SubLObject genl = node_var;
                                                            if ((!genl.eql(col)) && (NIL != nec_defn_rejectsP(genl, v_term, mt, quotedP, T))) {
                                                                doneP = T;
                                                                admit_status = $REJECTED;
                                                            }
                                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                            SubLObject rest;
                                                            SubLObject module_var;
                                                            SubLObject _prev_bind_0_$10;
                                                            SubLObject _prev_bind_1_$11;
                                                            SubLObject node;
                                                            SubLObject d_link;
                                                            SubLObject mt_links;
                                                            SubLObject iteration_state;
                                                            SubLObject mt_$18;
                                                            SubLObject tv_links;
                                                            SubLObject _prev_bind_0_$11;
                                                            SubLObject iteration_state_$20;
                                                            SubLObject tv;
                                                            SubLObject link_nodes;
                                                            SubLObject _prev_bind_0_$12;
                                                            SubLObject sol;
                                                            SubLObject set_contents_var;
                                                            SubLObject basis_object;
                                                            SubLObject state;
                                                            SubLObject node_vars_link_node;
                                                            SubLObject csome_list_var;
                                                            SubLObject node_vars_link_node2;
                                                            SubLObject new_list;
                                                            SubLObject rest_$22;
                                                            SubLObject generating_fn;
                                                            SubLObject _prev_bind_0_$13;
                                                            SubLObject sol2;
                                                            SubLObject link_nodes2;
                                                            SubLObject set_contents_var2;
                                                            SubLObject basis_object2;
                                                            SubLObject state2;
                                                            SubLObject node_vars_link_node3;
                                                            SubLObject csome_list_var2;
                                                            SubLObject node_vars_link_node4;
                                                            for (rest = NIL, rest = accessible_modules; (NIL == doneP) && (NIL != rest); rest = rest.rest()) {
                                                                module_var = rest.first();
                                                                _prev_bind_0_$10 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                _prev_bind_1_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                    node = function_terms.naut_to_nart(node_var);
                                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        if (NIL != d_link) {
                                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                            if (NIL != mt_links) {
                                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == doneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                    thread.resetMultipleValues();
                                                                                    mt_$18 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                    tv_links = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$18)) {
                                                                                        _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$18, thread);
                                                                                            for (iteration_state_$20 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == doneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$20)); iteration_state_$20 = dictionary_contents.do_dictionary_contents_next(iteration_state_$20)) {
                                                                                                thread.resetMultipleValues();
                                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$20);
                                                                                                link_nodes = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                    _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                        sol = link_nodes;
                                                                                                        if (NIL != set.set_p(sol)) {
                                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == doneP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                }
                                                                                                            }
                                                                                                        } else
                                                                                                            if (sol.isList()) {
                                                                                                                if (NIL == doneP) {
                                                                                                                    csome_list_var = sol;
                                                                                                                    node_vars_link_node2 = NIL;
                                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                        }
                                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                                    } 
                                                                                                                }
                                                                                                            } else {
                                                                                                                Errors.error($str46$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                            }

                                                                                                    } finally {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$12, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$20);
                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$11, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                            }
                                                                        } else {
                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str47$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        }
                                                                    } else
                                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                            new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                            for (rest_$22 = NIL, rest_$22 = new_list; (NIL == doneP) && (NIL != rest_$22); rest_$22 = rest_$22.rest()) {
                                                                                generating_fn = rest_$22.first();
                                                                                _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                    link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                                    if (NIL != set.set_p(sol2)) {
                                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == doneP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol2.isList()) {
                                                                                            if (NIL == doneP) {
                                                                                                csome_list_var2 = sol2;
                                                                                                node_vars_link_node4 = NIL;
                                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                                while ((NIL == doneP) && (NIL != csome_list_var2)) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                                } 
                                                                                            }
                                                                                        } else {
                                                                                            Errors.error($str46$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$13, thread);
                                                                                }
                                                                            }
                                                                        }

                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$11, thread);
                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$10, thread);
                                                                }
                                                            }
                                                            node_var = deck.deck_pop(recur_deck);
                                                        } 
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$13, thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$10, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$9, thread);
                                                    }
                                                } else {
                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str48$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            } finally {
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$12, thread);
                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$9, thread);
                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$8, thread);
                                            }
                                        } finally {
                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$8, thread);
                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$7, thread);
                                        }
                                    } finally {
                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$6, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                                    }
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                    } finally {
                        at_vars.$defn_collection$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        return admit_status;
    }

    public static SubLObject final_check_defn_admit_status(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject admit_status = NIL;
        if (NIL != at_vars.$at_additional_defn_checking$.getDynamicValue(thread)) {
            final SubLObject _prev_bind_0 = at_vars.$defn_collection$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sdc.$ignoring_sdcP$.currentBinding(thread);
            try {
                at_vars.$defn_collection$.bind(col, thread);
                sdc.$ignoring_sdcP$.bind(eq(at_vars.$at_additional_defn_checking$.getDynamicValue(thread), $DISJOINT), thread);
                final SubLObject admitting_cols = (NIL != quotedP) ? all_quoted_defn_admits(v_term, mt) : all_defn_admits(v_term, mt);
                if (NIL != disjoint_with.any_disjoint_with_anyP_memoized(admitting_cols, list(col), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    admit_status = $REJECTED;
                }
            } finally {
                sdc.$ignoring_sdcP$.rebind(_prev_bind_2, thread);
                at_vars.$defn_collection$.rebind(_prev_bind_0, thread);
            }
        }
        return admit_status;
    }

    public static final SubLObject defns_walk_admitP_alt(SubLObject col, SubLObject v_term, SubLObject mt, SubLObject quotedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $defn_term$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $org_collection$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $failing_suf_defns$.currentBinding(thread);
                    try {
                        $defn_term$.bind(v_term, thread);
                        $org_collection$.bind(col, thread);
                        $failing_suf_defns$.bind(NIL, thread);
                        if (NIL != quotedP) {
                            result = sbhl_search_methods.sbhl_simply_gather_first_among_all_backward_true_nodes_with_prune(sbhl_module_vars.get_sbhl_module($$genls), col, symbol_function($sym40$COL_QUOTED_DEFN_ADMITS_), mt, UNPROVIDED, UNPROVIDED);
                        } else {
                            result = sbhl_search_methods.sbhl_simply_gather_first_among_all_backward_true_nodes_with_prune(sbhl_module_vars.get_sbhl_module($$genls), col, symbol_function($sym41$COL_DEFN_ADMITS_), mt, UNPROVIDED, UNPROVIDED);
                        }
                        if ((((NIL == result) && (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) && (NIL != wff_vars.$include_suf_defn_violationsP$.getDynamicValue(thread))) && (NIL != $failing_suf_defns$.getDynamicValue(thread))) {
                            if (NIL != at_utilities.note_at_violationP()) {
                                at_routines.note_at_violations(com.cyc.cycjava.cycl.defns.sufficient_defn_violations(col, v_term, $failing_suf_defns$.getDynamicValue(thread), quotedP, mt));
                            }
                        }
                    } finally {
                        $failing_suf_defns$.rebind(_prev_bind_2, thread);
                        $org_collection$.rebind(_prev_bind_1, thread);
                        $defn_term$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject defns_walk_admitP(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $defn_term$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $org_collection$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $failing_suf_defns$.currentBinding(thread);
        try {
            $defn_term$.bind(v_term, thread);
            $org_collection$.bind(col, thread);
            $failing_suf_defns$.bind(NIL, thread);
            if (NIL != quotedP) {
                result = sbhl_search_methods.sbhl_simply_gather_first_among_all_backward_true_nodes_with_prune(sbhl_module_vars.get_sbhl_module($$genls), col, symbol_function($sym50$COL_QUOTED_DEFN_ADMITS_), mt, UNPROVIDED, UNPROVIDED);
            } else {
                result = sbhl_search_methods.sbhl_simply_gather_first_among_all_backward_true_nodes_with_prune(sbhl_module_vars.get_sbhl_module($$genls), col, symbol_function($sym51$COL_DEFN_ADMITS_), mt, UNPROVIDED, UNPROVIDED);
            }
            if (((((NIL == result) && (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) && (NIL != wff_vars.$include_suf_defn_violationsP$.getDynamicValue(thread))) && (NIL != $failing_suf_defns$.getDynamicValue(thread))) && (NIL != at_utilities.note_at_violationP())) {
                at_routines.note_at_violations(sufficient_defn_violations(col, v_term, $failing_suf_defns$.getDynamicValue(thread), quotedP, mt));
            }
        } finally {
            $failing_suf_defns$.rebind(_prev_bind_3, thread);
            $org_collection$.rebind(_prev_bind_2, thread);
            $defn_term$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject sufficient_defn_violations_alt(SubLObject col, SubLObject v_term, SubLObject v_defns, SubLObject quotedP, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == dictionary.dictionary_p(at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue(thread))) {
                return list(at_defns.sufficient_defn_violation_data(col, v_term, v_defns, quotedP, mt));
            }
            {
                SubLObject constraints = dictionary.dictionary_lookup(at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue(thread), col, UNPROVIDED);
                SubLObject violations = NIL;
                SubLObject cdolist_list_var = constraints;
                SubLObject constraint_details = NIL;
                for (constraint_details = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_details = cdolist_list_var.first()) {
                    violations = cons(com.cyc.cycjava.cycl.defns.sufficient_defn_violation(col, v_term, v_defns, quotedP, mt, constraint_details), violations);
                }
                return violations;
            }
        }
    }

    public static SubLObject sufficient_defn_violations(final SubLObject col, final SubLObject v_term, final SubLObject v_defns, final SubLObject quotedP, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == dictionary.dictionary_p(at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue(thread))) {
            return list(at_defns.sufficient_defn_violation_data(col, v_term, v_defns, quotedP, mt));
        }
        final SubLObject constraints = dictionary.dictionary_lookup(at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue(thread), col, UNPROVIDED);
        SubLObject violations = NIL;
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint_details = NIL;
        constraint_details = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            violations = cons(sufficient_defn_violation(col, v_term, v_defns, quotedP, mt, constraint_details), violations);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_details = cdolist_list_var.first();
        } 
        return violations;
    }

    public static final SubLObject sufficient_defn_violation_alt(SubLObject col, SubLObject v_term, SubLObject v_defns, SubLObject quotedP, SubLObject mt, SubLObject constraint_details) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject data = NIL;
                SubLObject datum = constraint_details;
                SubLObject current = datum;
                SubLObject constraint_reln = NIL;
                SubLObject via = NIL;
                SubLObject constraint_gaf = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt42);
                constraint_reln = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt42);
                via = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt42);
                constraint_gaf = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((NIL != constraint_reln) && (NIL != at_vars.$at_reln$.getDynamicValue(thread))) {
                        if (constraint_reln != at_vars.$at_reln$.getDynamicValue(thread)) {
                            data = cons(list(via, constraint_reln), data);
                        }
                    }
                    if ((NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue(thread)) && (NIL != constraint_gaf)) {
                        data = cons(list($AT_CONSTRAINT_GAF, constraint_gaf), data);
                    }
                    if (NIL != mt) {
                        data = cons(mt, data);
                    } else {
                        data = cons(mt_relevance_macros.$mt$.getDynamicValue(thread), data);
                    }
                    if (NIL != quotedP) {
                        return listS($MAL_ARG_WRT_QUOTED_SUF_DEFNS, new SubLObject[]{ v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), col, v_defns, data });
                    } else {
                        return listS($MAL_ARG_WRT_SUF_DEFNS, new SubLObject[]{ v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), col, v_defns, data });
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt42);
                }
            }
            return NIL;
        }
    }

    public static SubLObject sufficient_defn_violation(final SubLObject col, final SubLObject v_term, final SubLObject v_defns, final SubLObject quotedP, final SubLObject mt, final SubLObject constraint_details) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data = NIL;
        SubLObject constraint_reln = NIL;
        SubLObject via = NIL;
        SubLObject constraint_gaf = NIL;
        destructuring_bind_must_consp(constraint_details, constraint_details, $list52);
        constraint_reln = constraint_details.first();
        SubLObject current = constraint_details.rest();
        destructuring_bind_must_consp(current, constraint_details, $list52);
        via = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, constraint_details, $list52);
        constraint_gaf = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(constraint_details, $list52);
            return NIL;
        }
        if (((NIL != constraint_reln) && (NIL != at_vars.$at_reln$.getDynamicValue(thread))) && (!constraint_reln.eql(at_vars.$at_reln$.getDynamicValue(thread)))) {
            data = cons(list(via, constraint_reln), data);
        }
        if ((NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue(thread)) && (NIL != constraint_gaf)) {
            data = cons(list($AT_CONSTRAINT_GAF, constraint_gaf), data);
        }
        if (NIL != mt) {
            data = cons(mt, data);
        } else {
            data = cons(mt_relevance_macros.$mt$.getDynamicValue(thread), data);
        }
        if (NIL != quotedP) {
            return listS($MAL_ARG_WRT_QUOTED_SUF_DEFNS, new SubLObject[]{ v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), col, v_defns, data });
        }
        return listS($MAL_ARG_WRT_SUF_DEFNS, new SubLObject[]{ v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), col, v_defns, data });
    }

    public static final SubLObject col_defn_admitsP_alt(SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.defns.col_defn_admitsP_int(col, $defn_term$.getDynamicValue(thread), mt_relevance_macros.$mt$.getDynamicValue(thread), NIL);
        }
    }

    public static SubLObject col_defn_admitsP(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return col_defn_admitsP_int(col, $defn_term$.getDynamicValue(thread), mt_relevance_macros.$mt$.getDynamicValue(thread), NIL);
    }

    public static final SubLObject col_quoted_defn_admitsP_alt(SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.defns.col_defn_admitsP_int(col, $defn_term$.getDynamicValue(thread), mt_relevance_macros.$mt$.getDynamicValue(thread), T);
        }
    }

    public static SubLObject col_quoted_defn_admitsP(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return col_defn_admitsP_int(col, $defn_term$.getDynamicValue(thread), mt_relevance_macros.$mt$.getDynamicValue(thread), T);
    }

    public static final SubLObject col_defn_admitsP_int_alt(SubLObject col, SubLObject v_term, SubLObject mt, SubLObject quotedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == com.cyc.cycjava.cycl.defns.has_suf_defn_somewhereP(col, quotedP)) {
                return list(NIL, T);
            }
            if (NIL == com.cyc.cycjava.cycl.defns.has_some_defnP(col, quotedP)) {
                return list(NIL, NIL);
            }
            {
                SubLObject result = NIL;
                SubLObject doneP = NIL;
                SubLObject pcase_var = ($org_collection$.getDynamicValue(thread) == col) ? ((SubLObject) (T)) : com.cyc.cycjava.cycl.defns.defining_defns_admitsP(col, v_term, mt, quotedP);
                if (pcase_var.eql($ADMITTED)) {
                    result = T;
                    doneP = T;
                } else {
                    if (pcase_var.eql($REJECTED)) {
                        result = NIL;
                        doneP = T;
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.defns.nec_defn_permitsP(col, v_term, mt, quotedP, NIL)) {
                            if (NIL != com.cyc.cycjava.cycl.defns.suf_defn_admitsP(col, v_term, mt, quotedP)) {
                                result = T;
                                doneP = T;
                            }
                        } else {
                            result = NIL;
                            doneP = T;
                        }
                    }
                }
                return list(result, doneP);
            }
        }
    }

    public static SubLObject col_defn_admitsP_int(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == has_suf_defn_somewhereP(col, quotedP)) {
            return list(NIL, T);
        }
        if (NIL == has_some_defnP(col, quotedP)) {
            return list(NIL, NIL);
        }
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        final SubLObject pcase_var = ($org_collection$.getDynamicValue(thread).eql(col)) ? T : defining_defns_admitsP(col, v_term, mt, quotedP);
        if (pcase_var.eql($ADMITTED)) {
            result = T;
            doneP = T;
        } else
            if (pcase_var.eql($REJECTED)) {
                result = NIL;
                doneP = T;
            } else
                if (NIL != nec_defn_permitsP(col, v_term, mt, quotedP, NIL)) {
                    if (NIL != suf_defn_admitsP(col, v_term, mt, quotedP)) {
                        result = T;
                        doneP = T;
                    }
                } else {
                    result = NIL;
                    doneP = T;
                }


        return list(result, doneP);
    }

    public static final SubLObject defining_defns_admitsP_alt(SubLObject col, SubLObject v_term, SubLObject mt, SubLObject quotedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iff_defn = com.cyc.cycjava.cycl.defns.iff_defn(col, quotedP);
                SubLObject admit_status = NIL;
                if (NIL == iff_defn) {
                    return NIL;
                }
                {
                    SubLObject mt_var = mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            if ((NIL != assertions_high.valid_assertion(iff_defn, UNPROVIDED)) && (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(iff_defn)))) {
                                {
                                    SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(iff_defn));
                                    {
                                        SubLObject _prev_bind_0_25 = at_vars.$defn_collection$.currentBinding(thread);
                                        try {
                                            at_vars.$defn_collection$.bind(col, thread);
                                            if (NIL != at_defns.viable_defnP(defn, col)) {
                                                if (NIL != (NIL != quotedP ? ((SubLObject) (at_defns.quoted_defn_admitsP(defn, v_term, col, mt))) : at_defns.defn_admitsP(defn, v_term, col, mt))) {
                                                    admit_status = $ADMITTED;
                                                } else {
                                                    admit_status = $REJECTED;
                                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                        at_routines.note_at_violations(com.cyc.cycjava.cycl.defns.defining_defn_violations(col, v_term, defn, quotedP, mt));
                                                    }
                                                }
                                            }
                                        } finally {
                                            at_vars.$defn_collection$.rebind(_prev_bind_0_25, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return admit_status;
            }
        }
    }

    public static SubLObject defining_defns_admitsP(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iff_defn = iff_defn(col, quotedP);
        SubLObject admit_status = NIL;
        if (NIL == iff_defn) {
            return NIL;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            if ((NIL != assertions_high.valid_assertion(iff_defn, UNPROVIDED)) && (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(iff_defn)))) {
                final SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(iff_defn));
                final SubLObject _prev_bind_0_$25 = at_vars.$defn_collection$.currentBinding(thread);
                try {
                    at_vars.$defn_collection$.bind(col, thread);
                    if (NIL != at_defns.viable_defnP(defn, col)) {
                        if (NIL != (NIL != quotedP ? at_defns.quoted_defn_admitsP(defn, v_term, col, mt) : at_defns.defn_admitsP(defn, v_term, col, mt))) {
                            admit_status = $ADMITTED;
                        } else {
                            admit_status = $REJECTED;
                            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                at_routines.note_at_violations(defining_defn_violations(col, v_term, defn, quotedP, mt));
                            }
                        }
                    }
                } finally {
                    at_vars.$defn_collection$.rebind(_prev_bind_0_$25, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return admit_status;
    }

    public static final SubLObject defining_defn_violations_alt(SubLObject col, SubLObject v_term, SubLObject defn, SubLObject quotedP, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == dictionary.dictionary_p(at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue(thread))) {
                return list(at_defns.defining_defn_violation_data(col, v_term, defn, quotedP, mt));
            }
            {
                SubLObject constraints = dictionary.dictionary_lookup(at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue(thread), col, UNPROVIDED);
                SubLObject violations = NIL;
                SubLObject cdolist_list_var = constraints;
                SubLObject constraint_details = NIL;
                for (constraint_details = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_details = cdolist_list_var.first()) {
                    violations = cons(com.cyc.cycjava.cycl.defns.defining_defn_violation(col, v_term, defn, quotedP, mt, constraint_details), violations);
                }
                return violations;
            }
        }
    }

    public static SubLObject defining_defn_violations(final SubLObject col, final SubLObject v_term, final SubLObject defn, final SubLObject quotedP, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == dictionary.dictionary_p(at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue(thread))) {
            return list(at_defns.defining_defn_violation_data(col, v_term, defn, quotedP, mt));
        }
        final SubLObject constraints = dictionary.dictionary_lookup(at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue(thread), col, UNPROVIDED);
        SubLObject violations = NIL;
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint_details = NIL;
        constraint_details = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            violations = cons(defining_defn_violation(col, v_term, defn, quotedP, mt, constraint_details), violations);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_details = cdolist_list_var.first();
        } 
        return violations;
    }

    public static final SubLObject defining_defn_violation_alt(SubLObject col, SubLObject v_term, SubLObject defn, SubLObject quotedP, SubLObject mt, SubLObject constraint_details) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject data = NIL;
                SubLObject datum = constraint_details;
                SubLObject current = datum;
                SubLObject constraint_reln = NIL;
                SubLObject via = NIL;
                SubLObject constraint_gaf = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt42);
                constraint_reln = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt42);
                via = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt42);
                constraint_gaf = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((NIL != constraint_reln) && (NIL != at_vars.$at_reln$.getDynamicValue(thread))) {
                        if (constraint_reln != at_vars.$at_reln$.getDynamicValue(thread)) {
                            data = cons(list(via, constraint_reln), data);
                        }
                    }
                    if ((NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue(thread)) && (NIL != constraint_gaf)) {
                        data = cons(list($AT_CONSTRAINT_GAF, constraint_gaf), data);
                    }
                    if (NIL != mt) {
                        data = cons(mt, data);
                    } else {
                        data = cons(mt_relevance_macros.$mt$.getDynamicValue(thread), data);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt42);
                }
                if (NIL != quotedP) {
                    return listS($MAL_ARG_WRT_QUOTED_IFF_DEFN, new SubLObject[]{ v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), col, defn, data });
                } else {
                    return listS($MAL_ARG_WRT_IFF_DEFN, new SubLObject[]{ v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), col, defn, data });
                }
            }
        }
    }

    public static SubLObject defining_defn_violation(final SubLObject col, final SubLObject v_term, final SubLObject defn, final SubLObject quotedP, final SubLObject mt, final SubLObject constraint_details) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data = NIL;
        SubLObject constraint_reln = NIL;
        SubLObject via = NIL;
        SubLObject constraint_gaf = NIL;
        destructuring_bind_must_consp(constraint_details, constraint_details, $list52);
        constraint_reln = constraint_details.first();
        SubLObject current = constraint_details.rest();
        destructuring_bind_must_consp(current, constraint_details, $list52);
        via = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, constraint_details, $list52);
        constraint_gaf = current.first();
        current = current.rest();
        if (NIL == current) {
            if (((NIL != constraint_reln) && (NIL != at_vars.$at_reln$.getDynamicValue(thread))) && (!constraint_reln.eql(at_vars.$at_reln$.getDynamicValue(thread)))) {
                data = cons(list(via, constraint_reln), data);
            }
            if ((NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue(thread)) && (NIL != constraint_gaf)) {
                data = cons(list($AT_CONSTRAINT_GAF, constraint_gaf), data);
            }
            if (NIL != mt) {
                data = cons(mt, data);
            } else {
                data = cons(mt_relevance_macros.$mt$.getDynamicValue(thread), data);
            }
        } else {
            cdestructuring_bind_error(constraint_details, $list52);
        }
        if (NIL != quotedP) {
            return listS($MAL_ARG_WRT_QUOTED_IFF_DEFN, new SubLObject[]{ v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), col, defn, data });
        }
        return listS($MAL_ARG_WRT_IFF_DEFN, new SubLObject[]{ v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), col, defn, data });
    }

    public static final SubLObject suf_defn_admitsP_alt(SubLObject col, SubLObject v_term, SubLObject mt, SubLObject quotedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject suf_defns = com.cyc.cycjava.cycl.defns.suf_defns(col, quotedP);
                SubLObject admittedP = NIL;
                SubLObject doneP = NIL;
                if (NIL == suf_defns) {
                    return NIL;
                }
                {
                    SubLObject mt_var = mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            if (NIL == doneP) {
                                {
                                    SubLObject csome_list_var = suf_defns;
                                    SubLObject suf_defn = NIL;
                                    for (suf_defn = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , suf_defn = csome_list_var.first()) {
                                        if ((NIL != assertions_high.valid_assertion(suf_defn, UNPROVIDED)) && (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(suf_defn)))) {
                                            {
                                                SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(suf_defn));
                                                {
                                                    SubLObject _prev_bind_0_26 = at_vars.$defn_collection$.currentBinding(thread);
                                                    try {
                                                        at_vars.$defn_collection$.bind(col, thread);
                                                        if (NIL != at_defns.viable_defnP(defn, col)) {
                                                            if (NIL != (NIL != quotedP ? ((SubLObject) (at_defns.quiet_quoted_defn_admitsP(defn, v_term, col, mt))) : at_defns.quiet_defn_admitsP(defn, v_term, col, mt))) {
                                                                admittedP = T;
                                                                doneP = T;
                                                            } else {
                                                                admittedP = NIL;
                                                                doneP = NIL;
                                                                if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                    {
                                                                        SubLObject item_var = defn;
                                                                        if (NIL == member(item_var, $failing_suf_defns$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                            $failing_suf_defns$.setDynamicValue(cons(item_var, $failing_suf_defns$.getDynamicValue(thread)), thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        at_vars.$defn_collection$.rebind(_prev_bind_0_26, thread);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return admittedP;
            }
        }
    }

    public static SubLObject suf_defn_admitsP(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject suf_defns = suf_defns(col, quotedP);
        SubLObject admittedP = NIL;
        SubLObject doneP = NIL;
        if (NIL == suf_defns) {
            return NIL;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            if (NIL == doneP) {
                SubLObject csome_list_var = suf_defns;
                SubLObject suf_defn = NIL;
                suf_defn = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if ((NIL != assertions_high.valid_assertion(suf_defn, UNPROVIDED)) && (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(suf_defn)))) {
                        final SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(suf_defn));
                        final SubLObject _prev_bind_0_$26 = at_vars.$defn_collection$.currentBinding(thread);
                        try {
                            at_vars.$defn_collection$.bind(col, thread);
                            if (NIL != at_defns.viable_defnP(defn, col)) {
                                if (NIL != (NIL != quotedP ? at_defns.quiet_quoted_defn_admitsP(defn, v_term, col, mt) : at_defns.quiet_defn_admitsP(defn, v_term, col, mt))) {
                                    admittedP = T;
                                    doneP = T;
                                } else {
                                    admittedP = NIL;
                                    doneP = NIL;
                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                        final SubLObject item_var = defn;
                                        if (NIL == member(item_var, $failing_suf_defns$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                            $failing_suf_defns$.setDynamicValue(cons(item_var, $failing_suf_defns$.getDynamicValue(thread)), thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            at_vars.$defn_collection$.rebind(_prev_bind_0_$26, thread);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    suf_defn = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return admittedP;
    }

    public static final SubLObject nec_defn_permitsP_alt(SubLObject col, SubLObject v_term, SubLObject mt, SubLObject quotedP, SubLObject consider_iff_as_necP) {
        if (consider_iff_as_necP == UNPROVIDED) {
            consider_iff_as_necP = NIL;
        }
        return makeBoolean(NIL == com.cyc.cycjava.cycl.defns.nec_defn_rejectsP(col, v_term, mt, quotedP, consider_iff_as_necP));
    }

    public static SubLObject nec_defn_permitsP(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP, SubLObject consider_iff_as_necP) {
        if (consider_iff_as_necP == UNPROVIDED) {
            consider_iff_as_necP = NIL;
        }
        return makeBoolean(NIL == nec_defn_rejectsP(col, v_term, mt, quotedP, consider_iff_as_necP));
    }

    public static final SubLObject reset_nec_defn_rejectsP_meters_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash($CALLS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), ZERO_INTEGER);
            sethash($TIMES, $nec_defn_rejectsP_meters$.getDynamicValue(thread), NIL);
            sethash($RESULTS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), NIL);
            sethash($ARGS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), NIL);
            sethash($ARG_LIST, $nec_defn_rejectsP_meters$.getDynamicValue(thread), $list_alt50);
            sethash($FUNCTION, $nec_defn_rejectsP_meters$.getDynamicValue(thread), $sym51$NEC_DEFN_REJECTS_);
            return NIL;
        }
    }

    public static SubLObject reset_nec_defn_rejectsP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $nec_defn_rejectsP_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $nec_defn_rejectsP_meters$.getDynamicValue(thread), $list59);
        sethash($FUNCTION, $nec_defn_rejectsP_meters$.getDynamicValue(thread), $sym60$NEC_DEFN_REJECTS_);
        return NIL;
    }

    public static final SubLObject nec_defn_rejectsP_metered_alt(SubLObject col, SubLObject v_term, SubLObject mt, SubLObject quotedP, SubLObject consider_iff_as_necP) {
        if (consider_iff_as_necP == UNPROVIDED) {
            consider_iff_as_necP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject nec_defns = com.cyc.cycjava.cycl.defns.nec_defns(col, quotedP);
                SubLObject rejectedP = NIL;
                SubLObject doneP = NIL;
                if (NIL == nec_defns) {
                    if (NIL != consider_iff_as_necP) {
                        nec_defns = list(com.cyc.cycjava.cycl.defns.iff_defn(col, quotedP));
                    }
                    if (NIL == nec_defns) {
                        return NIL;
                    }
                }
                {
                    SubLObject mt_var = mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            if (NIL == doneP) {
                                {
                                    SubLObject csome_list_var = nec_defns;
                                    SubLObject nec_defn = NIL;
                                    for (nec_defn = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , nec_defn = csome_list_var.first()) {
                                        if ((NIL != assertions_high.valid_assertion(nec_defn, UNPROVIDED)) && (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(nec_defn)))) {
                                            {
                                                SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(nec_defn));
                                                {
                                                    SubLObject _prev_bind_0_27 = at_vars.$defn_collection$.currentBinding(thread);
                                                    try {
                                                        at_vars.$defn_collection$.bind(col, thread);
                                                        if (NIL != at_defns.viable_defnP(defn, col)) {
                                                            if (NIL != (NIL != quotedP ? ((SubLObject) (at_defns.quoted_defn_admitsP(defn, v_term, col, mt))) : at_defns.defn_admitsP(defn, v_term, col, mt))) {
                                                                rejectedP = NIL;
                                                                doneP = NIL;
                                                            } else {
                                                                rejectedP = T;
                                                                doneP = T;
                                                                if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                    at_routines.note_at_violations(com.cyc.cycjava.cycl.defns.necessary_defn_violations(at_vars.$defn_collection$.getDynamicValue(thread), v_term, col, defn, quotedP, mt));
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        at_vars.$defn_collection$.rebind(_prev_bind_0_27, thread);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return rejectedP;
            }
        }
    }

    public static SubLObject nec_defn_rejectsP_metered(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP, SubLObject consider_iff_as_necP) {
        if (consider_iff_as_necP == UNPROVIDED) {
            consider_iff_as_necP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject nec_defns = nec_defns(col, quotedP);
        SubLObject rejectedP = NIL;
        SubLObject doneP = NIL;
        if (NIL == nec_defns) {
            if (NIL != consider_iff_as_necP) {
                nec_defns = list(iff_defn(col, quotedP));
            }
            if (NIL == nec_defns) {
                return NIL;
            }
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            if (NIL == doneP) {
                SubLObject csome_list_var = nec_defns;
                SubLObject nec_defn = NIL;
                nec_defn = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if ((NIL != assertions_high.valid_assertion(nec_defn, UNPROVIDED)) && (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(nec_defn)))) {
                        final SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(nec_defn));
                        final SubLObject _prev_bind_0_$27 = at_vars.$defn_collection$.currentBinding(thread);
                        try {
                            at_vars.$defn_collection$.bind(col, thread);
                            if (NIL != at_defns.viable_defnP(defn, col)) {
                                if (NIL != (NIL != quotedP ? at_defns.quoted_defn_admitsP(defn, v_term, col, mt) : at_defns.defn_admitsP(defn, v_term, col, mt))) {
                                    rejectedP = NIL;
                                    doneP = NIL;
                                } else {
                                    rejectedP = T;
                                    doneP = T;
                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                        at_routines.note_at_violations(necessary_defn_violations(at_vars.$defn_collection$.getDynamicValue(thread), v_term, col, defn, quotedP, mt));
                                    }
                                }
                            }
                        } finally {
                            at_vars.$defn_collection$.rebind(_prev_bind_0_$27, thread);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    nec_defn = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return rejectedP;
    }

    public static final SubLObject nec_defn_rejectsP_alt(SubLObject col, SubLObject v_term, SubLObject mt, SubLObject quotedP, SubLObject consider_iff_as_necP) {
        if (consider_iff_as_necP == UNPROVIDED) {
            consider_iff_as_necP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
                {
                    SubLObject result = NIL;
                    SubLObject run_time = NIL;
                    SubLObject time_var = get_internal_real_time();
                    result = com.cyc.cycjava.cycl.defns.nec_defn_rejectsP_metered(col, v_term, mt, quotedP, consider_iff_as_necP);
                    run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    sethash($CALLS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), add(gethash($CALLS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
                    sethash($TIMES, $nec_defn_rejectsP_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $nec_defn_rejectsP_meters$.getDynamicValue(thread), UNPROVIDED)));
                    sethash($RESULTS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), UNPROVIDED)));
                    sethash($ARGS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), cons(list(col, v_term, mt, quotedP, consider_iff_as_necP), gethash($ARGS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), UNPROVIDED)));
                    return result;
                }
            } else {
                return com.cyc.cycjava.cycl.defns.nec_defn_rejectsP_metered(col, v_term, mt, quotedP, consider_iff_as_necP);
            }
        }
    }

    public static SubLObject nec_defn_rejectsP(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP, SubLObject consider_iff_as_necP) {
        if (consider_iff_as_necP == UNPROVIDED) {
            consider_iff_as_necP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = nec_defn_rejectsP_metered(col, v_term, mt, quotedP, consider_iff_as_necP);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), add(gethash($CALLS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $nec_defn_rejectsP_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $nec_defn_rejectsP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), cons(list(col, v_term, mt, quotedP, consider_iff_as_necP), gethash($ARGS, $nec_defn_rejectsP_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return nec_defn_rejectsP_metered(col, v_term, mt, quotedP, consider_iff_as_necP);
    }

    public static final SubLObject necessary_defn_violations_alt(SubLObject col, SubLObject v_term, SubLObject defn_col, SubLObject defn, SubLObject quotedP, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == dictionary.dictionary_p(at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue(thread))) {
                return list(at_defns.necessary_defn_violation_data(col, v_term, defn_col, defn, quotedP, mt));
            }
            {
                SubLObject constraints = dictionary.dictionary_lookup(at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue(thread), col, UNPROVIDED);
                SubLObject violations = NIL;
                SubLObject cdolist_list_var = constraints;
                SubLObject constraint_details = NIL;
                for (constraint_details = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_details = cdolist_list_var.first()) {
                    violations = cons(com.cyc.cycjava.cycl.defns.necessary_defn_violation(col, v_term, defn_col, defn, quotedP, mt, constraint_details), violations);
                }
                return violations;
            }
        }
    }

    public static SubLObject necessary_defn_violations(final SubLObject col, final SubLObject v_term, final SubLObject defn_col, final SubLObject defn, final SubLObject quotedP, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == dictionary.dictionary_p(at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue(thread))) {
            return list(at_defns.necessary_defn_violation_data(col, v_term, defn_col, defn, quotedP, mt));
        }
        final SubLObject constraints = dictionary.dictionary_lookup(at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue(thread), col, UNPROVIDED);
        SubLObject violations = NIL;
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint_details = NIL;
        constraint_details = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            violations = cons(necessary_defn_violation(col, v_term, defn_col, defn, quotedP, mt, constraint_details), violations);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_details = cdolist_list_var.first();
        } 
        return violations;
    }

    public static final SubLObject necessary_defn_violation_alt(SubLObject col, SubLObject v_term, SubLObject defn_col, SubLObject defn, SubLObject quotedP, SubLObject mt, SubLObject constraint_details) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject data = NIL;
                SubLObject datum = constraint_details;
                SubLObject current = datum;
                SubLObject constraint_reln = NIL;
                SubLObject via = NIL;
                SubLObject constraint_gaf = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt42);
                constraint_reln = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt42);
                via = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt42);
                constraint_gaf = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((NIL != constraint_reln) && (NIL != at_vars.$at_reln$.getDynamicValue(thread))) {
                        if (constraint_reln != at_vars.$at_reln$.getDynamicValue(thread)) {
                            data = cons(list(via, constraint_reln), data);
                        }
                    }
                    if ((NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue(thread)) && (NIL != constraint_gaf)) {
                        data = cons(list($AT_CONSTRAINT_GAF, constraint_gaf), data);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt42);
                }
                if (NIL != mt) {
                    data = cons(mt, data);
                } else {
                    data = cons(mt_relevance_macros.$mt$.getDynamicValue(thread), data);
                }
                if (NIL != quotedP) {
                    return listS($MAL_ARG_WRT_QUOTED_NEC_DEFN, new SubLObject[]{ v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), col, defn_col, defn, data });
                } else {
                    return listS($MAL_ARG_WRT_NEC_DEFN, new SubLObject[]{ v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), col, defn_col, defn, data });
                }
            }
        }
    }

    public static SubLObject necessary_defn_violation(final SubLObject col, final SubLObject v_term, final SubLObject defn_col, final SubLObject defn, final SubLObject quotedP, final SubLObject mt, final SubLObject constraint_details) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data = NIL;
        SubLObject constraint_reln = NIL;
        SubLObject via = NIL;
        SubLObject constraint_gaf = NIL;
        destructuring_bind_must_consp(constraint_details, constraint_details, $list52);
        constraint_reln = constraint_details.first();
        SubLObject current = constraint_details.rest();
        destructuring_bind_must_consp(current, constraint_details, $list52);
        via = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, constraint_details, $list52);
        constraint_gaf = current.first();
        current = current.rest();
        if (NIL == current) {
            if (((NIL != constraint_reln) && (NIL != at_vars.$at_reln$.getDynamicValue(thread))) && (!constraint_reln.eql(at_vars.$at_reln$.getDynamicValue(thread)))) {
                data = cons(list(via, constraint_reln), data);
            }
            if ((NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue(thread)) && (NIL != constraint_gaf)) {
                data = cons(list($AT_CONSTRAINT_GAF, constraint_gaf), data);
            }
        } else {
            cdestructuring_bind_error(constraint_details, $list52);
        }
        if (NIL != mt) {
            data = cons(mt, data);
        } else {
            data = cons(mt_relevance_macros.$mt$.getDynamicValue(thread), data);
        }
        if (NIL != quotedP) {
            return listS($MAL_ARG_WRT_QUOTED_NEC_DEFN, new SubLObject[]{ v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), col, defn_col, defn, data });
        }
        return listS($MAL_ARG_WRT_NEC_DEFN, new SubLObject[]{ v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), col, defn_col, defn, data });
    }

    public static final SubLObject new_mts_of_admitting_defns_alt(SubLObject v_term, SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                    try {
                        at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                        result = com.cyc.cycjava.cycl.defns.mts_from_defn_assertions(col, com.cyc.cycjava.cycl.defns.assertions_of_admitting_defns(v_term, col, $$EverythingPSC, NIL, NIL));
                    } finally {
                        at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject new_mts_of_admitting_defns(final SubLObject v_term, final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
        try {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
            result = mts_from_defn_assertions(col, assertions_of_admitting_defns(v_term, col, $$EverythingPSC, NIL, T));
        } finally {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject mts_of_admitting_quoted_defns_alt(SubLObject v_term, SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                    try {
                        at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                        result = com.cyc.cycjava.cycl.defns.mts_from_defn_assertions(col, com.cyc.cycjava.cycl.defns.assertions_of_admitting_defns(v_term, col, $$EverythingPSC, T, NIL));
                    } finally {
                        at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject mts_of_admitting_quoted_defns(final SubLObject v_term, final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
        try {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
            result = mts_from_defn_assertions(col, assertions_of_admitting_defns(v_term, col, $$EverythingPSC, T, T));
        } finally {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject new_hl_justify_isa_via_defns_alt(SubLObject v_term, SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject v_defns = com.cyc.cycjava.cycl.defns.assertions_of_admitting_defns(v_term, collection, mt, NIL, T);
            SubLObject supports = NIL;
            SubLObject cdolist_list_var = v_defns;
            SubLObject defn = NIL;
            for (defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defn = cdolist_list_var.first()) {
                {
                    SubLObject defn_collection = assertions_high.gaf_arg1(defn);
                    if (defn_collection != collection) {
                        supports = cons(arguments.make_hl_support($GENLS, list($$genls, defn_collection, collection), UNPROVIDED, UNPROVIDED), supports);
                    }
                    supports = cons(defn, supports);
                }
            }
            return supports;
        }
    }

    public static SubLObject new_hl_justify_isa_via_defns(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject v_defns = assertions_of_admitting_defns(v_term, collection, mt, NIL, T);
        SubLObject supports = NIL;
        SubLObject cdolist_list_var = v_defns;
        SubLObject defn = NIL;
        defn = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject defn_collection = assertions_high.gaf_arg1(defn);
            if (!defn_collection.eql(collection)) {
                supports = cons(arguments.make_hl_support($GENLS, list($$genls, defn_collection, collection), UNPROVIDED, UNPROVIDED), supports);
            }
            supports = cons(defn, supports);
            cdolist_list_var = cdolist_list_var.rest();
            defn = cdolist_list_var.first();
        } 
        return supports;
    }

    public static final SubLObject hl_justify_quoted_isa_via_defns_alt(SubLObject v_term, SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject v_defns = com.cyc.cycjava.cycl.defns.assertions_of_admitting_defns(v_term, collection, mt, T, T);
            SubLObject supports = NIL;
            SubLObject cdolist_list_var = v_defns;
            SubLObject defn = NIL;
            for (defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defn = cdolist_list_var.first()) {
                {
                    SubLObject defn_collection = assertions_high.gaf_arg1(defn);
                    if (defn_collection != collection) {
                        supports = cons(arguments.make_hl_support($GENLS, list($$genls, defn_collection, collection), UNPROVIDED, UNPROVIDED), supports);
                    }
                    supports = cons(defn, supports);
                }
            }
            return supports;
        }
    }

    public static SubLObject hl_justify_quoted_isa_via_defns(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject v_defns = assertions_of_admitting_defns(v_term, collection, mt, T, T);
        SubLObject supports = NIL;
        SubLObject cdolist_list_var = v_defns;
        SubLObject defn = NIL;
        defn = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject defn_collection = assertions_high.gaf_arg1(defn);
            if (!defn_collection.eql(collection)) {
                supports = cons(arguments.make_hl_support($GENLS, list($$genls, defn_collection, collection), UNPROVIDED, UNPROVIDED), supports);
            }
            supports = cons(defn, supports);
            cdolist_list_var = cdolist_list_var.rest();
            defn = cdolist_list_var.first();
        } 
        return supports;
    }

    public static final SubLObject assertions_of_admitting_defns_alt(SubLObject v_term, SubLObject col, SubLObject mt, SubLObject quotedP, SubLObject gather_only_firstP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != obsolete.reifiable_natP(col, UNPROVIDED, UNPROVIDED)) {
                col = narts_high.find_nart(col);
            }
            if (!((NIL != forts.fort_p(col)) || (NIL != com.cyc.cycjava.cycl.defns.has_suf_defn_somewhereP(col, quotedP)))) {
                return NIL;
            }
            {
                SubLObject v_defns = NIL;
                SubLObject iff_defn = NIL;
                SubLObject admit_status = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = at_vars.$defn_fn_history$.currentBinding(thread);
                    SubLObject _prev_bind_3 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
                    SubLObject _prev_bind_4 = at_vars.$defn_col_history$.currentBinding(thread);
                    SubLObject _prev_bind_5 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
                        at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
                        at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
                        at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
                        try {
                            thread.resetMultipleValues();
                            {
                                SubLObject admit_status_28 = com.cyc.cycjava.cycl.defns.initial_check_admit_defn(col, v_term, quotedP);
                                SubLObject iff_defn_29 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                admit_status = admit_status_28;
                                iff_defn = iff_defn_29;
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    {
                                        SubLObject pcase_var = admit_status;
                                        if (pcase_var.eql($ADMITTED)) {
                                            v_defns = cons(iff_defn, v_defns);
                                            if (NIL == gather_only_firstP) {
                                                v_defns = nconc(v_defns, com.cyc.cycjava.cycl.defns.defns_of_admitting_sufficient_defns(v_term, col, quotedP, gather_only_firstP));
                                            }
                                        } else {
                                            if (pcase_var.eql($REJECTED)) {
                                            } else {
                                                v_defns = com.cyc.cycjava.cycl.defns.defns_of_admitting_sufficient_defns(v_term, col, quotedP, gather_only_firstP);
                                            }
                                        }
                                    }
                                    if (((NIL == quotedP) && (NIL == v_defns)) && (NIL != cycl_grammar.fast_quote_term_p(v_term))) {
                                        {
                                            SubLObject denoted_term = czer_main.unquote_quoted_term(v_term, UNPROVIDED);
                                            if (NIL != denoted_term) {
                                                v_defns = com.cyc.cycjava.cycl.defns.assertions_of_admitting_defns(v_term, col, mt, T, gather_only_firstP);
                                            }
                                        }
                                    }
                                    at_defns.clear_defn_space();
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_30, thread);
                                }
                            }
                        }
                    } finally {
                        at_vars.$quoted_defn_col_history$.rebind(_prev_bind_5, thread);
                        at_vars.$defn_col_history$.rebind(_prev_bind_4, thread);
                        at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_3, thread);
                        at_vars.$defn_fn_history$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return list_utilities.flatten(v_defns);
            }
        }
    }

    public static SubLObject assertions_of_admitting_defns(final SubLObject v_term, SubLObject col, final SubLObject mt, final SubLObject quotedP, final SubLObject gather_only_firstP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != obsolete.reifiable_natP(col, UNPROVIDED, UNPROVIDED)) {
            col = narts_high.find_nart(col);
        }
        if ((NIL == forts.fort_p(col)) && (NIL == has_suf_defn_somewhereP(col, quotedP))) {
            return NIL;
        }
        SubLObject v_defns = NIL;
        SubLObject iff_defn = NIL;
        SubLObject admit_status = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_5 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_6 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                thread.resetMultipleValues();
                final SubLObject admit_status_$28 = initial_check_admit_defn(col, v_term, quotedP);
                final SubLObject iff_defn_$29 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                admit_status = admit_status_$28;
                iff_defn = iff_defn_$29;
            } finally {
                final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    final SubLObject pcase_var = admit_status;
                    if (pcase_var.eql($ADMITTED)) {
                        v_defns = cons(iff_defn, v_defns);
                        if (NIL == gather_only_firstP) {
                            v_defns = nconc(v_defns, defns_of_admitting_sufficient_defns(v_term, col, quotedP, gather_only_firstP));
                        }
                    } else
                        if (!pcase_var.eql($REJECTED)) {
                            v_defns = defns_of_admitting_sufficient_defns(v_term, col, quotedP, gather_only_firstP);
                        }

                    if (((NIL == quotedP) && (NIL == v_defns)) && (NIL != cycl_grammar.fast_quote_term_p(v_term))) {
                        final SubLObject denoted_term = czer_main.unquote_quoted_term(v_term, UNPROVIDED);
                        if (NIL != denoted_term) {
                            v_defns = assertions_of_admitting_defns(v_term, col, mt, T, gather_only_firstP);
                        }
                    }
                    at_defns.clear_defn_space();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                }
            }
        } finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_6, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_5, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.flatten(v_defns);
    }

    public static final SubLObject mts_from_defn_assertions_alt(SubLObject col, SubLObject v_defns) {
        {
            SubLObject mt_sets = NIL;
            SubLObject cdolist_list_var = v_defns;
            SubLObject defn = NIL;
            for (defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defn = cdolist_list_var.first()) {
                {
                    SubLObject defn_collection = assertions_high.gaf_arg1(defn);
                    SubLObject mt = assertions_high.assertion_mt(defn);
                    SubLObject cdolist_list_var_31 = genls.min_mts_of_genls_paths(defn_collection, col, UNPROVIDED);
                    SubLObject mt_set = NIL;
                    for (mt_set = cdolist_list_var_31.first(); NIL != cdolist_list_var_31; cdolist_list_var_31 = cdolist_list_var_31.rest() , mt_set = cdolist_list_var_31.first()) {
                        mt_sets = cons(cons(mt, mt_set), mt_sets);
                    }
                }
            }
            return genl_mts.max_floor_mts_from_mt_sets(mt_sets);
        }
    }

    public static SubLObject mts_from_defn_assertions(final SubLObject col, final SubLObject v_defns) {
        SubLObject mt_sets = NIL;
        SubLObject cdolist_list_var = v_defns;
        SubLObject defn = NIL;
        defn = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject defn_collection = assertions_high.gaf_arg1(defn);
            final SubLObject mt = assertions_high.assertion_mt(defn);
            SubLObject cdolist_list_var_$31 = genls.min_mts_of_genls_paths(defn_collection, col, UNPROVIDED);
            SubLObject mt_set = NIL;
            mt_set = cdolist_list_var_$31.first();
            while (NIL != cdolist_list_var_$31) {
                mt_sets = cons(cons(mt, mt_set), mt_sets);
                cdolist_list_var_$31 = cdolist_list_var_$31.rest();
                mt_set = cdolist_list_var_$31.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            defn = cdolist_list_var.first();
        } 
        return genl_mts.max_floor_mts_from_mt_sets(mt_sets);
    }

    public static final SubLObject initial_check_admit_defn_alt(SubLObject col, SubLObject v_term, SubLObject quotedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject admit_status = com.cyc.cycjava.cycl.defns.defining_defns_admitsP(col, v_term, mt_relevance_macros.$mt$.getDynamicValue(thread), quotedP);
                SubLObject doneP = NIL;
                SubLObject defn = NIL;
                SubLObject pcase_var = admit_status;
                if (pcase_var.eql($ADMITTED)) {
                    defn = com.cyc.cycjava.cycl.defns.iff_defn(col, quotedP);
                } else {
                    if (pcase_var.eql($REJECTED)) {
                    } else {
                        {
                            SubLObject _prev_bind_0 = at_vars.$defn_collection$.currentBinding(thread);
                            try {
                                at_vars.$defn_collection$.bind(col, thread);
                                {
                                    SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                                    if (NIL == doneP) {
                                        {
                                            SubLObject node_var = col;
                                            SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                            SubLObject recur_deck = deck.create_deck(deck_type);
                                            {
                                                SubLObject _prev_bind_0_32 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                    {
                                                        SubLObject mt_var = mt;
                                                        {
                                                            SubLObject _prev_bind_0_33 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                            try {
                                                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                                {
                                                                    SubLObject tv_var = NIL;
                                                                    {
                                                                        SubLObject _prev_bind_0_34 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_35 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                                            if (NIL != tv_var) {
                                                                                if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                                    if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                        {
                                                                                            SubLObject pcase_var_36 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                                            if (pcase_var_36.eql($ERROR)) {
                                                                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                            } else {
                                                                                                if (pcase_var_36.eql($CERROR)) {
                                                                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                } else {
                                                                                                    if (pcase_var_36.eql($WARN)) {
                                                                                                        Errors.warn($str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                                    } else {
                                                                                                        Errors.warn($str_alt36$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                                        Errors.cerror($$$continue_anyway, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            {
                                                                                SubLObject _prev_bind_0_37 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_38 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                                SubLObject _prev_bind_2_39 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_40 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1_41 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_2_42 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                                                while ((NIL != node_var) && (NIL == doneP)) {
                                                                                                    {
                                                                                                        SubLObject genl = node_var;
                                                                                                        if (genl != col) {
                                                                                                            if (NIL != com.cyc.cycjava.cycl.defns.nec_defn_rejectsP(genl, v_term, mt, quotedP, T)) {
                                                                                                                doneP = T;
                                                                                                                admit_status = $REJECTED;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    {
                                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                                                        SubLObject rest = NIL;
                                                                                                        for (rest = accessible_modules; !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                                                                                            {
                                                                                                                SubLObject module_var = rest.first();
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_43 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                                    SubLObject _prev_bind_1_44 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                                        {
                                                                                                                            SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                                {
                                                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                    if (NIL != d_link) {
                                                                                                                                        {
                                                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                            if (NIL != mt_links) {
                                                                                                                                                {
                                                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                                    while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        {
                                                                                                                                                            SubLObject mt_45 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_45)) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject _prev_bind_0_46 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                                    try {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_45, thread);
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject iteration_state_47 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                            while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_47)))) {
                                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_47);
                                                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                                        {
                                                                                                                                                                                            SubLObject _prev_bind_0_48 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                            try {
                                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                                {
                                                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                                    SubLObject rest_49 = NIL;
                                                                                                                                                                                                    for (rest_49 = new_list; !((NIL != doneP) || (NIL == rest_49)); rest_49 = rest_49.rest()) {
                                                                                                                                                                                                        {
                                                                                                                                                                                                            SubLObject node_vars_link_node = rest_49.first();
                                                                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            } finally {
                                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_48, thread);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    iteration_state_47 = dictionary_contents.do_dictionary_contents_next(iteration_state_47);
                                                                                                                                                                                }
                                                                                                                                                                            } 
                                                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_47);
                                                                                                                                                                        }
                                                                                                                                                                    } finally {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_46, thread);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                                        }
                                                                                                                                                    } 
                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt38$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                                    {
                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                        SubLObject rest_50 = NIL;
                                                                                                                                        for (rest_50 = new_list; !((NIL != doneP) || (NIL == rest_50)); rest_50 = rest_50.rest()) {
                                                                                                                                            {
                                                                                                                                                SubLObject generating_fn = rest_50.first();
                                                                                                                                                {
                                                                                                                                                    SubLObject _prev_bind_0_51 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                                    try {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                                        {
                                                                                                                                                            SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                                            SubLObject new_list_52 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                            SubLObject rest_53 = NIL;
                                                                                                                                                            for (rest_53 = new_list_52; !((NIL != doneP) || (NIL == rest_53)); rest_53 = rest_53.rest()) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject node_vars_link_node = rest_53.first();
                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } finally {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_51, thread);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_44, thread);
                                                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_43, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    node_var = deck.deck_pop(recur_deck);
                                                                                                } 
                                                                                            } finally {
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_42, thread);
                                                                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_41, thread);
                                                                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_40, thread);
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt39$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_39, thread);
                                                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_38, thread);
                                                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_37, thread);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_35, thread);
                                                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_34, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_33, thread);
                                                            }
                                                        }
                                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                    }
                                                } finally {
                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_32, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                at_vars.$defn_collection$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return values(admit_status, defn);
            }
        }
    }

    public static SubLObject initial_check_admit_defn(final SubLObject col, final SubLObject v_term, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject admit_status = defining_defns_admitsP(col, v_term, mt_relevance_macros.$mt$.getDynamicValue(thread), quotedP);
        SubLObject doneP = NIL;
        SubLObject defn = NIL;
        final SubLObject pcase_var = admit_status;
        if (pcase_var.eql($ADMITTED)) {
            defn = iff_defn(col, quotedP);
        } else
            if (!pcase_var.eql($REJECTED)) {
                final SubLObject _prev_bind_0 = at_vars.$defn_collection$.currentBinding(thread);
                try {
                    at_vars.$defn_collection$.bind(col, thread);
                    final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                    if (NIL == doneP) {
                        SubLObject node_var = col;
                        final SubLObject deck_type = $STACK;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        final SubLObject _prev_bind_0_$32 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject mt_var = mt;
                                final SubLObject _prev_bind_0_$33 = mt_relevance_macros.$mt$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    final SubLObject tv_var = NIL;
                                    final SubLObject _prev_bind_0_$34 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$35 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                            final SubLObject pcase_var_$36 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                            if (pcase_var_$36.eql($ERROR)) {
                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var_$36.eql($CERROR)) {
                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                } else
                                                    if (pcase_var_$36.eql($WARN)) {
                                                        Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                    } else {
                                                        Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                        Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                    }


                                        }
                                        final SubLObject _prev_bind_0_$35 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$36 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$39 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                final SubLObject _prev_bind_0_$36 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$37 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_2_$40 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                    while ((NIL != node_var) && (NIL == doneP)) {
                                                        final SubLObject genl = node_var;
                                                        if ((!genl.eql(col)) && (NIL != nec_defn_rejectsP(genl, v_term, mt, quotedP, T))) {
                                                            doneP = T;
                                                            admit_status = $REJECTED;
                                                        }
                                                        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                        SubLObject rest;
                                                        SubLObject module_var;
                                                        SubLObject _prev_bind_0_$37;
                                                        SubLObject _prev_bind_1_$38;
                                                        SubLObject node;
                                                        SubLObject d_link;
                                                        SubLObject mt_links;
                                                        SubLObject iteration_state;
                                                        SubLObject mt_$45;
                                                        SubLObject tv_links;
                                                        SubLObject _prev_bind_0_$38;
                                                        SubLObject iteration_state_$47;
                                                        SubLObject tv;
                                                        SubLObject link_nodes;
                                                        SubLObject _prev_bind_0_$39;
                                                        SubLObject sol;
                                                        SubLObject set_contents_var;
                                                        SubLObject basis_object;
                                                        SubLObject state;
                                                        SubLObject node_vars_link_node;
                                                        SubLObject csome_list_var;
                                                        SubLObject node_vars_link_node2;
                                                        SubLObject new_list;
                                                        SubLObject rest_$49;
                                                        SubLObject generating_fn;
                                                        SubLObject _prev_bind_0_$40;
                                                        SubLObject sol2;
                                                        SubLObject link_nodes2;
                                                        SubLObject set_contents_var2;
                                                        SubLObject basis_object2;
                                                        SubLObject state2;
                                                        SubLObject node_vars_link_node3;
                                                        SubLObject csome_list_var2;
                                                        SubLObject node_vars_link_node4;
                                                        for (rest = NIL, rest = accessible_modules; (NIL == doneP) && (NIL != rest); rest = rest.rest()) {
                                                            module_var = rest.first();
                                                            _prev_bind_0_$37 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            _prev_bind_1_$38 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                node = function_terms.naut_to_nart(node_var);
                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                    d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != d_link) {
                                                                        mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        if (NIL != mt_links) {
                                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == doneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                thread.resetMultipleValues();
                                                                                mt_$45 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                tv_links = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_$45)) {
                                                                                    _prev_bind_0_$38 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$45, thread);
                                                                                        for (iteration_state_$47 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == doneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$47)); iteration_state_$47 = dictionary_contents.do_dictionary_contents_next(iteration_state_$47)) {
                                                                                            thread.resetMultipleValues();
                                                                                            tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$47);
                                                                                            link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                _prev_bind_0_$39 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                    sol = link_nodes;
                                                                                                    if (NIL != set.set_p(sol)) {
                                                                                                        set_contents_var = set.do_set_internal(sol);
                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == doneP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                            }
                                                                                                        }
                                                                                                    } else
                                                                                                        if (sol.isList()) {
                                                                                                            if (NIL == doneP) {
                                                                                                                csome_list_var = sol;
                                                                                                                node_vars_link_node2 = NIL;
                                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                                while ((NIL == doneP) && (NIL != csome_list_var)) {
                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                    }
                                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                                } 
                                                                                                            }
                                                                                                        } else {
                                                                                                            Errors.error($str46$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                        }

                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$39, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$47);
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$38, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str47$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } else
                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                        new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        for (rest_$49 = NIL, rest_$49 = new_list; (NIL == doneP) && (NIL != rest_$49); rest_$49 = rest_$49.rest()) {
                                                                            generating_fn = rest_$49.first();
                                                                            _prev_bind_0_$40 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                                if (NIL != set.set_p(sol2)) {
                                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == doneP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    if (sol2.isList()) {
                                                                                        if (NIL == doneP) {
                                                                                            csome_list_var2 = sol2;
                                                                                            node_vars_link_node4 = NIL;
                                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                                            while ((NIL == doneP) && (NIL != csome_list_var2)) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                                }
                                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                            } 
                                                                                        }
                                                                                    } else {
                                                                                        Errors.error($str46$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                    }

                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$40, thread);
                                                                            }
                                                                        }
                                                                    }

                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$38, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$37, thread);
                                                            }
                                                        }
                                                        node_var = deck.deck_pop(recur_deck);
                                                    } 
                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$40, thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$37, thread);
                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$36, thread);
                                                }
                                            } else {
                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str48$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$39, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$36, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$35, thread);
                                        }
                                    } finally {
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$35, thread);
                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$34, thread);
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$33, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$32, thread);
                        }
                    }
                } finally {
                    at_vars.$defn_collection$.rebind(_prev_bind_0, thread);
                }
            }

        return values(admit_status, defn);
    }

    public static final SubLObject defns_of_admitting_sufficient_defns_alt(SubLObject v_term, SubLObject col, SubLObject quotedP, SubLObject gather_only_firstP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_defns = NIL;
                {
                    SubLObject _prev_bind_0 = $defn_term$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$defn_collection$.currentBinding(thread);
                    try {
                        $defn_term$.bind(v_term, thread);
                        at_vars.$defn_collection$.bind(col, thread);
                        {
                            SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                            if (NIL != gather_only_firstP) {
                                if (NIL != quotedP) {
                                    v_defns = sbhl_search_methods.sbhl_simply_gather_first_among_all_backward_true_nodes_with_prune(sbhl_module_vars.get_sbhl_module($$genls), col, symbol_function(ADMITTING_QUOTED_DEFN_ASSERTION), mt, UNPROVIDED, UNPROVIDED);
                                } else {
                                    v_defns = sbhl_search_methods.sbhl_simply_gather_first_among_all_backward_true_nodes_with_prune(sbhl_module_vars.get_sbhl_module($$genls), col, symbol_function(ADMITTING_DEFN_ASSERTION), mt, UNPROVIDED, UNPROVIDED);
                                }
                            } else {
                                if (NIL != quotedP) {
                                    v_defns = sbhl_search_methods.sbhl_all_backward_true_nodes_with_prune(sbhl_module_vars.get_sbhl_module($$genls), col, symbol_function(ADMITTING_QUOTED_DEFN_ASSERTIONS), mt, UNPROVIDED);
                                } else {
                                    v_defns = sbhl_search_methods.sbhl_all_backward_true_nodes_with_prune(sbhl_module_vars.get_sbhl_module($$genls), col, symbol_function(ADMITTING_DEFN_ASSERTIONS), mt, UNPROVIDED);
                                }
                            }
                        }
                    } finally {
                        at_vars.$defn_collection$.rebind(_prev_bind_1, thread);
                        $defn_term$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_defns;
            }
        }
    }

    public static SubLObject defns_of_admitting_sufficient_defns(final SubLObject v_term, final SubLObject col, final SubLObject quotedP, final SubLObject gather_only_firstP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_defns = NIL;
        final SubLObject _prev_bind_0 = $defn_term$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$defn_collection$.currentBinding(thread);
        try {
            $defn_term$.bind(v_term, thread);
            at_vars.$defn_collection$.bind(col, thread);
            final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
            if (NIL != gather_only_firstP) {
                if (NIL != quotedP) {
                    v_defns = sbhl_search_methods.sbhl_simply_gather_first_among_all_backward_true_nodes_with_prune(sbhl_module_vars.get_sbhl_module($$genls), col, symbol_function(ADMITTING_QUOTED_DEFN_ASSERTION), mt, UNPROVIDED, UNPROVIDED);
                } else {
                    v_defns = sbhl_search_methods.sbhl_simply_gather_first_among_all_backward_true_nodes_with_prune(sbhl_module_vars.get_sbhl_module($$genls), col, symbol_function(ADMITTING_DEFN_ASSERTION), mt, UNPROVIDED, UNPROVIDED);
                }
            } else
                if (NIL != quotedP) {
                    v_defns = sbhl_search_methods.sbhl_all_backward_true_nodes_with_prune(sbhl_module_vars.get_sbhl_module($$genls), col, symbol_function(ADMITTING_QUOTED_DEFN_ASSERTIONS), mt, UNPROVIDED);
                } else {
                    v_defns = sbhl_search_methods.sbhl_all_backward_true_nodes_with_prune(sbhl_module_vars.get_sbhl_module($$genls), col, symbol_function(ADMITTING_DEFN_ASSERTIONS), mt, UNPROVIDED);
                }

        } finally {
            at_vars.$defn_collection$.rebind(_prev_bind_2, thread);
            $defn_term$.rebind(_prev_bind_0, thread);
        }
        return v_defns;
    }

    /**
     * Gather all admitting defns
     */
    @LispMethod(comment = "Gather all admitting defns")
    public static final SubLObject admitting_defn_assertions_alt(SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.defns.admitting_defn_assertions_int(col, $defn_term$.getDynamicValue(thread), NIL, NIL);
        }
    }

    /**
     * Gather all admitting defns
     */
    @LispMethod(comment = "Gather all admitting defns")
    public static SubLObject admitting_defn_assertions(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return admitting_defn_assertions_int(col, $defn_term$.getDynamicValue(thread), NIL, NIL);
    }/**
     * Gather all admitting defns
     */


    /**
     * Gather all admitting quoted defns
     */
    @LispMethod(comment = "Gather all admitting quoted defns")
    public static final SubLObject admitting_quoted_defn_assertions_alt(SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.defns.admitting_defn_assertions_int(col, $defn_term$.getDynamicValue(thread), T, NIL);
        }
    }

    /**
     * Gather all admitting quoted defns
     */
    @LispMethod(comment = "Gather all admitting quoted defns")
    public static SubLObject admitting_quoted_defn_assertions(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return admitting_defn_assertions_int(col, $defn_term$.getDynamicValue(thread), T, NIL);
    }/**
     * Gather all admitting quoted defns
     */


    /**
     * Gather first admitting defn
     */
    @LispMethod(comment = "Gather first admitting defn")
    public static final SubLObject admitting_defn_assertion_alt(SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.defns.admitting_defn_assertions_int(col, $defn_term$.getDynamicValue(thread), NIL, T);
        }
    }

    /**
     * Gather first admitting defn
     */
    @LispMethod(comment = "Gather first admitting defn")
    public static SubLObject admitting_defn_assertion(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return admitting_defn_assertions_int(col, $defn_term$.getDynamicValue(thread), NIL, T);
    }/**
     * Gather first admitting defn
     */


    /**
     * Gather first admitting quoted defn
     */
    @LispMethod(comment = "Gather first admitting quoted defn")
    public static final SubLObject admitting_quoted_defn_assertion_alt(SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.defns.admitting_defn_assertions_int(col, $defn_term$.getDynamicValue(thread), T, T);
        }
    }

    /**
     * Gather first admitting quoted defn
     */
    @LispMethod(comment = "Gather first admitting quoted defn")
    public static SubLObject admitting_quoted_defn_assertion(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return admitting_defn_assertions_int(col, $defn_term$.getDynamicValue(thread), T, T);
    }/**
     * Gather first admitting quoted defn
     */


    public static final SubLObject admitting_defn_assertions_int_alt(SubLObject col, SubLObject v_term, SubLObject quotedP, SubLObject gather_only_firstP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == com.cyc.cycjava.cycl.defns.has_suf_defn_somewhereP(col, quotedP)) {
                return list(NIL, T);
            }
            if (NIL == com.cyc.cycjava.cycl.defns.has_some_defnP(col, quotedP)) {
                return list(NIL, NIL);
            }
            {
                SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                SubLObject v_defns = NIL;
                SubLObject doneP = NIL;
                SubLObject pcase_var = (at_vars.$defn_collection$.getDynamicValue(thread) == col) ? ((SubLObject) (T)) : com.cyc.cycjava.cycl.defns.defining_defns_admitsP(col, v_term, mt, quotedP);
                if (pcase_var.eql($ADMITTED)) {
                    v_defns = cons(com.cyc.cycjava.cycl.defns.iff_defn(col, quotedP), v_defns);
                    doneP = gather_only_firstP;
                } else {
                    if (pcase_var.eql($REJECTED)) {
                        v_defns = NIL;
                        doneP = T;
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.defns.nec_defn_permitsP(col, v_term, mt, quotedP, NIL)) {
                            {
                                SubLObject suf_defns = com.cyc.cycjava.cycl.defns.suf_admitting_defns(col, v_term, mt, quotedP);
                                if (NIL != suf_defns) {
                                    v_defns = cons(suf_defns, v_defns);
                                }
                                doneP = gather_only_firstP;
                            }
                        } else {
                            v_defns = NIL;
                            doneP = T;
                        }
                    }
                }
                return list(v_defns, doneP);
            }
        }
    }

    public static SubLObject admitting_defn_assertions_int(final SubLObject col, final SubLObject v_term, final SubLObject quotedP, final SubLObject gather_only_firstP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == has_suf_defn_somewhereP(col, quotedP)) {
            return list(NIL, T);
        }
        if (NIL == has_some_defnP(col, quotedP)) {
            return list(NIL, NIL);
        }
        final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        SubLObject v_defns = NIL;
        SubLObject doneP = NIL;
        final SubLObject pcase_var = (at_vars.$defn_collection$.getDynamicValue(thread).eql(col)) ? T : defining_defns_admitsP(col, v_term, mt, quotedP);
        if (pcase_var.eql($ADMITTED)) {
            v_defns = cons(iff_defn(col, quotedP), v_defns);
            doneP = gather_only_firstP;
        } else
            if (pcase_var.eql($REJECTED)) {
                v_defns = NIL;
                doneP = T;
            } else
                if (NIL != nec_defn_permitsP(col, v_term, mt, quotedP, NIL)) {
                    final SubLObject suf_defns = suf_admitting_defns(col, v_term, mt, quotedP);
                    if (NIL != suf_defns) {
                        v_defns = cons(suf_defns, v_defns);
                        doneP = gather_only_firstP;
                    }
                } else {
                    v_defns = NIL;
                    doneP = T;
                }


        return list(v_defns, doneP);
    }

    public static final SubLObject suf_admitting_defns_alt(SubLObject col, SubLObject v_term, SubLObject mt, SubLObject quotedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject suf_defns = com.cyc.cycjava.cycl.defns.suf_defns(col, quotedP);
                SubLObject admitting_defns = NIL;
                if (NIL == suf_defns) {
                    return NIL;
                }
                {
                    SubLObject mt_var = mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            {
                                SubLObject cdolist_list_var = suf_defns;
                                SubLObject suf_defn = NIL;
                                for (suf_defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , suf_defn = cdolist_list_var.first()) {
                                    if ((NIL != assertions_high.valid_assertion(suf_defn, UNPROVIDED)) && (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(suf_defn)))) {
                                        {
                                            SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(suf_defn));
                                            if (NIL != at_defns.viable_defnP(defn, col)) {
                                                if (NIL != (NIL != quotedP ? ((SubLObject) (at_defns.quiet_quoted_defn_admitsP(defn, v_term, col, mt))) : at_defns.quiet_defn_admitsP(defn, v_term, col, mt))) {
                                                    admitting_defns = cons(suf_defn, admitting_defns);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return admitting_defns;
            }
        }
    }

    public static SubLObject suf_admitting_defns(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject suf_defns = suf_defns(col, quotedP);
        SubLObject admitting_defns = NIL;
        if (NIL == suf_defns) {
            return NIL;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            SubLObject cdolist_list_var = suf_defns;
            SubLObject suf_defn = NIL;
            suf_defn = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != assertions_high.valid_assertion(suf_defn, UNPROVIDED)) && (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(suf_defn)))) {
                    final SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(suf_defn));
                    if ((NIL != at_defns.viable_defnP(defn, col)) && (NIL != (NIL != quotedP ? at_defns.quiet_quoted_defn_admitsP(defn, v_term, col, mt) : at_defns.quiet_defn_admitsP(defn, v_term, col, mt)))) {
                        admitting_defns = cons(suf_defn, admitting_defns);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                suf_defn = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return admitting_defns;
    }

    public static final SubLObject min_defn_admits_alt(SubLObject v_object, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject nearest_isa = NIL;
                SubLObject mt_var = domain_mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (NIL == nearest_isa) {
                            {
                                SubLObject csome_list_var = $min_defn_admits_map$.getGlobalValue();
                                SubLObject defn_info = NIL;
                                for (defn_info = csome_list_var.first(); !((NIL != nearest_isa) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , defn_info = csome_list_var.first()) {
                                    {
                                        SubLObject datum = defn_info;
                                        SubLObject current = datum;
                                        SubLObject defn = NIL;
                                        SubLObject collection = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt62);
                                        defn = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt62);
                                        collection = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL != funcall(defn, v_object)) {
                                                nearest_isa = collection;
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt62);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != nearest_isa) {
                    return list(nearest_isa);
                }
            }
            return NIL;
        }
    }

    public static SubLObject min_defn_admits(final SubLObject v_object, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject nearest_isa = NIL;
        final SubLObject mt_var = domain_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL == nearest_isa) {
                SubLObject csome_list_var = $min_defn_admits_map$.getGlobalValue();
                SubLObject defn_info = NIL;
                defn_info = csome_list_var.first();
                while ((NIL == nearest_isa) && (NIL != csome_list_var)) {
                    SubLObject current;
                    final SubLObject datum = current = defn_info;
                    SubLObject defn = NIL;
                    SubLObject collection = NIL;
                    destructuring_bind_must_consp(current, datum, $list71);
                    defn = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list71);
                    collection = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != funcall(defn, v_object)) {
                            nearest_isa = collection;
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list71);
                    }
                    csome_list_var = csome_list_var.rest();
                    defn_info = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL != nearest_isa) {
            return list(nearest_isa);
        }
        return NIL;
    }

    public static final SubLObject all_defn_admits_alt(SubLObject v_object, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = domain_mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject nearest_isas = com.cyc.cycjava.cycl.defns.min_defn_admits(v_object, domain_mt);
                            result = genls.union_all_genls(nearest_isas, domain_mt, UNPROVIDED);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return cardinality_estimates.sort_by_generality_estimate(copy_list(result), $ASCENDING);
            }
        }
    }

    public static SubLObject all_defn_admits(final SubLObject v_object, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = domain_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject nearest_isas = min_defn_admits(v_object, domain_mt);
            result = genls.union_all_genls(nearest_isas, domain_mt, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return cardinality_estimates.sort_by_generality_estimate(copy_list(result), $ASCENDING);
    }

    public static final SubLObject min_quoted_defn_admits_alt(SubLObject v_object, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject nearest_quoted_isa = NIL;
                SubLObject mt_var = domain_mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (NIL == nearest_quoted_isa) {
                            {
                                SubLObject csome_list_var = $min_quoted_defn_admits_map$.getGlobalValue();
                                SubLObject quoted_defn_info = NIL;
                                for (quoted_defn_info = csome_list_var.first(); !((NIL != nearest_quoted_isa) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , quoted_defn_info = csome_list_var.first()) {
                                    {
                                        SubLObject datum = quoted_defn_info;
                                        SubLObject current = datum;
                                        SubLObject quoted_defn = NIL;
                                        SubLObject collection = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt65);
                                        quoted_defn = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt65);
                                        collection = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL != funcall(quoted_defn, v_object)) {
                                                nearest_quoted_isa = collection;
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt65);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != nearest_quoted_isa) {
                    return list(nearest_quoted_isa);
                }
            }
            return NIL;
        }
    }

    public static SubLObject min_quoted_defn_admits(final SubLObject v_object, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject nearest_quoted_isa = NIL;
        final SubLObject mt_var = domain_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL == nearest_quoted_isa) {
                SubLObject csome_list_var = $min_quoted_defn_admits_map$.getGlobalValue();
                SubLObject quoted_defn_info = NIL;
                quoted_defn_info = csome_list_var.first();
                while ((NIL == nearest_quoted_isa) && (NIL != csome_list_var)) {
                    SubLObject current;
                    final SubLObject datum = current = quoted_defn_info;
                    SubLObject quoted_defn = NIL;
                    SubLObject collection = NIL;
                    destructuring_bind_must_consp(current, datum, $list74);
                    quoted_defn = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list74);
                    collection = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != funcall(quoted_defn, v_object)) {
                            nearest_quoted_isa = collection;
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list74);
                    }
                    csome_list_var = csome_list_var.rest();
                    quoted_defn_info = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL != nearest_quoted_isa) {
            return list(nearest_quoted_isa);
        }
        return NIL;
    }

    public static final SubLObject all_quoted_defn_admits_alt(SubLObject v_object, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = domain_mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject nearest_quoted_isas = com.cyc.cycjava.cycl.defns.min_quoted_defn_admits(v_object, domain_mt);
                            result = genls.union_all_genls(nearest_quoted_isas, domain_mt, UNPROVIDED);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return cardinality_estimates.sort_by_generality_estimate(copy_list(result), $ASCENDING);
            }
        }
    }

    public static SubLObject all_quoted_defn_admits(final SubLObject v_object, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = domain_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject nearest_quoted_isas = min_quoted_defn_admits(v_object, domain_mt);
            result = genls.union_all_genls(nearest_quoted_isas, domain_mt, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return cardinality_estimates.sort_by_generality_estimate(copy_list(result), $ASCENDING);
    }

    public static SubLObject min_generalizations(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != fort_types_interface.isa_collection_in_any_mtP(v_object)) {
            return genls.min_genls(v_object, mt, UNPROVIDED);
        }
        if (NIL != cycl_grammar.cycl_unrepresented_term_p(v_object)) {
            return min_defn_admits(v_object, mt);
        }
        return isa.min_isa(v_object, mt, UNPROVIDED);
    }

    public static SubLObject genericize_term_wrt_types(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject types = min_generalizations(v_term, mt);
        final SubLObject collectionP = fort_types_interface.isa_collectionP(v_term, mt);
        return genericize_term_types_int(types, collectionP, mt);
    }

    public static SubLObject genericize_constraints_wrt_types(final SubLObject isa_constraints, final SubLObject genls_constraints, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != genls_constraints) {
            return genericize_term_types_int(genls_constraints, T, mt);
        }
        return genericize_term_types_int(isa_constraints, NIL, mt);
    }

    public static SubLObject genericize_term_types_int(final SubLObject types, final SubLObject qua_collectionP, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject col = (NIL != list_utilities.singletonP(types)) ? types.first() : NIL != list_utilities.doubletonP(types) ? make_formula($$CollectionIntersection2Fn, types, UNPROVIDED) : make_unary_formula($$CollectionIntersectionFn, make_el_set(types, UNPROVIDED));
        if (NIL != qua_collectionP) {
            return col;
        }
        return make_unary_formula($$SomeFn, col);
    }

    public static final SubLObject update_iff_or_suf_defn_alt(SubLObject assertion, SubLObject addP, SubLObject quotedP, SubLObject type) {
        {
            SubLObject col = assertions_high.gaf_arg1(assertion);
            com.cyc.cycjava.cycl.defns.update_suf_defn_cache(col, addP, quotedP);
            com.cyc.cycjava.cycl.defns.update_defns(col, assertion, addP, type);
            return col;
        }
    }

    public static SubLObject update_iff_or_suf_defn(final SubLObject assertion, final SubLObject addP, final SubLObject quotedP, final SubLObject type) {
        final SubLObject col = assertions_high.gaf_arg1(assertion);
        update_suf_defn_cache(col, addP, quotedP);
        update_defns(col, assertion, addP, type);
        return col;
    }

    public static final SubLObject update_nec_defn_alt(SubLObject assertion, SubLObject addP, SubLObject type) {
        {
            SubLObject col = assertions_high.gaf_arg1(assertion);
            com.cyc.cycjava.cycl.defns.update_defns(col, assertion, addP, type);
            return col;
        }
    }

    public static SubLObject update_nec_defn(final SubLObject assertion, final SubLObject addP, final SubLObject type) {
        final SubLObject col = assertions_high.gaf_arg1(assertion);
        update_defns(col, assertion, addP, type);
        return col;
    }

    public static final SubLObject new_add_iff_defn_alt(SubLObject source, SubLObject assertion) {
        return com.cyc.cycjava.cycl.defns.update_iff_or_suf_defn(assertion, T, NIL, $IFF);
    }

    public static SubLObject new_add_iff_defn(SubLObject source, final SubLObject assertion) {
        return update_iff_or_suf_defn(assertion, T, NIL, $IFF);
    }

    public static final SubLObject new_remove_iff_defn_alt(SubLObject source, SubLObject assertion) {
        return com.cyc.cycjava.cycl.defns.update_iff_or_suf_defn(assertion, NIL, NIL, $IFF);
    }

    public static SubLObject new_remove_iff_defn(SubLObject source, final SubLObject assertion) {
        return update_iff_or_suf_defn(assertion, NIL, NIL, $IFF);
    }

    public static final SubLObject new_add_suf_defn_alt(SubLObject source, SubLObject assertion) {
        return com.cyc.cycjava.cycl.defns.update_iff_or_suf_defn(assertion, T, NIL, $SUF);
    }

    public static SubLObject new_add_suf_defn(SubLObject source, final SubLObject assertion) {
        return update_iff_or_suf_defn(assertion, T, NIL, $SUF);
    }

    public static final SubLObject new_remove_suf_defn_alt(SubLObject source, SubLObject assertion) {
        return com.cyc.cycjava.cycl.defns.update_iff_or_suf_defn(assertion, NIL, NIL, $SUF);
    }

    public static SubLObject new_remove_suf_defn(SubLObject source, final SubLObject assertion) {
        return update_iff_or_suf_defn(assertion, NIL, NIL, $SUF);
    }

    public static final SubLObject add_nec_defn_alt(SubLObject source, SubLObject assertion) {
        return com.cyc.cycjava.cycl.defns.update_nec_defn(assertion, T, $NEC);
    }

    public static SubLObject add_nec_defn(SubLObject source, final SubLObject assertion) {
        return update_nec_defn(assertion, T, $NEC);
    }

    public static final SubLObject remove_nec_defn_alt(SubLObject source, SubLObject assertion) {
        return com.cyc.cycjava.cycl.defns.update_nec_defn(assertion, NIL, $NEC);
    }

    public static SubLObject remove_nec_defn(SubLObject source, final SubLObject assertion) {
        return update_nec_defn(assertion, NIL, $NEC);
    }

    public static final SubLObject new_add_iff_quoted_defn_alt(SubLObject source, SubLObject assertion) {
        return com.cyc.cycjava.cycl.defns.update_iff_or_suf_defn(assertion, T, T, $QIFF);
    }

    public static SubLObject new_add_iff_quoted_defn(SubLObject source, final SubLObject assertion) {
        return update_iff_or_suf_defn(assertion, T, T, $QIFF);
    }

    public static final SubLObject new_remove_iff_quoted_defn_alt(SubLObject source, SubLObject assertion) {
        return com.cyc.cycjava.cycl.defns.update_iff_or_suf_defn(assertion, NIL, T, $QIFF);
    }

    public static SubLObject new_remove_iff_quoted_defn(SubLObject source, final SubLObject assertion) {
        return update_iff_or_suf_defn(assertion, NIL, T, $QIFF);
    }

    public static final SubLObject new_add_suf_quoted_defn_alt(SubLObject source, SubLObject assertion) {
        return com.cyc.cycjava.cycl.defns.update_iff_or_suf_defn(assertion, T, T, $QSUF);
    }

    public static SubLObject new_add_suf_quoted_defn(SubLObject source, final SubLObject assertion) {
        return update_iff_or_suf_defn(assertion, T, T, $QSUF);
    }

    public static final SubLObject new_remove_suf_quoted_defn_alt(SubLObject source, SubLObject assertion) {
        return com.cyc.cycjava.cycl.defns.update_iff_or_suf_defn(assertion, NIL, T, $QSUF);
    }

    public static SubLObject new_remove_suf_quoted_defn(SubLObject source, final SubLObject assertion) {
        return update_iff_or_suf_defn(assertion, NIL, T, $QSUF);
    }

    public static final SubLObject add_nec_quoted_defn_alt(SubLObject source, SubLObject assertion) {
        return com.cyc.cycjava.cycl.defns.update_nec_defn(assertion, T, $QNEC);
    }

    public static SubLObject add_nec_quoted_defn(SubLObject source, final SubLObject assertion) {
        return update_nec_defn(assertion, T, $QNEC);
    }

    public static final SubLObject remove_nec_quoted_defn_alt(SubLObject source, SubLObject assertion) {
        return com.cyc.cycjava.cycl.defns.update_nec_defn(assertion, NIL, $QNEC);
    }

    public static SubLObject remove_nec_quoted_defn(SubLObject source, final SubLObject assertion) {
        return update_nec_defn(assertion, NIL, $QNEC);
    }

    public static final SubLObject handle_added_genl_for_suf_defns_int_alt(SubLObject spec, SubLObject genl, SubLObject quotedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject spec_suf_count = com.cyc.cycjava.cycl.defns.suf_defn_count(spec, quotedP);
                if (spec_suf_count.isInteger() && spec_suf_count.numG(ZERO_INTEGER)) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            {
                                SubLObject node_var = genl;
                                SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                SubLObject recur_deck = deck.create_deck(deck_type);
                                {
                                    SubLObject _prev_bind_0_54 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        {
                                            SubLObject tv_var = NIL;
                                            {
                                                SubLObject _prev_bind_0_55 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                SubLObject _prev_bind_1_56 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                    if (NIL != tv_var) {
                                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                {
                                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                    if (pcase_var.eql($ERROR)) {
                                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($CERROR)) {
                                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        } else {
                                                                            if (pcase_var.eql($WARN)) {
                                                                                Errors.warn($str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                            } else {
                                                                                Errors.warn($str_alt36$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                Errors.cerror($$$continue_anyway, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    {
                                                        SubLObject _prev_bind_0_57 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_58 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(genl, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                {
                                                                    SubLObject _prev_bind_0_59 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_60 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                    SubLObject _prev_bind_2_61 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                        while (NIL != node_var) {
                                                                            {
                                                                                SubLObject genl_col = node_var;
                                                                                com.cyc.cycjava.cycl.defns.inc_suf_defn_count(genl_col, quotedP, spec_suf_count);
                                                                            }
                                                                            {
                                                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                                SubLObject cdolist_list_var = accessible_modules;
                                                                                SubLObject module_var = NIL;
                                                                                for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_62 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_1_63 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                            {
                                                                                                SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                    {
                                                                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        if (NIL != d_link) {
                                                                                                            {
                                                                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != mt_links) {
                                                                                                                    {
                                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            {
                                                                                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                thread.resetMultipleValues();
                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_64 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                            {
                                                                                                                                                SubLObject iteration_state_65 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_65)) {
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    {
                                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_65);
                                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                            {
                                                                                                                                                                SubLObject _prev_bind_0_66 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                try {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                        SubLObject cdolist_list_var_67 = new_list;
                                                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                                                        for (node_vars_link_node = cdolist_list_var_67.first(); NIL != cdolist_list_var_67; cdolist_list_var_67 = cdolist_list_var_67.rest() , node_vars_link_node = cdolist_list_var_67.first()) {
                                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                } finally {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_66, thread);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        iteration_state_65 = dictionary_contents.do_dictionary_contents_next(iteration_state_65);
                                                                                                                                                    }
                                                                                                                                                } 
                                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_65);
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_64, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                            }
                                                                                                                        } 
                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt38$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                        {
                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            SubLObject cdolist_list_var_68 = new_list;
                                                                                                            SubLObject generating_fn = NIL;
                                                                                                            for (generating_fn = cdolist_list_var_68.first(); NIL != cdolist_list_var_68; cdolist_list_var_68 = cdolist_list_var_68.rest() , generating_fn = cdolist_list_var_68.first()) {
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_69 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                        {
                                                                                                                            SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                            SubLObject new_list_70 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                            SubLObject cdolist_list_var_71 = new_list_70;
                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                            for (node_vars_link_node = cdolist_list_var_71.first(); NIL != cdolist_list_var_71; cdolist_list_var_71 = cdolist_list_var_71.rest() , node_vars_link_node = cdolist_list_var_71.first()) {
                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_69, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_63, thread);
                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_62, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            node_var = deck.deck_pop(recur_deck);
                                                                        } 
                                                                    } finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_61, thread);
                                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_60, thread);
                                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_59, thread);
                                                                    }
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt39$Node__a_does_not_pass_sbhl_type_t, genl, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } finally {
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_58, thread);
                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_57, thread);
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_56, thread);
                                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_55, thread);
                                                }
                                            }
                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                        }
                                    } finally {
                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_54, thread);
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject handle_added_genl_for_suf_defns_int(final SubLObject spec, final SubLObject genl, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject spec_suf_count = suf_defn_count(spec, quotedP);
        if (spec_suf_count.isInteger() && spec_suf_count.numG(ZERO_INTEGER)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                SubLObject node_var = genl;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$52 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$53 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$54 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$54 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$55 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(genl, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$55 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$56 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$59 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while (NIL != node_var) {
                                            final SubLObject genl_col = node_var;
                                            inc_suf_defn_count(genl_col, quotedP, spec_suf_count);
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$56 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$57 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$57 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$63;
                                                                            for (iteration_state_$63 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$63); iteration_state_$63 = dictionary_contents.do_dictionary_contents_next(iteration_state_$63)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$63);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$58 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str46$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$58, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$63);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$57, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str47$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$65;
                                                            final SubLObject new_list = cdolist_list_var_$65 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$65.first();
                                                            while (NIL != cdolist_list_var_$65) {
                                                                final SubLObject _prev_bind_0_$59 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var2 = sol2;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (NIL != csome_list_var2) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str46$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$59, thread);
                                                                }
                                                                cdolist_list_var_$65 = cdolist_list_var_$65.rest();
                                                                generating_fn = cdolist_list_var_$65.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$57, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$56, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$59, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$56, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$55, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str48$Node__a_does_not_pass_sbhl_type_t, genl, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$55, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$54, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$54, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$53, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$60 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$52, thread);
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject reset_new_handle_added_genl_for_suf_defns_meters_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash($CALLS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
            sethash($TIMES, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
            sethash($RESULTS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
            sethash($ARGS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
            sethash($ARG_LIST, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), $list_alt87);
            sethash($FUNCTION, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS);
            return NIL;
        }
    }

    public static SubLObject reset_new_handle_added_genl_for_suf_defns_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), $list98);
        sethash($FUNCTION, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS);
        return NIL;
    }

    public static final SubLObject new_handle_added_genl_for_suf_defns_metered_alt(SubLObject spec, SubLObject genl) {
        return com.cyc.cycjava.cycl.defns.handle_added_genl_for_suf_defns_int(spec, genl, NIL);
    }

    public static SubLObject new_handle_added_genl_for_suf_defns_metered(final SubLObject spec, final SubLObject genl) {
        return handle_added_genl_for_suf_defns_int(spec, genl, NIL);
    }

    public static final SubLObject new_handle_added_genl_for_suf_defns_alt(SubLObject spec, SubLObject genl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
                {
                    SubLObject result = NIL;
                    SubLObject run_time = NIL;
                    SubLObject time_var = get_internal_real_time();
                    result = com.cyc.cycjava.cycl.defns.new_handle_added_genl_for_suf_defns_metered(spec, genl);
                    run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    sethash($CALLS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), add(gethash($CALLS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
                    sethash($TIMES, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
                    sethash($RESULTS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
                    sethash($ARGS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(list(spec, genl), gethash($ARGS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
                    return result;
                }
            } else {
                return com.cyc.cycjava.cycl.defns.new_handle_added_genl_for_suf_defns_metered(spec, genl);
            }
        }
    }

    public static SubLObject new_handle_added_genl_for_suf_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = new_handle_added_genl_for_suf_defns_metered(spec, genl);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), add(gethash($CALLS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(list(spec, genl), gethash($ARGS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return new_handle_added_genl_for_suf_defns_metered(spec, genl);
    }

    public static final SubLObject reset_new_handle_added_genl_for_suf_quoted_defns_meters_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash($CALLS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
            sethash($TIMES, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
            sethash($RESULTS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
            sethash($ARGS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
            sethash($ARG_LIST, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), $list_alt87);
            sethash($FUNCTION, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS);
            return NIL;
        }
    }

    public static SubLObject reset_new_handle_added_genl_for_suf_quoted_defns_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), $list98);
        sethash($FUNCTION, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS);
        return NIL;
    }

    public static final SubLObject new_handle_added_genl_for_suf_quoted_defns_metered_alt(SubLObject spec, SubLObject genl) {
        return com.cyc.cycjava.cycl.defns.handle_added_genl_for_suf_defns_int(spec, genl, T);
    }

    public static SubLObject new_handle_added_genl_for_suf_quoted_defns_metered(final SubLObject spec, final SubLObject genl) {
        return handle_added_genl_for_suf_defns_int(spec, genl, T);
    }

    public static final SubLObject new_handle_added_genl_for_suf_quoted_defns_alt(SubLObject spec, SubLObject genl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
                {
                    SubLObject result = NIL;
                    SubLObject run_time = NIL;
                    SubLObject time_var = get_internal_real_time();
                    result = com.cyc.cycjava.cycl.defns.new_handle_added_genl_for_suf_quoted_defns_metered(spec, genl);
                    run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    sethash($CALLS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), add(gethash($CALLS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
                    sethash($TIMES, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
                    sethash($RESULTS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
                    sethash($ARGS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(list(spec, genl), gethash($ARGS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
                    return result;
                }
            } else {
                return com.cyc.cycjava.cycl.defns.new_handle_added_genl_for_suf_quoted_defns_metered(spec, genl);
            }
        }
    }

    public static SubLObject new_handle_added_genl_for_suf_quoted_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = new_handle_added_genl_for_suf_quoted_defns_metered(spec, genl);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), add(gethash($CALLS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(list(spec, genl), gethash($ARGS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return new_handle_added_genl_for_suf_quoted_defns_metered(spec, genl);
    }

    public static final SubLObject handle_removed_genl_for_suf_defns_int_alt(SubLObject spec, SubLObject genl, SubLObject quotedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (NIL == genls.genlP(spec, genl, UNPROVIDED, UNPROVIDED)) {
                        {
                            SubLObject spec_suf_count = com.cyc.cycjava.cycl.defns.suf_defn_count(spec, quotedP);
                            if (spec_suf_count.isInteger() && spec_suf_count.numG(ZERO_INTEGER)) {
                                {
                                    SubLObject node_var = genl;
                                    SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                    SubLObject recur_deck = deck.create_deck(deck_type);
                                    {
                                        SubLObject _prev_bind_0_72 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            {
                                                SubLObject tv_var = NIL;
                                                {
                                                    SubLObject _prev_bind_0_73 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_74 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                        if (NIL != tv_var) {
                                                            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                    {
                                                                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                        if (pcase_var.eql($ERROR)) {
                                                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        } else {
                                                                            if (pcase_var.eql($CERROR)) {
                                                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } else {
                                                                                if (pcase_var.eql($WARN)) {
                                                                                    Errors.warn($str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                } else {
                                                                                    Errors.warn($str_alt36$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                    Errors.cerror($$$continue_anyway, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        {
                                                            SubLObject _prev_bind_0_75 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_76 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(genl, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                    {
                                                                        SubLObject _prev_bind_0_77 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_78 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_79 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                            while (NIL != node_var) {
                                                                                {
                                                                                    SubLObject genl_col = node_var;
                                                                                    com.cyc.cycjava.cycl.defns.dec_suf_defn_count(genl_col, quotedP, spec_suf_count);
                                                                                }
                                                                                {
                                                                                    SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                                    SubLObject cdolist_list_var = accessible_modules;
                                                                                    SubLObject module_var = NIL;
                                                                                    for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_80 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1_81 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                {
                                                                                                    SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                        {
                                                                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            if (NIL != d_link) {
                                                                                                                {
                                                                                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    if (NIL != mt_links) {
                                                                                                                        {
                                                                                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                thread.resetMultipleValues();
                                                                                                                                {
                                                                                                                                    SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                        {
                                                                                                                                            SubLObject _prev_bind_0_82 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                {
                                                                                                                                                    SubLObject iteration_state_83 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_83)) {
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        {
                                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_83);
                                                                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject _prev_bind_0_84 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                    try {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                            SubLObject cdolist_list_var_85 = new_list;
                                                                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                                                                            for (node_vars_link_node = cdolist_list_var_85.first(); NIL != cdolist_list_var_85; cdolist_list_var_85 = cdolist_list_var_85.rest() , node_vars_link_node = cdolist_list_var_85.first()) {
                                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    } finally {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_84, thread);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            iteration_state_83 = dictionary_contents.do_dictionary_contents_next(iteration_state_83);
                                                                                                                                                        }
                                                                                                                                                    } 
                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_83);
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_82, thread);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                }
                                                                                                                            } 
                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt38$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                            {
                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                SubLObject cdolist_list_var_86 = new_list;
                                                                                                                SubLObject generating_fn = NIL;
                                                                                                                for (generating_fn = cdolist_list_var_86.first(); NIL != cdolist_list_var_86; cdolist_list_var_86 = cdolist_list_var_86.rest() , generating_fn = cdolist_list_var_86.first()) {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_87 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                            {
                                                                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                SubLObject new_list_88 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                SubLObject cdolist_list_var_89 = new_list_88;
                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                for (node_vars_link_node = cdolist_list_var_89.first(); NIL != cdolist_list_var_89; cdolist_list_var_89 = cdolist_list_var_89.rest() , node_vars_link_node = cdolist_list_var_89.first()) {
                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_87, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_81, thread);
                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_80, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                node_var = deck.deck_pop(recur_deck);
                                                                            } 
                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_79, thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_78, thread);
                                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_77, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt39$Node__a_does_not_pass_sbhl_type_t, genl, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } finally {
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_76, thread);
                                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_75, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_74, thread);
                                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_73, thread);
                                                    }
                                                }
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                            }
                                        } finally {
                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_72, thread);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject handle_removed_genl_for_suf_defns_int(final SubLObject spec, final SubLObject genl, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL == genls.genlP(spec, genl, UNPROVIDED, UNPROVIDED)) {
                final SubLObject spec_suf_count = suf_defn_count(spec, quotedP);
                if (spec_suf_count.isInteger() && spec_suf_count.numG(ZERO_INTEGER)) {
                    SubLObject node_var = genl;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$68 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = NIL;
                            final SubLObject _prev_bind_0_$69 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$70 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$70 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$71 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(genl, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$71 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$72 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$75 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                            while (NIL != node_var) {
                                                final SubLObject genl_col = node_var;
                                                dec_suf_defn_count(genl_col, quotedP, spec_suf_count);
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$72 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$73 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(node_var);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$73 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$79;
                                                                                for (iteration_state_$79 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$79); iteration_state_$79 = dictionary_contents.do_dictionary_contents_next(iteration_state_$79)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$79);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$74 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str46$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$74, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$79);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$73, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str47$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$81;
                                                                final SubLObject new_list = cdolist_list_var_$81 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$81.first();
                                                                while (NIL != cdolist_list_var_$81) {
                                                                    final SubLObject _prev_bind_0_$75 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var2 = sol2;
                                                                                SubLObject node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                while (NIL != csome_list_var2) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str46$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$75, thread);
                                                                    }
                                                                    cdolist_list_var_$81 = cdolist_list_var_$81.rest();
                                                                    generating_fn = cdolist_list_var_$81.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$73, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$72, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                } 
                                                node_var = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$75, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$72, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$71, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str48$Node__a_does_not_pass_sbhl_type_t, genl, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$71, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$70, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$70, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$69, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$76 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$76, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$68, thread);
                    }
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject reset_new_handle_removed_genl_for_suf_defns_meters_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash($CALLS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
            sethash($TIMES, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
            sethash($RESULTS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
            sethash($ARGS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
            sethash($ARG_LIST, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), $list_alt87);
            sethash($FUNCTION, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS);
            return NIL;
        }
    }

    public static SubLObject reset_new_handle_removed_genl_for_suf_defns_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), $list98);
        sethash($FUNCTION, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS);
        return NIL;
    }

    public static final SubLObject new_handle_removed_genl_for_suf_defns_metered_alt(SubLObject spec, SubLObject genl) {
        return com.cyc.cycjava.cycl.defns.handle_removed_genl_for_suf_defns_int(spec, genl, NIL);
    }

    public static SubLObject new_handle_removed_genl_for_suf_defns_metered(final SubLObject spec, final SubLObject genl) {
        return handle_removed_genl_for_suf_defns_int(spec, genl, NIL);
    }

    public static final SubLObject new_handle_removed_genl_for_suf_defns_alt(SubLObject spec, SubLObject genl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
                {
                    SubLObject result = NIL;
                    SubLObject run_time = NIL;
                    SubLObject time_var = get_internal_real_time();
                    result = com.cyc.cycjava.cycl.defns.new_handle_removed_genl_for_suf_defns_metered(spec, genl);
                    run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    sethash($CALLS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), add(gethash($CALLS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
                    sethash($TIMES, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
                    sethash($RESULTS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
                    sethash($ARGS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(list(spec, genl), gethash($ARGS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
                    return result;
                }
            } else {
                return com.cyc.cycjava.cycl.defns.new_handle_removed_genl_for_suf_defns_metered(spec, genl);
            }
        }
    }

    public static SubLObject new_handle_removed_genl_for_suf_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = new_handle_removed_genl_for_suf_defns_metered(spec, genl);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), add(gethash($CALLS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(list(spec, genl), gethash($ARGS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return new_handle_removed_genl_for_suf_defns_metered(spec, genl);
    }

    public static final SubLObject reset_new_handle_removed_genl_for_suf_quoted_defns_meters_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash($CALLS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
            sethash($TIMES, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
            sethash($RESULTS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
            sethash($ARGS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
            sethash($ARG_LIST, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), $list_alt87);
            sethash($FUNCTION, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS);
            return NIL;
        }
    }

    public static SubLObject reset_new_handle_removed_genl_for_suf_quoted_defns_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), $list98);
        sethash($FUNCTION, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS);
        return NIL;
    }

    public static final SubLObject new_handle_removed_genl_for_suf_quoted_defns_metered_alt(SubLObject spec, SubLObject genl) {
        return com.cyc.cycjava.cycl.defns.handle_removed_genl_for_suf_defns_int(spec, genl, T);
    }

    public static SubLObject new_handle_removed_genl_for_suf_quoted_defns_metered(final SubLObject spec, final SubLObject genl) {
        return handle_removed_genl_for_suf_defns_int(spec, genl, T);
    }

    public static final SubLObject new_handle_removed_genl_for_suf_quoted_defns_alt(SubLObject spec, SubLObject genl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
                {
                    SubLObject result = NIL;
                    SubLObject run_time = NIL;
                    SubLObject time_var = get_internal_real_time();
                    result = com.cyc.cycjava.cycl.defns.new_handle_removed_genl_for_suf_quoted_defns_metered(spec, genl);
                    run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    sethash($CALLS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), add(gethash($CALLS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
                    sethash($TIMES, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
                    sethash($RESULTS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
                    sethash($ARGS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(list(spec, genl), gethash($ARGS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
                    return result;
                }
            } else {
                return com.cyc.cycjava.cycl.defns.new_handle_removed_genl_for_suf_quoted_defns_metered(spec, genl);
            }
        }
    }

    public static SubLObject new_handle_removed_genl_for_suf_quoted_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = new_handle_removed_genl_for_suf_quoted_defns_metered(spec, genl);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), add(gethash($CALLS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(list(spec, genl), gethash($ARGS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return new_handle_removed_genl_for_suf_quoted_defns_metered(spec, genl);
    }

    public static final SubLObject clear_defns_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
                return NIL;
            }
            if (NIL != $has_suf_defn_cache$.getDynamicValue(thread)) {
                clrhash($has_suf_defn_cache$.getDynamicValue(thread));
            }
            if (NIL != $iff_defns$.getDynamicValue(thread)) {
                clrhash($iff_defns$.getDynamicValue(thread));
            }
            if (NIL != $suf_defns$.getDynamicValue(thread)) {
                clrhash($suf_defns$.getDynamicValue(thread));
            }
            if (NIL != $nec_defns$.getDynamicValue(thread)) {
                clrhash($nec_defns$.getDynamicValue(thread));
            }
            if (NIL != $has_quoted_suf_defn_cache$.getDynamicValue(thread)) {
                clrhash($has_quoted_suf_defn_cache$.getDynamicValue(thread));
            }
            if (NIL != $quoted_iff_defns$.getDynamicValue(thread)) {
                clrhash($quoted_iff_defns$.getDynamicValue(thread));
            }
            if (NIL != $quoted_suf_defns$.getDynamicValue(thread)) {
                clrhash($quoted_suf_defns$.getDynamicValue(thread));
            }
            if (NIL != $quoted_nec_defns$.getDynamicValue(thread)) {
                clrhash($quoted_nec_defns$.getDynamicValue(thread));
            }
            return NIL;
        }
    }

    public static SubLObject clear_defns() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return NIL;
        }
        if (NIL != defns_cache_definedP($has_suf_defn_cache_index$.getGlobalValue())) {
            defns_cache_clrhash($has_suf_defn_cache_index$.getGlobalValue());
        }
        if (NIL != defns_cache_definedP($iff_defns_index$.getGlobalValue())) {
            defns_cache_clrhash($iff_defns_index$.getGlobalValue());
        }
        if (NIL != defns_cache_definedP($suf_defns_index$.getGlobalValue())) {
            defns_cache_clrhash($suf_defns_index$.getGlobalValue());
        }
        if (NIL != defns_cache_definedP($nec_defns_index$.getGlobalValue())) {
            defns_cache_clrhash($nec_defns_index$.getGlobalValue());
        }
        if (NIL != defns_cache_definedP($has_quoted_suf_defn_cache_index$.getGlobalValue())) {
            defns_cache_clrhash($has_quoted_suf_defn_cache_index$.getGlobalValue());
        }
        if (NIL != defns_cache_definedP($quoted_iff_defns_index$.getGlobalValue())) {
            defns_cache_clrhash($quoted_iff_defns_index$.getGlobalValue());
        }
        if (NIL != defns_cache_definedP($quoted_suf_defns_index$.getGlobalValue())) {
            defns_cache_clrhash($quoted_suf_defns_index$.getGlobalValue());
        }
        if (NIL != defns_cache_definedP($quoted_nec_defns_index$.getGlobalValue())) {
            defns_cache_clrhash($quoted_nec_defns_index$.getGlobalValue());
        }
        return NIL;
    }

    public static final SubLObject initialize_defns_cache_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $has_suf_defn_cache$.getDynamicValue(thread)) {
                $has_suf_defn_cache$.setDynamicValue(make_hash_table($int$400, UNPROVIDED, UNPROVIDED), thread);
            }
            if (NIL == $iff_defns$.getDynamicValue(thread)) {
                $iff_defns$.setDynamicValue(make_hash_table($int$100, UNPROVIDED, UNPROVIDED), thread);
            }
            if (NIL == $suf_defns$.getDynamicValue(thread)) {
                $suf_defns$.setDynamicValue(make_hash_table($int$100, UNPROVIDED, UNPROVIDED), thread);
            }
            if (NIL == $nec_defns$.getDynamicValue(thread)) {
                $nec_defns$.setDynamicValue(make_hash_table($int$100, UNPROVIDED, UNPROVIDED), thread);
            }
            if (NIL == $has_quoted_suf_defn_cache$.getDynamicValue(thread)) {
                $has_quoted_suf_defn_cache$.setDynamicValue(make_hash_table($int$400, UNPROVIDED, UNPROVIDED), thread);
            }
            if (NIL == $quoted_iff_defns$.getDynamicValue(thread)) {
                $quoted_iff_defns$.setDynamicValue(make_hash_table($int$100, UNPROVIDED, UNPROVIDED), thread);
            }
            if (NIL == $quoted_suf_defns$.getDynamicValue(thread)) {
                $quoted_suf_defns$.setDynamicValue(make_hash_table($int$100, UNPROVIDED, UNPROVIDED), thread);
            }
            if (NIL == $quoted_nec_defns$.getDynamicValue(thread)) {
                $quoted_nec_defns$.setDynamicValue(make_hash_table($int$100, UNPROVIDED, UNPROVIDED), thread);
            }
            return NIL;
        }
    }

    public static SubLObject initialize_defns_cache() {
        if (NIL == defns_cache_definedP($has_suf_defn_cache_index$.getGlobalValue())) {
            defns_cache_make_hash_table($has_suf_defn_cache_index$.getGlobalValue(), $int$400);
        }
        if (NIL == defns_cache_definedP($iff_defns_index$.getGlobalValue())) {
            defns_cache_make_hash_table($iff_defns_index$.getGlobalValue(), $int$100);
        }
        if (NIL == defns_cache_definedP($suf_defns_index$.getGlobalValue())) {
            defns_cache_make_hash_table($suf_defns_index$.getGlobalValue(), $int$100);
        }
        if (NIL == defns_cache_definedP($nec_defns_index$.getGlobalValue())) {
            defns_cache_make_hash_table($nec_defns_index$.getGlobalValue(), $int$100);
        }
        if (NIL == defns_cache_definedP($has_quoted_suf_defn_cache_index$.getGlobalValue())) {
            defns_cache_make_hash_table($has_quoted_suf_defn_cache_index$.getGlobalValue(), $int$400);
        }
        if (NIL == defns_cache_definedP($quoted_iff_defns_index$.getGlobalValue())) {
            defns_cache_make_hash_table($quoted_iff_defns_index$.getGlobalValue(), $int$100);
        }
        if (NIL == defns_cache_definedP($quoted_suf_defns_index$.getGlobalValue())) {
            defns_cache_make_hash_table($quoted_suf_defns_index$.getGlobalValue(), $int$100);
        }
        if (NIL == defns_cache_definedP($quoted_nec_defns_index$.getGlobalValue())) {
            defns_cache_make_hash_table($quoted_nec_defns_index$.getGlobalValue(), $int$100);
        }
        return NIL;
    }

    public static final SubLObject initialize_defns_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
                return NIL;
            }
            {
                SubLObject _prev_bind_0 = $noting_progress_start_time$.currentBinding(thread);
                try {
                    $noting_progress_start_time$.bind(get_universal_time(), thread);
                    noting_progress_preamble($str_alt104$Initializing_defns___);
                    com.cyc.cycjava.cycl.defns.initialize_defns_cache();
                    com.cyc.cycjava.cycl.defns.clear_defns();
                    {
                        SubLObject _prev_bind_0_90 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            {
                                SubLObject pred_var = $$defnIff;
                                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                        SubLObject done_var = NIL;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                            {
                                                                SubLObject done_var_91 = NIL;
                                                                SubLObject token_var_92 = NIL;
                                                                while (NIL == done_var_91) {
                                                                    {
                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_92);
                                                                        SubLObject valid_93 = makeBoolean(token_var_92 != assertion);
                                                                        if (NIL != valid_93) {
                                                                            at_defns.add_iff_defn(assertion, assertion);
                                                                        }
                                                                        done_var_91 = makeBoolean(NIL == valid_93);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_94 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_94, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                }
                            }
                            {
                                SubLObject pred_var = $$defnSufficient;
                                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                        SubLObject done_var = NIL;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                            {
                                                                SubLObject done_var_95 = NIL;
                                                                SubLObject token_var_96 = NIL;
                                                                while (NIL == done_var_95) {
                                                                    {
                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_96);
                                                                        SubLObject valid_97 = makeBoolean(token_var_96 != assertion);
                                                                        if (NIL != valid_97) {
                                                                            at_defns.add_suf_defn(assertion, assertion);
                                                                        }
                                                                        done_var_95 = makeBoolean(NIL == valid_97);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_98 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_98, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                }
                            }
                            {
                                SubLObject pred_var = $$defnNecessary;
                                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                        SubLObject done_var = NIL;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                            {
                                                                SubLObject done_var_99 = NIL;
                                                                SubLObject token_var_100 = NIL;
                                                                while (NIL == done_var_99) {
                                                                    {
                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_100);
                                                                        SubLObject valid_101 = makeBoolean(token_var_100 != assertion);
                                                                        if (NIL != valid_101) {
                                                                            com.cyc.cycjava.cycl.defns.add_nec_defn(assertion, assertion);
                                                                        }
                                                                        done_var_99 = makeBoolean(NIL == valid_101);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_102 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_102, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                }
                            }
                            {
                                SubLObject pred_var = $$quotedDefnIff;
                                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                        SubLObject done_var = NIL;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                            {
                                                                SubLObject done_var_103 = NIL;
                                                                SubLObject token_var_104 = NIL;
                                                                while (NIL == done_var_103) {
                                                                    {
                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_104);
                                                                        SubLObject valid_105 = makeBoolean(token_var_104 != assertion);
                                                                        if (NIL != valid_105) {
                                                                            at_defns.add_iff_quoted_defn(assertion, assertion);
                                                                        }
                                                                        done_var_103 = makeBoolean(NIL == valid_105);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_106 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_106, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                }
                            }
                            {
                                SubLObject pred_var = $$quotedDefnSufficient;
                                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                        SubLObject done_var = NIL;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                            {
                                                                SubLObject done_var_107 = NIL;
                                                                SubLObject token_var_108 = NIL;
                                                                while (NIL == done_var_107) {
                                                                    {
                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_108);
                                                                        SubLObject valid_109 = makeBoolean(token_var_108 != assertion);
                                                                        if (NIL != valid_109) {
                                                                            at_defns.add_suf_quoted_defn(assertion, assertion);
                                                                        }
                                                                        done_var_107 = makeBoolean(NIL == valid_109);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_110 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_110, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                }
                            }
                            {
                                SubLObject pred_var = $$quotedDefnNecessary;
                                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                        SubLObject done_var = NIL;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                            {
                                                                SubLObject done_var_111 = NIL;
                                                                SubLObject token_var_112 = NIL;
                                                                while (NIL == done_var_111) {
                                                                    {
                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_112);
                                                                        SubLObject valid_113 = makeBoolean(token_var_112 != assertion);
                                                                        if (NIL != valid_113) {
                                                                            com.cyc.cycjava.cycl.defns.add_nec_quoted_defn(assertion, assertion);
                                                                        }
                                                                        done_var_111 = makeBoolean(NIL == valid_113);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_114 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_114, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_90, thread);
                        }
                    }
                    noting_progress_postamble();
                } finally {
                    $noting_progress_start_time$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject initialize_defns() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return NIL;
        }
        final SubLObject str = $str112$Initializing_defns___;
        final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
        try {
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            $progress_notification_count$.bind(ZERO_INTEGER, thread);
            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
            $progress_count$.bind(ZERO_INTEGER, thread);
            $is_noting_progressP$.bind(T, thread);
            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
            noting_progress_preamble(str);
            initialize_defns_cache();
            clear_defns();
            final SubLObject _prev_bind_0_$84 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$85 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                SubLObject pred_var = $$defnIff;
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str_$86 = NIL;
                    final SubLObject _prev_bind_0_$85 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$86 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$89 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$90 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_4_$91 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_5_$92 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_6_$93 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_7_$94 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str_$86 ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str_$86);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                note_progress();
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$95 = NIL;
                                    final SubLObject token_var_$96 = NIL;
                                    while (NIL == done_var_$95) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$96);
                                        final SubLObject valid_$97 = makeBoolean(!token_var_$96.eql(assertion));
                                        if (NIL != valid_$97) {
                                            at_defns.add_iff_defn(assertion, assertion);
                                        }
                                        done_var_$95 = makeBoolean(NIL == valid_$97);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$86 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$86, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_7_$94, thread);
                        $is_noting_progressP$.rebind(_prev_bind_6_$93, thread);
                        $progress_count$.rebind(_prev_bind_5_$92, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$91, thread);
                        $progress_notification_count$.rebind(_prev_bind_3_$90, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$89, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_1_$86, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$85, thread);
                    }
                }
                pred_var = $$defnSufficient;
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str_$87 = NIL;
                    final SubLObject _prev_bind_0_$87 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$87 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$90 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$91 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_4_$92 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_5_$93 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_6_$94 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_7_$95 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str_$87 ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str_$87);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                note_progress();
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$96 = NIL;
                                    final SubLObject token_var_$97 = NIL;
                                    while (NIL == done_var_$96) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$97);
                                        final SubLObject valid_$98 = makeBoolean(!token_var_$97.eql(assertion));
                                        if (NIL != valid_$98) {
                                            at_defns.add_suf_defn(assertion, assertion);
                                        }
                                        done_var_$96 = makeBoolean(NIL == valid_$98);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$88 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$88, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_7_$95, thread);
                        $is_noting_progressP$.rebind(_prev_bind_6_$94, thread);
                        $progress_count$.rebind(_prev_bind_5_$93, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$92, thread);
                        $progress_notification_count$.rebind(_prev_bind_3_$91, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$90, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_1_$87, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$87, thread);
                    }
                }
                pred_var = $$defnNecessary;
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str_$88 = NIL;
                    final SubLObject _prev_bind_0_$89 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$88 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$91 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$92 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_4_$93 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_5_$94 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_6_$95 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_7_$96 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str_$88 ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str_$88);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                note_progress();
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$97 = NIL;
                                    final SubLObject token_var_$98 = NIL;
                                    while (NIL == done_var_$97) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$98);
                                        final SubLObject valid_$99 = makeBoolean(!token_var_$98.eql(assertion));
                                        if (NIL != valid_$99) {
                                            add_nec_defn(assertion, assertion);
                                        }
                                        done_var_$97 = makeBoolean(NIL == valid_$99);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$90 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$90, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_7_$96, thread);
                        $is_noting_progressP$.rebind(_prev_bind_6_$95, thread);
                        $progress_count$.rebind(_prev_bind_5_$94, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$93, thread);
                        $progress_notification_count$.rebind(_prev_bind_3_$92, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$91, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_1_$88, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$89, thread);
                    }
                }
                pred_var = $$quotedDefnIff;
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str_$89 = NIL;
                    final SubLObject _prev_bind_0_$91 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$89 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$92 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$93 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_4_$94 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_5_$95 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_6_$96 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_7_$97 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str_$89 ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str_$89);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                note_progress();
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$98 = NIL;
                                    final SubLObject token_var_$99 = NIL;
                                    while (NIL == done_var_$98) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$99);
                                        final SubLObject valid_$100 = makeBoolean(!token_var_$99.eql(assertion));
                                        if (NIL != valid_$100) {
                                            at_defns.add_iff_quoted_defn(assertion, assertion);
                                        }
                                        done_var_$98 = makeBoolean(NIL == valid_$100);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$92 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$92, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_7_$97, thread);
                        $is_noting_progressP$.rebind(_prev_bind_6_$96, thread);
                        $progress_count$.rebind(_prev_bind_5_$95, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$94, thread);
                        $progress_notification_count$.rebind(_prev_bind_3_$93, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$92, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_1_$89, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$91, thread);
                    }
                }
                pred_var = $$quotedDefnSufficient;
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str_$90 = NIL;
                    final SubLObject _prev_bind_0_$93 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$90 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$93 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$94 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_4_$95 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_5_$96 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_6_$97 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_7_$98 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str_$90 ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str_$90);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                note_progress();
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$99 = NIL;
                                    final SubLObject token_var_$100 = NIL;
                                    while (NIL == done_var_$99) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$100);
                                        final SubLObject valid_$101 = makeBoolean(!token_var_$100.eql(assertion));
                                        if (NIL != valid_$101) {
                                            at_defns.add_suf_quoted_defn(assertion, assertion);
                                        }
                                        done_var_$99 = makeBoolean(NIL == valid_$101);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$94 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_7_$98, thread);
                        $is_noting_progressP$.rebind(_prev_bind_6_$97, thread);
                        $progress_count$.rebind(_prev_bind_5_$96, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$95, thread);
                        $progress_notification_count$.rebind(_prev_bind_3_$94, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$93, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_1_$90, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$93, thread);
                    }
                }
                pred_var = $$quotedDefnNecessary;
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str_$91 = NIL;
                    final SubLObject _prev_bind_0_$95 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$91 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$94 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$95 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_4_$96 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_5_$97 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_6_$98 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_7_$99 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str_$91 ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str_$91);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                note_progress();
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$100 = NIL;
                                    final SubLObject token_var_$101 = NIL;
                                    while (NIL == done_var_$100) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$101);
                                        final SubLObject valid_$102 = makeBoolean(!token_var_$101.eql(assertion));
                                        if (NIL != valid_$102) {
                                            add_nec_quoted_defn(assertion, assertion);
                                        }
                                        done_var_$100 = makeBoolean(NIL == valid_$102);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$96 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values6 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values6);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$96, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_7_$99, thread);
                        $is_noting_progressP$.rebind(_prev_bind_6_$98, thread);
                        $progress_count$.rebind(_prev_bind_5_$97, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$96, thread);
                        $progress_notification_count$.rebind(_prev_bind_3_$95, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$94, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_1_$91, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$95, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$85, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$84, thread);
            }
            noting_progress_postamble();
        } finally {
            $silent_progressP$.rebind(_prev_bind_8, thread);
            $is_noting_progressP$.rebind(_prev_bind_7, thread);
            $progress_count$.rebind(_prev_bind_6, thread);
            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            $progress_notification_count$.rebind(_prev_bind_4, thread);
            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            $progress_start_time$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject inc_suf_defn_count_alt(SubLObject col, SubLObject quotedP, SubLObject count) {
        if (count == UNPROVIDED) {
            count = ONE_INTEGER;
        }
        {
            SubLObject suf_defn_count = com.cyc.cycjava.cycl.defns.suf_defn_count(col, quotedP);
            if (NIL == suf_defn_count) {
                suf_defn_count = ZERO_INTEGER;
            }
            suf_defn_count = add(suf_defn_count, count);
            com.cyc.cycjava.cycl.defns.set_suf_defn_count(col, suf_defn_count, quotedP);
            return suf_defn_count;
        }
    }

    public static SubLObject inc_suf_defn_count(final SubLObject col, final SubLObject quotedP, SubLObject count) {
        if (count == UNPROVIDED) {
            count = ONE_INTEGER;
        }
        SubLObject suf_defn_count = suf_defn_count(col, quotedP);
        if (NIL == suf_defn_count) {
            suf_defn_count = ZERO_INTEGER;
        }
        suf_defn_count = add(suf_defn_count, count);
        set_suf_defn_count(col, suf_defn_count, quotedP);
        return suf_defn_count;
    }

    public static final SubLObject dec_suf_defn_count_alt(SubLObject col, SubLObject quotedP, SubLObject count) {
        if (count == UNPROVIDED) {
            count = ONE_INTEGER;
        }
        {
            SubLObject suf_defn_count = com.cyc.cycjava.cycl.defns.suf_defn_count(col, quotedP);
            if (!suf_defn_count.isInteger()) {
                suf_defn_count = ZERO_INTEGER;
            }
            suf_defn_count = subtract(suf_defn_count, count);
            if (suf_defn_count.numG(ZERO_INTEGER)) {
                com.cyc.cycjava.cycl.defns.set_suf_defn_count(col, suf_defn_count, quotedP);
            } else {
                com.cyc.cycjava.cycl.defns.rem_suf_defn_count(col, quotedP);
            }
            return suf_defn_count;
        }
    }

    public static SubLObject dec_suf_defn_count(final SubLObject col, final SubLObject quotedP, SubLObject count) {
        if (count == UNPROVIDED) {
            count = ONE_INTEGER;
        }
        SubLObject suf_defn_count = suf_defn_count(col, quotedP);
        if (!suf_defn_count.isInteger()) {
            suf_defn_count = ZERO_INTEGER;
        }
        suf_defn_count = subtract(suf_defn_count, count);
        if (suf_defn_count.numG(ZERO_INTEGER)) {
            set_suf_defn_count(col, suf_defn_count, quotedP);
        } else {
            rem_suf_defn_count(col, quotedP);
        }
        return suf_defn_count;
    }

    public static final SubLObject update_suf_defn_cache_alt(SubLObject col, SubLObject incP, SubLObject quotedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (NIL != incP) {
                        {
                            SubLObject node_var = col;
                            SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                            SubLObject recur_deck = deck.create_deck(deck_type);
                            {
                                SubLObject _prev_bind_0_115 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_116 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_117 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt36$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_118 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_119 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_120 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_121 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_122 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                    while (NIL != node_var) {
                                                                        {
                                                                            SubLObject genl = node_var;
                                                                            com.cyc.cycjava.cycl.defns.inc_suf_defn_count(genl, quotedP, UNPROVIDED);
                                                                        }
                                                                        {
                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                            SubLObject module_var = NIL;
                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_123 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_124 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                {
                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                    if (NIL != d_link) {
                                                                                                        {
                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            if (NIL != mt_links) {
                                                                                                                {
                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        {
                                                                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_125 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state_126 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_126)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_126);
                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_127 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                    SubLObject cdolist_list_var_128 = new_list;
                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_128.first(); NIL != cdolist_list_var_128; cdolist_list_var_128 = cdolist_list_var_128.rest() , node_vars_link_node = cdolist_list_var_128.first()) {
                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_127, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state_126 = dictionary_contents.do_dictionary_contents_next(iteration_state_126);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_126);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_125, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                        }
                                                                                                                    } 
                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt38$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                    {
                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        SubLObject cdolist_list_var_129 = new_list;
                                                                                                        SubLObject generating_fn = NIL;
                                                                                                        for (generating_fn = cdolist_list_var_129.first(); NIL != cdolist_list_var_129; cdolist_list_var_129 = cdolist_list_var_129.rest() , generating_fn = cdolist_list_var_129.first()) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_130 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                    {
                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                        SubLObject new_list_131 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                        SubLObject cdolist_list_var_132 = new_list_131;
                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                        for (node_vars_link_node = cdolist_list_var_132.first(); NIL != cdolist_list_var_132; cdolist_list_var_132 = cdolist_list_var_132.rest() , node_vars_link_node = cdolist_list_var_132.first()) {
                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_130, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_124, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_123, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        node_var = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_122, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_121, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_120, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt39$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_119, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_118, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_117, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_116, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_115, thread);
                                }
                            }
                        }
                    } else {
                        {
                            SubLObject node_var = col;
                            SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                            SubLObject recur_deck = deck.create_deck(deck_type);
                            {
                                SubLObject _prev_bind_0_133 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_134 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_135 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt36$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_136 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_137 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_138 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_139 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_140 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                    while (NIL != node_var) {
                                                                        {
                                                                            SubLObject genl = node_var;
                                                                            com.cyc.cycjava.cycl.defns.dec_suf_defn_count(genl, quotedP, UNPROVIDED);
                                                                        }
                                                                        {
                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                            SubLObject module_var = NIL;
                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_141 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_142 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                {
                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                    if (NIL != d_link) {
                                                                                                        {
                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            if (NIL != mt_links) {
                                                                                                                {
                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        {
                                                                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_143 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state_144 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_144)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_144);
                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_145 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                    SubLObject cdolist_list_var_146 = new_list;
                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_146.first(); NIL != cdolist_list_var_146; cdolist_list_var_146 = cdolist_list_var_146.rest() , node_vars_link_node = cdolist_list_var_146.first()) {
                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_145, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state_144 = dictionary_contents.do_dictionary_contents_next(iteration_state_144);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_144);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_143, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                        }
                                                                                                                    } 
                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt38$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                    {
                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        SubLObject cdolist_list_var_147 = new_list;
                                                                                                        SubLObject generating_fn = NIL;
                                                                                                        for (generating_fn = cdolist_list_var_147.first(); NIL != cdolist_list_var_147; cdolist_list_var_147 = cdolist_list_var_147.rest() , generating_fn = cdolist_list_var_147.first()) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_148 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                    {
                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                        SubLObject new_list_149 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                        SubLObject cdolist_list_var_150 = new_list_149;
                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                        for (node_vars_link_node = cdolist_list_var_150.first(); NIL != cdolist_list_var_150; cdolist_list_var_150 = cdolist_list_var_150.rest() , node_vars_link_node = cdolist_list_var_150.first()) {
                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_148, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_142, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_141, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        node_var = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_140, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_139, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_138, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt39$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_137, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_136, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_135, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_134, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_133, thread);
                                }
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject update_suf_defn_cache(final SubLObject col, final SubLObject incP, final SubLObject quotedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != incP) {
                SubLObject node_var = col;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$164 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$165 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$166 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$166 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$167 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$167 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$168 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$171 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while (NIL != node_var) {
                                            final SubLObject genl = node_var;
                                            inc_suf_defn_count(genl, quotedP, UNPROVIDED);
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$168 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$169 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$169 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$175;
                                                                            for (iteration_state_$175 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$175); iteration_state_$175 = dictionary_contents.do_dictionary_contents_next(iteration_state_$175)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$175);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$170 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str46$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$170, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$175);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$169, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str47$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$177;
                                                            final SubLObject new_list = cdolist_list_var_$177 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$177.first();
                                                            while (NIL != cdolist_list_var_$177) {
                                                                final SubLObject _prev_bind_0_$171 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var2 = sol2;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (NIL != csome_list_var2) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str46$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$171, thread);
                                                                }
                                                                cdolist_list_var_$177 = cdolist_list_var_$177.rest();
                                                                generating_fn = cdolist_list_var_$177.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$169, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$168, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$171, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$168, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$167, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str48$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$167, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$166, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$166, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$165, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$172 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$172, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$164, thread);
                }
            } else {
                SubLObject node_var = col;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$173 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$174 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$170 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$175 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$171 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$176 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$172 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$172 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while (NIL != node_var) {
                                            final SubLObject genl = node_var;
                                            dec_suf_defn_count(genl, quotedP, UNPROVIDED);
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$177 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$173 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$178 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$176;
                                                                            for (iteration_state_$176 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$176); iteration_state_$176 = dictionary_contents.do_dictionary_contents_next(iteration_state_$176)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$176);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$179 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str46$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$179, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$176);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$178, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str47$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$178;
                                                            final SubLObject new_list = cdolist_list_var_$178 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$178.first();
                                                            while (NIL != cdolist_list_var_$178) {
                                                                final SubLObject _prev_bind_0_$180 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var2 = sol2;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (NIL != csome_list_var2) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str46$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$180, thread);
                                                                }
                                                                cdolist_list_var_$178 = cdolist_list_var_$178.rest();
                                                                generating_fn = cdolist_list_var_$178.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$173, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$177, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$172, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$172, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$176, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str48$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$171, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$175, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$170, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$174, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$181 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$181, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$173, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject update_defns_alt(SubLObject col, SubLObject defn_assertion, SubLObject addP, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = type;
                if (pcase_var.eql($IFF)) {
                    if (NIL != addP) {
                        return sethash(col, $iff_defns$.getDynamicValue(thread), defn_assertion);
                    } else {
                        return remhash(col, $iff_defns$.getDynamicValue(thread));
                    }
                } else {
                    if (pcase_var.eql($QIFF)) {
                        if (NIL != addP) {
                            return sethash(col, $quoted_iff_defns$.getDynamicValue(thread), defn_assertion);
                        } else {
                            return remhash(col, $quoted_iff_defns$.getDynamicValue(thread));
                        }
                    } else {
                        if (pcase_var.eql($SUF)) {
                            if (NIL != addP) {
                                return push_hash(col, defn_assertion, $suf_defns$.getDynamicValue(thread));
                            } else {
                                return remove_value_from_hash(col, defn_assertion, $suf_defns$.getDynamicValue(thread), UNPROVIDED);
                            }
                        } else {
                            if (pcase_var.eql($QSUF)) {
                                if (NIL != addP) {
                                    return push_hash(col, defn_assertion, $quoted_suf_defns$.getDynamicValue(thread));
                                } else {
                                    return remove_value_from_hash(col, defn_assertion, $quoted_suf_defns$.getDynamicValue(thread), UNPROVIDED);
                                }
                            } else {
                                if (pcase_var.eql($NEC)) {
                                    if (NIL != addP) {
                                        return push_hash(col, defn_assertion, $nec_defns$.getDynamicValue(thread));
                                    } else {
                                        return remove_value_from_hash(col, defn_assertion, $nec_defns$.getDynamicValue(thread), UNPROVIDED);
                                    }
                                } else {
                                    if (pcase_var.eql($QNEC)) {
                                        if (NIL != addP) {
                                            return push_hash(col, defn_assertion, $quoted_nec_defns$.getDynamicValue(thread));
                                        } else {
                                            return remove_value_from_hash(col, defn_assertion, $quoted_nec_defns$.getDynamicValue(thread), UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject update_defns(final SubLObject col, final SubLObject defn_assertion, final SubLObject addP, final SubLObject type) {
        if (type.eql($IFF)) {
            if (NIL != addP) {
                return defns_cache_sethash(col, $iff_defns_index$.getGlobalValue(), defn_assertion);
            }
            return defns_cache_remhash(col, $iff_defns_index$.getGlobalValue());
        } else
            if (type.eql($QIFF)) {
                if (NIL != addP) {
                    return defns_cache_sethash(col, $quoted_iff_defns_index$.getGlobalValue(), defn_assertion);
                }
                return defns_cache_remhash(col, $quoted_iff_defns_index$.getGlobalValue());
            } else
                if (type.eql($SUF)) {
                    if (NIL != addP) {
                        return defns_cache_push_hash(col, defn_assertion, $suf_defns_index$.getGlobalValue());
                    }
                    return defns_cache_remove_value_from_hash(col, defn_assertion, $suf_defns_index$.getGlobalValue());
                } else
                    if (type.eql($QSUF)) {
                        if (NIL != addP) {
                            return defns_cache_push_hash(col, defn_assertion, $quoted_suf_defns_index$.getGlobalValue());
                        }
                        return defns_cache_remove_value_from_hash(col, defn_assertion, $quoted_suf_defns_index$.getGlobalValue());
                    } else
                        if (type.eql($NEC)) {
                            if (NIL != addP) {
                                return defns_cache_push_hash(col, defn_assertion, $nec_defns_index$.getGlobalValue());
                            }
                            return defns_cache_remove_value_from_hash(col, defn_assertion, $nec_defns_index$.getGlobalValue());
                        } else {
                            if (!type.eql($QNEC)) {
                                return NIL;
                            }
                            if (NIL != addP) {
                                return defns_cache_push_hash(col, defn_assertion, $quoted_nec_defns_index$.getGlobalValue());
                            }
                            return defns_cache_remove_value_from_hash(col, defn_assertion, $quoted_nec_defns_index$.getGlobalValue());
                        }




    }

    public static final SubLObject defns_cache_unbuiltP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(!((((((((((((((((((((($has_suf_defn_cache$.getDynamicValue(thread).isHashtable() && (NIL == hash_table_empty_p($has_suf_defn_cache$.getDynamicValue(thread)))) && $iff_defns$.getDynamicValue(thread).isHashtable()) && (NIL == hash_table_empty_p($iff_defns$.getDynamicValue(thread)))) && $suf_defns$.getDynamicValue(thread).isHashtable()) && (NIL == hash_table_empty_p($suf_defns$.getDynamicValue(thread)))) && $nec_defns$.getDynamicValue(thread).isHashtable()) && (NIL == hash_table_empty_p($nec_defns$.getDynamicValue(thread)))) && $has_quoted_suf_defn_cache$.getDynamicValue(thread).isHashtable()) && (NIL == hash_table_empty_p($has_quoted_suf_defn_cache$.getDynamicValue(thread)))) && $quoted_iff_defns$.getDynamicValue(thread).isHashtable()) && (NIL == hash_table_empty_p($quoted_iff_defns$.getDynamicValue(thread)))) && $quoted_suf_defns$.getDynamicValue(thread).isHashtable()) && $quoted_nec_defns$.getDynamicValue(thread).isHashtable()) && at_vars.$suf_defn_cache$.getDynamicValue(thread).isHashtable()) && (NIL == hash_table_empty_p(at_vars.$suf_defn_cache$.getDynamicValue(thread)))) && at_vars.$suf_quoted_defn_cache$.getDynamicValue(thread).isHashtable()) && (NIL == hash_table_empty_p(at_vars.$suf_quoted_defn_cache$.getDynamicValue(thread)))) && at_vars.$suf_function_cache$.getDynamicValue(thread).isHashtable()) && (NIL == hash_table_empty_p(at_vars.$suf_function_cache$.getDynamicValue(thread)))) && at_vars.$suf_quoted_function_cache$.getDynamicValue(thread).isHashtable()) && (NIL == hash_table_empty_p(at_vars.$suf_quoted_function_cache$.getDynamicValue(thread)))));
        }
    }

    public static SubLObject defns_cache_unbuiltP() {
        return makeBoolean((((((((((((((((((((((NIL == defns_cache_hash_table_p($has_suf_defn_cache_index$.getGlobalValue())) || (NIL != defns_cache_hash_table_empty_p($has_suf_defn_cache_index$.getGlobalValue()))) || (NIL == defns_cache_hash_table_p($iff_defns_index$.getGlobalValue()))) || (NIL != defns_cache_hash_table_empty_p($iff_defns_index$.getGlobalValue()))) || (NIL == defns_cache_hash_table_p($suf_defns_index$.getGlobalValue()))) || (NIL != defns_cache_hash_table_empty_p($suf_defns_index$.getGlobalValue()))) || (NIL == defns_cache_hash_table_p($nec_defns_index$.getGlobalValue()))) || (NIL != defns_cache_hash_table_empty_p($nec_defns_index$.getGlobalValue()))) || (NIL == defns_cache_hash_table_p($has_quoted_suf_defn_cache_index$.getGlobalValue()))) || (NIL != defns_cache_hash_table_empty_p($has_quoted_suf_defn_cache_index$.getGlobalValue()))) || (NIL == defns_cache_hash_table_p($quoted_iff_defns_index$.getGlobalValue()))) || (NIL != defns_cache_hash_table_empty_p($quoted_iff_defns_index$.getGlobalValue()))) || (NIL == defns_cache_hash_table_p($quoted_suf_defns_index$.getGlobalValue()))) || (NIL == defns_cache_hash_table_p($quoted_nec_defns_index$.getGlobalValue()))) || (NIL == defns_cache_hash_table_p($suf_defn_cache_index$.getGlobalValue()))) || (NIL != defns_cache_hash_table_empty_p($suf_defn_cache_index$.getGlobalValue()))) || (NIL == defns_cache_hash_table_p($suf_quoted_defn_cache_index$.getGlobalValue()))) || (NIL != defns_cache_hash_table_empty_p($suf_quoted_defn_cache_index$.getGlobalValue()))) || (NIL == defns_cache_hash_table_p($suf_function_cache_index$.getGlobalValue()))) || (NIL != defns_cache_hash_table_empty_p($suf_function_cache_index$.getGlobalValue()))) || (NIL == defns_cache_hash_table_p($suf_quoted_function_cache_index$.getGlobalValue()))) || (NIL != defns_cache_hash_table_empty_p($suf_quoted_function_cache_index$.getGlobalValue())));
    }

    public static final SubLObject clear_defns_cache_alt() {
        com.cyc.cycjava.cycl.defns.clear_defns();
        at_defns.clear_suf_defns();
        at_defns.clear_suf_quoted_defns();
        at_defns.clear_suf_functions();
        at_defns.clear_suf_quoted_functions();
        return NIL;
    }

    public static SubLObject clear_defns_cache() {
        clear_defns();
        at_defns.clear_suf_defns();
        at_defns.clear_suf_quoted_defns();
        at_defns.clear_suf_functions();
        at_defns.clear_suf_quoted_functions();
        return NIL;
    }

    public static final SubLObject rebuild_defns_cache_alt() {
        com.cyc.cycjava.cycl.defns.clear_defns_cache();
        com.cyc.cycjava.cycl.defns.initialize_defns();
        at_defns.initialize_sufficient_defns_cache();
        at_defns.initialize_sufficient_quoted_defns_cache();
        at_defns.initialize_sufficient_functions_cache();
        at_defns.initialize_sufficient_quoted_functions_cache();
        return NIL;
    }

    public static SubLObject rebuild_defns_cache() {
        clear_defns_cache();
        initialize_defns();
        at_defns.initialize_sufficient_defns_cache();
        at_defns.initialize_sufficient_quoted_defns_cache();
        at_defns.initialize_sufficient_functions_cache();
        at_defns.initialize_sufficient_quoted_functions_cache();
        return NIL;
    }

    public static final SubLObject dump_defns_cache_to_stream_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cfasl_output($has_suf_defn_cache$.getDynamicValue(thread), stream);
            cfasl_output($iff_defns$.getDynamicValue(thread), stream);
            cfasl_output($suf_defns$.getDynamicValue(thread), stream);
            cfasl_output($nec_defns$.getDynamicValue(thread), stream);
            cfasl_output($has_quoted_suf_defn_cache$.getDynamicValue(thread), stream);
            cfasl_output($quoted_iff_defns$.getDynamicValue(thread), stream);
            cfasl_output($quoted_suf_defns$.getDynamicValue(thread), stream);
            cfasl_output($quoted_nec_defns$.getDynamicValue(thread), stream);
            cfasl_output(at_vars.$suf_defn_cache$.getDynamicValue(thread), stream);
            cfasl_output(at_vars.$suf_quoted_defn_cache$.getDynamicValue(thread), stream);
            cfasl_output(at_vars.$suf_function_cache$.getDynamicValue(thread), stream);
            cfasl_output(at_vars.$suf_quoted_function_cache$.getDynamicValue(thread), stream);
            cfasl_output(NIL, stream);
            cfasl_output(NIL, stream);
            cfasl_output(NIL, stream);
            return NIL;
        }
    }

    public static SubLObject dump_defns_cache_to_stream(final SubLObject stream) {
        cfasl_output(get_defn_cache_from_index($has_suf_defn_cache_index$.getGlobalValue()), stream);
        cfasl_output(get_defn_cache_from_index($iff_defns_index$.getGlobalValue()), stream);
        cfasl_output(get_defn_cache_from_index($suf_defns_index$.getGlobalValue()), stream);
        cfasl_output(get_defn_cache_from_index($nec_defns_index$.getGlobalValue()), stream);
        cfasl_output(get_defn_cache_from_index($has_quoted_suf_defn_cache_index$.getGlobalValue()), stream);
        cfasl_output(get_defn_cache_from_index($quoted_iff_defns_index$.getGlobalValue()), stream);
        cfasl_output(get_defn_cache_from_index($quoted_suf_defns_index$.getGlobalValue()), stream);
        cfasl_output(get_defn_cache_from_index($quoted_nec_defns_index$.getGlobalValue()), stream);
        cfasl_output(get_defn_cache_from_index($suf_defn_cache_index$.getGlobalValue()), stream);
        cfasl_output(get_defn_cache_from_index($suf_quoted_defn_cache_index$.getGlobalValue()), stream);
        cfasl_output(get_defn_cache_from_index($suf_function_cache_index$.getGlobalValue()), stream);
        cfasl_output(get_defn_cache_from_index($suf_quoted_function_cache_index$.getGlobalValue()), stream);
        cfasl_output(NIL, stream);
        cfasl_output(NIL, stream);
        cfasl_output(NIL, stream);
        return NIL;
    }

    public static final SubLObject load_defns_cache_from_stream_alt(SubLObject stream) {
        {
            SubLObject dummy = NIL;
            $has_suf_defn_cache$.setDynamicValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            $iff_defns$.setDynamicValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            $suf_defns$.setDynamicValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            $nec_defns$.setDynamicValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            $has_quoted_suf_defn_cache$.setDynamicValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            $quoted_iff_defns$.setDynamicValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            $quoted_suf_defns$.setDynamicValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            $quoted_nec_defns$.setDynamicValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            at_vars.$suf_defn_cache$.setDynamicValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            at_vars.$suf_quoted_defn_cache$.setDynamicValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            at_vars.$suf_function_cache$.setDynamicValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            at_vars.$suf_quoted_function_cache$.setDynamicValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            dummy = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            dummy = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            dummy = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject load_defns_cache_from_stream(final SubLObject stream) {
        SubLObject dummy = NIL;
        set_aref(get_index_to_defns_cache_vector(), $has_suf_defn_cache_index$.getGlobalValue(), cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        set_aref(get_index_to_defns_cache_vector(), $iff_defns_index$.getGlobalValue(), cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        set_aref(get_index_to_defns_cache_vector(), $suf_defns_index$.getGlobalValue(), cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        set_aref(get_index_to_defns_cache_vector(), $nec_defns_index$.getGlobalValue(), cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        set_aref(get_index_to_defns_cache_vector(), $has_quoted_suf_defn_cache_index$.getGlobalValue(), cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        set_aref(get_index_to_defns_cache_vector(), $quoted_iff_defns_index$.getGlobalValue(), cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        set_aref(get_index_to_defns_cache_vector(), $quoted_suf_defns_index$.getGlobalValue(), cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        set_aref(get_index_to_defns_cache_vector(), $quoted_nec_defns_index$.getGlobalValue(), cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        set_aref(get_index_to_defns_cache_vector(), $suf_defn_cache_index$.getGlobalValue(), cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        set_aref(get_index_to_defns_cache_vector(), $suf_quoted_defn_cache_index$.getGlobalValue(), cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        set_aref(get_index_to_defns_cache_vector(), $suf_function_cache_index$.getGlobalValue(), cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        set_aref(get_index_to_defns_cache_vector(), $suf_quoted_function_cache_index$.getGlobalValue(), cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        dummy = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        dummy = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        dummy = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject declare_defns_file() {
        declareFunction("get_index_to_defns_cache_vector", "GET-INDEX-TO-DEFNS-CACHE-VECTOR", 0, 0, false);
        declareFunction("get_defn_cache_from_index", "GET-DEFN-CACHE-FROM-INDEX", 1, 0, false);
        declareFunction("defns_cache_index_p", "DEFNS-CACHE-INDEX-P", 1, 0, false);
        declareFunction("defns_cache_make_hash_table", "DEFNS-CACHE-MAKE-HASH-TABLE", 2, 0, false);
        declareFunction("defns_cache_definedP", "DEFNS-CACHE-DEFINED?", 1, 0, false);
        declareFunction("defns_cache_hash_table_p", "DEFNS-CACHE-HASH-TABLE-P", 1, 0, false);
        declareFunction("defns_cache_hash_table_empty_p", "DEFNS-CACHE-HASH-TABLE-EMPTY-P", 1, 0, false);
        declareFunction("defns_cache_clrhash", "DEFNS-CACHE-CLRHASH", 1, 0, false);
        declareFunction("defns_cache_gethash", "DEFNS-CACHE-GETHASH", 2, 0, false);
        declareFunction("defns_cache_sethash", "DEFNS-CACHE-SETHASH", 3, 0, false);
        declareFunction("defns_cache_remhash", "DEFNS-CACHE-REMHASH", 2, 0, false);
        declareFunction("defns_cache_remove_value_from_hash", "DEFNS-CACHE-REMOVE-VALUE-FROM-HASH", 3, 0, false);
        declareFunction("defns_cache_push_hash", "DEFNS-CACHE-PUSH-HASH", 3, 0, false);
        declareFunction("defns_cache_gethash_without_values", "DEFNS-CACHE-GETHASH-WITHOUT-VALUES", 2, 0, false);
        declareFunction("defns_cache_hash_table_to_alist", "DEFNS-CACHE-HASH-TABLE-TO-ALIST", 1, 0, false);
        declareFunction("defns_cache_hash_table_count", "DEFNS-CACHE-HASH-TABLE-COUNT", 1, 0, false);
        declareMacro("do_defns_cache_hash", "DO-DEFNS-CACHE-HASH");
        declareMacro("progress_do_defns_cache_hash", "PROGRESS-DO-DEFNS-CACHE-HASH");
        declareFunction("suf_defn_count", "SUF-DEFN-COUNT", 2, 0, false);
        declareFunction("has_suf_defn_somewhereP", "HAS-SUF-DEFN-SOMEWHERE?", 2, 0, false);
        declareFunction("set_suf_defn_count", "SET-SUF-DEFN-COUNT", 3, 0, false);
        declareFunction("rem_suf_defn_count", "REM-SUF-DEFN-COUNT", 2, 0, false);
        declareFunction("iff_defn", "IFF-DEFN", 2, 0, false);
        declareFunction("rem_iff_defn", "REM-IFF-DEFN", 2, 0, false);
        declareFunction("suf_defns", "SUF-DEFNS", 2, 0, false);
        declareFunction("rem_suf_defn", "REM-SUF-DEFN", 3, 0, false);
        declareFunction("new_suf_defnP", "NEW-SUF-DEFN?", 2, 1, false);
        declareFunction("nec_defns", "NEC-DEFNS", 2, 0, false);
        declareFunction("rem_nec_defn", "REM-NEC-DEFN", 3, 0, false);
        declareFunction("has_some_defnP", "HAS-SOME-DEFN?", 2, 0, false);
        declareFunction("reset_new_defns_admitP_meters", "RESET-NEW-DEFNS-ADMIT?-METERS", 0, 0, false);
        declareFunction("new_defns_admitP_metered", "NEW-DEFNS-ADMIT?-METERED", 2, 1, false);
        declareFunction("new_defns_admitP", "NEW-DEFNS-ADMIT?", 2, 1, false);
        declareFunction("defns_admitP_int", "DEFNS-ADMIT?-INT", 4, 0, false);
        declareFunction("reset_new_defns_rejectP_meters", "RESET-NEW-DEFNS-REJECT?-METERS", 0, 0, false);
        declareFunction("new_defns_rejectP_metered", "NEW-DEFNS-REJECT?-METERED", 2, 1, false);
        declareFunction("new_defns_rejectP", "NEW-DEFNS-REJECT?", 2, 1, false);
        declareFunction("defns_rejectP_int", "DEFNS-REJECT?-INT", 4, 0, false);
        declareFunction("reset_new_quoted_defns_admitP_meters", "RESET-NEW-QUOTED-DEFNS-ADMIT?-METERS", 0, 0, false);
        declareFunction("new_quoted_defns_admitP_metered", "NEW-QUOTED-DEFNS-ADMIT?-METERED", 2, 1, false);
        declareFunction("new_quoted_defns_admitP", "NEW-QUOTED-DEFNS-ADMIT?", 2, 1, false);
        declareFunction("reset_new_quoted_defns_rejectP_meters", "RESET-NEW-QUOTED-DEFNS-REJECT?-METERS", 0, 0, false);
        declareFunction("new_quoted_defns_rejectP_metered", "NEW-QUOTED-DEFNS-REJECT?-METERED", 2, 1, false);
        declareFunction("new_quoted_defns_rejectP", "NEW-QUOTED-DEFNS-REJECT?", 2, 1, false);
        declareFunction("initial_check_defn_admit_status", "INITIAL-CHECK-DEFN-ADMIT-STATUS", 4, 0, false);
        declareFunction("final_check_defn_admit_status", "FINAL-CHECK-DEFN-ADMIT-STATUS", 4, 0, false);
        declareFunction("defns_walk_admitP", "DEFNS-WALK-ADMIT?", 4, 0, false);
        declareFunction("sufficient_defn_violations", "SUFFICIENT-DEFN-VIOLATIONS", 5, 0, false);
        declareFunction("sufficient_defn_violation", "SUFFICIENT-DEFN-VIOLATION", 6, 0, false);
        declareFunction("col_defn_admitsP", "COL-DEFN-ADMITS?", 1, 0, false);
        new defns.$col_defn_admitsP$UnaryFunction();
        declareFunction("col_quoted_defn_admitsP", "COL-QUOTED-DEFN-ADMITS?", 1, 0, false);
        declareFunction("col_defn_admitsP_int", "COL-DEFN-ADMITS?-INT", 4, 0, false);
        declareFunction("defining_defns_admitsP", "DEFINING-DEFNS-ADMITS?", 4, 0, false);
        declareFunction("defining_defn_violations", "DEFINING-DEFN-VIOLATIONS", 5, 0, false);
        declareFunction("defining_defn_violation", "DEFINING-DEFN-VIOLATION", 6, 0, false);
        declareFunction("suf_defn_admitsP", "SUF-DEFN-ADMITS?", 4, 0, false);
        declareFunction("nec_defn_permitsP", "NEC-DEFN-PERMITS?", 4, 1, false);
        declareFunction("reset_nec_defn_rejectsP_meters", "RESET-NEC-DEFN-REJECTS?-METERS", 0, 0, false);
        declareFunction("nec_defn_rejectsP_metered", "NEC-DEFN-REJECTS?-METERED", 4, 1, false);
        declareFunction("nec_defn_rejectsP", "NEC-DEFN-REJECTS?", 4, 1, false);
        declareFunction("necessary_defn_violations", "NECESSARY-DEFN-VIOLATIONS", 6, 0, false);
        declareFunction("necessary_defn_violation", "NECESSARY-DEFN-VIOLATION", 7, 0, false);
        declareFunction("new_mts_of_admitting_defns", "NEW-MTS-OF-ADMITTING-DEFNS", 2, 0, false);
        declareFunction("mts_of_admitting_quoted_defns", "MTS-OF-ADMITTING-QUOTED-DEFNS", 2, 0, false);
        declareFunction("new_hl_justify_isa_via_defns", "NEW-HL-JUSTIFY-ISA-VIA-DEFNS", 2, 1, false);
        declareFunction("hl_justify_quoted_isa_via_defns", "HL-JUSTIFY-QUOTED-ISA-VIA-DEFNS", 2, 1, false);
        declareFunction("assertions_of_admitting_defns", "ASSERTIONS-OF-ADMITTING-DEFNS", 5, 0, false);
        declareFunction("mts_from_defn_assertions", "MTS-FROM-DEFN-ASSERTIONS", 2, 0, false);
        declareFunction("initial_check_admit_defn", "INITIAL-CHECK-ADMIT-DEFN", 3, 0, false);
        declareFunction("defns_of_admitting_sufficient_defns", "DEFNS-OF-ADMITTING-SUFFICIENT-DEFNS", 4, 0, false);
        declareFunction("admitting_defn_assertions", "ADMITTING-DEFN-ASSERTIONS", 1, 0, false);
        new defns.$admitting_defn_assertions$UnaryFunction();
        declareFunction("admitting_quoted_defn_assertions", "ADMITTING-QUOTED-DEFN-ASSERTIONS", 1, 0, false);
        declareFunction("admitting_defn_assertion", "ADMITTING-DEFN-ASSERTION", 1, 0, false);
        declareFunction("admitting_quoted_defn_assertion", "ADMITTING-QUOTED-DEFN-ASSERTION", 1, 0, false);
        declareFunction("admitting_defn_assertions_int", "ADMITTING-DEFN-ASSERTIONS-INT", 4, 0, false);
        declareFunction("suf_admitting_defns", "SUF-ADMITTING-DEFNS", 4, 0, false);
        declareFunction("min_defn_admits", "MIN-DEFN-ADMITS", 1, 1, false);
        declareFunction("all_defn_admits", "ALL-DEFN-ADMITS", 1, 1, false);
        declareFunction("min_quoted_defn_admits", "MIN-QUOTED-DEFN-ADMITS", 1, 1, false);
        declareFunction("all_quoted_defn_admits", "ALL-QUOTED-DEFN-ADMITS", 1, 1, false);
        declareFunction("min_generalizations", "MIN-GENERALIZATIONS", 1, 1, false);
        declareFunction("genericize_term_wrt_types", "GENERICIZE-TERM-WRT-TYPES", 1, 1, false);
        declareFunction("genericize_constraints_wrt_types", "GENERICIZE-CONSTRAINTS-WRT-TYPES", 2, 1, false);
        declareFunction("genericize_term_types_int", "GENERICIZE-TERM-TYPES-INT", 2, 1, false);
        declareFunction("update_iff_or_suf_defn", "UPDATE-IFF-OR-SUF-DEFN", 4, 0, false);
        declareFunction("update_nec_defn", "UPDATE-NEC-DEFN", 3, 0, false);
        declareFunction("new_add_iff_defn", "NEW-ADD-IFF-DEFN", 2, 0, false);
        declareFunction("new_remove_iff_defn", "NEW-REMOVE-IFF-DEFN", 2, 0, false);
        declareFunction("new_add_suf_defn", "NEW-ADD-SUF-DEFN", 2, 0, false);
        declareFunction("new_remove_suf_defn", "NEW-REMOVE-SUF-DEFN", 2, 0, false);
        declareFunction("add_nec_defn", "ADD-NEC-DEFN", 2, 0, false);
        declareFunction("remove_nec_defn", "REMOVE-NEC-DEFN", 2, 0, false);
        declareFunction("new_add_iff_quoted_defn", "NEW-ADD-IFF-QUOTED-DEFN", 2, 0, false);
        declareFunction("new_remove_iff_quoted_defn", "NEW-REMOVE-IFF-QUOTED-DEFN", 2, 0, false);
        declareFunction("new_add_suf_quoted_defn", "NEW-ADD-SUF-QUOTED-DEFN", 2, 0, false);
        declareFunction("new_remove_suf_quoted_defn", "NEW-REMOVE-SUF-QUOTED-DEFN", 2, 0, false);
        declareFunction("add_nec_quoted_defn", "ADD-NEC-QUOTED-DEFN", 2, 0, false);
        declareFunction("remove_nec_quoted_defn", "REMOVE-NEC-QUOTED-DEFN", 2, 0, false);
        declareFunction("handle_added_genl_for_suf_defns_int", "HANDLE-ADDED-GENL-FOR-SUF-DEFNS-INT", 3, 0, false);
        declareFunction("reset_new_handle_added_genl_for_suf_defns_meters", "RESET-NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS", 0, 0, false);
        declareFunction("new_handle_added_genl_for_suf_defns_metered", "NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERED", 2, 0, false);
        declareFunction("new_handle_added_genl_for_suf_defns", "NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS", 2, 0, false);
        declareFunction("reset_new_handle_added_genl_for_suf_quoted_defns_meters", "RESET-NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS", 0, 0, false);
        declareFunction("new_handle_added_genl_for_suf_quoted_defns_metered", "NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERED", 2, 0, false);
        declareFunction("new_handle_added_genl_for_suf_quoted_defns", "NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS", 2, 0, false);
        declareFunction("handle_removed_genl_for_suf_defns_int", "HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-INT", 3, 0, false);
        declareFunction("reset_new_handle_removed_genl_for_suf_defns_meters", "RESET-NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS", 0, 0, false);
        declareFunction("new_handle_removed_genl_for_suf_defns_metered", "NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERED", 2, 0, false);
        declareFunction("new_handle_removed_genl_for_suf_defns", "NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS", 2, 0, false);
        declareFunction("reset_new_handle_removed_genl_for_suf_quoted_defns_meters", "RESET-NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS", 0, 0, false);
        declareFunction("new_handle_removed_genl_for_suf_quoted_defns_metered", "NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERED", 2, 0, false);
        declareFunction("new_handle_removed_genl_for_suf_quoted_defns", "NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS", 2, 0, false);
        declareFunction("clear_defns", "CLEAR-DEFNS", 0, 0, false);
        declareFunction("initialize_defns_cache", "INITIALIZE-DEFNS-CACHE", 0, 0, false);
        declareFunction("initialize_defns", "INITIALIZE-DEFNS", 0, 0, false);
        declareFunction("inc_suf_defn_count", "INC-SUF-DEFN-COUNT", 2, 1, false);
        declareFunction("dec_suf_defn_count", "DEC-SUF-DEFN-COUNT", 2, 1, false);
        declareFunction("update_suf_defn_cache", "UPDATE-SUF-DEFN-CACHE", 3, 0, false);
        declareFunction("update_defns", "UPDATE-DEFNS", 4, 0, false);
        declareFunction("defns_cache_unbuiltP", "DEFNS-CACHE-UNBUILT?", 0, 0, false);
        declareFunction("clear_defns_cache", "CLEAR-DEFNS-CACHE", 0, 0, false);
        declareFunction("rebuild_defns_cache", "REBUILD-DEFNS-CACHE", 0, 0, false);
        declareFunction("dump_defns_cache_to_stream", "DUMP-DEFNS-CACHE-TO-STREAM", 1, 0, false);
        declareFunction("load_defns_cache_from_stream", "LOAD-DEFNS-CACHE-FROM-STREAM", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_defns_file_alt() {
        defvar("*HAS-SUF-DEFN-CACHE*", NIL);
        defvar("*HAS-QUOTED-SUF-DEFN-CACHE*", NIL);
        defvar("*IFF-DEFNS*", NIL);
        defvar("*QUOTED-IFF-DEFNS*", NIL);
        defvar("*SUF-DEFNS*", NIL);
        defvar("*QUOTED-SUF-DEFNS*", NIL);
        defvar("*NEC-DEFNS*", NIL);
        defvar("*QUOTED-NEC-DEFNS*", NIL);
        defvar("*DEFN-TERM*", NIL);
        defvar("*ORG-COLLECTION*", NIL);
        defvar("*FAILING-SUF-DEFNS*", NIL);
        defparameter("*NEW-DEFNS-ADMIT?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*NEW-DEFNS-REJECT?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*NEW-QUOTED-DEFNS-ADMIT?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*NEW-QUOTED-DEFNS-REJECT?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*NEC-DEFN-REJECTS?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        deflexical("*MIN-DEFN-ADMITS-MAP*", $list_alt61);
        deflexical("*MIN-QUOTED-DEFN-ADMITS-MAP*", $list_alt64);
        defparameter("*NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject init_defns_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*INDEX-TO-DEFNS-CACHE-VECTOR*", SubLTrampolineFile.maybeDefault($index_to_defns_cache_vector$, $index_to_defns_cache_vector$, NIL));
            defconstant("*HAS-SUF-DEFN-CACHE-INDEX*", ZERO_INTEGER);
            defconstant("*HAS-QUOTED-SUF-DEFN-CACHE-INDEX*", ONE_INTEGER);
            defconstant("*IFF-DEFNS-INDEX*", TWO_INTEGER);
            defconstant("*QUOTED-IFF-DEFNS-INDEX*", THREE_INTEGER);
            defconstant("*SUF-DEFNS-INDEX*", FOUR_INTEGER);
            defconstant("*QUOTED-SUF-DEFNS-INDEX*", FIVE_INTEGER);
            defconstant("*NEC-DEFNS-INDEX*", SIX_INTEGER);
            defconstant("*QUOTED-NEC-DEFNS-INDEX*", SEVEN_INTEGER);
            defconstant("*SUF-DEFN-CACHE-INDEX*", EIGHT_INTEGER);
            defconstant("*SUF-QUOTED-DEFN-CACHE-INDEX*", NINE_INTEGER);
            defconstant("*SUF-FUNCTION-CACHE-INDEX*", TEN_INTEGER);
            defconstant("*SUF-QUOTED-FUNCTION-CACHE-INDEX*", ELEVEN_INTEGER);
            defvar("*DEFN-TERM*", NIL);
            defvar("*ORG-COLLECTION*", NIL);
            defvar("*FAILING-SUF-DEFNS*", NIL);
            defparameter("*NEW-DEFNS-ADMIT?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
            defparameter("*NEW-DEFNS-REJECT?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
            defparameter("*NEW-QUOTED-DEFNS-ADMIT?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
            defparameter("*NEW-QUOTED-DEFNS-REJECT?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
            defparameter("*NEC-DEFN-REJECTS?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
            deflexical("*MIN-DEFN-ADMITS-MAP*", $list70);
            deflexical("*MIN-QUOTED-DEFN-ADMITS-MAP*", $list73);
            defparameter("*NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
            defparameter("*NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
            defparameter("*NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
            defparameter("*NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        }
        if (SubLFiles.USE_V2) {
            defvar("*HAS-SUF-DEFN-CACHE*", NIL);
            defvar("*HAS-QUOTED-SUF-DEFN-CACHE*", NIL);
            defvar("*IFF-DEFNS*", NIL);
            defvar("*QUOTED-IFF-DEFNS*", NIL);
            defvar("*SUF-DEFNS*", NIL);
            defvar("*QUOTED-SUF-DEFNS*", NIL);
            defvar("*NEC-DEFNS*", NIL);
            defvar("*QUOTED-NEC-DEFNS*", NIL);
            deflexical("*MIN-DEFN-ADMITS-MAP*", $list_alt61);
            deflexical("*MIN-QUOTED-DEFN-ADMITS-MAP*", $list_alt64);
        }
        return NIL;
    }

    public static SubLObject init_defns_file_Previous() {
        deflexical("*INDEX-TO-DEFNS-CACHE-VECTOR*", SubLTrampolineFile.maybeDefault($index_to_defns_cache_vector$, $index_to_defns_cache_vector$, NIL));
        defconstant("*HAS-SUF-DEFN-CACHE-INDEX*", ZERO_INTEGER);
        defconstant("*HAS-QUOTED-SUF-DEFN-CACHE-INDEX*", ONE_INTEGER);
        defconstant("*IFF-DEFNS-INDEX*", TWO_INTEGER);
        defconstant("*QUOTED-IFF-DEFNS-INDEX*", THREE_INTEGER);
        defconstant("*SUF-DEFNS-INDEX*", FOUR_INTEGER);
        defconstant("*QUOTED-SUF-DEFNS-INDEX*", FIVE_INTEGER);
        defconstant("*NEC-DEFNS-INDEX*", SIX_INTEGER);
        defconstant("*QUOTED-NEC-DEFNS-INDEX*", SEVEN_INTEGER);
        defconstant("*SUF-DEFN-CACHE-INDEX*", EIGHT_INTEGER);
        defconstant("*SUF-QUOTED-DEFN-CACHE-INDEX*", NINE_INTEGER);
        defconstant("*SUF-FUNCTION-CACHE-INDEX*", TEN_INTEGER);
        defconstant("*SUF-QUOTED-FUNCTION-CACHE-INDEX*", ELEVEN_INTEGER);
        defvar("*DEFN-TERM*", NIL);
        defvar("*ORG-COLLECTION*", NIL);
        defvar("*FAILING-SUF-DEFNS*", NIL);
        defparameter("*NEW-DEFNS-ADMIT?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*NEW-DEFNS-REJECT?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*NEW-QUOTED-DEFNS-ADMIT?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*NEW-QUOTED-DEFNS-REJECT?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*NEC-DEFN-REJECTS?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        deflexical("*MIN-DEFN-ADMITS-MAP*", $list70);
        deflexical("*MIN-QUOTED-DEFN-ADMITS-MAP*", $list73);
        defparameter("*NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static final SubLObject setup_defns_file_alt() {
        {
            SubLObject item_var = $sym0$_NEW_DEFNS_ADMIT__METERS_;
            if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($sym0$_NEW_DEFNS_ADMIT__METERS_, $str_alt1$metering_cache_for_calls_to_defn_);
        com.cyc.cycjava.cycl.defns.reset_new_defns_admitP_meters();
        sethash($RESET, $new_defns_admitP_meters$.getDynamicValue(), $sym11$RESET_NEW_DEFNS_ADMIT__METERS);
        {
            SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
            SubLObject v_cache = NIL;
            for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                if ($sym9$NEW_DEFNS_ADMIT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                    at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    clrhash(v_cache);
                }
            }
        }
        at_vars.$defn_meter_caches$.setDynamicValue(cons($new_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        {
            SubLObject item_var = $sym14$_NEW_DEFNS_REJECT__METERS_;
            if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($sym14$_NEW_DEFNS_REJECT__METERS_, $str_alt15$metering_cache_for_calls_to_defn_);
        com.cyc.cycjava.cycl.defns.reset_new_defns_rejectP_meters();
        sethash($RESET, $new_defns_rejectP_meters$.getDynamicValue(), $sym17$RESET_NEW_DEFNS_REJECT__METERS);
        {
            SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
            SubLObject v_cache = NIL;
            for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                if ($sym16$NEW_DEFNS_REJECT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                    at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    clrhash(v_cache);
                }
            }
        }
        at_vars.$defn_meter_caches$.setDynamicValue(cons($new_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        {
            SubLObject item_var = $sym18$_NEW_QUOTED_DEFNS_ADMIT__METERS_;
            if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($sym18$_NEW_QUOTED_DEFNS_ADMIT__METERS_, $str_alt19$metering_cache_for_calls_to_defn_);
        com.cyc.cycjava.cycl.defns.reset_new_quoted_defns_admitP_meters();
        sethash($RESET, $new_quoted_defns_admitP_meters$.getDynamicValue(), $sym21$RESET_NEW_QUOTED_DEFNS_ADMIT__METERS);
        {
            SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
            SubLObject v_cache = NIL;
            for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                if ($sym20$NEW_QUOTED_DEFNS_ADMIT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                    at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    clrhash(v_cache);
                }
            }
        }
        at_vars.$defn_meter_caches$.setDynamicValue(cons($new_quoted_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        {
            SubLObject item_var = $sym22$_NEW_QUOTED_DEFNS_REJECT__METERS_;
            if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($sym22$_NEW_QUOTED_DEFNS_REJECT__METERS_, $str_alt23$metering_cache_for_calls_to_defn_);
        com.cyc.cycjava.cycl.defns.reset_new_quoted_defns_rejectP_meters();
        sethash($RESET, $new_quoted_defns_rejectP_meters$.getDynamicValue(), $sym25$RESET_NEW_QUOTED_DEFNS_REJECT__METERS);
        {
            SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
            SubLObject v_cache = NIL;
            for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                if ($sym24$NEW_QUOTED_DEFNS_REJECT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                    at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    clrhash(v_cache);
                }
            }
        }
        at_vars.$defn_meter_caches$.setDynamicValue(cons($new_quoted_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        {
            SubLObject item_var = $sym48$_NEC_DEFN_REJECTS__METERS_;
            if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($sym48$_NEC_DEFN_REJECTS__METERS_, $str_alt49$metering_cache_for_calls_to_defn_);
        com.cyc.cycjava.cycl.defns.reset_nec_defn_rejectsP_meters();
        sethash($RESET, $nec_defn_rejectsP_meters$.getDynamicValue(), $sym52$RESET_NEC_DEFN_REJECTS__METERS);
        {
            SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
            SubLObject v_cache = NIL;
            for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                if ($sym51$NEC_DEFN_REJECTS_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                    at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    clrhash(v_cache);
                }
            }
        }
        at_vars.$defn_meter_caches$.setDynamicValue(cons($nec_defn_rejectsP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        register_kb_function(NEW_ADD_IFF_DEFN);
        register_kb_function(NEW_REMOVE_IFF_DEFN);
        register_kb_function(NEW_ADD_SUF_DEFN);
        register_kb_function(NEW_REMOVE_SUF_DEFN);
        register_kb_function(ADD_NEC_DEFN);
        register_kb_function(REMOVE_NEC_DEFN);
        register_kb_function(NEW_ADD_IFF_QUOTED_DEFN);
        register_kb_function(NEW_REMOVE_IFF_QUOTED_DEFN);
        register_kb_function(NEW_ADD_SUF_QUOTED_DEFN);
        register_kb_function(NEW_REMOVE_SUF_QUOTED_DEFN);
        register_kb_function(ADD_NEC_QUOTED_DEFN);
        register_kb_function(REMOVE_NEC_QUOTED_DEFN);
        {
            SubLObject item_var = $new_handle_added_genl_for_suf_defns_meters$;
            if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($new_handle_added_genl_for_suf_defns_meters$, $str_alt86$metering_cache_for_calls_to_defn_);
        com.cyc.cycjava.cycl.defns.reset_new_handle_added_genl_for_suf_defns_meters();
        sethash($RESET, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(), RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS);
        {
            SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
            SubLObject v_cache = NIL;
            for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                if (NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                    at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    clrhash(v_cache);
                }
            }
        }
        at_vars.$defn_meter_caches$.setDynamicValue(cons($new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        {
            SubLObject item_var = $new_handle_added_genl_for_suf_quoted_defns_meters$;
            if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($new_handle_added_genl_for_suf_quoted_defns_meters$, $str_alt91$metering_cache_for_calls_to_defn_);
        com.cyc.cycjava.cycl.defns.reset_new_handle_added_genl_for_suf_quoted_defns_meters();
        sethash($RESET, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(), RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS);
        {
            SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
            SubLObject v_cache = NIL;
            for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                if (NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                    at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    clrhash(v_cache);
                }
            }
        }
        at_vars.$defn_meter_caches$.setDynamicValue(cons($new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        {
            SubLObject item_var = $new_handle_removed_genl_for_suf_defns_meters$;
            if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($new_handle_removed_genl_for_suf_defns_meters$, $str_alt95$metering_cache_for_calls_to_defn_);
        com.cyc.cycjava.cycl.defns.reset_new_handle_removed_genl_for_suf_defns_meters();
        sethash($RESET, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(), RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS);
        {
            SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
            SubLObject v_cache = NIL;
            for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                if (NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                    at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    clrhash(v_cache);
                }
            }
        }
        at_vars.$defn_meter_caches$.setDynamicValue(cons($new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        {
            SubLObject item_var = $new_handle_removed_genl_for_suf_quoted_defns_meters$;
            if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($new_handle_removed_genl_for_suf_quoted_defns_meters$, $str_alt99$metering_cache_for_calls_to_defn_);
        com.cyc.cycjava.cycl.defns.reset_new_handle_removed_genl_for_suf_quoted_defns_meters();
        sethash($RESET, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(), RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS);
        {
            SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
            SubLObject v_cache = NIL;
            for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                if (NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                    at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    clrhash(v_cache);
                }
            }
        }
        at_vars.$defn_meter_caches$.setDynamicValue(cons($new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        return NIL;
    }

    public static SubLObject setup_defns_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($index_to_defns_cache_vector$);
            SubLObject item_var = $sym12$_NEW_DEFNS_ADMIT__METERS_;
            if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
            }
            reset_new_defns_admitP_meters();
            sethash($RESET, $new_defns_admitP_meters$.getDynamicValue(), $sym22$RESET_NEW_DEFNS_ADMIT__METERS);
            SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
            SubLObject v_cache = NIL;
            v_cache = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($sym20$NEW_DEFNS_ADMIT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                    at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    clrhash(v_cache);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_cache = cdolist_list_var.first();
            } 
            at_vars.$defn_meter_caches$.setDynamicValue(cons($new_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
            item_var = $sym25$_NEW_DEFNS_REJECT__METERS_;
            if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
            }
            reset_new_defns_rejectP_meters();
            sethash($RESET, $new_defns_rejectP_meters$.getDynamicValue(), $sym27$RESET_NEW_DEFNS_REJECT__METERS);
            cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
            v_cache = NIL;
            v_cache = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($sym26$NEW_DEFNS_REJECT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                    at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    clrhash(v_cache);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_cache = cdolist_list_var.first();
            } 
            at_vars.$defn_meter_caches$.setDynamicValue(cons($new_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
            item_var = $sym28$_NEW_QUOTED_DEFNS_ADMIT__METERS_;
            if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
            }
            reset_new_quoted_defns_admitP_meters();
            sethash($RESET, $new_quoted_defns_admitP_meters$.getDynamicValue(), $sym30$RESET_NEW_QUOTED_DEFNS_ADMIT__METERS);
            cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
            v_cache = NIL;
            v_cache = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($sym29$NEW_QUOTED_DEFNS_ADMIT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                    at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    clrhash(v_cache);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_cache = cdolist_list_var.first();
            } 
            at_vars.$defn_meter_caches$.setDynamicValue(cons($new_quoted_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
            item_var = $sym31$_NEW_QUOTED_DEFNS_REJECT__METERS_;
            if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
            }
            reset_new_quoted_defns_rejectP_meters();
            sethash($RESET, $new_quoted_defns_rejectP_meters$.getDynamicValue(), $sym33$RESET_NEW_QUOTED_DEFNS_REJECT__METERS);
            cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
            v_cache = NIL;
            v_cache = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($sym32$NEW_QUOTED_DEFNS_REJECT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                    at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    clrhash(v_cache);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_cache = cdolist_list_var.first();
            } 
            at_vars.$defn_meter_caches$.setDynamicValue(cons($new_quoted_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
            item_var = $sym58$_NEC_DEFN_REJECTS__METERS_;
            if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
            }
            reset_nec_defn_rejectsP_meters();
            sethash($RESET, $nec_defn_rejectsP_meters$.getDynamicValue(), $sym61$RESET_NEC_DEFN_REJECTS__METERS);
            cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
            v_cache = NIL;
            v_cache = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($sym60$NEC_DEFN_REJECTS_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                    at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    clrhash(v_cache);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_cache = cdolist_list_var.first();
            } 
            at_vars.$defn_meter_caches$.setDynamicValue(cons($nec_defn_rejectsP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
            register_kb_function(NEW_ADD_IFF_DEFN);
            register_kb_function(NEW_REMOVE_IFF_DEFN);
            register_kb_function(NEW_ADD_SUF_DEFN);
            register_kb_function(NEW_REMOVE_SUF_DEFN);
            register_kb_function(ADD_NEC_DEFN);
            register_kb_function(REMOVE_NEC_DEFN);
            register_kb_function(NEW_ADD_IFF_QUOTED_DEFN);
            register_kb_function(NEW_REMOVE_IFF_QUOTED_DEFN);
            register_kb_function(NEW_ADD_SUF_QUOTED_DEFN);
            register_kb_function(NEW_REMOVE_SUF_QUOTED_DEFN);
            register_kb_function(ADD_NEC_QUOTED_DEFN);
            register_kb_function(REMOVE_NEC_QUOTED_DEFN);
            item_var = $new_handle_added_genl_for_suf_defns_meters$;
            if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
            }
            reset_new_handle_added_genl_for_suf_defns_meters();
            sethash($RESET, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(), RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS);
            cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
            v_cache = NIL;
            v_cache = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                    at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    clrhash(v_cache);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_cache = cdolist_list_var.first();
            } 
            at_vars.$defn_meter_caches$.setDynamicValue(cons($new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
            item_var = $new_handle_added_genl_for_suf_quoted_defns_meters$;
            if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
            }
            reset_new_handle_added_genl_for_suf_quoted_defns_meters();
            sethash($RESET, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(), RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS);
            cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
            v_cache = NIL;
            v_cache = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                    at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    clrhash(v_cache);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_cache = cdolist_list_var.first();
            } 
            at_vars.$defn_meter_caches$.setDynamicValue(cons($new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
            item_var = $new_handle_removed_genl_for_suf_defns_meters$;
            if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
            }
            reset_new_handle_removed_genl_for_suf_defns_meters();
            sethash($RESET, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(), RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS);
            cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
            v_cache = NIL;
            v_cache = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                    at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    clrhash(v_cache);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_cache = cdolist_list_var.first();
            } 
            at_vars.$defn_meter_caches$.setDynamicValue(cons($new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
            item_var = $new_handle_removed_genl_for_suf_quoted_defns_meters$;
            if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
            }
            reset_new_handle_removed_genl_for_suf_quoted_defns_meters();
            sethash($RESET, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(), RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS);
            cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
            v_cache = NIL;
            v_cache = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                    at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    clrhash(v_cache);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_cache = cdolist_list_var.first();
            } 
            at_vars.$defn_meter_caches$.setDynamicValue(cons($new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        }
        if (SubLFiles.USE_V2) {
            {
                SubLObject item_var = $sym0$_NEW_DEFNS_ADMIT__METERS_;
                if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($sym0$_NEW_DEFNS_ADMIT__METERS_, $str_alt1$metering_cache_for_calls_to_defn_);
            sethash($RESET, $new_defns_admitP_meters$.getDynamicValue(), $sym11$RESET_NEW_DEFNS_ADMIT__METERS);
            {
                SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
                SubLObject v_cache = NIL;
                for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                    if ($sym9$NEW_DEFNS_ADMIT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                        at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        clrhash(v_cache);
                    }
                }
            }
            {
                SubLObject item_var = $sym14$_NEW_DEFNS_REJECT__METERS_;
                if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($sym14$_NEW_DEFNS_REJECT__METERS_, $str_alt15$metering_cache_for_calls_to_defn_);
            sethash($RESET, $new_defns_rejectP_meters$.getDynamicValue(), $sym17$RESET_NEW_DEFNS_REJECT__METERS);
            {
                SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
                SubLObject v_cache = NIL;
                for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                    if ($sym16$NEW_DEFNS_REJECT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                        at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        clrhash(v_cache);
                    }
                }
            }
            {
                SubLObject item_var = $sym18$_NEW_QUOTED_DEFNS_ADMIT__METERS_;
                if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($sym18$_NEW_QUOTED_DEFNS_ADMIT__METERS_, $str_alt19$metering_cache_for_calls_to_defn_);
            sethash($RESET, $new_quoted_defns_admitP_meters$.getDynamicValue(), $sym21$RESET_NEW_QUOTED_DEFNS_ADMIT__METERS);
            {
                SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
                SubLObject v_cache = NIL;
                for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                    if ($sym20$NEW_QUOTED_DEFNS_ADMIT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                        at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        clrhash(v_cache);
                    }
                }
            }
            {
                SubLObject item_var = $sym22$_NEW_QUOTED_DEFNS_REJECT__METERS_;
                if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($sym22$_NEW_QUOTED_DEFNS_REJECT__METERS_, $str_alt23$metering_cache_for_calls_to_defn_);
            sethash($RESET, $new_quoted_defns_rejectP_meters$.getDynamicValue(), $sym25$RESET_NEW_QUOTED_DEFNS_REJECT__METERS);
            {
                SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
                SubLObject v_cache = NIL;
                for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                    if ($sym24$NEW_QUOTED_DEFNS_REJECT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                        at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        clrhash(v_cache);
                    }
                }
            }
            {
                SubLObject item_var = $sym48$_NEC_DEFN_REJECTS__METERS_;
                if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($sym48$_NEC_DEFN_REJECTS__METERS_, $str_alt49$metering_cache_for_calls_to_defn_);
            sethash($RESET, $nec_defn_rejectsP_meters$.getDynamicValue(), $sym52$RESET_NEC_DEFN_REJECTS__METERS);
            {
                SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
                SubLObject v_cache = NIL;
                for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                    if ($sym51$NEC_DEFN_REJECTS_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                        at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        clrhash(v_cache);
                    }
                }
            }
            {
                SubLObject item_var = $new_handle_added_genl_for_suf_defns_meters$;
                if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($new_handle_added_genl_for_suf_defns_meters$, $str_alt86$metering_cache_for_calls_to_defn_);
            {
                SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
                SubLObject v_cache = NIL;
                for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                    if (NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                        at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        clrhash(v_cache);
                    }
                }
            }
            {
                SubLObject item_var = $new_handle_added_genl_for_suf_quoted_defns_meters$;
                if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($new_handle_added_genl_for_suf_quoted_defns_meters$, $str_alt91$metering_cache_for_calls_to_defn_);
            {
                SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
                SubLObject v_cache = NIL;
                for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                    if (NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                        at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        clrhash(v_cache);
                    }
                }
            }
            {
                SubLObject item_var = $new_handle_removed_genl_for_suf_defns_meters$;
                if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($new_handle_removed_genl_for_suf_defns_meters$, $str_alt95$metering_cache_for_calls_to_defn_);
            {
                SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
                SubLObject v_cache = NIL;
                for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                    if (NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                        at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        clrhash(v_cache);
                    }
                }
            }
            {
                SubLObject item_var = $new_handle_removed_genl_for_suf_quoted_defns_meters$;
                if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($new_handle_removed_genl_for_suf_quoted_defns_meters$, $str_alt99$metering_cache_for_calls_to_defn_);
            {
                SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
                SubLObject v_cache = NIL;
                for (v_cache = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cache = cdolist_list_var.first()) {
                    if (NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                        at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        clrhash(v_cache);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject setup_defns_file_Previous() {
        declare_defglobal($index_to_defns_cache_vector$);
        SubLObject item_var = $sym12$_NEW_DEFNS_ADMIT__METERS_;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_new_defns_admitP_meters();
        sethash($RESET, $new_defns_admitP_meters$.getDynamicValue(), $sym22$RESET_NEW_DEFNS_ADMIT__METERS);
        SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        SubLObject v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($sym20$NEW_DEFNS_ADMIT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($new_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $sym25$_NEW_DEFNS_REJECT__METERS_;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_new_defns_rejectP_meters();
        sethash($RESET, $new_defns_rejectP_meters$.getDynamicValue(), $sym27$RESET_NEW_DEFNS_REJECT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($sym26$NEW_DEFNS_REJECT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($new_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $sym28$_NEW_QUOTED_DEFNS_ADMIT__METERS_;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_new_quoted_defns_admitP_meters();
        sethash($RESET, $new_quoted_defns_admitP_meters$.getDynamicValue(), $sym30$RESET_NEW_QUOTED_DEFNS_ADMIT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($sym29$NEW_QUOTED_DEFNS_ADMIT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($new_quoted_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $sym31$_NEW_QUOTED_DEFNS_REJECT__METERS_;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_new_quoted_defns_rejectP_meters();
        sethash($RESET, $new_quoted_defns_rejectP_meters$.getDynamicValue(), $sym33$RESET_NEW_QUOTED_DEFNS_REJECT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($sym32$NEW_QUOTED_DEFNS_REJECT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($new_quoted_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $sym58$_NEC_DEFN_REJECTS__METERS_;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_nec_defn_rejectsP_meters();
        sethash($RESET, $nec_defn_rejectsP_meters$.getDynamicValue(), $sym61$RESET_NEC_DEFN_REJECTS__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($sym60$NEC_DEFN_REJECTS_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($nec_defn_rejectsP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        register_kb_function(NEW_ADD_IFF_DEFN);
        register_kb_function(NEW_REMOVE_IFF_DEFN);
        register_kb_function(NEW_ADD_SUF_DEFN);
        register_kb_function(NEW_REMOVE_SUF_DEFN);
        register_kb_function(ADD_NEC_DEFN);
        register_kb_function(REMOVE_NEC_DEFN);
        register_kb_function(NEW_ADD_IFF_QUOTED_DEFN);
        register_kb_function(NEW_REMOVE_IFF_QUOTED_DEFN);
        register_kb_function(NEW_ADD_SUF_QUOTED_DEFN);
        register_kb_function(NEW_REMOVE_SUF_QUOTED_DEFN);
        register_kb_function(ADD_NEC_QUOTED_DEFN);
        register_kb_function(REMOVE_NEC_QUOTED_DEFN);
        item_var = $new_handle_added_genl_for_suf_defns_meters$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_new_handle_added_genl_for_suf_defns_meters();
        sethash($RESET, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(), RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $new_handle_added_genl_for_suf_quoted_defns_meters$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_new_handle_added_genl_for_suf_quoted_defns_meters();
        sethash($RESET, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(), RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $new_handle_removed_genl_for_suf_defns_meters$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_new_handle_removed_genl_for_suf_defns_meters();
        sethash($RESET, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(), RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $new_handle_removed_genl_for_suf_quoted_defns_meters$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_new_handle_removed_genl_for_suf_quoted_defns_meters();
        sethash($RESET, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(), RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_defns_file();
    }

    @Override
    public void initializeVariables() {
        init_defns_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_defns_file();
    }

    static {
    }

    public static final class $col_defn_admitsP$UnaryFunction extends UnaryFunction {
        public $col_defn_admitsP$UnaryFunction() {
            super(extractFunctionNamed("COL-DEFN-ADMITS?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return col_defn_admitsP(arg1);
        }
    }

    public static final class $admitting_defn_assertions$UnaryFunction extends UnaryFunction {
        public $admitting_defn_assertions$UnaryFunction() {
            super(extractFunctionNamed("ADMITTING-DEFN-ASSERTIONS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return admitting_defn_assertions(arg1);
        }
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLSymbol $sym0$_NEW_DEFNS_ADMIT__METERS_ = makeSymbol("*NEW-DEFNS-ADMIT?-METERS*");

    static private final SubLString $str_alt1$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function NEW-DEFNS-ADMIT?");

    static private final SubLList $list_alt7 = list(makeSymbol("COL"), makeSymbol("TERM"), makeSymbol("MT"));

    static private final SubLSymbol $sym9$NEW_DEFNS_ADMIT_ = makeSymbol("NEW-DEFNS-ADMIT?");

    static private final SubLSymbol $sym11$RESET_NEW_DEFNS_ADMIT__METERS = makeSymbol("RESET-NEW-DEFNS-ADMIT?-METERS");

    static private final SubLSymbol $sym14$_NEW_DEFNS_REJECT__METERS_ = makeSymbol("*NEW-DEFNS-REJECT?-METERS*");

    static private final SubLString $str_alt15$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function NEW-DEFNS-REJECT?");

    static private final SubLSymbol $sym16$NEW_DEFNS_REJECT_ = makeSymbol("NEW-DEFNS-REJECT?");

    static private final SubLSymbol $sym17$RESET_NEW_DEFNS_REJECT__METERS = makeSymbol("RESET-NEW-DEFNS-REJECT?-METERS");

    static private final SubLSymbol $sym18$_NEW_QUOTED_DEFNS_ADMIT__METERS_ = makeSymbol("*NEW-QUOTED-DEFNS-ADMIT?-METERS*");

    static private final SubLString $str_alt19$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function NEW-QUOTED-DEFNS-ADMIT?");

    static private final SubLSymbol $sym20$NEW_QUOTED_DEFNS_ADMIT_ = makeSymbol("NEW-QUOTED-DEFNS-ADMIT?");

    static private final SubLSymbol $sym21$RESET_NEW_QUOTED_DEFNS_ADMIT__METERS = makeSymbol("RESET-NEW-QUOTED-DEFNS-ADMIT?-METERS");

    static private final SubLSymbol $sym22$_NEW_QUOTED_DEFNS_REJECT__METERS_ = makeSymbol("*NEW-QUOTED-DEFNS-REJECT?-METERS*");

    static private final SubLString $str_alt23$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function NEW-QUOTED-DEFNS-REJECT?");

    static private final SubLSymbol $sym24$NEW_QUOTED_DEFNS_REJECT_ = makeSymbol("NEW-QUOTED-DEFNS-REJECT?");

    static private final SubLSymbol $sym25$RESET_NEW_QUOTED_DEFNS_REJECT__METERS = makeSymbol("RESET-NEW-QUOTED-DEFNS-REJECT?-METERS");

    static private final SubLString $str_alt31$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt36$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt38$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt39$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLSymbol $sym40$COL_QUOTED_DEFN_ADMITS_ = makeSymbol("COL-QUOTED-DEFN-ADMITS?");

    static private final SubLSymbol $sym41$COL_DEFN_ADMITS_ = makeSymbol("COL-DEFN-ADMITS?");

    static private final SubLList $list_alt42 = list(makeSymbol("CONSTRAINT-RELN"), makeSymbol("VIA"), makeSymbol("CONSTRAINT-GAF"));

    static private final SubLSymbol $sym48$_NEC_DEFN_REJECTS__METERS_ = makeSymbol("*NEC-DEFN-REJECTS?-METERS*");

    static private final SubLString $str_alt49$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function NEC-DEFN-REJECTS?");

    static private final SubLList $list_alt50 = list(makeSymbol("COL"), makeSymbol("TERM"), makeSymbol("MT"), makeSymbol("QUOTED?"), makeSymbol("CONSIDER-IFF-AS-NEC?"));

    static private final SubLSymbol $sym51$NEC_DEFN_REJECTS_ = makeSymbol("NEC-DEFN-REJECTS?");

    static private final SubLSymbol $sym52$RESET_NEC_DEFN_REJECTS__METERS = makeSymbol("RESET-NEC-DEFN-REJECTS?-METERS");

    static private final SubLList $list_alt61 = list(list(makeSymbol("STRINGP"), reader_make_constant_shell("CharacterString")), list(makeSymbol("POSITIVE-INTEGER-P"), reader_make_constant_shell("PositiveInteger")), list(makeSymbol("NON-NEGATIVE-INTEGER-P"), reader_make_constant_shell("NonNegativeInteger")), list(makeSymbol("INTEGERP"), reader_make_constant_shell("Integer")), list(makeSymbol("FLOATP"), reader_make_constant_shell("RealNumber")), list(makeSymbol("TRUE"), reader_make_constant_shell("Thing")));

    static private final SubLList $list_alt62 = list(makeSymbol("DEFN"), makeSymbol("COLLECTION"));

    static private final SubLList $list_alt64 = list(list(makeSymbol("STRINGP"), reader_make_constant_shell("SubLString")), list(makeSymbol("INTEGERP"), reader_make_constant_shell("SubLInteger")), list(makeSymbol("FLOATP"), reader_make_constant_shell("SubLRealNumber")), list(makeSymbol("SYMBOLP"), reader_make_constant_shell("SubLSymbol")), list(makeSymbol("CONSTANT-P"), reader_make_constant_shell("CycLConstant")), list(makeSymbol("NART-P"), reader_make_constant_shell("CycLNonAtomicReifiedTerm")), list(makeSymbol("ASSERTION-P"), reader_make_constant_shell("CycLAssertion")), list(makeSymbol("TRUE"), reader_make_constant_shell("CycLExpression")));

    static private final SubLList $list_alt65 = list(makeSymbol("QUOTED-DEFN"), makeSymbol("COLLECTION"));

    static private final SubLString $str_alt86$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS");

    static private final SubLList $list_alt87 = list(makeSymbol("SPEC"), makeSymbol("GENL"));

    static private final SubLString $str_alt91$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS");

    static private final SubLString $str_alt95$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS");

    static private final SubLString $str_alt99$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS");

    static private final SubLString $str_alt104$Initializing_defns___ = makeString("Initializing defns...");
}

/**
 * Total time: 3406 ms
 */
