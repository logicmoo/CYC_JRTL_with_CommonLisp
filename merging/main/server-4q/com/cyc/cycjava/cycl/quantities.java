/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.arithmetic.arithmetic_answer;
import static com.cyc.cycjava.cycl.arithmetic.cyc_times_internal;
import static com.cyc.cycjava.cycl.arithmetic.quantity_reduce;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg1;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg2;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg3;
import static com.cyc.cycjava.cycl.assertions_high.gaf_args;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.czer_main.canonicalize_fn_term_if_reified;
import static com.cyc.cycjava.cycl.el_utilities.el_empty_set_p;
import static com.cyc.cycjava.cycl.el_utilities.el_extensional_set_p;
import static com.cyc.cycjava.cycl.el_utilities.el_intensional_set_p;
import static com.cyc.cycjava.cycl.el_utilities.el_list_items;
import static com.cyc.cycjava.cycl.el_utilities.el_list_p;
import static com.cyc.cycjava.cycl.el_utilities.el_non_empty_list_p;
import static com.cyc.cycjava.cycl.el_utilities.el_non_empty_set_p;
import static com.cyc.cycjava.cycl.el_utilities.el_set_or_collection_p;
import static com.cyc.cycjava.cycl.el_utilities.el_set_p;
import static com.cyc.cycjava.cycl.el_utilities.extensional_set_elements;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_el_extensional_set;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_el_list;
import static com.cyc.cycjava.cycl.el_utilities.make_el_set;
import static com.cyc.cycjava.cycl.el_utilities.make_nat_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.fraction_utilities.normalize_fractional_phrase;
import static com.cyc.cycjava.cycl.inference.ask_utilities.the_set_of_elements;
import static com.cyc.cycjava.cycl.iteration.iteration_next_without_values_macro_helper;
import static com.cyc.cycjava.cycl.kb_mapping_macros.destroy_final_index_iterator;
import static com.cyc.cycjava.cycl.kb_mapping_macros.do_gaf_arg_index_key_validator;
import static com.cyc.cycjava.cycl.kb_mapping_macros.new_final_index_iterator;
import static com.cyc.cycjava.cycl.kb_mapping_macros.new_gaf_arg_final_index_spec_iterator;
import static com.cyc.cycjava.cycl.kb_utilities.collection_subsumption_paths;
import static com.cyc.cycjava.cycl.kb_utilities.predicate_subsumption_paths;
import static com.cyc.cycjava.cycl.number_utilities.f_1X;
import static com.cyc.cycjava.cycl.number_utilities.gcd2;
import static com.cyc.cycjava.cycl.number_utilities.lcm2;
import static com.cyc.cycjava.cycl.number_utilities.n_random_integers;
import static com.cyc.cycjava.cycl.number_utilities.significant_digits;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.abs;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.ash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.lognot;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.logxor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.plusp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.truncate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_transitivity;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      QUANTITIES
 * source file: /cyc/top/cycl/quantities.lisp
 * created:     2019/07/03 17:37:52
 */
public final class quantities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new quantities();

 public static final String myName = "com.cyc.cycjava.cycl.quantities";


    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $convert_units_as_absolutesP$ = makeSymbol("*CONVERT-UNITS-AS-ABSOLUTES?*");

    // deflexical
    // Definitions
    /**
     * A representative sample of the KB constants that numerical quantification depends on.
     */
    @LispMethod(comment = "A representative sample of the KB constants that numerical quantification depends on.\ndeflexical")
    private static final SubLSymbol $quant_core_constants$ = makeSymbol("*QUANT-CORE-CONSTANTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $get_umf_search_state$ = makeSymbol("*GET-UMF-SEARCH-STATE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $get_umf_paths$ = makeSymbol("*GET-UMF-PATHS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $get_umf_allow_fractionsP$ = makeSymbol("*GET-UMF-ALLOW-FRACTIONS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $round_nth_n$ = makeSymbol("*ROUND-NTH-N*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $round_nth_output_format$ = makeSymbol("*ROUND-NTH-OUTPUT-FORMAT*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(new SubLObject[]{ reader_make_constant_shell("IntervalMinFn"), reader_make_constant_shell("IntervalMaxFn"), reader_make_constant_shell("Unity"), reader_make_constant_shell("UnitOfMeasure"), reader_make_constant_shell("maxQuantValue"), reader_make_constant_shell("minQuantValue"), reader_make_constant_shell("unitMultiplicationFactor"), reader_make_constant_shell("multiplicationUnits"), reader_make_constant_shell("PerFn"), reader_make_constant_shell("TheSet"), reader_make_constant_shell("TheSetOf"), reader_make_constant_shell("thereExistAtLeast"), reader_make_constant_shell("thereExistAtMost"), reader_make_constant_shell("thereExistExactly") });

    static private final SubLSymbol $sym1$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");



    private static final SubLSymbol CYC_SCALAR_INTERVAL_P = makeSymbol("CYC-SCALAR-INTERVAL-P");

    static private final SubLString $str4$A_KB_dependent_numerical_quantifi = makeString("A KB-dependent numerical quantification function was called, but the current Cyc KB does not contain knowledge about numerical quantification.");



    private static final SubLSymbol $sym7$_EXIT = makeSymbol("%EXIT");







    private static final SubLSymbol GET_DEFINITIONAL_UNIT_MULTIPLICATION_FACTOR = makeSymbol("GET-DEFINITIONAL-UNIT-MULTIPLICATION-FACTOR");

    private static final SubLSymbol $get_definitional_unit_multiplication_factor_caching_state$ = makeSymbol("*GET-DEFINITIONAL-UNIT-MULTIPLICATION-FACTOR-CACHING-STATE*");

    private static final SubLList $list15 = list(makeSymbol("ARG1-UNIT"), makeSymbol("ARG2-UNIT"), makeSymbol("RAW-FACTOR"));



    private static final SubLString $str18$Link_not_found_ = makeString("Link not found!");

    private static final SubLList $list19 = list(makeSymbol("IGNORE"), makeSymbol("PREVIOUS-UNIT"), makeSymbol("FACTOR"));

    private static final SubLString $str20$No_previous_unit_ = makeString("No previous unit.");





    private static final SubLList $list23 = list(makeSymbol("UNIT1"), makeSymbol("MIN1"), makeSymbol("&OPTIONAL"), makeSymbol("MAX1"));

    private static final SubLList $list24 = list(makeSymbol("UNIT2"), makeSymbol("MIN2"), makeSymbol("&OPTIONAL"), makeSymbol("MAX2"));

    private static final SubLSymbol CYC_INTEGER_RANGE = makeSymbol("CYC-INTEGER-RANGE");





    private static final SubLSymbol CYC_NUMBER_RANGE = makeSymbol("CYC-NUMBER-RANGE");



    private static final SubLSymbol $sym31$FUZZY_NUMBER_ = makeSymbol("FUZZY-NUMBER?");





    private static final SubLSymbol CYC_QUANTITY_CONVERSION = makeSymbol("CYC-QUANTITY-CONVERSION");

    private static final SubLSymbol CYC_QUANTITY_CONVERSION_ABSOLUTE = makeSymbol("CYC-QUANTITY-CONVERSION-ABSOLUTE");







    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol CYC_QUOTIENT = makeSymbol("CYC-QUOTIENT");

    private static final SubLSymbol CYC_INVERSE = makeSymbol("CYC-INVERSE");

    private static final SubLSymbol CYC_MODULO = makeSymbol("CYC-MODULO");

    private static final SubLString $str44$Got__S___Wanted__S = makeString("Got ~S~% Wanted ~S");

    private static final SubLSymbol CYC_RESIDUE = makeSymbol("CYC-RESIDUE");





    private static final SubLSymbol CYC_ABSOLUTE_VALUE = makeSymbol("CYC-ABSOLUTE-VALUE");

    private static final SubLSymbol CYC_SQRT = makeSymbol("CYC-SQRT");

    private static final SubLSymbol CYC_SQUARED = makeSymbol("CYC-SQUARED");

    private static final SubLList $list52 = list(makeSymbol("MIN"), makeSymbol("&OPTIONAL"), list(makeSymbol("MAX"), makeSymbol("MIN")));

    private static final SubLSymbol CYC_PERCENT = makeSymbol("CYC-PERCENT");

    private static final SubLSymbol CEILING = makeSymbol("CEILING");

    private static final SubLSymbol CYC_ROUND_UP = makeSymbol("CYC-ROUND-UP");

    private static final SubLSymbol ROUND = makeSymbol("ROUND");

    private static final SubLSymbol CYC_ROUND_CLOSEST = makeSymbol("CYC-ROUND-CLOSEST");

    private static final SubLSymbol FLOOR = makeSymbol("FLOOR");

    private static final SubLSymbol CYC_ROUND_DOWN = makeSymbol("CYC-ROUND-DOWN");

    private static final SubLSymbol TRUNCATE = makeSymbol("TRUNCATE");

    private static final SubLSymbol CYC_ROUND_TRUNCATE = makeSymbol("CYC-ROUND-TRUNCATE");



    private static final SubLSymbol ROUND_TO_NTH_DECIMAL = makeSymbol("ROUND-TO-NTH-DECIMAL");

    private static final SubLSymbol CYC_ROUND_CLOSEST_TO_NTH_DECIMAL = makeSymbol("CYC-ROUND-CLOSEST-TO-NTH-DECIMAL");

    private static final SubLSymbol CYC_MAX_RANGE_INTERNAL = makeSymbol("CYC-MAX-RANGE-INTERNAL");

    private static final SubLSymbol CYC_MAX_RANGE = makeSymbol("CYC-MAX-RANGE");

    private static final SubLSymbol CYC_MIN_RANGE_INTERNAL = makeSymbol("CYC-MIN-RANGE-INTERNAL");

    private static final SubLSymbol CYC_MIN_RANGE = makeSymbol("CYC-MIN-RANGE");

    private static final SubLSymbol CYC_MIN_QUANT_VALUE = makeSymbol("CYC-MIN-QUANT-VALUE");

    private static final SubLSymbol CYC_MAX_QUANT_VALUE = makeSymbol("CYC-MAX-QUANT-VALUE");

    private static final SubLSymbol CYC_QUANTITY_UNIT = makeSymbol("CYC-QUANTITY-UNIT");

    private static final SubLSymbol CYC_QUANTITY_MEASURE = makeSymbol("CYC-QUANTITY-MEASURE");

    private static final SubLSymbol CYC_TOLERANCE = makeSymbol("CYC-TOLERANCE");

    private static final SubLSymbol CYC_SIGNIFICANT_DIGITS = makeSymbol("CYC-SIGNIFICANT-DIGITS");

    private static final SubLSymbol SIN = makeSymbol("SIN");

    private static final SubLSymbol CYC_SINE = makeSymbol("CYC-SINE");

    private static final SubLSymbol COS = makeSymbol("COS");

    private static final SubLSymbol CYC_COSINE = makeSymbol("CYC-COSINE");

    private static final SubLSymbol TAN = makeSymbol("TAN");

    private static final SubLSymbol CYC_TANGENT = makeSymbol("CYC-TANGENT");

    private static final SubLSymbol CYC_COSECANT = makeSymbol("CYC-COSECANT");

    private static final SubLSymbol CYC_SECANT = makeSymbol("CYC-SECANT");

    private static final SubLSymbol CYC_COTANGENT = makeSymbol("CYC-COTANGENT");



    private static final SubLSymbol ASIN = makeSymbol("ASIN");

    private static final SubLSymbol CYC_ARC_SINE = makeSymbol("CYC-ARC-SINE");

    private static final SubLSymbol ACOS = makeSymbol("ACOS");

    private static final SubLSymbol CYC_ARC_COSINE = makeSymbol("CYC-ARC-COSINE");

    private static final SubLSymbol ATAN = makeSymbol("ATAN");

    private static final SubLSymbol CYC_ARC_TANGENT = makeSymbol("CYC-ARC-TANGENT");

    private static final SubLSymbol CYC_ARC_COSECANT = makeSymbol("CYC-ARC-COSECANT");

    private static final SubLSymbol CYC_ARC_SECANT = makeSymbol("CYC-ARC-SECANT");

    private static final SubLSymbol CYC_ARC_COTANGENT = makeSymbol("CYC-ARC-COTANGENT");

    private static final SubLSymbol CYC_LOGARITHM = makeSymbol("CYC-LOGARITHM");

    private static final SubLSymbol CYC_EXPONENT = makeSymbol("CYC-EXPONENT");

    private static final SubLSymbol CYC_QUADRATIC_SOLUTION_POSITIVE = makeSymbol("CYC-QUADRATIC-SOLUTION-POSITIVE");

    private static final SubLSymbol CYC_QUADRATIC_SOLUTION_NEGATIVE = makeSymbol("CYC-QUADRATIC-SOLUTION-NEGATIVE");

    private static final SubLSymbol MAKE_EL_LIST = makeSymbol("MAKE-EL-LIST");

    private static final SubLSymbol CYC_COLLECTION_SUBSUMPTION_PATHS = makeSymbol("CYC-COLLECTION-SUBSUMPTION-PATHS");

    private static final SubLSymbol CYC_PREDICATE_SUBSUMPTION_PATHS = makeSymbol("CYC-PREDICATE-SUBSUMPTION-PATHS");



    private static final SubLSymbol $sym108$FRACTION_ = makeSymbol("FRACTION?");





    private static final SubLString $str111$Can_t_negate__S = makeString("Can't negate ~S");



    static private final SubLList $list113 = list(makeSymbol("WHOLE"), makeSymbol("NUMERATOR"), makeSymbol("DENOMINATOR"));

    private static final SubLList $list114 = list(makeSymbol("NUMERATOR"), makeSymbol("DENOMINATOR"));

    private static final SubLSymbol $sym115$SIMPLE_FRACTION_ = makeSymbol("SIMPLE-FRACTION?");





    private static final SubLSymbol CYC_QUANTITY_SUBSUMES = makeSymbol("CYC-QUANTITY-SUBSUMES");



    private static final SubLSymbol CYC_QUANTITY_INTERSECTS = makeSymbol("CYC-QUANTITY-INTERSECTS");

    private static final SubLSymbol CYC_DIVIDES_EVENLY = makeSymbol("CYC-DIVIDES-EVENLY");

    private static final SubLSymbol CYC_LIST_NTH = makeSymbol("CYC-LIST-NTH");

    private static final SubLSymbol CYC_LIST_CONCATENATE = makeSymbol("CYC-LIST-CONCATENATE");

    private static final SubLSymbol CYC_APPEND_TO_LIST = makeSymbol("CYC-APPEND-TO-LIST");

    private static final SubLSymbol CYC_PREPEND_TO_LIST = makeSymbol("CYC-PREPEND-TO-LIST");

    private static final SubLSymbol CYC_LIST_FIRST = makeSymbol("CYC-LIST-FIRST");

    private static final SubLSymbol CYC_LIST_SECOND = makeSymbol("CYC-LIST-SECOND");

    private static final SubLSymbol CYC_LIST_REST = makeSymbol("CYC-LIST-REST");

    private static final SubLSymbol CYC_LIST_LAST = makeSymbol("CYC-LIST-LAST");

    private static final SubLSymbol CYC_LIST_SUBSEQ = makeSymbol("CYC-LIST-SUBSEQ");



    private static final SubLSymbol CYC_LIST_SUBSEQ_UP_TO = makeSymbol("CYC-LIST-SUBSEQ-UP-TO");

    private static final SubLSymbol CYC_LIST_SEARCH = makeSymbol("CYC-LIST-SEARCH");

    private static final SubLSymbol CYC_POSITION = makeSymbol("CYC-POSITION");

    private static final SubLSymbol CYC_LIST_LENGTH = makeSymbol("CYC-LIST-LENGTH");

    private static final SubLSymbol CYC_LIST_REVERSE = makeSymbol("CYC-LIST-REVERSE");

    private static final SubLSymbol CYC_LIST_MEMBER_SET = makeSymbol("CYC-LIST-MEMBER-SET");

    private static final SubLSymbol CYC_SET_ELEMENT_LIST = makeSymbol("CYC-SET-ELEMENT-LIST");

    private static final SubLSymbol $sym142$DOUBLETON_ = makeSymbol("DOUBLETON?");

    private static final SubLSymbol DOUBLETON_TO_CONS = makeSymbol("DOUBLETON-TO-CONS");

    private static final SubLSymbol CYC_SUBSTITUTE_FROM_LIST = makeSymbol("CYC-SUBSTITUTE-FROM-LIST");

    private static final SubLList $list145 = list(makeSymbol("A"), makeSymbol("B"));

    private static final SubLSymbol CYC_SUBSTITUTE_FROM_THE_TERM_BINDING_SET = makeSymbol("CYC-SUBSTITUTE-FROM-THE-TERM-BINDING-SET");

    private static final SubLSymbol CYC_REMOVE_ADJACENT_DUPLICATES_FROM_LIST_FN = makeSymbol("CYC-REMOVE-ADJACENT-DUPLICATES-FROM-LIST-FN");

    private static final SubLSymbol CYC_MAP_FUNCTION_OVER_LIST = makeSymbol("CYC-MAP-FUNCTION-OVER-LIST");

    private static final SubLSymbol CYC_MAP_FUNCTION_OVER_LIST_UNTIL = makeSymbol("CYC-MAP-FUNCTION-OVER-LIST-UNTIL");

    private static final SubLSymbol CYC_MAP_FUNCTION_OVER_LIST_UNTIL_RESULT = makeSymbol("CYC-MAP-FUNCTION-OVER-LIST-UNTIL-RESULT");

    private static final SubLSymbol CYC_MAP_FUNCTION_WITH_ARGS_OVER_LISTS = makeSymbol("CYC-MAP-FUNCTION-WITH-ARGS-OVER-LISTS");

    private static final SubLSymbol CYC_APPLY_FUNCTION_RECURSIVELY = makeSymbol("CYC-APPLY-FUNCTION-RECURSIVELY");

    private static final SubLSymbol $sym154$CYC_LIST_MEMBER_ = makeSymbol("CYC-LIST-MEMBER?");

    private static final SubLSymbol $sym155$CYC_LIST_CONTAINS_MEMBER_ = makeSymbol("CYC-LIST-CONTAINS-MEMBER?");

    private static final SubLList $list156 = list(makeSymbol("CYC-LIST-MEMBER?"));

    private static final SubLSymbol $sym157$CYC_SUBLIST_ = makeSymbol("CYC-SUBLIST?");

    private static final SubLSymbol $sym158$CYC_INITIAL_SUBLIST_ = makeSymbol("CYC-INITIAL-SUBLIST?");

    private static final SubLString $str160$Don_t_know_how_to_determine_the_e = makeString("Don't know how to determine the extent of ~S in ~S");

    private static final SubLSymbol CYC_SET_INTERSECTION = makeSymbol("CYC-SET-INTERSECTION");

    private static final SubLSymbol CYC_SET_UNION = makeSymbol("CYC-SET-UNION");

    private static final SubLSymbol CYC_SET_DIFFERENCE = makeSymbol("CYC-SET-DIFFERENCE");





    private static final SubLSymbol CYC_SET_EXTENT = makeSymbol("CYC-SET-EXTENT");

    private static final SubLSymbol CYC_MAP_FUNCTION_OVER_SET = makeSymbol("CYC-MAP-FUNCTION-OVER-SET");

    private static final SubLSymbol CYC_LEAST_COMMON_MULTIPLE_INTERNAL = makeSymbol("CYC-LEAST-COMMON-MULTIPLE-INTERNAL");

    private static final SubLSymbol CYC_LEAST_COMMON_MULTIPLE = makeSymbol("CYC-LEAST-COMMON-MULTIPLE");

    private static final SubLSymbol CYC_GREATEST_COMMON_DIVISOR_INTERNAL = makeSymbol("CYC-GREATEST-COMMON-DIVISOR-INTERNAL");

    private static final SubLSymbol CYC_GREATEST_COMMON_DIVISOR = makeSymbol("CYC-GREATEST-COMMON-DIVISOR");

    private static final SubLSymbol CYC_RANDOM_INTEGER = makeSymbol("CYC-RANDOM-INTEGER");



    private static final SubLInteger $int$_24 = makeInteger(-24);

    private static final SubLInteger $int$_14 = makeInteger(-14);

    private static final SubLInteger $int$_28 = makeInteger(-28);



    private static final SubLSymbol CYC_RANDOM_INTEGER_WITH_SEED = makeSymbol("CYC-RANDOM-INTEGER-WITH-SEED");

    private static final SubLSymbol ARITHMETIC_ANSWER = makeSymbol("ARITHMETIC-ANSWER");

    private static final SubLSymbol CYC_N_RANDOM_INTEGERS = makeSymbol("CYC-N-RANDOM-INTEGERS");

    private static final SubLSymbol CYC_MATRIX_SOLUTION = makeSymbol("CYC-MATRIX-SOLUTION");

    private static final SubLSymbol GET_INTERCONVERTIBLE_UNITS_OF_MEASURE = makeSymbol("GET-INTERCONVERTIBLE-UNITS-OF-MEASURE");

    private static final SubLList $list184 = list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?U"), reader_make_constant_shell("UnitOfMeasureNoPrefix")), list(reader_make_constant_shell("isa"), makeSymbol("?UT"), reader_make_constant_shell("InterconvertibleUnitType")), list(reader_make_constant_shell("isa"), makeSymbol("?U"), makeSymbol("?UT")));

    private static final SubLObject $const185$CurrentWorldDataCollectorMt_NonHo = reader_make_constant_shell("CurrentWorldDataCollectorMt-NonHomocentric");

    private static final SubLList $list186 = list(new SubLObject[]{ makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL, makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("COMPUTE-INTERSECTION"), makeKeyword("MAX-TIME"), makeInteger(30), makeKeyword("RESULT-UNIQUENESS"), makeKeyword("BINDINGS"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), list(makeSymbol("?UT"), makeSymbol("?U"))) });

    private static final SubLList $list187 = list(makeSymbol("UNIT-TYPE"), makeSymbol("UNIT"));

    /**
     * Determines whether the portion of the KB necessary for numerical quantification is loaded.
     * This is the KB analogue of the #+Cyc-Quant feature.
     */
    @LispMethod(comment = "Determines whether the portion of the KB necessary for numerical quantification is loaded.\r\nThis is the KB analogue of the #+Cyc-Quant feature.\nDetermines whether the portion of the KB necessary for numerical quantification is loaded.\nThis is the KB analogue of the #+Cyc-Quant feature.")
    public static final SubLObject initialize_quant_kb_feature_alt() {
        if (NIL != list_utilities.every_in_list($sym1$VALID_CONSTANT_, $quant_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_quant_kb_loaded();
        } else {
            kb_control_vars.unset_quant_kb_loaded();
        }
        return kb_control_vars.quant_kb_loaded_p();
    }

    /**
     * Determines whether the portion of the KB necessary for numerical quantification is loaded.
     * This is the KB analogue of the #+Cyc-Quant feature.
     */
    @LispMethod(comment = "Determines whether the portion of the KB necessary for numerical quantification is loaded.\r\nThis is the KB analogue of the #+Cyc-Quant feature.\nDetermines whether the portion of the KB necessary for numerical quantification is loaded.\nThis is the KB analogue of the #+Cyc-Quant feature.")
    public static SubLObject initialize_quant_kb_feature() {
        if (NIL != list_utilities.every_in_list($sym1$VALID_CONSTANT_, $quant_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_quant_kb_loaded();
        } else {
            kb_control_vars.unset_quant_kb_loaded();
        }
        return kb_control_vars.quant_kb_loaded_p();
    }

    public static final SubLObject cyc_scalar_interval_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != extended_numbers.extended_number_p(v_object)) || (NIL != collection_defns.ibqeP(v_object, UNPROVIDED))) || (NIL != isa.isa_in_any_mtP(v_object, $$ScalarInterval)));
    }

    public static SubLObject cyc_scalar_interval_p(final SubLObject v_object) {
        return makeBoolean(((NIL != extended_numbers.extended_number_p(v_object)) || (NIL != collection_defns.ibqeP(v_object, UNPROVIDED))) || (NIL != isa.isa_in_any_mtP(v_object, $$ScalarInterval)));
    }

    public static final SubLObject list_of_cyc_scalar_interval_p_alt(SubLObject v_object) {
        return list_utilities.list_of_type_p(symbol_function(CYC_SCALAR_INTERVAL_P), v_object);
    }

    public static SubLObject list_of_cyc_scalar_interval_p(final SubLObject v_object) {
        return list_utilities.list_of_type_p(symbol_function(CYC_SCALAR_INTERVAL_P), v_object);
    }

    public static final SubLObject make_interval_alt(SubLObject unit, SubLObject min, SubLObject max) {
        if (max == UNPROVIDED) {
            max = min;
        }
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str_alt4$A_KB_dependent_numerical_quantifi);
        }
        if (NIL != extended_numbers.extended_numberE(min, max, UNPROVIDED)) {
            if (unit == $$Unity) {
                return min;
            } else {
                return list(unit, min);
            }
        } else {
            return list(unit, min, max);
        }
    }

    public static SubLObject make_interval(SubLObject unit, SubLObject min, SubLObject max) {
        if (max == UNPROVIDED) {
            max = min;
        }
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str4$A_KB_dependent_numerical_quantifi);
        }
        unit = function_terms.naut_to_nart(unit);
        min = arithmetic.arithmetic_answer(min);
        max = arithmetic.arithmetic_answer(max);
        if (NIL != extended_numbers.possibly_infinite_or_extended_numberE(min, max)) {
            if (unit.eql($$Unity)) {
                return min;
            }
            return list(unit, min);
        } else {
            if (NIL != extended_numbers.possibly_infinite_or_extended_numberL(min, max)) {
                return list(unit, min, max);
            }
            return list(unit, max, min);
        }
    }

    public static SubLObject explode_interval_ignoring_unevaluatable(final SubLObject interval) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_this = NIL;
        try {
            thread.throwStack.push($UNEVALUATABLE);
            return explode_interval(interval);
        } catch (final Throwable ccatch_env_var) {
            catch_this = Errors.handleThrowable(ccatch_env_var, $UNEVALUATABLE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    /**
     * Expand quantity INTERVAL into a fully-specified IBQE.
     */
    @LispMethod(comment = "Expand quantity INTERVAL into a fully-specified IBQE.")
    public static final SubLObject explode_interval_alt(SubLObject interval) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str_alt4$A_KB_dependent_numerical_quantifi);
        }
        if (NIL != extended_numbers.extended_number_p(interval)) {
            return values($$Unity, interval, interval);
        } else {
            if (NIL != forts.fort_p(interval)) {
                return com.cyc.cycjava.cycl.quantities.explode_fort_interval(interval);
            } else {
                if (interval.isAtom()) {
                    relation_evaluation.throw_unevaluatable();
                } else {
                    {
                        SubLObject unit = NIL;
                        SubLObject min = NIL;
                        SubLObject max = NIL;
                        unit = interval.first();
                        if (NIL == unit) {
                            relation_evaluation.throw_unevaluatable();
                        }
                        min = second(interval);
                        if (NIL == extended_numbers.extended_number_p(min)) {
                            relation_evaluation.throw_unevaluatable();
                        }
                        max = (length(interval).numE(THREE_INTEGER)) ? ((SubLObject) (third(interval))) : min;
                        if (NIL == extended_numbers.extended_number_p(max)) {
                            relation_evaluation.throw_unevaluatable();
                        }
                        if (NIL == extended_numbers.extended_numberGE(max, min, UNPROVIDED)) {
                            relation_evaluation.throw_unevaluatable();
                        }
                        return values(unit, min, max);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Expand quantity INTERVAL into a fully-specified IBQE.
     */
    @LispMethod(comment = "Expand quantity INTERVAL into a fully-specified IBQE.")
    public static SubLObject explode_interval(final SubLObject interval) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str4$A_KB_dependent_numerical_quantifi);
        }
        if ((NIL != extended_numbers.extended_number_p(interval)) || (NIL != collection_defns.fractionP(interval, UNPROVIDED))) {
            return values($$Unity, interval, interval);
        }
        if (NIL != forts.fort_p(interval)) {
            return explode_fort_interval(interval);
        }
        if (interval.isAtom()) {
            relation_evaluation.throw_unevaluatable();
            return NIL;
        }
        SubLObject unit = NIL;
        SubLObject min = NIL;
        SubLObject max = NIL;
        unit = interval.first();
        if (NIL == unit) {
            relation_evaluation.throw_unevaluatable();
        }
        min = second(interval);
        if ((NIL == extended_numbers.possibly_infinite_or_extended_number_p(min)) && (NIL == collection_defns.fractionP(min, UNPROVIDED))) {
            relation_evaluation.throw_unevaluatable();
        }
        max = (length(interval).numE(THREE_INTEGER)) ? third(interval) : min;
        if ((NIL == extended_numbers.possibly_infinite_or_extended_number_p(max)) && (NIL == collection_defns.fractionP(max, UNPROVIDED))) {
            relation_evaluation.throw_unevaluatable();
        }
        if ((NIL == extended_numbers.possibly_infinite_or_extended_numberLE(min, max)) && (NIL == fractionsLE(min, max))) {
            relation_evaluation.throw_unevaluatable();
        }
        return values(unit, min, max);
    }

    /**
     * Convert fort INTERVAL to an IBQE, if possible
     */
    @LispMethod(comment = "Convert fort INTERVAL to an IBQE, if possible")
    public static final SubLObject explode_fort_interval_alt(SubLObject interval) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(interval, FORT_P);
            if (NIL == kb_control_vars.quant_kb_loaded_p()) {
                Errors.error($str_alt4$A_KB_dependent_numerical_quantifi);
            }
            {
                SubLObject max_quant_value = com.cyc.cycjava.cycl.quantities.max_quant_value(interval, UNPROVIDED);
                SubLObject min_quant_value = com.cyc.cycjava.cycl.quantities.min_quant_value(interval, UNPROVIDED);
                if ((((NIL != max_quant_value) && (NIL != min_quant_value)) && (NIL == forts.fort_p(max_quant_value))) && (NIL == forts.fort_p(min_quant_value))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject max_quant_unit = com.cyc.cycjava.cycl.quantities.explode_interval(max_quant_value);
                        SubLObject max_quant_min = thread.secondMultipleValue();
                        SubLObject max_quant_max = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        thread.resetMultipleValues();
                        {
                            SubLObject min_quant_unit = com.cyc.cycjava.cycl.quantities.explode_interval(min_quant_value);
                            SubLObject min_quant_min = thread.secondMultipleValue();
                            SubLObject min_quant_max = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (max_quant_unit != min_quant_unit) {
                                relation_evaluation.throw_unevaluatable();
                            }
                            if (NIL == extended_numbers.extended_numberGE(max_quant_min, min_quant_max, UNPROVIDED)) {
                                relation_evaluation.throw_unevaluatable();
                            }
                            return values(max_quant_unit, min_quant_max, max_quant_min);
                        }
                    }
                }
            }
            if (NIL != nart_handles.nart_p(interval)) {
                {
                    SubLObject nart_hl_formula = narts_high.nart_hl_formula(interval);
                    if (NIL != nart_hl_formula) {
                        return com.cyc.cycjava.cycl.quantities.explode_interval(nart_hl_formula);
                    }
                }
            }
            relation_evaluation.throw_unevaluatable();
            return NIL;
        }
    }

    /**
     * Convert fort INTERVAL to an IBQE, if possible
     */
    @LispMethod(comment = "Convert fort INTERVAL to an IBQE, if possible")
    public static SubLObject explode_fort_interval(final SubLObject interval) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(interval) : "! forts.fort_p(interval) " + ("forts.fort_p(interval) " + "CommonSymbols.NIL != forts.fort_p(interval) ") + interval;
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str4$A_KB_dependent_numerical_quantifi);
        }
        if (NIL != extended_numbers.cyc_infinite_number_p(interval)) {
            return values($$Unity, interval, interval);
        }
        final SubLObject max_quant_value = max_quant_value(interval, UNPROVIDED);
        final SubLObject min_quant_value = min_quant_value(interval, UNPROVIDED);
        if ((((NIL != max_quant_value) && (NIL != min_quant_value)) && ((NIL == forts.fort_p(max_quant_value)) || (NIL != extended_numbers.cyc_infinite_number_p(max_quant_value)))) && ((NIL == forts.fort_p(min_quant_value)) || (NIL != extended_numbers.cyc_infinite_number_p(min_quant_value)))) {
            thread.resetMultipleValues();
            final SubLObject max_quant_unit = explode_interval(max_quant_value);
            final SubLObject max_quant_min = thread.secondMultipleValue();
            final SubLObject max_quant_max = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject min_quant_unit = explode_interval(min_quant_value);
            final SubLObject min_quant_min = thread.secondMultipleValue();
            final SubLObject min_quant_max = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (!max_quant_unit.eql(min_quant_unit)) {
                relation_evaluation.throw_unevaluatable();
            }
            if (NIL == extended_numbers.possibly_infinite_or_extended_numberLE(min_quant_max, max_quant_min)) {
                relation_evaluation.throw_unevaluatable();
            }
            return values(max_quant_unit, min_quant_max, max_quant_min);
        }
        if (NIL != nart_handles.nart_p(interval)) {
            final SubLObject nart_hl_formula = narts_high.nart_hl_formula(interval);
            if (NIL != nart_hl_formula) {
                return explode_interval(nart_hl_formula);
            }
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    public static final SubLObject max_quant_value_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str_alt4$A_KB_dependent_numerical_quantifi);
        }
        return kb_mapping_utilities.fpred_value_in_relevant_mts(fort, $$maxQuantValue, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject max_quant_value(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str4$A_KB_dependent_numerical_quantifi);
        }
        return kb_mapping_utilities.fpred_value_in_relevant_mts(fort, $$maxQuantValue, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject min_quant_value_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str_alt4$A_KB_dependent_numerical_quantifi);
        }
        return kb_mapping_utilities.fpred_value_in_relevant_mts(fort, $$minQuantValue, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject min_quant_value(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str4$A_KB_dependent_numerical_quantifi);
        }
        return kb_mapping_utilities.fpred_value_in_relevant_mts(fort, $$minQuantValue, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject comparable_units_alt(SubLObject target_unit, SubLObject unit) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str_alt4$A_KB_dependent_numerical_quantifi);
        }
        return makeBoolean((target_unit == unit) || (NIL != list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.quantities.get_unit_multiplication_factor(unit, target_unit))));
    }

    public static SubLObject comparable_units(final SubLObject target_unit, final SubLObject unit) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str4$A_KB_dependent_numerical_quantifi);
        }
        return makeBoolean(target_unit.eql(unit) || (NIL != list_utilities.sublisp_boolean(get_unit_multiplication_factor(unit, target_unit))));
    }

    /**
     * Returns T IFF UNIT1 is comparable to UNIT2 and one UNIT1 is a
     * smaller quantity than one UNIT2
     */
    @LispMethod(comment = "Returns T IFF UNIT1 is comparable to UNIT2 and one UNIT1 is a\r\nsmaller quantity than one UNIT2\nReturns T IFF UNIT1 is comparable to UNIT2 and one UNIT1 is a\nsmaller quantity than one UNIT2")
    public static final SubLObject smaller_unit_than_alt(SubLObject unit1, SubLObject unit2) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str_alt4$A_KB_dependent_numerical_quantifi);
        }
        {
            SubLObject factor = com.cyc.cycjava.cycl.quantities.get_unit_multiplication_factor(unit1, unit2);
            if (NIL == extended_numbers.extended_number_p(factor)) {
                return NIL;
            } else {
                return numL(factor, ONE_INTEGER);
            }
        }
    }

    /**
     * Returns T IFF UNIT1 is comparable to UNIT2 and one UNIT1 is a
     * smaller quantity than one UNIT2
     */
    @LispMethod(comment = "Returns T IFF UNIT1 is comparable to UNIT2 and one UNIT1 is a\r\nsmaller quantity than one UNIT2\nReturns T IFF UNIT1 is comparable to UNIT2 and one UNIT1 is a\nsmaller quantity than one UNIT2")
    public static SubLObject smaller_unit_than(final SubLObject unit1, final SubLObject unit2) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str4$A_KB_dependent_numerical_quantifi);
        }
        final SubLObject factor = get_unit_multiplication_factor(unit1, unit2);
        if (NIL == extended_numbers.extended_number_p(factor)) {
            return NIL;
        }
        return numL(factor, ONE_INTEGER);
    }

    public static final SubLObject convert_to_units_alt(SubLObject target_unit, SubLObject unit, SubLObject min, SubLObject max) {
        if (max == UNPROVIDED) {
            max = min;
        }
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str_alt4$A_KB_dependent_numerical_quantifi);
        }
        if (target_unit == unit) {
            return values(min, max);
        }
        {
            SubLObject factor = com.cyc.cycjava.cycl.quantities.get_unit_multiplication_factor(unit, target_unit);
            if (NIL == extended_numbers.extended_number_p(factor)) {
                return NIL;
            } else {
                if (factor.numE(ONE_INTEGER)) {
                    return values(min, max);
                } else {
                    return values(extended_numbers.extended_number_times(min, factor), extended_numbers.extended_number_times(max, factor));
                }
            }
        }
    }

    public static SubLObject convert_to_units(final SubLObject target_unit, final SubLObject unit, final SubLObject min, SubLObject max) {
        if (max == UNPROVIDED) {
            max = min;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $convert_units_as_absolutesP$.getDynamicValue(thread)) {
            return convert_to_units_absolute(target_unit, unit, min, max);
        }
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str4$A_KB_dependent_numerical_quantifi);
        }
        if (target_unit.equal(unit)) {
            return values(min, max);
        }
        final SubLObject factor = get_unit_multiplication_factor(unit, target_unit);
        if (NIL == extended_numbers.extended_number_p(factor)) {
            return NIL;
        }
        if (factor.numE(ONE_INTEGER)) {
            return values(min, max);
        }
        return values(extended_numbers.extended_number_times(min, factor), extended_numbers.extended_number_times(max, factor));
    }

    public static SubLObject convert_to_units_absolute(final SubLObject target_unit, final SubLObject unit, final SubLObject min, SubLObject max) {
        if (max == UNPROVIDED) {
            max = min;
        }
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str4$A_KB_dependent_numerical_quantifi);
        }
        if (target_unit.eql(unit)) {
            return values(min, max);
        }
        final SubLObject factor = get_unit_multiplication_factor(unit, target_unit);
        final SubLObject absolute_scale_offset = get_unit_absolute_scale_offset(unit, target_unit);
        final SubLObject opposite_scale_offset = get_unit_absolute_scale_offset(target_unit, unit);
        if (NIL == extended_numbers.extended_number_p(factor)) {
            return NIL;
        }
        if (NIL != absolute_scale_offset) {
            return values(add(absolute_scale_offset, extended_numbers.extended_number_times(min, factor)), add(absolute_scale_offset, extended_numbers.extended_number_times(max, factor)));
        }
        if (NIL != opposite_scale_offset) {
            return values(extended_numbers.extended_number_times(subtract(min, opposite_scale_offset), factor), extended_numbers.extended_number_times(subtract(max, opposite_scale_offset), factor));
        }
        return values(extended_numbers.extended_number_times(min, factor), extended_numbers.extended_number_times(max, factor));
    }

    /**
     * Return the conversion factor to multiply quantities in FROM-UNIT to get
     * quantities in TO-UNIT.  Return NIL if no coversion can be determined.
     */
    @LispMethod(comment = "Return the conversion factor to multiply quantities in FROM-UNIT to get\r\nquantities in TO-UNIT.  Return NIL if no coversion can be determined.\nReturn the conversion factor to multiply quantities in FROM-UNIT to get\nquantities in TO-UNIT.  Return NIL if no coversion can be determined.")
    public static final SubLObject unit_multiplication_factor_alt(SubLObject from_unit, SubLObject to_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject factor = NIL;
                if (NIL != mt) {
                    {
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                factor = com.cyc.cycjava.cycl.quantities.get_unit_multiplication_factor(from_unit, to_unit);
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    factor = com.cyc.cycjava.cycl.quantities.get_unit_multiplication_factor(from_unit, to_unit);
                }
                return factor;
            }
        }
    }

    /**
     * Return the conversion factor to multiply quantities in FROM-UNIT to get
     * quantities in TO-UNIT.  Return NIL if no coversion can be determined.
     */
    @LispMethod(comment = "Return the conversion factor to multiply quantities in FROM-UNIT to get\r\nquantities in TO-UNIT.  Return NIL if no coversion can be determined.\nReturn the conversion factor to multiply quantities in FROM-UNIT to get\nquantities in TO-UNIT.  Return NIL if no coversion can be determined.")
    public static SubLObject unit_multiplication_factor(final SubLObject from_unit, final SubLObject to_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject factor = NIL;
        if (NIL != mt) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                factor = get_unit_multiplication_factor(from_unit, to_unit);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        } else {
            factor = get_unit_multiplication_factor(from_unit, to_unit);
        }
        return factor;
    }

    public static final SubLObject get_unit_multiplication_factor_alt(SubLObject from_unit, SubLObject to_unit) {
        if (from_unit == to_unit) {
            return ONE_INTEGER;
        }
        {
            SubLObject factor = com.cyc.cycjava.cycl.quantities.get_definitional_unit_multiplication_factor(from_unit, to_unit);
            if (NIL == factor) {
                factor = com.cyc.cycjava.cycl.quantities.get_contingent_unit_multiplication_factor(from_unit, to_unit);
            }
            return factor;
        }
    }

    public static SubLObject get_unit_multiplication_factor(final SubLObject from_unit, final SubLObject to_unit) {
        if (NIL != czer_utilities.equals_elP(from_unit, to_unit, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return ONE_INTEGER;
        }
        SubLObject factor = get_definitional_unit_multiplication_factor(from_unit, to_unit);
        if (NIL == factor) {
            factor = get_contingent_unit_multiplication_factor(from_unit, to_unit);
        }
        return factor;
    }

    public static SubLObject get_unit_absolute_scale_offset(final SubLObject from_unit, final SubLObject to_unit) {
        SubLObject result = NIL;
        final SubLObject pred_var = $$unitAbsoluteScaleOffset;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(to_unit, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(to_unit, ONE_INTEGER, pred_var);
            SubLObject done_var = result;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$1 = result;
                        final SubLObject token_var_$2 = NIL;
                        while (NIL == done_var_$1) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                            final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                            if ((NIL != valid_$3) && from_unit.eql(assertions_high.gaf_arg2(assertion))) {
                                relation_evaluation.cyc_evaluate_note_support(assertion);
                                result = assertions_high.gaf_arg3(assertion);
                            }
                            done_var_$1 = makeBoolean((NIL == valid_$3) || (NIL != result));
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
                done_var = makeBoolean((NIL == valid) || (NIL != result));
            } 
        }
        return result;
    }

    public static final SubLObject clear_get_definitional_unit_multiplication_factor_alt() {
        {
            SubLObject cs = $get_definitional_unit_multiplication_factor_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_get_definitional_unit_multiplication_factor() {
        final SubLObject cs = $get_definitional_unit_multiplication_factor_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_get_definitional_unit_multiplication_factor_alt(SubLObject from_unit, SubLObject to_unit) {
        return memoization_state.caching_state_remove_function_results_with_args($get_definitional_unit_multiplication_factor_caching_state$.getGlobalValue(), list(from_unit, to_unit), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_get_definitional_unit_multiplication_factor(final SubLObject from_unit, final SubLObject to_unit) {
        return memoization_state.caching_state_remove_function_results_with_args($get_definitional_unit_multiplication_factor_caching_state$.getGlobalValue(), list(from_unit, to_unit), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_definitional_unit_multiplication_factor_internal_alt(SubLObject from_unit, SubLObject to_unit) {
        return com.cyc.cycjava.cycl.quantities.get_unit_multiplication_factor_int(from_unit, to_unit, mt_vars.$assertible_theory_mt_root$.getGlobalValue());
    }

    public static SubLObject get_definitional_unit_multiplication_factor_internal(final SubLObject from_unit, final SubLObject to_unit) {
        return get_unit_multiplication_factor_int(from_unit, to_unit, mt_vars.$assertible_theory_mt_root$.getGlobalValue());
    }

    public static final SubLObject get_definitional_unit_multiplication_factor_alt(SubLObject from_unit, SubLObject to_unit) {
        {
            SubLObject caching_state = $get_definitional_unit_multiplication_factor_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(GET_DEFINITIONAL_UNIT_MULTIPLICATION_FACTOR, $get_definitional_unit_multiplication_factor_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(from_unit, to_unit);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw11$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (from_unit.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && to_unit.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.quantities.get_definitional_unit_multiplication_factor_internal(from_unit, to_unit)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(from_unit, to_unit));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject get_definitional_unit_multiplication_factor(final SubLObject from_unit, final SubLObject to_unit) {
        SubLObject caching_state = $get_definitional_unit_multiplication_factor_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_DEFINITIONAL_UNIT_MULTIPLICATION_FACTOR, $get_definitional_unit_multiplication_factor_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(from_unit, to_unit);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (from_unit.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && to_unit.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_definitional_unit_multiplication_factor_internal(from_unit, to_unit)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(from_unit, to_unit));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject get_contingent_unit_multiplication_factor_alt(SubLObject from_unit, SubLObject to_unit) {
        {
            SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
            return com.cyc.cycjava.cycl.quantities.get_unit_multiplication_factor_int(from_unit, to_unit, mt);
        }
    }

    public static SubLObject get_contingent_unit_multiplication_factor(final SubLObject from_unit, final SubLObject to_unit) {
        final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
        return get_unit_multiplication_factor_int(from_unit, to_unit, mt);
    }

    public static final SubLObject get_unit_multiplication_factor_int_alt(SubLObject from_unit, SubLObject to_unit, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject factor = NIL;
                {
                    SubLObject _prev_bind_0 = $get_umf_allow_fractionsP$.currentBinding(thread);
                    try {
                        $get_umf_allow_fractionsP$.bind(NIL, thread);
                        factor = com.cyc.cycjava.cycl.quantities.get_umf(to_unit, from_unit, mt);
                        if (NIL == factor) {
                            factor = com.cyc.cycjava.cycl.quantities.get_umf(from_unit, to_unit, mt);
                            if (NIL != factor) {
                                factor = divide(ONE_INTEGER, factor);
                            }
                        }
                        if (NIL == factor) {
                            {
                                SubLObject _prev_bind_0_1 = $get_umf_allow_fractionsP$.currentBinding(thread);
                                try {
                                    $get_umf_allow_fractionsP$.bind(T, thread);
                                    factor = com.cyc.cycjava.cycl.quantities.get_umf(to_unit, from_unit, mt);
                                } finally {
                                    $get_umf_allow_fractionsP$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        $get_umf_allow_fractionsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return factor;
            }
        }
    }

    public static SubLObject get_unit_multiplication_factor_int(final SubLObject from_unit, final SubLObject to_unit, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject factor = NIL;
        final SubLObject _prev_bind_0 = $get_umf_allow_fractionsP$.currentBinding(thread);
        try {
            $get_umf_allow_fractionsP$.bind(NIL, thread);
            factor = get_umf(to_unit, from_unit, mt);
            if (NIL == factor) {
                factor = get_umf(from_unit, to_unit, mt);
                if (NIL != factor) {
                    factor = divide(ONE_INTEGER, factor);
                }
            }
            if (NIL == factor) {
                final SubLObject _prev_bind_0_$4 = $get_umf_allow_fractionsP$.currentBinding(thread);
                try {
                    $get_umf_allow_fractionsP$.bind(T, thread);
                    factor = get_umf(to_unit, from_unit, mt);
                } finally {
                    $get_umf_allow_fractionsP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            $get_umf_allow_fractionsP$.rebind(_prev_bind_0, thread);
        }
        return factor;
    }

    public static final SubLObject get_umf_alt(SubLObject from_unit, SubLObject to_unit, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject foundP = NIL;
                SubLObject factor = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $get_umf_paths$.currentBinding(thread);
                    SubLObject _prev_bind_4 = $get_umf_search_state$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        $get_umf_paths$.bind(NIL, thread);
                        $get_umf_search_state$.bind(queues.create_queue(), thread);
                        queues.enqueue(from_unit, $get_umf_search_state$.getDynamicValue(thread));
                        {
                            SubLObject item_var = list(from_unit, NIL, ONE_INTEGER);
                            if (NIL == member(item_var, $get_umf_paths$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                $get_umf_paths$.setDynamicValue(cons(item_var, $get_umf_paths$.getDynamicValue(thread)), thread);
                            }
                        }
                        foundP = com.cyc.cycjava.cycl.quantities.get_umf_internal(to_unit);
                        if (NIL != foundP) {
                            factor = com.cyc.cycjava.cycl.quantities.get_umf_gather_factor(to_unit, from_unit);
                        }
                    } finally {
                        $get_umf_search_state$.rebind(_prev_bind_4, thread);
                        $get_umf_paths$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return factor;
            }
        }
    }

    public static SubLObject get_umf(final SubLObject from_unit, final SubLObject to_unit, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP = NIL;
        SubLObject factor = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $get_umf_paths$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $get_umf_search_state$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            $get_umf_paths$.bind(NIL, thread);
            $get_umf_search_state$.bind(queues.create_queue(UNPROVIDED), thread);
            queues.enqueue(from_unit, $get_umf_search_state$.getDynamicValue(thread));
            final SubLObject item_var = list(from_unit, NIL, ONE_INTEGER);
            if (NIL == member(item_var, $get_umf_paths$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                $get_umf_paths$.setDynamicValue(cons(item_var, $get_umf_paths$.getDynamicValue(thread)), thread);
            }
            foundP = get_umf_internal(to_unit);
            if (NIL != foundP) {
                factor = get_umf_gather_factor(to_unit, from_unit);
            }
        } finally {
            $get_umf_search_state$.rebind(_prev_bind_5, thread);
            $get_umf_paths$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return factor;
    }

    public static final SubLObject get_umf_internal_alt(SubLObject to_unit) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject from_unit = queues.dequeue($get_umf_search_state$.getDynamicValue(thread));
                if (from_unit == to_unit) {
                    return T;
                }
                if (NIL != from_unit) {
                    {
                        SubLObject umf_assertions = com.cyc.cycjava.cycl.quantities.gather_umf_assertions(from_unit);
                        SubLObject cdolist_list_var = umf_assertions;
                        SubLObject umf_assertion = NIL;
                        for (umf_assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , umf_assertion = cdolist_list_var.first()) {
                            {
                                SubLObject datum = gaf_args(umf_assertion);
                                SubLObject current = datum;
                                SubLObject arg1_unit = NIL;
                                SubLObject arg2_unit = NIL;
                                SubLObject raw_factor = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt12);
                                arg1_unit = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt12);
                                arg2_unit = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt12);
                                raw_factor = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    raw_factor = com.cyc.cycjava.cycl.quantities.cycl_real_number_to_number(raw_factor);
                                    {
                                        SubLObject new_factor = NIL;
                                        SubLObject new_unit = NIL;
                                        if (arg1_unit == from_unit) {
                                            new_unit = arg2_unit;
                                            new_factor = raw_factor;
                                        } else {
                                            new_unit = arg1_unit;
                                            new_factor = divide(ONE_INTEGER, raw_factor);
                                        }
                                        if (!((NIL != subl_promotions.memberP(new_unit, $get_umf_paths$.getDynamicValue(thread), symbol_function(EQL), symbol_function(CAR))) || ((NIL == $get_umf_allow_fractionsP$.getDynamicValue(thread)) && new_factor.isDouble()))) {
                                            {
                                                SubLObject item_var = list(new_unit, from_unit, new_factor);
                                                if (NIL == member(item_var, $get_umf_paths$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    $get_umf_paths$.setDynamicValue(cons(item_var, $get_umf_paths$.getDynamicValue(thread)), thread);
                                                }
                                            }
                                            if (new_unit == to_unit) {
                                                return T;
                                            }
                                            queues.enqueue(new_unit, $get_umf_search_state$.getDynamicValue(thread));
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt12);
                                }
                            }
                        }
                        return com.cyc.cycjava.cycl.quantities.get_umf_internal(to_unit);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject get_umf_internal(final SubLObject to_unit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject from_unit = queues.dequeue($get_umf_search_state$.getDynamicValue(thread));
        if (from_unit.eql(to_unit)) {
            return T;
        }
        if (NIL != from_unit) {
            SubLObject cdolist_list_var;
            final SubLObject umf_assertions = cdolist_list_var = gather_umf_assertions(from_unit);
            SubLObject umf_assertion = NIL;
            umf_assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = assertions_high.gaf_args(umf_assertion);
                SubLObject arg1_unit = NIL;
                SubLObject arg2_unit = NIL;
                SubLObject raw_factor = NIL;
                destructuring_bind_must_consp(current, datum, $list15);
                arg1_unit = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list15);
                arg2_unit = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list15);
                raw_factor = current.first();
                current = current.rest();
                if (NIL == current) {
                    raw_factor = cycl_real_number_to_number(raw_factor);
                    SubLObject new_factor = NIL;
                    SubLObject new_unit = NIL;
                    if (arg1_unit.eql(from_unit)) {
                        new_unit = arg2_unit;
                        new_factor = raw_factor;
                    } else {
                        new_unit = arg1_unit;
                        new_factor = divide(ONE_INTEGER, raw_factor);
                    }
                    if ((NIL == subl_promotions.memberP(new_unit, $get_umf_paths$.getDynamicValue(thread), symbol_function(EQL), symbol_function(CAR))) && ((NIL != $get_umf_allow_fractionsP$.getDynamicValue(thread)) || (!new_factor.isDouble()))) {
                        final SubLObject item_var = list(new_unit, from_unit, new_factor);
                        if (NIL == member(item_var, $get_umf_paths$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                            $get_umf_paths$.setDynamicValue(cons(item_var, $get_umf_paths$.getDynamicValue(thread)), thread);
                        }
                        if (new_unit.eql(to_unit)) {
                            relation_evaluation.cyc_evaluate_note_support(umf_assertion);
                            return T;
                        }
                        queues.enqueue(new_unit, $get_umf_search_state$.getDynamicValue(thread));
                    }
                } else {
                    cdestructuring_bind_error(datum, $list15);
                }
                cdolist_list_var = cdolist_list_var.rest();
                umf_assertion = cdolist_list_var.first();
            } 
            return get_umf_internal(to_unit);
        }
        return NIL;
    }

    public static final SubLObject gather_umf_assertions_alt(SubLObject unit) {
        {
            SubLObject result = NIL;
            SubLObject gather_umf_assertions = NIL;
            {
                SubLObject pred_var = $$unitMultiplicationFactor;
                if (NIL != do_gaf_arg_index_key_validator(unit, ONE_INTEGER, pred_var)) {
                    {
                        SubLObject iterator_var = new_gaf_arg_final_index_spec_iterator(unit, ONE_INTEGER, pred_var);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            {
                                SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                if (NIL != valid) {
                                    {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                            {
                                                SubLObject done_var_2 = NIL;
                                                SubLObject token_var_3 = NIL;
                                                while (NIL == done_var_2) {
                                                    {
                                                        SubLObject assertion = iteration_next_without_values_macro_helper(final_index_iterator, token_var_3);
                                                        SubLObject valid_4 = makeBoolean(token_var_3 != assertion);
                                                        if (NIL != valid_4) {
                                                            gather_umf_assertions = cons(assertion, gather_umf_assertions);
                                                        }
                                                        done_var_2 = makeBoolean(NIL == valid_4);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                try {
                                                    bind($is_thread_performing_cleanupP$, T);
                                                    if (NIL != final_index_iterator) {
                                                        destroy_final_index_iterator(final_index_iterator);
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
            {
                SubLObject pred_var = $$unitMultiplicationFactor;
                if (NIL != do_gaf_arg_index_key_validator(unit, TWO_INTEGER, pred_var)) {
                    {
                        SubLObject iterator_var = new_gaf_arg_final_index_spec_iterator(unit, TWO_INTEGER, pred_var);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            {
                                SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                if (NIL != valid) {
                                    {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                            {
                                                SubLObject done_var_5 = NIL;
                                                SubLObject token_var_6 = NIL;
                                                while (NIL == done_var_5) {
                                                    {
                                                        SubLObject assertion = iteration_next_without_values_macro_helper(final_index_iterator, token_var_6);
                                                        SubLObject valid_7 = makeBoolean(token_var_6 != assertion);
                                                        if (NIL != valid_7) {
                                                            gather_umf_assertions = cons(assertion, gather_umf_assertions);
                                                        }
                                                        done_var_5 = makeBoolean(NIL == valid_7);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                try {
                                                    bind($is_thread_performing_cleanupP$, T);
                                                    if (NIL != final_index_iterator) {
                                                        destroy_final_index_iterator(final_index_iterator);
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
            result = gather_umf_assertions;
            return result;
        }
    }

    public static SubLObject gather_umf_assertions(final SubLObject unit) {
        SubLObject result = NIL;
        SubLObject gather_umf_assertions = NIL;
        SubLObject pred_var = $$unitMultiplicationFactor;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(unit, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(unit, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$5 = NIL;
                        final SubLObject token_var_$6 = NIL;
                        while (NIL == done_var_$5) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                            final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(assertion));
                            if (NIL != valid_$7) {
                                gather_umf_assertions = cons(assertion, gather_umf_assertions);
                            }
                            done_var_$5 = makeBoolean(NIL == valid_$7);
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
        pred_var = $$unitMultiplicationFactor;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(unit, TWO_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(unit, TWO_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$6 = NIL;
                        final SubLObject token_var_$7 = NIL;
                        while (NIL == done_var_$6) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                            final SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(assertion));
                            if (NIL != valid_$8) {
                                gather_umf_assertions = cons(assertion, gather_umf_assertions);
                            }
                            done_var_$6 = makeBoolean(NIL == valid_$8);
                        } 
                    } finally {
                        final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values2 = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        result = gather_umf_assertions;
        return result;
    }

    public static final SubLObject get_umf_gather_factor_alt(SubLObject end_unit, SubLObject start_unit) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (end_unit == start_unit) {
                return ONE_INTEGER;
            }
            {
                SubLObject link = assoc(end_unit, $get_umf_paths$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                if (NIL == link) {
                    Errors.error($str_alt16$Link_not_found_);
                }
                {
                    SubLObject datum = link;
                    SubLObject current = datum;
                    SubLObject ignore = NIL;
                    SubLObject previous_unit = NIL;
                    SubLObject factor = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt17);
                    ignore = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt17);
                    previous_unit = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt17);
                    factor = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL == previous_unit) {
                            Errors.error($str_alt18$No_previous_unit_);
                        }
                        return multiply(factor, com.cyc.cycjava.cycl.quantities.get_umf_gather_factor(previous_unit, start_unit));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt17);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject get_umf_gather_factor(final SubLObject end_unit, final SubLObject start_unit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (end_unit.eql(start_unit)) {
            return ONE_INTEGER;
        }
        final SubLObject link = assoc(end_unit, $get_umf_paths$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        if (NIL == link) {
            Errors.error($str18$Link_not_found_);
        }
        SubLObject current;
        final SubLObject datum = current = link;
        SubLObject ignore = NIL;
        SubLObject previous_unit = NIL;
        SubLObject factor = NIL;
        destructuring_bind_must_consp(current, datum, $list19);
        ignore = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list19);
        previous_unit = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list19);
        factor = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == previous_unit) {
                Errors.error($str20$No_previous_unit_);
            }
            return multiply(factor, get_umf_gather_factor(previous_unit, start_unit));
        }
        cdestructuring_bind_error(datum, $list19);
        return NIL;
    }

    /**
     * Return the unit of measure which is UNIT1 x UNIT2
     */
    @LispMethod(comment = "Return the unit of measure which is UNIT1 x UNIT2")
    public static final SubLObject unit_times_alt(SubLObject unit1, SubLObject unit2) {
        if (unit1.equal($$Unity)) {
            return unit2;
        } else {
            if (unit2.equal($$Unity)) {
                return unit1;
            } else {
                return com.cyc.cycjava.cycl.quantities.complex_unit_times(unit1, unit2);
            }
        }
    }

    /**
     * Return the unit of measure which is UNIT1 x UNIT2
     */
    @LispMethod(comment = "Return the unit of measure which is UNIT1 x UNIT2")
    public static SubLObject unit_times(final SubLObject unit1, final SubLObject unit2) {
        if (unit1.equal($$Unity)) {
            return unit2;
        }
        if (unit2.equal($$Unity)) {
            return unit1;
        }
        return complex_unit_times(unit1, unit2);
    }

    /**
     * Return the unit of measure which is UNIT1 / UNIT2
     */
    @LispMethod(comment = "Return the unit of measure which is UNIT1 / UNIT2")
    public static final SubLObject unit_quotient_alt(SubLObject unit1, SubLObject unit2) {
        if (unit1.equal(unit2)) {
            return $$Unity;
        } else {
            if (unit2.equal($$Unity)) {
                return unit1;
            } else {
                return com.cyc.cycjava.cycl.quantities.complex_unit_quotient(unit1, unit2);
            }
        }
    }

    /**
     * Return the unit of measure which is UNIT1 / UNIT2
     */
    @LispMethod(comment = "Return the unit of measure which is UNIT1 / UNIT2")
    public static SubLObject unit_quotient(final SubLObject unit1, final SubLObject unit2) {
        if (unit1.equal(unit2)) {
            return $$Unity;
        }
        if (unit2.equal($$Unity)) {
            return unit1;
        }
        return complex_unit_quotient(unit1, unit2);
    }

    /**
     * Return the unit of measure which is the square root of UNIT
     */
    @LispMethod(comment = "Return the unit of measure which is the square root of UNIT")
    public static final SubLObject unit_sqrt_alt(SubLObject unit) {
        if (unit.equal($$Unity)) {
            return unit;
        } else {
            return com.cyc.cycjava.cycl.quantities.complex_unit_sqrt(unit);
        }
    }

    /**
     * Return the unit of measure which is the square root of UNIT
     */
    @LispMethod(comment = "Return the unit of measure which is the square root of UNIT")
    public static SubLObject unit_sqrt(final SubLObject unit) {
        if (unit.equal($$Unity)) {
            return unit;
        }
        return complex_unit_sqrt(unit);
    }

    public static final SubLObject complex_unit_times_alt(SubLObject unit1, SubLObject unit2) {
        {
            SubLObject v_answer = NIL;
            SubLObject pred_var = $$multiplicationUnits;
            if (NIL != do_gaf_arg_index_key_validator(unit1, ONE_INTEGER, pred_var)) {
                {
                    SubLObject iterator_var = new_gaf_arg_final_index_spec_iterator(unit1, ONE_INTEGER, pred_var);
                    SubLObject done_var = v_answer;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        {
                            SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                            if (NIL != valid) {
                                {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        {
                                            SubLObject done_var_8 = v_answer;
                                            SubLObject token_var_9 = NIL;
                                            while (NIL == done_var_8) {
                                                {
                                                    SubLObject assertion = iteration_next_without_values_macro_helper(final_index_iterator, token_var_9);
                                                    SubLObject valid_10 = makeBoolean(token_var_9 != assertion);
                                                    if (NIL != valid_10) {
                                                        if (unit2 == gaf_arg2(assertion)) {
                                                            v_answer = gaf_arg3(assertion);
                                                        }
                                                    }
                                                    done_var_8 = makeBoolean((NIL == valid_10) || (NIL != v_answer));
                                                }
                                            } 
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                            try {
                                                bind($is_thread_performing_cleanupP$, T);
                                                if (NIL != final_index_iterator) {
                                                    destroy_final_index_iterator(final_index_iterator);
                                                }
                                            } finally {
                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                            }
                                        }
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != v_answer));
                        }
                    } 
                }
            }
            if (NIL != v_answer) {
                return v_answer;
            }
        }
        {
            SubLObject v_answer = NIL;
            SubLObject pred_var = $$multiplicationUnits;
            if (NIL != do_gaf_arg_index_key_validator(unit1, TWO_INTEGER, pred_var)) {
                {
                    SubLObject iterator_var = new_gaf_arg_final_index_spec_iterator(unit1, TWO_INTEGER, pred_var);
                    SubLObject done_var = v_answer;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        {
                            SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                            if (NIL != valid) {
                                {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        {
                                            SubLObject done_var_11 = v_answer;
                                            SubLObject token_var_12 = NIL;
                                            while (NIL == done_var_11) {
                                                {
                                                    SubLObject assertion = iteration_next_without_values_macro_helper(final_index_iterator, token_var_12);
                                                    SubLObject valid_13 = makeBoolean(token_var_12 != assertion);
                                                    if (NIL != valid_13) {
                                                        if (unit2 == gaf_arg1(assertion)) {
                                                            v_answer = gaf_arg3(assertion);
                                                        }
                                                    }
                                                    done_var_11 = makeBoolean((NIL == valid_13) || (NIL != v_answer));
                                                }
                                            } 
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                            try {
                                                bind($is_thread_performing_cleanupP$, T);
                                                if (NIL != final_index_iterator) {
                                                    destroy_final_index_iterator(final_index_iterator);
                                                }
                                            } finally {
                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                            }
                                        }
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != v_answer));
                        }
                    } 
                }
            }
            if (NIL != v_answer) {
                return v_answer;
            }
        }
        if (NIL != com.cyc.cycjava.cycl.quantities.per_fn_unit(unit1)) {
            return com.cyc.cycjava.cycl.quantities.complex_per_fn_unit_times(unit1, unit2);
        }
        if (NIL != com.cyc.cycjava.cycl.quantities.per_fn_unit(unit2)) {
            return com.cyc.cycjava.cycl.quantities.complex_per_fn_unit_times(unit2, unit1);
        }
        return relation_evaluation.throw_unevaluatable();
    }

    public static SubLObject complex_unit_times(final SubLObject unit1, final SubLObject unit2) {
        SubLObject v_answer = NIL;
        SubLObject pred_var = $$multiplicationUnits;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(unit1, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(unit1, ONE_INTEGER, pred_var);
            SubLObject done_var = v_answer;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$11 = v_answer;
                        final SubLObject token_var_$12 = NIL;
                        while (NIL == done_var_$11) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$12);
                            final SubLObject valid_$13 = makeBoolean(!token_var_$12.eql(assertion));
                            if ((NIL != valid_$13) && unit2.eql(assertions_high.gaf_arg2(assertion))) {
                                relation_evaluation.cyc_evaluate_note_support(assertion);
                                v_answer = assertions_high.gaf_arg3(assertion);
                            }
                            done_var_$11 = makeBoolean((NIL == valid_$13) || (NIL != v_answer));
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
                done_var = makeBoolean((NIL == valid) || (NIL != v_answer));
            } 
        }
        if (NIL != v_answer) {
            return v_answer;
        }
        v_answer = NIL;
        pred_var = $$multiplicationUnits;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(unit1, TWO_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(unit1, TWO_INTEGER, pred_var);
            SubLObject done_var = v_answer;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$12 = v_answer;
                        final SubLObject token_var_$13 = NIL;
                        while (NIL == done_var_$12) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$13);
                            final SubLObject valid_$14 = makeBoolean(!token_var_$13.eql(assertion));
                            if ((NIL != valid_$14) && unit2.eql(assertions_high.gaf_arg1(assertion))) {
                                relation_evaluation.cyc_evaluate_note_support(assertion);
                                v_answer = assertions_high.gaf_arg3(assertion);
                            }
                            done_var_$12 = makeBoolean((NIL == valid_$14) || (NIL != v_answer));
                        } 
                    } finally {
                        final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values2 = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                        }
                    }
                }
                done_var = makeBoolean((NIL == valid) || (NIL != v_answer));
            } 
        }
        if (NIL != v_answer) {
            return v_answer;
        }
        if (NIL != per_fn_unit(unit1)) {
            return complex_per_fn_unit_times(unit1, unit2);
        }
        if (NIL != per_fn_unit(unit2)) {
            return complex_per_fn_unit_times(unit2, unit1);
        }
        return relation_evaluation.throw_unevaluatable();
    }

    public static final SubLObject complex_per_fn_unit_times_alt(SubLObject per_unit, SubLObject unit) {
        {
            SubLObject per_numerator = cycl_utilities.nat_arg1(per_unit, UNPROVIDED);
            SubLObject per_denominator = cycl_utilities.nat_arg2(per_unit, UNPROVIDED);
            if (per_denominator.equal(unit)) {
                return per_numerator;
            } else {
                if (NIL == com.cyc.cycjava.cycl.quantities.per_fn_unit(unit)) {
                    relation_evaluation.throw_unevaluatable();
                } else {
                    {
                        SubLObject other_numerator = cycl_utilities.nat_arg1(unit, UNPROVIDED);
                        SubLObject other_denominator = cycl_utilities.nat_arg2(unit, UNPROVIDED);
                        if (per_numerator.equal(other_denominator)) {
                            if (per_denominator.equal(other_numerator)) {
                                return $$Unity;
                            } else {
                                return list($$PerFn, other_numerator, per_denominator);
                            }
                        } else {
                            if (per_denominator.equal(other_numerator)) {
                                return list($$PerFn, per_numerator, other_denominator);
                            } else {
                                relation_evaluation.throw_unevaluatable();
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject complex_per_fn_unit_times(final SubLObject per_unit, final SubLObject unit) {
        final SubLObject per_numerator = cycl_utilities.nat_arg1(per_unit, UNPROVIDED);
        final SubLObject per_denominator = cycl_utilities.nat_arg2(per_unit, UNPROVIDED);
        if (per_denominator.equal(unit)) {
            return per_numerator;
        }
        if ((NIL != per_fn_unit(per_numerator)) && cycl_utilities.nat_arg2(per_numerator, UNPROVIDED).equal(unit)) {
            return list($$PerFn, cycl_utilities.nat_arg1(per_numerator, UNPROVIDED), per_denominator);
        }
        if (NIL == per_fn_unit(unit)) {
            relation_evaluation.throw_unevaluatable();
        } else {
            final SubLObject other_numerator = cycl_utilities.nat_arg1(unit, UNPROVIDED);
            final SubLObject other_denominator = cycl_utilities.nat_arg2(unit, UNPROVIDED);
            if (per_numerator.equal(other_denominator)) {
                if (per_denominator.equal(other_numerator)) {
                    return $$Unity;
                }
                return list($$PerFn, other_numerator, per_denominator);
            } else {
                if (per_denominator.equal(other_numerator)) {
                    return list($$PerFn, per_numerator, other_denominator);
                }
                relation_evaluation.throw_unevaluatable();
            }
        }
        return NIL;
    }

    public static final SubLObject complex_unit_quotient_alt(SubLObject unit1, SubLObject unit2) {
        {
            SubLObject v_answer = NIL;
            SubLObject pred_var = $$multiplicationUnits;
            if (NIL != do_gaf_arg_index_key_validator(unit1, THREE_INTEGER, pred_var)) {
                {
                    SubLObject iterator_var = new_gaf_arg_final_index_spec_iterator(unit1, THREE_INTEGER, pred_var);
                    SubLObject done_var = v_answer;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        {
                            SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                            if (NIL != valid) {
                                {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        {
                                            SubLObject done_var_14 = v_answer;
                                            SubLObject token_var_15 = NIL;
                                            while (NIL == done_var_14) {
                                                {
                                                    SubLObject assertion = iteration_next_without_values_macro_helper(final_index_iterator, token_var_15);
                                                    SubLObject valid_16 = makeBoolean(token_var_15 != assertion);
                                                    if (NIL != valid_16) {
                                                        if (unit2 == gaf_arg1(assertion)) {
                                                            v_answer = gaf_arg2(assertion);
                                                        } else {
                                                            if (unit2 == gaf_arg2(assertion)) {
                                                                v_answer = gaf_arg1(assertion);
                                                            }
                                                        }
                                                    }
                                                    done_var_14 = makeBoolean((NIL == valid_16) || (NIL != v_answer));
                                                }
                                            } 
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                            try {
                                                bind($is_thread_performing_cleanupP$, T);
                                                if (NIL != final_index_iterator) {
                                                    destroy_final_index_iterator(final_index_iterator);
                                                }
                                            } finally {
                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                            }
                                        }
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != v_answer));
                        }
                    } 
                }
            }
            if (NIL != v_answer) {
                return v_answer;
            }
        }
        if (NIL != com.cyc.cycjava.cycl.quantities.per_fn_unit(unit2)) {
            return com.cyc.cycjava.cycl.quantities.complex_per_fn_unit_quotient(unit1, unit2);
        }
        if (NIL != com.cyc.cycjava.cycl.quantities.per_fn_unit(unit1)) {
            return relation_evaluation.throw_unevaluatable();
        }
        return list($$PerFn, unit1, unit2);
    }

    public static SubLObject complex_unit_quotient(final SubLObject unit1, final SubLObject unit2) {
        SubLObject v_answer = NIL;
        final SubLObject pred_var = $$multiplicationUnits;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(unit1, THREE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(unit1, THREE_INTEGER, pred_var);
            SubLObject done_var = v_answer;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$17 = v_answer;
                        final SubLObject token_var_$18 = NIL;
                        while (NIL == done_var_$17) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$18);
                            final SubLObject valid_$19 = makeBoolean(!token_var_$18.eql(assertion));
                            if (NIL != valid_$19) {
                                if (unit2.eql(assertions_high.gaf_arg1(assertion))) {
                                    relation_evaluation.cyc_evaluate_note_support(assertion);
                                    v_answer = assertions_high.gaf_arg2(assertion);
                                } else
                                    if (unit2.eql(assertions_high.gaf_arg2(assertion))) {
                                        relation_evaluation.cyc_evaluate_note_support(assertion);
                                        v_answer = assertions_high.gaf_arg1(assertion);
                                    }

                            }
                            done_var_$17 = makeBoolean((NIL == valid_$19) || (NIL != v_answer));
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
                done_var = makeBoolean((NIL == valid) || (NIL != v_answer));
            } 
        }
        if (NIL != v_answer) {
            return v_answer;
        }
        if (NIL != per_fn_unit(unit2)) {
            return complex_per_fn_unit_quotient(unit1, unit2);
        }
        if (NIL != per_fn_unit(unit1)) {
            return relation_evaluation.throw_unevaluatable();
        }
        if (NIL != kb_utilities.kbeq(unit2, $$Unity)) {
            return unit1;
        }
        return list($$PerFn, unit1, unit2);
    }

    public static final SubLObject complex_per_fn_unit_quotient_alt(SubLObject unit, SubLObject per_unit) {
        {
            SubLObject per_numerator = cycl_utilities.nat_arg1(per_unit, UNPROVIDED);
            SubLObject per_denominator = cycl_utilities.nat_arg2(per_unit, UNPROVIDED);
            if (unit.equal(per_numerator)) {
                return per_denominator;
            } else {
                if (unit.equal($$Unity)) {
                    return list($$PerFn, per_denominator, per_numerator);
                } else {
                    if (NIL == com.cyc.cycjava.cycl.quantities.per_fn_unit(unit)) {
                        relation_evaluation.throw_unevaluatable();
                    } else {
                        {
                            SubLObject other_numerator = cycl_utilities.nat_arg1(unit, UNPROVIDED);
                            SubLObject other_denominator = cycl_utilities.nat_arg2(unit, UNPROVIDED);
                            if (other_numerator.equal(per_numerator)) {
                                return list($$PerFn, per_denominator, other_denominator);
                            } else {
                                if (other_denominator.equal(per_denominator)) {
                                    return list($$PerFn, other_numerator, per_numerator);
                                } else {
                                    relation_evaluation.throw_unevaluatable();
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject complex_per_fn_unit_quotient(final SubLObject unit, final SubLObject per_unit) {
        final SubLObject per_numerator = cycl_utilities.nat_arg1(per_unit, UNPROVIDED);
        final SubLObject per_denominator = cycl_utilities.nat_arg2(per_unit, UNPROVIDED);
        if (unit.equal(per_numerator)) {
            return per_denominator;
        }
        if (unit.equal($$Unity)) {
            return list($$PerFn, per_denominator, per_numerator);
        }
        if (NIL == per_fn_unit(unit)) {
            relation_evaluation.throw_unevaluatable();
        } else {
            final SubLObject other_numerator = cycl_utilities.nat_arg1(unit, UNPROVIDED);
            final SubLObject other_denominator = cycl_utilities.nat_arg2(unit, UNPROVIDED);
            if (other_numerator.equal(per_numerator)) {
                return list($$PerFn, per_denominator, other_denominator);
            }
            if (other_denominator.equal(per_denominator)) {
                return list($$PerFn, other_numerator, per_numerator);
            }
            relation_evaluation.throw_unevaluatable();
        }
        return NIL;
    }

    public static final SubLObject complex_unit_sqrt_alt(SubLObject unit) {
        {
            SubLObject v_answer = NIL;
            SubLObject pred_var = $$multiplicationUnits;
            if (NIL != do_gaf_arg_index_key_validator(unit, THREE_INTEGER, pred_var)) {
                {
                    SubLObject iterator_var = new_gaf_arg_final_index_spec_iterator(unit, THREE_INTEGER, pred_var);
                    SubLObject done_var = v_answer;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        {
                            SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                            if (NIL != valid) {
                                {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        {
                                            SubLObject done_var_17 = v_answer;
                                            SubLObject token_var_18 = NIL;
                                            while (NIL == done_var_17) {
                                                {
                                                    SubLObject assertion = iteration_next_without_values_macro_helper(final_index_iterator, token_var_18);
                                                    SubLObject valid_19 = makeBoolean(token_var_18 != assertion);
                                                    if (NIL != valid_19) {
                                                        if (gaf_arg1(assertion) == gaf_arg2(assertion)) {
                                                            v_answer = gaf_arg1(assertion);
                                                        }
                                                    }
                                                    done_var_17 = makeBoolean((NIL == valid_19) || (NIL != v_answer));
                                                }
                                            } 
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                            try {
                                                bind($is_thread_performing_cleanupP$, T);
                                                if (NIL != final_index_iterator) {
                                                    destroy_final_index_iterator(final_index_iterator);
                                                }
                                            } finally {
                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                            }
                                        }
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != v_answer));
                        }
                    } 
                }
            }
            if (NIL != v_answer) {
                return v_answer;
            }
            return relation_evaluation.throw_unevaluatable();
        }
    }

    public static SubLObject complex_unit_sqrt(final SubLObject unit) {
        SubLObject v_answer = NIL;
        final SubLObject pred_var = $$multiplicationUnits;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(unit, THREE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(unit, THREE_INTEGER, pred_var);
            SubLObject done_var = v_answer;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$20 = v_answer;
                        final SubLObject token_var_$21 = NIL;
                        while (NIL == done_var_$20) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$21);
                            final SubLObject valid_$22 = makeBoolean(!token_var_$21.eql(assertion));
                            if ((NIL != valid_$22) && assertions_high.gaf_arg1(assertion).eql(assertions_high.gaf_arg2(assertion))) {
                                relation_evaluation.cyc_evaluate_note_support(assertion);
                                v_answer = assertions_high.gaf_arg1(assertion);
                            }
                            done_var_$20 = makeBoolean((NIL == valid_$22) || (NIL != v_answer));
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
                done_var = makeBoolean((NIL == valid) || (NIL != v_answer));
            } 
        }
        if (NIL != v_answer) {
            return v_answer;
        }
        return relation_evaluation.throw_unevaluatable();
    }

    public static final SubLObject per_fn_unit_alt(SubLObject unit) {
        if ((NIL != term.hl_ground_nautP(unit)) || ((NIL != nart_handles.nart_p(unit)) && (NIL != narts_high.nart_hl_formula(unit)))) {
            return eq(cycl_utilities.nat_function(unit), $$PerFn);
        }
        return NIL;
    }

    public static SubLObject per_fn_unit(final SubLObject unit) {
        if ((NIL != term.hl_ground_nautP(unit)) || ((NIL != nart_handles.nart_p(unit)) && (NIL != narts_high.nart_hl_formula(unit)))) {
            return eql(cycl_utilities.nat_function(unit), $$PerFn);
        }
        return NIL;
    }

    public static final SubLObject make_and_simplify_interval_alt(SubLObject unit, SubLObject min, SubLObject max) {
        if (max == UNPROVIDED) {
            max = min;
        }
        if (NIL != com.cyc.cycjava.cycl.quantities.per_fn_unit(unit)) {
            {
                SubLObject unit_numerator = cycl_utilities.nat_arg1(unit, UNPROVIDED);
                SubLObject unit_denominator = cycl_utilities.nat_arg2(unit, UNPROVIDED);
                if (NIL != com.cyc.cycjava.cycl.quantities.comparable_units(unit_numerator, unit_denominator)) {
                    return com.cyc.cycjava.cycl.quantities.cyc_quotient(com.cyc.cycjava.cycl.quantities.make_interval(unit_numerator, min, max), com.cyc.cycjava.cycl.quantities.make_interval(unit_denominator, ONE_INTEGER, UNPROVIDED));
                }
            }
        }
        return com.cyc.cycjava.cycl.quantities.make_interval(unit, min, max);
    }

    public static SubLObject make_and_simplify_interval(final SubLObject unit, SubLObject min, SubLObject max) {
        if (max == UNPROVIDED) {
            max = min;
        }
        if (NIL != per_fn_unit(unit)) {
            min = arithmetic.arithmetic_answer(min);
            max = arithmetic.arithmetic_answer(max);
            final SubLObject unit_numerator = cycl_utilities.nat_arg1(unit, UNPROVIDED);
            final SubLObject unit_denominator = cycl_utilities.nat_arg2(unit, UNPROVIDED);
            if (NIL != comparable_units(unit_numerator, unit_denominator)) {
                return cyc_quotient(make_interval(unit_numerator, min, max), make_interval(unit_denominator, ONE_INTEGER, UNPROVIDED));
            }
        }
        return make_interval(unit, min, max);
    }

    public static SubLObject term_unify_with_units(SubLObject term1, final SubLObject term2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != variables.variable_p(term1)) {
            return unification_utilities.term_unify(term1, term2, UNPROVIDED, UNPROVIDED);
        }
        SubLObject current;
        final SubLObject datum = current = term1;
        SubLObject unit1 = NIL;
        SubLObject min1 = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        unit1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list23);
        min1 = current.first();
        current = current.rest();
        SubLObject max1 = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        if (NIL == current) {
            if (NIL == max1) {
                max1 = min1;
            }
            unit1 = czer_main.canonicalize_term(unit1, UNPROVIDED);
            SubLObject unit2 = NIL;
            SubLObject min2 = NIL;
            destructuring_bind_must_consp(term2, term2, $list24);
            unit2 = term2.first();
            SubLObject current_$24 = term2.rest();
            destructuring_bind_must_consp(current_$24, term2, $list24);
            min2 = current_$24.first();
            current_$24 = current_$24.rest();
            SubLObject max2 = (current_$24.isCons()) ? current_$24.first() : NIL;
            destructuring_bind_must_listp(current_$24, term2, $list24);
            current_$24 = current_$24.rest();
            if (NIL == current_$24) {
                if (NIL == max2) {
                    max2 = min2;
                }
                unit2 = czer_main.canonicalize_term(unit2, UNPROVIDED);
                if ((NIL != variables.variable_p(unit1)) || (NIL != variables.variable_p(unit2))) {
                    return unification_utilities.term_unify(list(unit1, min1), list(unit2, min2), UNPROVIDED, UNPROVIDED);
                }
                thread.resetMultipleValues();
                final SubLObject new_min2 = convert_to_units(unit1, unit2, min2, max2);
                final SubLObject new_max2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (new_min2.isNumber()) {
                    if (NIL != cycl_utilities.nat_with_functor_p(term1, $$Unity)) {
                        term1 = cycl_utilities.nat_arg1(term1, UNPROVIDED);
                    }
                    return unification_utilities.term_unify(term1, make_and_simplify_interval(unit1, new_min2, new_max2), UNPROVIDED, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(term2, $list24);
            }
        } else {
            cdestructuring_bind_error(datum, $list23);
        }
        return NIL;
    }

    /**
     * #$defnIff for uses of #$integerRange
     */
    @LispMethod(comment = "#$defnIff for uses of #$integerRange")
    public static final SubLObject cyc_integer_range_alt(SubLObject integer) {
        if (integer.isInteger()) {
            {
                SubLObject defn_collection = at_vars.defn_collection();
                if (NIL != forts.fort_p(defn_collection)) {
                    {
                        SubLObject range_scalar = kb_mapping_utilities.fpred_value(defn_collection, $$integerRange, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != range_scalar) {
                            return relation_evaluation.cyc_evaluate(make_binary_formula($$quantitySubsumes, range_scalar, integer));
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * #$defnIff for uses of #$integerRange
     */
    @LispMethod(comment = "#$defnIff for uses of #$integerRange")
    public static SubLObject cyc_integer_range(final SubLObject integer) {
        if (integer.isInteger()) {
            final SubLObject defn_collection = at_vars.defn_collection();
            if (NIL != forts.fort_p(defn_collection)) {
                final SubLObject range_scalar = kb_mapping_utilities.fpred_value(defn_collection, $$integerRange, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != range_scalar) {
                    return relation_evaluation.cyc_evaluate(make_binary_formula($$quantitySubsumes, range_scalar, integer));
                }
            }
        }
        return NIL;
    }

    /**
     * #$defnIff for uses of #$numberRange
     */
    @LispMethod(comment = "#$defnIff for uses of #$numberRange")
    public static final SubLObject cyc_number_range_alt(SubLObject number) {
        if (number.isNumber()) {
            {
                SubLObject defn_collection = at_vars.defn_collection();
                if (NIL != forts.fort_p(defn_collection)) {
                    {
                        SubLObject range_scalar = kb_mapping_utilities.fpred_value(defn_collection, $$numberRange, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != range_scalar) {
                            return relation_evaluation.cyc_evaluate(make_binary_formula($$quantitySubsumes, range_scalar, number));
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * #$defnIff for uses of #$numberRange
     */
    @LispMethod(comment = "#$defnIff for uses of #$numberRange")
    public static SubLObject cyc_number_range(final SubLObject number) {
        if (number.isNumber()) {
            final SubLObject defn_collection = at_vars.defn_collection();
            if (NIL != forts.fort_p(defn_collection)) {
                final SubLObject range_scalar = kb_mapping_utilities.fpred_value(defn_collection, $$numberRange, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != range_scalar) {
                    return relation_evaluation.cyc_evaluate(make_binary_formula($$quantitySubsumes, range_scalar, number));
                }
            }
        }
        return NIL;
    }

    /**
     * Cyc-Quant extension for #$PlusFn
     */
    @LispMethod(comment = "Cyc-Quant extension for #$PlusFn")
    public static final SubLObject cyc_plus_quantities_alt(SubLObject interval1, SubLObject interval2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if ((NIL != extended_numbers.extended_number_p(interval1)) && (NIL != extended_numbers.extended_number_p(interval2))) {
                    ans = extended_numbers.extended_number_plus(interval1, interval2);
                } else {
                    if (ZERO_INTEGER.eql(interval1) && (NIL != at_defns.quiet_has_typeP(interval2, $$IntervalOnNumberLine, UNPROVIDED))) {
                        return interval2;
                    } else {
                        if (ZERO_INTEGER.eql(interval2) && (NIL != at_defns.quiet_has_typeP(interval1, $$IntervalOnNumberLine, UNPROVIDED))) {
                            return interval1;
                        } else {
                            if ((NIL != list_utilities.tree_find_if($sym27$FUZZY_NUMBER_, interval1, UNPROVIDED)) || (NIL != list_utilities.tree_find_if($sym27$FUZZY_NUMBER_, interval2, UNPROVIDED))) {
                                return list($$PlusFn, interval1, interval2);
                            } else {
                                thread.resetMultipleValues();
                                {
                                    SubLObject unit1 = com.cyc.cycjava.cycl.quantities.explode_interval(interval1);
                                    SubLObject min1 = thread.secondMultipleValue();
                                    SubLObject max1 = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject unit2 = com.cyc.cycjava.cycl.quantities.explode_interval(interval2);
                                        SubLObject min2 = thread.secondMultipleValue();
                                        SubLObject max2 = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL == com.cyc.cycjava.cycl.quantities.comparable_units(unit1, unit2)) {
                                            relation_evaluation.throw_unevaluatable();
                                        }
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject new_min2 = com.cyc.cycjava.cycl.quantities.convert_to_units(unit1, unit2, min2, max2);
                                            SubLObject new_max2 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            min2 = new_min2;
                                            max2 = new_max2;
                                        }
                                        ans = com.cyc.cycjava.cycl.quantities.make_interval(unit1, extended_numbers.extended_number_plus(min1, min2), extended_numbers.extended_number_plus(max1, max2));
                                    }
                                }
                            }
                        }
                    }
                }
                return arithmetic_answer(ans);
            }
        }
    }

    /**
     * Cyc-Quant extension for #$PlusFn
     */
    @LispMethod(comment = "Cyc-Quant extension for #$PlusFn")
    public static SubLObject cyc_plus_quantities(final SubLObject interval1, final SubLObject interval2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        SubLObject failureP = NIL;
        try {
            thread.throwStack.push($UNEVALUATABLE);
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        v_answer = cyc_plus_quantities_int(interval1, interval2);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                failureP = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } catch (final Throwable ccatch_env_var) {
            failureP = Errors.handleThrowable(ccatch_env_var, $UNEVALUATABLE);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == failureP) {
            return v_answer;
        }
        if ((NIL != list_utilities.tree_find_if($sym31$FUZZY_NUMBER_, interval1, UNPROVIDED)) || (NIL != list_utilities.tree_find_if($sym31$FUZZY_NUMBER_, interval2, UNPROVIDED))) {
            return make_binary_formula($$PlusFn, interval1, interval2);
        }
        return relation_evaluation.throw_unevaluatable();
    }

    public static SubLObject cyc_plus_quantities_int(final SubLObject interval1, final SubLObject interval2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if ((NIL != extended_numbers.possibly_infinite_or_extended_number_p(interval1)) && (NIL != extended_numbers.possibly_infinite_or_extended_number_p(interval2))) {
            ans = extended_numbers.possibly_infinite_or_extended_number_plus(interval1, interval2);
        } else {
            if (ZERO_INTEGER.eql(interval1) && (NIL != at_defns.quiet_has_typeP(interval2, $$IntervalOnNumberLine, UNPROVIDED))) {
                return interval2;
            }
            if (ZERO_INTEGER.eql(interval2) && (NIL != at_defns.quiet_has_typeP(interval1, $$IntervalOnNumberLine, UNPROVIDED))) {
                return interval1;
            }
            thread.resetMultipleValues();
            final SubLObject unit1 = explode_interval(interval1);
            final SubLObject min1 = thread.secondMultipleValue();
            final SubLObject max1 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject unit2 = explode_interval(interval2);
            SubLObject min2 = thread.secondMultipleValue();
            SubLObject max2 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL == comparable_units(unit1, unit2)) {
                relation_evaluation.throw_unevaluatable();
            }
            thread.resetMultipleValues();
            final SubLObject new_min2 = convert_to_units(unit1, unit2, min2, max2);
            final SubLObject new_max2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            min2 = new_min2;
            max2 = new_max2;
            ans = make_interval(unit1, extended_numbers.possibly_infinite_or_extended_number_plus(min1, min2), extended_numbers.possibly_infinite_or_extended_number_plus(max1, max2));
        }
        return ans;
    }

    /**
     * Cyc-Quant extension for #$MinusFn
     */
    @LispMethod(comment = "Cyc-Quant extension for #$MinusFn")
    public static final SubLObject cyc_minus_quantities_alt(SubLObject interval) {
        if (NIL != extended_numbers.extended_number_p(interval)) {
            return extended_numbers.extended_number_negate(interval);
        } else {
            return cyc_times_internal(MINUS_ONE_INTEGER, interval);
        }
    }

    /**
     * Cyc-Quant extension for #$MinusFn
     */
    @LispMethod(comment = "Cyc-Quant extension for #$MinusFn")
    public static SubLObject cyc_minus_quantities(final SubLObject interval) {
        if (NIL != extended_numbers.extended_number_p(interval)) {
            return extended_numbers.extended_number_negate(interval);
        }
        return arithmetic.cyc_times_internal(MINUS_ONE_INTEGER, interval);
    }

    /**
     * evaluationDefn for #$QuantityConversionFn
     */
    @LispMethod(comment = "evaluationDefn for #$QuantityConversionFn")
    public static final SubLObject cyc_quantity_conversion_alt(SubLObject new_unit, SubLObject interval) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject unit = com.cyc.cycjava.cycl.quantities.explode_interval(interval);
                SubLObject min = thread.secondMultipleValue();
                SubLObject max = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL == com.cyc.cycjava.cycl.quantities.comparable_units(new_unit, unit)) {
                    relation_evaluation.throw_unevaluatable();
                }
                thread.resetMultipleValues();
                {
                    SubLObject new_min = com.cyc.cycjava.cycl.quantities.convert_to_units(new_unit, unit, min, max);
                    SubLObject new_max = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject ans = com.cyc.cycjava.cycl.quantities.make_interval(new_unit, new_min, new_max);
                        return arithmetic_answer(ans);
                    }
                }
            }
        }
    }

    /**
     * evaluationDefn for #$QuantityConversionFn
     */
    @LispMethod(comment = "evaluationDefn for #$QuantityConversionFn")
    public static SubLObject cyc_quantity_conversion(final SubLObject new_unit, final SubLObject interval) {
        final SubLObject result = convert_quantity(new_unit, interval);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static SubLObject convert_quantity(final SubLObject new_unit, final SubLObject interval) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject unit = explode_interval(interval);
        final SubLObject min = thread.secondMultipleValue();
        final SubLObject max = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL == comparable_units(new_unit, unit)) {
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject new_min = convert_to_units(new_unit, unit, min, max);
        final SubLObject new_max = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject ans = make_interval(new_unit, new_min, new_max);
        return ans;
    }

    public static SubLObject cyc_quantity_conversion_absolute(final SubLObject new_unit, final SubLObject interval) {
        final SubLObject result = convert_quantity_absolute(new_unit, interval);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static SubLObject convert_quantity_absolute(final SubLObject new_unit, final SubLObject interval) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject unit = explode_interval(interval);
        final SubLObject min = thread.secondMultipleValue();
        final SubLObject max = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL == comparable_units(new_unit, unit)) {
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject new_min = convert_to_units_absolute(new_unit, unit, min, max);
        final SubLObject new_max = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject ans = make_interval(new_unit, new_min, new_max);
        return ans;
    }

    /**
     * Return the SubL number represented by the CycL #$RealNumber QUANTITY.
     */
    @LispMethod(comment = "Return the SubL number represented by the CycL #$RealNumber QUANTITY.")
    public static final SubLObject cycl_real_number_to_number_alt(SubLObject quantity) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != extended_numbers.extended_number_p(quantity)) {
                return quantity;
            }
            thread.resetMultipleValues();
            {
                SubLObject unit = com.cyc.cycjava.cycl.quantities.explode_interval(com.cyc.cycjava.cycl.quantities.cyc_quantity_conversion($$Unity, quantity));
                SubLObject number_min = thread.secondMultipleValue();
                SubLObject number_max = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (!number_min.numE(number_max)) {
                    relation_evaluation.throw_unevaluatable();
                }
                return number_min;
            }
        }
    }

    /**
     * Return the SubL number represented by the CycL #$RealNumber QUANTITY.
     */
    @LispMethod(comment = "Return the SubL number represented by the CycL #$RealNumber QUANTITY.")
    public static SubLObject cycl_real_number_to_number(final SubLObject quantity) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != extended_numbers.possibly_infinite_or_extended_number_p(quantity)) {
            return quantity;
        }
        thread.resetMultipleValues();
        final SubLObject unit = explode_interval(cyc_quantity_conversion($$Unity, quantity));
        final SubLObject number_min = thread.secondMultipleValue();
        final SubLObject number_max = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL == extended_numbers.possibly_infinite_or_extended_numberE(number_min, number_max)) {
            relation_evaluation.throw_unevaluatable();
        }
        return number_min;
    }

    /**
     * Cyc-Quant extension for #$TimesFn
     */
    @LispMethod(comment = "Cyc-Quant extension for #$TimesFn")
    public static final SubLObject cyc_times_quantities_alt(SubLObject interval1, SubLObject interval2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if ((NIL != extended_numbers.extended_number_p(interval1)) && (NIL != extended_numbers.extended_number_p(interval2))) {
                    ans = extended_numbers.extended_number_times(interval1, interval2);
                } else {
                    if ((NIL != list_utilities.tree_find_if($sym27$FUZZY_NUMBER_, interval1, UNPROVIDED)) || (NIL != list_utilities.tree_find_if($sym27$FUZZY_NUMBER_, interval2, UNPROVIDED))) {
                        return list($$TimesFn, interval1, interval2);
                    } else {
                        if (NIL != extended_numbers.extended_number_p(interval1)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject unit2 = com.cyc.cycjava.cycl.quantities.explode_interval(interval2);
                                SubLObject min2 = thread.secondMultipleValue();
                                SubLObject max2 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != extended_numbers.extended_number_minus_p(interval1)) {
                                    ans = com.cyc.cycjava.cycl.quantities.make_interval(unit2, extended_numbers.extended_number_times(interval1, max2), extended_numbers.extended_number_times(interval1, min2));
                                } else {
                                    ans = com.cyc.cycjava.cycl.quantities.make_interval(unit2, extended_numbers.extended_number_times(interval1, min2), extended_numbers.extended_number_times(interval1, max2));
                                }
                            }
                        } else {
                            if (NIL != extended_numbers.extended_number_p(interval2)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject unit1 = com.cyc.cycjava.cycl.quantities.explode_interval(interval1);
                                    SubLObject min1 = thread.secondMultipleValue();
                                    SubLObject max1 = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != extended_numbers.extended_number_minus_p(interval2)) {
                                        ans = com.cyc.cycjava.cycl.quantities.make_interval(unit1, extended_numbers.extended_number_times(interval2, max1), extended_numbers.extended_number_times(interval2, min1));
                                    } else {
                                        ans = com.cyc.cycjava.cycl.quantities.make_interval(unit1, extended_numbers.extended_number_times(interval2, min1), extended_numbers.extended_number_times(interval2, max1));
                                    }
                                }
                            } else {
                                thread.resetMultipleValues();
                                {
                                    SubLObject unit1 = com.cyc.cycjava.cycl.quantities.explode_interval(interval1);
                                    SubLObject min1 = thread.secondMultipleValue();
                                    SubLObject max1 = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject unit2 = com.cyc.cycjava.cycl.quantities.explode_interval(interval2);
                                        SubLObject min2 = thread.secondMultipleValue();
                                        SubLObject max2 = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject result_unit = com.cyc.cycjava.cycl.quantities.unit_times(unit1, unit2);
                                            SubLObject min1min2 = extended_numbers.extended_number_times(min1, min2);
                                            SubLObject min1max2 = extended_numbers.extended_number_times(min1, max2);
                                            SubLObject max1min2 = extended_numbers.extended_number_times(max1, min2);
                                            SubLObject max1max2 = extended_numbers.extended_number_times(max1, max2);
                                            SubLObject result_min = min(min1min2, new SubLObject[]{ min1max2, max1min2, max1max2 });
                                            SubLObject result_max = max(min1min2, new SubLObject[]{ min1max2, max1min2, max1max2 });
                                            ans = com.cyc.cycjava.cycl.quantities.make_and_simplify_interval(result_unit, result_min, result_max);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return arithmetic_answer(ans);
            }
        }
    }

    /**
     * Cyc-Quant extension for #$TimesFn
     */
    @LispMethod(comment = "Cyc-Quant extension for #$TimesFn")
    public static SubLObject cyc_times_quantities(final SubLObject interval1, final SubLObject interval2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        SubLObject failureP = NIL;
        try {
            thread.throwStack.push($UNEVALUATABLE);
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        v_answer = cyc_times_quantities_int(interval1, interval2);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                failureP = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } catch (final Throwable ccatch_env_var) {
            failureP = Errors.handleThrowable(ccatch_env_var, $UNEVALUATABLE);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == failureP) {
            return v_answer;
        }
        if ((NIL != collection_defns.fractionP(interval1, UNPROVIDED)) && interval2.isInteger()) {
            if ((NIL != collection_defns.simple_fractionP(interval1, UNPROVIDED)) || (NIL != collection_defns.decimal_fractionP(interval1, UNPROVIDED))) {
                return replace_formula_arg(ONE_INTEGER, multiply(interval2, cycl_utilities.nat_arg1(interval1, UNPROVIDED)), interval1);
            }
            if (NIL != collection_defns.mixed_fractionP(interval1, UNPROVIDED)) {
                return convert_simple_fraction_to_mixed_fraction(cyc_times_quantities(convert_mixed_fraction_to_simple_fraction(interval1), interval2));
            }
            if (NIL != collection_defns.negative_mixed_fractionP(interval1, UNPROVIDED)) {
                return convert_simple_fraction_to_mixed_fraction(cyc_times_quantities(convert_fraction_to_simple_fraction(interval1), interval2));
            }
        } else {
            if (interval1.isInteger() && (NIL != collection_defns.fractionP(interval2, UNPROVIDED))) {
                return cyc_times_quantities(interval2, interval1);
            }
            if ((NIL != list_utilities.tree_find_if($sym31$FUZZY_NUMBER_, interval1, UNPROVIDED)) || (NIL != list_utilities.tree_find_if($sym31$FUZZY_NUMBER_, interval2, UNPROVIDED))) {
                return make_binary_formula($$TimesFn, interval1, interval2);
            }
        }
        return relation_evaluation.throw_unevaluatable();
    }

    public static SubLObject cyc_times_quantities_int(final SubLObject interval1, final SubLObject interval2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if ((NIL != extended_numbers.possibly_infinite_or_extended_number_p(interval1)) && (NIL != extended_numbers.possibly_infinite_or_extended_number_p(interval2))) {
            ans = extended_numbers.possibly_infinite_or_extended_number_times(interval1, interval2);
        } else
            if (NIL != extended_numbers.extended_number_p(interval1)) {
                thread.resetMultipleValues();
                final SubLObject unit2 = explode_interval(interval2);
                final SubLObject min2 = thread.secondMultipleValue();
                final SubLObject max2 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if ((NIL == extended_numbers.possibly_infinite_or_extended_number_p(min2)) || (NIL == extended_numbers.possibly_infinite_or_extended_number_p(max2))) {
                    relation_evaluation.throw_unevaluatable();
                }
                if (NIL != extended_numbers.possibly_infinite_or_extended_number_minus_p(interval1)) {
                    ans = make_interval(unit2, extended_numbers.possibly_infinite_or_extended_number_times(interval1, max2), extended_numbers.possibly_infinite_or_extended_number_times(interval1, min2));
                } else {
                    ans = make_interval(unit2, extended_numbers.possibly_infinite_or_extended_number_times(interval1, min2), extended_numbers.possibly_infinite_or_extended_number_times(interval1, max2));
                }
            } else
                if (NIL != extended_numbers.extended_number_p(interval2)) {
                    thread.resetMultipleValues();
                    final SubLObject unit3 = explode_interval(interval1);
                    final SubLObject min3 = thread.secondMultipleValue();
                    final SubLObject max3 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL == extended_numbers.possibly_infinite_or_extended_number_p(min3)) || (NIL == extended_numbers.possibly_infinite_or_extended_number_p(max3))) {
                        relation_evaluation.throw_unevaluatable();
                    }
                    if (NIL != extended_numbers.possibly_infinite_or_extended_number_minus_p(interval2)) {
                        ans = make_interval(unit3, extended_numbers.possibly_infinite_or_extended_number_times(interval2, max3), extended_numbers.possibly_infinite_or_extended_number_times(interval2, min3));
                    } else {
                        ans = make_interval(unit3, extended_numbers.possibly_infinite_or_extended_number_times(interval2, min3), extended_numbers.possibly_infinite_or_extended_number_times(interval2, max3));
                    }
                } else {
                    thread.resetMultipleValues();
                    final SubLObject unit3 = explode_interval(interval1);
                    final SubLObject min3 = thread.secondMultipleValue();
                    final SubLObject max3 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    thread.resetMultipleValues();
                    final SubLObject unit4 = explode_interval(interval2);
                    final SubLObject min4 = thread.secondMultipleValue();
                    final SubLObject max4 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if ((((NIL == extended_numbers.possibly_infinite_or_extended_number_p(min3)) || (NIL == extended_numbers.possibly_infinite_or_extended_number_p(min4))) || (NIL == extended_numbers.possibly_infinite_or_extended_number_p(max3))) || (NIL == extended_numbers.possibly_infinite_or_extended_number_p(max4))) {
                        relation_evaluation.throw_unevaluatable();
                    }
                    final SubLObject result_unit = unit_times(unit3, unit4);
                    final SubLObject min1min2 = extended_numbers.possibly_infinite_or_extended_number_times(min3, min4);
                    final SubLObject min1max2 = extended_numbers.possibly_infinite_or_extended_number_times(min3, max4);
                    final SubLObject max1min2 = extended_numbers.possibly_infinite_or_extended_number_times(max3, min4);
                    final SubLObject max1max2 = extended_numbers.possibly_infinite_or_extended_number_times(max3, max4);
                    final SubLObject result_min = extended_numbers.possibly_infinite_or_extended_number_min(list(min1min2, min1max2, max1min2, max1max2));
                    final SubLObject result_max = extended_numbers.possibly_infinite_or_extended_number_max(list(min1min2, min1max2, max1min2, max1max2));
                    ans = make_and_simplify_interval(result_unit, result_min, result_max);
                }


        return ans;
    }

    /**
     *
     *
     * @return BOOLEAN; Is TERM a fuzzy number?
     * @unknown baxter
     */
    @LispMethod(comment = "@return BOOLEAN; Is TERM a fuzzy number?\r\n@unknown baxter")
    public static final SubLObject fuzzy_numberP_alt(SubLObject v_term) {
        if (NIL != forts.fort_p(v_term)) {
            return makeBoolean((NIL != isa.isaP(v_term, $$IntegerExtent, UNPROVIDED, UNPROVIDED)) && ((NIL == com.cyc.cycjava.cycl.quantities.max_quant_value(v_term, UNPROVIDED)) || (NIL == com.cyc.cycjava.cycl.quantities.min_quant_value(v_term, UNPROVIDED))));
        } else {
            if (NIL != term.nautP(v_term, UNPROVIDED)) {
                return makeBoolean((NIL != isa.isaP(v_term, $$IntegerExtent, UNPROVIDED, UNPROVIDED)) && (NIL == isa.isaP(v_term, $$ScalarPointValue, UNPROVIDED, UNPROVIDED)));
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return BOOLEAN; Is TERM a fuzzy number?
     * @unknown baxter
     */
    @LispMethod(comment = "@return BOOLEAN; Is TERM a fuzzy number?\r\n@unknown baxter")
    public static SubLObject fuzzy_numberP(final SubLObject v_term) {
        if (NIL != extended_numbers.cyc_infinite_number_p(v_term)) {
            return NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return makeBoolean((NIL != isa.isaP(v_term, $$IntegerExtent, UNPROVIDED, UNPROVIDED)) && ((NIL == max_quant_value(v_term, UNPROVIDED)) || (NIL == min_quant_value(v_term, UNPROVIDED))));
        }
        if (NIL != term.nautP(v_term, UNPROVIDED)) {
            return makeBoolean((NIL != isa.isaP(v_term, $$IntegerExtent, UNPROVIDED, UNPROVIDED)) && (NIL == isa.isaP(v_term, $$ScalarPointValue, UNPROVIDED, UNPROVIDED)));
        }
        return NIL;
    }

    /**
     * evaluationDefn for #$QuotientFn
     */
    @LispMethod(comment = "evaluationDefn for #$QuotientFn")
    public static final SubLObject cyc_quotient_alt(SubLObject interval1, SubLObject interval2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (interval2.isNumber() && interval2.isZero()) {
                    relation_evaluation.throw_unevaluatable();
                } else {
                    if ((NIL != extended_numbers.extended_number_p(interval2)) && (NIL != extended_numbers.extended_number_p(interval1))) {
                        if ((NIL != scientific_numbers.scientific_number_p(interval1)) || (NIL != scientific_numbers.scientific_number_p(interval2))) {
                            ans = extended_numbers.extended_number_quotient(interval1, interval2);
                        } else {
                            if (NIL != extended_numbers.extended_numberE(interval2, ONE_INTEGER, UNPROVIDED)) {
                                ans = interval1;
                            } else {
                                if (NIL != extended_numbers.extended_numberE(interval1, interval2, UNPROVIDED)) {
                                    ans = ONE_INTEGER;
                                } else {
                                    ans = extended_numbers.extended_number_quotient(interval1, interval2);
                                }
                            }
                        }
                    } else {
                        if (interval2.isNumber()) {
                            thread.resetMultipleValues();
                            {
                                SubLObject unit1 = com.cyc.cycjava.cycl.quantities.explode_interval(interval1);
                                SubLObject min1 = thread.secondMultipleValue();
                                SubLObject max1 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                ans = com.cyc.cycjava.cycl.quantities.make_interval(unit1, extended_numbers.extended_number_quotient(min1, interval2), extended_numbers.extended_number_quotient(max1, interval2));
                            }
                        } else {
                            thread.resetMultipleValues();
                            {
                                SubLObject unit2 = com.cyc.cycjava.cycl.quantities.explode_interval(interval2);
                                SubLObject min2 = thread.secondMultipleValue();
                                SubLObject max2 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (!((NIL != extended_numbers.extended_number_minus_p(max2)) || (NIL != extended_numbers.extended_number_plus_p(min2)))) {
                                    relation_evaluation.throw_unevaluatable();
                                }
                                thread.resetMultipleValues();
                                {
                                    SubLObject unit1 = com.cyc.cycjava.cycl.quantities.explode_interval(interval1);
                                    SubLObject min1 = thread.secondMultipleValue();
                                    SubLObject max1 = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != com.cyc.cycjava.cycl.quantities.comparable_units(unit1, unit2)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject new_min1 = com.cyc.cycjava.cycl.quantities.convert_to_units(unit2, unit1, min1, max1);
                                            SubLObject new_max1 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            unit1 = unit2;
                                            min1 = new_min1;
                                            max1 = new_max1;
                                        }
                                    }
                                    {
                                        SubLObject result_unit = com.cyc.cycjava.cycl.quantities.unit_quotient(unit1, unit2);
                                        SubLObject min1min2 = extended_numbers.extended_number_quotient(min1, min2);
                                        SubLObject min1max2 = extended_numbers.extended_number_quotient(min1, max2);
                                        SubLObject max1min2 = extended_numbers.extended_number_quotient(max1, min2);
                                        SubLObject max1max2 = extended_numbers.extended_number_quotient(max1, max2);
                                        SubLObject result_min = extended_numbers.extended_number_min(list(min1min2, min1max2, max1min2, max1max2));
                                        SubLObject result_max = extended_numbers.extended_number_max(list(min1min2, min1max2, max1min2, max1max2));
                                        ans = com.cyc.cycjava.cycl.quantities.make_and_simplify_interval(result_unit, result_min, result_max);
                                    }
                                }
                            }
                        }
                    }
                }
                return arithmetic_answer(ans);
            }
        }
    }

    /**
     * evaluationDefn for #$QuotientFn
     */
    @LispMethod(comment = "evaluationDefn for #$QuotientFn")
    public static SubLObject cyc_quotient(final SubLObject interval1, final SubLObject interval2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject ans = NIL;
                    if ((NIL != extended_numbers.extended_number_p(interval2)) && (NIL != extended_numbers.extended_number_zero_p(interval2))) {
                        relation_evaluation.throw_unevaluatable();
                    } else
                        if ((NIL != extended_numbers.possibly_infinite_or_extended_number_p(interval2)) && (NIL != extended_numbers.possibly_infinite_or_extended_number_p(interval1))) {
                            if ((NIL != scientific_numbers.scientific_number_p(interval1)) || (NIL != scientific_numbers.scientific_number_p(interval2))) {
                                SubLObject ignore_errors_tag_$25 = NIL;
                                try {
                                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                    final SubLObject _prev_bind_0_$26 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            return extended_numbers.extended_number_quotient(interval1, interval2);
                                        } catch (final Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$26, thread);
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    ignore_errors_tag_$25 = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                } finally {
                                    thread.throwStack.pop();
                                }
                                relation_evaluation.throw_unevaluatable();
                            } else
                                if ((NIL != extended_numbers.extended_number_p(interval2)) && (NIL != extended_numbers.extended_numberE(interval2, ONE_INTEGER, UNPROVIDED))) {
                                    ans = interval1;
                                } else
                                    if (((NIL != extended_numbers.extended_number_p(interval1)) && (NIL != extended_numbers.extended_number_p(interval2))) && (NIL != extended_numbers.extended_numberE(interval1, interval2, UNPROVIDED))) {
                                        ans = ONE_INTEGER;
                                    } else {
                                        ans = extended_numbers.possibly_infinite_or_extended_number_quotient(interval1, interval2);
                                    }


                        } else
                            if (NIL != extended_numbers.possibly_infinite_or_extended_number_p(interval2)) {
                                thread.resetMultipleValues();
                                final SubLObject unit1 = explode_interval(interval1);
                                final SubLObject min1 = thread.secondMultipleValue();
                                final SubLObject max1 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                ans = make_interval(unit1, extended_numbers.possibly_infinite_or_extended_number_quotient(min1, interval2), extended_numbers.possibly_infinite_or_extended_number_quotient(max1, interval2));
                            } else {
                                thread.resetMultipleValues();
                                final SubLObject unit2 = explode_interval(interval2);
                                final SubLObject min2 = thread.secondMultipleValue();
                                final SubLObject max2 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if ((NIL == extended_numbers.possibly_infinite_or_extended_number_minus_p(max2)) && (NIL == extended_numbers.possibly_infinite_or_extended_number_plus_p(min2))) {
                                    relation_evaluation.throw_unevaluatable();
                                }
                                thread.resetMultipleValues();
                                SubLObject unit3 = explode_interval(interval1);
                                SubLObject min3 = thread.secondMultipleValue();
                                SubLObject max3 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != comparable_units(unit3, unit2)) {
                                    thread.resetMultipleValues();
                                    final SubLObject new_min1 = convert_to_units(unit2, unit3, min3, max3);
                                    final SubLObject new_max1 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    unit3 = unit2;
                                    min3 = new_min1;
                                    max3 = new_max1;
                                }
                                final SubLObject result_unit = unit_quotient(unit3, unit2);
                                final SubLObject min1min2 = extended_numbers.possibly_infinite_or_extended_number_quotient(min3, min2);
                                final SubLObject min1max2 = extended_numbers.possibly_infinite_or_extended_number_quotient(min3, max2);
                                final SubLObject max1min2 = extended_numbers.possibly_infinite_or_extended_number_quotient(max3, min2);
                                final SubLObject max1max2 = extended_numbers.possibly_infinite_or_extended_number_quotient(max3, max2);
                                final SubLObject result_min = extended_numbers.possibly_infinite_or_extended_number_min(list(min1min2, min1max2, max1min2, max1max2));
                                final SubLObject result_max = extended_numbers.possibly_infinite_or_extended_number_max(list(min1min2, min1max2, max1min2, max1max2));
                                ans = make_and_simplify_interval(result_unit, arithmetic.arithmetic_answer(result_min), arithmetic.arithmetic_answer(result_max));
                            }


                    return ans;
                } catch (final Throwable catch_var2) {
                    Errors.handleThrowable(catch_var2, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    /**
     * evaluationDefn for #$InverseOfIntervalFn
     */
    @LispMethod(comment = "evaluationDefn for #$InverseOfIntervalFn")
    public static final SubLObject cyc_inverse_alt(SubLObject interval) {
        return com.cyc.cycjava.cycl.quantities.cyc_quotient(ONE_INTEGER, interval);
    }

    /**
     * evaluationDefn for #$InverseOfIntervalFn
     */
    @LispMethod(comment = "evaluationDefn for #$InverseOfIntervalFn")
    public static SubLObject cyc_inverse(final SubLObject interval) {
        return cyc_quotient(ONE_INTEGER, interval);
    }

    /**
     * evaluationDefn for #$ModuloFn
     */
    @LispMethod(comment = "evaluationDefn for #$ModuloFn")
    public static final SubLObject cyc_modulo_alt(SubLObject interval1, SubLObject interval2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (interval2.isNumber() && interval2.isZero()) {
                    relation_evaluation.throw_unevaluatable();
                } else {
                    if (interval2.isNumber() && interval1.isNumber()) {
                        ans = mod(interval1, interval2);
                    } else {
                        thread.resetMultipleValues();
                        {
                            SubLObject unit2 = com.cyc.cycjava.cycl.quantities.explode_interval(interval2);
                            SubLObject min2 = thread.secondMultipleValue();
                            SubLObject max2 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (!min2.numE(max2)) {
                                relation_evaluation.throw_unevaluatable();
                            }
                            if (min2.isZero()) {
                                relation_evaluation.throw_unevaluatable();
                            }
                            thread.resetMultipleValues();
                            {
                                SubLObject unit1 = com.cyc.cycjava.cycl.quantities.explode_interval(interval1);
                                SubLObject min1 = thread.secondMultipleValue();
                                SubLObject max1 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (!min1.numE(max1)) {
                                    relation_evaluation.throw_unevaluatable();
                                }
                                if (NIL == com.cyc.cycjava.cycl.quantities.comparable_units(unit1, unit2)) {
                                    relation_evaluation.throw_unevaluatable();
                                }
                                {
                                    SubLObject converted_min1 = com.cyc.cycjava.cycl.quantities.convert_to_units(unit2, unit1, min1, UNPROVIDED);
                                    SubLObject result_unit = unit2;
                                    SubLObject result_min = mod(converted_min1, min2);
                                    ans = com.cyc.cycjava.cycl.quantities.make_and_simplify_interval(result_unit, result_min, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
                return arithmetic_answer(ans);
            }
        }
    }

    /**
     * evaluationDefn for #$ModuloFn
     */
    @LispMethod(comment = "evaluationDefn for #$ModuloFn")
    public static SubLObject cyc_modulo(final SubLObject interval1, final SubLObject base) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject ans = NIL;
                    if ((NIL != extended_numbers.extended_number_p(base)) && (NIL != extended_numbers.extended_number_zero_p(base))) {
                        relation_evaluation.throw_unevaluatable();
                    } else
                        if ((NIL != extended_numbers.extended_number_p(base)) && (NIL != extended_numbers.extended_number_p(interval1))) {
                            ans = extended_numbers.extended_number_modulo(interval1, base);
                        } else {
                            thread.resetMultipleValues();
                            final SubLObject unit2 = explode_interval(base);
                            final SubLObject min2 = thread.secondMultipleValue();
                            final SubLObject max2 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL == extended_numbers.extended_numberE(min2, max2, UNPROVIDED)) {
                                relation_evaluation.throw_unevaluatable();
                            }
                            if (min2.isZero()) {
                                relation_evaluation.throw_unevaluatable();
                            }
                            thread.resetMultipleValues();
                            final SubLObject unit3 = explode_interval(interval1);
                            final SubLObject min3 = thread.secondMultipleValue();
                            final SubLObject max3 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL == extended_numbers.extended_numberE(min3, max3, UNPROVIDED)) {
                                relation_evaluation.throw_unevaluatable();
                            }
                            if (NIL == comparable_units(unit3, unit2)) {
                                relation_evaluation.throw_unevaluatable();
                            }
                            final SubLObject converted_min1 = convert_to_units(unit2, unit3, min3, UNPROVIDED);
                            final SubLObject result_unit = unit2;
                            final SubLObject result_min = extended_numbers.extended_number_modulo(converted_min1, min2);
                            ans = make_and_simplify_interval(result_unit, result_min, UNPROVIDED);
                        }

                    return arithmetic.arithmetic_answer(ans);
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
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    public static SubLObject sanity_check_cyc_modulo(final SubLObject interval1, final SubLObject base, final SubLObject ans) {
        if (interval1.isNumber() && base.isNumber()) {
            return T;
        }
        if ((NIL != scientific_numbers.scientific_number_p(interval1)) || (NIL != scientific_numbers.scientific_number_p(base))) {
            return T;
        }
        final SubLObject subl_ans = cyc_modulo(extended_numbers.extended_number_to_subl_real(interval1), extended_numbers.extended_number_to_subl_real(base));
        final SubLObject sigdigs = ONE_INTEGER;
        SubLObject saneP = T;
        if (NIL != extended_numbers.extended_number_zero_p(ans)) {
            saneP = makeBoolean(ans.numG(MINUS_ONE_INTEGER) && ans.numL(ONE_INTEGER));
        } else
            if (!extended_numbers.extended_number_plus_p(ans).eql(plusp(subl_ans))) {
                saneP = NIL;
            } else {
                saneP = extended_numbers.extended_numberE(number_utilities.significant_digits(extended_numbers.extended_number_to_subl_real(ans), sigdigs), number_utilities.significant_digits(subl_ans, sigdigs), UNPROVIDED);
            }

        if (NIL == saneP) {
            Errors.sublisp_break($str44$Got__S___Wanted__S, new SubLObject[]{ number_utilities.significant_digits(extended_numbers.extended_number_to_subl_real(ans), sigdigs), number_utilities.significant_digits(subl_ans, sigdigs) });
        }
        return T;
    }

    /**
     * evaluationDefn for #$ResidueFn
     */
    @LispMethod(comment = "evaluationDefn for #$ResidueFn")
    public static final SubLObject cyc_residue_alt(SubLObject interval) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject unit = com.cyc.cycjava.cycl.quantities.explode_interval(interval);
                SubLObject min = thread.secondMultipleValue();
                SubLObject max = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL == unit) {
                    relation_evaluation.throw_unevaluatable();
                }
                {
                    SubLObject measure_types = com.cyc.cycjava.cycl.quantities.unit_of_measure_type(unit);
                    if (NIL == measure_types) {
                        relation_evaluation.throw_unevaluatable();
                    }
                    {
                        SubLObject new_min = NIL;
                        SubLObject new_max = NIL;
                        if (NIL == new_min) {
                            {
                                SubLObject csome_list_var = measure_types;
                                SubLObject measure_type = NIL;
                                for (measure_type = csome_list_var.first(); !((NIL != new_min) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , measure_type = csome_list_var.first()) {
                                    if (NIL == new_min) {
                                        {
                                            SubLObject csome_list_var_20 = com.cyc.cycjava.cycl.quantities.quantity_congruence_base(measure_type);
                                            SubLObject base = NIL;
                                            for (base = csome_list_var_20.first(); !((NIL != new_min) || (NIL == csome_list_var_20)); csome_list_var_20 = csome_list_var_20.rest() , base = csome_list_var_20.first()) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject base_unit = com.cyc.cycjava.cycl.quantities.explode_interval(base);
                                                    SubLObject base_min = thread.secondMultipleValue();
                                                    SubLObject base_max = thread.thirdMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (base_min.numE(base_max) && (NIL != com.cyc.cycjava.cycl.quantities.comparable_units(unit, base_unit))) {
                                                        {
                                                            SubLObject converted_base_value = com.cyc.cycjava.cycl.quantities.convert_to_units(unit, base_unit, base_min, UNPROVIDED);
                                                            new_min = mod(min, converted_base_value);
                                                            new_max = add(new_min, subtract(max, min));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return com.cyc.cycjava.cycl.quantities.make_interval(unit, NIL != new_min ? ((SubLObject) (new_min)) : min, NIL != new_max ? ((SubLObject) (new_max)) : max);
                    }
                }
            }
        }
    }

    /**
     * evaluationDefn for #$ResidueFn
     */
    @LispMethod(comment = "evaluationDefn for #$ResidueFn")
    public static SubLObject cyc_residue(final SubLObject interval) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject unit = explode_interval(interval);
        final SubLObject min = thread.secondMultipleValue();
        final SubLObject max = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL == unit) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject measure_types = unit_of_measure_type(unit);
        if (NIL == measure_types) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject new_min = NIL;
        SubLObject new_max = NIL;
        if (NIL == new_min) {
            SubLObject csome_list_var = measure_types;
            SubLObject measure_type = NIL;
            measure_type = csome_list_var.first();
            while ((NIL == new_min) && (NIL != csome_list_var)) {
                if (NIL == new_min) {
                    SubLObject csome_list_var_$27 = quantity_congruence_base(measure_type);
                    SubLObject base = NIL;
                    base = csome_list_var_$27.first();
                    while ((NIL == new_min) && (NIL != csome_list_var_$27)) {
                        thread.resetMultipleValues();
                        final SubLObject base_unit = explode_interval(base);
                        final SubLObject base_min = thread.secondMultipleValue();
                        final SubLObject base_max = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (base_min.numE(base_max) && (NIL != comparable_units(unit, base_unit))) {
                            final SubLObject converted_base_value = convert_to_units(unit, base_unit, base_min, UNPROVIDED);
                            new_min = mod(min, converted_base_value);
                            new_max = add(new_min, subtract(max, min));
                        }
                        csome_list_var_$27 = csome_list_var_$27.rest();
                        base = csome_list_var_$27.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                measure_type = csome_list_var.first();
            } 
        }
        return make_interval(unit, NIL != new_min ? new_min : min, NIL != new_max ? new_max : max);
    }

    public static final SubLObject quantity_congruence_base_alt(SubLObject quantity_type) {
        return kb_mapping_utilities.pred_values(quantity_type, $$quantityCongruenceBase, TWO_INTEGER, ONE_INTEGER, $TRUE);
    }

    public static SubLObject quantity_congruence_base(final SubLObject quantity_type) {
        return kb_mapping_utilities.pred_values(quantity_type, $$quantityCongruenceBase, TWO_INTEGER, ONE_INTEGER, $TRUE);
    }

    public static final SubLObject unit_of_measure_type_alt(SubLObject unit) {
        {
            SubLObject types = NIL;
            SubLObject cdolist_list_var = kb_accessors.result_isa(unit, UNPROVIDED);
            SubLObject type = NIL;
            for (type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type = cdolist_list_var.first()) {
                if (NIL != at_defns.quiet_has_typeP(type, $$MeasurableQuantityType, UNPROVIDED)) {
                    types = cons(type, types);
                }
            }
            return nreverse(types);
        }
    }

    public static SubLObject unit_of_measure_type(final SubLObject unit) {
        SubLObject types = NIL;
        SubLObject cdolist_list_var = kb_accessors.result_isa(unit, UNPROVIDED);
        SubLObject type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != at_defns.quiet_has_typeP(type, $$MeasurableQuantityType, UNPROVIDED)) {
                types = cons(type, types);
            }
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        return nreverse(types);
    }

    /**
     * evaluationDefn for #$AbsoluteValueFn
     */
    @LispMethod(comment = "evaluationDefn for #$AbsoluteValueFn")
    public static final SubLObject cyc_absolute_value_alt(SubLObject interval) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (NIL != extended_numbers.extended_number_p(interval)) {
                    ans = extended_numbers.extended_number_abs(interval);
                } else {
                    thread.resetMultipleValues();
                    {
                        SubLObject unit = com.cyc.cycjava.cycl.quantities.explode_interval(interval);
                        SubLObject min = thread.secondMultipleValue();
                        SubLObject max = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject min_abs = extended_numbers.extended_number_abs(min);
                            SubLObject max_abs = extended_numbers.extended_number_abs(max);
                            SubLObject result_min = extended_numbers.extended_number_min(list(min_abs, max_abs));
                            SubLObject result_max = extended_numbers.extended_number_max(list(min_abs, max_abs));
                            if ((NIL != extended_numbers.extended_number_minus_p(min)) && (NIL != extended_numbers.extended_number_plus_p(max))) {
                                result_min = ZERO_INTEGER;
                            }
                            ans = com.cyc.cycjava.cycl.quantities.make_interval(unit, result_min, result_max);
                        }
                    }
                }
                return arithmetic_answer(ans);
            }
        }
    }

    /**
     * evaluationDefn for #$AbsoluteValueFn
     */
    @LispMethod(comment = "evaluationDefn for #$AbsoluteValueFn")
    public static SubLObject cyc_absolute_value(final SubLObject interval) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject ans = NIL;
                    if (NIL != extended_numbers.possibly_infinite_or_extended_number_p(interval)) {
                        ans = extended_numbers.possibly_infinite_or_extended_number_abs(interval);
                    } else {
                        thread.resetMultipleValues();
                        final SubLObject unit = explode_interval(interval);
                        final SubLObject min = thread.secondMultipleValue();
                        final SubLObject max = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject min_abs = extended_numbers.possibly_infinite_or_extended_number_abs(min);
                        final SubLObject max_abs = extended_numbers.possibly_infinite_or_extended_number_abs(max);
                        SubLObject result_min = extended_numbers.possibly_infinite_or_extended_number_min(list(min_abs, max_abs));
                        final SubLObject result_max = extended_numbers.possibly_infinite_or_extended_number_max(list(min_abs, max_abs));
                        if ((NIL != extended_numbers.possibly_infinite_or_extended_number_minus_p(min)) && (NIL != extended_numbers.possibly_infinite_or_extended_number_plus_p(max))) {
                            result_min = ZERO_INTEGER;
                        }
                        ans = make_interval(unit, result_min, result_max);
                    }
                    return ans;
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
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    /**
     * evaluationDefn for #$SqrtFn
     */
    @LispMethod(comment = "evaluationDefn for #$SqrtFn")
    public static final SubLObject cyc_sqrt_alt(SubLObject interval) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if ((NIL != extended_numbers.extended_number_p(interval)) && (NIL != extended_numbers.extended_number_minus_p(interval))) {
                    relation_evaluation.throw_unevaluatable();
                } else {
                    if (NIL != extended_numbers.extended_number_p(interval)) {
                        ans = extended_numbers.extended_number_sqrt(interval);
                    } else {
                        thread.resetMultipleValues();
                        {
                            SubLObject unit = com.cyc.cycjava.cycl.quantities.explode_interval(interval);
                            SubLObject min = thread.secondMultipleValue();
                            SubLObject max = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if ((NIL != extended_numbers.extended_number_minus_p(min)) || (NIL != extended_numbers.extended_number_minus_p(max))) {
                                relation_evaluation.throw_unevaluatable();
                            }
                            {
                                SubLObject result_unit = com.cyc.cycjava.cycl.quantities.unit_sqrt(unit);
                                SubLObject min_sqrt = extended_numbers.extended_number_sqrt(min);
                                SubLObject max_sqrt = extended_numbers.extended_number_sqrt(max);
                                ans = com.cyc.cycjava.cycl.quantities.make_interval(result_unit, min_sqrt, max_sqrt);
                            }
                        }
                    }
                }
                return arithmetic_answer(ans);
            }
        }
    }

    /**
     * evaluationDefn for #$SqrtFn
     */
    @LispMethod(comment = "evaluationDefn for #$SqrtFn")
    public static SubLObject cyc_sqrt(final SubLObject interval) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != extended_numbers.possibly_infinite_or_extended_number_p(interval)) && (NIL != extended_numbers.possibly_infinite_or_extended_number_minus_p(interval))) {
            relation_evaluation.throw_unevaluatable();
        } else
            if (NIL != extended_numbers.possibly_infinite_or_extended_number_p(interval)) {
                SubLObject ignore_errors_tag = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            return extended_numbers.possibly_infinite_or_extended_number_sqrt(interval);
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
                relation_evaluation.throw_unevaluatable();
            } else {
                thread.resetMultipleValues();
                final SubLObject unit = explode_interval(interval);
                final SubLObject min = thread.secondMultipleValue();
                final SubLObject max = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != extended_numbers.possibly_infinite_or_extended_number_minus_p(min)) || (NIL != extended_numbers.possibly_infinite_or_extended_number_minus_p(max))) {
                    relation_evaluation.throw_unevaluatable();
                }
                SubLObject ignore_errors_tag2 = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            final SubLObject result_unit = unit_sqrt(unit);
                            final SubLObject min_sqrt = extended_numbers.possibly_infinite_or_extended_number_sqrt(min);
                            final SubLObject max_sqrt = extended_numbers.possibly_infinite_or_extended_number_sqrt(max);
                            return make_interval(result_unit, min_sqrt, max_sqrt);
                        } catch (final Throwable catch_var2) {
                            Errors.handleThrowable(catch_var2, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_2, thread);
                    }
                } catch (final Throwable ccatch_env_var2) {
                    ignore_errors_tag2 = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
                } finally {
                    thread.throwStack.pop();
                }
                relation_evaluation.throw_unevaluatable();
            }

        return NIL;
    }

    /**
     * evaluationDefn for #$SquaredFn
     */
    @LispMethod(comment = "evaluationDefn for #$SquaredFn")
    public static final SubLObject cyc_squared_alt(SubLObject interval) {
        return cyc_times_internal(interval, interval);
    }

    /**
     * evaluationDefn for #$SquaredFn
     */
    @LispMethod(comment = "evaluationDefn for #$SquaredFn")
    public static SubLObject cyc_squared(final SubLObject interval) {
        return arithmetic.cyc_times_internal(interval, interval);
    }

    /**
     * evaluationDefn for #$Percent
     */
    @LispMethod(comment = "evaluationDefn for #$Percent")
    public static final SubLObject cyc_percent_alt(SubLObject args) {
        {
            SubLObject ans = NIL;
            if (!((NIL != list_utilities.lengthGE(args, ONE_INTEGER, UNPROVIDED)) && (NIL != list_utilities.lengthLE(args, TWO_INTEGER, UNPROVIDED)))) {
                relation_evaluation.throw_unevaluatable();
            }
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject min = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt43);
                min = current.first();
                current = current.rest();
                {
                    SubLObject max = (current.isCons()) ? ((SubLObject) (current.first())) : min;
                    destructuring_bind_must_listp(current, datum, $list_alt43);
                    current = current.rest();
                    if (NIL == current) {
                        if (!(min.isNumber() && max.isNumber())) {
                            relation_evaluation.throw_unevaluatable();
                        }
                        {
                            SubLObject min_scaled = divide(min, $int$100);
                            SubLObject max_scaled = divide(max, $int$100);
                            ans = com.cyc.cycjava.cycl.quantities.make_interval($$Unity, min_scaled, max_scaled);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt43);
                    }
                }
            }
            return arithmetic_answer(ans);
        }
    }

    /**
     * evaluationDefn for #$Percent
     */
    @LispMethod(comment = "evaluationDefn for #$Percent")
    public static SubLObject cyc_percent(final SubLObject args) {
        SubLObject ans = NIL;
        if ((NIL == list_utilities.lengthGE(args, ONE_INTEGER, UNPROVIDED)) || (NIL == list_utilities.lengthLE(args, TWO_INTEGER, UNPROVIDED))) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject min = NIL;
        destructuring_bind_must_consp(args, args, $list52);
        min = args.first();
        SubLObject current = args.rest();
        final SubLObject max = (current.isCons()) ? current.first() : min;
        destructuring_bind_must_listp(current, args, $list52);
        current = current.rest();
        if (NIL == current) {
            if ((!min.isNumber()) || (!max.isNumber())) {
                relation_evaluation.throw_unevaluatable();
            }
            final SubLObject min_scaled = divide(min, $int$100);
            final SubLObject max_scaled = divide(max, $int$100);
            ans = make_interval($$Unity, arithmetic.arithmetic_answer(min_scaled), arithmetic.arithmetic_answer(max_scaled));
        } else {
            cdestructuring_bind_error(args, $list52);
        }
        return ans;
    }

    /**
     * evaluationDefn for #$RoundUpFn
     */
    @LispMethod(comment = "evaluationDefn for #$RoundUpFn")
    public static final SubLObject cyc_round_up_alt(SubLObject interval) {
        return com.cyc.cycjava.cycl.quantities.cyc_round_internal(interval, CEILING);
    }

    /**
     * evaluationDefn for #$RoundUpFn
     */
    @LispMethod(comment = "evaluationDefn for #$RoundUpFn")
    public static SubLObject cyc_round_up(final SubLObject interval) {
        return cyc_round_internal(interval, CEILING, UNPROVIDED);
    }

    /**
     * evaluationDefn for #$RoundClosestFn
     */
    @LispMethod(comment = "evaluationDefn for #$RoundClosestFn")
    public static final SubLObject cyc_round_closest_alt(SubLObject interval) {
        return com.cyc.cycjava.cycl.quantities.cyc_round_internal(interval, ROUND);
    }

    /**
     * evaluationDefn for #$RoundClosestFn
     */
    @LispMethod(comment = "evaluationDefn for #$RoundClosestFn")
    public static SubLObject cyc_round_closest(final SubLObject interval) {
        return cyc_round_internal(interval, ROUND, UNPROVIDED);
    }

    /**
     * evaluationDefn for #$RoundDownFn
     */
    @LispMethod(comment = "evaluationDefn for #$RoundDownFn")
    public static final SubLObject cyc_round_down_alt(SubLObject interval) {
        return com.cyc.cycjava.cycl.quantities.cyc_round_internal(interval, FLOOR);
    }

    /**
     * evaluationDefn for #$RoundDownFn
     */
    @LispMethod(comment = "evaluationDefn for #$RoundDownFn")
    public static SubLObject cyc_round_down(final SubLObject interval) {
        return cyc_round_internal(interval, FLOOR, UNPROVIDED);
    }

    /**
     * evaluationDefn for #$TruncateFn
     */
    @LispMethod(comment = "evaluationDefn for #$TruncateFn")
    public static final SubLObject cyc_round_truncate_alt(SubLObject interval) {
        return com.cyc.cycjava.cycl.quantities.cyc_round_internal(interval, TRUNCATE);
    }

    /**
     * evaluationDefn for #$TruncateFn
     */
    @LispMethod(comment = "evaluationDefn for #$TruncateFn")
    public static SubLObject cyc_round_truncate(final SubLObject interval) {
        return cyc_round_internal(interval, TRUNCATE, UNPROVIDED);
    }

    public static final SubLObject cyc_round_internal(SubLObject interval, SubLObject rounding_func) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (interval.isNumber()) {
                    ans = funcall(rounding_func, interval);
                } else {
                    thread.resetMultipleValues();
                    {
                        SubLObject unit = com.cyc.cycjava.cycl.quantities.explode_interval(interval);
                        SubLObject min = thread.secondMultipleValue();
                        SubLObject max = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject min_round = funcall(rounding_func, min);
                            SubLObject max_round = funcall(rounding_func, max);
                            ans = com.cyc.cycjava.cycl.quantities.make_interval(unit, min_round, max_round);
                        }
                    }
                }
                return arithmetic_answer(ans);
            }
        }
    }

    public static SubLObject cyc_round_internal(final SubLObject interval, final SubLObject rounding_func, SubLObject seen) {
        if (seen == UNPROVIDED) {
            seen = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject ans = NIL;
                    if (NIL != subl_promotions.memberP(interval, seen, symbol_function(EQUAL), UNPROVIDED)) {
                        relation_evaluation.throw_unevaluatable();
                    } else
                        if (interval.isNumber()) {
                            ans = funcall(rounding_func, interval);
                        } else {
                            if ((NIL != extended_numbers.extended_number_p(interval)) && (NIL != extended_numbers.extended_number_integer_p(interval))) {
                                return interval;
                            }
                            if (NIL != scientific_numbers.scientific_number_p(interval)) {
                                final SubLObject digits = scientific_numbers.scientific_number_significant_digit_count(interval);
                                return scientific_numbers.scientific_number_from_subl_real(cyc_round_internal(scientific_numbers.scientific_number_to_subl_real(interval), rounding_func, cons(interval, seen)), digits);
                            }
                            if (NIL != collection_defns.fractionP(interval, UNPROVIDED)) {
                                ans = extended_numbers.fraction_or_number_to_el(cyc_round_internal(math_expression_utilities.fraction_from_el(interval), rounding_func, cons(interval, seen)));
                            } else
                                if (NIL != fraction_utilities.fraction_p(interval)) {
                                    ans = cyc_round_internal(fraction_utilities.fraction_to_number(interval), rounding_func, cons(interval, seen));
                                } else {
                                    thread.resetMultipleValues();
                                    final SubLObject unit = explode_interval(interval);
                                    final SubLObject min = thread.secondMultipleValue();
                                    final SubLObject max = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    final SubLObject min_round = cyc_round_internal(min, rounding_func, cons(interval, seen));
                                    final SubLObject max_round = cyc_round_internal(max, rounding_func, cons(interval, seen));
                                    ans = make_interval(unit, min_round, max_round);
                                }

                        }

                    return ans;
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
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    public static SubLObject round_to_nth_decimal(final SubLObject number, SubLObject decimal) {
        if (decimal == UNPROVIDED) {
            decimal = $round_nth_n$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != numberp(number) : "! numberp(number) " + ("Types.numberp(number) " + "CommonSymbols.NIL != Types.numberp(number) ") + number;
        assert NIL != subl_promotions.non_negative_integer_p(decimal) : "! subl_promotions.non_negative_integer_p(decimal) " + ("subl_promotions.non_negative_integer_p(decimal) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(decimal) ") + decimal;
        final SubLObject decimal_pos = position(CHAR_period, string_utilities.to_string(number), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject current_decimal_places = (NIL != decimal_pos) ? number_utilities.f_1_(subtract(length(string_utilities.to_string(number)), decimal_pos)) : ZERO_INTEGER;
        if (current_decimal_places.numLE(decimal)) {
            decimal = current_decimal_places;
        }
        if (decimal.isZero()) {
            return round(number, UNPROVIDED);
        }
        final SubLObject scale = number_utilities.expt10(decimal);
        final SubLObject significand = round(multiply(number, scale), UNPROVIDED);
        return $CYCL.eql($round_nth_output_format$.getDynamicValue(thread)) && (NIL != kb_control_vars.fraction_kb_loaded_p()) ? make_binary_formula($$DecimalFractionFn, significand, decimal) : divide(significand, scale);
    }

    public static SubLObject cyc_round_closest_to_nth_decimal(final SubLObject interval, final SubLObject limit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject _prev_bind_0_$28 = $round_nth_n$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = $round_nth_output_format$.currentBinding(thread);
                    try {
                        $round_nth_n$.bind(limit, thread);
                        $round_nth_output_format$.bind($CYCL, thread);
                        return cyc_round_internal(interval, ROUND_TO_NTH_DECIMAL, UNPROVIDED);
                    } finally {
                        $round_nth_output_format$.rebind(_prev_bind_2, thread);
                        $round_nth_n$.rebind(_prev_bind_0_$28, thread);
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
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    /**
     * evaluationDefn for #$MaxRangeFn
     */
    @LispMethod(comment = "evaluationDefn for #$MaxRangeFn")
    public static final SubLObject cyc_max_range_alt(SubLObject args) {
        if (NIL == args) {
            relation_evaluation.throw_unevaluatable();
        } else {
            if (NIL != list_utilities.singletonP(args)) {
                return args.first();
            } else {
                return quantity_reduce(symbol_function(CYC_MAX_RANGE_INTERNAL), NIL, args);
            }
        }
        return NIL;
    }

    /**
     * evaluationDefn for #$MaxRangeFn
     */
    @LispMethod(comment = "evaluationDefn for #$MaxRangeFn")
    public static SubLObject cyc_max_range(final SubLObject args) {
        if (NIL == args) {
            relation_evaluation.throw_unevaluatable();
            return NIL;
        }
        if (NIL != list_utilities.singletonP(args)) {
            return args.first();
        }
        return arithmetic.quantity_reduce(symbol_function(CYC_MAX_RANGE_INTERNAL), NIL, args);
    }

    public static final SubLObject cyc_max_range_internal_alt(SubLObject interval1, SubLObject interval2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (interval1.isNumber() && interval2.isNumber()) {
                    {
                        SubLObject min = min(interval1, interval2);
                        SubLObject max = max(interval1, interval2);
                        ans = com.cyc.cycjava.cycl.quantities.make_interval($$Unity, min, max);
                    }
                } else {
                    thread.resetMultipleValues();
                    {
                        SubLObject unit1 = com.cyc.cycjava.cycl.quantities.explode_interval(interval1);
                        SubLObject min1 = thread.secondMultipleValue();
                        SubLObject max1 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        thread.resetMultipleValues();
                        {
                            SubLObject unit2 = com.cyc.cycjava.cycl.quantities.explode_interval(interval2);
                            SubLObject min2 = thread.secondMultipleValue();
                            SubLObject max2 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL == com.cyc.cycjava.cycl.quantities.comparable_units(unit1, unit2)) {
                                relation_evaluation.throw_unevaluatable();
                            }
                            thread.resetMultipleValues();
                            {
                                SubLObject new_min2 = com.cyc.cycjava.cycl.quantities.convert_to_units(unit1, unit2, min2, max2);
                                SubLObject new_max2 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                min2 = new_min2;
                                max2 = new_max2;
                            }
                            {
                                SubLObject ans_min = min(min1, min2);
                                SubLObject ans_max = max(max1, max2);
                                ans = com.cyc.cycjava.cycl.quantities.make_interval(unit1, ans_min, ans_max);
                            }
                        }
                    }
                }
                return arithmetic_answer(ans);
            }
        }
    }

    public static SubLObject cyc_max_range_internal(final SubLObject interval1, final SubLObject interval2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != extended_numbers.possibly_infinite_or_extended_number_p(interval1)) && (NIL != extended_numbers.possibly_infinite_or_extended_number_p(interval2))) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject min = extended_numbers.possibly_infinite_or_extended_number_min(list(interval1, interval2));
                        final SubLObject max = extended_numbers.possibly_infinite_or_extended_number_max(list(interval1, interval2));
                        return make_interval($$Unity, min, max);
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
            relation_evaluation.throw_unevaluatable();
        } else {
            thread.resetMultipleValues();
            final SubLObject unit1 = explode_interval(interval1);
            final SubLObject min2 = thread.secondMultipleValue();
            final SubLObject max2 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject unit2 = explode_interval(interval2);
            SubLObject min3 = thread.secondMultipleValue();
            SubLObject max3 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL == comparable_units(unit1, unit2)) {
                relation_evaluation.throw_unevaluatable();
            }
            thread.resetMultipleValues();
            final SubLObject new_min2 = convert_to_units(unit1, unit2, min3, max3);
            final SubLObject new_max2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            min3 = new_min2;
            max3 = new_max2;
            SubLObject ignore_errors_tag2 = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject ans_min = extended_numbers.possibly_infinite_or_extended_number_min(list(min2, min3));
                        final SubLObject ans_max = extended_numbers.possibly_infinite_or_extended_number_max(list(max2, max3));
                        return make_interval(unit1, ans_min, ans_max);
                    } catch (final Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_2, thread);
                }
            } catch (final Throwable ccatch_env_var2) {
                ignore_errors_tag2 = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
            relation_evaluation.throw_unevaluatable();
        }
        return NIL;
    }

    /**
     * evaluationDefn for #$MaxRangeFn
     */
    @LispMethod(comment = "evaluationDefn for #$MaxRangeFn")
    public static final SubLObject cyc_min_range_alt(SubLObject args) {
        if (NIL == args) {
            relation_evaluation.throw_unevaluatable();
        } else {
            if (NIL != list_utilities.singletonP(args)) {
                return args.first();
            } else {
                return quantity_reduce(symbol_function(CYC_MIN_RANGE_INTERNAL), NIL, args);
            }
        }
        return NIL;
    }

    /**
     * evaluationDefn for #$MaxRangeFn
     */
    @LispMethod(comment = "evaluationDefn for #$MaxRangeFn")
    public static SubLObject cyc_min_range(final SubLObject args) {
        if (NIL == args) {
            relation_evaluation.throw_unevaluatable();
            return NIL;
        }
        if (NIL != list_utilities.singletonP(args)) {
            return args.first();
        }
        return arithmetic.quantity_reduce(symbol_function(CYC_MIN_RANGE_INTERNAL), NIL, args);
    }

    public static final SubLObject cyc_min_range_internal_alt(SubLObject interval1, SubLObject interval2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (interval1.isNumber() && interval2.isNumber()) {
                    if (interval1.numE(interval2)) {
                        ans = interval1;
                    } else {
                        relation_evaluation.throw_unevaluatable();
                    }
                } else {
                    thread.resetMultipleValues();
                    {
                        SubLObject unit1 = com.cyc.cycjava.cycl.quantities.explode_interval(interval1);
                        SubLObject min1 = thread.secondMultipleValue();
                        SubLObject max1 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        thread.resetMultipleValues();
                        {
                            SubLObject unit2 = com.cyc.cycjava.cycl.quantities.explode_interval(interval2);
                            SubLObject min2 = thread.secondMultipleValue();
                            SubLObject max2 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL == com.cyc.cycjava.cycl.quantities.comparable_units(unit1, unit2)) {
                                relation_evaluation.throw_unevaluatable();
                            }
                            thread.resetMultipleValues();
                            {
                                SubLObject new_min2 = com.cyc.cycjava.cycl.quantities.convert_to_units(unit1, unit2, min2, max2);
                                SubLObject new_max2 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                min2 = new_min2;
                                max2 = new_max2;
                            }
                            {
                                SubLObject ans_min = max(min1, min2);
                                SubLObject ans_max = min(max1, max2);
                                if (ans_max.numGE(ans_min)) {
                                    ans = com.cyc.cycjava.cycl.quantities.make_interval(unit1, ans_min, ans_max);
                                } else {
                                    relation_evaluation.throw_unevaluatable();
                                }
                            }
                        }
                    }
                }
                return arithmetic_answer(ans);
            }
        }
    }

    public static SubLObject cyc_min_range_internal(final SubLObject interval1, final SubLObject interval2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if ((NIL != extended_numbers.possibly_infinite_or_extended_number_p(interval1)) && (NIL != extended_numbers.possibly_infinite_or_extended_number_p(interval2))) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        if (NIL != extended_numbers.possibly_infinite_or_extended_numberE(interval1, interval2)) {
                            return arithmetic.arithmetic_answer(interval1);
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
            relation_evaluation.throw_unevaluatable();
        } else {
            thread.resetMultipleValues();
            final SubLObject unit1 = explode_interval(interval1);
            final SubLObject min1 = thread.secondMultipleValue();
            final SubLObject max1 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject unit2 = explode_interval(interval2);
            SubLObject min2 = thread.secondMultipleValue();
            SubLObject max2 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL == comparable_units(unit1, unit2)) {
                relation_evaluation.throw_unevaluatable();
            }
            thread.resetMultipleValues();
            final SubLObject new_min2 = convert_to_units(unit1, unit2, min2, max2);
            final SubLObject new_max2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            min2 = new_min2;
            max2 = new_max2;
            final SubLObject ans_min = extended_numbers.possibly_infinite_or_extended_number_max(list(min1, min2));
            final SubLObject ans_max = extended_numbers.possibly_infinite_or_extended_number_min(list(max1, max2));
            if (NIL != extended_numbers.possibly_infinite_or_extended_numberLE(ans_min, ans_max)) {
                ans = make_interval(unit1, ans_min, ans_max);
            } else {
                relation_evaluation.throw_unevaluatable();
            }
        }
        return arithmetic.arithmetic_answer(ans);
    }

    /**
     * evaluationDefn for #$MinQuantValueFn
     */
    @LispMethod(comment = "evaluationDefn for #$MinQuantValueFn")
    public static final SubLObject cyc_min_quant_value_alt(SubLObject interval) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (interval.isNumber()) {
                    ans = interval;
                } else {
                    thread.resetMultipleValues();
                    {
                        SubLObject unit = com.cyc.cycjava.cycl.quantities.explode_interval(interval);
                        SubLObject min = thread.secondMultipleValue();
                        SubLObject max = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        ans = com.cyc.cycjava.cycl.quantities.make_interval(unit, min, UNPROVIDED);
                    }
                }
                return arithmetic_answer(ans);
            }
        }
    }

    /**
     * evaluationDefn for #$MinQuantValueFn
     */
    @LispMethod(comment = "evaluationDefn for #$MinQuantValueFn")
    public static SubLObject cyc_min_quant_value(final SubLObject interval) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (interval.isNumber() || (NIL != collection_defns.fractionP(interval, UNPROVIDED))) {
            ans = interval;
        } else
            if (((NIL != collection_defns.cyc_fractional_measurable_quantity_simple_p(interval)) || (NIL != collection_defns.cyc_fractional_measurable_quantity_mixed_p(interval))) || (NIL != collection_defns.cyc_fractional_measurable_quantity_decimal_p(interval))) {
                ans = cycl_utilities.naut_arg1(interval, UNPROVIDED);
            } else {
                thread.resetMultipleValues();
                final SubLObject unit = explode_interval(interval);
                final SubLObject min = thread.secondMultipleValue();
                final SubLObject max = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                ans = make_interval(unit, min, UNPROVIDED);
            }

        return ans;
    }

    /**
     * evaluationDefn for #$MaxQuantValueFn
     */
    @LispMethod(comment = "evaluationDefn for #$MaxQuantValueFn")
    public static final SubLObject cyc_max_quant_value_alt(SubLObject interval) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (interval.isNumber()) {
                    ans = interval;
                } else {
                    thread.resetMultipleValues();
                    {
                        SubLObject unit = com.cyc.cycjava.cycl.quantities.explode_interval(interval);
                        SubLObject min = thread.secondMultipleValue();
                        SubLObject max = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        ans = com.cyc.cycjava.cycl.quantities.make_interval(unit, max, UNPROVIDED);
                    }
                }
                return arithmetic_answer(ans);
            }
        }
    }

    /**
     * evaluationDefn for #$MaxQuantValueFn
     */
    @LispMethod(comment = "evaluationDefn for #$MaxQuantValueFn")
    public static SubLObject cyc_max_quant_value(final SubLObject interval) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (interval.isNumber() || (NIL != collection_defns.fractionP(interval, UNPROVIDED))) {
            ans = interval;
        } else
            if (((NIL != collection_defns.cyc_fractional_measurable_quantity_simple_p(interval)) || (NIL != collection_defns.cyc_fractional_measurable_quantity_mixed_p(interval))) || (NIL != collection_defns.cyc_fractional_measurable_quantity_decimal_p(interval))) {
                ans = cycl_utilities.naut_arg1(interval, UNPROVIDED);
            } else {
                thread.resetMultipleValues();
                final SubLObject unit = explode_interval(interval);
                final SubLObject min = thread.secondMultipleValue();
                final SubLObject max = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                ans = make_interval(unit, max, UNPROVIDED);
            }

        return ans;
    }

    public static SubLObject cyc_quantity_unit(final SubLObject interval) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (interval.isNumber() || (NIL != collection_defns.fractionP(interval, UNPROVIDED))) {
            return $$Unity;
        }
        if (((NIL != collection_defns.cyc_fractional_measurable_quantity_simple_p(interval)) || (NIL != collection_defns.cyc_fractional_measurable_quantity_mixed_p(interval))) || (NIL != collection_defns.cyc_fractional_measurable_quantity_decimal_p(interval))) {
            return cycl_utilities.naut_functor(interval);
        }
        thread.resetMultipleValues();
        final SubLObject unit = explode_interval(interval);
        final SubLObject min = thread.secondMultipleValue();
        final SubLObject max = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return unit;
    }

    public static SubLObject cyc_quantity_measure(final SubLObject interval) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (interval.isNumber() || (NIL != collection_defns.fractionP(interval, UNPROVIDED))) {
            ans = interval;
        } else
            if (((NIL != collection_defns.cyc_fractional_measurable_quantity_simple_p(interval)) || (NIL != collection_defns.cyc_fractional_measurable_quantity_mixed_p(interval))) || (NIL != collection_defns.cyc_fractional_measurable_quantity_decimal_p(interval))) {
                ans = cycl_utilities.naut_arg1(interval, UNPROVIDED);
            } else {
                thread.resetMultipleValues();
                SubLObject unit = explode_interval(interval);
                final SubLObject min = thread.secondMultipleValue();
                final SubLObject max = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                unit = $$Unity;
                ans = make_interval($$Unity, min, max);
            }

        return arithmetic.arithmetic_answer(ans);
    }

    /**
     * evaluationDefn for #$ToleranceFn
     */
    @LispMethod(comment = "evaluationDefn for #$ToleranceFn")
    public static final SubLObject cyc_tolerance_alt(SubLObject interval, SubLObject fraction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (NIL != extended_numbers.extended_number_p(interval)) {
                    ans = com.cyc.cycjava.cycl.quantities.cyc_tolerance_internal(fraction, $$Unity, interval, interval, interval);
                } else {
                    thread.resetMultipleValues();
                    {
                        SubLObject unit = com.cyc.cycjava.cycl.quantities.explode_interval(interval);
                        SubLObject min = thread.secondMultipleValue();
                        SubLObject max = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject average = extended_numbers.extended_number_quotient(extended_numbers.extended_number_plus(min, max), TWO_INTEGER);
                            ans = com.cyc.cycjava.cycl.quantities.cyc_tolerance_internal(fraction, unit, min, average, max);
                        }
                    }
                }
                return arithmetic_answer(ans);
            }
        }
    }

    /**
     * evaluationDefn for #$ToleranceFn
     */
    @LispMethod(comment = "evaluationDefn for #$ToleranceFn")
    public static SubLObject cyc_tolerance(final SubLObject interval, final SubLObject fraction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != extended_numbers.extended_number_p(interval)) {
            ans = cyc_tolerance_internal(fraction, $$Unity, interval, interval, interval);
        } else {
            thread.resetMultipleValues();
            final SubLObject unit = explode_interval(interval);
            final SubLObject min = thread.secondMultipleValue();
            final SubLObject max = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject average = extended_numbers.extended_number_quotient(extended_numbers.extended_number_plus(min, max), TWO_INTEGER);
            ans = cyc_tolerance_internal(fraction, unit, min, average, max);
        }
        return arithmetic.arithmetic_answer(ans);
    }

    public static final SubLObject cyc_tolerance_internal_alt(SubLObject fraction, SubLObject unit, SubLObject min, SubLObject average, SubLObject max) {
        {
            SubLObject delta = extended_numbers.extended_number_abs(extended_numbers.extended_number_times(average, fraction));
            SubLObject ans_min = extended_numbers.extended_number_minus(min, delta);
            SubLObject ans_max = extended_numbers.extended_number_plus(max, delta);
            return com.cyc.cycjava.cycl.quantities.make_interval(unit, ans_min, ans_max);
        }
    }

    public static SubLObject cyc_tolerance_internal(final SubLObject fraction, final SubLObject unit, final SubLObject min, final SubLObject average, final SubLObject max) {
        final SubLObject delta = extended_numbers.extended_number_abs(extended_numbers.extended_number_times(average, fraction));
        final SubLObject ans_min = extended_numbers.extended_number_minus(min, delta);
        final SubLObject ans_max = extended_numbers.extended_number_plus(max, delta);
        return make_interval(unit, ans_min, ans_max);
    }

    /**
     * evaluationDefn for #$SignificantDigitsFn
     */
    @LispMethod(comment = "evaluationDefn for #$SignificantDigitsFn")
    public static final SubLObject cyc_significant_digits_alt(SubLObject digits, SubLObject interval) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            digits = com.cyc.cycjava.cycl.quantities.cycl_real_number_to_number(digits);
            if (NIL == subl_promotions.positive_integer_p(digits)) {
                relation_evaluation.throw_unevaluatable();
            }
            thread.resetMultipleValues();
            {
                SubLObject unit = com.cyc.cycjava.cycl.quantities.explode_interval(interval);
                SubLObject min = thread.secondMultipleValue();
                SubLObject max = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                min = significant_digits(min, digits);
                max = significant_digits(max, digits);
                {
                    SubLObject v_answer = com.cyc.cycjava.cycl.quantities.make_interval(unit, min, max);
                    return arithmetic_answer(v_answer);
                }
            }
        }
    }

    /**
     * evaluationDefn for #$SignificantDigitsFn
     */
    @LispMethod(comment = "evaluationDefn for #$SignificantDigitsFn")
    public static SubLObject cyc_significant_digits(SubLObject digits, final SubLObject interval) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    digits = cycl_real_number_to_number(digits);
                    if (NIL == subl_promotions.positive_integer_p(digits)) {
                        relation_evaluation.throw_unevaluatable();
                    }
                    thread.resetMultipleValues();
                    final SubLObject unit = explode_interval(interval);
                    SubLObject min = thread.secondMultipleValue();
                    SubLObject max = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    min = number_utilities.significant_digits(min, digits);
                    max = number_utilities.significant_digits(max, digits);
                    final SubLObject v_answer = make_interval(unit, min, max);
                    return v_answer;
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
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    /**
     * evaluationDefn for #$SineFn
     */
    @LispMethod(comment = "evaluationDefn for #$SineFn")
    public static final SubLObject cyc_sine_alt(SubLObject interval) {
        return com.cyc.cycjava.cycl.quantities.cyc_trig_internal(SIN, interval);
    }

    /**
     * evaluationDefn for #$SineFn
     */
    @LispMethod(comment = "evaluationDefn for #$SineFn")
    public static SubLObject cyc_sine(final SubLObject interval) {
        return cyc_trig_internal(SIN, interval);
    }

    /**
     * evaluationDefn for #$CosineFn
     */
    @LispMethod(comment = "evaluationDefn for #$CosineFn")
    public static final SubLObject cyc_cosine_alt(SubLObject interval) {
        return com.cyc.cycjava.cycl.quantities.cyc_trig_internal(COS, interval);
    }

    /**
     * evaluationDefn for #$CosineFn
     */
    @LispMethod(comment = "evaluationDefn for #$CosineFn")
    public static SubLObject cyc_cosine(final SubLObject interval) {
        return cyc_trig_internal(COS, interval);
    }

    /**
     * evaluationDefn for #$TangentFn
     */
    @LispMethod(comment = "evaluationDefn for #$TangentFn")
    public static final SubLObject cyc_tangent_alt(SubLObject interval) {
        return com.cyc.cycjava.cycl.quantities.cyc_trig_internal(TAN, interval);
    }

    /**
     * evaluationDefn for #$TangentFn
     */
    @LispMethod(comment = "evaluationDefn for #$TangentFn")
    public static SubLObject cyc_tangent(final SubLObject interval) {
        return cyc_trig_internal(TAN, interval);
    }

    /**
     * evaluationDefn for #$CosecantFn
     */
    @LispMethod(comment = "evaluationDefn for #$CosecantFn")
    public static final SubLObject cyc_cosecant_alt(SubLObject interval) {
        return com.cyc.cycjava.cycl.quantities.cyc_inverse(com.cyc.cycjava.cycl.quantities.cyc_sine(interval));
    }

    /**
     * evaluationDefn for #$CosecantFn
     */
    @LispMethod(comment = "evaluationDefn for #$CosecantFn")
    public static SubLObject cyc_cosecant(final SubLObject interval) {
        return cyc_inverse(cyc_sine(interval));
    }

    /**
     * evaluationDefn for #$SecantFn
     */
    @LispMethod(comment = "evaluationDefn for #$SecantFn")
    public static final SubLObject cyc_secant_alt(SubLObject interval) {
        return com.cyc.cycjava.cycl.quantities.cyc_inverse(com.cyc.cycjava.cycl.quantities.cyc_cosine(interval));
    }

    /**
     * evaluationDefn for #$SecantFn
     */
    @LispMethod(comment = "evaluationDefn for #$SecantFn")
    public static SubLObject cyc_secant(final SubLObject interval) {
        return cyc_inverse(cyc_cosine(interval));
    }

    /**
     * evaluationDefn for #$CotangentFn
     */
    @LispMethod(comment = "evaluationDefn for #$CotangentFn")
    public static final SubLObject cyc_cotangent_alt(SubLObject interval) {
        return com.cyc.cycjava.cycl.quantities.cyc_inverse(com.cyc.cycjava.cycl.quantities.cyc_tangent(interval));
    }

    /**
     * evaluationDefn for #$CotangentFn
     */
    @LispMethod(comment = "evaluationDefn for #$CotangentFn")
    public static SubLObject cyc_cotangent(final SubLObject interval) {
        return cyc_inverse(cyc_tangent(interval));
    }

    public static final SubLObject cyc_trig_internal_alt(SubLObject trig_func, SubLObject interval) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject unit = com.cyc.cycjava.cycl.quantities.explode_interval(com.cyc.cycjava.cycl.quantities.cyc_quantity_conversion($$Radian, interval));
                SubLObject min = thread.secondMultipleValue();
                SubLObject max = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (!min.numE(max)) {
                    relation_evaluation.throw_unevaluatable();
                }
                {
                    SubLObject result = funcall(trig_func, min);
                    return arithmetic_answer(result);
                }
            }
        }
    }

    public static SubLObject cyc_trig_internal(final SubLObject trig_func, final SubLObject interval) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject unit = explode_interval(cyc_quantity_conversion($$Radian, interval));
        final SubLObject min = thread.secondMultipleValue();
        final SubLObject max = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (!min.numE(max)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = funcall(trig_func, min);
        return arithmetic.arithmetic_answer(result);
    }

    /**
     * evaluationDefn for #$ArcSineFn
     */
    @LispMethod(comment = "evaluationDefn for #$ArcSineFn")
    public static final SubLObject cyc_arc_sine_alt(SubLObject number) {
        return com.cyc.cycjava.cycl.quantities.cyc_inverse_trig_internal(ASIN, number);
    }

    /**
     * evaluationDefn for #$ArcSineFn
     */
    @LispMethod(comment = "evaluationDefn for #$ArcSineFn")
    public static SubLObject cyc_arc_sine(final SubLObject number) {
        return cyc_inverse_trig_internal(ASIN, number);
    }

    /**
     * evaluationDefn for #$ArcCosineFn
     */
    @LispMethod(comment = "evaluationDefn for #$ArcCosineFn")
    public static final SubLObject cyc_arc_cosine_alt(SubLObject number) {
        return com.cyc.cycjava.cycl.quantities.cyc_inverse_trig_internal(ACOS, number);
    }

    /**
     * evaluationDefn for #$ArcCosineFn
     */
    @LispMethod(comment = "evaluationDefn for #$ArcCosineFn")
    public static SubLObject cyc_arc_cosine(final SubLObject number) {
        return cyc_inverse_trig_internal(ACOS, number);
    }

    /**
     * evaluationDefn for #$ArcTangentFn
     */
    @LispMethod(comment = "evaluationDefn for #$ArcTangentFn")
    public static final SubLObject cyc_arc_tangent_alt(SubLObject number) {
        return com.cyc.cycjava.cycl.quantities.cyc_inverse_trig_internal(ATAN, number);
    }

    /**
     * evaluationDefn for #$ArcTangentFn
     */
    @LispMethod(comment = "evaluationDefn for #$ArcTangentFn")
    public static SubLObject cyc_arc_tangent(final SubLObject number) {
        return cyc_inverse_trig_internal(ATAN, number);
    }

    /**
     * evaluationDefn for #$ArcCosecantFn
     */
    @LispMethod(comment = "evaluationDefn for #$ArcCosecantFn")
    public static final SubLObject cyc_arc_cosecant_alt(SubLObject number) {
        return com.cyc.cycjava.cycl.quantities.cyc_arc_sine(com.cyc.cycjava.cycl.quantities.cyc_inverse(number));
    }

    /**
     * evaluationDefn for #$ArcCosecantFn
     */
    @LispMethod(comment = "evaluationDefn for #$ArcCosecantFn")
    public static SubLObject cyc_arc_cosecant(final SubLObject number) {
        return cyc_arc_sine(cyc_inverse(number));
    }

    /**
     * evaluationDefn for #$ArcSecantFn
     */
    @LispMethod(comment = "evaluationDefn for #$ArcSecantFn")
    public static final SubLObject cyc_arc_secant_alt(SubLObject number) {
        return com.cyc.cycjava.cycl.quantities.cyc_arc_cosine(com.cyc.cycjava.cycl.quantities.cyc_inverse(number));
    }

    /**
     * evaluationDefn for #$ArcSecantFn
     */
    @LispMethod(comment = "evaluationDefn for #$ArcSecantFn")
    public static SubLObject cyc_arc_secant(final SubLObject number) {
        return cyc_arc_cosine(cyc_inverse(number));
    }

    /**
     * evaluationDefn for #$ArcCotangentFn
     */
    @LispMethod(comment = "evaluationDefn for #$ArcCotangentFn")
    public static final SubLObject cyc_arc_cotangent_alt(SubLObject number) {
        return com.cyc.cycjava.cycl.quantities.cyc_arc_tangent(com.cyc.cycjava.cycl.quantities.cyc_inverse(number));
    }

    /**
     * evaluationDefn for #$ArcCotangentFn
     */
    @LispMethod(comment = "evaluationDefn for #$ArcCotangentFn")
    public static SubLObject cyc_arc_cotangent(final SubLObject number) {
        return cyc_arc_tangent(cyc_inverse(number));
    }

    public static final SubLObject cyc_inverse_trig_internal_alt(SubLObject inverse_trig_func, SubLObject number) {
        {
            SubLObject error_message = NIL;
            SubLObject result = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            result = funcall(inverse_trig_func, number);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (NIL != error_message) {
                relation_evaluation.throw_unevaluatable();
            }
            {
                SubLObject ans = com.cyc.cycjava.cycl.quantities.make_interval($$Radian, result, result);
                return arithmetic_answer(ans);
            }
        }
    }

    public static SubLObject cyc_inverse_trig_internal(final SubLObject inverse_trig_func, final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = NIL;
        SubLObject result = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = funcall(inverse_trig_func, number);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject ans = make_interval($$Radian, result, result);
        return ans;
    }

    /**
     * evaluationDefn for #$LogarithmFn
     */
    @LispMethod(comment = "evaluationDefn for #$LogarithmFn")
    public static final SubLObject cyc_logarithm_alt(SubLObject number, SubLObject base) {
        number = com.cyc.cycjava.cycl.quantities.cycl_real_number_to_number(number);
        base = com.cyc.cycjava.cycl.quantities.cycl_real_number_to_number(base);
        if (!(((NIL != extended_numbers.extended_number_plus_p(number)) && (NIL != extended_numbers.extended_number_non_negative_p(base))) && (NIL == extended_numbers.extended_numberE(base, ONE_INTEGER, UNPROVIDED)))) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject result = NIL;
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            result = extended_numbers.extended_number_log(number, base);
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
            if (NIL == extended_numbers.extended_number_p(result)) {
                relation_evaluation.throw_unevaluatable();
            }
            return arithmetic_answer(result);
        }
    }

    /**
     * evaluationDefn for #$LogarithmFn
     */
    @LispMethod(comment = "evaluationDefn for #$LogarithmFn")
    public static SubLObject cyc_logarithm(SubLObject number, SubLObject base) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        number = cycl_real_number_to_number(number);
        base = cycl_real_number_to_number(base);
        if (((NIL == extended_numbers.possibly_infinite_or_extended_number_plus_p(number)) || (NIL == extended_numbers.extended_number_non_negative_p(base))) || (NIL != extended_numbers.extended_numberE(base, ONE_INTEGER, UNPROVIDED))) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = extended_numbers.possibly_infinite_or_extended_number_log(number, base);
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
        if (NIL == extended_numbers.possibly_infinite_or_extended_number_p(result)) {
            relation_evaluation.throw_unevaluatable();
        }
        return arithmetic.arithmetic_answer(result);
    }

    /**
     * evaluationDefn for #$ExponentFn
     */
    @LispMethod(comment = "evaluationDefn for #$ExponentFn")
    public static final SubLObject cyc_exponent_alt(SubLObject number, SubLObject exponent) {
        number = com.cyc.cycjava.cycl.quantities.cycl_real_number_to_number(number);
        exponent = com.cyc.cycjava.cycl.quantities.cycl_real_number_to_number(exponent);
        {
            SubLObject result = NIL;
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            result = extended_numbers.extended_number_expt(number, exponent);
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
            if (NIL == extended_numbers.extended_number_p(result)) {
                relation_evaluation.throw_unevaluatable();
            }
            return arithmetic_answer(result);
        }
    }

    /**
     * evaluationDefn for #$ExponentFn
     */
    @LispMethod(comment = "evaluationDefn for #$ExponentFn")
    public static SubLObject cyc_exponent(SubLObject number, SubLObject exponent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        number = cycl_real_number_to_number(number);
        exponent = cycl_real_number_to_number(exponent);
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = extended_numbers.possibly_infinite_or_extended_number_expt(number, exponent);
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
        if (NIL == extended_numbers.possibly_infinite_or_extended_number_p(result)) {
            relation_evaluation.throw_unevaluatable();
        }
        return arithmetic.arithmetic_answer(result);
    }

    /**
     * evaluationDefn for #$QuadraticSolution-PositiveFn
     * Provides the positive root of A*X^2 + BX + C
     */
    @LispMethod(comment = "evaluationDefn for #$QuadraticSolution-PositiveFn\r\nProvides the positive root of A*X^2 + BX + C\nevaluationDefn for #$QuadraticSolution-PositiveFn\nProvides the positive root of A*X^2 + BX + C")
    public static final SubLObject cyc_quadratic_solution_positive_alt(SubLObject arg_a, SubLObject arg_b, SubLObject arg_c) {
        arg_a = com.cyc.cycjava.cycl.quantities.cycl_real_number_to_number(arg_a);
        arg_b = com.cyc.cycjava.cycl.quantities.cycl_real_number_to_number(arg_b);
        arg_c = com.cyc.cycjava.cycl.quantities.cycl_real_number_to_number(arg_c);
        {
            SubLObject delta = extended_numbers.extended_number_minus(extended_numbers.extended_number_expt(arg_b, TWO_INTEGER), extended_numbers.extended_number_times(FOUR_INTEGER, extended_numbers.extended_number_times(arg_a, arg_c)));
            if ((NIL != extended_numbers.extended_number_zero_p(arg_a)) || (NIL != extended_numbers.extended_number_minus_p(delta))) {
                relation_evaluation.throw_unevaluatable();
            }
            return arithmetic_answer(extended_numbers.extended_number_quotient(extended_numbers.extended_number_plus(extended_numbers.extended_number_negate(arg_b), extended_numbers.extended_number_sqrt(delta)), extended_numbers.extended_number_times(TWO_INTEGER, arg_a)));
        }
    }

    /**
     * evaluationDefn for #$QuadraticSolution-PositiveFn
     * Provides the positive root of A*X^2 + BX + C
     */
    @LispMethod(comment = "evaluationDefn for #$QuadraticSolution-PositiveFn\r\nProvides the positive root of A*X^2 + BX + C\nevaluationDefn for #$QuadraticSolution-PositiveFn\nProvides the positive root of A*X^2 + BX + C")
    public static SubLObject cyc_quadratic_solution_positive(SubLObject arg_a, SubLObject arg_b, SubLObject arg_c) {
        arg_a = cycl_real_number_to_number(arg_a);
        arg_b = cycl_real_number_to_number(arg_b);
        arg_c = cycl_real_number_to_number(arg_c);
        final SubLObject delta = extended_numbers.extended_number_minus(extended_numbers.extended_number_expt(arg_b, TWO_INTEGER), extended_numbers.extended_number_times(FOUR_INTEGER, extended_numbers.extended_number_times(arg_a, arg_c)));
        if ((NIL != extended_numbers.extended_number_zero_p(arg_a)) || (NIL != extended_numbers.extended_number_minus_p(delta))) {
            relation_evaluation.throw_unevaluatable();
        }
        return arithmetic.arithmetic_answer(extended_numbers.extended_number_quotient(extended_numbers.extended_number_plus(extended_numbers.extended_number_negate(arg_b), extended_numbers.extended_number_sqrt(delta)), extended_numbers.extended_number_times(TWO_INTEGER, arg_a)));
    }

    /**
     * evaluationDefn for #$QuadraticSolution-NegativeFn
     * Provides the negative root of A*X^2 + BX + C
     */
    @LispMethod(comment = "evaluationDefn for #$QuadraticSolution-NegativeFn\r\nProvides the negative root of A*X^2 + BX + C\nevaluationDefn for #$QuadraticSolution-NegativeFn\nProvides the negative root of A*X^2 + BX + C")
    public static final SubLObject cyc_quadratic_solution_negative_alt(SubLObject arg_a, SubLObject arg_b, SubLObject arg_c) {
        arg_a = com.cyc.cycjava.cycl.quantities.cycl_real_number_to_number(arg_a);
        arg_b = com.cyc.cycjava.cycl.quantities.cycl_real_number_to_number(arg_b);
        arg_c = com.cyc.cycjava.cycl.quantities.cycl_real_number_to_number(arg_c);
        {
            SubLObject delta = extended_numbers.extended_number_minus(extended_numbers.extended_number_expt(arg_b, TWO_INTEGER), extended_numbers.extended_number_times(FOUR_INTEGER, extended_numbers.extended_number_times(arg_a, arg_c)));
            if ((NIL != extended_numbers.extended_number_zero_p(arg_a)) || (NIL != extended_numbers.extended_number_minus_p(delta))) {
                relation_evaluation.throw_unevaluatable();
            }
            return arithmetic_answer(extended_numbers.extended_number_quotient(extended_numbers.extended_number_minus(extended_numbers.extended_number_negate(arg_b), extended_numbers.extended_number_sqrt(delta)), extended_numbers.extended_number_times(TWO_INTEGER, arg_a)));
        }
    }

    /**
     * evaluationDefn for #$QuadraticSolution-NegativeFn
     * Provides the negative root of A*X^2 + BX + C
     */
    @LispMethod(comment = "evaluationDefn for #$QuadraticSolution-NegativeFn\r\nProvides the negative root of A*X^2 + BX + C\nevaluationDefn for #$QuadraticSolution-NegativeFn\nProvides the negative root of A*X^2 + BX + C")
    public static SubLObject cyc_quadratic_solution_negative(SubLObject arg_a, SubLObject arg_b, SubLObject arg_c) {
        arg_a = cycl_real_number_to_number(arg_a);
        arg_b = cycl_real_number_to_number(arg_b);
        arg_c = cycl_real_number_to_number(arg_c);
        final SubLObject delta = extended_numbers.extended_number_minus(extended_numbers.extended_number_expt(arg_b, TWO_INTEGER), extended_numbers.extended_number_times(FOUR_INTEGER, extended_numbers.extended_number_times(arg_a, arg_c)));
        if ((NIL != extended_numbers.extended_number_zero_p(arg_a)) || (NIL != extended_numbers.extended_number_minus_p(delta))) {
            relation_evaluation.throw_unevaluatable();
        }
        return arithmetic.arithmetic_answer(extended_numbers.extended_number_quotient(extended_numbers.extended_number_minus(extended_numbers.extended_number_negate(arg_b), extended_numbers.extended_number_sqrt(delta)), extended_numbers.extended_number_times(TWO_INTEGER, arg_a)));
    }

    public static final SubLObject cyc_collection_subsumption_paths_alt(SubLObject el_set) {
        if (NIL == el_set_p(el_set)) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject cols = com.cyc.cycjava.cycl.quantities.evaluate_set_elements(el_set, $HL);
            SubLObject paths = collection_subsumption_paths(cols);
            SubLObject el_paths = Mapping.mapcar(MAKE_EL_LIST, paths);
            return make_el_set(el_paths, UNPROVIDED);
        }
    }

    public static SubLObject cyc_collection_subsumption_paths(final SubLObject el_set) {
        if (NIL == el_set_p(el_set)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject cols = evaluate_set_elements(el_set, $HL);
        final SubLObject paths = kb_utilities.collection_subsumption_paths(cols);
        final SubLObject el_paths = Mapping.mapcar(MAKE_EL_LIST, paths);
        return make_el_set(el_paths, UNPROVIDED);
    }

    public static final SubLObject cyc_predicate_subsumption_paths_alt(SubLObject el_set) {
        if (NIL == el_set_p(el_set)) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject preds = com.cyc.cycjava.cycl.quantities.evaluate_set_elements(el_set, $HL);
            SubLObject paths = predicate_subsumption_paths(preds);
            SubLObject el_paths = Mapping.mapcar(MAKE_EL_LIST, paths);
            return make_el_set(el_paths, UNPROVIDED);
        }
    }

    public static SubLObject cyc_predicate_subsumption_paths(final SubLObject el_set) {
        if (NIL == el_set_p(el_set)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject preds = evaluate_set_elements(el_set, $HL);
        final SubLObject paths = kb_utilities.predicate_subsumption_paths(preds);
        final SubLObject el_paths = Mapping.mapcar(MAKE_EL_LIST, paths);
        return make_el_set(el_paths, UNPROVIDED);
    }

    /**
     * Cyc-Quant extension for #$lessThan
     */
    @LispMethod(comment = "Cyc-Quant extension for #$lessThan")
    public static final SubLObject cyc_less_than_quantities_alt(SubLObject interval1, SubLObject interval2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != extended_numbers.extended_number_p(interval1)) && (NIL != extended_numbers.extended_number_p(interval2))) {
                return extended_numbers.extended_numberL(interval1, interval2, UNPROVIDED);
            }
            if ((((NIL != forts.fort_p(interval1)) && (NIL != forts.fort_p(interval2))) && (NIL != isa.isa_in_any_mtP(interval1, $$ScalarInterval))) && (NIL != isa.isa_in_any_mtP(interval2, $$ScalarInterval))) {
                if (NIL != equals.equalsP(interval1, interval2, UNPROVIDED, UNPROVIDED)) {
                    return NIL;
                }
                if (NIL != com.cyc.cycjava.cycl.quantities.following_valueP(interval1, interval2, UNPROVIDED)) {
                    return T;
                }
                if (NIL != com.cyc.cycjava.cycl.quantities.following_valueP(interval2, interval1, UNPROVIDED)) {
                    return NIL;
                }
            }
            thread.resetMultipleValues();
            {
                SubLObject unit1 = com.cyc.cycjava.cycl.quantities.explode_interval(interval1);
                SubLObject min1 = thread.secondMultipleValue();
                SubLObject max1 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject unit2 = com.cyc.cycjava.cycl.quantities.explode_interval(interval2);
                    SubLObject min2 = thread.secondMultipleValue();
                    SubLObject max2 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == com.cyc.cycjava.cycl.quantities.comparable_units(unit1, unit2)) {
                        relation_evaluation.throw_unevaluatable();
                    }
                    min2 = com.cyc.cycjava.cycl.quantities.convert_to_units(unit1, unit2, min2, UNPROVIDED);
                    return extended_numbers.extended_numberL(max1, min2, UNPROVIDED);
                }
            }
        }
    }

    /**
     * Cyc-Quant extension for #$lessThan
     */
    @LispMethod(comment = "Cyc-Quant extension for #$lessThan")
    public static SubLObject cyc_less_than_quantities(final SubLObject interval1, final SubLObject interval2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != extended_numbers.extended_number_p(interval1)) && (NIL != extended_numbers.extended_number_p(interval2))) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        return extended_numbers.extended_numberL(interval1, interval2, UNPROVIDED);
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
            relation_evaluation.throw_unevaluatable();
        }
        if ((((NIL != forts.fort_p(interval1)) && (NIL != forts.fort_p(interval2))) && (NIL != isa.isa_in_any_mtP(interval1, $$ScalarInterval))) && (NIL != isa.isa_in_any_mtP(interval2, $$ScalarInterval))) {
            if (NIL != equals.equalsP(interval1, interval2, UNPROVIDED, UNPROVIDED)) {
                return NIL;
            }
            if (NIL != following_valueP(interval1, interval2, UNPROVIDED)) {
                return T;
            }
            if (NIL != following_valueP(interval2, interval1, UNPROVIDED)) {
                return NIL;
            }
            if (NIL != kb_mapping_utilities.gaf_trueP(list($$greaterThan, interval2, interval1))) {
                return T;
            }
        }
        thread.resetMultipleValues();
        final SubLObject unit1 = explode_interval(interval1);
        final SubLObject min1 = thread.secondMultipleValue();
        SubLObject max1 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject unit2 = explode_interval(interval2);
        SubLObject min2 = thread.secondMultipleValue();
        final SubLObject max2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL == comparable_units(unit1, unit2)) {
            relation_evaluation.throw_unevaluatable();
        }
        if (NIL != collection_defns.fractionP(min2, UNPROVIDED)) {
            min2 = convert_fraction_to_real_number(min2);
        }
        if (NIL != collection_defns.fractionP(max1, UNPROVIDED)) {
            max1 = convert_fraction_to_real_number(max1);
        }
        min2 = convert_to_units(unit1, unit2, min2, UNPROVIDED);
        return extended_numbers.possibly_infinite_or_extended_numberL(max1, min2);
    }

    public static SubLObject negate_fraction(final SubLObject fraction) {
        assert NIL != collection_defns.fractionP(fraction, UNPROVIDED) : "! collection_defns.fractionP(fraction, .UNPROVIDED) " + ("collection_defns.fractionP(fraction, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != collection_defns.fractionP(fraction, CommonSymbols.UNPROVIDED) ") + fraction;
        if ((NIL != collection_defns.simple_fractionP(fraction, UNPROVIDED)) || (NIL != collection_defns.decimal_fractionP(fraction, UNPROVIDED))) {
            return replace_formula_arg(ONE_INTEGER, arithmetic.cyc_minus(cycl_utilities.nat_arg1(fraction, UNPROVIDED)), fraction);
        }
        if (NIL != collection_defns.mixed_fractionP(fraction, UNPROVIDED)) {
            return make_el_formula($$NegativeMixedFractionFn, cycl_utilities.nat_args(fraction, UNPROVIDED), UNPROVIDED);
        }
        if (NIL != collection_defns.negative_mixed_fractionP(fraction, UNPROVIDED)) {
            return make_el_formula($$MixedFractionFn, cycl_utilities.nat_args(fraction, UNPROVIDED), UNPROVIDED);
        }
        Errors.error($str111$Can_t_negate__S, fraction);
        return NIL;
    }

    public static final SubLObject following_valueP_alt(SubLObject small_attribute, SubLObject big_attribute, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return removal_modules_transitivity.inference_transitivity_check($$followingValue, small_attribute, big_attribute, mt, UNPROVIDED);
    }

    public static SubLObject following_valueP(final SubLObject small_attribute, final SubLObject big_attribute, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return removal_modules_transitivity.inference_transitivity_check($$followingValue, small_attribute, big_attribute, mt, UNPROVIDED);
    }

    public static SubLObject convert_fraction_to_real_number(final SubLObject fractional_number) {
        if (NIL != collection_defns.simple_fractionP(fractional_number, UNPROVIDED)) {
            return divide(cycl_utilities.naut_arg1(fractional_number, UNPROVIDED), cycl_utilities.naut_arg2(fractional_number, UNPROVIDED));
        }
        if (NIL != collection_defns.mixed_fractionP(fractional_number, UNPROVIDED)) {
            return add(cycl_utilities.naut_arg1(fractional_number, UNPROVIDED), divide(cycl_utilities.naut_arg2(fractional_number, UNPROVIDED), cycl_utilities.nat_arg3(fractional_number, UNPROVIDED)));
        }
        if (NIL != collection_defns.negative_mixed_fractionP(fractional_number, UNPROVIDED)) {
            return minus(add(cycl_utilities.naut_arg1(fractional_number, UNPROVIDED), divide(cycl_utilities.naut_arg2(fractional_number, UNPROVIDED), cycl_utilities.nat_arg3(fractional_number, UNPROVIDED))));
        }
        if (NIL != collection_defns.decimal_fractionP(fractional_number, UNPROVIDED)) {
            return divide(cycl_utilities.naut_arg1(fractional_number, UNPROVIDED), expt(TEN_INTEGER, cycl_utilities.naut_arg2(fractional_number, UNPROVIDED)));
        }
        return fractional_number;
    }

    public static SubLObject convert_fraction_to_simple_fraction(final SubLObject fractional_number) {
        if (NIL != collection_defns.simple_fractionP(fractional_number, UNPROVIDED)) {
            return fractional_number;
        }
        if (NIL != collection_defns.mixed_fractionP(fractional_number, UNPROVIDED)) {
            return convert_mixed_fraction_to_simple_fraction(fractional_number);
        }
        if (NIL != collection_defns.negative_mixed_fractionP(fractional_number, UNPROVIDED)) {
            return convert_negative_mixed_fraction_to_simple_fraction(fractional_number);
        }
        if (NIL != collection_defns.decimal_fractionP(fractional_number, UNPROVIDED)) {
            return convert_decimal_fraction_to_simple_fraction(fractional_number);
        }
        return fractional_number;
    }

    public static SubLObject convert_mixed_fraction_to_simple_fraction(final SubLObject mixed_fraction) {
        if (NIL != collection_defns.mixed_fractionP(mixed_fraction, UNPROVIDED)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.nat_args(mixed_fraction, UNPROVIDED);
            SubLObject whole = NIL;
            SubLObject numerator = NIL;
            SubLObject denominator = NIL;
            destructuring_bind_must_consp(current, datum, $list113);
            whole = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list113);
            numerator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list113);
            denominator = current.first();
            current = current.rest();
            if (NIL == current) {
                return convert_mixed_fraction_to_simple_fraction_internal(whole, numerator, denominator);
            }
            cdestructuring_bind_error(datum, $list113);
        } else {
            relation_evaluation.throw_unevaluatable();
        }
        return NIL;
    }

    public static SubLObject convert_negative_mixed_fraction_to_simple_fraction(final SubLObject negative_mixed_fraction) {
        if (NIL != collection_defns.negative_mixed_fractionP(negative_mixed_fraction, UNPROVIDED)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.nat_args(negative_mixed_fraction, UNPROVIDED);
            SubLObject whole = NIL;
            SubLObject numerator = NIL;
            SubLObject denominator = NIL;
            destructuring_bind_must_consp(current, datum, $list113);
            whole = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list113);
            numerator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list113);
            denominator = current.first();
            current = current.rest();
            if (NIL == current) {
                return convert_mixed_fraction_to_simple_fraction_internal(minus(whole), minus(numerator), denominator);
            }
            cdestructuring_bind_error(datum, $list113);
        } else {
            relation_evaluation.throw_unevaluatable();
        }
        return NIL;
    }

    public static SubLObject convert_simple_fraction_to_mixed_fraction(final SubLObject simple_fraction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != collection_defns.simple_fractionP(simple_fraction, UNPROVIDED)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.nat_args(simple_fraction, UNPROVIDED);
            SubLObject numerator = NIL;
            SubLObject denominator = NIL;
            destructuring_bind_must_consp(current, datum, $list114);
            numerator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list114);
            denominator = current.first();
            current = current.rest();
            if (NIL == current) {
                thread.resetMultipleValues();
                final SubLObject quotient = truncate(numerator, denominator);
                final SubLObject remainder = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject fn = (multiply(numerator, denominator).isNegative()) ? $$NegativeMixedFractionFn : $$MixedFractionFn;
                return make_ternary_formula(fn, abs(quotient), abs(remainder), abs(denominator));
            }
            cdestructuring_bind_error(datum, $list114);
        } else {
            relation_evaluation.throw_unevaluatable();
        }
        return NIL;
    }

    public static SubLObject convert_simple_fraction_to_fraction(final SubLObject simple_fraction) {
        assert NIL != collection_defns.simple_fractionP(simple_fraction, UNPROVIDED) : "! collection_defns.simple_fractionP(simple_fraction, .UNPROVIDED) " + ("collection_defns.simple_fractionP(simple_fraction, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != collection_defns.simple_fractionP(simple_fraction, CommonSymbols.UNPROVIDED) ") + simple_fraction;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.nat_args(simple_fraction, UNPROVIDED);
        SubLObject numerator = NIL;
        SubLObject denominator = NIL;
        destructuring_bind_must_consp(current, datum, $list114);
        numerator = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list114);
        denominator = current.first();
        current = current.rest();
        if (NIL == current) {
            return fraction_utilities.new_fraction(numerator, denominator);
        }
        cdestructuring_bind_error(datum, $list114);
        return NIL;
    }

    public static SubLObject convert_mixed_fraction_to_simple_fraction_internal(final SubLObject whole, final SubLObject numerator, final SubLObject denominator) {
        return make_binary_formula($$SimpleFractionFn, add(numerator, multiply(whole, denominator)), denominator);
    }

    public static SubLObject convert_decimal_fraction_to_simple_fraction(final SubLObject decimal_fraction) {
        if ((NIL != collection_defns.decimal_fractionP(decimal_fraction, UNPROVIDED)) && length(decimal_fraction).numE(THREE_INTEGER)) {
            return make_el_formula($$SimpleFractionFn, list(cycl_utilities.naut_arg1(decimal_fraction, UNPROVIDED), expt(TEN_INTEGER, cycl_utilities.naut_arg2(decimal_fraction, UNPROVIDED))), UNPROVIDED);
        }
        if ((NIL != collection_defns.decimal_fractionP(decimal_fraction, UNPROVIDED)) && length(decimal_fraction).numE(FOUR_INTEGER)) {
            return make_el_formula($$SimpleFractionFn, list(subtract(cycl_utilities.naut_arg1(decimal_fraction, UNPROVIDED), floor(divide(cycl_utilities.naut_arg1(decimal_fraction, UNPROVIDED), expt(TEN_INTEGER, cycl_utilities.nat_arg3(decimal_fraction, UNPROVIDED))), UNPROVIDED)), subtract(expt(TEN_INTEGER, cycl_utilities.naut_arg2(decimal_fraction, UNPROVIDED)), expt(TEN_INTEGER, subtract(cycl_utilities.naut_arg2(decimal_fraction, UNPROVIDED), cycl_utilities.nat_arg3(decimal_fraction, UNPROVIDED))))), UNPROVIDED);
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    public static SubLObject fractionsL(final SubLObject fraction1, final SubLObject fraction2) {
        final SubLObject lcd_fractions = normalize_fractions(convert_fraction_to_simple_fraction(fraction1), convert_fraction_to_simple_fraction(fraction2));
        return numL(cycl_utilities.naut_arg1(lcd_fractions.first(), UNPROVIDED), cycl_utilities.naut_arg1(second(lcd_fractions), UNPROVIDED));
    }

    public static SubLObject fractionsLE(final SubLObject fraction1, final SubLObject fraction2) {
        final SubLObject lcd_fractions = normalize_fractions(convert_fraction_to_simple_fraction(fraction1), convert_fraction_to_simple_fraction(fraction2));
        return numLE(cycl_utilities.naut_arg1(lcd_fractions.first(), UNPROVIDED), cycl_utilities.naut_arg1(second(lcd_fractions), UNPROVIDED));
    }

    public static SubLObject normalize_fractions(final SubLObject fraction1, final SubLObject fraction2) {
        if ((NIL != collection_defns.simple_fractionP(fraction1, UNPROVIDED)) && (NIL != collection_defns.simple_fractionP(fraction2, UNPROVIDED))) {
            final SubLObject common_denominator = number_utilities.lcm(list(cycl_utilities.naut_arg2(fraction1, UNPROVIDED), cycl_utilities.naut_arg2(fraction2, UNPROVIDED)));
            final SubLObject fraction_multiple_1 = divide(common_denominator, cycl_utilities.naut_arg2(fraction1, UNPROVIDED));
            final SubLObject fraction_multiple_2 = divide(common_denominator, cycl_utilities.naut_arg2(fraction2, UNPROVIDED));
            return list(make_el_formula($$SimpleFractionFn, list(multiply(fraction_multiple_1, cycl_utilities.naut_arg1(fraction1, UNPROVIDED)), common_denominator), UNPROVIDED), make_el_formula($$SimpleFractionFn, list(multiply(fraction_multiple_2, cycl_utilities.naut_arg1(fraction2, UNPROVIDED)), common_denominator), UNPROVIDED));
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    /**
     * Cyc-Quant extension for #$lessThanOrEqualTo
     */
    @LispMethod(comment = "Cyc-Quant extension for #$lessThanOrEqualTo")
    public static final SubLObject cyc_less_than_or_equal_to_quantities_alt(SubLObject interval1, SubLObject interval2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != extended_numbers.extended_number_p(interval1)) && (NIL != extended_numbers.extended_number_p(interval2))) {
                return extended_numbers.extended_numberLE(interval1, interval2, UNPROVIDED);
            }
            if ((((NIL != forts.fort_p(interval1)) && (NIL != forts.fort_p(interval2))) && (NIL != isa.isa_in_any_mtP(interval1, $$ScalarInterval))) && (NIL != isa.isa_in_any_mtP(interval2, $$ScalarInterval))) {
                if (NIL != equals.equalsP(interval1, interval2, UNPROVIDED, UNPROVIDED)) {
                    return T;
                }
                if (NIL != com.cyc.cycjava.cycl.quantities.following_valueP(interval1, interval2, UNPROVIDED)) {
                    return T;
                }
                if (NIL != com.cyc.cycjava.cycl.quantities.following_valueP(interval2, interval1, UNPROVIDED)) {
                    return NIL;
                }
            }
            thread.resetMultipleValues();
            {
                SubLObject unit1 = com.cyc.cycjava.cycl.quantities.explode_interval(interval1);
                SubLObject min1 = thread.secondMultipleValue();
                SubLObject max1 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject unit2 = com.cyc.cycjava.cycl.quantities.explode_interval(interval2);
                    SubLObject min2 = thread.secondMultipleValue();
                    SubLObject max2 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == com.cyc.cycjava.cycl.quantities.comparable_units(unit1, unit2)) {
                        relation_evaluation.throw_unevaluatable();
                    }
                    min2 = com.cyc.cycjava.cycl.quantities.convert_to_units(unit1, unit2, min2, UNPROVIDED);
                    return extended_numbers.extended_numberLE(max1, min2, UNPROVIDED);
                }
            }
        }
    }

    /**
     * Cyc-Quant extension for #$lessThanOrEqualTo
     */
    @LispMethod(comment = "Cyc-Quant extension for #$lessThanOrEqualTo")
    public static SubLObject cyc_less_than_or_equal_to_quantities(final SubLObject interval1, final SubLObject interval2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != extended_numbers.extended_number_p(interval1)) && (NIL != extended_numbers.extended_number_p(interval2))) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        return extended_numbers.extended_numberLE(interval1, interval2, UNPROVIDED);
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
            relation_evaluation.throw_unevaluatable();
        }
        if ((((NIL != forts.fort_p(interval1)) && (NIL != forts.fort_p(interval2))) && (NIL != isa.isa_in_any_mtP(interval1, $$ScalarInterval))) && (NIL != isa.isa_in_any_mtP(interval2, $$ScalarInterval))) {
            if (NIL != equals.equalsP(interval1, interval2, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
            if (NIL != following_valueP(interval1, interval2, UNPROVIDED)) {
                return T;
            }
            if (NIL != following_valueP(interval2, interval1, UNPROVIDED)) {
                return NIL;
            }
            if (NIL != kb_mapping_utilities.gaf_trueP(list($$greaterThanOrEqualTo, interval2, interval1))) {
                return T;
            }
            if (NIL != kb_mapping_utilities.gaf_trueP(list($$greaterThan, interval2, interval1))) {
                return T;
            }
        }
        if ((NIL != collection_defns.fractionP(interval1, UNPROVIDED)) && (NIL != collection_defns.fractionP(interval2, UNPROVIDED))) {
            return fractionsLE(interval1, interval2);
        }
        thread.resetMultipleValues();
        final SubLObject unit1 = explode_interval(interval1);
        final SubLObject min1 = thread.secondMultipleValue();
        final SubLObject max1 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject unit2 = explode_interval(interval2);
        SubLObject min2 = thread.secondMultipleValue();
        final SubLObject max2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL == comparable_units(unit1, unit2)) {
            relation_evaluation.throw_unevaluatable();
        }
        min2 = convert_to_units(unit1, unit2, min2, UNPROVIDED);
        return extended_numbers.possibly_infinite_or_extended_numberLE(max1, min2);
    }

    public static final SubLObject cyc_quantity_subsumes_alt(SubLObject interval1, SubLObject interval2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != com.cyc.cycjava.cycl.quantities.cyc_scalar_interval_p(interval1)) && (NIL != com.cyc.cycjava.cycl.quantities.cyc_scalar_interval_p(interval2)))) {
                relation_evaluation.throw_unevaluatable();
            }
            {
                SubLObject successP = NIL;
                if (interval1.isNumber() && interval2.isNumber()) {
                    successP = numE(interval1, interval2);
                } else {
                    if ((NIL != forts.fort_p(interval1)) && (NIL != forts.fort_p(interval2))) {
                        successP = equals.equalsP(interval2, interval1, UNPROVIDED, UNPROVIDED);
                        if (NIL == successP) {
                            {
                                SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
                                try {
                                    gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
                                    successP = gt_methods.gt_booleanP($$quantitySubsumes, interval1, interval2, UNPROVIDED);
                                } finally {
                                    gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (NIL == successP) {
                                successP = com.cyc.cycjava.cycl.quantities.cyc_quantity_subsumes_proper_intervals(interval1, interval2);
                            }
                        }
                    } else {
                        successP = com.cyc.cycjava.cycl.quantities.cyc_quantity_subsumes_proper_intervals(interval1, interval2);
                    }
                }
                return successP;
            }
        }
    }

    public static SubLObject cyc_quantity_subsumes(final SubLObject interval1, final SubLObject interval2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (interval1.isNumber() && interval2.isNumber()) {
            return numE(interval1, interval2);
        }
        if ((((NIL != forts.fort_p(interval1)) && (NIL != forts.fort_p(interval2))) && (NIL != isa.isa_in_any_mtP(interval1, $$ScalarInterval))) && (NIL != isa.isa_in_any_mtP(interval1, $$ScalarInterval))) {
            if (NIL != equals.equalsP(interval2, interval1, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
            SubLObject successP = NIL;
            final SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
            try {
                gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
                successP = gt_methods.gt_booleanP($$quantitySubsumes, interval1, interval2, UNPROVIDED);
            } finally {
                gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0, thread);
            }
            if (NIL != successP) {
                return T;
            }
        }
        return cyc_quantity_subsumes_proper_intervals(interval1, interval2);
    }

    public static final SubLObject cyc_quantity_subsumes_proper_intervals_alt(SubLObject interval1, SubLObject interval2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject unit1 = com.cyc.cycjava.cycl.quantities.explode_interval(interval1);
                SubLObject min1 = thread.secondMultipleValue();
                SubLObject max1 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject unit2 = com.cyc.cycjava.cycl.quantities.explode_interval(interval2);
                    SubLObject min2 = thread.secondMultipleValue();
                    SubLObject max2 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == com.cyc.cycjava.cycl.quantities.comparable_units(unit1, unit2)) {
                        relation_evaluation.throw_unevaluatable();
                    }
                    min2 = com.cyc.cycjava.cycl.quantities.convert_to_units(unit1, unit2, min2, UNPROVIDED);
                    max2 = com.cyc.cycjava.cycl.quantities.convert_to_units(unit1, unit2, max2, UNPROVIDED);
                    return makeBoolean(min1.numLE(min2) && max1.numGE(max2));
                }
            }
        }
    }

    public static SubLObject cyc_quantity_subsumes_proper_intervals(final SubLObject interval1, final SubLObject interval2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject unit1 = explode_interval(interval1);
        final SubLObject min1 = thread.secondMultipleValue();
        final SubLObject max1 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject unit2 = explode_interval(interval2);
        SubLObject min2 = thread.secondMultipleValue();
        SubLObject max2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL == comparable_units(unit1, unit2)) {
            relation_evaluation.throw_unevaluatable();
        }
        min2 = convert_to_units(unit1, unit2, min2, UNPROVIDED);
        max2 = convert_to_units(unit1, unit2, max2, UNPROVIDED);
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    return makeBoolean((NIL != extended_numbers.possibly_infinite_or_extended_numberLE(min1, min2)) && (NIL != extended_numbers.possibly_infinite_or_extended_numberLE(max2, max1)));
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
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    public static final SubLObject cyc_quantity_intersects_alt(SubLObject interval1, SubLObject interval2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (interval1.isNumber() && interval2.isNumber()) {
                return numE(interval1, interval2);
            }
            if ((((NIL != forts.fort_p(interval1)) && (NIL != forts.fort_p(interval2))) && (NIL != isa.isa_in_any_mtP(interval1, $$ScalarInterval))) && (NIL != isa.isa_in_any_mtP(interval1, $$ScalarInterval))) {
                if (NIL != equals.equalsP(interval2, interval1, UNPROVIDED, UNPROVIDED)) {
                    return T;
                }
            }
            thread.resetMultipleValues();
            {
                SubLObject unit1 = com.cyc.cycjava.cycl.quantities.explode_interval(interval1);
                SubLObject min1 = thread.secondMultipleValue();
                SubLObject max1 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject unit2 = com.cyc.cycjava.cycl.quantities.explode_interval(interval2);
                    SubLObject min2 = thread.secondMultipleValue();
                    SubLObject max2 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == com.cyc.cycjava.cycl.quantities.comparable_units(unit1, unit2)) {
                        relation_evaluation.throw_unevaluatable();
                    }
                    min2 = com.cyc.cycjava.cycl.quantities.convert_to_units(unit1, unit2, min2, UNPROVIDED);
                    max2 = com.cyc.cycjava.cycl.quantities.convert_to_units(unit1, unit2, max2, UNPROVIDED);
                    return makeBoolean(min1.numLE(max2) && min2.numLE(max1));
                }
            }
        }
    }

    public static SubLObject cyc_quantity_intersects(final SubLObject interval1, final SubLObject interval2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (interval1.isNumber() && interval2.isNumber()) {
            return numE(interval1, interval2);
        }
        if ((((NIL != forts.fort_p(interval1)) && (NIL != forts.fort_p(interval2))) && (NIL != isa.isa_in_any_mtP(interval1, $$ScalarInterval))) && (NIL != isa.isa_in_any_mtP(interval1, $$ScalarInterval))) {
            if (NIL != equals.equalsP(interval2, interval1, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
            SubLObject successP = NIL;
            final SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
            try {
                gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
                successP = gt_methods.gt_booleanP($$quantityIntersects, interval1, interval2, UNPROVIDED);
            } finally {
                gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0, thread);
            }
            if (NIL != successP) {
                return T;
            }
        }
        return cyc_quantity_intersects_proper_intervals(interval1, interval2);
    }

    public static SubLObject cyc_quantity_intersects_proper_intervals(final SubLObject interval1, final SubLObject interval2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject unit1 = explode_interval(interval1);
        final SubLObject min1 = thread.secondMultipleValue();
        final SubLObject max1 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject unit2 = explode_interval(interval2);
        SubLObject min2 = thread.secondMultipleValue();
        SubLObject max2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL == comparable_units(unit1, unit2)) {
            relation_evaluation.throw_unevaluatable();
        }
        min2 = convert_to_units(unit1, unit2, min2, UNPROVIDED);
        max2 = convert_to_units(unit1, unit2, max2, UNPROVIDED);
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    return makeBoolean((NIL != extended_numbers.possibly_infinite_or_extended_numberLE(min1, max2)) && (NIL != extended_numbers.possibly_infinite_or_extended_numberLE(min2, max1)));
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
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(new SubLObject[]{ reader_make_constant_shell("IntervalMinFn"), reader_make_constant_shell("IntervalMaxFn"), reader_make_constant_shell("Unity"), reader_make_constant_shell("UnitOfMeasure"), reader_make_constant_shell("maxQuantValue"), reader_make_constant_shell("minQuantValue"), reader_make_constant_shell("unitMultiplicationFactor"), reader_make_constant_shell("multiplicationUnits"), reader_make_constant_shell("PerFn"), reader_make_constant_shell("TheSet"), reader_make_constant_shell("TheSetOf"), reader_make_constant_shell("thereExistAtLeast"), reader_make_constant_shell("thereExistAtMost"), reader_make_constant_shell("thereExistExactly") });

    public static SubLObject cyc_divides_evenly(final SubLObject interval1, final SubLObject interval2) {
        final SubLObject quotient = cyc_round_closest(cyc_quotient(interval2, interval1));
        if (NIL != extended_numbers.extended_number_integer_p(cyc_quantity_measure(quotient))) {
            final SubLObject product = arithmetic.cyc_times_internal(quotient, interval1);
            return arithmetic.cyc_numerically_equal(product, interval2);
        }
        return NIL;
    }

    static private final SubLString $str_alt4$A_KB_dependent_numerical_quantifi = makeString("A KB-dependent numerical quantification function was called, but the current Cyc KB does not contain knowledge about numerical quantification.");

    public static final SubLObject cyc_list_nth_alt(SubLObject el_list, SubLObject n) {
        if (!((NIL != el_non_empty_list_p(el_list)) && n.isInteger())) {
            relation_evaluation.throw_unevaluatable();
        }
        if (!n.isPositive()) {
            relation_evaluation.throw_unevaluatable();
        }
        n = subtract(n, ONE_INTEGER);
        {
            SubLObject list = el_list_items(el_list);
            if (n.numGE(length(list))) {
                relation_evaluation.throw_unevaluatable();
            }
            return nth(n, list);
        }
    }

    public static SubLObject cyc_list_nth(final SubLObject el_list, SubLObject n) {
        if ((NIL == el_non_empty_list_p(el_list)) || (!n.isInteger())) {
            relation_evaluation.throw_unevaluatable();
        }
        if (!n.isPositive()) {
            relation_evaluation.throw_unevaluatable();
        }
        n = subtract(n, ONE_INTEGER);
        final SubLObject list = el_list_items(el_list);
        if (n.numGE(length(list))) {
            relation_evaluation.throw_unevaluatable();
        }
        return nth(n, list);
    }

    public static final SubLObject cyc_list_concatenate_alt(SubLObject args) {
        if (NIL == list_utilities.every_in_list(symbol_function(EL_LIST_P), args, UNPROVIDED)) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_el_list(apply(symbol_function(APPEND), Mapping.mapcar(symbol_function(EL_LIST_ITEMS), args)), UNPROVIDED);
    }

    public static SubLObject cyc_list_concatenate(final SubLObject args) {
        if (NIL == list_utilities.every_in_list(symbol_function(EL_LIST_P), args, UNPROVIDED)) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_el_list(apply(symbol_function(APPEND), Mapping.mapcar(symbol_function(EL_LIST_ITEMS), args)), UNPROVIDED);
    }

    public static final SubLSymbol $kw11$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt12 = list(makeSymbol("ARG1-UNIT"), makeSymbol("ARG2-UNIT"), makeSymbol("RAW-FACTOR"));

    public static SubLObject cyc_append_to_list(final SubLObject item, final SubLObject list) {
        if (NIL == el_list_p(list)) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_el_list(list_utilities.snoc(item, el_list_items(list)), UNPROVIDED);
    }

    static private final SubLString $str_alt16$Link_not_found_ = makeString("Link not found!");

    static private final SubLList $list_alt17 = list(makeSymbol("IGNORE"), makeSymbol("PREVIOUS-UNIT"), makeSymbol("FACTOR"));

    public static SubLObject cyc_prepend_to_list(final SubLObject item, final SubLObject list) {
        if (NIL == el_list_p(list)) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_el_list(cons(item, el_list_items(list)), UNPROVIDED);
    }

    static private final SubLString $str_alt18$No_previous_unit_ = makeString("No previous unit.");

    public static final SubLObject cyc_list_first_alt(SubLObject el_list) {
        if (NIL == el_non_empty_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        return el_list_items(el_list).first();
    }

    public static SubLObject cyc_list_first(final SubLObject el_list) {
        if (NIL == el_non_empty_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        return el_list_items(el_list).first();
    }

    public static SubLObject cyc_list_second(final SubLObject el_list) {
        if (NIL == el_non_empty_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject items = el_list_items(el_list);
        if (NIL == list_utilities.lengthGE(items, TWO_INTEGER, UNPROVIDED)) {
            relation_evaluation.throw_unevaluatable();
        }
        return second(items);
    }

    public static final SubLObject cyc_list_rest_alt(SubLObject el_list) {
        if (NIL == el_non_empty_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_el_list(el_list_items(el_list).rest(), UNPROVIDED);
    }

    public static SubLObject cyc_list_rest(final SubLObject el_list) {
        if (NIL == el_non_empty_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_el_list(el_list_items(el_list).rest(), UNPROVIDED);
    }

    static private final SubLSymbol $sym27$FUZZY_NUMBER_ = makeSymbol("FUZZY-NUMBER?");

    public static final SubLObject cyc_list_last_alt(SubLObject el_list) {
        if (NIL == el_non_empty_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        return last(el_list_items(el_list), UNPROVIDED).first();
    }

    public static SubLObject cyc_list_last(final SubLObject el_list) {
        if (NIL == el_non_empty_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        return last(el_list_items(el_list), UNPROVIDED).first();
    }

    public static final SubLObject cyc_list_subseq_alt(SubLObject el_list, SubLObject start, SubLObject end) {
        if (!(((NIL != el_list_p(el_list)) && start.isInteger()) && end.isInteger())) {
            relation_evaluation.throw_unevaluatable();
        }
        if (((!start.isPositive()) || (!end.isPositive())) || end.numL(start)) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject list = el_list_items(el_list);
            SubLObject length = length(list);
            if (start.numG(length) || end.numG(length)) {
                relation_evaluation.throw_unevaluatable();
            }
            start = subtract(start, ONE_INTEGER);
            return make_el_list(subseq(list, start, end), UNPROVIDED);
        }
    }

    public static SubLObject cyc_list_subseq(final SubLObject el_list, SubLObject start, final SubLObject end) {
        if (((NIL == el_list_p(el_list)) || (!start.isInteger())) || (!end.isInteger())) {
            relation_evaluation.throw_unevaluatable();
        }
        if (((!start.isPositive()) || (!end.isPositive())) || end.numL(start)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject list = el_list_items(el_list);
        final SubLObject length = length(list);
        if (start.numG(length) || end.numG(length)) {
            relation_evaluation.throw_unevaluatable();
        }
        start = subtract(start, ONE_INTEGER);
        return make_el_list(subseq(list, start, end), UNPROVIDED);
    }

    public static SubLObject cyc_list_subseq_up_to(final SubLObject el_list, SubLObject start, final SubLObject end) {
        if (((NIL == el_list_p(el_list)) || (!start.isInteger())) || (!end.isInteger())) {
            relation_evaluation.throw_unevaluatable();
        }
        if (el_list.eql($$TheEmptyList)) {
            return $$TheEmptyList;
        }
        if (((!start.isPositive()) || (!end.isPositive())) || end.numL(start)) {
            return $$TheEmptyList;
        }
        final SubLObject list = el_list_items(el_list);
        final SubLObject length = length(list);
        final SubLObject end_mod = min(end, length);
        if (start.numG(length)) {
            relation_evaluation.throw_unevaluatable();
        }
        start = subtract(start, ONE_INTEGER);
        return make_el_list(subseq(list, start, end_mod), UNPROVIDED);
    }

    static private final SubLList $list_alt43 = list(makeSymbol("MIN"), makeSymbol("&OPTIONAL"), list(makeSymbol("MAX"), makeSymbol("MIN")));

    public static final SubLObject cyc_list_search_alt(SubLObject el_sublist, SubLObject el_list) {
        if (!((NIL != el_list_p(el_sublist)) && (NIL != el_list_p(el_list)))) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject sublist = el_list_items(el_sublist);
            SubLObject list = el_list_items(el_list);
            SubLObject positions = NIL;
            if (NIL == sublist) {
                {
                    SubLObject cdotimes_end_var = length(list);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        positions = cons(add(i, ONE_INTEGER), positions);
                    }
                }
            } else {
                {
                    SubLObject position = NIL;
                    for (position = search(sublist, list, symbol_function(EQUAL), symbol_function(IDENTITY), ZERO_INTEGER, NIL, ZERO_INTEGER, NIL); NIL != position; position = search(sublist, list, symbol_function(EQUAL), symbol_function(IDENTITY), ZERO_INTEGER, NIL, add(position, ONE_INTEGER), NIL)) {
                        positions = cons(add(position, ONE_INTEGER), positions);
                    }
                }
            }
            return make_el_list(nreverse(positions), UNPROVIDED);
        }
    }

    public static SubLObject cyc_list_search(final SubLObject el_sublist, final SubLObject el_list) {
        if ((NIL == el_list_p(el_sublist)) || (NIL == el_list_p(el_list))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject sublist = el_list_items(el_sublist);
        final SubLObject list = el_list_items(el_list);
        SubLObject positions = NIL;
        if (NIL == sublist) {
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = length(list), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                positions = cons(add(i, ONE_INTEGER), positions);
            }
        } else {
            SubLObject position;
            for (position = NIL, position = search(sublist, list, symbol_function(EQUAL), symbol_function(IDENTITY), ZERO_INTEGER, NIL, ZERO_INTEGER, NIL); NIL != position; position = search(sublist, list, symbol_function(EQUAL), symbol_function(IDENTITY), ZERO_INTEGER, NIL, add(position, ONE_INTEGER), NIL)) {
                positions = cons(add(position, ONE_INTEGER), positions);
            }
        }
        return make_el_list(nreverse(positions), UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$PositionOfItemInListFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$PositionOfItemInListFn")
    public static final SubLObject cyc_position_alt(SubLObject item, SubLObject el_list) {
        if (NIL == el_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject list = el_list_items(el_list);
            SubLObject position = position(item, list, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (!position.isInteger()) {
                relation_evaluation.throw_unevaluatable();
            }
            return arithmetic_answer(add(position, ONE_INTEGER));
        }
    }

    /**
     * #$evaluationDefn for #$PositionOfItemInListFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$PositionOfItemInListFn")
    public static SubLObject cyc_position(final SubLObject item, final SubLObject el_list) {
        if (NIL == el_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject list = el_list_items(el_list);
        final SubLObject position = position(item, list, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (!position.isInteger()) {
            relation_evaluation.throw_unevaluatable();
        }
        return arithmetic.arithmetic_answer(add(position, ONE_INTEGER));
    }

    public static final SubLObject cyc_list_length_alt(SubLObject el_list) {
        if (NIL == el_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        return length(el_list_items(el_list));
    }

    public static SubLObject cyc_list_length(final SubLObject el_list) {
        if (NIL == el_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        return length(el_list_items(el_list));
    }

    public static final SubLObject cyc_list_reverse_alt(SubLObject el_list) {
        if (NIL == el_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_el_list(reverse(el_list_items(el_list)), UNPROVIDED);
    }

    public static SubLObject cyc_list_reverse(final SubLObject el_list) {
        if (NIL == el_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_el_list(reverse(el_list_items(el_list)), UNPROVIDED);
    }

    public static final SubLObject cyc_list_member_set_alt(SubLObject el_list) {
        if (NIL == el_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject list = el_list_items(el_list);
            SubLObject v_set = nreverse(delete_duplicates(reverse(list), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
            return bq_cons($$TheSet, append(v_set, NIL));
        }
    }

    public static SubLObject cyc_list_member_set(final SubLObject el_list) {
        if (NIL == el_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject list = el_list_items(el_list);
        return make_hl_extensional_set(list);
    }

    public static SubLObject cyc_set_element_list(final SubLObject el_set) {
        if (NIL == el_set_or_collection_p(el_set)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject items = evaluate_set_elements(el_set, $HL);
        return make_el_list(items, UNPROVIDED);
    }

    /**
     * (SubstituteFromListFn EXP (TheList (TheList NEW1 OLD1) ... (TheList NEWN OLDN)))
     * returns a CycLFormula which is derived from EXP by substituting NEW1 for OLD1, NEW2 for OLD2,
     * and so on for each pair that is an element of the second argument.
     */
    @LispMethod(comment = "(SubstituteFromListFn EXP (TheList (TheList NEW1 OLD1) ... (TheList NEWN OLDN)))\r\nreturns a CycLFormula which is derived from EXP by substituting NEW1 for OLD1, NEW2 for OLD2,\r\nand so on for each pair that is an element of the second argument.\n(SubstituteFromListFn EXP (TheList (TheList NEW1 OLD1) ... (TheList NEWN OLDN)))\nreturns a CycLFormula which is derived from EXP by substituting NEW1 for OLD1, NEW2 for OLD2,\nand so on for each pair that is an element of the second argument.")
    public static final SubLObject cyc_substitute_from_list_alt(SubLObject expr, SubLObject el_list) {
        if (NIL == el_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject el_pairs = el_list_items(el_list);
            if (NIL == list_utilities.every_in_list(EL_LIST_P, el_pairs, UNPROVIDED)) {
                relation_evaluation.throw_unevaluatable();
            }
            {
                SubLObject doubleton_list = Mapping.mapcar(EL_LIST_ITEMS, el_pairs);
                if (NIL == list_utilities.every_in_list($sym110$DOUBLETON_, doubleton_list, UNPROVIDED)) {
                    relation_evaluation.throw_unevaluatable();
                }
                {
                    SubLObject alist = Mapping.mapcar(DOUBLETON_TO_CONS, doubleton_list);
                    SubLObject new_expr = cycl_utilities.expression_sublis(list_utilities.flip_alist(alist), expr, symbol_function(EQUAL), UNPROVIDED);
                    return new_expr;
                }
            }
        }
    }

    /**
     * (SubstituteFromListFn EXP (TheList (TheList NEW1 OLD1) ... (TheList NEWN OLDN)))
     * returns a CycLFormula which is derived from EXP by substituting NEW1 for OLD1, NEW2 for OLD2,
     * and so on for each pair that is an element of the second argument.
     */
    @LispMethod(comment = "(SubstituteFromListFn EXP (TheList (TheList NEW1 OLD1) ... (TheList NEWN OLDN)))\r\nreturns a CycLFormula which is derived from EXP by substituting NEW1 for OLD1, NEW2 for OLD2,\r\nand so on for each pair that is an element of the second argument.\n(SubstituteFromListFn EXP (TheList (TheList NEW1 OLD1) ... (TheList NEWN OLDN)))\nreturns a CycLFormula which is derived from EXP by substituting NEW1 for OLD1, NEW2 for OLD2,\nand so on for each pair that is an element of the second argument.")
    public static SubLObject cyc_substitute_from_list(final SubLObject expr, final SubLObject el_list) {
        if (NIL == el_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject el_pairs = el_list_items(el_list);
        if (NIL == list_utilities.every_in_list(EL_LIST_P, el_pairs, UNPROVIDED)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject doubleton_list = Mapping.mapcar(EL_LIST_ITEMS, el_pairs);
        if (NIL == list_utilities.every_in_list($sym142$DOUBLETON_, doubleton_list, UNPROVIDED)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject alist = Mapping.mapcar(DOUBLETON_TO_CONS, doubleton_list);
        final SubLObject new_expr = cycl_utilities.expression_sublis(list_utilities.flip_alist(alist), expr, symbol_function(EQUAL), UNPROVIDED);
        return new_expr;
    }

    /**
     * (a b) -> (a . b)
     */
    @LispMethod(comment = "(a b) -> (a . b)")
    public static final SubLObject doubleton_to_cons_alt(SubLObject doubleton) {
        {
            SubLObject datum = doubleton;
            SubLObject current = datum;
            SubLObject a = NIL;
            SubLObject b = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt113);
            a = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt113);
            b = current.first();
            current = current.rest();
            if (NIL == current) {
                return cons(a, b);
            } else {
                cdestructuring_bind_error(datum, $list_alt113);
            }
        }
        return NIL;
    }

    /**
     * (a b) -> (a . b)
     */
    @LispMethod(comment = "(a b) -> (a . b)")
    public static SubLObject doubleton_to_cons(final SubLObject doubleton) {
        SubLObject a = NIL;
        SubLObject b = NIL;
        destructuring_bind_must_consp(doubleton, doubleton, $list145);
        a = doubleton.first();
        SubLObject current = doubleton.rest();
        destructuring_bind_must_consp(current, doubleton, $list145);
        b = current.first();
        current = current.rest();
        if (NIL == current) {
            return cons(a, b);
        }
        cdestructuring_bind_error(doubleton, $list145);
        return NIL;
    }

    public static SubLObject cyc_substitute_from_the_term_binding_set(final SubLObject expr, final SubLObject el_set) {
        if (NIL == el_set_p(el_set)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject binding_set = bindings.inferencify_kb_binding_set(el_set);
        if (NIL == bindings.binding_list_p(binding_set)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject new_expr = cycl_utilities.expression_sublis(binding_set, expr, symbol_function(EQUAL), UNPROVIDED);
        return new_expr;
    }

    static private final SubLSymbol $sym110$DOUBLETON_ = makeSymbol("DOUBLETON?");

    public static SubLObject cyc_remove_adjacent_duplicates_from_list_fn(final SubLObject el_list) {
        if (NIL == el_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_el_list(list_utilities.remove_duplicates_sorted(el_list_items(el_list), UNPROVIDED), UNPROVIDED);
    }

    static private final SubLList $list_alt113 = list(makeSymbol("A"), makeSymbol("B"));

    public static final SubLObject cyc_map_function_over_list_alt(SubLObject function, SubLObject el_list) {
        if (NIL == el_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject elements = el_list_items(el_list);
            SubLObject v_answer = com.cyc.cycjava.cycl.quantities.cyc_map_function_int(function, elements);
            if (NIL == v_answer) {
                relation_evaluation.throw_unevaluatable();
            }
            return make_el_list(v_answer, UNPROVIDED);
        }
    }

    public static SubLObject cyc_map_function_over_list(final SubLObject function, final SubLObject el_list) {
        if (NIL == el_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject elements = el_list_items(el_list);
        final SubLObject v_answer = cyc_map_function_int(function, elements);
        if (NIL == v_answer) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_el_list(v_answer, UNPROVIDED);
    }

    static private final SubLSymbol $sym118$CYC_LIST_MEMBER_ = makeSymbol("CYC-LIST-MEMBER?");

    static private final SubLSymbol $sym119$CYC_LIST_CONTAINS_MEMBER_ = makeSymbol("CYC-LIST-CONTAINS-MEMBER?");

    static private final SubLList $list_alt120 = list(makeSymbol("CYC-LIST-MEMBER?"));

    static private final SubLSymbol $sym121$CYC_SUBLIST_ = makeSymbol("CYC-SUBLIST?");

    static private final SubLSymbol $sym122$CYC_INITIAL_SUBLIST_ = makeSymbol("CYC-INITIAL-SUBLIST?");

    static private final SubLString $str_alt124$Don_t_know_how_to_determine_the_e = makeString("Don't know how to determine the extent of ~S in ~S");

    public static final SubLObject cyc_map_function_int_alt(SubLObject function, SubLObject list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                SubLObject cdolist_list_var = list;
                SubLObject element = NIL;
                for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject element_result = relation_evaluation.cyc_evaluate(list(function, element));
                        SubLObject valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == valid) {
                            relation_evaluation.throw_unevaluatable();
                        } else {
                            v_answer = cons(element_result, v_answer);
                        }
                    }
                }
                return nreverse(v_answer);
            }
        }
    }

    public static SubLObject cyc_map_function_int(final SubLObject function, final SubLObject list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = list;
        SubLObject element = NIL;
        element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject element_result = relation_evaluation.cyc_evaluate(list(function, element));
            final SubLObject valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == valid) {
                relation_evaluation.throw_unevaluatable();
            } else {
                v_answer = cons(element_result, v_answer);
            }
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        } 
        return nreverse(v_answer);
    }

    public static SubLObject cyc_map_function_over_list_until(final SubLObject function, final SubLObject el_list, final SubLObject until_function) {
        if (NIL == el_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject elements = el_list_items(el_list);
        final SubLObject v_answer = cyc_map_function_until_int(function, elements, until_function);
        if (NIL == v_answer) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_el_list(v_answer, UNPROVIDED);
    }

    public static SubLObject cyc_map_function_until_int(final SubLObject function, final SubLObject list, final SubLObject until_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        SubLObject until_satisfiedP = NIL;
        if (NIL == until_satisfiedP) {
            SubLObject csome_list_var = list;
            SubLObject element = NIL;
            element = csome_list_var.first();
            while ((NIL == until_satisfiedP) && (NIL != csome_list_var)) {
                thread.resetMultipleValues();
                final SubLObject element_result = relation_evaluation.cyc_evaluate(list(function, element));
                final SubLObject valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == valid) {
                    relation_evaluation.throw_unevaluatable();
                } else {
                    v_answer = cons(element_result, v_answer);
                }
                final SubLObject tuples = ask_utilities.kappa_tuples(NIL, list(until_function, element), inference_worker.mt_of_currently_executing_tactic(), UNPROVIDED);
                if (NIL != tuples) {
                    until_satisfiedP = T;
                }
                csome_list_var = csome_list_var.rest();
                element = csome_list_var.first();
            } 
        }
        return nreverse(v_answer);
    }

    public static SubLObject cyc_map_function_over_list_until_result(final SubLObject function, final SubLObject el_list, final SubLObject until_function) {
        if (NIL == el_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject elements = el_list_items(el_list);
        final SubLObject v_answer = cyc_map_function_until_result_int(function, elements, until_function);
        if (NIL == v_answer) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_el_list(v_answer, UNPROVIDED);
    }

    public static SubLObject cyc_map_function_until_result_int(final SubLObject function, final SubLObject list, final SubLObject until_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        SubLObject until_satisfiedP = NIL;
        if (NIL == until_satisfiedP) {
            SubLObject csome_list_var = list;
            SubLObject element = NIL;
            element = csome_list_var.first();
            while ((NIL == until_satisfiedP) && (NIL != csome_list_var)) {
                thread.resetMultipleValues();
                final SubLObject element_result = relation_evaluation.cyc_evaluate(list(function, element));
                final SubLObject valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == valid) {
                    relation_evaluation.throw_unevaluatable();
                } else {
                    v_answer = cons(element_result, v_answer);
                }
                final SubLObject tuples = ask_utilities.kappa_tuples(NIL, list(until_function, element_result), inference_worker.mt_of_currently_executing_tactic(), UNPROVIDED);
                if (NIL != tuples) {
                    until_satisfiedP = T;
                }
                csome_list_var = csome_list_var.rest();
                element = csome_list_var.first();
            } 
        }
        return nreverse(v_answer);
    }

    public static final SubLObject cyc_map_function_with_args_over_lists_alt(SubLObject function, SubLObject const_indices, SubLObject const_args, SubLObject var_indices, SubLObject var_arg_lists) {
        if (!(((((NIL != el_list_p(const_indices)) && (NIL != el_list_p(const_args))) && (NIL != el_list_p(var_indices))) && (NIL != el_list_p(var_arg_lists))) && (NIL != list_utilities.every_in_list(EL_LIST_P, el_list_items(var_arg_lists), UNPROVIDED)))) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject ci = el_list_items(const_indices);
            SubLObject ca = el_list_items(const_args);
            SubLObject vi = el_list_items(var_indices);
            SubLObject va = Mapping.mapcar(EL_LIST_ITEMS, el_list_items(var_arg_lists));
            if (!((((((NIL != list_utilities.list_of_type_p(symbol_function(NON_NEGATIVE_INTEGER_P), ci)) && (NIL != list_utilities.list_of_type_p(symbol_function(NON_NEGATIVE_INTEGER_P), vi))) && (NIL != list_utilities.same_length_p(ci, ca))) && (NIL != list_utilities.same_length_p(vi, va))) && (NIL == keyhash_utilities.fast_intersection(ci, vi, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != list_utilities.same_lengths_p(va)))) {
                relation_evaluation.throw_unevaluatable();
            }
            {
                SubLObject results = com.cyc.cycjava.cycl.quantities.cyc_map_function_with_args_over_lists_int(function, ci, ca, vi, va);
                return make_el_list(results, UNPROVIDED);
            }
        }
    }

    public static SubLObject cyc_map_function_with_args_over_lists(final SubLObject function, final SubLObject const_indices, final SubLObject const_args, final SubLObject var_indices, final SubLObject var_arg_lists) {
        if (((((NIL == el_list_p(const_indices)) || (NIL == el_list_p(const_args))) || (NIL == el_list_p(var_indices))) || (NIL == el_list_p(var_arg_lists))) || (NIL == list_utilities.every_in_list(EL_LIST_P, el_list_items(var_arg_lists), UNPROVIDED))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject ci = el_list_items(const_indices);
        final SubLObject ca = el_list_items(const_args);
        final SubLObject vi = el_list_items(var_indices);
        final SubLObject va = Mapping.mapcar(EL_LIST_ITEMS, el_list_items(var_arg_lists));
        if ((((((NIL == list_utilities.list_of_type_p(symbol_function(NON_NEGATIVE_INTEGER_P), ci)) || (NIL == list_utilities.list_of_type_p(symbol_function(NON_NEGATIVE_INTEGER_P), vi))) || (NIL == list_utilities.same_length_p(ci, ca))) || (NIL == list_utilities.same_length_p(vi, va))) || (NIL != keyhash_utilities.fast_intersection(ci, vi, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL == list_utilities.same_lengths_p(va))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject results = cyc_map_function_with_args_over_lists_int(function, ci, ca, vi, va);
        return make_el_list(results, UNPROVIDED);
    }

    public static final SubLObject cyc_map_function_with_args_over_lists_int_alt(SubLObject function, SubLObject const_indices, SubLObject const_args, SubLObject var_indices, SubLObject var_arg_lists) {
        {
            SubLObject v_arity = f_1X(apply(symbol_function(MAX), append(const_indices, var_indices)));
            SubLObject args = make_list(v_arity, NIL);
            SubLObject length = length(var_arg_lists.first());
            SubLObject results = NIL;
            SubLObject const_index = NIL;
            SubLObject const_index_21 = NIL;
            SubLObject const_arg = NIL;
            SubLObject const_arg_22 = NIL;
            for (const_index = const_indices, const_index_21 = const_index.first(), const_arg = const_args, const_arg_22 = const_arg.first(); !((NIL == const_arg) && (NIL == const_index)); const_index = const_index.rest() , const_index_21 = const_index.first() , const_arg = const_arg.rest() , const_arg_22 = const_arg.first()) {
                set_nth(const_index_21, args, const_arg_22);
            }
            {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
                    {
                        SubLObject temp_args = copy_list(args);
                        SubLObject var_index = NIL;
                        SubLObject var_index_23 = NIL;
                        SubLObject var_arg_list = NIL;
                        SubLObject var_arg_list_24 = NIL;
                        for (var_index = var_indices, var_index_23 = var_index.first(), var_arg_list = var_arg_lists, var_arg_list_24 = var_arg_list.first(); !((NIL == var_arg_list) && (NIL == var_index)); var_index = var_index.rest() , var_index_23 = var_index.first() , var_arg_list = var_arg_list.rest() , var_arg_list_24 = var_arg_list.first()) {
                            set_nth(var_index_23, temp_args, nth(i, var_arg_list_24));
                        }
                        results = cons(relation_evaluation.cyc_evaluate(cons(function, temp_args)), results);
                    }
                }
            }
            return nreverse(results);
        }
    }

    public static SubLObject cyc_map_function_with_args_over_lists_int(final SubLObject function, final SubLObject const_indices, final SubLObject const_args, final SubLObject var_indices, final SubLObject var_arg_lists) {
        final SubLObject v_arity = number_utilities.f_1X(apply(symbol_function(MAX), append(const_indices, var_indices)));
        final SubLObject args = make_list(v_arity, NIL);
        final SubLObject length = length(var_arg_lists.first());
        SubLObject results = NIL;
        SubLObject const_index = NIL;
        SubLObject const_index_$29 = NIL;
        SubLObject const_arg = NIL;
        SubLObject const_arg_$30 = NIL;
        const_index = const_indices;
        const_index_$29 = const_index.first();
        const_arg = const_args;
        const_arg_$30 = const_arg.first();
        while ((NIL != const_arg) || (NIL != const_index)) {
            set_nth(const_index_$29, args, const_arg_$30);
            const_index = const_index.rest();
            const_index_$29 = const_index.first();
            const_arg = const_arg.rest();
            const_arg_$30 = const_arg.first();
        } 
        SubLObject i;
        SubLObject temp_args;
        SubLObject var_index;
        SubLObject var_index_$31;
        SubLObject var_arg_list;
        SubLObject var_arg_list_$32;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
            temp_args = copy_list(args);
            var_index = NIL;
            var_index_$31 = NIL;
            var_arg_list = NIL;
            var_arg_list_$32 = NIL;
            var_index = var_indices;
            var_index_$31 = var_index.first();
            var_arg_list = var_arg_lists;
            var_arg_list_$32 = var_arg_list.first();
            while ((NIL != var_arg_list) || (NIL != var_index)) {
                set_nth(var_index_$31, temp_args, nth(i, var_arg_list_$32));
                var_index = var_index.rest();
                var_index_$31 = var_index.first();
                var_arg_list = var_arg_list.rest();
                var_arg_list_$32 = var_arg_list.first();
            } 
            results = cons(relation_evaluation.cyc_evaluate(cons(function, temp_args)), results);
        }
        return nreverse(results);
    }

    public static SubLObject cyc_apply_function_recursively(final SubLObject args, final SubLObject seed, final SubLObject fn) {
        if ((NIL == el_list_p(args)) || (NIL == relation_evaluation.evaluatable_functionP(fn))) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject val = seed;
        SubLObject cdolist_list_var = el_list_items(args);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            val = relation_evaluation.cyc_evaluate(make_binary_formula(fn, arg, val));
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return val;
    }

    /**
     * #$evaluationDefn for #$listMembers
     */
    @LispMethod(comment = "#$evaluationDefn for #$listMembers")
    public static final SubLObject cyc_list_memberP_alt(SubLObject el_list, SubLObject obj) {
        if (NIL == el_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        return subl_promotions.memberP(obj, el_list_items(el_list), symbol_function(EQUAL), UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$listMembers
     */
    @LispMethod(comment = "#$evaluationDefn for #$listMembers")
    public static SubLObject cyc_list_memberP(final SubLObject el_list, final SubLObject obj) {
        if (NIL == el_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        return subl_promotions.memberP(obj, el_list_items(el_list), symbol_function(EQUAL), UNPROVIDED);
    }

    public static final SubLObject cyc_list_contains_memberP_alt(SubLObject el_list, SubLObject obj) {
        return com.cyc.cycjava.cycl.quantities.cyc_list_memberP(el_list, obj);
    }

    public static SubLObject cyc_list_contains_memberP(final SubLObject el_list, final SubLObject obj) {
        return cyc_list_memberP(el_list, obj);
    }

    public static final SubLObject cyc_sublistP_alt(SubLObject el_list, SubLObject el_list_sub) {
        if (!((NIL != el_list_p(el_list)) && (NIL != el_list_p(el_list_sub)))) {
            relation_evaluation.throw_unevaluatable();
        }
        return search(el_list_items(el_list_sub), el_list_items(el_list), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cyc_sublistP(final SubLObject el_list, final SubLObject el_list_sub) {
        if ((NIL == el_list_p(el_list)) || (NIL == el_list_p(el_list_sub))) {
            relation_evaluation.throw_unevaluatable();
        }
        return search(el_list_items(el_list_sub), el_list_items(el_list), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cyc_initial_sublistP_alt(SubLObject list, SubLObject sub) {
        if (!(list.isList() && sub.isList())) {
            relation_evaluation.throw_unevaluatable();
        }
        if (length(sub).numG(length(list))) {
            return NIL;
        } else {
            {
                SubLObject mismatchP = NIL;
                SubLObject l = NIL;
                SubLObject s = NIL;
                for (l = list, s = sub; !((NIL != mismatchP) || (NIL == s)); l = l.rest() , s = s.rest()) {
                    if (!s.first().equalp(l.first())) {
                        mismatchP = T;
                    }
                }
                return makeBoolean(NIL == mismatchP);
            }
        }
    }

    public static SubLObject cyc_initial_sublistP(final SubLObject list, final SubLObject sub) {
        if ((!list.isList()) || (!sub.isList())) {
            relation_evaluation.throw_unevaluatable();
        }
        if (length(sub).numG(length(list))) {
            return NIL;
        }
        SubLObject mismatchP = NIL;
        SubLObject l = NIL;
        SubLObject s = NIL;
        l = list;
        for (s = sub; (NIL == mismatchP) && (NIL != s); s = s.rest()) {
            if (!s.first().equalp(l.first())) {
                mismatchP = T;
            }
            l = l.rest();
        }
        return makeBoolean(NIL == mismatchP);
    }

    public static final SubLObject cyc_non_empty_set_p_alt(SubLObject v_object) {
        return el_non_empty_set_p(v_object);
    }

    public static SubLObject cyc_non_empty_set_p(final SubLObject v_object) {
        return el_non_empty_set_p(v_object);
    }

    public static final SubLObject cyc_empty_set_p_alt(SubLObject v_object) {
        return el_empty_set_p(v_object);
    }

    public static SubLObject cyc_empty_set_p(final SubLObject v_object) {
        return el_empty_set_p(v_object);
    }

    public static final SubLObject cyc_set_p_alt(SubLObject v_object) {
        return el_set_p(v_object);
    }

    public static SubLObject cyc_set_p(final SubLObject v_object) {
        return el_set_p(v_object);
    }

    public static final SubLObject extensional_set_p_alt(SubLObject v_object) {
        return el_extensional_set_p(v_object);
    }

    public static SubLObject extensional_set_p(final SubLObject v_object) {
        return el_extensional_set_p(v_object);
    }

    public static final SubLObject intensional_set_p_alt(SubLObject v_object) {
        return el_intensional_set_p(v_object);
    }

    public static SubLObject intensional_set_p(final SubLObject v_object) {
        return el_intensional_set_p(v_object);
    }

    public static final SubLObject make_hl_extensional_set_alt(SubLObject objects) {
        return canonicalize_fn_term_if_reified(make_el_extensional_set(objects));
    }

    public static SubLObject make_hl_extensional_set(final SubLObject objects) {
        return czer_main.canonicalize_fn_term_if_reified(make_el_extensional_set(objects));
    }

    public static final SubLObject evaluate_set_elements_alt(SubLObject v_set, SubLObject answer_language) {
        if (answer_language == UNPROVIDED) {
            answer_language = $EL;
        }
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str_alt4$A_KB_dependent_numerical_quantifi);
        }
        if ((NIL != forts.fort_p(v_set)) && (NIL != fort_types_interface.collectionP(v_set))) {
            return isa.all_fort_instances(v_set, UNPROVIDED, UNPROVIDED);
        } else {
            if (NIL != com.cyc.cycjava.cycl.quantities.extensional_set_p(v_set)) {
                return extensional_set_elements(v_set);
            } else {
                if (NIL != com.cyc.cycjava.cycl.quantities.intensional_set_p(v_set)) {
                    return the_set_of_elements(v_set, answer_language, UNPROVIDED);
                } else {
                    relation_evaluation.throw_unevaluatable();
                }
            }
        }
        return NIL;
    }

    public static SubLObject evaluate_set_elements(final SubLObject v_set, SubLObject answer_language) {
        if (answer_language == UNPROVIDED) {
            answer_language = $EL;
        }
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str4$A_KB_dependent_numerical_quantifi);
        }
        if ((NIL != forts.fort_p(v_set)) && (NIL != fort_types_interface.collectionP(v_set))) {
            return isa.all_fort_instances(v_set, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != extensional_set_p(v_set)) {
            return extensional_set_elements(v_set);
        }
        if (NIL != intensional_set_p(v_set)) {
            return ask_utilities.the_set_of_elements(v_set, answer_language, UNPROVIDED);
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    /**
     * Return the current extent of SET in MT.
     */
    @LispMethod(comment = "Return the current extent of SET in MT.")
    public static final SubLObject set_extent_alt(SubLObject v_set, SubLObject mt, SubLObject answer_language) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (answer_language == UNPROVIDED) {
            answer_language = $EL;
        }
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str_alt4$A_KB_dependent_numerical_quantifi);
        }
        if ((NIL != forts.fort_p(v_set)) && (NIL != fort_types_interface.collectionP(v_set))) {
            return isa.all_fort_instances(v_set, mt, UNPROVIDED);
        } else {
            if (NIL != com.cyc.cycjava.cycl.quantities.extensional_set_p(v_set)) {
                return extensional_set_elements(v_set);
            } else {
                if (NIL != com.cyc.cycjava.cycl.quantities.intensional_set_p(v_set)) {
                    if (NIL != mt) {
                        return the_set_of_elements(v_set, answer_language, mt);
                    } else {
                        return the_set_of_elements(v_set, UNPROVIDED, UNPROVIDED);
                    }
                } else {
                    Errors.error($str_alt124$Don_t_know_how_to_determine_the_e, v_set, mt);
                }
            }
        }
        return NIL;
    }

    /**
     * Return the current extent of SET in MT.
     */
    @LispMethod(comment = "Return the current extent of SET in MT.")
    public static SubLObject set_extent(final SubLObject v_set, SubLObject mt, SubLObject answer_language) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (answer_language == UNPROVIDED) {
            answer_language = $EL;
        }
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str4$A_KB_dependent_numerical_quantifi);
        }
        if ((NIL != forts.fort_p(v_set)) && (NIL != fort_types_interface.collectionP(v_set))) {
            return isa.all_fort_instances(v_set, mt, UNPROVIDED);
        }
        if (NIL != extensional_set_p(v_set)) {
            return extensional_set_elements(v_set);
        }
        if (NIL == intensional_set_p(v_set)) {
            Errors.error($str160$Don_t_know_how_to_determine_the_e, v_set, mt);
            return NIL;
        }
        if (NIL != mt) {
            return ask_utilities.the_set_of_elements(v_set, answer_language, mt);
        }
        return ask_utilities.the_set_of_elements(v_set, UNPROVIDED, UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$SetOrCollectionIntersection
     */
    @LispMethod(comment = "#$evaluationDefn for #$SetOrCollectionIntersection")
    public static final SubLObject cyc_set_intersection_alt(SubLObject set_1, SubLObject set_2) {
        if ((NIL != com.cyc.cycjava.cycl.quantities.cyc_set_p(set_1)) && (NIL != com.cyc.cycjava.cycl.quantities.cyc_set_p(set_2))) {
            {
                SubLObject elements_1 = com.cyc.cycjava.cycl.quantities.evaluate_set_elements(set_1, $HL);
                SubLObject elements_2 = com.cyc.cycjava.cycl.quantities.evaluate_set_elements(set_2, $HL);
                SubLObject intersection = keyhash_utilities.fast_intersection(elements_1, elements_2, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
                return com.cyc.cycjava.cycl.quantities.make_hl_extensional_set(intersection);
            }
        } else {
            relation_evaluation.throw_unevaluatable();
        }
        return NIL;
    }

    /**
     * #$evaluationDefn for #$SetOrCollectionIntersection
     */
    @LispMethod(comment = "#$evaluationDefn for #$SetOrCollectionIntersection")
    public static SubLObject cyc_set_intersection(final SubLObject set_1, final SubLObject set_2) {
        if ((NIL != cyc_set_p(set_1)) && (NIL != cyc_set_p(set_2))) {
            final SubLObject elements_1 = evaluate_set_elements(set_1, $HL);
            final SubLObject elements_2 = evaluate_set_elements(set_2, $HL);
            final SubLObject intersection = keyhash_utilities.fast_intersection(elements_1, elements_2, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
            return make_hl_extensional_set(intersection);
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    /**
     * #$evaluationDefn for #$SetOrCollectionUnion
     */
    @LispMethod(comment = "#$evaluationDefn for #$SetOrCollectionUnion")
    public static final SubLObject cyc_set_union_alt(SubLObject set_1, SubLObject set_2) {
        if ((NIL != com.cyc.cycjava.cycl.quantities.cyc_set_p(set_1)) && (NIL != com.cyc.cycjava.cycl.quantities.cyc_set_p(set_2))) {
            {
                SubLObject elements_1 = com.cyc.cycjava.cycl.quantities.evaluate_set_elements(set_1, $HL);
                SubLObject elements_2 = com.cyc.cycjava.cycl.quantities.evaluate_set_elements(set_2, $HL);
                SubLObject union = append(elements_1, elements_2);
                return com.cyc.cycjava.cycl.quantities.make_hl_extensional_set(union);
            }
        } else {
            relation_evaluation.throw_unevaluatable();
        }
        return NIL;
    }

    /**
     * #$evaluationDefn for #$SetOrCollectionUnion
     */
    @LispMethod(comment = "#$evaluationDefn for #$SetOrCollectionUnion")
    public static SubLObject cyc_set_union(final SubLObject set_1, final SubLObject set_2) {
        if ((NIL != cyc_set_p(set_1)) && (NIL != cyc_set_p(set_2))) {
            final SubLObject elements_1 = evaluate_set_elements(set_1, $HL);
            final SubLObject elements_2 = evaluate_set_elements(set_2, $HL);
            final SubLObject union = append(elements_1, elements_2);
            return make_hl_extensional_set(union);
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    /**
     * #$evaluationDefn for #$SetOrCollectionDifference
     */
    @LispMethod(comment = "#$evaluationDefn for #$SetOrCollectionDifference")
    public static final SubLObject cyc_set_difference_alt(SubLObject set_1, SubLObject set_2) {
        if ((NIL != com.cyc.cycjava.cycl.quantities.cyc_set_p(set_1)) && (NIL != com.cyc.cycjava.cycl.quantities.cyc_set_p(set_2))) {
            {
                SubLObject elements_1 = com.cyc.cycjava.cycl.quantities.evaluate_set_elements(set_1, $HL);
                SubLObject elements_2 = com.cyc.cycjava.cycl.quantities.evaluate_set_elements(set_2, $HL);
                SubLObject difference = list_utilities.fast_set_difference(elements_1, elements_2, symbol_function(EQUAL));
                return com.cyc.cycjava.cycl.quantities.make_hl_extensional_set(difference);
            }
        } else {
            relation_evaluation.throw_unevaluatable();
        }
        return NIL;
    }

    /**
     * #$evaluationDefn for #$SetOrCollectionDifference
     */
    @LispMethod(comment = "#$evaluationDefn for #$SetOrCollectionDifference")
    public static SubLObject cyc_set_difference(final SubLObject set_1, final SubLObject set_2) {
        if ((NIL != cyc_set_p(set_1)) && (NIL != cyc_set_p(set_2))) {
            final SubLObject elements_1 = evaluate_set_elements(set_1, $HL);
            final SubLObject elements_2 = evaluate_set_elements(set_2, $HL);
            final SubLObject difference = list_utilities.fast_set_difference(elements_1, elements_2, symbol_function(EQUAL));
            return make_hl_extensional_set(difference);
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    /**
     * #$evaluationDefn for #$SetExtentFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$SetExtentFn")
    public static final SubLObject cyc_set_extent_alt(SubLObject v_set) {
        if (!((NIL != com.cyc.cycjava.cycl.quantities.cyc_set_p(v_set)) || (NIL != forts.fort_p(v_set)))) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject extent = com.cyc.cycjava.cycl.quantities.evaluate_set_elements(v_set, $HL);
            SubLObject hl_extent = com.cyc.cycjava.cycl.quantities.make_hl_extensional_set(extent);
            if ($$TheEmptySet == hl_extent) {
                return make_nat_formula($$TheSet, NIL);
            }
            return hl_extent;
        }
    }

    /**
     * #$evaluationDefn for #$SetExtentFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$SetExtentFn")
    public static SubLObject cyc_set_extent(final SubLObject v_set) {
        if ((NIL == cyc_set_p(v_set)) && (NIL == forts.fort_p(v_set))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject extent = evaluate_set_elements(v_set, $HL);
        final SubLObject hl_extent = make_hl_extensional_set(extent);
        if ($$TheEmptySet.eql(hl_extent)) {
            return make_nat_formula($$TheSet, NIL);
        }
        return hl_extent;
    }

    /**
     * #$evaluationDefn for #$MapFunctionOverSet
     */
    @LispMethod(comment = "#$evaluationDefn for #$MapFunctionOverSet")
    public static final SubLObject cyc_map_function_over_set_alt(SubLObject function, SubLObject v_set) {
        {
            SubLObject elements = com.cyc.cycjava.cycl.quantities.evaluate_set_elements(v_set, $HL);
            SubLObject v_answer = com.cyc.cycjava.cycl.quantities.cyc_map_function_int(function, elements);
            if (NIL == v_answer) {
                relation_evaluation.throw_unevaluatable();
            }
            return com.cyc.cycjava.cycl.quantities.make_hl_extensional_set(v_answer);
        }
    }

    /**
     * #$evaluationDefn for #$MapFunctionOverSet
     */
    @LispMethod(comment = "#$evaluationDefn for #$MapFunctionOverSet")
    public static SubLObject cyc_map_function_over_set(final SubLObject function, final SubLObject v_set) {
        final SubLObject elements = evaluate_set_elements(v_set, $HL);
        final SubLObject v_answer = cyc_map_function_int(function, elements);
        if (NIL == v_answer) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_hl_extensional_set(v_answer);
    }

    /**
     * #$evaluationDefn for #$LeastCommonMultipleFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$LeastCommonMultipleFn")
    public static final SubLObject cyc_least_common_multiple_alt(SubLObject args) {
        if (NIL == com.cyc.cycjava.cycl.quantities.list_of_cyc_scalar_interval_p(args)) {
            relation_evaluation.throw_unevaluatable();
        }
        if (NIL == args) {
            relation_evaluation.throw_unevaluatable();
        } else {
            return quantity_reduce(symbol_function(CYC_LEAST_COMMON_MULTIPLE_INTERNAL), NIL, args);
        }
        return NIL;
    }

    /**
     * #$evaluationDefn for #$LeastCommonMultipleFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$LeastCommonMultipleFn")
    public static SubLObject cyc_least_common_multiple(final SubLObject args) {
        if (NIL == list_of_cyc_scalar_interval_p(args)) {
            relation_evaluation.throw_unevaluatable();
        }
        if (NIL == args) {
            relation_evaluation.throw_unevaluatable();
            return NIL;
        }
        return arithmetic.quantity_reduce(symbol_function(CYC_LEAST_COMMON_MULTIPLE_INTERNAL), NIL, args);
    }

    public static final SubLObject cyc_least_common_multiple_internal_alt(SubLObject scalar1, SubLObject scalar2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (scalar1.isInteger() && scalar2.isInteger()) {
                    ans = lcm2(scalar1, scalar2);
                } else {
                    thread.resetMultipleValues();
                    {
                        SubLObject unit1 = com.cyc.cycjava.cycl.quantities.explode_interval(scalar1);
                        SubLObject min1 = thread.secondMultipleValue();
                        SubLObject max1 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        thread.resetMultipleValues();
                        {
                            SubLObject unit2 = com.cyc.cycjava.cycl.quantities.explode_interval(scalar2);
                            SubLObject min2 = thread.secondMultipleValue();
                            SubLObject max2 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (!(((min1.isInteger() && max1.isInteger()) && min2.isInteger()) && max2.isInteger())) {
                                relation_evaluation.throw_unevaluatable();
                            }
                            if (!(min1.numE(max1) && min2.numE(max2))) {
                                relation_evaluation.throw_unevaluatable();
                            }
                            if (NIL == com.cyc.cycjava.cycl.quantities.comparable_units(unit1, unit2)) {
                                relation_evaluation.throw_unevaluatable();
                            }
                            {
                                SubLObject smaller_unit = NIL;
                                SubLObject larger_unit = NIL;
                                SubLObject smaller_unit_integer = NIL;
                                SubLObject larger_unit_integer = NIL;
                                if (NIL != com.cyc.cycjava.cycl.quantities.smaller_unit_than(unit1, unit2)) {
                                    smaller_unit = unit1;
                                    larger_unit = unit2;
                                    smaller_unit_integer = min1;
                                    larger_unit_integer = min2;
                                } else {
                                    smaller_unit = unit2;
                                    larger_unit = unit1;
                                    smaller_unit_integer = min2;
                                    larger_unit_integer = min1;
                                }
                                if (!((smaller_unit == larger_unit) || (NIL != com.cyc.cycjava.cycl.quantities.integer_valuedP(com.cyc.cycjava.cycl.quantities.get_unit_multiplication_factor(larger_unit, smaller_unit))))) {
                                    relation_evaluation.throw_unevaluatable();
                                }
                                larger_unit_integer = round(com.cyc.cycjava.cycl.quantities.convert_to_units(smaller_unit, larger_unit, larger_unit_integer, UNPROVIDED), UNPROVIDED);
                                {
                                    SubLObject lcm = lcm2(smaller_unit_integer, larger_unit_integer);
                                    SubLObject large_unit_lcm = round(com.cyc.cycjava.cycl.quantities.convert_to_units(larger_unit, smaller_unit, lcm, UNPROVIDED), UNPROVIDED);
                                    ans = com.cyc.cycjava.cycl.quantities.make_interval(larger_unit, large_unit_lcm, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
                return arithmetic_answer(ans);
            }
        }
    }

    public static SubLObject cyc_least_common_multiple_internal(final SubLObject scalar1, final SubLObject scalar2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (scalar1.isInteger() && scalar2.isInteger()) {
            ans = number_utilities.lcm2(scalar1, scalar2);
        } else {
            thread.resetMultipleValues();
            final SubLObject unit1 = explode_interval(scalar1);
            final SubLObject min1 = thread.secondMultipleValue();
            final SubLObject max1 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject unit2 = explode_interval(scalar2);
            final SubLObject min2 = thread.secondMultipleValue();
            final SubLObject max2 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if ((((!min1.isInteger()) || (!max1.isInteger())) || (!min2.isInteger())) || (!max2.isInteger())) {
                relation_evaluation.throw_unevaluatable();
            }
            if ((!min1.numE(max1)) || (!min2.numE(max2))) {
                relation_evaluation.throw_unevaluatable();
            }
            if (NIL == comparable_units(unit1, unit2)) {
                relation_evaluation.throw_unevaluatable();
            }
            SubLObject smaller_unit = NIL;
            SubLObject larger_unit = NIL;
            SubLObject smaller_unit_integer = NIL;
            SubLObject larger_unit_integer = NIL;
            if (NIL != smaller_unit_than(unit1, unit2)) {
                smaller_unit = unit1;
                larger_unit = unit2;
                smaller_unit_integer = min1;
                larger_unit_integer = min2;
            } else {
                smaller_unit = unit2;
                larger_unit = unit1;
                smaller_unit_integer = min2;
                larger_unit_integer = min1;
            }
            if ((!smaller_unit.eql(larger_unit)) && (NIL == integer_valuedP(get_unit_multiplication_factor(larger_unit, smaller_unit)))) {
                relation_evaluation.throw_unevaluatable();
            }
            larger_unit_integer = round(convert_to_units(smaller_unit, larger_unit, larger_unit_integer, UNPROVIDED), UNPROVIDED);
            final SubLObject lcm = number_utilities.lcm2(smaller_unit_integer, larger_unit_integer);
            final SubLObject large_unit_lcm = round(convert_to_units(larger_unit, smaller_unit, lcm, UNPROVIDED), UNPROVIDED);
            ans = make_interval(larger_unit, large_unit_lcm, UNPROVIDED);
        }
        return arithmetic.arithmetic_answer(ans);
    }

    /**
     * #$evaluationDefn for #$GreatestCommonDivisorFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$GreatestCommonDivisorFn")
    public static final SubLObject cyc_greatest_common_divisor_alt(SubLObject args) {
        if (NIL == com.cyc.cycjava.cycl.quantities.list_of_cyc_scalar_interval_p(args)) {
            relation_evaluation.throw_unevaluatable();
        }
        if (NIL == args) {
            relation_evaluation.throw_unevaluatable();
        } else {
            return quantity_reduce(symbol_function(CYC_GREATEST_COMMON_DIVISOR_INTERNAL), NIL, args);
        }
        return NIL;
    }

    /**
     * #$evaluationDefn for #$GreatestCommonDivisorFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$GreatestCommonDivisorFn")
    public static SubLObject cyc_greatest_common_divisor(final SubLObject args) {
        if (NIL == list_of_cyc_scalar_interval_p(args)) {
            relation_evaluation.throw_unevaluatable();
        }
        if (NIL == args) {
            relation_evaluation.throw_unevaluatable();
            return NIL;
        }
        return arithmetic.quantity_reduce(symbol_function(CYC_GREATEST_COMMON_DIVISOR_INTERNAL), NIL, args);
    }

    public static final SubLObject cyc_greatest_common_divisor_internal_alt(SubLObject scalar1, SubLObject scalar2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (scalar1.isInteger() && scalar2.isInteger()) {
                    ans = gcd2(scalar1, scalar2);
                } else {
                    thread.resetMultipleValues();
                    {
                        SubLObject unit1 = com.cyc.cycjava.cycl.quantities.explode_interval(scalar1);
                        SubLObject min1 = thread.secondMultipleValue();
                        SubLObject max1 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        thread.resetMultipleValues();
                        {
                            SubLObject unit2 = com.cyc.cycjava.cycl.quantities.explode_interval(scalar2);
                            SubLObject min2 = thread.secondMultipleValue();
                            SubLObject max2 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (!(((min1.isInteger() && max1.isInteger()) && min2.isInteger()) && max2.isInteger())) {
                                relation_evaluation.throw_unevaluatable();
                            }
                            if (!(min1.numE(max1) && min2.numE(max2))) {
                                relation_evaluation.throw_unevaluatable();
                            }
                            if (NIL == com.cyc.cycjava.cycl.quantities.comparable_units(unit1, unit2)) {
                                relation_evaluation.throw_unevaluatable();
                            }
                            {
                                SubLObject smaller_unit = NIL;
                                SubLObject larger_unit = NIL;
                                SubLObject smaller_unit_integer = NIL;
                                SubLObject larger_unit_integer = NIL;
                                if (NIL != com.cyc.cycjava.cycl.quantities.smaller_unit_than(unit1, unit2)) {
                                    smaller_unit = unit1;
                                    larger_unit = unit2;
                                    smaller_unit_integer = min1;
                                    larger_unit_integer = min2;
                                } else {
                                    smaller_unit = unit2;
                                    larger_unit = unit1;
                                    smaller_unit_integer = min2;
                                    larger_unit_integer = min1;
                                }
                                if (!((smaller_unit == larger_unit) || (NIL != com.cyc.cycjava.cycl.quantities.integer_valuedP(com.cyc.cycjava.cycl.quantities.get_unit_multiplication_factor(larger_unit, smaller_unit))))) {
                                    relation_evaluation.throw_unevaluatable();
                                }
                                larger_unit_integer = round(com.cyc.cycjava.cycl.quantities.convert_to_units(smaller_unit, larger_unit, larger_unit_integer, UNPROVIDED), UNPROVIDED);
                                ans = com.cyc.cycjava.cycl.quantities.make_interval(smaller_unit, gcd2(smaller_unit_integer, larger_unit_integer), UNPROVIDED);
                            }
                        }
                    }
                }
                return arithmetic_answer(ans);
            }
        }
    }

    public static SubLObject cyc_greatest_common_divisor_internal(final SubLObject scalar1, final SubLObject scalar2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (scalar1.isInteger() && scalar2.isInteger()) {
            ans = number_utilities.gcd2(scalar1, scalar2);
        } else {
            thread.resetMultipleValues();
            final SubLObject unit1 = explode_interval(scalar1);
            final SubLObject min1 = thread.secondMultipleValue();
            final SubLObject max1 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject unit2 = explode_interval(scalar2);
            final SubLObject min2 = thread.secondMultipleValue();
            final SubLObject max2 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if ((((!min1.isInteger()) || (!max1.isInteger())) || (!min2.isInteger())) || (!max2.isInteger())) {
                relation_evaluation.throw_unevaluatable();
            }
            if ((!min1.numE(max1)) || (!min2.numE(max2))) {
                relation_evaluation.throw_unevaluatable();
            }
            if (NIL == comparable_units(unit1, unit2)) {
                relation_evaluation.throw_unevaluatable();
            }
            SubLObject smaller_unit = NIL;
            SubLObject larger_unit = NIL;
            SubLObject smaller_unit_integer = NIL;
            SubLObject larger_unit_integer = NIL;
            if (NIL != smaller_unit_than(unit1, unit2)) {
                smaller_unit = unit1;
                larger_unit = unit2;
                smaller_unit_integer = min1;
                larger_unit_integer = min2;
            } else {
                smaller_unit = unit2;
                larger_unit = unit1;
                smaller_unit_integer = min2;
                larger_unit_integer = min1;
            }
            if ((!smaller_unit.eql(larger_unit)) && (NIL == integer_valuedP(get_unit_multiplication_factor(larger_unit, smaller_unit)))) {
                relation_evaluation.throw_unevaluatable();
            }
            larger_unit_integer = round(convert_to_units(smaller_unit, larger_unit, larger_unit_integer, UNPROVIDED), UNPROVIDED);
            ans = make_interval(smaller_unit, number_utilities.gcd2(smaller_unit_integer, larger_unit_integer), UNPROVIDED);
        }
        return ans;
    }

    public static final SubLObject integer_valuedP_alt(SubLObject number) {
        return makeBoolean(number.isNumber() && mod(number, ONE_INTEGER).isZero());
    }

    public static SubLObject integer_valuedP(final SubLObject number) {
        return makeBoolean(number.isNumber() && mod(number, ONE_INTEGER).isZero());
    }

    /**
     * #$evaluationDefn for #$RandomIntegerFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$RandomIntegerFn")
    public static final SubLObject cyc_random_integer_alt(SubLObject max) {
        max = com.cyc.cycjava.cycl.quantities.cycl_real_number_to_number(max);
        if (NIL == subl_promotions.positive_integer_p(max)) {
            relation_evaluation.throw_unevaluatable();
        }
        return arithmetic_answer(random.random(max));
    }

    /**
     * #$evaluationDefn for #$RandomIntegerFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$RandomIntegerFn")
    public static SubLObject cyc_random_integer(SubLObject max) {
        max = cycl_real_number_to_number(max);
        if (NIL == subl_promotions.positive_integer_p(max)) {
            relation_evaluation.throw_unevaluatable();
        }
        return arithmetic.arithmetic_answer(random.random(max));
    }

    public static SubLObject cyc_random_integer_with_seed(SubLObject seed, SubLObject max) {
        seed = cycl_real_number_to_number(seed);
        max = cycl_real_number_to_number(max);
        if (NIL == subl_promotions.positive_integer_p(seed)) {
            relation_evaluation.throw_unevaluatable();
        }
        if (NIL == subl_promotions.positive_integer_p(max)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject hash = seed;
        hash = add(lognot(hash), ash(hash, $int$21));
        hash = logxor(hash, ash(hash, $int$_24));
        hash = add(hash, ash(hash, THREE_INTEGER), ash(hash, EIGHT_INTEGER));
        hash = logxor(hash, ash(hash, $int$_14));
        hash = add(hash, ash(hash, TWO_INTEGER), ash(hash, FOUR_INTEGER));
        hash = logxor(hash, ash(hash, $int$_28));
        hash = add(hash, ash(hash, $int$31));
        return arithmetic.arithmetic_answer(mod(hash, max));
    }

    /**
     * #$evaluationDefn for #$NRandomIntegersFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$NRandomIntegersFn")
    public static final SubLObject cyc_n_random_integers_alt(SubLObject n, SubLObject max) {
        n = com.cyc.cycjava.cycl.quantities.cycl_real_number_to_number(n);
        max = com.cyc.cycjava.cycl.quantities.cycl_real_number_to_number(max);
        if (!((NIL != subl_promotions.non_negative_integer_p(n)) && (NIL != subl_promotions.positive_integer_p(max)))) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_el_list(Mapping.mapcar(symbol_function(ARITHMETIC_ANSWER), n_random_integers(n, max, UNPROVIDED)), UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$NRandomIntegersFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$NRandomIntegersFn")
    public static SubLObject cyc_n_random_integers(SubLObject n, SubLObject max) {
        n = cycl_real_number_to_number(n);
        max = cycl_real_number_to_number(max);
        if ((NIL == subl_promotions.non_negative_integer_p(n)) || (NIL == subl_promotions.positive_integer_p(max))) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_el_list(Mapping.mapcar(symbol_function(ARITHMETIC_ANSWER), number_utilities.n_random_integers(n, max, UNPROVIDED)), UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$MatrixSolutionFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$MatrixSolutionFn")
    public static final SubLObject cyc_matrix_solution_alt(SubLObject cycl_matrix) {
        {
            SubLObject matrix = copy_tree(el_list_items(cycl_matrix));
            SubLObject list_var = NIL;
            SubLObject row = NIL;
            SubLObject index = NIL;
            for (list_var = matrix, row = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , row = list_var.first() , index = add(ONE_INTEGER, index)) {
                set_nth(index, matrix, el_list_items(row));
            }
            matrix = matrix_utilities.gaussian_elimination(matrix);
            if (NIL == matrix) {
                relation_evaluation.throw_unevaluatable();
            } else {
                matrix = matrix_utilities.remove_allzero_rows(matrix);
                if (NIL == matrix_utilities.triangular_matrix_of_integer_or_fraction_p(matrix)) {
                    relation_evaluation.throw_unevaluatable();
                } else {
                    return make_el_list(normalize_fractional_phrase(list_utilities.snoc(ONE_INTEGER, matrix_utilities.solve_triangular_matrix(matrix))), UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    /**
     * #$evaluationDefn for #$MatrixSolutionFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$MatrixSolutionFn")
    public static SubLObject cyc_matrix_solution(final SubLObject cycl_matrix) {
        SubLObject matrix = copy_tree(el_list_items(cycl_matrix));
        SubLObject list_var = NIL;
        SubLObject row = NIL;
        SubLObject index = NIL;
        list_var = matrix;
        row = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , row = list_var.first() , index = add(ONE_INTEGER, index)) {
            set_nth(index, matrix, el_list_items(row));
        }
        matrix = matrix_utilities.gaussian_elimination(matrix);
        if (NIL == matrix) {
            relation_evaluation.throw_unevaluatable();
        } else {
            matrix = matrix_utilities.remove_allzero_rows(matrix);
            if (NIL != matrix_utilities.triangular_matrix_of_integer_or_fraction_p(matrix)) {
                return make_el_list(fraction_utilities.normalize_fractional_phrase(list_utilities.snoc(ONE_INTEGER, matrix_utilities.solve_triangular_matrix(matrix))), UNPROVIDED);
            }
            relation_evaluation.throw_unevaluatable();
        }
        return NIL;
    }

    public static SubLObject get_interconvertible_units_of_measure(SubLObject filter_fn) {
        if (filter_fn == UNPROVIDED) {
            filter_fn = symbol_function(FALSE);
        }
        final SubLObject map = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject v_bindings = cdolist_list_var = inference_kernel.new_cyc_query($list184, $const185$CurrentWorldDataCollectorMt_NonHo, $list186);
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject unit_type = NIL;
            SubLObject unit = NIL;
            destructuring_bind_must_consp(current, datum, $list187);
            unit_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list187);
            unit = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((NIL == funcall(filter_fn, unit_type)) && (NIL == funcall(filter_fn, unit))) {
                    map_utilities.map_push(map, unit_type, unit);
                }
            } else {
                cdestructuring_bind_error(datum, $list187);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return map;
    }

    public static final SubLObject declare_quantities_file_alt() {
        declareFunction("initialize_quant_kb_feature", "INITIALIZE-QUANT-KB-FEATURE", 0, 0, false);
        declareFunction("cyc_scalar_interval_p", "CYC-SCALAR-INTERVAL-P", 1, 0, false);
        declareFunction("list_of_cyc_scalar_interval_p", "LIST-OF-CYC-SCALAR-INTERVAL-P", 1, 0, false);
        declareFunction("make_interval", "MAKE-INTERVAL", 2, 1, false);
        declareFunction("explode_interval", "EXPLODE-INTERVAL", 1, 0, false);
        declareFunction("explode_fort_interval", "EXPLODE-FORT-INTERVAL", 1, 0, false);
        declareFunction("max_quant_value", "MAX-QUANT-VALUE", 1, 1, false);
        declareFunction("min_quant_value", "MIN-QUANT-VALUE", 1, 1, false);
        declareFunction("comparable_units", "COMPARABLE-UNITS", 2, 0, false);
        declareFunction("smaller_unit_than", "SMALLER-UNIT-THAN", 2, 0, false);
        declareFunction("convert_to_units", "CONVERT-TO-UNITS", 3, 1, false);
        declareFunction("unit_multiplication_factor", "UNIT-MULTIPLICATION-FACTOR", 2, 1, false);
        declareFunction("get_unit_multiplication_factor", "GET-UNIT-MULTIPLICATION-FACTOR", 2, 0, false);
        declareFunction("clear_get_definitional_unit_multiplication_factor", "CLEAR-GET-DEFINITIONAL-UNIT-MULTIPLICATION-FACTOR", 0, 0, false);
        declareFunction("remove_get_definitional_unit_multiplication_factor", "REMOVE-GET-DEFINITIONAL-UNIT-MULTIPLICATION-FACTOR", 2, 0, false);
        declareFunction("get_definitional_unit_multiplication_factor_internal", "GET-DEFINITIONAL-UNIT-MULTIPLICATION-FACTOR-INTERNAL", 2, 0, false);
        declareFunction("get_definitional_unit_multiplication_factor", "GET-DEFINITIONAL-UNIT-MULTIPLICATION-FACTOR", 2, 0, false);
        declareFunction("get_contingent_unit_multiplication_factor", "GET-CONTINGENT-UNIT-MULTIPLICATION-FACTOR", 2, 0, false);
        declareFunction("get_unit_multiplication_factor_int", "GET-UNIT-MULTIPLICATION-FACTOR-INT", 3, 0, false);
        declareFunction("get_umf", "GET-UMF", 3, 0, false);
        declareFunction("get_umf_internal", "GET-UMF-INTERNAL", 1, 0, false);
        declareFunction("gather_umf_assertions", "GATHER-UMF-ASSERTIONS", 1, 0, false);
        declareFunction("get_umf_gather_factor", "GET-UMF-GATHER-FACTOR", 2, 0, false);
        declareFunction("unit_times", "UNIT-TIMES", 2, 0, false);
        declareFunction("unit_quotient", "UNIT-QUOTIENT", 2, 0, false);
        declareFunction("unit_sqrt", "UNIT-SQRT", 1, 0, false);
        declareFunction("complex_unit_times", "COMPLEX-UNIT-TIMES", 2, 0, false);
        declareFunction("complex_per_fn_unit_times", "COMPLEX-PER-FN-UNIT-TIMES", 2, 0, false);
        declareFunction("complex_unit_quotient", "COMPLEX-UNIT-QUOTIENT", 2, 0, false);
        declareFunction("complex_per_fn_unit_quotient", "COMPLEX-PER-FN-UNIT-QUOTIENT", 2, 0, false);
        declareFunction("complex_unit_sqrt", "COMPLEX-UNIT-SQRT", 1, 0, false);
        declareFunction("per_fn_unit", "PER-FN-UNIT", 1, 0, false);
        declareFunction("make_and_simplify_interval", "MAKE-AND-SIMPLIFY-INTERVAL", 2, 1, false);
        declareFunction("cyc_integer_range", "CYC-INTEGER-RANGE", 1, 0, false);
        declareFunction("cyc_number_range", "CYC-NUMBER-RANGE", 1, 0, false);
        declareFunction("cyc_plus_quantities", "CYC-PLUS-QUANTITIES", 2, 0, false);
        declareFunction("cyc_minus_quantities", "CYC-MINUS-QUANTITIES", 1, 0, false);
        declareFunction("cyc_quantity_conversion", "CYC-QUANTITY-CONVERSION", 2, 0, false);
        declareFunction("cycl_real_number_to_number", "CYCL-REAL-NUMBER-TO-NUMBER", 1, 0, false);
        declareFunction("cyc_times_quantities", "CYC-TIMES-QUANTITIES", 2, 0, false);
        declareFunction("fuzzy_numberP", "FUZZY-NUMBER?", 1, 0, false);
        declareFunction("cyc_quotient", "CYC-QUOTIENT", 2, 0, false);
        declareFunction("cyc_inverse", "CYC-INVERSE", 1, 0, false);
        declareFunction("cyc_modulo", "CYC-MODULO", 2, 0, false);
        declareFunction("cyc_residue", "CYC-RESIDUE", 1, 0, false);
        declareFunction("quantity_congruence_base", "QUANTITY-CONGRUENCE-BASE", 1, 0, false);
        declareFunction("unit_of_measure_type", "UNIT-OF-MEASURE-TYPE", 1, 0, false);
        declareFunction("cyc_absolute_value", "CYC-ABSOLUTE-VALUE", 1, 0, false);
        declareFunction("cyc_sqrt", "CYC-SQRT", 1, 0, false);
        declareFunction("cyc_squared", "CYC-SQUARED", 1, 0, false);
        declareFunction("cyc_percent", "CYC-PERCENT", 1, 0, false);
        declareFunction("cyc_round_up", "CYC-ROUND-UP", 1, 0, false);
        declareFunction("cyc_round_closest", "CYC-ROUND-CLOSEST", 1, 0, false);
        declareFunction("cyc_round_down", "CYC-ROUND-DOWN", 1, 0, false);
        declareFunction("cyc_round_truncate", "CYC-ROUND-TRUNCATE", 1, 0, false);
        declareFunction("cyc_round_internal", "CYC-ROUND-INTERNAL", 2, 0, false);
        declareFunction("cyc_max_range", "CYC-MAX-RANGE", 1, 0, false);
        declareFunction("cyc_max_range_internal", "CYC-MAX-RANGE-INTERNAL", 2, 0, false);
        declareFunction("cyc_min_range", "CYC-MIN-RANGE", 1, 0, false);
        declareFunction("cyc_min_range_internal", "CYC-MIN-RANGE-INTERNAL", 2, 0, false);
        declareFunction("cyc_min_quant_value", "CYC-MIN-QUANT-VALUE", 1, 0, false);
        declareFunction("cyc_max_quant_value", "CYC-MAX-QUANT-VALUE", 1, 0, false);
        declareFunction("cyc_tolerance", "CYC-TOLERANCE", 2, 0, false);
        declareFunction("cyc_tolerance_internal", "CYC-TOLERANCE-INTERNAL", 5, 0, false);
        declareFunction("cyc_significant_digits", "CYC-SIGNIFICANT-DIGITS", 2, 0, false);
        declareFunction("cyc_sine", "CYC-SINE", 1, 0, false);
        declareFunction("cyc_cosine", "CYC-COSINE", 1, 0, false);
        declareFunction("cyc_tangent", "CYC-TANGENT", 1, 0, false);
        declareFunction("cyc_cosecant", "CYC-COSECANT", 1, 0, false);
        declareFunction("cyc_secant", "CYC-SECANT", 1, 0, false);
        declareFunction("cyc_cotangent", "CYC-COTANGENT", 1, 0, false);
        declareFunction("cyc_trig_internal", "CYC-TRIG-INTERNAL", 2, 0, false);
        declareFunction("cyc_arc_sine", "CYC-ARC-SINE", 1, 0, false);
        declareFunction("cyc_arc_cosine", "CYC-ARC-COSINE", 1, 0, false);
        declareFunction("cyc_arc_tangent", "CYC-ARC-TANGENT", 1, 0, false);
        declareFunction("cyc_arc_cosecant", "CYC-ARC-COSECANT", 1, 0, false);
        declareFunction("cyc_arc_secant", "CYC-ARC-SECANT", 1, 0, false);
        declareFunction("cyc_arc_cotangent", "CYC-ARC-COTANGENT", 1, 0, false);
        declareFunction("cyc_inverse_trig_internal", "CYC-INVERSE-TRIG-INTERNAL", 2, 0, false);
        declareFunction("cyc_logarithm", "CYC-LOGARITHM", 2, 0, false);
        declareFunction("cyc_exponent", "CYC-EXPONENT", 2, 0, false);
        declareFunction("cyc_quadratic_solution_positive", "CYC-QUADRATIC-SOLUTION-POSITIVE", 3, 0, false);
        declareFunction("cyc_quadratic_solution_negative", "CYC-QUADRATIC-SOLUTION-NEGATIVE", 3, 0, false);
        declareFunction("cyc_collection_subsumption_paths", "CYC-COLLECTION-SUBSUMPTION-PATHS", 1, 0, false);
        declareFunction("cyc_predicate_subsumption_paths", "CYC-PREDICATE-SUBSUMPTION-PATHS", 1, 0, false);
        declareFunction("cyc_less_than_quantities", "CYC-LESS-THAN-QUANTITIES", 2, 0, false);
        declareFunction("following_valueP", "FOLLOWING-VALUE?", 2, 1, false);
        declareFunction("cyc_less_than_or_equal_to_quantities", "CYC-LESS-THAN-OR-EQUAL-TO-QUANTITIES", 2, 0, false);
        declareFunction("cyc_quantity_subsumes", "CYC-QUANTITY-SUBSUMES", 2, 0, false);
        declareFunction("cyc_quantity_subsumes_proper_intervals", "CYC-QUANTITY-SUBSUMES-PROPER-INTERVALS", 2, 0, false);
        declareFunction("cyc_quantity_intersects", "CYC-QUANTITY-INTERSECTS", 2, 0, false);
        declareFunction("cyc_list_nth", "CYC-LIST-NTH", 2, 0, false);
        declareFunction("cyc_list_concatenate", "CYC-LIST-CONCATENATE", 1, 0, false);
        declareFunction("cyc_list_first", "CYC-LIST-FIRST", 1, 0, false);
        declareFunction("cyc_list_rest", "CYC-LIST-REST", 1, 0, false);
        declareFunction("cyc_list_last", "CYC-LIST-LAST", 1, 0, false);
        declareFunction("cyc_list_subseq", "CYC-LIST-SUBSEQ", 3, 0, false);
        declareFunction("cyc_list_search", "CYC-LIST-SEARCH", 2, 0, false);
        declareFunction("cyc_position", "CYC-POSITION", 2, 0, false);
        declareFunction("cyc_list_length", "CYC-LIST-LENGTH", 1, 0, false);
        declareFunction("cyc_list_reverse", "CYC-LIST-REVERSE", 1, 0, false);
        declareFunction("cyc_list_member_set", "CYC-LIST-MEMBER-SET", 1, 0, false);
        declareFunction("cyc_substitute_from_list", "CYC-SUBSTITUTE-FROM-LIST", 2, 0, false);
        declareFunction("doubleton_to_cons", "DOUBLETON-TO-CONS", 1, 0, false);
        declareFunction("cyc_map_function_over_list", "CYC-MAP-FUNCTION-OVER-LIST", 2, 0, false);
        declareFunction("cyc_map_function_int", "CYC-MAP-FUNCTION-INT", 2, 0, false);
        declareFunction("cyc_map_function_with_args_over_lists", "CYC-MAP-FUNCTION-WITH-ARGS-OVER-LISTS", 5, 0, false);
        declareFunction("cyc_map_function_with_args_over_lists_int", "CYC-MAP-FUNCTION-WITH-ARGS-OVER-LISTS-INT", 5, 0, false);
        declareFunction("cyc_list_memberP", "CYC-LIST-MEMBER?", 2, 0, false);
        declareFunction("cyc_list_contains_memberP", "CYC-LIST-CONTAINS-MEMBER?", 2, 0, false);
        declareFunction("cyc_sublistP", "CYC-SUBLIST?", 2, 0, false);
        declareFunction("cyc_initial_sublistP", "CYC-INITIAL-SUBLIST?", 2, 0, false);
        declareFunction("cyc_non_empty_set_p", "CYC-NON-EMPTY-SET-P", 1, 0, false);
        declareFunction("cyc_empty_set_p", "CYC-EMPTY-SET-P", 1, 0, false);
        declareFunction("cyc_set_p", "CYC-SET-P", 1, 0, false);
        declareFunction("extensional_set_p", "EXTENSIONAL-SET-P", 1, 0, false);
        declareFunction("intensional_set_p", "INTENSIONAL-SET-P", 1, 0, false);
        declareFunction("make_hl_extensional_set", "MAKE-HL-EXTENSIONAL-SET", 1, 0, false);
        declareFunction("evaluate_set_elements", "EVALUATE-SET-ELEMENTS", 1, 1, false);
        declareFunction("set_extent", "SET-EXTENT", 1, 2, false);
        declareFunction("cyc_set_intersection", "CYC-SET-INTERSECTION", 2, 0, false);
        declareFunction("cyc_set_union", "CYC-SET-UNION", 2, 0, false);
        declareFunction("cyc_set_difference", "CYC-SET-DIFFERENCE", 2, 0, false);
        declareFunction("cyc_set_extent", "CYC-SET-EXTENT", 1, 0, false);
        declareFunction("cyc_map_function_over_set", "CYC-MAP-FUNCTION-OVER-SET", 2, 0, false);
        declareFunction("cyc_least_common_multiple", "CYC-LEAST-COMMON-MULTIPLE", 1, 0, false);
        declareFunction("cyc_least_common_multiple_internal", "CYC-LEAST-COMMON-MULTIPLE-INTERNAL", 2, 0, false);
        declareFunction("cyc_greatest_common_divisor", "CYC-GREATEST-COMMON-DIVISOR", 1, 0, false);
        declareFunction("cyc_greatest_common_divisor_internal", "CYC-GREATEST-COMMON-DIVISOR-INTERNAL", 2, 0, false);
        declareFunction("integer_valuedP", "INTEGER-VALUED?", 1, 0, false);
        declareFunction("cyc_random_integer", "CYC-RANDOM-INTEGER", 1, 0, false);
        declareFunction("cyc_n_random_integers", "CYC-N-RANDOM-INTEGERS", 2, 0, false);
        declareFunction("cyc_matrix_solution", "CYC-MATRIX-SOLUTION", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_quantities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("initialize_quant_kb_feature", "INITIALIZE-QUANT-KB-FEATURE", 0, 0, false);
            declareFunction("cyc_scalar_interval_p", "CYC-SCALAR-INTERVAL-P", 1, 0, false);
            declareFunction("list_of_cyc_scalar_interval_p", "LIST-OF-CYC-SCALAR-INTERVAL-P", 1, 0, false);
            declareFunction("make_interval", "MAKE-INTERVAL", 2, 1, false);
            declareFunction("explode_interval_ignoring_unevaluatable", "EXPLODE-INTERVAL-IGNORING-UNEVALUATABLE", 1, 0, false);
            declareFunction("explode_interval", "EXPLODE-INTERVAL", 1, 0, false);
            declareFunction("explode_fort_interval", "EXPLODE-FORT-INTERVAL", 1, 0, false);
            declareFunction("max_quant_value", "MAX-QUANT-VALUE", 1, 1, false);
            declareFunction("min_quant_value", "MIN-QUANT-VALUE", 1, 1, false);
            declareFunction("comparable_units", "COMPARABLE-UNITS", 2, 0, false);
            declareFunction("smaller_unit_than", "SMALLER-UNIT-THAN", 2, 0, false);
            declareFunction("convert_to_units", "CONVERT-TO-UNITS", 3, 1, false);
            declareFunction("convert_to_units_absolute", "CONVERT-TO-UNITS-ABSOLUTE", 3, 1, false);
            declareFunction("unit_multiplication_factor", "UNIT-MULTIPLICATION-FACTOR", 2, 1, false);
            declareFunction("get_unit_multiplication_factor", "GET-UNIT-MULTIPLICATION-FACTOR", 2, 0, false);
            declareFunction("get_unit_absolute_scale_offset", "GET-UNIT-ABSOLUTE-SCALE-OFFSET", 2, 0, false);
            declareFunction("clear_get_definitional_unit_multiplication_factor", "CLEAR-GET-DEFINITIONAL-UNIT-MULTIPLICATION-FACTOR", 0, 0, false);
            declareFunction("remove_get_definitional_unit_multiplication_factor", "REMOVE-GET-DEFINITIONAL-UNIT-MULTIPLICATION-FACTOR", 2, 0, false);
            declareFunction("get_definitional_unit_multiplication_factor_internal", "GET-DEFINITIONAL-UNIT-MULTIPLICATION-FACTOR-INTERNAL", 2, 0, false);
            declareFunction("get_definitional_unit_multiplication_factor", "GET-DEFINITIONAL-UNIT-MULTIPLICATION-FACTOR", 2, 0, false);
            declareFunction("get_contingent_unit_multiplication_factor", "GET-CONTINGENT-UNIT-MULTIPLICATION-FACTOR", 2, 0, false);
            declareFunction("get_unit_multiplication_factor_int", "GET-UNIT-MULTIPLICATION-FACTOR-INT", 3, 0, false);
            declareFunction("get_umf", "GET-UMF", 3, 0, false);
            declareFunction("get_umf_internal", "GET-UMF-INTERNAL", 1, 0, false);
            declareFunction("gather_umf_assertions", "GATHER-UMF-ASSERTIONS", 1, 0, false);
            declareFunction("get_umf_gather_factor", "GET-UMF-GATHER-FACTOR", 2, 0, false);
            declareFunction("unit_times", "UNIT-TIMES", 2, 0, false);
            declareFunction("unit_quotient", "UNIT-QUOTIENT", 2, 0, false);
            declareFunction("unit_sqrt", "UNIT-SQRT", 1, 0, false);
            declareFunction("complex_unit_times", "COMPLEX-UNIT-TIMES", 2, 0, false);
            declareFunction("complex_per_fn_unit_times", "COMPLEX-PER-FN-UNIT-TIMES", 2, 0, false);
            declareFunction("complex_unit_quotient", "COMPLEX-UNIT-QUOTIENT", 2, 0, false);
            declareFunction("complex_per_fn_unit_quotient", "COMPLEX-PER-FN-UNIT-QUOTIENT", 2, 0, false);
            declareFunction("complex_unit_sqrt", "COMPLEX-UNIT-SQRT", 1, 0, false);
            declareFunction("per_fn_unit", "PER-FN-UNIT", 1, 0, false);
            declareFunction("make_and_simplify_interval", "MAKE-AND-SIMPLIFY-INTERVAL", 2, 1, false);
            declareFunction("term_unify_with_units", "TERM-UNIFY-WITH-UNITS", 2, 0, false);
            declareFunction("cyc_integer_range", "CYC-INTEGER-RANGE", 1, 0, false);
            declareFunction("cyc_number_range", "CYC-NUMBER-RANGE", 1, 0, false);
            declareFunction("cyc_plus_quantities", "CYC-PLUS-QUANTITIES", 2, 0, false);
            declareFunction("cyc_plus_quantities_int", "CYC-PLUS-QUANTITIES-INT", 2, 0, false);
            declareFunction("cyc_minus_quantities", "CYC-MINUS-QUANTITIES", 1, 0, false);
            declareFunction("cyc_quantity_conversion", "CYC-QUANTITY-CONVERSION", 2, 0, false);
            declareFunction("convert_quantity", "CONVERT-QUANTITY", 2, 0, false);
            declareFunction("cyc_quantity_conversion_absolute", "CYC-QUANTITY-CONVERSION-ABSOLUTE", 2, 0, false);
            declareFunction("convert_quantity_absolute", "CONVERT-QUANTITY-ABSOLUTE", 2, 0, false);
            declareFunction("cycl_real_number_to_number", "CYCL-REAL-NUMBER-TO-NUMBER", 1, 0, false);
            declareFunction("cyc_times_quantities", "CYC-TIMES-QUANTITIES", 2, 0, false);
            declareFunction("cyc_times_quantities_int", "CYC-TIMES-QUANTITIES-INT", 2, 0, false);
            declareFunction("fuzzy_numberP", "FUZZY-NUMBER?", 1, 0, false);
            declareFunction("cyc_quotient", "CYC-QUOTIENT", 2, 0, false);
            declareFunction("cyc_inverse", "CYC-INVERSE", 1, 0, false);
            declareFunction("cyc_modulo", "CYC-MODULO", 2, 0, false);
            declareFunction("sanity_check_cyc_modulo", "SANITY-CHECK-CYC-MODULO", 3, 0, false);
            declareFunction("cyc_residue", "CYC-RESIDUE", 1, 0, false);
            declareFunction("quantity_congruence_base", "QUANTITY-CONGRUENCE-BASE", 1, 0, false);
            declareFunction("unit_of_measure_type", "UNIT-OF-MEASURE-TYPE", 1, 0, false);
            declareFunction("cyc_absolute_value", "CYC-ABSOLUTE-VALUE", 1, 0, false);
            declareFunction("cyc_sqrt", "CYC-SQRT", 1, 0, false);
            declareFunction("cyc_squared", "CYC-SQUARED", 1, 0, false);
            declareFunction("cyc_percent", "CYC-PERCENT", 1, 0, false);
            declareFunction("cyc_round_up", "CYC-ROUND-UP", 1, 0, false);
            declareFunction("cyc_round_closest", "CYC-ROUND-CLOSEST", 1, 0, false);
            declareFunction("cyc_round_down", "CYC-ROUND-DOWN", 1, 0, false);
            declareFunction("cyc_round_truncate", "CYC-ROUND-TRUNCATE", 1, 0, false);
            declareFunction("cyc_round_internal", "CYC-ROUND-INTERNAL", 2, 1, false);
            declareFunction("round_to_nth_decimal", "ROUND-TO-NTH-DECIMAL", 1, 1, false);
            declareFunction("cyc_round_closest_to_nth_decimal", "CYC-ROUND-CLOSEST-TO-NTH-DECIMAL", 2, 0, false);
            declareFunction("cyc_max_range", "CYC-MAX-RANGE", 1, 0, false);
            declareFunction("cyc_max_range_internal", "CYC-MAX-RANGE-INTERNAL", 2, 0, false);
            declareFunction("cyc_min_range", "CYC-MIN-RANGE", 1, 0, false);
            declareFunction("cyc_min_range_internal", "CYC-MIN-RANGE-INTERNAL", 2, 0, false);
            declareFunction("cyc_min_quant_value", "CYC-MIN-QUANT-VALUE", 1, 0, false);
            declareFunction("cyc_max_quant_value", "CYC-MAX-QUANT-VALUE", 1, 0, false);
            declareFunction("cyc_quantity_unit", "CYC-QUANTITY-UNIT", 1, 0, false);
            declareFunction("cyc_quantity_measure", "CYC-QUANTITY-MEASURE", 1, 0, false);
            declareFunction("cyc_tolerance", "CYC-TOLERANCE", 2, 0, false);
            declareFunction("cyc_tolerance_internal", "CYC-TOLERANCE-INTERNAL", 5, 0, false);
            declareFunction("cyc_significant_digits", "CYC-SIGNIFICANT-DIGITS", 2, 0, false);
            declareFunction("cyc_sine", "CYC-SINE", 1, 0, false);
            declareFunction("cyc_cosine", "CYC-COSINE", 1, 0, false);
            declareFunction("cyc_tangent", "CYC-TANGENT", 1, 0, false);
            declareFunction("cyc_cosecant", "CYC-COSECANT", 1, 0, false);
            declareFunction("cyc_secant", "CYC-SECANT", 1, 0, false);
            declareFunction("cyc_cotangent", "CYC-COTANGENT", 1, 0, false);
            declareFunction("cyc_trig_internal", "CYC-TRIG-INTERNAL", 2, 0, false);
            declareFunction("cyc_arc_sine", "CYC-ARC-SINE", 1, 0, false);
            declareFunction("cyc_arc_cosine", "CYC-ARC-COSINE", 1, 0, false);
            declareFunction("cyc_arc_tangent", "CYC-ARC-TANGENT", 1, 0, false);
            declareFunction("cyc_arc_cosecant", "CYC-ARC-COSECANT", 1, 0, false);
            declareFunction("cyc_arc_secant", "CYC-ARC-SECANT", 1, 0, false);
            declareFunction("cyc_arc_cotangent", "CYC-ARC-COTANGENT", 1, 0, false);
            declareFunction("cyc_inverse_trig_internal", "CYC-INVERSE-TRIG-INTERNAL", 2, 0, false);
            declareFunction("cyc_logarithm", "CYC-LOGARITHM", 2, 0, false);
            declareFunction("cyc_exponent", "CYC-EXPONENT", 2, 0, false);
            declareFunction("cyc_quadratic_solution_positive", "CYC-QUADRATIC-SOLUTION-POSITIVE", 3, 0, false);
            declareFunction("cyc_quadratic_solution_negative", "CYC-QUADRATIC-SOLUTION-NEGATIVE", 3, 0, false);
            declareFunction("cyc_collection_subsumption_paths", "CYC-COLLECTION-SUBSUMPTION-PATHS", 1, 0, false);
            declareFunction("cyc_predicate_subsumption_paths", "CYC-PREDICATE-SUBSUMPTION-PATHS", 1, 0, false);
            declareFunction("cyc_less_than_quantities", "CYC-LESS-THAN-QUANTITIES", 2, 0, false);
            declareFunction("negate_fraction", "NEGATE-FRACTION", 1, 0, false);
            declareFunction("following_valueP", "FOLLOWING-VALUE?", 2, 1, false);
            declareFunction("convert_fraction_to_real_number", "CONVERT-FRACTION-TO-REAL-NUMBER", 1, 0, false);
            declareFunction("convert_fraction_to_simple_fraction", "CONVERT-FRACTION-TO-SIMPLE-FRACTION", 1, 0, false);
            declareFunction("convert_mixed_fraction_to_simple_fraction", "CONVERT-MIXED-FRACTION-TO-SIMPLE-FRACTION", 1, 0, false);
            declareFunction("convert_negative_mixed_fraction_to_simple_fraction", "CONVERT-NEGATIVE-MIXED-FRACTION-TO-SIMPLE-FRACTION", 1, 0, false);
            declareFunction("convert_simple_fraction_to_mixed_fraction", "CONVERT-SIMPLE-FRACTION-TO-MIXED-FRACTION", 1, 0, false);
            declareFunction("convert_simple_fraction_to_fraction", "CONVERT-SIMPLE-FRACTION-TO-FRACTION", 1, 0, false);
            declareFunction("convert_mixed_fraction_to_simple_fraction_internal", "CONVERT-MIXED-FRACTION-TO-SIMPLE-FRACTION-INTERNAL", 3, 0, false);
            declareFunction("convert_decimal_fraction_to_simple_fraction", "CONVERT-DECIMAL-FRACTION-TO-SIMPLE-FRACTION", 1, 0, false);
            declareFunction("fractionsL", "FRACTIONS<", 2, 0, false);
            declareFunction("fractionsLE", "FRACTIONS<=", 2, 0, false);
            declareFunction("normalize_fractions", "NORMALIZE-FRACTIONS", 2, 0, false);
            declareFunction("cyc_less_than_or_equal_to_quantities", "CYC-LESS-THAN-OR-EQUAL-TO-QUANTITIES", 2, 0, false);
            declareFunction("cyc_quantity_subsumes", "CYC-QUANTITY-SUBSUMES", 2, 0, false);
            declareFunction("cyc_quantity_subsumes_proper_intervals", "CYC-QUANTITY-SUBSUMES-PROPER-INTERVALS", 2, 0, false);
            declareFunction("cyc_quantity_intersects", "CYC-QUANTITY-INTERSECTS", 2, 0, false);
            declareFunction("cyc_quantity_intersects_proper_intervals", "CYC-QUANTITY-INTERSECTS-PROPER-INTERVALS", 2, 0, false);
            declareFunction("cyc_divides_evenly", "CYC-DIVIDES-EVENLY", 2, 0, false);
            declareFunction("cyc_list_nth", "CYC-LIST-NTH", 2, 0, false);
            declareFunction("cyc_list_concatenate", "CYC-LIST-CONCATENATE", 1, 0, false);
            declareFunction("cyc_append_to_list", "CYC-APPEND-TO-LIST", 2, 0, false);
            declareFunction("cyc_prepend_to_list", "CYC-PREPEND-TO-LIST", 2, 0, false);
            declareFunction("cyc_list_first", "CYC-LIST-FIRST", 1, 0, false);
            declareFunction("cyc_list_second", "CYC-LIST-SECOND", 1, 0, false);
            declareFunction("cyc_list_rest", "CYC-LIST-REST", 1, 0, false);
            declareFunction("cyc_list_last", "CYC-LIST-LAST", 1, 0, false);
            declareFunction("cyc_list_subseq", "CYC-LIST-SUBSEQ", 3, 0, false);
            declareFunction("cyc_list_subseq_up_to", "CYC-LIST-SUBSEQ-UP-TO", 3, 0, false);
            declareFunction("cyc_list_search", "CYC-LIST-SEARCH", 2, 0, false);
            declareFunction("cyc_position", "CYC-POSITION", 2, 0, false);
            declareFunction("cyc_list_length", "CYC-LIST-LENGTH", 1, 0, false);
            declareFunction("cyc_list_reverse", "CYC-LIST-REVERSE", 1, 0, false);
            declareFunction("cyc_list_member_set", "CYC-LIST-MEMBER-SET", 1, 0, false);
            declareFunction("cyc_set_element_list", "CYC-SET-ELEMENT-LIST", 1, 0, false);
            declareFunction("cyc_substitute_from_list", "CYC-SUBSTITUTE-FROM-LIST", 2, 0, false);
            declareFunction("doubleton_to_cons", "DOUBLETON-TO-CONS", 1, 0, false);
            declareFunction("cyc_substitute_from_the_term_binding_set", "CYC-SUBSTITUTE-FROM-THE-TERM-BINDING-SET", 2, 0, false);
            declareFunction("cyc_remove_adjacent_duplicates_from_list_fn", "CYC-REMOVE-ADJACENT-DUPLICATES-FROM-LIST-FN", 1, 0, false);
            declareFunction("cyc_map_function_over_list", "CYC-MAP-FUNCTION-OVER-LIST", 2, 0, false);
            declareFunction("cyc_map_function_int", "CYC-MAP-FUNCTION-INT", 2, 0, false);
            declareFunction("cyc_map_function_over_list_until", "CYC-MAP-FUNCTION-OVER-LIST-UNTIL", 3, 0, false);
            declareFunction("cyc_map_function_until_int", "CYC-MAP-FUNCTION-UNTIL-INT", 3, 0, false);
            declareFunction("cyc_map_function_over_list_until_result", "CYC-MAP-FUNCTION-OVER-LIST-UNTIL-RESULT", 3, 0, false);
            declareFunction("cyc_map_function_until_result_int", "CYC-MAP-FUNCTION-UNTIL-RESULT-INT", 3, 0, false);
            declareFunction("cyc_map_function_with_args_over_lists", "CYC-MAP-FUNCTION-WITH-ARGS-OVER-LISTS", 5, 0, false);
            declareFunction("cyc_map_function_with_args_over_lists_int", "CYC-MAP-FUNCTION-WITH-ARGS-OVER-LISTS-INT", 5, 0, false);
            declareFunction("cyc_apply_function_recursively", "CYC-APPLY-FUNCTION-RECURSIVELY", 3, 0, false);
            declareFunction("cyc_list_memberP", "CYC-LIST-MEMBER?", 2, 0, false);
            declareFunction("cyc_list_contains_memberP", "CYC-LIST-CONTAINS-MEMBER?", 2, 0, false);
            declareFunction("cyc_sublistP", "CYC-SUBLIST?", 2, 0, false);
            declareFunction("cyc_initial_sublistP", "CYC-INITIAL-SUBLIST?", 2, 0, false);
            declareFunction("cyc_non_empty_set_p", "CYC-NON-EMPTY-SET-P", 1, 0, false);
            declareFunction("cyc_empty_set_p", "CYC-EMPTY-SET-P", 1, 0, false);
            declareFunction("cyc_set_p", "CYC-SET-P", 1, 0, false);
            declareFunction("extensional_set_p", "EXTENSIONAL-SET-P", 1, 0, false);
            declareFunction("intensional_set_p", "INTENSIONAL-SET-P", 1, 0, false);
            declareFunction("make_hl_extensional_set", "MAKE-HL-EXTENSIONAL-SET", 1, 0, false);
            declareFunction("evaluate_set_elements", "EVALUATE-SET-ELEMENTS", 1, 1, false);
            declareFunction("set_extent", "SET-EXTENT", 1, 2, false);
            declareFunction("cyc_set_intersection", "CYC-SET-INTERSECTION", 2, 0, false);
            declareFunction("cyc_set_union", "CYC-SET-UNION", 2, 0, false);
            declareFunction("cyc_set_difference", "CYC-SET-DIFFERENCE", 2, 0, false);
            declareFunction("cyc_set_extent", "CYC-SET-EXTENT", 1, 0, false);
            declareFunction("cyc_map_function_over_set", "CYC-MAP-FUNCTION-OVER-SET", 2, 0, false);
            declareFunction("cyc_least_common_multiple", "CYC-LEAST-COMMON-MULTIPLE", 1, 0, false);
            declareFunction("cyc_least_common_multiple_internal", "CYC-LEAST-COMMON-MULTIPLE-INTERNAL", 2, 0, false);
            declareFunction("cyc_greatest_common_divisor", "CYC-GREATEST-COMMON-DIVISOR", 1, 0, false);
            declareFunction("cyc_greatest_common_divisor_internal", "CYC-GREATEST-COMMON-DIVISOR-INTERNAL", 2, 0, false);
            declareFunction("integer_valuedP", "INTEGER-VALUED?", 1, 0, false);
            declareFunction("cyc_random_integer", "CYC-RANDOM-INTEGER", 1, 0, false);
            declareFunction("cyc_random_integer_with_seed", "CYC-RANDOM-INTEGER-WITH-SEED", 2, 0, false);
            declareFunction("cyc_n_random_integers", "CYC-N-RANDOM-INTEGERS", 2, 0, false);
            declareFunction("cyc_matrix_solution", "CYC-MATRIX-SOLUTION", 1, 0, false);
            declareFunction("get_interconvertible_units_of_measure", "GET-INTERCONVERTIBLE-UNITS-OF-MEASURE", 0, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("cyc_round_internal", "CYC-ROUND-INTERNAL", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_quantities_file_Previous() {
        declareFunction("initialize_quant_kb_feature", "INITIALIZE-QUANT-KB-FEATURE", 0, 0, false);
        declareFunction("cyc_scalar_interval_p", "CYC-SCALAR-INTERVAL-P", 1, 0, false);
        declareFunction("list_of_cyc_scalar_interval_p", "LIST-OF-CYC-SCALAR-INTERVAL-P", 1, 0, false);
        declareFunction("make_interval", "MAKE-INTERVAL", 2, 1, false);
        declareFunction("explode_interval_ignoring_unevaluatable", "EXPLODE-INTERVAL-IGNORING-UNEVALUATABLE", 1, 0, false);
        declareFunction("explode_interval", "EXPLODE-INTERVAL", 1, 0, false);
        declareFunction("explode_fort_interval", "EXPLODE-FORT-INTERVAL", 1, 0, false);
        declareFunction("max_quant_value", "MAX-QUANT-VALUE", 1, 1, false);
        declareFunction("min_quant_value", "MIN-QUANT-VALUE", 1, 1, false);
        declareFunction("comparable_units", "COMPARABLE-UNITS", 2, 0, false);
        declareFunction("smaller_unit_than", "SMALLER-UNIT-THAN", 2, 0, false);
        declareFunction("convert_to_units", "CONVERT-TO-UNITS", 3, 1, false);
        declareFunction("convert_to_units_absolute", "CONVERT-TO-UNITS-ABSOLUTE", 3, 1, false);
        declareFunction("unit_multiplication_factor", "UNIT-MULTIPLICATION-FACTOR", 2, 1, false);
        declareFunction("get_unit_multiplication_factor", "GET-UNIT-MULTIPLICATION-FACTOR", 2, 0, false);
        declareFunction("get_unit_absolute_scale_offset", "GET-UNIT-ABSOLUTE-SCALE-OFFSET", 2, 0, false);
        declareFunction("clear_get_definitional_unit_multiplication_factor", "CLEAR-GET-DEFINITIONAL-UNIT-MULTIPLICATION-FACTOR", 0, 0, false);
        declareFunction("remove_get_definitional_unit_multiplication_factor", "REMOVE-GET-DEFINITIONAL-UNIT-MULTIPLICATION-FACTOR", 2, 0, false);
        declareFunction("get_definitional_unit_multiplication_factor_internal", "GET-DEFINITIONAL-UNIT-MULTIPLICATION-FACTOR-INTERNAL", 2, 0, false);
        declareFunction("get_definitional_unit_multiplication_factor", "GET-DEFINITIONAL-UNIT-MULTIPLICATION-FACTOR", 2, 0, false);
        declareFunction("get_contingent_unit_multiplication_factor", "GET-CONTINGENT-UNIT-MULTIPLICATION-FACTOR", 2, 0, false);
        declareFunction("get_unit_multiplication_factor_int", "GET-UNIT-MULTIPLICATION-FACTOR-INT", 3, 0, false);
        declareFunction("get_umf", "GET-UMF", 3, 0, false);
        declareFunction("get_umf_internal", "GET-UMF-INTERNAL", 1, 0, false);
        declareFunction("gather_umf_assertions", "GATHER-UMF-ASSERTIONS", 1, 0, false);
        declareFunction("get_umf_gather_factor", "GET-UMF-GATHER-FACTOR", 2, 0, false);
        declareFunction("unit_times", "UNIT-TIMES", 2, 0, false);
        declareFunction("unit_quotient", "UNIT-QUOTIENT", 2, 0, false);
        declareFunction("unit_sqrt", "UNIT-SQRT", 1, 0, false);
        declareFunction("complex_unit_times", "COMPLEX-UNIT-TIMES", 2, 0, false);
        declareFunction("complex_per_fn_unit_times", "COMPLEX-PER-FN-UNIT-TIMES", 2, 0, false);
        declareFunction("complex_unit_quotient", "COMPLEX-UNIT-QUOTIENT", 2, 0, false);
        declareFunction("complex_per_fn_unit_quotient", "COMPLEX-PER-FN-UNIT-QUOTIENT", 2, 0, false);
        declareFunction("complex_unit_sqrt", "COMPLEX-UNIT-SQRT", 1, 0, false);
        declareFunction("per_fn_unit", "PER-FN-UNIT", 1, 0, false);
        declareFunction("make_and_simplify_interval", "MAKE-AND-SIMPLIFY-INTERVAL", 2, 1, false);
        declareFunction("term_unify_with_units", "TERM-UNIFY-WITH-UNITS", 2, 0, false);
        declareFunction("cyc_integer_range", "CYC-INTEGER-RANGE", 1, 0, false);
        declareFunction("cyc_number_range", "CYC-NUMBER-RANGE", 1, 0, false);
        declareFunction("cyc_plus_quantities", "CYC-PLUS-QUANTITIES", 2, 0, false);
        declareFunction("cyc_plus_quantities_int", "CYC-PLUS-QUANTITIES-INT", 2, 0, false);
        declareFunction("cyc_minus_quantities", "CYC-MINUS-QUANTITIES", 1, 0, false);
        declareFunction("cyc_quantity_conversion", "CYC-QUANTITY-CONVERSION", 2, 0, false);
        declareFunction("convert_quantity", "CONVERT-QUANTITY", 2, 0, false);
        declareFunction("cyc_quantity_conversion_absolute", "CYC-QUANTITY-CONVERSION-ABSOLUTE", 2, 0, false);
        declareFunction("convert_quantity_absolute", "CONVERT-QUANTITY-ABSOLUTE", 2, 0, false);
        declareFunction("cycl_real_number_to_number", "CYCL-REAL-NUMBER-TO-NUMBER", 1, 0, false);
        declareFunction("cyc_times_quantities", "CYC-TIMES-QUANTITIES", 2, 0, false);
        declareFunction("cyc_times_quantities_int", "CYC-TIMES-QUANTITIES-INT", 2, 0, false);
        declareFunction("fuzzy_numberP", "FUZZY-NUMBER?", 1, 0, false);
        declareFunction("cyc_quotient", "CYC-QUOTIENT", 2, 0, false);
        declareFunction("cyc_inverse", "CYC-INVERSE", 1, 0, false);
        declareFunction("cyc_modulo", "CYC-MODULO", 2, 0, false);
        declareFunction("sanity_check_cyc_modulo", "SANITY-CHECK-CYC-MODULO", 3, 0, false);
        declareFunction("cyc_residue", "CYC-RESIDUE", 1, 0, false);
        declareFunction("quantity_congruence_base", "QUANTITY-CONGRUENCE-BASE", 1, 0, false);
        declareFunction("unit_of_measure_type", "UNIT-OF-MEASURE-TYPE", 1, 0, false);
        declareFunction("cyc_absolute_value", "CYC-ABSOLUTE-VALUE", 1, 0, false);
        declareFunction("cyc_sqrt", "CYC-SQRT", 1, 0, false);
        declareFunction("cyc_squared", "CYC-SQUARED", 1, 0, false);
        declareFunction("cyc_percent", "CYC-PERCENT", 1, 0, false);
        declareFunction("cyc_round_up", "CYC-ROUND-UP", 1, 0, false);
        declareFunction("cyc_round_closest", "CYC-ROUND-CLOSEST", 1, 0, false);
        declareFunction("cyc_round_down", "CYC-ROUND-DOWN", 1, 0, false);
        declareFunction("cyc_round_truncate", "CYC-ROUND-TRUNCATE", 1, 0, false);
        declareFunction("cyc_round_internal", "CYC-ROUND-INTERNAL", 2, 1, false);
        declareFunction("round_to_nth_decimal", "ROUND-TO-NTH-DECIMAL", 1, 1, false);
        declareFunction("cyc_round_closest_to_nth_decimal", "CYC-ROUND-CLOSEST-TO-NTH-DECIMAL", 2, 0, false);
        declareFunction("cyc_max_range", "CYC-MAX-RANGE", 1, 0, false);
        declareFunction("cyc_max_range_internal", "CYC-MAX-RANGE-INTERNAL", 2, 0, false);
        declareFunction("cyc_min_range", "CYC-MIN-RANGE", 1, 0, false);
        declareFunction("cyc_min_range_internal", "CYC-MIN-RANGE-INTERNAL", 2, 0, false);
        declareFunction("cyc_min_quant_value", "CYC-MIN-QUANT-VALUE", 1, 0, false);
        declareFunction("cyc_max_quant_value", "CYC-MAX-QUANT-VALUE", 1, 0, false);
        declareFunction("cyc_quantity_unit", "CYC-QUANTITY-UNIT", 1, 0, false);
        declareFunction("cyc_quantity_measure", "CYC-QUANTITY-MEASURE", 1, 0, false);
        declareFunction("cyc_tolerance", "CYC-TOLERANCE", 2, 0, false);
        declareFunction("cyc_tolerance_internal", "CYC-TOLERANCE-INTERNAL", 5, 0, false);
        declareFunction("cyc_significant_digits", "CYC-SIGNIFICANT-DIGITS", 2, 0, false);
        declareFunction("cyc_sine", "CYC-SINE", 1, 0, false);
        declareFunction("cyc_cosine", "CYC-COSINE", 1, 0, false);
        declareFunction("cyc_tangent", "CYC-TANGENT", 1, 0, false);
        declareFunction("cyc_cosecant", "CYC-COSECANT", 1, 0, false);
        declareFunction("cyc_secant", "CYC-SECANT", 1, 0, false);
        declareFunction("cyc_cotangent", "CYC-COTANGENT", 1, 0, false);
        declareFunction("cyc_trig_internal", "CYC-TRIG-INTERNAL", 2, 0, false);
        declareFunction("cyc_arc_sine", "CYC-ARC-SINE", 1, 0, false);
        declareFunction("cyc_arc_cosine", "CYC-ARC-COSINE", 1, 0, false);
        declareFunction("cyc_arc_tangent", "CYC-ARC-TANGENT", 1, 0, false);
        declareFunction("cyc_arc_cosecant", "CYC-ARC-COSECANT", 1, 0, false);
        declareFunction("cyc_arc_secant", "CYC-ARC-SECANT", 1, 0, false);
        declareFunction("cyc_arc_cotangent", "CYC-ARC-COTANGENT", 1, 0, false);
        declareFunction("cyc_inverse_trig_internal", "CYC-INVERSE-TRIG-INTERNAL", 2, 0, false);
        declareFunction("cyc_logarithm", "CYC-LOGARITHM", 2, 0, false);
        declareFunction("cyc_exponent", "CYC-EXPONENT", 2, 0, false);
        declareFunction("cyc_quadratic_solution_positive", "CYC-QUADRATIC-SOLUTION-POSITIVE", 3, 0, false);
        declareFunction("cyc_quadratic_solution_negative", "CYC-QUADRATIC-SOLUTION-NEGATIVE", 3, 0, false);
        declareFunction("cyc_collection_subsumption_paths", "CYC-COLLECTION-SUBSUMPTION-PATHS", 1, 0, false);
        declareFunction("cyc_predicate_subsumption_paths", "CYC-PREDICATE-SUBSUMPTION-PATHS", 1, 0, false);
        declareFunction("cyc_less_than_quantities", "CYC-LESS-THAN-QUANTITIES", 2, 0, false);
        declareFunction("negate_fraction", "NEGATE-FRACTION", 1, 0, false);
        declareFunction("following_valueP", "FOLLOWING-VALUE?", 2, 1, false);
        declareFunction("convert_fraction_to_real_number", "CONVERT-FRACTION-TO-REAL-NUMBER", 1, 0, false);
        declareFunction("convert_fraction_to_simple_fraction", "CONVERT-FRACTION-TO-SIMPLE-FRACTION", 1, 0, false);
        declareFunction("convert_mixed_fraction_to_simple_fraction", "CONVERT-MIXED-FRACTION-TO-SIMPLE-FRACTION", 1, 0, false);
        declareFunction("convert_negative_mixed_fraction_to_simple_fraction", "CONVERT-NEGATIVE-MIXED-FRACTION-TO-SIMPLE-FRACTION", 1, 0, false);
        declareFunction("convert_simple_fraction_to_mixed_fraction", "CONVERT-SIMPLE-FRACTION-TO-MIXED-FRACTION", 1, 0, false);
        declareFunction("convert_simple_fraction_to_fraction", "CONVERT-SIMPLE-FRACTION-TO-FRACTION", 1, 0, false);
        declareFunction("convert_mixed_fraction_to_simple_fraction_internal", "CONVERT-MIXED-FRACTION-TO-SIMPLE-FRACTION-INTERNAL", 3, 0, false);
        declareFunction("convert_decimal_fraction_to_simple_fraction", "CONVERT-DECIMAL-FRACTION-TO-SIMPLE-FRACTION", 1, 0, false);
        declareFunction("fractionsL", "FRACTIONS<", 2, 0, false);
        declareFunction("fractionsLE", "FRACTIONS<=", 2, 0, false);
        declareFunction("normalize_fractions", "NORMALIZE-FRACTIONS", 2, 0, false);
        declareFunction("cyc_less_than_or_equal_to_quantities", "CYC-LESS-THAN-OR-EQUAL-TO-QUANTITIES", 2, 0, false);
        declareFunction("cyc_quantity_subsumes", "CYC-QUANTITY-SUBSUMES", 2, 0, false);
        declareFunction("cyc_quantity_subsumes_proper_intervals", "CYC-QUANTITY-SUBSUMES-PROPER-INTERVALS", 2, 0, false);
        declareFunction("cyc_quantity_intersects", "CYC-QUANTITY-INTERSECTS", 2, 0, false);
        declareFunction("cyc_quantity_intersects_proper_intervals", "CYC-QUANTITY-INTERSECTS-PROPER-INTERVALS", 2, 0, false);
        declareFunction("cyc_divides_evenly", "CYC-DIVIDES-EVENLY", 2, 0, false);
        declareFunction("cyc_list_nth", "CYC-LIST-NTH", 2, 0, false);
        declareFunction("cyc_list_concatenate", "CYC-LIST-CONCATENATE", 1, 0, false);
        declareFunction("cyc_append_to_list", "CYC-APPEND-TO-LIST", 2, 0, false);
        declareFunction("cyc_prepend_to_list", "CYC-PREPEND-TO-LIST", 2, 0, false);
        declareFunction("cyc_list_first", "CYC-LIST-FIRST", 1, 0, false);
        declareFunction("cyc_list_second", "CYC-LIST-SECOND", 1, 0, false);
        declareFunction("cyc_list_rest", "CYC-LIST-REST", 1, 0, false);
        declareFunction("cyc_list_last", "CYC-LIST-LAST", 1, 0, false);
        declareFunction("cyc_list_subseq", "CYC-LIST-SUBSEQ", 3, 0, false);
        declareFunction("cyc_list_subseq_up_to", "CYC-LIST-SUBSEQ-UP-TO", 3, 0, false);
        declareFunction("cyc_list_search", "CYC-LIST-SEARCH", 2, 0, false);
        declareFunction("cyc_position", "CYC-POSITION", 2, 0, false);
        declareFunction("cyc_list_length", "CYC-LIST-LENGTH", 1, 0, false);
        declareFunction("cyc_list_reverse", "CYC-LIST-REVERSE", 1, 0, false);
        declareFunction("cyc_list_member_set", "CYC-LIST-MEMBER-SET", 1, 0, false);
        declareFunction("cyc_set_element_list", "CYC-SET-ELEMENT-LIST", 1, 0, false);
        declareFunction("cyc_substitute_from_list", "CYC-SUBSTITUTE-FROM-LIST", 2, 0, false);
        declareFunction("doubleton_to_cons", "DOUBLETON-TO-CONS", 1, 0, false);
        declareFunction("cyc_substitute_from_the_term_binding_set", "CYC-SUBSTITUTE-FROM-THE-TERM-BINDING-SET", 2, 0, false);
        declareFunction("cyc_remove_adjacent_duplicates_from_list_fn", "CYC-REMOVE-ADJACENT-DUPLICATES-FROM-LIST-FN", 1, 0, false);
        declareFunction("cyc_map_function_over_list", "CYC-MAP-FUNCTION-OVER-LIST", 2, 0, false);
        declareFunction("cyc_map_function_int", "CYC-MAP-FUNCTION-INT", 2, 0, false);
        declareFunction("cyc_map_function_over_list_until", "CYC-MAP-FUNCTION-OVER-LIST-UNTIL", 3, 0, false);
        declareFunction("cyc_map_function_until_int", "CYC-MAP-FUNCTION-UNTIL-INT", 3, 0, false);
        declareFunction("cyc_map_function_over_list_until_result", "CYC-MAP-FUNCTION-OVER-LIST-UNTIL-RESULT", 3, 0, false);
        declareFunction("cyc_map_function_until_result_int", "CYC-MAP-FUNCTION-UNTIL-RESULT-INT", 3, 0, false);
        declareFunction("cyc_map_function_with_args_over_lists", "CYC-MAP-FUNCTION-WITH-ARGS-OVER-LISTS", 5, 0, false);
        declareFunction("cyc_map_function_with_args_over_lists_int", "CYC-MAP-FUNCTION-WITH-ARGS-OVER-LISTS-INT", 5, 0, false);
        declareFunction("cyc_apply_function_recursively", "CYC-APPLY-FUNCTION-RECURSIVELY", 3, 0, false);
        declareFunction("cyc_list_memberP", "CYC-LIST-MEMBER?", 2, 0, false);
        declareFunction("cyc_list_contains_memberP", "CYC-LIST-CONTAINS-MEMBER?", 2, 0, false);
        declareFunction("cyc_sublistP", "CYC-SUBLIST?", 2, 0, false);
        declareFunction("cyc_initial_sublistP", "CYC-INITIAL-SUBLIST?", 2, 0, false);
        declareFunction("cyc_non_empty_set_p", "CYC-NON-EMPTY-SET-P", 1, 0, false);
        declareFunction("cyc_empty_set_p", "CYC-EMPTY-SET-P", 1, 0, false);
        declareFunction("cyc_set_p", "CYC-SET-P", 1, 0, false);
        declareFunction("extensional_set_p", "EXTENSIONAL-SET-P", 1, 0, false);
        declareFunction("intensional_set_p", "INTENSIONAL-SET-P", 1, 0, false);
        declareFunction("make_hl_extensional_set", "MAKE-HL-EXTENSIONAL-SET", 1, 0, false);
        declareFunction("evaluate_set_elements", "EVALUATE-SET-ELEMENTS", 1, 1, false);
        declareFunction("set_extent", "SET-EXTENT", 1, 2, false);
        declareFunction("cyc_set_intersection", "CYC-SET-INTERSECTION", 2, 0, false);
        declareFunction("cyc_set_union", "CYC-SET-UNION", 2, 0, false);
        declareFunction("cyc_set_difference", "CYC-SET-DIFFERENCE", 2, 0, false);
        declareFunction("cyc_set_extent", "CYC-SET-EXTENT", 1, 0, false);
        declareFunction("cyc_map_function_over_set", "CYC-MAP-FUNCTION-OVER-SET", 2, 0, false);
        declareFunction("cyc_least_common_multiple", "CYC-LEAST-COMMON-MULTIPLE", 1, 0, false);
        declareFunction("cyc_least_common_multiple_internal", "CYC-LEAST-COMMON-MULTIPLE-INTERNAL", 2, 0, false);
        declareFunction("cyc_greatest_common_divisor", "CYC-GREATEST-COMMON-DIVISOR", 1, 0, false);
        declareFunction("cyc_greatest_common_divisor_internal", "CYC-GREATEST-COMMON-DIVISOR-INTERNAL", 2, 0, false);
        declareFunction("integer_valuedP", "INTEGER-VALUED?", 1, 0, false);
        declareFunction("cyc_random_integer", "CYC-RANDOM-INTEGER", 1, 0, false);
        declareFunction("cyc_random_integer_with_seed", "CYC-RANDOM-INTEGER-WITH-SEED", 2, 0, false);
        declareFunction("cyc_n_random_integers", "CYC-N-RANDOM-INTEGERS", 2, 0, false);
        declareFunction("cyc_matrix_solution", "CYC-MATRIX-SOLUTION", 1, 0, false);
        declareFunction("get_interconvertible_units_of_measure", "GET-INTERCONVERTIBLE-UNITS-OF-MEASURE", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_quantities_file() {
        defparameter("*CONVERT-UNITS-AS-ABSOLUTES?*", NIL);
        deflexical("*QUANT-CORE-CONSTANTS*", $list0);
        defparameter("*GET-UMF-SEARCH-STATE*", NIL);
        defparameter("*GET-UMF-PATHS*", NIL);
        defparameter("*GET-UMF-ALLOW-FRACTIONS?*", NIL);
        deflexical("*GET-DEFINITIONAL-UNIT-MULTIPLICATION-FACTOR-CACHING-STATE*", NIL);
        defparameter("*ROUND-NTH-N*", ZERO_INTEGER);
        defparameter("*ROUND-NTH-OUTPUT-FORMAT*", $SUBL);
        return NIL;
    }

    public static final SubLObject setup_quantities_file_alt() {
        memoization_state.note_globally_cached_function(GET_DEFINITIONAL_UNIT_MULTIPLICATION_FACTOR);
        if (CYC_INTEGER_RANGE.isSymbol()) {
            {
                SubLObject item_var = CYC_INTEGER_RANGE;
                if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
                }
            }
        }
        register_kb_function(CYC_INTEGER_RANGE);
        if (CYC_NUMBER_RANGE.isSymbol()) {
            {
                SubLObject item_var = CYC_NUMBER_RANGE;
                if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
                }
            }
        }
        register_kb_function(CYC_NUMBER_RANGE);
        register_kb_function(CYC_QUANTITY_CONVERSION);
        register_kb_function(CYC_QUOTIENT);
        register_kb_function(CYC_INVERSE);
        register_kb_function(CYC_MODULO);
        register_kb_function(CYC_RESIDUE);
        register_kb_function(CYC_ABSOLUTE_VALUE);
        register_kb_function(CYC_SQRT);
        register_kb_function(CYC_SQUARED);
        register_kb_function(CYC_PERCENT);
        register_kb_function(CYC_ROUND_UP);
        register_kb_function(CYC_ROUND_CLOSEST);
        register_kb_function(CYC_ROUND_DOWN);
        register_kb_function(CYC_ROUND_TRUNCATE);
        register_kb_function(CYC_MAX_RANGE);
        register_kb_function(CYC_MIN_RANGE);
        register_kb_function(CYC_MIN_QUANT_VALUE);
        register_kb_function(CYC_MAX_QUANT_VALUE);
        register_kb_function(CYC_TOLERANCE);
        register_kb_function(CYC_SIGNIFICANT_DIGITS);
        register_kb_function(CYC_SINE);
        register_kb_function(CYC_COSINE);
        register_kb_function(CYC_TANGENT);
        register_kb_function(CYC_COSECANT);
        register_kb_function(CYC_SECANT);
        register_kb_function(CYC_COTANGENT);
        register_kb_function(CYC_ARC_SINE);
        register_kb_function(CYC_ARC_COSINE);
        register_kb_function(CYC_ARC_TANGENT);
        register_kb_function(CYC_ARC_COSECANT);
        register_kb_function(CYC_ARC_SECANT);
        register_kb_function(CYC_ARC_COTANGENT);
        register_kb_function(CYC_LOGARITHM);
        register_kb_function(CYC_EXPONENT);
        register_kb_function(CYC_QUADRATIC_SOLUTION_POSITIVE);
        register_kb_function(CYC_QUADRATIC_SOLUTION_NEGATIVE);
        register_kb_function(CYC_COLLECTION_SUBSUMPTION_PATHS);
        register_kb_function(CYC_PREDICATE_SUBSUMPTION_PATHS);
        register_kb_function(CYC_QUANTITY_SUBSUMES);
        register_kb_function(CYC_QUANTITY_INTERSECTS);
        register_kb_function(CYC_LIST_NTH);
        register_kb_function(CYC_LIST_CONCATENATE);
        register_kb_function(CYC_LIST_FIRST);
        register_kb_function(CYC_LIST_REST);
        register_kb_function(CYC_LIST_LAST);
        register_kb_function(CYC_LIST_SUBSEQ);
        register_kb_function(CYC_LIST_SEARCH);
        register_kb_function(CYC_POSITION);
        register_kb_function(CYC_LIST_LENGTH);
        register_kb_function(CYC_LIST_REVERSE);
        register_kb_function(CYC_LIST_MEMBER_SET);
        register_kb_function(CYC_SUBSTITUTE_FROM_LIST);
        register_kb_function(CYC_MAP_FUNCTION_OVER_LIST);
        register_kb_function(CYC_MAP_FUNCTION_WITH_ARGS_OVER_LISTS);
        register_kb_function($sym118$CYC_LIST_MEMBER_);
        define_obsolete_register($sym119$CYC_LIST_CONTAINS_MEMBER_, $list_alt120);
        register_kb_function($sym121$CYC_SUBLIST_);
        register_kb_function($sym122$CYC_INITIAL_SUBLIST_);
        register_kb_function(CYC_SET_INTERSECTION);
        register_kb_function(CYC_SET_UNION);
        register_kb_function(CYC_SET_DIFFERENCE);
        register_kb_function(CYC_SET_EXTENT);
        register_kb_function(CYC_MAP_FUNCTION_OVER_SET);
        register_kb_function(CYC_LEAST_COMMON_MULTIPLE);
        register_kb_function(CYC_GREATEST_COMMON_DIVISOR);
        register_kb_function(CYC_RANDOM_INTEGER);
        register_kb_function(CYC_N_RANDOM_INTEGERS);
        register_kb_function(CYC_MATRIX_SOLUTION);
        return NIL;
    }

    public static SubLObject setup_quantities_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_globally_cached_function(GET_DEFINITIONAL_UNIT_MULTIPLICATION_FACTOR);
            if (CYC_INTEGER_RANGE.isSymbol()) {
                final SubLObject item_var = CYC_INTEGER_RANGE;
                if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
                }
            }
            register_kb_function(CYC_INTEGER_RANGE);
            if (CYC_NUMBER_RANGE.isSymbol()) {
                final SubLObject item_var = CYC_NUMBER_RANGE;
                if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
                }
            }
            register_kb_function(CYC_NUMBER_RANGE);
            register_kb_function(CYC_QUANTITY_CONVERSION);
            register_kb_function(CYC_QUANTITY_CONVERSION_ABSOLUTE);
            register_kb_function(CYC_QUOTIENT);
            register_kb_function(CYC_INVERSE);
            register_kb_function(CYC_MODULO);
            register_kb_function(CYC_RESIDUE);
            register_kb_function(CYC_ABSOLUTE_VALUE);
            register_kb_function(CYC_SQRT);
            register_kb_function(CYC_SQUARED);
            register_kb_function(CYC_PERCENT);
            register_kb_function(CYC_ROUND_UP);
            register_kb_function(CYC_ROUND_CLOSEST);
            register_kb_function(CYC_ROUND_DOWN);
            register_kb_function(CYC_ROUND_TRUNCATE);
            register_kb_function(CYC_ROUND_CLOSEST_TO_NTH_DECIMAL);
            register_kb_function(CYC_MAX_RANGE);
            register_kb_function(CYC_MIN_RANGE);
            register_kb_function(CYC_MIN_QUANT_VALUE);
            register_kb_function(CYC_MAX_QUANT_VALUE);
            register_kb_function(CYC_QUANTITY_UNIT);
            register_kb_function(CYC_QUANTITY_MEASURE);
            register_kb_function(CYC_TOLERANCE);
            register_kb_function(CYC_SIGNIFICANT_DIGITS);
            register_kb_function(CYC_SINE);
            register_kb_function(CYC_COSINE);
            register_kb_function(CYC_TANGENT);
            register_kb_function(CYC_COSECANT);
            register_kb_function(CYC_SECANT);
            register_kb_function(CYC_COTANGENT);
            register_kb_function(CYC_ARC_SINE);
            register_kb_function(CYC_ARC_COSINE);
            register_kb_function(CYC_ARC_TANGENT);
            register_kb_function(CYC_ARC_COSECANT);
            register_kb_function(CYC_ARC_SECANT);
            register_kb_function(CYC_ARC_COTANGENT);
            register_kb_function(CYC_LOGARITHM);
            register_kb_function(CYC_EXPONENT);
            register_kb_function(CYC_QUADRATIC_SOLUTION_POSITIVE);
            register_kb_function(CYC_QUADRATIC_SOLUTION_NEGATIVE);
            register_kb_function(CYC_COLLECTION_SUBSUMPTION_PATHS);
            register_kb_function(CYC_PREDICATE_SUBSUMPTION_PATHS);
            register_kb_function(CYC_QUANTITY_SUBSUMES);
            register_kb_function(CYC_QUANTITY_INTERSECTS);
            register_kb_function(CYC_DIVIDES_EVENLY);
            register_kb_function(CYC_LIST_NTH);
            register_kb_function(CYC_LIST_CONCATENATE);
            register_kb_function(CYC_APPEND_TO_LIST);
            register_kb_function(CYC_PREPEND_TO_LIST);
            register_kb_function(CYC_LIST_FIRST);
            register_kb_function(CYC_LIST_SECOND);
            register_kb_function(CYC_LIST_REST);
            register_kb_function(CYC_LIST_LAST);
            register_kb_function(CYC_LIST_SUBSEQ);
            register_kb_function(CYC_LIST_SUBSEQ_UP_TO);
            register_kb_function(CYC_LIST_SEARCH);
            register_kb_function(CYC_POSITION);
            register_kb_function(CYC_LIST_LENGTH);
            register_kb_function(CYC_LIST_REVERSE);
            register_kb_function(CYC_LIST_MEMBER_SET);
            register_kb_function(CYC_SET_ELEMENT_LIST);
            register_kb_function(CYC_SUBSTITUTE_FROM_LIST);
            register_kb_function(CYC_SUBSTITUTE_FROM_THE_TERM_BINDING_SET);
            register_kb_function(CYC_REMOVE_ADJACENT_DUPLICATES_FROM_LIST_FN);
            register_kb_function(CYC_MAP_FUNCTION_OVER_LIST);
            register_kb_function(CYC_MAP_FUNCTION_OVER_LIST_UNTIL);
            register_kb_function(CYC_MAP_FUNCTION_OVER_LIST_UNTIL_RESULT);
            register_kb_function(CYC_MAP_FUNCTION_WITH_ARGS_OVER_LISTS);
            register_kb_function(CYC_APPLY_FUNCTION_RECURSIVELY);
            register_kb_function($sym154$CYC_LIST_MEMBER_);
            define_obsolete_register($sym155$CYC_LIST_CONTAINS_MEMBER_, $list156);
            register_kb_function($sym157$CYC_SUBLIST_);
            register_kb_function($sym158$CYC_INITIAL_SUBLIST_);
            register_kb_function(CYC_SET_INTERSECTION);
            register_kb_function(CYC_SET_UNION);
            register_kb_function(CYC_SET_DIFFERENCE);
            register_kb_function(CYC_SET_EXTENT);
            register_kb_function(CYC_MAP_FUNCTION_OVER_SET);
            register_kb_function(CYC_LEAST_COMMON_MULTIPLE);
            register_kb_function(CYC_GREATEST_COMMON_DIVISOR);
            register_kb_function(CYC_RANDOM_INTEGER);
            register_kb_function(CYC_RANDOM_INTEGER_WITH_SEED);
            register_kb_function(CYC_N_RANDOM_INTEGERS);
            register_kb_function(CYC_MATRIX_SOLUTION);
            register_external_symbol(GET_INTERCONVERTIBLE_UNITS_OF_MEASURE);
        }
        if (SubLFiles.USE_V2) {
            if (CYC_INTEGER_RANGE.isSymbol()) {
                {
                    SubLObject item_var = CYC_INTEGER_RANGE;
                    if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                        at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
                    }
                }
            }
            if (CYC_NUMBER_RANGE.isSymbol()) {
                {
                    SubLObject item_var = CYC_NUMBER_RANGE;
                    if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                        at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
                    }
                }
            }
            register_kb_function($sym118$CYC_LIST_MEMBER_);
            define_obsolete_register($sym119$CYC_LIST_CONTAINS_MEMBER_, $list_alt120);
            register_kb_function($sym121$CYC_SUBLIST_);
            register_kb_function($sym122$CYC_INITIAL_SUBLIST_);
        }
        return NIL;
    }

    public static SubLObject setup_quantities_file_Previous() {
        memoization_state.note_globally_cached_function(GET_DEFINITIONAL_UNIT_MULTIPLICATION_FACTOR);
        if (CYC_INTEGER_RANGE.isSymbol()) {
            final SubLObject item_var = CYC_INTEGER_RANGE;
            if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
            }
        }
        register_kb_function(CYC_INTEGER_RANGE);
        if (CYC_NUMBER_RANGE.isSymbol()) {
            final SubLObject item_var = CYC_NUMBER_RANGE;
            if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
            }
        }
        register_kb_function(CYC_NUMBER_RANGE);
        register_kb_function(CYC_QUANTITY_CONVERSION);
        register_kb_function(CYC_QUANTITY_CONVERSION_ABSOLUTE);
        register_kb_function(CYC_QUOTIENT);
        register_kb_function(CYC_INVERSE);
        register_kb_function(CYC_MODULO);
        register_kb_function(CYC_RESIDUE);
        register_kb_function(CYC_ABSOLUTE_VALUE);
        register_kb_function(CYC_SQRT);
        register_kb_function(CYC_SQUARED);
        register_kb_function(CYC_PERCENT);
        register_kb_function(CYC_ROUND_UP);
        register_kb_function(CYC_ROUND_CLOSEST);
        register_kb_function(CYC_ROUND_DOWN);
        register_kb_function(CYC_ROUND_TRUNCATE);
        register_kb_function(CYC_ROUND_CLOSEST_TO_NTH_DECIMAL);
        register_kb_function(CYC_MAX_RANGE);
        register_kb_function(CYC_MIN_RANGE);
        register_kb_function(CYC_MIN_QUANT_VALUE);
        register_kb_function(CYC_MAX_QUANT_VALUE);
        register_kb_function(CYC_QUANTITY_UNIT);
        register_kb_function(CYC_QUANTITY_MEASURE);
        register_kb_function(CYC_TOLERANCE);
        register_kb_function(CYC_SIGNIFICANT_DIGITS);
        register_kb_function(CYC_SINE);
        register_kb_function(CYC_COSINE);
        register_kb_function(CYC_TANGENT);
        register_kb_function(CYC_COSECANT);
        register_kb_function(CYC_SECANT);
        register_kb_function(CYC_COTANGENT);
        register_kb_function(CYC_ARC_SINE);
        register_kb_function(CYC_ARC_COSINE);
        register_kb_function(CYC_ARC_TANGENT);
        register_kb_function(CYC_ARC_COSECANT);
        register_kb_function(CYC_ARC_SECANT);
        register_kb_function(CYC_ARC_COTANGENT);
        register_kb_function(CYC_LOGARITHM);
        register_kb_function(CYC_EXPONENT);
        register_kb_function(CYC_QUADRATIC_SOLUTION_POSITIVE);
        register_kb_function(CYC_QUADRATIC_SOLUTION_NEGATIVE);
        register_kb_function(CYC_COLLECTION_SUBSUMPTION_PATHS);
        register_kb_function(CYC_PREDICATE_SUBSUMPTION_PATHS);
        register_kb_function(CYC_QUANTITY_SUBSUMES);
        register_kb_function(CYC_QUANTITY_INTERSECTS);
        register_kb_function(CYC_DIVIDES_EVENLY);
        register_kb_function(CYC_LIST_NTH);
        register_kb_function(CYC_LIST_CONCATENATE);
        register_kb_function(CYC_APPEND_TO_LIST);
        register_kb_function(CYC_PREPEND_TO_LIST);
        register_kb_function(CYC_LIST_FIRST);
        register_kb_function(CYC_LIST_SECOND);
        register_kb_function(CYC_LIST_REST);
        register_kb_function(CYC_LIST_LAST);
        register_kb_function(CYC_LIST_SUBSEQ);
        register_kb_function(CYC_LIST_SUBSEQ_UP_TO);
        register_kb_function(CYC_LIST_SEARCH);
        register_kb_function(CYC_POSITION);
        register_kb_function(CYC_LIST_LENGTH);
        register_kb_function(CYC_LIST_REVERSE);
        register_kb_function(CYC_LIST_MEMBER_SET);
        register_kb_function(CYC_SET_ELEMENT_LIST);
        register_kb_function(CYC_SUBSTITUTE_FROM_LIST);
        register_kb_function(CYC_SUBSTITUTE_FROM_THE_TERM_BINDING_SET);
        register_kb_function(CYC_REMOVE_ADJACENT_DUPLICATES_FROM_LIST_FN);
        register_kb_function(CYC_MAP_FUNCTION_OVER_LIST);
        register_kb_function(CYC_MAP_FUNCTION_OVER_LIST_UNTIL);
        register_kb_function(CYC_MAP_FUNCTION_OVER_LIST_UNTIL_RESULT);
        register_kb_function(CYC_MAP_FUNCTION_WITH_ARGS_OVER_LISTS);
        register_kb_function(CYC_APPLY_FUNCTION_RECURSIVELY);
        register_kb_function($sym154$CYC_LIST_MEMBER_);
        define_obsolete_register($sym155$CYC_LIST_CONTAINS_MEMBER_, $list156);
        register_kb_function($sym157$CYC_SUBLIST_);
        register_kb_function($sym158$CYC_INITIAL_SUBLIST_);
        register_kb_function(CYC_SET_INTERSECTION);
        register_kb_function(CYC_SET_UNION);
        register_kb_function(CYC_SET_DIFFERENCE);
        register_kb_function(CYC_SET_EXTENT);
        register_kb_function(CYC_MAP_FUNCTION_OVER_SET);
        register_kb_function(CYC_LEAST_COMMON_MULTIPLE);
        register_kb_function(CYC_GREATEST_COMMON_DIVISOR);
        register_kb_function(CYC_RANDOM_INTEGER);
        register_kb_function(CYC_RANDOM_INTEGER_WITH_SEED);
        register_kb_function(CYC_N_RANDOM_INTEGERS);
        register_kb_function(CYC_MATRIX_SOLUTION);
        register_external_symbol(GET_INTERCONVERTIBLE_UNITS_OF_MEASURE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_quantities_file();
    }

    @Override
    public void initializeVariables() {
        init_quantities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_quantities_file();
    }

    
}

/**
 * Total time: 1197 ms
 */
