/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.memoization_state.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.modules.after_adding_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      GENL-MTS
 * source file: /cyc/top/cycl/genl-mts.lisp
 * created:     2019/07/03 17:37:28
 */
public final class genl_mts extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new genl_mts();

 public static final String myName = "com.cyc.cycjava.cycl.genl_mts";


    // defvar
    /**
     * This controls whether or not MIN-MTS implements a special case for exactly 2
     * mts.
     */
    @LispMethod(comment = "This controls whether or not MIN-MTS implements a special case for exactly 2\r\nmts.\ndefvar\nThis controls whether or not MIN-MTS implements a special case for exactly 2\nmts.")
    public static final SubLSymbol $min_mts_2_enabledP$ = makeSymbol("*MIN-MTS-2-ENABLED?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $suppress_max_floor_mts_explosion_warning$ = makeSymbol("*SUPPRESS-MAX-FLOOR-MTS-EXPLOSION-WARNING*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $max_floor_mts_explosion_warning_min_placements_mt_count$ = makeSymbol("*MAX-FLOOR-MTS-EXPLOSION-WARNING-MIN-PLACEMENTS-MT-COUNT*");







    private static final SubLSymbol $sym4$ANY_GENL_MT__MEMOIZED = makeSymbol("ANY-GENL-MT?-MEMOIZED");

    private static final SubLSymbol CORE_MICROTHEORY_P = makeSymbol("CORE-MICROTHEORY-P");

    private static final SubLSymbol $sym7$ANY_GENL_MT_ = makeSymbol("ANY-GENL-MT?");

    private static final SubLList $list8 = list(makeSymbol("SPEC"), makeSymbol("GENLS"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT-MT"), makeSymbol("*MT-MT*")), makeSymbol("TV"));

    private static final SubLString $str9$_any_genl_mt__spec_genls__is_t_if = makeString("(any-genl-mt? spec genls) is t iff (genl-mt? spec genl) for some genl in genls\n   (ascending transitive search; inexpensive)");

    static private final SubLList $list10 = list(list(makeSymbol("SPEC"), makeSymbol("EL-FORT-P")), list(makeSymbol("GENLS"), makeSymbol("EL-FORT-P")));

    private static final SubLList $list11 = list(makeSymbol("BOOLEANP"));

    private static final SubLSymbol ALL_BASE_MTS = makeSymbol("ALL-BASE-MTS");

    private static final SubLSymbol $all_base_mts_caching_state$ = makeSymbol("*ALL-BASE-MTS-CACHING-STATE*");

    private static final SubLInteger $int$2048 = makeInteger(2048);

    private static final SubLList $list16 = list(makeSymbol("MT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym17$BASE_MT = makeUninternedSymbol("BASE-MT");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol MAX_FLOOR_MTS_EXPLOSION_WARNING = makeSymbol("MAX-FLOOR-MTS-EXPLOSION-WARNING");

    private static final SubLString $str23$__Forward_inference_mt_placement_ = makeString("~&Forward inference mt placement explosion detected (~A -> ~A): (show-max-floor-mts-info ~S ~A ~A)~A");

    private static final SubLSymbol NART_EL_FORMULA = makeSymbol("NART-EL-FORMULA");

    private static final SubLString $str26$ = makeString("");

    private static final SubLString $str27$____KB__A = makeString(" ;; KB ~A");

    private static final SubLString $str28$__gaf__ = makeString("~&gaf: ");

    private static final SubLString $str29$__rule__ = makeString("~&rule: ");

    private static final SubLString $str30$___S_____A__ = makeString("~&~S ;; ~A~%");

    private static final SubLSymbol $sym31$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE>");

    private static final SubLString $str32$_______ = makeString("~&-->~%");

    private static final SubLString $$$Repropagaing = makeString("Repropagaing");

    private static final SubLSymbol $sym34$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol $sym35$ATEMPORAL_HLMT_ = makeSymbol("ATEMPORAL-HLMT?");

    private static final SubLSymbol HLMT_MONAD_MT = makeSymbol("HLMT-MONAD-MT");

    private static final SubLSymbol MAX_FLOOR_MONAD_MTS = makeSymbol("MAX-FLOOR-MONAD-MTS");

    private static final SubLSymbol MAX_FLOOR_MTS = makeSymbol("MAX-FLOOR-MTS");

    private static final SubLSymbol CACHED_MAX_FLOOR_MTS_FROM_MT_SETS = makeSymbol("CACHED-MAX-FLOOR-MTS-FROM-MT-SETS");

    private static final SubLSymbol $cached_max_floor_mts_from_mt_sets_caching_state$ = makeSymbol("*CACHED-MAX-FLOOR-MTS-FROM-MT-SETS-CACHING-STATE*");

    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLString $$$Identifying_MTs_in_loops = makeString("Identifying MTs in loops");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLString $str49$_S = makeString("~S");

    private static final SubLString $$$Identifying_MT_Loop_Members = makeString("Identifying MT Loop Members");

    private static final SubLString $str51$length__S_loop____S = makeString("length ~S loop:~%~S");

    private static final SubLList $list52 = list(makeSymbol("PREFERRED-MT"), makeSymbol("&REST"), makeSymbol("DISPREFERRED-MTS"));

    private static final SubLSymbol $sym53$_ = makeSymbol(">");

    private static final SubLSymbol ADD_BASE_MT = makeSymbol("ADD-BASE-MT");

    private static final SubLSymbol ADD_GENL_MT = makeSymbol("ADD-GENL-MT");

    private static final SubLSymbol REMOVE_BASE_MT = makeSymbol("REMOVE-BASE-MT");

    private static final SubLSymbol REMOVE_GENL_MT = makeSymbol("REMOVE-GENL-MT");

    // Definitions
    /**
     *
     *
     * @return listp; the asserted true genl-mt links of MT
     */
    @LispMethod(comment = "@return listp; the asserted true genl-mt links of MT")
    public static final SubLObject genl_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv, UNPROVIDED);
    }

    // Definitions
    /**
     *
     *
     * @return listp; the asserted true genl-mt links of MT
     */
    @LispMethod(comment = "@return listp; the asserted true genl-mt links of MT")
    public static SubLObject genl_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv, UNPROVIDED);
    }

    /**
     * returns the most-specific genls of microtheory <mt>
     */
    @LispMethod(comment = "returns the most-specific genls of microtheory <mt>")
    public static final SubLObject min_genl_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_min_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv);
    }

    /**
     * returns the most-specific genls of microtheory <mt>
     */
    @LispMethod(comment = "returns the most-specific genls of microtheory <mt>")
    public static SubLObject min_genl_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_min_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv);
    }

    /**
     *
     *
     * @return listp; the asserted false genl-mt links of MT.
     */
    @LispMethod(comment = "@return listp; the asserted false genl-mt links of MT.")
    public static final SubLObject not_genl_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the asserted false genl-mt links of MT.
     */
    @LispMethod(comment = "@return listp; the asserted false genl-mt links of MT.")
    public static SubLObject not_genl_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv, UNPROVIDED);
    }

    /**
     * returns the least-specific negated genls of microtheory <mt>
     */
    @LispMethod(comment = "returns the least-specific negated genls of microtheory <mt>")
    public static final SubLObject max_not_genl_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_max_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv);
    }

    /**
     * returns the least-specific negated genls of microtheory <mt>
     */
    @LispMethod(comment = "returns the least-specific negated genls of microtheory <mt>")
    public static SubLObject max_not_genl_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_max_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv);
    }

    /**
     *
     *
     * @return listp; the asserted true spec-mt links of MT
     */
    @LispMethod(comment = "@return listp; the asserted true spec-mt links of MT")
    public static final SubLObject spec_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the asserted true spec-mt links of MT
     */
    @LispMethod(comment = "@return listp; the asserted true spec-mt links of MT")
    public static SubLObject spec_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv, UNPROVIDED);
    }

    /**
     *
     *
     * @return T iff MT has no spec-mt links.
     */
    @LispMethod(comment = "@return T iff MT has no spec-mt links.")
    public static final SubLObject leaf_mtP_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return makeBoolean(NIL == sbhl_link_methods.sbhl_backward_true_link_nodes_p(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv));
    }

    /**
     *
     *
     * @return T iff MT has no spec-mt links.
     */
    @LispMethod(comment = "@return T iff MT has no spec-mt links.")
    public static SubLObject leaf_mtP(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return makeBoolean(NIL == sbhl_link_methods.sbhl_backward_true_link_nodes_p(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv));
    }

    /**
     * returns the least-specific specs of microtheory <mt>
     */
    @LispMethod(comment = "returns the least-specific specs of microtheory <mt>")
    public static final SubLObject max_spec_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_max_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv);
    }

    /**
     * returns the least-specific specs of microtheory <mt>
     */
    @LispMethod(comment = "returns the least-specific specs of microtheory <mt>")
    public static SubLObject max_spec_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_max_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv);
    }

    /**
     *
     *
     * @return listp; the asserted false spec-mt links of MT.
     */
    @LispMethod(comment = "@return listp; the asserted false spec-mt links of MT.")
    public static final SubLObject not_spec_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the asserted false spec-mt links of MT.
     */
    @LispMethod(comment = "@return listp; the asserted false spec-mt links of MT.")
    public static SubLObject not_spec_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv, UNPROVIDED);
    }

    /**
     * returns the most-specific negated specs of microtheory <mt>
     */
    @LispMethod(comment = "returns the most-specific negated specs of microtheory <mt>")
    public static final SubLObject min_not_spec_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_min_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv);
    }

    /**
     * returns the most-specific negated specs of microtheory <mt>
     */
    @LispMethod(comment = "returns the most-specific negated specs of microtheory <mt>")
    public static SubLObject min_not_spec_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_min_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv);
    }

    /**
     * returns the direct genls of those direct specs mts of <mt>
     */
    @LispMethod(comment = "returns the direct genls of those direct specs mts of <mt>")
    public static final SubLObject genl_mt_siblings_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_siblings_forward(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv);
    }

    /**
     * returns the direct genls of those direct specs mts of <mt>
     */
    @LispMethod(comment = "returns the direct genls of those direct specs mts of <mt>")
    public static SubLObject genl_mt_siblings(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_siblings_forward(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv);
    }

    /**
     * returns the direct specs of those direct genl mts of <mt>
     */
    @LispMethod(comment = "returns the direct specs of those direct genl mts of <mt>")
    public static final SubLObject spec_mt_siblings_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_siblings_backward(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv);
    }

    /**
     * returns the direct specs of those direct genl mts of <mt>
     */
    @LispMethod(comment = "returns the direct specs of those direct genl mts of <mt>")
    public static SubLObject spec_mt_siblings(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_siblings_backward(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv);
    }

    /**
     * returns all genls of microtheory <mt>
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "returns all genls of microtheory <mt>\r\n(ascending transitive closure; inexpensive)\nreturns all genls of microtheory <mt>\n(ascending transitive closure; inexpensive)")
    public static final SubLObject all_genl_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv);
    }

    /**
     * returns all genls of microtheory <mt>
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "returns all genls of microtheory <mt>\r\n(ascending transitive closure; inexpensive)\nreturns all genls of microtheory <mt>\n(ascending transitive closure; inexpensive)")
    public static SubLObject all_genl_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return all_genl_mts_internal(mt, mt_mt, tv, T);
    }

    public static SubLObject all_genl_mts_internal(final SubLObject mt, final SubLObject mt_mt, final SubLObject tv, final SubLObject caching_enabledP) {
        return sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv);
    }

    /**
     * returns all specs of microtheory <mt>
     * (descending transitive closure; expensive)
     */
    @LispMethod(comment = "returns all specs of microtheory <mt>\r\n(descending transitive closure; expensive)\nreturns all specs of microtheory <mt>\n(descending transitive closure; expensive)")
    public static final SubLObject all_spec_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv);
    }

    /**
     * returns all specs of microtheory <mt>
     * (descending transitive closure; expensive)
     */
    @LispMethod(comment = "returns all specs of microtheory <mt>\r\n(descending transitive closure; expensive)\nreturns all specs of microtheory <mt>\n(descending transitive closure; expensive)")
    public static SubLObject all_spec_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return all_spec_mts_internal(mt, mt_mt, tv, T);
    }

    public static SubLObject all_spec_mts_internal(final SubLObject mt, final SubLObject mt_mt, final SubLObject tv, final SubLObject caching_enabledP) {
        return sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv);
    }

    /**
     * returns all genls of microtheory <mt> except for <mt> itself
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "returns all genls of microtheory <mt> except for <mt> itself\r\n(ascending transitive closure; inexpensive)\nreturns all genls of microtheory <mt> except for <mt> itself\n(ascending transitive closure; inexpensive)")
    public static final SubLObject all_proper_genl_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return remove(mt, com.cyc.cycjava.cycl.genl_mts.all_genl_mts(mt, mt_mt, tv), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * returns all genls of microtheory <mt> except for <mt> itself
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "returns all genls of microtheory <mt> except for <mt> itself\r\n(ascending transitive closure; inexpensive)\nreturns all genls of microtheory <mt> except for <mt> itself\n(ascending transitive closure; inexpensive)")
    public static SubLObject all_proper_genl_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return remove(mt, all_genl_mts(mt, mt_mt, tv), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * returns all specs of microtheory <mt> except for <mt> itself
     * (descending transitive closure; expensive)
     */
    @LispMethod(comment = "returns all specs of microtheory <mt> except for <mt> itself\r\n(descending transitive closure; expensive)\nreturns all specs of microtheory <mt> except for <mt> itself\n(descending transitive closure; expensive)")
    public static final SubLObject all_proper_spec_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return remove(mt, com.cyc.cycjava.cycl.genl_mts.all_spec_mts(mt, mt_mt, tv), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * returns all specs of microtheory <mt> except for <mt> itself
     * (descending transitive closure; expensive)
     */
    @LispMethod(comment = "returns all specs of microtheory <mt> except for <mt> itself\r\n(descending transitive closure; expensive)\nreturns all specs of microtheory <mt> except for <mt> itself\n(descending transitive closure; expensive)")
    public static SubLObject all_proper_spec_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return remove(mt, all_spec_mts(mt, mt_mt, tv), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject random_genl_mt_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return list_utilities.random_element(com.cyc.cycjava.cycl.genl_mts.all_genl_mts(mt, mt_mt, tv));
    }

    public static SubLObject random_genl_mt(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return list_utilities.random_element(all_genl_mts(mt, mt_mt, tv));
    }

    public static final SubLObject random_spec_mt_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (NIL != mt_vars.core_microtheory_p(mt)) {
            return isa.random_instance_of($$Microtheory, UNPROVIDED);
        } else {
            return list_utilities.random_element(com.cyc.cycjava.cycl.genl_mts.all_spec_mts(mt, mt_mt, tv));
        }
    }

    public static SubLObject random_spec_mt(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (NIL != mt_vars.core_microtheory_p(mt)) {
            return isa.random_instance_of($$Microtheory, UNPROVIDED);
        }
        return list_utilities.random_element(all_spec_mts(mt, mt_mt, tv));
    }

    public static final SubLObject random_proper_genl_mt_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return list_utilities.random_element(com.cyc.cycjava.cycl.genl_mts.all_proper_genl_mts(mt, mt_mt, tv));
    }

    public static SubLObject random_proper_genl_mt(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return list_utilities.random_element(all_proper_genl_mts(mt, mt_mt, tv));
    }

    public static final SubLObject random_proper_spec_mt_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return list_utilities.random_element(com.cyc.cycjava.cycl.genl_mts.all_proper_spec_mts(mt, mt_mt, tv));
    }

    public static SubLObject random_proper_spec_mt(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return list_utilities.random_element(all_proper_spec_mts(mt, mt_mt, tv));
    }

    /**
     * returns all negated genls of microtheory <mt>
     * (descending transitive closure; expensive)
     */
    @LispMethod(comment = "returns all negated genls of microtheory <mt>\r\n(descending transitive closure; expensive)\nreturns all negated genls of microtheory <mt>\n(descending transitive closure; expensive)")
    public static final SubLObject all_not_genl_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_all_implied_forward_false_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv);
    }

    /**
     * returns all negated genls of microtheory <mt>
     * (descending transitive closure; expensive)
     */
    @LispMethod(comment = "returns all negated genls of microtheory <mt>\r\n(descending transitive closure; expensive)\nreturns all negated genls of microtheory <mt>\n(descending transitive closure; expensive)")
    public static SubLObject all_not_genl_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_all_implied_forward_false_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv);
    }

    /**
     * returns all negated specs of microtheory <mt>
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "returns all negated specs of microtheory <mt>\r\n(ascending transitive closure; inexpensive)\nreturns all negated specs of microtheory <mt>\n(ascending transitive closure; inexpensive)")
    public static final SubLObject all_not_spec_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_all_implied_backward_false_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv);
    }

    /**
     * returns all negated specs of microtheory <mt>
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "returns all negated specs of microtheory <mt>\r\n(ascending transitive closure; inexpensive)\nreturns all negated specs of microtheory <mt>\n(ascending transitive closure; inexpensive)")
    public static SubLObject all_not_spec_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_all_implied_backward_false_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv);
    }

    /**
     * Returns all genl-mts of microtheory SPEC-MT that are also spec-mts of microtheory GENL-MT
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "Returns all genl-mts of microtheory SPEC-MT that are also spec-mts of microtheory GENL-MT\r\n(ascending transitive closure; inexpensive)\nReturns all genl-mts of microtheory SPEC-MT that are also spec-mts of microtheory GENL-MT\n(ascending transitive closure; inexpensive)")
    public static final SubLObject all_genl_mts_between_alt(SubLObject spec_mt, SubLObject genl_mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_true_nodes_between(sbhl_module_vars.get_sbhl_module($$genlMt), spec_mt, genl_mt, mt_mt, tv);
    }

    /**
     * Returns all genl-mts of microtheory SPEC-MT that are also spec-mts of microtheory GENL-MT
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "Returns all genl-mts of microtheory SPEC-MT that are also spec-mts of microtheory GENL-MT\r\n(ascending transitive closure; inexpensive)\nReturns all genl-mts of microtheory SPEC-MT that are also spec-mts of microtheory GENL-MT\n(ascending transitive closure; inexpensive)")
    public static SubLObject all_genl_mts_between(final SubLObject spec_mt, final SubLObject genl_mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_true_nodes_between(sbhl_module_vars.get_sbhl_module($$genlMt), spec_mt, genl_mt, mt_mt, tv);
    }

    /**
     * all genls of each mt in <mts>
     */
    @LispMethod(comment = "all genls of each mt in <mts>")
    public static final SubLObject union_all_genl_mts_alt(SubLObject mts, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_union_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mts, mt_mt, tv);
    }

    /**
     * all genls of each mt in <mts>
     */
    @LispMethod(comment = "all genls of each mt in <mts>")
    public static SubLObject union_all_genl_mts(final SubLObject mts, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_union_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mts, mt_mt, tv);
    }

    /**
     * all specs of each mt in <mts>
     * (descending transitive closure; expensive)
     */
    @LispMethod(comment = "all specs of each mt in <mts>\r\n(descending transitive closure; expensive)\nall specs of each mt in <mts>\n(descending transitive closure; expensive)")
    public static final SubLObject union_all_spec_mts_alt(SubLObject mts, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_union_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mts, mt_mt, tv);
    }

    /**
     * all specs of each mt in <mts>
     * (descending transitive closure; expensive)
     */
    @LispMethod(comment = "all specs of each mt in <mts>\r\n(descending transitive closure; expensive)\nall specs of each mt in <mts>\n(descending transitive closure; expensive)")
    public static SubLObject union_all_spec_mts(final SubLObject mts, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_union_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mts, mt_mt, tv);
    }

    /**
     * Returns all spec-mts s of MT s.t. every path connecting
     * s to any genl-mt of MT must pass through MT
     */
    @LispMethod(comment = "Returns all spec-mts s of MT s.t. every path connecting\r\ns to any genl-mt of MT must pass through MT\nReturns all spec-mts s of MT s.t. every path connecting\ns to any genl-mt of MT must pass through MT")
    public static final SubLObject all_dependent_spec_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_dependent_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv);
    }

    /**
     * Returns all spec-mts s of MT s.t. every path connecting
     * s to any genl-mt of MT must pass through MT
     */
    @LispMethod(comment = "Returns all spec-mts s of MT s.t. every path connecting\r\ns to any genl-mt of MT must pass through MT\nReturns all spec-mts s of MT s.t. every path connecting\ns to any genl-mt of MT must pass through MT")
    public static SubLObject all_dependent_spec_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_dependent_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt, tv);
    }

    /**
     *
     *
     * @return listp. The genl-mts of MT among MTS
     */
    @LispMethod(comment = "@return listp. The genl-mts of MT among MTS")
    public static final SubLObject all_genl_mts_among_alt(SubLObject mt, SubLObject mts, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_true_nodes_among(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mts, mt_mt, tv);
    }

    /**
     *
     *
     * @return listp. The genl-mts of MT among MTS
     */
    @LispMethod(comment = "@return listp. The genl-mts of MT among MTS")
    public static SubLObject all_genl_mts_among(final SubLObject mt, final SubLObject mts, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_true_nodes_among(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mts, mt_mt, tv);
    }

    /**
     *
     *
     * @return listp. The spec-mts of MT among MTS
     */
    @LispMethod(comment = "@return listp. The spec-mts of MT among MTS")
    public static final SubLObject all_spec_mts_among_alt(SubLObject mt, SubLObject mts, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_backward_true_nodes_among(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mts, mt_mt, tv);
    }

    /**
     *
     *
     * @return listp. The spec-mts of MT among MTS
     */
    @LispMethod(comment = "@return listp. The spec-mts of MT among MTS")
    public static SubLObject all_spec_mts_among(final SubLObject mt, final SubLObject mts, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_backward_true_nodes_among(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mts, mt_mt, tv);
    }

    public static final SubLObject selected_genl_mts_alt(SubLObject mt, SubLObject mts, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return com.cyc.cycjava.cycl.genl_mts.all_genl_mts_among(mt, mts, mt_mt, tv);
    }

    public static SubLObject selected_genl_mts(final SubLObject mt, final SubLObject mts, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return all_genl_mts_among(mt, mts, mt_mt, tv);
    }

    /**
     *
     *
     * @return listp; the genl-mts of MT that pass the test FUNCTION.
     */
    @LispMethod(comment = "@return listp; the genl-mts of MT that pass the test FUNCTION.")
    public static final SubLObject all_genl_mts_if_alt(SubLObject mt, SubLObject function, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_true_nodes_if(sbhl_module_vars.get_sbhl_module($$genlMt), mt, function, mt_mt, tv);
    }

    /**
     *
     *
     * @return listp; the genl-mts of MT that pass the test FUNCTION.
     */
    @LispMethod(comment = "@return listp; the genl-mts of MT that pass the test FUNCTION.")
    public static SubLObject all_genl_mts_if(final SubLObject mt, final SubLObject function, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_true_nodes_if(sbhl_module_vars.get_sbhl_module($$genlMt), mt, function, mt_mt, tv);
    }

    /**
     *
     *
     * @return listp; the spec-mts of MT that pass the test FUNCTION.
     */
    @LispMethod(comment = "@return listp; the spec-mts of MT that pass the test FUNCTION.")
    public static final SubLObject all_spec_mts_if_alt(SubLObject mt, SubLObject function, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_backward_true_nodes_if(sbhl_module_vars.get_sbhl_module($$genlMt), mt, function, mt_mt, tv);
    }

    /**
     *
     *
     * @return listp; the spec-mts of MT that pass the test FUNCTION.
     */
    @LispMethod(comment = "@return listp; the spec-mts of MT that pass the test FUNCTION.")
    public static SubLObject all_spec_mts_if(final SubLObject mt, final SubLObject function, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_backward_true_nodes_if(sbhl_module_vars.get_sbhl_module($$genlMt), mt, function, mt_mt, tv);
    }

    /**
     * applies FN to every (all) genlMts of MT
     * (FN must not effect the current sbhl space)
     */
    @LispMethod(comment = "applies FN to every (all) genlMts of MT\r\n(FN must not effect the current sbhl space)\napplies FN to every (all) genlMts of MT\n(FN must not effect the current sbhl space)")
    public static final SubLObject map_all_genl_mts_alt(SubLObject fn, SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        sbhl_search_methods.sbhl_map_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, fn, mt_mt, tv);
        return NIL;
    }

    /**
     * applies FN to every (all) genlMts of MT
     * (FN must not effect the current sbhl space)
     */
    @LispMethod(comment = "applies FN to every (all) genlMts of MT\r\n(FN must not effect the current sbhl space)\napplies FN to every (all) genlMts of MT\n(FN must not effect the current sbhl space)")
    public static SubLObject map_all_genl_mts(final SubLObject fn, final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        sbhl_search_methods.sbhl_map_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, fn, mt_mt, tv);
        return NIL;
    }

    /**
     * applies FN to every (all) specMts of MT
     * (FN must not effect the current sbhl space)
     */
    @LispMethod(comment = "applies FN to every (all) specMts of MT\r\n(FN must not effect the current sbhl space)\napplies FN to every (all) specMts of MT\n(FN must not effect the current sbhl space)")
    public static final SubLObject map_all_spec_mts_alt(SubLObject fn, SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        sbhl_search_methods.sbhl_map_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, fn, mt_mt, tv);
        return NIL;
    }

    /**
     * applies FN to every (all) specMts of MT
     * (FN must not effect the current sbhl space)
     */
    @LispMethod(comment = "applies FN to every (all) specMts of MT\r\n(FN must not effect the current sbhl space)\napplies FN to every (all) specMts of MT\n(FN must not effect the current sbhl space)")
    public static SubLObject map_all_spec_mts(final SubLObject fn, final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        sbhl_search_methods.sbhl_map_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt, fn, mt_mt, tv);
        return NIL;
    }

    /**
     * applies FN to every (all) genlMts of each mt in MTS
     * (FN must not effect the current sbhl space)
     */
    @LispMethod(comment = "applies FN to every (all) genlMts of each mt in MTS\r\n(FN must not effect the current sbhl space)\napplies FN to every (all) genlMts of each mt in MTS\n(FN must not effect the current sbhl space)")
    public static final SubLObject map_union_all_genl_mts_alt(SubLObject fn, SubLObject mts, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        sbhl_search_methods.sbhl_map_union_all_forward_true_nodes(mts, fn, mt_mt, tv, UNPROVIDED);
        return NIL;
    }

    /**
     * applies FN to every (all) genlMts of each mt in MTS
     * (FN must not effect the current sbhl space)
     */
    @LispMethod(comment = "applies FN to every (all) genlMts of each mt in MTS\r\n(FN must not effect the current sbhl space)\napplies FN to every (all) genlMts of each mt in MTS\n(FN must not effect the current sbhl space)")
    public static SubLObject map_union_all_genl_mts(final SubLObject fn, final SubLObject mts, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        sbhl_search_methods.sbhl_map_union_all_forward_true_nodes(mts, fn, mt_mt, tv, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject map_all_genl_mts_of_all_alt(SubLObject fn, SubLObject mts, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        com.cyc.cycjava.cycl.genl_mts.map_union_all_genl_mts(fn, mts, mt_mt, tv);
        return NIL;
    }

    public static SubLObject map_all_genl_mts_of_all(final SubLObject fn, final SubLObject mts, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        map_union_all_genl_mts(fn, mts, mt_mt, tv);
        return NIL;
    }

    /**
     * applies FN to every (all) spec mts of each mt in MTS
     * (FN must not effect the current sbhl space)
     */
    @LispMethod(comment = "applies FN to every (all) spec mts of each mt in MTS\r\n(FN must not effect the current sbhl space)\napplies FN to every (all) spec mts of each mt in MTS\n(FN must not effect the current sbhl space)")
    public static final SubLObject map_union_all_spec_mts_alt(SubLObject fn, SubLObject mts, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        sbhl_search_methods.sbhl_map_union_all_backward_true_nodes(mts, fn, mt_mt, tv, UNPROVIDED);
        return NIL;
    }

    /**
     * applies FN to every (all) spec mts of each mt in MTS
     * (FN must not effect the current sbhl space)
     */
    @LispMethod(comment = "applies FN to every (all) spec mts of each mt in MTS\r\n(FN must not effect the current sbhl space)\napplies FN to every (all) spec mts of each mt in MTS\n(FN must not effect the current sbhl space)")
    public static SubLObject map_union_all_spec_mts(final SubLObject fn, final SubLObject mts, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        sbhl_search_methods.sbhl_map_union_all_backward_true_nodes(mts, fn, mt_mt, tv, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject map_all_spec_mts_of_all_alt(SubLObject fn, SubLObject mts, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        com.cyc.cycjava.cycl.genl_mts.map_union_all_spec_mts(fn, mts, mt_mt, tv);
        return NIL;
    }

    public static SubLObject map_all_spec_mts_of_all(final SubLObject fn, final SubLObject mts, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        map_union_all_spec_mts(fn, mts, mt_mt, tv);
        return NIL;
    }

    /**
     * is mt <genl> a genl-mt of <spec>?
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "is mt <genl> a genl-mt of <spec>?\r\n(ascending transitive search; inexpensive)\nis mt <genl> a genl-mt of <spec>?\n(ascending transitive search; inexpensive)")
    public static final SubLObject genl_mtP_alt(SubLObject spec, SubLObject genl, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (NIL != hlmt.hlmts_supportedP()) {
            return hlmt_relevance.hlmt_visible_p(spec, genl);
        } else {
            return com.cyc.cycjava.cycl.genl_mts.monad_genl_mtP(spec, genl, mt_mt, tv);
        }
    }

    /**
     * is mt <genl> a genl-mt of <spec>?
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "is mt <genl> a genl-mt of <spec>?\r\n(ascending transitive search; inexpensive)\nis mt <genl> a genl-mt of <spec>?\n(ascending transitive search; inexpensive)")
    public static SubLObject genl_mtP(final SubLObject spec, final SubLObject genl, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (NIL != hlmt.hlmts_supportedP()) {
            return hlmt_relevance.hlmt_visible_p(spec, genl);
        }
        return monad_genl_mtP(spec, genl, mt_mt, tv);
    }

    public static final SubLObject proper_genl_mtP_alt(SubLObject spec, SubLObject genl, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.genl_mts.genl_mtP(spec, genl, mt_mt, tv)) && (NIL == com.cyc.cycjava.cycl.genl_mts.genl_mtP(genl, spec, mt_mt, tv)));
    }

    public static SubLObject proper_genl_mtP(final SubLObject spec, final SubLObject genl, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return makeBoolean((NIL != genl_mtP(spec, genl, mt_mt, tv)) && (NIL == genl_mtP(genl, spec, mt_mt, tv)));
    }

    /**
     * is monad mt <genl> a genl-mt of <spec>?
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "is monad mt <genl> a genl-mt of <spec>?\r\n(ascending transitive search; inexpensive)\nis monad mt <genl> a genl-mt of <spec>?\n(ascending transitive search; inexpensive)")
    public static final SubLObject monad_genl_mtP_alt(SubLObject spec, SubLObject genl, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = sbhl_search_methods.sbhl_non_justifying_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlMt), spec, genl, mt_mt, tv);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * is monad mt <genl> a genl-mt of <spec>?
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "is monad mt <genl> a genl-mt of <spec>?\r\n(ascending transitive search; inexpensive)\nis monad mt <genl> a genl-mt of <spec>?\n(ascending transitive search; inexpensive)")
    public static SubLObject monad_genl_mtP(final SubLObject spec, final SubLObject genl, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = sbhl_search_methods.sbhl_non_justifying_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlMt), spec, genl, mt_mt, tv);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * is microtheory <genl> a genl-mt of <spec>?
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "is microtheory <genl> a genl-mt of <spec>?\r\n(ascending transitive search; inexpensive)\nis microtheory <genl> a genl-mt of <spec>?\n(ascending transitive search; inexpensive)")
    public static final SubLObject spec_mtP_alt(SubLObject genl, SubLObject spec, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.genl_mts.genl_mtP(spec, genl, mt_mt, UNPROVIDED);
    }

    /**
     * is microtheory <genl> a genl-mt of <spec>?
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "is microtheory <genl> a genl-mt of <spec>?\r\n(ascending transitive search; inexpensive)\nis microtheory <genl> a genl-mt of <spec>?\n(ascending transitive search; inexpensive)")
    public static SubLObject spec_mtP(final SubLObject genl, final SubLObject spec, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return genl_mtP(spec, genl, mt_mt, UNPROVIDED);
    }

    /**
     * forces search along spec links (rather than genl links);
     * use genl-mt? if this is not necessary (almost always use genl-mt?)
     */
    @LispMethod(comment = "forces search along spec links (rather than genl links);\r\nuse genl-mt? if this is not necessary (almost always use genl-mt?)\nforces search along spec links (rather than genl links);\nuse genl-mt? if this is not necessary (almost always use genl-mt?)")
    public static final SubLObject genl_mt_ofP_alt(SubLObject genl, SubLObject spec, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_inverse_relation_p(sbhl_module_vars.get_sbhl_module($$genlMt), genl, spec, mt_mt, tv);
    }

    /**
     * forces search along spec links (rather than genl links);
     * use genl-mt? if this is not necessary (almost always use genl-mt?)
     */
    @LispMethod(comment = "forces search along spec links (rather than genl links);\r\nuse genl-mt? if this is not necessary (almost always use genl-mt?)\nforces search along spec links (rather than genl links);\nuse genl-mt? if this is not necessary (almost always use genl-mt?)")
    public static SubLObject genl_mt_ofP(final SubLObject genl, final SubLObject spec, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_inverse_relation_p(sbhl_module_vars.get_sbhl_module($$genlMt), genl, spec, mt_mt, tv);
    }

    public static SubLObject any_genl_mtP_memoized_internal(final SubLObject spec, final SubLObject v_genls, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return any_genl_mtP(spec, v_genls, mt_mt, tv);
    }

    public static SubLObject any_genl_mtP_memoized(final SubLObject spec, final SubLObject v_genls, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return any_genl_mtP_memoized_internal(spec, v_genls, mt_mt, tv);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym4$ANY_GENL_MT__MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym4$ANY_GENL_MT__MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym4$ANY_GENL_MT__MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(spec, v_genls, mt_mt, tv);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (spec.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (v_genls.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt_mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && tv.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(any_genl_mtP_memoized_internal(spec, v_genls, mt_mt, tv)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(spec, v_genls, mt_mt, tv));
        return memoization_state.caching_results(results3);
    }

    /**
     * (any-genl-mt? spec genls) is t iff (genl-mt? spec genl) for some genl in genls
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "(any-genl-mt? spec genls) is t iff (genl-mt? spec genl) for some genl in genls\r\n(ascending transitive search; inexpensive)\n(any-genl-mt? spec genls) is t iff (genl-mt? spec genl) for some genl in genls\n(ascending transitive search; inexpensive)")
    public static final SubLObject any_genl_mtP_alt(SubLObject spec, SubLObject v_genls, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(spec, EL_FORT_P);
        SubLTrampolineFile.checkType(v_genls, EL_FORT_P);
        if (NIL != list_utilities.any_in_list(CORE_MICROTHEORY_P, v_genls, UNPROVIDED)) {
            if (NIL != mt_vars.core_microtheory_p(spec)) {
                return mt_vars.core_any_genl_mtP(spec, v_genls);
            } else {
                return T;
            }
        }
        return sbhl_search_methods.sbhl_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module($$genlMt), spec, v_genls, mt_mt, tv);
    }

    /**
     * (any-genl-mt? spec genls) is t iff (genl-mt? spec genl) for some genl in genls
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "(any-genl-mt? spec genls) is t iff (genl-mt? spec genl) for some genl in genls\r\n(ascending transitive search; inexpensive)\n(any-genl-mt? spec genls) is t iff (genl-mt? spec genl) for some genl in genls\n(ascending transitive search; inexpensive)")
    public static SubLObject any_genl_mtP(final SubLObject spec, final SubLObject v_genls, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(spec, EL_FORT_P);
        SubLTrampolineFile.enforceType(v_genls, EL_FORT_P);
        if (NIL == list_utilities.any_in_list(CORE_MICROTHEORY_P, v_genls, UNPROVIDED)) {
            return sbhl_search_methods.sbhl_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module($$genlMt), spec, v_genls, mt_mt, tv);
        }
        if (NIL != mt_vars.core_microtheory_p(spec)) {
            return mt_vars.core_any_genl_mtP(spec, v_genls);
        }
        return T;
    }

    /**
     * (genl-mt-of-any? specs genl) is t iff (genl-mt? spec genl) for some spec in specs
     */
    @LispMethod(comment = "(genl-mt-of-any? specs genl) is t iff (genl-mt? spec genl) for some spec in specs")
    public static final SubLObject genl_mt_of_anyP_alt(SubLObject specs, SubLObject genl, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_any_with_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlMt), specs, genl, mt_mt, tv);
    }

    /**
     * (genl-mt-of-any? specs genl) is t iff (genl-mt? spec genl) for some spec in specs
     */
    @LispMethod(comment = "(genl-mt-of-any? specs genl) is t iff (genl-mt? spec genl) for some spec in specs")
    public static SubLObject genl_mt_of_anyP(final SubLObject specs, final SubLObject genl, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_any_with_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlMt), specs, genl, mt_mt, tv);
    }

    /**
     * (genl-mt-of-all? specs genl) is t iff (genl-mt? spec <genl>) for every spec in <specs>
     */
    @LispMethod(comment = "(genl-mt-of-all? specs genl) is t iff (genl-mt? spec <genl>) for every spec in <specs>")
    public static final SubLObject all_genl_mtP_alt(SubLObject spec, SubLObject v_genls, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_predicate_relation_with_all_p(sbhl_module_vars.get_sbhl_module($$genlMt), spec, v_genls, mt_mt, tv);
    }

    /**
     * (genl-mt-of-all? specs genl) is t iff (genl-mt? spec <genl>) for every spec in <specs>
     */
    @LispMethod(comment = "(genl-mt-of-all? specs genl) is t iff (genl-mt? spec <genl>) for every spec in <specs>")
    public static SubLObject all_genl_mtP(final SubLObject spec, final SubLObject v_genls, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_predicate_relation_with_all_p(sbhl_module_vars.get_sbhl_module($$genlMt), spec, v_genls, mt_mt, tv);
    }

    /**
     * (genl-mt-of-all? specs genl) is t iff (genl-mt? spec <genl>) for every spec in <specs>
     */
    @LispMethod(comment = "(genl-mt-of-all? specs genl) is t iff (genl-mt? spec <genl>) for every spec in <specs>")
    public static final SubLObject genl_mt_of_allP_alt(SubLObject specs, SubLObject genl, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_with_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlMt), specs, genl, mt_mt, tv);
    }

    /**
     * (genl-mt-of-all? specs genl) is t iff (genl-mt? spec <genl>) for every spec in <specs>
     */
    @LispMethod(comment = "(genl-mt-of-all? specs genl) is t iff (genl-mt? spec <genl>) for every spec in <specs>")
    public static SubLObject genl_mt_of_allP(final SubLObject specs, final SubLObject genl, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_with_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlMt), specs, genl, mt_mt, tv);
    }

    /**
     * (any-genl-mt-of-any? specs genls) is t iff (genl-mt? spec genl)
     * for some spec in <specs> and some gnel in <genls>
     */
    @LispMethod(comment = "(any-genl-mt-of-any? specs genls) is t iff (genl-mt? spec genl)\r\nfor some spec in <specs> and some gnel in <genls>\n(any-genl-mt-of-any? specs genls) is t iff (genl-mt? spec genl)\nfor some spec in <specs> and some gnel in <genls>")
    public static final SubLObject any_genl_mt_of_anyP_alt(SubLObject specs, SubLObject v_genls, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_predicate_relation_between_any_p(sbhl_module_vars.get_sbhl_module($$genlMt), specs, v_genls, mt_mt, tv);
    }

    /**
     * (any-genl-mt-of-any? specs genls) is t iff (genl-mt? spec genl)
     * for some spec in <specs> and some gnel in <genls>
     */
    @LispMethod(comment = "(any-genl-mt-of-any? specs genls) is t iff (genl-mt? spec genl)\r\nfor some spec in <specs> and some gnel in <genls>\n(any-genl-mt-of-any? specs genls) is t iff (genl-mt? spec genl)\nfor some spec in <specs> and some gnel in <genls>")
    public static SubLObject any_genl_mt_of_anyP(final SubLObject specs, final SubLObject v_genls, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_predicate_relation_between_any_p(sbhl_module_vars.get_sbhl_module($$genlMt), specs, v_genls, mt_mt, tv);
    }

    /**
     * is microtheory <not-genl> not a genl-mt of <mt>?
     * (descending transitive search; expensive)
     */
    @LispMethod(comment = "is microtheory <not-genl> not a genl-mt of <mt>?\r\n(descending transitive search; expensive)\nis microtheory <not-genl> not a genl-mt of <mt>?\n(descending transitive search; expensive)")
    public static final SubLObject not_genl_mtP_alt(SubLObject mt, SubLObject not_genl, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlMt), mt, not_genl, mt_mt, tv);
    }

    /**
     * is microtheory <not-genl> not a genl-mt of <mt>?
     * (descending transitive search; expensive)
     */
    @LispMethod(comment = "is microtheory <not-genl> not a genl-mt of <mt>?\r\n(descending transitive search; expensive)\nis microtheory <not-genl> not a genl-mt of <mt>?\n(descending transitive search; expensive)")
    public static SubLObject not_genl_mtP(final SubLObject mt, final SubLObject not_genl, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlMt), mt, not_genl, mt_mt, tv);
    }

    /**
     * Returns whether microtheory NOT-GENL is not a genl-mt of MT, or arguably should not be a not-genl-mt of MT because (genlMt MT NOT-GENL).
     */
    @LispMethod(comment = "Returns whether microtheory NOT-GENL is not a genl-mt of MT, or arguably should not be a not-genl-mt of MT because (genlMt MT NOT-GENL).")
    public static final SubLObject argue_not_genl_mtP_alt(SubLObject mt, SubLObject not_genl, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_argumentation_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlMt), mt, not_genl, mt_mt, tv);
    }

    /**
     * Returns whether microtheory NOT-GENL is not a genl-mt of MT, or arguably should not be a not-genl-mt of MT because (genlMt MT NOT-GENL).
     */
    @LispMethod(comment = "Returns whether microtheory NOT-GENL is not a genl-mt of MT, or arguably should not be a not-genl-mt of MT because (genlMt MT NOT-GENL).")
    public static SubLObject argue_not_genl_mtP(final SubLObject mt, final SubLObject not_genl, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_argumentation_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlMt), mt, not_genl, mt_mt, tv);
    }

    /**
     * is microtheory <not-genl> not a genl-mt of <mt>?
     * (descending transitive search; expensive)
     */
    @LispMethod(comment = "is microtheory <not-genl> not a genl-mt of <mt>?\r\n(descending transitive search; expensive)\nis microtheory <not-genl> not a genl-mt of <mt>?\n(descending transitive search; expensive)")
    public static final SubLObject not_spec_mtP_alt(SubLObject not_genl, SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return com.cyc.cycjava.cycl.genl_mts.not_genl_mtP(mt, not_genl, mt_mt, tv);
    }

    /**
     * is microtheory <not-genl> not a genl-mt of <mt>?
     * (descending transitive search; expensive)
     */
    @LispMethod(comment = "is microtheory <not-genl> not a genl-mt of <mt>?\r\n(descending transitive search; expensive)\nis microtheory <not-genl> not a genl-mt of <mt>?\n(descending transitive search; expensive)")
    public static SubLObject not_spec_mtP(final SubLObject not_genl, final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return not_genl_mtP(mt, not_genl, mt_mt, tv);
    }

    /**
     * is any microtheory in <not-genl-mts> explicitly not a genl-mt of <mt>?
     * (descending transitive search; expensive)
     */
    @LispMethod(comment = "is any microtheory in <not-genl-mts> explicitly not a genl-mt of <mt>?\r\n(descending transitive search; expensive)\nis any microtheory in <not-genl-mts> explicitly not a genl-mt of <mt>?\n(descending transitive search; expensive)")
    public static final SubLObject not_any_genl_mtP_alt(SubLObject mt, SubLObject not_genl_mts, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module($$genlMt), mt, not_genl_mts, mt_mt, tv);
    }

    /**
     * is any microtheory in <not-genl-mts> explicitly not a genl-mt of <mt>?
     * (descending transitive search; expensive)
     */
    @LispMethod(comment = "is any microtheory in <not-genl-mts> explicitly not a genl-mt of <mt>?\r\n(descending transitive search; expensive)\nis any microtheory in <not-genl-mts> explicitly not a genl-mt of <mt>?\n(descending transitive search; expensive)")
    public static SubLObject not_any_genl_mtP(final SubLObject mt, final SubLObject not_genl_mts, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module($$genlMt), mt, not_genl_mts, mt_mt, tv);
    }

    /**
     * do microtheories <mt1> and <mt2> intersect?
     * (uses only sbhl graphs: their extensions are not searched
     * nor are their sufficient conditions analyzed)
     */
    @LispMethod(comment = "do microtheories <mt1> and <mt2> intersect?\r\n(uses only sbhl graphs: their extensions are not searched\r\nnor are their sufficient conditions analyzed)\ndo microtheories <mt1> and <mt2> intersect?\n(uses only sbhl graphs: their extensions are not searched\nnor are their sufficient conditions analyzed)")
    public static final SubLObject mts_intersectP_alt(SubLObject mt1, SubLObject mt2, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.genl_mts.mts_explicitly_intersectP(mt1, mt2, mt_mt)) || (NIL != negation_mt.not_negation_mtP(mt1, mt2, mt_mt, UNPROVIDED)));
    }

    /**
     * do microtheories <mt1> and <mt2> intersect?
     * (uses only sbhl graphs: their extensions are not searched
     * nor are their sufficient conditions analyzed)
     */
    @LispMethod(comment = "do microtheories <mt1> and <mt2> intersect?\r\n(uses only sbhl graphs: their extensions are not searched\r\nnor are their sufficient conditions analyzed)\ndo microtheories <mt1> and <mt2> intersect?\n(uses only sbhl graphs: their extensions are not searched\nnor are their sufficient conditions analyzed)")
    public static SubLObject mts_intersectP(final SubLObject mt1, final SubLObject mt2, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return makeBoolean((NIL != mts_explicitly_intersectP(mt1, mt2, mt_mt)) || (NIL != negation_mt.not_negation_mtP(mt1, mt2, mt_mt, UNPROVIDED)));
    }

    public static final SubLObject mts_explicitly_intersectP_alt(SubLObject mt1, SubLObject mt2, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.genl_mts.genl_mtP(mt1, mt2, mt_mt, UNPROVIDED)) || (NIL != com.cyc.cycjava.cycl.genl_mts.genl_mtP(mt2, mt1, mt_mt, UNPROVIDED)));
    }

    public static SubLObject mts_explicitly_intersectP(final SubLObject mt1, final SubLObject mt2, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return makeBoolean((NIL != genl_mtP(mt1, mt2, mt_mt, UNPROVIDED)) || (NIL != genl_mtP(mt2, mt1, mt_mt, UNPROVIDED)));
    }

    /**
     * justification of (genlMt <spec> <genl>)
     */
    @LispMethod(comment = "justification of (genlMt <spec> <genl>)")
    public static final SubLObject why_genl_mtP_alt(SubLObject spec, SubLObject genl, SubLObject mt_mt, SubLObject tv, SubLObject behavior) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        if (NIL != hlmt.hlmts_supportedP()) {
            return hlmt_relevance.why_hlmt_visible_p(spec, genl, mt_mt, tv, behavior);
        } else {
            return com.cyc.cycjava.cycl.genl_mts.why_monad_genl_mtP(spec, genl, mt_mt, tv, behavior);
        }
    }

    /**
     * justification of (genlMt <spec> <genl>)
     */
    @LispMethod(comment = "justification of (genlMt <spec> <genl>)")
    public static SubLObject why_genl_mtP(final SubLObject spec, final SubLObject genl, SubLObject mt_mt, SubLObject tv, SubLObject behavior) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        if (NIL != hlmt.hlmts_supportedP()) {
            return hlmt_relevance.why_hlmt_visible_p(spec, genl, mt_mt, tv, behavior);
        }
        return why_monad_genl_mtP(spec, genl, mt_mt, tv, behavior);
    }

    public static final SubLObject why_monad_genl_mtP_alt(SubLObject spec, SubLObject genl, SubLObject mt_mt, SubLObject tv, SubLObject behavior) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = sbhl_search_methods.why_sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlMt), spec, genl, mt_mt, tv, behavior);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject why_monad_genl_mtP(final SubLObject spec, final SubLObject genl, SubLObject mt_mt, SubLObject tv, SubLObject behavior) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = sbhl_search_methods.why_sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlMt), spec, genl, mt_mt, tv, behavior);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject any_just_of_genl_mt_alt(SubLObject spec, SubLObject genl, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.genl_mts.why_genl_mtP(spec, genl, mt_mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject any_just_of_genl_mt(final SubLObject spec, final SubLObject genl, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return why_genl_mtP(spec, genl, mt_mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     * justification of (not (genlMt <spec> <genl>))
     */
    @LispMethod(comment = "justification of (not (genlMt <spec> <genl>))")
    public static final SubLObject why_not_genl_mtP_alt(SubLObject spec, SubLObject genl, SubLObject mt_mt, SubLObject tv, SubLObject behavior) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        return sbhl_search_implied_relations.why_sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlMt), spec, genl, mt_mt, tv, behavior);
    }

    /**
     * justification of (not (genlMt <spec> <genl>))
     */
    @LispMethod(comment = "justification of (not (genlMt <spec> <genl>))")
    public static SubLObject why_not_genl_mtP(final SubLObject spec, final SubLObject genl, SubLObject mt_mt, SubLObject tv, SubLObject behavior) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        return sbhl_search_implied_relations.why_sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlMt), spec, genl, mt_mt, tv, behavior);
    }

    public static final SubLObject any_just_of_not_genl_mt_alt(SubLObject spec, SubLObject genl, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.genl_mts.why_not_genl_mtP(spec, genl, mt_mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject any_just_of_not_genl_mt(final SubLObject spec, final SubLObject genl, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return why_not_genl_mtP(spec, genl, mt_mt, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject clear_all_base_mts_alt() {
        {
            SubLObject cs = $all_base_mts_caching_state$.getGlobalValue();
            if (NIL != cs) {
                caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_all_base_mts() {
        final SubLObject cs = $all_base_mts_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_all_base_mts_alt(SubLObject mt) {
        return caching_state_remove_function_results_with_args($all_base_mts_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_all_base_mts(final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($all_base_mts_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    /**
     * unlike all-genl-mts, this assumes all baseMt assertions are in *mt-mt*
     */
    @LispMethod(comment = "unlike all-genl-mts, this assumes all baseMt assertions are in *mt-mt*")
    public static final SubLObject all_base_mts_internal_alt(SubLObject mt) {
        return com.cyc.cycjava.cycl.genl_mts.all_genl_mts(mt, mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED);
    }

    /**
     * unlike all-genl-mts, this assumes all baseMt assertions are in *mt-mt*
     */
    @LispMethod(comment = "unlike all-genl-mts, this assumes all baseMt assertions are in *mt-mt*")
    public static SubLObject all_base_mts_internal(final SubLObject mt) {
        return all_genl_mts(mt, mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED);
    }

    public static final SubLObject all_base_mts_alt(SubLObject mt) {
        {
            SubLObject caching_state = $all_base_mts_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = create_global_caching_state_for_name(ALL_BASE_MTS, $all_base_mts_caching_state$, NIL, EQL, ONE_INTEGER, $int$1000);
            }
            {
                SubLObject results = caching_state_lookup(caching_state, mt, $kw14$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw14$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.genl_mts.all_base_mts_internal(mt)));
                    caching_state_put(caching_state, mt, results, UNPROVIDED);
                }
                return caching_results(results);
            }
        }
    }

    public static SubLObject all_base_mts(final SubLObject mt) {
        SubLObject caching_state = $all_base_mts_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ALL_BASE_MTS, $all_base_mts_caching_state$, $int$2048, EQL, ONE_INTEGER, $int$1000);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(all_base_mts_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject do_base_mts_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt15);
            mt = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject base_mt = $sym16$BASE_MT;
                return list(CDOLIST, list(base_mt, list(ALL_BASE_MTS, mt)), listS(WITH_MT, base_mt, append(body, NIL)));
            }
        }
    }

    public static SubLObject do_base_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list16);
        mt = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject base_mt = $sym17$BASE_MT;
        return list(CDOLIST, list(base_mt, list(ALL_BASE_MTS, mt)), listS(WITH_MT, base_mt, append(body, NIL)));
    }

    /**
     * the most-specific among microtheories <mts>
     */
    @LispMethod(comment = "the most-specific among microtheories <mts>")
    public static final SubLObject min_mts_alt(SubLObject mts, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != mt_vars.$core_mt_optimization_enabledP$.getDynamicValue(thread)) {
                mts = mt_vars.minimize_mts_wrt_core(mts);
            }
            if (NIL != $min_mts_2_enabledP$.getDynamicValue(thread)) {
                if (NIL != list_utilities.doubletonP(mts)) {
                    return com.cyc.cycjava.cycl.genl_mts.min_mts_2(mts.first(), second(mts), mt_mt);
                }
            }
            return sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mts, mt_mt, UNPROVIDED);
        }
    }

    @LispMethod(comment = "the most-specific among microtheories <mts>")
    public static SubLObject min_mts(SubLObject mts, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mt_vars.$core_mt_optimization_enabledP$.getDynamicValue(thread)) {
            mts = mt_vars.minimize_mts_wrt_core(mts);
        }
        if ((NIL != $min_mts_2_enabledP$.getDynamicValue(thread)) && (NIL != list_utilities.doubletonP(mts))) {
            return min_mts_2(mts.first(), second(mts), mt_mt);
        }
        return sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mts, mt_mt, UNPROVIDED);
    }

    /**
     * version of min-mts called inside max-floor-mts
     */
    @LispMethod(comment = "version of min-mts called inside max-floor-mts")
    public static final SubLObject min_mts_before_floors_alt(SubLObject mts, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.genl_mts.min_mts(mts, mt_mt);
    }

    @LispMethod(comment = "version of min-mts called inside max-floor-mts")
    public static SubLObject min_mts_before_floors(final SubLObject mts, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return min_mts(mts, mt_mt);
    }

    /**
     * special case of MIN-MTS for 2 microtheories
     */
    @LispMethod(comment = "special case of MIN-MTS for 2 microtheories")
    public static final SubLObject min_mts_2_alt(SubLObject mt_1, SubLObject mt_2, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (NIL != com.cyc.cycjava.cycl.genl_mts.genl_mtP(mt_1, mt_2, mt_mt, UNPROVIDED)) {
            if (NIL != com.cyc.cycjava.cycl.genl_mts.genl_mtP(mt_2, mt_1, mt_mt, UNPROVIDED)) {
                return list(mt_1, mt_2);
            } else {
                return list(mt_1);
            }
        } else {
            if (NIL != com.cyc.cycjava.cycl.genl_mts.genl_mtP(mt_2, mt_1, mt_mt, UNPROVIDED)) {
                return list(mt_2);
            } else {
                return list(mt_1, mt_2);
            }
        }
    }

    @LispMethod(comment = "special case of MIN-MTS for 2 microtheories")
    public static SubLObject min_mts_2(final SubLObject mt_1, final SubLObject mt_2, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (NIL != genl_mtP(mt_1, mt_2, mt_mt, UNPROVIDED)) {
            if (NIL != genl_mtP(mt_2, mt_1, mt_mt, UNPROVIDED)) {
                return list(mt_1, mt_2);
            }
            return list(mt_1);
        } else {
            if (NIL != genl_mtP(mt_2, mt_1, mt_mt, UNPROVIDED)) {
                return list(mt_2);
            }
            return list(mt_1, mt_2);
        }
    }

    /**
     * the most-general among microtheories <mts>
     */
    @LispMethod(comment = "the most-general among microtheories <mts>")
    public static final SubLObject max_mts_alt(SubLObject mts, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != mt_vars.$core_mt_optimization_enabledP$.getDynamicValue(thread)) {
                mts = mt_vars.maximize_mts_wrt_core(mts);
            }
            return sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mts, mt_mt, UNPROVIDED, UNPROVIDED);
        }
    }

    @LispMethod(comment = "the most-general among microtheories <mts>")
    public static SubLObject max_mts(SubLObject mts, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mt_vars.$core_mt_optimization_enabledP$.getDynamicValue(thread)) {
            mts = mt_vars.maximize_mts_wrt_core(mts);
        }
        return sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mts, mt_mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     * version of max-mts called inside max-ceiling-mts
     */
    @LispMethod(comment = "version of max-mts called inside max-ceiling-mts")
    public static final SubLObject max_mts_before_ceiling_alt(SubLObject mts, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != mt_vars.$core_mt_optimization_enabledP$.getDynamicValue(thread)) {
                mts = mt_vars.maximize_mts_wrt_core(mts);
            }
            return list_utilities.fast_delete_duplicates(mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    @LispMethod(comment = "version of max-mts called inside max-ceiling-mts")
    public static SubLObject max_mts_before_ceiling(SubLObject mts, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mt_vars.$core_mt_optimization_enabledP$.getDynamicValue(thread)) {
            mts = mt_vars.maximize_mts_wrt_core(mts);
        }
        return list_utilities.fast_delete_duplicates(mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * the most specific common generalizations among microtheories <mts>
     * (if <candidates> is non-nil, then result is a subset of <candidates>)
     */
    @LispMethod(comment = "the most specific common generalizations among microtheories <mts>\r\n(if <candidates> is non-nil, then result is a subset of <candidates>)\nthe most specific common generalizations among microtheories <mts>\n(if <candidates> is non-nil, then result is a subset of <candidates>)")
    public static final SubLObject min_ceiling_mts_alt(SubLObject mts, SubLObject candidates, SubLObject mt_mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        mts = com.cyc.cycjava.cycl.genl_mts.max_mts_before_ceiling(mts, mt_mt);
        return sbhl_search_methods.sbhl_min_ceilings(sbhl_module_vars.get_sbhl_module($$genlMt), mts, candidates, mt_mt, UNPROVIDED);
    }

    @LispMethod(comment = "the most specific common generalizations among microtheories <mts>\r\n(if <candidates> is non-nil, then result is a subset of <candidates>)\nthe most specific common generalizations among microtheories <mts>\n(if <candidates> is non-nil, then result is a subset of <candidates>)")
    public static SubLObject min_ceiling_mts(SubLObject mts, SubLObject candidates, SubLObject mt_mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        mts = max_mts_before_ceiling(mts, mt_mt);
        return sbhl_search_methods.sbhl_min_ceilings(sbhl_module_vars.get_sbhl_module($$genlMt), mts, candidates, mt_mt, UNPROVIDED);
    }

    /**
     * the most general common specializations among microtheories <mts>
     * (if <candidates> is non-nil, then result is a subset of <candidates>)
     */
    @LispMethod(comment = "the most general common specializations among microtheories <mts>\r\n(if <candidates> is non-nil, then result is a subset of <candidates>)\nthe most general common specializations among microtheories <mts>\n(if <candidates> is non-nil, then result is a subset of <candidates>)")
    public static final SubLObject max_floor_mts_alt(SubLObject mts, SubLObject candidates, SubLObject mt_mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return NIL != hlmt.hlmts_supportedP() ? ((SubLObject) (com.cyc.cycjava.cycl.genl_mts.max_floor_hlmts(mts, candidates, mt_mt))) : com.cyc.cycjava.cycl.genl_mts.max_floor_monad_mts(mts, candidates, mt_mt);
    }

    @LispMethod(comment = "the most general common specializations among microtheories <mts>\r\n(if <candidates> is non-nil, then result is a subset of <candidates>)\nthe most general common specializations among microtheories <mts>\n(if <candidates> is non-nil, then result is a subset of <candidates>)")
    public static SubLObject max_floor_mts(final SubLObject mts, SubLObject candidates, SubLObject mt_mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == mts) {
            return NIL;
        }
        final SubLObject placement_mts = (NIL != hlmt.hlmts_supportedP()) ? max_floor_hlmts(mts, candidates, mt_mt) : max_floor_monad_mts(mts, candidates, mt_mt);
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    if (((NIL == $suppress_max_floor_mts_explosion_warning$.getDynamicValue(thread)) && $max_floor_mts_explosion_warning_min_placements_mt_count$.getDynamicValue(thread).isNumber()) && length(placement_mts).numG($max_floor_mts_explosion_warning_min_placements_mt_count$.getDynamicValue(thread))) {
                        max_floor_mts_explosion_warning(kb_utilities.sort_terms(copy_list(mts), NIL, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), kb_utilities.sort_terms(copy_list(placement_mts), NIL, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
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
        return placement_mts;
    }

    public static SubLObject max_floor_mts_explosion_warning_internal(final SubLObject mts, final SubLObject placement_mts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Errors.warn($str23$__Forward_inference_mt_placement_, new SubLObject[]{ length(mts), length(placement_mts), list_utilities.quotify(cycl_utilities.expression_transform(mts, NART_P, NART_EL_FORMULA, UNPROVIDED, UNPROVIDED)), NIL != forward.current_forward_inference_gaf() ? assertion_handles.assertion_id(forward.current_forward_inference_gaf()) : $str26$, NIL != forward.current_forward_inference_rule() ? assertion_handles.assertion_id(forward.current_forward_inference_rule()) : $str26$, NIL != $use_transcriptP$.getDynamicValue(thread) ? $str26$ : format(NIL, $str27$____KB__A, operation_communication.kb_version_string()) });
        return NIL;
    }

    public static SubLObject max_floor_mts_explosion_warning(final SubLObject mts, final SubLObject placement_mts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return max_floor_mts_explosion_warning_internal(mts, placement_mts);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MAX_FLOOR_MTS_EXPLOSION_WARNING, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MAX_FLOOR_MTS_EXPLOSION_WARNING, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, MAX_FLOOR_MTS_EXPLOSION_WARNING, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(mts, placement_mts);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (mts.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && placement_mts.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(max_floor_mts_explosion_warning_internal(mts, placement_mts)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(mts, placement_mts));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject show_max_floor_mts_info(SubLObject mts, SubLObject gaf_assertion_id, SubLObject rule_assertion_id, SubLObject repropagateP) {
        if (gaf_assertion_id == UNPROVIDED) {
            gaf_assertion_id = NIL;
        }
        if (rule_assertion_id == UNPROVIDED) {
            rule_assertion_id = NIL;
        }
        if (repropagateP == UNPROVIDED) {
            repropagateP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $suppress_max_floor_mts_explosion_warning$.currentBinding(thread);
        try {
            $suppress_max_floor_mts_explosion_warning$.bind(T, thread);
            final SubLObject gaf = (NIL != gaf_assertion_id) ? assertion_handles.find_assertion_by_id(gaf_assertion_id) : NIL;
            final SubLObject rule = (NIL != rule_assertion_id) ? assertion_handles.find_assertion_by_id(rule_assertion_id) : NIL;
            if (NIL != gaf) {
                format(T, $str28$__gaf__);
                format_cycl_expression.format_cycl_expression(uncanonicalizer.assertion_el_ist_formula(gaf), UNPROVIDED, UNPROVIDED);
            }
            if (NIL != rule) {
                format(T, $str29$__rule__);
                format_cycl_expression.format_cycl_expression(uncanonicalizer.assertion_el_ist_formula(rule), UNPROVIDED, UNPROVIDED);
            }
            mts = narts_high.nart_substitute(mts);
            SubLObject cdolist_list_var = Sort.sort(copy_list(mts), $sym31$GENERALITY_ESTIMATE_, UNPROVIDED);
            SubLObject mt = NIL;
            mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str30$___S_____A__, mt, cardinality_estimates.generality_estimate(mt));
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            } 
            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str32$_______);
            cdolist_list_var = Sort.sort(max_floor_mts(mts, UNPROVIDED, UNPROVIDED), $sym31$GENERALITY_ESTIMATE_, UNPROVIDED);
            mt = NIL;
            mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str30$___S_____A__, mt, cardinality_estimates.generality_estimate(mt));
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            } 
            if (NIL != repropagateP) {
                final SubLObject str = $$$Repropagaing;
                final SubLObject _prev_bind_0_$1 = $progress_start_time$.currentBinding(thread);
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
                    forward.repropagate_forward_gaf_wrt_rule(gaf, rule);
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$1, thread);
                }
            }
            return NIL;
        } finally {
            $suppress_max_floor_mts_explosion_warning$.rebind(_prev_bind_0, thread);
        }
    }

    public static final SubLObject max_floor_hlmts_alt(SubLObject mts, SubLObject candidates, SubLObject mt_mt) {
        return NIL != list_utilities.every_in_list($sym19$ATEMPORAL_HLMT_, mts, UNPROVIDED) ? ((SubLObject) (com.cyc.cycjava.cycl.genl_mts.max_floor_monad_mts(Mapping.mapcar(HLMT_MONAD_MT, mts), candidates, mt_mt))) : hlmt_relevance.max_floor_polyad_mts(mts, candidates, mt_mt, NIL);
    }

    public static SubLObject max_floor_hlmts(final SubLObject mts, final SubLObject candidates, final SubLObject mt_mt) {
        return NIL != list_utilities.every_in_list($sym35$ATEMPORAL_HLMT_, mts, UNPROVIDED) ? max_floor_monad_mts(Mapping.mapcar(HLMT_MONAD_MT, mts), candidates, mt_mt) : hlmt_relevance.max_floor_polyad_mts(mts, candidates, mt_mt, NIL);
    }

    public static final SubLObject max_floor_monad_mts_internal_alt(SubLObject mts, SubLObject candidates, SubLObject mt_mt) {
        return NIL != mts ? ((SubLObject) (sbhl_search_methods.sbhl_max_floors(sbhl_module_vars.get_sbhl_module($$genlMt), com.cyc.cycjava.cycl.genl_mts.min_mts_before_floors(mts, mt_mt), candidates, mt_mt, UNPROVIDED, UNPROVIDED))) : NIL;
    }

    public static SubLObject max_floor_monad_mts_internal(final SubLObject mts, final SubLObject candidates, final SubLObject mt_mt) {
        return NIL != mts ? sbhl_search_methods.sbhl_max_floors(sbhl_module_vars.get_sbhl_module($$genlMt), min_mts_before_floors(mts, mt_mt), candidates, mt_mt, UNPROVIDED, UNPROVIDED) : NIL;
    }

    public static final SubLObject max_floor_monad_mts_alt(SubLObject mts, SubLObject candidates, SubLObject mt_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = $memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.genl_mts.max_floor_monad_mts_internal(mts, candidates, mt_mt);
                }
                caching_state = memoization_state_lookup(v_memoization_state, MAX_FLOOR_MONAD_MTS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = create_caching_state(memoization_state_lock(v_memoization_state), MAX_FLOOR_MONAD_MTS, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state_put(v_memoization_state, MAX_FLOOR_MONAD_MTS, caching_state);
                }
                {
                    SubLObject sxhash = sxhash_calc_3(mts, candidates, mt_mt);
                    SubLObject collisions = caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw14$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (mts.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (candidates.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_mt.equal(cached_args.first())) {
                                                return caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.genl_mts.max_floor_monad_mts_internal(mts, candidates, mt_mt)));
                        caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(mts, candidates, mt_mt));
                        return caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject max_floor_monad_mts(final SubLObject mts, final SubLObject candidates, final SubLObject mt_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return max_floor_monad_mts_internal(mts, candidates, mt_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MAX_FLOOR_MONAD_MTS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MAX_FLOOR_MONAD_MTS, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, MAX_FLOOR_MONAD_MTS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(mts, candidates, mt_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (mts.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (candidates.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(max_floor_monad_mts_internal(mts, candidates, mt_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(mts, candidates, mt_mt));
        return memoization_state.caching_results(results3);
    }

    /**
     * the most general common specializations among microtheories <mt> such that only one node from any given cycle is returned. if CANDIDATES is non-nil, the result is a subset of CANDIDATES.
     */
    @LispMethod(comment = "the most general common specializations among microtheories <mt> such that only one node from any given cycle is returned. if CANDIDATES is non-nil, the result is a subset of CANDIDATES.")
    public static final SubLObject max_floor_mts_with_cycles_pruned_alt(SubLObject mts, SubLObject candidates, SubLObject mt_mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return NIL != hlmt.hlmts_supportedP() ? ((SubLObject) (com.cyc.cycjava.cycl.genl_mts.max_floor_hlmts_with_cycles_pruned(mts, candidates, mt_mt))) : com.cyc.cycjava.cycl.genl_mts.max_floor_monad_mts_with_cycles_pruned(mts, candidates, mt_mt);
    }

    /**
     * the most general common specializations among microtheories <mt> such that only one node from any given cycle is returned. if CANDIDATES is non-nil, the result is a subset of CANDIDATES.
     */
    @LispMethod(comment = "the most general common specializations among microtheories <mt> such that only one node from any given cycle is returned. if CANDIDATES is non-nil, the result is a subset of CANDIDATES.")
    public static SubLObject max_floor_mts_with_cycles_pruned(final SubLObject mts, SubLObject candidates, SubLObject mt_mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return NIL != hlmt.hlmts_supportedP() ? max_floor_hlmts_with_cycles_pruned(mts, candidates, mt_mt) : max_floor_monad_mts_with_cycles_pruned(mts, candidates, mt_mt);
    }

    public static final SubLObject max_floor_hlmts_with_cycles_pruned_alt(SubLObject mts, SubLObject candidates, SubLObject mt_mt) {
        return NIL != list_utilities.every_in_list($sym19$ATEMPORAL_HLMT_, mts, UNPROVIDED) ? ((SubLObject) (com.cyc.cycjava.cycl.genl_mts.max_floor_monad_mts_with_cycles_pruned(Mapping.mapcar(HLMT_MONAD_MT, mts), candidates, mt_mt))) : hlmt_relevance.max_floor_polyad_mts(mts, candidates, mt_mt, NIL);
    }

    public static SubLObject max_floor_hlmts_with_cycles_pruned(final SubLObject mts, final SubLObject candidates, final SubLObject mt_mt) {
        return NIL != list_utilities.every_in_list($sym35$ATEMPORAL_HLMT_, mts, UNPROVIDED) ? max_floor_monad_mts_with_cycles_pruned(Mapping.mapcar(HLMT_MONAD_MT, mts), candidates, mt_mt) : hlmt_relevance.max_floor_polyad_mts(mts, candidates, mt_mt, NIL);
    }

    public static final SubLObject max_floor_monad_mts_with_cycles_pruned_alt(SubLObject mts, SubLObject candidates, SubLObject mt_mt) {
        return NIL != mts ? ((SubLObject) (sbhl_search_methods.sbhl_max_floors_pruning_cycles(sbhl_module_vars.get_sbhl_module($$genlMt), com.cyc.cycjava.cycl.genl_mts.min_mts_before_floors(mts, mt_mt), candidates, mt_mt, UNPROVIDED))) : NIL;
    }

    public static SubLObject max_floor_monad_mts_with_cycles_pruned(final SubLObject mts, final SubLObject candidates, final SubLObject mt_mt) {
        return NIL != mts ? sbhl_search_methods.sbhl_max_floors_pruning_cycles(sbhl_module_vars.get_sbhl_module($$genlMt), min_mts_before_floors(mts, mt_mt), candidates, mt_mt, UNPROVIDED) : NIL;
    }

    /**
     * MT-SETS is a list of lists of mts.  They indicate the sets of mts of the various
     * paths through an SBHL module for an assertion to be true.  This function returns
     * those mts in which it is appropriate to view such an assertion as 'residing'
     * for forward inference and source purposes.
     */
    @LispMethod(comment = "MT-SETS is a list of lists of mts.  They indicate the sets of mts of the various\r\npaths through an SBHL module for an assertion to be true.  This function returns\r\nthose mts in which it is appropriate to view such an assertion as \'residing\'\r\nfor forward inference and source purposes.\nMT-SETS is a list of lists of mts.  They indicate the sets of mts of the various\npaths through an SBHL module for an assertion to be true.  This function returns\nthose mts in which it is appropriate to view such an assertion as \'residing\'\nfor forward inference and source purposes.")
    public static final SubLObject max_floor_mts_from_mt_sets_alt(SubLObject mt_sets) {
        return com.cyc.cycjava.cycl.genl_mts.max_mts(creduce(symbol_function(UNION), delete(NIL, Mapping.mapcar(symbol_function(MAX_FLOOR_MTS), mt_sets), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), ZERO_INTEGER, NIL, NIL), UNPROVIDED);
    }

    /**
     * MT-SETS is a list of lists of mts.  They indicate the sets of mts of the various
     * paths through an SBHL module for an assertion to be true.  This function returns
     * those mts in which it is appropriate to view such an assertion as 'residing'
     * for forward inference and source purposes.
     */
    @LispMethod(comment = "MT-SETS is a list of lists of mts.  They indicate the sets of mts of the various\r\npaths through an SBHL module for an assertion to be true.  This function returns\r\nthose mts in which it is appropriate to view such an assertion as \'residing\'\r\nfor forward inference and source purposes.\nMT-SETS is a list of lists of mts.  They indicate the sets of mts of the various\npaths through an SBHL module for an assertion to be true.  This function returns\nthose mts in which it is appropriate to view such an assertion as \'residing\'\nfor forward inference and source purposes.")
    public static SubLObject max_floor_mts_from_mt_sets(final SubLObject mt_sets) {
        return max_mts(creduce(symbol_function(UNION), delete(NIL, Mapping.mapcar(symbol_function(MAX_FLOOR_MTS), mt_sets), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), ZERO_INTEGER, NIL, NIL), UNPROVIDED);
    }

    public static final SubLObject clear_cached_max_floor_mts_from_mt_sets_alt() {
        {
            SubLObject cs = $cached_max_floor_mts_from_mt_sets_caching_state$.getGlobalValue();
            if (NIL != cs) {
                caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_cached_max_floor_mts_from_mt_sets() {
        final SubLObject cs = $cached_max_floor_mts_from_mt_sets_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_cached_max_floor_mts_from_mt_sets_alt(SubLObject mt_sets) {
        return caching_state_remove_function_results_with_args($cached_max_floor_mts_from_mt_sets_caching_state$.getGlobalValue(), list(mt_sets), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_cached_max_floor_mts_from_mt_sets(final SubLObject mt_sets) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_max_floor_mts_from_mt_sets_caching_state$.getGlobalValue(), list(mt_sets), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cached_max_floor_mts_from_mt_sets_internal_alt(SubLObject mt_sets) {
        return com.cyc.cycjava.cycl.genl_mts.max_floor_mts_from_mt_sets(mt_sets);
    }

    public static SubLObject cached_max_floor_mts_from_mt_sets_internal(final SubLObject mt_sets) {
        return max_floor_mts_from_mt_sets(mt_sets);
    }

    public static final SubLObject cached_max_floor_mts_from_mt_sets_alt(SubLObject mt_sets) {
        {
            SubLObject caching_state = $cached_max_floor_mts_from_mt_sets_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = create_global_caching_state_for_name(CACHED_MAX_FLOOR_MTS_FROM_MT_SETS, $cached_max_floor_mts_from_mt_sets_caching_state$, NIL, EQUAL, ONE_INTEGER, $int$10000);
            }
            {
                SubLObject results = caching_state_lookup(caching_state, mt_sets, $kw14$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw14$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.genl_mts.cached_max_floor_mts_from_mt_sets_internal(mt_sets)));
                    caching_state_put(caching_state, mt_sets, results, UNPROVIDED);
                }
                return caching_results(results);
            }
        }
    }

    public static SubLObject cached_max_floor_mts_from_mt_sets(final SubLObject mt_sets) {
        SubLObject caching_state = $cached_max_floor_mts_from_mt_sets_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_MAX_FLOOR_MTS_FROM_MT_SETS, $cached_max_floor_mts_from_mt_sets_caching_state$, $int$10000, EQUAL, ONE_INTEGER, $int$10000);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt_sets, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_max_floor_mts_from_mt_sets_internal(mt_sets)));
            memoization_state.caching_state_put(caching_state, mt_sets, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * what minimal sets of mts are associated with
     * genlMt paths from SPEC-MT to GENL-MT?
     */
    @LispMethod(comment = "what minimal sets of mts are associated with\r\ngenlMt paths from SPEC-MT to GENL-MT?\nwhat minimal sets of mts are associated with\ngenlMt paths from SPEC-MT to GENL-MT?")
    public static final SubLObject max_floor_mts_of_genl_mt_paths_alt(SubLObject spec_mt, SubLObject genl_mt) {
        if (NIL != com.cyc.cycjava.cycl.genl_mts.genl_mtP(spec_mt, genl_mt, UNPROVIDED, UNPROVIDED)) {
            return list(mt_vars.$mt_mt$.getGlobalValue());
        }
        return NIL;
    }

    /**
     * what minimal sets of mts are associated with
     * genlMt paths from SPEC-MT to GENL-MT?
     */
    @LispMethod(comment = "what minimal sets of mts are associated with\r\ngenlMt paths from SPEC-MT to GENL-MT?\nwhat minimal sets of mts are associated with\ngenlMt paths from SPEC-MT to GENL-MT?")
    public static SubLObject max_floor_mts_of_genl_mt_paths(final SubLObject spec_mt, final SubLObject genl_mt) {
        if (NIL != genl_mtP(spec_mt, genl_mt, UNPROVIDED, UNPROVIDED)) {
            return list(mt_vars.$mt_mt$.getGlobalValue());
        }
        return NIL;
    }

    /**
     *
     *
     * @return listp; the microtheories in which MT has genl-mt assertions.
     */
    @LispMethod(comment = "@return listp; the microtheories in which MT has genl-mt assertions.")
    public static final SubLObject genl_mt_mts_alt(SubLObject mt) {
        return kb_accessors.pred_mts(mt, $$genlMt, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the microtheories in which MT has genl-mt assertions.
     */
    @LispMethod(comment = "@return listp; the microtheories in which MT has genl-mt assertions.")
    public static SubLObject genl_mt_mts(final SubLObject mt) {
        return kb_accessors.pred_mts(mt, $$genlMt, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp; whether MT has any asserted true genl-mt links in MT-MT / *mt*.
     */
    @LispMethod(comment = "@return booleanp; whether MT has any asserted true genl-mt links in MT-MT / *mt*.")
    public static final SubLObject asserted_genl_mtsP_alt(SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_any_asserted_true_links(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return booleanp; whether MT has any asserted true genl-mt links in MT-MT / *mt*.
     */
    @LispMethod(comment = "@return booleanp; whether MT has any asserted true genl-mt links in MT-MT / *mt*.")
    public static SubLObject asserted_genl_mtsP(final SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_any_asserted_true_links(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return listp; the asserted true genl-mt links for MT in MT-MT / *mt*
     */
    @LispMethod(comment = "@return listp; the asserted true genl-mt links for MT in MT-MT / *mt*")
    public static final SubLObject asserted_genl_mts_alt(SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return listp; the asserted true genl-mt links for MT in MT-MT / *mt*
     */
    @LispMethod(comment = "@return listp; the asserted true genl-mt links for MT in MT-MT / *mt*")
    public static SubLObject asserted_genl_mts(final SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return list of hlmt-p; those mts for which asserted assertions exist directly stating them to be genlMts of MT.
     */
    @LispMethod(comment = "@return list of hlmt-p; those mts for which asserted assertions exist directly stating them to be genlMts of MT.")
    public static final SubLObject genl_mts_from_asserted_assertions_alt(SubLObject mt) {
        {
            SubLObject v_genl_mts = NIL;
            SubLObject pred_var = $$genlMt;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(mt, ONE_INTEGER, pred_var)) {
                {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(mt, ONE_INTEGER, pred_var);
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
                                            SubLObject done_var_1 = NIL;
                                            SubLObject token_var_2 = NIL;
                                            while (NIL == done_var_1) {
                                                {
                                                    SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                    SubLObject valid_3 = makeBoolean(token_var_2 != gaf);
                                                    if (NIL != valid_3) {
                                                        if (NIL != assertions_high.asserted_assertionP(gaf)) {
                                                            v_genl_mts = cons(assertions_high.gaf_arg2(gaf), v_genl_mts);
                                                        }
                                                    }
                                                    done_var_1 = makeBoolean(NIL == valid_3);
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
            return nreverse(v_genl_mts);
        }
    }

    /**
     *
     *
     * @return list of hlmt-p; those mts for which asserted assertions exist directly stating them to be genlMts of MT.
     */
    @LispMethod(comment = "@return list of hlmt-p; those mts for which asserted assertions exist directly stating them to be genlMts of MT.")
    public static SubLObject genl_mts_from_asserted_assertions(final SubLObject mt) {
        SubLObject v_genl_mts = NIL;
        final SubLObject pred_var = $$genlMt;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(mt, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(mt, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$2 = NIL;
                        final SubLObject token_var_$3 = NIL;
                        while (NIL == done_var_$2) {
                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                            final SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(gaf));
                            if ((NIL != valid_$4) && (NIL != assertions_high.asserted_assertionP(gaf))) {
                                v_genl_mts = cons(assertions_high.gaf_arg2(gaf), v_genl_mts);
                            }
                            done_var_$2 = makeBoolean(NIL == valid_$4);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return nreverse(v_genl_mts);
    }

    /**
     *
     *
     * @return listp; the asserted false genl-mt links for MT in MT-MT / *mt*
     */
    @LispMethod(comment = "@return listp; the asserted false genl-mt links for MT in MT-MT / *mt*")
    public static final SubLObject asserted_not_genl_mts_alt(SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return listp; the asserted false genl-mt links for MT in MT-MT / *mt*
     */
    @LispMethod(comment = "@return listp; the asserted false genl-mt links for MT in MT-MT / *mt*")
    public static SubLObject asserted_not_genl_mts(final SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return listp; the supported true genl-mt links for MT in MT-MT / *mt*
     */
    @LispMethod(comment = "@return listp; the supported true genl-mt links for MT in MT-MT / *mt*")
    public static final SubLObject supported_genl_mts_alt(SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return listp; the supported true genl-mt links for MT in MT-MT / *mt*
     */
    @LispMethod(comment = "@return listp; the supported true genl-mt links for MT in MT-MT / *mt*")
    public static SubLObject supported_genl_mts(final SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return listp; the supported false genl-mt links for MT in MT-MT / *mt*
     */
    @LispMethod(comment = "@return listp; the supported false genl-mt links for MT in MT-MT / *mt*")
    public static final SubLObject supported_not_genl_mts_alt(SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return listp; the supported false genl-mt links for MT in MT-MT / *mt*
     */
    @LispMethod(comment = "@return listp; the supported false genl-mt links for MT in MT-MT / *mt*")
    public static SubLObject supported_not_genl_mts(final SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt);
    }

    public static SubLObject asserted_spec_mtsP(final SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_any_asserted_true_inverse_links(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return listp; the asserted true spec-mt links for MT in MT-MT / *mt*
     */
    @LispMethod(comment = "@return listp; the asserted true spec-mt links for MT in MT-MT / *mt*")
    public static final SubLObject asserted_spec_mts_alt(SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_inverse_links(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return listp; the asserted true spec-mt links for MT in MT-MT / *mt*
     */
    @LispMethod(comment = "@return listp; the asserted true spec-mt links for MT in MT-MT / *mt*")
    public static SubLObject asserted_spec_mts(final SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_inverse_links(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return listp; the asserted false spec-mt links for MT in MT-MT / *mt*
     */
    @LispMethod(comment = "@return listp; the asserted false spec-mt links for MT in MT-MT / *mt*")
    public static final SubLObject asserted_not_spec_mts_alt(SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_inverse_links(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return listp; the asserted false spec-mt links for MT in MT-MT / *mt*
     */
    @LispMethod(comment = "@return listp; the asserted false spec-mt links for MT in MT-MT / *mt*")
    public static SubLObject asserted_not_spec_mts(final SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_inverse_links(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return listp; the supported true spec-mt links for MT in MT-MT / *mt*
     */
    @LispMethod(comment = "@return listp; the supported true spec-mt links for MT in MT-MT / *mt*")
    public static final SubLObject supported_spec_mts_alt(SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_inverse_links(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return listp; the supported true spec-mt links for MT in MT-MT / *mt*
     */
    @LispMethod(comment = "@return listp; the supported true spec-mt links for MT in MT-MT / *mt*")
    public static SubLObject supported_spec_mts(final SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_inverse_links(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return listp; the supported false spec-mt links for MT in MT-MT / *mt*
     */
    @LispMethod(comment = "@return listp; the supported false spec-mt links for MT in MT-MT / *mt*")
    public static final SubLObject supported_not_spec_mts_alt(SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_inverse_links(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return listp; the supported false spec-mt links for MT in MT-MT / *mt*
     */
    @LispMethod(comment = "@return listp; the supported false spec-mt links for MT in MT-MT / *mt*")
    public static SubLObject supported_not_spec_mts(final SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_inverse_links(sbhl_module_vars.get_sbhl_module($$genlMt), mt, mt_mt);
    }

    public static SubLObject coextensional_mts(final SubLObject mt) {
        assert NIL != hlmt.possibly_hlmt_p(mt) : "! hlmt.possibly_hlmt_p(mt) " + ("hlmt.possibly_hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.possibly_hlmt_p(mt) ") + mt;
        final SubLObject v_genl_mts = all_genl_mts(mt, UNPROVIDED, UNPROVIDED);
        final SubLObject spec_mts = all_spec_mts(mt, UNPROVIDED, UNPROVIDED);
        return kb_utilities.sort_terms(keyhash_utilities.fast_intersection(v_genl_mts, spec_mts, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject all_mt_loops(SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_loop_set = set.new_set(symbol_function(EQ), UNPROVIDED);
        final SubLObject monad_mts = isa.all_instances_in_all_mts($$Microtheory);
        SubLObject equivalence_classes = NIL;
        final SubLObject preferred_mt_map = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
        SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(SIX_INTEGER);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
            try {
                final SubLObject _prev_bind_0_$5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$6 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt_vars.$mt_mt$.getGlobalValue(), thread);
                    final SubLObject list_var = monad_mts;
                    final SubLObject _prev_bind_0_$6 = $progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$7 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$9 = $progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $progress_note$.bind($$$Identifying_MTs_in_loops, thread);
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
                            SubLObject monad_mt = NIL;
                            monad_mt = csome_list_var.first();
                            while (NIL != csome_list_var) {
                                if (NIL != forts.fort_p(monad_mt)) {
                                    final SubLObject monad_genl_card = cardinality_estimates.genl_cardinality(monad_mt);
                                    final SubLObject monad_spec_card = cardinality_estimates.spec_cardinality(monad_mt);
                                    final SubLObject direct_genl_mts = genl_mts(monad_mt, UNPROVIDED, UNPROVIDED);
                                    SubLObject loop_witness_mt = NIL;
                                    if (NIL == loop_witness_mt) {
                                        SubLObject csome_list_var_$10 = direct_genl_mts;
                                        SubLObject candidate_mt = NIL;
                                        candidate_mt = csome_list_var_$10.first();
                                        while ((NIL == loop_witness_mt) && (NIL != csome_list_var_$10)) {
                                            if (NIL != forts.fort_p(candidate_mt)) {
                                                final SubLObject candidate_genl_card = cardinality_estimates.genl_cardinality(candidate_mt);
                                                final SubLObject candidate_spec_card = cardinality_estimates.spec_cardinality(candidate_mt);
                                                if ((monad_genl_card.numE(candidate_genl_card) && monad_spec_card.numE(candidate_spec_card)) && (NIL != genl_mtP(candidate_mt, monad_mt, UNPROVIDED, UNPROVIDED))) {
                                                    if (NIL != verboseP) {
                                                        Errors.warn($str49$_S, monad_mt);
                                                    }
                                                    loop_witness_mt = candidate_mt;
                                                    set.set_add(monad_mt, mt_loop_set);
                                                }
                                            }
                                            csome_list_var_$10 = csome_list_var_$10.rest();
                                            candidate_mt = csome_list_var_$10.first();
                                        } 
                                    }
                                }
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                monad_mt = csome_list_var.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        $progress_sofar$.rebind(_prev_bind_4, thread);
                        $progress_total$.rebind(_prev_bind_2_$9, thread);
                        $progress_start_time$.rebind(_prev_bind_1_$7, thread);
                        $progress_note$.rebind(_prev_bind_0_$6, thread);
                    }
                    SubLObject sofar_var = ZERO_INTEGER;
                    final SubLObject total_var = set.set_size(mt_loop_set);
                    final SubLObject _prev_bind_0_$8 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$8 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$10 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($$$Identifying_MT_Loop_Members);
                            final SubLObject set_contents_var = set.do_set_internal(mt_loop_set);
                            SubLObject basis_object;
                            SubLObject state;
                            SubLObject mt;
                            SubLObject equivalent_mts;
                            SubLObject current;
                            SubLObject datum;
                            SubLObject preferred_mt;
                            SubLObject dispreferred_mts;
                            SubLObject cdolist_list_var;
                            SubLObject dispreferred_mt;
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                mt = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, mt)) {
                                    sofar_var = add(sofar_var, ONE_INTEGER);
                                    note_percent_progress(sofar_var, total_var);
                                    if (NIL == dictionary.dictionary_lookup(preferred_mt_map, mt, UNPROVIDED)) {
                                        equivalent_mts = coextensional_mts(mt);
                                        if (NIL != verboseP) {
                                            Errors.warn($str51$length__S_loop____S, length(equivalent_mts), equivalent_mts);
                                        }
                                        equivalence_classes = cons(equivalent_mts, equivalence_classes);
                                        datum = current = equivalent_mts;
                                        preferred_mt = NIL;
                                        destructuring_bind_must_consp(current, datum, $list52);
                                        preferred_mt = current.first();
                                        current = dispreferred_mts = current.rest();
                                        dictionary.dictionary_enter(preferred_mt_map, preferred_mt, preferred_mt);
                                        cdolist_list_var = dispreferred_mts;
                                        dispreferred_mt = NIL;
                                        dispreferred_mt = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            dictionary.dictionary_enter(preferred_mt_map, dispreferred_mt, preferred_mt);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            dispreferred_mt = cdolist_list_var.first();
                                        } 
                                    }
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_9, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2_$10, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1_$8, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0_$8, thread);
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$6, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$5, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0, thread);
        }
        equivalence_classes = Sort.sort(equivalence_classes, symbol_function($sym53$_), symbol_function(LENGTH));
        return values(equivalence_classes, preferred_mt_map);
    }

    static private final SubLSymbol $sym6$ANY_GENL_MT_ = makeSymbol("ANY-GENL-MT?");

    static private final SubLList $list_alt7 = list(makeSymbol("SPEC"), makeSymbol("GENLS"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT-MT"), makeSymbol("*MT-MT*")), makeSymbol("TV"));

    static private final SubLString $str_alt8$_any_genl_mt__spec_genls__is_t_if = makeString("(any-genl-mt? spec genls) is t iff (genl-mt? spec genl) for some genl in genls\n   (ascending transitive search; inexpensive)");

    static private final SubLList $list_alt9 = list(list(makeSymbol("SPEC"), makeSymbol("EL-FORT-P")), list(makeSymbol("GENLS"), makeSymbol("EL-FORT-P")));

    static private final SubLList $list_alt10 = list(makeSymbol("BOOLEANP"));

    public static final SubLSymbol $kw14$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt15 = list(makeSymbol("MT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym16$BASE_MT = makeUninternedSymbol("BASE-MT");

    static private final SubLSymbol $sym19$ATEMPORAL_HLMT_ = makeSymbol("ATEMPORAL-HLMT?");

    /**
     * Modifier. Adds sbhl links with @see sbhl-after-adding.
     */
    @LispMethod(comment = "Modifier. Adds sbhl links with @see sbhl-after-adding.")
    public static final SubLObject add_base_mt_alt(SubLObject source, SubLObject assertion) {
        return com.cyc.cycjava.cycl.genl_mts.add_genl_mt(source, assertion);
    }

    /**
     * Modifier. Adds sbhl links with @see sbhl-after-adding.
     */
    @LispMethod(comment = "Modifier. Adds sbhl links with @see sbhl-after-adding.")
    public static SubLObject add_base_mt(SubLObject source, final SubLObject assertion) {
        return add_genl_mt(source, assertion);
    }

    /**
     * Modifier. Adds sbhl links with @see sbhl-after-adding.
     */
    @LispMethod(comment = "Modifier. Adds sbhl links with @see sbhl-after-adding.")
    public static final SubLObject add_genl_mt_alt(SubLObject source, SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($$genlMt));
        after_adding_modules.clear_mt_dependent_caches(source, assertion);
        return NIL;
    }

    /**
     * Modifier. Adds sbhl links with @see sbhl-after-adding.
     */
    @LispMethod(comment = "Modifier. Adds sbhl links with @see sbhl-after-adding.")
    public static SubLObject add_genl_mt(SubLObject source, final SubLObject assertion) {
        final SubLObject spec = assertions_high.gaf_arg1(assertion);
        final SubLObject genl = assertions_high.gaf_arg2(assertion);
        if (NIL != assertions_high.assertion_has_truth(assertion, $TRUE)) {
            cardinality_estimates.update_cardinality_estimates_wrt_genls(spec, genl);
        }
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($$genlMt));
        after_adding_modules.clear_mt_dependent_caches(source, assertion);
        return NIL;
    }

    /**
     * Modifier. Removes sbhl links with @see sbhl-after-removing.
     */
    @LispMethod(comment = "Modifier. Removes sbhl links with @see sbhl-after-removing.")
    public static final SubLObject remove_base_mt_alt(SubLObject source, SubLObject assertion) {
        return com.cyc.cycjava.cycl.genl_mts.remove_genl_mt(source, assertion);
    }

    /**
     * Modifier. Removes sbhl links with @see sbhl-after-removing.
     */
    @LispMethod(comment = "Modifier. Removes sbhl links with @see sbhl-after-removing.")
    public static SubLObject remove_base_mt(SubLObject source, final SubLObject assertion) {
        return remove_genl_mt(source, assertion);
    }

    /**
     * Modifier. Removes sbhl links with @see sbhl-after-removing.
     */
    @LispMethod(comment = "Modifier. Removes sbhl links with @see sbhl-after-removing.")
    public static final SubLObject remove_genl_mt_alt(SubLObject source, SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($$genlMt));
        return NIL;
    }

    /**
     * Modifier. Removes sbhl links with @see sbhl-after-removing.
     */
    @LispMethod(comment = "Modifier. Removes sbhl links with @see sbhl-after-removing.")
    public static SubLObject remove_genl_mt(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($$genlMt));
        return NIL;
    }

    public static final SubLObject clear_mt_graph_alt() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module($$genlMt));
        return NIL;
    }

    public static SubLObject clear_mt_graph() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module($$genlMt));
        return NIL;
    }

    public static final SubLObject clear_node_genl_mt_links_alt(SubLObject mt, SubLObject mt_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlMt), thread);
                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlMt)), thread);
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlMt)), thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlMt), thread);
                    sbhl_link_methods.clear_sbhl_links_within_mt(mt, mt_mt, UNPROVIDED);
                } finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject clear_node_genl_mt_links(final SubLObject mt, final SubLObject mt_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlMt), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlMt)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlMt)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlMt), thread);
            sbhl_link_methods.clear_sbhl_links_within_mt(mt, mt_mt, UNPROVIDED);
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject reset_genl_mt_links_alt(SubLObject mt, SubLObject mts) {
        if (mts == UNPROVIDED) {
            mts = NIL;
        }
        return com.cyc.cycjava.cycl.genl_mts.reset_mts_links(mt, mts);
    }

    public static SubLObject reset_genl_mt_links(final SubLObject mt, SubLObject mts) {
        if (mts == UNPROVIDED) {
            mts = NIL;
        }
        return reset_mts_links(mt, mts);
    }

    public static final SubLObject reset_mts_links_alt(SubLObject mt, SubLObject mts) {
        if (mts == UNPROVIDED) {
            mts = NIL;
        }
        {
            SubLObject out_mts = (NIL != mts) ? ((SubLObject) (mts)) : sbhl_link_methods.sbhl_link_mts(sbhl_module_vars.get_sbhl_module($$genlMt), mt);
            SubLObject in_mts = (NIL != mts) ? ((SubLObject) (mts)) : com.cyc.cycjava.cycl.genl_mts.genl_mt_mts(mt);
            {
                SubLObject cdolist_list_var = out_mts;
                SubLObject mt_mt = NIL;
                for (mt_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_mt = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.genl_mts.clear_node_genl_mt_links(mt, mt_mt);
                }
            }
            {
                SubLObject cdolist_list_var = in_mts;
                SubLObject mt_mt = NIL;
                for (mt_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_mt = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.genl_mts.reset_mts_links_in_mt(mt, mt_mt);
                }
            }
        }
        return NIL;
    }

    public static SubLObject reset_mts_links(final SubLObject mt, SubLObject mts) {
        if (mts == UNPROVIDED) {
            mts = NIL;
        }
        final SubLObject out_mts = (NIL != mts) ? mts : sbhl_link_methods.sbhl_link_mts(sbhl_module_vars.get_sbhl_module($$genlMt), mt);
        final SubLObject in_mts = (NIL != mts) ? mts : genl_mt_mts(mt);
        SubLObject cdolist_list_var = out_mts;
        SubLObject mt_mt = NIL;
        mt_mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            clear_node_genl_mt_links(mt, mt_mt);
            cdolist_list_var = cdolist_list_var.rest();
            mt_mt = cdolist_list_var.first();
        } 
        cdolist_list_var = in_mts;
        mt_mt = NIL;
        mt_mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            reset_mts_links_in_mt(mt, mt_mt);
            cdolist_list_var = cdolist_list_var.rest();
            mt_mt = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject reset_mts_links_in_mt_alt(SubLObject mt, SubLObject mt_mt) {
        after_adding_modules.clear_mt_dependent_caches(T, T);
        sbhl_link_methods.sbhl_recompute_links(mt, mt_mt, sbhl_module_vars.get_sbhl_module($$genlMt));
        return NIL;
    }

    public static SubLObject reset_mts_links_in_mt(final SubLObject mt, final SubLObject mt_mt) {
        after_adding_modules.clear_mt_dependent_caches(T, T);
        sbhl_link_methods.sbhl_recompute_links(mt, mt_mt, sbhl_module_vars.get_sbhl_module($$genlMt));
        return NIL;
    }

    public static final SubLObject reset_mt_graph_alt(SubLObject clearP) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        after_adding_modules.clear_mt_dependent_caches(T, T);
        if (NIL != clearP) {
            com.cyc.cycjava.cycl.genl_mts.clear_mt_graph();
        }
        sbhl_link_methods.sbhl_recompute_graph_links(sbhl_module_vars.get_sbhl_module($$genlMt));
        after_adding_modules.clear_mt_dependent_caches(T, T);
        return NIL;
    }

    public static SubLObject reset_mt_graph(SubLObject clearP) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        after_adding_modules.clear_mt_dependent_caches(T, T);
        if (NIL != clearP) {
            clear_mt_graph();
        }
        sbhl_link_methods.sbhl_recompute_graph_links(sbhl_module_vars.get_sbhl_module($$genlMt));
        after_adding_modules.clear_mt_dependent_caches(T, T);
        return NIL;
    }

    public static SubLObject declare_genl_mts_file() {
        declareFunction("genl_mts", "GENL-MTS", 1, 2, false);
        declareFunction("min_genl_mts", "MIN-GENL-MTS", 1, 2, false);
        declareFunction("not_genl_mts", "NOT-GENL-MTS", 1, 2, false);
        declareFunction("max_not_genl_mts", "MAX-NOT-GENL-MTS", 1, 2, false);
        declareFunction("spec_mts", "SPEC-MTS", 1, 2, false);
        declareFunction("leaf_mtP", "LEAF-MT?", 1, 2, false);
        declareFunction("max_spec_mts", "MAX-SPEC-MTS", 1, 2, false);
        declareFunction("not_spec_mts", "NOT-SPEC-MTS", 1, 2, false);
        declareFunction("min_not_spec_mts", "MIN-NOT-SPEC-MTS", 1, 2, false);
        declareFunction("genl_mt_siblings", "GENL-MT-SIBLINGS", 1, 2, false);
        declareFunction("spec_mt_siblings", "SPEC-MT-SIBLINGS", 1, 2, false);
        declareFunction("all_genl_mts", "ALL-GENL-MTS", 1, 2, false);
        declareFunction("all_genl_mts_internal", "ALL-GENL-MTS-INTERNAL", 4, 0, false);
        declareFunction("all_spec_mts", "ALL-SPEC-MTS", 1, 2, false);
        declareFunction("all_spec_mts_internal", "ALL-SPEC-MTS-INTERNAL", 4, 0, false);
        declareFunction("all_proper_genl_mts", "ALL-PROPER-GENL-MTS", 1, 2, false);
        declareFunction("all_proper_spec_mts", "ALL-PROPER-SPEC-MTS", 1, 2, false);
        declareFunction("random_genl_mt", "RANDOM-GENL-MT", 1, 2, false);
        declareFunction("random_spec_mt", "RANDOM-SPEC-MT", 1, 2, false);
        declareFunction("random_proper_genl_mt", "RANDOM-PROPER-GENL-MT", 1, 2, false);
        declareFunction("random_proper_spec_mt", "RANDOM-PROPER-SPEC-MT", 1, 2, false);
        declareFunction("all_not_genl_mts", "ALL-NOT-GENL-MTS", 1, 2, false);
        declareFunction("all_not_spec_mts", "ALL-NOT-SPEC-MTS", 1, 2, false);
        declareFunction("all_genl_mts_between", "ALL-GENL-MTS-BETWEEN", 2, 2, false);
        declareFunction("union_all_genl_mts", "UNION-ALL-GENL-MTS", 1, 2, false);
        declareFunction("union_all_spec_mts", "UNION-ALL-SPEC-MTS", 1, 2, false);
        declareFunction("all_dependent_spec_mts", "ALL-DEPENDENT-SPEC-MTS", 1, 2, false);
        declareFunction("all_genl_mts_among", "ALL-GENL-MTS-AMONG", 2, 2, false);
        declareFunction("all_spec_mts_among", "ALL-SPEC-MTS-AMONG", 2, 2, false);
        declareFunction("selected_genl_mts", "SELECTED-GENL-MTS", 2, 2, false);
        declareFunction("all_genl_mts_if", "ALL-GENL-MTS-IF", 2, 2, false);
        declareFunction("all_spec_mts_if", "ALL-SPEC-MTS-IF", 2, 2, false);
        declareFunction("map_all_genl_mts", "MAP-ALL-GENL-MTS", 2, 2, false);
        declareFunction("map_all_spec_mts", "MAP-ALL-SPEC-MTS", 2, 2, false);
        declareFunction("map_union_all_genl_mts", "MAP-UNION-ALL-GENL-MTS", 2, 2, false);
        declareFunction("map_all_genl_mts_of_all", "MAP-ALL-GENL-MTS-OF-ALL", 2, 2, false);
        declareFunction("map_union_all_spec_mts", "MAP-UNION-ALL-SPEC-MTS", 2, 2, false);
        declareFunction("map_all_spec_mts_of_all", "MAP-ALL-SPEC-MTS-OF-ALL", 2, 2, false);
        declareFunction("genl_mtP", "GENL-MT?", 2, 2, false);
        declareFunction("proper_genl_mtP", "PROPER-GENL-MT?", 2, 2, false);
        declareFunction("monad_genl_mtP", "MONAD-GENL-MT?", 2, 2, false);
        declareFunction("spec_mtP", "SPEC-MT?", 2, 1, false);
        declareFunction("genl_mt_ofP", "GENL-MT-OF?", 2, 2, false);
        declareFunction("any_genl_mtP_memoized_internal", "ANY-GENL-MT?-MEMOIZED-INTERNAL", 2, 2, false);
        declareFunction("any_genl_mtP_memoized", "ANY-GENL-MT?-MEMOIZED", 2, 2, false);
        declareFunction("any_genl_mtP", "ANY-GENL-MT?", 2, 2, false);
        declareFunction("genl_mt_of_anyP", "GENL-MT-OF-ANY?", 2, 2, false);
        declareFunction("all_genl_mtP", "ALL-GENL-MT?", 2, 2, false);
        declareFunction("genl_mt_of_allP", "GENL-MT-OF-ALL?", 2, 2, false);
        declareFunction("any_genl_mt_of_anyP", "ANY-GENL-MT-OF-ANY?", 2, 2, false);
        declareFunction("not_genl_mtP", "NOT-GENL-MT?", 2, 2, false);
        declareFunction("argue_not_genl_mtP", "ARGUE-NOT-GENL-MT?", 2, 2, false);
        declareFunction("not_spec_mtP", "NOT-SPEC-MT?", 2, 2, false);
        declareFunction("not_any_genl_mtP", "NOT-ANY-GENL-MT?", 2, 2, false);
        declareFunction("mts_intersectP", "MTS-INTERSECT?", 2, 1, false);
        declareFunction("mts_explicitly_intersectP", "MTS-EXPLICITLY-INTERSECT?", 2, 1, false);
        declareFunction("why_genl_mtP", "WHY-GENL-MT?", 2, 3, false);
        declareFunction("why_monad_genl_mtP", "WHY-MONAD-GENL-MT?", 2, 3, false);
        declareFunction("any_just_of_genl_mt", "ANY-JUST-OF-GENL-MT", 2, 1, false);
        declareFunction("why_not_genl_mtP", "WHY-NOT-GENL-MT?", 2, 3, false);
        declareFunction("any_just_of_not_genl_mt", "ANY-JUST-OF-NOT-GENL-MT", 2, 1, false);
        declareFunction("clear_all_base_mts", "CLEAR-ALL-BASE-MTS", 0, 0, false);
        declareFunction("remove_all_base_mts", "REMOVE-ALL-BASE-MTS", 1, 0, false);
        declareFunction("all_base_mts_internal", "ALL-BASE-MTS-INTERNAL", 1, 0, false);
        declareFunction("all_base_mts", "ALL-BASE-MTS", 1, 0, false);
        declareMacro("do_base_mts", "DO-BASE-MTS");
        declareFunction("min_mts", "MIN-MTS", 1, 1, false);
        declareFunction("min_mts_before_floors", "MIN-MTS-BEFORE-FLOORS", 1, 1, false);
        declareFunction("min_mts_2", "MIN-MTS-2", 2, 1, false);
        declareFunction("max_mts", "MAX-MTS", 1, 1, false);
        declareFunction("max_mts_before_ceiling", "MAX-MTS-BEFORE-CEILING", 1, 1, false);
        declareFunction("min_ceiling_mts", "MIN-CEILING-MTS", 1, 2, false);
        declareFunction("max_floor_mts", "MAX-FLOOR-MTS", 1, 2, false);
        declareFunction("max_floor_mts_explosion_warning_internal", "MAX-FLOOR-MTS-EXPLOSION-WARNING-INTERNAL", 2, 0, false);
        declareFunction("max_floor_mts_explosion_warning", "MAX-FLOOR-MTS-EXPLOSION-WARNING", 2, 0, false);
        declareFunction("show_max_floor_mts_info", "SHOW-MAX-FLOOR-MTS-INFO", 1, 3, false);
        declareFunction("max_floor_hlmts", "MAX-FLOOR-HLMTS", 3, 0, false);
        declareFunction("max_floor_monad_mts_internal", "MAX-FLOOR-MONAD-MTS-INTERNAL", 3, 0, false);
        declareFunction("max_floor_monad_mts", "MAX-FLOOR-MONAD-MTS", 3, 0, false);
        declareFunction("max_floor_mts_with_cycles_pruned", "MAX-FLOOR-MTS-WITH-CYCLES-PRUNED", 1, 2, false);
        declareFunction("max_floor_hlmts_with_cycles_pruned", "MAX-FLOOR-HLMTS-WITH-CYCLES-PRUNED", 3, 0, false);
        declareFunction("max_floor_monad_mts_with_cycles_pruned", "MAX-FLOOR-MONAD-MTS-WITH-CYCLES-PRUNED", 3, 0, false);
        declareFunction("max_floor_mts_from_mt_sets", "MAX-FLOOR-MTS-FROM-MT-SETS", 1, 0, false);
        declareFunction("clear_cached_max_floor_mts_from_mt_sets", "CLEAR-CACHED-MAX-FLOOR-MTS-FROM-MT-SETS", 0, 0, false);
        declareFunction("remove_cached_max_floor_mts_from_mt_sets", "REMOVE-CACHED-MAX-FLOOR-MTS-FROM-MT-SETS", 1, 0, false);
        declareFunction("cached_max_floor_mts_from_mt_sets_internal", "CACHED-MAX-FLOOR-MTS-FROM-MT-SETS-INTERNAL", 1, 0, false);
        declareFunction("cached_max_floor_mts_from_mt_sets", "CACHED-MAX-FLOOR-MTS-FROM-MT-SETS", 1, 0, false);
        declareFunction("max_floor_mts_of_genl_mt_paths", "MAX-FLOOR-MTS-OF-GENL-MT-PATHS", 2, 0, false);
        declareFunction("genl_mt_mts", "GENL-MT-MTS", 1, 0, false);
        declareFunction("asserted_genl_mtsP", "ASSERTED-GENL-MTS?", 1, 1, false);
        declareFunction("asserted_genl_mts", "ASSERTED-GENL-MTS", 1, 1, false);
        declareFunction("genl_mts_from_asserted_assertions", "GENL-MTS-FROM-ASSERTED-ASSERTIONS", 1, 0, false);
        declareFunction("asserted_not_genl_mts", "ASSERTED-NOT-GENL-MTS", 1, 1, false);
        declareFunction("supported_genl_mts", "SUPPORTED-GENL-MTS", 1, 1, false);
        declareFunction("supported_not_genl_mts", "SUPPORTED-NOT-GENL-MTS", 1, 1, false);
        declareFunction("asserted_spec_mtsP", "ASSERTED-SPEC-MTS?", 1, 1, false);
        declareFunction("asserted_spec_mts", "ASSERTED-SPEC-MTS", 1, 1, false);
        declareFunction("asserted_not_spec_mts", "ASSERTED-NOT-SPEC-MTS", 1, 1, false);
        declareFunction("supported_spec_mts", "SUPPORTED-SPEC-MTS", 1, 1, false);
        declareFunction("supported_not_spec_mts", "SUPPORTED-NOT-SPEC-MTS", 1, 1, false);
        declareFunction("coextensional_mts", "COEXTENSIONAL-MTS", 1, 0, false);
        declareFunction("all_mt_loops", "ALL-MT-LOOPS", 0, 1, false);
        declareFunction("add_base_mt", "ADD-BASE-MT", 2, 0, false);
        declareFunction("add_genl_mt", "ADD-GENL-MT", 2, 0, false);
        declareFunction("remove_base_mt", "REMOVE-BASE-MT", 2, 0, false);
        declareFunction("remove_genl_mt", "REMOVE-GENL-MT", 2, 0, false);
        declareFunction("clear_mt_graph", "CLEAR-MT-GRAPH", 0, 0, false);
        declareFunction("clear_node_genl_mt_links", "CLEAR-NODE-GENL-MT-LINKS", 2, 0, false);
        declareFunction("reset_genl_mt_links", "RESET-GENL-MT-LINKS", 1, 1, false);
        declareFunction("reset_mts_links", "RESET-MTS-LINKS", 1, 1, false);
        declareFunction("reset_mts_links_in_mt", "RESET-MTS-LINKS-IN-MT", 2, 0, false);
        declareFunction("reset_mt_graph", "RESET-MT-GRAPH", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_genl_mts_file() {
        deflexical("*ALL-BASE-MTS-CACHING-STATE*", NIL);
        defvar("*MIN-MTS-2-ENABLED?*", NIL);
        defparameter("*SUPPRESS-MAX-FLOOR-MTS-EXPLOSION-WARNING*", NIL);
        defparameter("*MAX-FLOOR-MTS-EXPLOSION-WARNING-MIN-PLACEMENTS-MT-COUNT*", FIVE_INTEGER);
        deflexical("*CACHED-MAX-FLOOR-MTS-FROM-MT-SETS-CACHING-STATE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_genl_mts_file_alt() {
        register_cyc_api_function($sym6$ANY_GENL_MT_, $list_alt7, $str_alt8$_any_genl_mt__spec_genls__is_t_if, $list_alt9, $list_alt10);
        note_globally_cached_function(ALL_BASE_MTS);
        note_memoized_function(MAX_FLOOR_MONAD_MTS);
        note_globally_cached_function(CACHED_MAX_FLOOR_MTS_FROM_MT_SETS);
        register_kb_function(ADD_BASE_MT);
        register_kb_function(ADD_GENL_MT);
        register_kb_function(REMOVE_BASE_MT);
        register_kb_function(REMOVE_GENL_MT);
        return NIL;
    }

    public static SubLObject setup_genl_mts_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_memoized_function($sym4$ANY_GENL_MT__MEMOIZED);
            register_cyc_api_function($sym7$ANY_GENL_MT_, $list8, $str9$_any_genl_mt__spec_genls__is_t_if, $list10, $list11);
            memoization_state.note_globally_cached_function(ALL_BASE_MTS);
            memoization_state.note_memoized_function(MAX_FLOOR_MTS_EXPLOSION_WARNING);
            memoization_state.note_memoized_function(MAX_FLOOR_MONAD_MTS);
            memoization_state.note_globally_cached_function(CACHED_MAX_FLOOR_MTS_FROM_MT_SETS);
            register_kb_function(ADD_BASE_MT);
            register_kb_function(ADD_GENL_MT);
            register_kb_function(REMOVE_BASE_MT);
            register_kb_function(REMOVE_GENL_MT);
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function($sym6$ANY_GENL_MT_, $list_alt7, $str_alt8$_any_genl_mt__spec_genls__is_t_if, $list_alt9, $list_alt10);
        }
        return NIL;
    }

    public static SubLObject setup_genl_mts_file_Previous() {
        memoization_state.note_memoized_function($sym4$ANY_GENL_MT__MEMOIZED);
        register_cyc_api_function($sym7$ANY_GENL_MT_, $list8, $str9$_any_genl_mt__spec_genls__is_t_if, $list10, $list11);
        memoization_state.note_globally_cached_function(ALL_BASE_MTS);
        memoization_state.note_memoized_function(MAX_FLOOR_MTS_EXPLOSION_WARNING);
        memoization_state.note_memoized_function(MAX_FLOOR_MONAD_MTS);
        memoization_state.note_globally_cached_function(CACHED_MAX_FLOOR_MTS_FROM_MT_SETS);
        register_kb_function(ADD_BASE_MT);
        register_kb_function(ADD_GENL_MT);
        register_kb_function(REMOVE_BASE_MT);
        register_kb_function(REMOVE_GENL_MT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_genl_mts_file();
    }

    @Override
    public void initializeVariables() {
        init_genl_mts_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_genl_mts_file();
    }

    static {
    }
}

/**
 * Total time: 633 ms
 */
