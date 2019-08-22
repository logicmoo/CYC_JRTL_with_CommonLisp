/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.acons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      KBS-COMPARE
 * source file: /cyc/top/cycl/kbs-compare.lisp
 * created:     2019/07/03 17:37:50
 */
public final class kbs_compare extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new kbs_compare();

 public static final String myName = "com.cyc.cycjava.cycl.kbs_compare";


    // deflexical
    @LispMethod(comment = "The collections whose instances must be counted during KB Subset\r\ncomparison.\ndeflexical\nThe collections whose instances must be counted during KB Subset\ncomparison.")
    // Definitions
    /**
     * The collections whose instances must be counted during KB Subset
     * comparison.
     */
    private static final SubLSymbol $kbs_compare_instance_cols$ = makeSymbol("*KBS-COMPARE-INSTANCE-COLS*");

    // deflexical
    /**
     * The collections whose quoted-instances must be counted during KB Subset
     * comparison.
     */
    @LispMethod(comment = "The collections whose quoted-instances must be counted during KB Subset\r\ncomparison.\ndeflexical\nThe collections whose quoted-instances must be counted during KB Subset\ncomparison.")
    private static final SubLSymbol $kbs_compare_quoted_instance_cols$ = makeSymbol("*KBS-COMPARE-QUOTED-INSTANCE-COLS*");

    // deflexical
    // The collections whose specs must be counted during KB Subset comparison.
    /**
     * The collections whose specs must be counted during KB Subset comparison.
     */
    @LispMethod(comment = "The collections whose specs must be counted during KB Subset comparison.\ndeflexical")
    private static final SubLSymbol $kbs_compare_spec_cols$ = makeSymbol("*KBS-COMPARE-SPEC-COLS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(new SubLObject[]{ reader_make_constant_shell("Individual"), reader_make_constant_shell("Relation"), reader_make_constant_shell("TruthFunction"), reader_make_constant_shell("Predicate"), reader_make_constant_shell("Function-Denotational"), reader_make_constant_shell("LinguisticObject"), reader_make_constant_shell("Event"), reader_make_constant_shell("Agent-Generic"), reader_make_constant_shell("Place-NonAgent"), reader_make_constant_shell("SetOrCollection"), reader_make_constant_shell("Collection"), reader_make_constant_shell("FirstOrderCollection"), reader_make_constant_shell("CollectionType"), reader_make_constant_shell("FacetingCollectionType"), reader_make_constant_shell("Set-Mathematical") });

    static private final SubLList $list1 = list(reader_make_constant_shell("DocumentationConstant"), reader_make_constant_shell("ImplementationConstant"), reader_make_constant_shell("TimeDimensionRelatedConstant"));

    static private final SubLList $list2 = list(reader_make_constant_shell("Agent-Generic"), reader_make_constant_shell("Event"), reader_make_constant_shell("Place-NonAgent"), reader_make_constant_shell("Collection"));

    static private final SubLSymbol $sym3$_MT = makeSymbol("?MT");

    static private final SubLList $list4 = list(reader_make_constant_shell("isa"), makeSymbol("?MT"), reader_make_constant_shell("Microtheory"));

    private static final SubLSymbol KBS_CONSTANT_P = makeSymbol("KBS-CONSTANT-P");



    static private final SubLString $str7$_A__A_A_A_A_A_ADifference__ = makeString("~A:~A~A~A~A~A~ADifference~%");

    static private final SubLString $str8$_A__A_A_A__ = makeString("~A:~A~A~A~%");

    static private final SubLString $str9$_A_A_A_A_A_A_A_A__ = makeString("~A~A~A~A~A~A~A~A~%");

    static private final SubLString $str10$_A_A_A_A__ = makeString("~A~A~A~A~%");

    static private final SubLSymbol $sym12$_ = makeSymbol(">");

    static private final SubLString $str16$Collections__instance_count_ = makeString("Collections (instance-count)");

    static private final SubLString $str17$Collections__quoted_instance_coun = makeString("Collections (quoted-instance-count)");

    static private final SubLString $str18$Collections__spec_count_ = makeString("Collections (spec-count)");

    static private final SubLString $str19$Assertion_MT__gaf_count_ = makeString("Assertion MT (gaf-count)");

    static private final SubLString $str20$Assertion_MT__rule_count_ = makeString("Assertion MT (rule-count)");

    public static final SubLObject kbs_compare_ensure_kbs_initialized_alt(SubLObject kbs, SubLObject refresh_kbsP) {
        if (!(((NIL == refresh_kbsP) && (NIL != kbs_identification.kbs_state_validP())) && kbs_utilities.get_kbs_name().equal(kbs))) {
            kbs_utilities.set_kbs_definition(kbs);
            kbs_identification.identify_kbs_forts_and_assertions();
        }
        return kbs;
    }

    public static SubLObject kbs_compare_ensure_kbs_initialized(final SubLObject kbs, final SubLObject refresh_kbsP) {
        if (((NIL != refresh_kbsP) || (NIL == kbs_identification.kbs_state_validP())) || (!kbs_utilities.get_kbs_name().equal(kbs))) {
            kbs_utilities.set_kbs_definition(kbs);
            kbs_identification.identify_kbs_forts_and_assertions();
        }
        return kbs;
    }

    /**
     * The MTs whose assertions must be counted during KB Subset comparison.
     */
    @LispMethod(comment = "The MTs whose assertions must be counted during KB Subset comparison.")
    public static final SubLObject kbs_compare_assertion_mts_alt() {
        return ask_utilities.query_variable($sym3$_MT, $list_alt4, UNPROVIDED, UNPROVIDED);
    }

    /**
     * The MTs whose assertions must be counted during KB Subset comparison.
     */
    @LispMethod(comment = "The MTs whose assertions must be counted during KB Subset comparison.")
    public static SubLObject kbs_compare_assertion_mts() {
        return ask_utilities.query_variable($sym3$_MT, $list4, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns a list of counts of KB subset constant instances of COLLECTIONS.
     *
     * @param COLLECTIONS
    listp;
     * 		
     * @return INSTANCE-COUNTS listp
     */
    @LispMethod(comment = "Returns a list of counts of KB subset constant instances of COLLECTIONS.\r\n\r\n@param COLLECTIONS\nlistp;\r\n\t\t\r\n@return INSTANCE-COUNTS listp")
    public static final SubLObject kbs_compare_instance_counts_alt(SubLObject collections) {
        {
            SubLObject instance_counts = NIL;
            SubLObject cdolist_list_var = collections;
            SubLObject collection = NIL;
            for (collection = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collection = cdolist_list_var.first()) {
                instance_counts = cons(isa.count_all_instances_if(collection, KBS_CONSTANT_P, $$EverythingPSC, UNPROVIDED), instance_counts);
            }
            return reverse(instance_counts);
        }
    }

    /**
     * Returns a list of counts of KB subset constant instances of COLLECTIONS.
     *
     * @param COLLECTIONS
    		listp;
     * 		
     * @return INSTANCE-COUNTS listp
     */
    @LispMethod(comment = "Returns a list of counts of KB subset constant instances of COLLECTIONS.\r\n\r\n@param COLLECTIONS\n\t\tlistp;\r\n\t\t\r\n@return INSTANCE-COUNTS listp")
    public static SubLObject kbs_compare_instance_counts(final SubLObject collections) {
        SubLObject instance_counts = NIL;
        SubLObject cdolist_list_var = collections;
        SubLObject collection = NIL;
        collection = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            instance_counts = cons(isa.count_all_instances_if(collection, KBS_CONSTANT_P, $$EverythingPSC, UNPROVIDED), instance_counts);
            cdolist_list_var = cdolist_list_var.rest();
            collection = cdolist_list_var.first();
        } 
        return reverse(instance_counts);
    }

    /**
     * Returns a list of counts of KB subset constant quoted-instances of
     * COLLECTIONS.
     *
     * @param COLLECTIONS
    listp;
     * 		
     * @return QUOTED-INSTANCE-COUNTS listp
     */
    @LispMethod(comment = "Returns a list of counts of KB subset constant quoted-instances of\r\nCOLLECTIONS.\r\n\r\n@param COLLECTIONS\nlistp;\r\n\t\t\r\n@return QUOTED-INSTANCE-COUNTS listp\nReturns a list of counts of KB subset constant quoted-instances of\nCOLLECTIONS.")
    public static final SubLObject kbs_compare_quoted_instance_counts_alt(SubLObject collections) {
        {
            SubLObject quoted_instance_counts = NIL;
            SubLObject cdolist_list_var = collections;
            SubLObject collection = NIL;
            for (collection = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collection = cdolist_list_var.first()) {
                quoted_instance_counts = cons(isa.count_all_quoted_instances_if(collection, KBS_CONSTANT_P, $$EverythingPSC, UNPROVIDED), quoted_instance_counts);
            }
            return reverse(quoted_instance_counts);
        }
    }

    /**
     * Returns a list of counts of KB subset constant quoted-instances of
     * COLLECTIONS.
     *
     * @param COLLECTIONS
    		listp;
     * 		
     * @return QUOTED-INSTANCE-COUNTS listp
     */
    @LispMethod(comment = "Returns a list of counts of KB subset constant quoted-instances of\r\nCOLLECTIONS.\r\n\r\n@param COLLECTIONS\n\t\tlistp;\r\n\t\t\r\n@return QUOTED-INSTANCE-COUNTS listp\nReturns a list of counts of KB subset constant quoted-instances of\nCOLLECTIONS.")
    public static SubLObject kbs_compare_quoted_instance_counts(final SubLObject collections) {
        SubLObject quoted_instance_counts = NIL;
        SubLObject cdolist_list_var = collections;
        SubLObject collection = NIL;
        collection = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            quoted_instance_counts = cons(isa.count_all_quoted_instances_if(collection, KBS_CONSTANT_P, $$EverythingPSC, UNPROVIDED), quoted_instance_counts);
            cdolist_list_var = cdolist_list_var.rest();
            collection = cdolist_list_var.first();
        } 
        return reverse(quoted_instance_counts);
    }

    /**
     * Returns a list of counts of KB subset constant specs of COLLECTIONS.
     *
     * @param COLLECTIONS
    listp;
     * 		
     * @return SPEC-COUNTS listp
     */
    @LispMethod(comment = "Returns a list of counts of KB subset constant specs of COLLECTIONS.\r\n\r\n@param COLLECTIONS\nlistp;\r\n\t\t\r\n@return SPEC-COUNTS listp")
    public static final SubLObject kbs_compare_spec_counts_alt(SubLObject collections) {
        {
            SubLObject spec_counts = NIL;
            SubLObject cdolist_list_var = collections;
            SubLObject collection = NIL;
            for (collection = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collection = cdolist_list_var.first()) {
                spec_counts = cons(genls.count_all_specs_if(collection, KBS_CONSTANT_P, $$EverythingPSC, UNPROVIDED), spec_counts);
            }
            return reverse(spec_counts);
        }
    }

    /**
     * Returns a list of counts of KB subset constant specs of COLLECTIONS.
     *
     * @param COLLECTIONS
    		listp;
     * 		
     * @return SPEC-COUNTS listp
     */
    @LispMethod(comment = "Returns a list of counts of KB subset constant specs of COLLECTIONS.\r\n\r\n@param COLLECTIONS\n\t\tlistp;\r\n\t\t\r\n@return SPEC-COUNTS listp")
    public static SubLObject kbs_compare_spec_counts(final SubLObject collections) {
        SubLObject spec_counts = NIL;
        SubLObject cdolist_list_var = collections;
        SubLObject collection = NIL;
        collection = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            spec_counts = cons(genls.count_all_specs_if(collection, KBS_CONSTANT_P, $$EverythingPSC, UNPROVIDED), spec_counts);
            cdolist_list_var = cdolist_list_var.rest();
            collection = cdolist_list_var.first();
        } 
        return reverse(spec_counts);
    }

    /**
     * Returns a list of counts of KB subset assertions of type TYPE in MTs.
     *
     * @param MTS
    listp;
     * 		
     * @param TYPE
     * 		keywordp; values - :GAF or :RULE or NIL.
     */
    @LispMethod(comment = "Returns a list of counts of KB subset assertions of type TYPE in MTs.\r\n\r\n@param MTS\nlistp;\r\n\t\t\r\n@param TYPE\r\n\t\tkeywordp; values - :GAF or :RULE or NIL.")
    public static final SubLObject kbs_compare_assertion_counts_alt(SubLObject mts, SubLObject type) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        {
            SubLObject assertion_counts = NIL;
            SubLObject cdolist_list_var = mts;
            SubLObject mt = NIL;
            for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                assertion_counts = cons(kbs_identification.count_all_kbs_assertions_in_mt(mt, type), assertion_counts);
            }
            return reverse(assertion_counts);
        }
    }

    /**
     * Returns a list of counts of KB subset assertions of type TYPE in MTs.
     *
     * @param MTS
    		listp;
     * 		
     * @param TYPE
     * 		keywordp; values - :GAF or :RULE or NIL.
     */
    @LispMethod(comment = "Returns a list of counts of KB subset assertions of type TYPE in MTs.\r\n\r\n@param MTS\n\t\tlistp;\r\n\t\t\r\n@param TYPE\r\n\t\tkeywordp; values - :GAF or :RULE or NIL.")
    public static SubLObject kbs_compare_assertion_counts(final SubLObject mts, SubLObject type) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        SubLObject assertion_counts = NIL;
        SubLObject cdolist_list_var = mts;
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assertion_counts = cons(kbs_identification.count_all_kbs_assertions_in_mt(mt, type), assertion_counts);
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        return reverse(assertion_counts);
    }

    /**
     * Returns a list of differences between the items of LIST1 and LIST2.
     */
    @LispMethod(comment = "Returns a list of differences between the items of LIST1 and LIST2.")
    public static final SubLObject equal_length_lists_subtraction_alt(SubLObject list1, SubLObject list2) {
        {
            SubLObject list3 = NIL;
            SubLObject item1 = NIL;
            SubLObject item1_1 = NIL;
            SubLObject item2 = NIL;
            SubLObject item2_2 = NIL;
            for (item1 = list1, item1_1 = item1.first(), item2 = list2, item2_2 = item2.first(); !((NIL == item2) && (NIL == item1)); item1 = item1.rest() , item1_1 = item1.first() , item2 = item2.rest() , item2_2 = item2.first()) {
                list3 = cons(subtract(item1_1, item2_2), list3);
            }
            return reverse(list3);
        }
    }

    @LispMethod(comment = "Returns a list of differences between the items of LIST1 and LIST2.")
    public static SubLObject equal_length_lists_subtraction(final SubLObject list1, final SubLObject list2) {
        SubLObject list3 = NIL;
        SubLObject item1 = NIL;
        SubLObject item1_$1 = NIL;
        SubLObject item2 = NIL;
        SubLObject item2_$2 = NIL;
        item1 = list1;
        item1_$1 = item1.first();
        item2 = list2;
        item2_$2 = item2.first();
        while ((NIL != item2) || (NIL != item1)) {
            list3 = cons(subtract(item1_$1, item2_$2), list3);
            item1 = item1.rest();
            item1_$1 = item1.first();
            item2 = item2.rest();
            item2_$2 = item2.first();
        } 
        return reverse(list3);
    }

    /**
     *
     *
     * @param COUNT-TYPE
    stringp;
     * 		
     */
    @LispMethod(comment = "@param COUNT-TYPE\nstringp;")
    public static final SubLObject kbs_compare_print_header_alt(SubLObject count_type, SubLObject kbs_big, SubLObject kbs_small) {
        if (NIL != kbs_small) {
            return format(T, $str_alt7$_A__A_A_A_A_A_ADifference__, new SubLObject[]{ count_type, CHAR_tab, CHAR_tab, kbs_big, CHAR_tab, kbs_small, CHAR_tab });
        } else {
            return format(T, $str_alt8$_A__A_A_A__, new SubLObject[]{ count_type, CHAR_tab, CHAR_tab, kbs_big });
        }
    }

    /**
     *
     *
     * @param COUNT-TYPE
    stringp;
     * 		
     */
    @LispMethod(comment = "@param COUNT-TYPE\nstringp;")
    public static SubLObject kbs_compare_print_header(final SubLObject count_type, final SubLObject kbs_big, final SubLObject kbs_small) {
        if (NIL != kbs_small) {
            return format(T, $str7$_A__A_A_A_A_A_ADifference__, new SubLObject[]{ count_type, CHAR_tab, CHAR_tab, kbs_big, CHAR_tab, kbs_small, CHAR_tab });
        }
        return format(T, $str8$_A__A_A_A__, new SubLObject[]{ count_type, CHAR_tab, CHAR_tab, kbs_big });
    }

    /**
     * Prints out each name and value-set on subsequent lines.
     */
    @LispMethod(comment = "Prints out each name and value-set on subsequent lines.")
    public static final SubLObject kbs_compare_print_alt(SubLObject names, SubLObject values1, SubLObject values2) {
        if (values2 == UNPROVIDED) {
            values2 = NIL;
        }
        if (NIL != values2) {
            {
                SubLObject diffs = com.cyc.cycjava.cycl.kbs_compare.equal_length_lists_subtraction(values1, values2);
                SubLObject name = NIL;
                SubLObject name_3 = NIL;
                SubLObject value1 = NIL;
                SubLObject value1_4 = NIL;
                SubLObject value2 = NIL;
                SubLObject value2_5 = NIL;
                SubLObject diff = NIL;
                SubLObject diff_6 = NIL;
                for (name = names, name_3 = name.first(), value1 = values1, value1_4 = value1.first(), value2 = values2, value2_5 = value2.first(), diff = diffs, diff_6 = diff.first(); !((((NIL == diff) && (NIL == value2)) && (NIL == value1)) && (NIL == name)); name = name.rest() , name_3 = name.first() , value1 = value1.rest() , value1_4 = value1.first() , value2 = value2.rest() , value2_5 = value2.first() , diff = diff.rest() , diff_6 = diff.first()) {
                    format(T, $str_alt9$_A_A_A_A_A_A_A_A__, new SubLObject[]{ name_3, CHAR_tab, CHAR_tab, value1_4, CHAR_tab, value2_5, CHAR_tab, diff_6 });
                }
            }
        } else {
            {
                SubLObject name = NIL;
                SubLObject name_7 = NIL;
                SubLObject value = NIL;
                SubLObject value_8 = NIL;
                for (name = names, name_7 = name.first(), value = values1, value_8 = value.first(); !((NIL == value) && (NIL == name)); name = name.rest() , name_7 = name.first() , value = value.rest() , value_8 = value.first()) {
                    format(T, $str_alt10$_A_A_A_A__, new SubLObject[]{ name_7, CHAR_tab, CHAR_tab, value_8 });
                }
            }
        }
        return DONE;
    }

    @LispMethod(comment = "Prints out each name and value-set on subsequent lines.")
    public static SubLObject kbs_compare_print(final SubLObject names, final SubLObject values1, SubLObject values2) {
        if (values2 == UNPROVIDED) {
            values2 = NIL;
        }
        if (NIL != values2) {
            final SubLObject diffs = equal_length_lists_subtraction(values1, values2);
            SubLObject name = NIL;
            SubLObject name_$3 = NIL;
            SubLObject value1 = NIL;
            SubLObject value1_$4 = NIL;
            SubLObject value2 = NIL;
            SubLObject value2_$5 = NIL;
            SubLObject diff = NIL;
            SubLObject diff_$6 = NIL;
            name = names;
            name_$3 = name.first();
            value1 = values1;
            value1_$4 = value1.first();
            value2 = values2;
            value2_$5 = value2.first();
            diff = diffs;
            diff_$6 = diff.first();
            while ((((NIL != diff) || (NIL != value2)) || (NIL != value1)) || (NIL != name)) {
                format(T, $str9$_A_A_A_A_A_A_A_A__, new SubLObject[]{ name_$3, CHAR_tab, CHAR_tab, value1_$4, CHAR_tab, value2_$5, CHAR_tab, diff_$6 });
                name = name.rest();
                name_$3 = name.first();
                value1 = value1.rest();
                value1_$4 = value1.first();
                value2 = value2.rest();
                value2_$5 = value2.first();
                diff = diff.rest();
                diff_$6 = diff.first();
            } 
        } else {
            SubLObject name2 = NIL;
            SubLObject name_$4 = NIL;
            SubLObject value3 = NIL;
            SubLObject value_$8 = NIL;
            name2 = names;
            name_$4 = name2.first();
            value3 = values1;
            value_$8 = value3.first();
            while ((NIL != value3) || (NIL != name2)) {
                format(T, $str10$_A_A_A_A__, new SubLObject[]{ name_$4, CHAR_tab, CHAR_tab, value_$8 });
                name2 = name2.rest();
                name_$4 = name2.first();
                value3 = value3.rest();
                value_$8 = value3.first();
            } 
        }
        return DONE;
    }

    /**
     * Generates and presents statistics for comparing Cyc KB subsets (cycsecure,
     * halo, ikb, mysentient, nonprop, opencyc, public, or research).
     *
     * @param KBS-BIG
     * 		stringp; it can be any one of the above-mentioned Cyc subsets.
     * @param KBS-SMALL
     * 		stringp; it can be any one of the above-mentioned Cyc
     * 		subsets or NIL.  If it is NIL, it just prints out the statistics for KBS-BIG
     * @param REFRESH-KBS?
     * 		booleanp; if T, create a new KB subset
     * @param INSTANCE-COLS
     * 		listp; list of collections whose instances must be
     * 		counted.
     * @param QUOTED-INSTANCE-COLS
     * 		listp; list of collections whose quoted-instances
     * 		must be counted.
     * @param SPEC-COLS
     * 		listp; list of collections whose specs must be counted.
     * @param ASSERTION-MTS
     * 		listp; list of microtheories whose GAFs and Rules must
     * 		be counted.
     */
    @LispMethod(comment = "Generates and presents statistics for comparing Cyc KB subsets (cycsecure,\r\nhalo, ikb, mysentient, nonprop, opencyc, public, or research).\r\n\r\n@param KBS-BIG\r\n\t\tstringp; it can be any one of the above-mentioned Cyc subsets.\r\n@param KBS-SMALL\r\n\t\tstringp; it can be any one of the above-mentioned Cyc\r\n\t\tsubsets or NIL.  If it is NIL, it just prints out the statistics for KBS-BIG\r\n@param REFRESH-KBS?\r\n\t\tbooleanp; if T, create a new KB subset\r\n@param INSTANCE-COLS\r\n\t\tlistp; list of collections whose instances must be\r\n\t\tcounted.\r\n@param QUOTED-INSTANCE-COLS\r\n\t\tlistp; list of collections whose quoted-instances\r\n\t\tmust be counted.\r\n@param SPEC-COLS\r\n\t\tlistp; list of collections whose specs must be counted.\r\n@param ASSERTION-MTS\r\n\t\tlistp; list of microtheories whose GAFs and Rules must\r\n\t\tbe counted.\nGenerates and presents statistics for comparing Cyc KB subsets (cycsecure,\nhalo, ikb, mysentient, nonprop, opencyc, public, or research).")
    public static final SubLObject kbs_compare_alt(SubLObject kbs_big, SubLObject kbs_small, SubLObject refresh_kbsP, SubLObject instance_cols, SubLObject quoted_instance_cols, SubLObject spec_cols, SubLObject assertion_mts) {
        if (kbs_small == UNPROVIDED) {
            kbs_small = NIL;
        }
        if (refresh_kbsP == UNPROVIDED) {
            refresh_kbsP = NIL;
        }
        if (instance_cols == UNPROVIDED) {
            instance_cols = $kbs_compare_instance_cols$.getGlobalValue();
        }
        if (quoted_instance_cols == UNPROVIDED) {
            quoted_instance_cols = $kbs_compare_quoted_instance_cols$.getGlobalValue();
        }
        if (spec_cols == UNPROVIDED) {
            spec_cols = $kbs_compare_spec_cols$.getGlobalValue();
        }
        if (assertion_mts == UNPROVIDED) {
            assertion_mts = com.cyc.cycjava.cycl.kbs_compare.kbs_compare_assertion_mts();
        }
        com.cyc.cycjava.cycl.kbs_compare.kbs_compare_ensure_kbs_initialized(kbs_big, refresh_kbsP);
        {
            SubLObject kbs_big_instance_counts = com.cyc.cycjava.cycl.kbs_compare.kbs_compare_instance_counts(instance_cols);
            SubLObject kbs_big_quoted_instance_counts = com.cyc.cycjava.cycl.kbs_compare.kbs_compare_quoted_instance_counts(quoted_instance_cols);
            SubLObject kbs_big_spec_counts = com.cyc.cycjava.cycl.kbs_compare.kbs_compare_spec_counts(spec_cols);
            SubLObject kbs_big_assertion_counts = NIL;
            SubLObject kbs_big_gaf_counts = NIL;
            SubLObject kbs_big_rule_counts = NIL;
            SubLObject kbs_small_instance_counts = NIL;
            SubLObject kbs_small_quoted_instance_counts = NIL;
            SubLObject kbs_small_spec_counts = NIL;
            SubLObject kbs_small_gaf_counts = NIL;
            SubLObject kbs_small_rule_counts = NIL;
            SubLObject cdolist_list_var = assertion_mts;
            SubLObject mt = NIL;
            for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                kbs_big_assertion_counts = acons(mt, kbs_identification.count_all_kbs_assertions_in_mt(mt, UNPROVIDED), kbs_big_assertion_counts);
            }
            kbs_big_assertion_counts = list_utilities.sort_alist_by_values(kbs_big_assertion_counts, symbol_function($sym12$_));
            if (length(kbs_big_assertion_counts).numG($int$100)) {
                kbs_big_assertion_counts = subseq(kbs_big_assertion_counts, ZERO_INTEGER, $int$100);
            }
            assertion_mts = list_utilities.alist_keys(kbs_big_assertion_counts);
            kbs_big_gaf_counts = com.cyc.cycjava.cycl.kbs_compare.kbs_compare_assertion_counts(assertion_mts, $GAF);
            kbs_big_rule_counts = com.cyc.cycjava.cycl.kbs_compare.kbs_compare_assertion_counts(assertion_mts, $RULE);
            if (NIL != kbs_small) {
                com.cyc.cycjava.cycl.kbs_compare.kbs_compare_ensure_kbs_initialized(kbs_small, refresh_kbsP);
                kbs_small_instance_counts = com.cyc.cycjava.cycl.kbs_compare.kbs_compare_instance_counts(instance_cols);
                kbs_small_quoted_instance_counts = com.cyc.cycjava.cycl.kbs_compare.kbs_compare_quoted_instance_counts(quoted_instance_cols);
                kbs_small_spec_counts = com.cyc.cycjava.cycl.kbs_compare.kbs_compare_spec_counts(spec_cols);
                kbs_small_gaf_counts = com.cyc.cycjava.cycl.kbs_compare.kbs_compare_assertion_counts(assertion_mts, $GAF);
                kbs_small_rule_counts = com.cyc.cycjava.cycl.kbs_compare.kbs_compare_assertion_counts(assertion_mts, $RULE);
            }
            com.cyc.cycjava.cycl.kbs_compare.kbs_compare_print_header($str_alt16$Collections__instance_count_, kbs_big, kbs_small);
            com.cyc.cycjava.cycl.kbs_compare.kbs_compare_print(instance_cols, kbs_big_instance_counts, kbs_small_instance_counts);
            com.cyc.cycjava.cycl.kbs_compare.kbs_compare_print_header($str_alt17$Collections__quoted_instance_coun, kbs_big, kbs_small);
            com.cyc.cycjava.cycl.kbs_compare.kbs_compare_print(quoted_instance_cols, kbs_big_quoted_instance_counts, kbs_small_quoted_instance_counts);
            com.cyc.cycjava.cycl.kbs_compare.kbs_compare_print_header($str_alt18$Collections__spec_count_, kbs_big, kbs_small);
            com.cyc.cycjava.cycl.kbs_compare.kbs_compare_print(spec_cols, kbs_big_spec_counts, kbs_small_spec_counts);
            com.cyc.cycjava.cycl.kbs_compare.kbs_compare_print_header($str_alt19$Assertion_MT__gaf_count_, kbs_big, kbs_small);
            com.cyc.cycjava.cycl.kbs_compare.kbs_compare_print(assertion_mts, kbs_big_gaf_counts, kbs_small_gaf_counts);
            com.cyc.cycjava.cycl.kbs_compare.kbs_compare_print_header($str_alt20$Assertion_MT__rule_count_, kbs_big, kbs_small);
            com.cyc.cycjava.cycl.kbs_compare.kbs_compare_print(assertion_mts, kbs_big_rule_counts, kbs_small_rule_counts);
        }
        return DONE;
    }

    /**
     * Generates and presents statistics for comparing Cyc KB subsets (cycsecure,
     * halo, ikb, mysentient, nonprop, opencyc, public, or research).
     *
     * @param KBS-BIG
     * 		stringp; it can be any one of the above-mentioned Cyc subsets.
     * @param KBS-SMALL
     * 		stringp; it can be any one of the above-mentioned Cyc
     * 		subsets or NIL.  If it is NIL, it just prints out the statistics for KBS-BIG
     * @param REFRESH-KBS?
     * 		booleanp; if T, create a new KB subset
     * @param INSTANCE-COLS
     * 		listp; list of collections whose instances must be
     * 		counted.
     * @param QUOTED-INSTANCE-COLS
     * 		listp; list of collections whose quoted-instances
     * 		must be counted.
     * @param SPEC-COLS
     * 		listp; list of collections whose specs must be counted.
     * @param ASSERTION-MTS
     * 		listp; list of microtheories whose GAFs and Rules must
     * 		be counted.
     */
    @LispMethod(comment = "Generates and presents statistics for comparing Cyc KB subsets (cycsecure,\r\nhalo, ikb, mysentient, nonprop, opencyc, public, or research).\r\n\r\n@param KBS-BIG\r\n\t\tstringp; it can be any one of the above-mentioned Cyc subsets.\r\n@param KBS-SMALL\r\n\t\tstringp; it can be any one of the above-mentioned Cyc\r\n\t\tsubsets or NIL.  If it is NIL, it just prints out the statistics for KBS-BIG\r\n@param REFRESH-KBS?\r\n\t\tbooleanp; if T, create a new KB subset\r\n@param INSTANCE-COLS\r\n\t\tlistp; list of collections whose instances must be\r\n\t\tcounted.\r\n@param QUOTED-INSTANCE-COLS\r\n\t\tlistp; list of collections whose quoted-instances\r\n\t\tmust be counted.\r\n@param SPEC-COLS\r\n\t\tlistp; list of collections whose specs must be counted.\r\n@param ASSERTION-MTS\r\n\t\tlistp; list of microtheories whose GAFs and Rules must\r\n\t\tbe counted.\nGenerates and presents statistics for comparing Cyc KB subsets (cycsecure,\nhalo, ikb, mysentient, nonprop, opencyc, public, or research).")
    public static SubLObject kbs_compare(final SubLObject kbs_big, SubLObject kbs_small, SubLObject refresh_kbsP, SubLObject instance_cols, SubLObject quoted_instance_cols, SubLObject spec_cols, SubLObject assertion_mts) {
        if (kbs_small == UNPROVIDED) {
            kbs_small = NIL;
        }
        if (refresh_kbsP == UNPROVIDED) {
            refresh_kbsP = NIL;
        }
        if (instance_cols == UNPROVIDED) {
            instance_cols = $kbs_compare_instance_cols$.getGlobalValue();
        }
        if (quoted_instance_cols == UNPROVIDED) {
            quoted_instance_cols = $kbs_compare_quoted_instance_cols$.getGlobalValue();
        }
        if (spec_cols == UNPROVIDED) {
            spec_cols = $kbs_compare_spec_cols$.getGlobalValue();
        }
        if (assertion_mts == UNPROVIDED) {
            assertion_mts = kbs_compare_assertion_mts();
        }
        kbs_compare_ensure_kbs_initialized(kbs_big, refresh_kbsP);
        final SubLObject kbs_big_instance_counts = kbs_compare_instance_counts(instance_cols);
        final SubLObject kbs_big_quoted_instance_counts = kbs_compare_quoted_instance_counts(quoted_instance_cols);
        final SubLObject kbs_big_spec_counts = kbs_compare_spec_counts(spec_cols);
        SubLObject kbs_big_assertion_counts = NIL;
        SubLObject kbs_big_gaf_counts = NIL;
        SubLObject kbs_big_rule_counts = NIL;
        SubLObject kbs_small_instance_counts = NIL;
        SubLObject kbs_small_quoted_instance_counts = NIL;
        SubLObject kbs_small_spec_counts = NIL;
        SubLObject kbs_small_gaf_counts = NIL;
        SubLObject kbs_small_rule_counts = NIL;
        SubLObject cdolist_list_var = assertion_mts;
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            kbs_big_assertion_counts = acons(mt, kbs_identification.count_all_kbs_assertions_in_mt(mt, UNPROVIDED), kbs_big_assertion_counts);
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        kbs_big_assertion_counts = list_utilities.sort_alist_by_values(kbs_big_assertion_counts, symbol_function($sym12$_));
        if (length(kbs_big_assertion_counts).numG($int$100)) {
            kbs_big_assertion_counts = subseq(kbs_big_assertion_counts, ZERO_INTEGER, $int$100);
        }
        assertion_mts = list_utilities.alist_keys(kbs_big_assertion_counts);
        kbs_big_gaf_counts = kbs_compare_assertion_counts(assertion_mts, $GAF);
        kbs_big_rule_counts = kbs_compare_assertion_counts(assertion_mts, $RULE);
        if (NIL != kbs_small) {
            kbs_compare_ensure_kbs_initialized(kbs_small, refresh_kbsP);
            kbs_small_instance_counts = kbs_compare_instance_counts(instance_cols);
            kbs_small_quoted_instance_counts = kbs_compare_quoted_instance_counts(quoted_instance_cols);
            kbs_small_spec_counts = kbs_compare_spec_counts(spec_cols);
            kbs_small_gaf_counts = kbs_compare_assertion_counts(assertion_mts, $GAF);
            kbs_small_rule_counts = kbs_compare_assertion_counts(assertion_mts, $RULE);
        }
        kbs_compare_print_header($str16$Collections__instance_count_, kbs_big, kbs_small);
        kbs_compare_print(instance_cols, kbs_big_instance_counts, kbs_small_instance_counts);
        kbs_compare_print_header($str17$Collections__quoted_instance_coun, kbs_big, kbs_small);
        kbs_compare_print(quoted_instance_cols, kbs_big_quoted_instance_counts, kbs_small_quoted_instance_counts);
        kbs_compare_print_header($str18$Collections__spec_count_, kbs_big, kbs_small);
        kbs_compare_print(spec_cols, kbs_big_spec_counts, kbs_small_spec_counts);
        kbs_compare_print_header($str19$Assertion_MT__gaf_count_, kbs_big, kbs_small);
        kbs_compare_print(assertion_mts, kbs_big_gaf_counts, kbs_small_gaf_counts);
        kbs_compare_print_header($str20$Assertion_MT__rule_count_, kbs_big, kbs_small);
        kbs_compare_print(assertion_mts, kbs_big_rule_counts, kbs_small_rule_counts);
        return DONE;
    }

    public static SubLObject declare_kbs_compare_file() {
        declareFunction("kbs_compare_ensure_kbs_initialized", "KBS-COMPARE-ENSURE-KBS-INITIALIZED", 2, 0, false);
        declareFunction("kbs_compare_assertion_mts", "KBS-COMPARE-ASSERTION-MTS", 0, 0, false);
        declareFunction("kbs_compare_instance_counts", "KBS-COMPARE-INSTANCE-COUNTS", 1, 0, false);
        declareFunction("kbs_compare_quoted_instance_counts", "KBS-COMPARE-QUOTED-INSTANCE-COUNTS", 1, 0, false);
        declareFunction("kbs_compare_spec_counts", "KBS-COMPARE-SPEC-COUNTS", 1, 0, false);
        declareFunction("kbs_compare_assertion_counts", "KBS-COMPARE-ASSERTION-COUNTS", 1, 1, false);
        declareFunction("equal_length_lists_subtraction", "EQUAL-LENGTH-LISTS-SUBTRACTION", 2, 0, false);
        declareFunction("kbs_compare_print_header", "KBS-COMPARE-PRINT-HEADER", 3, 0, false);
        declareFunction("kbs_compare_print", "KBS-COMPARE-PRINT", 2, 1, false);
        declareFunction("kbs_compare", "KBS-COMPARE", 1, 6, false);
        return NIL;
    }

    public static SubLObject init_kbs_compare_file() {
        deflexical("*KBS-COMPARE-INSTANCE-COLS*", $list0);
        deflexical("*KBS-COMPARE-QUOTED-INSTANCE-COLS*", $list1);
        deflexical("*KBS-COMPARE-SPEC-COLS*", $list2);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(new SubLObject[]{ reader_make_constant_shell("Individual"), reader_make_constant_shell("Relation"), reader_make_constant_shell("TruthFunction"), reader_make_constant_shell("Predicate"), reader_make_constant_shell("Function-Denotational"), reader_make_constant_shell("LinguisticObject"), reader_make_constant_shell("Event"), reader_make_constant_shell("Agent-Generic"), reader_make_constant_shell("Place-NonAgent"), reader_make_constant_shell("SetOrCollection"), reader_make_constant_shell("Collection"), reader_make_constant_shell("FirstOrderCollection"), reader_make_constant_shell("CollectionType"), reader_make_constant_shell("FacetingCollectionType"), reader_make_constant_shell("Set-Mathematical") });

    public static SubLObject setup_kbs_compare_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kbs_compare_file();
    }

    @Override
    public void initializeVariables() {
        init_kbs_compare_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kbs_compare_file();
    }

    

    static private final SubLList $list_alt1 = list(reader_make_constant_shell("DocumentationConstant"), reader_make_constant_shell("ImplementationConstant"), reader_make_constant_shell("TimeDimensionRelatedConstant"));

    static private final SubLList $list_alt2 = list(reader_make_constant_shell("Agent-Generic"), reader_make_constant_shell("Event"), reader_make_constant_shell("Place-NonAgent"), reader_make_constant_shell("Collection"));

    static private final SubLList $list_alt4 = list(reader_make_constant_shell("isa"), makeSymbol("?MT"), reader_make_constant_shell("Microtheory"));

    static private final SubLString $str_alt7$_A__A_A_A_A_A_ADifference__ = makeString("~A:~A~A~A~A~A~ADifference~%");

    static private final SubLString $str_alt8$_A__A_A_A__ = makeString("~A:~A~A~A~%");

    static private final SubLString $str_alt9$_A_A_A_A_A_A_A_A__ = makeString("~A~A~A~A~A~A~A~A~%");

    static private final SubLString $str_alt10$_A_A_A_A__ = makeString("~A~A~A~A~%");

    static private final SubLString $str_alt16$Collections__instance_count_ = makeString("Collections (instance-count)");

    static private final SubLString $str_alt17$Collections__quoted_instance_coun = makeString("Collections (quoted-instance-count)");

    static private final SubLString $str_alt18$Collections__spec_count_ = makeString("Collections (spec-count)");

    static private final SubLString $str_alt19$Assertion_MT__gaf_count_ = makeString("Assertion MT (gaf-count)");

    static private final SubLString $str_alt20$Assertion_MT__rule_count_ = makeString("Assertion MT (rule-count)");
}

/**
 * Total time: 148 ms
 */
