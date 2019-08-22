/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.sbhl.sbhl_iteration.new_sbhl_dictionary_iterator;
import static com.cyc.cycjava.cycl.sbhl.sbhl_iteration.new_sbhl_iterator;
import static com.cyc.cycjava.cycl.sbhl.sbhl_iteration.new_sbhl_null_iterator;
import static com.cyc.cycjava.cycl.sbhl.sbhl_iteration.sbhl_iteration_doneP;
import static com.cyc.cycjava.cycl.sbhl.sbhl_iteration.sbhl_iteration_finalize;
import static com.cyc.cycjava.cycl.sbhl.sbhl_iteration.sbhl_iteration_next;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.binary_tree;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.hlmt_relevance;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SBHL-TIME-DATES
 * source file: /cyc/top/cycl/sbhl/sbhl-time-dates.lisp
 * created:     2019/07/03 17:37:36
 */
public final class sbhl_time_dates extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sbhl_time_dates();

 public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_time_dates";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $sbhl_time_date_graph$ = makeSymbol("*SBHL-TIME-DATE-GRAPH*");

    static private final SubLSymbol $sym1$SBHL_DATE_ = makeSymbol("SBHL-DATE<");

    private static final SubLSymbol SBHL_DATE_P = makeSymbol("SBHL-DATE-P");

    static private final SubLList $list4 = list(list(makeSymbol("DATE"), makeSymbol("&KEY"), makeSymbol("EARLIEST"), makeSymbol("LATEST"), list(makeSymbol("DIRECTION"), makeKeyword("FORWARD")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list5 = list(makeKeyword("EARLIEST"), makeKeyword("LATEST"), makeKeyword("DIRECTION"), $DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLSymbol $sym11$ITERATOR = makeUninternedSymbol("ITERATOR");

    private static final SubLSymbol NEW_SBHL_TIME_DATE_ITERATOR = makeSymbol("NEW-SBHL-TIME-DATE-ITERATOR");

    private static final SubLSymbol DO_SBHL_ITERATOR = makeSymbol("DO-SBHL-ITERATOR");

    public static final SubLSymbol $sbhl_time_date_object_predicate_links$ = makeSymbol("*SBHL-TIME-DATE-OBJECT-PREDICATE-LINKS*");

    public static final SubLSymbol $sbhl_time_date_object_inverse_links$ = makeSymbol("*SBHL-TIME-DATE-OBJECT-INVERSE-LINKS*");

    public static final SubLSymbol $sbhl_time_object_date_predicate_links$ = makeSymbol("*SBHL-TIME-OBJECT-DATE-PREDICATE-LINKS*");

    public static final SubLSymbol $sbhl_time_object_date_inverse_links$ = makeSymbol("*SBHL-TIME-OBJECT-DATE-INVERSE-LINKS*");

    private static final SubLObject $$weak_HL_TimePrecedence = reader_make_constant_shell("weak-HL-TimePrecedence");

    static private final SubLList $list23 = list(list(makeSymbol("LINK-TAG"), makeSymbol("LINK-MT"), makeSymbol("LINK-NODE"), makeSymbol("&OPTIONAL"), makeSymbol("LINK-SUPPORTS")), makeSymbol("LINK"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym24$LINK_SUPPORTS = makeUninternedSymbol("LINK-SUPPORTS");

    private static final SubLSymbol DESTRUCTURE_SBHL_TIME_DATE_LINK = makeSymbol("DESTRUCTURE-SBHL-TIME-DATE-LINK");

    static private final SubLSymbol $sym28$_OPTIONAL = makeSymbol("&OPTIONAL");

    static private final SubLList $list29 = list(list(makeSymbol("LINK0"), makeSymbol("LINK1"), makeSymbol("LINK2"), makeSymbol("NODE"), makeSymbol("&KEY"), makeSymbol("DATE-LOWER-BOUND"), makeSymbol("DATE-UPPER-BOUND"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list30 = list(makeKeyword("DATE-LOWER-BOUND"), makeKeyword("DATE-UPPER-BOUND"), $DONE);

    private static final SubLSymbol $DATE_LOWER_BOUND = makeKeyword("DATE-LOWER-BOUND");

    private static final SubLSymbol $DATE_UPPER_BOUND = makeKeyword("DATE-UPPER-BOUND");

    static private final SubLSymbol $sym33$ITERATOR = makeUninternedSymbol("ITERATOR");

    static private final SubLSymbol $sym34$RAW_LINKS = makeUninternedSymbol("RAW-LINKS");

    private static final SubLSymbol NEW_SBHL_TIME_DATE_LINK_ITERATOR = makeSymbol("NEW-SBHL-TIME-DATE-LINK-ITERATOR");

    static private final SubLList $list36 = list(makeSymbol("GET-SBHL-LINK-DIRECTION"));

    static private final SubLList $list37 = list(list(makeSymbol("LINK0"), makeSymbol("LINK1"), makeSymbol("DATE0"), makeSymbol("DATE1"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list38 = list($DONE);

    static private final SubLSymbol $sym39$ITERATOR = makeUninternedSymbol("ITERATOR");

    static private final SubLSymbol $sym40$RAW_LINKS = makeUninternedSymbol("RAW-LINKS");

    private static final SubLSymbol NEW_SBHL_TIME_DATE_DATE_LINK_ITERATOR = makeSymbol("NEW-SBHL-TIME-DATE-DATE-LINK-ITERATOR");

    static private final SubLList $list42 = list(list(makeSymbol("GET-SBHL-LINK-DIRECTION")));

    static private final SubLList $list43 = list(list(makeSymbol("LINK0"), makeSymbol("LINK1"), makeSymbol("DATE"), makeSymbol("&KEY"), makeSymbol("DATE-LOWER-BOUND"), makeSymbol("DATE-UPPER-BOUND"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym44$DATE0 = makeUninternedSymbol("DATE0");

    static private final SubLSymbol $sym45$DATE1 = makeUninternedSymbol("DATE1");

    static private final SubLList $list47 = list(makeSymbol("SBHL-FORWARD-DIRECTED-DIRECTION-P"), list(makeSymbol("GET-SBHL-LINK-DIRECTION")));

    static private final SubLSymbol $sym51$SBHL_DATE_ = makeSymbol("SBHL-DATE>");

    private static final SubLSymbol DO_SBHL_TIME_DATE_LINKS_BETWEEN_DATES = makeSymbol("DO-SBHL-TIME-DATE-LINKS-BETWEEN-DATES");

    private static final SubLSymbol SBHL_TIME_DATE_LINK_ITERATOR_DONE = makeSymbol("SBHL-TIME-DATE-LINK-ITERATOR-DONE");

    private static final SubLSymbol SBHL_TIME_DATE_LINK_ITERATOR_NEXT = makeSymbol("SBHL-TIME-DATE-LINK-ITERATOR-NEXT");

    private static final SubLSymbol SBHL_TIME_DATE_LINK_ITERATOR_FINALIZE = makeSymbol("SBHL-TIME-DATE-LINK-ITERATOR-FINALIZE");

    private static final SubLSymbol SBHL_TIME_DATE_DATE_LINK_ITERATOR_DONE = makeSymbol("SBHL-TIME-DATE-DATE-LINK-ITERATOR-DONE");

    private static final SubLSymbol SBHL_TIME_DATE_DATE_LINK_ITERATOR_NEXT = makeSymbol("SBHL-TIME-DATE-DATE-LINK-ITERATOR-NEXT");

    private static final SubLSymbol SBHL_TIME_DATE_DATE_LINK_ITERATOR_FINALIZE = makeSymbol("SBHL-TIME-DATE-DATE-LINK-ITERATOR-FINALIZE");

    private static final SubLSymbol SBHL_TIME_DATE_LINK_TAG_ITERATOR_DONE = makeSymbol("SBHL-TIME-DATE-LINK-TAG-ITERATOR-DONE");

    private static final SubLSymbol SBHL_TIME_DATE_LINK_TAG_ITERATOR_NEXT = makeSymbol("SBHL-TIME-DATE-LINK-TAG-ITERATOR-NEXT");

    private static final SubLSymbol SBHL_TIME_DATE_LINK_TAG_ITERATOR_FINALIZE = makeSymbol("SBHL-TIME-DATE-LINK-TAG-ITERATOR-FINALIZE");

    static private final SubLList $list63 = list(makeSymbol("TAG"), makeSymbol("TAG-TABLE"));

    private static final SubLSymbol SBHL_TIME_DATE_MT_LINK_ITERATOR_DONE = makeSymbol("SBHL-TIME-DATE-MT-LINK-ITERATOR-DONE");

    private static final SubLSymbol SBHL_TIME_DATE_MT_LINK_ITERATOR_NEXT = makeSymbol("SBHL-TIME-DATE-MT-LINK-ITERATOR-NEXT");

    private static final SubLSymbol SBHL_TIME_DATE_MT_LINK_ITERATOR_FINALIZE = makeSymbol("SBHL-TIME-DATE-MT-LINK-ITERATOR-FINALIZE");

    static private final SubLList $list67 = list(makeSymbol("MT"), makeSymbol("MT-TABLE"));

    // Definitions
    /**
     * An SBHL-DATE-P is either an extended universal date (an integer representing
     * the year, month, day, hour, minute, and second), the beginning of time, or
     * the end of time.
     */
    @LispMethod(comment = "An SBHL-DATE-P is either an extended universal date (an integer representing\r\nthe year, month, day, hour, minute, and second), the beginning of time, or\r\nthe end of time.\nAn SBHL-DATE-P is either an extended universal date (an integer representing\nthe year, month, day, hour, minute, and second), the beginning of time, or\nthe end of time.")
    public static final SubLObject sbhl_date_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != numeric_date_utilities.extended_universal_date_p(v_object)) || (NIL != date_utilities.beginning_of_timeP(v_object))) || (NIL != date_utilities.end_of_timeP(v_object)));
    }

    // Definitions
    /**
     * An SBHL-DATE-P is either an extended universal date (an integer representing
     * the year, month, day, hour, minute, and second), the beginning of time, or
     * the end of time.
     */
    @LispMethod(comment = "An SBHL-DATE-P is either an extended universal date (an integer representing\r\nthe year, month, day, hour, minute, and second), the beginning of time, or\r\nthe end of time.\nAn SBHL-DATE-P is either an extended universal date (an integer representing\nthe year, month, day, hour, minute, and second), the beginning of time, or\nthe end of time.")
    public static SubLObject sbhl_date_p(final SubLObject v_object) {
        return makeBoolean(((NIL != numeric_date_utilities.extended_universal_date_p(v_object)) || (NIL != date_utilities.beginning_of_timeP(v_object))) || (NIL != date_utilities.end_of_timeP(v_object)));
    }

    public static final SubLObject sbhl_dateE_alt(SubLObject sbhl_date1, SubLObject sbhl_date2) {
        return eql(sbhl_date1, sbhl_date2);
    }

    public static SubLObject sbhl_dateE(final SubLObject sbhl_date1, final SubLObject sbhl_date2) {
        return eql(sbhl_date1, sbhl_date2);
    }

    public static final SubLObject sbhl_dateL_alt(SubLObject sbhl_date1, SubLObject sbhl_date2) {
        if (NIL != date_utilities.beginning_of_timeP(sbhl_date2)) {
            return NIL;
        } else {
            if (NIL != date_utilities.beginning_of_timeP(sbhl_date1)) {
                return T;
            } else {
                if (NIL != date_utilities.end_of_timeP(sbhl_date1)) {
                    return NIL;
                } else {
                    if (NIL != date_utilities.end_of_timeP(sbhl_date2)) {
                        return T;
                    } else {
                        return numeric_date_utilities.extended_universal_dateL(sbhl_date1, sbhl_date2);
                    }
                }
            }
        }
    }

    public static SubLObject sbhl_dateL(final SubLObject sbhl_date1, final SubLObject sbhl_date2) {
        if (NIL != date_utilities.beginning_of_timeP(sbhl_date2)) {
            return NIL;
        }
        if (NIL != date_utilities.beginning_of_timeP(sbhl_date1)) {
            return T;
        }
        if (NIL != date_utilities.end_of_timeP(sbhl_date1)) {
            return NIL;
        }
        if (NIL != date_utilities.end_of_timeP(sbhl_date2)) {
            return T;
        }
        return numeric_date_utilities.extended_universal_dateL(sbhl_date1, sbhl_date2);
    }

    public static final SubLObject sbhl_dateLE_alt(SubLObject sbhl_date1, SubLObject sbhl_date2) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_dateE(sbhl_date1, sbhl_date2)) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_dateL(sbhl_date1, sbhl_date2)));
    }

    public static SubLObject sbhl_dateLE(final SubLObject sbhl_date1, final SubLObject sbhl_date2) {
        return makeBoolean((NIL != sbhl_dateE(sbhl_date1, sbhl_date2)) || (NIL != sbhl_dateL(sbhl_date1, sbhl_date2)));
    }

    public static final SubLObject sbhl_dateG_alt(SubLObject sbhl_date1, SubLObject sbhl_date2) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_dateL(sbhl_date2, sbhl_date1);
    }

    public static SubLObject sbhl_dateG(final SubLObject sbhl_date1, final SubLObject sbhl_date2) {
        return sbhl_dateL(sbhl_date2, sbhl_date1);
    }

    public static final SubLObject sbhl_dateGE_alt(SubLObject sbhl_date1, SubLObject sbhl_date2) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_dateLE(sbhl_date2, sbhl_date1);
    }

    public static SubLObject sbhl_dateGE(final SubLObject sbhl_date1, final SubLObject sbhl_date2) {
        return sbhl_dateLE(sbhl_date2, sbhl_date1);
    }

    public static final SubLObject sbhl_date_betweenP_alt(SubLObject between, SubLObject early, SubLObject late, SubLObject strictP) {
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        return NIL != strictP ? ((SubLObject) (makeBoolean((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_dateL(early, between)) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_dateL(between, late))))) : makeBoolean((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_dateLE(early, between)) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_dateLE(between, late)));
    }

    public static SubLObject sbhl_date_betweenP(final SubLObject between, final SubLObject early, final SubLObject late, SubLObject strictP) {
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        return NIL != strictP ? makeBoolean((NIL != sbhl_dateL(early, between)) && (NIL != sbhl_dateL(between, late))) : makeBoolean((NIL != sbhl_dateLE(early, between)) && (NIL != sbhl_dateLE(between, late)));
    }

    /**
     * Find the earliest date in the SBHL time date graph.  If SBHL-DATE is
     * not NIL, then find the earliest date no earlier than SBHL-DATE.  If
     * SBHL-DATE and STRICT? are both non-NIL, then find the earliest date
     * strictly later than SBHL-DATE.
     */
    @LispMethod(comment = "Find the earliest date in the SBHL time date graph.  If SBHL-DATE is\r\nnot NIL, then find the earliest date no earlier than SBHL-DATE.  If\r\nSBHL-DATE and STRICT? are both non-NIL, then find the earliest date\r\nstrictly later than SBHL-DATE.\nFind the earliest date in the SBHL time date graph.  If SBHL-DATE is\nnot NIL, then find the earliest date no earlier than SBHL-DATE.  If\nSBHL-DATE and STRICT? are both non-NIL, then find the earliest date\nstrictly later than SBHL-DATE.")
    public static final SubLObject sbhl_time_find_earliest_date_alt(SubLObject sbhl_date, SubLObject strictP) {
        if (sbhl_date == UNPROVIDED) {
            sbhl_date = NIL;
        }
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        return binary_tree.avl_tree_find_least($sbhl_time_date_graph$.getGlobalValue(), sbhl_date, strictP);
    }

    /**
     * Find the earliest date in the SBHL time date graph.  If SBHL-DATE is
     * not NIL, then find the earliest date no earlier than SBHL-DATE.  If
     * SBHL-DATE and STRICT? are both non-NIL, then find the earliest date
     * strictly later than SBHL-DATE.
     */
    @LispMethod(comment = "Find the earliest date in the SBHL time date graph.  If SBHL-DATE is\r\nnot NIL, then find the earliest date no earlier than SBHL-DATE.  If\r\nSBHL-DATE and STRICT? are both non-NIL, then find the earliest date\r\nstrictly later than SBHL-DATE.\nFind the earliest date in the SBHL time date graph.  If SBHL-DATE is\nnot NIL, then find the earliest date no earlier than SBHL-DATE.  If\nSBHL-DATE and STRICT? are both non-NIL, then find the earliest date\nstrictly later than SBHL-DATE.")
    public static SubLObject sbhl_time_find_earliest_date(SubLObject sbhl_date, SubLObject strictP) {
        if (sbhl_date == UNPROVIDED) {
            sbhl_date = NIL;
        }
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        return binary_tree.avl_tree_find_least($sbhl_time_date_graph$.getGlobalValue(), sbhl_date, strictP);
    }

    /**
     * Find the latest date in the SBHL time date graph.  If SBHL-DATE is
     * not NIL, then find the latest date no later than SBHL-DATE.  If
     * SBHL-DATE and STRICT? are both non-NIL, then find the latest date
     * strictly earlier than SBHL-DATE.
     */
    @LispMethod(comment = "Find the latest date in the SBHL time date graph.  If SBHL-DATE is\r\nnot NIL, then find the latest date no later than SBHL-DATE.  If\r\nSBHL-DATE and STRICT? are both non-NIL, then find the latest date\r\nstrictly earlier than SBHL-DATE.\nFind the latest date in the SBHL time date graph.  If SBHL-DATE is\nnot NIL, then find the latest date no later than SBHL-DATE.  If\nSBHL-DATE and STRICT? are both non-NIL, then find the latest date\nstrictly earlier than SBHL-DATE.")
    public static final SubLObject sbhl_time_find_latest_date_alt(SubLObject sbhl_date, SubLObject strictP) {
        if (sbhl_date == UNPROVIDED) {
            sbhl_date = NIL;
        }
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        return binary_tree.avl_tree_find_greatest($sbhl_time_date_graph$.getGlobalValue(), sbhl_date, strictP);
    }

    /**
     * Find the latest date in the SBHL time date graph.  If SBHL-DATE is
     * not NIL, then find the latest date no later than SBHL-DATE.  If
     * SBHL-DATE and STRICT? are both non-NIL, then find the latest date
     * strictly earlier than SBHL-DATE.
     */
    @LispMethod(comment = "Find the latest date in the SBHL time date graph.  If SBHL-DATE is\r\nnot NIL, then find the latest date no later than SBHL-DATE.  If\r\nSBHL-DATE and STRICT? are both non-NIL, then find the latest date\r\nstrictly earlier than SBHL-DATE.\nFind the latest date in the SBHL time date graph.  If SBHL-DATE is\nnot NIL, then find the latest date no later than SBHL-DATE.  If\nSBHL-DATE and STRICT? are both non-NIL, then find the latest date\nstrictly earlier than SBHL-DATE.")
    public static SubLObject sbhl_time_find_latest_date(SubLObject sbhl_date, SubLObject strictP) {
        if (sbhl_date == UNPROVIDED) {
            sbhl_date = NIL;
        }
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        return binary_tree.avl_tree_find_greatest($sbhl_time_date_graph$.getGlobalValue(), sbhl_date, strictP);
    }

    /**
     * Add SBHL-DATE to the SBHL time date graph.
     */
    @LispMethod(comment = "Add SBHL-DATE to the SBHL time date graph.")
    public static final SubLObject sbhl_time_add_date_alt(SubLObject sbhl_date) {
        SubLTrampolineFile.checkType(sbhl_date, SBHL_DATE_P);
        binary_tree.avl_tree_insert($sbhl_time_date_graph$.getGlobalValue(), sbhl_date);
        return NIL;
    }

    /**
     * Add SBHL-DATE to the SBHL time date graph.
     */
    @LispMethod(comment = "Add SBHL-DATE to the SBHL time date graph.")
    public static SubLObject sbhl_time_add_date(final SubLObject sbhl_date) {
        assert NIL != sbhl_date_p(sbhl_date) : "! sbhl_time_dates.sbhl_date_p(sbhl_date) " + ("sbhl_time_dates.sbhl_date_p(sbhl_date) " + "CommonSymbols.NIL != sbhl_time_dates.sbhl_date_p(sbhl_date) ") + sbhl_date;
        binary_tree.avl_tree_insert($sbhl_time_date_graph$.getGlobalValue(), sbhl_date);
        return NIL;
    }

    /**
     * Remove SBHL-DATE from the SBHL time date graph.
     */
    @LispMethod(comment = "Remove SBHL-DATE from the SBHL time date graph.")
    public static final SubLObject sbhl_time_remove_date_alt(SubLObject sbhl_date) {
        SubLTrampolineFile.checkType(sbhl_date, SBHL_DATE_P);
        binary_tree.avl_tree_remove($sbhl_time_date_graph$.getGlobalValue(), sbhl_date);
        return NIL;
    }

    /**
     * Remove SBHL-DATE from the SBHL time date graph.
     */
    @LispMethod(comment = "Remove SBHL-DATE from the SBHL time date graph.")
    public static SubLObject sbhl_time_remove_date(final SubLObject sbhl_date) {
        assert NIL != sbhl_date_p(sbhl_date) : "! sbhl_time_dates.sbhl_date_p(sbhl_date) " + ("sbhl_time_dates.sbhl_date_p(sbhl_date) " + "CommonSymbols.NIL != sbhl_time_dates.sbhl_date_p(sbhl_date) ") + sbhl_date;
        binary_tree.avl_tree_remove($sbhl_time_date_graph$.getGlobalValue(), sbhl_date);
        return NIL;
    }

    /**
     * Clear the SBHL time date graph.
     */
    @LispMethod(comment = "Clear the SBHL time date graph.")
    public static final SubLObject clear_sbhl_time_dates_alt() {
        binary_tree.clear_avl_tree($sbhl_time_date_graph$.getGlobalValue());
        return NIL;
    }

    /**
     * Clear the SBHL time date graph.
     */
    @LispMethod(comment = "Clear the SBHL time date graph.")
    public static SubLObject clear_sbhl_time_dates() {
        binary_tree.clear_avl_tree($sbhl_time_date_graph$.getGlobalValue());
        return NIL;
    }

    /**
     * Iterate through dates in the SBHL time date graph from earliest to
     * latest.  If EARLIEST is non-NIL, then iteration will not include any
     * date earlier than EARLIEST.  If LATEST is non-NIL, then iteration
     * will not include any date later than LATEST.  If DIRECTION is :FORWARD,
     * then iteration will proceed from earlier to later; if DIRECTION is
     * :BACKWARD, then iteration will proceed from later to earlier.
     */
    @LispMethod(comment = "Iterate through dates in the SBHL time date graph from earliest to\r\nlatest.  If EARLIEST is non-NIL, then iteration will not include any\r\ndate earlier than EARLIEST.  If LATEST is non-NIL, then iteration\r\nwill not include any date later than LATEST.  If DIRECTION is :FORWARD,\r\nthen iteration will proceed from earlier to later; if DIRECTION is\r\n:BACKWARD, then iteration will proceed from later to earlier.\nIterate through dates in the SBHL time date graph from earliest to\nlatest.  If EARLIEST is non-NIL, then iteration will not include any\ndate earlier than EARLIEST.  If LATEST is non-NIL, then iteration\nwill not include any date later than LATEST.  If DIRECTION is :FORWARD,\nthen iteration will proceed from earlier to later; if DIRECTION is\n:BACKWARD, then iteration will proceed from later to earlier.")
    public static final SubLObject new_sbhl_time_date_iterator_alt(SubLObject earliest, SubLObject latest, SubLObject direction) {
        if (earliest == UNPROVIDED) {
            earliest = NIL;
        }
        if (latest == UNPROVIDED) {
            latest = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = $FORWARD;
        }
        return binary_tree.new_avl_tree_sbhl_iterator($sbhl_time_date_graph$.getGlobalValue(), earliest, latest, direction);
    }

    /**
     * Iterate through dates in the SBHL time date graph from earliest to
     * latest.  If EARLIEST is non-NIL, then iteration will not include any
     * date earlier than EARLIEST.  If LATEST is non-NIL, then iteration
     * will not include any date later than LATEST.  If DIRECTION is :FORWARD,
     * then iteration will proceed from earlier to later; if DIRECTION is
     * :BACKWARD, then iteration will proceed from later to earlier.
     */
    @LispMethod(comment = "Iterate through dates in the SBHL time date graph from earliest to\r\nlatest.  If EARLIEST is non-NIL, then iteration will not include any\r\ndate earlier than EARLIEST.  If LATEST is non-NIL, then iteration\r\nwill not include any date later than LATEST.  If DIRECTION is :FORWARD,\r\nthen iteration will proceed from earlier to later; if DIRECTION is\r\n:BACKWARD, then iteration will proceed from later to earlier.\nIterate through dates in the SBHL time date graph from earliest to\nlatest.  If EARLIEST is non-NIL, then iteration will not include any\ndate earlier than EARLIEST.  If LATEST is non-NIL, then iteration\nwill not include any date later than LATEST.  If DIRECTION is :FORWARD,\nthen iteration will proceed from earlier to later; if DIRECTION is\n:BACKWARD, then iteration will proceed from later to earlier.")
    public static SubLObject new_sbhl_time_date_iterator(SubLObject earliest, SubLObject latest, SubLObject direction) {
        if (earliest == UNPROVIDED) {
            earliest = NIL;
        }
        if (latest == UNPROVIDED) {
            latest = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = $FORWARD;
        }
        return binary_tree.new_avl_tree_sbhl_iterator($sbhl_time_date_graph$.getGlobalValue(), earliest, latest, direction);
    }

    /**
     * Iterate over the dates in the SBHL time date graph, binding DATE to each
     * and executing BODY in its scope.  If EARLIEST is non-NIL, then iteration will
     * not include any date earlier than EARLIEST.  If LATEST is non-NIL, then
     * iteration will not include any date later than LATEST.  Iteration halts as
     * soon as the value of DONE is non-NIL.
     */
    @LispMethod(comment = "Iterate over the dates in the SBHL time date graph, binding DATE to each\r\nand executing BODY in its scope.  If EARLIEST is non-NIL, then iteration will\r\nnot include any date earlier than EARLIEST.  If LATEST is non-NIL, then\r\niteration will not include any date later than LATEST.  Iteration halts as\r\nsoon as the value of DONE is non-NIL.\nIterate over the dates in the SBHL time date graph, binding DATE to each\nand executing BODY in its scope.  If EARLIEST is non-NIL, then iteration will\nnot include any date earlier than EARLIEST.  If LATEST is non-NIL, then\niteration will not include any date later than LATEST.  Iteration halts as\nsoon as the value of DONE is non-NIL.")
    public static final SubLObject do_sbhl_time_dates_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject date = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt4);
                    date = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt4);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt4);
                            if (NIL == member(current_1, $list_alt5, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt4);
                        }
                        {
                            SubLObject earliest_tail = property_list_member($EARLIEST, current);
                            SubLObject earliest = (NIL != earliest_tail) ? ((SubLObject) (cadr(earliest_tail))) : NIL;
                            SubLObject latest_tail = property_list_member($LATEST, current);
                            SubLObject latest = (NIL != latest_tail) ? ((SubLObject) (cadr(latest_tail))) : NIL;
                            SubLObject direction_tail = property_list_member($DIRECTION, current);
                            SubLObject direction = (NIL != direction_tail) ? ((SubLObject) (cadr(direction_tail))) : $FORWARD;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject iterator = $sym11$ITERATOR;
                                return list(CLET, list(list(iterator, list(NEW_SBHL_TIME_DATE_ITERATOR, earliest, latest, direction))), listS(DO_SBHL_ITERATOR, list(date, iterator, $DONE, done), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iterate over the dates in the SBHL time date graph, binding DATE to each
     * and executing BODY in its scope.  If EARLIEST is non-NIL, then iteration will
     * not include any date earlier than EARLIEST.  If LATEST is non-NIL, then
     * iteration will not include any date later than LATEST.  Iteration halts as
     * soon as the value of DONE is non-NIL.
     */
    @LispMethod(comment = "Iterate over the dates in the SBHL time date graph, binding DATE to each\r\nand executing BODY in its scope.  If EARLIEST is non-NIL, then iteration will\r\nnot include any date earlier than EARLIEST.  If LATEST is non-NIL, then\r\niteration will not include any date later than LATEST.  Iteration halts as\r\nsoon as the value of DONE is non-NIL.\nIterate over the dates in the SBHL time date graph, binding DATE to each\nand executing BODY in its scope.  If EARLIEST is non-NIL, then iteration will\nnot include any date earlier than EARLIEST.  If LATEST is non-NIL, then\niteration will not include any date later than LATEST.  Iteration halts as\nsoon as the value of DONE is non-NIL.")
    public static SubLObject do_sbhl_time_dates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject date = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        date = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list4);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list4);
            if (NIL == member(current_$1, $list5, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list4);
        }
        final SubLObject earliest_tail = property_list_member($EARLIEST, current);
        final SubLObject earliest = (NIL != earliest_tail) ? cadr(earliest_tail) : NIL;
        final SubLObject latest_tail = property_list_member($LATEST, current);
        final SubLObject latest = (NIL != latest_tail) ? cadr(latest_tail) : NIL;
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : $FORWARD;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject iterator = $sym11$ITERATOR;
        return list(CLET, list(list(iterator, list(NEW_SBHL_TIME_DATE_ITERATOR, earliest, latest, direction))), listS(DO_SBHL_ITERATOR, list(date, iterator, $DONE, done), append(body, NIL)));
    }

    /**
     * Return the minimum date (according to SBHL-DATE<) linked to NODE,
     * the link tag, and link supports.  If MT is non-NIL, then it is
     * used to set mt-relevance.
     */
    @LispMethod(comment = "Return the minimum date (according to SBHL-DATE<) linked to NODE,\r\nthe link tag, and link supports.  If MT is non-NIL, then it is\r\nused to set mt-relevance.\nReturn the minimum date (according to SBHL-DATE<) linked to NODE,\nthe link tag, and link supports.  If MT is non-NIL, then it is\nused to set mt-relevance.")
    public static final SubLObject sbhl_time_date_min_linked_date_alt(SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_date_p(node)) {
            return values(node, $WEAK, NIL);
        } else {
            if (NIL != sbhl_time_utilities.hl_date_point_p(node)) {
                return values(sbhl_time_utilities.hl_interval_of_endpoint(node), $WEAK, NIL);
            } else {
                if (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_date_min_linked_date_int($sbhl_time_object_date_predicate_links$.getGlobalValue(), node, mt);
                } else {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_date_min_linked_date_int($sbhl_time_object_date_inverse_links$.getGlobalValue(), node, mt);
                }
            }
        }
    }

    /**
     * Return the minimum date (according to SBHL-DATE<) linked to NODE,
     * the link tag, and link supports.  If MT is non-NIL, then it is
     * used to set mt-relevance.
     */
    @LispMethod(comment = "Return the minimum date (according to SBHL-DATE<) linked to NODE,\r\nthe link tag, and link supports.  If MT is non-NIL, then it is\r\nused to set mt-relevance.\nReturn the minimum date (according to SBHL-DATE<) linked to NODE,\nthe link tag, and link supports.  If MT is non-NIL, then it is\nused to set mt-relevance.")
    public static SubLObject sbhl_time_date_min_linked_date(final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != sbhl_date_p(node)) {
            return values(node, $WEAK, NIL);
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(node)) {
            return values(sbhl_time_utilities.hl_interval_of_endpoint(node), $WEAK, NIL);
        }
        if (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) {
            return sbhl_time_date_min_linked_date_int($sbhl_time_object_date_predicate_links$.getGlobalValue(), node, mt);
        }
        return sbhl_time_date_min_linked_date_int($sbhl_time_object_date_inverse_links$.getGlobalValue(), node, mt);
    }

    public static final SubLObject sbhl_time_date_min_linked_date_int_alt(SubLObject link_table, SubLObject node, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject node_entry = dictionary.dictionary_lookup_without_values(link_table, node, UNPROVIDED);
                SubLObject min_date = NIL;
                SubLObject min_date_tag = NIL;
                SubLObject min_date_supports = NIL;
                if (NIL != node_entry) {
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                {
                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(node_entry));
                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject tag = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                            SubLObject tag_entry = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject iteration_state_2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tag_entry));
                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_2)) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject mt_3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_2);
                                                        SubLObject mt_entry = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_3)) {
                                                            {
                                                                SubLObject iteration_state_4 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_entry));
                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_4)) {
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject date = dictionary_contents.do_dictionary_contents_key_value(iteration_state_4);
                                                                        SubLObject supports = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if ((NIL == min_date) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_dateL(date, min_date))) {
                                                                            min_date = date;
                                                                            min_date_tag = tag;
                                                                            min_date_supports = supports;
                                                                        }
                                                                        iteration_state_4 = dictionary_contents.do_dictionary_contents_next(iteration_state_4);
                                                                    }
                                                                } 
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_4);
                                                            }
                                                        }
                                                        iteration_state_2 = dictionary_contents.do_dictionary_contents_next(iteration_state_2);
                                                    }
                                                } 
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_2);
                                            }
                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                        }
                                    } 
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return values(min_date, min_date_tag, min_date_supports);
            }
        }
    }

    public static SubLObject sbhl_time_date_min_linked_date_int(final SubLObject link_table, final SubLObject node, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject node_entry = dictionary.dictionary_lookup_without_values(link_table, node, UNPROVIDED);
        SubLObject min_date = NIL;
        SubLObject min_date_tag = NIL;
        SubLObject min_date_supports = NIL;
        if (NIL != node_entry) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(node_entry)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject tag = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject tag_entry = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject iteration_state_$2;
                    for (iteration_state_$2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tag_entry)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$2); iteration_state_$2 = dictionary_contents.do_dictionary_contents_next(iteration_state_$2)) {
                        thread.resetMultipleValues();
                        final SubLObject mt_$3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$2);
                        final SubLObject mt_entry = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$3)) {
                            SubLObject iteration_state_$3;
                            for (iteration_state_$3 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_entry)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$3); iteration_state_$3 = dictionary_contents.do_dictionary_contents_next(iteration_state_$3)) {
                                thread.resetMultipleValues();
                                final SubLObject date = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$3);
                                final SubLObject supports = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if ((NIL == min_date) || (NIL != sbhl_dateL(date, min_date))) {
                                    min_date = date;
                                    min_date_tag = tag;
                                    min_date_supports = supports;
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$3);
                        }
                    }
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$2);
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return values(min_date, min_date_tag, min_date_supports);
    }

    /**
     * Return the maximum date (according to SBHL-DATE<) linked to NODE,
     * the link tag, and link supports.  If MT is non-NIL, then it is
     * used to set mt-relevance.
     */
    @LispMethod(comment = "Return the maximum date (according to SBHL-DATE<) linked to NODE,\r\nthe link tag, and link supports.  If MT is non-NIL, then it is\r\nused to set mt-relevance.\nReturn the maximum date (according to SBHL-DATE<) linked to NODE,\nthe link tag, and link supports.  If MT is non-NIL, then it is\nused to set mt-relevance.")
    public static final SubLObject sbhl_time_date_max_linked_date_alt(SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_date_p(node)) {
            return values(node, $WEAK, NIL);
        } else {
            if (NIL != sbhl_time_utilities.hl_date_point_p(node)) {
                return values(sbhl_time_utilities.hl_interval_of_endpoint(node), $WEAK, NIL);
            } else {
                if (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_date_max_linked_date_int($sbhl_time_object_date_predicate_links$.getGlobalValue(), node, mt);
                } else {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_date_max_linked_date_int($sbhl_time_object_date_inverse_links$.getGlobalValue(), node, mt);
                }
            }
        }
    }

    /**
     * Return the maximum date (according to SBHL-DATE<) linked to NODE,
     * the link tag, and link supports.  If MT is non-NIL, then it is
     * used to set mt-relevance.
     */
    @LispMethod(comment = "Return the maximum date (according to SBHL-DATE<) linked to NODE,\r\nthe link tag, and link supports.  If MT is non-NIL, then it is\r\nused to set mt-relevance.\nReturn the maximum date (according to SBHL-DATE<) linked to NODE,\nthe link tag, and link supports.  If MT is non-NIL, then it is\nused to set mt-relevance.")
    public static SubLObject sbhl_time_date_max_linked_date(final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != sbhl_date_p(node)) {
            return values(node, $WEAK, NIL);
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(node)) {
            return values(sbhl_time_utilities.hl_interval_of_endpoint(node), $WEAK, NIL);
        }
        if (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) {
            return sbhl_time_date_max_linked_date_int($sbhl_time_object_date_predicate_links$.getGlobalValue(), node, mt);
        }
        return sbhl_time_date_max_linked_date_int($sbhl_time_object_date_inverse_links$.getGlobalValue(), node, mt);
    }

    public static final SubLObject sbhl_time_date_max_linked_date_int_alt(SubLObject link_table, SubLObject node, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject node_entry = dictionary.dictionary_lookup_without_values(link_table, node, UNPROVIDED);
                SubLObject max_date = NIL;
                SubLObject max_date_tag = NIL;
                SubLObject max_date_supports = NIL;
                if (NIL != node_entry) {
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                {
                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(node_entry));
                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject tag = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                            SubLObject tag_entry = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject iteration_state_5 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tag_entry));
                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_5)) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject mt_6 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_5);
                                                        SubLObject mt_entry = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_6)) {
                                                            {
                                                                SubLObject iteration_state_7 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_entry));
                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_7)) {
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject date = dictionary_contents.do_dictionary_contents_key_value(iteration_state_7);
                                                                        SubLObject supports = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if ((NIL == max_date) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_dateG(date, max_date))) {
                                                                            max_date = date;
                                                                            max_date_tag = tag;
                                                                            max_date_supports = supports;
                                                                        }
                                                                        iteration_state_7 = dictionary_contents.do_dictionary_contents_next(iteration_state_7);
                                                                    }
                                                                } 
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_7);
                                                            }
                                                        }
                                                        iteration_state_5 = dictionary_contents.do_dictionary_contents_next(iteration_state_5);
                                                    }
                                                } 
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_5);
                                            }
                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                        }
                                    } 
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return values(max_date, max_date_tag, max_date_supports);
            }
        }
    }

    public static SubLObject sbhl_time_date_max_linked_date_int(final SubLObject link_table, final SubLObject node, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject node_entry = dictionary.dictionary_lookup_without_values(link_table, node, UNPROVIDED);
        SubLObject max_date = NIL;
        SubLObject max_date_tag = NIL;
        SubLObject max_date_supports = NIL;
        if (NIL != node_entry) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(node_entry)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject tag = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject tag_entry = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject iteration_state_$5;
                    for (iteration_state_$5 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tag_entry)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$5); iteration_state_$5 = dictionary_contents.do_dictionary_contents_next(iteration_state_$5)) {
                        thread.resetMultipleValues();
                        final SubLObject mt_$6 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$5);
                        final SubLObject mt_entry = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$6)) {
                            SubLObject iteration_state_$6;
                            for (iteration_state_$6 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_entry)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$6); iteration_state_$6 = dictionary_contents.do_dictionary_contents_next(iteration_state_$6)) {
                                thread.resetMultipleValues();
                                final SubLObject date = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$6);
                                final SubLObject supports = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if ((NIL == max_date) || (NIL != sbhl_dateG(date, max_date))) {
                                    max_date = date;
                                    max_date_tag = tag;
                                    max_date_supports = supports;
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$6);
                        }
                    }
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$5);
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return values(max_date, max_date_tag, max_date_supports);
    }

    /**
     * Return either the maximum or minimum linked date depending
     * on the search direction.
     */
    @LispMethod(comment = "Return either the maximum or minimum linked date depending\r\non the search direction.\nReturn either the maximum or minimum linked date depending\non the search direction.")
    public static final SubLObject sbhl_time_date_relevant_linked_date_alt(SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction()) ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_date_min_linked_date(node, mt))) : com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_date_max_linked_date(node, mt);
    }

    /**
     * Return either the maximum or minimum linked date depending
     * on the search direction.
     */
    @LispMethod(comment = "Return either the maximum or minimum linked date depending\r\non the search direction.\nReturn either the maximum or minimum linked date depending\non the search direction.")
    public static SubLObject sbhl_time_date_relevant_linked_date(final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction()) ? sbhl_time_date_min_linked_date(node, mt) : sbhl_time_date_max_linked_date(node, mt);
    }/**
     * Return either the maximum or minimum linked date depending
     * on the search direction.
     */


    /**
     * Return T iff there is a link between NODE and some date.
     */
    @LispMethod(comment = "Return T iff there is a link between NODE and some date.")
    public static final SubLObject sbhl_time_date_node_links_to_dateP_alt(SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject successP = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        successP = (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_dates_link_existsP($sbhl_time_object_date_predicate_links$.getGlobalValue(), node))) : com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_dates_link_existsP($sbhl_time_object_date_inverse_links$.getGlobalValue(), node);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return successP;
            }
        }
    }

    /**
     * Return T iff there is a link between NODE and some date.
     */
    @LispMethod(comment = "Return T iff there is a link between NODE and some date.")
    public static SubLObject sbhl_time_date_node_links_to_dateP(final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            successP = (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) ? sbhl_time_dates_link_existsP($sbhl_time_object_date_predicate_links$.getGlobalValue(), node) : sbhl_time_dates_link_existsP($sbhl_time_object_date_inverse_links$.getGlobalValue(), node);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }

    /**
     * Return T iff there is a link between DATE and some node.
     */
    @LispMethod(comment = "Return T iff there is a link between DATE and some node.")
    public static final SubLObject sbhl_time_date_date_links_to_nodeP_alt(SubLObject date, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject successP = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        successP = (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_dates_link_existsP($sbhl_time_date_object_predicate_links$.getGlobalValue(), date))) : com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_dates_link_existsP($sbhl_time_date_object_inverse_links$.getGlobalValue(), date);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return successP;
            }
        }
    }

    @LispMethod(comment = "Return T iff there is a link between DATE and some node.")
    public static SubLObject sbhl_time_date_date_links_to_nodeP(final SubLObject date, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            successP = (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) ? sbhl_time_dates_link_existsP($sbhl_time_date_object_predicate_links$.getGlobalValue(), date) : sbhl_time_dates_link_existsP($sbhl_time_date_object_inverse_links$.getGlobalValue(), date);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }

    public static final SubLObject sbhl_time_dates_link_existsP_alt(SubLObject link_table, SubLObject obj) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject obj_entry = dictionary.dictionary_lookup_without_values(link_table, obj, UNPROVIDED);
                SubLObject linkP = NIL;
                if (NIL != obj_entry) {
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(obj_entry));
                        while (!((NIL != linkP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                            thread.resetMultipleValues();
                            {
                                SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject tag_entry = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject iteration_state_8 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tag_entry));
                                    while (!((NIL != linkP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_8)))) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state_8);
                                            SubLObject mt_entry = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                linkP = makeBoolean(NIL == dictionary.dictionary_empty_p(mt_entry));
                                            }
                                            iteration_state_8 = dictionary_contents.do_dictionary_contents_next(iteration_state_8);
                                        }
                                    } 
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_8);
                                }
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                }
                return linkP;
            }
        }
    }

    public static SubLObject sbhl_time_dates_link_existsP(final SubLObject link_table, final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject obj_entry = dictionary.dictionary_lookup_without_values(link_table, obj, UNPROVIDED);
        SubLObject linkP = NIL;
        if (NIL != obj_entry) {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(obj_entry)); (NIL == linkP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject tag_entry = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject iteration_state_$8;
                for (iteration_state_$8 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tag_entry)); (NIL == linkP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$8)); iteration_state_$8 = dictionary_contents.do_dictionary_contents_next(iteration_state_$8)) {
                    thread.resetMultipleValues();
                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$8);
                    final SubLObject mt_entry = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                        linkP = makeBoolean(NIL == dictionary.dictionary_empty_p(mt_entry));
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$8);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return linkP;
    }

    public static final SubLObject sbhl_time_date_node_date_link_supports_alt(SubLObject node, SubLObject tag, SubLObject date, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction()) ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_date_link_supports_int($sbhl_time_object_date_predicate_links$.getGlobalValue(), node, tag, date, mt))) : com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_date_link_supports_int($sbhl_time_object_date_inverse_links$.getGlobalValue(), node, tag, date, mt);
    }

    public static SubLObject sbhl_time_date_node_date_link_supports(final SubLObject node, final SubLObject tag, final SubLObject date, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction()) ? sbhl_time_date_link_supports_int($sbhl_time_object_date_predicate_links$.getGlobalValue(), node, tag, date, mt) : sbhl_time_date_link_supports_int($sbhl_time_object_date_inverse_links$.getGlobalValue(), node, tag, date, mt);
    }

    public static final SubLObject sbhl_time_date_date_node_link_supports_alt(SubLObject date, SubLObject tag, SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction()) ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_date_link_supports_int($sbhl_time_date_object_predicate_links$.getGlobalValue(), date, tag, node, mt))) : com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_date_link_supports_int($sbhl_time_date_object_inverse_links$.getGlobalValue(), date, tag, node, mt);
    }

    public static SubLObject sbhl_time_date_date_node_link_supports(final SubLObject date, final SubLObject tag, final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction()) ? sbhl_time_date_link_supports_int($sbhl_time_date_object_predicate_links$.getGlobalValue(), date, tag, node, mt) : sbhl_time_date_link_supports_int($sbhl_time_date_object_inverse_links$.getGlobalValue(), date, tag, node, mt);
    }

    public static final SubLObject sbhl_time_date_link_supports_int_alt(SubLObject link_table, SubLObject obj1, SubLObject tag, SubLObject obj2, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject obj1_entry = dictionary.dictionary_lookup_without_values(link_table, obj1, UNPROVIDED);
                SubLObject supports = NIL;
                if (NIL != obj1_entry) {
                    {
                        SubLObject tag_entry = dictionary.dictionary_lookup_without_values(obj1_entry, tag, UNPROVIDED);
                        if (NIL != tag_entry) {
                            {
                                SubLObject mt_var = mt;
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                        {
                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tag_entry));
                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject mt_9 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                    SubLObject mt_entry = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_9)) {
                                                        supports = append(supports, dictionary.dictionary_lookup_without_values(mt_entry, obj2, UNPROVIDED));
                                                    }
                                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                }
                                            } 
                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                        }
                                    } finally {
                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
                return supports;
            }
        }
    }

    public static SubLObject sbhl_time_date_link_supports_int(final SubLObject link_table, final SubLObject obj1, final SubLObject tag, final SubLObject obj2, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject obj1_entry = dictionary.dictionary_lookup_without_values(link_table, obj1, UNPROVIDED);
        SubLObject supports = NIL;
        if (NIL != obj1_entry) {
            final SubLObject tag_entry = dictionary.dictionary_lookup_without_values(obj1_entry, tag, UNPROVIDED);
            if (NIL != tag_entry) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                    SubLObject iteration_state;
                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tag_entry)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                        thread.resetMultipleValues();
                        final SubLObject mt_$9 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        final SubLObject mt_entry = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$9)) {
                            supports = append(supports, dictionary.dictionary_lookup_without_values(mt_entry, obj2, UNPROVIDED));
                        }
                    }
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return supports;
    }

    public static final SubLObject clear_sbhl_time_date_link_tables_alt() {
        dictionary.clear_dictionary($sbhl_time_date_object_predicate_links$.getGlobalValue());
        dictionary.clear_dictionary($sbhl_time_date_object_inverse_links$.getGlobalValue());
        dictionary.clear_dictionary($sbhl_time_object_date_predicate_links$.getGlobalValue());
        dictionary.clear_dictionary($sbhl_time_object_date_inverse_links$.getGlobalValue());
        return NIL;
    }

    public static SubLObject clear_sbhl_time_date_link_tables() {
        dictionary.clear_dictionary($sbhl_time_date_object_predicate_links$.getGlobalValue());
        dictionary.clear_dictionary($sbhl_time_date_object_inverse_links$.getGlobalValue());
        dictionary.clear_dictionary($sbhl_time_object_date_predicate_links$.getGlobalValue());
        dictionary.clear_dictionary($sbhl_time_object_date_inverse_links$.getGlobalValue());
        return NIL;
    }

    /**
     * Add a support for a link between OBJ1 and OBJ2 in MT.
     * Return T iff a new link is added.
     */
    @LispMethod(comment = "Add a support for a link between OBJ1 and OBJ2 in MT.\r\nReturn T iff a new link is added.\nAdd a support for a link between OBJ1 and OBJ2 in MT.\nReturn T iff a new link is added.")
    public static final SubLObject sbhl_time_dates_add_link_support_alt(SubLObject support, SubLObject link_tag, SubLObject obj1, SubLObject obj2, SubLObject mt) {
        {
            SubLObject interval1 = sbhl_time_utilities.hl_interval_of_endpoint(obj1);
            SubLObject interval2 = sbhl_time_utilities.hl_interval_of_endpoint(obj2);
            SubLObject link_addedP = NIL;
            if ((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_date_p(interval1)) && (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_date_p(interval2))) {
                link_addedP = com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_dates_add_link_support_int($sbhl_time_date_object_predicate_links$.getGlobalValue(), support, link_tag, interval1, obj2, mt);
                com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_dates_add_link_support_int($sbhl_time_object_date_inverse_links$.getGlobalValue(), support, link_tag, obj2, interval1, mt);
                com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_add_date(interval1);
            } else {
                if ((NIL == com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_date_p(interval1)) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_date_p(interval2))) {
                    link_addedP = com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_dates_add_link_support_int($sbhl_time_object_date_predicate_links$.getGlobalValue(), support, link_tag, obj1, interval2, mt);
                    com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_dates_add_link_support_int($sbhl_time_date_object_inverse_links$.getGlobalValue(), support, link_tag, interval2, obj1, mt);
                    com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_add_date(interval2);
                }
            }
            return link_addedP;
        }
    }

    @LispMethod(comment = "Add a support for a link between OBJ1 and OBJ2 in MT.\r\nReturn T iff a new link is added.\nAdd a support for a link between OBJ1 and OBJ2 in MT.\nReturn T iff a new link is added.")
    public static SubLObject sbhl_time_dates_add_link_support(final SubLObject support, final SubLObject link_tag, final SubLObject obj1, final SubLObject obj2, final SubLObject mt) {
        final SubLObject interval1 = sbhl_time_utilities.hl_interval_of_endpoint(obj1);
        final SubLObject interval2 = sbhl_time_utilities.hl_interval_of_endpoint(obj2);
        SubLObject link_addedP = NIL;
        if ((NIL != sbhl_date_p(interval1)) && (NIL == sbhl_date_p(interval2))) {
            link_addedP = sbhl_time_dates_add_link_support_int($sbhl_time_date_object_predicate_links$.getGlobalValue(), support, link_tag, interval1, obj2, mt);
            sbhl_time_dates_add_link_support_int($sbhl_time_object_date_inverse_links$.getGlobalValue(), support, link_tag, obj2, interval1, mt);
            sbhl_time_add_date(interval1);
        } else
            if ((NIL == sbhl_date_p(interval1)) && (NIL != sbhl_date_p(interval2))) {
                link_addedP = sbhl_time_dates_add_link_support_int($sbhl_time_object_date_predicate_links$.getGlobalValue(), support, link_tag, obj1, interval2, mt);
                sbhl_time_dates_add_link_support_int($sbhl_time_date_object_inverse_links$.getGlobalValue(), support, link_tag, interval2, obj1, mt);
                sbhl_time_add_date(interval2);
            }

        return link_addedP;
    }/**
     * Add a support for a link between OBJ1 and OBJ2 in MT.
     * Return T iff a new link is added.
     */


    public static final SubLObject sbhl_time_dates_add_link_support_int_alt(SubLObject link_table, SubLObject support, SubLObject link_tag, SubLObject key, SubLObject value, SubLObject mt) {
        {
            SubLObject key_entry = dictionary.dictionary_lookup_without_values(link_table, key, UNPROVIDED);
            SubLObject link_addedP = NIL;
            if (NIL == key_entry) {
                key_entry = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
                dictionary.dictionary_enter(link_table, key, key_entry);
            }
            {
                SubLObject tag_entry = dictionary.dictionary_lookup_without_values(key_entry, link_tag, UNPROVIDED);
                if (NIL == tag_entry) {
                    tag_entry = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                    dictionary.dictionary_enter(key_entry, link_tag, tag_entry);
                }
                {
                    SubLObject mt_entry = dictionary.dictionary_lookup_without_values(tag_entry, mt, UNPROVIDED);
                    if (NIL == mt_entry) {
                        mt_entry = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
                        dictionary.dictionary_enter(tag_entry, mt, mt_entry);
                    }
                    {
                        SubLObject value_entry = dictionary.dictionary_lookup_without_values(mt_entry, value, UNPROVIDED);
                        if (NIL == value_entry) {
                            link_addedP = T;
                        }
                        if (NIL == subl_promotions.memberP(support, value_entry, symbol_function(EQUAL), UNPROVIDED)) {
                            dictionary_utilities.dictionary_push(mt_entry, value, support);
                        }
                    }
                }
            }
            return link_addedP;
        }
    }

    public static SubLObject sbhl_time_dates_add_link_support_int(final SubLObject link_table, final SubLObject support, final SubLObject link_tag, final SubLObject key, final SubLObject value, final SubLObject mt) {
        SubLObject key_entry = dictionary.dictionary_lookup_without_values(link_table, key, UNPROVIDED);
        SubLObject link_addedP = NIL;
        if (NIL == key_entry) {
            key_entry = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
            dictionary.dictionary_enter(link_table, key, key_entry);
        }
        SubLObject tag_entry = dictionary.dictionary_lookup_without_values(key_entry, link_tag, UNPROVIDED);
        if (NIL == tag_entry) {
            tag_entry = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            dictionary.dictionary_enter(key_entry, link_tag, tag_entry);
        }
        SubLObject mt_entry = dictionary.dictionary_lookup_without_values(tag_entry, mt, UNPROVIDED);
        if (NIL == mt_entry) {
            mt_entry = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
            dictionary.dictionary_enter(tag_entry, mt, mt_entry);
        }
        final SubLObject value_entry = dictionary.dictionary_lookup_without_values(mt_entry, value, UNPROVIDED);
        if (NIL == value_entry) {
            link_addedP = T;
        }
        if (NIL == subl_promotions.memberP(support, value_entry, symbol_function(EQUAL), UNPROVIDED)) {
            dictionary_utilities.dictionary_push(mt_entry, value, support);
        }
        return link_addedP;
    }

    /**
     * Remove a support for the link between OBJ1 and OBJ2 in MT.  If SUPPORT
     * was the last support for the link, then the link is removed.
     */
    @LispMethod(comment = "Remove a support for the link between OBJ1 and OBJ2 in MT.  If SUPPORT\r\nwas the last support for the link, then the link is removed.\nRemove a support for the link between OBJ1 and OBJ2 in MT.  If SUPPORT\nwas the last support for the link, then the link is removed.")
    public static final SubLObject sbhl_time_dates_remove_link_support_alt(SubLObject support, SubLObject link_tag, SubLObject obj1, SubLObject obj2, SubLObject mt) {
        {
            SubLObject interval1 = sbhl_time_utilities.hl_interval_of_endpoint(obj1);
            SubLObject interval2 = sbhl_time_utilities.hl_interval_of_endpoint(obj2);
            if ((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_date_p(interval1)) && (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_date_p(interval2))) {
                com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_dates_remove_link_support_int($sbhl_time_date_object_predicate_links$.getGlobalValue(), support, link_tag, interval1, obj2, mt);
                com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_dates_remove_link_support_int($sbhl_time_object_date_inverse_links$.getGlobalValue(), support, link_tag, obj2, interval1, mt);
                if (!((NIL != dictionary.dictionary_lookup_without_values($sbhl_time_date_object_predicate_links$.getGlobalValue(), interval1, UNPROVIDED)) || (NIL != dictionary.dictionary_lookup_without_values($sbhl_time_date_object_inverse_links$.getGlobalValue(), interval1, UNPROVIDED)))) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_remove_date(interval1);
                }
            } else {
                if ((NIL == com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_date_p(interval1)) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_date_p(interval2))) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_dates_remove_link_support_int($sbhl_time_object_date_predicate_links$.getGlobalValue(), support, link_tag, obj1, interval2, mt);
                    com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_dates_remove_link_support_int($sbhl_time_date_object_inverse_links$.getGlobalValue(), support, link_tag, interval2, obj1, mt);
                    if (!((NIL != dictionary.dictionary_lookup_without_values($sbhl_time_date_object_predicate_links$.getGlobalValue(), interval2, UNPROVIDED)) || (NIL != dictionary.dictionary_lookup_without_values($sbhl_time_date_object_inverse_links$.getGlobalValue(), interval2, UNPROVIDED)))) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_remove_date(interval2);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Remove a support for the link between OBJ1 and OBJ2 in MT.  If SUPPORT\r\nwas the last support for the link, then the link is removed.\nRemove a support for the link between OBJ1 and OBJ2 in MT.  If SUPPORT\nwas the last support for the link, then the link is removed.")
    public static SubLObject sbhl_time_dates_remove_link_support(final SubLObject support, final SubLObject link_tag, final SubLObject obj1, final SubLObject obj2, final SubLObject mt) {
        final SubLObject interval1 = sbhl_time_utilities.hl_interval_of_endpoint(obj1);
        final SubLObject interval2 = sbhl_time_utilities.hl_interval_of_endpoint(obj2);
        if ((NIL != sbhl_date_p(interval1)) && (NIL == sbhl_date_p(interval2))) {
            sbhl_time_dates_remove_link_support_int($sbhl_time_date_object_predicate_links$.getGlobalValue(), support, link_tag, interval1, obj2, mt);
            sbhl_time_dates_remove_link_support_int($sbhl_time_object_date_inverse_links$.getGlobalValue(), support, link_tag, obj2, interval1, mt);
            if ((NIL == dictionary.dictionary_lookup_without_values($sbhl_time_date_object_predicate_links$.getGlobalValue(), interval1, UNPROVIDED)) && (NIL == dictionary.dictionary_lookup_without_values($sbhl_time_date_object_inverse_links$.getGlobalValue(), interval1, UNPROVIDED))) {
                sbhl_time_remove_date(interval1);
            }
        } else
            if ((NIL == sbhl_date_p(interval1)) && (NIL != sbhl_date_p(interval2))) {
                sbhl_time_dates_remove_link_support_int($sbhl_time_object_date_predicate_links$.getGlobalValue(), support, link_tag, obj1, interval2, mt);
                sbhl_time_dates_remove_link_support_int($sbhl_time_date_object_inverse_links$.getGlobalValue(), support, link_tag, interval2, obj1, mt);
                if ((NIL == dictionary.dictionary_lookup_without_values($sbhl_time_date_object_predicate_links$.getGlobalValue(), interval2, UNPROVIDED)) && (NIL == dictionary.dictionary_lookup_without_values($sbhl_time_date_object_inverse_links$.getGlobalValue(), interval2, UNPROVIDED))) {
                    sbhl_time_remove_date(interval2);
                }
            }

        return NIL;
    }/**
     * Remove a support for the link between OBJ1 and OBJ2 in MT.  If SUPPORT
     * was the last support for the link, then the link is removed.
     */


    public static final SubLObject sbhl_time_dates_remove_link_support_int_alt(SubLObject link_table, SubLObject support, SubLObject link_tag, SubLObject key, SubLObject value, SubLObject mt) {
        {
            SubLObject key_entry = dictionary.dictionary_lookup_without_values(link_table, key, UNPROVIDED);
            if (NIL != key_entry) {
                {
                    SubLObject tag_entry = dictionary.dictionary_lookup_without_values(key_entry, link_tag, UNPROVIDED);
                    if (NIL != tag_entry) {
                        {
                            SubLObject mt_entry = dictionary.dictionary_lookup_without_values(tag_entry, mt, UNPROVIDED);
                            if (NIL != mt_entry) {
                                dictionary_utilities.dictionary_delete_from_value(mt_entry, value, support, UNPROVIDED, UNPROVIDED);
                                if (NIL != dictionary.dictionary_empty_p(mt_entry)) {
                                    dictionary.dictionary_remove(tag_entry, mt);
                                    if (NIL != dictionary.dictionary_empty_p(tag_entry)) {
                                        dictionary.dictionary_remove(key_entry, link_tag);
                                        if (NIL != dictionary.dictionary_empty_p(key_entry)) {
                                            dictionary.dictionary_remove(key_entry, mt);
                                        }
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

    public static SubLObject sbhl_time_dates_remove_link_support_int(final SubLObject link_table, final SubLObject support, final SubLObject link_tag, final SubLObject key, final SubLObject value, final SubLObject mt) {
        final SubLObject key_entry = dictionary.dictionary_lookup_without_values(link_table, key, UNPROVIDED);
        if (NIL != key_entry) {
            final SubLObject tag_entry = dictionary.dictionary_lookup_without_values(key_entry, link_tag, UNPROVIDED);
            if (NIL != tag_entry) {
                final SubLObject mt_entry = dictionary.dictionary_lookup_without_values(tag_entry, mt, UNPROVIDED);
                if (NIL != mt_entry) {
                    dictionary_utilities.dictionary_delete_from_value(mt_entry, value, support, UNPROVIDED, UNPROVIDED);
                    if (NIL != dictionary.dictionary_empty_p(mt_entry)) {
                        dictionary.dictionary_remove(tag_entry, mt);
                        if (NIL != dictionary.dictionary_empty_p(tag_entry)) {
                            dictionary.dictionary_remove(key_entry, link_tag);
                            if (NIL != dictionary.dictionary_empty_p(key_entry)) {
                                dictionary.dictionary_remove(key_entry, mt);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Return the node from NODES which has a link to the minimal date among the
     * dates linked to by nodes from NODES.  Also returns the minimal date.
     */
    @LispMethod(comment = "Return the node from NODES which has a link to the minimal date among the\r\ndates linked to by nodes from NODES.  Also returns the minimal date.\nReturn the node from NODES which has a link to the minimal date among the\ndates linked to by nodes from NODES.  Also returns the minimal date.")
    public static final SubLObject sbhl_time_date_node_with_min_date_link_alt(SubLObject nodes, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != list_utilities.singletonP(nodes)) {
                {
                    SubLObject node = nodes.first();
                    thread.resetMultipleValues();
                    {
                        SubLObject date = com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_date_min_linked_date(node, mt);
                        SubLObject tag = thread.secondMultipleValue();
                        SubLObject supports = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        return NIL != date ? ((SubLObject) (values(node, date, tag))) : values(NIL, NIL, NIL);
                    }
                }
            } else {
                {
                    SubLObject min_node = NIL;
                    SubLObject min_date = NIL;
                    SubLObject min_tag = NIL;
                    SubLObject cdolist_list_var = nodes;
                    SubLObject node = NIL;
                    for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                        thread.resetMultipleValues();
                        {
                            SubLObject node_min_date = com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_date_min_linked_date(node, mt);
                            SubLObject node_min_date_tag = thread.secondMultipleValue();
                            SubLObject node_min_date_supports = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if ((NIL != node_min_date) && ((NIL == min_date) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_dateL(node_min_date, min_date)))) {
                                min_node = node;
                                min_date = node_min_date;
                                min_tag = node_min_date_tag;
                            }
                        }
                    }
                    return values(min_node, min_date, min_tag);
                }
            }
        }
    }

    @LispMethod(comment = "Return the node from NODES which has a link to the minimal date among the\r\ndates linked to by nodes from NODES.  Also returns the minimal date.\nReturn the node from NODES which has a link to the minimal date among the\ndates linked to by nodes from NODES.  Also returns the minimal date.")
    public static SubLObject sbhl_time_date_node_with_min_date_link(final SubLObject nodes, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.singletonP(nodes)) {
            final SubLObject node = nodes.first();
            thread.resetMultipleValues();
            final SubLObject date = sbhl_time_date_min_linked_date(node, mt);
            final SubLObject tag = thread.secondMultipleValue();
            final SubLObject supports = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return NIL != date ? values(node, date, tag) : values(NIL, NIL, NIL);
        }
        SubLObject min_node = NIL;
        SubLObject min_date = NIL;
        SubLObject min_tag = NIL;
        SubLObject cdolist_list_var = nodes;
        SubLObject node2 = NIL;
        node2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject node_min_date = sbhl_time_date_min_linked_date(node2, mt);
            final SubLObject node_min_date_tag = thread.secondMultipleValue();
            final SubLObject node_min_date_supports = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != node_min_date) && ((NIL == min_date) || (NIL != sbhl_dateL(node_min_date, min_date)))) {
                min_node = node2;
                min_date = node_min_date;
                min_tag = node_min_date_tag;
            }
            cdolist_list_var = cdolist_list_var.rest();
            node2 = cdolist_list_var.first();
        } 
        return values(min_node, min_date, min_tag);
    }/**
     * Return the node from NODES which has a link to the minimal date among the
     * dates linked to by nodes from NODES.  Also returns the minimal date.
     */


    /**
     * Return the node from NODES which has a link to the maximal date among the
     * dates linked to by nodes from NODES.  Also returns the maximal date.
     */
    @LispMethod(comment = "Return the node from NODES which has a link to the maximal date among the\r\ndates linked to by nodes from NODES.  Also returns the maximal date.\nReturn the node from NODES which has a link to the maximal date among the\ndates linked to by nodes from NODES.  Also returns the maximal date.")
    public static final SubLObject sbhl_time_date_node_with_max_date_link_alt(SubLObject nodes, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != list_utilities.singletonP(nodes)) {
                {
                    SubLObject node = nodes.first();
                    thread.resetMultipleValues();
                    {
                        SubLObject date = com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_date_max_linked_date(node, mt);
                        SubLObject tag = thread.secondMultipleValue();
                        SubLObject supports = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        return NIL != date ? ((SubLObject) (values(node, date, tag))) : values(NIL, NIL, NIL);
                    }
                }
            } else {
                {
                    SubLObject max_node = NIL;
                    SubLObject max_date = NIL;
                    SubLObject max_tag = NIL;
                    SubLObject cdolist_list_var = nodes;
                    SubLObject node = NIL;
                    for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                        thread.resetMultipleValues();
                        {
                            SubLObject node_max_date = com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_date_max_linked_date(node, mt);
                            SubLObject node_max_date_tag = thread.secondMultipleValue();
                            SubLObject node_max_date_supports = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if ((NIL != node_max_date) && ((NIL == max_date) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_dateG(node_max_date, max_date)))) {
                                max_node = node;
                                max_date = node_max_date;
                                max_tag = node_max_date_tag;
                            }
                        }
                    }
                    return values(max_node, max_date, max_tag);
                }
            }
        }
    }

    @LispMethod(comment = "Return the node from NODES which has a link to the maximal date among the\r\ndates linked to by nodes from NODES.  Also returns the maximal date.\nReturn the node from NODES which has a link to the maximal date among the\ndates linked to by nodes from NODES.  Also returns the maximal date.")
    public static SubLObject sbhl_time_date_node_with_max_date_link(final SubLObject nodes, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.singletonP(nodes)) {
            final SubLObject node = nodes.first();
            thread.resetMultipleValues();
            final SubLObject date = sbhl_time_date_max_linked_date(node, mt);
            final SubLObject tag = thread.secondMultipleValue();
            final SubLObject supports = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return NIL != date ? values(node, date, tag) : values(NIL, NIL, NIL);
        }
        SubLObject max_node = NIL;
        SubLObject max_date = NIL;
        SubLObject max_tag = NIL;
        SubLObject cdolist_list_var = nodes;
        SubLObject node2 = NIL;
        node2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject node_max_date = sbhl_time_date_max_linked_date(node2, mt);
            final SubLObject node_max_date_tag = thread.secondMultipleValue();
            final SubLObject node_max_date_supports = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != node_max_date) && ((NIL == max_date) || (NIL != sbhl_dateG(node_max_date, max_date)))) {
                max_node = node2;
                max_date = node_max_date;
                max_tag = node_max_date_tag;
            }
            cdolist_list_var = cdolist_list_var.rest();
            node2 = cdolist_list_var.first();
        } 
        return values(max_node, max_date, max_tag);
    }/**
     * Return the node from NODES which has a link to the maximal date among the
     * dates linked to by nodes from NODES.  Also returns the maximal date.
     */


    /**
     * Find the optimal node accessible from NODE to begin a search through
     * SBHL time dates.
     */
    @LispMethod(comment = "Find the optimal node accessible from NODE to begin a search through\r\nSBHL time dates.\nFind the optimal node accessible from NODE to begin a search through\nSBHL time dates.")
    public static final SubLObject sbhl_time_date_find_search_node_alt(SubLObject node, SubLObject mt, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject search_node = NIL;
                SubLObject search_date = NIL;
                SubLObject search_tag = NIL;
                SubLTrampolineFile.checkType(depth, INTEGERP);
                {
                    SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding(thread);
                    try {
                        sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(depth, thread);
                        sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind(NIL, thread);
                        if (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) {
                            thread.resetMultipleValues();
                            {
                                SubLObject search_node_10 = com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_date_node_with_min_date_link(sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), node, mt, UNPROVIDED), mt);
                                SubLObject search_date_11 = thread.secondMultipleValue();
                                SubLObject search_tag_12 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                search_node = search_node_10;
                                search_date = search_date_11;
                                search_tag = search_tag_12;
                            }
                        } else {
                            thread.resetMultipleValues();
                            {
                                SubLObject search_node_13 = com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_date_node_with_max_date_link(sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), node, mt, UNPROVIDED), mt);
                                SubLObject search_date_14 = thread.secondMultipleValue();
                                SubLObject search_tag_15 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                search_node = search_node_13;
                                search_date = search_date_14;
                                search_tag = search_tag_15;
                            }
                        }
                    } finally {
                        sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind(_prev_bind_1, thread);
                        sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(search_node, search_date, search_tag);
            }
        }
    }

    @LispMethod(comment = "Find the optimal node accessible from NODE to begin a search through\r\nSBHL time dates.\nFind the optimal node accessible from NODE to begin a search through\nSBHL time dates.")
    public static SubLObject sbhl_time_date_find_search_node(final SubLObject node, SubLObject mt, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject search_node = NIL;
        SubLObject search_date = NIL;
        SubLObject search_tag = NIL;
        assert NIL != integerp(depth) : "! integerp(depth) " + ("Types.integerp(depth) " + "CommonSymbols.NIL != Types.integerp(depth) ") + depth;
        final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding(thread);
        try {
            sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(depth, thread);
            sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind(NIL, thread);
            if (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) {
                thread.resetMultipleValues();
                final SubLObject search_node_$10 = sbhl_time_date_node_with_min_date_link(sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), node, mt, UNPROVIDED), mt);
                final SubLObject search_date_$11 = thread.secondMultipleValue();
                final SubLObject search_tag_$12 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                search_node = search_node_$10;
                search_date = search_date_$11;
                search_tag = search_tag_$12;
            } else {
                thread.resetMultipleValues();
                final SubLObject search_node_$11 = sbhl_time_date_node_with_max_date_link(sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), node, mt, UNPROVIDED), mt);
                final SubLObject search_date_$12 = thread.secondMultipleValue();
                final SubLObject search_tag_$13 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                search_node = search_node_$11;
                search_date = search_date_$12;
                search_tag = search_tag_$13;
            }
        } finally {
            sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind(_prev_bind_2, thread);
            sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0, thread);
        }
        return values(search_node, search_date, search_tag);
    }/**
     * Find the optimal node accessible from NODE to begin a search through
     * SBHL time dates.
     */


    public static final SubLObject destructure_sbhl_time_date_link_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject link_tag = NIL;
                    SubLObject link_mt = NIL;
                    SubLObject link_node = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt23);
                    link_tag = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt23);
                    link_mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt23);
                    link_node = current.first();
                    current = current.rest();
                    {
                        SubLObject link_supports = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt23);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject link = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt23);
                                link = current.first();
                                current = current.rest();
                                {
                                    SubLObject body = current;
                                    if (NIL == link_supports) {
                                        {
                                            SubLObject link_supports_16 = $sym24$LINK_SUPPORTS;
                                            return listS(DESTRUCTURE_SBHL_TIME_DATE_LINK, list(link_tag, link_mt, link_node, link_supports_16), link, list(IGNORE, link_supports_16), append(body, NIL));
                                        }
                                    } else {
                                        return listS(CDESTRUCTURING_BIND, list(link_tag, link_mt, link_node, $sym28$_OPTIONAL, link_supports), link, append(body, NIL));
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt23);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject destructure_sbhl_time_date_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list23);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_tag = NIL;
        SubLObject link_mt = NIL;
        SubLObject link_node = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        link_tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list23);
        link_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list23);
        link_node = current.first();
        current = current.rest();
        final SubLObject link_supports = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list23);
            return NIL;
        }
        current = temp;
        SubLObject link = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        link = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (NIL == link_supports) {
            final SubLObject link_supports_$16 = $sym24$LINK_SUPPORTS;
            return listS(DESTRUCTURE_SBHL_TIME_DATE_LINK, list(link_tag, link_mt, link_node, link_supports_$16), link, list(IGNORE, link_supports_$16), append(body, NIL));
        }
        return listS(CDESTRUCTURING_BIND, list(link_tag, link_mt, link_node, $sym28$_OPTIONAL, link_supports), link, append(body, NIL));
    }

    public static final SubLObject do_sbhl_time_date_links_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt29);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject link0 = NIL;
                    SubLObject link1 = NIL;
                    SubLObject link2 = NIL;
                    SubLObject node = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    link0 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    link1 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    link2 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    node = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_17 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt29);
                            current_17 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt29);
                            if (NIL == member(current_17, $list_alt30, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_17 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt29);
                        }
                        {
                            SubLObject date_lower_bound_tail = property_list_member($DATE_LOWER_BOUND, current);
                            SubLObject date_lower_bound = (NIL != date_lower_bound_tail) ? ((SubLObject) (cadr(date_lower_bound_tail))) : NIL;
                            SubLObject date_upper_bound_tail = property_list_member($DATE_UPPER_BOUND, current);
                            SubLObject date_upper_bound = (NIL != date_upper_bound_tail) ? ((SubLObject) (cadr(date_upper_bound_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject iterator = $sym33$ITERATOR;
                                SubLObject raw_links = $sym34$RAW_LINKS;
                                return list(CLET, list(list(iterator, list(NEW_SBHL_TIME_DATE_LINK_ITERATOR, node, $list_alt36, date_lower_bound, date_upper_bound))), list(DO_SBHL_ITERATOR, list(raw_links, iterator, $DONE, done), listS(CDESTRUCTURING_BIND, list(link0, link1, link2), raw_links, append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_sbhl_time_date_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link0 = NIL;
        SubLObject link2 = NIL;
        SubLObject link3 = NIL;
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list29);
        link0 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        link2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        link3 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        node = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$17 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list29);
            current_$17 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list29);
            if (NIL == member(current_$17, $list30, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$17 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list29);
        }
        final SubLObject date_lower_bound_tail = property_list_member($DATE_LOWER_BOUND, current);
        final SubLObject date_lower_bound = (NIL != date_lower_bound_tail) ? cadr(date_lower_bound_tail) : NIL;
        final SubLObject date_upper_bound_tail = property_list_member($DATE_UPPER_BOUND, current);
        final SubLObject date_upper_bound = (NIL != date_upper_bound_tail) ? cadr(date_upper_bound_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject iterator = $sym33$ITERATOR;
        final SubLObject raw_links = $sym34$RAW_LINKS;
        return list(CLET, list(list(iterator, list(NEW_SBHL_TIME_DATE_LINK_ITERATOR, node, $list36, date_lower_bound, date_upper_bound))), list(DO_SBHL_ITERATOR, list(raw_links, iterator, $DONE, done), listS(CDESTRUCTURING_BIND, list(link0, link2, link3), raw_links, append(body, NIL))));
    }

    public static final SubLObject do_sbhl_time_date_links_between_dates_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt37);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject link0 = NIL;
                    SubLObject link1 = NIL;
                    SubLObject date0 = NIL;
                    SubLObject date1 = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt37);
                    link0 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt37);
                    link1 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt37);
                    date0 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt37);
                    date1 = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_18 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt37);
                            current_18 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt37);
                            if (NIL == member(current_18, $list_alt38, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_18 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt37);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject iterator = $sym39$ITERATOR;
                                SubLObject raw_links = $sym40$RAW_LINKS;
                                return list(CLET, list(list(iterator, listS(NEW_SBHL_TIME_DATE_DATE_LINK_ITERATOR, date0, date1, $list_alt42))), list(DO_SBHL_ITERATOR, list(raw_links, iterator, $DONE, done), listS(CDESTRUCTURING_BIND, list(link0, link1), raw_links, append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_sbhl_time_date_links_between_dates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link0 = NIL;
        SubLObject link2 = NIL;
        SubLObject date0 = NIL;
        SubLObject date2 = NIL;
        destructuring_bind_must_consp(current, datum, $list37);
        link0 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        link2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        date0 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        date2 = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$18 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list37);
            current_$18 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list37);
            if (NIL == member(current_$18, $list38, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$18 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list37);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject iterator = $sym39$ITERATOR;
        final SubLObject raw_links = $sym40$RAW_LINKS;
        return list(CLET, list(list(iterator, listS(NEW_SBHL_TIME_DATE_DATE_LINK_ITERATOR, date0, date2, $list42))), list(DO_SBHL_ITERATOR, list(raw_links, iterator, $DONE, done), listS(CDESTRUCTURING_BIND, list(link0, link2), raw_links, append(body, NIL))));
    }

    public static final SubLObject do_sbhl_time_date_date_links_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt43);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject link0 = NIL;
                    SubLObject link1 = NIL;
                    SubLObject date = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    link0 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    link1 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    date = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_19 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt43);
                            current_19 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt43);
                            if (NIL == member(current_19, $list_alt30, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_19 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt43);
                        }
                        {
                            SubLObject date_lower_bound_tail = property_list_member($DATE_LOWER_BOUND, current);
                            SubLObject date_lower_bound = (NIL != date_lower_bound_tail) ? ((SubLObject) (cadr(date_lower_bound_tail))) : NIL;
                            SubLObject date_upper_bound_tail = property_list_member($DATE_UPPER_BOUND, current);
                            SubLObject date_upper_bound = (NIL != date_upper_bound_tail) ? ((SubLObject) (cadr(date_upper_bound_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject date0 = $sym44$DATE0;
                                SubLObject date1 = $sym45$DATE1;
                                return list(CLET, list(date0, date1), list(PIF, $list_alt47, list(CSETQ, date0, list(FIF, list(CAND, date_lower_bound, list($sym1$SBHL_DATE_, date, date_lower_bound)), date_lower_bound, date), date1, date_upper_bound), list(CSETQ, date0, date_lower_bound, date1, list(FIF, list(CAND, date_upper_bound, list($sym51$SBHL_DATE_, date, date_upper_bound)), date_upper_bound, date))), listS(DO_SBHL_TIME_DATE_LINKS_BETWEEN_DATES, list(link0, link1, date0, date1, $DONE, done), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_sbhl_time_date_date_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list43);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link0 = NIL;
        SubLObject link2 = NIL;
        SubLObject date = NIL;
        destructuring_bind_must_consp(current, datum, $list43);
        link0 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list43);
        link2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list43);
        date = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$19 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list43);
            current_$19 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list43);
            if (NIL == member(current_$19, $list30, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$19 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list43);
        }
        final SubLObject date_lower_bound_tail = property_list_member($DATE_LOWER_BOUND, current);
        final SubLObject date_lower_bound = (NIL != date_lower_bound_tail) ? cadr(date_lower_bound_tail) : NIL;
        final SubLObject date_upper_bound_tail = property_list_member($DATE_UPPER_BOUND, current);
        final SubLObject date_upper_bound = (NIL != date_upper_bound_tail) ? cadr(date_upper_bound_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject date2 = $sym44$DATE0;
        final SubLObject date3 = $sym45$DATE1;
        return list(CLET, list(date2, date3), list(PIF, $list47, list(CSETQ, date2, list(FIF, list(CAND, date_lower_bound, list($sym1$SBHL_DATE_, date, date_lower_bound)), date_lower_bound, date), date3, date_upper_bound), list(CSETQ, date2, date_lower_bound, date3, list(FIF, list(CAND, date_upper_bound, list($sym51$SBHL_DATE_, date, date_upper_bound)), date_upper_bound, date))), listS(DO_SBHL_TIME_DATE_LINKS_BETWEEN_DATES, list(link0, link2, date2, date3, $DONE, done), append(body, NIL)));
    }

    public static final SubLObject new_sbhl_time_date_link_iterator_alt(SubLObject node, SubLObject direction, SubLObject date_lower_bound, SubLObject date_upper_bound) {
        if (direction == UNPROVIDED) {
            direction = sbhl_link_vars.get_sbhl_link_direction();
        }
        if (date_lower_bound == UNPROVIDED) {
            date_lower_bound = NIL;
        }
        if (date_upper_bound == UNPROVIDED) {
            date_upper_bound = NIL;
        }
        {
            SubLObject tag_link_table = (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(direction)) ? ((SubLObject) (dictionary.dictionary_lookup_without_values($sbhl_time_object_date_predicate_links$.getGlobalValue(), node, UNPROVIDED))) : dictionary.dictionary_lookup_without_values($sbhl_time_object_date_inverse_links$.getGlobalValue(), node, UNPROVIDED);
            SubLObject state = NIL;
            if (NIL != tag_link_table) {
                if (!(((NIL != date_lower_bound) && (NIL != date_upper_bound)) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_dateG(date_lower_bound, date_upper_bound)))) {
                    state = com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_date_link_iterator_state(tag_link_table, direction, date_lower_bound, date_upper_bound);
                }
            }
            return NIL != state ? ((SubLObject) (new_sbhl_iterator(state, SBHL_TIME_DATE_LINK_ITERATOR_DONE, SBHL_TIME_DATE_LINK_ITERATOR_NEXT, SBHL_TIME_DATE_LINK_ITERATOR_FINALIZE))) : new_sbhl_null_iterator();
        }
    }

    public static SubLObject new_sbhl_time_date_link_iterator(final SubLObject node, SubLObject direction, SubLObject date_lower_bound, SubLObject date_upper_bound) {
        if (direction == UNPROVIDED) {
            direction = sbhl_link_vars.get_sbhl_link_direction();
        }
        if (date_lower_bound == UNPROVIDED) {
            date_lower_bound = NIL;
        }
        if (date_upper_bound == UNPROVIDED) {
            date_upper_bound = NIL;
        }
        final SubLObject tag_link_table = (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(direction)) ? dictionary.dictionary_lookup_without_values($sbhl_time_object_date_predicate_links$.getGlobalValue(), node, UNPROVIDED) : dictionary.dictionary_lookup_without_values($sbhl_time_object_date_inverse_links$.getGlobalValue(), node, UNPROVIDED);
        SubLObject state = NIL;
        if ((NIL != tag_link_table) && (((NIL == date_lower_bound) || (NIL == date_upper_bound)) || (NIL == sbhl_dateG(date_lower_bound, date_upper_bound)))) {
            state = sbhl_time_date_link_iterator_state(tag_link_table, direction, date_lower_bound, date_upper_bound);
        }
        return NIL != state ? new_sbhl_iterator(state, SBHL_TIME_DATE_LINK_ITERATOR_DONE, SBHL_TIME_DATE_LINK_ITERATOR_NEXT, SBHL_TIME_DATE_LINK_ITERATOR_FINALIZE) : new_sbhl_null_iterator();
    }

    public static final SubLObject sbhl_time_date_link_iterator_state_alt(SubLObject tag_link_table, SubLObject direction, SubLObject date_lower_bound, SubLObject date_upper_bound) {
        {
            SubLObject generating_iterator = com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.new_sbhl_time_date_link_tag_iterator(tag_link_table);
            SubLObject link_to_optimal_date = sbhl_iteration_next(generating_iterator);
            return NIL != link_to_optimal_date ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_date_link_iterator_state_int(link_to_optimal_date, generating_iterator, direction, date_lower_bound, date_upper_bound))) : NIL;
        }
    }

    public static SubLObject sbhl_time_date_link_iterator_state(final SubLObject tag_link_table, final SubLObject direction, final SubLObject date_lower_bound, final SubLObject date_upper_bound) {
        final SubLObject generating_iterator = new_sbhl_time_date_link_tag_iterator(tag_link_table);
        final SubLObject link_to_optimal_date = sbhl_iteration_next(generating_iterator);
        return NIL != link_to_optimal_date ? sbhl_time_date_link_iterator_state_int(link_to_optimal_date, generating_iterator, direction, date_lower_bound, date_upper_bound) : NIL;
    }

    public static final SubLObject sbhl_time_date_link_iterator_state_int_alt(SubLObject link_to_optimal_date, SubLObject generating_iterator, SubLObject direction, SubLObject date_lower_bound, SubLObject date_upper_bound) {
        {
            SubLObject state = make_vector(TWO_INTEGER, UNPROVIDED);
            SubLObject optimal_date = third(link_to_optimal_date);
            if (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(direction)) {
                {
                    SubLObject done_var = NIL;
                    while (NIL == done_var) {
                        {
                            SubLObject link_to_date = sbhl_iteration_next(generating_iterator);
                            if (NIL != link_to_date) {
                                {
                                    SubLObject date = third(link_to_date);
                                    if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_dateL(date, optimal_date)) {
                                        link_to_optimal_date = link_to_date;
                                        optimal_date = date;
                                    }
                                }
                            }
                            done_var = sublisp_null(link_to_date);
                        }
                    } 
                    {
                        SubLObject iterator_lower_bound = ((NIL != date_lower_bound) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_dateL(optimal_date, date_lower_bound))) ? ((SubLObject) (date_lower_bound)) : optimal_date;
                        set_aref(state, ZERO_INTEGER, link_to_optimal_date);
                        set_aref(state, ONE_INTEGER, com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.new_sbhl_time_date_date_link_iterator(iterator_lower_bound, date_upper_bound, direction));
                    }
                }
            } else {
                {
                    SubLObject done_var = NIL;
                    while (NIL == done_var) {
                        {
                            SubLObject link_to_date = sbhl_iteration_next(generating_iterator);
                            if (NIL != link_to_date) {
                                {
                                    SubLObject date = third(link_to_date);
                                    if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_dateG(date, optimal_date)) {
                                        link_to_optimal_date = link_to_date;
                                        optimal_date = date;
                                    }
                                }
                            }
                            done_var = sublisp_null(link_to_date);
                        }
                    } 
                    {
                        SubLObject iterator_upper_bound = ((NIL != date_upper_bound) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_dateG(optimal_date, date_upper_bound))) ? ((SubLObject) (date_upper_bound)) : optimal_date;
                        set_aref(state, ZERO_INTEGER, link_to_optimal_date);
                        set_aref(state, ONE_INTEGER, com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.new_sbhl_time_date_date_link_iterator(date_lower_bound, iterator_upper_bound, direction));
                    }
                }
            }
            return state;
        }
    }

    public static SubLObject sbhl_time_date_link_iterator_state_int(SubLObject link_to_optimal_date, final SubLObject generating_iterator, final SubLObject direction, final SubLObject date_lower_bound, final SubLObject date_upper_bound) {
        final SubLObject state = make_vector(TWO_INTEGER, UNPROVIDED);
        SubLObject optimal_date = third(link_to_optimal_date);
        if (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(direction)) {
            SubLObject link_to_date;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = sublisp_null(link_to_date)) {
                link_to_date = sbhl_iteration_next(generating_iterator);
                if (NIL != link_to_date) {
                    final SubLObject date = third(link_to_date);
                    if (NIL != sbhl_dateL(date, optimal_date)) {
                        link_to_optimal_date = link_to_date;
                        optimal_date = date;
                    }
                }
            }
            final SubLObject iterator_lower_bound = ((NIL != date_lower_bound) && (NIL != sbhl_dateL(optimal_date, date_lower_bound))) ? date_lower_bound : optimal_date;
            set_aref(state, ZERO_INTEGER, link_to_optimal_date);
            set_aref(state, ONE_INTEGER, new_sbhl_time_date_date_link_iterator(iterator_lower_bound, date_upper_bound, direction));
        } else {
            SubLObject link_to_date;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = sublisp_null(link_to_date)) {
                link_to_date = sbhl_iteration_next(generating_iterator);
                if (NIL != link_to_date) {
                    final SubLObject date = third(link_to_date);
                    if (NIL != sbhl_dateG(date, optimal_date)) {
                        link_to_optimal_date = link_to_date;
                        optimal_date = date;
                    }
                }
            }
            final SubLObject iterator_upper_bound = ((NIL != date_upper_bound) && (NIL != sbhl_dateG(optimal_date, date_upper_bound))) ? date_upper_bound : optimal_date;
            set_aref(state, ZERO_INTEGER, link_to_optimal_date);
            set_aref(state, ONE_INTEGER, new_sbhl_time_date_date_link_iterator(date_lower_bound, iterator_upper_bound, direction));
        }
        return state;
    }

    public static final SubLObject sbhl_time_date_link_iterator_done_alt(SubLObject state) {
        return makeBoolean((NIL == aref(state, ONE_INTEGER)) || (NIL != sbhl_iteration_doneP(aref(state, ONE_INTEGER))));
    }

    public static SubLObject sbhl_time_date_link_iterator_done(final SubLObject state) {
        return makeBoolean((NIL == aref(state, ONE_INTEGER)) || (NIL != sbhl_iteration_doneP(aref(state, ONE_INTEGER))));
    }

    public static final SubLObject sbhl_time_date_link_iterator_next_alt(SubLObject state) {
        {
            SubLObject result = sbhl_iteration_next(aref(state, ONE_INTEGER));
            return NIL != result ? ((SubLObject) (cons(aref(state, ZERO_INTEGER), result))) : NIL;
        }
    }

    public static SubLObject sbhl_time_date_link_iterator_next(final SubLObject state) {
        final SubLObject result = sbhl_iteration_next(aref(state, ONE_INTEGER));
        return NIL != result ? cons(aref(state, ZERO_INTEGER), result) : NIL;
    }

    public static final SubLObject sbhl_time_date_link_iterator_finalize_alt(SubLObject state) {
        return NIL != aref(state, ONE_INTEGER) ? ((SubLObject) (sbhl_iteration_finalize(aref(state, ONE_INTEGER)))) : T;
    }

    public static SubLObject sbhl_time_date_link_iterator_finalize(final SubLObject state) {
        return NIL != aref(state, ONE_INTEGER) ? sbhl_iteration_finalize(aref(state, ONE_INTEGER)) : T;
    }

    public static final SubLObject new_sbhl_time_date_link_to_date_iterator_alt(SubLObject node, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = sbhl_link_vars.get_sbhl_link_direction();
        }
        {
            SubLObject tag_link_table = (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(direction)) ? ((SubLObject) (dictionary.dictionary_lookup_without_values($sbhl_time_object_date_predicate_links$.getGlobalValue(), node, UNPROVIDED))) : dictionary.dictionary_lookup_without_values($sbhl_time_object_date_inverse_links$.getGlobalValue(), node, UNPROVIDED);
            return NIL != tag_link_table ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.new_sbhl_time_date_link_tag_iterator(tag_link_table))) : new_sbhl_null_iterator();
        }
    }

    public static SubLObject new_sbhl_time_date_link_to_date_iterator(final SubLObject node, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = sbhl_link_vars.get_sbhl_link_direction();
        }
        final SubLObject tag_link_table = (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(direction)) ? dictionary.dictionary_lookup_without_values($sbhl_time_object_date_predicate_links$.getGlobalValue(), node, UNPROVIDED) : dictionary.dictionary_lookup_without_values($sbhl_time_object_date_inverse_links$.getGlobalValue(), node, UNPROVIDED);
        return NIL != tag_link_table ? new_sbhl_time_date_link_tag_iterator(tag_link_table) : new_sbhl_null_iterator();
    }

    public static final SubLObject new_sbhl_time_date_date_link_iterator_alt(SubLObject earliest, SubLObject latest, SubLObject direction) {
        return new_sbhl_iterator(com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_date_date_link_iterator_state(earliest, latest, direction), SBHL_TIME_DATE_DATE_LINK_ITERATOR_DONE, SBHL_TIME_DATE_DATE_LINK_ITERATOR_NEXT, SBHL_TIME_DATE_DATE_LINK_ITERATOR_FINALIZE);
    }

    public static SubLObject new_sbhl_time_date_date_link_iterator(final SubLObject earliest, final SubLObject latest, final SubLObject direction) {
        return new_sbhl_iterator(sbhl_time_date_date_link_iterator_state(earliest, latest, direction), SBHL_TIME_DATE_DATE_LINK_ITERATOR_DONE, SBHL_TIME_DATE_DATE_LINK_ITERATOR_NEXT, SBHL_TIME_DATE_DATE_LINK_ITERATOR_FINALIZE);
    }

    public static final SubLObject sbhl_time_date_date_link_iterator_state_alt(SubLObject earliest, SubLObject latest, SubLObject direction) {
        {
            SubLObject state = make_vector(FOUR_INTEGER, UNPROVIDED);
            set_aref(state, ONE_INTEGER, direction);
            set_aref(state, THREE_INTEGER, NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(direction) ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.new_sbhl_time_date_iterator(earliest, latest, $FORWARD))) : com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.new_sbhl_time_date_iterator(earliest, latest, $BACKWARD));
            return state;
        }
    }

    public static SubLObject sbhl_time_date_date_link_iterator_state(final SubLObject earliest, final SubLObject latest, final SubLObject direction) {
        final SubLObject state = make_vector(FOUR_INTEGER, UNPROVIDED);
        set_aref(state, ONE_INTEGER, direction);
        set_aref(state, THREE_INTEGER, NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(direction) ? new_sbhl_time_date_iterator(earliest, latest, $FORWARD) : new_sbhl_time_date_iterator(earliest, latest, $BACKWARD));
        return state;
    }

    public static final SubLObject sbhl_time_date_date_link_iterator_done_alt(SubLObject state) {
        return makeBoolean(((NIL == aref(state, TWO_INTEGER)) || (NIL != sbhl_iteration_doneP(aref(state, TWO_INTEGER)))) && ((NIL == aref(state, THREE_INTEGER)) || (NIL != sbhl_iteration_doneP(aref(state, THREE_INTEGER)))));
    }

    public static SubLObject sbhl_time_date_date_link_iterator_done(final SubLObject state) {
        return makeBoolean(((NIL == aref(state, TWO_INTEGER)) || (NIL != sbhl_iteration_doneP(aref(state, TWO_INTEGER)))) && ((NIL == aref(state, THREE_INTEGER)) || (NIL != sbhl_iteration_doneP(aref(state, THREE_INTEGER)))));
    }

    public static final SubLObject sbhl_time_date_date_link_iterator_next_alt(SubLObject state) {
        {
            SubLObject iterator = aref(state, TWO_INTEGER);
            SubLObject result = NIL;
            SubLObject doneP = NIL;
            while (!((NIL != result) || (NIL != doneP))) {
                if (NIL == iterator) {
                    {
                        SubLObject date_iterator = aref(state, THREE_INTEGER);
                        if (NIL == date_iterator) {
                            doneP = T;
                        } else {
                            if (NIL != sbhl_iteration_doneP(date_iterator)) {
                                sbhl_iteration_finalize(date_iterator);
                                set_aref(state, THREE_INTEGER, NIL);
                                doneP = T;
                            } else {
                                {
                                    SubLObject next_date = sbhl_iteration_next(date_iterator);
                                    if (NIL != next_date) {
                                        {
                                            SubLObject tag_table = (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(aref(state, ONE_INTEGER))) ? ((SubLObject) (dictionary.dictionary_lookup_without_values($sbhl_time_date_object_predicate_links$.getGlobalValue(), next_date, UNPROVIDED))) : dictionary.dictionary_lookup_without_values($sbhl_time_date_object_inverse_links$.getGlobalValue(), next_date, UNPROVIDED);
                                            if (NIL != tag_table) {
                                                iterator = com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.new_sbhl_time_date_link_tag_iterator(tag_table);
                                                set_aref(state, ZERO_INTEGER, next_date);
                                                set_aref(state, TWO_INTEGER, iterator);
                                            }
                                        }
                                    } else {
                                        sbhl_iteration_finalize(date_iterator);
                                        set_aref(state, THREE_INTEGER, NIL);
                                        doneP = T;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (NIL != sbhl_iteration_doneP(iterator)) {
                        sbhl_iteration_finalize(iterator);
                        iterator = NIL;
                        set_aref(state, TWO_INTEGER, NIL);
                    } else {
                        result = sbhl_iteration_next(iterator);
                    }
                }
            } 
            return NIL != result ? ((SubLObject) (list(list($WEAK, hlmt_relevance.$time_inference_mt$.getGlobalValue(), aref(state, ZERO_INTEGER)), result))) : NIL;
        }
    }

    public static SubLObject sbhl_time_date_date_link_iterator_next(final SubLObject state) {
        SubLObject iterator = aref(state, TWO_INTEGER);
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        while ((NIL == result) && (NIL == doneP)) {
            if (NIL == iterator) {
                final SubLObject date_iterator = aref(state, THREE_INTEGER);
                if (NIL == date_iterator) {
                    doneP = T;
                } else
                    if (NIL != sbhl_iteration_doneP(date_iterator)) {
                        sbhl_iteration_finalize(date_iterator);
                        set_aref(state, THREE_INTEGER, NIL);
                        doneP = T;
                    } else {
                        final SubLObject next_date = sbhl_iteration_next(date_iterator);
                        if (NIL != next_date) {
                            final SubLObject tag_table = (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(aref(state, ONE_INTEGER))) ? dictionary.dictionary_lookup_without_values($sbhl_time_date_object_predicate_links$.getGlobalValue(), next_date, UNPROVIDED) : dictionary.dictionary_lookup_without_values($sbhl_time_date_object_inverse_links$.getGlobalValue(), next_date, UNPROVIDED);
                            if (NIL == tag_table) {
                                continue;
                            }
                            iterator = new_sbhl_time_date_link_tag_iterator(tag_table);
                            set_aref(state, ZERO_INTEGER, next_date);
                            set_aref(state, TWO_INTEGER, iterator);
                        } else {
                            sbhl_iteration_finalize(date_iterator);
                            set_aref(state, THREE_INTEGER, NIL);
                            doneP = T;
                        }
                    }

            } else
                if (NIL != sbhl_iteration_doneP(iterator)) {
                    sbhl_iteration_finalize(iterator);
                    iterator = NIL;
                    set_aref(state, TWO_INTEGER, NIL);
                } else {
                    result = sbhl_iteration_next(iterator);
                }

        } 
        return NIL != result ? list(list($WEAK, hlmt_relevance.$time_inference_mt$.getGlobalValue(), aref(state, ZERO_INTEGER)), result) : NIL;
    }

    public static final SubLObject sbhl_time_date_date_link_iterator_finalize_alt(SubLObject state) {
        if (NIL != aref(state, ONE_INTEGER)) {
            sbhl_iteration_finalize(aref(state, ONE_INTEGER));
        }
        if (NIL != aref(state, TWO_INTEGER)) {
            sbhl_iteration_finalize(aref(state, TWO_INTEGER));
        }
        return T;
    }

    public static SubLObject sbhl_time_date_date_link_iterator_finalize(final SubLObject state) {
        if (NIL != aref(state, ONE_INTEGER)) {
            sbhl_iteration_finalize(aref(state, ONE_INTEGER));
        }
        if (NIL != aref(state, TWO_INTEGER)) {
            sbhl_iteration_finalize(aref(state, TWO_INTEGER));
        }
        return T;
    }

    public static final SubLObject new_sbhl_time_date_link_tag_iterator_alt(SubLObject link_tag_table) {
        return new_sbhl_iterator(com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_date_link_tag_iterator_state(link_tag_table), SBHL_TIME_DATE_LINK_TAG_ITERATOR_DONE, SBHL_TIME_DATE_LINK_TAG_ITERATOR_NEXT, SBHL_TIME_DATE_LINK_TAG_ITERATOR_FINALIZE);
    }

    public static SubLObject new_sbhl_time_date_link_tag_iterator(final SubLObject link_tag_table) {
        return new_sbhl_iterator(sbhl_time_date_link_tag_iterator_state(link_tag_table), SBHL_TIME_DATE_LINK_TAG_ITERATOR_DONE, SBHL_TIME_DATE_LINK_TAG_ITERATOR_NEXT, SBHL_TIME_DATE_LINK_TAG_ITERATOR_FINALIZE);
    }

    public static final SubLObject sbhl_time_date_link_tag_iterator_state_alt(SubLObject link_tag_table) {
        {
            SubLObject state = make_vector(THREE_INTEGER, UNPROVIDED);
            set_aref(state, TWO_INTEGER, new_sbhl_dictionary_iterator(link_tag_table));
            return state;
        }
    }

    public static SubLObject sbhl_time_date_link_tag_iterator_state(final SubLObject link_tag_table) {
        final SubLObject state = make_vector(THREE_INTEGER, UNPROVIDED);
        set_aref(state, TWO_INTEGER, new_sbhl_dictionary_iterator(link_tag_table));
        return state;
    }

    public static final SubLObject sbhl_time_date_link_tag_iterator_done_alt(SubLObject state) {
        return makeBoolean(((NIL == aref(state, ONE_INTEGER)) || (NIL != sbhl_iteration_doneP(aref(state, ONE_INTEGER)))) && ((NIL == aref(state, TWO_INTEGER)) || (NIL != sbhl_iteration_doneP(aref(state, TWO_INTEGER)))));
    }

    public static SubLObject sbhl_time_date_link_tag_iterator_done(final SubLObject state) {
        return makeBoolean(((NIL == aref(state, ONE_INTEGER)) || (NIL != sbhl_iteration_doneP(aref(state, ONE_INTEGER)))) && ((NIL == aref(state, TWO_INTEGER)) || (NIL != sbhl_iteration_doneP(aref(state, TWO_INTEGER)))));
    }

    public static final SubLObject sbhl_time_date_link_tag_iterator_next_alt(SubLObject state) {
        {
            SubLObject iterator = aref(state, ONE_INTEGER);
            SubLObject result = NIL;
            SubLObject doneP = NIL;
            while (!((NIL != result) || (NIL != doneP))) {
                if (NIL == iterator) {
                    {
                        SubLObject generating_iterator = aref(state, TWO_INTEGER);
                        if (NIL == generating_iterator) {
                            doneP = T;
                        } else {
                            if (NIL != sbhl_iteration_doneP(generating_iterator)) {
                                sbhl_iteration_finalize(generating_iterator);
                                set_aref(state, TWO_INTEGER, NIL);
                                doneP = T;
                            } else {
                                {
                                    SubLObject tag_link = sbhl_iteration_next(generating_iterator);
                                    if (NIL != tag_link) {
                                        {
                                            SubLObject datum = tag_link;
                                            SubLObject current = datum;
                                            SubLObject tag = NIL;
                                            SubLObject tag_table = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt63);
                                            tag = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt63);
                                            tag_table = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                iterator = com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.new_sbhl_time_date_mt_link_iterator(tag_table);
                                                set_aref(state, ZERO_INTEGER, tag);
                                                set_aref(state, ONE_INTEGER, iterator);
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt63);
                                            }
                                        }
                                    } else {
                                        sbhl_iteration_finalize(generating_iterator);
                                        set_aref(state, TWO_INTEGER, NIL);
                                        doneP = T;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (NIL != sbhl_iteration_doneP(iterator)) {
                        sbhl_iteration_finalize(iterator);
                        iterator = NIL;
                        set_aref(state, ONE_INTEGER, NIL);
                    } else {
                        result = sbhl_iteration_next(iterator);
                    }
                }
            } 
            return NIL != result ? ((SubLObject) (cons(aref(state, ZERO_INTEGER), result))) : NIL;
        }
    }

    public static SubLObject sbhl_time_date_link_tag_iterator_next(final SubLObject state) {
        SubLObject iterator = aref(state, ONE_INTEGER);
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        while ((NIL == result) && (NIL == doneP)) {
            if (NIL == iterator) {
                final SubLObject generating_iterator = aref(state, TWO_INTEGER);
                if (NIL == generating_iterator) {
                    doneP = T;
                } else
                    if (NIL != sbhl_iteration_doneP(generating_iterator)) {
                        sbhl_iteration_finalize(generating_iterator);
                        set_aref(state, TWO_INTEGER, NIL);
                        doneP = T;
                    } else {
                        final SubLObject tag_link = sbhl_iteration_next(generating_iterator);
                        if (NIL != tag_link) {
                            SubLObject current;
                            final SubLObject datum = current = tag_link;
                            SubLObject tag = NIL;
                            SubLObject tag_table = NIL;
                            destructuring_bind_must_consp(current, datum, $list63);
                            tag = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list63);
                            tag_table = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                iterator = new_sbhl_time_date_mt_link_iterator(tag_table);
                                set_aref(state, ZERO_INTEGER, tag);
                                set_aref(state, ONE_INTEGER, iterator);
                            } else {
                                cdestructuring_bind_error(datum, $list63);
                            }
                        } else {
                            sbhl_iteration_finalize(generating_iterator);
                            set_aref(state, TWO_INTEGER, NIL);
                            doneP = T;
                        }
                    }

            } else
                if (NIL != sbhl_iteration_doneP(iterator)) {
                    sbhl_iteration_finalize(iterator);
                    iterator = NIL;
                    set_aref(state, ONE_INTEGER, NIL);
                } else {
                    result = sbhl_iteration_next(iterator);
                }

        } 
        return NIL != result ? cons(aref(state, ZERO_INTEGER), result) : NIL;
    }

    public static final SubLObject sbhl_time_date_link_tag_iterator_finalize_alt(SubLObject state) {
        if (NIL != aref(state, ONE_INTEGER)) {
            sbhl_iteration_finalize(aref(state, ONE_INTEGER));
        }
        if (NIL != aref(state, TWO_INTEGER)) {
            sbhl_iteration_finalize(aref(state, TWO_INTEGER));
        }
        return T;
    }

    public static SubLObject sbhl_time_date_link_tag_iterator_finalize(final SubLObject state) {
        if (NIL != aref(state, ONE_INTEGER)) {
            sbhl_iteration_finalize(aref(state, ONE_INTEGER));
        }
        if (NIL != aref(state, TWO_INTEGER)) {
            sbhl_iteration_finalize(aref(state, TWO_INTEGER));
        }
        return T;
    }

    public static final SubLObject new_sbhl_time_date_mt_link_iterator_alt(SubLObject mt_link_table) {
        return new_sbhl_iterator(com.cyc.cycjava.cycl.sbhl.sbhl_time_dates.sbhl_time_date_mt_link_iterator_state(mt_link_table), SBHL_TIME_DATE_MT_LINK_ITERATOR_DONE, SBHL_TIME_DATE_MT_LINK_ITERATOR_NEXT, SBHL_TIME_DATE_MT_LINK_ITERATOR_FINALIZE);
    }

    public static SubLObject new_sbhl_time_date_mt_link_iterator(final SubLObject mt_link_table) {
        return new_sbhl_iterator(sbhl_time_date_mt_link_iterator_state(mt_link_table), SBHL_TIME_DATE_MT_LINK_ITERATOR_DONE, SBHL_TIME_DATE_MT_LINK_ITERATOR_NEXT, SBHL_TIME_DATE_MT_LINK_ITERATOR_FINALIZE);
    }

    public static final SubLObject sbhl_time_date_mt_link_iterator_state_alt(SubLObject mt_link_table) {
        {
            SubLObject state = make_vector(THREE_INTEGER, UNPROVIDED);
            set_aref(state, TWO_INTEGER, new_sbhl_dictionary_iterator(mt_link_table));
            return state;
        }
    }

    public static SubLObject sbhl_time_date_mt_link_iterator_state(final SubLObject mt_link_table) {
        final SubLObject state = make_vector(THREE_INTEGER, UNPROVIDED);
        set_aref(state, TWO_INTEGER, new_sbhl_dictionary_iterator(mt_link_table));
        return state;
    }

    public static final SubLObject sbhl_time_date_mt_link_iterator_done_alt(SubLObject state) {
        return makeBoolean(((NIL == aref(state, ONE_INTEGER)) || (NIL != sbhl_iteration_doneP(aref(state, ONE_INTEGER)))) && ((NIL == aref(state, TWO_INTEGER)) || (NIL != sbhl_iteration_doneP(aref(state, TWO_INTEGER)))));
    }

    public static SubLObject sbhl_time_date_mt_link_iterator_done(final SubLObject state) {
        return makeBoolean(((NIL == aref(state, ONE_INTEGER)) || (NIL != sbhl_iteration_doneP(aref(state, ONE_INTEGER)))) && ((NIL == aref(state, TWO_INTEGER)) || (NIL != sbhl_iteration_doneP(aref(state, TWO_INTEGER)))));
    }

    public static final SubLObject sbhl_time_date_mt_link_iterator_next_alt(SubLObject state) {
        {
            SubLObject iterator = aref(state, ONE_INTEGER);
            SubLObject result = NIL;
            SubLObject doneP = NIL;
            while (!((NIL != result) || (NIL != doneP))) {
                if (NIL == iterator) {
                    {
                        SubLObject generating_iterator = aref(state, TWO_INTEGER);
                        if (NIL == generating_iterator) {
                            doneP = T;
                        } else {
                            if (NIL != sbhl_iteration_doneP(generating_iterator)) {
                                sbhl_iteration_finalize(generating_iterator);
                                set_aref(state, TWO_INTEGER, NIL);
                                doneP = T;
                            } else {
                                {
                                    SubLObject mt_link = sbhl_iteration_next(generating_iterator);
                                    if (NIL != mt_link) {
                                        {
                                            SubLObject datum = mt_link;
                                            SubLObject current = datum;
                                            SubLObject mt = NIL;
                                            SubLObject mt_table = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt67);
                                            mt = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt67);
                                            mt_table = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                    iterator = new_sbhl_dictionary_iterator(mt_table);
                                                    set_aref(state, ZERO_INTEGER, mt);
                                                    set_aref(state, ONE_INTEGER, iterator);
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt67);
                                            }
                                        }
                                    } else {
                                        sbhl_iteration_finalize(generating_iterator);
                                        set_aref(state, TWO_INTEGER, NIL);
                                        doneP = T;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (NIL != sbhl_iteration_doneP(iterator)) {
                        sbhl_iteration_finalize(iterator);
                        iterator = NIL;
                        set_aref(state, ONE_INTEGER, NIL);
                    } else {
                        result = sbhl_iteration_next(iterator);
                    }
                }
            } 
            return NIL != result ? ((SubLObject) (cons(aref(state, ZERO_INTEGER), result))) : NIL;
        }
    }

    public static SubLObject sbhl_time_date_mt_link_iterator_next(final SubLObject state) {
        SubLObject iterator = aref(state, ONE_INTEGER);
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        while ((NIL == result) && (NIL == doneP)) {
            if (NIL == iterator) {
                final SubLObject generating_iterator = aref(state, TWO_INTEGER);
                if (NIL == generating_iterator) {
                    doneP = T;
                } else
                    if (NIL != sbhl_iteration_doneP(generating_iterator)) {
                        sbhl_iteration_finalize(generating_iterator);
                        set_aref(state, TWO_INTEGER, NIL);
                        doneP = T;
                    } else {
                        final SubLObject mt_link = sbhl_iteration_next(generating_iterator);
                        if (NIL != mt_link) {
                            SubLObject current;
                            final SubLObject datum = current = mt_link;
                            SubLObject mt = NIL;
                            SubLObject mt_table = NIL;
                            destructuring_bind_must_consp(current, datum, $list67);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list67);
                            mt_table = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL == mt_relevance_macros.relevant_mtP(mt)) {
                                    continue;
                                }
                                iterator = new_sbhl_dictionary_iterator(mt_table);
                                set_aref(state, ZERO_INTEGER, mt);
                                set_aref(state, ONE_INTEGER, iterator);
                            } else {
                                cdestructuring_bind_error(datum, $list67);
                            }
                        } else {
                            sbhl_iteration_finalize(generating_iterator);
                            set_aref(state, TWO_INTEGER, NIL);
                            doneP = T;
                        }
                    }

            } else
                if (NIL != sbhl_iteration_doneP(iterator)) {
                    sbhl_iteration_finalize(iterator);
                    iterator = NIL;
                    set_aref(state, ONE_INTEGER, NIL);
                } else {
                    result = sbhl_iteration_next(iterator);
                }

        } 
        return NIL != result ? cons(aref(state, ZERO_INTEGER), result) : NIL;
    }

    public static final SubLObject sbhl_time_date_mt_link_iterator_finalize_alt(SubLObject state) {
        if (NIL != aref(state, ONE_INTEGER)) {
            sbhl_iteration_finalize(aref(state, ONE_INTEGER));
        }
        if (NIL != aref(state, TWO_INTEGER)) {
            sbhl_iteration_finalize(aref(state, TWO_INTEGER));
        }
        return T;
    }

    public static SubLObject sbhl_time_date_mt_link_iterator_finalize(final SubLObject state) {
        if (NIL != aref(state, ONE_INTEGER)) {
            sbhl_iteration_finalize(aref(state, ONE_INTEGER));
        }
        if (NIL != aref(state, TWO_INTEGER)) {
            sbhl_iteration_finalize(aref(state, TWO_INTEGER));
        }
        return T;
    }

    public static SubLObject declare_sbhl_time_dates_file() {
        declareFunction("sbhl_date_p", "SBHL-DATE-P", 1, 0, false);
        declareFunction("sbhl_dateE", "SBHL-DATE=", 2, 0, false);
        declareFunction("sbhl_dateL", "SBHL-DATE<", 2, 0, false);
        declareFunction("sbhl_dateLE", "SBHL-DATE<=", 2, 0, false);
        declareFunction("sbhl_dateG", "SBHL-DATE>", 2, 0, false);
        declareFunction("sbhl_dateGE", "SBHL-DATE>=", 2, 0, false);
        declareFunction("sbhl_date_betweenP", "SBHL-DATE-BETWEEN?", 3, 1, false);
        declareFunction("sbhl_time_find_earliest_date", "SBHL-TIME-FIND-EARLIEST-DATE", 0, 2, false);
        declareFunction("sbhl_time_find_latest_date", "SBHL-TIME-FIND-LATEST-DATE", 0, 2, false);
        declareFunction("sbhl_time_add_date", "SBHL-TIME-ADD-DATE", 1, 0, false);
        declareFunction("sbhl_time_remove_date", "SBHL-TIME-REMOVE-DATE", 1, 0, false);
        declareFunction("clear_sbhl_time_dates", "CLEAR-SBHL-TIME-DATES", 0, 0, false);
        declareFunction("new_sbhl_time_date_iterator", "NEW-SBHL-TIME-DATE-ITERATOR", 0, 3, false);
        declareMacro("do_sbhl_time_dates", "DO-SBHL-TIME-DATES");
        declareFunction("sbhl_time_date_min_linked_date", "SBHL-TIME-DATE-MIN-LINKED-DATE", 1, 1, false);
        declareFunction("sbhl_time_date_min_linked_date_int", "SBHL-TIME-DATE-MIN-LINKED-DATE-INT", 3, 0, false);
        declareFunction("sbhl_time_date_max_linked_date", "SBHL-TIME-DATE-MAX-LINKED-DATE", 1, 1, false);
        declareFunction("sbhl_time_date_max_linked_date_int", "SBHL-TIME-DATE-MAX-LINKED-DATE-INT", 3, 0, false);
        declareFunction("sbhl_time_date_relevant_linked_date", "SBHL-TIME-DATE-RELEVANT-LINKED-DATE", 1, 1, false);
        declareFunction("sbhl_time_date_node_links_to_dateP", "SBHL-TIME-DATE-NODE-LINKS-TO-DATE?", 1, 1, false);
        declareFunction("sbhl_time_date_date_links_to_nodeP", "SBHL-TIME-DATE-DATE-LINKS-TO-NODE?", 1, 1, false);
        declareFunction("sbhl_time_dates_link_existsP", "SBHL-TIME-DATES-LINK-EXISTS?", 2, 0, false);
        declareFunction("sbhl_time_date_node_date_link_supports", "SBHL-TIME-DATE-NODE-DATE-LINK-SUPPORTS", 3, 1, false);
        declareFunction("sbhl_time_date_date_node_link_supports", "SBHL-TIME-DATE-DATE-NODE-LINK-SUPPORTS", 3, 1, false);
        declareFunction("sbhl_time_date_link_supports_int", "SBHL-TIME-DATE-LINK-SUPPORTS-INT", 5, 0, false);
        declareFunction("clear_sbhl_time_date_link_tables", "CLEAR-SBHL-TIME-DATE-LINK-TABLES", 0, 0, false);
        declareFunction("sbhl_time_dates_add_link_support", "SBHL-TIME-DATES-ADD-LINK-SUPPORT", 5, 0, false);
        declareFunction("sbhl_time_dates_add_link_support_int", "SBHL-TIME-DATES-ADD-LINK-SUPPORT-INT", 6, 0, false);
        declareFunction("sbhl_time_dates_remove_link_support", "SBHL-TIME-DATES-REMOVE-LINK-SUPPORT", 5, 0, false);
        declareFunction("sbhl_time_dates_remove_link_support_int", "SBHL-TIME-DATES-REMOVE-LINK-SUPPORT-INT", 6, 0, false);
        declareFunction("sbhl_time_date_node_with_min_date_link", "SBHL-TIME-DATE-NODE-WITH-MIN-DATE-LINK", 1, 1, false);
        declareFunction("sbhl_time_date_node_with_max_date_link", "SBHL-TIME-DATE-NODE-WITH-MAX-DATE-LINK", 1, 1, false);
        declareFunction("sbhl_time_date_find_search_node", "SBHL-TIME-DATE-FIND-SEARCH-NODE", 1, 2, false);
        declareMacro("destructure_sbhl_time_date_link", "DESTRUCTURE-SBHL-TIME-DATE-LINK");
        declareMacro("do_sbhl_time_date_links", "DO-SBHL-TIME-DATE-LINKS");
        declareMacro("do_sbhl_time_date_links_between_dates", "DO-SBHL-TIME-DATE-LINKS-BETWEEN-DATES");
        declareMacro("do_sbhl_time_date_date_links", "DO-SBHL-TIME-DATE-DATE-LINKS");
        declareFunction("new_sbhl_time_date_link_iterator", "NEW-SBHL-TIME-DATE-LINK-ITERATOR", 1, 3, false);
        declareFunction("sbhl_time_date_link_iterator_state", "SBHL-TIME-DATE-LINK-ITERATOR-STATE", 4, 0, false);
        declareFunction("sbhl_time_date_link_iterator_state_int", "SBHL-TIME-DATE-LINK-ITERATOR-STATE-INT", 5, 0, false);
        declareFunction("sbhl_time_date_link_iterator_done", "SBHL-TIME-DATE-LINK-ITERATOR-DONE", 1, 0, false);
        declareFunction("sbhl_time_date_link_iterator_next", "SBHL-TIME-DATE-LINK-ITERATOR-NEXT", 1, 0, false);
        declareFunction("sbhl_time_date_link_iterator_finalize", "SBHL-TIME-DATE-LINK-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("new_sbhl_time_date_link_to_date_iterator", "NEW-SBHL-TIME-DATE-LINK-TO-DATE-ITERATOR", 1, 1, false);
        declareFunction("new_sbhl_time_date_date_link_iterator", "NEW-SBHL-TIME-DATE-DATE-LINK-ITERATOR", 3, 0, false);
        declareFunction("sbhl_time_date_date_link_iterator_state", "SBHL-TIME-DATE-DATE-LINK-ITERATOR-STATE", 3, 0, false);
        declareFunction("sbhl_time_date_date_link_iterator_done", "SBHL-TIME-DATE-DATE-LINK-ITERATOR-DONE", 1, 0, false);
        declareFunction("sbhl_time_date_date_link_iterator_next", "SBHL-TIME-DATE-DATE-LINK-ITERATOR-NEXT", 1, 0, false);
        declareFunction("sbhl_time_date_date_link_iterator_finalize", "SBHL-TIME-DATE-DATE-LINK-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("new_sbhl_time_date_link_tag_iterator", "NEW-SBHL-TIME-DATE-LINK-TAG-ITERATOR", 1, 0, false);
        declareFunction("sbhl_time_date_link_tag_iterator_state", "SBHL-TIME-DATE-LINK-TAG-ITERATOR-STATE", 1, 0, false);
        declareFunction("sbhl_time_date_link_tag_iterator_done", "SBHL-TIME-DATE-LINK-TAG-ITERATOR-DONE", 1, 0, false);
        declareFunction("sbhl_time_date_link_tag_iterator_next", "SBHL-TIME-DATE-LINK-TAG-ITERATOR-NEXT", 1, 0, false);
        declareFunction("sbhl_time_date_link_tag_iterator_finalize", "SBHL-TIME-DATE-LINK-TAG-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("new_sbhl_time_date_mt_link_iterator", "NEW-SBHL-TIME-DATE-MT-LINK-ITERATOR", 1, 0, false);
        declareFunction("sbhl_time_date_mt_link_iterator_state", "SBHL-TIME-DATE-MT-LINK-ITERATOR-STATE", 1, 0, false);
        declareFunction("sbhl_time_date_mt_link_iterator_done", "SBHL-TIME-DATE-MT-LINK-ITERATOR-DONE", 1, 0, false);
        declareFunction("sbhl_time_date_mt_link_iterator_next", "SBHL-TIME-DATE-MT-LINK-ITERATOR-NEXT", 1, 0, false);
        declareFunction("sbhl_time_date_mt_link_iterator_finalize", "SBHL-TIME-DATE-MT-LINK-ITERATOR-FINALIZE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_sbhl_time_dates_file_alt() {
        deflexical("*SBHL-TIME-DATE-GRAPH*", NIL != boundp($sbhl_time_date_graph$) ? ((SubLObject) ($sbhl_time_date_graph$.getGlobalValue())) : binary_tree.new_avl_tree($sym1$SBHL_DATE_));
        deflexical("*SBHL-TIME-DATE-OBJECT-PREDICATE-LINKS*", NIL != boundp($sbhl_time_date_object_predicate_links$) ? ((SubLObject) ($sbhl_time_date_object_predicate_links$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQL), $int$1000));
        deflexical("*SBHL-TIME-DATE-OBJECT-INVERSE-LINKS*", NIL != boundp($sbhl_time_date_object_inverse_links$) ? ((SubLObject) ($sbhl_time_date_object_inverse_links$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQL), $int$1000));
        deflexical("*SBHL-TIME-OBJECT-DATE-PREDICATE-LINKS*", NIL != boundp($sbhl_time_object_date_predicate_links$) ? ((SubLObject) ($sbhl_time_object_date_predicate_links$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), $int$1000));
        deflexical("*SBHL-TIME-OBJECT-DATE-INVERSE-LINKS*", NIL != boundp($sbhl_time_object_date_inverse_links$) ? ((SubLObject) ($sbhl_time_object_date_inverse_links$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), $int$1000));
        return NIL;
    }

    public static SubLObject init_sbhl_time_dates_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*SBHL-TIME-DATE-GRAPH*", SubLTrampolineFile.maybeDefault($sbhl_time_date_graph$, $sbhl_time_date_graph$, () -> binary_tree.new_avl_tree($sym1$SBHL_DATE_)));
            deflexical("*SBHL-TIME-DATE-OBJECT-PREDICATE-LINKS*", SubLTrampolineFile.maybeDefault($sbhl_time_date_object_predicate_links$, $sbhl_time_date_object_predicate_links$, () -> dictionary.new_dictionary(symbol_function(EQL), $int$1000)));
            deflexical("*SBHL-TIME-DATE-OBJECT-INVERSE-LINKS*", SubLTrampolineFile.maybeDefault($sbhl_time_date_object_inverse_links$, $sbhl_time_date_object_inverse_links$, () -> dictionary.new_dictionary(symbol_function(EQL), $int$1000)));
            deflexical("*SBHL-TIME-OBJECT-DATE-PREDICATE-LINKS*", SubLTrampolineFile.maybeDefault($sbhl_time_object_date_predicate_links$, $sbhl_time_object_date_predicate_links$, () -> dictionary.new_dictionary(symbol_function(EQL), $int$1000)));
            deflexical("*SBHL-TIME-OBJECT-DATE-INVERSE-LINKS*", SubLTrampolineFile.maybeDefault($sbhl_time_object_date_inverse_links$, $sbhl_time_object_date_inverse_links$, () -> dictionary.new_dictionary(symbol_function(EQL), $int$1000)));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SBHL-TIME-DATE-GRAPH*", NIL != boundp($sbhl_time_date_graph$) ? ((SubLObject) ($sbhl_time_date_graph$.getGlobalValue())) : binary_tree.new_avl_tree($sym1$SBHL_DATE_));
            deflexical("*SBHL-TIME-DATE-OBJECT-PREDICATE-LINKS*", NIL != boundp($sbhl_time_date_object_predicate_links$) ? ((SubLObject) ($sbhl_time_date_object_predicate_links$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQL), $int$1000));
            deflexical("*SBHL-TIME-DATE-OBJECT-INVERSE-LINKS*", NIL != boundp($sbhl_time_date_object_inverse_links$) ? ((SubLObject) ($sbhl_time_date_object_inverse_links$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQL), $int$1000));
            deflexical("*SBHL-TIME-OBJECT-DATE-PREDICATE-LINKS*", NIL != boundp($sbhl_time_object_date_predicate_links$) ? ((SubLObject) ($sbhl_time_object_date_predicate_links$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), $int$1000));
            deflexical("*SBHL-TIME-OBJECT-DATE-INVERSE-LINKS*", NIL != boundp($sbhl_time_object_date_inverse_links$) ? ((SubLObject) ($sbhl_time_object_date_inverse_links$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), $int$1000));
        }
        return NIL;
    }

    public static SubLObject init_sbhl_time_dates_file_Previous() {
        deflexical("*SBHL-TIME-DATE-GRAPH*", SubLTrampolineFile.maybeDefault($sbhl_time_date_graph$, $sbhl_time_date_graph$, () -> binary_tree.new_avl_tree($sym1$SBHL_DATE_)));
        deflexical("*SBHL-TIME-DATE-OBJECT-PREDICATE-LINKS*", SubLTrampolineFile.maybeDefault($sbhl_time_date_object_predicate_links$, $sbhl_time_date_object_predicate_links$, () -> dictionary.new_dictionary(symbol_function(EQL), $int$1000)));
        deflexical("*SBHL-TIME-DATE-OBJECT-INVERSE-LINKS*", SubLTrampolineFile.maybeDefault($sbhl_time_date_object_inverse_links$, $sbhl_time_date_object_inverse_links$, () -> dictionary.new_dictionary(symbol_function(EQL), $int$1000)));
        deflexical("*SBHL-TIME-OBJECT-DATE-PREDICATE-LINKS*", SubLTrampolineFile.maybeDefault($sbhl_time_object_date_predicate_links$, $sbhl_time_object_date_predicate_links$, () -> dictionary.new_dictionary(symbol_function(EQL), $int$1000)));
        deflexical("*SBHL-TIME-OBJECT-DATE-INVERSE-LINKS*", SubLTrampolineFile.maybeDefault($sbhl_time_object_date_inverse_links$, $sbhl_time_object_date_inverse_links$, () -> dictionary.new_dictionary(symbol_function(EQL), $int$1000)));
        return NIL;
    }

    public static SubLObject setup_sbhl_time_dates_file() {
        declare_defglobal($sbhl_time_date_graph$);
        declare_defglobal($sbhl_time_date_object_predicate_links$);
        declare_defglobal($sbhl_time_date_object_inverse_links$);
        declare_defglobal($sbhl_time_object_date_predicate_links$);
        declare_defglobal($sbhl_time_object_date_inverse_links$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_time_dates_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_time_dates_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_time_dates_file();
    }

    

    static private final SubLList $list_alt4 = list(list(makeSymbol("DATE"), makeSymbol("&KEY"), makeSymbol("EARLIEST"), makeSymbol("LATEST"), list(makeSymbol("DIRECTION"), makeKeyword("FORWARD")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt5 = list(makeKeyword("EARLIEST"), makeKeyword("LATEST"), makeKeyword("DIRECTION"), $DONE);

    static private final SubLList $list_alt23 = list(list(makeSymbol("LINK-TAG"), makeSymbol("LINK-MT"), makeSymbol("LINK-NODE"), makeSymbol("&OPTIONAL"), makeSymbol("LINK-SUPPORTS")), makeSymbol("LINK"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt29 = list(list(makeSymbol("LINK0"), makeSymbol("LINK1"), makeSymbol("LINK2"), makeSymbol("NODE"), makeSymbol("&KEY"), makeSymbol("DATE-LOWER-BOUND"), makeSymbol("DATE-UPPER-BOUND"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt30 = list(makeKeyword("DATE-LOWER-BOUND"), makeKeyword("DATE-UPPER-BOUND"), $DONE);

    static private final SubLList $list_alt36 = list(makeSymbol("GET-SBHL-LINK-DIRECTION"));

    static private final SubLList $list_alt37 = list(list(makeSymbol("LINK0"), makeSymbol("LINK1"), makeSymbol("DATE0"), makeSymbol("DATE1"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt38 = list($DONE);

    static private final SubLList $list_alt42 = list(list(makeSymbol("GET-SBHL-LINK-DIRECTION")));

    static private final SubLList $list_alt43 = list(list(makeSymbol("LINK0"), makeSymbol("LINK1"), makeSymbol("DATE"), makeSymbol("&KEY"), makeSymbol("DATE-LOWER-BOUND"), makeSymbol("DATE-UPPER-BOUND"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt47 = list(makeSymbol("SBHL-FORWARD-DIRECTED-DIRECTION-P"), list(makeSymbol("GET-SBHL-LINK-DIRECTION")));

    static private final SubLList $list_alt63 = list(makeSymbol("TAG"), makeSymbol("TAG-TABLE"));

    static private final SubLList $list_alt67 = list(makeSymbol("MT"), makeSymbol("MT-TABLE"));
}

/**
 * Total time: 336 ms
 */
