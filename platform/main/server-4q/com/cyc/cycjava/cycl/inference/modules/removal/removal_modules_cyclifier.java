/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_cyclifier extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_cyclifier();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier";




    private static final SubLSymbol $CYCLIFY_POS_UNIFY_ARG2 = makeKeyword("CYCLIFY-POS-UNIFY-ARG2");

    private static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cyclificationOfStringFromParser"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cyclificationOfStringFromParser"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cyclificationOfStringFromParser"), list($BIND, makeSymbol("STRING")), makeKeyword("NOT-FULLY-BOUND"), list($BIND, makeSymbol("PARSER-TYPE"))), list(list(makeKeyword("VALUE"), makeSymbol("STRING")), list(makeKeyword("VALUE"), makeSymbol("PARSER-TYPE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("CYCLIFY-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("STRING")), list(makeKeyword("VALUE"), makeSymbol("PARSER-TYPE"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FORMULA"), makeSymbol("WEIGHT")), list(reader_make_constant_shell("cyclificationOfStringFromParser"), list(makeKeyword("VALUE"), makeSymbol("STRING")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("PARSER-TYPE")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("CYCLIFY"), makeKeyword("DOCUMENTATION"), makeString("(#$cyclificationOfStringFromParser <string> <not-fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$cyclificationOfStringFromParser \"every person like cheese\" ?QUERY #$CharniakParserCyclifier)") });

    private static final SubLObject $const4$parserRunToSpecificationWithInput = reader_make_constant_shell("parserRunToSpecificationWithInputStringReturnsCyclification");

    private static final SubLSymbol $PARSER_RUN_WITH_SPEC_UNIFY_ARG4 = makeKeyword("PARSER-RUN-WITH-SPEC-UNIFY-ARG4");

    private static final SubLList $list6 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("parserRunToSpecificationWithInputStringReturnsCyclification"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("parserRunToSpecificationWithInputStringReturnsCyclification"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("parserRunToSpecificationWithInputStringReturnsCyclification"), list($BIND, makeSymbol("PARSER-TYPE")), list($BIND, makeSymbol("PARAMETERS")), list($BIND, makeSymbol("STRING")), makeKeyword("NOT-FULLY-BOUND")), list(list(makeKeyword("VALUE"), makeSymbol("STRING")), list(makeKeyword("VALUE"), makeSymbol("PARSER-TYPE")), list(makeKeyword("VALUE"), makeSymbol("PARAMETERS")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("CYCLIFY-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("STRING")), list(makeKeyword("VALUE"), makeSymbol("PARSER-TYPE")), list(makeKeyword("VALUE"), makeSymbol("PARAMETERS"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FORMULA"), makeSymbol("WEIGHT")), list(reader_make_constant_shell("parserRunToSpecificationWithInputStringReturnsCyclification"), list(makeKeyword("VALUE"), makeSymbol("PARSER-TYPE")), list(makeKeyword("VALUE"), makeSymbol("PARAMETERS")), list(makeKeyword("VALUE"), makeSymbol("STRING")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("CYCLIFY"), makeKeyword("DOCUMENTATION"), makeString("(#$parserRunToSpecificationWithInputStringReturnsCyclification <fully-bound> <fully-bound> <string> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$parserRunToSpecificationWithInputStringReturnsCyclification #$CharniakParserCyclifier (#$DefaultParameterSpecificationForParserFn #$CharniakParserCyclifier) \"every person likes cheese\" ?CYCL)") });















    private static final SubLList $list18 = list(makeKeyword("SCORE-FUNCTION"), makeSymbol("CYCLIFICATION-COVERAGE"));

    private static final SubLSymbol $LEXICON_LOOKUP_MT = makeKeyword("LEXICON-LOOKUP-MT");

    private static final SubLSymbol PS_GET_CYCLS_FOR_PHRASE = makeSymbol("PS-GET-CYCLS-FOR-PHRASE");

    private static final SubLList $list25 = list(makeSymbol("PARAMETER"), makeSymbol("KB-VALUE"));





    // Definitions
    /**
     *
     *
     * @return iterator; the iterator returns (formula score) pairs
     */
    @LispMethod(comment = "@return iterator; the iterator returns (formula score) pairs")
    public static final SubLObject cyclify_iterator_alt(SubLObject string, SubLObject parser_type, SubLObject parameters) {
        if (parameters == UNPROVIDED) {
            parameters = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject parses = NIL;
                SubLObject results = NIL;
                SubLObject pcase_var = parser_type;
                if (((pcase_var.eql($$CharniakParserCyclifier) || pcase_var.eql($$CharniakParser)) || pcase_var.eql($$StanfordParserCyclifier)) || pcase_var.eql($$LinkParserCyclifier)) {
                    parses = cyclifier.cyclify(string, com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier.unpack_parser_parameters_for_parser(parser_type, parameters));
                    {
                        SubLObject cdolist_list_var = parses;
                        SubLObject parse = NIL;
                        for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse = cdolist_list_var.first()) {
                            results = cons(list(parse.first(), parse.rest()), results);
                        }
                    }
                } else {
                    if (pcase_var.eql($$EBMTCyclifier)) {
                        {
                            SubLObject cdolist_list_var = ebmt_template_parser.ebmt_parse(string, UNPROVIDED, UNPROVIDED);
                            SubLObject parse_cycl = NIL;
                            for (parse_cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse_cycl = cdolist_list_var.first()) {
                                results = cons(list(parse_cycl, ZERO_INTEGER), results);
                            }
                        }
                    } else {
                        if (pcase_var.eql($$CycPhraseStructureParser)) {
                            if (NIL != forts.fort_p(parameters)) {
                                results = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier.psp_cyclifier_results(string, parameters);
                            }
                        } else {
                            if (pcase_var.eql($$CycDateParser)) {
                                {
                                    SubLObject plist = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier.parsing_parameter_plist(parameters);
                                    SubLObject max_time = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier.get_parsing_parameter_value($MAX_TIME, plist, parser_type);
                                    SubLObject timed_outP = NIL;
                                    SubLObject parses_1 = NIL;
                                    if (NIL != max_time) {
                                        {
                                            SubLObject _prev_bind_0 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                                            try {
                                                parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                                                parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(max_time), thread);
                                                parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                                                parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                                                if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                                                    parses_1 = date_utilities.parse_date_from_string(string);
                                                }
                                                timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                                            } finally {
                                                parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_2, thread);
                                                parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_1, thread);
                                                parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    } else {
                                        parses_1 = date_utilities.parse_date_from_string(string);
                                        timed_outP = NIL;
                                    }
                                    if (NIL != parses_1) {
                                        {
                                            SubLObject ambiguity_factor = length(parses_1);
                                            SubLObject weight = divide(ONE_INTEGER, ambiguity_factor);
                                            SubLObject cdolist_list_var = parses_1;
                                            SubLObject parse = NIL;
                                            for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse = cdolist_list_var.first()) {
                                                results = cons(list(parse, weight), results);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return iteration.new_list_iterator(nreverse(results));
            }
        }
    }

    // Definitions
    /**
     *
     *
     * @return iterator; the iterator returns (formula score) pairs
     */
    @LispMethod(comment = "@return iterator; the iterator returns (formula score) pairs")
    public static SubLObject cyclify_iterator(final SubLObject string, final SubLObject parser_type, SubLObject parameters) {
        if (parameters == UNPROVIDED) {
            parameters = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parses = NIL;
        SubLObject results = NIL;
        if (((parser_type.eql($$CharniakParserCyclifier) || parser_type.eql($$CharniakParser)) || parser_type.eql($$StanfordParserCyclifier)) || parser_type.eql($$LinkParserCyclifier)) {
            SubLObject cdolist_list_var;
            parses = cdolist_list_var = cyclifier.cyclify(string, unpack_parser_parameters_for_parser(parser_type, parameters));
            SubLObject parse = NIL;
            parse = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                results = cons(list(parse.first(), parse.rest()), results);
                cdolist_list_var = cdolist_list_var.rest();
                parse = cdolist_list_var.first();
            } 
        } else
            if (parser_type.eql($$EBMTCyclifier)) {
                SubLObject cdolist_list_var = ebmt_template_parser.ebmt_parse(string, UNPROVIDED, UNPROVIDED);
                SubLObject parse_cycl = NIL;
                parse_cycl = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    results = cons(list(parse_cycl, ZERO_INTEGER), results);
                    cdolist_list_var = cdolist_list_var.rest();
                    parse_cycl = cdolist_list_var.first();
                } 
            } else
                if (parser_type.eql($$CycPhraseStructureParser)) {
                    if (NIL != forts.fort_p(parameters)) {
                        results = psp_cyclifier_results(string, parameters);
                    }
                } else
                    if (parser_type.eql($$CycDateParser)) {
                        final SubLObject plist = parsing_parameter_plist(parameters);
                        final SubLObject max_time = get_parsing_parameter_value($MAX_TIME, plist, parser_type);
                        SubLObject timed_outP = NIL;
                        SubLObject parses_$1 = NIL;
                        if (NIL != max_time) {
                            final SubLObject _prev_bind_0 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                            try {
                                parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                                parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(max_time), thread);
                                parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                                parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                                if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                                    parses_$1 = date_utilities.parse_date_from_string(string);
                                }
                                timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                            } finally {
                                parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_3, thread);
                                parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_2, thread);
                                parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0, thread);
                            }
                        } else {
                            parses_$1 = date_utilities.parse_date_from_string(string);
                            timed_outP = NIL;
                        }
                        if (NIL != parses_$1) {
                            final SubLObject ambiguity_factor = length(parses_$1);
                            final SubLObject weight = divide(ONE_INTEGER, ambiguity_factor);
                            SubLObject cdolist_list_var2 = parses_$1;
                            SubLObject parse2 = NIL;
                            parse2 = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                results = cons(list(parse2, weight), results);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                parse2 = cdolist_list_var2.first();
                            } 
                        }
                    }



        return iteration.new_list_iterator(nreverse(results));
    }

    public static final SubLObject unpack_parser_parameters_for_parser_alt(SubLObject parser_type, SubLObject parameters) {
        {
            SubLObject pcase_var = parser_type;
            if (((pcase_var.eql($$CharniakParserCyclifier) || pcase_var.eql($$CharniakParser)) || pcase_var.eql($$StanfordParserCyclifier)) || pcase_var.eql($$LinkParserCyclifier)) {
                {
                    SubLObject v_parser = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier.new_parser_of_type(parser_type);
                    return listS($OUTPUT, $VERBOSE, $PARSER, v_parser, $list_alt17);
                }
            } else {
                if (pcase_var.eql($$CycPhraseStructureParser)) {
                    {
                        SubLObject plist = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier.parsing_parameter_plist(parameters);
                        SubLObject category = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier.get_parsing_parameter_value($CATEGORY, plist, parser_type);
                        SubLObject pos_pred = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier.get_parsing_parameter_value($POS_PRED, plist, parser_type);
                        SubLObject max_time = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier.get_parsing_parameter_value($MAX_TIME, plist, parser_type);
                        SubLObject non_trivialP = NIL;
                        SubLObject mt = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier.get_parsing_parameter_value($LEXICON_LOOKUP_MT, plist, parser_type);
                        return list(max_time, category, pos_pred, non_trivialP, mt);
                    }
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject unpack_parser_parameters_for_parser(final SubLObject parser_type, final SubLObject parameters) {
        if (((parser_type.eql($$CharniakParserCyclifier) || parser_type.eql($$CharniakParser)) || parser_type.eql($$StanfordParserCyclifier)) || parser_type.eql($$LinkParserCyclifier)) {
            final SubLObject v_parser = new_parser_of_type(parser_type);
            return listS($OUTPUT, $VERBOSE, $PARSER, v_parser, $list18);
        }
        if (parser_type.eql($$CycPhraseStructureParser)) {
            final SubLObject plist = parsing_parameter_plist(parameters);
            final SubLObject category = get_parsing_parameter_value($CATEGORY, plist, parser_type);
            final SubLObject pos_pred = get_parsing_parameter_value($POS_PRED, plist, parser_type);
            final SubLObject max_time = get_parsing_parameter_value($MAX_TIME, plist, parser_type);
            final SubLObject non_trivialP = NIL;
            final SubLObject mt = get_parsing_parameter_value($LEXICON_LOOKUP_MT, plist, parser_type);
            return list(max_time, category, pos_pred, non_trivialP, mt);
        }
        return NIL;
    }

    public static final SubLObject psp_cyclifier_results_alt(SubLObject string, SubLObject parameters) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject unpacked = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier.unpack_parser_parameters_for_parser($$CycPhraseStructureParser, parameters);
                SubLObject max_time = unpacked.first();
                SubLObject timed_outP = NIL;
                SubLObject parses = NIL;
                SubLObject results = NIL;
                if (NIL != max_time) {
                    {
                        SubLObject _prev_bind_0 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                        SubLObject _prev_bind_1 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                        SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                        try {
                            parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                            parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(max_time), thread);
                            parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                            parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                            if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                                parses = apply(PS_GET_CYCLS_FOR_PHRASE, cons(string, unpacked.rest()));
                            }
                            timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                        } finally {
                            parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_2, thread);
                            parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_1, thread);
                            parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    parses = apply(PS_GET_CYCLS_FOR_PHRASE, cons(string, unpacked.rest()));
                    timed_outP = NIL;
                }
                {
                    SubLObject cdolist_list_var = parses;
                    SubLObject parse = NIL;
                    for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse = cdolist_list_var.first()) {
                        if (NIL == cycl_utilities.expression_find_if(KEYWORDP, parse, UNPROVIDED, UNPROVIDED)) {
                            results = cons(list(parsing_utilities.strip_nl_tags(parse, UNPROVIDED), ZERO_INTEGER), results);
                        }
                    }
                }
                return results;
            }
        }
    }

    public static SubLObject psp_cyclifier_results(final SubLObject string, final SubLObject parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unpacked = unpack_parser_parameters_for_parser($$CycPhraseStructureParser, parameters);
        final SubLObject max_time = unpacked.first();
        SubLObject timed_outP = NIL;
        SubLObject parses = NIL;
        SubLObject results = NIL;
        if (NIL != max_time) {
            final SubLObject _prev_bind_0 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
            final SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
            try {
                parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(max_time), thread);
                parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                    parses = apply(PS_GET_CYCLS_FOR_PHRASE, cons(string, unpacked.rest()));
                }
                timed_outP = parsing_macros.parsing_timeout_time_reachedP();
            } finally {
                parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_3, thread);
                parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_2, thread);
                parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0, thread);
            }
        } else {
            parses = apply(PS_GET_CYCLS_FOR_PHRASE, cons(string, unpacked.rest()));
            timed_outP = NIL;
        }
        SubLObject cdolist_list_var = parses;
        SubLObject parse = NIL;
        parse = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == cycl_utilities.expression_find_if(KEYWORDP, parse, UNPROVIDED, UNPROVIDED)) {
                results = cons(list(parsing_utilities.strip_nl_tags(parse, UNPROVIDED), ZERO_INTEGER), results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        } 
        return results;
    }

    public static final SubLObject new_parser_of_type_alt(SubLObject parser_type) {
        {
            SubLObject pcase_var = parser_type;
            if (pcase_var.eql($$CharniakParserCyclifier) || pcase_var.eql($$CharniakParser)) {
                return parser.new_charniak_parser(UNPROVIDED, UNPROVIDED);
            } else {
                if (pcase_var.eql($$StanfordParserCyclifier)) {
                    return parser.new_stanford_parser(UNPROVIDED, UNPROVIDED);
                } else {
                    if (pcase_var.eql($$LinkParserCyclifier)) {
                        return parser.new_link_parser(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject new_parser_of_type(final SubLObject parser_type) {
        if (parser_type.eql($$CharniakParserCyclifier) || parser_type.eql($$CharniakParser)) {
            return parser.new_charniak_parser(UNPROVIDED, UNPROVIDED);
        }
        if (parser_type.eql($$StanfordParserCyclifier)) {
            return parser.new_stanford_parser(UNPROVIDED, UNPROVIDED);
        }
        if (parser_type.eql($$LinkParserCyclifier)) {
            return parser.new_link_parser(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject get_parsing_parameter_value_alt(SubLObject parameter, SubLObject plist, SubLObject v_parser) {
        {
            SubLObject value = getf(plist, parameter, $NOT_SPECIFIED);
            if ($NOT_SPECIFIED == value) {
                {
                    SubLObject cycl_parameter = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier.parsing_parameter_from_keyword(parameter);
                    value = parameter_specification_utilities.software_parameter_default_value(cycl_parameter, v_parser, mt_relevance_macros.inference_relevant_mt());
                }
            }
            return value;
        }
    }

    public static SubLObject get_parsing_parameter_value(final SubLObject parameter, final SubLObject plist, final SubLObject v_parser) {
        SubLObject value = getf(plist, parameter, $NOT_SPECIFIED);
        if ($NOT_SPECIFIED == value) {
            final SubLObject cycl_parameter = parsing_parameter_from_keyword(parameter);
            value = parameter_specification_utilities.software_parameter_default_value(cycl_parameter, v_parser, mt_relevance_macros.inference_relevant_mt());
        }
        return value;
    }

    public static final SubLObject parsing_parameter_plist_alt(SubLObject parsing_parameter_spec) {
        {
            SubLObject parameter_value_tuples = parameter_specification_utilities.parameter_specification_tuples(parsing_parameter_spec);
            SubLObject parsing_parameter_plist = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier.parsing_parameter_plist_from_tuples(parameter_value_tuples);
            return parsing_parameter_plist;
        }
    }

    public static SubLObject parsing_parameter_plist(final SubLObject parsing_parameter_spec) {
        final SubLObject parameter_value_tuples = parameter_specification_utilities.parameter_specification_tuples(parsing_parameter_spec);
        final SubLObject parsing_parameter_plist = parsing_parameter_plist_from_tuples(parameter_value_tuples);
        return parsing_parameter_plist;
    }

    public static final SubLObject parsing_parameter_plist_from_tuples_alt(SubLObject parameter_value_tuples) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = parameter_value_tuples;
            SubLObject tuple = NIL;
            for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                {
                    SubLObject datum = tuple;
                    SubLObject current = datum;
                    SubLObject parameter = NIL;
                    SubLObject kb_value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    parameter = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    kb_value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject keyword = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier.keyword_from_parsing_parameter(parameter);
                            SubLObject value = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier.parse_kb_parsing_parameter_value(kb_value, keyword);
                            result = putf(result, keyword, value);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt24);
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject parsing_parameter_plist_from_tuples(final SubLObject parameter_value_tuples) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = parameter_value_tuples;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject parameter = NIL;
            SubLObject kb_value = NIL;
            destructuring_bind_must_consp(current, datum, $list25);
            parameter = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list25);
            kb_value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject keyword = keyword_from_parsing_parameter(parameter);
                final SubLObject value = parse_kb_parsing_parameter_value(kb_value, keyword);
                result = putf(result, keyword, value);
            } else {
                cdestructuring_bind_error(datum, $list25);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject parsing_parameter_from_keyword_alt(SubLObject keyword) {
        return parameter_specification_utilities.parameter_from_keyword(keyword, $$NLParsingParameter);
    }

    public static SubLObject parsing_parameter_from_keyword(final SubLObject keyword) {
        return parameter_specification_utilities.parameter_from_keyword(keyword, $$NLParsingParameter);
    }

    public static final SubLObject keyword_from_parsing_parameter_alt(SubLObject parameter) {
        return parameter_specification_utilities.keyword_from_parameter(parameter);
    }

    public static SubLObject keyword_from_parsing_parameter(final SubLObject parameter) {
        return parameter_specification_utilities.keyword_from_parameter(parameter);
    }

    public static final SubLObject parse_kb_parsing_parameter_value_alt(SubLObject value, SubLObject keyword) {
        {
            SubLObject pcase_var = keyword;
            if (pcase_var.eql($MAX_TIME)) {
                return kb_query.kbq_convert_time_to_seconds(value);
            } else {
                return parameter_specification_utilities.parse_standard_parameter_value(value);
            }
        }
    }

    public static SubLObject parse_kb_parsing_parameter_value(final SubLObject value, final SubLObject keyword) {
        if (keyword.eql($MAX_TIME)) {
            return kb_query.kbq_convert_time_to_seconds(value);
        }
        return parameter_specification_utilities.parse_standard_parameter_value(value);
    }

    public static final SubLObject cyclify_sentence_string_input_arg_alt(SubLObject asent) {
        {
            SubLObject pcase_var = cycl_utilities.formula_arg0(asent);
            if (pcase_var.eql($$cyclificationOfStringFromParser)) {
                return cycl_utilities.formula_arg1(asent, UNPROVIDED);
            } else {
                if (pcase_var.eql($const3$parserRunToSpecificationWithInput)) {
                    return cycl_utilities.formula_arg3(asent, UNPROVIDED);
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject cyclify_sentence_string_input_arg(final SubLObject asent) {
        final SubLObject pcase_var = cycl_utilities.formula_arg0(asent);
        if (pcase_var.eql($$cyclificationOfStringFromParser)) {
            return cycl_utilities.formula_arg1(asent, UNPROVIDED);
        }
        if (pcase_var.eql($const4$parserRunToSpecificationWithInput)) {
            return cycl_utilities.formula_arg3(asent, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cyclify_sentence_cycl_arg_alt(SubLObject asent) {
        {
            SubLObject pcase_var = cycl_utilities.formula_arg0(asent);
            if (pcase_var.eql($$cyclificationOfStringFromParser)) {
                return cycl_utilities.formula_arg2(asent, UNPROVIDED);
            } else {
                if (pcase_var.eql($const3$parserRunToSpecificationWithInput)) {
                    return cycl_utilities.formula_arg4(asent, UNPROVIDED);
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject cyclify_sentence_cycl_arg(final SubLObject asent) {
        final SubLObject pcase_var = cycl_utilities.formula_arg0(asent);
        if (pcase_var.eql($$cyclificationOfStringFromParser)) {
            return cycl_utilities.formula_arg2(asent, UNPROVIDED);
        }
        if (pcase_var.eql($const4$parserRunToSpecificationWithInput)) {
            return cycl_utilities.formula_arg4(asent, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cyclify_sentence_parser_arg_alt(SubLObject asent) {
        {
            SubLObject pcase_var = cycl_utilities.formula_arg0(asent);
            if (pcase_var.eql($$cyclificationOfStringFromParser)) {
                return cycl_utilities.formula_arg3(asent, UNPROVIDED);
            } else {
                if (pcase_var.eql($const3$parserRunToSpecificationWithInput)) {
                    return cycl_utilities.formula_arg1(asent, UNPROVIDED);
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject cyclify_sentence_parser_arg(final SubLObject asent) {
        final SubLObject pcase_var = cycl_utilities.formula_arg0(asent);
        if (pcase_var.eql($$cyclificationOfStringFromParser)) {
            return cycl_utilities.formula_arg3(asent, UNPROVIDED);
        }
        if (pcase_var.eql($const4$parserRunToSpecificationWithInput)) {
            return cycl_utilities.formula_arg1(asent, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cyclify_verify_general_alt(SubLObject asent, SubLObject mt) {
        if (com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier.cyclify_sentence_parser_arg(asent) == $$EBMTCyclifier) {
            {
                SubLObject cycls = ebmt_template_parser.ebmt_parse(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier.cyclify_sentence_string_input_arg(asent), UNPROVIDED, UNPROVIDED);
                return member(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier.cyclify_sentence_cycl_arg(asent), cycls, EQUAL, UNPROVIDED);
            }
        } else {
            return T;
        }
    }

    public static SubLObject cyclify_verify_general(final SubLObject asent, final SubLObject mt) {
        if (cyclify_sentence_parser_arg(asent).eql($$EBMTCyclifier)) {
            final SubLObject cycls = ebmt_template_parser.ebmt_parse(cyclify_sentence_string_input_arg(asent), UNPROVIDED, UNPROVIDED);
            return member(cyclify_sentence_cycl_arg(asent), cycls, EQUAL, UNPROVIDED);
        }
        return T;
    }

    public static final SubLObject cyclify_justify_general_alt(SubLObject asent, SubLObject mt) {
        {
            SubLObject supports = NIL;
            if (com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier.cyclify_sentence_parser_arg(asent) == $$EBMTCyclifier) {
                return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier.ebmt_supports(asent, mt);
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject cyclify_justify_general(final SubLObject asent, final SubLObject mt) {
        final SubLObject supports = NIL;
        if (cyclify_sentence_parser_arg(asent).eql($$EBMTCyclifier)) {
            return ebmt_supports(asent, mt);
        }
        return NIL;
    }

    public static final SubLObject ebmt_supports_alt(SubLObject asent, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject supports = NIL;
                SubLObject target_cycl = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier.cyclify_sentence_cycl_arg(asent);
                thread.resetMultipleValues();
                {
                    SubLObject cycls = ebmt_template_parser.ebmt_parse(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier.cyclify_sentence_string_input_arg(asent), UNPROVIDED, UNPROVIDED);
                    SubLObject justifications = thread.secondMultipleValue();
                    SubLObject weight = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject cycl = NIL;
                        SubLObject cycl_2 = NIL;
                        SubLObject justification = NIL;
                        SubLObject justification_3 = NIL;
                        for (cycl = cycls, cycl_2 = cycl.first(), justification = justifications, justification_3 = justification.first(); !((NIL == justification) && (NIL == cycl)); cycl = cycl.rest() , cycl_2 = cycl.first() , justification = justification.rest() , justification_3 = justification.first()) {
                            if (cycl_2.equal(target_cycl)) {
                                {
                                    SubLObject cdolist_list_var = justification_3;
                                    SubLObject support = NIL;
                                    for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                                        supports = cons(arguments.make_hl_support($OPAQUE, com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier.ebmt_template_justification_sentence(support), mt, UNPROVIDED), supports);
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

    public static SubLObject ebmt_supports(final SubLObject asent, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = NIL;
        final SubLObject target_cycl = cyclify_sentence_cycl_arg(asent);
        thread.resetMultipleValues();
        final SubLObject cycls = ebmt_template_parser.ebmt_parse(cyclify_sentence_string_input_arg(asent), UNPROVIDED, UNPROVIDED);
        final SubLObject justifications = thread.secondMultipleValue();
        final SubLObject weight = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject cycl = NIL;
        SubLObject cycl_$2 = NIL;
        SubLObject justification = NIL;
        SubLObject justification_$3 = NIL;
        cycl = cycls;
        cycl_$2 = cycl.first();
        justification = justifications;
        justification_$3 = justification.first();
        while ((NIL != justification) || (NIL != cycl)) {
            if (cycl_$2.equal(target_cycl)) {
                SubLObject cdolist_list_var = justification_$3;
                SubLObject support = NIL;
                support = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    supports = cons(arguments.make_hl_support($OPAQUE, ebmt_template_justification_sentence(support), mt, UNPROVIDED), supports);
                    cdolist_list_var = cdolist_list_var.rest();
                    support = cdolist_list_var.first();
                } 
            }
            cycl = cycl.rest();
            cycl_$2 = cycl.first();
            justification = justification.rest();
            justification_$3 = justification.first();
        } 
        return supports;
    }

    public static final SubLObject ebmt_template_justification_sentence_alt(SubLObject ebmt_template) {
        return list($$eBMTLinksMapToCycL, make_el_list(ebmt_template_parser.ebmt_template_links(ebmt_template), UNPROVIDED), ebmt_template_parser.ebmt_template_cycl(ebmt_template));
    }

    public static SubLObject ebmt_template_justification_sentence(final SubLObject ebmt_template) {
        return list($$eBMTLinksMapToCycL, make_el_list(ebmt_template_parser.ebmt_template_links(ebmt_template), UNPROVIDED), ebmt_template_parser.ebmt_template_cycl(ebmt_template));
    }

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cyclificationOfStringFromParser"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cyclificationOfStringFromParser"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cyclificationOfStringFromParser"), list($BIND, makeSymbol("STRING")), makeKeyword("NOT-FULLY-BOUND"), list($BIND, makeSymbol("PARSER-TYPE"))), list(list(makeKeyword("VALUE"), makeSymbol("STRING")), list(makeKeyword("VALUE"), makeSymbol("PARSER-TYPE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("CYCLIFY-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("STRING")), list(makeKeyword("VALUE"), makeSymbol("PARSER-TYPE"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FORMULA"), makeSymbol("WEIGHT")), list(reader_make_constant_shell("cyclificationOfStringFromParser"), list(makeKeyword("VALUE"), makeSymbol("STRING")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("PARSER-TYPE")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("CYCLIFY"), makeKeyword("DOCUMENTATION"), makeString("(#$cyclificationOfStringFromParser <string> <not-fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$cyclificationOfStringFromParser \"every person like cheese\" ?QUERY #$CharniakParserCyclifier)") });

    public static SubLObject declare_removal_modules_cyclifier_file() {
        declareFunction("cyclify_iterator", "CYCLIFY-ITERATOR", 2, 1, false);
        declareFunction("unpack_parser_parameters_for_parser", "UNPACK-PARSER-PARAMETERS-FOR-PARSER", 2, 0, false);
        declareFunction("psp_cyclifier_results", "PSP-CYCLIFIER-RESULTS", 2, 0, false);
        declareFunction("new_parser_of_type", "NEW-PARSER-OF-TYPE", 1, 0, false);
        declareFunction("get_parsing_parameter_value", "GET-PARSING-PARAMETER-VALUE", 3, 0, false);
        declareFunction("parsing_parameter_plist", "PARSING-PARAMETER-PLIST", 1, 0, false);
        declareFunction("parsing_parameter_plist_from_tuples", "PARSING-PARAMETER-PLIST-FROM-TUPLES", 1, 0, false);
        declareFunction("parsing_parameter_from_keyword", "PARSING-PARAMETER-FROM-KEYWORD", 1, 0, false);
        declareFunction("keyword_from_parsing_parameter", "KEYWORD-FROM-PARSING-PARAMETER", 1, 0, false);
        declareFunction("parse_kb_parsing_parameter_value", "PARSE-KB-PARSING-PARAMETER-VALUE", 2, 0, false);
        declareFunction("cyclify_sentence_string_input_arg", "CYCLIFY-SENTENCE-STRING-INPUT-ARG", 1, 0, false);
        declareFunction("cyclify_sentence_cycl_arg", "CYCLIFY-SENTENCE-CYCL-ARG", 1, 0, false);
        declareFunction("cyclify_sentence_parser_arg", "CYCLIFY-SENTENCE-PARSER-ARG", 1, 0, false);
        declareFunction("cyclify_verify_general", "CYCLIFY-VERIFY-GENERAL", 2, 0, false);
        declareFunction("cyclify_justify_general", "CYCLIFY-JUSTIFY-GENERAL", 2, 0, false);
        declareFunction("ebmt_supports", "EBMT-SUPPORTS", 2, 0, false);
        declareFunction("ebmt_template_justification_sentence", "EBMT-TEMPLATE-JUSTIFICATION-SENTENCE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject $const3$parserRunToSpecificationWithInput = reader_make_constant_shell("parserRunToSpecificationWithInputStringReturnsCyclification");

    public static SubLObject init_removal_modules_cyclifier_file() {
        return NIL;
    }

    public static final SubLObject setup_removal_modules_cyclifier_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$cyclificationOfStringFromParser);
        inference_modules.inference_removal_module($CYCLIFY_POS_UNIFY_ARG2, $list_alt2);
        inference_modules.register_solely_specific_removal_module_predicate($const3$parserRunToSpecificationWithInput);
        inference_modules.inference_removal_module($PARSER_RUN_WITH_SPEC_UNIFY_ARG4, $list_alt5);
        return NIL;
    }

    public static SubLObject setup_removal_modules_cyclifier_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$cyclificationOfStringFromParser);
            preference_modules.doomed_unless_arg_bindable($POS, $$cyclificationOfStringFromParser, ONE_INTEGER);
            preference_modules.doomed_unless_arg_bindable($POS, $$cyclificationOfStringFromParser, THREE_INTEGER);
            inference_modules.inference_removal_module($CYCLIFY_POS_UNIFY_ARG2, $list3);
            inference_modules.register_solely_specific_removal_module_predicate($const4$parserRunToSpecificationWithInput);
            preference_modules.doomed_unless_arg_bindable($POS, $const4$parserRunToSpecificationWithInput, ONE_INTEGER);
            preference_modules.doomed_unless_arg_bindable($POS, $const4$parserRunToSpecificationWithInput, TWO_INTEGER);
            preference_modules.doomed_unless_arg_bindable($POS, $const4$parserRunToSpecificationWithInput, THREE_INTEGER);
            inference_modules.inference_removal_module($PARSER_RUN_WITH_SPEC_UNIFY_ARG4, $list6);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($CYCLIFY_POS_UNIFY_ARG2, $list_alt2);
            inference_modules.register_solely_specific_removal_module_predicate($const3$parserRunToSpecificationWithInput);
            inference_modules.inference_removal_module($PARSER_RUN_WITH_SPEC_UNIFY_ARG4, $list_alt5);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_cyclifier_file_Previous() {
        inference_modules.register_solely_specific_removal_module_predicate($$cyclificationOfStringFromParser);
        preference_modules.doomed_unless_arg_bindable($POS, $$cyclificationOfStringFromParser, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$cyclificationOfStringFromParser, THREE_INTEGER);
        inference_modules.inference_removal_module($CYCLIFY_POS_UNIFY_ARG2, $list3);
        inference_modules.register_solely_specific_removal_module_predicate($const4$parserRunToSpecificationWithInput);
        preference_modules.doomed_unless_arg_bindable($POS, $const4$parserRunToSpecificationWithInput, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const4$parserRunToSpecificationWithInput, TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const4$parserRunToSpecificationWithInput, THREE_INTEGER);
        inference_modules.inference_removal_module($PARSER_RUN_WITH_SPEC_UNIFY_ARG4, $list6);
        return NIL;
    }

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("parserRunToSpecificationWithInputStringReturnsCyclification"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("parserRunToSpecificationWithInputStringReturnsCyclification"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("parserRunToSpecificationWithInputStringReturnsCyclification"), list($BIND, makeSymbol("PARSER-TYPE")), list($BIND, makeSymbol("PARAMETERS")), list($BIND, makeSymbol("STRING")), makeKeyword("NOT-FULLY-BOUND")), list(list(makeKeyword("VALUE"), makeSymbol("STRING")), list(makeKeyword("VALUE"), makeSymbol("PARSER-TYPE")), list(makeKeyword("VALUE"), makeSymbol("PARAMETERS")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("CYCLIFY-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("STRING")), list(makeKeyword("VALUE"), makeSymbol("PARSER-TYPE")), list(makeKeyword("VALUE"), makeSymbol("PARAMETERS"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FORMULA"), makeSymbol("WEIGHT")), list(reader_make_constant_shell("parserRunToSpecificationWithInputStringReturnsCyclification"), list(makeKeyword("VALUE"), makeSymbol("PARSER-TYPE")), list(makeKeyword("VALUE"), makeSymbol("PARAMETERS")), list(makeKeyword("VALUE"), makeSymbol("STRING")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("CYCLIFY"), makeKeyword("DOCUMENTATION"), makeString("(#$parserRunToSpecificationWithInputStringReturnsCyclification <fully-bound> <fully-bound> <string> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$parserRunToSpecificationWithInputStringReturnsCyclification #$CharniakParserCyclifier (#$DefaultParameterSpecificationForParserFn #$CharniakParserCyclifier) \"every person likes cheese\" ?CYCL)") });

    @Override
    public void declareFunctions() {
        declare_removal_modules_cyclifier_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_cyclifier_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_cyclifier_file();
    }

    static {
    }

    static private final SubLList $list_alt17 = list(makeKeyword("SCORE-FUNCTION"), makeSymbol("CYCLIFICATION-COVERAGE"));

    static private final SubLList $list_alt24 = list(makeSymbol("PARAMETER"), makeSymbol("KB-VALUE"));
}

/**
 * Total time: 81 ms
 */
