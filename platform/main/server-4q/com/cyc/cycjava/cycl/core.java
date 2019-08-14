/**
 * import com.cyc.tool.subl.jrtl.nativeCode.type.*;
 */
/**
 * import com.cyc.tool.subl.jrtl.nativeCode.type.*;
 */
/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$bootstrapping_kbP$;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.control_vars.set_build_kb_loaded;
import static com.cyc.cycjava.cycl.el_utilities.literal_atomic_sentence;
import static com.cyc.cycjava.cycl.nart_handles.nart_p;
import static com.cyc.cycjava.cycl.somewhere_cache.initialize_all_somewhere_caches;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nset_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nunion;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.inference.harness.after_adding;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.rule_after_adding;
import com.cyc.cycjava.cycl.sbhl.sbhl_cache;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CORE
 * source file: /cyc/top/cycl/core.lisp
 * created:     2019/07/03 17:37:49
 */
public final class core extends SubLTranslatedFile implements V12 {
    public static final SubLObject write_core_rule_assert(SubLObject assertion, SubLObject stream) {
        {
            SubLObject formula = com.cyc.cycjava.cycl.core.core_rule_formula(assertion);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject strength = assertions_high.assertion_strength(assertion);
            SubLObject direction = assertions_high.assertion_direction(assertion);
            terpri(stream);
            if (NIL != assertions_high.asserted_assertionP(assertion)) {
                {
                    SubLObject asserted_by = assertions_high.asserted_by(assertion);
                    if (NIL != asserted_by) {
                        format(stream, $str_alt109$___asserted_by__S__, asserted_by);
                    }
                }
            }
            format(stream, $str_alt110$_fi_assert_int__);
            format_cycl_expression.format_cycl_expression(formula, stream, TWO_INTEGER);
            format(stream, $str_alt111$___S__S__S___, new SubLObject[]{ mt, strength, direction });
        }
        return NIL;
    }

    public static final SubLFile me = new core();

