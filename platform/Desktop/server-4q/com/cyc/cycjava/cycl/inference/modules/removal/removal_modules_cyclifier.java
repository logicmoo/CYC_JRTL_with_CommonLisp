package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.parameter_specification_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.parser;
import com.cyc.cycjava.cycl.parsing_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.parsing_macros;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.ebmt_template_parser;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cyclifier;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_cyclifier extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier";
    public static final String myFingerPrint = "ca70ba9b6f893d0caad6f1ca1222ca3d0737b2a37ebf993c092851535bcc22bc";
    private static final SubLObject $const0$cyclificationOfStringFromParser;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$CYCLIFY_POS_UNIFY_ARG2;
    private static final SubLList $list3;
    private static final SubLObject $const4$parserRunToSpecificationWithInput;
    private static final SubLSymbol $kw5$PARSER_RUN_WITH_SPEC_UNIFY_ARG4;
    private static final SubLList $list6;
    private static final SubLObject $const7$CharniakParserCyclifier;
    private static final SubLObject $const8$CharniakParser;
    private static final SubLObject $const9$StanfordParserCyclifier;
    private static final SubLObject $const10$LinkParserCyclifier;
    private static final SubLObject $const11$EBMTCyclifier;
    private static final SubLObject $const12$CycPhraseStructureParser;
    private static final SubLObject $const13$CycDateParser;
    private static final SubLSymbol $kw14$MAX_TIME;
    private static final SubLSymbol $kw15$OUTPUT;
    private static final SubLSymbol $kw16$VERBOSE;
    private static final SubLSymbol $kw17$PARSER;
    private static final SubLList $list18;
    private static final SubLSymbol $kw19$CATEGORY;
    private static final SubLSymbol $kw20$POS_PRED;
    private static final SubLSymbol $kw21$LEXICON_LOOKUP_MT;
    private static final SubLSymbol $sym22$PS_GET_CYCLS_FOR_PHRASE;
    private static final SubLSymbol $sym23$KEYWORDP;
    private static final SubLSymbol $kw24$NOT_SPECIFIED;
    private static final SubLList $list25;
    private static final SubLObject $const26$NLParsingParameter;
    private static final SubLSymbol $kw27$OPAQUE;
    private static final SubLObject $const28$eBMTLinksMapToCycL;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-cyclifier.lisp", position = 3944L)
    public static SubLObject cyclify_iterator(final SubLObject string, final SubLObject parser_type, SubLObject parameters) {
        if (parameters == removal_modules_cyclifier.UNPROVIDED) {
            parameters = (SubLObject)removal_modules_cyclifier.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parses = (SubLObject)removal_modules_cyclifier.NIL;
        SubLObject results = (SubLObject)removal_modules_cyclifier.NIL;
        if (parser_type.eql(removal_modules_cyclifier.$const7$CharniakParserCyclifier) || parser_type.eql(removal_modules_cyclifier.$const8$CharniakParser) || parser_type.eql(removal_modules_cyclifier.$const9$StanfordParserCyclifier) || parser_type.eql(removal_modules_cyclifier.$const10$LinkParserCyclifier)) {
            SubLObject cdolist_list_var;
            parses = (cdolist_list_var = cyclifier.cyclify(string, unpack_parser_parameters_for_parser(parser_type, parameters)));
            SubLObject parse = (SubLObject)removal_modules_cyclifier.NIL;
            parse = cdolist_list_var.first();
            while (removal_modules_cyclifier.NIL != cdolist_list_var) {
                results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(parse.first(), parse.rest()), results);
                cdolist_list_var = cdolist_list_var.rest();
                parse = cdolist_list_var.first();
            }
        }
        else if (parser_type.eql(removal_modules_cyclifier.$const11$EBMTCyclifier)) {
            SubLObject cdolist_list_var = ebmt_template_parser.ebmt_parse(string, (SubLObject)removal_modules_cyclifier.UNPROVIDED, (SubLObject)removal_modules_cyclifier.UNPROVIDED);
            SubLObject parse_cycl = (SubLObject)removal_modules_cyclifier.NIL;
            parse_cycl = cdolist_list_var.first();
            while (removal_modules_cyclifier.NIL != cdolist_list_var) {
                results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(parse_cycl, (SubLObject)removal_modules_cyclifier.ZERO_INTEGER), results);
                cdolist_list_var = cdolist_list_var.rest();
                parse_cycl = cdolist_list_var.first();
            }
        }
        else if (parser_type.eql(removal_modules_cyclifier.$const12$CycPhraseStructureParser)) {
            if (removal_modules_cyclifier.NIL != forts.fort_p(parameters)) {
                results = psp_cyclifier_results(string, parameters);
            }
        }
        else if (parser_type.eql(removal_modules_cyclifier.$const13$CycDateParser)) {
            final SubLObject plist = parsing_parameter_plist(parameters);
            final SubLObject max_time = get_parsing_parameter_value((SubLObject)removal_modules_cyclifier.$kw14$MAX_TIME, plist, parser_type);
            SubLObject timed_outP = (SubLObject)removal_modules_cyclifier.NIL;
            SubLObject parses_$1 = (SubLObject)removal_modules_cyclifier.NIL;
            if (removal_modules_cyclifier.NIL != max_time) {
                final SubLObject _prev_bind_0 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                final SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                try {
                    parsing_macros.$parsing_timeout_time_check_count$.bind((SubLObject)removal_modules_cyclifier.ZERO_INTEGER, thread);
                    parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(max_time), thread);
                    parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                    parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                    if (removal_modules_cyclifier.NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                        parses_$1 = date_utilities.parse_date_from_string(string);
                    }
                    timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                }
                finally {
                    parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_3, thread);
                    parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_2, thread);
                    parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                parses_$1 = date_utilities.parse_date_from_string(string);
                timed_outP = (SubLObject)removal_modules_cyclifier.NIL;
            }
            if (removal_modules_cyclifier.NIL != parses_$1) {
                final SubLObject ambiguity_factor = Sequences.length(parses_$1);
                final SubLObject weight = Numbers.divide((SubLObject)removal_modules_cyclifier.ONE_INTEGER, ambiguity_factor);
                SubLObject cdolist_list_var2 = parses_$1;
                SubLObject parse2 = (SubLObject)removal_modules_cyclifier.NIL;
                parse2 = cdolist_list_var2.first();
                while (removal_modules_cyclifier.NIL != cdolist_list_var2) {
                    results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(parse2, weight), results);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    parse2 = cdolist_list_var2.first();
                }
            }
        }
        return iteration.new_list_iterator(Sequences.nreverse(results));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-cyclifier.lisp", position = 5313L)
    public static SubLObject unpack_parser_parameters_for_parser(final SubLObject parser_type, final SubLObject parameters) {
        if (parser_type.eql(removal_modules_cyclifier.$const7$CharniakParserCyclifier) || parser_type.eql(removal_modules_cyclifier.$const8$CharniakParser) || parser_type.eql(removal_modules_cyclifier.$const9$StanfordParserCyclifier) || parser_type.eql(removal_modules_cyclifier.$const10$LinkParserCyclifier)) {
            final SubLObject v_parser = new_parser_of_type(parser_type);
            return (SubLObject)ConsesLow.listS((SubLObject)removal_modules_cyclifier.$kw15$OUTPUT, (SubLObject)removal_modules_cyclifier.$kw16$VERBOSE, (SubLObject)removal_modules_cyclifier.$kw17$PARSER, v_parser, (SubLObject)removal_modules_cyclifier.$list18);
        }
        if (parser_type.eql(removal_modules_cyclifier.$const12$CycPhraseStructureParser)) {
            final SubLObject plist = parsing_parameter_plist(parameters);
            final SubLObject category = get_parsing_parameter_value((SubLObject)removal_modules_cyclifier.$kw19$CATEGORY, plist, parser_type);
            final SubLObject pos_pred = get_parsing_parameter_value((SubLObject)removal_modules_cyclifier.$kw20$POS_PRED, plist, parser_type);
            final SubLObject max_time = get_parsing_parameter_value((SubLObject)removal_modules_cyclifier.$kw14$MAX_TIME, plist, parser_type);
            final SubLObject non_trivialP = (SubLObject)removal_modules_cyclifier.NIL;
            final SubLObject mt = get_parsing_parameter_value((SubLObject)removal_modules_cyclifier.$kw21$LEXICON_LOOKUP_MT, plist, parser_type);
            return (SubLObject)ConsesLow.list(max_time, category, pos_pred, non_trivialP, mt);
        }
        return (SubLObject)removal_modules_cyclifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-cyclifier.lisp", position = 6199L)
    public static SubLObject psp_cyclifier_results(final SubLObject string, final SubLObject parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unpacked = unpack_parser_parameters_for_parser(removal_modules_cyclifier.$const12$CycPhraseStructureParser, parameters);
        final SubLObject max_time = unpacked.first();
        SubLObject timed_outP = (SubLObject)removal_modules_cyclifier.NIL;
        SubLObject parses = (SubLObject)removal_modules_cyclifier.NIL;
        SubLObject results = (SubLObject)removal_modules_cyclifier.NIL;
        if (removal_modules_cyclifier.NIL != max_time) {
            final SubLObject _prev_bind_0 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
            final SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
            try {
                parsing_macros.$parsing_timeout_time_check_count$.bind((SubLObject)removal_modules_cyclifier.ZERO_INTEGER, thread);
                parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(max_time), thread);
                parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                if (removal_modules_cyclifier.NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                    parses = Functions.apply((SubLObject)removal_modules_cyclifier.$sym22$PS_GET_CYCLS_FOR_PHRASE, (SubLObject)ConsesLow.cons(string, unpacked.rest()));
                }
                timed_outP = parsing_macros.parsing_timeout_time_reachedP();
            }
            finally {
                parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_3, thread);
                parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_2, thread);
                parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            parses = Functions.apply((SubLObject)removal_modules_cyclifier.$sym22$PS_GET_CYCLS_FOR_PHRASE, (SubLObject)ConsesLow.cons(string, unpacked.rest()));
            timed_outP = (SubLObject)removal_modules_cyclifier.NIL;
        }
        SubLObject cdolist_list_var = parses;
        SubLObject parse = (SubLObject)removal_modules_cyclifier.NIL;
        parse = cdolist_list_var.first();
        while (removal_modules_cyclifier.NIL != cdolist_list_var) {
            if (removal_modules_cyclifier.NIL == cycl_utilities.expression_find_if((SubLObject)removal_modules_cyclifier.$sym23$KEYWORDP, parse, (SubLObject)removal_modules_cyclifier.UNPROVIDED, (SubLObject)removal_modules_cyclifier.UNPROVIDED)) {
                results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(parsing_utilities.strip_nl_tags(parse, (SubLObject)removal_modules_cyclifier.UNPROVIDED), (SubLObject)removal_modules_cyclifier.ZERO_INTEGER), results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-cyclifier.lisp", position = 6755L)
    public static SubLObject new_parser_of_type(final SubLObject parser_type) {
        if (parser_type.eql(removal_modules_cyclifier.$const7$CharniakParserCyclifier) || parser_type.eql(removal_modules_cyclifier.$const8$CharniakParser)) {
            return parser.new_charniak_parser((SubLObject)removal_modules_cyclifier.UNPROVIDED, (SubLObject)removal_modules_cyclifier.UNPROVIDED);
        }
        if (parser_type.eql(removal_modules_cyclifier.$const9$StanfordParserCyclifier)) {
            return parser.new_stanford_parser((SubLObject)removal_modules_cyclifier.UNPROVIDED, (SubLObject)removal_modules_cyclifier.UNPROVIDED);
        }
        if (parser_type.eql(removal_modules_cyclifier.$const10$LinkParserCyclifier)) {
            return parser.new_link_parser((SubLObject)removal_modules_cyclifier.UNPROVIDED, (SubLObject)removal_modules_cyclifier.UNPROVIDED, (SubLObject)removal_modules_cyclifier.UNPROVIDED);
        }
        return (SubLObject)removal_modules_cyclifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-cyclifier.lisp", position = 7038L)
    public static SubLObject get_parsing_parameter_value(final SubLObject parameter, final SubLObject plist, final SubLObject v_parser) {
        SubLObject value = conses_high.getf(plist, parameter, (SubLObject)removal_modules_cyclifier.$kw24$NOT_SPECIFIED);
        if (removal_modules_cyclifier.$kw24$NOT_SPECIFIED == value) {
            final SubLObject cycl_parameter = parsing_parameter_from_keyword(parameter);
            value = parameter_specification_utilities.software_parameter_default_value(cycl_parameter, v_parser, mt_relevance_macros.inference_relevant_mt());
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-cyclifier.lisp", position = 7399L)
    public static SubLObject parsing_parameter_plist(final SubLObject parsing_parameter_spec) {
        final SubLObject parameter_value_tuples = parameter_specification_utilities.parameter_specification_tuples(parsing_parameter_spec);
        final SubLObject parsing_parameter_plist = parsing_parameter_plist_from_tuples(parameter_value_tuples);
        return parsing_parameter_plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-cyclifier.lisp", position = 7684L)
    public static SubLObject parsing_parameter_plist_from_tuples(final SubLObject parameter_value_tuples) {
        SubLObject result = (SubLObject)removal_modules_cyclifier.NIL;
        SubLObject cdolist_list_var = parameter_value_tuples;
        SubLObject tuple = (SubLObject)removal_modules_cyclifier.NIL;
        tuple = cdolist_list_var.first();
        while (removal_modules_cyclifier.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject parameter = (SubLObject)removal_modules_cyclifier.NIL;
            SubLObject kb_value = (SubLObject)removal_modules_cyclifier.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_cyclifier.$list25);
            parameter = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_cyclifier.$list25);
            kb_value = current.first();
            current = current.rest();
            if (removal_modules_cyclifier.NIL == current) {
                final SubLObject keyword = keyword_from_parsing_parameter(parameter);
                final SubLObject value = parse_kb_parsing_parameter_value(kb_value, keyword);
                result = conses_high.putf(result, keyword, value);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_cyclifier.$list25);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-cyclifier.lisp", position = 8083L)
    public static SubLObject parsing_parameter_from_keyword(final SubLObject keyword) {
        return parameter_specification_utilities.parameter_from_keyword(keyword, removal_modules_cyclifier.$const26$NLParsingParameter);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-cyclifier.lisp", position = 8204L)
    public static SubLObject keyword_from_parsing_parameter(final SubLObject parameter) {
        return parameter_specification_utilities.keyword_from_parameter(parameter);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-cyclifier.lisp", position = 8308L)
    public static SubLObject parse_kb_parsing_parameter_value(final SubLObject value, final SubLObject keyword) {
        if (keyword.eql((SubLObject)removal_modules_cyclifier.$kw14$MAX_TIME)) {
            return kb_query.kbq_convert_time_to_seconds(value);
        }
        return parameter_specification_utilities.parse_standard_parameter_value(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-cyclifier.lisp", position = 8517L)
    public static SubLObject cyclify_sentence_string_input_arg(final SubLObject asent) {
        final SubLObject pcase_var = cycl_utilities.formula_arg0(asent);
        if (pcase_var.eql(removal_modules_cyclifier.$const0$cyclificationOfStringFromParser)) {
            return cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_cyclifier.UNPROVIDED);
        }
        if (pcase_var.eql(removal_modules_cyclifier.$const4$parserRunToSpecificationWithInput)) {
            return cycl_utilities.formula_arg3(asent, (SubLObject)removal_modules_cyclifier.UNPROVIDED);
        }
        return (SubLObject)removal_modules_cyclifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-cyclifier.lisp", position = 8896L)
    public static SubLObject cyclify_sentence_cycl_arg(final SubLObject asent) {
        final SubLObject pcase_var = cycl_utilities.formula_arg0(asent);
        if (pcase_var.eql(removal_modules_cyclifier.$const0$cyclificationOfStringFromParser)) {
            return cycl_utilities.formula_arg2(asent, (SubLObject)removal_modules_cyclifier.UNPROVIDED);
        }
        if (pcase_var.eql(removal_modules_cyclifier.$const4$parserRunToSpecificationWithInput)) {
            return cycl_utilities.formula_arg4(asent, (SubLObject)removal_modules_cyclifier.UNPROVIDED);
        }
        return (SubLObject)removal_modules_cyclifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-cyclifier.lisp", position = 9178L)
    public static SubLObject cyclify_sentence_parser_arg(final SubLObject asent) {
        final SubLObject pcase_var = cycl_utilities.formula_arg0(asent);
        if (pcase_var.eql(removal_modules_cyclifier.$const0$cyclificationOfStringFromParser)) {
            return cycl_utilities.formula_arg3(asent, (SubLObject)removal_modules_cyclifier.UNPROVIDED);
        }
        if (pcase_var.eql(removal_modules_cyclifier.$const4$parserRunToSpecificationWithInput)) {
            return cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_cyclifier.UNPROVIDED);
        }
        return (SubLObject)removal_modules_cyclifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-cyclifier.lisp", position = 9463L)
    public static SubLObject cyclify_verify_general(final SubLObject asent, final SubLObject mt) {
        if (cyclify_sentence_parser_arg(asent).eql(removal_modules_cyclifier.$const11$EBMTCyclifier)) {
            final SubLObject cycls = ebmt_template_parser.ebmt_parse(cyclify_sentence_string_input_arg(asent), (SubLObject)removal_modules_cyclifier.UNPROVIDED, (SubLObject)removal_modules_cyclifier.UNPROVIDED);
            return conses_high.member(cyclify_sentence_cycl_arg(asent), cycls, (SubLObject)removal_modules_cyclifier.EQUAL, (SubLObject)removal_modules_cyclifier.UNPROVIDED);
        }
        return (SubLObject)removal_modules_cyclifier.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-cyclifier.lisp", position = 9832L)
    public static SubLObject cyclify_justify_general(final SubLObject asent, final SubLObject mt) {
        final SubLObject supports = (SubLObject)removal_modules_cyclifier.NIL;
        if (cyclify_sentence_parser_arg(asent).eql(removal_modules_cyclifier.$const11$EBMTCyclifier)) {
            return ebmt_supports(asent, mt);
        }
        return (SubLObject)removal_modules_cyclifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-cyclifier.lisp", position = 10070L)
    public static SubLObject ebmt_supports(final SubLObject asent, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = (SubLObject)removal_modules_cyclifier.NIL;
        final SubLObject target_cycl = cyclify_sentence_cycl_arg(asent);
        thread.resetMultipleValues();
        final SubLObject cycls = ebmt_template_parser.ebmt_parse(cyclify_sentence_string_input_arg(asent), (SubLObject)removal_modules_cyclifier.UNPROVIDED, (SubLObject)removal_modules_cyclifier.UNPROVIDED);
        final SubLObject justifications = thread.secondMultipleValue();
        final SubLObject weight = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject cycl = (SubLObject)removal_modules_cyclifier.NIL;
        SubLObject cycl_$2 = (SubLObject)removal_modules_cyclifier.NIL;
        SubLObject justification = (SubLObject)removal_modules_cyclifier.NIL;
        SubLObject justification_$3 = (SubLObject)removal_modules_cyclifier.NIL;
        cycl = cycls;
        cycl_$2 = cycl.first();
        justification = justifications;
        justification_$3 = justification.first();
        while (removal_modules_cyclifier.NIL != justification || removal_modules_cyclifier.NIL != cycl) {
            if (cycl_$2.equal(target_cycl)) {
                SubLObject cdolist_list_var = justification_$3;
                SubLObject support = (SubLObject)removal_modules_cyclifier.NIL;
                support = cdolist_list_var.first();
                while (removal_modules_cyclifier.NIL != cdolist_list_var) {
                    supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)removal_modules_cyclifier.$kw27$OPAQUE, ebmt_template_justification_sentence(support), mt, (SubLObject)removal_modules_cyclifier.UNPROVIDED), supports);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-cyclifier.lisp", position = 10599L)
    public static SubLObject ebmt_template_justification_sentence(final SubLObject ebmt_template) {
        return (SubLObject)ConsesLow.list(removal_modules_cyclifier.$const28$eBMTLinksMapToCycL, el_utilities.make_el_list(ebmt_template_parser.ebmt_template_links(ebmt_template), (SubLObject)removal_modules_cyclifier.UNPROVIDED), ebmt_template_parser.ebmt_template_cycl(ebmt_template));
    }
    
    public static SubLObject declare_removal_modules_cyclifier_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier", "cyclify_iterator", "CYCLIFY-ITERATOR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier", "unpack_parser_parameters_for_parser", "UNPACK-PARSER-PARAMETERS-FOR-PARSER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier", "psp_cyclifier_results", "PSP-CYCLIFIER-RESULTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier", "new_parser_of_type", "NEW-PARSER-OF-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier", "get_parsing_parameter_value", "GET-PARSING-PARAMETER-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier", "parsing_parameter_plist", "PARSING-PARAMETER-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier", "parsing_parameter_plist_from_tuples", "PARSING-PARAMETER-PLIST-FROM-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier", "parsing_parameter_from_keyword", "PARSING-PARAMETER-FROM-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier", "keyword_from_parsing_parameter", "KEYWORD-FROM-PARSING-PARAMETER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier", "parse_kb_parsing_parameter_value", "PARSE-KB-PARSING-PARAMETER-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier", "cyclify_sentence_string_input_arg", "CYCLIFY-SENTENCE-STRING-INPUT-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier", "cyclify_sentence_cycl_arg", "CYCLIFY-SENTENCE-CYCL-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier", "cyclify_sentence_parser_arg", "CYCLIFY-SENTENCE-PARSER-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier", "cyclify_verify_general", "CYCLIFY-VERIFY-GENERAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier", "cyclify_justify_general", "CYCLIFY-JUSTIFY-GENERAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier", "ebmt_supports", "EBMT-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier", "ebmt_template_justification_sentence", "EBMT-TEMPLATE-JUSTIFICATION-SENTENCE", 1, 0, false);
        return (SubLObject)removal_modules_cyclifier.NIL;
    }
    
    public static SubLObject init_removal_modules_cyclifier_file() {
        return (SubLObject)removal_modules_cyclifier.NIL;
    }
    
    public static SubLObject setup_removal_modules_cyclifier_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_cyclifier.$const0$cyclificationOfStringFromParser);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_cyclifier.$kw1$POS, removal_modules_cyclifier.$const0$cyclificationOfStringFromParser, (SubLObject)removal_modules_cyclifier.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_cyclifier.$kw1$POS, removal_modules_cyclifier.$const0$cyclificationOfStringFromParser, (SubLObject)removal_modules_cyclifier.THREE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_cyclifier.$kw2$CYCLIFY_POS_UNIFY_ARG2, (SubLObject)removal_modules_cyclifier.$list3);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_cyclifier.$const4$parserRunToSpecificationWithInput);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_cyclifier.$kw1$POS, removal_modules_cyclifier.$const4$parserRunToSpecificationWithInput, (SubLObject)removal_modules_cyclifier.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_cyclifier.$kw1$POS, removal_modules_cyclifier.$const4$parserRunToSpecificationWithInput, (SubLObject)removal_modules_cyclifier.TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_cyclifier.$kw1$POS, removal_modules_cyclifier.$const4$parserRunToSpecificationWithInput, (SubLObject)removal_modules_cyclifier.THREE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_cyclifier.$kw5$PARSER_RUN_WITH_SPEC_UNIFY_ARG4, (SubLObject)removal_modules_cyclifier.$list6);
        return (SubLObject)removal_modules_cyclifier.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_cyclifier_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_cyclifier_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_cyclifier_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_cyclifier();
        $const0$cyclificationOfStringFromParser = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cyclificationOfStringFromParser"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$CYCLIFY_POS_UNIFY_ARG2 = SubLObjectFactory.makeKeyword("CYCLIFY-POS-UNIFY-ARG2");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cyclificationOfStringFromParser")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cyclificationOfStringFromParser")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_cyclifier.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cyclificationOfStringFromParser")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("PARSER-TYPE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSER-TYPE")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-ITERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSER-TYPE"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("WEIGHT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cyclificationOfStringFromParser")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSER-TYPE")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("CYCLIFY"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$cyclificationOfStringFromParser <string> <not-fully-bound> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$cyclificationOfStringFromParser \"every person like cheese\" ?QUERY #$CharniakParserCyclifier)") });
        $const4$parserRunToSpecificationWithInput = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("parserRunToSpecificationWithInputStringReturnsCyclification"));
        $kw5$PARSER_RUN_WITH_SPEC_UNIFY_ARG4 = SubLObjectFactory.makeKeyword("PARSER-RUN-WITH-SPEC-UNIFY-ARG4");
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("parserRunToSpecificationWithInputStringReturnsCyclification")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("parserRunToSpecificationWithInputStringReturnsCyclification")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_cyclifier.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("parserRunToSpecificationWithInputStringReturnsCyclification")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("PARSER-TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("PARAMETERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSER-TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("PARAMETERS")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-ITERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSER-TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("PARAMETERS"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("WEIGHT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("parserRunToSpecificationWithInputStringReturnsCyclification")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSER-TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("PARAMETERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("CYCLIFY"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$parserRunToSpecificationWithInputStringReturnsCyclification <fully-bound> <fully-bound> <string> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$parserRunToSpecificationWithInputStringReturnsCyclification #$CharniakParserCyclifier (#$DefaultParameterSpecificationForParserFn #$CharniakParserCyclifier) \"every person likes cheese\" ?CYCL)") });
        $const7$CharniakParserCyclifier = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CharniakParserCyclifier"));
        $const8$CharniakParser = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CharniakParser"));
        $const9$StanfordParserCyclifier = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StanfordParserCyclifier"));
        $const10$LinkParserCyclifier = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LinkParserCyclifier"));
        $const11$EBMTCyclifier = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EBMTCyclifier"));
        $const12$CycPhraseStructureParser = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycPhraseStructureParser"));
        $const13$CycDateParser = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycDateParser"));
        $kw14$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $kw15$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $kw16$VERBOSE = SubLObjectFactory.makeKeyword("VERBOSE");
        $kw17$PARSER = SubLObjectFactory.makeKeyword("PARSER");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SCORE-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION-COVERAGE"));
        $kw19$CATEGORY = SubLObjectFactory.makeKeyword("CATEGORY");
        $kw20$POS_PRED = SubLObjectFactory.makeKeyword("POS-PRED");
        $kw21$LEXICON_LOOKUP_MT = SubLObjectFactory.makeKeyword("LEXICON-LOOKUP-MT");
        $sym22$PS_GET_CYCLS_FOR_PHRASE = SubLObjectFactory.makeSymbol("PS-GET-CYCLS-FOR-PHRASE");
        $sym23$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $kw24$NOT_SPECIFIED = SubLObjectFactory.makeKeyword("NOT-SPECIFIED");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAMETER"), (SubLObject)SubLObjectFactory.makeSymbol("KB-VALUE"));
        $const26$NLParsingParameter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLParsingParameter"));
        $kw27$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $const28$eBMTLinksMapToCycL = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eBMTLinksMapToCycL"));
    }
}

/*

	Total time: 81 ms
	
*/