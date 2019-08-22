package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_el_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cyclifier;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.ebmt_template_parser;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.parameter_specification_utilities;
import com.cyc.cycjava.cycl.parser;
import com.cyc.cycjava.cycl.parsing_macros;
import com.cyc.cycjava.cycl.parsing_utilities;
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


public final class removal_modules_cyclifier extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_cyclifier();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier";

    public static final String myFingerPrint = "ca70ba9b6f893d0caad6f1ca1222ca3d0737b2a37ebf993c092851535bcc22bc";

    private static final SubLObject $$cyclificationOfStringFromParser = reader_make_constant_shell(makeString("cyclificationOfStringFromParser"));



    private static final SubLSymbol $CYCLIFY_POS_UNIFY_ARG2 = makeKeyword("CYCLIFY-POS-UNIFY-ARG2");

    private static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("cyclificationOfStringFromParser")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("cyclificationOfStringFromParser")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("cyclificationOfStringFromParser")), list(makeKeyword("BIND"), makeSymbol("STRING")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("BIND"), makeSymbol("PARSER-TYPE"))), list(list(makeKeyword("VALUE"), makeSymbol("STRING")), list(makeKeyword("VALUE"), makeSymbol("PARSER-TYPE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("CYCLIFY-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("STRING")), list(makeKeyword("VALUE"), makeSymbol("PARSER-TYPE"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FORMULA"), makeSymbol("WEIGHT")), list(reader_make_constant_shell(makeString("cyclificationOfStringFromParser")), list(makeKeyword("VALUE"), makeSymbol("STRING")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("PARSER-TYPE")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("CYCLIFY"), makeKeyword("DOCUMENTATION"), makeString("(#$cyclificationOfStringFromParser <string> <not-fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$cyclificationOfStringFromParser \"every person like cheese\" ?QUERY #$CharniakParserCyclifier)") });

    private static final SubLObject $const4$parserRunToSpecificationWithInput = reader_make_constant_shell(makeString("parserRunToSpecificationWithInputStringReturnsCyclification"));

    private static final SubLSymbol $PARSER_RUN_WITH_SPEC_UNIFY_ARG4 = makeKeyword("PARSER-RUN-WITH-SPEC-UNIFY-ARG4");

    private static final SubLList $list6 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("parserRunToSpecificationWithInputStringReturnsCyclification")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("parserRunToSpecificationWithInputStringReturnsCyclification")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("parserRunToSpecificationWithInputStringReturnsCyclification")), list(makeKeyword("BIND"), makeSymbol("PARSER-TYPE")), list(makeKeyword("BIND"), makeSymbol("PARAMETERS")), list(makeKeyword("BIND"), makeSymbol("STRING")), makeKeyword("NOT-FULLY-BOUND")), list(list(makeKeyword("VALUE"), makeSymbol("STRING")), list(makeKeyword("VALUE"), makeSymbol("PARSER-TYPE")), list(makeKeyword("VALUE"), makeSymbol("PARAMETERS")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("CYCLIFY-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("STRING")), list(makeKeyword("VALUE"), makeSymbol("PARSER-TYPE")), list(makeKeyword("VALUE"), makeSymbol("PARAMETERS"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FORMULA"), makeSymbol("WEIGHT")), list(reader_make_constant_shell(makeString("parserRunToSpecificationWithInputStringReturnsCyclification")), list(makeKeyword("VALUE"), makeSymbol("PARSER-TYPE")), list(makeKeyword("VALUE"), makeSymbol("PARAMETERS")), list(makeKeyword("VALUE"), makeSymbol("STRING")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("CYCLIFY"), makeKeyword("DOCUMENTATION"), makeString("(#$parserRunToSpecificationWithInputStringReturnsCyclification <fully-bound> <fully-bound> <string> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$parserRunToSpecificationWithInputStringReturnsCyclification #$CharniakParserCyclifier (#$DefaultParameterSpecificationForParserFn #$CharniakParserCyclifier) \"every person likes cheese\" ?CYCL)") });

    private static final SubLObject $$CharniakParserCyclifier = reader_make_constant_shell(makeString("CharniakParserCyclifier"));

    private static final SubLObject $$CharniakParser = reader_make_constant_shell(makeString("CharniakParser"));

    private static final SubLObject $$StanfordParserCyclifier = reader_make_constant_shell(makeString("StanfordParserCyclifier"));

    private static final SubLObject $$LinkParserCyclifier = reader_make_constant_shell(makeString("LinkParserCyclifier"));

    private static final SubLObject $$EBMTCyclifier = reader_make_constant_shell(makeString("EBMTCyclifier"));

    private static final SubLObject $$CycPhraseStructureParser = reader_make_constant_shell(makeString("CycPhraseStructureParser"));

    private static final SubLObject $$CycDateParser = reader_make_constant_shell(makeString("CycDateParser"));









    private static final SubLList $list18 = list(makeKeyword("SCORE-FUNCTION"), makeSymbol("CYCLIFICATION-COVERAGE"));





    private static final SubLSymbol $LEXICON_LOOKUP_MT = makeKeyword("LEXICON-LOOKUP-MT");

    private static final SubLSymbol PS_GET_CYCLS_FOR_PHRASE = makeSymbol("PS-GET-CYCLS-FOR-PHRASE");





    private static final SubLList $list25 = list(makeSymbol("PARAMETER"), makeSymbol("KB-VALUE"));

    private static final SubLObject $$NLParsingParameter = reader_make_constant_shell(makeString("NLParsingParameter"));



    private static final SubLObject $$eBMTLinksMapToCycL = reader_make_constant_shell(makeString("eBMTLinksMapToCycL"));

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

    public static SubLObject get_parsing_parameter_value(final SubLObject parameter, final SubLObject plist, final SubLObject v_parser) {
        SubLObject value = getf(plist, parameter, $NOT_SPECIFIED);
        if ($NOT_SPECIFIED == value) {
            final SubLObject cycl_parameter = parsing_parameter_from_keyword(parameter);
            value = parameter_specification_utilities.software_parameter_default_value(cycl_parameter, v_parser, mt_relevance_macros.inference_relevant_mt());
        }
        return value;
    }

    public static SubLObject parsing_parameter_plist(final SubLObject parsing_parameter_spec) {
        final SubLObject parameter_value_tuples = parameter_specification_utilities.parameter_specification_tuples(parsing_parameter_spec);
        final SubLObject parsing_parameter_plist = parsing_parameter_plist_from_tuples(parameter_value_tuples);
        return parsing_parameter_plist;
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

    public static SubLObject parsing_parameter_from_keyword(final SubLObject keyword) {
        return parameter_specification_utilities.parameter_from_keyword(keyword, $$NLParsingParameter);
    }

    public static SubLObject keyword_from_parsing_parameter(final SubLObject parameter) {
        return parameter_specification_utilities.keyword_from_parameter(parameter);
    }

    public static SubLObject parse_kb_parsing_parameter_value(final SubLObject value, final SubLObject keyword) {
        if (keyword.eql($MAX_TIME)) {
            return kb_query.kbq_convert_time_to_seconds(value);
        }
        return parameter_specification_utilities.parse_standard_parameter_value(value);
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

    public static SubLObject cyclify_verify_general(final SubLObject asent, final SubLObject mt) {
        if (cyclify_sentence_parser_arg(asent).eql($$EBMTCyclifier)) {
            final SubLObject cycls = ebmt_template_parser.ebmt_parse(cyclify_sentence_string_input_arg(asent), UNPROVIDED, UNPROVIDED);
            return member(cyclify_sentence_cycl_arg(asent), cycls, EQUAL, UNPROVIDED);
        }
        return T;
    }

    public static SubLObject cyclify_justify_general(final SubLObject asent, final SubLObject mt) {
        final SubLObject supports = NIL;
        if (cyclify_sentence_parser_arg(asent).eql($$EBMTCyclifier)) {
            return ebmt_supports(asent, mt);
        }
        return NIL;
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

    public static SubLObject ebmt_template_justification_sentence(final SubLObject ebmt_template) {
        return list($$eBMTLinksMapToCycL, make_el_list(ebmt_template_parser.ebmt_template_links(ebmt_template), UNPROVIDED), ebmt_template_parser.ebmt_template_cycl(ebmt_template));
    }

    public static SubLObject declare_removal_modules_cyclifier_file() {
        declareFunction(me, "cyclify_iterator", "CYCLIFY-ITERATOR", 2, 1, false);
        declareFunction(me, "unpack_parser_parameters_for_parser", "UNPACK-PARSER-PARAMETERS-FOR-PARSER", 2, 0, false);
        declareFunction(me, "psp_cyclifier_results", "PSP-CYCLIFIER-RESULTS", 2, 0, false);
        declareFunction(me, "new_parser_of_type", "NEW-PARSER-OF-TYPE", 1, 0, false);
        declareFunction(me, "get_parsing_parameter_value", "GET-PARSING-PARAMETER-VALUE", 3, 0, false);
        declareFunction(me, "parsing_parameter_plist", "PARSING-PARAMETER-PLIST", 1, 0, false);
        declareFunction(me, "parsing_parameter_plist_from_tuples", "PARSING-PARAMETER-PLIST-FROM-TUPLES", 1, 0, false);
        declareFunction(me, "parsing_parameter_from_keyword", "PARSING-PARAMETER-FROM-KEYWORD", 1, 0, false);
        declareFunction(me, "keyword_from_parsing_parameter", "KEYWORD-FROM-PARSING-PARAMETER", 1, 0, false);
        declareFunction(me, "parse_kb_parsing_parameter_value", "PARSE-KB-PARSING-PARAMETER-VALUE", 2, 0, false);
        declareFunction(me, "cyclify_sentence_string_input_arg", "CYCLIFY-SENTENCE-STRING-INPUT-ARG", 1, 0, false);
        declareFunction(me, "cyclify_sentence_cycl_arg", "CYCLIFY-SENTENCE-CYCL-ARG", 1, 0, false);
        declareFunction(me, "cyclify_sentence_parser_arg", "CYCLIFY-SENTENCE-PARSER-ARG", 1, 0, false);
        declareFunction(me, "cyclify_verify_general", "CYCLIFY-VERIFY-GENERAL", 2, 0, false);
        declareFunction(me, "cyclify_justify_general", "CYCLIFY-JUSTIFY-GENERAL", 2, 0, false);
        declareFunction(me, "ebmt_supports", "EBMT-SUPPORTS", 2, 0, false);
        declareFunction(me, "ebmt_template_justification_sentence", "EBMT-TEMPLATE-JUSTIFICATION-SENTENCE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_cyclifier_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_cyclifier_file() {
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

    
}

/**
 * Total time: 81 ms
 */