 public static final String myName = "com.cyc.cycjava.cycl.core";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $core_seed_collection$ = makeSymbol("*CORE-SEED-COLLECTION*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $core_seed_mt$ = makeSymbol("*CORE-SEED-MT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $core_defining_arg1_predicates_info$ = makeSymbol("*CORE-DEFINING-ARG1-PREDICATES-INFO*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $core_defining_arg2_predicates_info$ = makeSymbol("*CORE-DEFINING-ARG2-PREDICATES-INFO*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $core_kb_start_time$ = makeSymbol("*CORE-KB-START-TIME*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $decontextualization_predicates$ = makeSymbol("*DECONTEXTUALIZATION-PREDICATES*");

    // defvar
    /**
     * These are to be asserted just before finalization, so that the mts can be
     * properly populated.
     */
    @LispMethod(comment = "These are to be asserted just before finalization, so that the mts can be\r\nproperly populated.\ndefvar\nThese are to be asserted just before finalization, so that the mts can be\nproperly populated.")
    private static final SubLSymbol $late_assertions$ = makeSymbol("*LATE-ASSERTIONS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $core_covered_gaf_predicates$ = makeSymbol("*CORE-COVERED-GAF-PREDICATES*");



    private static final SubLList $list1 = list(reader_make_constant_shell("MtUnionFn"), reader_make_constant_shell("BaseKB"), reader_make_constant_shell("BookkeepingMt"));

    private static final SubLSymbol NON_CORE_RAW_CONSTANT_P = makeSymbol("NON-CORE-RAW-CONSTANT-P");

    private static final SubLSymbol $all_core_raw_constants$ = makeSymbol("*ALL-CORE-RAW-CONSTANTS*");

    private static final SubLSymbol $all_core_skolems$ = makeSymbol("*ALL-CORE-SKOLEMS*");

    private static final SubLSymbol $all_core_constants$ = makeSymbol("*ALL-CORE-CONSTANTS*");

    private static final SubLSymbol $core_constant_table$ = makeSymbol("*CORE-CONSTANT-TABLE*");

    private static final SubLString $$$Computing_core_NARTs = makeString("Computing core NARTs");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLSymbol CACHED_NON_CORE_CONSTANT_P = makeSymbol("CACHED-NON-CORE-CONSTANT-P");

    public static final SubLSymbol $all_core_narts$ = makeSymbol("*ALL-CORE-NARTS*");

    public static final SubLSymbol $all_core_forts$ = makeSymbol("*ALL-CORE-FORTS*");

    public static final SubLSymbol $core_fort_table$ = makeSymbol("*CORE-FORT-TABLE*");

    private static final SubLSymbol CACHED_NON_CORE_FORT_P = makeSymbol("CACHED-NON-CORE-FORT-P");

    private static final SubLSymbol NON_CORE_ASSERTION_P = makeSymbol("NON-CORE-ASSERTION-P");

    static private final SubLString $$$determining_core_rules = makeString("determining core rules");

    public static final SubLSymbol $all_core_rules$ = makeSymbol("*ALL-CORE-RULES*");

    static private final SubLString $$$Computing_definitional_info = makeString("Computing definitional info");

    static private final SubLList $list22 = list(new SubLObject[]{ list(reader_make_constant_shell("isa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("quotedIsa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("genls"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), T), list(reader_make_constant_shell("arg1Isa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg1Genl"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg2Isa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg2Genl"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg3Isa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg3Genl"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg4Isa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg4Genl"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg5Isa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg5Genl"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("argsIsa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg1QuotedIsa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg2QuotedIsa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg3QuotedIsa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg4QuotedIsa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg5QuotedIsa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("argsQuotedIsa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("resultIsa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("resultGenl"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("genlPreds"), makeSymbol("ALL-GENL-PREDS"), makeSymbol("GENL-PRED?"), T), list(reader_make_constant_shell("genlInverse"), makeSymbol("ALL-GENL-PREDS"), makeSymbol("GENL-PRED?"), NIL), list(reader_make_constant_shell("genlMt"), makeSymbol("ALL-GENL-MTS"), makeSymbol("GENL-MT?"), T), list(reader_make_constant_shell("arity"), NIL, NIL, NIL), list(reader_make_constant_shell("arityMin"), NIL, NIL, NIL), list(reader_make_constant_shell("arityMax"), NIL, NIL, NIL), list(reader_make_constant_shell("defnIff"), NIL, NIL, NIL), list(reader_make_constant_shell("defnNecessary"), NIL, NIL, NIL), list(reader_make_constant_shell("defnSufficient"), NIL, NIL, NIL), list(reader_make_constant_shell("quotedDefnIff"), NIL, NIL, NIL), list(reader_make_constant_shell("quotedDefnNecessary"), NIL, NIL, NIL), list(reader_make_constant_shell("quotedDefnSufficient"), NIL, NIL, NIL) });

    private static final SubLSymbol CORE_DEFINITIONAL_INFO = makeSymbol("CORE-DEFINITIONAL-INFO");

    static private final SubLList $list24 = list(makeSymbol("PRED"), makeSymbol("ALL-FUNC"), makeSymbol("TEST-FUNC"), makeSymbol("REFLEXIVE"));







    private static final SubLSymbol CACHED_CORE_FORT_P = makeSymbol("CACHED-CORE-FORT-P");

    public static final SubLSymbol $core_definitional_info_caching_state$ = makeSymbol("*CORE-DEFINITIONAL-INFO-CACHING-STATE*");

    private static final SubLInteger $int$300 = makeInteger(300);

    private static final SubLString $str32$__Cycle___S__S__S = makeString("~%Cycle: ~S ~S ~S");

    private static final SubLString $str33$__Given___S__Minimal___S = makeString("~%Given: ~S~%Minimal: ~S");

    private static final SubLSymbol CORE_MT_DEFINITIONAL_INFO = makeSymbol("CORE-MT-DEFINITIONAL-INFO");



    private static final SubLSymbol $core_mt_definitional_info_caching_state$ = makeSymbol("*CORE-MT-DEFINITIONAL-INFO-CACHING-STATE*");

    private static final SubLString $str42$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str43$_______Mode__LISP__Package__CYC__ = makeString(";; -*- Mode: LISP; Package: CYC; Syntax: ANSI-Common-Lisp -*-");

    private static final SubLString $str44$____ = makeString("~%;;");

    private static final SubLString $str45$______A = makeString("~%;; ~A");

    private static final SubLString $str46$_____Core_KB_for_CycL_version__A_ = makeString("~%;; Core KB for CycL version ~A from KB ~S.~S");

    private static final SubLString $str47$_____This_file_is_automatically_g = makeString("~%;; This file is automatically generated!  See CYC:CYCL;CORE.LISP for details.");

    private static final SubLString $str48$_________________________________ = makeString("~%;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");

    private static final SubLString $str49$_____in_package__CYC__ = makeString("~%~%(in-package \"CYC\")");

    private static final SubLString $str50$_______initialization = makeString("~%~%;; initialization");

    private static final SubLString $str51$___core_kb_initialization__S_ = makeString("~%(core-kb-initialization ~S)");

    private static final SubLString $str52$_______constants = makeString("~%~%;; constants");

    private static final SubLString $$$constant_creates = makeString("constant creates");

    private static final SubLString $str54$_____core_kb_start_bootstrapping_ = makeString("~%~%(core-kb-start-bootstrapping)");

    private static final SubLString $str55$_______NARTs = makeString("~%~%;; NARTs");

    private static final SubLString $$$NART_creates = makeString("NART creates");

    private static final SubLString $str57$_______after_adding_early_extent_ = makeString("~%~%;; after adding early extent gafs");

    private static final SubLString $$$after_adding_early_extent_asserts = makeString("after adding early extent asserts");

    private static final SubLString $str59$_______Core_mt_definitional_asser = makeString("~%~%;; Core mt definitional assertions");

    private static final SubLString $$$Core_mt_definitional_asserts = makeString("Core mt definitional asserts");

    private static final SubLString $str61$_______decontextualization_early_ = makeString("~%~%;; decontextualization early extent gafs");

    private static final SubLString $str62$decontextualization_early_extent_ = makeString("decontextualization early extent asserts");

    private static final SubLString $str63$_____core_kb_start_definitions_ = makeString("~%~%(core-kb-start-definitions)");

    private static final SubLString $str64$_______definitional_assertions = makeString("~%~%;; definitional assertions");

    private static final SubLString $$$definitional_asserts = makeString("definitional asserts");

    private static final SubLString $str66$_______post_definitional_initiali = makeString("~%~%;; post-definitional initializations");

    private static final SubLString $str67$___core_kb_finish_definitions_ = makeString("~%(core-kb-finish-definitions)");

    private static final SubLString $str68$_______additional_gaf_assertions = makeString("~%~%;; additional gaf assertions");

    private static final SubLString $$$additional_gaf_asserts = makeString("additional gaf asserts");

    private static final SubLString $str70$_____core_kb_finish_bootstrapping = makeString("~%~%(core-kb-finish-bootstrapping)");

    private static final SubLString $str71$_______rules__asserting_forward_r = makeString("~%~%;; rules (asserting forward rules as backward)");

    private static final SubLString $str72$core_rules_with_meta_assertions__ = makeString("core rules with meta-assertions (asserting forward rules as backward)");

    private static final SubLString $str73$core_rules_without_meta_assertion = makeString("core rules without meta-assertions (asserting forward rules as backward)");

    private static final SubLString $str74$_______forward_rules__reasserting = makeString("~%~%;; forward rules (reasserting as forward)");

    private static final SubLString $str75$core_rules_with_meta_assertions = makeString("core rules with meta-assertions");

    private static final SubLString $str76$core_rules_without_meta_assertion = makeString("core rules without meta-assertions");

    private static final SubLString $str77$_______meta_assertion_gafs = makeString("~%~%;; meta-assertion gafs");

    private static final SubLString $str78$meta_assertion_gafs = makeString("meta-assertion gafs");

    private static final SubLString $str79$_______late_assertions = makeString("~%~%;; late assertions");

    private static final SubLString $str80$_______finalization = makeString("~%~%;; finalization");

    private static final SubLString $str81$___core_kb_finalization_ = makeString("~%(core-kb-finalization)");

    private static final SubLString $str84$Illegal_operation____not_bootstra = makeString("Illegal operation -- not bootstrapping KB");

    private static final SubLSymbol $sym86$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLString $str87$________Constructing_core_KB_at__ = makeString("~&~%;;; Constructing core KB at ~A~%");

    private static final SubLString $str90$________Construction_of_core_KB_c = makeString("~&~%;;; Construction of core KB completed (~A) at ~A~%");

    private static final SubLString $str91$___find_or_create_constant__S__S_ = makeString("~%(find-or-create-constant ~S ~S)");

    private static final SubLString $str93$_ = makeString(",");

    private static final SubLString $str94$_low_create_nart___ = makeString("(low-create-nart `(");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str96$__ = makeString("))");

    private static final SubLString $str97$________S = makeString("~%~%;; ~S");

    static private final SubLList $list98 = cons(makeSymbol("PRED"), makeSymbol("TRUTHS"));

    private static final SubLList $list100 = cons(makeSymbol("TRUTH"), makeSymbol("VALUES"));

    private static final SubLList $list101 = list(makeSymbol("VALUE"), makeSymbol("MT"));



    private static final SubLString $str103$___low_assert_literal__ = makeString("~%(low-assert-literal `");

    private static final SubLString $str104$__ = makeString(" `");

    private static final SubLString $str105$_ = makeString(")");

    private static final SubLSymbol WRITE_CORE_CONSTANT = makeSymbol("WRITE-CORE-CONSTANT");

    private static final SubLSymbol WRITE_CORE_NART = makeSymbol("WRITE-CORE-NART");

    private static final SubLSymbol WRITE_CORE_ASSERTION = makeSymbol("WRITE-CORE-ASSERTION");

    private static final SubLString $str109$_S = makeString("~S");

    private static final SubLString $str110$__find_nart___S_ = makeString(",(find-nart '~S)");

    private static final SubLString $str112$_s = makeString("~s");

    static private final SubLList $list114 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    private static final SubLString $str115$___hl_assert_bookkeeping_binary_g = makeString("~%(hl-assert-bookkeeping-binary-gaf ");



    private static final SubLString $str117$___ = makeString(")~%");

    private static final SubLString $str118$___asserted_by__S__ = makeString(";; asserted by ~S~%");

    private static final SubLString $str119$_fi_assert_int__ = makeString("(fi-assert-int '");

    private static final SubLString $str120$___S__S__S___ = makeString("~%~S ~S ~S)~%");

    private static final SubLString $str121$_tms_change_direction__find_asser = makeString("(tms-change-direction (find-assertion-cycl '");

    private static final SubLString $str122$___S___S___ = makeString("~%~S) ~S)~%");

    private static final SubLList $list123 = list(reader_make_constant_shell("decontextualizedPredicate"), reader_make_constant_shell("predicateConventionMt"), reader_make_constant_shell("decontextualizedCollection"), reader_make_constant_shell("collectionConventionMt"));

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");



    private static final SubLString $$$late_assertions = makeString("late assertions");





    private static final SubLSymbol CACHED_CORE_CONSTANT_P = makeSymbol("CACHED-CORE-CONSTANT-P");







    public static final SubLObject core_raw_constant_p_alt(SubLObject constant) {
        return makeBoolean((NIL != constant_p(constant)) && ((NIL != isa.isa_in_any_mtP(constant, $core_seed_collection$.getGlobalValue())) || (NIL != isa.quoted_isa_in_any_mtP(constant, $core_seed_collection$.getGlobalValue()))));
    }

    public static SubLObject core_raw_constant_p(final SubLObject constant) {
        return makeBoolean((NIL != constant_p(constant)) && (NIL != isa.quoted_isaP(constant, $core_seed_collection$.getGlobalValue(), $core_seed_mt$.getGlobalValue(), UNPROVIDED)));
    }

    public static final SubLObject non_core_raw_constant_p_alt(SubLObject constant) {
        return makeBoolean((NIL != constant_p(constant)) && (NIL == com.cyc.cycjava.cycl.core.core_raw_constant_p(constant)));
    }

    public static SubLObject non_core_raw_constant_p(final SubLObject constant) {
        return makeBoolean((NIL != constant_p(constant)) && (NIL == core_raw_constant_p(constant)));
    }

    public static final SubLObject core_raw_el_formula_p_alt(SubLObject formula) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.core.non_core_raw_el_formula_p(formula));
    }

    public static SubLObject core_raw_el_formula_p(final SubLObject formula) {
        return makeBoolean(NIL == non_core_raw_el_formula_p(formula));
    }

    public static final SubLObject non_core_raw_el_formula_p_alt(SubLObject formula) {
        return list_utilities.tree_find_if(symbol_function(NON_CORE_RAW_CONSTANT_P), formula, UNPROVIDED);
    }

    public static SubLObject non_core_raw_el_formula_p(final SubLObject formula) {
        return list_utilities.tree_find_if(symbol_function(NON_CORE_RAW_CONSTANT_P), formula, UNPROVIDED);
    }

    public static final SubLObject compute_core_raw_constants_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constants = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        constants = isa.all_fort_instances($core_seed_collection$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                        constants = append(constants, isa.all_quoted_instances($core_seed_collection$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                constants = list_utilities.delete_if_not(symbol_function(CONSTANT_P), constants, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                constants = kb_utilities.sort_terms(constants, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return constants;
            }
        }
    }

    public static SubLObject compute_core_raw_constants() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constants = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($core_seed_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            constants = isa.all_quoted_instances($core_seed_collection$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        constants = list_utilities.delete_if_not(symbol_function(CONSTANT_P), constants, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        constants = kb_utilities.sort_terms(constants, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return constants;
    }

    /**
     * Return a list of all raw constants in the KB subset
     */
    @LispMethod(comment = "Return a list of all raw constants in the KB subset")
    public static final SubLObject all_core_raw_constants_alt() {
        if ($UNINITIALIZED == $all_core_raw_constants$.getGlobalValue()) {
            {
                SubLObject core_raw_constants = com.cyc.cycjava.cycl.core.compute_core_raw_constants();
                $all_core_raw_constants$.setGlobalValue(core_raw_constants);
            }
        }
        return $all_core_raw_constants$.getGlobalValue();
    }

    /**
     * Return a list of all raw constants in the KB subset
     */
    @LispMethod(comment = "Return a list of all raw constants in the KB subset")
    public static SubLObject all_core_raw_constants() {
        if ($UNINITIALIZED == $all_core_raw_constants$.getGlobalValue()) {
            final SubLObject core_raw_constants = compute_core_raw_constants();
            $all_core_raw_constants$.setGlobalValue(core_raw_constants);
        }
        return $all_core_raw_constants$.getGlobalValue();
    }

    public static final SubLObject compute_core_skolems_alt() {
        {
            SubLObject core_skolems = NIL;
            core_skolems = kb_utilities.sort_terms(core_skolems, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return core_skolems;
        }
    }

    public static SubLObject compute_core_skolems() {
        SubLObject core_skolems = NIL;
        core_skolems = kb_utilities.sort_terms(core_skolems, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return core_skolems;
    }

    /**
     * Return a list of all skolems in the KB subset
     */
    @LispMethod(comment = "Return a list of all skolems in the KB subset")
    public static final SubLObject all_core_skolems_alt() {
        if ($UNINITIALIZED == $all_core_skolems$.getGlobalValue()) {
            {
                SubLObject core_skolems = com.cyc.cycjava.cycl.core.compute_core_skolems();
                $all_core_skolems$.setGlobalValue(core_skolems);
            }
        }
        return $all_core_skolems$.getGlobalValue();
    }

    /**
     * Return a list of all skolems in the KB subset
     */
    @LispMethod(comment = "Return a list of all skolems in the KB subset")
    public static SubLObject all_core_skolems() {
        if ($UNINITIALIZED == $all_core_skolems$.getGlobalValue()) {
            final SubLObject core_skolems = compute_core_skolems();
            $all_core_skolems$.setGlobalValue(core_skolems);
        }
        return $all_core_skolems$.getGlobalValue();
    }

    public static final SubLObject compute_core_constants_alt() {
        {
            SubLObject core_raw_constants = com.cyc.cycjava.cycl.core.all_core_raw_constants();
            SubLObject core_skolems = com.cyc.cycjava.cycl.core.all_core_skolems();
            return cconcatenate(core_raw_constants, core_skolems);
        }
    }

    public static SubLObject compute_core_constants() {
        final SubLObject core_raw_constants = all_core_raw_constants();
        final SubLObject core_skolems = all_core_skolems();
        return cconcatenate(core_raw_constants, core_skolems);
    }

    /**
     * Return a list of all constants in the KB subset
     */
    @LispMethod(comment = "Return a list of all constants in the KB subset")
    public static final SubLObject all_core_constants_alt() {
        if ($UNINITIALIZED == $all_core_constants$.getGlobalValue()) {
            {
                SubLObject core_constants = com.cyc.cycjava.cycl.core.compute_core_constants();
                $all_core_constants$.setGlobalValue(core_constants);
            }
        }
        return $all_core_constants$.getGlobalValue();
    }

    /**
     * Return a list of all constants in the KB subset
     */
    @LispMethod(comment = "Return a list of all constants in the KB subset")
    public static SubLObject all_core_constants() {
        if ($UNINITIALIZED == $all_core_constants$.getGlobalValue()) {
            final SubLObject core_constants = compute_core_constants();
            $all_core_constants$.setGlobalValue(core_constants);
        }
        return $all_core_constants$.getGlobalValue();
    }

    public static final SubLObject initialize_core_constant_table_alt() {
        {
            SubLObject core_constants = com.cyc.cycjava.cycl.core.all_core_constants();
            $core_constant_table$.setGlobalValue(keyhash_utilities.keyhash_list_elements(core_constants, symbol_function(EQ), UNPROVIDED));
            return keyhash.keyhash_count($core_constant_table$.getGlobalValue());
        }
    }

    public static SubLObject initialize_core_constant_table() {
        final SubLObject core_constants = all_core_constants();
        $core_constant_table$.setGlobalValue(keyhash_utilities.keyhash_list_elements(core_constants, symbol_function(EQ), UNPROVIDED));
        return keyhash.keyhash_count($core_constant_table$.getGlobalValue());
    }

    public static final SubLObject cached_core_constant_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != constant_p(v_object)) && (NIL != keyhash.getkeyhash(v_object, $core_constant_table$.getGlobalValue())));
    }

    public static SubLObject cached_core_constant_p(final SubLObject v_object) {
        return makeBoolean((NIL != constant_p(v_object)) && (NIL != keyhash.getkeyhash(v_object, $core_constant_table$.getGlobalValue())));
    }

    public static final SubLObject cached_non_core_constant_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != constant_p(v_object)) && (NIL == keyhash.getkeyhash(v_object, $core_constant_table$.getGlobalValue())));
    }

    public static SubLObject cached_non_core_constant_p(final SubLObject v_object) {
        return makeBoolean((NIL != constant_p(v_object)) && (NIL == keyhash.getkeyhash(v_object, $core_constant_table$.getGlobalValue())));
    }

    public static final SubLObject compute_core_narts_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constants = com.cyc.cycjava.cycl.core.all_core_constants();
                SubLObject expected_nart_count = integerDivide(length(constants), TEN_INTEGER);
                SubLObject narts = NIL;
                SubLObject nart_set = set.new_set(symbol_function(EQ), expected_nart_count);
                SubLObject list_var = constants;
                $progress_note$.setDynamicValue($$$Computing_core_NARTs, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject constant = NIL;
                            for (constant = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , constant = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                if (NIL != fort_types_interface.non_predicate_functionP(constant)) {
                                    {
                                        SubLObject dependent_narts = kb_indexing.dependent_narts(constant);
                                        SubLObject cdolist_list_var = dependent_narts;
                                        SubLObject dependent_nart = NIL;
                                        for (dependent_nart = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dependent_nart = cdolist_list_var.first()) {
                                            if (NIL == set.set_memberP(dependent_nart, nart_set)) {
                                                if (NIL != com.cyc.cycjava.cycl.core.core_nart_p(dependent_nart)) {
                                                    set.set_add(dependent_nart, nart_set);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                narts = kb_utilities.sort_terms(set.set_element_list(nart_set), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return narts;
            }
        }
    }

    public static SubLObject compute_core_narts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constants = all_core_constants();
        final SubLObject expected_nart_count = integerDivide(length(constants), TEN_INTEGER);
        SubLObject narts = NIL;
        final SubLObject nart_set = set.new_set(symbol_function(EQL), expected_nart_count);
        final SubLObject list_var = constants;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$Computing_core_NARTs, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject constant = NIL;
                constant = csome_list_var.first();
                while (NIL != csome_list_var) {
                    if (NIL != fort_types_interface.non_predicate_functionP(constant)) {
                        SubLObject cdolist_list_var;
                        final SubLObject dependent_narts = cdolist_list_var = indexing_utilities.dependent_narts(constant);
                        SubLObject dependent_nart = NIL;
                        dependent_nart = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if ((NIL == set.set_memberP(dependent_nart, nart_set)) && (NIL != core_nart_p(dependent_nart))) {
                                set.set_add(dependent_nart, nart_set);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            dependent_nart = cdolist_list_var.first();
                        } 
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    constant = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        narts = kb_utilities.sort_terms(set.set_element_list(nart_set), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return narts;
    }

    public static final SubLObject core_nart_p_alt(SubLObject nart) {
        return com.cyc.cycjava.cycl.core.core_nart_formula_p(narts_high.nart_el_formula(nart));
    }

    public static SubLObject core_nart_p(final SubLObject nart) {
        return core_nart_formula_p(narts_high.nart_el_formula(nart));
    }

    public static final SubLObject core_nart_formula_p_alt(SubLObject nart_formula) {
        return makeBoolean(nart_formula.isCons() && (NIL == list_utilities.tree_find_if(symbol_function(CACHED_NON_CORE_CONSTANT_P), nart_formula, UNPROVIDED)));
    }

    public static SubLObject core_nart_formula_p(final SubLObject nart_formula) {
        return makeBoolean(nart_formula.isCons() && (NIL == list_utilities.tree_find_if(symbol_function(CACHED_NON_CORE_CONSTANT_P), nart_formula, UNPROVIDED)));
    }

    /**
     * Return a list of all NARTs in the KB subset
     */
    @LispMethod(comment = "Return a list of all NARTs in the KB subset")
    public static final SubLObject all_core_narts_alt() {
        if ($UNINITIALIZED == $all_core_narts$.getGlobalValue()) {
            {
                SubLObject narts = com.cyc.cycjava.cycl.core.compute_core_narts();
                $all_core_narts$.setGlobalValue(narts);
            }
        }
        return $all_core_narts$.getGlobalValue();
    }

    /**
     * Return a list of all NARTs in the KB subset
     */
    @LispMethod(comment = "Return a list of all NARTs in the KB subset")
    public static SubLObject all_core_narts() {
        if ($UNINITIALIZED == $all_core_narts$.getGlobalValue()) {
            final SubLObject narts = compute_core_narts();
            $all_core_narts$.setGlobalValue(narts);
        }
        return $all_core_narts$.getGlobalValue();
    }

    public static final SubLObject compute_core_forts_alt() {
        {
            SubLObject core_constants = com.cyc.cycjava.cycl.core.all_core_constants();
            SubLObject core_narts = com.cyc.cycjava.cycl.core.all_core_narts();
            return cconcatenate(core_constants, core_narts);
        }
    }

    public static SubLObject compute_core_forts() {
        final SubLObject core_constants = all_core_constants();
        final SubLObject core_narts = all_core_narts();
        return cconcatenate(core_constants, core_narts);
    }

    public static final SubLObject all_core_forts_alt() {
        if ($UNINITIALIZED == $all_core_forts$.getGlobalValue()) {
            {
                SubLObject core_forts = com.cyc.cycjava.cycl.core.compute_core_forts();
                $all_core_forts$.setGlobalValue(core_forts);
            }
        }
        return $all_core_forts$.getGlobalValue();
    }

    public static SubLObject all_core_forts() {
        if ($UNINITIALIZED == $all_core_forts$.getGlobalValue()) {
            final SubLObject core_forts = compute_core_forts();
            $all_core_forts$.setGlobalValue(core_forts);
        }
        return $all_core_forts$.getGlobalValue();
    }

    public static final SubLObject initialize_core_fort_table_alt() {
        {
            SubLObject core_forts = com.cyc.cycjava.cycl.core.all_core_forts();
            $core_fort_table$.setGlobalValue(keyhash_utilities.keyhash_list_elements(core_forts, symbol_function(EQ), UNPROVIDED));
            return keyhash.keyhash_count($core_fort_table$.getGlobalValue());
        }
    }

    public static SubLObject initialize_core_fort_table() {
        final SubLObject core_forts = all_core_forts();
        $core_fort_table$.setGlobalValue(keyhash_utilities.keyhash_list_elements(core_forts, symbol_function(EQ), UNPROVIDED));
        return keyhash.keyhash_count($core_fort_table$.getGlobalValue());
    }

    public static final SubLObject cached_core_fort_p_alt(SubLObject fort) {
        return keyhash.getkeyhash(fort, $core_fort_table$.getGlobalValue());
    }

    public static SubLObject cached_core_fort_p(final SubLObject fort) {
        return keyhash.getkeyhash(fort, $core_fort_table$.getGlobalValue());
    }

    public static final SubLObject cached_non_core_fort_p_alt(SubLObject fort) {
        return makeBoolean((NIL != forts.fort_p(fort)) && (NIL == com.cyc.cycjava.cycl.core.cached_core_fort_p(fort)));
    }

    public static SubLObject cached_non_core_fort_p(final SubLObject fort) {
        return makeBoolean((NIL != forts.fort_p(fort)) && (NIL == cached_core_fort_p(fort)));
    }

    public static final SubLObject core_sentence_p_alt(SubLObject sentence) {
        if (!((NIL != list_utilities.tree_find_if(symbol_function(CACHED_NON_CORE_FORT_P), sentence, UNPROVIDED)) || (NIL != list_utilities.tree_find_if(symbol_function(NON_CORE_ASSERTION_P), sentence, UNPROVIDED)))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject core_sentence_p(final SubLObject sentence) {
        if ((NIL == list_utilities.tree_find_if(symbol_function(CACHED_NON_CORE_FORT_P), sentence, UNPROVIDED)) && (NIL == list_utilities.tree_find_if(symbol_function(NON_CORE_ASSERTION_P), sentence, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject core_assertion_p_alt(SubLObject assertion) {
        if (NIL != assertion_handles.assertion_p(assertion)) {
            {
                SubLObject mt = assertions_high.assertion_mt(assertion);
                SubLObject cnf = assertions_high.assertion_cnf(assertion);
                if (!(((NIL != com.cyc.cycjava.cycl.core.cached_non_core_fort_p(hlmt.hlmt_monad_mt(mt))) || (NIL != list_utilities.tree_find_if(symbol_function(CACHED_NON_CORE_FORT_P), cnf, UNPROVIDED))) || (NIL != list_utilities.tree_find_if(symbol_function(NON_CORE_ASSERTION_P), cnf, UNPROVIDED)))) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject core_assertion_p(final SubLObject assertion) {
        if (NIL != assertion_handles.assertion_p(assertion)) {
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject cnf = assertions_high.assertion_cnf(assertion);
            if (((NIL == cached_non_core_fort_p(hlmt.hlmt_monad_mt(mt))) && (NIL == list_utilities.tree_find_if(symbol_function(CACHED_NON_CORE_FORT_P), cnf, UNPROVIDED))) && (NIL == list_utilities.tree_find_if(symbol_function(NON_CORE_ASSERTION_P), cnf, UNPROVIDED))) {
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject non_core_assertion_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != assertion_handles.assertion_p(v_object)) && (NIL == com.cyc.cycjava.cycl.core.core_assertion_p(v_object)));
    }

    public static SubLObject non_core_assertion_p(final SubLObject v_object) {
        return makeBoolean((NIL != assertion_handles.assertion_p(v_object)) && (NIL == core_assertion_p(v_object)));
    }

    public static final SubLObject compute_core_rules_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject core_rule_table = set.new_set(symbol_function(EQ), length(com.cyc.cycjava.cycl.core.all_core_forts()));
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject list_var = com.cyc.cycjava.cycl.core.all_core_forts();
                            $progress_note$.setDynamicValue($$$determining_core_rules, thread);
                            $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            $progress_total$.setDynamicValue(length(list_var), thread);
                            $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0_1 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_2 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject fort = NIL;
                                        for (fort = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , fort = csome_list_var.first()) {
                                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            if (NIL != kb_mapping_macros.do_term_index_key_validator(fort, $RULE)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(fort, $RULE);
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
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, $TRUE, NIL);
                                                                        {
                                                                            SubLObject done_var_3 = NIL;
                                                                            SubLObject token_var_4 = NIL;
                                                                            while (NIL == done_var_3) {
                                                                                {
                                                                                    SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_4);
                                                                                    SubLObject valid_5 = makeBoolean(token_var_4 != rule);
                                                                                    if (NIL != valid_5) {
                                                                                        if (NIL != kb_mapping_macros.do_term_index_assertion_match_p(rule, final_index_spec)) {
                                                                                            if (NIL == set.set_memberP(rule, core_rule_table)) {
                                                                                                if (NIL != com.cyc.cycjava.cycl.core.core_assertion_p(rule)) {
                                                                                                    set.set_add(rule, core_rule_table);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_var_3 = makeBoolean(NIL == valid_5);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
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
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_2, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return set.set_element_list(core_rule_table);
            }
        }
    }

    public static SubLObject compute_core_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject core_rule_table = set.new_set(symbol_function(EQL), length(all_core_forts()));
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($core_seed_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject list_var = all_core_forts();
            final SubLObject _prev_bind_0_$2 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$3 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2_$4 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$determining_core_rules, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject fort = NIL;
                    fort = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if (NIL != kb_mapping_macros.do_term_index_key_validator(fort, $RULE)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(fort, $RULE);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, $TRUE, NIL);
                                        SubLObject done_var_$5 = NIL;
                                        final SubLObject token_var_$6 = NIL;
                                        while (NIL == done_var_$5) {
                                            final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                            final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(rule));
                                            if ((((NIL != valid_$7) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(rule, final_index_spec))) && (NIL == set.set_memberP(rule, core_rule_table))) && (NIL != core_assertion_p(rule))) {
                                                set.set_add(rule, core_rule_table);
                                            }
                                            done_var_$5 = makeBoolean(NIL == valid_$7);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        fort = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_2_$4, thread);
                $progress_start_time$.rebind(_prev_bind_1_$3, thread);
                $progress_note$.rebind(_prev_bind_0_$2, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return set.set_element_list(core_rule_table);
    }

    public static final SubLObject all_core_rules_alt() {
        if ($UNINITIALIZED == $all_core_rules$.getGlobalValue()) {
            {
                SubLObject core_rules = com.cyc.cycjava.cycl.core.compute_core_rules();
                $all_core_rules$.setGlobalValue(core_rules);
            }
        }
        return $all_core_rules$.getGlobalValue();
    }

    public static SubLObject all_core_rules() {
        if ($UNINITIALIZED == $all_core_rules$.getGlobalValue()) {
            final SubLObject core_rules = compute_core_rules();
            $all_core_rules$.setGlobalValue(core_rules);
        }
        return $all_core_rules$.getGlobalValue();
    }

    /**
     * Itentify the core KB
     */
    @LispMethod(comment = "Itentify the core KB")
    public static final SubLObject identify_core_kb_alt() {
        com.cyc.cycjava.cycl.core.clear_core_state();
        com.cyc.cycjava.cycl.core.initialize_core_constant_table();
        com.cyc.cycjava.cycl.core.initialize_core_fort_table();
        com.cyc.cycjava.cycl.core.all_core_rules();
        return length(com.cyc.cycjava.cycl.core.all_core_forts());
    }

    /**
     * Itentify the core KB
     */
    @LispMethod(comment = "Itentify the core KB")
    public static SubLObject identify_core_kb() {
        clear_core_state();
        initialize_core_constant_table();
        initialize_core_fort_table();
        all_core_rules();
        return length(all_core_forts());
    }

    /**
     * Completely reset the core KB computation state
     */
    @LispMethod(comment = "Completely reset the core KB computation state")
    public static final SubLObject clear_core_state_alt() {
        $all_core_raw_constants$.setGlobalValue($UNINITIALIZED);
        $all_core_skolems$.setGlobalValue($UNINITIALIZED);
        $all_core_constants$.setGlobalValue($UNINITIALIZED);
        $core_constant_table$.setGlobalValue(NIL);
        $all_core_narts$.setGlobalValue($UNINITIALIZED);
        $all_core_forts$.setGlobalValue($UNINITIALIZED);
        $core_fort_table$.setGlobalValue(NIL);
        $all_core_rules$.setGlobalValue($UNINITIALIZED);
        com.cyc.cycjava.cycl.core.clear_late_assertions();
        com.cyc.cycjava.cycl.core.clear_core_mt_definitional_info();
        com.cyc.cycjava.cycl.core.clear_core_definitional_info();
        return NIL;
    }

    /**
     * Completely reset the core KB computation state
     */
    @LispMethod(comment = "Completely reset the core KB computation state")
    public static SubLObject clear_core_state() {
        $all_core_raw_constants$.setGlobalValue($UNINITIALIZED);
        $all_core_skolems$.setGlobalValue($UNINITIALIZED);
        $all_core_constants$.setGlobalValue($UNINITIALIZED);
        $core_constant_table$.setGlobalValue(NIL);
        $all_core_narts$.setGlobalValue($UNINITIALIZED);
        $all_core_forts$.setGlobalValue($UNINITIALIZED);
        $core_fort_table$.setGlobalValue(NIL);
        $all_core_rules$.setGlobalValue($UNINITIALIZED);
        clear_late_assertions();
        clear_core_mt_definitional_info();
        clear_core_definitional_info();
        return NIL;
    }

    public static final SubLObject compute_core_kb_alt(SubLObject datafile) {
        if (datafile == UNPROVIDED) {
            datafile = NIL;
        }
        com.cyc.cycjava.cycl.core.compute_core_definitional_info();
        return NIL;
    }

    public static SubLObject compute_core_kb(SubLObject datafile) {
        if (datafile == UNPROVIDED) {
            datafile = NIL;
        }
        compute_core_definitional_info();
        return NIL;
    }

    public static final SubLObject compute_core_definitional_info_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.core.identify_core_kb();
            {
                SubLObject list_var = com.cyc.cycjava.cycl.core.all_core_forts();
                $progress_note$.setDynamicValue($$$Computing_definitional_info, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject fort = NIL;
                            for (fort = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , fort = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                com.cyc.cycjava.cycl.core.core_mt_definitional_info(fort);
                                com.cyc.cycjava.cycl.core.core_definitional_info(fort);
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject compute_core_definitional_info() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        identify_core_kb();
        final SubLObject list_var = all_core_forts();
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$Computing_definitional_info, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject fort = NIL;
                fort = csome_list_var.first();
                while (NIL != csome_list_var) {
                    core_mt_definitional_info(fort);
                    core_definitional_info(fort);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    fort = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject clear_core_definitional_info_alt() {
        {
            SubLObject cs = $core_definitional_info_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_core_definitional_info() {
        final SubLObject cs = $core_definitional_info_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_core_definitional_info_alt(SubLObject fort) {
        return memoization_state.caching_state_remove_function_results_with_args($core_definitional_info_caching_state$.getGlobalValue(), list(fort), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_core_definitional_info(final SubLObject fort) {
        return memoization_state.caching_state_remove_function_results_with_args($core_definitional_info_caching_state$.getGlobalValue(), list(fort), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject core_definitional_info_internal_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject cdolist_list_var = $core_defining_arg1_predicates_info$.getDynamicValue(thread);
                    SubLObject pred_info = NIL;
                    for (pred_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred_info = cdolist_list_var.first()) {
                        {
                            SubLObject datum = pred_info;
                            SubLObject current = datum;
                            SubLObject pred = NIL;
                            SubLObject all_func = NIL;
                            SubLObject test_func = NIL;
                            SubLObject reflexive = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt24);
                            pred = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt24);
                            all_func = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt24);
                            test_func = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt24);
                            reflexive = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (kb_indexing.num_gaf_arg_index(fort, ONE_INTEGER, pred, UNPROVIDED).numG(ZERO_INTEGER)) {
                                    {
                                        SubLObject true_values = kb_mapping_utilities.pred_values_in_any_mt(fort, pred, ONE_INTEGER, TWO_INTEGER, $TRUE);
                                        SubLObject false_values = kb_mapping_utilities.pred_values_in_any_mt(fort, pred, ONE_INTEGER, TWO_INTEGER, $FALSE);
                                        if ((NIL != all_func) && (NIL != test_func)) {
                                            true_values = com.cyc.cycjava.cycl.core.minimal_implied_core_values(fort, true_values, all_func, test_func, reflexive);
                                            if (pred == $$isa) {
                                                true_values = delete($$CycLConstant, true_values, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                            if (pred == $$quotedIsa) {
                                                true_values = delete($$CycLConstant, true_values, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        }
                                        false_values = list_utilities.delete_if_not(symbol_function(CACHED_CORE_FORT_P), false_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        v_answer = cons(bq_cons(pred, append(NIL != true_values ? ((SubLObject) (list(bq_cons($TRUE, append(true_values, NIL))))) : NIL, NIL != false_values ? ((SubLObject) (list(bq_cons($FALSE, append(false_values, NIL))))) : NIL, NIL)), v_answer);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt24);
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = $core_defining_arg2_predicates_info$.getDynamicValue(thread);
                    SubLObject pred_info = NIL;
                    for (pred_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred_info = cdolist_list_var.first()) {
                        {
                            SubLObject datum = pred_info;
                            SubLObject current = datum;
                            SubLObject pred = NIL;
                            SubLObject all_func = NIL;
                            SubLObject test_func = NIL;
                            SubLObject reflexive = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt24);
                            pred = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt24);
                            all_func = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt24);
                            test_func = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt24);
                            reflexive = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (kb_indexing.num_gaf_arg_index(fort, TWO_INTEGER, pred, UNPROVIDED).numG(ZERO_INTEGER)) {
                                    {
                                        SubLObject true_values = kb_mapping_utilities.pred_values_in_any_mt(fort, pred, TWO_INTEGER, ONE_INTEGER, $TRUE);
                                        SubLObject false_values = kb_mapping_utilities.pred_values_in_any_mt(fort, pred, TWO_INTEGER, ONE_INTEGER, $FALSE);
                                        if ((NIL != all_func) && (NIL != test_func)) {
                                            true_values = com.cyc.cycjava.cycl.core.minimal_implied_core_values(fort, true_values, all_func, test_func, reflexive);
                                        }
                                        false_values = list_utilities.delete_if_not(symbol_function(CACHED_CORE_FORT_P), false_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        v_answer = cons(bq_cons(pred, append(NIL != true_values ? ((SubLObject) (list(bq_cons($TRUE, append(true_values, NIL))))) : NIL, NIL != false_values ? ((SubLObject) (list(bq_cons($FALSE, append(false_values, NIL))))) : NIL, NIL)), v_answer);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt24);
                            }
                        }
                    }
                }
                return nreverse(v_answer);
            }
        }
    }

    public static SubLObject core_definitional_info_internal(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($core_seed_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = $core_defining_arg1_predicates_info$.getDynamicValue(thread);
            SubLObject pred_info = NIL;
            pred_info = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = pred_info;
                SubLObject pred = NIL;
                SubLObject all_func = NIL;
                SubLObject test_func = NIL;
                SubLObject reflexive = NIL;
                destructuring_bind_must_consp(current, datum, $list24);
                pred = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list24);
                all_func = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list24);
                test_func = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list24);
                reflexive = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (kb_indexing.num_gaf_arg_index(fort, ONE_INTEGER, pred, UNPROVIDED).numG(ZERO_INTEGER)) {
                        SubLObject true_values = kb_mapping_utilities.pred_values(fort, pred, ONE_INTEGER, TWO_INTEGER, $TRUE);
                        SubLObject false_values = kb_mapping_utilities.pred_values(fort, pred, ONE_INTEGER, TWO_INTEGER, $FALSE);
                        if ((NIL != all_func) && (NIL != test_func)) {
                            true_values = minimal_implied_core_values(fort, true_values, all_func, test_func, reflexive);
                            if (pred.eql($$isa)) {
                                true_values = delete($$CycLConstant, true_values, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            if (pred.eql($$quotedIsa)) {
                                true_values = delete($$CycLConstant, true_values, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        }
                        false_values = list_utilities.delete_if_not(symbol_function(CACHED_CORE_FORT_P), false_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        v_answer = cons(bq_cons(pred, append(NIL != true_values ? list(bq_cons($TRUE, append(true_values, NIL))) : NIL, NIL != false_values ? list(bq_cons($FALSE, append(false_values, NIL))) : NIL, NIL)), v_answer);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list24);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred_info = cdolist_list_var.first();
            } 
            cdolist_list_var = $core_defining_arg2_predicates_info$.getDynamicValue(thread);
            pred_info = NIL;
            pred_info = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = pred_info;
                SubLObject pred = NIL;
                SubLObject all_func = NIL;
                SubLObject test_func = NIL;
                SubLObject reflexive = NIL;
                destructuring_bind_must_consp(current, datum, $list24);
                pred = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list24);
                all_func = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list24);
                test_func = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list24);
                reflexive = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (kb_indexing.num_gaf_arg_index(fort, TWO_INTEGER, pred, UNPROVIDED).numG(ZERO_INTEGER)) {
                        SubLObject true_values = kb_mapping_utilities.pred_values(fort, pred, TWO_INTEGER, ONE_INTEGER, $TRUE);
                        SubLObject false_values = kb_mapping_utilities.pred_values(fort, pred, TWO_INTEGER, ONE_INTEGER, $FALSE);
                        if ((NIL != all_func) && (NIL != test_func)) {
                            true_values = minimal_implied_core_values(fort, true_values, all_func, test_func, reflexive);
                        }
                        false_values = list_utilities.delete_if_not(symbol_function(CACHED_CORE_FORT_P), false_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        v_answer = cons(bq_cons(pred, append(NIL != true_values ? list(bq_cons($TRUE, append(true_values, NIL))) : NIL, NIL != false_values ? list(bq_cons($FALSE, append(false_values, NIL))) : NIL, NIL)), v_answer);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list24);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred_info = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(v_answer);
    }

    public static final SubLObject core_definitional_info_alt(SubLObject fort) {
        {
            SubLObject caching_state = $core_definitional_info_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CORE_DEFINITIONAL_INFO, $core_definitional_info_caching_state$, NIL, EQL, ONE_INTEGER, $int$300);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, $kw32$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw32$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.core.core_definitional_info_internal(fort)));
                    memoization_state.caching_state_put(caching_state, fort, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject core_definitional_info(final SubLObject fort) {
        SubLObject caching_state = $core_definitional_info_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CORE_DEFINITIONAL_INFO, $core_definitional_info_caching_state$, NIL, EQL, ONE_INTEGER, $int$300);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(core_definitional_info_internal(fort)));
            memoization_state.caching_state_put(caching_state, fort, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject minimal_implied_core_values_alt(SubLObject fort, SubLObject given_values, SubLObject all_func, SubLObject test_func, SubLObject reflexive) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != list_utilities.every_in_list(symbol_function(CACHED_CORE_FORT_P), given_values, UNPROVIDED)) {
                return given_values;
            }
            {
                SubLObject full_values = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject cdolist_list_var = given_values;
                            SubLObject value = NIL;
                            for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                                full_values = nunion(full_values, funcall(all_func, value), UNPROVIDED, UNPROVIDED);
                            }
                            full_values = list_utilities.delete_if_not(symbol_function(CACHED_CORE_FORT_P), full_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject cycle_set = NIL;
                                if (NIL != reflexive) {
                                    full_values = delete(fort, full_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    cycle_set = com.cyc.cycjava.cycl.core.core_cycle_set(fort, full_values, test_func);
                                    if (NIL != cycle_set) {
                                        Errors.warn($str_alt33$__Cycle___S__S__S, test_func, fort, cycle_set);
                                        full_values = nset_difference(full_values, cycle_set, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                                full_values = list_utilities.delete_subsumed_items(full_values, test_func, UNPROVIDED);
                                if (NIL != cycle_set) {
                                    full_values = nunion(cycle_set, full_values, UNPROVIDED, UNPROVIDED);
                                    Errors.warn($str_alt34$__Given___S__Minimal___S, given_values, full_values);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return full_values;
            }
        }
    }

    public static SubLObject minimal_implied_core_values(final SubLObject fort, final SubLObject given_values, final SubLObject all_func, final SubLObject test_func, final SubLObject reflexive) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.every_in_list(symbol_function(CACHED_CORE_FORT_P), given_values, UNPROVIDED)) {
            return given_values;
        }
        SubLObject full_values = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($core_seed_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = given_values;
            SubLObject value = NIL;
            value = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                full_values = nunion(full_values, funcall(all_func, value), UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                value = cdolist_list_var.first();
            } 
            full_values = list_utilities.delete_if_not(symbol_function(CACHED_CORE_FORT_P), full_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cycle_set = NIL;
            if (NIL != reflexive) {
                full_values = delete(fort, full_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cycle_set = core_cycle_set(fort, full_values, test_func);
                if (NIL != cycle_set) {
                    Errors.warn($str32$__Cycle___S__S__S, test_func, fort, cycle_set);
                    full_values = nset_difference(full_values, cycle_set, UNPROVIDED, UNPROVIDED);
                }
            }
            full_values = list_utilities.delete_subsumed_items(full_values, test_func, UNPROVIDED);
            if (NIL != cycle_set) {
                full_values = nunion(cycle_set, full_values, UNPROVIDED, UNPROVIDED);
                Errors.warn($str33$__Given___S__Minimal___S, given_values, full_values);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return full_values;
    }

    public static final SubLObject core_cycle_set_alt(SubLObject fort, SubLObject full_values, SubLObject test_func) {
        SubLTrampolineFile.checkType(fort, FORT_P);
        {
            SubLObject cycle_set = NIL;
            SubLObject cdolist_list_var = full_values;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                if (NIL != funcall(test_func, v_term, fort)) {
                    cycle_set = cons(v_term, cycle_set);
                }
            }
            return cycle_set;
        }
    }

    public static SubLObject core_cycle_set(final SubLObject fort, final SubLObject full_values, final SubLObject test_func) {
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        SubLObject cycle_set = NIL;
        SubLObject cdolist_list_var = full_values;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != funcall(test_func, v_term, fort)) {
                cycle_set = cons(v_term, cycle_set);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return cycle_set;
    }

    public static final SubLObject clear_core_mt_definitional_info_alt() {
        {
            SubLObject cs = $core_mt_definitional_info_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_core_mt_definitional_info() {
        final SubLObject cs = $core_mt_definitional_info_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_core_mt_definitional_info_alt(SubLObject fort) {
        return memoization_state.caching_state_remove_function_results_with_args($core_mt_definitional_info_caching_state$.getGlobalValue(), list(fort), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_core_mt_definitional_info(final SubLObject fort) {
        return memoization_state.caching_state_remove_function_results_with_args($core_mt_definitional_info_caching_state$.getGlobalValue(), list(fort), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject core_mt_definitional_info_internal_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject cdolist_list_var = $core_defining_arg1_predicates_info$.getDynamicValue(thread);
                    SubLObject pred_info = NIL;
                    for (pred_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred_info = cdolist_list_var.first()) {
                        {
                            SubLObject datum = pred_info;
                            SubLObject current = datum;
                            SubLObject pred = NIL;
                            SubLObject all_func = NIL;
                            SubLObject test_func = NIL;
                            SubLObject reflexive = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt24);
                            pred = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt24);
                            all_func = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt24);
                            test_func = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt24);
                            reflexive = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (kb_indexing.num_gaf_arg_index(fort, ONE_INTEGER, pred, UNPROVIDED).numG(ZERO_INTEGER)) {
                                    {
                                        SubLObject core_mt_true_gafs = kb_mapping_utilities.pred_value_gafs_in_relevant_mts(fort, pred, $$CoreCycLMt, ONE_INTEGER, $TRUE);
                                        SubLObject core_mt_false_gafs = kb_mapping_utilities.pred_value_gafs_in_relevant_mts(fort, pred, $$CoreCycLMt, ONE_INTEGER, $FALSE);
                                        SubLObject true_values = Mapping.mapcar(symbol_function(GAF_ARG2), core_mt_true_gafs);
                                        SubLObject false_values = Mapping.mapcar(symbol_function(GAF_ARG2), core_mt_false_gafs);
                                        SubLObject true_value_tuples = NIL;
                                        SubLObject false_value_tuples = NIL;
                                        if ((NIL != all_func) && (NIL != test_func)) {
                                            true_values = com.cyc.cycjava.cycl.core.minimal_core_mt_implied_core_values(fort, true_values, all_func, test_func, reflexive);
                                            if (pred == $$isa) {
                                                true_values = delete($$CycLConstant, true_values, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                            if (pred == $$quotedIsa) {
                                                true_values = delete($$CycLConstant, true_values, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        }
                                        false_values = list_utilities.delete_if_not(symbol_function(CACHED_CORE_FORT_P), false_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        {
                                            SubLObject cdolist_list_var_7 = core_mt_true_gafs;
                                            SubLObject core_mt_true_gaf = NIL;
                                            for (core_mt_true_gaf = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , core_mt_true_gaf = cdolist_list_var_7.first()) {
                                                {
                                                    SubLObject value = assertions_high.gaf_arg2(core_mt_true_gaf);
                                                    if (NIL != subl_promotions.memberP(value, true_values, UNPROVIDED, UNPROVIDED)) {
                                                        true_value_tuples = cons(list(value, assertions_high.assertion_mt(core_mt_true_gaf)), true_value_tuples);
                                                    }
                                                }
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var_8 = core_mt_false_gafs;
                                            SubLObject core_mt_false_gaf = NIL;
                                            for (core_mt_false_gaf = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , core_mt_false_gaf = cdolist_list_var_8.first()) {
                                                {
                                                    SubLObject value = assertions_high.gaf_arg2(core_mt_false_gaf);
                                                    if (NIL != subl_promotions.memberP(value, false_values, UNPROVIDED, UNPROVIDED)) {
                                                        false_value_tuples = cons(list(value, assertions_high.assertion_mt(core_mt_false_gaf)), false_value_tuples);
                                                    }
                                                }
                                            }
                                        }
                                        v_answer = cons(bq_cons(pred, append(NIL != true_value_tuples ? ((SubLObject) (list(bq_cons($TRUE, append(true_value_tuples, NIL))))) : NIL, NIL != false_value_tuples ? ((SubLObject) (list(bq_cons($FALSE, append(false_value_tuples, NIL))))) : NIL, NIL)), v_answer);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt24);
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = $core_defining_arg2_predicates_info$.getDynamicValue(thread);
                    SubLObject pred_info = NIL;
                    for (pred_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred_info = cdolist_list_var.first()) {
                        {
                            SubLObject datum = pred_info;
                            SubLObject current = datum;
                            SubLObject pred = NIL;
                            SubLObject all_func = NIL;
                            SubLObject test_func = NIL;
                            SubLObject reflexive = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt24);
                            pred = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt24);
                            all_func = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt24);
                            test_func = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt24);
                            reflexive = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (kb_indexing.num_gaf_arg_index(fort, TWO_INTEGER, pred, UNPROVIDED).numG(ZERO_INTEGER)) {
                                    {
                                        SubLObject core_mt_true_gafs = kb_mapping_utilities.pred_value_gafs_in_relevant_mts(fort, pred, $$CoreCycLMt, TWO_INTEGER, $TRUE);
                                        SubLObject core_mt_false_gafs = kb_mapping_utilities.pred_value_gafs_in_relevant_mts(fort, pred, $$CoreCycLMt, TWO_INTEGER, $FALSE);
                                        SubLObject true_values = Mapping.mapcar(symbol_function(GAF_ARG1), core_mt_true_gafs);
                                        SubLObject false_values = Mapping.mapcar(symbol_function(GAF_ARG1), core_mt_false_gafs);
                                        SubLObject true_value_tuples = NIL;
                                        SubLObject false_value_tuples = NIL;
                                        if ((NIL != all_func) && (NIL != test_func)) {
                                            true_values = com.cyc.cycjava.cycl.core.minimal_core_mt_implied_core_values(fort, true_values, all_func, test_func, reflexive);
                                        }
                                        false_values = list_utilities.delete_if_not(symbol_function(CACHED_CORE_FORT_P), false_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        {
                                            SubLObject cdolist_list_var_9 = core_mt_true_gafs;
                                            SubLObject core_mt_true_gaf = NIL;
                                            for (core_mt_true_gaf = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , core_mt_true_gaf = cdolist_list_var_9.first()) {
                                                {
                                                    SubLObject value = assertions_high.gaf_arg1(core_mt_true_gaf);
                                                    if (NIL != subl_promotions.memberP(value, true_values, UNPROVIDED, UNPROVIDED)) {
                                                        true_value_tuples = cons(list(value, assertions_high.assertion_mt(core_mt_true_gaf)), true_value_tuples);
                                                    }
                                                }
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var_10 = core_mt_false_gafs;
                                            SubLObject core_mt_false_gaf = NIL;
                                            for (core_mt_false_gaf = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , core_mt_false_gaf = cdolist_list_var_10.first()) {
                                                {
                                                    SubLObject value = assertions_high.gaf_arg1(core_mt_false_gaf);
                                                    if (NIL != subl_promotions.memberP(value, false_values, UNPROVIDED, UNPROVIDED)) {
                                                        false_value_tuples = cons(list(value, assertions_high.assertion_mt(core_mt_false_gaf)), false_value_tuples);
                                                    }
                                                }
                                            }
                                        }
                                        v_answer = cons(bq_cons(pred, append(NIL != true_value_tuples ? ((SubLObject) (list(bq_cons($TRUE, append(true_value_tuples, NIL))))) : NIL, NIL != false_value_tuples ? ((SubLObject) (list(bq_cons($FALSE, append(false_value_tuples, NIL))))) : NIL, NIL)), v_answer);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt24);
                            }
                        }
                    }
                }
                return nreverse(v_answer);
            }
        }
    }

    public static SubLObject core_mt_definitional_info_internal(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = $core_defining_arg1_predicates_info$.getDynamicValue(thread);
        SubLObject pred_info = NIL;
        pred_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pred_info;
            SubLObject pred = NIL;
            SubLObject all_func = NIL;
            SubLObject test_func = NIL;
            SubLObject reflexive = NIL;
            destructuring_bind_must_consp(current, datum, $list24);
            pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list24);
            all_func = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list24);
            test_func = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list24);
            reflexive = current.first();
            current = current.rest();
            if (NIL == current) {
                if (kb_indexing.num_gaf_arg_index(fort, ONE_INTEGER, pred, UNPROVIDED).numG(ZERO_INTEGER)) {
                    final SubLObject core_mt_true_gafs = kb_mapping_utilities.pred_value_gafs_in_relevant_mts(fort, pred, $$CoreCycLMt, ONE_INTEGER, $TRUE);
                    final SubLObject core_mt_false_gafs = kb_mapping_utilities.pred_value_gafs_in_relevant_mts(fort, pred, $$CoreCycLMt, ONE_INTEGER, $FALSE);
                    SubLObject true_values = Mapping.mapcar(symbol_function(GAF_ARG2), core_mt_true_gafs);
                    SubLObject false_values = Mapping.mapcar(symbol_function(GAF_ARG2), core_mt_false_gafs);
                    SubLObject true_value_tuples = NIL;
                    SubLObject false_value_tuples = NIL;
                    if ((NIL != all_func) && (NIL != test_func)) {
                        true_values = minimal_core_mt_implied_core_values(fort, true_values, all_func, test_func, reflexive);
                        if (pred.eql($$isa)) {
                            true_values = delete($$CycLConstant, true_values, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if (pred.eql($$quotedIsa)) {
                            true_values = delete($$CycLConstant, true_values, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    false_values = list_utilities.delete_if_not(symbol_function(CACHED_CORE_FORT_P), false_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var_$11 = core_mt_true_gafs;
                    SubLObject core_mt_true_gaf = NIL;
                    core_mt_true_gaf = cdolist_list_var_$11.first();
                    while (NIL != cdolist_list_var_$11) {
                        final SubLObject value = assertions_high.gaf_arg2(core_mt_true_gaf);
                        if (NIL != subl_promotions.memberP(value, true_values, UNPROVIDED, UNPROVIDED)) {
                            true_value_tuples = cons(list(value, assertions_high.assertion_mt(core_mt_true_gaf)), true_value_tuples);
                        }
                        cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                        core_mt_true_gaf = cdolist_list_var_$11.first();
                    } 
                    SubLObject cdolist_list_var_$12 = core_mt_false_gafs;
                    SubLObject core_mt_false_gaf = NIL;
                    core_mt_false_gaf = cdolist_list_var_$12.first();
                    while (NIL != cdolist_list_var_$12) {
                        final SubLObject value = assertions_high.gaf_arg2(core_mt_false_gaf);
                        if (NIL != subl_promotions.memberP(value, false_values, UNPROVIDED, UNPROVIDED)) {
                            false_value_tuples = cons(list(value, assertions_high.assertion_mt(core_mt_false_gaf)), false_value_tuples);
                        }
                        cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                        core_mt_false_gaf = cdolist_list_var_$12.first();
                    } 
                    v_answer = cons(bq_cons(pred, append(NIL != true_value_tuples ? list(bq_cons($TRUE, append(true_value_tuples, NIL))) : NIL, NIL != false_value_tuples ? list(bq_cons($FALSE, append(false_value_tuples, NIL))) : NIL, NIL)), v_answer);
                }
            } else {
                cdestructuring_bind_error(datum, $list24);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred_info = cdolist_list_var.first();
        } 
        cdolist_list_var = $core_defining_arg2_predicates_info$.getDynamicValue(thread);
        pred_info = NIL;
        pred_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pred_info;
            SubLObject pred = NIL;
            SubLObject all_func = NIL;
            SubLObject test_func = NIL;
            SubLObject reflexive = NIL;
            destructuring_bind_must_consp(current, datum, $list24);
            pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list24);
            all_func = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list24);
            test_func = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list24);
            reflexive = current.first();
            current = current.rest();
            if (NIL == current) {
                if (kb_indexing.num_gaf_arg_index(fort, TWO_INTEGER, pred, UNPROVIDED).numG(ZERO_INTEGER)) {
                    final SubLObject core_mt_true_gafs = kb_mapping_utilities.pred_value_gafs_in_relevant_mts(fort, pred, $$CoreCycLMt, TWO_INTEGER, $TRUE);
                    final SubLObject core_mt_false_gafs = kb_mapping_utilities.pred_value_gafs_in_relevant_mts(fort, pred, $$CoreCycLMt, TWO_INTEGER, $FALSE);
                    SubLObject true_values = Mapping.mapcar(symbol_function(GAF_ARG1), core_mt_true_gafs);
                    SubLObject false_values = Mapping.mapcar(symbol_function(GAF_ARG1), core_mt_false_gafs);
                    SubLObject true_value_tuples = NIL;
                    SubLObject false_value_tuples = NIL;
                    if ((NIL != all_func) && (NIL != test_func)) {
                        true_values = minimal_core_mt_implied_core_values(fort, true_values, all_func, test_func, reflexive);
                    }
                    false_values = list_utilities.delete_if_not(symbol_function(CACHED_CORE_FORT_P), false_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var_$13 = core_mt_true_gafs;
                    SubLObject core_mt_true_gaf = NIL;
                    core_mt_true_gaf = cdolist_list_var_$13.first();
                    while (NIL != cdolist_list_var_$13) {
                        final SubLObject value = assertions_high.gaf_arg1(core_mt_true_gaf);
                        if (NIL != subl_promotions.memberP(value, true_values, UNPROVIDED, UNPROVIDED)) {
                            true_value_tuples = cons(list(value, assertions_high.assertion_mt(core_mt_true_gaf)), true_value_tuples);
                        }
                        cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                        core_mt_true_gaf = cdolist_list_var_$13.first();
                    } 
                    SubLObject cdolist_list_var_$14 = core_mt_false_gafs;
                    SubLObject core_mt_false_gaf = NIL;
                    core_mt_false_gaf = cdolist_list_var_$14.first();
                    while (NIL != cdolist_list_var_$14) {
                        final SubLObject value = assertions_high.gaf_arg1(core_mt_false_gaf);
                        if (NIL != subl_promotions.memberP(value, false_values, UNPROVIDED, UNPROVIDED)) {
                            false_value_tuples = cons(list(value, assertions_high.assertion_mt(core_mt_false_gaf)), false_value_tuples);
                        }
                        cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                        core_mt_false_gaf = cdolist_list_var_$14.first();
                    } 
                    v_answer = cons(bq_cons(pred, append(NIL != true_value_tuples ? list(bq_cons($TRUE, append(true_value_tuples, NIL))) : NIL, NIL != false_value_tuples ? list(bq_cons($FALSE, append(false_value_tuples, NIL))) : NIL, NIL)), v_answer);
                }
            } else {
                cdestructuring_bind_error(datum, $list24);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred_info = cdolist_list_var.first();
        } 
        return nreverse(v_answer);
    }

    public static final SubLObject core_mt_definitional_info_alt(SubLObject fort) {
        {
            SubLObject caching_state = $core_mt_definitional_info_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CORE_MT_DEFINITIONAL_INFO, $core_mt_definitional_info_caching_state$, NIL, EQL, ONE_INTEGER, $int$300);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, $kw32$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw32$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.core.core_mt_definitional_info_internal(fort)));
                    memoization_state.caching_state_put(caching_state, fort, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject core_mt_definitional_info(final SubLObject fort) {
        SubLObject caching_state = $core_mt_definitional_info_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CORE_MT_DEFINITIONAL_INFO, $core_mt_definitional_info_caching_state$, NIL, EQL, ONE_INTEGER, $int$300);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(core_mt_definitional_info_internal(fort)));
            memoization_state.caching_state_put(caching_state, fort, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject minimal_core_mt_implied_core_values_alt(SubLObject fort, SubLObject given_values, SubLObject all_func, SubLObject test_func, SubLObject reflexive) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != list_utilities.every_in_list(symbol_function(CACHED_CORE_FORT_P), given_values, UNPROVIDED)) {
                return given_values;
            }
            {
                SubLObject full_values = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind($$CoreCycLMt, thread);
                        {
                            SubLObject cdolist_list_var = given_values;
                            SubLObject value = NIL;
                            for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                                full_values = nunion(full_values, funcall(all_func, value), UNPROVIDED, UNPROVIDED);
                            }
                            full_values = list_utilities.delete_if_not(symbol_function(CACHED_CORE_FORT_P), full_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject cycle_set = NIL;
                                if (NIL != reflexive) {
                                    full_values = delete(fort, full_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    cycle_set = com.cyc.cycjava.cycl.core.core_cycle_set(fort, full_values, test_func);
                                    if (NIL != cycle_set) {
                                        Errors.warn($str_alt33$__Cycle___S__S__S, test_func, fort, cycle_set);
                                        full_values = nset_difference(full_values, cycle_set, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                                full_values = list_utilities.delete_subsumed_items(full_values, test_func, UNPROVIDED);
                                if (NIL != cycle_set) {
                                    full_values = nunion(cycle_set, full_values, UNPROVIDED, UNPROVIDED);
                                    Errors.warn($str_alt34$__Given___S__Minimal___S, given_values, full_values);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return full_values;
            }
        }
    }

    public static SubLObject minimal_core_mt_implied_core_values(final SubLObject fort, final SubLObject given_values, final SubLObject all_func, final SubLObject test_func, final SubLObject reflexive) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.every_in_list(symbol_function(CACHED_CORE_FORT_P), given_values, UNPROVIDED)) {
            return given_values;
        }
        SubLObject full_values = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind($$CoreCycLMt, thread);
            SubLObject cdolist_list_var = given_values;
            SubLObject value = NIL;
            value = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                full_values = nunion(full_values, funcall(all_func, value), UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                value = cdolist_list_var.first();
            } 
            full_values = list_utilities.delete_if_not(symbol_function(CACHED_CORE_FORT_P), full_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cycle_set = NIL;
            if (NIL != reflexive) {
                full_values = delete(fort, full_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cycle_set = core_cycle_set(fort, full_values, test_func);
                if (NIL != cycle_set) {
                    Errors.warn($str32$__Cycle___S__S__S, test_func, fort, cycle_set);
                    full_values = nset_difference(full_values, cycle_set, UNPROVIDED, UNPROVIDED);
                }
            }
            full_values = list_utilities.delete_subsumed_items(full_values, test_func, UNPROVIDED);
            if (NIL != cycle_set) {
                full_values = nunion(cycle_set, full_values, UNPROVIDED, UNPROVIDED);
                Errors.warn($str33$__Given___S__Minimal___S, given_values, full_values);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return full_values;
    }

    /**
     * Load a core KB that has been saved in FILENAME.
     */
    @LispMethod(comment = "Load a core KB that has been saved in FILENAME.")
    public static final SubLObject load_core_kb_alt(SubLObject filename) {
        return batch_ke.load_api(filename, UNPROVIDED);
    }

    /**
     * Load a core KB that has been saved in FILENAME.
     */
    @LispMethod(comment = "Load a core KB that has been saved in FILENAME.")
    public static SubLObject load_core_kb(final SubLObject filename) {
        return batch_ke.load_api(filename, UNPROVIDED);
    }

    public static final SubLObject write_core_kb_alt(SubLObject output_filename) {
        com.cyc.cycjava.cycl.core.write_core_definition(output_filename, T);
        return NIL;
    }

    public static SubLObject write_core_kb(final SubLObject output_filename) {
        write_core_definition(output_filename, T);
        return NIL;
    }

    public static final SubLObject write_core_definition_alt(SubLObject output_filename, SubLObject computeP) {
        if (computeP == UNPROVIDED) {
            computeP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != computeP) {
                com.cyc.cycjava.cycl.core.compute_core_definitional_info();
            }
            {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(output_filename, $OUTPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt43$Unable_to_open__S, output_filename);
                    }
                    {
                        SubLObject s = stream;
                        format(s, $str_alt44$_______Mode__LISP__Package__CYC__);
                        format(s, $str_alt45$____);
                        format(s, $str_alt46$______A, misc_utilities.copyright_notice());
                        format(s, $str_alt45$____);
                        format(s, $str_alt46$______A, output_filename);
                        format(s, $str_alt46$______A, numeric_date_utilities.timestring(UNPROVIDED));
                        format(s, $str_alt45$____);
                        format(s, $str_alt47$_____Core_KB_for_CycL_version__A_, new SubLObject[]{ system_info.cyc_revision_string(), kb_loaded(), operation_communication.kb_op_number() });
                        format(s, $str_alt45$____);
                        format(s, $str_alt48$_____This_file_is_automatically_g);
                        format(s, $str_alt49$_________________________________);
                        format(s, $str_alt50$_____in_package__CYC__);
                        format(s, $str_alt51$_______initialization);
                        format(s, $str_alt52$___core_kb_initialization__S_, length(com.cyc.cycjava.cycl.core.all_core_forts()));
                        format(s, $str_alt53$_______constants);
                        {
                            SubLObject list_var = com.cyc.cycjava.cycl.core.all_core_constants();
                            $progress_note$.setDynamicValue($$$constant_creates, thread);
                            $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            $progress_total$.setDynamicValue(length(list_var), thread);
                            $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject v_term = NIL;
                                        for (v_term = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            com.cyc.cycjava.cycl.core.write_core_constant_creation(v_term, s);
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        format(s, $str_alt55$_____core_kb_start_bootstrapping_);
                        format(s, $str_alt56$_______NARTs);
                        {
                            SubLObject list_var = com.cyc.cycjava.cycl.core.all_core_narts();
                            $progress_note$.setDynamicValue($$$NART_creates, thread);
                            $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            $progress_total$.setDynamicValue(length(list_var), thread);
                            $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject v_term = NIL;
                                        for (v_term = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            com.cyc.cycjava.cycl.core.write_core_nart_creation(v_term, s);
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        format(s, $str_alt58$_______after_adding_early_extent_);
                        {
                            SubLObject list_var = com.cyc.cycjava.cycl.core.all_core_forts();
                            $progress_note$.setDynamicValue($$$after_adding_early_extent_asserts, thread);
                            $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            $progress_total$.setDynamicValue(length(list_var), thread);
                            $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject v_term = NIL;
                                        for (v_term = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            com.cyc.cycjava.cycl.core.write_core_after_adding_info_to_stream(v_term, s);
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        format(s, $str_alt60$_______Core_mt_definitional_asser);
                        {
                            SubLObject list_var = com.cyc.cycjava.cycl.core.all_core_forts();
                            $progress_note$.setDynamicValue($$$Core_mt_definitional_asserts, thread);
                            $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            $progress_total$.setDynamicValue(length(list_var), thread);
                            $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject v_term = NIL;
                                        for (v_term = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            com.cyc.cycjava.cycl.core.write_core_mt_definitional_info_to_stream(v_term, s);
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        format(s, $str_alt62$_______decontextualization_early_);
                        {
                            SubLObject list_var = com.cyc.cycjava.cycl.core.all_core_forts();
                            $progress_note$.setDynamicValue($str_alt63$decontextualization_early_extent_, thread);
                            $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            $progress_total$.setDynamicValue(length(list_var), thread);
                            $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject v_term = NIL;
                                        for (v_term = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            com.cyc.cycjava.cycl.core.write_core_decontextualization_info_to_stream(v_term, s);
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        format(s, $str_alt64$_____core_kb_start_definitions_);
                        format(s, $str_alt65$_______definitional_assertions);
                        {
                            SubLObject list_var = com.cyc.cycjava.cycl.core.all_core_forts();
                            $progress_note$.setDynamicValue($$$definitional_asserts, thread);
                            $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            $progress_total$.setDynamicValue(length(list_var), thread);
                            $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject v_term = NIL;
                                        for (v_term = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            com.cyc.cycjava.cycl.core.write_core_definitional_info_to_stream(v_term, s);
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        format(s, $str_alt67$_______post_definitional_initiali);
                        format(s, $str_alt68$___core_kb_finish_definitions_);
                        format(s, $str_alt69$_______additional_gaf_assertions);
                        {
                            SubLObject list_var = com.cyc.cycjava.cycl.core.all_core_forts();
                            $progress_note$.setDynamicValue($$$additional_gaf_asserts, thread);
                            $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            $progress_total$.setDynamicValue(length(list_var), thread);
                            $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject v_term = NIL;
                                        for (v_term = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            com.cyc.cycjava.cycl.core.write_core_additional_gaf_info_to_stream(v_term, s);
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        format(s, $str_alt71$_____core_kb_finish_bootstrapping);
                        format(s, $str_alt72$_______rules__asserting_forward_r);
                        {
                            SubLObject list_var = com.cyc.cycjava.cycl.core.all_core_rules();
                            $progress_note$.setDynamicValue($str_alt73$core_rules_with_meta_assertions__, thread);
                            $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            $progress_total$.setDynamicValue(length(list_var), thread);
                            $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject rule = NIL;
                                        for (rule = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , rule = csome_list_var.first()) {
                                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            if (NIL != assertion_utilities.assertion_has_meta_assertionsP(rule)) {
                                                com.cyc.cycjava.cycl.core.write_core_rule_assert_backward_if_forward(rule, s);
                                            }
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        {
                            SubLObject list_var = com.cyc.cycjava.cycl.core.all_core_rules();
                            $progress_note$.setDynamicValue($str_alt74$core_rules_without_meta_assertion, thread);
                            $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            $progress_total$.setDynamicValue(length(list_var), thread);
                            $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject rule = NIL;
                                        for (rule = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , rule = csome_list_var.first()) {
                                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            if (NIL == assertion_utilities.assertion_has_meta_assertionsP(rule)) {
                                                com.cyc.cycjava.cycl.core.write_core_rule_assert_backward_if_forward(rule, s);
                                            }
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        format(s, $str_alt75$_______forward_rules__reasserting);
                        {
                            SubLObject list_var = com.cyc.cycjava.cycl.core.all_core_rules();
                            $progress_note$.setDynamicValue($str_alt76$core_rules_with_meta_assertions, thread);
                            $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            $progress_total$.setDynamicValue(length(list_var), thread);
                            $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject rule = NIL;
                                        for (rule = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , rule = csome_list_var.first()) {
                                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            if (NIL != assertion_utilities.assertion_has_meta_assertionsP(rule)) {
                                                com.cyc.cycjava.cycl.core.write_core_rule_reassert_as_forward_if_forward(rule, s);
                                            }
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        {
                            SubLObject list_var = com.cyc.cycjava.cycl.core.all_core_rules();
                            $progress_note$.setDynamicValue($str_alt77$core_rules_without_meta_assertion, thread);
                            $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            $progress_total$.setDynamicValue(length(list_var), thread);
                            $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject rule = NIL;
                                        for (rule = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , rule = csome_list_var.first()) {
                                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            if (NIL == assertion_utilities.assertion_has_meta_assertionsP(rule)) {
                                                com.cyc.cycjava.cycl.core.write_core_rule_reassert_as_forward_if_forward(rule, s);
                                            }
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        format(s, $str_alt78$_______late_assertions);
                        com.cyc.cycjava.cycl.core.write_late_assertions_to_stream(s);
                        format(s, $str_alt79$_______finalization);
                        format(s, $str_alt80$___core_kb_finalization_);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject write_core_definition(final SubLObject output_filename, SubLObject computeP) {
        if (computeP == UNPROVIDED) {
            computeP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != computeP) {
            compute_core_definitional_info();
        }
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(output_filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str42$Unable_to_open__S, output_filename);
            }
            final SubLObject s = stream;
            format(s, $str43$_______Mode__LISP__Package__CYC__);
            format(s, $str44$____);
            format(s, $str45$______A, misc_utilities.copyright_notice());
            format(s, $str44$____);
            format(s, $str45$______A, output_filename);
            format(s, $str45$______A, numeric_date_utilities.timestring(UNPROVIDED));
            format(s, $str44$____);
            format(s, $str46$_____Core_KB_for_CycL_version__A_, new SubLObject[]{ system_info.cyc_revision_string(), kb_loaded(), operation_communication.kb_op_number() });
            format(s, $str44$____);
            format(s, $str47$_____This_file_is_automatically_g);
            format(s, $str48$_________________________________);
            format(s, $str49$_____in_package__CYC__);
            format(s, $str50$_______initialization);
            format(s, $str51$___core_kb_initialization__S_, length(all_core_forts()));
            format(s, $str52$_______constants);
            SubLObject list_var = all_core_constants();
            SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
            SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$constant_creates, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject v_term = NIL;
                    v_term = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        write_core_constant_creation(v_term, s);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        v_term = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0, thread);
            }
            format(s, $str54$_____core_kb_start_bootstrapping_);
            format(s, $str55$_______NARTs);
            list_var = all_core_narts();
            _prev_bind_0 = $progress_note$.currentBinding(thread);
            _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            _prev_bind_3 = $progress_total$.currentBinding(thread);
            _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$NART_creates, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject v_term = NIL;
                    v_term = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        write_core_nart_creation(v_term, s);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        v_term = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0, thread);
            }
            format(s, $str57$_______after_adding_early_extent_);
            list_var = all_core_forts();
            _prev_bind_0 = $progress_note$.currentBinding(thread);
            _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            _prev_bind_3 = $progress_total$.currentBinding(thread);
            _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$after_adding_early_extent_asserts, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject v_term = NIL;
                    v_term = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        write_core_after_adding_info_to_stream(v_term, s);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        v_term = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0, thread);
            }
            format(s, $str59$_______Core_mt_definitional_asser);
            list_var = all_core_forts();
            _prev_bind_0 = $progress_note$.currentBinding(thread);
            _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            _prev_bind_3 = $progress_total$.currentBinding(thread);
            _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$Core_mt_definitional_asserts, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject v_term = NIL;
                    v_term = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        write_core_mt_definitional_info_to_stream(v_term, s);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        v_term = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values4 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values4);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0, thread);
            }
            format(s, $str61$_______decontextualization_early_);
            list_var = all_core_forts();
            _prev_bind_0 = $progress_note$.currentBinding(thread);
            _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            _prev_bind_3 = $progress_total$.currentBinding(thread);
            _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str62$decontextualization_early_extent_, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject v_term = NIL;
                    v_term = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        write_core_decontextualization_info_to_stream(v_term, s);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        v_term = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values5 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values5);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0, thread);
            }
            format(s, $str63$_____core_kb_start_definitions_);
            format(s, $str64$_______definitional_assertions);
            list_var = all_core_forts();
            _prev_bind_0 = $progress_note$.currentBinding(thread);
            _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            _prev_bind_3 = $progress_total$.currentBinding(thread);
            _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$definitional_asserts, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject v_term = NIL;
                    v_term = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        write_core_definitional_info_to_stream(v_term, s);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        v_term = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values6 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values6);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0, thread);
            }
            format(s, $str66$_______post_definitional_initiali);
            format(s, $str67$___core_kb_finish_definitions_);
            format(s, $str68$_______additional_gaf_assertions);
            list_var = all_core_forts();
            _prev_bind_0 = $progress_note$.currentBinding(thread);
            _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            _prev_bind_3 = $progress_total$.currentBinding(thread);
            _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$additional_gaf_asserts, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject v_term = NIL;
                    v_term = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        write_core_additional_gaf_info_to_stream(v_term, s);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        v_term = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values7 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values7);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0, thread);
            }
            format(s, $str70$_____core_kb_finish_bootstrapping);
            format(s, $str71$_______rules__asserting_forward_r);
            list_var = all_core_rules();
            _prev_bind_0 = $progress_note$.currentBinding(thread);
            _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            _prev_bind_3 = $progress_total$.currentBinding(thread);
            _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str72$core_rules_with_meta_assertions__, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject rule = NIL;
                    rule = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if (NIL != assertion_utilities.assertion_has_meta_assertionsP(rule)) {
                            write_core_rule_assert_backward_if_forward(rule, s);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        rule = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values8 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values8);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0, thread);
            }
            list_var = all_core_rules();
            _prev_bind_0 = $progress_note$.currentBinding(thread);
            _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            _prev_bind_3 = $progress_total$.currentBinding(thread);
            _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str73$core_rules_without_meta_assertion, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject rule = NIL;
                    rule = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if (NIL == assertion_utilities.assertion_has_meta_assertionsP(rule)) {
                            write_core_rule_assert_backward_if_forward(rule, s);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        rule = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values9 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values9);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0, thread);
            }
            format(s, $str74$_______forward_rules__reasserting);
            list_var = all_core_rules();
            _prev_bind_0 = $progress_note$.currentBinding(thread);
            _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            _prev_bind_3 = $progress_total$.currentBinding(thread);
            _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str75$core_rules_with_meta_assertions, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject rule = NIL;
                    rule = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if (NIL != assertion_utilities.assertion_has_meta_assertionsP(rule)) {
                            write_core_rule_reassert_as_forward_if_forward(rule, s);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        rule = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values10 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values10);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0, thread);
            }
            list_var = all_core_rules();
            _prev_bind_0 = $progress_note$.currentBinding(thread);
            _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            _prev_bind_3 = $progress_total$.currentBinding(thread);
            _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str76$core_rules_without_meta_assertion, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject rule = NIL;
                    rule = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if (NIL == assertion_utilities.assertion_has_meta_assertionsP(rule)) {
                            write_core_rule_reassert_as_forward_if_forward(rule, s);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        rule = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values11 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values11);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0, thread);
            }
            format(s, $str77$_______meta_assertion_gafs);
            list_var = all_core_rules();
            _prev_bind_0 = $progress_note$.currentBinding(thread);
            _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            _prev_bind_3 = $progress_total$.currentBinding(thread);
            _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str78$meta_assertion_gafs, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject rule = NIL;
                    rule = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if (NIL != assertion_utilities.assertion_has_meta_assertionsP(rule)) {
                            write_core_rule_meta_assertion_gafs(rule, s);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        rule = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values12 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values12);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0, thread);
            }
            format(s, $str79$_______late_assertions);
            write_late_assertions_to_stream(s);
            format(s, $str80$_______finalization);
            format(s, $str81$___core_kb_finalization_);
        } finally {
            final SubLObject _prev_bind_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values13 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values13);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_9, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject low_create_nart_alt(SubLObject nart_hl_formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.core.ensure_bootstrapping_kb();
            {
                SubLObject nart = NIL;
                {
                    SubLObject _prev_bind_0 = after_adding.$after_addings_disabledP$.currentBinding(thread);
                    try {
                        after_adding.$after_addings_disabledP$.bind(T, thread);
                        nart = czer_main.low_find_or_create_nart(nart_hl_formula);
                    } finally {
                        after_adding.$after_addings_disabledP$.rebind(_prev_bind_0, thread);
                    }
                }
                return nart;
            }
        }
    }

    public static SubLObject low_create_nart(final SubLObject nart_hl_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        ensure_bootstrapping_kb();
        SubLObject nart = NIL;
        final SubLObject _prev_bind_0 = after_adding.$after_addings_disabledP$.currentBinding(thread);
        try {
            after_adding.$after_addings_disabledP$.bind(T, thread);
            nart = czer_main.low_find_or_create_nart(nart_hl_formula);
        } finally {
            after_adding.$after_addings_disabledP$.rebind(_prev_bind_0, thread);
        }
        return nart;
    }

    public static final SubLObject low_assert_gaf_alt(SubLObject sentence, SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = $FORWARD;
        }
        return com.cyc.cycjava.cycl.core.low_assert_literal(sentence, mt, strength, direction);
    }

    public static SubLObject low_assert_gaf(final SubLObject sentence, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = $FORWARD;
        }
        return low_assert_literal(sentence, mt, strength, direction);
    }

    public static final SubLObject ensure_bootstrapping_kb_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $bootstrapping_kbP$.getDynamicValue(thread)) {
                Errors.error($str_alt83$Illegal_operation____not_bootstra);
            }
            return NIL;
        }
    }

    public static SubLObject ensure_bootstrapping_kb() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $bootstrapping_kbP$.getDynamicValue(thread)) {
            Errors.error($str84$Illegal_operation____not_bootstra);
        }
        return NIL;
    }

    public static final SubLObject low_assert_literal_alt(SubLObject literal, SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = $FORWARD;
        }
        com.cyc.cycjava.cycl.core.ensure_bootstrapping_kb();
        {
            SubLObject asent = literal_atomic_sentence(literal);
            SubLObject cnf = (NIL != cycl_utilities.negatedP(literal)) ? ((SubLObject) (clauses.make_cnf(list(asent), NIL))) : clauses.make_cnf(NIL, list(asent));
            return com.cyc.cycjava.cycl.core.low_assert_cnf_internal(cnf, mt, strength, direction, NIL);
        }
    }

    public static SubLObject low_assert_literal(final SubLObject literal, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = $FORWARD;
        }
        ensure_bootstrapping_kb();
        final SubLObject asent = literal_atomic_sentence(literal);
        final SubLObject cnf = (NIL != cycl_utilities.negatedP(literal)) ? clauses.make_cnf(list(asent), NIL) : clauses.make_cnf(NIL, list(asent));
        return low_assert_cnf_internal(cnf, mt, strength, direction, NIL);
    }

    public static final SubLObject low_assert_cnf_alt(SubLObject cnf, SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = $BACKWARD;
        }
        com.cyc.cycjava.cycl.core.ensure_bootstrapping_kb();
        cnf = copy_tree(cnf);
        {
            SubLObject variable_map = NIL;
            SubLObject el_variables = list_utilities.tree_gather(cnf, $sym85$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject list_var = NIL;
            SubLObject el_variable = NIL;
            SubLObject variable_number = NIL;
            for (list_var = el_variables, el_variable = list_var.first(), variable_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , el_variable = list_var.first() , variable_number = add(ONE_INTEGER, variable_number)) {
                {
                    SubLObject hl_variable = variables.find_variable_by_id(variable_number);
                    variable_map = cons(bindings.make_variable_binding(el_variable, hl_variable), variable_map);
                }
            }
            variable_map = nreverse(variable_map);
            cnf = sublis(variable_map, cnf, UNPROVIDED, UNPROVIDED);
            return com.cyc.cycjava.cycl.core.low_assert_cnf_internal(cnf, mt, strength, direction, variable_map);
        }
    }

    public static SubLObject low_assert_cnf(SubLObject cnf, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = $BACKWARD;
        }
        ensure_bootstrapping_kb();
        cnf = copy_tree(cnf);
        SubLObject variable_map = NIL;
        final SubLObject el_variables = list_utilities.tree_gather(cnf, $sym86$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject list_var = NIL;
        SubLObject el_variable = NIL;
        SubLObject variable_number = NIL;
        list_var = el_variables;
        el_variable = list_var.first();
        for (variable_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , el_variable = list_var.first() , variable_number = add(ONE_INTEGER, variable_number)) {
            final SubLObject hl_variable = variables.find_variable_by_id(variable_number);
            variable_map = cons(bindings.make_variable_binding(el_variable, hl_variable), variable_map);
        }
        variable_map = nreverse(variable_map);
        cnf = sublis(variable_map, cnf, UNPROVIDED, UNPROVIDED);
        return low_assert_cnf_internal(cnf, mt, strength, direction, variable_map);
    }

    public static final SubLObject low_assert_cnf_internal_alt(SubLObject cnf, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject variable_map) {
        if (variable_map == UNPROVIDED) {
            variable_map = NIL;
        }
        return hl_storage_modules.hl_assert(cnf, mt, strength, direction, variable_map);
    }

    public static SubLObject low_assert_cnf_internal(final SubLObject cnf, final SubLObject mt, final SubLObject strength, final SubLObject direction, SubLObject variable_map) {
        if (variable_map == UNPROVIDED) {
            variable_map = NIL;
        }
        return hl_storage_modules.hl_assert(cnf, mt, strength, direction, variable_map);
    }

    public static final SubLObject core_kb_initialization_alt(SubLObject size) {
        $core_kb_start_time$.setGlobalValue(get_universal_time());
        format(T, $str_alt86$________Constructing_core_KB_at__, numeric_date_utilities.timestring($core_kb_start_time$.getGlobalValue()));
        kb_utilities.clear_kb_state(size);
        cardinality_estimates.setup_cardinality_tables(size);
        sbhl_link_methods.initialize_non_fort_isa_tables();
        kb_utilities.finalize_kb_tables();
        return NIL;
    }

    public static SubLObject core_kb_initialization(final SubLObject size) {
        $core_kb_start_time$.setGlobalValue(get_universal_time());
        format(T, $str87$________Constructing_core_KB_at__, numeric_date_utilities.timestring($core_kb_start_time$.getGlobalValue()));
        kb_utilities.clear_kb_state(size);
        cardinality_estimates.setup_cardinality_tables(size);
        sbhl_link_methods.initialize_non_fort_isa_tables();
        kb_utilities.finalize_kb_tables();
        return NIL;
    }

    public static final SubLObject core_kb_start_bootstrapping_alt() {
        Errors.$continue_cerrorP$.setDynamicValue(T);
        wff_utilities.set_dont_check_wff_semantics();
        czer_vars.$simplify_non_wff_literalP$.setDynamicValue(NIL);
        $bootstrapping_kbP$.setDynamicValue(T);
        sbhl_paranoia.$suppress_sbhl_recachingP$.setDynamicValue(T);
        sbhl_module_vars.rebuild_sbhl_modules();
        return NIL;
    }

    public static SubLObject core_kb_start_bootstrapping() {
        Errors.$continue_cerrorP$.setDynamicValue(T);
        wff_utilities.set_dont_check_wff_semantics();
        czer_vars.$simplify_non_wff_literalP$.setDynamicValue(NIL);
        $bootstrapping_kbP$.setDynamicValue(T);
        sbhl_paranoia.$suppress_sbhl_recachingP$.setDynamicValue(T);
        sbhl_module_vars.rebuild_sbhl_modules();
        somewhere_cache.reclassify_somewhere_cached_preds();
        return NIL;
    }

    public static final SubLObject core_kb_start_definitions_alt() {
        after_adding.rebuild_after_adding_caches();
        return NIL;
    }

    public static SubLObject core_kb_start_definitions() {
        after_adding.rebuild_after_adding_caches();
        return NIL;
    }

    public static final SubLObject core_kb_finish_definitions_alt() {
        sbhl_paranoia.$suppress_sbhl_recachingP$.setDynamicValue(NIL);
        sbhl_cache.initialize_all_sbhl_caching();
        return NIL;
    }

    public static SubLObject core_kb_finish_definitions() {
        sbhl_paranoia.$suppress_sbhl_recachingP$.setDynamicValue(NIL);
        sbhl_cache.initialize_all_sbhl_caching();
        return NIL;
    }

    public static final SubLObject core_kb_finish_bootstrapping_alt() {
        $bootstrapping_kbP$.setDynamicValue(NIL);
        misc_utilities.system_code_initializations(UNPROVIDED);
        dumper.initialize_kb_features();
        sbhl_cache.initialize_all_sbhl_caching();
        initialize_all_somewhere_caches();
        arity.rebuild_arity_cache();
        cardinality_estimates.initialize_cardinalities();
        auxiliary_indexing.reconstruct_auxiliary_indices();
        forward.perform_forward_inference();
        return NIL;
    }

    public static SubLObject core_kb_finish_bootstrapping() {
        $bootstrapping_kbP$.setDynamicValue(NIL);
        misc_utilities.system_code_initializations(UNPROVIDED);
        dumper.initialize_kb_features();
        sbhl_cache.initialize_all_sbhl_caching();
        somewhere_cache.initialize_all_somewhere_caches();
        arity.rebuild_arity_cache();
        cardinality_estimates.initialize_cardinalities();
        auxiliary_indexing.reconstruct_auxiliary_indices();
        wff_vars.$wff_mode$.setDynamicValue($STRICT);
        forward.perform_forward_inference();
        return NIL;
    }

    public static final SubLObject core_kb_finalization_alt() {
        wff_utilities.set_check_wff_semantics();
        czer_vars.$simplify_non_wff_literalP$.setDynamicValue(T);
        dumper.load_essential_kb_initializations();
        dumper.load_kb_initializations();
        kb_utilities.finalize_kb_tables();
        dumper.rebuild_computable_content();
        set_build_kb_loaded(ONE_INTEGER);
        if (NIL != $core_kb_start_time$.getGlobalValue()) {
            {
                SubLObject end_time = get_universal_time();
                SubLObject elapsed_time = subtract(end_time, $core_kb_start_time$.getGlobalValue());
                format(T, $str_alt87$________Construction_of_core_KB_c, numeric_date_utilities.elapsed_time_abbreviation_string(elapsed_time), numeric_date_utilities.timestring(end_time));
            }
        }
        kb_utilities.kb_statistics(UNPROVIDED);
        return NIL;
    }

    public static SubLObject core_kb_finalization() {
        wff_utilities.set_check_wff_semantics();
        wff.clear_assertive_wff_rules_cached();
        czer_main.clear_nart_defining_rules_cached();
        wff_vars.$wff_mode$.setDynamicValue($ASSERTIVE);
        czer_vars.$simplify_non_wff_literalP$.setDynamicValue(T);
        dumper.load_essential_kb_initializations();
        dumper.load_kb_initializations();
        kb_utilities.finalize_kb_tables();
        dumper.rebuild_computable_content();
        set_build_kb_loaded(ONE_INTEGER);
        if (NIL != $core_kb_start_time$.getGlobalValue()) {
            final SubLObject end_time = get_universal_time();
            final SubLObject elapsed_time = subtract(end_time, $core_kb_start_time$.getGlobalValue());
            format(T, $str90$________Construction_of_core_KB_c, numeric_date_utilities.elapsed_time_abbreviation_string(elapsed_time), numeric_date_utilities.timestring(end_time));
        }
        kb_utilities.kb_statistics(UNPROVIDED, UNPROVIDED);
        Storage.room(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject write_core_constant_creation_alt(SubLObject constant, SubLObject stream) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        {
            SubLObject name = constants_high.constant_name(constant);
            SubLObject external_id = constants_high.constant_external_id(constant);
            format(stream, $str_alt88$___find_or_create_constant__S__S_, name, external_id);
        }
        return constant;
    }

    public static SubLObject write_core_constant_creation(final SubLObject constant, final SubLObject stream) {
        assert NIL != constant_p(constant) : "! constant_handles.constant_p(constant) " + ("constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) ") + constant;
        final SubLObject name = constants_high.constant_name(constant);
        final SubLObject external_id = constants_high.constant_external_id(constant);
        format(stream, $str91$___find_or_create_constant__S__S_, name, external_id);
        return constant;
    }

    public static final SubLObject write_core_nart_creation_alt(SubLObject nart, SubLObject stream) {
        SubLTrampolineFile.checkType(nart, NART_P);
        terpri(stream);
        com.cyc.cycjava.cycl.core.write_core_nart_creation_internal(nart, stream, ZERO_INTEGER);
        return nart;
    }

    public static SubLObject write_core_nart_creation(final SubLObject nart, final SubLObject stream) {
        assert NIL != nart_handles.nart_p(nart) : "! nart_handles.nart_p(nart) " + ("nart_handles.nart_p(nart) " + "CommonSymbols.NIL != nart_handles.nart_p(nart) ") + nart;
        terpri(stream);
        write_core_nart_creation_internal(nart, stream, ZERO_INTEGER);
        return nart;
    }

    public static final SubLObject write_core_nart_creation_internal_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        if (NIL != nart_p(v_object)) {
            {
                SubLObject hl_formula = narts_high.nart_hl_formula(v_object);
                if (!depth.numE(ZERO_INTEGER)) {
                    princ($str_alt90$_, stream);
                }
                princ($str_alt91$_low_create_nart___, stream);
                {
                    SubLObject cdolist_list_var = hl_formula;
                    SubLObject arg = NIL;
                    for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                        if (arg != hl_formula.first()) {
                            princ($str_alt92$_, stream);
                        }
                        com.cyc.cycjava.cycl.core.write_core_nart_creation_internal(arg, stream, add(depth, ONE_INTEGER));
                    }
                }
                princ($str_alt93$__, stream);
            }
        } else {
            prin1(v_object, stream);
        }
        return v_object;
    }

    public static SubLObject write_core_nart_creation_internal(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        if (NIL != nart_handles.nart_p(v_object)) {
            final SubLObject hl_formula = narts_high.nart_hl_formula(v_object);
            if (!depth.numE(ZERO_INTEGER)) {
                princ($str93$_, stream);
            }
            princ($str94$_low_create_nart___, stream);
            SubLObject cdolist_list_var = hl_formula;
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (!arg.eql(hl_formula.first())) {
                    princ($$$_, stream);
                }
                write_core_nart_creation_internal(arg, stream, add(depth, ONE_INTEGER));
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
            princ($str96$__, stream);
        } else {
            prin1(v_object, stream);
        }
        return v_object;
    }

    public static final SubLObject write_core_mt_definitional_info_to_stream_alt(SubLObject fort, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            format(stream, $str_alt94$________S, forts.fort_el_formula(fort));
            {
                SubLObject info = com.cyc.cycjava.cycl.core.core_mt_definitional_info(fort);
                SubLObject cdolist_list_var = info;
                SubLObject pred_info = NIL;
                for (pred_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred_info = cdolist_list_var.first()) {
                    {
                        SubLObject datum = pred_info;
                        SubLObject current = datum;
                        SubLObject pred = NIL;
                        SubLObject truths = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt95);
                        pred = current.first();
                        current = current.rest();
                        truths = current;
                        {
                            SubLObject arg2_predicate = member(pred, $core_defining_arg2_predicates_info$.getDynamicValue(thread), symbol_function(EQL), symbol_function(FIRST));
                            SubLObject cdolist_list_var_11 = truths;
                            SubLObject truth_info = NIL;
                            for (truth_info = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , truth_info = cdolist_list_var_11.first()) {
                                {
                                    SubLObject datum_12 = truth_info;
                                    SubLObject current_13 = datum_12;
                                    SubLObject truth = NIL;
                                    SubLObject values = NIL;
                                    destructuring_bind_must_consp(current_13, datum_12, $list_alt97);
                                    truth = current_13.first();
                                    current_13 = current_13.rest();
                                    values = current_13;
                                    {
                                        SubLObject cdolist_list_var_14 = values;
                                        SubLObject truth_value = NIL;
                                        for (truth_value = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , truth_value = cdolist_list_var_14.first()) {
                                            {
                                                SubLObject datum_15 = truth_value;
                                                SubLObject current_16 = datum_15;
                                                SubLObject value = NIL;
                                                SubLObject mt = NIL;
                                                destructuring_bind_must_consp(current_16, datum_15, $list_alt98);
                                                value = current_16.first();
                                                current_16 = current_16.rest();
                                                destructuring_bind_must_consp(current_16, datum_15, $list_alt98);
                                                mt = current_16.first();
                                                current_16 = current_16.rest();
                                                if (NIL == current_16) {
                                                    {
                                                        SubLObject formula = NIL;
                                                        if (NIL != arg2_predicate) {
                                                            formula = list(pred, value, fort);
                                                        } else {
                                                            formula = list(pred, fort, value);
                                                        }
                                                        if (truth != $TRUE) {
                                                            formula = cycl_utilities.negate(formula);
                                                        }
                                                        com.cyc.cycjava.cycl.core.write_core_low_assert(formula, mt, stream, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum_15, $list_alt98);
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
            return fort;
        }
    }

    public static SubLObject write_core_mt_definitional_info_to_stream(final SubLObject fort, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(stream, $str97$________S, forts.fort_el_formula(fort));
        SubLObject cdolist_list_var;
        final SubLObject info = cdolist_list_var = core_mt_definitional_info(fort);
        SubLObject pred_info = NIL;
        pred_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pred_info;
            SubLObject pred = NIL;
            SubLObject truths = NIL;
            destructuring_bind_must_consp(current, datum, $list98);
            pred = current.first();
            current = truths = current.rest();
            final SubLObject arg2_predicate = member(pred, $core_defining_arg2_predicates_info$.getDynamicValue(thread), symbol_function(EQL), symbol_function(FIRST));
            SubLObject cdolist_list_var_$27 = truths;
            SubLObject truth_info = NIL;
            truth_info = cdolist_list_var_$27.first();
            while (NIL != cdolist_list_var_$27) {
                SubLObject current_$29;
                final SubLObject datum_$28 = current_$29 = truth_info;
                SubLObject truth = NIL;
                SubLObject values = NIL;
                destructuring_bind_must_consp(current_$29, datum_$28, $list100);
                truth = current_$29.first();
                current_$29 = current_$29.rest();
                SubLObject cdolist_list_var_$28;
                values = cdolist_list_var_$28 = current_$29;
                SubLObject truth_value = NIL;
                truth_value = cdolist_list_var_$28.first();
                while (NIL != cdolist_list_var_$28) {
                    SubLObject current_$30;
                    final SubLObject datum_$29 = current_$30 = truth_value;
                    SubLObject value = NIL;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current_$30, datum_$29, $list101);
                    value = current_$30.first();
                    current_$30 = current_$30.rest();
                    destructuring_bind_must_consp(current_$30, datum_$29, $list101);
                    mt = current_$30.first();
                    current_$30 = current_$30.rest();
                    if (NIL == current_$30) {
                        SubLObject formula = NIL;
                        if (NIL != arg2_predicate) {
                            formula = list(pred, value, fort);
                        } else {
                            formula = list(pred, fort, value);
                        }
                        if (truth != $TRUE) {
                            formula = cycl_utilities.negate(formula);
                        }
                        write_core_low_assert(formula, mt, stream, UNPROVIDED, UNPROVIDED);
                    } else {
                        cdestructuring_bind_error(datum_$29, $list101);
                    }
                    cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                    truth_value = cdolist_list_var_$28.first();
                } 
                cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                truth_info = cdolist_list_var_$27.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            pred_info = cdolist_list_var.first();
        } 
        return fort;
    }

    public static final SubLObject write_core_definitional_info_to_stream_alt(SubLObject fort, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            format(stream, $str_alt94$________S, forts.fort_el_formula(fort));
            {
                SubLObject info = com.cyc.cycjava.cycl.core.core_definitional_info(fort);
                SubLObject cdolist_list_var = info;
                SubLObject pred_info = NIL;
                for (pred_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred_info = cdolist_list_var.first()) {
                    {
                        SubLObject datum = pred_info;
                        SubLObject current = datum;
                        SubLObject pred = NIL;
                        SubLObject truths = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt95);
                        pred = current.first();
                        current = current.rest();
                        truths = current;
                        {
                            SubLObject arg2_predicate = member(pred, $core_defining_arg2_predicates_info$.getDynamicValue(thread), symbol_function(EQL), symbol_function(FIRST));
                            SubLObject cdolist_list_var_17 = truths;
                            SubLObject truth_info = NIL;
                            for (truth_info = cdolist_list_var_17.first(); NIL != cdolist_list_var_17; cdolist_list_var_17 = cdolist_list_var_17.rest() , truth_info = cdolist_list_var_17.first()) {
                                {
                                    SubLObject datum_18 = truth_info;
                                    SubLObject current_19 = datum_18;
                                    SubLObject truth = NIL;
                                    SubLObject values = NIL;
                                    destructuring_bind_must_consp(current_19, datum_18, $list_alt97);
                                    truth = current_19.first();
                                    current_19 = current_19.rest();
                                    values = current_19;
                                    {
                                        SubLObject cdolist_list_var_20 = values;
                                        SubLObject value = NIL;
                                        for (value = cdolist_list_var_20.first(); NIL != cdolist_list_var_20; cdolist_list_var_20 = cdolist_list_var_20.rest() , value = cdolist_list_var_20.first()) {
                                            {
                                                SubLObject formula = NIL;
                                                if (NIL != arg2_predicate) {
                                                    formula = list(pred, value, fort);
                                                } else {
                                                    formula = list(pred, fort, value);
                                                }
                                                if (truth != $TRUE) {
                                                    formula = cycl_utilities.negate(formula);
                                                }
                                                com.cyc.cycjava.cycl.core.write_core_low_assert(formula, $$UniversalVocabularyMt, stream, UNPROVIDED, UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return fort;
        }
    }

    public static SubLObject write_core_definitional_info_to_stream(final SubLObject fort, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(stream, $str97$________S, forts.fort_el_formula(fort));
        SubLObject cdolist_list_var;
        final SubLObject info = cdolist_list_var = core_definitional_info(fort);
        SubLObject pred_info = NIL;
        pred_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pred_info;
            SubLObject pred = NIL;
            SubLObject truths = NIL;
            destructuring_bind_must_consp(current, datum, $list98);
            pred = current.first();
            current = truths = current.rest();
            final SubLObject arg2_predicate = member(pred, $core_defining_arg2_predicates_info$.getDynamicValue(thread), symbol_function(EQL), symbol_function(FIRST));
            SubLObject cdolist_list_var_$33 = truths;
            SubLObject truth_info = NIL;
            truth_info = cdolist_list_var_$33.first();
            while (NIL != cdolist_list_var_$33) {
                SubLObject current_$35;
                final SubLObject datum_$34 = current_$35 = truth_info;
                SubLObject truth = NIL;
                SubLObject values = NIL;
                destructuring_bind_must_consp(current_$35, datum_$34, $list100);
                truth = current_$35.first();
                current_$35 = current_$35.rest();
                SubLObject cdolist_list_var_$34;
                values = cdolist_list_var_$34 = current_$35;
                SubLObject value = NIL;
                value = cdolist_list_var_$34.first();
                while (NIL != cdolist_list_var_$34) {
                    SubLObject formula = NIL;
                    if (NIL != arg2_predicate) {
                        formula = list(pred, value, fort);
                    } else {
                        formula = list(pred, fort, value);
                    }
                    if (truth != $TRUE) {
                        formula = cycl_utilities.negate(formula);
                    }
                    write_core_low_assert(formula, $$UniversalVocabularyMt, stream, UNPROVIDED, UNPROVIDED);
                    cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                    value = cdolist_list_var_$34.first();
                } 
                cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                truth_info = cdolist_list_var_$33.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            pred_info = cdolist_list_var.first();
        } 
        return fort;
    }

    public static final SubLObject write_core_low_assert_alt(SubLObject formula, SubLObject mt, SubLObject stream, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = $FORWARD;
        }
        format(stream, $str_alt100$___low_assert_literal__);
        com.cyc.cycjava.cycl.core.write_core_formula(formula, stream);
        princ($str_alt101$__, stream);
        com.cyc.cycjava.cycl.core.write_core_hlmt(mt, stream, UNPROVIDED);
        if (!((strength == $DEFAULT) && (direction == $FORWARD))) {
            princ($str_alt92$_, stream);
            prin1(strength, stream);
        }
        if (direction != $FORWARD) {
            princ($str_alt92$_, stream);
            prin1(direction, stream);
        }
        princ($str_alt102$_, stream);
        return NIL;
    }

    public static SubLObject write_core_low_assert(final SubLObject formula, final SubLObject mt, final SubLObject stream, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = $FORWARD;
        }
        format(stream, $str103$___low_assert_literal__);
        write_core_formula(formula, stream);
        princ($str104$__, stream);
        write_core_hlmt(mt, stream, UNPROVIDED);
        if ((strength != $DEFAULT) || (direction != $FORWARD)) {
            princ($$$_, stream);
            prin1(strength, stream);
        }
        if (direction != $FORWARD) {
            princ($$$_, stream);
            prin1(direction, stream);
        }
        princ($str105$_, stream);
        return NIL;
    }

    public static final SubLObject write_core_formula_alt(SubLObject formula, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = format_cycl_expression.$format_cycl_expression_constant_method$.currentBinding(thread);
                SubLObject _prev_bind_1 = format_cycl_expression.$format_cycl_expression_nat_method$.currentBinding(thread);
                try {
                    format_cycl_expression.$format_cycl_expression_constant_method$.bind(symbol_function(WRITE_CORE_CONSTANT), thread);
                    format_cycl_expression.$format_cycl_expression_nat_method$.bind(symbol_function(WRITE_CORE_NART), thread);
                    format_cycl_expression.format_cycl_expression(formula, stream, NIL);
                } finally {
                    format_cycl_expression.$format_cycl_expression_nat_method$.rebind(_prev_bind_1, thread);
                    format_cycl_expression.$format_cycl_expression_constant_method$.rebind(_prev_bind_0, thread);
                }
            }
            return formula;
        }
    }

    public static SubLObject write_core_formula(final SubLObject formula, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = format_cycl_expression.$format_cycl_expression_constant_method$.currentBinding(thread);
        final SubLObject _prev_bind_2 = format_cycl_expression.$format_cycl_expression_nat_method$.currentBinding(thread);
        final SubLObject _prev_bind_3 = format_cycl_expression.$format_cycl_expression_assertion_method$.currentBinding(thread);
        try {
            format_cycl_expression.$format_cycl_expression_constant_method$.bind(symbol_function(WRITE_CORE_CONSTANT), thread);
            format_cycl_expression.$format_cycl_expression_nat_method$.bind(symbol_function(WRITE_CORE_NART), thread);
            format_cycl_expression.$format_cycl_expression_assertion_method$.bind(symbol_function(WRITE_CORE_ASSERTION), thread);
            format_cycl_expression.format_cycl_expression(formula, stream, NIL);
        } finally {
            format_cycl_expression.$format_cycl_expression_assertion_method$.rebind(_prev_bind_3, thread);
            format_cycl_expression.$format_cycl_expression_nat_method$.rebind(_prev_bind_2, thread);
            format_cycl_expression.$format_cycl_expression_constant_method$.rebind(_prev_bind_0, thread);
        }
        return formula;
    }

    public static final SubLObject write_core_constant_alt(SubLObject constant, SubLObject stream, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        format(stream, $str_alt105$_S, constant);
        return constant;
    }

    public static SubLObject write_core_constant(final SubLObject constant, final SubLObject stream, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        assert NIL != constant_p(constant) : "! constant_handles.constant_p(constant) " + ("constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) ") + constant;
        format(stream, $str109$_S, constant);
        return constant;
    }

    public static final SubLObject write_core_nart_alt(SubLObject nart, SubLObject stream, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        SubLTrampolineFile.checkType(nart, NART_P);
        format(stream, $str_alt106$__find_nart___S_, narts_high.nart_el_formula(nart));
        return nart;
    }

    public static SubLObject write_core_nart(final SubLObject nart, final SubLObject stream, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        assert NIL != nart_handles.nart_p(nart) : "! nart_handles.nart_p(nart) " + ("nart_handles.nart_p(nart) " + "CommonSymbols.NIL != nart_handles.nart_p(nart) ") + nart;
        format(stream, $str110$__find_nart___S_, narts_high.nart_el_formula(nart));
        return nart;
    }

    public static final SubLObject write_core_fort_alt(SubLObject fort, SubLObject stream, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        SubLTrampolineFile.checkType(fort, FORT_P);
        if (NIL != nart_p(fort)) {
            return com.cyc.cycjava.cycl.core.write_core_nart(fort, stream, depth);
        } else {
            return com.cyc.cycjava.cycl.core.write_core_constant(fort, stream, depth);
        }
    }

    public static SubLObject write_core_fort(final SubLObject fort, final SubLObject stream, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        if (NIL != nart_handles.nart_p(fort)) {
            return write_core_nart(fort, stream, depth);
        }
        return write_core_constant(fort, stream, depth);
    }

    public static SubLObject write_core_assertion(final SubLObject assertion, final SubLObject stream, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        format(stream, $str112$_s, cycl_utilities.hl_to_el(assertions_high.assertion_ist_formula(assertion)));
        return assertion;
    }

    public static final SubLObject write_core_hlmt_alt(SubLObject v_hlmt, SubLObject stream, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        SubLTrampolineFile.checkType(v_hlmt, HLMT_P);
        return com.cyc.cycjava.cycl.core.write_core_formula(v_hlmt, stream);
    }

    public static SubLObject write_core_hlmt(final SubLObject v_hlmt, final SubLObject stream, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        assert NIL != hlmt.hlmt_p(v_hlmt) : "! hlmt.hlmt_p(v_hlmt) " + ("hlmt.hlmt_p(v_hlmt) " + "CommonSymbols.NIL != hlmt.hlmt_p(v_hlmt) ") + v_hlmt;
        return write_core_formula(v_hlmt, stream);
    }

    public static final SubLObject write_core_gaf_assert_alt(SubLObject assertion, SubLObject stream) {
        {
            SubLObject formula = fi.assertion_hl_formula(assertion, UNPROVIDED);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject strength = assertions_high.assertion_strength(assertion);
            SubLObject direction = assertions_high.assertion_direction(assertion);
            com.cyc.cycjava.cycl.core.write_core_low_assert(formula, mt, stream, strength, direction);
        }
        return NIL;
    }

    public static SubLObject write_core_gaf_assert(final SubLObject assertion, final SubLObject stream) {
        final SubLObject formula = fi.assertion_hl_formula(assertion, UNPROVIDED);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject strength = assertions_high.assertion_strength(assertion);
        final SubLObject direction = assertions_high.assertion_direction(assertion);
        write_core_low_assert(formula, mt, stream, strength, direction);
        return NIL;
    }

    public static final SubLObject write_core_bookkeeping_assert_alt(SubLObject asent, SubLObject stream) {
        return com.cyc.cycjava.cycl.core.write_core_low_assert(asent, $$BookkeepingMt, stream, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject write_core_bookkeeping_assert(final SubLObject asent, final SubLObject stream) {
        SubLObject pred = NIL;
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        destructuring_bind_must_consp(asent, asent, $list114);
        pred = asent.first();
        SubLObject current = asent.rest();
        destructuring_bind_must_consp(current, asent, $list114);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, asent, $list114);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            format(stream, $str115$___hl_assert_bookkeeping_binary_g);
            write_core_constant(pred, stream, UNPROVIDED);
            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
            write_core_formula(arg1, stream);
            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
            write_core_formula(arg2, stream);
            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
            write_core_constant($$BookkeepingMt, stream, UNPROVIDED);
            format(stream, $str117$___);
        } else {
            cdestructuring_bind_error(asent, $list114);
        }
        return NIL;
    }

    public static SubLObject write_core_late_assert(final SubLObject assertion, final SubLObject stream) {
        final SubLObject formula = core_rule_formula(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject strength = assertions_high.assertion_strength(assertion);
        final SubLObject direction = assertions_high.assertion_direction(assertion);
        terpri(stream);
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            final SubLObject asserted_by = assertions_high.asserted_by(assertion);
            if (NIL != asserted_by) {
                format(stream, $str118$___asserted_by__S__, asserted_by);
            }
        }
        format(stream, $str119$_fi_assert_int__);
        format_cycl_expression.format_cycl_expression(formula, stream, TWO_INTEGER);
        format(stream, $str120$___S__S__S___, new SubLObject[]{ mt, strength, direction });
        return NIL;
    }

    /**
     * If assertion-direction is :forward, assert as :backward (o/w assert as current direction)
     */
    @LispMethod(comment = "If assertion-direction is :forward, assert as :backward (o/w assert as current direction)")
    public static final SubLObject write_core_rule_assert_backward_if_forward_alt(SubLObject assertion, SubLObject stream) {
        {
            SubLObject formula = com.cyc.cycjava.cycl.core.core_rule_formula(assertion);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject strength = assertions_high.assertion_strength(assertion);
            SubLObject direction = assertions_high.assertion_direction(assertion);
            if (direction == $FORWARD) {
                direction = $BACKWARD;
            }
            terpri(stream);
            if (NIL != assertions_high.asserted_assertionP(assertion)) {
                {
                    SubLObject asserted_by = assertions_high.asserted_by(assertion);
                    if (NIL != asserted_by) {
                        format(stream, $str_alt109$___asserted_by__S__, asserted_by);
                    }
                }
            }
            format(stream, $str_alt110$_fi_assert_int__);
            format_cycl_expression.format_cycl_expression(formula, stream, TWO_INTEGER);
            format(stream, $str_alt111$___S__S__S___, new SubLObject[]{ mt, strength, direction });
        }
        return NIL;
    }

    /**
     * If assertion-direction is :forward, assert as :backward (o/w assert as current direction)
     */
    @LispMethod(comment = "If assertion-direction is :forward, assert as :backward (o/w assert as current direction)")
    public static SubLObject write_core_rule_assert_backward_if_forward(final SubLObject assertion, final SubLObject stream) {
        final SubLObject formula = core_rule_formula(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject strength = assertions_high.assertion_strength(assertion);
        SubLObject direction = assertions_high.assertion_direction(assertion);
        if (direction == $FORWARD) {
            direction = $BACKWARD;
        }
        terpri(stream);
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            final SubLObject asserted_by = assertions_high.asserted_by(assertion);
            if (NIL != asserted_by) {
                format(stream, $str118$___asserted_by__S__, asserted_by);
            }
        }
        format(stream, $str119$_fi_assert_int__);
        format_cycl_expression.format_cycl_expression(formula, stream, TWO_INTEGER);
        format(stream, $str120$___S__S__S___, new SubLObject[]{ mt, strength, direction });
        return NIL;
    }

    /**
     * If assertion-direction is :forward, reassert as forward.
     */
    @LispMethod(comment = "If assertion-direction is :forward, reassert as forward.")
    public static final SubLObject write_core_rule_reassert_as_forward_if_forward_alt(SubLObject assertion, SubLObject stream) {
        {
            SubLObject formula = com.cyc.cycjava.cycl.core.core_rule_formula(assertion);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject direction = assertions_high.assertion_direction(assertion);
            if (direction == $FORWARD) {
                terpri(stream);
                if (NIL != assertions_high.asserted_assertionP(assertion)) {
                    {
                        SubLObject asserted_by = assertions_high.asserted_by(assertion);
                        if (NIL != asserted_by) {
                            format(stream, $str_alt109$___asserted_by__S__, asserted_by);
                        }
                    }
                }
                format(stream, $str_alt112$_tms_change_direction__find_asser);
                format_cycl_expression.format_cycl_expression(formula, stream, TWO_INTEGER);
                format(stream, $str_alt113$___S___S___, mt, direction);
            }
        }
        return NIL;
    }

    /**
     * If assertion-direction is :forward, reassert as forward.
     */
    @LispMethod(comment = "If assertion-direction is :forward, reassert as forward.")
    public static SubLObject write_core_rule_reassert_as_forward_if_forward(final SubLObject assertion, final SubLObject stream) {
        final SubLObject formula = core_rule_formula(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject direction = assertions_high.assertion_direction(assertion);
        if (direction == $FORWARD) {
            terpri(stream);
            if (NIL != assertions_high.asserted_assertionP(assertion)) {
                final SubLObject asserted_by = assertions_high.asserted_by(assertion);
                if (NIL != asserted_by) {
                    format(stream, $str118$___asserted_by__S__, asserted_by);
                }
            }
            format(stream, $str121$_tms_change_direction__find_asser);
            format_cycl_expression.format_cycl_expression(formula, stream, TWO_INTEGER);
            format(stream, $str122$___S___S___, mt, direction);
        }
        return NIL;
    }

    public static SubLObject write_core_rule_meta_assertion_gafs(final SubLObject rule, final SubLObject stream) {
        SubLObject cdolist_list_var = assertion_utilities.all_meta_assertions(rule);
        SubLObject meta_assertion = NIL;
        meta_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != assertions_high.gaf_assertionP(meta_assertion)) && (NIL != core_assertion_p(meta_assertion))) {
                write_core_late_assert(meta_assertion, stream);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meta_assertion = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject write_core_early_extent_to_stream_alt(SubLObject fort, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        com.cyc.cycjava.cycl.core.write_core_after_adding_info_to_stream(fort, stream);
        com.cyc.cycjava.cycl.core.write_core_decontextualization_info_to_stream(fort, stream);
        return NIL;
    }

    public static SubLObject write_core_early_extent_to_stream(final SubLObject fort, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        write_core_after_adding_info_to_stream(fort, stream);
        write_core_decontextualization_info_to_stream(fort, stream);
        return NIL;
    }

    public static final SubLObject write_core_after_adding_info_to_stream_alt(SubLObject fort, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject cdolist_list_var = after_adding.$gaf_after_adding_predicates$.getGlobalValue();
                        SubLObject pred = NIL;
                        for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                            com.cyc.cycjava.cycl.core.write_core_early_extent_to_stream_int(fort, pred, stream);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = rule_after_adding.$rule_after_adding_predicates$.getGlobalValue();
                        SubLObject pred = NIL;
                        for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                            com.cyc.cycjava.cycl.core.write_core_early_extent_to_stream_int(fort, pred, stream);
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

    public static SubLObject write_core_after_adding_info_to_stream(final SubLObject fort, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($core_seed_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = after_adding.$gaf_after_adding_predicates$.getGlobalValue();
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                write_core_early_extent_to_stream_int(fort, pred, stream);
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
            cdolist_list_var = rule_after_adding.$rule_after_adding_predicates$.getGlobalValue();
            pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                write_core_early_extent_to_stream_int(fort, pred, stream);
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject write_core_decontextualization_info_to_stream_alt(SubLObject fort, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject cdolist_list_var = $decontextualization_predicates$.getGlobalValue();
                        SubLObject pred = NIL;
                        for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                            com.cyc.cycjava.cycl.core.write_core_early_extent_to_stream_int(fort, pred, stream);
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

    public static SubLObject write_core_decontextualization_info_to_stream(final SubLObject fort, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($core_seed_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = $decontextualization_predicates$.getGlobalValue();
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                write_core_early_extent_to_stream_int(fort, pred, stream);
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject write_core_early_extent_to_stream_int_alt(SubLObject fort, SubLObject pred, SubLObject stream) {
        {
            SubLObject pred_var = pred;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, ONE_INTEGER, pred_var)) {
                {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, ONE_INTEGER, pred_var);
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
                                            SubLObject done_var_21 = NIL;
                                            SubLObject token_var_22 = NIL;
                                            while (NIL == done_var_21) {
                                                {
                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_22);
                                                    SubLObject valid_23 = makeBoolean(token_var_22 != assertion);
                                                    if (NIL != valid_23) {
                                                        {
                                                            SubLObject ignore_errors_tag = NIL;
                                                            try {
                                                                {
                                                                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                                                                    try {
                                                                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                                                                        try {
                                                                            if ((NIL != com.cyc.cycjava.cycl.core.core_assertion_p(assertion)) && (NIL == assertions_high.meta_assertionP(assertion))) {
                                                                                com.cyc.cycjava.cycl.core.write_core_gaf_assert(assertion, stream);
                                                                            }
                                                                        } catch (Throwable catch_var) {
                                                                            Errors.handleThrowable(catch_var, NIL);
                                                                        }
                                                                    } finally {
                                                                        rebind(Errors.$error_handler$, _prev_bind_0);
                                                                    }
                                                                }
                                                            } catch (Throwable ccatch_env_var) {
                                                                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                                            }
                                                        }
                                                    }
                                                    done_var_21 = makeBoolean(NIL == valid_23);
                                                }
                                            } 
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                            try {
                                                bind($is_thread_performing_cleanupP$, T);
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                            } finally {
                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
        return NIL;
    }

    public static SubLObject write_core_early_extent_to_stream_int(final SubLObject fort, final SubLObject pred, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, ONE_INTEGER, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, ONE_INTEGER, pred);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$37 = NIL;
                        final SubLObject token_var_$38 = NIL;
                        while (NIL == done_var_$37) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$38);
                            final SubLObject valid_$39 = makeBoolean(!token_var_$38.eql(assertion));
                            if (NIL != valid_$39) {
                                SubLObject ignore_errors_tag = NIL;
                                try {
                                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            if ((NIL != core_assertion_p(assertion)) && (NIL == assertions_high.meta_assertionP(assertion))) {
                                                write_core_gaf_assert(assertion, stream);
                                            }
                                        } catch (final Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                } finally {
                                    thread.throwStack.pop();
                                }
                            }
                            done_var_$37 = makeBoolean(NIL == valid_$39);
                        } 
                    } finally {
                        final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return NIL;
    }

    public static final SubLObject write_core_additional_gaf_info_to_stream_alt(SubLObject fort, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg1_preds = kb_indexing.key_gaf_arg_index(fort, ONE_INTEGER, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject cdolist_list_var = arg1_preds;
                            SubLObject pred = NIL;
                            for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                                if (NIL != com.cyc.cycjava.cycl.core.core_additional_gaf_predicate(pred)) {
                                    {
                                        SubLObject pred_var = pred;
                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, ONE_INTEGER, pred_var)) {
                                            {
                                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, ONE_INTEGER, pred_var);
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
                                                                        SubLObject done_var_24 = NIL;
                                                                        SubLObject token_var_25 = NIL;
                                                                        while (NIL == done_var_24) {
                                                                            {
                                                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_25);
                                                                                SubLObject valid_26 = makeBoolean(token_var_25 != assertion);
                                                                                if (NIL != valid_26) {
                                                                                    {
                                                                                        SubLObject ignore_errors_tag = NIL;
                                                                                        try {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_27 = Errors.$error_handler$.currentBinding(thread);
                                                                                                try {
                                                                                                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                                                                    try {
                                                                                                        if ((NIL != com.cyc.cycjava.cycl.core.core_assertion_p(assertion)) && (NIL == assertions_high.meta_assertionP(assertion))) {
                                                                                                            if (NIL != com.cyc.cycjava.cycl.core.core_kb_delay_assertionP(assertion)) {
                                                                                                                com.cyc.cycjava.cycl.core.core_kb_note_assertion_delayed(assertion);
                                                                                                            } else {
                                                                                                                com.cyc.cycjava.cycl.core.write_core_gaf_assert(assertion, stream);
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (Throwable catch_var) {
                                                                                                        Errors.handleThrowable(catch_var, NIL);
                                                                                                    }
                                                                                                } finally {
                                                                                                    Errors.$error_handler$.rebind(_prev_bind_0_27, thread);
                                                                                                }
                                                                                            }
                                                                                        } catch (Throwable ccatch_env_var) {
                                                                                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                done_var_24 = makeBoolean(NIL == valid_26);
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_28, thread);
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
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = bookkeeping_store.bookkeeping_asents_on_term(fort);
                SubLObject asent = NIL;
                for (asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , asent = cdolist_list_var.first()) {
                    if (NIL != com.cyc.cycjava.cycl.core.core_sentence_p(asent)) {
                        com.cyc.cycjava.cycl.core.write_core_bookkeeping_assert(asent, stream);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject write_core_additional_gaf_info_to_stream(final SubLObject fort, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1_preds = kb_indexing.key_gaf_arg_index(fort, ONE_INTEGER, UNPROVIDED);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($core_seed_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = arg1_preds;
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != core_additional_gaf_predicate(pred)) {
                    final SubLObject pred_var = pred;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, ONE_INTEGER, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, ONE_INTEGER, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$40 = NIL;
                                    final SubLObject token_var_$41 = NIL;
                                    while (NIL == done_var_$40) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$41);
                                        final SubLObject valid_$42 = makeBoolean(!token_var_$41.eql(assertion));
                                        if (NIL != valid_$42) {
                                            SubLObject ignore_errors_tag = NIL;
                                            try {
                                                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                                final SubLObject _prev_bind_0_$43 = Errors.$error_handler$.currentBinding(thread);
                                                try {
                                                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                    try {
                                                        if ((NIL != core_assertion_p(assertion)) && (NIL == assertions_high.meta_assertionP(assertion))) {
                                                            if (NIL != core_kb_delay_assertionP(assertion)) {
                                                                core_kb_note_assertion_delayed(assertion);
                                                            } else {
                                                                write_core_gaf_assert(assertion, stream);
                                                            }
                                                        }
                                                    } catch (final Throwable catch_var) {
                                                        Errors.handleThrowable(catch_var, NIL);
                                                    }
                                                } finally {
                                                    Errors.$error_handler$.rebind(_prev_bind_0_$43, thread);
                                                }
                                            } catch (final Throwable ccatch_env_var) {
                                                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                            } finally {
                                                thread.throwStack.pop();
                                            }
                                        }
                                        done_var_$40 = makeBoolean(NIL == valid_$42);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$44 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var2 = bookkeeping_store.bookkeeping_asents_on_term(fort);
        SubLObject asent = NIL;
        asent = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL != core_sentence_p(asent)) {
                write_core_bookkeeping_assert(asent, stream);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            asent = cdolist_list_var2.first();
        } 
        return NIL;
    }

    /**
     * Whether to delay asserting ASSERTION until near the end of the process.
     */
    @LispMethod(comment = "Whether to delay asserting ASSERTION until near the end of the process.")
    public static final SubLObject core_kb_delay_assertionP_alt(SubLObject assertion) {
        return com.cyc.cycjava.cycl.core.not_assertible_assertion_p(assertion);
    }

    /**
     * Whether to delay asserting ASSERTION until near the end of the process.
     */
    @LispMethod(comment = "Whether to delay asserting ASSERTION until near the end of the process.")
    public static SubLObject core_kb_delay_assertionP(final SubLObject assertion) {
        return not_assertible_assertion_p(assertion);
    }

    public static final SubLObject not_assertible_assertion_p_alt(SubLObject gaf) {
        return makeBoolean(((NIL != assertion_handles.assertion_p(gaf)) && (NIL != list_utilities.lengthE(assertions_high.gaf_formula(gaf), TWO_INTEGER, UNPROVIDED))) && (assertions_high.gaf_predicate(gaf) == $$notAssertibleMt));
    }

    public static SubLObject not_assertible_assertion_p(final SubLObject gaf) {
        return makeBoolean(((NIL != assertion_handles.assertion_p(gaf)) && (NIL != list_utilities.lengthE(assertions_high.gaf_formula(gaf), TWO_INTEGER, UNPROVIDED))) && assertions_high.gaf_predicate(gaf).eql($$notAssertibleMt));
    }

    public static final SubLObject clear_late_assertions_alt() {
        $late_assertions$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject clear_late_assertions() {
        $late_assertions$.setDynamicValue(NIL);
        return NIL;
    }

    public static final SubLObject core_kb_note_assertion_delayed_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $late_assertions$.setDynamicValue(cons(assertion, $late_assertions$.getDynamicValue(thread)), thread);
            return NIL;
        }
    }

    public static SubLObject core_kb_note_assertion_delayed(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $late_assertions$.setDynamicValue(cons(assertion, $late_assertions$.getDynamicValue(thread)), thread);
        return NIL;
    }

    public static final SubLObject write_late_assertions_to_stream_alt(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject list_var = reverse($late_assertions$.getDynamicValue(thread));
                $progress_note$.setDynamicValue($$$late_assertions, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject ass = NIL;
                            for (ass = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , ass = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                com.cyc.cycjava.cycl.core.write_core_rule_assert(ass, stream);
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject write_late_assertions_to_stream(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject list_var = reverse($late_assertions$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$late_assertions, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject ass = NIL;
                ass = csome_list_var.first();
                while (NIL != csome_list_var) {
                    write_core_late_assert(ass, stream);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    ass = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$45 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject core_additional_gaf_predicate_alt(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(((NIL != com.cyc.cycjava.cycl.core.cached_core_fort_p(predicate)) && (NIL == subl_promotions.memberP(predicate, $core_covered_gaf_predicates$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) && (NIL != fort_types_interface.predicateP(predicate)));
        }
    }

    public static SubLObject core_additional_gaf_predicate(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != cached_core_fort_p(predicate)) && (NIL == subl_promotions.memberP(predicate, $core_covered_gaf_predicates$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) && (NIL != fort_types_interface.predicateP(predicate)));
    }

    /**
     * Return the formula to use for a rule when writing the Tiny KB.
     * This is intentionally robust against canonicalizer problems.
     */
    @LispMethod(comment = "Return the formula to use for a rule when writing the Tiny KB.\r\nThis is intentionally robust against canonicalizer problems.\nReturn the formula to use for a rule when writing the Tiny KB.\nThis is intentionally robust against canonicalizer problems.")
    public static final SubLObject core_rule_formula_alt(SubLObject assertion) {
        {
            SubLObject formula = NIL;
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            if (NIL == czer_main.canonicalizer_problemP(assertion)) {
                                formula = uncanonicalizer.assertion_el_formula(assertion);
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
            if (NIL == formula) {
                formula = fi.assertion_fi_formula(assertion, UNPROVIDED);
            }
            return formula;
        }
    }

    /**
     * Return the formula to use for a rule when writing the Tiny KB.
     * This is intentionally robust against canonicalizer problems.
     */
    @LispMethod(comment = "Return the formula to use for a rule when writing the Tiny KB.\r\nThis is intentionally robust against canonicalizer problems.\nReturn the formula to use for a rule when writing the Tiny KB.\nThis is intentionally robust against canonicalizer problems.")
    public static SubLObject core_rule_formula(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject formula = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    if (NIL == czer_main.canonicalizer_problemP(assertion)) {
                        formula = uncanonicalizer.assertion_el_formula(assertion);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == formula) {
            formula = fi.assertion_fi_formula(assertion, UNPROVIDED);
        }
        return formula;
    }

    /**
     * Return sentences suitable for linking CONSTANT into the Core KB.
     */
    @LispMethod(comment = "Return sentences suitable for linking CONSTANT into the Core KB.")
    public static final SubLObject constant_core_kb_link_sentences_alt(SubLObject constant) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        if (NIL == $core_constant_table$.getGlobalValue()) {
            com.cyc.cycjava.cycl.core.initialize_core_constant_table();
        }
        {
            SubLObject sentences = NIL;
            {
                SubLObject isas = genls.min_cols(list_utilities.delete_if_not(CACHED_CORE_CONSTANT_P, isa.all_isa_in_any_mt(constant), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = isas;
                SubLObject v_isa = NIL;
                for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_isa = cdolist_list_var.first()) {
                    sentences = cons(list($$isa, constant, v_isa), sentences);
                }
            }
            {
                SubLObject isas = genls.min_cols(list_utilities.delete_if_not(CACHED_CORE_CONSTANT_P, isa.all_quoted_isa_in_any_mt(constant), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = isas;
                SubLObject v_isa = NIL;
                for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_isa = cdolist_list_var.first()) {
                    if (v_isa != $$CycLConstant) {
                        sentences = cons(list($$quotedIsa, constant, v_isa), sentences);
                    }
                }
            }
            if (NIL != fort_types_interface.microtheory_p(constant)) {
                {
                    SubLObject v_genl_mts = genl_mts.min_mts(list_utilities.delete_if_not(CACHED_CORE_CONSTANT_P, genl_mts.all_genl_mts(constant, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                    SubLObject cdolist_list_var = v_genl_mts;
                    SubLObject genl_mt = NIL;
                    for (genl_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_mt = cdolist_list_var.first()) {
                        sentences = cons(list($$genlMt, constant, genl_mt), sentences);
                    }
                }
            }
            if (NIL != fort_types_interface.collectionP(constant)) {
                {
                    SubLObject v_genls = genls.min_cols(list_utilities.delete_if_not(CACHED_CORE_CONSTANT_P, genls.all_genls_in_any_mt(constant), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var = v_genls;
                    SubLObject genl = NIL;
                    for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                        sentences = cons(list($$genls, constant, genl), sentences);
                    }
                }
            }
            if (NIL != kb_accessors.relationP(constant)) {
                {
                    SubLObject max_arity = arity.max_arity(constant);
                    if (NIL != max_arity) {
                        {
                            SubLObject end_var = number_utilities.f_1X(max_arity);
                            SubLObject argnum = NIL;
                            for (argnum = ONE_INTEGER; !argnum.numGE(end_var); argnum = number_utilities.f_1X(argnum)) {
                                {
                                    SubLObject argnum_pred = kb_accessors.arg_isa_pred(argnum, UNPROVIDED, UNPROVIDED);
                                    SubLObject argn_isas = kb_accessors.argn_isa(constant, argnum, UNPROVIDED);
                                    if (NIL != argn_isas) {
                                        argn_isas = genls.min_cols(list_utilities.delete_if_not(CACHED_CORE_CONSTANT_P, genls.union_all_genls(argn_isas, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                        {
                                            SubLObject cdolist_list_var = argn_isas;
                                            SubLObject argn_isa = NIL;
                                            for (argn_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argn_isa = cdolist_list_var.first()) {
                                                sentences = cons(list(argnum_pred, constant, argn_isa), sentences);
                                            }
                                        }
                                    }
                                }
                                {
                                    SubLObject argnum_pred = kb_accessors.arg_quoted_isa_pred(argnum, UNPROVIDED, UNPROVIDED);
                                    SubLObject argn_quoted_isas = kb_accessors.argn_quoted_isa(constant, argnum, UNPROVIDED);
                                    if (NIL != argn_quoted_isas) {
                                        argn_quoted_isas = genls.min_cols(list_utilities.delete_if_not(CACHED_CORE_CONSTANT_P, genls.union_all_genls(argn_quoted_isas, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                        {
                                            SubLObject cdolist_list_var = argn_quoted_isas;
                                            SubLObject argn_quoted_isa = NIL;
                                            for (argn_quoted_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argn_quoted_isa = cdolist_list_var.first()) {
                                                sentences = cons(list(argnum_pred, constant, argn_quoted_isa), sentences);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != fort_types_interface.functionP(constant)) {
                {
                    SubLObject result_isas = kb_accessors.result_isa(constant, UNPROVIDED);
                    if (NIL != result_isas) {
                        result_isas = genls.min_cols(list_utilities.delete_if_not(CACHED_CORE_CONSTANT_P, genls.union_all_genls(result_isas, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        {
                            SubLObject cdolist_list_var = result_isas;
                            SubLObject result_isa = NIL;
                            for (result_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result_isa = cdolist_list_var.first()) {
                                sentences = cons(list($$resultIsa, constant, result_isa), sentences);
                            }
                        }
                    }
                }
            }
            return nreverse(sentences);
        }
    }

    /**
     * Return sentences suitable for linking CONSTANT into the Core KB.
     */
    @LispMethod(comment = "Return sentences suitable for linking CONSTANT into the Core KB.")
    public static SubLObject constant_core_kb_link_sentences(final SubLObject constant) {
        assert NIL != constant_p(constant) : "! constant_handles.constant_p(constant) " + ("constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) ") + constant;
        if (NIL == $core_constant_table$.getGlobalValue()) {
            initialize_core_constant_table();
        }
        SubLObject sentences = NIL;
        SubLObject cdolist_list_var;
        SubLObject isas = cdolist_list_var = genls.min_cols(list_utilities.delete_if_not(CACHED_CORE_CONSTANT_P, isa.all_isa(constant, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sentences = cons(list($$isa, constant, v_isa), sentences);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        isas = cdolist_list_var = genls.min_cols(list_utilities.delete_if_not(CACHED_CORE_CONSTANT_P, isa.all_quoted_isa(constant, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!v_isa.eql($$CycLConstant)) {
                sentences = cons(list($$quotedIsa, constant, v_isa), sentences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        if (NIL != fort_types_interface.microtheory_p(constant)) {
            final SubLObject v_genl_mts = cdolist_list_var = genl_mts.min_mts(list_utilities.delete_if_not(CACHED_CORE_CONSTANT_P, genl_mts.all_genl_mts(constant, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
            SubLObject genl_mt = NIL;
            genl_mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                sentences = cons(list($$genlMt, constant, genl_mt), sentences);
                cdolist_list_var = cdolist_list_var.rest();
                genl_mt = cdolist_list_var.first();
            } 
        }
        if (NIL != fort_types_interface.collectionP(constant)) {
            final SubLObject v_genls = cdolist_list_var = genls.min_cols(list_utilities.delete_if_not(CACHED_CORE_CONSTANT_P, genls.all_genls_in_any_mt(constant), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            SubLObject genl = NIL;
            genl = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                sentences = cons(list($$genls, constant, genl), sentences);
                cdolist_list_var = cdolist_list_var.rest();
                genl = cdolist_list_var.first();
            } 
        }
        if (NIL != kb_accessors.relationP(constant)) {
            final SubLObject max_arity = arity.max_arity(constant);
            if (NIL != max_arity) {
                SubLObject end_var;
                SubLObject argnum;
                SubLObject argnum_pred;
                SubLObject argn_isas;
                SubLObject cdolist_list_var2;
                SubLObject argn_isa;
                SubLObject argn_quoted_isas;
                SubLObject argn_quoted_isa;
                for (end_var = number_utilities.f_1X(max_arity), argnum = NIL, argnum = ONE_INTEGER; !argnum.numGE(end_var); argnum = number_utilities.f_1X(argnum)) {
                    argnum_pred = kb_accessors.arg_isa_pred(argnum, UNPROVIDED, UNPROVIDED);
                    argn_isas = kb_accessors.argn_isa(constant, argnum, UNPROVIDED);
                    if (NIL != argn_isas) {
                        argn_isas = cdolist_list_var2 = genls.min_cols(list_utilities.delete_if_not(CACHED_CORE_CONSTANT_P, genls.union_all_genls(argn_isas, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        argn_isa = NIL;
                        argn_isa = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            sentences = cons(list(argnum_pred, constant, argn_isa), sentences);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            argn_isa = cdolist_list_var2.first();
                        } 
                    }
                    argnum_pred = kb_accessors.arg_quoted_isa_pred(argnum, UNPROVIDED, UNPROVIDED);
                    argn_quoted_isas = kb_accessors.argn_quoted_isa(constant, argnum, UNPROVIDED);
                    if (NIL != argn_quoted_isas) {
                        argn_quoted_isas = cdolist_list_var2 = genls.min_cols(list_utilities.delete_if_not(CACHED_CORE_CONSTANT_P, genls.union_all_genls(argn_quoted_isas, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        argn_quoted_isa = NIL;
                        argn_quoted_isa = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            sentences = cons(list(argnum_pred, constant, argn_quoted_isa), sentences);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            argn_quoted_isa = cdolist_list_var2.first();
                        } 
                    }
                }
            }
        }
        if (NIL != fort_types_interface.functionP(constant)) {
            SubLObject result_isas = kb_accessors.result_isa(constant, UNPROVIDED);
            if (NIL != result_isas) {
                result_isas = cdolist_list_var = genls.min_cols(list_utilities.delete_if_not(CACHED_CORE_CONSTANT_P, genls.union_all_genls(result_isas, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                SubLObject result_isa = NIL;
                result_isa = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    sentences = cons(list($$resultIsa, constant, result_isa), sentences);
                    cdolist_list_var = cdolist_list_var.rest();
                    result_isa = cdolist_list_var.first();
                } 
            }
        }
        return nreverse(sentences);
    }

    public static final SubLObject declare_core_file_alt() {
        declareFunction("core_raw_constant_p", "CORE-RAW-CONSTANT-P", 1, 0, false);
        declareFunction("non_core_raw_constant_p", "NON-CORE-RAW-CONSTANT-P", 1, 0, false);
        declareFunction("core_raw_el_formula_p", "CORE-RAW-EL-FORMULA-P", 1, 0, false);
        declareFunction("non_core_raw_el_formula_p", "NON-CORE-RAW-EL-FORMULA-P", 1, 0, false);
        declareFunction("compute_core_raw_constants", "COMPUTE-CORE-RAW-CONSTANTS", 0, 0, false);
        declareFunction("all_core_raw_constants", "ALL-CORE-RAW-CONSTANTS", 0, 0, false);
        declareFunction("compute_core_skolems", "COMPUTE-CORE-SKOLEMS", 0, 0, false);
        declareFunction("all_core_skolems", "ALL-CORE-SKOLEMS", 0, 0, false);
        declareFunction("compute_core_constants", "COMPUTE-CORE-CONSTANTS", 0, 0, false);
        declareFunction("all_core_constants", "ALL-CORE-CONSTANTS", 0, 0, false);
        declareFunction("initialize_core_constant_table", "INITIALIZE-CORE-CONSTANT-TABLE", 0, 0, false);
        declareFunction("cached_core_constant_p", "CACHED-CORE-CONSTANT-P", 1, 0, false);
        declareFunction("cached_non_core_constant_p", "CACHED-NON-CORE-CONSTANT-P", 1, 0, false);
        declareFunction("compute_core_narts", "COMPUTE-CORE-NARTS", 0, 0, false);
        declareFunction("core_nart_p", "CORE-NART-P", 1, 0, false);
        declareFunction("core_nart_formula_p", "CORE-NART-FORMULA-P", 1, 0, false);
        declareFunction("all_core_narts", "ALL-CORE-NARTS", 0, 0, false);
        declareFunction("compute_core_forts", "COMPUTE-CORE-FORTS", 0, 0, false);
        declareFunction("all_core_forts", "ALL-CORE-FORTS", 0, 0, false);
        declareFunction("initialize_core_fort_table", "INITIALIZE-CORE-FORT-TABLE", 0, 0, false);
        declareFunction("cached_core_fort_p", "CACHED-CORE-FORT-P", 1, 0, false);
        declareFunction("cached_non_core_fort_p", "CACHED-NON-CORE-FORT-P", 1, 0, false);
        declareFunction("core_sentence_p", "CORE-SENTENCE-P", 1, 0, false);
        declareFunction("core_assertion_p", "CORE-ASSERTION-P", 1, 0, false);
        declareFunction("non_core_assertion_p", "NON-CORE-ASSERTION-P", 1, 0, false);
        declareFunction("compute_core_rules", "COMPUTE-CORE-RULES", 0, 0, false);
        declareFunction("all_core_rules", "ALL-CORE-RULES", 0, 0, false);
        declareFunction("identify_core_kb", "IDENTIFY-CORE-KB", 0, 0, false);
        declareFunction("clear_core_state", "CLEAR-CORE-STATE", 0, 0, false);
        declareFunction("compute_core_kb", "COMPUTE-CORE-KB", 0, 1, false);
        declareFunction("compute_core_definitional_info", "COMPUTE-CORE-DEFINITIONAL-INFO", 0, 0, false);
        declareFunction("clear_core_definitional_info", "CLEAR-CORE-DEFINITIONAL-INFO", 0, 0, false);
        declareFunction("remove_core_definitional_info", "REMOVE-CORE-DEFINITIONAL-INFO", 1, 0, false);
        declareFunction("core_definitional_info_internal", "CORE-DEFINITIONAL-INFO-INTERNAL", 1, 0, false);
        declareFunction("core_definitional_info", "CORE-DEFINITIONAL-INFO", 1, 0, false);
        declareFunction("minimal_implied_core_values", "MINIMAL-IMPLIED-CORE-VALUES", 5, 0, false);
        declareFunction("core_cycle_set", "CORE-CYCLE-SET", 3, 0, false);
        declareFunction("clear_core_mt_definitional_info", "CLEAR-CORE-MT-DEFINITIONAL-INFO", 0, 0, false);
        declareFunction("remove_core_mt_definitional_info", "REMOVE-CORE-MT-DEFINITIONAL-INFO", 1, 0, false);
        declareFunction("core_mt_definitional_info_internal", "CORE-MT-DEFINITIONAL-INFO-INTERNAL", 1, 0, false);
        declareFunction("core_mt_definitional_info", "CORE-MT-DEFINITIONAL-INFO", 1, 0, false);
        declareFunction("minimal_core_mt_implied_core_values", "MINIMAL-CORE-MT-IMPLIED-CORE-VALUES", 5, 0, false);
        declareFunction("load_core_kb", "LOAD-CORE-KB", 1, 0, false);
        declareFunction("write_core_kb", "WRITE-CORE-KB", 1, 0, false);
        declareFunction("write_core_definition", "WRITE-CORE-DEFINITION", 1, 1, false);
        declareFunction("low_create_nart", "LOW-CREATE-NART", 1, 0, false);
        declareFunction("low_assert_gaf", "LOW-ASSERT-GAF", 2, 2, false);
        declareFunction("ensure_bootstrapping_kb", "ENSURE-BOOTSTRAPPING-KB", 0, 0, false);
        declareFunction("low_assert_literal", "LOW-ASSERT-LITERAL", 2, 2, false);
        declareFunction("low_assert_cnf", "LOW-ASSERT-CNF", 2, 2, false);
        declareFunction("low_assert_cnf_internal", "LOW-ASSERT-CNF-INTERNAL", 4, 1, false);
        declareFunction("core_kb_initialization", "CORE-KB-INITIALIZATION", 1, 0, false);
        declareFunction("core_kb_start_bootstrapping", "CORE-KB-START-BOOTSTRAPPING", 0, 0, false);
        declareFunction("core_kb_start_definitions", "CORE-KB-START-DEFINITIONS", 0, 0, false);
        declareFunction("core_kb_finish_definitions", "CORE-KB-FINISH-DEFINITIONS", 0, 0, false);
        declareFunction("core_kb_finish_bootstrapping", "CORE-KB-FINISH-BOOTSTRAPPING", 0, 0, false);
        declareFunction("core_kb_finalization", "CORE-KB-FINALIZATION", 0, 0, false);
        declareFunction("write_core_constant_creation", "WRITE-CORE-CONSTANT-CREATION", 2, 0, false);
        declareFunction("write_core_nart_creation", "WRITE-CORE-NART-CREATION", 2, 0, false);
        declareFunction("write_core_nart_creation_internal", "WRITE-CORE-NART-CREATION-INTERNAL", 3, 0, false);
        declareFunction("write_core_mt_definitional_info_to_stream", "WRITE-CORE-MT-DEFINITIONAL-INFO-TO-STREAM", 1, 1, false);
        declareFunction("write_core_definitional_info_to_stream", "WRITE-CORE-DEFINITIONAL-INFO-TO-STREAM", 1, 1, false);
        declareFunction("write_core_low_assert", "WRITE-CORE-LOW-ASSERT", 3, 2, false);
        declareFunction("write_core_formula", "WRITE-CORE-FORMULA", 2, 0, false);
        declareFunction("write_core_constant", "WRITE-CORE-CONSTANT", 2, 1, false);
        declareFunction("write_core_nart", "WRITE-CORE-NART", 2, 1, false);
        declareFunction("write_core_fort", "WRITE-CORE-FORT", 2, 1, false);
        declareFunction("write_core_hlmt", "WRITE-CORE-HLMT", 2, 1, false);
        declareFunction("write_core_gaf_assert", "WRITE-CORE-GAF-ASSERT", 2, 0, false);
        declareFunction("write_core_bookkeeping_assert", "WRITE-CORE-BOOKKEEPING-ASSERT", 2, 0, false);
        declareFunction("write_core_rule_assert", "WRITE-CORE-RULE-ASSERT", 2, 0, false);
        declareFunction("write_core_rule_assert_backward_if_forward", "WRITE-CORE-RULE-ASSERT-BACKWARD-IF-FORWARD", 2, 0, false);
        declareFunction("write_core_rule_reassert_as_forward_if_forward", "WRITE-CORE-RULE-REASSERT-AS-FORWARD-IF-FORWARD", 2, 0, false);
        declareFunction("write_core_early_extent_to_stream", "WRITE-CORE-EARLY-EXTENT-TO-STREAM", 1, 1, false);
        declareFunction("write_core_after_adding_info_to_stream", "WRITE-CORE-AFTER-ADDING-INFO-TO-STREAM", 1, 1, false);
        declareFunction("write_core_decontextualization_info_to_stream", "WRITE-CORE-DECONTEXTUALIZATION-INFO-TO-STREAM", 1, 1, false);
        declareFunction("write_core_early_extent_to_stream_int", "WRITE-CORE-EARLY-EXTENT-TO-STREAM-INT", 3, 0, false);
        declareFunction("write_core_additional_gaf_info_to_stream", "WRITE-CORE-ADDITIONAL-GAF-INFO-TO-STREAM", 1, 1, false);
        declareFunction("core_kb_delay_assertionP", "CORE-KB-DELAY-ASSERTION?", 1, 0, false);
        declareFunction("not_assertible_assertion_p", "NOT-ASSERTIBLE-ASSERTION-P", 1, 0, false);
        declareFunction("clear_late_assertions", "CLEAR-LATE-ASSERTIONS", 0, 0, false);
        declareFunction("core_kb_note_assertion_delayed", "CORE-KB-NOTE-ASSERTION-DELAYED", 1, 0, false);
        declareFunction("write_late_assertions_to_stream", "WRITE-LATE-ASSERTIONS-TO-STREAM", 0, 1, false);
        declareFunction("core_additional_gaf_predicate", "CORE-ADDITIONAL-GAF-PREDICATE", 1, 0, false);
        declareFunction("core_rule_formula", "CORE-RULE-FORMULA", 1, 0, false);
        declareFunction("constant_core_kb_link_sentences", "CONSTANT-CORE-KB-LINK-SENTENCES", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_core_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("core_raw_constant_p", "CORE-RAW-CONSTANT-P", 1, 0, false);
            declareFunction("non_core_raw_constant_p", "NON-CORE-RAW-CONSTANT-P", 1, 0, false);
            declareFunction("core_raw_el_formula_p", "CORE-RAW-EL-FORMULA-P", 1, 0, false);
            declareFunction("non_core_raw_el_formula_p", "NON-CORE-RAW-EL-FORMULA-P", 1, 0, false);
            declareFunction("compute_core_raw_constants", "COMPUTE-CORE-RAW-CONSTANTS", 0, 0, false);
            declareFunction("all_core_raw_constants", "ALL-CORE-RAW-CONSTANTS", 0, 0, false);
            declareFunction("compute_core_skolems", "COMPUTE-CORE-SKOLEMS", 0, 0, false);
            declareFunction("all_core_skolems", "ALL-CORE-SKOLEMS", 0, 0, false);
            declareFunction("compute_core_constants", "COMPUTE-CORE-CONSTANTS", 0, 0, false);
            declareFunction("all_core_constants", "ALL-CORE-CONSTANTS", 0, 0, false);
            declareFunction("initialize_core_constant_table", "INITIALIZE-CORE-CONSTANT-TABLE", 0, 0, false);
            declareFunction("cached_core_constant_p", "CACHED-CORE-CONSTANT-P", 1, 0, false);
            declareFunction("cached_non_core_constant_p", "CACHED-NON-CORE-CONSTANT-P", 1, 0, false);
            declareFunction("compute_core_narts", "COMPUTE-CORE-NARTS", 0, 0, false);
            declareFunction("core_nart_p", "CORE-NART-P", 1, 0, false);
            declareFunction("core_nart_formula_p", "CORE-NART-FORMULA-P", 1, 0, false);
            declareFunction("all_core_narts", "ALL-CORE-NARTS", 0, 0, false);
            declareFunction("compute_core_forts", "COMPUTE-CORE-FORTS", 0, 0, false);
            declareFunction("all_core_forts", "ALL-CORE-FORTS", 0, 0, false);
            declareFunction("initialize_core_fort_table", "INITIALIZE-CORE-FORT-TABLE", 0, 0, false);
            declareFunction("cached_core_fort_p", "CACHED-CORE-FORT-P", 1, 0, false);
            declareFunction("cached_non_core_fort_p", "CACHED-NON-CORE-FORT-P", 1, 0, false);
            declareFunction("core_sentence_p", "CORE-SENTENCE-P", 1, 0, false);
            declareFunction("core_assertion_p", "CORE-ASSERTION-P", 1, 0, false);
            declareFunction("non_core_assertion_p", "NON-CORE-ASSERTION-P", 1, 0, false);
            declareFunction("compute_core_rules", "COMPUTE-CORE-RULES", 0, 0, false);
            declareFunction("all_core_rules", "ALL-CORE-RULES", 0, 0, false);
            declareFunction("identify_core_kb", "IDENTIFY-CORE-KB", 0, 0, false);
            declareFunction("clear_core_state", "CLEAR-CORE-STATE", 0, 0, false);
            declareFunction("compute_core_kb", "COMPUTE-CORE-KB", 0, 1, false);
            declareFunction("compute_core_definitional_info", "COMPUTE-CORE-DEFINITIONAL-INFO", 0, 0, false);
            declareFunction("clear_core_definitional_info", "CLEAR-CORE-DEFINITIONAL-INFO", 0, 0, false);
            declareFunction("remove_core_definitional_info", "REMOVE-CORE-DEFINITIONAL-INFO", 1, 0, false);
            declareFunction("core_definitional_info_internal", "CORE-DEFINITIONAL-INFO-INTERNAL", 1, 0, false);
            declareFunction("core_definitional_info", "CORE-DEFINITIONAL-INFO", 1, 0, false);
            declareFunction("minimal_implied_core_values", "MINIMAL-IMPLIED-CORE-VALUES", 5, 0, false);
            declareFunction("core_cycle_set", "CORE-CYCLE-SET", 3, 0, false);
            declareFunction("clear_core_mt_definitional_info", "CLEAR-CORE-MT-DEFINITIONAL-INFO", 0, 0, false);
            declareFunction("remove_core_mt_definitional_info", "REMOVE-CORE-MT-DEFINITIONAL-INFO", 1, 0, false);
            declareFunction("core_mt_definitional_info_internal", "CORE-MT-DEFINITIONAL-INFO-INTERNAL", 1, 0, false);
            declareFunction("core_mt_definitional_info", "CORE-MT-DEFINITIONAL-INFO", 1, 0, false);
            declareFunction("minimal_core_mt_implied_core_values", "MINIMAL-CORE-MT-IMPLIED-CORE-VALUES", 5, 0, false);
            declareFunction("load_core_kb", "LOAD-CORE-KB", 1, 0, false);
            declareFunction("write_core_kb", "WRITE-CORE-KB", 1, 0, false);
            declareFunction("write_core_definition", "WRITE-CORE-DEFINITION", 1, 1, false);
            declareFunction("low_create_nart", "LOW-CREATE-NART", 1, 0, false);
            declareFunction("low_assert_gaf", "LOW-ASSERT-GAF", 2, 2, false);
            declareFunction("ensure_bootstrapping_kb", "ENSURE-BOOTSTRAPPING-KB", 0, 0, false);
            declareFunction("low_assert_literal", "LOW-ASSERT-LITERAL", 2, 2, false);
            declareFunction("low_assert_cnf", "LOW-ASSERT-CNF", 2, 2, false);
            declareFunction("low_assert_cnf_internal", "LOW-ASSERT-CNF-INTERNAL", 4, 1, false);
            declareFunction("core_kb_initialization", "CORE-KB-INITIALIZATION", 1, 0, false);
            declareFunction("core_kb_start_bootstrapping", "CORE-KB-START-BOOTSTRAPPING", 0, 0, false);
            declareFunction("core_kb_start_definitions", "CORE-KB-START-DEFINITIONS", 0, 0, false);
            declareFunction("core_kb_finish_definitions", "CORE-KB-FINISH-DEFINITIONS", 0, 0, false);
            declareFunction("core_kb_finish_bootstrapping", "CORE-KB-FINISH-BOOTSTRAPPING", 0, 0, false);
            declareFunction("core_kb_finalization", "CORE-KB-FINALIZATION", 0, 0, false);
            declareFunction("write_core_constant_creation", "WRITE-CORE-CONSTANT-CREATION", 2, 0, false);
            declareFunction("write_core_nart_creation", "WRITE-CORE-NART-CREATION", 2, 0, false);
            declareFunction("write_core_nart_creation_internal", "WRITE-CORE-NART-CREATION-INTERNAL", 3, 0, false);
            declareFunction("write_core_mt_definitional_info_to_stream", "WRITE-CORE-MT-DEFINITIONAL-INFO-TO-STREAM", 1, 1, false);
            declareFunction("write_core_definitional_info_to_stream", "WRITE-CORE-DEFINITIONAL-INFO-TO-STREAM", 1, 1, false);
            declareFunction("write_core_low_assert", "WRITE-CORE-LOW-ASSERT", 3, 2, false);
            declareFunction("write_core_formula", "WRITE-CORE-FORMULA", 2, 0, false);
            declareFunction("write_core_constant", "WRITE-CORE-CONSTANT", 2, 1, false);
            declareFunction("write_core_nart", "WRITE-CORE-NART", 2, 1, false);
            declareFunction("write_core_fort", "WRITE-CORE-FORT", 2, 1, false);
            declareFunction("write_core_assertion", "WRITE-CORE-ASSERTION", 2, 1, false);
            declareFunction("write_core_hlmt", "WRITE-CORE-HLMT", 2, 1, false);
            declareFunction("write_core_gaf_assert", "WRITE-CORE-GAF-ASSERT", 2, 0, false);
            declareFunction("write_core_bookkeeping_assert", "WRITE-CORE-BOOKKEEPING-ASSERT", 2, 0, false);
            declareFunction("write_core_late_assert", "WRITE-CORE-LATE-ASSERT", 2, 0, false);
            declareFunction("write_core_rule_assert_backward_if_forward", "WRITE-CORE-RULE-ASSERT-BACKWARD-IF-FORWARD", 2, 0, false);
            declareFunction("write_core_rule_reassert_as_forward_if_forward", "WRITE-CORE-RULE-REASSERT-AS-FORWARD-IF-FORWARD", 2, 0, false);
            declareFunction("write_core_rule_meta_assertion_gafs", "WRITE-CORE-RULE-META-ASSERTION-GAFS", 2, 0, false);
            declareFunction("write_core_early_extent_to_stream", "WRITE-CORE-EARLY-EXTENT-TO-STREAM", 1, 1, false);
            declareFunction("write_core_after_adding_info_to_stream", "WRITE-CORE-AFTER-ADDING-INFO-TO-STREAM", 1, 1, false);
            declareFunction("write_core_decontextualization_info_to_stream", "WRITE-CORE-DECONTEXTUALIZATION-INFO-TO-STREAM", 1, 1, false);
            declareFunction("write_core_early_extent_to_stream_int", "WRITE-CORE-EARLY-EXTENT-TO-STREAM-INT", 3, 0, false);
            declareFunction("write_core_additional_gaf_info_to_stream", "WRITE-CORE-ADDITIONAL-GAF-INFO-TO-STREAM", 1, 1, false);
            declareFunction("core_kb_delay_assertionP", "CORE-KB-DELAY-ASSERTION?", 1, 0, false);
            declareFunction("not_assertible_assertion_p", "NOT-ASSERTIBLE-ASSERTION-P", 1, 0, false);
            declareFunction("clear_late_assertions", "CLEAR-LATE-ASSERTIONS", 0, 0, false);
            declareFunction("core_kb_note_assertion_delayed", "CORE-KB-NOTE-ASSERTION-DELAYED", 1, 0, false);
            declareFunction("write_late_assertions_to_stream", "WRITE-LATE-ASSERTIONS-TO-STREAM", 0, 1, false);
            declareFunction("core_additional_gaf_predicate", "CORE-ADDITIONAL-GAF-PREDICATE", 1, 0, false);
            declareFunction("core_rule_formula", "CORE-RULE-FORMULA", 1, 0, false);
            declareFunction("constant_core_kb_link_sentences", "CONSTANT-CORE-KB-LINK-SENTENCES", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("write_core_rule_assert", "WRITE-CORE-RULE-ASSERT", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_core_file_Previous() {
        declareFunction("core_raw_constant_p", "CORE-RAW-CONSTANT-P", 1, 0, false);
        declareFunction("non_core_raw_constant_p", "NON-CORE-RAW-CONSTANT-P", 1, 0, false);
        declareFunction("core_raw_el_formula_p", "CORE-RAW-EL-FORMULA-P", 1, 0, false);
        declareFunction("non_core_raw_el_formula_p", "NON-CORE-RAW-EL-FORMULA-P", 1, 0, false);
        declareFunction("compute_core_raw_constants", "COMPUTE-CORE-RAW-CONSTANTS", 0, 0, false);
        declareFunction("all_core_raw_constants", "ALL-CORE-RAW-CONSTANTS", 0, 0, false);
        declareFunction("compute_core_skolems", "COMPUTE-CORE-SKOLEMS", 0, 0, false);
        declareFunction("all_core_skolems", "ALL-CORE-SKOLEMS", 0, 0, false);
        declareFunction("compute_core_constants", "COMPUTE-CORE-CONSTANTS", 0, 0, false);
        declareFunction("all_core_constants", "ALL-CORE-CONSTANTS", 0, 0, false);
        declareFunction("initialize_core_constant_table", "INITIALIZE-CORE-CONSTANT-TABLE", 0, 0, false);
        declareFunction("cached_core_constant_p", "CACHED-CORE-CONSTANT-P", 1, 0, false);
        declareFunction("cached_non_core_constant_p", "CACHED-NON-CORE-CONSTANT-P", 1, 0, false);
        declareFunction("compute_core_narts", "COMPUTE-CORE-NARTS", 0, 0, false);
        declareFunction("core_nart_p", "CORE-NART-P", 1, 0, false);
        declareFunction("core_nart_formula_p", "CORE-NART-FORMULA-P", 1, 0, false);
        declareFunction("all_core_narts", "ALL-CORE-NARTS", 0, 0, false);
        declareFunction("compute_core_forts", "COMPUTE-CORE-FORTS", 0, 0, false);
        declareFunction("all_core_forts", "ALL-CORE-FORTS", 0, 0, false);
        declareFunction("initialize_core_fort_table", "INITIALIZE-CORE-FORT-TABLE", 0, 0, false);
        declareFunction("cached_core_fort_p", "CACHED-CORE-FORT-P", 1, 0, false);
        declareFunction("cached_non_core_fort_p", "CACHED-NON-CORE-FORT-P", 1, 0, false);
        declareFunction("core_sentence_p", "CORE-SENTENCE-P", 1, 0, false);
        declareFunction("core_assertion_p", "CORE-ASSERTION-P", 1, 0, false);
        declareFunction("non_core_assertion_p", "NON-CORE-ASSERTION-P", 1, 0, false);
        declareFunction("compute_core_rules", "COMPUTE-CORE-RULES", 0, 0, false);
        declareFunction("all_core_rules", "ALL-CORE-RULES", 0, 0, false);
        declareFunction("identify_core_kb", "IDENTIFY-CORE-KB", 0, 0, false);
        declareFunction("clear_core_state", "CLEAR-CORE-STATE", 0, 0, false);
        declareFunction("compute_core_kb", "COMPUTE-CORE-KB", 0, 1, false);
        declareFunction("compute_core_definitional_info", "COMPUTE-CORE-DEFINITIONAL-INFO", 0, 0, false);
        declareFunction("clear_core_definitional_info", "CLEAR-CORE-DEFINITIONAL-INFO", 0, 0, false);
        declareFunction("remove_core_definitional_info", "REMOVE-CORE-DEFINITIONAL-INFO", 1, 0, false);
        declareFunction("core_definitional_info_internal", "CORE-DEFINITIONAL-INFO-INTERNAL", 1, 0, false);
        declareFunction("core_definitional_info", "CORE-DEFINITIONAL-INFO", 1, 0, false);
        declareFunction("minimal_implied_core_values", "MINIMAL-IMPLIED-CORE-VALUES", 5, 0, false);
        declareFunction("core_cycle_set", "CORE-CYCLE-SET", 3, 0, false);
        declareFunction("clear_core_mt_definitional_info", "CLEAR-CORE-MT-DEFINITIONAL-INFO", 0, 0, false);
        declareFunction("remove_core_mt_definitional_info", "REMOVE-CORE-MT-DEFINITIONAL-INFO", 1, 0, false);
        declareFunction("core_mt_definitional_info_internal", "CORE-MT-DEFINITIONAL-INFO-INTERNAL", 1, 0, false);
        declareFunction("core_mt_definitional_info", "CORE-MT-DEFINITIONAL-INFO", 1, 0, false);
        declareFunction("minimal_core_mt_implied_core_values", "MINIMAL-CORE-MT-IMPLIED-CORE-VALUES", 5, 0, false);
        declareFunction("load_core_kb", "LOAD-CORE-KB", 1, 0, false);
        declareFunction("write_core_kb", "WRITE-CORE-KB", 1, 0, false);
        declareFunction("write_core_definition", "WRITE-CORE-DEFINITION", 1, 1, false);
        declareFunction("low_create_nart", "LOW-CREATE-NART", 1, 0, false);
        declareFunction("low_assert_gaf", "LOW-ASSERT-GAF", 2, 2, false);
        declareFunction("ensure_bootstrapping_kb", "ENSURE-BOOTSTRAPPING-KB", 0, 0, false);
        declareFunction("low_assert_literal", "LOW-ASSERT-LITERAL", 2, 2, false);
        declareFunction("low_assert_cnf", "LOW-ASSERT-CNF", 2, 2, false);
        declareFunction("low_assert_cnf_internal", "LOW-ASSERT-CNF-INTERNAL", 4, 1, false);
        declareFunction("core_kb_initialization", "CORE-KB-INITIALIZATION", 1, 0, false);
        declareFunction("core_kb_start_bootstrapping", "CORE-KB-START-BOOTSTRAPPING", 0, 0, false);
        declareFunction("core_kb_start_definitions", "CORE-KB-START-DEFINITIONS", 0, 0, false);
        declareFunction("core_kb_finish_definitions", "CORE-KB-FINISH-DEFINITIONS", 0, 0, false);
        declareFunction("core_kb_finish_bootstrapping", "CORE-KB-FINISH-BOOTSTRAPPING", 0, 0, false);
        declareFunction("core_kb_finalization", "CORE-KB-FINALIZATION", 0, 0, false);
        declareFunction("write_core_constant_creation", "WRITE-CORE-CONSTANT-CREATION", 2, 0, false);
        declareFunction("write_core_nart_creation", "WRITE-CORE-NART-CREATION", 2, 0, false);
        declareFunction("write_core_nart_creation_internal", "WRITE-CORE-NART-CREATION-INTERNAL", 3, 0, false);
        declareFunction("write_core_mt_definitional_info_to_stream", "WRITE-CORE-MT-DEFINITIONAL-INFO-TO-STREAM", 1, 1, false);
        declareFunction("write_core_definitional_info_to_stream", "WRITE-CORE-DEFINITIONAL-INFO-TO-STREAM", 1, 1, false);
        declareFunction("write_core_low_assert", "WRITE-CORE-LOW-ASSERT", 3, 2, false);
        declareFunction("write_core_formula", "WRITE-CORE-FORMULA", 2, 0, false);
        declareFunction("write_core_constant", "WRITE-CORE-CONSTANT", 2, 1, false);
        declareFunction("write_core_nart", "WRITE-CORE-NART", 2, 1, false);
        declareFunction("write_core_fort", "WRITE-CORE-FORT", 2, 1, false);
        declareFunction("write_core_assertion", "WRITE-CORE-ASSERTION", 2, 1, false);
        declareFunction("write_core_hlmt", "WRITE-CORE-HLMT", 2, 1, false);
        declareFunction("write_core_gaf_assert", "WRITE-CORE-GAF-ASSERT", 2, 0, false);
        declareFunction("write_core_bookkeeping_assert", "WRITE-CORE-BOOKKEEPING-ASSERT", 2, 0, false);
        declareFunction("write_core_late_assert", "WRITE-CORE-LATE-ASSERT", 2, 0, false);
        declareFunction("write_core_rule_assert_backward_if_forward", "WRITE-CORE-RULE-ASSERT-BACKWARD-IF-FORWARD", 2, 0, false);
        declareFunction("write_core_rule_reassert_as_forward_if_forward", "WRITE-CORE-RULE-REASSERT-AS-FORWARD-IF-FORWARD", 2, 0, false);
        declareFunction("write_core_rule_meta_assertion_gafs", "WRITE-CORE-RULE-META-ASSERTION-GAFS", 2, 0, false);
        declareFunction("write_core_early_extent_to_stream", "WRITE-CORE-EARLY-EXTENT-TO-STREAM", 1, 1, false);
        declareFunction("write_core_after_adding_info_to_stream", "WRITE-CORE-AFTER-ADDING-INFO-TO-STREAM", 1, 1, false);
        declareFunction("write_core_decontextualization_info_to_stream", "WRITE-CORE-DECONTEXTUALIZATION-INFO-TO-STREAM", 1, 1, false);
        declareFunction("write_core_early_extent_to_stream_int", "WRITE-CORE-EARLY-EXTENT-TO-STREAM-INT", 3, 0, false);
        declareFunction("write_core_additional_gaf_info_to_stream", "WRITE-CORE-ADDITIONAL-GAF-INFO-TO-STREAM", 1, 1, false);
        declareFunction("core_kb_delay_assertionP", "CORE-KB-DELAY-ASSERTION?", 1, 0, false);
        declareFunction("not_assertible_assertion_p", "NOT-ASSERTIBLE-ASSERTION-P", 1, 0, false);
        declareFunction("clear_late_assertions", "CLEAR-LATE-ASSERTIONS", 0, 0, false);
        declareFunction("core_kb_note_assertion_delayed", "CORE-KB-NOTE-ASSERTION-DELAYED", 1, 0, false);
        declareFunction("write_late_assertions_to_stream", "WRITE-LATE-ASSERTIONS-TO-STREAM", 0, 1, false);
        declareFunction("core_additional_gaf_predicate", "CORE-ADDITIONAL-GAF-PREDICATE", 1, 0, false);
        declareFunction("core_rule_formula", "CORE-RULE-FORMULA", 1, 0, false);
        declareFunction("constant_core_kb_link_sentences", "CONSTANT-CORE-KB-LINK-SENTENCES", 1, 0, false);
        return NIL;
    }



    static private final SubLList $list_alt22 = list(new SubLObject[]{ list(reader_make_constant_shell("isa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("quotedIsa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("genls"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), T), list(reader_make_constant_shell("arg1Isa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg1Genl"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg2Isa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg2Genl"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg3Isa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg3Genl"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg4Isa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg4Genl"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg5Isa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg5Genl"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("argsIsa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg1QuotedIsa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg2QuotedIsa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg3QuotedIsa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg4QuotedIsa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("arg5QuotedIsa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("argsQuotedIsa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("resultIsa"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("resultGenl"), makeSymbol("ALL-GENLS"), makeSymbol("GENL?"), NIL), list(reader_make_constant_shell("genlPreds"), makeSymbol("ALL-GENL-PREDS"), makeSymbol("GENL-PRED?"), T), list(reader_make_constant_shell("genlInverse"), makeSymbol("ALL-GENL-PREDS"), makeSymbol("GENL-PRED?"), NIL), list(reader_make_constant_shell("genlMt"), makeSymbol("ALL-GENL-MTS"), makeSymbol("GENL-MT?"), T), list(reader_make_constant_shell("arity"), NIL, NIL, NIL), list(reader_make_constant_shell("arityMin"), NIL, NIL, NIL), list(reader_make_constant_shell("arityMax"), NIL, NIL, NIL), list(reader_make_constant_shell("defnIff"), NIL, NIL, NIL), list(reader_make_constant_shell("defnNecessary"), NIL, NIL, NIL), list(reader_make_constant_shell("defnSufficient"), NIL, NIL, NIL), list(reader_make_constant_shell("quotedDefnIff"), NIL, NIL, NIL), list(reader_make_constant_shell("quotedDefnNecessary"), NIL, NIL, NIL), list(reader_make_constant_shell("quotedDefnSufficient"), NIL, NIL, NIL) });

    public static final SubLObject init_core_file_alt() {
        deflexical("*CORE-SEED-COLLECTION*", $$CoreUnionConstant);
        deflexical("*ALL-CORE-RAW-CONSTANTS*", NIL != boundp($all_core_raw_constants$) ? ((SubLObject) ($all_core_raw_constants$.getGlobalValue())) : $UNINITIALIZED);
        deflexical("*ALL-CORE-SKOLEMS*", NIL != boundp($all_core_skolems$) ? ((SubLObject) ($all_core_skolems$.getGlobalValue())) : NIL);
        deflexical("*ALL-CORE-CONSTANTS*", NIL != boundp($all_core_constants$) ? ((SubLObject) ($all_core_constants$.getGlobalValue())) : $UNINITIALIZED);
        deflexical("*CORE-CONSTANT-TABLE*", NIL != boundp($core_constant_table$) ? ((SubLObject) ($core_constant_table$.getGlobalValue())) : NIL);
        deflexical("*ALL-CORE-NARTS*", NIL != boundp($all_core_narts$) ? ((SubLObject) ($all_core_narts$.getGlobalValue())) : $UNINITIALIZED);
        deflexical("*ALL-CORE-FORTS*", NIL != boundp($all_core_forts$) ? ((SubLObject) ($all_core_forts$.getGlobalValue())) : $UNINITIALIZED);
        deflexical("*CORE-FORT-TABLE*", NIL != boundp($core_fort_table$) ? ((SubLObject) ($core_fort_table$.getGlobalValue())) : NIL);
        deflexical("*ALL-CORE-RULES*", NIL != boundp($all_core_rules$) ? ((SubLObject) ($all_core_rules$.getGlobalValue())) : $UNINITIALIZED);
        defparameter("*CORE-DEFINING-ARG1-PREDICATES-INFO*", $list_alt22);
        defparameter("*CORE-DEFINING-ARG2-PREDICATES-INFO*", NIL);
        deflexical("*CORE-DEFINITIONAL-INFO-CACHING-STATE*", NIL);
        deflexical("*CORE-MT-DEFINITIONAL-INFO-CACHING-STATE*", NIL);
        deflexical("*CORE-KB-START-TIME*", NIL);
        deflexical("*DECONTEXTUALIZATION-PREDICATES*", $list_alt114);
        defvar("*LATE-ASSERTIONS*", NIL);
        defparameter("*CORE-COVERED-GAF-PREDICATES*", nconc(new SubLObject[]{ Mapping.mapcar(symbol_function(FIRST), $core_defining_arg1_predicates_info$.getDynamicValue()), Mapping.mapcar(symbol_function(FIRST), $core_defining_arg2_predicates_info$.getDynamicValue()), copy_list(after_adding.$gaf_after_adding_predicates$.getGlobalValue()), copy_list(rule_after_adding.$rule_after_adding_predicates$.getGlobalValue()), list($$termOfUnit, $$cyclistNotes) }));
        return NIL;
    }

    public static SubLObject init_core_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*CORE-SEED-COLLECTION*", $$CoreUnionConstant);
            deflexical("*CORE-SEED-MT*", $list1);
            deflexical("*ALL-CORE-RAW-CONSTANTS*", SubLTrampolineFile.maybeDefault($all_core_raw_constants$, $all_core_raw_constants$, $UNINITIALIZED));
            deflexical("*ALL-CORE-SKOLEMS*", SubLTrampolineFile.maybeDefault($all_core_skolems$, $all_core_skolems$, NIL));
            deflexical("*ALL-CORE-CONSTANTS*", SubLTrampolineFile.maybeDefault($all_core_constants$, $all_core_constants$, $UNINITIALIZED));
            deflexical("*CORE-CONSTANT-TABLE*", SubLTrampolineFile.maybeDefault($core_constant_table$, $core_constant_table$, NIL));
            deflexical("*ALL-CORE-NARTS*", SubLTrampolineFile.maybeDefault($all_core_narts$, $all_core_narts$, $UNINITIALIZED));
            deflexical("*ALL-CORE-FORTS*", SubLTrampolineFile.maybeDefault($all_core_forts$, $all_core_forts$, $UNINITIALIZED));
            deflexical("*CORE-FORT-TABLE*", SubLTrampolineFile.maybeDefault($core_fort_table$, $core_fort_table$, NIL));
            deflexical("*ALL-CORE-RULES*", SubLTrampolineFile.maybeDefault($all_core_rules$, $all_core_rules$, $UNINITIALIZED));
            defparameter("*CORE-DEFINING-ARG1-PREDICATES-INFO*", $list22);
            defparameter("*CORE-DEFINING-ARG2-PREDICATES-INFO*", NIL);
            deflexical("*CORE-DEFINITIONAL-INFO-CACHING-STATE*", NIL);
            deflexical("*CORE-MT-DEFINITIONAL-INFO-CACHING-STATE*", NIL);
            deflexical("*CORE-KB-START-TIME*", NIL);
            deflexical("*DECONTEXTUALIZATION-PREDICATES*", $list123);
            defvar("*LATE-ASSERTIONS*", NIL);
            defparameter("*CORE-COVERED-GAF-PREDICATES*", nconc(new SubLObject[]{ Mapping.mapcar(symbol_function(FIRST), $core_defining_arg1_predicates_info$.getDynamicValue()), Mapping.mapcar(symbol_function(FIRST), $core_defining_arg2_predicates_info$.getDynamicValue()), copy_list(after_adding.$gaf_after_adding_predicates$.getGlobalValue()), copy_list(rule_after_adding.$rule_after_adding_predicates$.getGlobalValue()), list($$termOfUnit, $$cyclistNotes) }));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*ALL-CORE-RAW-CONSTANTS*", NIL != boundp($all_core_raw_constants$) ? ((SubLObject) ($all_core_raw_constants$.getGlobalValue())) : $UNINITIALIZED);
            deflexical("*ALL-CORE-SKOLEMS*", NIL != boundp($all_core_skolems$) ? ((SubLObject) ($all_core_skolems$.getGlobalValue())) : NIL);
            deflexical("*ALL-CORE-CONSTANTS*", NIL != boundp($all_core_constants$) ? ((SubLObject) ($all_core_constants$.getGlobalValue())) : $UNINITIALIZED);
            deflexical("*CORE-CONSTANT-TABLE*", NIL != boundp($core_constant_table$) ? ((SubLObject) ($core_constant_table$.getGlobalValue())) : NIL);
            deflexical("*ALL-CORE-NARTS*", NIL != boundp($all_core_narts$) ? ((SubLObject) ($all_core_narts$.getGlobalValue())) : $UNINITIALIZED);
            deflexical("*ALL-CORE-FORTS*", NIL != boundp($all_core_forts$) ? ((SubLObject) ($all_core_forts$.getGlobalValue())) : $UNINITIALIZED);
            deflexical("*CORE-FORT-TABLE*", NIL != boundp($core_fort_table$) ? ((SubLObject) ($core_fort_table$.getGlobalValue())) : NIL);
            deflexical("*ALL-CORE-RULES*", NIL != boundp($all_core_rules$) ? ((SubLObject) ($all_core_rules$.getGlobalValue())) : $UNINITIALIZED);
            deflexical("*DECONTEXTUALIZATION-PREDICATES*", $list_alt114);
        }
        return NIL;
    }

    public static SubLObject init_core_file_Previous() {
        deflexical("*CORE-SEED-COLLECTION*", $$CoreUnionConstant);
        deflexical("*CORE-SEED-MT*", $list1);
        deflexical("*ALL-CORE-RAW-CONSTANTS*", SubLTrampolineFile.maybeDefault($all_core_raw_constants$, $all_core_raw_constants$, $UNINITIALIZED));
        deflexical("*ALL-CORE-SKOLEMS*", SubLTrampolineFile.maybeDefault($all_core_skolems$, $all_core_skolems$, NIL));
        deflexical("*ALL-CORE-CONSTANTS*", SubLTrampolineFile.maybeDefault($all_core_constants$, $all_core_constants$, $UNINITIALIZED));
        deflexical("*CORE-CONSTANT-TABLE*", SubLTrampolineFile.maybeDefault($core_constant_table$, $core_constant_table$, NIL));
        deflexical("*ALL-CORE-NARTS*", SubLTrampolineFile.maybeDefault($all_core_narts$, $all_core_narts$, $UNINITIALIZED));
        deflexical("*ALL-CORE-FORTS*", SubLTrampolineFile.maybeDefault($all_core_forts$, $all_core_forts$, $UNINITIALIZED));
        deflexical("*CORE-FORT-TABLE*", SubLTrampolineFile.maybeDefault($core_fort_table$, $core_fort_table$, NIL));
        deflexical("*ALL-CORE-RULES*", SubLTrampolineFile.maybeDefault($all_core_rules$, $all_core_rules$, $UNINITIALIZED));
        defparameter("*CORE-DEFINING-ARG1-PREDICATES-INFO*", $list22);
        defparameter("*CORE-DEFINING-ARG2-PREDICATES-INFO*", NIL);
        deflexical("*CORE-DEFINITIONAL-INFO-CACHING-STATE*", NIL);
        deflexical("*CORE-MT-DEFINITIONAL-INFO-CACHING-STATE*", NIL);
        deflexical("*CORE-KB-START-TIME*", NIL);
        deflexical("*DECONTEXTUALIZATION-PREDICATES*", $list123);
        defvar("*LATE-ASSERTIONS*", NIL);
        defparameter("*CORE-COVERED-GAF-PREDICATES*", nconc(new SubLObject[]{ Mapping.mapcar(symbol_function(FIRST), $core_defining_arg1_predicates_info$.getDynamicValue()), Mapping.mapcar(symbol_function(FIRST), $core_defining_arg2_predicates_info$.getDynamicValue()), copy_list(after_adding.$gaf_after_adding_predicates$.getGlobalValue()), copy_list(rule_after_adding.$rule_after_adding_predicates$.getGlobalValue()), list($$termOfUnit, $$cyclistNotes) }));
        return NIL;
    }

    static private final SubLList $list_alt24 = list(makeSymbol("PRED"), makeSymbol("ALL-FUNC"), makeSymbol("TEST-FUNC"), makeSymbol("REFLEXIVE"));

    public static SubLObject setup_core_file() {
        declare_defglobal($all_core_raw_constants$);
        declare_defglobal($all_core_skolems$);
        declare_defglobal($all_core_constants$);
        declare_defglobal($core_constant_table$);
        declare_defglobal($all_core_narts$);
        declare_defglobal($all_core_forts$);
        declare_defglobal($core_fort_table$);
        declare_defglobal($all_core_rules$);
        memoization_state.note_globally_cached_function(CORE_DEFINITIONAL_INFO);
        memoization_state.note_globally_cached_function(CORE_MT_DEFINITIONAL_INFO);
        return NIL;
    }

    public static final SubLSymbol $kw32$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt33$__Cycle___S__S__S = makeString("~%Cycle: ~S ~S ~S");

    @Override
    public void declareFunctions() {
        declare_core_file();
    }

    static private final SubLString $str_alt34$__Given___S__Minimal___S = makeString("~%Given: ~S~%Minimal: ~S");

    @Override
    public void initializeVariables() {
        init_core_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_core_file();
    }

    static {
    }

    static private final SubLString $str_alt43$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt44$_______Mode__LISP__Package__CYC__ = makeString(";; -*- Mode: LISP; Package: CYC; Syntax: ANSI-Common-Lisp -*-");

    static private final SubLString $str_alt45$____ = makeString("~%;;");

    static private final SubLString $str_alt46$______A = makeString("~%;; ~A");

    static private final SubLString $str_alt47$_____Core_KB_for_CycL_version__A_ = makeString("~%;; Core KB for CycL version ~A from KB ~S.~S");

    static private final SubLString $str_alt48$_____This_file_is_automatically_g = makeString("~%;; This file is automatically generated!  See CYC:CYCL;CORE.LISP for details.");

    static private final SubLString $str_alt49$_________________________________ = makeString("~%;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");

    static private final SubLString $str_alt50$_____in_package__CYC__ = makeString("~%~%(in-package \"CYC\")");

    static private final SubLString $str_alt51$_______initialization = makeString("~%~%;; initialization");

    static private final SubLString $str_alt52$___core_kb_initialization__S_ = makeString("~%(core-kb-initialization ~S)");

    static private final SubLString $str_alt53$_______constants = makeString("~%~%;; constants");

    static private final SubLString $str_alt55$_____core_kb_start_bootstrapping_ = makeString("~%~%(core-kb-start-bootstrapping)");

    static private final SubLString $str_alt56$_______NARTs = makeString("~%~%;; NARTs");

    static private final SubLString $str_alt58$_______after_adding_early_extent_ = makeString("~%~%;; after adding early extent gafs");

    static private final SubLString $str_alt60$_______Core_mt_definitional_asser = makeString("~%~%;; Core mt definitional assertions");

    static private final SubLString $str_alt62$_______decontextualization_early_ = makeString("~%~%;; decontextualization early extent gafs");

    static private final SubLString $str_alt63$decontextualization_early_extent_ = makeString("decontextualization early extent asserts");

    static private final SubLString $str_alt64$_____core_kb_start_definitions_ = makeString("~%~%(core-kb-start-definitions)");

    static private final SubLString $str_alt65$_______definitional_assertions = makeString("~%~%;; definitional assertions");

    static private final SubLString $str_alt67$_______post_definitional_initiali = makeString("~%~%;; post-definitional initializations");

    static private final SubLString $str_alt68$___core_kb_finish_definitions_ = makeString("~%(core-kb-finish-definitions)");

    static private final SubLString $str_alt69$_______additional_gaf_assertions = makeString("~%~%;; additional gaf assertions");

    static private final SubLString $str_alt71$_____core_kb_finish_bootstrapping = makeString("~%~%(core-kb-finish-bootstrapping)");

    static private final SubLString $str_alt72$_______rules__asserting_forward_r = makeString("~%~%;; rules (asserting forward rules as backward)");

    static private final SubLString $str_alt73$core_rules_with_meta_assertions__ = makeString("core rules with meta-assertions (asserting forward rules as backward)");

    static private final SubLString $str_alt74$core_rules_without_meta_assertion = makeString("core rules without meta-assertions (asserting forward rules as backward)");

    static private final SubLString $str_alt75$_______forward_rules__reasserting = makeString("~%~%;; forward rules (reasserting as forward)");

    static private final SubLString $str_alt76$core_rules_with_meta_assertions = makeString("core rules with meta-assertions");

    static private final SubLString $str_alt77$core_rules_without_meta_assertion = makeString("core rules without meta-assertions");

    static private final SubLString $str_alt78$_______late_assertions = makeString("~%~%;; late assertions");

    static private final SubLString $str_alt79$_______finalization = makeString("~%~%;; finalization");

    static private final SubLString $str_alt80$___core_kb_finalization_ = makeString("~%(core-kb-finalization)");

    static private final SubLString $str_alt83$Illegal_operation____not_bootstra = makeString("Illegal operation -- not bootstrapping KB");

    static private final SubLSymbol $sym85$EL_VAR_ = makeSymbol("EL-VAR?");

    static private final SubLString $str_alt86$________Constructing_core_KB_at__ = makeString("~&~%;;; Constructing core KB at ~A~%");

    static private final SubLString $str_alt87$________Construction_of_core_KB_c = makeString("~&~%;;; Construction of core KB completed (~A) at ~A~%");

    static private final SubLString $str_alt88$___find_or_create_constant__S__S_ = makeString("~%(find-or-create-constant ~S ~S)");

    static private final SubLString $str_alt90$_ = makeString(",");

    static private final SubLString $str_alt91$_low_create_nart___ = makeString("(low-create-nart `(");

    static private final SubLString $str_alt92$_ = makeString(" ");

    static private final SubLString $str_alt93$__ = makeString("))");

    static private final SubLString $str_alt94$________S = makeString("~%~%;; ~S");

    static private final SubLList $list_alt95 = cons(makeSymbol("PRED"), makeSymbol("TRUTHS"));

    static private final SubLList $list_alt97 = cons(makeSymbol("TRUTH"), makeSymbol("VALUES"));

    static private final SubLList $list_alt98 = list(makeSymbol("VALUE"), makeSymbol("MT"));

    static private final SubLString $str_alt100$___low_assert_literal__ = makeString("~%(low-assert-literal `");

    static private final SubLString $str_alt101$__ = makeString(" `");

    static private final SubLString $str_alt102$_ = makeString(")");

    static private final SubLString $str_alt105$_S = makeString("~S");

    static private final SubLString $str_alt106$__find_nart___S_ = makeString(",(find-nart '~S)");

    static private final SubLString $str_alt109$___asserted_by__S__ = makeString(";; asserted by ~S~%");

    static private final SubLString $str_alt110$_fi_assert_int__ = makeString("(fi-assert-int '");

    static private final SubLString $str_alt111$___S__S__S___ = makeString("~%~S ~S ~S)~%");

    static private final SubLString $str_alt112$_tms_change_direction__find_asser = makeString("(tms-change-direction (find-assertion-cycl '");

    static private final SubLString $str_alt113$___S___S___ = makeString("~%~S) ~S)~%");

    static private final SubLList $list_alt114 = list(reader_make_constant_shell("decontextualizedPredicate"), reader_make_constant_shell("predicateConventionMt"), reader_make_constant_shell("decontextualizedCollection"), reader_make_constant_shell("collectionConventionMt"));
}

/**
 * Total time: 2476 ms
 */
