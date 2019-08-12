/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      ASSERT-CHARNIAK-PARSE-TREE
 *  source file: /cyc/top/cycl/assert-charniak-parse-tree.lisp
 *  created:     2019/07/03 17:38:56
 */
public final class assert_charniak_parse_tree extends SubLTranslatedFile implements V02 {
    // // Constructor
    private assert_charniak_parse_tree() {
    }

    public static final SubLFile me = new assert_charniak_parse_tree();

    public static final String myName = "com.cyc.cycjava.cycl.assert_charniak_parse_tree";

    // // Definitions
    public static final SubLObject assert_charniak_parse_for_sentence(SubLObject sentence, SubLObject tokenization) {
        if (tokenization == UNPROVIDED) {
            tokenization = NIL;
        }
        SubLTrampolineFile.checkType(sentence, STRING_OR_UNICODE_NAUT_P);
        {
            SubLObject subl_sentence = (NIL != unicode_nauts.unicode_naut_p(sentence)) ? ((SubLObject) (unicode_strings.display_to_subl_string(cycl_utilities.nat_arg1(sentence, UNPROVIDED), UNPROVIDED, UNPROVIDED))) : sentence;
            SubLObject charniak_parse = parser.charniak_parse(subl_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return assert_charniak_parse_tree(charniak_parse, tokenization);
        }
    }

    public static final SubLObject default_charniak_cyclist() {
        return $$Cyc;
    }

    /**
     *
     *
     * @unknown baxter
     */
    public static final SubLObject assert_charniak_parse_tree(SubLObject charniak_parse, SubLObject tokenization) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject name_prefix = $$$Charniak;
                SubLObject new_tokenizationP = makeBoolean((NIL == tokenization) || parsing_utilities.tokenization_token_count(tokenization).isZero());
                SubLObject v_parse_tree = NIL;
                {
                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_1 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind(default_charniak_cyclist(), thread);
                        kb_control_vars.$forward_inference_allowed_rules$.bind(parsing_utilities.parse_tree_creation_rules(), thread);
                        v_parse_tree = parsing_utilities.create_parse_tree(mt_vars.$decontextualized_collection_mt$.getGlobalValue(), name_prefix);
                        {
                            SubLObject _prev_bind_0_1 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
                            SubLObject _prev_bind_1_2 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
                            try {
                                parsing_vars.$parse_tree_mt$.bind(parsing_utilities.content_mt_of_parse_tree(v_parse_tree), thread);
                                parsing_vars.$parse_tree_prefix$.bind(name_prefix, thread);
                                if (NIL == tokenization) {
                                    tokenization = parsing_utilities.create_parse_tree_element($$CycTokenization, UNPROVIDED, UNPROVIDED);
                                    parsing_utilities.assert_parse_tree_info(listS($$tokenizationTokenizer, tokenization, $list_alt5), UNPROVIDED);
                                }
                                parsing_utilities.assert_parse_tree_info(list($$parseTreeOfTokenization, v_parse_tree, tokenization), UNPROVIDED);
                                v_parse_tree = populate_charniak_parse_tree(charniak_parse, v_parse_tree, tokenization, new_tokenizationP);
                            } finally {
                                parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_1_2, thread);
                                parsing_vars.$parse_tree_mt$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                    } finally {
                        kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_1, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_parse_tree;
            }
        }
    }

    /**
     *
     *
     * @unknown baxter
     */
    public static final SubLObject populate_charniak_parse_tree(SubLObject charniak_parse, SubLObject v_parse_tree, SubLObject tokenization, SubLObject new_tokenizationP) {
        {
            SubLObject root_node = assert_charniak_parse_nodes(charniak_parse, tokenization, new_tokenizationP);
            parsing_utilities.assert_parse_tree_root_node(v_parse_tree, root_node, UNPROVIDED);
            return v_parse_tree;
        }
    }

