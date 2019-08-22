package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class query_sentence_lexifier extends SubLTranslatedFile {
    public static final SubLFile me = new query_sentence_lexifier();

    public static final String myName = "com.cyc.cycjava.cycl.query_sentence_lexifier";

    public static final String myFingerPrint = "89c63675f83e88f9012167eb05fd0c155151976c323c4801c6d1ca48ab23b481";

    // defparameter
    private static final SubLSymbol $qsl_on_single_literal_query$ = makeSymbol("*QSL-ON-SINGLE-LITERAL-QUERY*");





    // Internal Constants
    public static final SubLSymbol POSSIBLY_REPLACEABLE_TERM_P = makeSymbol("POSSIBLY-REPLACEABLE-TERM-P");



    public static final SubLList $list2 = list(makeKeyword("ABBREVS"), makeKeyword("ACRONYMS"));



    public static final SubLList $list4 = list(makeString("the"));

    public static final SubLSymbol $sym5$MAPPED_EXPRESSION_SUBSUMES_ = makeSymbol("MAPPED-EXPRESSION-SUBSUMES?");

    public static final SubLSymbol PARSE_TREE_STRING = makeSymbol("PARSE-TREE-STRING");

    public static final SubLList $list7 = cons(makeSymbol("TERM"), makeSymbol("TERM-GLOSS"));

    public static final SubLString $str8$_b = makeString("\\b");

    public static final SubLList $list9 = list(makeKeyword("CASELESS"));

    public static final SubLString $$$No_string_positions_for_ = makeString("No string positions for ");

    public static final SubLString $$$_in_ = makeString(" in ");

    public static final SubLString $$$No_term_positions_for_ = makeString("No term positions for ");

    public static final SubLString $str13$Non_singleton_string_positions_fo = makeString("Non-singleton string positions for ");

    public static final SubLString $str14$Non_singleton_term_positions_for_ = makeString("Non-singleton term positions for ");







    public static final SubLString $str18$Couldn_t_find_strings_for_any_ter = makeString("Couldn't find strings for any terms in");

    public static final SubLString $$$_ = makeString(" ");

    public static final SubLString $str20$_ = makeString("?");

    public static final SubLString $str21$_ = makeString(".");

    public static final SubLList $list22 = list(makeSymbol("TERM"), makeSymbol("START"), makeSymbol("TERM-GLOSS"), makeSymbol("TREE"));

    public static final SubLString $str23$_ = makeString("-");

    private static final SubLObject $$NounPhrase = reader_make_constant_shell(makeString("NounPhrase"));







    private static final SubLObject $$nonThirdSg_Present = reader_make_constant_shell(makeString("nonThirdSg-Present"));



    private static final SubLObject $$thirdPersonSg_Present = reader_make_constant_shell(makeString("thirdPersonSg-Present"));



    private static final SubLObject $$singular_Generic = reader_make_constant_shell(makeString("singular-Generic"));



    private static final SubLObject $$plural_Generic = reader_make_constant_shell(makeString("plural-Generic"));

    public static final SubLSymbol $sym35$_ = makeSymbol("<");





    private static final SubLObject $$genTemplate_QuerySentence = reader_make_constant_shell(makeString("genTemplate-QuerySentence"));

    public static final SubLString $str39$__a_z0_9__ = makeString("[^a-z0-9-]");

    public static final SubLString $str40$__a_z0_9_ = makeString("[^a-z0-9]");

    public static final SubLString $str41$_ = makeString("^");

    public static final SubLString $str42$_ = makeString("$");

    public static final SubLString $str43$_ = makeString("|");

    private static final SubLObject $$Date = reader_make_constant_shell(makeString("Date"));

    public static final SubLSymbol UNIT_OF_MONEY_P = makeSymbol("UNIT-OF-MONEY-P");

    private static final SubLObject $$UnitOfMoney = reader_make_constant_shell(makeString("UnitOfMoney"));

    public static final SubLSymbol $unit_of_money_p_caching_state$ = makeSymbol("*UNIT-OF-MONEY-P-CACHING-STATE*");

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLObject $$Time_Quantity = reader_make_constant_shell(makeString("Time-Quantity"));

    private static final SubLSymbol SENTENTIAL_OPERATORS = makeSymbol("SENTENTIAL-OPERATORS");

    private static final SubLObject $$SententialOperator = reader_make_constant_shell(makeString("SententialOperator"));

    private static final SubLSymbol $sentential_operators_caching_state$ = makeSymbol("*SENTENTIAL-OPERATORS-CACHING-STATE*");

    private static final SubLSymbol CLEAR_SENTENTIAL_OPERATORS = makeSymbol("CLEAR-SENTENTIAL-OPERATORS");

    private static final SubLList $list54 = list(list(makeSymbol("QUERY-SENTENCE"), makeSymbol("GLOSS"), makeSymbol("TEMPLATE"), makeSymbol("&KEY"), makeSymbol("TEST-SPECIFICATION-TYPE"), makeSymbol("TEMPLATE-FOLDER")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list55 = list(makeKeyword("TEST-SPECIFICATION-TYPE"), makeKeyword("TEMPLATE-FOLDER"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $TEST_SPECIFICATION_TYPE = makeKeyword("TEST-SPECIFICATION-TYPE");



    private static final SubLSymbol $sym59$FTG_GAF = makeUninternedSymbol("FTG-GAF");

    private static final SubLSymbol $sym60$QUERY_SPEC = makeUninternedSymbol("QUERY-SPEC");





    private static final SubLList $list63 = list(reader_make_constant_shell(makeString("formulaTemplateGloss")), makeKeyword("TRUTH"), makeKeyword("TRUE"));



    private static final SubLSymbol GAF_ARGS = makeSymbol("GAF-ARGS");



    private static final SubLSymbol PRED_VALUES = makeSymbol("PRED-VALUES");

    private static final SubLList $list68 = list(reader_make_constant_shell(makeString("querySpecificationForFormulaTemplate")), ONE_INTEGER, TWO_INTEGER, makeKeyword("TRUE"));









    private static final SubLSymbol NAT_FUNCTOR = makeSymbol("NAT-FUNCTOR");

    private static final SubLList $list74 = list(reader_make_constant_shell(makeString("TestQueryFn")));

    private static final SubLSymbol $sym75$ISA_ = makeSymbol("ISA?");

    private static final SubLSymbol NAT_ARG1 = makeSymbol("NAT-ARG1");

    private static final SubLSymbol $sym77$MEMBER_ = makeSymbol("MEMBER?");

    private static final SubLSymbol PRED_VALUES_IN_ANY_MT = makeSymbol("PRED-VALUES-IN-ANY-MT");

    private static final SubLList $list79 = list(reader_make_constant_shell(makeString("folderContainsResource")), TWO_INTEGER, ONE_INTEGER);

    private static final SubLSymbol KBQ_SENTENCES = makeSymbol("KBQ-SENTENCES");

    private static final SubLList $list81 = list(list(makeSymbol("QUERY-SENTENCE"), makeSymbol("GLOSS"), makeSymbol("TEMPLATE"), makeSymbol("ALIST"), makeSymbol("&KEY"), makeSymbol("TEST-SPECIFICATION-TYPE"), makeSymbol("TEMPLATE-FOLDER")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_REIFIED_QUERY_SPEC_SENTENCES = makeSymbol("DO-REIFIED-QUERY-SPEC-SENTENCES");



    private static final SubLSymbol GTQS_FIND_TERM_GLOSSES = makeSymbol("GTQS-FIND-TERM-GLOSSES");

    private static final SubLObject $$TKBTestQuery = reader_make_constant_shell(makeString("TKBTestQuery"));

    private static final SubLObject $$TKB_RedTeamQueryFolder = reader_make_constant_shell(makeString("TKB-RedTeamQueryFolder"));

    private static final SubLString $str87$In_Mt__EnglishParaphraseMt_ = makeString("In Mt: EnglishParaphraseMt.");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$formulaTemplateGloss = reader_make_constant_shell(makeString("formulaTemplateGloss"));





    private static final SubLList $list93 = list(makeSymbol("TEMPLATE"), makeSymbol("GLOSS"));

    private static final SubLObject $$TestQueryFn = reader_make_constant_shell(makeString("TestQueryFn"));

    private static final SubLObject $$folderContainsResource = reader_make_constant_shell(makeString("folderContainsResource"));

    private static final SubLString $str96$__f___S_____ = makeString("~&f: ~S.~%~%");

    private static final SubLObject $const97$querySpecificationForFormulaTempl = reader_make_constant_shell(makeString("querySpecificationForFormulaTemplate"));

    private static final SubLString $str98$___Template___S__ = makeString("~% Template: ~S~%");

    private static final SubLString $str99$___S___Gloss___S__ = makeString("~%~S~% Gloss: ~S~%");



    private static final SubLString $str101$_Old___S__ = makeString(" Old: ~S~%");

    private static final SubLSymbol GTQS_ASSERTION_P = makeSymbol("GTQS-ASSERTION-P");

    private static final SubLString $str103$___New___S__ = makeString("~% New: ~S~%");

    private static final SubLObject $$genTemplate = reader_make_constant_shell(makeString("genTemplate"));

    private static final SubLString $$$ARG = makeString("ARG");

    private static final SubLObject $$genTemplate_Constrained = reader_make_constant_shell(makeString("genTemplate-Constrained"));

    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));



    private static final SubLObject $const109$InstanceTypeTernaryRuleMacroPredi = reader_make_constant_shell(makeString("InstanceTypeTernaryRuleMacroPredicate"));

    private static final SubLObject $const110$TypeInstanceTernaryRuleMacroPredi = reader_make_constant_shell(makeString("TypeInstanceTernaryRuleMacroPredicate"));

    private static final SubLObject $$TypeTypeTernaryRuleMacroPredicate = reader_make_constant_shell(makeString("TypeTypeTernaryRuleMacroPredicate"));

    private static final SubLList $list112 = list(makeString(" "), makeString(","));

    private static final SubLObject $$Pronoun = reader_make_constant_shell(makeString("Pronoun"));

    private static final SubLObject $$Determiner = reader_make_constant_shell(makeString("Determiner"));

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLList $list116 = list(makeSymbol("TEMPLATE"), makeSymbol("CYCL"), makeSymbol("GLOSS"));

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str119$Total_attempts___S_in__S_seconds_ = makeString("Total attempts: ~S in ~S seconds~%");

    private static final SubLString $str120$Successful_attempts___S__ = makeString("Successful attempts: ~S~%");

    private static final SubLString $str121$__successful___S__ = makeString("% successful: ~S~%");



    private static final SubLString $str123$Average_time_per_attempt___S__ = makeString("Average time per attempt: ~S~%");

    private static final SubLString $str124$__Successful_GTQS_Constructions__ = makeString("**Successful GTQS Constructions** ~%");

    private static final SubLList $list125 = list(makeSymbol("GTQS"), makeSymbol("CYCL"), makeSymbol("GLOSS"));

    private static final SubLString $str126$CycL___S__Gloss___S__GTQS___S____ = makeString("CycL: ~S~%Gloss: ~S~%GTQS: ~S~%~%~%");

    private static final SubLString $str127$__________Unsuccessful_GTQS_Const = makeString("~%~%~%~%**Unsuccessful GTQS Constructions** ~%");

    public static SubLObject gtqs_add_term_gloss(final SubLObject v_term, final SubLObject gloss, SubLObject a_list) {
        SubLObject doneP = NIL;
        final SubLObject a_list_terms = list_utilities.alist_keys(a_list);
        if (NIL == doneP) {
            SubLObject csome_list_var = a_list_terms;
            SubLObject a_list_term = NIL;
            a_list_term = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                if (NIL != cycl_utilities.expression_find(v_term, a_list_term, NIL, symbol_function(EQUAL), UNPROVIDED)) {
                    doneP = T;
                } else
                    if (NIL != cycl_utilities.expression_find(a_list_term, v_term, NIL, symbol_function(EQUAL), UNPROVIDED)) {
                        a_list = list_utilities.alist_delete(a_list, a_list_term, UNPROVIDED);
                    }

                csome_list_var = csome_list_var.rest();
                a_list_term = csome_list_var.first();
            } 
        }
        final SubLObject a_list_values = list_utilities.alist_values(a_list);
        if (NIL == doneP) {
            SubLObject csome_list_var2 = a_list_values;
            SubLObject a_list_value = NIL;
            a_list_value = csome_list_var2.first();
            while ((NIL == doneP) && (NIL != csome_list_var2)) {
                if ((NIL != string_utilities.subwordP(gloss, a_list_value, UNPROVIDED, UNPROVIDED)) || (NIL != string_utilities.subwordP(a_list_value, gloss, UNPROVIDED, UNPROVIDED))) {
                    a_list = list_utilities.alist_delete(a_list, list_utilities.alist_reverse_lookup(a_list, a_list_value, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                    doneP = T;
                }
                csome_list_var2 = csome_list_var2.rest();
                a_list_value = csome_list_var2.first();
            } 
        }
        if (NIL == doneP) {
            a_list = list_utilities.alist_enter(a_list, v_term, gloss, UNPROVIDED);
        }
        return a_list;
    }

    public static SubLObject gtqs_find_term_glosses(final SubLObject cycl_query, final SubLObject english_query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject terms = NIL;
        SubLObject result = NIL;
        SubLObject terms_we_failed_to_find = NIL;
        final SubLObject _prev_bind_0 = $qsl_on_single_literal_query$.currentBinding(thread);
        try {
            $qsl_on_single_literal_query$.bind(cycl_grammar.cycl_atomic_sentence_p(cycl_query), thread);
            terms = cycl_utilities.expression_gather(cycl_query, POSSIBLY_REPLACEABLE_TERM_P, NIL, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
        } finally {
            $qsl_on_single_literal_query$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject phrases = pph_methods_lexicon.all_phrases_for_term(narts_high.nart_substitute(v_term), $ALL, $list2, $TEXT, NIL, NIL, $list4, UNPROVIDED);
            SubLObject max_phrase_length = ZERO_INTEGER;
            SubLObject selected_phrase = NIL;
            SubLObject cdolist_list_var_$1 = phrases;
            SubLObject phrase = NIL;
            phrase = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                if ((NIL != english_query_contains_phraseP(phrase, english_query)) && (NIL != list_utilities.lengthG(phrase, max_phrase_length, UNPROVIDED))) {
                    max_phrase_length = length(phrase);
                    selected_phrase = phrase;
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                phrase = cdolist_list_var_$1.first();
            } 
            if (selected_phrase.isString()) {
                result = gtqs_add_term_gloss(v_term, selected_phrase, result);
            } else {
                terms_we_failed_to_find = cons(v_term, terms_we_failed_to_find);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        result = list_utilities.delete_subsumed_items(result, $sym5$MAPPED_EXPRESSION_SUBSUMES_, UNPROVIDED);
        return values(result, terms_we_failed_to_find);
    }

    public static SubLObject get_term_offsets(final SubLObject term_glosses, final SubLObject gloss, final SubLObject query_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject syntactic_xps = ql_syntactic_xps(gloss);
        final SubLObject gloss_tree = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject syntactic_xp_strings = Mapping.mapcar(PARSE_TREE_STRING, syntactic_xps);
        SubLObject problem_message = NIL;
        SubLObject term_offsets = NIL;
        SubLObject cdolist_list_var = term_glosses;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject v_term = NIL;
            SubLObject term_gloss = NIL;
            destructuring_bind_must_consp(current, datum, $list7);
            v_term = current.first();
            current = term_gloss = current.rest();
            if (term_gloss.isString()) {
                final SubLObject term_gloss_regex = cconcatenate($str8$_b, new SubLObject[]{ format_nil.format_nil_a_no_copy(term_gloss), $str8$_b });
                final SubLObject string_positions = list_utilities.alist_keys(regular_expression_utilities.offsets_of_regex_matches(term_gloss_regex, gloss, $list9, UNPROVIDED));
                final SubLObject term_positions = cycl_utilities.arg_positions_dfs(v_term, query_sentence, symbol_function(EQUAL));
                if (NIL == string_positions) {
                    problem_message = cons(cconcatenate($$$No_string_positions_for_, new SubLObject[]{ format_nil.format_nil_s_no_copy(term_gloss), format_nil.$format_nil_percent$.getGlobalValue(), $$$_in_, format_nil.format_nil_s_no_copy(gloss), format_nil.$format_nil_percent$.getGlobalValue() }), problem_message);
                } else
                    if (NIL == term_positions) {
                        problem_message = cons(cconcatenate($$$No_term_positions_for_, new SubLObject[]{ format_nil.format_nil_s_no_copy(term_gloss), format_nil.$format_nil_percent$.getGlobalValue(), $$$_in_, format_nil.format_nil_s_no_copy(gloss), format_nil.$format_nil_percent$.getGlobalValue() }), problem_message);
                    } else
                        if (NIL == list_utilities.singletonP(string_positions)) {
                            problem_message = cons(cconcatenate($str13$Non_singleton_string_positions_fo, new SubLObject[]{ format_nil.format_nil_s_no_copy(term_gloss), format_nil.$format_nil_percent$.getGlobalValue(), $$$_in_, format_nil.format_nil_s_no_copy(gloss), format_nil.$format_nil_percent$.getGlobalValue() }), problem_message);
                        } else
                            if (NIL == list_utilities.singletonP(term_positions)) {
                                problem_message = cons(cconcatenate($str14$Non_singleton_term_positions_for_, new SubLObject[]{ format_nil.format_nil_s_no_copy(v_term), format_nil.$format_nil_percent$.getGlobalValue(), $$$_in_, format_nil.format_nil_s_no_copy(query_sentence), format_nil.$format_nil_percent$.getGlobalValue() }), problem_message);
                            } else {
                                final SubLObject tree = best_tree_for_string(term_gloss, syntactic_xps, syntactic_xp_strings, gloss_tree);
                                term_offsets = cons(list(v_term, string_positions.first(), term_gloss, tree), term_offsets);
                            }



            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return values(term_offsets, problem_message);
    }

    public static SubLObject pph_phrase_from_sentence(final SubLObject query_sentence, SubLObject gloss, final SubLObject term_glosses, SubLObject parsing_usefulP, SubLObject force) {
        if (parsing_usefulP == UNPROVIDED) {
            parsing_usefulP = NIL;
        }
        if (force == UNPROVIDED) {
            force = $INTERROGATIVE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject problem_message = (NIL != find_if(STRINGP, term_glosses, symbol_function(CDR), UNPROVIDED, UNPROVIDED)) ? NIL : cconcatenate($str18$Couldn_t_find_strings_for_any_ter, new SubLObject[]{ format_nil.$format_nil_percent$.getGlobalValue(), $$$_, format_nil.format_nil_s_no_copy(query_sentence), format_nil.$format_nil_percent$.getGlobalValue(), $$$_in_, format_nil.format_nil_s_no_copy(gloss) });
        SubLObject query_sentence_with_keys = copy_expression(query_sentence);
        SubLObject term_offsets = NIL;
        SubLObject v_pph_phrase = NIL;
        SubLObject parsing_phrase = NIL;
        if (NIL != problem_message) {
            return values(v_pph_phrase, query_sentence_with_keys, problem_message);
        }
        gloss = string_utilities.trim_whitespace(gloss);
        thread.resetMultipleValues();
        final SubLObject term_offsets_$2 = get_term_offsets(term_glosses, gloss, query_sentence);
        final SubLObject problem_message_$3 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        term_offsets = term_offsets_$2;
        problem_message = problem_message_$3;
        gloss = string_utilities.post_remove(gloss, $str20$_, UNPROVIDED);
        gloss = string_utilities.post_remove(gloss, $str21$_, UNPROVIDED);
        SubLObject index = ZERO_INTEGER;
        SubLObject dtrs = NIL;
        SubLObject cdolist_list_var = Sort.sort(term_offsets, symbol_function($sym35$_), symbol_function(SECOND));
        SubLObject term_offset = NIL;
        term_offset = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = term_offset;
            SubLObject v_term = NIL;
            SubLObject start = NIL;
            SubLObject term_gloss = NIL;
            SubLObject tree = NIL;
            destructuring_bind_must_consp(current, datum, $list22);
            v_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list22);
            start = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list22);
            term_gloss = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list22);
            tree = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject nospace_before_termP = NIL;
                if (start.numG(index)) {
                    final SubLObject whole_prefix_string = string_utilities.substring(gloss, index, start);
                    final SubLObject nospaceP = makeBoolean((NIL != dtrs) && (NIL == string_utilities.starts_with(whole_prefix_string, $$$_)));
                    if (NIL == string_utilities.ends_with(whole_prefix_string, $$$_, UNPROVIDED)) {
                        nospace_before_termP = T;
                    }
                    dtrs = handle_unmatched_strings(whole_prefix_string, dtrs, nospaceP);
                }
                final SubLObject term_key = make_keyword(string_utilities.replace_substring(Strings.string_upcase(term_gloss, UNPROVIDED, UNPROVIDED), $$$_, $str23$_));
                SubLObject term_dtr = pph_data_structures.new_pph_phrase(term_gloss, term_key, UNPROVIDED);
                final SubLObject top_dtr = dtrs.first();
                final SubLObject top_dtr_string = (NIL != pph_phrase.pph_phrase_p(top_dtr, UNPROVIDED)) ? pph_phrase.pph_phrase_string(top_dtr, UNPROVIDED) : NIL;
                if (NIL != subl_promotions.memberP(v_term, lexicon_accessors.denots_of_name_string(term_gloss, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                    pph_phrase.pph_phrase_set_category(term_dtr, $$NounPhrase, UNPROVIDED);
                } else
                    if (NIL != parse_tree.verbal_tree_p(tree)) {
                        final SubLObject head_phrase = methods.funcall_instance_method_with_0_args(tree, GET_HEAD_DAUGHTERS).first();
                        final SubLObject head_string = (NIL != head_phrase) ? parse_tree_utilities.parse_tree_string(head_phrase) : NIL;
                        final SubLObject head_preds = (NIL != head_phrase) ? lexicon_utilities.preds_of_string(head_string, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
                        SubLObject term_pred = NIL;
                        if (NIL == term_pred) {
                            SubLObject csome_list_var = head_preds;
                            SubLObject pred = NIL;
                            pred = csome_list_var.first();
                            while ((NIL == term_pred) && (NIL != csome_list_var)) {
                                if (NIL != subl_promotions.memberP(v_term, lexicon_accessors.denots_of_stringXpred(term_gloss, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                                    term_pred = pred;
                                }
                                csome_list_var = csome_list_var.rest();
                                pred = csome_list_var.first();
                            } 
                        }
                        if ((NIL != head_phrase) && (methods.funcall_instance_method_with_0_args(head_phrase, GET_CATEGORY) == $VBP)) {
                            term_pred = $$nonThirdSg_Present;
                        } else
                            if ((NIL != head_phrase) && (methods.funcall_instance_method_with_0_args(head_phrase, GET_CATEGORY) == $VBZ)) {
                                term_pred = $$thirdPersonSg_Present;
                            }

                        if (NIL != term_pred) {
                            pph_phrase.pph_phrase_set_agr_pred(term_dtr, term_pred, UNPROVIDED);
                        }
                    } else
                        if (NIL != parse_tree.nominal_tree_p(tree)) {
                            final SubLObject head_daughters = methods.funcall_instance_method_with_0_args(tree, GET_HEAD_DAUGHTERS);
                            final SubLObject head_phrase2 = (NIL != head_daughters) ? head_daughters.first() : tree;
                            final SubLObject head_string2 = (NIL != head_phrase2) ? parse_tree_utilities.parse_tree_string(head_phrase2) : NIL;
                            final SubLObject head_preds2 = (NIL != head_string2) ? lexicon_utilities.preds_of_string(head_string2, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
                            SubLObject term_pred2 = NIL;
                            if (NIL != string_utilities.substringP(head_string2, pph_phrase.pph_phrase_string(term_dtr, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                if (NIL == term_pred2) {
                                    SubLObject csome_list_var2 = head_preds2;
                                    SubLObject pred2 = NIL;
                                    pred2 = csome_list_var2.first();
                                    while ((NIL == term_pred2) && (NIL != csome_list_var2)) {
                                        if (NIL != subl_promotions.memberP(v_term, lexicon_accessors.denots_of_stringXpred(term_gloss, pred2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                                            term_pred2 = pred2;
                                        }
                                        csome_list_var2 = csome_list_var2.rest();
                                        pred2 = csome_list_var2.first();
                                    } 
                                }
                                if ((NIL != head_phrase2) && (methods.funcall_instance_method_with_0_args(head_phrase2, GET_CATEGORY) == $NN)) {
                                    term_pred2 = $$singular_Generic;
                                } else
                                    if ((NIL != head_phrase2) && (methods.funcall_instance_method_with_0_args(head_phrase2, GET_CATEGORY) == $NNS)) {
                                        term_pred2 = $$plural_Generic;
                                    }

                                if (NIL != term_pred2) {
                                    pph_phrase.pph_phrase_set_agr_pred(term_dtr, term_pred2, UNPROVIDED);
                                }
                                if (NIL != top_dtr) {
                                    term_dtr = pph_templates.pph_new_np_from_det_and_nbar(top_dtr, term_dtr, UNPROVIDED);
                                    pph_phrase.pph_phrase_set_string(term_dtr, string_utilities.bunge(list(pph_phrase.pph_phrase_string(top_dtr, UNPROVIDED), term_gloss), UNPROVIDED));
                                }
                                dtrs = dtrs.rest();
                            }
                        }


                if (NIL != nospace_before_termP) {
                    dtrs = dtrs.rest();
                    dtrs = cons(nospace_phrase_from_phrases(list(top_dtr, term_dtr)), dtrs);
                } else {
                    dtrs = cons(term_dtr, dtrs);
                }
                query_sentence_with_keys = cycl_utilities.formula_subst(term_key, v_term, query_sentence_with_keys, symbol_function(EQUAL), UNPROVIDED);
                index = add(start, length(term_gloss));
            } else {
                cdestructuring_bind_error(datum, $list22);
            }
            cdolist_list_var = cdolist_list_var.rest();
            term_offset = cdolist_list_var.first();
        } 
        if (NIL != list_utilities.lengthG(gloss, index, UNPROVIDED)) {
            final SubLObject whole_tail_string = string_utilities.substring(gloss, index, UNPROVIDED);
            final SubLObject nospaceP2 = makeBoolean((NIL != dtrs) && (NIL == string_utilities.starts_with(whole_tail_string, $$$_)));
            dtrs = handle_unmatched_strings(whole_tail_string, dtrs, nospaceP2);
        }
        if (NIL != dtrs) {
            if (NIL != list_utilities.singletonP(dtrs)) {
                v_pph_phrase = dtrs.first();
            } else {
                v_pph_phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                pph_phrase.set_pph_phrase_dtrs_from_list(v_pph_phrase, nreverse(dtrs), UNPROVIDED);
            }
        }
        if (NIL != v_pph_phrase) {
            relation_lexifier.rel_lex_guess_more_info(v_pph_phrase);
            relation_lexifier.rel_lex_revert_generic_arg_phrases(v_pph_phrase);
            if (NIL != parsing_usefulP) {
                parsing_phrase = pph_phrase.pph_phrase_copy(v_pph_phrase, UNPROVIDED, UNPROVIDED);
            }
            relation_lexifier.rel_lex_merge_strings(v_pph_phrase);
        }
        return values(v_pph_phrase, query_sentence_with_keys, problem_message, parsing_phrase);
    }

    public static SubLObject nl_templates_from_sentence_gloss_info(final SubLObject query_sentence, final SubLObject gloss, final SubLObject alist, final SubLObject generationP, final SubLObject parsingP, SubLObject force) {
        if (force == UNPROVIDED) {
            force = $INTERROGATIVE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject gen_ans = NIL;
        SubLObject parse_ans = NIL;
        SubLObject problem_message = NIL;
        final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
        try {
            pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
            pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
            pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
            try {
                thread.resetMultipleValues();
                final SubLObject gen_phrase = pph_phrase_from_sentence(query_sentence, gloss, alist, parsingP, force);
                final SubLObject query_sentence_with_keys = thread.secondMultipleValue();
                final SubLObject pph_phrase_problem = thread.thirdMultipleValue();
                final SubLObject parsing_phrase = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                problem_message = pph_phrase_problem;
                if ((NIL != gen_phrase) && (NIL != generationP)) {
                    final SubLObject gentemplate_phrase = pph_templates.gentemplate_phrase_from_pph_phrase_int(gen_phrase);
                    if ((force == $DECLARATIVE) && (NIL != rmp_gafP(query_sentence))) {
                        gen_ans = create_gentemplate_constrained_sentence(query_sentence_with_keys, gentemplate_phrase);
                    } else
                        if ((force == $DECLARATIVE) && (NIL != gafP(query_sentence))) {
                            gen_ans = create_gentemplate_sentence(query_sentence_with_keys, gentemplate_phrase);
                        } else
                            if (force == $INTERROGATIVE) {
                                gen_ans = make_binary_formula($$genTemplate_QuerySentence, query_sentence_with_keys, gentemplate_phrase);
                            }


                }
                if ((NIL != parsingP) && (NIL != parsing_phrase)) {
                    parse_ans = relation_lexifier.qsl_parse_template_from_pph_phrase(query_sentence, parsing_phrase, query_sentence_with_keys, force);
                }
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    pph_macros.destroy_new_pph_phrases();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
            pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
            pph_macros.$new_pph_phrases$.rebind(_prev_bind_0, thread);
        }
        return values(gen_ans, parse_ans, problem_message);
    }

    public static SubLObject gtqs_and_parse_template_from_query_sentence_gloss_info(final SubLObject query_sentence, final SubLObject gloss, final SubLObject term_gloss_alist, SubLObject force) {
        if (force == UNPROVIDED) {
            force = $INTERROGATIVE;
        }
        return nl_templates_from_sentence_gloss_info(query_sentence, gloss, term_gloss_alist, T, T, force);
    }

    public static SubLObject construct_gtqs_sentence_and_parse_template_for_query_sentence_from_gloss(final SubLObject query_sentence, final SubLObject gloss, SubLObject force) {
        if (force == UNPROVIDED) {
            force = $INTERROGATIVE;
        }
        final SubLObject gloss_info = gtqs_find_term_glosses(query_sentence, gloss);
        return gtqs_and_parse_template_from_query_sentence_gloss_info(query_sentence, gloss, gloss_info, force);
    }

    public static SubLObject mapped_expression_subsumesP(final SubLObject expression1, final SubLObject expression2) {
        return makeBoolean(((NIL != cycl_utilities.expression_find(expression2.first(), expression1.first(), NIL, symbol_function(EQUAL), UNPROVIDED)) && expression1.rest().isString()) && ((!expression2.rest().isString()) || (NIL != string_utilities.substringP(expression2.rest(), expression1.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject english_query_contains_phraseP(final SubLObject phrase, final SubLObject english_query) {
        final SubLObject reg_exp = regular_expression_string_for_phrase_match(phrase);
        return list_utilities.sublisp_boolean(regular_expression_utilities.find_all_matches_for_regular_expression(reg_exp, english_query, $list9, UNPROVIDED));
    }

    public static SubLObject regular_expression_string_for_phrase_match(final SubLObject phrase) {
        final SubLObject escaped_phrase = regular_expression_utilities.escape_regex_special_chars(phrase);
        final SubLObject reg_exp1 = cconcatenate($str39$__a_z0_9__, new SubLObject[]{ escaped_phrase, $str40$__a_z0_9_ });
        final SubLObject reg_exp2 = cconcatenate($str41$_, new SubLObject[]{ escaped_phrase, $str40$__a_z0_9_ });
        final SubLObject reg_exp3 = cconcatenate($str39$__a_z0_9__, new SubLObject[]{ escaped_phrase, $str42$_ });
        final SubLObject reg_exp4 = cconcatenate(reg_exp1, new SubLObject[]{ $str43$_, reg_exp2, $str43$_, reg_exp3 });
        return reg_exp4;
    }

    public static SubLObject possibly_replaceable_term_p(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $qsl_on_single_literal_query$.getDynamicValue(thread)) && (NIL != fort_types_interface.relation_p(cycl))) {
            return NIL;
        }
        if (NIL != time_quantity_p(cycl)) {
            return T;
        }
        if (cycl.isNumber()) {
            return T;
        }
        if (NIL != sentential_operator_p(cycl)) {
            return NIL;
        }
        if ((NIL != narts_high.naut_p(cycl)) && (((NIL != narts_high.find_nart(cycl)) || (NIL != unit_of_money_p(cycl_utilities.naut_functor(cycl)))) || (NIL != isa.isaP(cycl, $$Date, UNPROVIDED, UNPROVIDED)))) {
            return T;
        }
        if ((((NIL != forts.fort_p(cycl)) && (NIL == fort_types_interface.relation_p(cycl))) && (NIL == fort_types_interface.functionP(cycl))) && (NIL == fort_types_interface.microtheory_p(cycl))) {
            return T;
        }
        if (cycl.isString()) {
            return T;
        }
        return NIL;
    }

    public static SubLObject clear_unit_of_money_p() {
        final SubLObject cs = $unit_of_money_p_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_unit_of_money_p(final SubLObject thing) {
        return memoization_state.caching_state_remove_function_results_with_args($unit_of_money_p_caching_state$.getGlobalValue(), list(thing), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject unit_of_money_p_internal(final SubLObject thing) {
        return makeBoolean((NIL != fort_types_interface.functionP(thing)) && (NIL != isa.isa_in_any_mtP(thing, $$UnitOfMoney)));
    }

    public static SubLObject unit_of_money_p(final SubLObject thing) {
        SubLObject caching_state = $unit_of_money_p_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(UNIT_OF_MONEY_P, $unit_of_money_p_caching_state$, $int$500, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, thing, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(unit_of_money_p_internal(thing)));
            memoization_state.caching_state_put(caching_state, thing, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject time_quantity_p(final SubLObject thing) {
        return isa.isa_in_any_mtP(thing, $$Time_Quantity);
    }

    public static SubLObject sentential_operator_p(final SubLObject thing) {
        return member(thing, sentential_operators(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clear_sentential_operators() {
        final SubLObject cs = $sentential_operators_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_sentential_operators() {
        return memoization_state.caching_state_remove_function_results_with_args($sentential_operators_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sentential_operators_internal() {
        return isa.all_fort_instances_in_all_mts($$SententialOperator);
    }

    public static SubLObject sentential_operators() {
        SubLObject caching_state = $sentential_operators_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SENTENTIAL_OPERATORS, $sentential_operators_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            memoization_state.register_isa_dependent_cache_clear_callback(CLEAR_SENTENTIAL_OPERATORS);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(sentential_operators_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject do_reified_query_spec_sentences(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list54);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject query_sentence = NIL;
        SubLObject gloss = NIL;
        SubLObject template = NIL;
        destructuring_bind_must_consp(current, datum, $list54);
        query_sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list54);
        gloss = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list54);
        template = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list54);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list54);
            if (NIL == member(current_$5, $list55, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list54);
        }
        final SubLObject test_specification_type_tail = property_list_member($TEST_SPECIFICATION_TYPE, current);
        final SubLObject test_specification_type = (NIL != test_specification_type_tail) ? cadr(test_specification_type_tail) : NIL;
        final SubLObject template_folder_tail = property_list_member($TEMPLATE_FOLDER, current);
        final SubLObject template_folder = (NIL != template_folder_tail) ? cadr(template_folder_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject ftg_gaf = $sym59$FTG_GAF;
        final SubLObject query_spec = $sym60$QUERY_SPEC;
        return list(WITH_ALL_MTS, list(DO_PREDICATE_EXTENT_INDEX, bq_cons(ftg_gaf, $list63), list(CDESTRUCTURING_BIND, list(template, gloss), list(GAF_ARGS, ftg_gaf), list(CDOLIST, list(query_spec, listS(PRED_VALUES, template, $list68)), list(PWHEN, list(CAND, list(FIMPLIES, test_specification_type, list(CAND, list(NART_P, query_spec), listS(EQL, list(NAT_FUNCTOR, query_spec), $list74), list($sym75$ISA_, list(NAT_ARG1, query_spec), test_specification_type))), list(FIMPLIES, template_folder, list($sym77$MEMBER_, template_folder, listS(PRED_VALUES_IN_ANY_MT, template, $list79)))), listS(CDOLIST, list(query_sentence, list(KBQ_SENTENCES, query_spec)), append(body, NIL)))))));
    }

    public static SubLObject do_reified_query_lexifications(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list81);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject query_sentence = NIL;
        SubLObject gloss = NIL;
        SubLObject template = NIL;
        SubLObject alist = NIL;
        destructuring_bind_must_consp(current, datum, $list81);
        query_sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list81);
        gloss = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list81);
        template = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list81);
        alist = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list81);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list81);
            if (NIL == member(current_$6, $list55, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list81);
        }
        final SubLObject test_specification_type_tail = property_list_member($TEST_SPECIFICATION_TYPE, current);
        final SubLObject test_specification_type = (NIL != test_specification_type_tail) ? cadr(test_specification_type_tail) : NIL;
        final SubLObject template_folder_tail = property_list_member($TEMPLATE_FOLDER, current);
        final SubLObject template_folder = (NIL != template_folder_tail) ? cadr(template_folder_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(DO_REIFIED_QUERY_SPEC_SENTENCES, list(query_sentence, gloss, template, $TEST_SPECIFICATION_TYPE, test_specification_type, $TEMPLATE_FOLDER, template_folder), listS(CLET, list(list(alist, list(GTQS_FIND_TERM_GLOSSES, query_sentence, gloss))), append(body, NIL)));
    }

    public static SubLObject print_reified_query_lexifications(SubLObject test_specification_type, SubLObject template_folder) {
        if (test_specification_type == UNPROVIDED) {
            test_specification_type = $$TKBTestQuery;
        }
        if (template_folder == UNPROVIDED) {
            template_folder = $$TKB_RedTeamQueryFolder;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        princ($str87$In_Mt__EnglishParaphraseMt_, UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject pred_var = $$formulaTemplateGloss;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$7 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$8 = $progress_last_pacification_time$.currentBinding(thread);
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
                                SubLObject done_var_$9 = NIL;
                                final SubLObject token_var_$10 = NIL;
                                while (NIL == done_var_$9) {
                                    final SubLObject ftg_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                                    final SubLObject valid_$11 = makeBoolean(!token_var_$10.eql(ftg_gaf));
                                    if (NIL != valid_$11) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(ftg_gaf);
                                        SubLObject template = NIL;
                                        SubLObject gloss = NIL;
                                        destructuring_bind_must_consp(current, datum, $list93);
                                        template = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list93);
                                        gloss = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(template, $const97$querySpecificationForFormulaTempl, ONE_INTEGER, TWO_INTEGER, $TRUE);
                                            SubLObject query_spec = NIL;
                                            query_spec = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                if (((NIL == test_specification_type) || (((NIL != nart_handles.nart_p(query_spec)) && cycl_utilities.nat_functor(query_spec).eql($$TestQueryFn)) && (NIL != isa.isaP(cycl_utilities.nat_arg1(query_spec, UNPROVIDED), test_specification_type, UNPROVIDED, UNPROVIDED)))) && ((NIL == template_folder) || (NIL != subl_promotions.memberP(template_folder, kb_mapping_utilities.pred_values_in_any_mt(template, $$folderContainsResource, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED)))) {
                                                    SubLObject cdolist_list_var_$12 = kb_query.kbq_sentences(query_spec);
                                                    SubLObject query_sentence = NIL;
                                                    query_sentence = cdolist_list_var_$12.first();
                                                    while (NIL != cdolist_list_var_$12) {
                                                        final SubLObject alist = gtqs_find_term_glosses(query_sentence, gloss);
                                                        final SubLObject gtqs_sentence = gtqs_from_query_sentence_gloss_info(query_sentence, gloss, alist, UNPROVIDED);
                                                        if (NIL != gtqs_sentence) {
                                                            format(T, $str96$__f___S_____, gtqs_sentence);
                                                        }
                                                        cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                                                        query_sentence = cdolist_list_var_$12.first();
                                                    } 
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                query_spec = cdolist_list_var.first();
                                            } 
                                        } else {
                                            cdestructuring_bind_error(datum, $list93);
                                        }
                                    }
                                    done_var_$9 = makeBoolean(NIL == valid_$11);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$8, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$7, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject test_reified_query_lexifications(SubLObject test_specification_type, SubLObject template_folder) {
        if (test_specification_type == UNPROVIDED) {
            test_specification_type = $$TKBTestQuery;
        }
        if (template_folder == UNPROVIDED) {
            template_folder = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject pred_var = $$formulaTemplateGloss;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$14 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$15 = $progress_last_pacification_time$.currentBinding(thread);
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
                                SubLObject done_var_$16 = NIL;
                                final SubLObject token_var_$17 = NIL;
                                while (NIL == done_var_$16) {
                                    final SubLObject ftg_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$17);
                                    final SubLObject valid_$18 = makeBoolean(!token_var_$17.eql(ftg_gaf));
                                    if (NIL != valid_$18) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(ftg_gaf);
                                        SubLObject template = NIL;
                                        SubLObject gloss = NIL;
                                        destructuring_bind_must_consp(current, datum, $list93);
                                        template = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list93);
                                        gloss = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(template, $const97$querySpecificationForFormulaTempl, ONE_INTEGER, TWO_INTEGER, $TRUE);
                                            SubLObject query_spec = NIL;
                                            query_spec = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                if (((NIL == test_specification_type) || (((NIL != nart_handles.nart_p(query_spec)) && cycl_utilities.nat_functor(query_spec).eql($$TestQueryFn)) && (NIL != isa.isaP(cycl_utilities.nat_arg1(query_spec, UNPROVIDED), test_specification_type, UNPROVIDED, UNPROVIDED)))) && ((NIL == template_folder) || (NIL != subl_promotions.memberP(template_folder, kb_mapping_utilities.pred_values_in_any_mt(template, $$folderContainsResource, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED)))) {
                                                    SubLObject cdolist_list_var_$19 = kb_query.kbq_sentences(query_spec);
                                                    SubLObject query_sentence = NIL;
                                                    query_sentence = cdolist_list_var_$19.first();
                                                    while (NIL != cdolist_list_var_$19) {
                                                        format(T, $str98$___Template___S__, template);
                                                        format(T, $str99$___S___Gloss___S__, query_sentence, gloss);
                                                        final SubLObject _prev_bind_0_$15 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$16 = pph_vars.$pph_replace_bulleted_list_tagsP$.currentBinding(thread);
                                                        try {
                                                            pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                                                            pph_vars.$pph_replace_bulleted_list_tagsP$.bind(T, thread);
                                                            final SubLObject _prev_bind_0_$16 = pph_question.$pph_use_gtqsP$.currentBinding(thread);
                                                            try {
                                                                pph_question.$pph_use_gtqsP$.bind(NIL, thread);
                                                                final SubLObject regular_paraphrase = pph_question.generate_question(query_sentence, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), $HTML, UNPROVIDED);
                                                                format(T, $str101$_Old___S__, regular_paraphrase);
                                                            } finally {
                                                                pph_question.$pph_use_gtqsP$.rebind(_prev_bind_0_$16, thread);
                                                            }
                                                            thread.resetMultipleValues();
                                                            final SubLObject new_paraphrase = pph_question.generate_question(query_sentence, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), $HTML, UNPROVIDED);
                                                            final SubLObject nl_pred = thread.secondMultipleValue();
                                                            final SubLObject supports = thread.thirdMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (NIL != find_if(GTQS_ASSERTION_P, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                                format(T, $str103$___New___S__, new_paraphrase);
                                                            }
                                                        } finally {
                                                            pph_vars.$pph_replace_bulleted_list_tagsP$.rebind(_prev_bind_1_$16, thread);
                                                            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0_$15, thread);
                                                        }
                                                        cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                                                        query_sentence = cdolist_list_var_$19.first();
                                                    } 
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                query_spec = cdolist_list_var.first();
                                            } 
                                        } else {
                                            cdestructuring_bind_error(datum, $list93);
                                        }
                                    }
                                    done_var_$16 = makeBoolean(NIL == valid_$18);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$15, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$14, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject gtqs_assertion_p(final SubLObject v_object) {
        return makeBoolean(((NIL != assertion_handles.assertion_p(v_object)) && (NIL != assertions_high.gaf_assertionP(v_object))) && assertions_high.gaf_arg0(v_object).eql($$genTemplate_QuerySentence));
    }

    public static SubLObject gtqs_from_query_sentence_gloss_info(final SubLObject query_sentence, final SubLObject gloss, final SubLObject term_gloss_alist, SubLObject force) {
        if (force == UNPROVIDED) {
            force = $INTERROGATIVE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject gtqs = nl_templates_from_sentence_gloss_info(query_sentence, gloss, term_gloss_alist, T, NIL, force);
        final SubLObject parse_template = thread.secondMultipleValue();
        final SubLObject problem_message = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return values(gtqs, problem_message);
    }

    public static SubLObject parse_template_from_query_sentence_gloss_info(final SubLObject query_sentence, final SubLObject gloss, final SubLObject term_gloss_alist, SubLObject force) {
        if (force == UNPROVIDED) {
            force = $INTERROGATIVE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject gen_template = nl_templates_from_sentence_gloss_info(query_sentence, gloss, term_gloss_alist, NIL, T, force);
        final SubLObject parse_template = thread.secondMultipleValue();
        final SubLObject problem_message = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return values(parse_template, problem_message);
    }

    public static SubLObject create_gentemplate_sentence(final SubLObject query_sentence, final SubLObject gentemplate_phrase) {
        SubLObject result = make_binary_formula($$genTemplate, cycl_utilities.formula_arg0(query_sentence), gentemplate_phrase);
        SubLObject list_var = NIL;
        SubLObject var = NIL;
        SubLObject arg_num = NIL;
        list_var = cycl_utilities.formula_args(query_sentence, UNPROVIDED);
        var = list_var.first();
        for (arg_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , var = list_var.first() , arg_num = add(ONE_INTEGER, arg_num)) {
            result = cycl_utilities.expression_subst(make_keyword(cconcatenate($$$ARG, format_nil.format_nil_a_no_copy(number_utilities.f_1X(arg_num)))), var, result, UNPROVIDED, UNPROVIDED);
        }
        return result;
    }

    public static SubLObject create_gentemplate_constrained_sentence(final SubLObject query_sentence, final SubLObject gentemplate_phrase) {
        final SubLObject arg0 = cycl_utilities.formula_arg0(query_sentence);
        final SubLObject arg2 = cycl_utilities.formula_arg1(query_sentence, UNPROVIDED);
        SubLObject result = make_ternary_formula($$genTemplate_Constrained, arg0, list($$equals, $ARG1, arg2), gentemplate_phrase);
        SubLObject list_var = NIL;
        SubLObject var = NIL;
        SubLObject arg_num = NIL;
        list_var = cycl_utilities.formula_args(query_sentence, UNPROVIDED);
        var = list_var.first();
        for (arg_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , var = list_var.first() , arg_num = add(ONE_INTEGER, arg_num)) {
            if (var.isKeyword()) {
                result = cycl_utilities.expression_subst(make_keyword(cconcatenate($$$ARG, format_nil.format_nil_a_no_copy(number_utilities.f_1X(arg_num)))), var, result, UNPROVIDED, UNPROVIDED);
            }
        }
        return result;
    }

    public static SubLObject rmp_gafP(final SubLObject sentence) {
        final SubLObject arg0 = cycl_utilities.formula_arg0(sentence);
        return makeBoolean((NIL != gafP(sentence)) && (((NIL != isa.isaP(arg0, $const109$InstanceTypeTernaryRuleMacroPredi, UNPROVIDED, UNPROVIDED)) || (NIL != isa.isaP(arg0, $const110$TypeInstanceTernaryRuleMacroPredi, UNPROVIDED, UNPROVIDED))) || (NIL != isa.isaP(arg0, $$TypeTypeTernaryRuleMacroPredicate, UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject handle_unmatched_strings(final SubLObject whole_string, SubLObject dtrs, final SubLObject nospaceP) {
        SubLObject tokens = string_utilities.string_tokenize(whole_string, $list112, NIL, T, T, UNPROVIDED, UNPROVIDED);
        tokens = remove($$$_, tokens, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject list_var = NIL;
        SubLObject sub_string = NIL;
        SubLObject i = NIL;
        list_var = tokens;
        sub_string = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sub_string = list_var.first() , i = add(ONE_INTEGER, i)) {
            final SubLObject current_dtr = pph_data_structures.new_pph_phrase(sub_string, UNPROVIDED, UNPROVIDED);
            if ((NIL != lexicon_accessors.string_is_posP(sub_string, $$Pronoun, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == lexicon_accessors.string_is_posP(sub_string, $$Determiner, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                pph_phrase.pph_phrase_set_category(current_dtr, $$NounPhrase, UNPROVIDED);
            }
            if ((NIL != nospaceP) && i.isZero()) {
                final SubLObject top_dtr = dtrs.first();
                final SubLObject nospace_dtr = nospace_phrase_from_phrases(list(top_dtr, current_dtr));
                dtrs = dtrs.rest();
                dtrs = cons(nospace_dtr, dtrs);
            } else {
                dtrs = cons(current_dtr, dtrs);
            }
        }
        return dtrs;
    }

    public static SubLObject ql_syntactic_xps(final SubLObject string) {
        return parse_tree_utilities.syntactic_xps(string);
    }

    public static SubLObject best_tree_for_string(final SubLObject string, final SubLObject xp_trees, final SubLObject xp_strings, final SubLObject full_tree) {
        SubLObject best_xp_string = NIL;
        SubLObject best_xp_tree = NIL;
        SubLObject xp_string = NIL;
        SubLObject xp_string_$24 = NIL;
        SubLObject xp_tree = NIL;
        SubLObject xp_tree_$25 = NIL;
        xp_string = xp_strings;
        xp_string_$24 = xp_string.first();
        xp_tree = xp_trees;
        xp_tree_$25 = xp_tree.first();
        while ((NIL != xp_tree) || (NIL != xp_string)) {
            if ((NIL != string_utilities.substringP(string, xp_string_$24, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && ((!best_xp_string.isString()) || (NIL != list_utilities.lengthG(best_xp_string, length(xp_string_$24), UNPROVIDED)))) {
                best_xp_string = xp_string_$24;
                best_xp_tree = xp_tree_$25;
            }
            xp_string = xp_string.rest();
            xp_string_$24 = xp_string.first();
            xp_tree = xp_tree.rest();
            xp_tree_$25 = xp_tree.first();
        } 
        return best_xp_tree;
    }

    public static SubLObject nospace_phrase_from_phrases(final SubLObject phrases) {
        final SubLObject concatenated = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject new_phrases = compute_nospace_phrases(phrases);
        pph_phrase.set_pph_phrase_dtrs_from_list(concatenated, new_phrases, UNPROVIDED);
        return pph_phrase.convert_pph_phrase_to_nospace_phrase(concatenated);
    }

    public static SubLObject compute_nospace_phrases(final SubLObject phrases) {
        SubLObject new_phrases = NIL;
        SubLObject cdolist_list_var = phrases;
        SubLObject phrase = NIL;
        phrase = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != pph_phrase.pph_nospace_phrase_p(phrase)) {
                SubLObject cdolist_list_var_$26 = compute_nospace_phrases(pph_phrase.pph_phrase_dtr_list(pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER)));
                SubLObject real_phrase = NIL;
                real_phrase = cdolist_list_var_$26.first();
                while (NIL != cdolist_list_var_$26) {
                    new_phrases = cons(real_phrase, new_phrases);
                    cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                    real_phrase = cdolist_list_var_$26.first();
                } 
            } else {
                new_phrases = cons(phrase, new_phrases);
            }
            cdolist_list_var = cdolist_list_var.rest();
            phrase = cdolist_list_var.first();
        } 
        return nreverse(new_phrases);
    }

    public static SubLObject construct_gtqs_for_sentences_and_glosses(final SubLObject input_triples) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successful = NIL;
        SubLObject unsuccessful = NIL;
        SubLObject total_time = NIL;
        final SubLObject time_var = get_internal_real_time();
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(input_triples), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = input_triples;
                SubLObject triple = NIL;
                triple = csome_list_var.first();
                while (NIL != csome_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = triple;
                    SubLObject template = NIL;
                    SubLObject cycl = NIL;
                    SubLObject gloss = NIL;
                    destructuring_bind_must_consp(current, datum, $list116);
                    template = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list116);
                    cycl = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list116);
                    gloss = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            thread.throwStack.push($IGNORE_ERRORS_TARGET);
                            final SubLObject _prev_bind_0_$27 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    final SubLObject gtqs = construct_gtqs_sentence_and_parse_template_for_query_sentence_from_gloss(cycl, gloss, UNPROVIDED);
                                    if (NIL != gtqs) {
                                        successful = cons(list(gtqs, cycl, gloss), successful);
                                    } else {
                                        unsuccessful = cons(list(gtqs, cycl, gloss), unsuccessful);
                                    }
                                } catch (final Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$27, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                        } finally {
                            thread.throwStack.pop();
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list116);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    triple = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
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
        total_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        final SubLObject total_attempts = length(input_triples);
        final SubLObject total_successes = length(successful);
        format(T, $str119$Total_attempts___S_in__S_seconds_, total_attempts, total_time);
        format(T, $str120$Successful_attempts___S__, total_successes);
        format(T, $str121$__successful___S__, multiply(divide(total_successes, total_attempts), $int$100));
        format(T, $str123$Average_time_per_attempt___S__, divide(total_time, total_attempts));
        format(T, $str124$__Successful_GTQS_Constructions__);
        SubLObject cdolist_list_var = successful;
        SubLObject success = NIL;
        success = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current2;
            final SubLObject datum2 = current2 = success;
            SubLObject gtqs2 = NIL;
            SubLObject cycl2 = NIL;
            SubLObject gloss2 = NIL;
            destructuring_bind_must_consp(current2, datum2, $list125);
            gtqs2 = current2.first();
            current2 = current2.rest();
            destructuring_bind_must_consp(current2, datum2, $list125);
            cycl2 = current2.first();
            current2 = current2.rest();
            destructuring_bind_must_consp(current2, datum2, $list125);
            gloss2 = current2.first();
            current2 = current2.rest();
            if (NIL == current2) {
                format(T, $str126$CycL___S__Gloss___S__GTQS___S____, new SubLObject[]{ cycl2, gloss2, gtqs2 });
            } else {
                cdestructuring_bind_error(datum2, $list125);
            }
            cdolist_list_var = cdolist_list_var.rest();
            success = cdolist_list_var.first();
        } 
        format(T, $str127$__________Unsuccessful_GTQS_Const);
        cdolist_list_var = unsuccessful;
        SubLObject unsuccess = NIL;
        unsuccess = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current2;
            final SubLObject datum2 = current2 = unsuccess;
            SubLObject gtqs2 = NIL;
            SubLObject cycl2 = NIL;
            SubLObject gloss2 = NIL;
            destructuring_bind_must_consp(current2, datum2, $list125);
            gtqs2 = current2.first();
            current2 = current2.rest();
            destructuring_bind_must_consp(current2, datum2, $list125);
            cycl2 = current2.first();
            current2 = current2.rest();
            destructuring_bind_must_consp(current2, datum2, $list125);
            gloss2 = current2.first();
            current2 = current2.rest();
            if (NIL == current2) {
                format(T, $str126$CycL___S__Gloss___S__GTQS___S____, new SubLObject[]{ cycl2, gloss2, gtqs2 });
            } else {
                cdestructuring_bind_error(datum2, $list125);
            }
            cdolist_list_var = cdolist_list_var.rest();
            unsuccess = cdolist_list_var.first();
        } 
        return values(successful, unsuccessful);
    }

    public static SubLObject declare_query_sentence_lexifier_file() {
        declareFunction(me, "gtqs_add_term_gloss", "GTQS-ADD-TERM-GLOSS", 3, 0, false);
        declareFunction(me, "gtqs_find_term_glosses", "GTQS-FIND-TERM-GLOSSES", 2, 0, false);
        declareFunction(me, "get_term_offsets", "GET-TERM-OFFSETS", 3, 0, false);
        declareFunction(me, "pph_phrase_from_sentence", "PPH-PHRASE-FROM-SENTENCE", 3, 2, false);
        declareFunction(me, "nl_templates_from_sentence_gloss_info", "NL-TEMPLATES-FROM-SENTENCE-GLOSS-INFO", 5, 1, false);
        declareFunction(me, "gtqs_and_parse_template_from_query_sentence_gloss_info", "GTQS-AND-PARSE-TEMPLATE-FROM-QUERY-SENTENCE-GLOSS-INFO", 3, 1, false);
        declareFunction(me, "construct_gtqs_sentence_and_parse_template_for_query_sentence_from_gloss", "CONSTRUCT-GTQS-SENTENCE-AND-PARSE-TEMPLATE-FOR-QUERY-SENTENCE-FROM-GLOSS", 2, 1, false);
        declareFunction(me, "mapped_expression_subsumesP", "MAPPED-EXPRESSION-SUBSUMES?", 2, 0, false);
        declareFunction(me, "english_query_contains_phraseP", "ENGLISH-QUERY-CONTAINS-PHRASE?", 2, 0, false);
        declareFunction(me, "regular_expression_string_for_phrase_match", "REGULAR-EXPRESSION-STRING-FOR-PHRASE-MATCH", 1, 0, false);
        declareFunction(me, "possibly_replaceable_term_p", "POSSIBLY-REPLACEABLE-TERM-P", 1, 0, false);
        declareFunction(me, "clear_unit_of_money_p", "CLEAR-UNIT-OF-MONEY-P", 0, 0, false);
        declareFunction(me, "remove_unit_of_money_p", "REMOVE-UNIT-OF-MONEY-P", 1, 0, false);
        declareFunction(me, "unit_of_money_p_internal", "UNIT-OF-MONEY-P-INTERNAL", 1, 0, false);
        declareFunction(me, "unit_of_money_p", "UNIT-OF-MONEY-P", 1, 0, false);
        declareFunction(me, "time_quantity_p", "TIME-QUANTITY-P", 1, 0, false);
        declareFunction(me, "sentential_operator_p", "SENTENTIAL-OPERATOR-P", 1, 0, false);
        declareFunction(me, "clear_sentential_operators", "CLEAR-SENTENTIAL-OPERATORS", 0, 0, false);
        new query_sentence_lexifier.$clear_sentential_operators$ZeroArityFunction();
        declareFunction(me, "remove_sentential_operators", "REMOVE-SENTENTIAL-OPERATORS", 0, 0, false);
        declareFunction(me, "sentential_operators_internal", "SENTENTIAL-OPERATORS-INTERNAL", 0, 0, false);
        declareFunction(me, "sentential_operators", "SENTENTIAL-OPERATORS", 0, 0, false);
        declareMacro(me, "do_reified_query_spec_sentences", "DO-REIFIED-QUERY-SPEC-SENTENCES");
        declareMacro(me, "do_reified_query_lexifications", "DO-REIFIED-QUERY-LEXIFICATIONS");
        declareFunction(me, "print_reified_query_lexifications", "PRINT-REIFIED-QUERY-LEXIFICATIONS", 0, 2, false);
        declareFunction(me, "test_reified_query_lexifications", "TEST-REIFIED-QUERY-LEXIFICATIONS", 0, 2, false);
        declareFunction(me, "gtqs_assertion_p", "GTQS-ASSERTION-P", 1, 0, false);
        declareFunction(me, "gtqs_from_query_sentence_gloss_info", "GTQS-FROM-QUERY-SENTENCE-GLOSS-INFO", 3, 1, false);
        declareFunction(me, "parse_template_from_query_sentence_gloss_info", "PARSE-TEMPLATE-FROM-QUERY-SENTENCE-GLOSS-INFO", 3, 1, false);
        declareFunction(me, "create_gentemplate_sentence", "CREATE-GENTEMPLATE-SENTENCE", 2, 0, false);
        declareFunction(me, "create_gentemplate_constrained_sentence", "CREATE-GENTEMPLATE-CONSTRAINED-SENTENCE", 2, 0, false);
        declareFunction(me, "rmp_gafP", "RMP-GAF?", 1, 0, false);
        declareFunction(me, "handle_unmatched_strings", "HANDLE-UNMATCHED-STRINGS", 3, 0, false);
        declareFunction(me, "ql_syntactic_xps", "QL-SYNTACTIC-XPS", 1, 0, false);
        declareFunction(me, "best_tree_for_string", "BEST-TREE-FOR-STRING", 4, 0, false);
        declareFunction(me, "nospace_phrase_from_phrases", "NOSPACE-PHRASE-FROM-PHRASES", 1, 0, false);
        declareFunction(me, "compute_nospace_phrases", "COMPUTE-NOSPACE-PHRASES", 1, 0, false);
        declareFunction(me, "construct_gtqs_for_sentences_and_glosses", "CONSTRUCT-GTQS-FOR-SENTENCES-AND-GLOSSES", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_query_sentence_lexifier_file() {
        defparameter("*QSL-ON-SINGLE-LITERAL-QUERY*", NIL);
        deflexical("*UNIT-OF-MONEY-P-CACHING-STATE*", NIL);
        deflexical("*SENTENTIAL-OPERATORS-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_query_sentence_lexifier_file() {
        memoization_state.note_globally_cached_function(UNIT_OF_MONEY_P);
        memoization_state.note_globally_cached_function(SENTENTIAL_OPERATORS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_query_sentence_lexifier_file();
    }

    @Override
    public void initializeVariables() {
        init_query_sentence_lexifier_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_query_sentence_lexifier_file();
    }

    

    public static final class $clear_sentential_operators$ZeroArityFunction extends ZeroArityFunction {
        public $clear_sentential_operators$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-SENTENTIAL-OPERATORS"));
        }

        @Override
        public SubLObject processItem() {
            return clear_sentential_operators();
        }
    }
}

/**
 * Total time: 817 ms
 */
