/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.genl_predicates.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class at_routines extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new at_routines();

 public static final String myName = "com.cyc.cycjava.cycl.at_routines";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $at_check_quoted_arg_isaP$ = makeSymbol("*AT-CHECK-QUOTED-ARG-ISA?*");

    // defvar
    // Storage for applicable applicable arg-types (e.g. argIsa argGenls)
    /**
     * Storage for applicable applicable arg-types (e.g. argIsa argGenls)
     */
    @LispMethod(comment = "Storage for applicable applicable arg-types (e.g. argIsa argGenls)\ndefvar")
    private static final SubLSymbol $at_applicable_arg_types$ = makeSymbol("*AT-APPLICABLE-ARG-TYPES*");

    // defvar
    /**
     * Storage for the applicable arg-type (e.g. argIsa argGenls) with the KB
     * assertions
     */
    @LispMethod(comment = "Storage for the applicable arg-type (e.g. argIsa argGenls) with the KB\r\nassertions\ndefvar\nStorage for the applicable arg-type (e.g. argIsa argGenls) with the KB\nassertions")
    public static final SubLSymbol $at_applicable_arg_types_with_assertions$ = makeSymbol("*AT-APPLICABLE-ARG-TYPES-WITH-ASSERTIONS*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $ind_arg_relevant_constraints$ = makeSymbol("*IND-ARG-RELEVANT-CONSTRAINTS*");

    static private final SubLList $list1 = list(makeSymbol("*AT-APPLICABLE-ARG-TYPES*"), list(makeSymbol("*AT-APPLICABLE-ARG-TYPES-WITH-ASSERTIONS*"), list(makeSymbol("NEW-DICTIONARY"), list(QUOTE, EQUAL))));

    private static final SubLSymbol ALLOW_ESCAPE_QUOTE_WHEN_QUOTE_PREDICATE = makeSymbol("ALLOW-ESCAPE-QUOTE-WHEN-QUOTE-PREDICATE");

    private static final SubLSymbol WITH_SBHL_RESOURCED_MARKING_SPACES = makeSymbol("WITH-SBHL-RESOURCED-MARKING-SPACES");



    static private final SubLSymbol $sym7$VALID_FORT_TYPE_ = makeSymbol("VALID-FORT-TYPE?");

    private static final SubLSymbol $MAL_ARG_WRT_COL_DEFN = makeKeyword("MAL-ARG-WRT-COL-DEFN");

    private static final SubLSymbol $MAL_ARG_WRT_ARG_ISA = makeKeyword("MAL-ARG-WRT-ARG-ISA");

    static private final SubLList $list10 = list(makeSymbol("CONSTRAINT-RELN"), makeSymbol("VIA"), makeSymbol("CONSTRAINT-GAF"));

    private static final SubLSymbol $AT_CONSTRAINT_GAF = makeKeyword("AT-CONSTRAINT-GAF");

    private static final SubLSymbol $WFF_EXPANSION_FORMULA = makeKeyword("WFF-EXPANSION-FORMULA");

    private static final SubLSymbol $WFF_ORIGINAL_FORMULA = makeKeyword("WFF-ORIGINAL-FORMULA");

    private static final SubLSymbol $MAL_RELN_WRT_ARG_ISA_REQUIRED = makeKeyword("MAL-RELN-WRT-ARG-ISA-REQUIRED");

    private static final SubLSymbol $ARG_NOT_ISA = makeKeyword("ARG-NOT-ISA");

    private static final SubLSymbol $MAL_ARG_WRT_ARG_NOT_ISA = makeKeyword("MAL-ARG-WRT-ARG-NOT-ISA");

    private static final SubLSymbol $MAL_RELN_WRT_ARG_NOT_ISA_REQUIRED = makeKeyword("MAL-RELN-WRT-ARG-NOT-ISA-REQUIRED");

    private static final SubLSymbol $sym23$VARIABLE_TERM_WRT_ARG_TYPE_ = makeSymbol("VARIABLE-TERM-WRT-ARG-TYPE?");

    private static final SubLSymbol $MAL_ARG_WRT_ARG_NOT_ISA_DISJOINT = makeKeyword("MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT");

    private static final SubLSymbol $ARG_QUOTED_ISA = makeKeyword("ARG-QUOTED-ISA");

    private static final SubLSymbol $MAL_ARG_WRT_COL_QUOTED_DEFN = makeKeyword("MAL-ARG-WRT-COL-QUOTED-DEFN");

    private static final SubLSymbol $MAL_ARG_WRT_ARG_QUOTED_ISA = makeKeyword("MAL-ARG-WRT-ARG-QUOTED-ISA");





    private static final SubLSymbol $MAL_ARG_WRT_ARG_NOT_QUOTED_ISA_DISJOINT = makeKeyword("MAL-ARG-WRT-ARG-NOT-QUOTED-ISA-DISJOINT");



    private static final SubLSymbol $MAL_ARG_WRT_ARG_GENL = makeKeyword("MAL-ARG-WRT-ARG-GENL");

    private static final SubLSymbol $MAL_ARG_WRT_ARG_NOT_GENLS_DISJOINT = makeKeyword("MAL-ARG-WRT-ARG-NOT-GENLS-DISJOINT");



    private static final SubLSymbol $MAL_ARG_WRT_ARG_FORMAT = makeKeyword("MAL-ARG-WRT-ARG-FORMAT");

    private static final SubLSymbol $INTER_ARG_ISA = makeKeyword("INTER-ARG-ISA");

    private static final SubLList $list41 = list(makeSymbol("IND-ARG-ISA"), makeSymbol("DEP-ARG-ISA"));

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_DEFN = makeKeyword("MAL-ARG-WRT-INTER-ARG-DEFN");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_ISA = makeKeyword("MAL-ARG-WRT-INTER-ARG-ISA");

    private static final SubLList $list44 = list(makeSymbol("CONSTRAINT-RELN"), makeSymbol("VIA"));

    private static final SubLObject $$interArgGenl1_2 = reader_make_constant_shell("interArgGenl1-2");

    private static final SubLObject $$interArgGenl2_1 = reader_make_constant_shell("interArgGenl2-1");

    private static final SubLObject $$interArgGenl2_4 = reader_make_constant_shell("interArgGenl2-4");



    static private final SubLString $str54$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $$$continue_anyway = makeString("continue anyway");

    static private final SubLString $str59$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str60$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str61$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str62$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol $INTER_ARG_GENL = makeKeyword("INTER-ARG-GENL");

    private static final SubLList $list64 = list(makeSymbol("IND-ARG-GENL"), makeSymbol("DEP-ARG-GENL"));

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_GENL = makeKeyword("MAL-ARG-WRT-INTER-ARG-GENL");

    private static final SubLSymbol $INTER_ARG_NOT_ISA = makeKeyword("INTER-ARG-NOT-ISA");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_NOT_ISA = makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-ISA");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_NOT_DEFN = makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-DEFN");

    private static final SubLObject $$interArgNotIsa1_2 = reader_make_constant_shell("interArgNotIsa1-2");

    private static final SubLObject $$interArgNotIsa2_1 = reader_make_constant_shell("interArgNotIsa2-1");

    private static final SubLSymbol $INTER_ARG_NOT_GENL = makeKeyword("INTER-ARG-NOT-GENL");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_NOT_GENL = makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-GENL");

    private static final SubLObject $$interArgNotGenl1_2 = reader_make_constant_shell("interArgNotGenl1-2");

    private static final SubLSymbol $INTER_ARG_GENL_ISA = makeKeyword("INTER-ARG-GENL-ISA");

    private static final SubLList $list75 = list(makeSymbol("IND-ARG-GENL"), makeSymbol("DEP-ARG-ISA"));

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_GENL_ISA = makeKeyword("MAL-ARG-WRT-INTER-ARG-GENL-ISA");

    private static final SubLObject $$interArgGenlIsa2_1 = reader_make_constant_shell("interArgGenlIsa2-1");

    private static final SubLSymbol $INTER_ARG_ISA_GENL = makeKeyword("INTER-ARG-ISA-GENL");

    private static final SubLList $list79 = list(makeSymbol("IND-ARG-ISA"), makeSymbol("DEP-ARG-GENL"));

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_ISA_GENL = makeKeyword("MAL-ARG-WRT-INTER-ARG-ISA-GENL");

    private static final SubLObject $$interArgIsaGenl1_2 = reader_make_constant_shell("interArgIsaGenl1-2");

    private static final SubLObject $$interArgIsaGenl2_1 = reader_make_constant_shell("interArgIsaGenl2-1");

    private static final SubLObject $$interArgIsaGenl2_3 = reader_make_constant_shell("interArgIsaGenl2-3");

    private static final SubLObject $$interArgIsaGenl3_2 = reader_make_constant_shell("interArgIsaGenl3-2");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_NOT_ISA_DISJOINT = makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-ISA-DISJOINT");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_NOT_GENL_DISJOINT = makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-GENL-DISJOINT");

    private static final SubLSymbol $INTER_ARG_FORMAT = makeKeyword("INTER-ARG-FORMAT");

    private static final SubLList $list88 = list(makeSymbol("IND-ARG-ISA"), makeSymbol("DEP-ARG-FORMAT"));

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_FORMAT = makeKeyword("MAL-ARG-WRT-INTER-ARG-FORMAT");



    private static final SubLSymbol $INTER_ARG_DIFFERENT = makeKeyword("INTER-ARG-DIFFERENT");

    private static final SubLList $list92 = list(makeSymbol("ARGNUM1"), makeSymbol("ARGNUM2"));

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_DIFFERENT = makeKeyword("MAL-ARG-WRT-INTER-ARG-DIFFERENT");

    private static final SubLSymbol ARG_COLLECTIONS = makeSymbol("ARG-COLLECTIONS");

    private static final SubLSymbol $arg_collections_caching_state$ = makeSymbol("*ARG-COLLECTIONS-CACHING-STATE*");

    private static final SubLSymbol CLEAR_ARG_COLLECTIONS = makeSymbol("CLEAR-ARG-COLLECTIONS");

    private static final SubLSymbol $sym100$CYC_VAR_ = makeSymbol("CYC-VAR?");

    private static final SubLSymbol $VIA_GENL_PRED = makeKeyword("VIA-GENL-PRED");

    private static final SubLSymbol $VIA_GENL_INVERSE = makeKeyword("VIA-GENL-INVERSE");



    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");







    private static final SubLString $str110$Unknown_constraint_type__s = makeString("Unknown constraint-type ~s");

    private static final SubLList $list113 = list(makeSymbol("INTER-ARG-TYPE"), makeSymbol("RELN"), makeSymbol("VIA"));

    private static final SubLSymbol APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_INT_MEMOIZED = makeSymbol("APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-INT-MEMOIZED");

    private static final SubLSymbol $sym115$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_DICTIONARY = makeSymbol("APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-DICTIONARY");

    private static final SubLSymbol $applicable_inter_arg_type_pred_collections_dictionary_caching_state$ = makeSymbol("*APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-DICTIONARY-CACHING-STATE*");

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLSymbol CLEAR_APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_DICTIONARY = makeSymbol("CLEAR-APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-DICTIONARY");



    public static final SubLObject with_applicable_arg_types_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt1, list(ALLOW_ESCAPE_QUOTE_WHEN_QUOTE_PREDICATE, RELN, listS(WITH_SBHL_RESOURCED_MARKING_SPACES, TEN_INTEGER, append(body, NIL))));
        }
    }

    public static SubLObject with_applicable_arg_types(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list1, list(ALLOW_ESCAPE_QUOTE_WHEN_QUOTE_PREDICATE, RELN, listS(WITH_SBHL_RESOURCED_MARKING_SPACES, TEN_INTEGER, append(body, NIL))));
    }

    /**
     * do the arg-isa collections applicable to arg
     * number <argnum> of relation <reln> include <arg>?
     */
    @LispMethod(comment = "do the arg-isa collections applicable to arg\r\nnumber <argnum> of relation <reln> include <arg>?\ndo the arg-isa collections applicable to arg\nnumber <argnum> of relation <reln> include <arg>?")
    public static final SubLObject mal_arg_isaP_alt(SubLObject reln, SubLObject arg, SubLObject argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == at_vars.$at_check_arg_isaP$.getDynamicValue(thread)) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                SubLObject doneP = NIL;
                SubLObject arg_isas_foundP = NIL;
                {
                    SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
                    try {
                        $at_applicable_arg_types$.bind(NIL, thread);
                        $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
                        if (reln == $$Quote) {
                            {
                                SubLObject _prev_bind_0_1 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                                try {
                                    cycl_grammar.$within_quote_form$.bind(T, thread);
                                    {
                                        SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                        {
                                            SubLObject _prev_bind_0_2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                            SubLObject _prev_bind_1_3 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                com.cyc.cycjava.cycl.at_routines.applicable_arg_type_collections(reln, argnum, $ARG_ISA);
                                                if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                                    {
                                                        SubLObject fort_type_arg_isas = list_utilities.remove_if_not($sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        SubLObject other_arg_isas = remove_if($sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        arg_isas_foundP = T;
                                                        if (NIL == doneP) {
                                                            {
                                                                SubLObject csome_list_var = fort_type_arg_isas;
                                                                SubLObject col = NIL;
                                                                for (col = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , col = csome_list_var.first()) {
                                                                    {
                                                                        SubLObject _prev_bind_0_4 = wff_vars.$wff_violations$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_5 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                                                                        try {
                                                                            wff_vars.$wff_violations$.bind(NIL, thread);
                                                                            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                                                                            if (NIL == fort_types_interface.fort_has_typeP(arg, col, UNPROVIDED)) {
                                                                                if (NIL == at_defns.defns_admitP(col, arg, UNPROVIDED)) {
                                                                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                        com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.arg_isa_violations(reln, arg, argnum, col));
                                                                                        com.cyc.cycjava.cycl.at_routines.note_at_violations(wff.wff_violations());
                                                                                    }
                                                                                    result = T;
                                                                                    doneP = at_utilities.at_finishedP(result);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_1_5, thread);
                                                                            wff_vars.$wff_violations$.rebind(_prev_bind_0_4, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (NIL == doneP) {
                                                            {
                                                                SubLObject csome_list_var = other_arg_isas;
                                                                SubLObject col = NIL;
                                                                for (col = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , col = csome_list_var.first()) {
                                                                    {
                                                                        SubLObject _prev_bind_0_6 = wff_vars.$wff_violations$.currentBinding(thread);
                                                                        try {
                                                                            wff_vars.$wff_violations$.bind(NIL, thread);
                                                                            if (NIL == at_defns.has_typeP(arg, col, UNPROVIDED)) {
                                                                                if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                    com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.arg_isa_violations(reln, arg, argnum, col));
                                                                                    com.cyc.cycjava.cycl.at_routines.note_at_violations(wff.wff_violations());
                                                                                }
                                                                                result = T;
                                                                                doneP = at_utilities.at_finishedP(result);
                                                                            }
                                                                        } finally {
                                                                            wff_vars.$wff_violations$.rebind(_prev_bind_0_6, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_3, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_2, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        } else {
                            {
                                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                {
                                    SubLObject _prev_bind_0_7 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                    SubLObject _prev_bind_1_8 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                        com.cyc.cycjava.cycl.at_routines.applicable_arg_type_collections(reln, argnum, $ARG_ISA);
                                        if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                            {
                                                SubLObject fort_type_arg_isas = list_utilities.remove_if_not($sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                SubLObject other_arg_isas = remove_if($sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                arg_isas_foundP = T;
                                                if (NIL == doneP) {
                                                    {
                                                        SubLObject csome_list_var = fort_type_arg_isas;
                                                        SubLObject col = NIL;
                                                        for (col = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , col = csome_list_var.first()) {
                                                            {
                                                                SubLObject _prev_bind_0_9 = wff_vars.$wff_violations$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_10 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                                                                try {
                                                                    wff_vars.$wff_violations$.bind(NIL, thread);
                                                                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                                                                    if (NIL == fort_types_interface.fort_has_typeP(arg, col, UNPROVIDED)) {
                                                                        if (NIL == at_defns.defns_admitP(col, arg, UNPROVIDED)) {
                                                                            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.arg_isa_violations(reln, arg, argnum, col));
                                                                                com.cyc.cycjava.cycl.at_routines.note_at_violations(wff.wff_violations());
                                                                            }
                                                                            result = T;
                                                                            doneP = at_utilities.at_finishedP(result);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_1_10, thread);
                                                                    wff_vars.$wff_violations$.rebind(_prev_bind_0_9, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                if (NIL == doneP) {
                                                    {
                                                        SubLObject csome_list_var = other_arg_isas;
                                                        SubLObject col = NIL;
                                                        for (col = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , col = csome_list_var.first()) {
                                                            {
                                                                SubLObject _prev_bind_0_11 = wff_vars.$wff_violations$.currentBinding(thread);
                                                                try {
                                                                    wff_vars.$wff_violations$.bind(NIL, thread);
                                                                    if (NIL == at_defns.has_typeP(arg, col, UNPROVIDED)) {
                                                                        if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                            com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.arg_isa_violations(reln, arg, argnum, col));
                                                                            com.cyc.cycjava.cycl.at_routines.note_at_violations(wff.wff_violations());
                                                                        }
                                                                        result = T;
                                                                        doneP = at_utilities.at_finishedP(result);
                                                                    }
                                                                } finally {
                                                                    wff_vars.$wff_violations$.rebind(_prev_bind_0_11, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_8, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_7, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
                        $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
                    }
                }
                if ((NIL != at_vars.at_some_arg_isa_requiredP()) && (NIL == doneP)) {
                    if (NIL != arg_isas_foundP) {
                        result = NIL;
                    } else {
                        at_utilities.note_at_violation(com.cyc.cycjava.cycl.at_routines.arg_isa_required_violation(reln, argnum, UNPROVIDED));
                        result = T;
                    }
                }
                return result;
            }
        }
    }

    /**
     * do the arg-isa collections applicable to arg
     * number <argnum> of relation <reln> include <arg>?
     */
    @LispMethod(comment = "do the arg-isa collections applicable to arg\r\nnumber <argnum> of relation <reln> include <arg>?\ndo the arg-isa collections applicable to arg\nnumber <argnum> of relation <reln> include <arg>?")
    public static SubLObject mal_arg_isaP(final SubLObject reln, final SubLObject arg, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == at_vars.$at_check_arg_isaP$.getDynamicValue(thread)) {
            return NIL;
        }
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        SubLObject arg_isas_foundP = NIL;
        final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
        try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if (reln.eql($$Quote)) {
                final SubLObject _prev_bind_0_$1 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                    cycl_grammar.$within_quote_form$.bind(T, thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_arg_type_collections(reln, argnum, $ARG_ISA);
                        if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                            final SubLObject fort_type_arg_isas = list_utilities.remove_if_not($sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            final SubLObject other_arg_isas = remove_if($sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            arg_isas_foundP = T;
                            if (NIL == doneP) {
                                SubLObject csome_list_var = fort_type_arg_isas;
                                SubLObject col = NIL;
                                col = csome_list_var.first();
                                while ((NIL == doneP) && (NIL != csome_list_var)) {
                                    final SubLObject _prev_bind_0_$3 = wff_vars.$wff_violations$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$4 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                                    try {
                                        wff_vars.$wff_violations$.bind(NIL, thread);
                                        at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                                        if ((NIL == fort_types_interface.fort_has_typeP(arg, col, UNPROVIDED)) && (NIL == at_defns.defns_admitP(col, arg, UNPROVIDED))) {
                                            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                note_at_violations(arg_isa_violations(reln, arg, argnum, col));
                                                note_at_violations(wff.wff_violations());
                                            }
                                            result = T;
                                            doneP = at_utilities.at_finishedP(result);
                                        }
                                    } finally {
                                        at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_1_$4, thread);
                                        wff_vars.$wff_violations$.rebind(_prev_bind_0_$3, thread);
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    col = csome_list_var.first();
                                } 
                            }
                            if (NIL == doneP) {
                                SubLObject csome_list_var = other_arg_isas;
                                SubLObject col = NIL;
                                col = csome_list_var.first();
                                while ((NIL == doneP) && (NIL != csome_list_var)) {
                                    final SubLObject _prev_bind_0_$4 = wff_vars.$wff_violations$.currentBinding(thread);
                                    try {
                                        wff_vars.$wff_violations$.bind(NIL, thread);
                                        if (NIL == at_defns.has_typeP(arg, col, UNPROVIDED)) {
                                            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                note_at_violations(arg_isa_violations(reln, arg, argnum, col));
                                                note_at_violations(wff.wff_violations());
                                            }
                                            result = T;
                                            doneP = at_utilities.at_finishedP(result);
                                        }
                                    } finally {
                                        wff_vars.$wff_violations$.rebind(_prev_bind_0_$4, thread);
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    col = csome_list_var.first();
                                } 
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_$1, thread);
                }
            } else {
                final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$5 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_1_$5 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p2, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p2), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_arg_type_collections(reln, argnum, $ARG_ISA);
                    if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                        final SubLObject fort_type_arg_isas2 = list_utilities.remove_if_not($sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        final SubLObject other_arg_isas2 = remove_if($sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        arg_isas_foundP = T;
                        if (NIL == doneP) {
                            SubLObject csome_list_var2 = fort_type_arg_isas2;
                            SubLObject col2 = NIL;
                            col2 = csome_list_var2.first();
                            while ((NIL == doneP) && (NIL != csome_list_var2)) {
                                final SubLObject _prev_bind_0_$6 = wff_vars.$wff_violations$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$6 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                                try {
                                    wff_vars.$wff_violations$.bind(NIL, thread);
                                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                                    if ((NIL == fort_types_interface.fort_has_typeP(arg, col2, UNPROVIDED)) && (NIL == at_defns.defns_admitP(col2, arg, UNPROVIDED))) {
                                        if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                            note_at_violations(arg_isa_violations(reln, arg, argnum, col2));
                                            note_at_violations(wff.wff_violations());
                                        }
                                        result = T;
                                        doneP = at_utilities.at_finishedP(result);
                                    }
                                } finally {
                                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_1_$6, thread);
                                    wff_vars.$wff_violations$.rebind(_prev_bind_0_$6, thread);
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                col2 = csome_list_var2.first();
                            } 
                        }
                        if (NIL == doneP) {
                            SubLObject csome_list_var2 = other_arg_isas2;
                            SubLObject col2 = NIL;
                            col2 = csome_list_var2.first();
                            while ((NIL == doneP) && (NIL != csome_list_var2)) {
                                final SubLObject _prev_bind_0_$7 = wff_vars.$wff_violations$.currentBinding(thread);
                                try {
                                    wff_vars.$wff_violations$.bind(NIL, thread);
                                    if (NIL == at_defns.has_typeP(arg, col2, UNPROVIDED)) {
                                        if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                            note_at_violations(arg_isa_violations(reln, arg, argnum, col2));
                                            note_at_violations(wff.wff_violations());
                                        }
                                        result = T;
                                        doneP = at_utilities.at_finishedP(result);
                                    }
                                } finally {
                                    wff_vars.$wff_violations$.rebind(_prev_bind_0_$7, thread);
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                col2 = csome_list_var2.first();
                            } 
                        }
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_4, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$5, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$5, thread);
                }
            }
        } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_2, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
        }
        if ((NIL != at_vars.at_some_arg_isa_requiredP()) && (NIL == doneP)) {
            if (NIL != arg_isas_foundP) {
                result = NIL;
            } else {
                at_utilities.note_at_violation(arg_isa_required_violation(reln, argnum, UNPROVIDED));
                result = T;
            }
        }
        return result;
    }

    public static final SubLObject arg_isa_violations_alt(SubLObject reln, SubLObject arg, SubLObject argnum, SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constraints = dictionary.dictionary_lookup($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), col, UNPROVIDED);
                SubLObject violations = NIL;
                SubLObject cdolist_list_var = constraints;
                SubLObject constraint_details = NIL;
                for (constraint_details = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_details = cdolist_list_var.first()) {
                    violations = cons(com.cyc.cycjava.cycl.at_routines.arg_isa_violation(reln, arg, argnum, col, constraint_details), violations);
                }
                return violations;
            }
        }
    }

    public static SubLObject arg_isa_violations(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constraints = dictionary.dictionary_lookup($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), col, UNPROVIDED);
        SubLObject violations = NIL;
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint_details = NIL;
        constraint_details = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            violations = cons(arg_isa_violation(reln, arg, argnum, col, constraint_details), violations);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_details = cdolist_list_var.first();
        } 
        return violations;
    }

    public static final SubLObject arg_isa_violation_alt(SubLObject reln, SubLObject arg, SubLObject argnum, SubLObject col, SubLObject constraint_details) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                SubLObject module = (NIL != kb_accessors.admitting_defnsP(col, mt)) ? ((SubLObject) ($MAL_ARG_WRT_COL_DEFN)) : $MAL_ARG_WRT_ARG_ISA;
                return com.cyc.cycjava.cycl.at_routines.arg_isa_violation_int(reln, arg, argnum, col, constraint_details, module);
            }
        }
    }

    public static SubLObject arg_isa_violation(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col, final SubLObject constraint_details) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        final SubLObject module = (NIL != kb_accessors.admitting_defnsP(col, mt)) ? $MAL_ARG_WRT_COL_DEFN : $MAL_ARG_WRT_ARG_ISA;
        return arg_isa_violation_int(reln, arg, argnum, col, constraint_details, module);
    }

    public static final SubLObject arg_isa_violation_int_alt(SubLObject reln, SubLObject arg, SubLObject argnum, SubLObject col, SubLObject constraint_details, SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                SubLObject data = NIL;
                SubLObject datum = constraint_details;
                SubLObject current = datum;
                SubLObject constraint_reln = NIL;
                SubLObject via = NIL;
                SubLObject constraint_gaf = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt10);
                constraint_reln = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt10);
                via = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt10);
                constraint_gaf = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (via != $SELF) {
                        data = cons(list(via, constraint_reln), data);
                    }
                    if (NIL == wff_vars.wff_violation_data_terseP()) {
                        if ((NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue(thread)) && (NIL != constraint_gaf)) {
                            data = cons(list($AT_CONSTRAINT_GAF, constraint_gaf), data);
                        }
                        data = append(data, com.cyc.cycjava.cycl.at_routines.wff_violation_verbose_data());
                    }
                    return listS(module, new SubLObject[]{ arg, reln, argnum, col, mt, append(data, NIL) });
                } else {
                    cdestructuring_bind_error(datum, $list_alt10);
                }
            }
            return NIL;
        }
    }

    public static SubLObject arg_isa_violation_int(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col, final SubLObject constraint_details, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        SubLObject data = NIL;
        SubLObject constraint_reln = NIL;
        SubLObject via = NIL;
        SubLObject constraint_gaf = NIL;
        destructuring_bind_must_consp(constraint_details, constraint_details, $list10);
        constraint_reln = constraint_details.first();
        SubLObject current = constraint_details.rest();
        destructuring_bind_must_consp(current, constraint_details, $list10);
        via = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, constraint_details, $list10);
        constraint_gaf = current.first();
        current = current.rest();
        if (NIL == current) {
            if (via != $SELF) {
                data = cons(list(via, constraint_reln), data);
            }
            if (NIL == wff_vars.wff_violation_data_terseP()) {
                if ((NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue(thread)) && (NIL != constraint_gaf)) {
                    data = cons(list($AT_CONSTRAINT_GAF, constraint_gaf), data);
                }
                data = append(data, wff_violation_verbose_data());
            }
            return listS(module, new SubLObject[]{ arg, reln, argnum, col, mt, append(data, NIL) });
        }
        cdestructuring_bind_error(constraint_details, $list10);
        return NIL;
    }

    public static final SubLObject wff_violation_verbose_data_alt() {
        {
            SubLObject data = NIL;
            if (NIL != wff_vars.wff_formula()) {
                data = cons(list($WFF_FORMULA, wff_vars.wff_formula()), data);
            }
            if (NIL != wff_vars.wff_expansion_formula()) {
                data = cons(list($WFF_EXPANSION_FORMULA, wff_vars.wff_expansion_formula()), data);
            }
            if (NIL != wff_vars.wff_original_formula()) {
                data = cons(list($WFF_ORIGINAL_FORMULA, wff_vars.wff_original_formula()), data);
            }
            return data;
        }
    }

    public static SubLObject wff_violation_verbose_data() {
        SubLObject data = NIL;
        if (NIL != wff_vars.wff_formula()) {
            data = cons(list($WFF_FORMULA, wff_vars.wff_formula()), data);
        }
        if (NIL != wff_vars.wff_expansion_formula()) {
            data = cons(list($WFF_EXPANSION_FORMULA, wff_vars.wff_expansion_formula()), data);
        }
        if (NIL != wff_vars.wff_original_formula()) {
            data = cons(list($WFF_ORIGINAL_FORMULA, wff_vars.wff_original_formula()), data);
        }
        return data;
    }

    public static final SubLObject arg_isa_required_violation_alt(SubLObject reln, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return list($MAL_RELN_WRT_ARG_ISA_REQUIRED, reln, argnum, mt);
    }

    public static SubLObject arg_isa_required_violation(final SubLObject reln, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return list($MAL_RELN_WRT_ARG_ISA_REQUIRED, reln, argnum, mt);
    }

    public static SubLObject mal_arg_not_isaP(final SubLObject reln, final SubLObject arg, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == at_vars.$at_check_arg_not_isaP$.getDynamicValue(thread)) {
            return NIL;
        }
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        SubLObject arg_not_isas_foundP = NIL;
        final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
        try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if (reln.eql($$Quote)) {
                final SubLObject _prev_bind_0_$12 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                    cycl_grammar.$within_quote_form$.bind(T, thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$13 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$14 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_arg_type_collections(reln, argnum, $ARG_NOT_ISA);
                        if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                            final SubLObject fort_type_arg_not_isas = list_utilities.remove_if_not($sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            final SubLObject other_arg_not_isas = remove_if($sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            arg_not_isas_foundP = T;
                            if (NIL == doneP) {
                                SubLObject csome_list_var = fort_type_arg_not_isas;
                                SubLObject col = NIL;
                                col = csome_list_var.first();
                                while ((NIL == doneP) && (NIL != csome_list_var)) {
                                    final SubLObject _prev_bind_0_$14 = wff_vars.$wff_violations$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$15 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                                    try {
                                        wff_vars.$wff_violations$.bind(NIL, thread);
                                        at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                                        if ((NIL != fort_types_interface.fort_has_typeP(arg, col, UNPROVIDED)) && (NIL == at_defns.defns_admitP(col, arg, UNPROVIDED))) {
                                            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                note_at_violations(arg_not_isa_violations(reln, arg, argnum, col));
                                                note_at_violations(wff.wff_violations());
                                            }
                                            result = T;
                                            doneP = at_utilities.at_finishedP(result);
                                        }
                                    } finally {
                                        at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_1_$15, thread);
                                        wff_vars.$wff_violations$.rebind(_prev_bind_0_$14, thread);
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    col = csome_list_var.first();
                                } 
                            }
                            if (NIL == doneP) {
                                SubLObject csome_list_var = other_arg_not_isas;
                                SubLObject col = NIL;
                                col = csome_list_var.first();
                                while ((NIL == doneP) && (NIL != csome_list_var)) {
                                    final SubLObject _prev_bind_0_$15 = wff_vars.$wff_violations$.currentBinding(thread);
                                    try {
                                        wff_vars.$wff_violations$.bind(NIL, thread);
                                        if (NIL != at_defns.has_typeP(arg, col, UNPROVIDED)) {
                                            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                note_at_violations(arg_not_isa_violations(reln, arg, argnum, col));
                                                note_at_violations(wff.wff_violations());
                                            }
                                            result = T;
                                            doneP = at_utilities.at_finishedP(result);
                                        }
                                    } finally {
                                        wff_vars.$wff_violations$.rebind(_prev_bind_0_$15, thread);
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    col = csome_list_var.first();
                                } 
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$14, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$13, thread);
                    }
                } finally {
                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_$12, thread);
                }
            } else {
                final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$16 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_1_$16 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p2, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p2), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_arg_type_collections(reln, argnum, $ARG_NOT_ISA);
                    if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                        final SubLObject fort_type_arg_not_isas2 = list_utilities.remove_if_not($sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        final SubLObject other_arg_not_isas2 = remove_if($sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        arg_not_isas_foundP = T;
                        if (NIL == doneP) {
                            SubLObject csome_list_var2 = fort_type_arg_not_isas2;
                            SubLObject col2 = NIL;
                            col2 = csome_list_var2.first();
                            while ((NIL == doneP) && (NIL != csome_list_var2)) {
                                final SubLObject _prev_bind_0_$17 = wff_vars.$wff_violations$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$17 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                                try {
                                    wff_vars.$wff_violations$.bind(NIL, thread);
                                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                                    if ((NIL != fort_types_interface.fort_has_typeP(arg, col2, UNPROVIDED)) && (NIL == at_defns.defns_admitP(col2, arg, UNPROVIDED))) {
                                        if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                            note_at_violations(arg_not_isa_violations(reln, arg, argnum, col2));
                                            note_at_violations(wff.wff_violations());
                                        }
                                        result = T;
                                        doneP = at_utilities.at_finishedP(result);
                                    }
                                } finally {
                                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_1_$17, thread);
                                    wff_vars.$wff_violations$.rebind(_prev_bind_0_$17, thread);
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                col2 = csome_list_var2.first();
                            } 
                        }
                        if (NIL == doneP) {
                            SubLObject csome_list_var2 = other_arg_not_isas2;
                            SubLObject col2 = NIL;
                            col2 = csome_list_var2.first();
                            while ((NIL == doneP) && (NIL != csome_list_var2)) {
                                final SubLObject _prev_bind_0_$18 = wff_vars.$wff_violations$.currentBinding(thread);
                                try {
                                    wff_vars.$wff_violations$.bind(NIL, thread);
                                    if (NIL != at_defns.has_typeP(arg, col2, UNPROVIDED)) {
                                        if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                            note_at_violations(arg_not_isa_violations(reln, arg, argnum, col2));
                                            note_at_violations(wff.wff_violations());
                                        }
                                        result = T;
                                        doneP = at_utilities.at_finishedP(result);
                                    }
                                } finally {
                                    wff_vars.$wff_violations$.rebind(_prev_bind_0_$18, thread);
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                col2 = csome_list_var2.first();
                            } 
                        }
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_4, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$16, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$16, thread);
                }
            }
        } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_2, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject arg_not_isa_violations(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constraints = dictionary.dictionary_lookup($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), col, UNPROVIDED);
        SubLObject violations = NIL;
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint_details = NIL;
        constraint_details = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            violations = cons(arg_not_isa_violation(reln, arg, argnum, col, constraint_details), violations);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_details = cdolist_list_var.first();
        } 
        return violations;
    }

    public static SubLObject arg_not_isa_violation(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col, final SubLObject constraint_details) {
        final SubLObject module = $MAL_ARG_WRT_ARG_NOT_ISA;
        return arg_not_isa_violation_int(reln, arg, argnum, col, constraint_details, module);
    }

    public static SubLObject arg_not_isa_violation_int(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col, final SubLObject constraint_details, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        SubLObject data = NIL;
        SubLObject constraint_reln = NIL;
        SubLObject via = NIL;
        SubLObject constraint_gaf = NIL;
        destructuring_bind_must_consp(constraint_details, constraint_details, $list10);
        constraint_reln = constraint_details.first();
        SubLObject current = constraint_details.rest();
        destructuring_bind_must_consp(current, constraint_details, $list10);
        via = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, constraint_details, $list10);
        constraint_gaf = current.first();
        current = current.rest();
        if (NIL == current) {
            if (via != $SELF) {
                data = cons(list(via, constraint_reln), data);
            }
            if (NIL == wff_vars.wff_violation_data_terseP()) {
                if ((NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue(thread)) && (NIL != constraint_gaf)) {
                    data = cons(list($AT_CONSTRAINT_GAF, constraint_gaf), data);
                }
                data = append(data, wff_violation_verbose_data());
            }
            return listS(module, new SubLObject[]{ arg, reln, argnum, col, mt, append(data, NIL) });
        }
        cdestructuring_bind_error(constraint_details, $list10);
        return NIL;
    }

    public static SubLObject arg_not_isa_required_violation(final SubLObject reln, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return list($MAL_RELN_WRT_ARG_NOT_ISA_REQUIRED, reln, argnum, mt);
    }

    /**
     * are any arg-isa collections applicable to arg number
     * <argnum> of relation <reln> known to not include <arg>
     */
    @LispMethod(comment = "are any arg-isa collections applicable to arg number\r\n<argnum> of relation <reln> known to not include <arg>\nare any arg-isa collections applicable to arg number\n<argnum> of relation <reln> known to not include <arg>")
    public static final SubLObject mal_arg_not_isa_disjointP_alt(SubLObject reln, SubLObject arg, SubLObject argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == at_vars.$at_check_not_isa_disjointP$.getDynamicValue(thread)) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                SubLObject doneP = NIL;
                {
                    SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
                    try {
                        $at_applicable_arg_types$.bind(NIL, thread);
                        $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
                        if (reln == $$Quote) {
                            {
                                SubLObject _prev_bind_0_12 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                                try {
                                    cycl_grammar.$within_quote_form$.bind(T, thread);
                                    {
                                        SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                        {
                                            SubLObject _prev_bind_0_13 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                            SubLObject _prev_bind_1_14 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                com.cyc.cycjava.cycl.at_routines.applicable_arg_type_collections(reln, argnum, $ARG_ISA);
                                                if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                                    {
                                                        SubLObject isa_collections = com.cyc.cycjava.cycl.at_routines.arg_collections(arg, $ISA, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                                                        {
                                                            SubLObject _prev_bind_0_15 = sdc.$ignoring_sdcP$.currentBinding(thread);
                                                            try {
                                                                sdc.$ignoring_sdcP$.bind(makeBoolean(NIL == at_vars.$at_check_not_sdcP$.getDynamicValue(thread)), thread);
                                                                if (NIL == doneP) {
                                                                    {
                                                                        SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                                        SubLObject arg_isa = NIL;
                                                                        for (arg_isa = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg_isa = csome_list_var.first()) {
                                                                            {
                                                                                SubLObject _prev_bind_0_16 = wff_vars.$wff_violations$.currentBinding(thread);
                                                                                try {
                                                                                    wff_vars.$wff_violations$.bind(NIL, thread);
                                                                                    if (NIL == forts.fort_p(arg_isa)) {
                                                                                    } else {
                                                                                        if (NIL != disjoint_with.any_disjoint_withP(isa_collections, arg_isa, UNPROVIDED, UNPROVIDED)) {
                                                                                            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                                com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.arg_not_isa_disjoint_violations(reln, arg, argnum, arg_isa));
                                                                                            }
                                                                                            result = T;
                                                                                            doneP = at_utilities.at_finishedP(result);
                                                                                        } else {
                                                                                            if (($NAUT == at_vars.$at_arg_type$.getDynamicValue(thread)) && (NIL != cycl_utilities.formula_find_if(symbol_function($sym19$VARIABLE_TERM_WRT_ARG_TYPE_), arg, UNPROVIDED, UNPROVIDED))) {
                                                                                            } else {
                                                                                                if (NIL != at_defns.defns_rejectP(arg_isa, arg, UNPROVIDED)) {
                                                                                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                                        com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.arg_not_isa_disjoint_violations(reln, arg, argnum, arg_isa));
                                                                                                        com.cyc.cycjava.cycl.at_routines.note_at_violations(wff.wff_violations());
                                                                                                    }
                                                                                                    result = T;
                                                                                                    doneP = at_utilities.at_finishedP(result);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    wff_vars.$wff_violations$.rebind(_prev_bind_0_16, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                sdc.$ignoring_sdcP$.rebind(_prev_bind_0_15, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_14, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_13, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_12, thread);
                                }
                            }
                        } else {
                            {
                                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                {
                                    SubLObject _prev_bind_0_17 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                    SubLObject _prev_bind_1_18 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                        com.cyc.cycjava.cycl.at_routines.applicable_arg_type_collections(reln, argnum, $ARG_ISA);
                                        if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                            {
                                                SubLObject isa_collections = com.cyc.cycjava.cycl.at_routines.arg_collections(arg, $ISA, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                                                {
                                                    SubLObject _prev_bind_0_19 = sdc.$ignoring_sdcP$.currentBinding(thread);
                                                    try {
                                                        sdc.$ignoring_sdcP$.bind(makeBoolean(NIL == at_vars.$at_check_not_sdcP$.getDynamicValue(thread)), thread);
                                                        if (NIL == doneP) {
                                                            {
                                                                SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                                SubLObject arg_isa = NIL;
                                                                for (arg_isa = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg_isa = csome_list_var.first()) {
                                                                    {
                                                                        SubLObject _prev_bind_0_20 = wff_vars.$wff_violations$.currentBinding(thread);
                                                                        try {
                                                                            wff_vars.$wff_violations$.bind(NIL, thread);
                                                                            if (NIL == forts.fort_p(arg_isa)) {
                                                                            } else {
                                                                                if (NIL != disjoint_with.any_disjoint_withP(isa_collections, arg_isa, UNPROVIDED, UNPROVIDED)) {
                                                                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                        com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.arg_not_isa_disjoint_violations(reln, arg, argnum, arg_isa));
                                                                                    }
                                                                                    result = T;
                                                                                    doneP = at_utilities.at_finishedP(result);
                                                                                } else {
                                                                                    if (($NAUT == at_vars.$at_arg_type$.getDynamicValue(thread)) && (NIL != cycl_utilities.formula_find_if(symbol_function($sym19$VARIABLE_TERM_WRT_ARG_TYPE_), arg, UNPROVIDED, UNPROVIDED))) {
                                                                                    } else {
                                                                                        if (NIL != at_defns.defns_rejectP(arg_isa, arg, UNPROVIDED)) {
                                                                                            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                                com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.arg_not_isa_disjoint_violations(reln, arg, argnum, arg_isa));
                                                                                                com.cyc.cycjava.cycl.at_routines.note_at_violations(wff.wff_violations());
                                                                                            }
                                                                                            result = T;
                                                                                            doneP = at_utilities.at_finishedP(result);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            wff_vars.$wff_violations$.rebind(_prev_bind_0_20, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        sdc.$ignoring_sdcP$.rebind(_prev_bind_0_19, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_18, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_17, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
                        $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * are any arg-isa collections applicable to arg number
     * <argnum> of relation <reln> known to not include <arg>
     */
    @LispMethod(comment = "are any arg-isa collections applicable to arg number\r\n<argnum> of relation <reln> known to not include <arg>\nare any arg-isa collections applicable to arg number\n<argnum> of relation <reln> known to not include <arg>")
    public static SubLObject mal_arg_not_isa_disjointP(final SubLObject reln, final SubLObject arg, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == at_vars.$at_check_not_isa_disjointP$.getDynamicValue(thread)) {
            return NIL;
        }
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
        try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if (reln.eql($$Quote)) {
                final SubLObject _prev_bind_0_$23 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                    cycl_grammar.$within_quote_form$.bind(T, thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$24 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$25 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_arg_type_collections(reln, argnum, $ARG_ISA);
                        if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                            final SubLObject isa_collections = arg_collections(arg, $ISA, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                            final SubLObject _prev_bind_0_$25 = sdc.$ignoring_sdcP$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$26 = wff_vars.$wff_violations$.currentBinding(thread);
                            try {
                                sdc.$ignoring_sdcP$.bind(makeBoolean(NIL == at_vars.$at_check_not_sdcP$.getDynamicValue(thread)), thread);
                                wff_vars.$wff_violations$.bind(NIL, thread);
                                if (NIL != disjoint_with.any_disjoint_with_anyP_memoized(isa_collections, list_utilities.remove_if_not(FORT_P, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                    if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) && (NIL == doneP)) {
                                        SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                        SubLObject arg_isa = NIL;
                                        arg_isa = csome_list_var.first();
                                        while ((NIL == doneP) && (NIL != csome_list_var)) {
                                            if ((NIL != forts.fort_p(arg_isa)) && (NIL != disjoint_with.any_disjoint_withP(isa_collections, arg_isa, UNPROVIDED, UNPROVIDED))) {
                                                note_at_violations(arg_not_isa_disjoint_violations(reln, arg, argnum, arg_isa));
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            arg_isa = csome_list_var.first();
                                        } 
                                    }
                                    result = T;
                                    doneP = at_utilities.at_finishedP(result);
                                }
                                if (NIL == doneP) {
                                    SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                    SubLObject arg_isa = NIL;
                                    arg_isa = csome_list_var.first();
                                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                                        if ((($NAUT != at_vars.$at_arg_type$.getDynamicValue(thread)) || (NIL == cycl_utilities.formula_find_if(symbol_function($sym23$VARIABLE_TERM_WRT_ARG_TYPE_), arg, UNPROVIDED, UNPROVIDED))) && (NIL != at_defns.defns_rejectP(arg_isa, arg, UNPROVIDED))) {
                                            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                note_at_violations(arg_not_isa_disjoint_violations(reln, arg, argnum, arg_isa));
                                                note_at_violations(wff.wff_violations());
                                            }
                                            result = T;
                                            doneP = at_utilities.at_finishedP(result);
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        arg_isa = csome_list_var.first();
                                    } 
                                }
                            } finally {
                                wff_vars.$wff_violations$.rebind(_prev_bind_1_$26, thread);
                                sdc.$ignoring_sdcP$.rebind(_prev_bind_0_$25, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$25, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$24, thread);
                    }
                } finally {
                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_$23, thread);
                }
            } else {
                final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$26 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_1_$27 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p2, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p2), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_arg_type_collections(reln, argnum, $ARG_ISA);
                    if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                        final SubLObject isa_collections2 = arg_collections(arg, $ISA, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                        final SubLObject _prev_bind_0_$27 = sdc.$ignoring_sdcP$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$28 = wff_vars.$wff_violations$.currentBinding(thread);
                        try {
                            sdc.$ignoring_sdcP$.bind(makeBoolean(NIL == at_vars.$at_check_not_sdcP$.getDynamicValue(thread)), thread);
                            wff_vars.$wff_violations$.bind(NIL, thread);
                            if (NIL != disjoint_with.any_disjoint_with_anyP_memoized(isa_collections2, list_utilities.remove_if_not(FORT_P, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) && (NIL == doneP)) {
                                    SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue(thread);
                                    SubLObject arg_isa2 = NIL;
                                    arg_isa2 = csome_list_var2.first();
                                    while ((NIL == doneP) && (NIL != csome_list_var2)) {
                                        if ((NIL != forts.fort_p(arg_isa2)) && (NIL != disjoint_with.any_disjoint_withP(isa_collections2, arg_isa2, UNPROVIDED, UNPROVIDED))) {
                                            note_at_violations(arg_not_isa_disjoint_violations(reln, arg, argnum, arg_isa2));
                                        }
                                        csome_list_var2 = csome_list_var2.rest();
                                        arg_isa2 = csome_list_var2.first();
                                    } 
                                }
                                result = T;
                                doneP = at_utilities.at_finishedP(result);
                            }
                            if (NIL == doneP) {
                                SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue(thread);
                                SubLObject arg_isa2 = NIL;
                                arg_isa2 = csome_list_var2.first();
                                while ((NIL == doneP) && (NIL != csome_list_var2)) {
                                    if ((($NAUT != at_vars.$at_arg_type$.getDynamicValue(thread)) || (NIL == cycl_utilities.formula_find_if(symbol_function($sym23$VARIABLE_TERM_WRT_ARG_TYPE_), arg, UNPROVIDED, UNPROVIDED))) && (NIL != at_defns.defns_rejectP(arg_isa2, arg, UNPROVIDED))) {
                                        if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                            note_at_violations(arg_not_isa_disjoint_violations(reln, arg, argnum, arg_isa2));
                                            note_at_violations(wff.wff_violations());
                                        }
                                        result = T;
                                        doneP = at_utilities.at_finishedP(result);
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    arg_isa2 = csome_list_var2.first();
                                } 
                            }
                        } finally {
                            wff_vars.$wff_violations$.rebind(_prev_bind_1_$28, thread);
                            sdc.$ignoring_sdcP$.rebind(_prev_bind_0_$27, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_4, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$27, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$26, thread);
                }
            }
        } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_2, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject arg_not_isa_disjoint_violations_alt(SubLObject reln, SubLObject arg, SubLObject argnum, SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constraints = dictionary.dictionary_lookup($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), col, UNPROVIDED);
                SubLObject violations = NIL;
                SubLObject cdolist_list_var = constraints;
                SubLObject constraint_details = NIL;
                for (constraint_details = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_details = cdolist_list_var.first()) {
                    violations = cons(com.cyc.cycjava.cycl.at_routines.arg_not_isa_disjoint_violation_int($MAL_ARG_WRT_ARG_NOT_ISA_DISJOINT, reln, arg, argnum, col, constraint_details), violations);
                }
                return violations;
            }
        }
    }

    public static SubLObject arg_not_isa_disjoint_violations(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constraints = dictionary.dictionary_lookup($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), col, UNPROVIDED);
        SubLObject violations = NIL;
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint_details = NIL;
        constraint_details = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            violations = cons(arg_not_isa_disjoint_violation_int($MAL_ARG_WRT_ARG_NOT_ISA_DISJOINT, reln, arg, argnum, col, constraint_details), violations);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_details = cdolist_list_var.first();
        } 
        return violations;
    }

    public static final SubLObject arg_not_isa_disjoint_violation_int_alt(SubLObject module, SubLObject reln, SubLObject arg, SubLObject argnum, SubLObject col, SubLObject constraint_details) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                SubLObject data = NIL;
                SubLObject datum = constraint_details;
                SubLObject current = datum;
                SubLObject constraint_reln = NIL;
                SubLObject via = NIL;
                SubLObject constraint_gaf = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt10);
                constraint_reln = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt10);
                via = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt10);
                constraint_gaf = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (via != $SELF) {
                        data = cons(list(via, constraint_reln), data);
                    }
                    if (NIL == wff_vars.wff_violation_data_terseP()) {
                        if ((NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue(thread)) && (NIL != constraint_gaf)) {
                            data = cons(list($AT_CONSTRAINT_GAF, constraint_gaf), data);
                        }
                        data = append(data, com.cyc.cycjava.cycl.at_routines.wff_violation_verbose_data());
                    }
                    return listS(module, new SubLObject[]{ arg, reln, argnum, col, mt, append(data, NIL) });
                } else {
                    cdestructuring_bind_error(datum, $list_alt10);
                }
            }
            return NIL;
        }
    }

    public static SubLObject arg_not_isa_disjoint_violation_int(final SubLObject module, final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col, final SubLObject constraint_details) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        SubLObject data = NIL;
        SubLObject constraint_reln = NIL;
        SubLObject via = NIL;
        SubLObject constraint_gaf = NIL;
        destructuring_bind_must_consp(constraint_details, constraint_details, $list10);
        constraint_reln = constraint_details.first();
        SubLObject current = constraint_details.rest();
        destructuring_bind_must_consp(current, constraint_details, $list10);
        via = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, constraint_details, $list10);
        constraint_gaf = current.first();
        current = current.rest();
        if (NIL == current) {
            if (via != $SELF) {
                data = cons(list(via, constraint_reln), data);
            }
            if (NIL == wff_vars.wff_violation_data_terseP()) {
                if ((NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue(thread)) && (NIL != constraint_gaf)) {
                    data = cons(list($AT_CONSTRAINT_GAF, constraint_gaf), data);
                }
                data = append(data, wff_violation_verbose_data());
            }
            return listS(module, new SubLObject[]{ arg, reln, argnum, col, mt, append(data, NIL) });
        }
        cdestructuring_bind_error(constraint_details, $list10);
        return NIL;
    }

    /**
     * do the arg-quoted-isa collections applicable to arg number
     * <argnum> of relation <reln> include <arg>?
     */
    @LispMethod(comment = "do the arg-quoted-isa collections applicable to arg number\r\n<argnum> of relation <reln> include <arg>?\ndo the arg-quoted-isa collections applicable to arg number\n<argnum> of relation <reln> include <arg>?")
    public static final SubLObject mal_arg_quoted_isaP_alt(SubLObject reln, SubLObject arg, SubLObject argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == at_vars.$at_check_arg_quoted_isaP$.getDynamicValue(thread)) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                SubLObject doneP = NIL;
                {
                    SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
                    try {
                        $at_applicable_arg_types$.bind(NIL, thread);
                        $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
                        if (reln == $$Quote) {
                            {
                                SubLObject _prev_bind_0_21 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                                try {
                                    cycl_grammar.$within_quote_form$.bind(T, thread);
                                    {
                                        SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                        {
                                            SubLObject _prev_bind_0_22 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                            SubLObject _prev_bind_1_23 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                com.cyc.cycjava.cycl.at_routines.applicable_arg_type_collections(reln, argnum, $ARG_QUOTED_ISA);
                                                if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                                    if (NIL == doneP) {
                                                        {
                                                            SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                            SubLObject col = NIL;
                                                            for (col = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , col = csome_list_var.first()) {
                                                                {
                                                                    SubLObject _prev_bind_0_24 = wff_vars.$wff_violations$.currentBinding(thread);
                                                                    try {
                                                                        wff_vars.$wff_violations$.bind(NIL, thread);
                                                                        if (NIL == at_defns.quoted_has_typeP(arg, col, UNPROVIDED)) {
                                                                            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.arg_quoted_isa_violations(reln, arg, argnum, col));
                                                                                com.cyc.cycjava.cycl.at_routines.note_at_violations(wff.wff_violations());
                                                                            }
                                                                            result = T;
                                                                            doneP = at_utilities.at_finishedP(result);
                                                                        }
                                                                    } finally {
                                                                        wff_vars.$wff_violations$.rebind(_prev_bind_0_24, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_23, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_22, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_21, thread);
                                }
                            }
                        } else {
                            {
                                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                {
                                    SubLObject _prev_bind_0_25 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                    SubLObject _prev_bind_1_26 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                        com.cyc.cycjava.cycl.at_routines.applicable_arg_type_collections(reln, argnum, $ARG_QUOTED_ISA);
                                        if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                            if (NIL == doneP) {
                                                {
                                                    SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                    SubLObject col = NIL;
                                                    for (col = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , col = csome_list_var.first()) {
                                                        {
                                                            SubLObject _prev_bind_0_27 = wff_vars.$wff_violations$.currentBinding(thread);
                                                            try {
                                                                wff_vars.$wff_violations$.bind(NIL, thread);
                                                                if (NIL == at_defns.quoted_has_typeP(arg, col, UNPROVIDED)) {
                                                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                        com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.arg_quoted_isa_violations(reln, arg, argnum, col));
                                                                        com.cyc.cycjava.cycl.at_routines.note_at_violations(wff.wff_violations());
                                                                    }
                                                                    result = T;
                                                                    doneP = at_utilities.at_finishedP(result);
                                                                }
                                                            } finally {
                                                                wff_vars.$wff_violations$.rebind(_prev_bind_0_27, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_26, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_25, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
                        $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * do the arg-quoted-isa collections applicable to arg number
     * <argnum> of relation <reln> include <arg>?
     */
    @LispMethod(comment = "do the arg-quoted-isa collections applicable to arg number\r\n<argnum> of relation <reln> include <arg>?\ndo the arg-quoted-isa collections applicable to arg number\n<argnum> of relation <reln> include <arg>?")
    public static SubLObject mal_arg_quoted_isaP(final SubLObject reln, final SubLObject arg, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == at_vars.$at_check_arg_quoted_isaP$.getDynamicValue(thread)) {
            return NIL;
        }
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
        try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if (reln.eql($$Quote)) {
                final SubLObject _prev_bind_0_$32 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                    cycl_grammar.$within_quote_form$.bind(T, thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$33 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$34 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_arg_type_collections(reln, argnum, $ARG_QUOTED_ISA);
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                            SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                            SubLObject col = NIL;
                            col = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                final SubLObject _prev_bind_0_$34 = wff_vars.$wff_violations$.currentBinding(thread);
                                try {
                                    wff_vars.$wff_violations$.bind(NIL, thread);
                                    if (NIL == at_defns.quoted_has_typeP(arg, col, UNPROVIDED)) {
                                        if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                            note_at_violations(arg_quoted_isa_violations(reln, arg, argnum, col));
                                            note_at_violations(wff.wff_violations());
                                        }
                                        result = T;
                                        doneP = at_utilities.at_finishedP(result);
                                    }
                                } finally {
                                    wff_vars.$wff_violations$.rebind(_prev_bind_0_$34, thread);
                                }
                                csome_list_var = csome_list_var.rest();
                                col = csome_list_var.first();
                            } 
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$34, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$33, thread);
                    }
                } finally {
                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_$32, thread);
                }
            } else {
                final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$35 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_1_$35 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p2, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p2), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_arg_type_collections(reln, argnum, $ARG_QUOTED_ISA);
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                        SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue(thread);
                        SubLObject col2 = NIL;
                        col2 = csome_list_var2.first();
                        while ((NIL == doneP) && (NIL != csome_list_var2)) {
                            final SubLObject _prev_bind_0_$36 = wff_vars.$wff_violations$.currentBinding(thread);
                            try {
                                wff_vars.$wff_violations$.bind(NIL, thread);
                                if (NIL == at_defns.quoted_has_typeP(arg, col2, UNPROVIDED)) {
                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                        note_at_violations(arg_quoted_isa_violations(reln, arg, argnum, col2));
                                        note_at_violations(wff.wff_violations());
                                    }
                                    result = T;
                                    doneP = at_utilities.at_finishedP(result);
                                }
                            } finally {
                                wff_vars.$wff_violations$.rebind(_prev_bind_0_$36, thread);
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            col2 = csome_list_var2.first();
                        } 
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_4, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$35, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$35, thread);
                }
            }
        } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_2, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject arg_quoted_isa_violations_alt(SubLObject reln, SubLObject arg, SubLObject argnum, SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constraints = dictionary.dictionary_lookup($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), col, UNPROVIDED);
                SubLObject violations = NIL;
                SubLObject cdolist_list_var = constraints;
                SubLObject constraint_details = NIL;
                for (constraint_details = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_details = cdolist_list_var.first()) {
                    violations = cons(com.cyc.cycjava.cycl.at_routines.arg_quoted_isa_violation(reln, arg, argnum, col, constraint_details), violations);
                }
                return violations;
            }
        }
    }

    public static SubLObject arg_quoted_isa_violations(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constraints = dictionary.dictionary_lookup($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), col, UNPROVIDED);
        SubLObject violations = NIL;
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint_details = NIL;
        constraint_details = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            violations = cons(arg_quoted_isa_violation(reln, arg, argnum, col, constraint_details), violations);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_details = cdolist_list_var.first();
        } 
        return violations;
    }

    public static final SubLObject arg_quoted_isa_violation_alt(SubLObject reln, SubLObject arg, SubLObject argnum, SubLObject col, SubLObject constraint_details) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                SubLObject module = (NIL != kb_accessors.admitting_quoted_defnsP(col, mt)) ? ((SubLObject) ($MAL_ARG_WRT_COL_QUOTED_DEFN)) : $MAL_ARG_WRT_ARG_QUOTED_ISA;
                return com.cyc.cycjava.cycl.at_routines.arg_isa_violation_int(reln, arg, argnum, col, constraint_details, module);
            }
        }
    }

    public static SubLObject arg_quoted_isa_violation(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col, final SubLObject constraint_details) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        final SubLObject module = (NIL != kb_accessors.admitting_quoted_defnsP(col, mt)) ? $MAL_ARG_WRT_COL_QUOTED_DEFN : $MAL_ARG_WRT_ARG_QUOTED_ISA;
        return arg_isa_violation_int(reln, arg, argnum, col, constraint_details, module);
    }

    public static final SubLObject mal_arg_not_quoted_isa_disjointP_alt(SubLObject reln, SubLObject arg, SubLObject argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == at_vars.$at_check_not_quoted_isa_disjointP$.getDynamicValue(thread)) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                SubLObject doneP = NIL;
                {
                    SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
                    try {
                        $at_applicable_arg_types$.bind(NIL, thread);
                        $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
                        if (reln == $$Quote) {
                            {
                                SubLObject _prev_bind_0_28 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                                try {
                                    cycl_grammar.$within_quote_form$.bind(T, thread);
                                    {
                                        SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                        {
                                            SubLObject _prev_bind_0_29 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                            SubLObject _prev_bind_1_30 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                com.cyc.cycjava.cycl.at_routines.applicable_arg_type_collections(reln, argnum, $ARG_QUOTED_ISA);
                                                if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                                    {
                                                        SubLObject quoted_isa_collections = com.cyc.cycjava.cycl.at_routines.arg_collections(arg, $QUOTED_ISA, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                                                        {
                                                            SubLObject _prev_bind_0_31 = sdc.$ignoring_sdcP$.currentBinding(thread);
                                                            try {
                                                                sdc.$ignoring_sdcP$.bind(makeBoolean(NIL == at_vars.$at_check_not_sdcP$.getDynamicValue(thread)), thread);
                                                                if (NIL == doneP) {
                                                                    {
                                                                        SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                                        SubLObject arg_quoted_isa = NIL;
                                                                        for (arg_quoted_isa = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg_quoted_isa = csome_list_var.first()) {
                                                                            {
                                                                                SubLObject _prev_bind_0_32 = wff_vars.$wff_violations$.currentBinding(thread);
                                                                                try {
                                                                                    wff_vars.$wff_violations$.bind(NIL, thread);
                                                                                    if (NIL == forts.fort_p(arg_quoted_isa)) {
                                                                                    } else {
                                                                                        if ((((reln == $$termOfUnit) && (argnum == TWO_INTEGER)) && (arg_quoted_isa == $$CycLReifiableNonAtomicTerm)) && (NIL != at_defns.quiet_quoted_defns_admitP(arg_quoted_isa, arg, UNPROVIDED))) {
                                                                                        } else {
                                                                                            if (NIL != disjoint_with.any_disjoint_withP(quoted_isa_collections, arg_quoted_isa, UNPROVIDED, UNPROVIDED)) {
                                                                                                if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                                    com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.arg_not_quoted_isa_disjoint_violations(reln, arg, argnum, arg_quoted_isa));
                                                                                                }
                                                                                                result = T;
                                                                                                doneP = at_utilities.at_finishedP(result);
                                                                                            } else {
                                                                                                if (($NAUT == at_vars.$at_arg_type$.getDynamicValue(thread)) && (NIL != cycl_utilities.formula_find_if(symbol_function($sym19$VARIABLE_TERM_WRT_ARG_TYPE_), arg, UNPROVIDED, UNPROVIDED))) {
                                                                                                } else {
                                                                                                    if (NIL != at_defns.quoted_defns_rejectP(arg_quoted_isa, arg, UNPROVIDED)) {
                                                                                                        if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                                            com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.arg_not_quoted_isa_disjoint_violations(reln, arg, argnum, arg_quoted_isa));
                                                                                                            com.cyc.cycjava.cycl.at_routines.note_at_violations(wff.wff_violations());
                                                                                                        }
                                                                                                        result = T;
                                                                                                        doneP = at_utilities.at_finishedP(result);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    wff_vars.$wff_violations$.rebind(_prev_bind_0_32, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                sdc.$ignoring_sdcP$.rebind(_prev_bind_0_31, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_30, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_29, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_28, thread);
                                }
                            }
                        } else {
                            {
                                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                {
                                    SubLObject _prev_bind_0_33 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                    SubLObject _prev_bind_1_34 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                        com.cyc.cycjava.cycl.at_routines.applicable_arg_type_collections(reln, argnum, $ARG_QUOTED_ISA);
                                        if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                            {
                                                SubLObject quoted_isa_collections = com.cyc.cycjava.cycl.at_routines.arg_collections(arg, $QUOTED_ISA, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                                                {
                                                    SubLObject _prev_bind_0_35 = sdc.$ignoring_sdcP$.currentBinding(thread);
                                                    try {
                                                        sdc.$ignoring_sdcP$.bind(makeBoolean(NIL == at_vars.$at_check_not_sdcP$.getDynamicValue(thread)), thread);
                                                        if (NIL == doneP) {
                                                            {
                                                                SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                                SubLObject arg_quoted_isa = NIL;
                                                                for (arg_quoted_isa = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg_quoted_isa = csome_list_var.first()) {
                                                                    {
                                                                        SubLObject _prev_bind_0_36 = wff_vars.$wff_violations$.currentBinding(thread);
                                                                        try {
                                                                            wff_vars.$wff_violations$.bind(NIL, thread);
                                                                            if (NIL == forts.fort_p(arg_quoted_isa)) {
                                                                            } else {
                                                                                if ((((reln == $$termOfUnit) && (argnum == TWO_INTEGER)) && (arg_quoted_isa == $$CycLReifiableNonAtomicTerm)) && (NIL != at_defns.quiet_quoted_defns_admitP(arg_quoted_isa, arg, UNPROVIDED))) {
                                                                                } else {
                                                                                    if (NIL != disjoint_with.any_disjoint_withP(quoted_isa_collections, arg_quoted_isa, UNPROVIDED, UNPROVIDED)) {
                                                                                        if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                            com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.arg_not_quoted_isa_disjoint_violations(reln, arg, argnum, arg_quoted_isa));
                                                                                        }
                                                                                        result = T;
                                                                                        doneP = at_utilities.at_finishedP(result);
                                                                                    } else {
                                                                                        if (($NAUT == at_vars.$at_arg_type$.getDynamicValue(thread)) && (NIL != cycl_utilities.formula_find_if(symbol_function($sym19$VARIABLE_TERM_WRT_ARG_TYPE_), arg, UNPROVIDED, UNPROVIDED))) {
                                                                                        } else {
                                                                                            if (NIL != at_defns.quoted_defns_rejectP(arg_quoted_isa, arg, UNPROVIDED)) {
                                                                                                if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                                    com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.arg_not_quoted_isa_disjoint_violations(reln, arg, argnum, arg_quoted_isa));
                                                                                                    com.cyc.cycjava.cycl.at_routines.note_at_violations(wff.wff_violations());
                                                                                                }
                                                                                                result = T;
                                                                                                doneP = at_utilities.at_finishedP(result);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            wff_vars.$wff_violations$.rebind(_prev_bind_0_36, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        sdc.$ignoring_sdcP$.rebind(_prev_bind_0_35, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_34, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_33, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
                        $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject mal_arg_not_quoted_isa_disjointP(final SubLObject reln, final SubLObject arg, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == at_vars.$at_check_not_quoted_isa_disjointP$.getDynamicValue(thread)) {
            return NIL;
        }
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
        try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if (reln.eql($$Quote)) {
                final SubLObject _prev_bind_0_$39 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                    cycl_grammar.$within_quote_form$.bind(T, thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$40 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$41 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_arg_type_collections(reln, argnum, $ARG_QUOTED_ISA);
                        if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                            final SubLObject quoted_isa_collections = arg_collections(arg, $QUOTED_ISA, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                            final SubLObject _prev_bind_0_$41 = sdc.$ignoring_sdcP$.currentBinding(thread);
                            try {
                                sdc.$ignoring_sdcP$.bind(makeBoolean(NIL == at_vars.$at_check_not_sdcP$.getDynamicValue(thread)), thread);
                                if (NIL == doneP) {
                                    SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                    SubLObject arg_quoted_isa = NIL;
                                    arg_quoted_isa = csome_list_var.first();
                                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                                        final SubLObject _prev_bind_0_$42 = wff_vars.$wff_violations$.currentBinding(thread);
                                        try {
                                            wff_vars.$wff_violations$.bind(NIL, thread);
                                            if (NIL != forts.fort_p(arg_quoted_isa)) {
                                                if ((((!reln.eql($$termOfUnit)) || (!argnum.eql(TWO_INTEGER))) || (!arg_quoted_isa.eql($$CycLReifiableNonAtomicTerm))) || (NIL == at_defns.quiet_quoted_defns_admitP(arg_quoted_isa, arg, UNPROVIDED))) {
                                                    if (NIL != disjoint_with.any_disjoint_withP(quoted_isa_collections, arg_quoted_isa, UNPROVIDED, UNPROVIDED)) {
                                                        if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                            note_at_violations(arg_not_quoted_isa_disjoint_violations(reln, arg, argnum, arg_quoted_isa));
                                                        }
                                                        result = T;
                                                        doneP = at_utilities.at_finishedP(result);
                                                    } else
                                                        if (($NAUT != at_vars.$at_arg_type$.getDynamicValue(thread)) || (NIL == cycl_utilities.formula_find_if(symbol_function($sym23$VARIABLE_TERM_WRT_ARG_TYPE_), arg, UNPROVIDED, UNPROVIDED))) {
                                                            if (NIL != at_defns.quoted_defns_rejectP(arg_quoted_isa, arg, UNPROVIDED)) {
                                                                if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                    note_at_violations(arg_not_quoted_isa_disjoint_violations(reln, arg, argnum, arg_quoted_isa));
                                                                    note_at_violations(wff.wff_violations());
                                                                }
                                                                result = T;
                                                                doneP = at_utilities.at_finishedP(result);
                                                            }
                                                        }

                                                }
                                            }
                                        } finally {
                                            wff_vars.$wff_violations$.rebind(_prev_bind_0_$42, thread);
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        arg_quoted_isa = csome_list_var.first();
                                    } 
                                }
                            } finally {
                                sdc.$ignoring_sdcP$.rebind(_prev_bind_0_$41, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$41, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$40, thread);
                    }
                } finally {
                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_$39, thread);
                }
            } else {
                final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$43 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_1_$42 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p2, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p2), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_arg_type_collections(reln, argnum, $ARG_QUOTED_ISA);
                    if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                        final SubLObject quoted_isa_collections2 = arg_collections(arg, $QUOTED_ISA, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                        final SubLObject _prev_bind_0_$44 = sdc.$ignoring_sdcP$.currentBinding(thread);
                        try {
                            sdc.$ignoring_sdcP$.bind(makeBoolean(NIL == at_vars.$at_check_not_sdcP$.getDynamicValue(thread)), thread);
                            if (NIL == doneP) {
                                SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue(thread);
                                SubLObject arg_quoted_isa2 = NIL;
                                arg_quoted_isa2 = csome_list_var2.first();
                                while ((NIL == doneP) && (NIL != csome_list_var2)) {
                                    final SubLObject _prev_bind_0_$45 = wff_vars.$wff_violations$.currentBinding(thread);
                                    try {
                                        wff_vars.$wff_violations$.bind(NIL, thread);
                                        if (NIL != forts.fort_p(arg_quoted_isa2)) {
                                            if ((((!reln.eql($$termOfUnit)) || (!argnum.eql(TWO_INTEGER))) || (!arg_quoted_isa2.eql($$CycLReifiableNonAtomicTerm))) || (NIL == at_defns.quiet_quoted_defns_admitP(arg_quoted_isa2, arg, UNPROVIDED))) {
                                                if (NIL != disjoint_with.any_disjoint_withP(quoted_isa_collections2, arg_quoted_isa2, UNPROVIDED, UNPROVIDED)) {
                                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                        note_at_violations(arg_not_quoted_isa_disjoint_violations(reln, arg, argnum, arg_quoted_isa2));
                                                    }
                                                    result = T;
                                                    doneP = at_utilities.at_finishedP(result);
                                                } else
                                                    if (($NAUT != at_vars.$at_arg_type$.getDynamicValue(thread)) || (NIL == cycl_utilities.formula_find_if(symbol_function($sym23$VARIABLE_TERM_WRT_ARG_TYPE_), arg, UNPROVIDED, UNPROVIDED))) {
                                                        if (NIL != at_defns.quoted_defns_rejectP(arg_quoted_isa2, arg, UNPROVIDED)) {
                                                            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                note_at_violations(arg_not_quoted_isa_disjoint_violations(reln, arg, argnum, arg_quoted_isa2));
                                                                note_at_violations(wff.wff_violations());
                                                            }
                                                            result = T;
                                                            doneP = at_utilities.at_finishedP(result);
                                                        }
                                                    }

                                            }
                                        }
                                    } finally {
                                        wff_vars.$wff_violations$.rebind(_prev_bind_0_$45, thread);
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    arg_quoted_isa2 = csome_list_var2.first();
                                } 
                            }
                        } finally {
                            sdc.$ignoring_sdcP$.rebind(_prev_bind_0_$44, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_4, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$42, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$43, thread);
                }
            }
        } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_2, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject arg_not_quoted_isa_disjoint_violations_alt(SubLObject reln, SubLObject arg, SubLObject argnum, SubLObject arg_quoted_isa) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constraints = dictionary.dictionary_lookup($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), arg_quoted_isa, UNPROVIDED);
                SubLObject violations = NIL;
                SubLObject cdolist_list_var = constraints;
                SubLObject constraint_details = NIL;
                for (constraint_details = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_details = cdolist_list_var.first()) {
                    violations = cons(com.cyc.cycjava.cycl.at_routines.arg_not_isa_disjoint_violation_int($MAL_ARG_WRT_ARG_NOT_QUOTED_ISA_DISJOINT, reln, arg, argnum, arg_quoted_isa, constraint_details), violations);
                }
                return violations;
            }
        }
    }

    public static SubLObject arg_not_quoted_isa_disjoint_violations(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject arg_quoted_isa) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constraints = dictionary.dictionary_lookup($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), arg_quoted_isa, UNPROVIDED);
        SubLObject violations = NIL;
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint_details = NIL;
        constraint_details = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            violations = cons(arg_not_isa_disjoint_violation_int($MAL_ARG_WRT_ARG_NOT_QUOTED_ISA_DISJOINT, reln, arg, argnum, arg_quoted_isa, constraint_details), violations);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_details = cdolist_list_var.first();
        } 
        return violations;
    }

    /**
     * do the arg-genl collections applicable to arg
     * number <argnum> of relation <reln> include <arg>?
     */
    @LispMethod(comment = "do the arg-genl collections applicable to arg\r\nnumber <argnum> of relation <reln> include <arg>?\ndo the arg-genl collections applicable to arg\nnumber <argnum> of relation <reln> include <arg>?")
    public static final SubLObject mal_arg_genlsP_alt(SubLObject reln, SubLObject arg, SubLObject argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject doneP = NIL;
                {
                    SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
                    try {
                        $at_applicable_arg_types$.bind(NIL, thread);
                        $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
                        if (reln == $$Quote) {
                            {
                                SubLObject _prev_bind_0_37 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                                try {
                                    cycl_grammar.$within_quote_form$.bind(T, thread);
                                    {
                                        SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                        {
                                            SubLObject _prev_bind_0_38 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                            SubLObject _prev_bind_1_39 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                com.cyc.cycjava.cycl.at_routines.applicable_arg_type_collections(reln, argnum, $ARG_GENLS);
                                                if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                                    if (NIL != fort_types_interface.collection_p(arg)) {
                                                        $at_applicable_arg_types$.setDynamicValue(remove($$Thing, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                                                    }
                                                    if (NIL == doneP) {
                                                        {
                                                            SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                            SubLObject col = NIL;
                                                            for (col = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , col = csome_list_var.first()) {
                                                                if ((NIL != forts.fort_p(col)) && (NIL != at_defns.at_denotational_term_p(arg, UNPROVIDED))) {
                                                                    if (NIL == genls.genlP(arg, col, UNPROVIDED, UNPROVIDED)) {
                                                                        if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                            com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.arg_genl_violations(reln, arg, argnum, col));
                                                                        }
                                                                        result = T;
                                                                        doneP = at_utilities.at_finishedP(result);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    result = NIL;
                                                }
                                            } finally {
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_39, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_38, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_37, thread);
                                }
                            }
                        } else {
                            {
                                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                {
                                    SubLObject _prev_bind_0_40 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                    SubLObject _prev_bind_1_41 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                        com.cyc.cycjava.cycl.at_routines.applicable_arg_type_collections(reln, argnum, $ARG_GENLS);
                                        if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                            if (NIL != fort_types_interface.collection_p(arg)) {
                                                $at_applicable_arg_types$.setDynamicValue(remove($$Thing, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                                            }
                                            if (NIL == doneP) {
                                                {
                                                    SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                    SubLObject col = NIL;
                                                    for (col = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , col = csome_list_var.first()) {
                                                        if ((NIL != forts.fort_p(col)) && (NIL != at_defns.at_denotational_term_p(arg, UNPROVIDED))) {
                                                            if (NIL == genls.genlP(arg, col, UNPROVIDED, UNPROVIDED)) {
                                                                if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                    com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.arg_genl_violations(reln, arg, argnum, col));
                                                                }
                                                                result = T;
                                                                doneP = at_utilities.at_finishedP(result);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            result = NIL;
                                        }
                                    } finally {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_41, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_40, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
                        $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * do the arg-genl collections applicable to arg
     * number <argnum> of relation <reln> include <arg>?
     */
    @LispMethod(comment = "do the arg-genl collections applicable to arg\r\nnumber <argnum> of relation <reln> include <arg>?\ndo the arg-genl collections applicable to arg\nnumber <argnum> of relation <reln> include <arg>?")
    public static SubLObject mal_arg_genlsP(final SubLObject reln, final SubLObject arg, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
        try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if (reln.eql($$Quote)) {
                final SubLObject _prev_bind_0_$48 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                    cycl_grammar.$within_quote_form$.bind(T, thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$49 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$50 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_arg_type_collections(reln, argnum, $ARG_GENLS);
                        if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                            if (NIL != fort_types_interface.collection_p(arg)) {
                                $at_applicable_arg_types$.setDynamicValue(remove($$Thing, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                            }
                            if (NIL == doneP) {
                                SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                SubLObject col = NIL;
                                col = csome_list_var.first();
                                while ((NIL == doneP) && (NIL != csome_list_var)) {
                                    if (((NIL != forts.fort_p(col)) && (NIL != at_defns.at_denotational_term_p(arg, UNPROVIDED))) && (NIL == genls.genlP(arg, col, UNPROVIDED, UNPROVIDED))) {
                                        if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                            note_at_violations(arg_genl_violations(reln, arg, argnum, col));
                                        }
                                        result = T;
                                        doneP = at_utilities.at_finishedP(result);
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    col = csome_list_var.first();
                                } 
                            }
                        } else {
                            result = NIL;
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$50, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$49, thread);
                    }
                } finally {
                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_$48, thread);
                }
            } else {
                final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$50 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_1_$51 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p2, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p2), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_arg_type_collections(reln, argnum, $ARG_GENLS);
                    if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                        if (NIL != fort_types_interface.collection_p(arg)) {
                            $at_applicable_arg_types$.setDynamicValue(remove($$Thing, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        }
                        if (NIL == doneP) {
                            SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue(thread);
                            SubLObject col2 = NIL;
                            col2 = csome_list_var2.first();
                            while ((NIL == doneP) && (NIL != csome_list_var2)) {
                                if (((NIL != forts.fort_p(col2)) && (NIL != at_defns.at_denotational_term_p(arg, UNPROVIDED))) && (NIL == genls.genlP(arg, col2, UNPROVIDED, UNPROVIDED))) {
                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                        note_at_violations(arg_genl_violations(reln, arg, argnum, col2));
                                    }
                                    result = T;
                                    doneP = at_utilities.at_finishedP(result);
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                col2 = csome_list_var2.first();
                            } 
                        }
                    } else {
                        result = NIL;
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_4, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$51, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$50, thread);
                }
            }
        } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_2, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject arg_genl_violations_alt(SubLObject reln, SubLObject arg, SubLObject argnum, SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constraints = dictionary.dictionary_lookup($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), col, UNPROVIDED);
                SubLObject violations = NIL;
                SubLObject cdolist_list_var = constraints;
                SubLObject constraint_details = NIL;
                for (constraint_details = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_details = cdolist_list_var.first()) {
                    violations = cons(com.cyc.cycjava.cycl.at_routines.arg_genl_violation(reln, arg, argnum, col, constraint_details), violations);
                }
                return violations;
            }
        }
    }

    public static SubLObject arg_genl_violations(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constraints = dictionary.dictionary_lookup($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), col, UNPROVIDED);
        SubLObject violations = NIL;
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint_details = NIL;
        constraint_details = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            violations = cons(arg_genl_violation(reln, arg, argnum, col, constraint_details), violations);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_details = cdolist_list_var.first();
        } 
        return violations;
    }

    public static final SubLObject arg_genl_violation_alt(SubLObject reln, SubLObject arg, SubLObject argnum, SubLObject col, SubLObject constraint_details) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                SubLObject module = $MAL_ARG_WRT_ARG_GENL;
                SubLObject data = NIL;
                SubLObject datum = constraint_details;
                SubLObject current = datum;
                SubLObject constraint_reln = NIL;
                SubLObject via = NIL;
                SubLObject constraint_gaf = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt10);
                constraint_reln = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt10);
                via = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt10);
                constraint_gaf = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (via != $SELF) {
                        data = cons(list(via, constraint_reln), data);
                    }
                    if (NIL == wff_vars.wff_violation_data_terseP()) {
                        if ((NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue(thread)) && (NIL != constraint_gaf)) {
                            data = cons(list($AT_CONSTRAINT_GAF, constraint_gaf), data);
                        }
                        data = append(data, com.cyc.cycjava.cycl.at_routines.wff_violation_verbose_data());
                    }
                    return listS(module, new SubLObject[]{ arg, reln, argnum, col, mt, append(data, NIL) });
                } else {
                    cdestructuring_bind_error(datum, $list_alt10);
                }
            }
            return NIL;
        }
    }

    public static SubLObject arg_genl_violation(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col, final SubLObject constraint_details) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        final SubLObject module = $MAL_ARG_WRT_ARG_GENL;
        SubLObject data = NIL;
        SubLObject constraint_reln = NIL;
        SubLObject via = NIL;
        SubLObject constraint_gaf = NIL;
        destructuring_bind_must_consp(constraint_details, constraint_details, $list10);
        constraint_reln = constraint_details.first();
        SubLObject current = constraint_details.rest();
        destructuring_bind_must_consp(current, constraint_details, $list10);
        via = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, constraint_details, $list10);
        constraint_gaf = current.first();
        current = current.rest();
        if (NIL == current) {
            if (via != $SELF) {
                data = cons(list(via, constraint_reln), data);
            }
            if (NIL == wff_vars.wff_violation_data_terseP()) {
                if ((NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue(thread)) && (NIL != constraint_gaf)) {
                    data = cons(list($AT_CONSTRAINT_GAF, constraint_gaf), data);
                }
                data = append(data, wff_violation_verbose_data());
            }
            return listS(module, new SubLObject[]{ arg, reln, argnum, col, mt, append(data, NIL) });
        }
        cdestructuring_bind_error(constraint_details, $list10);
        return NIL;
    }

    /**
     * are any arg-isa collections applicable to arg number
     * <argnum> of relation <reln> known to not include <arg>?
     */
    @LispMethod(comment = "are any arg-isa collections applicable to arg number\r\n<argnum> of relation <reln> known to not include <arg>?\nare any arg-isa collections applicable to arg number\n<argnum> of relation <reln> known to not include <arg>?")
    public static final SubLObject mal_arg_not_genls_disjointP_alt(SubLObject reln, SubLObject arg, SubLObject argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == at_vars.$at_check_not_genls_disjointP$.getDynamicValue(thread)) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                SubLObject doneP = NIL;
                {
                    SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
                    try {
                        $at_applicable_arg_types$.bind(NIL, thread);
                        $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
                        if (reln == $$Quote) {
                            {
                                SubLObject _prev_bind_0_42 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                                try {
                                    cycl_grammar.$within_quote_form$.bind(T, thread);
                                    {
                                        SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                        {
                                            SubLObject _prev_bind_0_43 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                            SubLObject _prev_bind_1_44 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                com.cyc.cycjava.cycl.at_routines.applicable_arg_type_collections(reln, argnum, $ARG_GENLS);
                                                if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                                    {
                                                        SubLObject genl_collections = com.cyc.cycjava.cycl.at_routines.arg_collections(arg, $GENLS, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                                                        {
                                                            SubLObject _prev_bind_0_45 = sdc.$ignoring_sdcP$.currentBinding(thread);
                                                            try {
                                                                sdc.$ignoring_sdcP$.bind(makeBoolean(NIL == at_vars.$at_check_not_sdcP$.getDynamicValue(thread)), thread);
                                                                if (NIL == doneP) {
                                                                    {
                                                                        SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                                        SubLObject arg_genl = NIL;
                                                                        for (arg_genl = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg_genl = csome_list_var.first()) {
                                                                            if (NIL != forts.fort_p(arg_genl)) {
                                                                                if (NIL != disjoint_with.any_disjoint_withP(genl_collections, arg_genl, UNPROVIDED, UNPROVIDED)) {
                                                                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                        com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.arg_not_genl_disjoint_violations(reln, arg, argnum, arg_genl));
                                                                                    }
                                                                                    result = T;
                                                                                    doneP = at_utilities.at_finishedP(result);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                sdc.$ignoring_sdcP$.rebind(_prev_bind_0_45, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_44, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_43, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_42, thread);
                                }
                            }
                        } else {
                            {
                                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                {
                                    SubLObject _prev_bind_0_46 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                    SubLObject _prev_bind_1_47 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                        com.cyc.cycjava.cycl.at_routines.applicable_arg_type_collections(reln, argnum, $ARG_GENLS);
                                        if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                            {
                                                SubLObject genl_collections = com.cyc.cycjava.cycl.at_routines.arg_collections(arg, $GENLS, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                                                {
                                                    SubLObject _prev_bind_0_48 = sdc.$ignoring_sdcP$.currentBinding(thread);
                                                    try {
                                                        sdc.$ignoring_sdcP$.bind(makeBoolean(NIL == at_vars.$at_check_not_sdcP$.getDynamicValue(thread)), thread);
                                                        if (NIL == doneP) {
                                                            {
                                                                SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                                SubLObject arg_genl = NIL;
                                                                for (arg_genl = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg_genl = csome_list_var.first()) {
                                                                    if (NIL != forts.fort_p(arg_genl)) {
                                                                        if (NIL != disjoint_with.any_disjoint_withP(genl_collections, arg_genl, UNPROVIDED, UNPROVIDED)) {
                                                                            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.arg_not_genl_disjoint_violations(reln, arg, argnum, arg_genl));
                                                                            }
                                                                            result = T;
                                                                            doneP = at_utilities.at_finishedP(result);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        sdc.$ignoring_sdcP$.rebind(_prev_bind_0_48, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_47, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_46, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
                        $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * are any arg-isa collections applicable to arg number
     * <argnum> of relation <reln> known to not include <arg>?
     */
    @LispMethod(comment = "are any arg-isa collections applicable to arg number\r\n<argnum> of relation <reln> known to not include <arg>?\nare any arg-isa collections applicable to arg number\n<argnum> of relation <reln> known to not include <arg>?")
    public static SubLObject mal_arg_not_genls_disjointP(final SubLObject reln, final SubLObject arg, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == at_vars.$at_check_not_genls_disjointP$.getDynamicValue(thread)) {
            return NIL;
        }
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
        try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if (reln.eql($$Quote)) {
                final SubLObject _prev_bind_0_$53 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                    cycl_grammar.$within_quote_form$.bind(T, thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$54 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$55 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_arg_type_collections(reln, argnum, $ARG_GENLS);
                        if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                            final SubLObject genl_collections = arg_collections(arg, $GENLS, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                            final SubLObject _prev_bind_0_$55 = sdc.$ignoring_sdcP$.currentBinding(thread);
                            try {
                                sdc.$ignoring_sdcP$.bind(makeBoolean(NIL == at_vars.$at_check_not_sdcP$.getDynamicValue(thread)), thread);
                                if (NIL != disjoint_with.any_disjoint_with_anyP_memoized(genl_collections, list_utilities.remove_if_not(FORT_P, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                    if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) && (NIL == doneP)) {
                                        SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                        SubLObject arg_genl = NIL;
                                        arg_genl = csome_list_var.first();
                                        while ((NIL == doneP) && (NIL != csome_list_var)) {
                                            if ((NIL != forts.fort_p(arg_genl)) && (NIL != disjoint_with.any_disjoint_withP(genl_collections, arg_genl, UNPROVIDED, UNPROVIDED))) {
                                                note_at_violations(arg_not_genl_disjoint_violations(reln, arg, argnum, arg_genl));
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            arg_genl = csome_list_var.first();
                                        } 
                                    }
                                    result = T;
                                    doneP = at_utilities.at_finishedP(result);
                                }
                            } finally {
                                sdc.$ignoring_sdcP$.rebind(_prev_bind_0_$55, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$55, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$54, thread);
                    }
                } finally {
                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_$53, thread);
                }
            } else {
                final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$56 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_1_$56 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p2, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p2), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_arg_type_collections(reln, argnum, $ARG_GENLS);
                    if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                        final SubLObject genl_collections2 = arg_collections(arg, $GENLS, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                        final SubLObject _prev_bind_0_$57 = sdc.$ignoring_sdcP$.currentBinding(thread);
                        try {
                            sdc.$ignoring_sdcP$.bind(makeBoolean(NIL == at_vars.$at_check_not_sdcP$.getDynamicValue(thread)), thread);
                            if (NIL != disjoint_with.any_disjoint_with_anyP_memoized(genl_collections2, list_utilities.remove_if_not(FORT_P, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) && (NIL == doneP)) {
                                    SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue(thread);
                                    SubLObject arg_genl2 = NIL;
                                    arg_genl2 = csome_list_var2.first();
                                    while ((NIL == doneP) && (NIL != csome_list_var2)) {
                                        if ((NIL != forts.fort_p(arg_genl2)) && (NIL != disjoint_with.any_disjoint_withP(genl_collections2, arg_genl2, UNPROVIDED, UNPROVIDED))) {
                                            note_at_violations(arg_not_genl_disjoint_violations(reln, arg, argnum, arg_genl2));
                                        }
                                        csome_list_var2 = csome_list_var2.rest();
                                        arg_genl2 = csome_list_var2.first();
                                    } 
                                }
                                result = T;
                                doneP = at_utilities.at_finishedP(result);
                            }
                        } finally {
                            sdc.$ignoring_sdcP$.rebind(_prev_bind_0_$57, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_4, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$56, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$56, thread);
                }
            }
        } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_2, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject arg_not_genl_disjoint_violations_alt(SubLObject reln, SubLObject arg, SubLObject argnum, SubLObject arg_genl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constraints = dictionary.dictionary_lookup($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), arg_genl, UNPROVIDED);
                SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                SubLObject module = $MAL_ARG_WRT_ARG_NOT_GENLS_DISJOINT;
                SubLObject violations = NIL;
                SubLObject cdolist_list_var = constraints;
                SubLObject constraint_details = NIL;
                for (constraint_details = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_details = cdolist_list_var.first()) {
                    {
                        SubLObject datum = constraint_details;
                        SubLObject current = datum;
                        SubLObject constraint_reln = NIL;
                        SubLObject via = NIL;
                        SubLObject constraint_gaf = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt10);
                        constraint_reln = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt10);
                        via = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt10);
                        constraint_gaf = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (constraint_reln == reln) {
                                violations = cons(list(module, arg, reln, argnum, arg_genl, mt), violations);
                            } else {
                                violations = cons(list(module, arg, reln, argnum, arg_genl, mt, list(via, constraint_reln)), violations);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt10);
                        }
                    }
                }
                return violations;
            }
        }
    }

    public static SubLObject arg_not_genl_disjoint_violations(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject arg_genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constraints = dictionary.dictionary_lookup($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), arg_genl, UNPROVIDED);
        final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        final SubLObject module = $MAL_ARG_WRT_ARG_NOT_GENLS_DISJOINT;
        SubLObject violations = NIL;
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint_details = NIL;
        constraint_details = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = constraint_details;
            SubLObject constraint_reln = NIL;
            SubLObject via = NIL;
            SubLObject constraint_gaf = NIL;
            destructuring_bind_must_consp(current, datum, $list10);
            constraint_reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list10);
            via = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list10);
            constraint_gaf = current.first();
            current = current.rest();
            if (NIL == current) {
                if (constraint_reln.eql(reln)) {
                    violations = cons(list(module, arg, reln, argnum, arg_genl, mt), violations);
                } else {
                    violations = cons(list(module, arg, reln, argnum, arg_genl, mt, list(via, constraint_reln)), violations);
                }
            } else {
                cdestructuring_bind_error(datum, $list10);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint_details = cdolist_list_var.first();
        } 
        return violations;
    }

    public static final SubLObject mal_arg_formatP_alt(SubLObject reln, SubLObject arg, SubLObject argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == at_vars.$at_check_arg_formatP$.getDynamicValue(thread)) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                SubLObject doneP = NIL;
                {
                    SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
                    try {
                        $at_applicable_arg_types$.bind(NIL, thread);
                        $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
                        if (reln == $$Quote) {
                            {
                                SubLObject _prev_bind_0_49 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                                try {
                                    cycl_grammar.$within_quote_form$.bind(T, thread);
                                    {
                                        SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                        {
                                            SubLObject _prev_bind_0_50 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                            SubLObject _prev_bind_1_51 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                com.cyc.cycjava.cycl.at_routines.applicable_arg_type_collections(reln, argnum, $FORMAT);
                                                if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                                    if (NIL == doneP) {
                                                        {
                                                            SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                            SubLObject format = NIL;
                                                            for (format = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , format = csome_list_var.first()) {
                                                                {
                                                                    SubLObject _prev_bind_0_52 = at_vars.$gather_at_format_violationsP$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_53 = at_vars.$at_format_violations$.currentBinding(thread);
                                                                    try {
                                                                        at_vars.$gather_at_format_violationsP$.bind(T, thread);
                                                                        at_vars.$at_format_violations$.bind(NIL, thread);
                                                                        if (NIL == arg_type.memoized_format_okP(format, at_vars.$at_formula$.getDynamicValue(thread), argnum, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                                                                            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.arg_format_violations(reln, arg, argnum, format));
                                                                            }
                                                                            result = T;
                                                                            doneP = at_utilities.at_finishedP(result);
                                                                        }
                                                                    } finally {
                                                                        at_vars.$at_format_violations$.rebind(_prev_bind_1_53, thread);
                                                                        at_vars.$gather_at_format_violationsP$.rebind(_prev_bind_0_52, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_51, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_50, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_49, thread);
                                }
                            }
                        } else {
                            {
                                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                {
                                    SubLObject _prev_bind_0_54 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                    SubLObject _prev_bind_1_55 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                        com.cyc.cycjava.cycl.at_routines.applicable_arg_type_collections(reln, argnum, $FORMAT);
                                        if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                            if (NIL == doneP) {
                                                {
                                                    SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                    SubLObject format = NIL;
                                                    for (format = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , format = csome_list_var.first()) {
                                                        {
                                                            SubLObject _prev_bind_0_56 = at_vars.$gather_at_format_violationsP$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_57 = at_vars.$at_format_violations$.currentBinding(thread);
                                                            try {
                                                                at_vars.$gather_at_format_violationsP$.bind(T, thread);
                                                                at_vars.$at_format_violations$.bind(NIL, thread);
                                                                if (NIL == arg_type.memoized_format_okP(format, at_vars.$at_formula$.getDynamicValue(thread), argnum, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                                                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                        com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.arg_format_violations(reln, arg, argnum, format));
                                                                    }
                                                                    result = T;
                                                                    doneP = at_utilities.at_finishedP(result);
                                                                }
                                                            } finally {
                                                                at_vars.$at_format_violations$.rebind(_prev_bind_1_57, thread);
                                                                at_vars.$gather_at_format_violationsP$.rebind(_prev_bind_0_56, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_55, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_54, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
                        $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject mal_arg_formatP(final SubLObject reln, final SubLObject arg, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == at_vars.$at_check_arg_formatP$.getDynamicValue(thread)) {
            return NIL;
        }
        if (NIL != genl_predicates.genl_predicateP(reln, $$equals, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
        try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if (reln.eql($$Quote)) {
                final SubLObject _prev_bind_0_$60 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                    cycl_grammar.$within_quote_form$.bind(T, thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$61 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$62 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_arg_type_collections(reln, argnum, $FORMAT);
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                            SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                            SubLObject format = NIL;
                            format = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                final SubLObject _prev_bind_0_$62 = at_vars.$gather_at_format_violationsP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$63 = at_vars.$at_format_violations$.currentBinding(thread);
                                try {
                                    at_vars.$gather_at_format_violationsP$.bind(T, thread);
                                    at_vars.$at_format_violations$.bind(NIL, thread);
                                    if (NIL == arg_type.memoized_format_okP(format, at_vars.$at_formula$.getDynamicValue(thread), argnum, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                                        if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                            note_at_violations(arg_format_violations(reln, arg, argnum, format));
                                        }
                                        result = T;
                                        doneP = at_utilities.at_finishedP(result);
                                    }
                                } finally {
                                    at_vars.$at_format_violations$.rebind(_prev_bind_1_$63, thread);
                                    at_vars.$gather_at_format_violationsP$.rebind(_prev_bind_0_$62, thread);
                                }
                                csome_list_var = csome_list_var.rest();
                                format = csome_list_var.first();
                            } 
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$62, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$61, thread);
                    }
                } finally {
                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_$60, thread);
                }
            } else {
                final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$63 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_1_$64 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p2, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p2), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_arg_type_collections(reln, argnum, $FORMAT);
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                        SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue(thread);
                        SubLObject format2 = NIL;
                        format2 = csome_list_var2.first();
                        while ((NIL == doneP) && (NIL != csome_list_var2)) {
                            final SubLObject _prev_bind_0_$64 = at_vars.$gather_at_format_violationsP$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$65 = at_vars.$at_format_violations$.currentBinding(thread);
                            try {
                                at_vars.$gather_at_format_violationsP$.bind(T, thread);
                                at_vars.$at_format_violations$.bind(NIL, thread);
                                if (NIL == arg_type.memoized_format_okP(format2, at_vars.$at_formula$.getDynamicValue(thread), argnum, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                        note_at_violations(arg_format_violations(reln, arg, argnum, format2));
                                    }
                                    result = T;
                                    doneP = at_utilities.at_finishedP(result);
                                }
                            } finally {
                                at_vars.$at_format_violations$.rebind(_prev_bind_1_$65, thread);
                                at_vars.$gather_at_format_violationsP$.rebind(_prev_bind_0_$64, thread);
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            format2 = csome_list_var2.first();
                        } 
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_4, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$64, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$63, thread);
                }
            }
        } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_2, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject arg_format_violations_alt(SubLObject reln, SubLObject arg, SubLObject argnum, SubLObject format) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constraints = dictionary.dictionary_lookup($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), format, UNPROVIDED);
                SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                SubLObject module = $MAL_ARG_WRT_ARG_FORMAT;
                SubLObject violations = NIL;
                SubLObject cdolist_list_var = constraints;
                SubLObject constraint_details = NIL;
                for (constraint_details = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_details = cdolist_list_var.first()) {
                    {
                        SubLObject datum = constraint_details;
                        SubLObject current = datum;
                        SubLObject constraint_reln = NIL;
                        SubLObject via = NIL;
                        SubLObject constraint_gaf = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt10);
                        constraint_reln = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt10);
                        via = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt10);
                        constraint_gaf = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (constraint_reln == reln) {
                                violations = cons(list(module, arg, reln, argnum, format, mt, at_vars.$at_format_violations$.getDynamicValue(thread)), violations);
                            } else {
                                violations = cons(list(module, arg, reln, argnum, format, mt, at_vars.$at_format_violations$.getDynamicValue(thread), list(via, constraint_reln)), violations);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt10);
                        }
                    }
                }
                return violations;
            }
        }
    }

    public static SubLObject arg_format_violations(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject format) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constraints = dictionary.dictionary_lookup($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), format, UNPROVIDED);
        final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        final SubLObject module = $MAL_ARG_WRT_ARG_FORMAT;
        SubLObject violations = NIL;
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint_details = NIL;
        constraint_details = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = constraint_details;
            SubLObject constraint_reln = NIL;
            SubLObject via = NIL;
            SubLObject constraint_gaf = NIL;
            destructuring_bind_must_consp(current, datum, $list10);
            constraint_reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list10);
            via = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list10);
            constraint_gaf = current.first();
            current = current.rest();
            if (NIL == current) {
                if (constraint_reln.eql(reln)) {
                    violations = cons(list(module, arg, reln, argnum, format, mt, at_vars.$at_format_violations$.getDynamicValue(thread)), violations);
                } else {
                    violations = cons(list(module, arg, reln, argnum, format, mt, at_vars.$at_format_violations$.getDynamicValue(thread), list(via, constraint_reln)), violations);
                }
            } else {
                cdestructuring_bind_error(datum, $list10);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint_details = cdolist_list_var.first();
        } 
        return violations;
    }

    /**
     * the inter-arg-isa collections applicable to arg number
     * <argnum> of relation <reln> that do not include <arg>
     */
    @LispMethod(comment = "the inter-arg-isa collections applicable to arg number\r\n<argnum> of relation <reln> that do not include <arg>\nthe inter-arg-isa collections applicable to arg number\n<argnum> of relation <reln> that do not include <arg>")
    public static final SubLObject mal_inter_arg_isaP_alt(SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject dep_arg, SubLObject dep_argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!(((((NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread)) && (NIL != reln)) && (NIL != ind_arg)) && (NIL != dep_arg)) && ind_argnum.isInteger())) {
                return NIL;
            }
            if (!((NIL == at_utilities.inter_arg_isa_cache_initializedP()) || (NIL != at_utilities.some_inter_arg_isa_constraint_somewhereP(reln)))) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                SubLObject doneP = NIL;
                {
                    SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
                    try {
                        $at_applicable_arg_types$.bind(NIL, thread);
                        $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
                        if (reln == $$Quote) {
                            {
                                SubLObject _prev_bind_0_58 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                                try {
                                    cycl_grammar.$within_quote_form$.bind(T, thread);
                                    {
                                        SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                        {
                                            SubLObject _prev_bind_0_59 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                            SubLObject _prev_bind_1_60 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                com.cyc.cycjava.cycl.at_routines.applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_ISA, at_vars.$at_check_non_constant_inter_arg_isaP$.getDynamicValue(thread));
                                                if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                                    if (NIL == doneP) {
                                                        {
                                                            SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                            SubLObject inter_arg_isas = NIL;
                                                            for (inter_arg_isas = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , inter_arg_isas = csome_list_var.first()) {
                                                                {
                                                                    SubLObject _prev_bind_0_61 = wff_vars.$wff_violations$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_62 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                                                                    try {
                                                                        wff_vars.$wff_violations$.bind(NIL, thread);
                                                                        at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                                                                        {
                                                                            SubLObject datum = inter_arg_isas;
                                                                            SubLObject current = datum;
                                                                            SubLObject ind_arg_isa = NIL;
                                                                            SubLObject dep_arg_isa = NIL;
                                                                            destructuring_bind_must_consp(current, datum, $list_alt36);
                                                                            ind_arg_isa = current.first();
                                                                            current = current.rest();
                                                                            destructuring_bind_must_consp(current, datum, $list_alt36);
                                                                            dep_arg_isa = current.first();
                                                                            current = current.rest();
                                                                            if (NIL == current) {
                                                                                if (NIL != forts.fort_p(dep_arg_isa)) {
                                                                                    if (NIL != isa.isaP(dep_arg, dep_arg_isa, UNPROVIDED, UNPROVIDED)) {
                                                                                    } else {
                                                                                        if (NIL != at_defns.defns_admitP(dep_arg_isa, dep_arg, UNPROVIDED)) {
                                                                                        } else {
                                                                                            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                                com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.inter_arg_isa_violations(reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_isa));
                                                                                                com.cyc.cycjava.cycl.at_routines.note_at_violations(wff.wff_violations());
                                                                                            }
                                                                                            result = T;
                                                                                            doneP = at_utilities.at_finishedP(result);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                cdestructuring_bind_error(datum, $list_alt36);
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_1_62, thread);
                                                                        wff_vars.$wff_violations$.rebind(_prev_bind_0_61, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_60, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_59, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_58, thread);
                                }
                            }
                        } else {
                            {
                                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                {
                                    SubLObject _prev_bind_0_63 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                    SubLObject _prev_bind_1_64 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                        com.cyc.cycjava.cycl.at_routines.applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_ISA, at_vars.$at_check_non_constant_inter_arg_isaP$.getDynamicValue(thread));
                                        if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                            if (NIL == doneP) {
                                                {
                                                    SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                    SubLObject inter_arg_isas = NIL;
                                                    for (inter_arg_isas = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , inter_arg_isas = csome_list_var.first()) {
                                                        {
                                                            SubLObject _prev_bind_0_65 = wff_vars.$wff_violations$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_66 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                                                            try {
                                                                wff_vars.$wff_violations$.bind(NIL, thread);
                                                                at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                                                                {
                                                                    SubLObject datum = inter_arg_isas;
                                                                    SubLObject current = datum;
                                                                    SubLObject ind_arg_isa = NIL;
                                                                    SubLObject dep_arg_isa = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list_alt36);
                                                                    ind_arg_isa = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list_alt36);
                                                                    dep_arg_isa = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != forts.fort_p(dep_arg_isa)) {
                                                                            if (NIL != isa.isaP(dep_arg, dep_arg_isa, UNPROVIDED, UNPROVIDED)) {
                                                                            } else {
                                                                                if (NIL != at_defns.defns_admitP(dep_arg_isa, dep_arg, UNPROVIDED)) {
                                                                                } else {
                                                                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                        com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.inter_arg_isa_violations(reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_isa));
                                                                                        com.cyc.cycjava.cycl.at_routines.note_at_violations(wff.wff_violations());
                                                                                    }
                                                                                    result = T;
                                                                                    doneP = at_utilities.at_finishedP(result);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list_alt36);
                                                                    }
                                                                }
                                                            } finally {
                                                                at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_1_66, thread);
                                                                wff_vars.$wff_violations$.rebind(_prev_bind_0_65, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_64, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_63, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
                        $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * the inter-arg-isa collections applicable to arg number
     * <argnum> of relation <reln> that do not include <arg>
     */
    @LispMethod(comment = "the inter-arg-isa collections applicable to arg number\r\n<argnum> of relation <reln> that do not include <arg>\nthe inter-arg-isa collections applicable to arg number\n<argnum> of relation <reln> that do not include <arg>")
    public static SubLObject mal_inter_arg_isaP(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((((NIL == at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread)) || (NIL == reln)) || (NIL == ind_arg)) || (NIL == dep_arg)) || (!ind_argnum.isInteger())) {
            return NIL;
        }
        if ((NIL != at_utilities.inter_arg_isa_cache_initializedP()) && (NIL == at_utilities.some_inter_arg_isa_constraint_somewhereP(reln))) {
            return NIL;
        }
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
        try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if (reln.eql($$Quote)) {
                final SubLObject _prev_bind_0_$69 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                    cycl_grammar.$within_quote_form$.bind(T, thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$70 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$71 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_ISA, at_vars.$at_check_non_constant_inter_arg_isaP$.getDynamicValue(thread));
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                            SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                            SubLObject inter_arg_isas = NIL;
                            inter_arg_isas = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                final SubLObject _prev_bind_0_$71 = wff_vars.$wff_violations$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$72 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                                try {
                                    wff_vars.$wff_violations$.bind(NIL, thread);
                                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                                    SubLObject current;
                                    final SubLObject datum = current = inter_arg_isas;
                                    SubLObject ind_arg_isa = NIL;
                                    SubLObject dep_arg_isa = NIL;
                                    destructuring_bind_must_consp(current, datum, $list41);
                                    ind_arg_isa = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list41);
                                    dep_arg_isa = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (NIL != forts.fort_p(dep_arg_isa)) {
                                            if (NIL == isa.isaP(dep_arg, dep_arg_isa, UNPROVIDED, UNPROVIDED)) {
                                                if (NIL == at_defns.defns_admitP(dep_arg_isa, dep_arg, UNPROVIDED)) {
                                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                        note_at_violations(inter_arg_isa_violations(reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_isa));
                                                        note_at_violations(wff.wff_violations());
                                                    }
                                                    result = T;
                                                    doneP = at_utilities.at_finishedP(result);
                                                }
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list41);
                                    }
                                } finally {
                                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_1_$72, thread);
                                    wff_vars.$wff_violations$.rebind(_prev_bind_0_$71, thread);
                                }
                                csome_list_var = csome_list_var.rest();
                                inter_arg_isas = csome_list_var.first();
                            } 
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$71, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$70, thread);
                    }
                } finally {
                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_$69, thread);
                }
            } else {
                final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$72 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_1_$73 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p2, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p2), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_ISA, at_vars.$at_check_non_constant_inter_arg_isaP$.getDynamicValue(thread));
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                        SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue(thread);
                        SubLObject inter_arg_isas2 = NIL;
                        inter_arg_isas2 = csome_list_var2.first();
                        while ((NIL == doneP) && (NIL != csome_list_var2)) {
                            final SubLObject _prev_bind_0_$73 = wff_vars.$wff_violations$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$74 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                            try {
                                wff_vars.$wff_violations$.bind(NIL, thread);
                                at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                                SubLObject current2;
                                final SubLObject datum2 = current2 = inter_arg_isas2;
                                SubLObject ind_arg_isa2 = NIL;
                                SubLObject dep_arg_isa2 = NIL;
                                destructuring_bind_must_consp(current2, datum2, $list41);
                                ind_arg_isa2 = current2.first();
                                current2 = current2.rest();
                                destructuring_bind_must_consp(current2, datum2, $list41);
                                dep_arg_isa2 = current2.first();
                                current2 = current2.rest();
                                if (NIL == current2) {
                                    if (NIL != forts.fort_p(dep_arg_isa2)) {
                                        if (NIL == isa.isaP(dep_arg, dep_arg_isa2, UNPROVIDED, UNPROVIDED)) {
                                            if (NIL == at_defns.defns_admitP(dep_arg_isa2, dep_arg, UNPROVIDED)) {
                                                if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                    note_at_violations(inter_arg_isa_violations(reln, ind_arg, ind_argnum, ind_arg_isa2, dep_arg, dep_argnum, dep_arg_isa2));
                                                    note_at_violations(wff.wff_violations());
                                                }
                                                result = T;
                                                doneP = at_utilities.at_finishedP(result);
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum2, $list41);
                                }
                            } finally {
                                at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_1_$74, thread);
                                wff_vars.$wff_violations$.rebind(_prev_bind_0_$73, thread);
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            inter_arg_isas2 = csome_list_var2.first();
                        } 
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_4, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$73, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$72, thread);
                }
            }
        } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_2, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject inter_arg_isa_violations_alt(SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject ind_arg_isa, SubLObject dep_arg, SubLObject dep_argnum, SubLObject dep_arg_isa) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject module = (NIL != kb_accessors.admitting_defnsP(dep_arg_isa, mt_relevance_macros.$mt$.getDynamicValue(thread))) ? ((SubLObject) ($MAL_ARG_WRT_INTER_ARG_DEFN)) : $MAL_ARG_WRT_INTER_ARG_ISA;
                return com.cyc.cycjava.cycl.at_routines.inter_arg_violations(module, reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_isa);
            }
        }
    }

    public static SubLObject inter_arg_isa_violations(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject ind_arg_isa, final SubLObject dep_arg, final SubLObject dep_argnum, final SubLObject dep_arg_isa) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject module = (NIL != kb_accessors.admitting_defnsP(dep_arg_isa, mt_relevance_macros.$mt$.getDynamicValue(thread))) ? $MAL_ARG_WRT_INTER_ARG_DEFN : $MAL_ARG_WRT_INTER_ARG_ISA;
        return inter_arg_violations(module, reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_isa);
    }

    public static final SubLObject inter_arg_violations_alt(SubLObject module, SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject ind_arg_col, SubLObject dep_arg, SubLObject dep_argnum, SubLObject dep_arg_col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constraints = dictionary.dictionary_lookup($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), list(ind_arg_col, dep_arg_col), UNPROVIDED);
                SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                SubLObject violations = NIL;
                SubLObject cdolist_list_var = constraints;
                SubLObject constraint_details = NIL;
                for (constraint_details = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_details = cdolist_list_var.first()) {
                    {
                        SubLObject datum = constraint_details;
                        SubLObject current = datum;
                        SubLObject constraint_reln = NIL;
                        SubLObject via = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt39);
                        constraint_reln = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt39);
                        via = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (reln == constraint_reln) {
                                violations = cons(list(new SubLObject[]{ module, dep_arg, reln, dep_argnum, dep_arg_col, ind_arg_col, ind_argnum, ind_arg, mt }), violations);
                            } else {
                                violations = cons(list(new SubLObject[]{ module, dep_arg, reln, dep_argnum, dep_arg_col, ind_arg_col, ind_argnum, ind_arg, mt, list(via, constraint_reln) }), violations);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt39);
                        }
                    }
                }
                return violations;
            }
        }
    }

    public static SubLObject inter_arg_violations(final SubLObject module, final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject ind_arg_col, final SubLObject dep_arg, final SubLObject dep_argnum, final SubLObject dep_arg_col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constraints = dictionary.dictionary_lookup($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), list(ind_arg_col, dep_arg_col), UNPROVIDED);
        final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        SubLObject violations = NIL;
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint_details = NIL;
        constraint_details = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = constraint_details;
            SubLObject constraint_reln = NIL;
            SubLObject via = NIL;
            destructuring_bind_must_consp(current, datum, $list44);
            constraint_reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list44);
            via = current.first();
            current = current.rest();
            if (NIL == current) {
                if (reln.eql(constraint_reln)) {
                    violations = cons(list(new SubLObject[]{ module, dep_arg, reln, dep_argnum, dep_arg_col, ind_arg_col, ind_argnum, ind_arg, mt }), violations);
                } else {
                    violations = cons(list(new SubLObject[]{ module, dep_arg, reln, dep_argnum, dep_arg_col, ind_arg_col, ind_argnum, ind_arg, mt, list(via, constraint_reln) }), violations);
                }
            } else {
                cdestructuring_bind_error(datum, $list44);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint_details = cdolist_list_var.first();
        } 
        return violations;
    }

    public static final SubLObject some_inter_arg_genl_assertion_somewhereP_alt(SubLObject reln) {
        return makeBoolean(((NIL != somewhere_cache.some_pred_assertion_somewhereP($$interArgGenl1_2, reln, ONE_INTEGER, UNPROVIDED)) || (NIL != somewhere_cache.some_pred_assertion_somewhereP($$interArgGenl2_1, reln, ONE_INTEGER, UNPROVIDED))) || (NIL != somewhere_cache.some_pred_assertion_somewhereP($$interArgGenl2_4, reln, ONE_INTEGER, UNPROVIDED)));
    }

    public static SubLObject some_inter_arg_genl_assertion_somewhereP(final SubLObject reln) {
        return makeBoolean(((NIL != somewhere_cache.some_pred_assertion_somewhereP($$interArgGenl1_2, reln, ONE_INTEGER, UNPROVIDED)) || (NIL != somewhere_cache.some_pred_assertion_somewhereP($$interArgGenl2_1, reln, ONE_INTEGER, UNPROVIDED))) || (NIL != somewhere_cache.some_pred_assertion_somewhereP($$interArgGenl2_4, reln, ONE_INTEGER, UNPROVIDED)));
    }

    public static final SubLObject some_inter_arg_genl_constraint_somewhereP_alt(SubLObject reln) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject found_oneP = NIL;
                if (NIL != fort_types_interface.predicateP(reln)) {
                    if (NIL == found_oneP) {
                        {
                            SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
                            SubLObject node_var = reln;
                            SubLObject deck_type = ($DEPTH == $DEPTH) ? ((SubLObject) ($STACK)) : $QUEUE;
                            SubLObject recur_deck = deck.create_deck(deck_type);
                            SubLObject node_and_predicate_mode = NIL;
                            {
                                SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_76 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt54$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt54$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt54$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt59$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt54$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_77 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_78 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(reln, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_79 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_80 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_81 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                    node_and_predicate_mode = list(reln, sbhl_search_vars.genl_inverse_mode_p());
                                                                    while ((NIL != node_and_predicate_mode) && (NIL == found_oneP)) {
                                                                        {
                                                                            SubLObject node_var_82 = node_and_predicate_mode.first();
                                                                            SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                            SubLObject genl_pred = node_var_82;
                                                                            {
                                                                                SubLObject _prev_bind_0_83 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                                    {
                                                                                        SubLObject inverse_mode = predicate_mode;
                                                                                        if (NIL != com.cyc.cycjava.cycl.at_routines.some_inter_arg_genl_assertion_somewhereP(genl_pred)) {
                                                                                            found_oneP = T;
                                                                                        }
                                                                                        {
                                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                                                                            SubLObject rest = NIL;
                                                                                            for (rest = accessible_modules; !((NIL != found_oneP) || (NIL == rest)); rest = rest.rest()) {
                                                                                                {
                                                                                                    SubLObject module_var = rest.first();
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_84 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                        SubLObject _prev_bind_1_85 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                            {
                                                                                                                SubLObject node = function_terms.naut_to_nart(node_var_82);
                                                                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                    {
                                                                                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != d_link) {
                                                                                                                            {
                                                                                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                if (NIL != mt_links) {
                                                                                                                                    {
                                                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                        while (!((NIL != found_oneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            {
                                                                                                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject _prev_bind_0_86 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                        try {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                            {
                                                                                                                                                                SubLObject iteration_state_87 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                while (!((NIL != found_oneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_87)))) {
                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_87);
                                                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject _prev_bind_0_88 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                try {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                    {
                                                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                        SubLObject rest_89 = NIL;
                                                                                                                                                                                        for (rest_89 = new_list; !((NIL != found_oneP) || (NIL == rest_89)); rest_89 = rest_89.rest()) {
                                                                                                                                                                                            {
                                                                                                                                                                                                SubLObject node_vars_link_node = rest_89.first();
                                                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                } finally {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_88, thread);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        iteration_state_87 = dictionary_contents.do_dictionary_contents_next(iteration_state_87);
                                                                                                                                                                    }
                                                                                                                                                                } 
                                                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_87);
                                                                                                                                                            }
                                                                                                                                                        } finally {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_86, thread);
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
                                                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt60$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                        {
                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                            SubLObject rest_90 = NIL;
                                                                                                                            for (rest_90 = new_list; !((NIL != found_oneP) || (NIL == rest_90)); rest_90 = rest_90.rest()) {
                                                                                                                                {
                                                                                                                                    SubLObject generating_fn = rest_90.first();
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_91 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                            {
                                                                                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                                SubLObject new_list_92 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                SubLObject rest_93 = NIL;
                                                                                                                                                for (rest_93 = new_list_92; !((NIL != found_oneP) || (NIL == rest_93)); rest_93 = rest_93.rest()) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject node_vars_link_node = rest_93.first();
                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_91, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } finally {
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_85, thread);
                                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_84, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_83, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_81, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_80, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_79, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt61$Node__a_does_not_pass_sbhl_type_t, reln, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_78, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_77, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_76, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } else {
                    found_oneP = com.cyc.cycjava.cycl.at_routines.some_inter_arg_genl_assertion_somewhereP(reln);
                }
                return found_oneP;
            }
        }
    }

    public static SubLObject some_inter_arg_genl_constraint_somewhereP(final SubLObject reln) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject found_oneP = NIL;
        if (NIL != fort_types_interface.predicateP(reln)) {
            if (NIL == found_oneP) {
                final SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
                final SubLObject deck_type = ($DEPTH == $DEPTH) ? $STACK : $QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$78 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str54$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str54$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str54$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str59$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str54$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$79 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$80 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(reln, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$80 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$81 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$83 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(reln, UNPROVIDED);
                                        for (node_and_predicate_mode = list(reln, sbhl_search_vars.genl_inverse_mode_p()); (NIL != node_and_predicate_mode) && (NIL == found_oneP); node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$84 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = second(node_and_predicate_mode);
                                            final SubLObject genl_pred = node_var_$84;
                                            final SubLObject _prev_bind_0_$81 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                final SubLObject inverse_mode = predicate_mode;
                                                if (NIL != some_inter_arg_genl_assertion_somewhereP(genl_pred)) {
                                                    found_oneP = T;
                                                }
                                                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                                SubLObject rest;
                                                SubLObject module_var;
                                                SubLObject _prev_bind_0_$82;
                                                SubLObject _prev_bind_1_$82;
                                                SubLObject node;
                                                SubLObject d_link;
                                                SubLObject mt_links;
                                                SubLObject iteration_state;
                                                SubLObject mt;
                                                SubLObject tv_links;
                                                SubLObject _prev_bind_0_$83;
                                                SubLObject iteration_state_$89;
                                                SubLObject tv;
                                                SubLObject link_nodes;
                                                SubLObject _prev_bind_0_$84;
                                                SubLObject sol;
                                                SubLObject set_contents_var;
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                SubLObject csome_list_var;
                                                SubLObject node_vars_link_node2;
                                                SubLObject new_list;
                                                SubLObject rest_$91;
                                                SubLObject generating_fn;
                                                SubLObject _prev_bind_0_$85;
                                                SubLObject sol2;
                                                SubLObject link_nodes2;
                                                SubLObject set_contents_var2;
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject node_vars_link_node3;
                                                SubLObject csome_list_var2;
                                                SubLObject node_vars_link_node4;
                                                for (rest = NIL, rest = accessible_modules; (NIL == found_oneP) && (NIL != rest); rest = rest.rest()) {
                                                    module_var = rest.first();
                                                    _prev_bind_0_$82 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$82 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        node = function_terms.naut_to_nart(node_var_$84);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == found_oneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            _prev_bind_0_$83 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                for (iteration_state_$89 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == found_oneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$89)); iteration_state_$89 = dictionary_contents.do_dictionary_contents_next(iteration_state_$89)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$89);
                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        _prev_bind_0_$84 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == found_oneP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    if (NIL == found_oneP) {
                                                                                                        csome_list_var = sol;
                                                                                                        node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                        while ((NIL == found_oneP) && (NIL != csome_list_var)) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    }
                                                                                                } else {
                                                                                                    Errors.error($str60$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$84, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$89);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$83, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str61$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                for (rest_$91 = NIL, rest_$91 = new_list; (NIL == found_oneP) && (NIL != rest_$91); rest_$91 = rest_$91.rest()) {
                                                                    generating_fn = rest_$91.first();
                                                                    _prev_bind_0_$85 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            set_contents_var2 = set.do_set_internal(sol2);
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == found_oneP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                if (NIL == found_oneP) {
                                                                                    csome_list_var2 = sol2;
                                                                                    node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                    while ((NIL == found_oneP) && (NIL != csome_list_var2)) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                    } 
                                                                                }
                                                                            } else {
                                                                                Errors.error($str60$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$85, thread);
                                                                    }
                                                                }
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$82, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$82, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$81, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$83, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$81, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$80, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str62$Node__a_does_not_pass_sbhl_type_t, reln, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$80, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$79, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$78, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$86 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$86, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
        } else {
            found_oneP = some_inter_arg_genl_assertion_somewhereP(reln);
        }
        return found_oneP;
    }

    /**
     * the inter-arg-genl collections applicable to arg number
     * <argnum> of relation <reln> that do not include <arg>
     */
    @LispMethod(comment = "the inter-arg-genl collections applicable to arg number\r\n<argnum> of relation <reln> that do not include <arg>\nthe inter-arg-genl collections applicable to arg number\n<argnum> of relation <reln> that do not include <arg>")
    public static final SubLObject mal_inter_arg_genlP_alt(SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject dep_arg, SubLObject dep_argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!(((((NIL != at_vars.$at_check_inter_arg_genlP$.getDynamicValue(thread)) && (NIL != reln)) && (NIL != ind_arg)) && (NIL != dep_arg)) && ind_argnum.isInteger())) {
                return NIL;
            }
            if (NIL == com.cyc.cycjava.cycl.at_routines.some_inter_arg_genl_constraint_somewhereP(reln)) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                SubLObject doneP = NIL;
                {
                    SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
                    try {
                        $at_applicable_arg_types$.bind(NIL, thread);
                        $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
                        if (reln == $$Quote) {
                            {
                                SubLObject _prev_bind_0_94 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                                try {
                                    cycl_grammar.$within_quote_form$.bind(T, thread);
                                    {
                                        SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                        {
                                            SubLObject _prev_bind_0_95 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                            SubLObject _prev_bind_1_96 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                com.cyc.cycjava.cycl.at_routines.applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_GENL, at_vars.$at_check_non_constant_inter_arg_genlP$.getDynamicValue(thread));
                                                if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                                    if (NIL == doneP) {
                                                        {
                                                            SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                            SubLObject inter_arg_genls = NIL;
                                                            for (inter_arg_genls = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , inter_arg_genls = csome_list_var.first()) {
                                                                {
                                                                    SubLObject datum = inter_arg_genls;
                                                                    SubLObject current = datum;
                                                                    SubLObject ind_arg_genl = NIL;
                                                                    SubLObject dep_arg_genl = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list_alt63);
                                                                    ind_arg_genl = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list_alt63);
                                                                    dep_arg_genl = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if ((NIL != forts.fort_p(dep_arg_genl)) && (NIL == genls.genlP(dep_arg, dep_arg_genl, UNPROVIDED, UNPROVIDED))) {
                                                                            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.inter_arg_genl_violations(reln, ind_arg, ind_argnum, ind_arg_genl, dep_arg, dep_argnum, dep_arg_genl));
                                                                            }
                                                                            result = T;
                                                                            doneP = at_utilities.at_finishedP(result);
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list_alt63);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_96, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_95, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_94, thread);
                                }
                            }
                        } else {
                            {
                                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                {
                                    SubLObject _prev_bind_0_97 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                    SubLObject _prev_bind_1_98 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                        com.cyc.cycjava.cycl.at_routines.applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_GENL, at_vars.$at_check_non_constant_inter_arg_genlP$.getDynamicValue(thread));
                                        if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                            if (NIL == doneP) {
                                                {
                                                    SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                    SubLObject inter_arg_genls = NIL;
                                                    for (inter_arg_genls = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , inter_arg_genls = csome_list_var.first()) {
                                                        {
                                                            SubLObject datum = inter_arg_genls;
                                                            SubLObject current = datum;
                                                            SubLObject ind_arg_genl = NIL;
                                                            SubLObject dep_arg_genl = NIL;
                                                            destructuring_bind_must_consp(current, datum, $list_alt63);
                                                            ind_arg_genl = current.first();
                                                            current = current.rest();
                                                            destructuring_bind_must_consp(current, datum, $list_alt63);
                                                            dep_arg_genl = current.first();
                                                            current = current.rest();
                                                            if (NIL == current) {
                                                                if ((NIL != forts.fort_p(dep_arg_genl)) && (NIL == genls.genlP(dep_arg, dep_arg_genl, UNPROVIDED, UNPROVIDED))) {
                                                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                        com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.inter_arg_genl_violations(reln, ind_arg, ind_argnum, ind_arg_genl, dep_arg, dep_argnum, dep_arg_genl));
                                                                    }
                                                                    result = T;
                                                                    doneP = at_utilities.at_finishedP(result);
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum, $list_alt63);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_98, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_97, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
                        $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "the inter-arg-genl collections applicable to arg number\r\n<argnum> of relation <reln> that do not include <arg>\nthe inter-arg-genl collections applicable to arg number\n<argnum> of relation <reln> that do not include <arg>")
    public static SubLObject mal_inter_arg_genlP(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((((NIL == at_vars.$at_check_inter_arg_genlP$.getDynamicValue(thread)) || (NIL == reln)) || (NIL == ind_arg)) || (NIL == dep_arg)) || (!ind_argnum.isInteger())) {
            return NIL;
        }
        if (NIL == some_inter_arg_genl_constraint_somewhereP(reln)) {
            return NIL;
        }
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
        try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if (reln.eql($$Quote)) {
                final SubLObject _prev_bind_0_$94 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                    cycl_grammar.$within_quote_form$.bind(T, thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$95 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$96 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_GENL, at_vars.$at_check_non_constant_inter_arg_genlP$.getDynamicValue(thread));
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                            SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                            SubLObject inter_arg_genls = NIL;
                            inter_arg_genls = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                SubLObject current;
                                final SubLObject datum = current = inter_arg_genls;
                                SubLObject ind_arg_genl = NIL;
                                SubLObject dep_arg_genl = NIL;
                                destructuring_bind_must_consp(current, datum, $list64);
                                ind_arg_genl = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list64);
                                dep_arg_genl = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if ((NIL != forts.fort_p(dep_arg_genl)) && (NIL == genls.genlP(dep_arg, dep_arg_genl, UNPROVIDED, UNPROVIDED))) {
                                        if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                            note_at_violations(inter_arg_genl_violations(reln, ind_arg, ind_argnum, ind_arg_genl, dep_arg, dep_argnum, dep_arg_genl));
                                        }
                                        result = T;
                                        doneP = at_utilities.at_finishedP(result);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list64);
                                }
                                csome_list_var = csome_list_var.rest();
                                inter_arg_genls = csome_list_var.first();
                            } 
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$96, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$95, thread);
                    }
                } finally {
                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_$94, thread);
                }
            } else {
                final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$96 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_1_$97 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p2, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p2), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_GENL, at_vars.$at_check_non_constant_inter_arg_genlP$.getDynamicValue(thread));
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                        SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue(thread);
                        SubLObject inter_arg_genls2 = NIL;
                        inter_arg_genls2 = csome_list_var2.first();
                        while ((NIL == doneP) && (NIL != csome_list_var2)) {
                            SubLObject current2;
                            final SubLObject datum2 = current2 = inter_arg_genls2;
                            SubLObject ind_arg_genl2 = NIL;
                            SubLObject dep_arg_genl2 = NIL;
                            destructuring_bind_must_consp(current2, datum2, $list64);
                            ind_arg_genl2 = current2.first();
                            current2 = current2.rest();
                            destructuring_bind_must_consp(current2, datum2, $list64);
                            dep_arg_genl2 = current2.first();
                            current2 = current2.rest();
                            if (NIL == current2) {
                                if ((NIL != forts.fort_p(dep_arg_genl2)) && (NIL == genls.genlP(dep_arg, dep_arg_genl2, UNPROVIDED, UNPROVIDED))) {
                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                        note_at_violations(inter_arg_genl_violations(reln, ind_arg, ind_argnum, ind_arg_genl2, dep_arg, dep_argnum, dep_arg_genl2));
                                    }
                                    result = T;
                                    doneP = at_utilities.at_finishedP(result);
                                }
                            } else {
                                cdestructuring_bind_error(datum2, $list64);
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            inter_arg_genls2 = csome_list_var2.first();
                        } 
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_4, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$97, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$96, thread);
                }
            }
        } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_2, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * the inter-arg-genl collections applicable to arg number
     * <argnum> of relation <reln> that do not include <arg>
     */


    public static final SubLObject inter_arg_genl_violations_alt(SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject ind_arg_genl, SubLObject dep_arg, SubLObject dep_argnum, SubLObject dep_arg_genl) {
        return com.cyc.cycjava.cycl.at_routines.inter_arg_violations($MAL_ARG_WRT_INTER_ARG_GENL, reln, ind_arg, ind_argnum, ind_arg_genl, dep_arg, dep_argnum, dep_arg_genl);
    }

    public static SubLObject inter_arg_genl_violations(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject ind_arg_genl, final SubLObject dep_arg, final SubLObject dep_argnum, final SubLObject dep_arg_genl) {
        return inter_arg_violations($MAL_ARG_WRT_INTER_ARG_GENL, reln, ind_arg, ind_argnum, ind_arg_genl, dep_arg, dep_argnum, dep_arg_genl);
    }

    /**
     * the inter-arg-not-isa collections applicable to arg number
     * <argnum> of relation <reln> that do not include <arg>
     */
    @LispMethod(comment = "the inter-arg-not-isa collections applicable to arg number\r\n<argnum> of relation <reln> that do not include <arg>\nthe inter-arg-not-isa collections applicable to arg number\n<argnum> of relation <reln> that do not include <arg>")
    public static final SubLObject mal_inter_arg_not_isaP_alt(SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject dep_arg, SubLObject dep_argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!(((((NIL != at_vars.$at_check_inter_arg_not_isaP$.getDynamicValue(thread)) && (NIL != reln)) && (NIL != ind_arg)) && (NIL != dep_arg)) && ind_argnum.isInteger())) {
                return NIL;
            }
            if (NIL == com.cyc.cycjava.cycl.at_routines.some_inter_arg_not_isa_constraint_somewhereP(reln)) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                SubLObject doneP = NIL;
                {
                    SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
                    try {
                        $at_applicable_arg_types$.bind(NIL, thread);
                        $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
                        if (reln == $$Quote) {
                            {
                                SubLObject _prev_bind_0_67 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                                try {
                                    cycl_grammar.$within_quote_form$.bind(T, thread);
                                    {
                                        SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                        {
                                            SubLObject _prev_bind_0_68 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                            SubLObject _prev_bind_1_69 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                com.cyc.cycjava.cycl.at_routines.applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_NOT_ISA, T);
                                                if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                                    if (NIL == doneP) {
                                                        {
                                                            SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                            SubLObject inter_arg_not_isas = NIL;
                                                            for (inter_arg_not_isas = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , inter_arg_not_isas = csome_list_var.first()) {
                                                                {
                                                                    SubLObject _prev_bind_0_70 = wff_vars.$wff_violations$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_71 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                                                                    try {
                                                                        wff_vars.$wff_violations$.bind(NIL, thread);
                                                                        at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                                                                        {
                                                                            SubLObject datum = inter_arg_not_isas;
                                                                            SubLObject current = datum;
                                                                            SubLObject ind_arg_isa = NIL;
                                                                            SubLObject dep_arg_isa = NIL;
                                                                            destructuring_bind_must_consp(current, datum, $list_alt36);
                                                                            ind_arg_isa = current.first();
                                                                            current = current.rest();
                                                                            destructuring_bind_must_consp(current, datum, $list_alt36);
                                                                            dep_arg_isa = current.first();
                                                                            current = current.rest();
                                                                            if (NIL == current) {
                                                                                if (NIL != forts.fort_p(dep_arg_isa)) {
                                                                                    {
                                                                                        SubLObject module = NIL;
                                                                                        if (NIL != isa.isaP(dep_arg, dep_arg_isa, UNPROVIDED, UNPROVIDED)) {
                                                                                            module = $MAL_ARG_WRT_INTER_ARG_NOT_ISA;
                                                                                            result = T;
                                                                                            doneP = at_utilities.at_finishedP(result);
                                                                                        } else {
                                                                                            if (NIL != at_defns.defns_admitP(dep_arg_isa, dep_arg, UNPROVIDED)) {
                                                                                                module = $MAL_ARG_WRT_INTER_ARG_NOT_DEFN;
                                                                                                result = T;
                                                                                                doneP = at_utilities.at_finishedP(result);
                                                                                            }
                                                                                        }
                                                                                        if (NIL != module) {
                                                                                            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                                com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.inter_arg_violations(module, reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_isa));
                                                                                                com.cyc.cycjava.cycl.at_routines.note_at_violations(wff.wff_violations());
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                cdestructuring_bind_error(datum, $list_alt36);
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_1_71, thread);
                                                                        wff_vars.$wff_violations$.rebind(_prev_bind_0_70, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_69, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_68, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_67, thread);
                                }
                            }
                        } else {
                            {
                                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                {
                                    SubLObject _prev_bind_0_72 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                    SubLObject _prev_bind_1_73 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                        com.cyc.cycjava.cycl.at_routines.applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_NOT_ISA, T);
                                        if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                            if (NIL == doneP) {
                                                {
                                                    SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                    SubLObject inter_arg_not_isas = NIL;
                                                    for (inter_arg_not_isas = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , inter_arg_not_isas = csome_list_var.first()) {
                                                        {
                                                            SubLObject _prev_bind_0_74 = wff_vars.$wff_violations$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_75 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                                                            try {
                                                                wff_vars.$wff_violations$.bind(NIL, thread);
                                                                at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                                                                {
                                                                    SubLObject datum = inter_arg_not_isas;
                                                                    SubLObject current = datum;
                                                                    SubLObject ind_arg_isa = NIL;
                                                                    SubLObject dep_arg_isa = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list_alt36);
                                                                    ind_arg_isa = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list_alt36);
                                                                    dep_arg_isa = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != forts.fort_p(dep_arg_isa)) {
                                                                            {
                                                                                SubLObject module = NIL;
                                                                                if (NIL != isa.isaP(dep_arg, dep_arg_isa, UNPROVIDED, UNPROVIDED)) {
                                                                                    module = $MAL_ARG_WRT_INTER_ARG_NOT_ISA;
                                                                                    result = T;
                                                                                    doneP = at_utilities.at_finishedP(result);
                                                                                } else {
                                                                                    if (NIL != at_defns.defns_admitP(dep_arg_isa, dep_arg, UNPROVIDED)) {
                                                                                        module = $MAL_ARG_WRT_INTER_ARG_NOT_DEFN;
                                                                                        result = T;
                                                                                        doneP = at_utilities.at_finishedP(result);
                                                                                    }
                                                                                }
                                                                                if (NIL != module) {
                                                                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                        com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.inter_arg_violations(module, reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_isa));
                                                                                        com.cyc.cycjava.cycl.at_routines.note_at_violations(wff.wff_violations());
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list_alt36);
                                                                    }
                                                                }
                                                            } finally {
                                                                at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_1_75, thread);
                                                                wff_vars.$wff_violations$.rebind(_prev_bind_0_74, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_73, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_72, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
                        $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * the inter-arg-not-isa collections applicable to arg number
     * <argnum> of relation <reln> that do not include <arg>
     */
    @LispMethod(comment = "the inter-arg-not-isa collections applicable to arg number\r\n<argnum> of relation <reln> that do not include <arg>\nthe inter-arg-not-isa collections applicable to arg number\n<argnum> of relation <reln> that do not include <arg>")
    public static SubLObject mal_inter_arg_not_isaP(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((((NIL == at_vars.$at_check_inter_arg_not_isaP$.getDynamicValue(thread)) || (NIL == reln)) || (NIL == ind_arg)) || (NIL == dep_arg)) || (!ind_argnum.isInteger())) {
            return NIL;
        }
        if (NIL == some_inter_arg_not_isa_constraint_somewhereP(reln)) {
            return NIL;
        }
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
        try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if (reln.eql($$Quote)) {
                final SubLObject _prev_bind_0_$99 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                    cycl_grammar.$within_quote_form$.bind(T, thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$100 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$101 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_NOT_ISA, T);
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                            SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                            SubLObject inter_arg_not_isas = NIL;
                            inter_arg_not_isas = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                final SubLObject _prev_bind_0_$101 = wff_vars.$wff_violations$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$102 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                                try {
                                    wff_vars.$wff_violations$.bind(NIL, thread);
                                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                                    SubLObject current;
                                    final SubLObject datum = current = inter_arg_not_isas;
                                    SubLObject ind_arg_isa = NIL;
                                    SubLObject dep_arg_isa = NIL;
                                    destructuring_bind_must_consp(current, datum, $list41);
                                    ind_arg_isa = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list41);
                                    dep_arg_isa = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (NIL != forts.fort_p(dep_arg_isa)) {
                                            SubLObject module = NIL;
                                            if (NIL != isa.isaP(dep_arg, dep_arg_isa, UNPROVIDED, UNPROVIDED)) {
                                                module = $MAL_ARG_WRT_INTER_ARG_NOT_ISA;
                                                result = T;
                                                doneP = at_utilities.at_finishedP(result);
                                            } else
                                                if (NIL != at_defns.defns_admitP(dep_arg_isa, dep_arg, UNPROVIDED)) {
                                                    module = $MAL_ARG_WRT_INTER_ARG_NOT_DEFN;
                                                    result = T;
                                                    doneP = at_utilities.at_finishedP(result);
                                                }

                                            if ((NIL != module) && (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                                note_at_violations(inter_arg_violations(module, reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_isa));
                                                note_at_violations(wff.wff_violations());
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list41);
                                    }
                                } finally {
                                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_1_$102, thread);
                                    wff_vars.$wff_violations$.rebind(_prev_bind_0_$101, thread);
                                }
                                csome_list_var = csome_list_var.rest();
                                inter_arg_not_isas = csome_list_var.first();
                            } 
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$101, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$100, thread);
                    }
                } finally {
                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_$99, thread);
                }
            } else {
                final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$102 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_1_$103 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p2, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p2), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_NOT_ISA, T);
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                        SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue(thread);
                        SubLObject inter_arg_not_isas2 = NIL;
                        inter_arg_not_isas2 = csome_list_var2.first();
                        while ((NIL == doneP) && (NIL != csome_list_var2)) {
                            final SubLObject _prev_bind_0_$103 = wff_vars.$wff_violations$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$104 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                            try {
                                wff_vars.$wff_violations$.bind(NIL, thread);
                                at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                                SubLObject current2;
                                final SubLObject datum2 = current2 = inter_arg_not_isas2;
                                SubLObject ind_arg_isa2 = NIL;
                                SubLObject dep_arg_isa2 = NIL;
                                destructuring_bind_must_consp(current2, datum2, $list41);
                                ind_arg_isa2 = current2.first();
                                current2 = current2.rest();
                                destructuring_bind_must_consp(current2, datum2, $list41);
                                dep_arg_isa2 = current2.first();
                                current2 = current2.rest();
                                if (NIL == current2) {
                                    if (NIL != forts.fort_p(dep_arg_isa2)) {
                                        SubLObject module2 = NIL;
                                        if (NIL != isa.isaP(dep_arg, dep_arg_isa2, UNPROVIDED, UNPROVIDED)) {
                                            module2 = $MAL_ARG_WRT_INTER_ARG_NOT_ISA;
                                            result = T;
                                            doneP = at_utilities.at_finishedP(result);
                                        } else
                                            if (NIL != at_defns.defns_admitP(dep_arg_isa2, dep_arg, UNPROVIDED)) {
                                                module2 = $MAL_ARG_WRT_INTER_ARG_NOT_DEFN;
                                                result = T;
                                                doneP = at_utilities.at_finishedP(result);
                                            }

                                        if ((NIL != module2) && (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                            note_at_violations(inter_arg_violations(module2, reln, ind_arg, ind_argnum, ind_arg_isa2, dep_arg, dep_argnum, dep_arg_isa2));
                                            note_at_violations(wff.wff_violations());
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum2, $list41);
                                }
                            } finally {
                                at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_1_$104, thread);
                                wff_vars.$wff_violations$.rebind(_prev_bind_0_$103, thread);
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            inter_arg_not_isas2 = csome_list_var2.first();
                        } 
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_4, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$103, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$102, thread);
                }
            }
        } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_2, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject some_inter_arg_not_isa_constraint_somewhereP_alt(SubLObject reln) {
        return makeBoolean((NIL != somewhere_cache.some_pred_assertion_somewhereP($$interArgNotIsa1_2, reln, ONE_INTEGER, UNPROVIDED)) || (NIL != somewhere_cache.some_pred_assertion_somewhereP($$interArgNotIsa2_1, reln, ONE_INTEGER, UNPROVIDED)));
    }

    public static SubLObject some_inter_arg_not_isa_constraint_somewhereP(final SubLObject reln) {
        return makeBoolean((NIL != somewhere_cache.some_pred_assertion_somewhereP($$interArgNotIsa1_2, reln, ONE_INTEGER, UNPROVIDED)) || (NIL != somewhere_cache.some_pred_assertion_somewhereP($$interArgNotIsa2_1, reln, ONE_INTEGER, UNPROVIDED)));
    }

    public static SubLObject mal_inter_arg_not_genlP(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((((NIL == at_vars.$at_check_inter_arg_not_genlP$.getDynamicValue(thread)) || (NIL == reln)) || (NIL == ind_arg)) || (NIL == dep_arg)) || (!ind_argnum.isInteger())) {
            return NIL;
        }
        if (NIL == some_inter_arg_not_genl_constraint_somewhereP(reln)) {
            return NIL;
        }
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
        try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if (reln.eql($$Quote)) {
                final SubLObject _prev_bind_0_$108 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                    cycl_grammar.$within_quote_form$.bind(T, thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$109 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$110 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_NOT_GENL, T);
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                            SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                            SubLObject inter_arg_not_genls = NIL;
                            inter_arg_not_genls = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                SubLObject current;
                                final SubLObject datum = current = inter_arg_not_genls;
                                SubLObject ind_arg_genl = NIL;
                                SubLObject dep_arg_genl = NIL;
                                destructuring_bind_must_consp(current, datum, $list64);
                                ind_arg_genl = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list64);
                                dep_arg_genl = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL != forts.fort_p(dep_arg_genl)) {
                                        SubLObject module = NIL;
                                        if (NIL != genls.genlP(dep_arg, dep_arg_genl, UNPROVIDED, UNPROVIDED)) {
                                            module = $MAL_ARG_WRT_INTER_ARG_NOT_GENL;
                                            result = T;
                                            doneP = at_utilities.at_finishedP(result);
                                        } else
                                            if (NIL != at_defns.defns_admitP(dep_arg_genl, dep_arg, UNPROVIDED)) {
                                                module = $MAL_ARG_WRT_INTER_ARG_NOT_DEFN;
                                                result = T;
                                                doneP = at_utilities.at_finishedP(result);
                                            }

                                        if ((NIL != module) && (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                            note_at_violations(inter_arg_violations(module, reln, ind_arg, ind_argnum, ind_arg_genl, dep_arg, dep_argnum, dep_arg_genl));
                                            note_at_violations(wff.wff_violations());
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list64);
                                }
                                csome_list_var = csome_list_var.rest();
                                inter_arg_not_genls = csome_list_var.first();
                            } 
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$110, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$109, thread);
                    }
                } finally {
                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_$108, thread);
                }
            } else {
                final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$110 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_1_$111 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p2, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p2), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_NOT_GENL, T);
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                        SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue(thread);
                        SubLObject inter_arg_not_genls2 = NIL;
                        inter_arg_not_genls2 = csome_list_var2.first();
                        while ((NIL == doneP) && (NIL != csome_list_var2)) {
                            SubLObject current2;
                            final SubLObject datum2 = current2 = inter_arg_not_genls2;
                            SubLObject ind_arg_genl2 = NIL;
                            SubLObject dep_arg_genl2 = NIL;
                            destructuring_bind_must_consp(current2, datum2, $list64);
                            ind_arg_genl2 = current2.first();
                            current2 = current2.rest();
                            destructuring_bind_must_consp(current2, datum2, $list64);
                            dep_arg_genl2 = current2.first();
                            current2 = current2.rest();
                            if (NIL == current2) {
                                if (NIL != forts.fort_p(dep_arg_genl2)) {
                                    SubLObject module2 = NIL;
                                    if (NIL != genls.genlP(dep_arg, dep_arg_genl2, UNPROVIDED, UNPROVIDED)) {
                                        module2 = $MAL_ARG_WRT_INTER_ARG_NOT_GENL;
                                        result = T;
                                        doneP = at_utilities.at_finishedP(result);
                                    } else
                                        if (NIL != at_defns.defns_admitP(dep_arg_genl2, dep_arg, UNPROVIDED)) {
                                            module2 = $MAL_ARG_WRT_INTER_ARG_NOT_DEFN;
                                            result = T;
                                            doneP = at_utilities.at_finishedP(result);
                                        }

                                    if ((NIL != module2) && (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                        note_at_violations(inter_arg_violations(module2, reln, ind_arg, ind_argnum, ind_arg_genl2, dep_arg, dep_argnum, dep_arg_genl2));
                                        note_at_violations(wff.wff_violations());
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum2, $list64);
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            inter_arg_not_genls2 = csome_list_var2.first();
                        } 
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_4, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$111, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$110, thread);
                }
            }
        } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_2, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject some_inter_arg_not_genl_constraint_somewhereP(final SubLObject reln) {
        return somewhere_cache.some_pred_assertion_somewhereP($$interArgNotGenl1_2, reln, ONE_INTEGER, UNPROVIDED);
    }

    public static SubLObject mal_inter_arg_genl_isaP(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((((NIL == at_vars.$at_check_inter_arg_genl_isaP$.getDynamicValue(thread)) || (NIL == reln)) || (NIL == ind_arg)) || (NIL == dep_arg)) || (!ind_argnum.isInteger())) {
            return NIL;
        }
        if (NIL == some_inter_arg_genl_isa_constraint_somewhereP(reln)) {
            return NIL;
        }
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
        try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if (reln.eql($$Quote)) {
                final SubLObject _prev_bind_0_$113 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                    cycl_grammar.$within_quote_form$.bind(T, thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$114 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$115 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_GENL_ISA, T);
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                            SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                            SubLObject inter_arg_genl_isas = NIL;
                            inter_arg_genl_isas = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                SubLObject current;
                                final SubLObject datum = current = inter_arg_genl_isas;
                                SubLObject ind_arg_genl = NIL;
                                SubLObject dep_arg_isa = NIL;
                                destructuring_bind_must_consp(current, datum, $list75);
                                ind_arg_genl = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list75);
                                dep_arg_isa = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL != forts.fort_p(dep_arg_isa)) {
                                        SubLObject module = NIL;
                                        if (NIL == isa.isaP(dep_arg, dep_arg_isa, UNPROVIDED, UNPROVIDED)) {
                                            module = $MAL_ARG_WRT_INTER_ARG_GENL_ISA;
                                            result = T;
                                            doneP = at_utilities.at_finishedP(result);
                                        } else
                                            if (NIL == at_defns.defns_admitP(dep_arg_isa, dep_arg, UNPROVIDED)) {
                                                module = $MAL_ARG_WRT_INTER_ARG_GENL_ISA;
                                                result = T;
                                                doneP = at_utilities.at_finishedP(result);
                                            }

                                        if ((NIL != module) && (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                            note_at_violations(inter_arg_violations(module, reln, ind_arg, ind_argnum, ind_arg_genl, dep_arg, dep_argnum, dep_arg_isa));
                                            note_at_violations(wff.wff_violations());
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list75);
                                }
                                csome_list_var = csome_list_var.rest();
                                inter_arg_genl_isas = csome_list_var.first();
                            } 
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$115, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$114, thread);
                    }
                } finally {
                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_$113, thread);
                }
            } else {
                final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$115 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_1_$116 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p2, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p2), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_GENL_ISA, T);
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                        SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue(thread);
                        SubLObject inter_arg_genl_isas2 = NIL;
                        inter_arg_genl_isas2 = csome_list_var2.first();
                        while ((NIL == doneP) && (NIL != csome_list_var2)) {
                            SubLObject current2;
                            final SubLObject datum2 = current2 = inter_arg_genl_isas2;
                            SubLObject ind_arg_genl2 = NIL;
                            SubLObject dep_arg_isa2 = NIL;
                            destructuring_bind_must_consp(current2, datum2, $list75);
                            ind_arg_genl2 = current2.first();
                            current2 = current2.rest();
                            destructuring_bind_must_consp(current2, datum2, $list75);
                            dep_arg_isa2 = current2.first();
                            current2 = current2.rest();
                            if (NIL == current2) {
                                if (NIL != forts.fort_p(dep_arg_isa2)) {
                                    SubLObject module2 = NIL;
                                    if (NIL == isa.isaP(dep_arg, dep_arg_isa2, UNPROVIDED, UNPROVIDED)) {
                                        module2 = $MAL_ARG_WRT_INTER_ARG_GENL_ISA;
                                        result = T;
                                        doneP = at_utilities.at_finishedP(result);
                                    } else
                                        if (NIL == at_defns.defns_admitP(dep_arg_isa2, dep_arg, UNPROVIDED)) {
                                            module2 = $MAL_ARG_WRT_INTER_ARG_GENL_ISA;
                                            result = T;
                                            doneP = at_utilities.at_finishedP(result);
                                        }

                                    if ((NIL != module2) && (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                        note_at_violations(inter_arg_violations(module2, reln, ind_arg, ind_argnum, ind_arg_genl2, dep_arg, dep_argnum, dep_arg_isa2));
                                        note_at_violations(wff.wff_violations());
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum2, $list75);
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            inter_arg_genl_isas2 = csome_list_var2.first();
                        } 
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_4, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$116, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$115, thread);
                }
            }
        } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_2, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject some_inter_arg_genl_isa_constraint_somewhereP(final SubLObject reln) {
        return somewhere_cache.some_pred_assertion_somewhereP($$interArgGenlIsa2_1, reln, ONE_INTEGER, UNPROVIDED);
    }

    public static SubLObject mal_inter_arg_isa_genlP(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((((NIL == at_vars.$at_check_inter_arg_isa_genlP$.getDynamicValue(thread)) || (NIL == reln)) || (NIL == ind_arg)) || (NIL == dep_arg)) || (!ind_argnum.isInteger())) {
            return NIL;
        }
        if (NIL == some_inter_arg_isa_genl_constraint_somewhereP(reln)) {
            return NIL;
        }
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
        try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if (reln.eql($$Quote)) {
                final SubLObject _prev_bind_0_$118 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                    cycl_grammar.$within_quote_form$.bind(T, thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$119 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$120 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_ISA_GENL, T);
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                            SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                            SubLObject inter_arg_isa_genls = NIL;
                            inter_arg_isa_genls = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                SubLObject current;
                                final SubLObject datum = current = inter_arg_isa_genls;
                                SubLObject ind_arg_isa = NIL;
                                SubLObject dep_arg_genl = NIL;
                                destructuring_bind_must_consp(current, datum, $list79);
                                ind_arg_isa = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list79);
                                dep_arg_genl = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL != forts.fort_p(dep_arg_genl)) {
                                        SubLObject module = NIL;
                                        if (NIL == genls.genlP(dep_arg, dep_arg_genl, UNPROVIDED, UNPROVIDED)) {
                                            module = $MAL_ARG_WRT_INTER_ARG_ISA_GENL;
                                            result = T;
                                            doneP = at_utilities.at_finishedP(result);
                                        }
                                        if ((NIL != module) && (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                            note_at_violations(inter_arg_violations(module, reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_genl));
                                            note_at_violations(wff.wff_violations());
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list79);
                                }
                                csome_list_var = csome_list_var.rest();
                                inter_arg_isa_genls = csome_list_var.first();
                            } 
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$120, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$119, thread);
                    }
                } finally {
                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_$118, thread);
                }
            } else {
                final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$120 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_1_$121 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p2, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p2), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_ISA_GENL, T);
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                        SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue(thread);
                        SubLObject inter_arg_isa_genls2 = NIL;
                        inter_arg_isa_genls2 = csome_list_var2.first();
                        while ((NIL == doneP) && (NIL != csome_list_var2)) {
                            SubLObject current2;
                            final SubLObject datum2 = current2 = inter_arg_isa_genls2;
                            SubLObject ind_arg_isa2 = NIL;
                            SubLObject dep_arg_genl2 = NIL;
                            destructuring_bind_must_consp(current2, datum2, $list79);
                            ind_arg_isa2 = current2.first();
                            current2 = current2.rest();
                            destructuring_bind_must_consp(current2, datum2, $list79);
                            dep_arg_genl2 = current2.first();
                            current2 = current2.rest();
                            if (NIL == current2) {
                                if (NIL != forts.fort_p(dep_arg_genl2)) {
                                    SubLObject module2 = NIL;
                                    if (NIL == genls.genlP(dep_arg, dep_arg_genl2, UNPROVIDED, UNPROVIDED)) {
                                        module2 = $MAL_ARG_WRT_INTER_ARG_ISA_GENL;
                                        result = T;
                                        doneP = at_utilities.at_finishedP(result);
                                    }
                                    if ((NIL != module2) && (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                        note_at_violations(inter_arg_violations(module2, reln, ind_arg, ind_argnum, ind_arg_isa2, dep_arg, dep_argnum, dep_arg_genl2));
                                        note_at_violations(wff.wff_violations());
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum2, $list79);
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            inter_arg_isa_genls2 = csome_list_var2.first();
                        } 
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_4, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$121, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$120, thread);
                }
            }
        } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_2, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject some_inter_arg_isa_genl_constraint_somewhereP(final SubLObject reln) {
        return makeBoolean((((NIL != somewhere_cache.some_pred_assertion_somewhereP($$interArgIsaGenl1_2, reln, ONE_INTEGER, UNPROVIDED)) || (NIL != somewhere_cache.some_pred_assertion_somewhereP($$interArgIsaGenl2_1, reln, ONE_INTEGER, UNPROVIDED))) || (NIL != somewhere_cache.some_pred_assertion_somewhereP($$interArgIsaGenl2_3, reln, ONE_INTEGER, UNPROVIDED))) || (NIL != somewhere_cache.some_pred_assertion_somewhereP($$interArgIsaGenl3_2, reln, ONE_INTEGER, UNPROVIDED)));
    }

    /**
     * the inter-arg-isa collections applicable to arg number
     * <argnum> of relation <reln> that are known to not include <arg>
     */
    @LispMethod(comment = "the inter-arg-isa collections applicable to arg number\r\n<argnum> of relation <reln> that are known to not include <arg>\nthe inter-arg-isa collections applicable to arg number\n<argnum> of relation <reln> that are known to not include <arg>")
    public static final SubLObject mal_inter_arg_not_isa_disjointP_alt(SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject dep_arg, SubLObject dep_argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((((NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread)) && (NIL != at_vars.$at_check_not_isa_disjointP$.getDynamicValue(thread))) && (NIL != ind_arg)) && ind_argnum.isInteger())) {
                return NIL;
            }
            if (!((NIL == at_utilities.inter_arg_isa_cache_initializedP()) || (NIL != at_utilities.some_inter_arg_isa_constraint_somewhereP(reln)))) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                SubLObject doneP = NIL;
                {
                    SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
                    try {
                        $at_applicable_arg_types$.bind(NIL, thread);
                        $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
                        if (reln == $$Quote) {
                            {
                                SubLObject _prev_bind_0_99 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                                try {
                                    cycl_grammar.$within_quote_form$.bind(T, thread);
                                    {
                                        SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                        {
                                            SubLObject _prev_bind_0_100 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                            SubLObject _prev_bind_1_101 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                com.cyc.cycjava.cycl.at_routines.applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_ISA, at_vars.$at_check_non_constant_inter_arg_isaP$.getDynamicValue(thread));
                                                if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                                    if (NIL == doneP) {
                                                        {
                                                            SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                            SubLObject inter_arg_isas = NIL;
                                                            for (inter_arg_isas = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , inter_arg_isas = csome_list_var.first()) {
                                                                {
                                                                    SubLObject datum = inter_arg_isas;
                                                                    SubLObject current = datum;
                                                                    SubLObject ind_arg_isa = NIL;
                                                                    SubLObject dep_arg_isa = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list_alt36);
                                                                    ind_arg_isa = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list_alt36);
                                                                    dep_arg_isa = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != forts.fort_p(dep_arg_isa)) {
                                                                            {
                                                                                SubLObject isa_collections = com.cyc.cycjava.cycl.at_routines.arg_collections(dep_arg, $ISA, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                                                                                if (NIL != disjoint_with.any_disjoint_withP(isa_collections, dep_arg_isa, UNPROVIDED, UNPROVIDED)) {
                                                                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                        com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.inter_arg_not_isa_disjoint_violations(reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_isa));
                                                                                    }
                                                                                    result = T;
                                                                                    doneP = at_utilities.at_finishedP(result);
                                                                                }
                                                                            }
                                                                            {
                                                                                SubLObject _prev_bind_0_102 = wff_vars.$wff_violations$.currentBinding(thread);
                                                                                try {
                                                                                    wff_vars.$wff_violations$.bind(NIL, thread);
                                                                                    if (NIL == doneP) {
                                                                                        if (($NAUT == at_vars.$at_arg_type$.getDynamicValue(thread)) && (NIL != cycl_utilities.formula_find_if(symbol_function($sym19$VARIABLE_TERM_WRT_ARG_TYPE_), dep_arg, UNPROVIDED, UNPROVIDED))) {
                                                                                        } else {
                                                                                            if (NIL != at_defns.defns_rejectP(dep_arg_isa, dep_arg, UNPROVIDED)) {
                                                                                                if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                                    com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.inter_arg_not_isa_disjoint_violations(reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_isa));
                                                                                                    com.cyc.cycjava.cycl.at_routines.note_at_violations(wff.wff_violations());
                                                                                                }
                                                                                                result = T;
                                                                                                doneP = at_utilities.at_finishedP(result);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    wff_vars.$wff_violations$.rebind(_prev_bind_0_102, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list_alt36);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_101, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_100, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_99, thread);
                                }
                            }
                        } else {
                            {
                                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                {
                                    SubLObject _prev_bind_0_103 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                    SubLObject _prev_bind_1_104 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                        com.cyc.cycjava.cycl.at_routines.applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_ISA, at_vars.$at_check_non_constant_inter_arg_isaP$.getDynamicValue(thread));
                                        if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                            if (NIL == doneP) {
                                                {
                                                    SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                    SubLObject inter_arg_isas = NIL;
                                                    for (inter_arg_isas = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , inter_arg_isas = csome_list_var.first()) {
                                                        {
                                                            SubLObject datum = inter_arg_isas;
                                                            SubLObject current = datum;
                                                            SubLObject ind_arg_isa = NIL;
                                                            SubLObject dep_arg_isa = NIL;
                                                            destructuring_bind_must_consp(current, datum, $list_alt36);
                                                            ind_arg_isa = current.first();
                                                            current = current.rest();
                                                            destructuring_bind_must_consp(current, datum, $list_alt36);
                                                            dep_arg_isa = current.first();
                                                            current = current.rest();
                                                            if (NIL == current) {
                                                                if (NIL != forts.fort_p(dep_arg_isa)) {
                                                                    {
                                                                        SubLObject isa_collections = com.cyc.cycjava.cycl.at_routines.arg_collections(dep_arg, $ISA, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                                                                        if (NIL != disjoint_with.any_disjoint_withP(isa_collections, dep_arg_isa, UNPROVIDED, UNPROVIDED)) {
                                                                            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.inter_arg_not_isa_disjoint_violations(reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_isa));
                                                                            }
                                                                            result = T;
                                                                            doneP = at_utilities.at_finishedP(result);
                                                                        }
                                                                    }
                                                                    {
                                                                        SubLObject _prev_bind_0_105 = wff_vars.$wff_violations$.currentBinding(thread);
                                                                        try {
                                                                            wff_vars.$wff_violations$.bind(NIL, thread);
                                                                            if (NIL == doneP) {
                                                                                if (($NAUT == at_vars.$at_arg_type$.getDynamicValue(thread)) && (NIL != cycl_utilities.formula_find_if(symbol_function($sym19$VARIABLE_TERM_WRT_ARG_TYPE_), dep_arg, UNPROVIDED, UNPROVIDED))) {
                                                                                } else {
                                                                                    if (NIL != at_defns.defns_rejectP(dep_arg_isa, dep_arg, UNPROVIDED)) {
                                                                                        if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                            com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.inter_arg_not_isa_disjoint_violations(reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_isa));
                                                                                            com.cyc.cycjava.cycl.at_routines.note_at_violations(wff.wff_violations());
                                                                                        }
                                                                                        result = T;
                                                                                        doneP = at_utilities.at_finishedP(result);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            wff_vars.$wff_violations$.rebind(_prev_bind_0_105, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum, $list_alt36);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_104, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_103, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
                        $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * the inter-arg-isa collections applicable to arg number
     * <argnum> of relation <reln> that are known to not include <arg>
     */
    @LispMethod(comment = "the inter-arg-isa collections applicable to arg number\r\n<argnum> of relation <reln> that are known to not include <arg>\nthe inter-arg-isa collections applicable to arg number\n<argnum> of relation <reln> that are known to not include <arg>")
    public static SubLObject mal_inter_arg_not_isa_disjointP(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((((NIL == at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread)) || (NIL == at_vars.$at_check_not_isa_disjointP$.getDynamicValue(thread))) || (NIL == ind_arg)) || (!ind_argnum.isInteger())) {
            return NIL;
        }
        if ((NIL != at_utilities.inter_arg_isa_cache_initializedP()) && (NIL == at_utilities.some_inter_arg_isa_constraint_somewhereP(reln))) {
            return NIL;
        }
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
        try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if (reln.eql($$Quote)) {
                final SubLObject _prev_bind_0_$123 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                    cycl_grammar.$within_quote_form$.bind(T, thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$124 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$125 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_ISA, at_vars.$at_check_non_constant_inter_arg_isaP$.getDynamicValue(thread));
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                            SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                            SubLObject inter_arg_isas = NIL;
                            inter_arg_isas = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                SubLObject current;
                                final SubLObject datum = current = inter_arg_isas;
                                SubLObject ind_arg_isa = NIL;
                                SubLObject dep_arg_isa = NIL;
                                destructuring_bind_must_consp(current, datum, $list41);
                                ind_arg_isa = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list41);
                                dep_arg_isa = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL != forts.fort_p(dep_arg_isa)) {
                                        final SubLObject isa_collections = arg_collections(dep_arg, $ISA, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                                        if (NIL != disjoint_with.any_disjoint_withP(isa_collections, dep_arg_isa, UNPROVIDED, UNPROVIDED)) {
                                            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                note_at_violations(inter_arg_not_isa_disjoint_violations(reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_isa));
                                            }
                                            result = T;
                                            doneP = at_utilities.at_finishedP(result);
                                        }
                                        final SubLObject _prev_bind_0_$125 = wff_vars.$wff_violations$.currentBinding(thread);
                                        try {
                                            wff_vars.$wff_violations$.bind(NIL, thread);
                                            if (NIL == doneP) {
                                                if (($NAUT != at_vars.$at_arg_type$.getDynamicValue(thread)) || (NIL == cycl_utilities.formula_find_if(symbol_function($sym23$VARIABLE_TERM_WRT_ARG_TYPE_), dep_arg, UNPROVIDED, UNPROVIDED))) {
                                                    if (NIL != at_defns.defns_rejectP(dep_arg_isa, dep_arg, UNPROVIDED)) {
                                                        if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                            note_at_violations(inter_arg_not_isa_disjoint_violations(reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_isa));
                                                            note_at_violations(wff.wff_violations());
                                                        }
                                                        result = T;
                                                        doneP = at_utilities.at_finishedP(result);
                                                    }
                                                }
                                            }
                                        } finally {
                                            wff_vars.$wff_violations$.rebind(_prev_bind_0_$125, thread);
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list41);
                                }
                                csome_list_var = csome_list_var.rest();
                                inter_arg_isas = csome_list_var.first();
                            } 
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$125, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$124, thread);
                    }
                } finally {
                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_$123, thread);
                }
            } else {
                final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$126 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_1_$126 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p2, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p2), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_ISA, at_vars.$at_check_non_constant_inter_arg_isaP$.getDynamicValue(thread));
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                        SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue(thread);
                        SubLObject inter_arg_isas2 = NIL;
                        inter_arg_isas2 = csome_list_var2.first();
                        while ((NIL == doneP) && (NIL != csome_list_var2)) {
                            SubLObject current2;
                            final SubLObject datum2 = current2 = inter_arg_isas2;
                            SubLObject ind_arg_isa2 = NIL;
                            SubLObject dep_arg_isa2 = NIL;
                            destructuring_bind_must_consp(current2, datum2, $list41);
                            ind_arg_isa2 = current2.first();
                            current2 = current2.rest();
                            destructuring_bind_must_consp(current2, datum2, $list41);
                            dep_arg_isa2 = current2.first();
                            current2 = current2.rest();
                            if (NIL == current2) {
                                if (NIL != forts.fort_p(dep_arg_isa2)) {
                                    final SubLObject isa_collections2 = arg_collections(dep_arg, $ISA, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                                    if (NIL != disjoint_with.any_disjoint_withP(isa_collections2, dep_arg_isa2, UNPROVIDED, UNPROVIDED)) {
                                        if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                            note_at_violations(inter_arg_not_isa_disjoint_violations(reln, ind_arg, ind_argnum, ind_arg_isa2, dep_arg, dep_argnum, dep_arg_isa2));
                                        }
                                        result = T;
                                        doneP = at_utilities.at_finishedP(result);
                                    }
                                    final SubLObject _prev_bind_0_$127 = wff_vars.$wff_violations$.currentBinding(thread);
                                    try {
                                        wff_vars.$wff_violations$.bind(NIL, thread);
                                        if (NIL == doneP) {
                                            if (($NAUT != at_vars.$at_arg_type$.getDynamicValue(thread)) || (NIL == cycl_utilities.formula_find_if(symbol_function($sym23$VARIABLE_TERM_WRT_ARG_TYPE_), dep_arg, UNPROVIDED, UNPROVIDED))) {
                                                if (NIL != at_defns.defns_rejectP(dep_arg_isa2, dep_arg, UNPROVIDED)) {
                                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                        note_at_violations(inter_arg_not_isa_disjoint_violations(reln, ind_arg, ind_argnum, ind_arg_isa2, dep_arg, dep_argnum, dep_arg_isa2));
                                                        note_at_violations(wff.wff_violations());
                                                    }
                                                    result = T;
                                                    doneP = at_utilities.at_finishedP(result);
                                                }
                                            }
                                        }
                                    } finally {
                                        wff_vars.$wff_violations$.rebind(_prev_bind_0_$127, thread);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum2, $list41);
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            inter_arg_isas2 = csome_list_var2.first();
                        } 
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_4, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$126, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$126, thread);
                }
            }
        } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_2, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject inter_arg_not_isa_disjoint_violations_alt(SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject ind_arg_isa, SubLObject dep_arg, SubLObject dep_argnum, SubLObject dep_arg_isa) {
        return com.cyc.cycjava.cycl.at_routines.inter_arg_violations($MAL_ARG_WRT_INTER_ARG_NOT_ISA_DISJOINT, reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_isa);
    }

    public static SubLObject inter_arg_not_isa_disjoint_violations(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject ind_arg_isa, final SubLObject dep_arg, final SubLObject dep_argnum, final SubLObject dep_arg_isa) {
        return inter_arg_violations($MAL_ARG_WRT_INTER_ARG_NOT_ISA_DISJOINT, reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_isa);
    }

    /**
     * the inter-arg-genl collections applicable to arg number
     * <argnum> of relation <reln> that are known to not include <arg>
     */
    @LispMethod(comment = "the inter-arg-genl collections applicable to arg number\r\n<argnum> of relation <reln> that are known to not include <arg>\nthe inter-arg-genl collections applicable to arg number\n<argnum> of relation <reln> that are known to not include <arg>")
    public static final SubLObject mal_inter_arg_not_genl_disjointP_alt(SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject dep_arg, SubLObject dep_argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((((NIL != at_vars.$at_check_inter_arg_genlP$.getDynamicValue(thread)) && (NIL != at_vars.$at_check_not_genls_disjointP$.getDynamicValue(thread))) && (NIL != ind_arg)) && ind_argnum.isInteger())) {
                return NIL;
            }
            if (NIL == com.cyc.cycjava.cycl.at_routines.some_inter_arg_genl_constraint_somewhereP(reln)) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                SubLObject doneP = NIL;
                {
                    SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
                    try {
                        $at_applicable_arg_types$.bind(NIL, thread);
                        $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
                        if (reln == $$Quote) {
                            {
                                SubLObject _prev_bind_0_106 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                                try {
                                    cycl_grammar.$within_quote_form$.bind(T, thread);
                                    {
                                        SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                        {
                                            SubLObject _prev_bind_0_107 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                            SubLObject _prev_bind_1_108 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                com.cyc.cycjava.cycl.at_routines.applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_GENL, at_vars.$at_check_non_constant_inter_arg_genlP$.getDynamicValue(thread));
                                                if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                                    if (NIL == doneP) {
                                                        {
                                                            SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                            SubLObject inter_arg_genls = NIL;
                                                            for (inter_arg_genls = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , inter_arg_genls = csome_list_var.first()) {
                                                                {
                                                                    SubLObject datum = inter_arg_genls;
                                                                    SubLObject current = datum;
                                                                    SubLObject ind_arg_genl = NIL;
                                                                    SubLObject dep_arg_genl = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list_alt63);
                                                                    ind_arg_genl = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list_alt63);
                                                                    dep_arg_genl = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != forts.fort_p(dep_arg_genl)) {
                                                                            {
                                                                                SubLObject genl_collections = com.cyc.cycjava.cycl.at_routines.arg_collections(dep_arg, $GENLS, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                                                                                if (NIL != disjoint_with.any_disjoint_withP(genl_collections, dep_arg_genl, UNPROVIDED, UNPROVIDED)) {
                                                                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                        com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.inter_arg_not_genl_disjoint_violations(reln, ind_arg, ind_argnum, ind_arg_genl, dep_arg, dep_argnum, dep_arg_genl));
                                                                                    }
                                                                                    result = T;
                                                                                    doneP = at_utilities.at_finishedP(result);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list_alt63);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_108, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_107, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_106, thread);
                                }
                            }
                        } else {
                            {
                                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                {
                                    SubLObject _prev_bind_0_109 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                    SubLObject _prev_bind_1_110 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                        com.cyc.cycjava.cycl.at_routines.applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_GENL, at_vars.$at_check_non_constant_inter_arg_genlP$.getDynamicValue(thread));
                                        if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                            if (NIL == doneP) {
                                                {
                                                    SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                    SubLObject inter_arg_genls = NIL;
                                                    for (inter_arg_genls = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , inter_arg_genls = csome_list_var.first()) {
                                                        {
                                                            SubLObject datum = inter_arg_genls;
                                                            SubLObject current = datum;
                                                            SubLObject ind_arg_genl = NIL;
                                                            SubLObject dep_arg_genl = NIL;
                                                            destructuring_bind_must_consp(current, datum, $list_alt63);
                                                            ind_arg_genl = current.first();
                                                            current = current.rest();
                                                            destructuring_bind_must_consp(current, datum, $list_alt63);
                                                            dep_arg_genl = current.first();
                                                            current = current.rest();
                                                            if (NIL == current) {
                                                                if (NIL != forts.fort_p(dep_arg_genl)) {
                                                                    {
                                                                        SubLObject genl_collections = com.cyc.cycjava.cycl.at_routines.arg_collections(dep_arg, $GENLS, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                                                                        if (NIL != disjoint_with.any_disjoint_withP(genl_collections, dep_arg_genl, UNPROVIDED, UNPROVIDED)) {
                                                                            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.inter_arg_not_genl_disjoint_violations(reln, ind_arg, ind_argnum, ind_arg_genl, dep_arg, dep_argnum, dep_arg_genl));
                                                                            }
                                                                            result = T;
                                                                            doneP = at_utilities.at_finishedP(result);
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum, $list_alt63);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_110, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_109, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
                        $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * the inter-arg-genl collections applicable to arg number
     * <argnum> of relation <reln> that are known to not include <arg>
     */
    @LispMethod(comment = "the inter-arg-genl collections applicable to arg number\r\n<argnum> of relation <reln> that are known to not include <arg>\nthe inter-arg-genl collections applicable to arg number\n<argnum> of relation <reln> that are known to not include <arg>")
    public static SubLObject mal_inter_arg_not_genl_disjointP(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((((NIL == at_vars.$at_check_inter_arg_genlP$.getDynamicValue(thread)) || (NIL == at_vars.$at_check_not_genls_disjointP$.getDynamicValue(thread))) || (NIL == ind_arg)) || (!ind_argnum.isInteger())) {
            return NIL;
        }
        if (NIL == some_inter_arg_genl_constraint_somewhereP(reln)) {
            return NIL;
        }
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
        try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if (reln.eql($$Quote)) {
                final SubLObject _prev_bind_0_$130 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                    cycl_grammar.$within_quote_form$.bind(T, thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$131 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$132 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_GENL, at_vars.$at_check_non_constant_inter_arg_genlP$.getDynamicValue(thread));
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                            SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                            SubLObject inter_arg_genls = NIL;
                            inter_arg_genls = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                SubLObject current;
                                final SubLObject datum = current = inter_arg_genls;
                                SubLObject ind_arg_genl = NIL;
                                SubLObject dep_arg_genl = NIL;
                                destructuring_bind_must_consp(current, datum, $list64);
                                ind_arg_genl = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list64);
                                dep_arg_genl = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL != forts.fort_p(dep_arg_genl)) {
                                        final SubLObject genl_collections = arg_collections(dep_arg, $GENLS, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                                        if (NIL != disjoint_with.any_disjoint_withP(genl_collections, dep_arg_genl, UNPROVIDED, UNPROVIDED)) {
                                            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                note_at_violations(inter_arg_not_genl_disjoint_violations(reln, ind_arg, ind_argnum, ind_arg_genl, dep_arg, dep_argnum, dep_arg_genl));
                                            }
                                            result = T;
                                            doneP = at_utilities.at_finishedP(result);
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list64);
                                }
                                csome_list_var = csome_list_var.rest();
                                inter_arg_genls = csome_list_var.first();
                            } 
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$132, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$131, thread);
                    }
                } finally {
                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_$130, thread);
                }
            } else {
                final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$132 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_1_$133 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p2, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p2), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_GENL, at_vars.$at_check_non_constant_inter_arg_genlP$.getDynamicValue(thread));
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                        SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue(thread);
                        SubLObject inter_arg_genls2 = NIL;
                        inter_arg_genls2 = csome_list_var2.first();
                        while ((NIL == doneP) && (NIL != csome_list_var2)) {
                            SubLObject current2;
                            final SubLObject datum2 = current2 = inter_arg_genls2;
                            SubLObject ind_arg_genl2 = NIL;
                            SubLObject dep_arg_genl2 = NIL;
                            destructuring_bind_must_consp(current2, datum2, $list64);
                            ind_arg_genl2 = current2.first();
                            current2 = current2.rest();
                            destructuring_bind_must_consp(current2, datum2, $list64);
                            dep_arg_genl2 = current2.first();
                            current2 = current2.rest();
                            if (NIL == current2) {
                                if (NIL != forts.fort_p(dep_arg_genl2)) {
                                    final SubLObject genl_collections2 = arg_collections(dep_arg, $GENLS, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                                    if (NIL != disjoint_with.any_disjoint_withP(genl_collections2, dep_arg_genl2, UNPROVIDED, UNPROVIDED)) {
                                        if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                            note_at_violations(inter_arg_not_genl_disjoint_violations(reln, ind_arg, ind_argnum, ind_arg_genl2, dep_arg, dep_argnum, dep_arg_genl2));
                                        }
                                        result = T;
                                        doneP = at_utilities.at_finishedP(result);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum2, $list64);
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            inter_arg_genls2 = csome_list_var2.first();
                        } 
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_4, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$133, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$132, thread);
                }
            }
        } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_2, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject inter_arg_not_genl_disjoint_violations_alt(SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject ind_arg_genl, SubLObject dep_arg, SubLObject dep_argnum, SubLObject dep_arg_genl) {
        return com.cyc.cycjava.cycl.at_routines.inter_arg_violations($MAL_ARG_WRT_INTER_ARG_NOT_GENL_DISJOINT, reln, ind_arg, ind_argnum, ind_arg_genl, dep_arg, dep_argnum, dep_arg_genl);
    }

    public static SubLObject inter_arg_not_genl_disjoint_violations(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject ind_arg_genl, final SubLObject dep_arg, final SubLObject dep_argnum, final SubLObject dep_arg_genl) {
        return inter_arg_violations($MAL_ARG_WRT_INTER_ARG_NOT_GENL_DISJOINT, reln, ind_arg, ind_argnum, ind_arg_genl, dep_arg, dep_argnum, dep_arg_genl);
    }

    /**
     * the inter-arg-format collections applicable to arg number
     * <argnum> of relation <reln> that do not include <arg>
     */
    @LispMethod(comment = "the inter-arg-format collections applicable to arg number\r\n<argnum> of relation <reln> that do not include <arg>\nthe inter-arg-format collections applicable to arg number\n<argnum> of relation <reln> that do not include <arg>")
    public static final SubLObject mal_inter_arg_formatP_alt(SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject dep_arg, SubLObject dep_argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!(((NIL != at_vars.$at_check_inter_arg_formatP$.getDynamicValue(thread)) && (NIL != ind_arg)) && ind_argnum.isInteger())) {
                return NIL;
            }
            if (!((NIL == at_utilities.inter_arg_format_cache_initializedP()) || (NIL != at_utilities.some_inter_arg_format_constraint_somewhereP(reln)))) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                SubLObject doneP = NIL;
                {
                    SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
                    try {
                        $at_applicable_arg_types$.bind(NIL, thread);
                        $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
                        if (reln == $$Quote) {
                            {
                                SubLObject _prev_bind_0_111 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                                try {
                                    cycl_grammar.$within_quote_form$.bind(T, thread);
                                    {
                                        SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                        {
                                            SubLObject _prev_bind_0_112 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                            SubLObject _prev_bind_1_113 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                com.cyc.cycjava.cycl.at_routines.applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_FORMAT, at_vars.$at_check_non_constant_inter_arg_formatP$.getDynamicValue(thread));
                                                if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                                    if (NIL == doneP) {
                                                        {
                                                            SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                            SubLObject inter_arg_format = NIL;
                                                            for (inter_arg_format = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , inter_arg_format = csome_list_var.first()) {
                                                                {
                                                                    SubLObject datum = inter_arg_format;
                                                                    SubLObject current = datum;
                                                                    SubLObject ind_arg_isa = NIL;
                                                                    SubLObject dep_arg_format = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list_alt68);
                                                                    ind_arg_isa = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list_alt68);
                                                                    dep_arg_format = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL == arg_type.memoized_format_okP(dep_arg_format, at_vars.$at_formula$.getDynamicValue(thread), dep_argnum, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                                                                            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.inter_arg_format_violations(reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_format));
                                                                            }
                                                                            result = T;
                                                                            doneP = at_utilities.at_finishedP(result);
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list_alt68);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_113, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_112, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_111, thread);
                                }
                            }
                        } else {
                            {
                                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                {
                                    SubLObject _prev_bind_0_114 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                    SubLObject _prev_bind_1_115 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                        com.cyc.cycjava.cycl.at_routines.applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_FORMAT, at_vars.$at_check_non_constant_inter_arg_formatP$.getDynamicValue(thread));
                                        if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                            if (NIL == doneP) {
                                                {
                                                    SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                    SubLObject inter_arg_format = NIL;
                                                    for (inter_arg_format = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , inter_arg_format = csome_list_var.first()) {
                                                        {
                                                            SubLObject datum = inter_arg_format;
                                                            SubLObject current = datum;
                                                            SubLObject ind_arg_isa = NIL;
                                                            SubLObject dep_arg_format = NIL;
                                                            destructuring_bind_must_consp(current, datum, $list_alt68);
                                                            ind_arg_isa = current.first();
                                                            current = current.rest();
                                                            destructuring_bind_must_consp(current, datum, $list_alt68);
                                                            dep_arg_format = current.first();
                                                            current = current.rest();
                                                            if (NIL == current) {
                                                                if (NIL == arg_type.memoized_format_okP(dep_arg_format, at_vars.$at_formula$.getDynamicValue(thread), dep_argnum, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                                                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                        com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.inter_arg_format_violations(reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_format));
                                                                    }
                                                                    result = T;
                                                                    doneP = at_utilities.at_finishedP(result);
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum, $list_alt68);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_115, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_114, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
                        $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * the inter-arg-format collections applicable to arg number
     * <argnum> of relation <reln> that do not include <arg>
     */
    @LispMethod(comment = "the inter-arg-format collections applicable to arg number\r\n<argnum> of relation <reln> that do not include <arg>\nthe inter-arg-format collections applicable to arg number\n<argnum> of relation <reln> that do not include <arg>")
    public static SubLObject mal_inter_arg_formatP(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == at_vars.$at_check_inter_arg_formatP$.getDynamicValue(thread)) || (NIL == ind_arg)) || (!ind_argnum.isInteger())) {
            return NIL;
        }
        if ((NIL != at_utilities.inter_arg_format_cache_initializedP()) && (NIL == at_utilities.some_inter_arg_format_constraint_somewhereP(reln))) {
            return NIL;
        }
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
        try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if (reln.eql($$Quote)) {
                final SubLObject _prev_bind_0_$135 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                    cycl_grammar.$within_quote_form$.bind(T, thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$136 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$137 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_FORMAT, at_vars.$at_check_non_constant_inter_arg_formatP$.getDynamicValue(thread));
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                            SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                            SubLObject inter_arg_format = NIL;
                            inter_arg_format = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                SubLObject current;
                                final SubLObject datum = current = inter_arg_format;
                                SubLObject ind_arg_isa = NIL;
                                SubLObject dep_arg_format = NIL;
                                destructuring_bind_must_consp(current, datum, $list88);
                                ind_arg_isa = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list88);
                                dep_arg_format = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL == arg_type.memoized_format_okP(dep_arg_format, at_vars.$at_formula$.getDynamicValue(thread), dep_argnum, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                                        if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                            note_at_violations(inter_arg_format_violations(reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_format));
                                        }
                                        result = T;
                                        doneP = at_utilities.at_finishedP(result);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list88);
                                }
                                csome_list_var = csome_list_var.rest();
                                inter_arg_format = csome_list_var.first();
                            } 
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$137, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$136, thread);
                    }
                } finally {
                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_$135, thread);
                }
            } else {
                final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$137 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_1_$138 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p2, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p2), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_FORMAT, at_vars.$at_check_non_constant_inter_arg_formatP$.getDynamicValue(thread));
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                        SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue(thread);
                        SubLObject inter_arg_format2 = NIL;
                        inter_arg_format2 = csome_list_var2.first();
                        while ((NIL == doneP) && (NIL != csome_list_var2)) {
                            SubLObject current2;
                            final SubLObject datum2 = current2 = inter_arg_format2;
                            SubLObject ind_arg_isa2 = NIL;
                            SubLObject dep_arg_format2 = NIL;
                            destructuring_bind_must_consp(current2, datum2, $list88);
                            ind_arg_isa2 = current2.first();
                            current2 = current2.rest();
                            destructuring_bind_must_consp(current2, datum2, $list88);
                            dep_arg_format2 = current2.first();
                            current2 = current2.rest();
                            if (NIL == current2) {
                                if (NIL == arg_type.memoized_format_okP(dep_arg_format2, at_vars.$at_formula$.getDynamicValue(thread), dep_argnum, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                        note_at_violations(inter_arg_format_violations(reln, ind_arg, ind_argnum, ind_arg_isa2, dep_arg, dep_argnum, dep_arg_format2));
                                    }
                                    result = T;
                                    doneP = at_utilities.at_finishedP(result);
                                }
                            } else {
                                cdestructuring_bind_error(datum2, $list88);
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            inter_arg_format2 = csome_list_var2.first();
                        } 
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_4, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$138, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$137, thread);
                }
            }
        } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_2, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject inter_arg_format_violations_alt(SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject ind_arg_isa, SubLObject dep_arg, SubLObject dep_argnum, SubLObject dep_arg_format) {
        return com.cyc.cycjava.cycl.at_routines.inter_arg_violations($MAL_ARG_WRT_INTER_ARG_FORMAT, reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_format);
    }

    public static SubLObject inter_arg_format_violations(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject ind_arg_isa, final SubLObject dep_arg, final SubLObject dep_argnum, final SubLObject dep_arg_format) {
        return inter_arg_violations($MAL_ARG_WRT_INTER_ARG_FORMAT, reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_format);
    }

    public static final SubLObject some_inter_arg_different_assertion_somewhereP_alt(SubLObject reln) {
        return somewhere_cache.some_pred_assertion_somewhereP($$interArgDifferent, reln, ONE_INTEGER, UNPROVIDED);
    }

    public static SubLObject some_inter_arg_different_assertion_somewhereP(final SubLObject reln) {
        return somewhere_cache.some_pred_assertion_somewhereP($$interArgDifferent, reln, ONE_INTEGER, UNPROVIDED);
    }

    public static final SubLObject some_inter_arg_different_constraint_somewhereP_alt(SubLObject reln) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject found_oneP = NIL;
                if (NIL != fort_types_interface.predicateP(reln)) {
                    if (NIL == found_oneP) {
                        {
                            SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
                            SubLObject node_var = reln;
                            SubLObject deck_type = ($DEPTH == $DEPTH) ? ((SubLObject) ($STACK)) : $QUEUE;
                            SubLObject recur_deck = deck.create_deck(deck_type);
                            SubLObject node_and_predicate_mode = NIL;
                            {
                                SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_116 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt54$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt54$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt54$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt59$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt54$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_117 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_118 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(reln, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_119 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_120 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_121 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                    node_and_predicate_mode = list(reln, sbhl_search_vars.genl_inverse_mode_p());
                                                                    while ((NIL != node_and_predicate_mode) && (NIL == found_oneP)) {
                                                                        {
                                                                            SubLObject node_var_122 = node_and_predicate_mode.first();
                                                                            SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                            SubLObject genl_pred = node_var_122;
                                                                            {
                                                                                SubLObject _prev_bind_0_123 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                                    {
                                                                                        SubLObject inverse_mode = predicate_mode;
                                                                                        if (NIL != com.cyc.cycjava.cycl.at_routines.some_inter_arg_different_assertion_somewhereP(genl_pred)) {
                                                                                            found_oneP = T;
                                                                                        }
                                                                                        {
                                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                                                                            SubLObject rest = NIL;
                                                                                            for (rest = accessible_modules; !((NIL != found_oneP) || (NIL == rest)); rest = rest.rest()) {
                                                                                                {
                                                                                                    SubLObject module_var = rest.first();
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_124 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                        SubLObject _prev_bind_1_125 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                            {
                                                                                                                SubLObject node = function_terms.naut_to_nart(node_var_122);
                                                                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                    {
                                                                                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != d_link) {
                                                                                                                            {
                                                                                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                if (NIL != mt_links) {
                                                                                                                                    {
                                                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                        while (!((NIL != found_oneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            {
                                                                                                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject _prev_bind_0_126 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                        try {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                            {
                                                                                                                                                                SubLObject iteration_state_127 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                while (!((NIL != found_oneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_127)))) {
                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_127);
                                                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject _prev_bind_0_128 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                try {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                    {
                                                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                        SubLObject rest_129 = NIL;
                                                                                                                                                                                        for (rest_129 = new_list; !((NIL != found_oneP) || (NIL == rest_129)); rest_129 = rest_129.rest()) {
                                                                                                                                                                                            {
                                                                                                                                                                                                SubLObject node_vars_link_node = rest_129.first();
                                                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                } finally {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_128, thread);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        iteration_state_127 = dictionary_contents.do_dictionary_contents_next(iteration_state_127);
                                                                                                                                                                    }
                                                                                                                                                                } 
                                                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_127);
                                                                                                                                                            }
                                                                                                                                                        } finally {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_126, thread);
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
                                                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt60$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                        {
                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                            SubLObject rest_130 = NIL;
                                                                                                                            for (rest_130 = new_list; !((NIL != found_oneP) || (NIL == rest_130)); rest_130 = rest_130.rest()) {
                                                                                                                                {
                                                                                                                                    SubLObject generating_fn = rest_130.first();
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_131 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                            {
                                                                                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                                SubLObject new_list_132 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                SubLObject rest_133 = NIL;
                                                                                                                                                for (rest_133 = new_list_132; !((NIL != found_oneP) || (NIL == rest_133)); rest_133 = rest_133.rest()) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject node_vars_link_node = rest_133.first();
                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_131, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } finally {
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_125, thread);
                                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_124, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_123, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_121, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_120, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_119, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt61$Node__a_does_not_pass_sbhl_type_t, reln, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_118, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_117, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_116, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } else {
                    found_oneP = com.cyc.cycjava.cycl.at_routines.some_inter_arg_different_assertion_somewhereP(reln);
                }
                return found_oneP;
            }
        }
    }

    public static SubLObject some_inter_arg_different_constraint_somewhereP(final SubLObject reln) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject found_oneP = NIL;
        if (NIL != fort_types_interface.predicateP(reln)) {
            if (NIL == found_oneP) {
                final SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
                final SubLObject deck_type = ($DEPTH == $DEPTH) ? $STACK : $QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$140 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str54$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str54$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str54$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str59$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str54$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$141 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$142 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(reln, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$142 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$143 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$145 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(reln, UNPROVIDED);
                                        for (node_and_predicate_mode = list(reln, sbhl_search_vars.genl_inverse_mode_p()); (NIL != node_and_predicate_mode) && (NIL == found_oneP); node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$146 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = second(node_and_predicate_mode);
                                            final SubLObject genl_pred = node_var_$146;
                                            final SubLObject _prev_bind_0_$143 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                final SubLObject inverse_mode = predicate_mode;
                                                if (NIL != some_inter_arg_different_assertion_somewhereP(genl_pred)) {
                                                    found_oneP = T;
                                                }
                                                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                                SubLObject rest;
                                                SubLObject module_var;
                                                SubLObject _prev_bind_0_$144;
                                                SubLObject _prev_bind_1_$144;
                                                SubLObject node;
                                                SubLObject d_link;
                                                SubLObject mt_links;
                                                SubLObject iteration_state;
                                                SubLObject mt;
                                                SubLObject tv_links;
                                                SubLObject _prev_bind_0_$145;
                                                SubLObject iteration_state_$151;
                                                SubLObject tv;
                                                SubLObject link_nodes;
                                                SubLObject _prev_bind_0_$146;
                                                SubLObject sol;
                                                SubLObject set_contents_var;
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                SubLObject csome_list_var;
                                                SubLObject node_vars_link_node2;
                                                SubLObject new_list;
                                                SubLObject rest_$153;
                                                SubLObject generating_fn;
                                                SubLObject _prev_bind_0_$147;
                                                SubLObject sol2;
                                                SubLObject link_nodes2;
                                                SubLObject set_contents_var2;
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject node_vars_link_node3;
                                                SubLObject csome_list_var2;
                                                SubLObject node_vars_link_node4;
                                                for (rest = NIL, rest = accessible_modules; (NIL == found_oneP) && (NIL != rest); rest = rest.rest()) {
                                                    module_var = rest.first();
                                                    _prev_bind_0_$144 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$144 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        node = function_terms.naut_to_nart(node_var_$146);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == found_oneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            _prev_bind_0_$145 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                for (iteration_state_$151 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == found_oneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$151)); iteration_state_$151 = dictionary_contents.do_dictionary_contents_next(iteration_state_$151)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$151);
                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        _prev_bind_0_$146 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == found_oneP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    if (NIL == found_oneP) {
                                                                                                        csome_list_var = sol;
                                                                                                        node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                        while ((NIL == found_oneP) && (NIL != csome_list_var)) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    }
                                                                                                } else {
                                                                                                    Errors.error($str60$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$146, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$151);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$145, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str61$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                for (rest_$153 = NIL, rest_$153 = new_list; (NIL == found_oneP) && (NIL != rest_$153); rest_$153 = rest_$153.rest()) {
                                                                    generating_fn = rest_$153.first();
                                                                    _prev_bind_0_$147 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            set_contents_var2 = set.do_set_internal(sol2);
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == found_oneP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                if (NIL == found_oneP) {
                                                                                    csome_list_var2 = sol2;
                                                                                    node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                    while ((NIL == found_oneP) && (NIL != csome_list_var2)) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                    } 
                                                                                }
                                                                            } else {
                                                                                Errors.error($str60$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$147, thread);
                                                                    }
                                                                }
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$144, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$144, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$143, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$145, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$143, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$142, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str62$Node__a_does_not_pass_sbhl_type_t, reln, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$142, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$141, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$140, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$148 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$148, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
        } else {
            found_oneP = some_inter_arg_different_assertion_somewhereP(reln);
        }
        return found_oneP;
    }

    public static final SubLObject mal_inter_arg_differentP_alt(SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject dep_arg, SubLObject dep_argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == at_vars.$at_check_inter_arg_differentP$.getDynamicValue(thread)) {
                return NIL;
            }
            if (NIL == com.cyc.cycjava.cycl.at_routines.some_inter_arg_different_constraint_somewhereP(reln)) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                SubLObject doneP = NIL;
                {
                    SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
                    try {
                        $at_applicable_arg_types$.bind(NIL, thread);
                        $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
                        if (reln == $$Quote) {
                            {
                                SubLObject _prev_bind_0_134 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                                try {
                                    cycl_grammar.$within_quote_form$.bind(T, thread);
                                    {
                                        SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                        {
                                            SubLObject _prev_bind_0_135 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                            SubLObject _prev_bind_1_136 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                com.cyc.cycjava.cycl.at_routines.applicable_inter_arg_type_pred_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_DIFFERENT, T);
                                                if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                                    if (NIL == doneP) {
                                                        {
                                                            SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                            SubLObject inter_arg_different = NIL;
                                                            for (inter_arg_different = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , inter_arg_different = csome_list_var.first()) {
                                                                {
                                                                    SubLObject datum = inter_arg_different;
                                                                    SubLObject current = datum;
                                                                    SubLObject argnum1 = NIL;
                                                                    SubLObject argnum2 = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list_alt72);
                                                                    argnum1 = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list_alt72);
                                                                    argnum2 = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if ((argnum1 == dep_argnum) && (argnum2 == ind_argnum)) {
                                                                            if (NIL != equals.equalsP(dep_arg, ind_arg, UNPROVIDED, UNPROVIDED)) {
                                                                                if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                    com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.inter_arg_different_violations(reln, ind_arg, ind_argnum, dep_arg, dep_argnum));
                                                                                }
                                                                                result = T;
                                                                                doneP = at_utilities.at_finishedP(result);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list_alt72);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_136, thread);
                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_135, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_134, thread);
                                }
                            }
                        } else {
                            {
                                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                {
                                    SubLObject _prev_bind_0_137 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                    SubLObject _prev_bind_1_138 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                        com.cyc.cycjava.cycl.at_routines.applicable_inter_arg_type_pred_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_DIFFERENT, T);
                                        if (NIL != $at_applicable_arg_types$.getDynamicValue(thread)) {
                                            if (NIL == doneP) {
                                                {
                                                    SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                                    SubLObject inter_arg_different = NIL;
                                                    for (inter_arg_different = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , inter_arg_different = csome_list_var.first()) {
                                                        {
                                                            SubLObject datum = inter_arg_different;
                                                            SubLObject current = datum;
                                                            SubLObject argnum1 = NIL;
                                                            SubLObject argnum2 = NIL;
                                                            destructuring_bind_must_consp(current, datum, $list_alt72);
                                                            argnum1 = current.first();
                                                            current = current.rest();
                                                            destructuring_bind_must_consp(current, datum, $list_alt72);
                                                            argnum2 = current.first();
                                                            current = current.rest();
                                                            if (NIL == current) {
                                                                if ((argnum1 == dep_argnum) && (argnum2 == ind_argnum)) {
                                                                    if (NIL != equals.equalsP(dep_arg, ind_arg, UNPROVIDED, UNPROVIDED)) {
                                                                        if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                            com.cyc.cycjava.cycl.at_routines.note_at_violations(com.cyc.cycjava.cycl.at_routines.inter_arg_different_violations(reln, ind_arg, ind_argnum, dep_arg, dep_argnum));
                                                                        }
                                                                        result = T;
                                                                        doneP = at_utilities.at_finishedP(result);
                                                                    }
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum, $list_alt72);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_138, thread);
                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_137, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
                        $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject mal_inter_arg_differentP(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == at_vars.$at_check_inter_arg_differentP$.getDynamicValue(thread)) {
            return NIL;
        }
        if (NIL == some_inter_arg_different_constraint_somewhereP(reln)) {
            return NIL;
        }
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
        try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if (reln.eql($$Quote)) {
                final SubLObject _prev_bind_0_$156 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                    cycl_grammar.$within_quote_form$.bind(T, thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$157 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$158 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_inter_arg_type_pred_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_DIFFERENT, T);
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                            SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                            SubLObject inter_arg_different = NIL;
                            inter_arg_different = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                SubLObject current;
                                final SubLObject datum = current = inter_arg_different;
                                SubLObject argnum1 = NIL;
                                SubLObject argnum2 = NIL;
                                destructuring_bind_must_consp(current, datum, $list92);
                                argnum1 = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list92);
                                argnum2 = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if ((argnum1.eql(dep_argnum) && argnum2.eql(ind_argnum)) && (NIL != equals.equalsP(dep_arg, ind_arg, UNPROVIDED, UNPROVIDED))) {
                                        if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                            note_at_violations(inter_arg_different_violations(reln, ind_arg, ind_argnum, dep_arg, dep_argnum));
                                        }
                                        result = T;
                                        doneP = at_utilities.at_finishedP(result);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list92);
                                }
                                csome_list_var = csome_list_var.rest();
                                inter_arg_different = csome_list_var.first();
                            } 
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$158, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$157, thread);
                    }
                } finally {
                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_$156, thread);
                }
            } else {
                final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$158 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_1_$159 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p2, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p2), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_inter_arg_type_pred_collections(reln, ind_arg, ind_argnum, dep_argnum, $INTER_ARG_DIFFERENT, T);
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread)) && (NIL == doneP)) {
                        SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue(thread);
                        SubLObject inter_arg_different2 = NIL;
                        inter_arg_different2 = csome_list_var2.first();
                        while ((NIL == doneP) && (NIL != csome_list_var2)) {
                            SubLObject current2;
                            final SubLObject datum2 = current2 = inter_arg_different2;
                            SubLObject argnum3 = NIL;
                            SubLObject argnum4 = NIL;
                            destructuring_bind_must_consp(current2, datum2, $list92);
                            argnum3 = current2.first();
                            current2 = current2.rest();
                            destructuring_bind_must_consp(current2, datum2, $list92);
                            argnum4 = current2.first();
                            current2 = current2.rest();
                            if (NIL == current2) {
                                if ((argnum3.eql(dep_argnum) && argnum4.eql(ind_argnum)) && (NIL != equals.equalsP(dep_arg, ind_arg, UNPROVIDED, UNPROVIDED))) {
                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                        note_at_violations(inter_arg_different_violations(reln, ind_arg, ind_argnum, dep_arg, dep_argnum));
                                    }
                                    result = T;
                                    doneP = at_utilities.at_finishedP(result);
                                }
                            } else {
                                cdestructuring_bind_error(datum2, $list92);
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            inter_arg_different2 = csome_list_var2.first();
                        } 
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_4, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$159, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$158, thread);
                }
            }
        } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_2, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject inter_arg_different_violations_alt(SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject dep_arg, SubLObject dep_argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constraints = dictionary.dictionary_lookup($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), list(dep_argnum, ind_argnum), UNPROVIDED);
                SubLObject module = $MAL_ARG_WRT_INTER_ARG_DIFFERENT;
                SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                SubLObject violations = NIL;
                SubLObject cdolist_list_var = constraints;
                SubLObject constraint_details = NIL;
                for (constraint_details = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_details = cdolist_list_var.first()) {
                    {
                        SubLObject datum = constraint_details;
                        SubLObject current = datum;
                        SubLObject constraint_reln = NIL;
                        SubLObject via = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt39);
                        constraint_reln = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt39);
                        via = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (reln == constraint_reln) {
                                violations = cons(list(module, reln, dep_arg, ind_argnum, ind_arg, dep_argnum, mt), violations);
                            } else {
                                violations = cons(list(module, reln, dep_arg, ind_argnum, ind_arg, dep_argnum, mt, list(via, constraint_reln)), violations);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt39);
                        }
                    }
                }
                return violations;
            }
        }
    }

    public static SubLObject inter_arg_different_violations(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constraints = dictionary.dictionary_lookup($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), list(dep_argnum, ind_argnum), UNPROVIDED);
        final SubLObject module = $MAL_ARG_WRT_INTER_ARG_DIFFERENT;
        final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        SubLObject violations = NIL;
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint_details = NIL;
        constraint_details = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = constraint_details;
            SubLObject constraint_reln = NIL;
            SubLObject via = NIL;
            destructuring_bind_must_consp(current, datum, $list44);
            constraint_reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list44);
            via = current.first();
            current = current.rest();
            if (NIL == current) {
                if (reln.eql(constraint_reln)) {
                    violations = cons(list(module, reln, dep_arg, ind_argnum, ind_arg, dep_argnum, mt), violations);
                } else {
                    violations = cons(list(module, reln, dep_arg, ind_argnum, ind_arg, dep_argnum, mt, list(via, constraint_reln)), violations);
                }
            } else {
                cdestructuring_bind_error(datum, $list44);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint_details = cdolist_list_var.first();
        } 
        return violations;
    }

    public static final SubLObject clear_arg_collections_alt() {
        {
            SubLObject cs = $arg_collections_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_arg_collections() {
        final SubLObject cs = $arg_collections_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_arg_collections_alt(SubLObject arg, SubLObject constraint_type, SubLObject v_arg_type, SubLObject mt_info) {
        return memoization_state.caching_state_remove_function_results_with_args($arg_collections_caching_state$.getGlobalValue(), list(arg, constraint_type, v_arg_type, mt_info), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_arg_collections(final SubLObject arg, final SubLObject constraint_type, final SubLObject v_arg_type, final SubLObject mt_info) {
        return memoization_state.caching_state_remove_function_results_with_args($arg_collections_caching_state$.getGlobalValue(), list(arg, constraint_type, v_arg_type, mt_info), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject arg_collections_internal_alt(SubLObject arg, SubLObject constraint_type, SubLObject v_arg_type, SubLObject mt_info) {
        {
            SubLObject pcase_var = constraint_type;
            if (pcase_var.eql($ISA)) {
                {
                    SubLObject pcase_var_139 = v_arg_type;
                    if (pcase_var_139.eql($STRONG_FORT)) {
                        return isa.isa(arg, UNPROVIDED, UNPROVIDED);
                    } else {
                        if (pcase_var_139.eql($WEAK_FORT)) {
                            return com.cyc.cycjava.cycl.at_routines.weak_fort_isa_collections(arg);
                        } else {
                            if (pcase_var_139.eql($NAUT)) {
                                return com.cyc.cycjava.cycl.at_routines.naut_isa_collections(arg);
                            }
                        }
                    }
                }
            } else {
                if (pcase_var.eql($QUOTED_ISA)) {
                    {
                        SubLObject pcase_var_140 = v_arg_type;
                        if (pcase_var_140.eql($STRONG_FORT)) {
                            return isa.quoted_isa(arg, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var_140.eql($WEAK_FORT)) {
                                return com.cyc.cycjava.cycl.at_routines.weak_fort_quoted_isa_collections(arg);
                            } else {
                                if (pcase_var_140.eql($NAUT)) {
                                    return com.cyc.cycjava.cycl.at_routines.naut_quoted_isa_collections(arg);
                                }
                            }
                        }
                    }
                } else {
                    if (pcase_var.eql($GENLS)) {
                        {
                            SubLObject pcase_var_141 = v_arg_type;
                            if (pcase_var_141.eql($STRONG_FORT)) {
                                return genls.genls(arg, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var_141.eql($WEAK_FORT)) {
                                    return com.cyc.cycjava.cycl.at_routines.weak_fort_genls_collections(arg);
                                } else {
                                    if (pcase_var_141.eql($NAUT)) {
                                        return com.cyc.cycjava.cycl.at_routines.naut_genls_collections(arg);
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

    public static SubLObject arg_collections_internal(final SubLObject arg, final SubLObject constraint_type, final SubLObject v_arg_type, final SubLObject mt_info) {
        if (constraint_type.eql($ISA)) {
            if (v_arg_type.eql($STRONG_FORT)) {
                return isa.isa(arg, UNPROVIDED, UNPROVIDED);
            }
            if (v_arg_type.eql($WEAK_FORT)) {
                return weak_fort_isa_collections(arg);
            }
            if (v_arg_type.eql($NAUT)) {
                return naut_isa_collections(arg);
            }
        } else
            if (constraint_type.eql($QUOTED_ISA)) {
                if (v_arg_type.eql($STRONG_FORT)) {
                    return isa.quoted_isa(arg, UNPROVIDED, UNPROVIDED);
                }
                if (v_arg_type.eql($WEAK_FORT)) {
                    return weak_fort_quoted_isa_collections(arg);
                }
                if (v_arg_type.eql($NAUT)) {
                    return naut_quoted_isa_collections(arg);
                }
            } else
                if (constraint_type.eql($GENLS)) {
                    if (v_arg_type.eql($STRONG_FORT)) {
                        return genls.genls(arg, UNPROVIDED, UNPROVIDED);
                    }
                    if (v_arg_type.eql($WEAK_FORT)) {
                        return weak_fort_genls_collections(arg);
                    }
                    if (v_arg_type.eql($NAUT)) {
                        return naut_genls_collections(arg);
                    }
                }


        return NIL;
    }

    public static final SubLObject arg_collections_alt(SubLObject arg, SubLObject constraint_type, SubLObject v_arg_type, SubLObject mt_info) {
        {
            SubLObject caching_state = $arg_collections_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(ARG_COLLECTIONS, $arg_collections_caching_state$, $int$1024, EQUAL, FOUR_INTEGER, ZERO_INTEGER);
                memoization_state.register_hl_store_cache_clear_callback(CLEAR_ARG_COLLECTIONS);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_4(arg, constraint_type, v_arg_type, mt_info);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw80$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (arg.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (constraint_type.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (v_arg_type.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.at_routines.arg_collections_internal(arg, constraint_type, v_arg_type, mt_info)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(arg, constraint_type, v_arg_type, mt_info));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject arg_collections(final SubLObject arg, final SubLObject constraint_type, final SubLObject v_arg_type, final SubLObject mt_info) {
        SubLObject caching_state = $arg_collections_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ARG_COLLECTIONS, $arg_collections_caching_state$, $int$4096, EQUAL, FOUR_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_ARG_COLLECTIONS);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(arg, constraint_type, v_arg_type, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (arg.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (constraint_type.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (v_arg_type.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(arg_collections_internal(arg, constraint_type, v_arg_type, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(arg, constraint_type, v_arg_type, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject weak_fort_isa_collections_alt(SubLObject v_term) {
        if (NIL != forts.fort_p(v_term)) {
            return isa.asserted_isa(v_term, UNPROVIDED);
        } else {
            if (NIL != obsolete.reifiable_natP(v_term, UNPROVIDED, UNPROVIDED)) {
                return isa.asserted_isa(narts_high.find_nart(v_term), UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject weak_fort_isa_collections(final SubLObject v_term) {
        if (NIL != forts.fort_p(v_term)) {
            return isa.isa(v_term, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != obsolete.reifiable_natP(v_term, UNPROVIDED, UNPROVIDED)) {
            return isa.isa(narts_high.find_nart(v_term), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject naut_isa_collections_alt(SubLObject v_term) {
        {
            SubLObject functor = cycl_utilities.nat_functor(v_term);
            if (NIL != forts.fort_p(functor)) {
                return com.cyc.cycjava.cycl.at_routines.naut_isa_collections_int(v_term, functor);
            } else {
                if (NIL != obsolete.reified_natP(functor)) {
                    return com.cyc.cycjava.cycl.at_routines.naut_isa_collections_int(v_term, narts_high.find_nart(functor));
                } else {
                    if (NIL != obsolete.reifiable_natP(functor, symbol_function($sym81$CYC_VAR_), UNPROVIDED)) {
                        {
                            SubLObject meta_functor = cycl_utilities.nat_functor(functor);
                            return remove_duplicates(nconc(kb_accessors.meta_result_isa(meta_functor, UNPROVIDED), kb_accessors.meta_result_isa_args(meta_functor, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject naut_isa_collections(final SubLObject v_term) {
        final SubLObject functor = cycl_utilities.nat_functor(v_term);
        if (NIL != forts.fort_p(functor)) {
            return naut_isa_collections_int(v_term, functor);
        }
        if (NIL != obsolete.reified_natP(functor)) {
            return naut_isa_collections_int(v_term, narts_high.find_nart(functor));
        }
        if (NIL != obsolete.reifiable_natP(functor, symbol_function($sym100$CYC_VAR_), UNPROVIDED)) {
            final SubLObject meta_functor = cycl_utilities.nat_functor(functor);
            return remove_duplicates(nconc(kb_accessors.meta_result_isa(meta_functor, UNPROVIDED), kb_accessors.meta_result_isa_args(meta_functor, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject naut_isa_collections_int_alt(SubLObject v_term, SubLObject functor) {
        {
            SubLObject collections = NIL;
            collections = kb_accessors.result_isa(functor, UNPROVIDED);
            collections = nconc(collections, kb_accessors.result_isa_args(v_term, UNPROVIDED));
            collections = nconc(collections, kb_accessors.result_isa_via_arg_arg_isa(v_term, UNPROVIDED));
            collections = nconc(collections, kb_accessors.result_isa_arg_isas(v_term, UNPROVIDED));
            return remove_duplicates(collections, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject naut_isa_collections_int(final SubLObject v_term, final SubLObject functor) {
        SubLObject collections = NIL;
        collections = kb_accessors.result_isa(functor, UNPROVIDED);
        collections = nconc(collections, kb_accessors.result_isa_args(v_term, UNPROVIDED));
        collections = nconc(collections, kb_accessors.result_isa_via_arg_arg_isa(v_term, UNPROVIDED));
        collections = nconc(collections, kb_accessors.result_isa_arg_isas(v_term, UNPROVIDED));
        collections = nconc(collections, kb_accessors.result_isa_when_arg_isa(v_term, UNPROVIDED));
        return remove_duplicates(collections, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject weak_fort_quoted_isa_collections_alt(SubLObject v_term) {
        if (NIL != forts.fort_p(v_term)) {
            return isa.asserted_quoted_isa(v_term, UNPROVIDED);
        } else {
            if (NIL != obsolete.reifiable_natP(v_term, UNPROVIDED, UNPROVIDED)) {
                return isa.asserted_quoted_isa(narts_high.find_nart(v_term), UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject weak_fort_quoted_isa_collections(final SubLObject v_term) {
        if (NIL != forts.fort_p(v_term)) {
            return isa.quoted_isa(v_term, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != obsolete.reifiable_natP(v_term, UNPROVIDED, UNPROVIDED)) {
            return isa.quoted_isa(narts_high.find_nart(v_term), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject naut_quoted_isa_collections_alt(SubLObject v_term) {
        {
            SubLObject functor = cycl_utilities.nat_functor(v_term);
            if (NIL != forts.fort_p(functor)) {
                return nconc(kb_accessors.evaluation_result_quoted_isa(functor, UNPROVIDED), kb_accessors.result_quoted_isa(functor, UNPROVIDED));
            } else {
                if (NIL != obsolete.reifiable_natP(functor, UNPROVIDED, UNPROVIDED)) {
                    {
                        SubLObject nart_functor = narts_high.find_nart(functor);
                        return nconc(kb_accessors.evaluation_result_quoted_isa(nart_functor, UNPROVIDED), kb_accessors.result_quoted_isa(nart_functor, UNPROVIDED));
                    }
                } else {
                    if (NIL != obsolete.reifiable_natP(functor, symbol_function($sym81$CYC_VAR_), UNPROVIDED)) {
                        {
                            SubLObject meta_functor = cycl_utilities.nat_functor(functor);
                            return nconc(kb_accessors.meta_evaluation_result_quoted_isa(meta_functor, UNPROVIDED), kb_accessors.meta_result_quoted_isa(meta_functor, UNPROVIDED));
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject naut_quoted_isa_collections(final SubLObject v_term) {
        final SubLObject functor = cycl_utilities.nat_functor(v_term);
        if (NIL != forts.fort_p(functor)) {
            return nconc(kb_accessors.evaluation_result_quoted_isa(functor, UNPROVIDED), kb_accessors.result_quoted_isa(functor, UNPROVIDED));
        }
        if (NIL != obsolete.reifiable_natP(functor, UNPROVIDED, UNPROVIDED)) {
            final SubLObject nart_functor = narts_high.find_nart(functor);
            return nconc(kb_accessors.evaluation_result_quoted_isa(nart_functor, UNPROVIDED), kb_accessors.result_quoted_isa(nart_functor, UNPROVIDED));
        }
        if (NIL != obsolete.reifiable_natP(functor, symbol_function($sym100$CYC_VAR_), UNPROVIDED)) {
            final SubLObject meta_functor = cycl_utilities.nat_functor(functor);
            return nconc(kb_accessors.meta_evaluation_result_quoted_isa(meta_functor, UNPROVIDED), kb_accessors.meta_result_quoted_isa(meta_functor, UNPROVIDED));
        }
        return NIL;
    }

    public static final SubLObject weak_fort_genls_collections_alt(SubLObject v_term) {
        if (NIL != forts.fort_p(v_term)) {
            return genls.asserted_genls(v_term, UNPROVIDED);
        } else {
            if (NIL != obsolete.reifiable_natP(v_term, UNPROVIDED, UNPROVIDED)) {
                return genls.asserted_genls(narts_high.find_nart(v_term), UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject weak_fort_genls_collections(final SubLObject v_term) {
        if (NIL != forts.fort_p(v_term)) {
            return genls.genls(v_term, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != obsolete.reifiable_natP(v_term, UNPROVIDED, UNPROVIDED)) {
            return genls.genls(narts_high.find_nart(v_term), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject naut_genls_collections_alt(SubLObject v_term) {
        {
            SubLObject functor = cycl_utilities.nat_functor(v_term);
            if (NIL != forts.fort_p(functor)) {
                return com.cyc.cycjava.cycl.at_routines.naut_genls_collections_int(v_term, functor);
            } else {
                if (NIL != obsolete.reified_natP(functor)) {
                    return com.cyc.cycjava.cycl.at_routines.naut_genls_collections_int(v_term, narts_high.find_nart(functor));
                } else {
                    if (NIL != obsolete.reifiable_natP(functor, symbol_function($sym81$CYC_VAR_), UNPROVIDED)) {
                        {
                            SubLObject meta_functor = cycl_utilities.nat_functor(functor);
                            return remove_duplicates(nconc(kb_accessors.meta_result_genl(meta_functor, UNPROVIDED), kb_accessors.meta_result_genl_args(meta_functor, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject naut_genls_collections(final SubLObject v_term) {
        final SubLObject functor = cycl_utilities.nat_functor(v_term);
        if (NIL != forts.fort_p(functor)) {
            return naut_genls_collections_int(v_term, functor);
        }
        if (NIL != obsolete.reified_natP(functor)) {
            return naut_genls_collections_int(v_term, narts_high.find_nart(functor));
        }
        if (NIL != obsolete.reifiable_natP(functor, symbol_function($sym100$CYC_VAR_), UNPROVIDED)) {
            final SubLObject meta_functor = cycl_utilities.nat_functor(functor);
            return remove_duplicates(nconc(kb_accessors.meta_result_genl(meta_functor, UNPROVIDED), kb_accessors.meta_result_genl_args(meta_functor, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject naut_genls_collections_int_alt(SubLObject v_term, SubLObject functor) {
        {
            SubLObject collections = NIL;
            collections = kb_accessors.result_genl(functor, UNPROVIDED, UNPROVIDED);
            collections = nconc(collections, kb_accessors.result_genl_args(v_term, UNPROVIDED));
            collections = nconc(collections, kb_accessors.result_genl_via_arg_arg_genl(v_term, UNPROVIDED));
            return remove_duplicates(collections, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject naut_genls_collections_int(final SubLObject v_term, final SubLObject functor) {
        SubLObject collections = NIL;
        collections = kb_accessors.result_genl(functor, UNPROVIDED, UNPROVIDED);
        collections = nconc(collections, kb_accessors.result_genl_args(v_term, UNPROVIDED));
        collections = nconc(collections, kb_accessors.result_genl_via_arg_arg_genl(v_term, UNPROVIDED));
        return remove_duplicates(collections, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject applicable_arg_type_collections_alt(SubLObject reln, SubLObject argnum, SubLObject constraint_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constraint_pred = com.cyc.cycjava.cycl.at_routines.constraint_pred(constraint_type, argnum, reln);
                com.cyc.cycjava.cycl.at_routines.applicable_arg_type_collections_int(constraint_pred, reln, argnum, constraint_type, $SELF);
                if (NIL != forts.fort_p(reln)) {
                    {
                        SubLObject asserted_genl_preds_or_inverseP = makeBoolean((NIL != asserted_genl_predicatesP(reln, UNPROVIDED)) || (NIL != asserted_genl_inversesP(reln, UNPROVIDED)));
                        if ((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != asserted_genl_preds_or_inverseP)) {
                            {
                                SubLObject cdolist_list_var = all_genl_preds(reln, UNPROVIDED, UNPROVIDED);
                                SubLObject reln_genl_pred = NIL;
                                for (reln_genl_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , reln_genl_pred = cdolist_list_var.first()) {
                                    if (reln_genl_pred != reln) {
                                        com.cyc.cycjava.cycl.at_routines.applicable_arg_type_collections_int(constraint_pred, reln_genl_pred, argnum, constraint_type, $VIA_GENL_PRED);
                                    }
                                }
                            }
                        }
                        if (((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != asserted_genl_preds_or_inverseP)) && (argnum.numE(ONE_INTEGER) || argnum.numE(TWO_INTEGER))) {
                            {
                                SubLObject inverse_constraint_pred = com.cyc.cycjava.cycl.at_routines.inverse_pred(constraint_type, argnum, reln);
                                SubLObject inverse_argnum = kb_accessors.inverse_argnum(argnum);
                                SubLObject cdolist_list_var = all_genl_inverses(reln, UNPROVIDED, UNPROVIDED);
                                SubLObject inverse_reln = NIL;
                                for (inverse_reln = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inverse_reln = cdolist_list_var.first()) {
                                    if (inverse_reln != reln) {
                                        com.cyc.cycjava.cycl.at_routines.applicable_arg_type_collections_int(inverse_constraint_pred, inverse_reln, inverse_argnum, constraint_type, $VIA_GENL_INVERSE);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return $at_applicable_arg_types$.getDynamicValue(thread);
        }
    }

    public static SubLObject applicable_arg_type_collections(final SubLObject reln, final SubLObject argnum, final SubLObject constraint_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = wff_vars.wff_constraint_mt();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject constraint_pred = constraint_pred(constraint_type, argnum, reln);
            applicable_arg_type_collections_int(constraint_pred, reln, argnum, constraint_type, $SELF);
            if (NIL != forts.fort_p(reln)) {
                final SubLObject genl_preds_or_inverseP = makeBoolean((NIL != genl_predicates.genl_predicates(reln, UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.genl_inverses(reln, UNPROVIDED, UNPROVIDED)));
                if ((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != genl_preds_or_inverseP)) {
                    SubLObject cdolist_list_var = genl_predicates.all_genl_preds(reln, UNPROVIDED, UNPROVIDED);
                    SubLObject reln_genl_pred = NIL;
                    reln_genl_pred = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (!reln_genl_pred.eql(reln)) {
                            applicable_arg_type_collections_int(constraint_pred, reln_genl_pred, argnum, constraint_type, $VIA_GENL_PRED);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        reln_genl_pred = cdolist_list_var.first();
                    } 
                }
                if (((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != genl_preds_or_inverseP)) && (argnum.numE(ONE_INTEGER) || argnum.numE(TWO_INTEGER))) {
                    final SubLObject inverse_constraint_pred = inverse_pred(constraint_type, argnum, reln);
                    final SubLObject inverse_argnum = kb_accessors.inverse_argnum(argnum);
                    SubLObject cdolist_list_var2 = genl_predicates.all_genl_inverses(reln, UNPROVIDED, UNPROVIDED);
                    SubLObject inverse_reln = NIL;
                    inverse_reln = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        if (!inverse_reln.eql(reln)) {
                            applicable_arg_type_collections_int(inverse_constraint_pred, inverse_reln, inverse_argnum, constraint_type, $VIA_GENL_INVERSE);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        inverse_reln = cdolist_list_var2.first();
                    } 
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return $at_applicable_arg_types$.getDynamicValue(thread);
    }

    public static final SubLObject applicable_arg_type_collections_int_alt(SubLObject constraint_pred, SubLObject reln, SubLObject argnum, SubLObject constraint_type, SubLObject via) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == forts.fort_p(constraint_pred)) {
                return NIL;
            }
            if ((NIL == at_vars.$noting_at_violationsP$.getDynamicValue(thread)) && (NIL != at_cache.at_cache_use_possibleP(constraint_pred, argnum))) {
                {
                    SubLObject cdolist_list_var = at_cache.cached_arg_isas_in_relevant_mts(reln, argnum);
                    SubLObject v_arg_type = NIL;
                    for (v_arg_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_arg_type = cdolist_list_var.first()) {
                        {
                            SubLObject item_var = v_arg_type;
                            if (NIL == member(item_var, $at_applicable_arg_types$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                $at_applicable_arg_types$.setDynamicValue(cons(item_var, $at_applicable_arg_types$.getDynamicValue(thread)), thread);
                            }
                        }
                    }
                }
            } else {
                {
                    SubLObject constraint_argnum = at_utilities.constraint_pred_constraint_argnum(constraint_pred);
                    if (constraint_argnum.isInteger()) {
                        {
                            SubLObject pred_var = constraint_pred;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reln, ONE_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reln, ONE_INTEGER, pred_var);
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
                                                            SubLObject done_var_142 = NIL;
                                                            SubLObject token_var_143 = NIL;
                                                            while (NIL == done_var_142) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_143);
                                                                    SubLObject valid_144 = makeBoolean(token_var_143 != assertion);
                                                                    if (NIL != valid_144) {
                                                                        {
                                                                            SubLObject v_arg_type = assertions_high.gaf_arg(assertion, constraint_argnum);
                                                                            SubLObject item_var = v_arg_type;
                                                                            if (NIL == member(item_var, $at_applicable_arg_types$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                $at_applicable_arg_types$.setDynamicValue(cons(item_var, $at_applicable_arg_types$.getDynamicValue(thread)), thread);
                                                                            }
                                                                            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                dictionary_utilities.dictionary_push($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), v_arg_type, list(reln, via, assertion));
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_142 = makeBoolean(NIL == valid_144);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                    }
                }
            }
            if (NIL != at_vars.consider_multiargs_at_predP()) {
                {
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.at_routines.constraint_preds(constraint_type, argnum, reln);
                    SubLObject at_pred = NIL;
                    for (at_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , at_pred = cdolist_list_var.first()) {
                        if (at_pred != constraint_pred) {
                            if (($$argsIsa != at_pred) || (NIL != at_cache.some_args_isa_assertion_somewhereP(reln))) {
                                if (($$argAndRestIsa != at_pred) || (NIL != at_cache.some_arg_and_rest_isa_assertion_somewhereP(reln))) {
                                    {
                                        SubLObject constraint_argnum = at_utilities.constraint_pred_constraint_argnum(at_pred);
                                        SubLObject pred_var = at_pred;
                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reln, ONE_INTEGER, pred_var)) {
                                            {
                                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reln, ONE_INTEGER, pred_var);
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
                                                                        SubLObject done_var_145 = NIL;
                                                                        SubLObject token_var_146 = NIL;
                                                                        while (NIL == done_var_145) {
                                                                            {
                                                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_146);
                                                                                SubLObject valid_147 = makeBoolean(token_var_146 != assertion);
                                                                                if (NIL != valid_147) {
                                                                                    {
                                                                                        SubLObject v_arg_type = assertions_high.gaf_arg(assertion, constraint_argnum);
                                                                                        SubLObject item_var = v_arg_type;
                                                                                        if (NIL == member(item_var, $at_applicable_arg_types$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                            $at_applicable_arg_types$.setDynamicValue(cons(item_var, $at_applicable_arg_types$.getDynamicValue(thread)), thread);
                                                                                        }
                                                                                        if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                                            dictionary_utilities.dictionary_push($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), v_arg_type, list(reln, via, assertion));
                                                                                        }
                                                                                    }
                                                                                }
                                                                                done_var_145 = makeBoolean(NIL == valid_147);
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                                }
                            }
                        }
                    }
                }
            }
            return $at_applicable_arg_types$.getDynamicValue(thread);
        }
    }

    public static SubLObject applicable_arg_type_collections_int(final SubLObject constraint_pred, final SubLObject reln, final SubLObject argnum, final SubLObject constraint_type, final SubLObject via) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == forts.fort_p(constraint_pred)) {
            return NIL;
        }
        if ((NIL == at_vars.$noting_at_violationsP$.getDynamicValue(thread)) && (NIL != at_cache.at_cache_use_possibleP(constraint_pred, argnum))) {
            SubLObject cdolist_list_var = at_cache.cached_arg_isas_in_relevant_mts(reln, argnum);
            SubLObject v_arg_type = NIL;
            v_arg_type = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject item_var = v_arg_type;
                if (NIL == member(item_var, $at_applicable_arg_types$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $at_applicable_arg_types$.setDynamicValue(cons(item_var, $at_applicable_arg_types$.getDynamicValue(thread)), thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_arg_type = cdolist_list_var.first();
            } 
        } else {
            final SubLObject constraint_argnum = at_utilities.constraint_pred_constraint_argnum(constraint_pred);
            if (constraint_argnum.isInteger()) {
                accumulate_applicable_arg_type_collections_general_case(constraint_pred, constraint_argnum, reln, via);
                accumulate_applicable_arg_type_collections_single_entry(constraint_pred, argnum, reln, via);
            }
        }
        accumulate_applicable_arg_type_collections_arg_isas(constraint_type, constraint_pred, argnum, reln, via);
        return $at_applicable_arg_types$.getDynamicValue(thread);
    }

    public static SubLObject accumulate_applicable_arg_type_collections_general_case(final SubLObject constraint_pred, final SubLObject constraint_argnum, final SubLObject reln, final SubLObject via) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reln, ONE_INTEGER, constraint_pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reln, ONE_INTEGER, constraint_pred);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$164 = NIL;
                        final SubLObject token_var_$165 = NIL;
                        while (NIL == done_var_$164) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$165);
                            final SubLObject valid_$166 = makeBoolean(!token_var_$165.eql(assertion));
                            if ((NIL != valid_$166) && (NIL == inapplicable_arg_type_assertionP(assertion))) {
                                final SubLObject item_var;
                                final SubLObject v_arg_type = item_var = assertions_high.gaf_arg(assertion, constraint_argnum);
                                if (NIL == member(item_var, $at_applicable_arg_types$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                    $at_applicable_arg_types$.setDynamicValue(cons(item_var, $at_applicable_arg_types$.getDynamicValue(thread)), thread);
                                }
                                if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                    dictionary_utilities.dictionary_push($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), v_arg_type, list(reln, via, assertion));
                                }
                            }
                            done_var_$164 = makeBoolean(NIL == valid_$166);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return NIL;
    }

    public static SubLObject accumulate_applicable_arg_type_collections_single_entry(final SubLObject constraint_pred, final SubLObject argnum, final SubLObject reln, final SubLObject via) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((constraint_pred.eql(kb_accessors.argn_format_pred(argnum)) && (NIL == subl_promotions.memberP($$SingleEntry, $at_applicable_arg_types$.getDynamicValue(thread), symbol_function(KBEQ), UNPROVIDED))) && (NIL != kb_accessors.single_entry_format_in_argsP(reln, argnum, UNPROVIDED))) {
            final SubLObject item_var;
            final SubLObject v_arg_type = item_var = $$SingleEntry;
            if (NIL == member(item_var, $at_applicable_arg_types$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                $at_applicable_arg_types$.setDynamicValue(cons(item_var, $at_applicable_arg_types$.getDynamicValue(thread)), thread);
            }
            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                final SubLObject assertion = czer_meta.find_visible_assertion_cycl(list($$singleEntryFormatInArgs, reln, argnum), UNPROVIDED);
                if ((NIL != assertion) && (NIL == inapplicable_arg_type_assertionP(assertion))) {
                    dictionary_utilities.dictionary_push($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), v_arg_type, list(reln, via, assertion));
                }
            }
        }
        return NIL;
    }

    public static SubLObject accumulate_applicable_arg_type_collections_arg_isas(final SubLObject constraint_type, final SubLObject constraint_pred, final SubLObject argnum, final SubLObject reln, final SubLObject via) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.consider_multiargs_at_predP()) {
            SubLObject cdolist_list_var = constraint_preds(constraint_type, argnum, reln);
            SubLObject at_pred = NIL;
            at_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (((!at_pred.eql(constraint_pred)) && ((!$$argsIsa.eql(at_pred)) || (NIL != at_cache.some_args_isa_assertion_somewhereP(reln)))) && ((!$$argAndRestIsa.eql(at_pred)) || (NIL != at_cache.some_arg_and_rest_isa_assertion_somewhereP(reln)))) {
                    final SubLObject constraint_argnum = at_utilities.constraint_pred_constraint_argnum(at_pred);
                    final SubLObject pred_var = at_pred;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reln, ONE_INTEGER, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reln, ONE_INTEGER, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$167 = NIL;
                                    final SubLObject token_var_$168 = NIL;
                                    while (NIL == done_var_$167) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$168);
                                        final SubLObject valid_$169 = makeBoolean(!token_var_$168.eql(assertion));
                                        if ((NIL != valid_$169) && (NIL == inapplicable_arg_type_assertionP(assertion))) {
                                            final SubLObject item_var;
                                            final SubLObject v_arg_type = item_var = assertions_high.gaf_arg(assertion, constraint_argnum);
                                            if (NIL == member(item_var, $at_applicable_arg_types$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                $at_applicable_arg_types$.setDynamicValue(cons(item_var, $at_applicable_arg_types$.getDynamicValue(thread)), thread);
                                            }
                                            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                dictionary_utilities.dictionary_push($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), v_arg_type, list(reln, via, assertion));
                                            }
                                        }
                                        done_var_$167 = makeBoolean(NIL == valid_$169);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                at_pred = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject constraint_pred_alt(SubLObject constraint_type, SubLObject argnum, SubLObject reln) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = constraint_type;
                if (pcase_var.eql($ARG_ISA)) {
                    return kb_accessors.arg_isa_pred(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
                } else {
                    if (pcase_var.eql($ARG_QUOTED_ISA)) {
                        return kb_accessors.arg_quoted_isa_pred(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
                    } else {
                        if (pcase_var.eql($ARG_GENLS)) {
                            return kb_accessors.arg_genl_pred(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
                        } else {
                            if (pcase_var.eql($FORMAT)) {
                                return kb_accessors.argn_format_pred(argnum);
                            } else {
                                Errors.error($str_alt88$Unknown_constraint_type__s, constraint_type);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject constraint_pred(final SubLObject constraint_type, final SubLObject argnum, final SubLObject reln) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (constraint_type.eql($ARG_ISA)) {
            return kb_accessors.arg_isa_pred(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (constraint_type.eql($ARG_NOT_ISA)) {
            return kb_accessors.arg_not_isa_pred(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (constraint_type.eql($ARG_QUOTED_ISA)) {
            return kb_accessors.arg_quoted_isa_pred(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (constraint_type.eql($ARG_GENLS)) {
            return kb_accessors.arg_genl_pred(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (constraint_type.eql($FORMAT)) {
            return kb_accessors.argn_format_pred(argnum);
        }
        Errors.error($str110$Unknown_constraint_type__s, constraint_type);
        return NIL;
    }

    public static final SubLObject constraint_preds_alt(SubLObject constraint_type, SubLObject argnum, SubLObject reln) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = constraint_type;
                if (pcase_var.eql($ARG_ISA)) {
                    return kb_accessors.arg_isa_preds(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
                } else {
                    if (pcase_var.eql($ARG_QUOTED_ISA)) {
                        return kb_accessors.arg_quoted_isa_preds(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
                    } else {
                        if (pcase_var.eql($ARG_GENLS)) {
                            return kb_accessors.arg_genl_preds(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
                        } else {
                            if (pcase_var.eql($FORMAT)) {
                                return NIL;
                            } else {
                                Errors.error($str_alt88$Unknown_constraint_type__s, constraint_type);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject constraint_preds(final SubLObject constraint_type, final SubLObject argnum, final SubLObject reln) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (constraint_type.eql($ARG_ISA)) {
            return kb_accessors.arg_isa_preds(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (constraint_type.eql($ARG_NOT_ISA)) {
            return kb_accessors.arg_not_isa_preds(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (constraint_type.eql($ARG_QUOTED_ISA)) {
            return kb_accessors.arg_quoted_isa_preds(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (constraint_type.eql($ARG_GENLS)) {
            return kb_accessors.arg_genl_preds(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (constraint_type.eql($FORMAT)) {
            return NIL;
        }
        Errors.error($str110$Unknown_constraint_type__s, constraint_type);
        return NIL;
    }

    public static final SubLObject inverse_pred_alt(SubLObject constraint_type, SubLObject argnum, SubLObject reln) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = constraint_type;
                if (pcase_var.eql($ARG_ISA)) {
                    return kb_accessors.arg_isa_inverse(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
                } else {
                    if (pcase_var.eql($ARG_QUOTED_ISA)) {
                        return kb_accessors.arg_quoted_isa_inverse(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
                    } else {
                        if (pcase_var.eql($ARG_GENLS)) {
                            return kb_accessors.arg_genl_inverse(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
                        } else {
                            if (pcase_var.eql($FORMAT)) {
                                return kb_accessors.argn_format_inverse(argnum);
                            } else {
                                Errors.error($str_alt88$Unknown_constraint_type__s, constraint_type);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject inverse_pred(final SubLObject constraint_type, final SubLObject argnum, final SubLObject reln) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (constraint_type.eql($ARG_ISA)) {
            return kb_accessors.arg_isa_inverse(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (constraint_type.eql($ARG_NOT_ISA)) {
            return kb_accessors.arg_not_isa_inverse(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (constraint_type.eql($ARG_QUOTED_ISA)) {
            return kb_accessors.arg_quoted_isa_inverse(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (constraint_type.eql($ARG_GENLS)) {
            return kb_accessors.arg_genl_inverse(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (constraint_type.eql($FORMAT)) {
            return kb_accessors.argn_format_inverse(argnum);
        }
        Errors.error($str110$Unknown_constraint_type__s, constraint_type);
        return NIL;
    }

    public static final SubLObject gather_ind_arg_relevant_constraints_alt(SubLObject ind_arg, SubLObject constraint_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = constraint_type;
                if (pcase_var.eql($INTER_ARG_ISA)) {
                    $ind_arg_relevant_constraints$.setDynamicValue(isa.all_isa(ind_arg, UNPROVIDED, UNPROVIDED), thread);
                } else {
                    if (pcase_var.eql($INTER_ARG_NOT_ISA)) {
                        $ind_arg_relevant_constraints$.setDynamicValue(isa.all_isa(ind_arg, UNPROVIDED, UNPROVIDED), thread);
                    } else {
                        if (pcase_var.eql($INTER_ARG_GENL)) {
                            $ind_arg_relevant_constraints$.setDynamicValue(genls.all_genls(ind_arg, UNPROVIDED, UNPROVIDED), thread);
                        } else {
                            if (pcase_var.eql($INTER_ARG_FORMAT)) {
                                $ind_arg_relevant_constraints$.setDynamicValue(isa.all_isa(ind_arg, UNPROVIDED, UNPROVIDED), thread);
                            }
                        }
                    }
                }
            }
            return $ind_arg_relevant_constraints$.getDynamicValue(thread);
        }
    }

    public static SubLObject gather_ind_arg_relevant_constraints(final SubLObject ind_arg, final SubLObject constraint_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (constraint_type.eql($INTER_ARG_ISA)) {
            $ind_arg_relevant_constraints$.setDynamicValue(isa.all_isa(ind_arg, UNPROVIDED, UNPROVIDED), thread);
        } else
            if (constraint_type.eql($INTER_ARG_NOT_ISA)) {
                $ind_arg_relevant_constraints$.setDynamicValue(isa.all_isa(ind_arg, UNPROVIDED, UNPROVIDED), thread);
            } else
                if (constraint_type.eql($INTER_ARG_GENL)) {
                    $ind_arg_relevant_constraints$.setDynamicValue(genls.all_genls(ind_arg, UNPROVIDED, UNPROVIDED), thread);
                } else
                    if (constraint_type.eql($INTER_ARG_NOT_GENL)) {
                        $ind_arg_relevant_constraints$.setDynamicValue(genls.all_genls(ind_arg, UNPROVIDED, UNPROVIDED), thread);
                    } else
                        if (constraint_type.eql($INTER_ARG_ISA_GENL)) {
                            $ind_arg_relevant_constraints$.setDynamicValue(isa.all_isa(ind_arg, UNPROVIDED, UNPROVIDED), thread);
                        } else
                            if (constraint_type.eql($INTER_ARG_GENL_ISA)) {
                                $ind_arg_relevant_constraints$.setDynamicValue(genls.all_genls(ind_arg, UNPROVIDED, UNPROVIDED), thread);
                            } else
                                if (constraint_type.eql($INTER_ARG_FORMAT)) {
                                    $ind_arg_relevant_constraints$.setDynamicValue(isa.all_isa(ind_arg, UNPROVIDED, UNPROVIDED), thread);
                                }






        return $ind_arg_relevant_constraints$.getDynamicValue(thread);
    }

    public static final SubLObject relevant_constraintP_alt(SubLObject ind_arg, SubLObject ind_arg_type, SubLObject ind_type, SubLObject constraint_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (constraint_type == $INTER_ARG_DIFFERENT) {
                return T;
            }
            {
                SubLObject pcase_var = ind_type;
                if (pcase_var.eql($FORT)) {
                    return list_utilities.member_eqP(ind_arg_type, $ind_arg_relevant_constraints$.getDynamicValue(thread));
                } else {
                    if (pcase_var.eql($NON_FORT)) {
                        {
                            SubLObject pcase_var_148 = constraint_type;
                            if (pcase_var_148.eql($INTER_ARG_GENL)) {
                                return genls.genlP(ind_arg, ind_arg_type, UNPROVIDED, UNPROVIDED);
                            } else {
                                return at_defns.quiet_has_typeP(ind_arg, ind_arg_type, UNPROVIDED);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject relevant_constraintP(final SubLObject ind_arg, final SubLObject ind_arg_type, final SubLObject ind_type, final SubLObject constraint_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (constraint_type == $INTER_ARG_DIFFERENT) {
            return T;
        }
        if (ind_type.eql($FORT)) {
            return subl_promotions.memberP(ind_arg_type, $ind_arg_relevant_constraints$.getDynamicValue(thread), symbol_function(KBEQ), UNPROVIDED);
        }
        if (!ind_type.eql($NON_FORT)) {
            return NIL;
        }
        if (constraint_type.eql($INTER_ARG_GENL)) {
            return genls.genlP(ind_arg, ind_arg_type, UNPROVIDED, UNPROVIDED);
        }
        if (constraint_type.eql($INTER_ARG_GENL_ISA)) {
            return genls.genlP(ind_arg, ind_arg_type, UNPROVIDED, UNPROVIDED);
        }
        return at_defns.quiet_has_typeP(ind_arg, ind_arg_type, UNPROVIDED);
    }

    public static SubLObject relevant_constraints_among(final SubLObject ind_arg_types, final SubLObject ind_arg, final SubLObject ind_type, final SubLObject constraint_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (constraint_type == $INTER_ARG_DIFFERENT) {
            return ind_arg_types;
        }
        if (ind_type.eql($FORT)) {
            return intersection(ind_arg_types, $ind_arg_relevant_constraints$.getDynamicValue(thread), symbol_function(KBEQ), UNPROVIDED);
        }
        if (!ind_type.eql($NON_FORT)) {
            return NIL;
        }
        if (constraint_type.eql($INTER_ARG_GENL)) {
            return genls.all_genls_among(ind_arg, ind_arg_types, UNPROVIDED, UNPROVIDED);
        }
        if (constraint_type.eql($INTER_ARG_GENL_ISA)) {
            return genls.all_genls_among(ind_arg, ind_arg_types, UNPROVIDED, UNPROVIDED);
        }
        return at_defns.quiet_has_type_among(ind_arg, ind_arg_types, UNPROVIDED);
    }

    public static final SubLObject applicable_inter_arg_type_collections_alt(SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject dep_argnum, SubLObject constraint_type, SubLObject check_non_constantP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $ind_arg_relevant_constraints$.currentBinding(thread);
                try {
                    $ind_arg_relevant_constraints$.bind(NIL, thread);
                    if (NIL != forts.fort_p(ind_arg)) {
                        com.cyc.cycjava.cycl.at_routines.gather_ind_arg_relevant_constraints(ind_arg, constraint_type);
                        com.cyc.cycjava.cycl.at_routines.applicable_inter_arg_type_pred_collections(reln, ind_arg, ind_argnum, dep_argnum, constraint_type, $FORT);
                    } else {
                        if (NIL != arg_type.variable_wrt_arg_typeP(ind_arg)) {
                        } else {
                            if (NIL != check_non_constantP) {
                                com.cyc.cycjava.cycl.at_routines.applicable_inter_arg_type_pred_collections(reln, ind_arg, ind_argnum, dep_argnum, constraint_type, $NON_FORT);
                            }
                        }
                    }
                } finally {
                    $ind_arg_relevant_constraints$.rebind(_prev_bind_0, thread);
                }
            }
            return $at_applicable_arg_types$.getDynamicValue(thread);
        }
    }

    public static SubLObject applicable_inter_arg_type_collections(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_argnum, final SubLObject constraint_type, final SubLObject check_non_constantP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = wff_vars.wff_constraint_mt();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $ind_arg_relevant_constraints$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            $ind_arg_relevant_constraints$.bind(NIL, thread);
            if (NIL != forts.fort_p(ind_arg)) {
                gather_ind_arg_relevant_constraints(ind_arg, constraint_type);
                applicable_inter_arg_type_pred_collections(reln, ind_arg, ind_argnum, dep_argnum, constraint_type, $FORT);
            } else
                if (NIL == arg_type.variable_wrt_arg_typeP(ind_arg)) {
                    if (NIL != check_non_constantP) {
                        applicable_inter_arg_type_pred_collections(reln, ind_arg, ind_argnum, dep_argnum, constraint_type, $NON_FORT);
                    }
                }

        } finally {
            $ind_arg_relevant_constraints$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return $at_applicable_arg_types$.getDynamicValue(thread);
    }

    public static final SubLObject applicable_inter_arg_type_pred_collections_alt(SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject dep_argnum, SubLObject constraint_type, SubLObject ind_type) {
        if (ind_type == UNPROVIDED) {
            ind_type = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constraint_pred = com.cyc.cycjava.cycl.at_routines.inter_arg_constraint_pred(constraint_type, ind_argnum, dep_argnum);
                if (NIL == forts.fort_p(constraint_pred)) {
                    return NIL;
                }
                com.cyc.cycjava.cycl.at_routines.applicable_inter_arg_type_pred_collections_int(constraint_pred, reln, ind_arg, $SELF, constraint_type, ind_type);
                if (NIL != forts.fort_p(reln)) {
                    {
                        SubLObject asserted_genl_preds_or_inverseP = makeBoolean((NIL != asserted_genl_predicatesP(reln, UNPROVIDED)) || (NIL != asserted_genl_inversesP(reln, UNPROVIDED)));
                        if ((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != asserted_genl_preds_or_inverseP)) {
                            {
                                SubLObject cdolist_list_var = all_genl_preds(reln, UNPROVIDED, UNPROVIDED);
                                SubLObject reln_genl_pred = NIL;
                                for (reln_genl_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , reln_genl_pred = cdolist_list_var.first()) {
                                    if (reln_genl_pred != reln) {
                                        com.cyc.cycjava.cycl.at_routines.applicable_inter_arg_type_pred_collections_int(constraint_pred, reln_genl_pred, ind_arg, $VIA_GENL_PRED, constraint_type, ind_type);
                                    }
                                }
                            }
                        }
                        if ((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != asserted_genl_preds_or_inverseP)) {
                            {
                                SubLObject inverse_constraint_pred = com.cyc.cycjava.cycl.at_routines.inter_arg_inverse_pred(constraint_type, ind_argnum, dep_argnum);
                                SubLObject cdolist_list_var = all_genl_inverses(reln, UNPROVIDED, UNPROVIDED);
                                SubLObject inverse_reln = NIL;
                                for (inverse_reln = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inverse_reln = cdolist_list_var.first()) {
                                    if (inverse_reln != reln) {
                                        com.cyc.cycjava.cycl.at_routines.applicable_inter_arg_type_pred_collections_int(inverse_constraint_pred, inverse_reln, ind_arg, $VIA_GENL_INVERSE, constraint_type, ind_type);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return $at_applicable_arg_types$.getDynamicValue(thread);
        }
    }

    public static SubLObject applicable_inter_arg_type_pred_collections(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_argnum, final SubLObject constraint_type, SubLObject ind_type) {
        if (ind_type == UNPROVIDED) {
            ind_type = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constraint_pred = inter_arg_constraint_pred(constraint_type, ind_argnum, dep_argnum);
        if (NIL == forts.fort_p(constraint_pred)) {
            return NIL;
        }
        applicable_inter_arg_type_pred_collections_int(constraint_pred, reln, ind_arg, $SELF, constraint_type, ind_type);
        if (NIL != forts.fort_p(reln)) {
            final SubLObject genl_preds_or_inverseP = makeBoolean((NIL != genl_predicates.genl_predicates(reln, UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.genl_inverses(reln, UNPROVIDED, UNPROVIDED)));
            if ((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != genl_preds_or_inverseP)) {
                SubLObject cdolist_list_var = genl_predicates.all_genl_preds(reln, UNPROVIDED, UNPROVIDED);
                SubLObject reln_genl_pred = NIL;
                reln_genl_pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (!reln_genl_pred.eql(reln)) {
                        applicable_inter_arg_type_pred_collections_int(constraint_pred, reln_genl_pred, ind_arg, $VIA_GENL_PRED, constraint_type, ind_type);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    reln_genl_pred = cdolist_list_var.first();
                } 
            }
            if ((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != genl_preds_or_inverseP)) {
                final SubLObject inverse_constraint_pred = inter_arg_inverse_pred(constraint_type, ind_argnum, dep_argnum);
                SubLObject cdolist_list_var2 = genl_predicates.all_genl_inverses(reln, UNPROVIDED, UNPROVIDED);
                SubLObject inverse_reln = NIL;
                inverse_reln = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    if (!inverse_reln.eql(reln)) {
                        applicable_inter_arg_type_pred_collections_int(inverse_constraint_pred, inverse_reln, ind_arg, $VIA_GENL_INVERSE, constraint_type, ind_type);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    inverse_reln = cdolist_list_var2.first();
                } 
            }
        }
        return $at_applicable_arg_types$.getDynamicValue(thread);
    }

    public static final SubLObject applicable_inter_arg_type_pred_collections_int_alt(SubLObject constraint_pred, SubLObject reln, SubLObject ind_arg, SubLObject via, SubLObject ind_type, SubLObject constraint_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pred_var = constraint_pred;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reln, ONE_INTEGER, pred_var)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reln, ONE_INTEGER, pred_var);
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
                                                SubLObject done_var_149 = NIL;
                                                SubLObject token_var_150 = NIL;
                                                while (NIL == done_var_149) {
                                                    {
                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_150);
                                                        SubLObject valid_151 = makeBoolean(token_var_150 != assertion);
                                                        if (NIL != valid_151) {
                                                            {
                                                                SubLObject ind_arg_type = assertions_high.gaf_arg2(assertion);
                                                                SubLObject dep_arg_type = assertions_high.gaf_arg3(assertion);
                                                                SubLObject inter_arg_type = list(ind_arg_type, dep_arg_type);
                                                                if (NIL != com.cyc.cycjava.cycl.at_routines.relevant_constraintP(ind_arg, ind_arg_type, constraint_type, ind_type)) {
                                                                    {
                                                                        SubLObject item_var = inter_arg_type;
                                                                        if (NIL == member(item_var, $at_applicable_arg_types$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                            $at_applicable_arg_types$.setDynamicValue(cons(item_var, $at_applicable_arg_types$.getDynamicValue(thread)), thread);
                                                                        }
                                                                    }
                                                                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                                                        dictionary_utilities.dictionary_push($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), inter_arg_type, list(reln, via));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        done_var_149 = makeBoolean(NIL == valid_151);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
            return $at_applicable_arg_types$.getDynamicValue(thread);
        }
    }

    public static SubLObject applicable_inter_arg_type_pred_collections_int(final SubLObject constraint_pred, final SubLObject reln, final SubLObject ind_arg, final SubLObject via, final SubLObject ind_type, final SubLObject constraint_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject more_at_applicable_arg_types = applicable_inter_arg_type_pred_collections_int_memoized(constraint_pred, reln, ind_arg, via, ind_type, constraint_type, mt_relevance_macros.$mt$.getDynamicValue(thread), at_vars.$noting_at_violationsP$.getDynamicValue(thread));
        final SubLObject more_at_violations = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = more_at_applicable_arg_types;
        SubLObject at_applicable_arg_type = NIL;
        at_applicable_arg_type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = at_applicable_arg_type;
            if (NIL == member(item_var, $at_applicable_arg_types$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                $at_applicable_arg_types$.setDynamicValue(cons(item_var, $at_applicable_arg_types$.getDynamicValue(thread)), thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            at_applicable_arg_type = cdolist_list_var.first();
        } 
        cdolist_list_var = more_at_violations;
        SubLObject at_violation = NIL;
        at_violation = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = at_violation;
            SubLObject inter_arg_type = NIL;
            SubLObject reln_$172 = NIL;
            SubLObject via_$173 = NIL;
            destructuring_bind_must_consp(current, datum, $list113);
            inter_arg_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list113);
            reln_$172 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list113);
            via_$173 = current.first();
            current = current.rest();
            if (NIL == current) {
                dictionary_utilities.dictionary_push($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), inter_arg_type, list(reln_$172, via_$173));
            } else {
                cdestructuring_bind_error(datum, $list113);
            }
            cdolist_list_var = cdolist_list_var.rest();
            at_violation = cdolist_list_var.first();
        } 
        return $at_applicable_arg_types$.getDynamicValue(thread);
    }

    public static SubLObject applicable_inter_arg_type_pred_collections_int_memoized_internal(final SubLObject constraint_pred, final SubLObject reln, final SubLObject ind_arg, final SubLObject via, final SubLObject ind_type, final SubLObject constraint_type, final SubLObject mt, final SubLObject noting_at_violationsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != constraint_pred) {
                final SubLObject ind_to_dep_arg_dictionary = applicable_inter_arg_type_pred_collections_dictionary(reln, constraint_pred, mt);
                SubLObject more_at_applicable_arg_types = NIL;
                SubLObject more_at_violations = NIL;
                SubLObject cdolist_list_var = relevant_constraints_among(dictionary.dictionary_keys(ind_to_dep_arg_dictionary), ind_arg, constraint_type, ind_type);
                SubLObject ind_arg_type = NIL;
                ind_arg_type = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$174 = dictionary.dictionary_lookup(ind_to_dep_arg_dictionary, ind_arg_type, UNPROVIDED);
                    SubLObject dep_arg_type = NIL;
                    dep_arg_type = cdolist_list_var_$174.first();
                    while (NIL != cdolist_list_var_$174) {
                        final SubLObject item_var;
                        final SubLObject inter_arg_type = item_var = list(ind_arg_type, dep_arg_type);
                        if (NIL == member(item_var, more_at_applicable_arg_types, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            more_at_applicable_arg_types = cons(item_var, more_at_applicable_arg_types);
                        }
                        if (NIL != noting_at_violationsP) {
                            more_at_violations = cons(list(inter_arg_type, reln, via), more_at_violations);
                        }
                        cdolist_list_var_$174 = cdolist_list_var_$174.rest();
                        dep_arg_type = cdolist_list_var_$174.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    ind_arg_type = cdolist_list_var.first();
                } 
                return values(more_at_applicable_arg_types, more_at_violations);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return values(NIL, NIL);
    }

    public static SubLObject applicable_inter_arg_type_pred_collections_int_memoized(final SubLObject constraint_pred, final SubLObject reln, final SubLObject ind_arg, final SubLObject via, final SubLObject ind_type, final SubLObject constraint_type, final SubLObject mt, final SubLObject noting_at_violationsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return applicable_inter_arg_type_pred_collections_int_memoized_internal(constraint_pred, reln, ind_arg, via, ind_type, constraint_type, mt, noting_at_violationsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_INT_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_INT_MEMOIZED, EIGHT_INTEGER, $int$512, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_INT_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_8(constraint_pred, reln, ind_arg, via, ind_type, constraint_type, mt, noting_at_violationsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (constraint_pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (reln.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (ind_arg.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (via.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (ind_type.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (constraint_type.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (mt.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && noting_at_violationsP.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(applicable_inter_arg_type_pred_collections_int_memoized_internal(constraint_pred, reln, ind_arg, via, ind_type, constraint_type, mt, noting_at_violationsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(constraint_pred, reln, ind_arg, via, ind_type, constraint_type, mt, noting_at_violationsP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_applicable_inter_arg_type_pred_collections_dictionary() {
        final SubLObject cs = $applicable_inter_arg_type_pred_collections_dictionary_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_applicable_inter_arg_type_pred_collections_dictionary(final SubLObject reln, final SubLObject constraint_pred, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($applicable_inter_arg_type_pred_collections_dictionary_caching_state$.getGlobalValue(), list(reln, constraint_pred, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject applicable_inter_arg_type_pred_collections_dictionary_internal(final SubLObject reln, final SubLObject constraint_pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject result = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reln, ONE_INTEGER, constraint_pred)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reln, ONE_INTEGER, constraint_pred);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$175 = NIL;
                            final SubLObject token_var_$176 = NIL;
                            while (NIL == done_var_$175) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$176);
                                final SubLObject valid_$177 = makeBoolean(!token_var_$176.eql(assertion));
                                if ((NIL != valid_$177) && (NIL == inapplicable_arg_type_assertionP(assertion))) {
                                    final SubLObject ind_arg_type = assertions_high.gaf_arg2(assertion);
                                    final SubLObject dep_arg_type = assertions_high.gaf_arg3(assertion);
                                    dictionary_utilities.dictionary_pushnew(result, ind_arg_type, dep_arg_type, UNPROVIDED, UNPROVIDED);
                                }
                                done_var_$175 = makeBoolean(NIL == valid_$177);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$178 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$178, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject applicable_inter_arg_type_pred_collections_dictionary(final SubLObject reln, final SubLObject constraint_pred, final SubLObject mt) {
        SubLObject caching_state = $applicable_inter_arg_type_pred_collections_dictionary_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_DICTIONARY, $applicable_inter_arg_type_pred_collections_dictionary_caching_state$, $int$128, EQL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_wff_constraint_dependent_cache_clear_callback(CLEAR_APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_DICTIONARY);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(reln, constraint_pred, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (reln.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (constraint_pred.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(applicable_inter_arg_type_pred_collections_dictionary_internal(reln, constraint_pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(reln, constraint_pred, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject inter_arg_constraint_pred_alt(SubLObject constraint_type, SubLObject ind_argnum, SubLObject dep_argnum) {
        {
            SubLObject pcase_var = constraint_type;
            if (pcase_var.eql($INTER_ARG_ISA)) {
                return at_utilities.inter_arg_isa_pred(ind_argnum, dep_argnum);
            } else {
                if (pcase_var.eql($INTER_ARG_NOT_ISA)) {
                    return at_utilities.inter_arg_not_isa_pred(ind_argnum, dep_argnum);
                } else {
                    if (pcase_var.eql($INTER_ARG_GENL)) {
                        return at_utilities.inter_arg_genl_pred(ind_argnum, dep_argnum);
                    } else {
                        if (pcase_var.eql($INTER_ARG_FORMAT)) {
                            return kb_accessors.inter_arg_format_pred(ind_argnum, dep_argnum);
                        } else {
                            if (pcase_var.eql($INTER_ARG_DIFFERENT)) {
                                return $$interArgDifferent;
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject inter_arg_constraint_pred(final SubLObject constraint_type, final SubLObject ind_argnum, final SubLObject dep_argnum) {
        if (constraint_type.eql($INTER_ARG_ISA)) {
            return at_utilities.inter_arg_isa_pred(ind_argnum, dep_argnum);
        }
        if (constraint_type.eql($INTER_ARG_NOT_ISA)) {
            return at_utilities.inter_arg_not_isa_pred(ind_argnum, dep_argnum);
        }
        if (constraint_type.eql($INTER_ARG_GENL)) {
            return at_utilities.inter_arg_genl_pred(ind_argnum, dep_argnum);
        }
        if (constraint_type.eql($INTER_ARG_NOT_GENL)) {
            return at_utilities.inter_arg_not_genl_pred(ind_argnum, dep_argnum);
        }
        if (constraint_type.eql($INTER_ARG_ISA_GENL)) {
            return at_utilities.inter_arg_isa_genl_pred(ind_argnum, dep_argnum);
        }
        if (constraint_type.eql($INTER_ARG_GENL_ISA)) {
            return at_utilities.inter_arg_genl_isa_pred(ind_argnum, dep_argnum);
        }
        if (constraint_type.eql($INTER_ARG_FORMAT)) {
            return kb_accessors.inter_arg_format_pred(ind_argnum, dep_argnum);
        }
        if (constraint_type.eql($INTER_ARG_DIFFERENT)) {
            return $$interArgDifferent;
        }
        return NIL;
    }

    public static final SubLObject inter_arg_inverse_pred_alt(SubLObject constraint_type, SubLObject ind_arg, SubLObject dep_arg) {
        {
            SubLObject pcase_var = constraint_type;
            if (pcase_var.eql($INTER_ARG_ISA)) {
                return at_utilities.inter_arg_isa_inverse(ind_arg, dep_arg);
            } else {
                if (pcase_var.eql($INTER_ARG_NOT_ISA)) {
                    return at_utilities.inter_arg_not_isa_inverse(ind_arg, dep_arg);
                } else {
                    if (pcase_var.eql($INTER_ARG_GENL)) {
                        return at_utilities.inter_arg_genl_inverse(ind_arg, dep_arg);
                    } else {
                        if (pcase_var.eql($INTER_ARG_FORMAT)) {
                            return kb_accessors.inter_arg_format_inverse(ind_arg, dep_arg);
                        } else {
                            if (pcase_var.eql($INTER_ARG_DIFFERENT)) {
                                return NIL;
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject inter_arg_inverse_pred(final SubLObject constraint_type, final SubLObject ind_arg, final SubLObject dep_arg) {
        if (constraint_type.eql($INTER_ARG_ISA)) {
            return at_utilities.inter_arg_isa_inverse(ind_arg, dep_arg);
        }
        if (constraint_type.eql($INTER_ARG_NOT_ISA)) {
            return at_utilities.inter_arg_not_isa_inverse(ind_arg, dep_arg);
        }
        if (constraint_type.eql($INTER_ARG_GENL)) {
            return at_utilities.inter_arg_genl_inverse(ind_arg, dep_arg);
        }
        if (constraint_type.eql($INTER_ARG_FORMAT)) {
            return kb_accessors.inter_arg_format_inverse(ind_arg, dep_arg);
        }
        if (constraint_type.eql($INTER_ARG_DIFFERENT)) {
            return $$interArgDifferent;
        }
        return NIL;
    }

    public static final SubLObject note_at_violations_alt(SubLObject at_violations) {
        {
            SubLObject cdolist_list_var = at_violations;
            SubLObject at_violation = NIL;
            for (at_violation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , at_violation = cdolist_list_var.first()) {
                at_utilities.note_at_violation(at_violation);
            }
        }
        return NIL;
    }

    public static SubLObject note_at_violations(final SubLObject at_violations) {
        SubLObject cdolist_list_var = at_violations;
        SubLObject at_violation = NIL;
        at_violation = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            at_utilities.note_at_violation(at_violation);
            cdolist_list_var = cdolist_list_var.rest();
            at_violation = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject inapplicable_arg_type_assertionP(final SubLObject assertion) {
        final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
        if (((NIL != mt_relevance_macros.any_or_all_mts_are_relevantP()) && (NIL != forts.fort_p(assertion_mt))) && (NIL != somewhere_cache.some_pred_assertion_somewhereP($$wffConstraintMt, assertion_mt, ONE_INTEGER, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject declare_at_routines_file() {
        declareMacro("with_applicable_arg_types", "WITH-APPLICABLE-ARG-TYPES");
        declareFunction("mal_arg_isaP", "MAL-ARG-ISA?", 3, 0, false);
        declareFunction("arg_isa_violations", "ARG-ISA-VIOLATIONS", 4, 0, false);
        declareFunction("arg_isa_violation", "ARG-ISA-VIOLATION", 5, 0, false);
        declareFunction("arg_isa_violation_int", "ARG-ISA-VIOLATION-INT", 6, 0, false);
        declareFunction("wff_violation_verbose_data", "WFF-VIOLATION-VERBOSE-DATA", 0, 0, false);
        declareFunction("arg_isa_required_violation", "ARG-ISA-REQUIRED-VIOLATION", 2, 1, false);
        declareFunction("mal_arg_not_isaP", "MAL-ARG-NOT-ISA?", 3, 0, false);
        declareFunction("arg_not_isa_violations", "ARG-NOT-ISA-VIOLATIONS", 4, 0, false);
        declareFunction("arg_not_isa_violation", "ARG-NOT-ISA-VIOLATION", 5, 0, false);
        declareFunction("arg_not_isa_violation_int", "ARG-NOT-ISA-VIOLATION-INT", 6, 0, false);
        declareFunction("arg_not_isa_required_violation", "ARG-NOT-ISA-REQUIRED-VIOLATION", 2, 1, false);
        declareFunction("mal_arg_not_isa_disjointP", "MAL-ARG-NOT-ISA-DISJOINT?", 3, 0, false);
        declareFunction("arg_not_isa_disjoint_violations", "ARG-NOT-ISA-DISJOINT-VIOLATIONS", 4, 0, false);
        declareFunction("arg_not_isa_disjoint_violation_int", "ARG-NOT-ISA-DISJOINT-VIOLATION-INT", 6, 0, false);
        declareFunction("mal_arg_quoted_isaP", "MAL-ARG-QUOTED-ISA?", 3, 0, false);
        declareFunction("arg_quoted_isa_violations", "ARG-QUOTED-ISA-VIOLATIONS", 4, 0, false);
        declareFunction("arg_quoted_isa_violation", "ARG-QUOTED-ISA-VIOLATION", 5, 0, false);
        declareFunction("mal_arg_not_quoted_isa_disjointP", "MAL-ARG-NOT-QUOTED-ISA-DISJOINT?", 3, 0, false);
        declareFunction("arg_not_quoted_isa_disjoint_violations", "ARG-NOT-QUOTED-ISA-DISJOINT-VIOLATIONS", 4, 0, false);
        declareFunction("mal_arg_genlsP", "MAL-ARG-GENLS?", 3, 0, false);
        declareFunction("arg_genl_violations", "ARG-GENL-VIOLATIONS", 4, 0, false);
        declareFunction("arg_genl_violation", "ARG-GENL-VIOLATION", 5, 0, false);
        declareFunction("mal_arg_not_genls_disjointP", "MAL-ARG-NOT-GENLS-DISJOINT?", 3, 0, false);
        declareFunction("arg_not_genl_disjoint_violations", "ARG-NOT-GENL-DISJOINT-VIOLATIONS", 4, 0, false);
        declareFunction("mal_arg_formatP", "MAL-ARG-FORMAT?", 3, 0, false);
        declareFunction("arg_format_violations", "ARG-FORMAT-VIOLATIONS", 4, 0, false);
        declareFunction("mal_inter_arg_isaP", "MAL-INTER-ARG-ISA?", 5, 0, false);
        declareFunction("inter_arg_isa_violations", "INTER-ARG-ISA-VIOLATIONS", 7, 0, false);
        declareFunction("inter_arg_violations", "INTER-ARG-VIOLATIONS", 8, 0, false);
        declareFunction("some_inter_arg_genl_assertion_somewhereP", "SOME-INTER-ARG-GENL-ASSERTION-SOMEWHERE?", 1, 0, false);
        declareFunction("some_inter_arg_genl_constraint_somewhereP", "SOME-INTER-ARG-GENL-CONSTRAINT-SOMEWHERE?", 1, 0, false);
        declareFunction("mal_inter_arg_genlP", "MAL-INTER-ARG-GENL?", 5, 0, false);
        declareFunction("inter_arg_genl_violations", "INTER-ARG-GENL-VIOLATIONS", 7, 0, false);
        declareFunction("mal_inter_arg_not_isaP", "MAL-INTER-ARG-NOT-ISA?", 5, 0, false);
        declareFunction("some_inter_arg_not_isa_constraint_somewhereP", "SOME-INTER-ARG-NOT-ISA-CONSTRAINT-SOMEWHERE?", 1, 0, false);
        declareFunction("mal_inter_arg_not_genlP", "MAL-INTER-ARG-NOT-GENL?", 5, 0, false);
        declareFunction("some_inter_arg_not_genl_constraint_somewhereP", "SOME-INTER-ARG-NOT-GENL-CONSTRAINT-SOMEWHERE?", 1, 0, false);
        declareFunction("mal_inter_arg_genl_isaP", "MAL-INTER-ARG-GENL-ISA?", 5, 0, false);
        declareFunction("some_inter_arg_genl_isa_constraint_somewhereP", "SOME-INTER-ARG-GENL-ISA-CONSTRAINT-SOMEWHERE?", 1, 0, false);
        declareFunction("mal_inter_arg_isa_genlP", "MAL-INTER-ARG-ISA-GENL?", 5, 0, false);
        declareFunction("some_inter_arg_isa_genl_constraint_somewhereP", "SOME-INTER-ARG-ISA-GENL-CONSTRAINT-SOMEWHERE?", 1, 0, false);
        declareFunction("mal_inter_arg_not_isa_disjointP", "MAL-INTER-ARG-NOT-ISA-DISJOINT?", 5, 0, false);
        declareFunction("inter_arg_not_isa_disjoint_violations", "INTER-ARG-NOT-ISA-DISJOINT-VIOLATIONS", 7, 0, false);
        declareFunction("mal_inter_arg_not_genl_disjointP", "MAL-INTER-ARG-NOT-GENL-DISJOINT?", 5, 0, false);
        declareFunction("inter_arg_not_genl_disjoint_violations", "INTER-ARG-NOT-GENL-DISJOINT-VIOLATIONS", 7, 0, false);
        declareFunction("mal_inter_arg_formatP", "MAL-INTER-ARG-FORMAT?", 5, 0, false);
        declareFunction("inter_arg_format_violations", "INTER-ARG-FORMAT-VIOLATIONS", 7, 0, false);
        declareFunction("some_inter_arg_different_assertion_somewhereP", "SOME-INTER-ARG-DIFFERENT-ASSERTION-SOMEWHERE?", 1, 0, false);
        declareFunction("some_inter_arg_different_constraint_somewhereP", "SOME-INTER-ARG-DIFFERENT-CONSTRAINT-SOMEWHERE?", 1, 0, false);
        declareFunction("mal_inter_arg_differentP", "MAL-INTER-ARG-DIFFERENT?", 5, 0, false);
        declareFunction("inter_arg_different_violations", "INTER-ARG-DIFFERENT-VIOLATIONS", 5, 0, false);
        declareFunction("clear_arg_collections", "CLEAR-ARG-COLLECTIONS", 0, 0, false);
        new at_routines.$clear_arg_collections$ZeroArityFunction();
        declareFunction("remove_arg_collections", "REMOVE-ARG-COLLECTIONS", 4, 0, false);
        declareFunction("arg_collections_internal", "ARG-COLLECTIONS-INTERNAL", 4, 0, false);
        declareFunction("arg_collections", "ARG-COLLECTIONS", 4, 0, false);
        declareFunction("weak_fort_isa_collections", "WEAK-FORT-ISA-COLLECTIONS", 1, 0, false);
        declareFunction("naut_isa_collections", "NAUT-ISA-COLLECTIONS", 1, 0, false);
        declareFunction("naut_isa_collections_int", "NAUT-ISA-COLLECTIONS-INT", 2, 0, false);
        declareFunction("weak_fort_quoted_isa_collections", "WEAK-FORT-QUOTED-ISA-COLLECTIONS", 1, 0, false);
        declareFunction("naut_quoted_isa_collections", "NAUT-QUOTED-ISA-COLLECTIONS", 1, 0, false);
        declareFunction("weak_fort_genls_collections", "WEAK-FORT-GENLS-COLLECTIONS", 1, 0, false);
        declareFunction("naut_genls_collections", "NAUT-GENLS-COLLECTIONS", 1, 0, false);
        declareFunction("naut_genls_collections_int", "NAUT-GENLS-COLLECTIONS-INT", 2, 0, false);
        declareFunction("applicable_arg_type_collections", "APPLICABLE-ARG-TYPE-COLLECTIONS", 3, 0, false);
        declareFunction("applicable_arg_type_collections_int", "APPLICABLE-ARG-TYPE-COLLECTIONS-INT", 5, 0, false);
        declareFunction("accumulate_applicable_arg_type_collections_general_case", "ACCUMULATE-APPLICABLE-ARG-TYPE-COLLECTIONS-GENERAL-CASE", 4, 0, false);
        declareFunction("accumulate_applicable_arg_type_collections_single_entry", "ACCUMULATE-APPLICABLE-ARG-TYPE-COLLECTIONS-SINGLE-ENTRY", 4, 0, false);
        declareFunction("accumulate_applicable_arg_type_collections_arg_isas", "ACCUMULATE-APPLICABLE-ARG-TYPE-COLLECTIONS-ARG-ISAS", 5, 0, false);
        declareFunction("constraint_pred", "CONSTRAINT-PRED", 3, 0, false);
        declareFunction("constraint_preds", "CONSTRAINT-PREDS", 3, 0, false);
        declareFunction("inverse_pred", "INVERSE-PRED", 3, 0, false);
        declareFunction("gather_ind_arg_relevant_constraints", "GATHER-IND-ARG-RELEVANT-CONSTRAINTS", 2, 0, false);
        declareFunction("relevant_constraintP", "RELEVANT-CONSTRAINT?", 4, 0, false);
        declareFunction("relevant_constraints_among", "RELEVANT-CONSTRAINTS-AMONG", 4, 0, false);
        declareFunction("applicable_inter_arg_type_collections", "APPLICABLE-INTER-ARG-TYPE-COLLECTIONS", 6, 0, false);
        declareFunction("applicable_inter_arg_type_pred_collections", "APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS", 5, 1, false);
        declareFunction("applicable_inter_arg_type_pred_collections_int", "APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-INT", 6, 0, false);
        declareFunction("applicable_inter_arg_type_pred_collections_int_memoized_internal", "APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-INT-MEMOIZED-INTERNAL", 8, 0, false);
        declareFunction("applicable_inter_arg_type_pred_collections_int_memoized", "APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-INT-MEMOIZED", 8, 0, false);
        declareFunction("clear_applicable_inter_arg_type_pred_collections_dictionary", "CLEAR-APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-DICTIONARY", 0, 0, false);
        declareFunction("remove_applicable_inter_arg_type_pred_collections_dictionary", "REMOVE-APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-DICTIONARY", 3, 0, false);
        declareFunction("applicable_inter_arg_type_pred_collections_dictionary_internal", "APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-DICTIONARY-INTERNAL", 3, 0, false);
        declareFunction("applicable_inter_arg_type_pred_collections_dictionary", "APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-DICTIONARY", 3, 0, false);
        declareFunction("inter_arg_constraint_pred", "INTER-ARG-CONSTRAINT-PRED", 3, 0, false);
        declareFunction("inter_arg_inverse_pred", "INTER-ARG-INVERSE-PRED", 3, 0, false);
        declareFunction("note_at_violations", "NOTE-AT-VIOLATIONS", 1, 0, false);
        declareFunction("inapplicable_arg_type_assertionP", "INAPPLICABLE-ARG-TYPE-ASSERTION?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_at_routines_file() {
        deflexical("*AT-CHECK-QUOTED-ARG-ISA?*", T);
        defvar("*AT-APPLICABLE-ARG-TYPES*", NIL);
        defvar("*AT-APPLICABLE-ARG-TYPES-WITH-ASSERTIONS*", NIL);
        deflexical("*ARG-COLLECTIONS-CACHING-STATE*", NIL);
        defvar("*IND-ARG-RELEVANT-CONSTRAINTS*", NIL);
        deflexical("*APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-DICTIONARY-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_at_routines_file() {
        memoization_state.note_globally_cached_function(ARG_COLLECTIONS);
        memoization_state.note_memoized_function(APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_INT_MEMOIZED);
        memoization_state.note_globally_cached_function(APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_DICTIONARY);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_at_routines_file();
    }

    @Override
    public void initializeVariables() {
        init_at_routines_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_at_routines_file();
    }

    static {
    }

    public static final class $clear_arg_collections$ZeroArityFunction extends ZeroArityFunction {
        public $clear_arg_collections$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-ARG-COLLECTIONS"));
        }

        @Override
        public SubLObject processItem() {
            return clear_arg_collections();
        }
    }

    static private final SubLList $list_alt1 = list(makeSymbol("*AT-APPLICABLE-ARG-TYPES*"), list(makeSymbol("*AT-APPLICABLE-ARG-TYPES-WITH-ASSERTIONS*"), list(makeSymbol("NEW-DICTIONARY"), list(QUOTE, EQUAL))));

    static private final SubLList $list_alt10 = list(makeSymbol("CONSTRAINT-RELN"), makeSymbol("VIA"), makeSymbol("CONSTRAINT-GAF"));

    static private final SubLSymbol $sym19$VARIABLE_TERM_WRT_ARG_TYPE_ = makeSymbol("VARIABLE-TERM-WRT-ARG-TYPE?");

    static private final SubLList $list_alt36 = list(makeSymbol("IND-ARG-ISA"), makeSymbol("DEP-ARG-ISA"));

    static private final SubLList $list_alt39 = list(makeSymbol("CONSTRAINT-RELN"), makeSymbol("VIA"));

    static private final SubLString $str_alt54$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt59$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt60$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt61$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLList $list_alt63 = list(makeSymbol("IND-ARG-GENL"), makeSymbol("DEP-ARG-GENL"));

    static private final SubLList $list_alt68 = list(makeSymbol("IND-ARG-ISA"), makeSymbol("DEP-ARG-FORMAT"));

    static private final SubLList $list_alt72 = list(makeSymbol("ARGNUM1"), makeSymbol("ARGNUM2"));

    public static final SubLInteger $int$1024 = makeInteger(1024);

    public static final SubLSymbol $kw80$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym81$CYC_VAR_ = makeSymbol("CYC-VAR?");

    static private final SubLString $str_alt88$Unknown_constraint_type__s = makeString("Unknown constraint-type ~s");
}

/**
 * Total time: 2255 ms
 */