    // defparameter
    private static final SubLSymbol $charniak_token_number_isg$ = makeSymbol("*CHARNIAK-TOKEN-NUMBER-ISG*");

    public static final SubLObject assert_charniak_parse_nodes(SubLObject charniak_parse, SubLObject tokenization, SubLObject new_tokenizationP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject root_node = NIL;
                {
                    SubLObject _prev_bind_0 = $charniak_token_number_isg$.currentBinding(thread);
                    try {
                        $charniak_token_number_isg$.bind(integer_sequence_generator.new_integer_sequence_generator(ZERO_INTEGER, UNPROVIDED, UNPROVIDED), thread);
                        root_node = create_charniak_parse_tree_nodes(charniak_parse, tokenization, new_tokenizationP);
                    } finally {
                        $charniak_token_number_isg$.rebind(_prev_bind_0, thread);
                    }
                }
                return root_node;
            }
        }
    }

    public static final SubLObject create_charniak_parse_tree_nodes(SubLObject charniak_parse, SubLObject tokenization, SubLObject new_tokenizationP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType($charniak_token_number_isg$.getDynamicValue(thread), INTEGER_SEQUENCE_GENERATOR_P);
            {
                SubLObject tree_rest = copy_tree(charniak_parse);
                SubLObject constituent_stack = NIL;
                SubLObject last_node_created = NIL;
                while (NIL != tree_rest) {
                    format(T, $str_alt8$__Remaining_tree___S__, tree_rest);
                    {
                        SubLObject top = tree_rest.first();
                        tree_rest = tree_rest.rest();
                        if (top.isList()) {
                            last_node_created = create_charniak_parse_tree_nodes(top, tokenization, new_tokenizationP);
                            format(T, $str_alt9$__Adding__S_to__S__, last_node_created, constituent_stack);
                            if (NIL != constituent_stack) {
                                rplaca(constituent_stack, cons(last_node_created, constituent_stack.first()));
                            }
                            format(T, $str_alt10$__New_stack___S__, constituent_stack);
                        } else
                            if (top.isString()) {
                                {
                                    SubLObject constituent = constituent_stack.first();
                                    SubLObject tag = constituent.first();
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (!((NIL != parsing_utilities.cycl_penntag_p(tag)) || tag.isKeyword())) {
                                            Errors.error($str_alt11$Expected_a_CycL_Penn_tag__got__S, tag);
                                        }
                                    }
                                    constituent_stack = constituent_stack.rest();
                                    {
                                        SubLObject category = (NIL != parsing_utilities.cycl_penntag_p(tag)) ? ((SubLObject) (parsing_utilities.penntag_category(tag))) : NIL;
                                        SubLObject token_num = integer_sequence_generator.integer_sequence_generator_next($charniak_token_number_isg$.getDynamicValue(thread));
                                        SubLObject token = (NIL != new_tokenizationP) ? ((SubLObject) (parsing_utilities.create_parse_token(tokenization, token_num, UNPROVIDED, UNPROVIDED))) : parsing_utilities.find_parse_token(tokenization, token_num);
                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                            if (NIL == kb_indexing_datastructures.indexed_term_p(token)) {
                                                Errors.error($str_alt12$Couldn_t_find_token__S_of__S, token_num, tokenization);
                                            }
                                        }
                                        {
                                            SubLObject token_string = NIL;
                                            if (NIL != new_tokenizationP) {
                                                token_string = (NIL != unicode_strings.ascii_string_p(top)) ? ((SubLObject) (top)) : unicode_nauts.display_vector_string_to_cycl_safe_string(unicode_strings.utf8_string_to_display(unicode_strings.html_escaped_to_utf8_string(html_utilities.html_escape(top, NIL))));
                                                parsing_utilities.assert_parse_tree_info(list($$tokenString, token, token_string), UNPROVIDED);
                                                parsing_utilities.assert_parse_tree_info(list($$nthTokenInTokenization, tokenization, token_num, token), UNPROVIDED);
                                                {
                                                    SubLObject start_offset = parsing_utilities.compute_parse_token_start_offset(tokenization, token_num, token_string);
                                                    if (NIL != start_offset) {
                                                        parsing_utilities.assert_parse_tree_info(list($$tokenStartCharacterOffset, token, start_offset), UNPROVIDED);
                                                    }
                                                }
                                            } else {
                                                token_string = parsing_utilities.token_string(token);
                                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                    if (!top.equalp(token_string)) {
                                                        Errors.error($str_alt16$Token_string_mismatch___S___S__vs, token_string, token, top);
                                                    }
                                                }
                                            }
                                            last_node_created = parsing_utilities.create_syntactic_node(tokenization, $$TheCharniakParser, category, interval_span.get_interval_span(token_num, number_utilities.f_1X(token_num)), T, token_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            if (NIL != parsing_utilities.cycl_penntag_p(tag)) {
                                                parsing_utilities.assert_parse_tree_info(list($$syntacticNodePennTag, last_node_created, tag), UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            } else
                                if (top.isKeyword()) {
                                    {
                                        SubLObject tag_name = symbol_name(top);
                                        SubLObject tag = parsing_utilities.penntag_to_cycl(tag_name);
                                        if (NIL == parsing_utilities.cycl_penntag_p(tag)) {
                                            Errors.warn($str_alt19$Couldn_t_find_Penn_tag_from__S__G, top, tag);
                                            tag = top;
                                        }
                                        constituent_stack = cons(list(tag), constituent_stack);
                                    }
                                }


                    }
                } 
                if (NIL != constituent_stack) {
                    {
                        SubLObject datum = nreverse(constituent_stack.first());
                        SubLObject current = datum;
                        SubLObject tag = NIL;
                        SubLObject dtrs = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt20);
                        tag = current.first();
                        current = current.rest();
                        dtrs = current;
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL != parsing_utilities.cycl_penntag_p(tag)) || tag.isKeyword())) {
                                Errors.error($str_alt11$Expected_a_CycL_Penn_tag__got__S, tag);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == dtrs) {
                                Errors.error($str_alt21$No_dtrs_for_node_with_tag__S, tag);
                            }
                        }
                        constituent_stack = constituent_stack.rest();
                        {
                            SubLObject category = NIL;
                            SubLObject string = NIL;
                            SubLObject node = parsing_utilities.create_syntactic_node(tokenization, $$TheCharniakParser, category, parsing_utilities.phrasal_node_span_from_dtrs(dtrs, tokenization), NIL, string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL != parsing_utilities.cycl_penntag_p(tag)) {
                                parsing_utilities.assert_parse_tree_info(list($$syntacticNodePennTag, node, tag), UNPROVIDED);
                            }
                            {
                                SubLObject list_var = NIL;
                                SubLObject dtr_node = NIL;
                                SubLObject i = NIL;
                                for (list_var = dtrs, dtr_node = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , dtr_node = list_var.first() , i = add(ONE_INTEGER, i)) {
                                    {
                                        SubLObject dtr_num = number_utilities.f_1X(i);
                                        parsing_utilities.syntactic_node_add_dtr(node, dtr_node, dtr_num, UNPROVIDED);
                                    }
                                }
                            }
                            last_node_created = node;
                        }
                    }
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL != constituent_stack) {
                            Errors.error($str_alt22$Remaining_stack__S, constituent_stack);
                        }
                    }
                }
                return last_node_created;
            }
        }
    }

    public static final SubLObject declare_assert_charniak_parse_tree_file() {
        declareFunction("assert_charniak_parse_for_sentence", "ASSERT-CHARNIAK-PARSE-FOR-SENTENCE", 1, 1, false);
        declareFunction("default_charniak_cyclist", "DEFAULT-CHARNIAK-CYCLIST", 0, 0, false);
        declareFunction("assert_charniak_parse_tree", "ASSERT-CHARNIAK-PARSE-TREE", 2, 0, false);
        declareFunction("populate_charniak_parse_tree", "POPULATE-CHARNIAK-PARSE-TREE", 4, 0, false);
        declareFunction("assert_charniak_parse_nodes", "ASSERT-CHARNIAK-PARSE-NODES", 3, 0, false);
        declareFunction("create_charniak_parse_tree_nodes", "CREATE-CHARNIAK-PARSE-TREE-NODES", 3, 0, false);
        return NIL;
    }

    public static final SubLObject init_assert_charniak_parse_tree_file() {
        defparameter("*CHARNIAK-TOKEN-NUMBER-ISG*", NIL);
        return NIL;
    }

    public static final SubLObject setup_assert_charniak_parse_tree_file() {
                return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol STRING_OR_UNICODE_NAUT_P = makeSymbol("STRING-OR-UNICODE-NAUT-P");

    public static final SubLObject $$Cyc = constant_handles.reader_make_constant_shell(makeString("Cyc"));

    static private final SubLString $$$Charniak = makeString("Charniak");

    public static final SubLObject $$CycTokenization = constant_handles.reader_make_constant_shell(makeString("CycTokenization"));

    public static final SubLObject $$tokenizationTokenizer = constant_handles.reader_make_constant_shell(makeString("tokenizationTokenizer"));

    static private final SubLList $list_alt5 = list(constant_handles.reader_make_constant_shell(makeString("TheCharniakParser")));

    public static final SubLObject $$parseTreeOfTokenization = constant_handles.reader_make_constant_shell(makeString("parseTreeOfTokenization"));

    private static final SubLSymbol INTEGER_SEQUENCE_GENERATOR_P = makeSymbol("INTEGER-SEQUENCE-GENERATOR-P");

    static private final SubLString $str_alt8$__Remaining_tree___S__ = makeString("~&Remaining tree: ~S~%");

    static private final SubLString $str_alt9$__Adding__S_to__S__ = makeString("~&Adding ~S to ~S~%");

    static private final SubLString $str_alt10$__New_stack___S__ = makeString("~&New stack: ~S~%");

    static private final SubLString $str_alt11$Expected_a_CycL_Penn_tag__got__S = makeString("Expected a CycL Penn tag, got ~S");

    static private final SubLString $str_alt12$Couldn_t_find_token__S_of__S = makeString("Couldn't find token ~S of ~S");

    public static final SubLObject $$tokenString = constant_handles.reader_make_constant_shell(makeString("tokenString"));

    public static final SubLObject $$nthTokenInTokenization = constant_handles.reader_make_constant_shell(makeString("nthTokenInTokenization"));

    public static final SubLObject $$tokenStartCharacterOffset = constant_handles.reader_make_constant_shell(makeString("tokenStartCharacterOffset"));

    static private final SubLString $str_alt16$Token_string_mismatch___S___S__vs = makeString("Token string mismatch: ~S (~S) vs. ~S (Charniak)");

    public static final SubLObject $$TheCharniakParser = constant_handles.reader_make_constant_shell(makeString("TheCharniakParser"));

    public static final SubLObject $$syntacticNodePennTag = constant_handles.reader_make_constant_shell(makeString("syntacticNodePennTag"));

    static private final SubLString $str_alt19$Couldn_t_find_Penn_tag_from__S__G = makeString("Couldn't find Penn tag from ~S. Got ~S");

    static private final SubLList $list_alt20 = cons(makeSymbol("TAG"), makeSymbol("DTRS"));

    static private final SubLString $str_alt21$No_dtrs_for_node_with_tag__S = makeString("No dtrs for node with tag ~S");

    static private final SubLString $str_alt22$Remaining_stack__S = makeString("Remaining stack ~S");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_assert_charniak_parse_tree_file();
    }

    @Override
    public void initializeVariables() {
        init_assert_charniak_parse_tree_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_assert_charniak_parse_tree_file();
    }
}

