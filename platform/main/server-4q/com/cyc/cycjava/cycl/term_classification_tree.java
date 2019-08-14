/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_underbar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class term_classification_tree extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new term_classification_tree();

 public static final String myName = "com.cyc.cycjava.cycl.term_classification_tree";


    // defparameter
    // Definitions
    @LispMethod(comment = "The collections used to classify terms in the term classification tree.\ndefparameter")
    public static final SubLSymbol $term_classification_tree_collections$ = makeSymbol("*TERM-CLASSIFICATION-TREE-COLLECTIONS*");

    // defparameter
    /**
     * The microtheory used to compute the isas and genls of the term for the term
     * classification tree.
     */
    @LispMethod(comment = "The microtheory used to compute the isas and genls of the term for the term\r\nclassification tree.\ndefparameter\nThe microtheory used to compute the isas and genls of the term for the term\nclassification tree.")
    public static final SubLSymbol $term_classification_tree_mt$ = makeSymbol("*TERM-CLASSIFICATION-TREE-MT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $term_classification_tree$ = makeSymbol("*TERM-CLASSIFICATION-TREE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $term_good_wrt_classification_treeP_caching_state$ = makeSymbol("*TERM-GOOD-WRT-CLASSIFICATION-TREE?-CACHING-STATE*");

    static private final SubLString $str1$ISA_ = makeString("ISA_");

    static private final SubLString $str2$QUOTEDISA_ = makeString("QUOTEDISA_");

    static private final SubLString $str3$GENLS_ = makeString("GENLS_");

    static private final SubLString $str4$Unexpected_term_classification_tr = makeString("Unexpected term classification tree property ~s");

    static private final SubLString $str5$Creation_of_collections_from_a_Te = makeString("Creation of collections from a Term Classification Tree failed due to the following errors: ~%~A~%");

    static private final SubLString $str6$CU2FN_ = makeString("CU2FN_");

    static private final SubLList $list7 = list(CHAR_underbar);

    static private final SubLSymbol $sym8$_EXIT = makeSymbol("%EXIT");





    static private final SubLString $str11$CU3FN_ = makeString("CU3FN_");

    static private final SubLString $str12$Unable_to_find_a_constant_when_ex = makeString("Unable to find a constant when executing (CONSTANT-FROM-TREE-TERM ~S)");

    static private final SubLString $str13$CU2FN_1 = makeString("CU2FN_1");

    static private final SubLString $str14$_2 = makeString("_2");

    static private final SubLString $str15$CU3FN_1 = makeString("CU3FN_1");

    static private final SubLString $str16$_3 = makeString("_3");

    static private final SubLString $str17$Invalid_NAT_being_converted_to_tr = makeString("Invalid NAT being converted to tree-term: ~S");

    private static final SubLObject $const18$CurrentWorldDataCollectorMt_NonHo = reader_make_constant_shell("CurrentWorldDataCollectorMt-NonHomocentric");

    private static final SubLSymbol TERM_CLASSIFICATION_TREE_MT = makeSymbol("TERM-CLASSIFICATION-TREE-MT");

    private static final SubLSymbol SET_TERM_CLASSIFICATION_TREE_MT = makeSymbol("SET-TERM-CLASSIFICATION-TREE-MT");

    private static final SubLSymbol RESET_TERM_CLASSIFICATION_TREE = makeSymbol("RESET-TERM-CLASSIFICATION-TREE");

    static private final SubLSymbol $sym24$TERM_GOOD_WRT_CLASSIFICATION_TREE_ = makeSymbol("TERM-GOOD-WRT-CLASSIFICATION-TREE?");

    private static final SubLSymbol GOOD = makeSymbol("GOOD");

    private static final SubLSymbol BAD = makeSymbol("BAD");

    static private final SubLString $str30$Unexpected_term_classification_tr = makeString("Unexpected term classification tree evaluation ~s");

    static private final SubLSymbol $sym31$_TERM_GOOD_WRT_CLASSIFICATION_TREE__CACHING_STATE_ = makeSymbol("*TERM-GOOD-WRT-CLASSIFICATION-TREE?-CACHING-STATE*");

    private static final SubLInteger $int$5000 = makeInteger(5000);

    static private final SubLSymbol $sym33$CLEAR_TERM_GOOD_WRT_CLASSIFICATION_TREE_ = makeSymbol("CLEAR-TERM-GOOD-WRT-CLASSIFICATION-TREE?");

    public static final SubLObject create_term_classification_tree_collections_alt(SubLObject v_term_classification_tree) {
        {
            SubLObject v_properties = decision_tree.decision_tree_properties(v_term_classification_tree);
            SubLObject collections = set.new_set(symbol_function(EQ), UNPROVIDED);
            SubLObject error_messages = NIL;
            SubLObject cdolist_list_var = v_properties;
            SubLObject property = NIL;
            for (property = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , property = cdolist_list_var.first()) {
                {
                    SubLObject symbol_name = symbol_name(property);
                    SubLObject error_message = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                            try {
                                bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                try {
                                    if (NIL != string_utilities.starts_with(symbol_name, $str_alt1$ISA_)) {
                                        {
                                            SubLObject col_name = string_utilities.substring(symbol_name, length($str_alt1$ISA_), UNPROVIDED);
                                            set.set_add(com.cyc.cycjava.cycl.term_classification_tree.constant_from_tree_term(col_name), collections);
                                        }
                                    } else {
                                        if (NIL != string_utilities.starts_with(symbol_name, $str_alt2$QUOTEDISA_)) {
                                            {
                                                SubLObject col_name = string_utilities.substring(symbol_name, length($str_alt2$QUOTEDISA_), UNPROVIDED);
                                                set.set_add(com.cyc.cycjava.cycl.term_classification_tree.constant_from_tree_term(col_name), collections);
                                            }
                                        } else {
                                            if (NIL != string_utilities.starts_with(symbol_name, $str_alt3$GENLS_)) {
                                                {
                                                    SubLObject col_name = string_utilities.substring(symbol_name, length($str_alt3$GENLS_), UNPROVIDED);
                                                    set.set_add(com.cyc.cycjava.cycl.term_classification_tree.constant_from_tree_term(col_name), collections);
                                                }
                                            } else {
                                                Errors.error($str_alt4$Unexpected_term_classification_tr, property);
                                            }
                                        }
                                    }
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
                        error_messages = cons(error_message, error_messages);
                    }
                }
            }
            if (NIL != error_messages) {
                Errors.error($str_alt5$Creation_of_collections_from_a_Te, error_messages);
            }
            return copy_list(set.set_element_list(collections));
        }
    }

    public static SubLObject create_term_classification_tree_collections(final SubLObject v_term_classification_tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_properties = decision_tree.decision_tree_properties(v_term_classification_tree);
        final SubLObject collections = set.new_set(symbol_function(EQ), UNPROVIDED);
        SubLObject error_messages = NIL;
        SubLObject cdolist_list_var = v_properties;
        SubLObject property = NIL;
        property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject symbol_name = symbol_name(property);
            SubLObject error_message = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        if (NIL != string_utilities.starts_with(symbol_name, $str1$ISA_)) {
                            final SubLObject col_name = string_utilities.substring(symbol_name, length($str1$ISA_), UNPROVIDED);
                            set.set_add(constant_from_tree_term(col_name), collections);
                        } else
                            if (NIL != string_utilities.starts_with(symbol_name, $str2$QUOTEDISA_)) {
                                final SubLObject col_name = string_utilities.substring(symbol_name, length($str2$QUOTEDISA_), UNPROVIDED);
                                set.set_add(constant_from_tree_term(col_name), collections);
                            } else
                                if (NIL != string_utilities.starts_with(symbol_name, $str3$GENLS_)) {
                                    final SubLObject col_name = string_utilities.substring(symbol_name, length($str3$GENLS_), UNPROVIDED);
                                    set.set_add(constant_from_tree_term(col_name), collections);
                                } else {
                                    Errors.error($str4$Unexpected_term_classification_tr, property);
                                }


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
                error_messages = cons(error_message, error_messages);
            }
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        } 
        if (NIL != error_messages) {
            Errors.error($str5$Creation_of_collections_from_a_Te, error_messages);
        }
        return copy_list(set.set_element_list(collections));
    }

    /**
     * Assumes *term-classification-tree* is already initialized.
     */
    @LispMethod(comment = "Assumes *term-classification-tree* is already initialized.")
    public static final SubLObject initialize_term_classification_tree_collections_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $term_classification_tree_collections$.setDynamicValue(com.cyc.cycjava.cycl.term_classification_tree.create_term_classification_tree_collections($term_classification_tree$.getDynamicValue(thread)), thread);
            return $term_classification_tree_collections$.getDynamicValue(thread);
        }
    }

    /**
     * Assumes *term-classification-tree* is already initialized.
     */
    @LispMethod(comment = "Assumes *term-classification-tree* is already initialized.")
    public static SubLObject initialize_term_classification_tree_collections() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $term_classification_tree_collections$.setDynamicValue(create_term_classification_tree_collections($term_classification_tree$.getDynamicValue(thread)), thread);
        return $term_classification_tree_collections$.getDynamicValue(thread);
    }

    public static final SubLObject constant_from_tree_term_alt(SubLObject tree_term) {
        {
            SubLObject error = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            if (NIL != string_utilities.starts_with(tree_term, $str_alt6$CU2FN_)) {
                                {
                                    SubLObject col_union_parts = string_utilities.split_string(tree_term, $list_alt7);
                                    SubLObject term1 = list_utilities.only_one(constant_completion_high.constant_complete(string_utilities.substring(second(col_union_parts), ONE_INTEGER, UNPROVIDED), NIL, T, UNPROVIDED, UNPROVIDED));
                                    SubLObject term2 = list_utilities.only_one(constant_completion_high.constant_complete(string_utilities.substring(third(col_union_parts), ONE_INTEGER, UNPROVIDED), NIL, T, UNPROVIDED, UNPROVIDED));
                                    return narts_high.nart_substitute(list($$CollectionUnionFn, list($$TheSet, term1, term2)));
                                }
                            } else {
                                if (NIL != string_utilities.starts_with(tree_term, $str_alt11$CU3FN_)) {
                                    {
                                        SubLObject col_union_parts = string_utilities.split_string(tree_term, $list_alt7);
                                        SubLObject term1 = list_utilities.only_one(constant_completion_high.constant_complete(string_utilities.substring(second(col_union_parts), ONE_INTEGER, UNPROVIDED), NIL, T, UNPROVIDED, UNPROVIDED));
                                        SubLObject term2 = list_utilities.only_one(constant_completion_high.constant_complete(string_utilities.substring(third(col_union_parts), ONE_INTEGER, UNPROVIDED), NIL, T, UNPROVIDED, UNPROVIDED));
                                        SubLObject term3 = list_utilities.only_one(constant_completion_high.constant_complete(string_utilities.substring(fourth(col_union_parts), ONE_INTEGER, UNPROVIDED), NIL, T, UNPROVIDED, UNPROVIDED));
                                        return narts_high.nart_substitute(list($$CollectionUnionFn, list($$TheSet, term1, term2, term3)));
                                    }
                                } else {
                                    return list_utilities.only_one(constant_completion_high.constant_complete(tree_term, NIL, T, UNPROVIDED, UNPROVIDED));
                                }
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (NIL != error) {
                Errors.error($str_alt12$Unable_to_find_a_constant_when_ex, tree_term);
            }
            return NIL;
        }
    }

    public static SubLObject constant_from_tree_term(final SubLObject tree_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (NIL != string_utilities.starts_with(tree_term, $str6$CU2FN_)) {
                        final SubLObject col_union_parts = string_utilities.split_string(tree_term, $list7);
                        final SubLObject term1 = list_utilities.only_one(constant_completion_high.constant_complete(string_utilities.substring(second(col_union_parts), ONE_INTEGER, UNPROVIDED), NIL, T, UNPROVIDED, UNPROVIDED));
                        final SubLObject term2 = list_utilities.only_one(constant_completion_high.constant_complete(string_utilities.substring(third(col_union_parts), ONE_INTEGER, UNPROVIDED), NIL, T, UNPROVIDED, UNPROVIDED));
                        return narts_high.nart_substitute(list($$CollectionUnionFn, list($$TheSet, term1, term2)));
                    }
                    if (NIL != string_utilities.starts_with(tree_term, $str11$CU3FN_)) {
                        final SubLObject col_union_parts = string_utilities.split_string(tree_term, $list7);
                        final SubLObject term1 = list_utilities.only_one(constant_completion_high.constant_complete(string_utilities.substring(second(col_union_parts), ONE_INTEGER, UNPROVIDED), NIL, T, UNPROVIDED, UNPROVIDED));
                        final SubLObject term2 = list_utilities.only_one(constant_completion_high.constant_complete(string_utilities.substring(third(col_union_parts), ONE_INTEGER, UNPROVIDED), NIL, T, UNPROVIDED, UNPROVIDED));
                        final SubLObject term3 = list_utilities.only_one(constant_completion_high.constant_complete(string_utilities.substring(fourth(col_union_parts), ONE_INTEGER, UNPROVIDED), NIL, T, UNPROVIDED, UNPROVIDED));
                        return narts_high.nart_substitute(list($$CollectionUnionFn, list($$TheSet, term1, term2, term3)));
                    }
                    return list_utilities.only_one(constant_completion_high.constant_complete(tree_term, NIL, T, UNPROVIDED, UNPROVIDED));
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error) {
            Errors.error($str12$Unable_to_find_a_constant_when_ex, tree_term);
        }
        return NIL;
    }

    public static final SubLObject tree_term_from_constant_alt(SubLObject cycl_term) {
        if (NIL != nart_handles.nart_p(cycl_term)) {
            if (cycl_utilities.nat_arg0(cycl_term) == $$CollectionUnionFn) {
                {
                    SubLObject col_union_parts = cycl_utilities.nat_arg1(cycl_term, UNPROVIDED).rest();
                    SubLObject col_union_size = length(col_union_parts);
                    SubLObject pcase_var = col_union_size;
                    if (pcase_var.eql(TWO_INTEGER)) {
                        return cconcatenate($str_alt13$CU2FN_1, new SubLObject[]{ format_nil.format_nil_a_no_copy(string_utilities.make_valid_constant_name(kb_paths.fort_name(col_union_parts.first()), UNPROVIDED)), $str_alt14$_2, format_nil.format_nil_a_no_copy(string_utilities.make_valid_constant_name(kb_paths.fort_name(second(col_union_parts)), UNPROVIDED)) });
                    } else {
                        if (pcase_var.eql(THREE_INTEGER)) {
                            return cconcatenate($str_alt15$CU3FN_1, new SubLObject[]{ format_nil.format_nil_a_no_copy(string_utilities.make_valid_constant_name(kb_paths.fort_name(col_union_parts.first()), UNPROVIDED)), $str_alt14$_2, format_nil.format_nil_a_no_copy(string_utilities.make_valid_constant_name(kb_paths.fort_name(second(col_union_parts)), UNPROVIDED)), $str_alt16$_3, format_nil.format_nil_a_no_copy(string_utilities.make_valid_constant_name(kb_paths.fort_name(third(col_union_parts)), UNPROVIDED)) });
                        } else {
                            Errors.error($str_alt17$Invalid_NAT_being_converted_to_tr, cycl_term);
                        }
                    }
                }
            }
        } else {
            return string_utilities.make_valid_constant_name(kb_paths.fort_name(cycl_term), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject tree_term_from_constant(final SubLObject cycl_term) {
        if (NIL != nart_handles.nart_p(cycl_term)) {
            if (cycl_utilities.nat_arg0(cycl_term).eql($$CollectionUnionFn)) {
                final SubLObject col_union_parts = cycl_utilities.nat_arg1(cycl_term, UNPROVIDED).rest();
                final SubLObject pcase_var;
                final SubLObject col_union_size = pcase_var = length(col_union_parts);
                if (pcase_var.eql(TWO_INTEGER)) {
                    return cconcatenate($str13$CU2FN_1, new SubLObject[]{ format_nil.format_nil_a_no_copy(string_utilities.make_valid_constant_name(kb_paths.fort_name(col_union_parts.first()), UNPROVIDED)), $str14$_2, format_nil.format_nil_a_no_copy(string_utilities.make_valid_constant_name(kb_paths.fort_name(second(col_union_parts)), UNPROVIDED)) });
                }
                if (pcase_var.eql(THREE_INTEGER)) {
                    return cconcatenate($str15$CU3FN_1, new SubLObject[]{ format_nil.format_nil_a_no_copy(string_utilities.make_valid_constant_name(kb_paths.fort_name(col_union_parts.first()), UNPROVIDED)), $str14$_2, format_nil.format_nil_a_no_copy(string_utilities.make_valid_constant_name(kb_paths.fort_name(second(col_union_parts)), UNPROVIDED)), $str16$_3, format_nil.format_nil_a_no_copy(string_utilities.make_valid_constant_name(kb_paths.fort_name(third(col_union_parts)), UNPROVIDED)) });
                }
                Errors.error($str17$Invalid_NAT_being_converted_to_tr, cycl_term);
            }
            return NIL;
        }
        return string_utilities.make_valid_constant_name(kb_paths.fort_name(cycl_term), UNPROVIDED);
    }

    /**
     * The microtheory used to compute the isas and genls of the term for the term classification tree.
     */
    @LispMethod(comment = "The microtheory used to compute the isas and genls of the term for the term classification tree.")
    public static final SubLObject term_classification_tree_mt_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $term_classification_tree_mt$.getDynamicValue(thread);
        }
    }

    /**
     * The microtheory used to compute the isas and genls of the term for the term classification tree.
     */
    @LispMethod(comment = "The microtheory used to compute the isas and genls of the term for the term classification tree.")
    public static SubLObject term_classification_tree_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $term_classification_tree_mt$.getDynamicValue(thread);
    }

    /**
     * Sets the microtheory used to compute the isas and genls of the term for the term classification tree.
     */
    @LispMethod(comment = "Sets the microtheory used to compute the isas and genls of the term for the term classification tree.")
    public static final SubLObject set_term_classification_tree_mt_alt(SubLObject mt) {
        SubLTrampolineFile.checkType(mt, HLMT_P);
        $term_classification_tree_mt$.setDynamicValue(mt);
        return com.cyc.cycjava.cycl.term_classification_tree.term_classification_tree_mt();
    }

    /**
     * Sets the microtheory used to compute the isas and genls of the term for the term classification tree.
     */
    @LispMethod(comment = "Sets the microtheory used to compute the isas and genls of the term for the term classification tree.")
    public static SubLObject set_term_classification_tree_mt(final SubLObject mt) {
        assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
        $term_classification_tree_mt$.setDynamicValue(mt);
        return term_classification_tree_mt();
    }

    public static final SubLObject initialize_term_classification_tree_alt(SubLObject v_decision_tree) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_decision_tree, STRINGP);
            $term_classification_tree$.setDynamicValue(decision_tree.new_decision_tree_from_weka_j48_format(v_decision_tree), thread);
            return $term_classification_tree$.getDynamicValue(thread);
        }
    }

    public static SubLObject initialize_term_classification_tree(final SubLObject v_decision_tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(v_decision_tree) : "! stringp(v_decision_tree) " + ("Types.stringp(v_decision_tree) " + "CommonSymbols.NIL != Types.stringp(v_decision_tree) ") + v_decision_tree;
        $term_classification_tree$.setDynamicValue(decision_tree.new_decision_tree_from_weka_j48_format(v_decision_tree), thread);
        return $term_classification_tree$.getDynamicValue(thread);
    }

    /**
     * Resets all cached information about the term classification tree.
     */
    @LispMethod(comment = "Resets all cached information about the term classification tree.")
    public static final SubLObject reset_term_classification_tree_alt() {
        $term_classification_tree$.setDynamicValue(NIL);
        $term_classification_tree_collections$.setDynamicValue(NIL);
        return NIL;
    }

    /**
     * Resets all cached information about the term classification tree.
     */
    @LispMethod(comment = "Resets all cached information about the term classification tree.")
    public static SubLObject reset_term_classification_tree() {
        $term_classification_tree$.setDynamicValue(NIL);
        $term_classification_tree_collections$.setDynamicValue(NIL);
        return NIL;
    }

    public static final SubLObject clear_term_good_wrt_classification_treeP_alt() {
        {
            SubLObject cs = $term_good_wrt_classification_treeP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_term_good_wrt_classification_treeP() {
        final SubLObject cs = $term_good_wrt_classification_treeP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_term_good_wrt_classification_treeP(SubLObject v_term, SubLObject v_decision_tree) {
        return memoization_state.caching_state_remove_function_results_with_args($term_good_wrt_classification_treeP_caching_state$.getGlobalValue(), list(v_term, v_decision_tree), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_term_good_wrt_classification_treeP(final SubLObject v_term, final SubLObject v_decision_tree, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $term_classification_tree_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($term_good_wrt_classification_treeP_caching_state$.getGlobalValue(), list(v_term, v_decision_tree, mt), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp; whether TERM is good.
     * @param TERM
    		cycl-term-p
     * 		
     * @param DECISION-TREE;
     * 		a string representation of a decision tree created
     * 		using WEKA J48.
     * 		
     * 		Takes as input a CycL term (currently must be a constant) and a string
     * 		representation of a decision tree.  It extracts a set of collections from the
     * 		property names of the decision tree, computes the all-isa-among and
     * 		all-genls-among the input term and the extracted collections, computes a bit
     * 		vector (sort of) based on those, and passes it down to be evaluated by the
     * 		decision tree.
     * 		
     * 		The decision tree will be initialized from DECISION-TREE the first time it is
     * 		called and will not be reinitialized unless @xref
     * 		reset-term-classification-tree is called.
     * 		Then TERM will be checked for its all-isas-among, all-quoted-isas-among, and
     * 		all-genls-among the collections extracted from DECISION-TREE, and evaluated
     * 		according to the decision tree loaded from DECISION-TREE (or cached).
     */
    @LispMethod(comment = "@return booleanp; whether TERM is good.\r\n@param TERM\n\t\tcycl-term-p\r\n\t\t\r\n@param DECISION-TREE;\r\n\t\ta string representation of a decision tree created\r\n\t\tusing WEKA J48.\r\n\t\t\r\n\t\tTakes as input a CycL term (currently must be a constant) and a string\r\n\t\trepresentation of a decision tree.  It extracts a set of collections from the\r\n\t\tproperty names of the decision tree, computes the all-isa-among and\r\n\t\tall-genls-among the input term and the extracted collections, computes a bit\r\n\t\tvector (sort of) based on those, and passes it down to be evaluated by the\r\n\t\tdecision tree.\r\n\t\t\r\n\t\tThe decision tree will be initialized from DECISION-TREE the first time it is\r\n\t\tcalled and will not be reinitialized unless @xref\r\n\t\treset-term-classification-tree is called.\r\n\t\tThen TERM will be checked for its all-isas-among, all-quoted-isas-among, and\r\n\t\tall-genls-among the collections extracted from DECISION-TREE, and evaluated\r\n\t\taccording to the decision tree loaded from DECISION-TREE (or cached).")
    public static final SubLObject term_good_wrt_classification_treeP_internal(SubLObject v_term, SubLObject v_decision_tree) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_term, CYCL_TERM_P);
            if (NIL == $term_classification_tree$.getDynamicValue(thread)) {
                com.cyc.cycjava.cycl.term_classification_tree.initialize_term_classification_tree(v_decision_tree);
            }
            if (NIL == $term_classification_tree_collections$.getDynamicValue(thread)) {
                com.cyc.cycjava.cycl.term_classification_tree.initialize_term_classification_tree_collections();
            }
            {
                SubLObject cols = $term_classification_tree_collections$.getDynamicValue(thread);
                SubLObject mt = $term_classification_tree_mt$.getDynamicValue(thread);
                SubLObject isas = set_utilities.construct_set_from_list(isa.all_isa_among(v_term, cols, mt, UNPROVIDED), symbol_function(EQ), UNPROVIDED);
                SubLObject quoted_isas = set_utilities.construct_set_from_list(NIL != term.hl_term_p(v_term) ? ((SubLObject) (isa.all_quoted_isa_among(v_term, cols, mt, UNPROVIDED))) : NIL, symbol_function(EQ), UNPROVIDED);
                SubLObject v_genls = set_utilities.construct_set_from_list(NIL != term.el_fort_p(v_term) ? ((SubLObject) (genls.all_genls_among(v_term, cols, mt, UNPROVIDED))) : NIL, symbol_function(EQ), UNPROVIDED);
                SubLObject plist = NIL;
                SubLObject cdolist_list_var = cols;
                SubLObject col = NIL;
                for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                    {
                        SubLObject col_str = com.cyc.cycjava.cycl.term_classification_tree.tree_term_from_constant(col);
                        SubLObject isa_property = make_keyword(Strings.string_upcase(cconcatenate($str_alt1$ISA_, col_str), UNPROVIDED, UNPROVIDED));
                        SubLObject quoted_isa_property = make_keyword(Strings.string_upcase(cconcatenate($str_alt2$QUOTEDISA_, col_str), UNPROVIDED, UNPROVIDED));
                        SubLObject genls_property = make_keyword(Strings.string_upcase(cconcatenate($str_alt3$GENLS_, col_str), UNPROVIDED, UNPROVIDED));
                        SubLObject isa_value = (NIL != set.set_memberP(col, isas)) ? ((SubLObject) ($T)) : $F;
                        SubLObject quoted_isa_value = (NIL != set.set_memberP(col, quoted_isas)) ? ((SubLObject) ($T)) : $F;
                        SubLObject genls_value = (NIL != set.set_memberP(col, v_genls)) ? ((SubLObject) ($T)) : $F;
                        plist = putf(plist, isa_property, isa_value);
                        plist = putf(plist, quoted_isa_property, quoted_isa_value);
                        plist = putf(plist, genls_property, genls_value);
                    }
                }
                {
                    SubLObject evaluation = decision_tree.evaluate_decision_tree($term_classification_tree$.getDynamicValue(thread), plist);
                    SubLObject pcase_var = evaluation;
                    if (pcase_var.eql(GOOD)) {
                        return T;
                    } else {
                        if (pcase_var.eql(BAD)) {
                            return NIL;
                        } else {
                            return Errors.error($str_alt30$Unexpected_term_classification_tr, evaluation);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject term_good_wrt_classification_treeP_internal(final SubLObject v_term, final SubLObject v_decision_tree, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_term_p(v_term) : "! cycl_grammar.cycl_term_p(v_term) " + ("cycl_grammar.cycl_term_p(v_term) " + "CommonSymbols.NIL != cycl_grammar.cycl_term_p(v_term) ") + v_term;
        if (NIL == $term_classification_tree$.getDynamicValue(thread)) {
            initialize_term_classification_tree(v_decision_tree);
        }
        if (NIL == $term_classification_tree_collections$.getDynamicValue(thread)) {
            initialize_term_classification_tree_collections();
        }
        final SubLObject cols = $term_classification_tree_collections$.getDynamicValue(thread);
        final SubLObject isas = set_utilities.construct_set_from_list(isa.all_isa_among(v_term, cols, mt, UNPROVIDED), symbol_function(EQ), UNPROVIDED);
        final SubLObject quoted_isas = set_utilities.construct_set_from_list(NIL != term.hl_term_p(v_term) ? isa.all_quoted_isa_among(v_term, cols, mt, UNPROVIDED) : NIL, symbol_function(EQ), UNPROVIDED);
        final SubLObject v_genls = set_utilities.construct_set_from_list(NIL != term.el_fort_p(v_term) ? genls.all_genls_among(v_term, cols, mt, UNPROVIDED) : NIL, symbol_function(EQ), UNPROVIDED);
        SubLObject plist = NIL;
        SubLObject cdolist_list_var = cols;
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject col_str = tree_term_from_constant(col);
            final SubLObject isa_property = make_keyword(Strings.string_upcase(cconcatenate($str1$ISA_, col_str), UNPROVIDED, UNPROVIDED));
            final SubLObject quoted_isa_property = make_keyword(Strings.string_upcase(cconcatenate($str2$QUOTEDISA_, col_str), UNPROVIDED, UNPROVIDED));
            final SubLObject genls_property = make_keyword(Strings.string_upcase(cconcatenate($str3$GENLS_, col_str), UNPROVIDED, UNPROVIDED));
            final SubLObject isa_value = (NIL != set.set_memberP(col, isas)) ? $T : $F;
            final SubLObject quoted_isa_value = (NIL != set.set_memberP(col, quoted_isas)) ? $T : $F;
            final SubLObject genls_value = (NIL != set.set_memberP(col, v_genls)) ? $T : $F;
            plist = putf(plist, isa_property, isa_value);
            plist = putf(plist, quoted_isa_property, quoted_isa_value);
            plist = putf(plist, genls_property, genls_value);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        final SubLObject pcase_var;
        final SubLObject evaluation = pcase_var = decision_tree.evaluate_decision_tree($term_classification_tree$.getDynamicValue(thread), plist);
        if (pcase_var.eql(GOOD)) {
            return T;
        }
        if (pcase_var.eql(BAD)) {
            return NIL;
        }
        return Errors.error($str30$Unexpected_term_classification_tr, evaluation);
    }

    public static final SubLObject term_good_wrt_classification_treeP(SubLObject v_term, SubLObject v_decision_tree) {
        {
            SubLObject caching_state = $term_good_wrt_classification_treeP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym24$TERM_GOOD_WRT_CLASSIFICATION_TREE_, $sym31$_TERM_GOOD_WRT_CLASSIFICATION_TREE__CACHING_STATE_, $int$5000, EQUAL, TWO_INTEGER, ZERO_INTEGER);
                memoization_state.register_hl_store_cache_clear_callback($sym33$CLEAR_TERM_GOOD_WRT_CLASSIFICATION_TREE_);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, v_decision_tree);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw34$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (v_term.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && v_decision_tree.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.term_classification_tree.term_good_wrt_classification_treeP_internal(v_term, v_decision_tree)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, v_decision_tree));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject term_good_wrt_classification_treeP(final SubLObject v_term, final SubLObject v_decision_tree, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $term_classification_tree_mt$.getDynamicValue();
        }
        SubLObject caching_state = $term_good_wrt_classification_treeP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym24$TERM_GOOD_WRT_CLASSIFICATION_TREE_, $sym31$_TERM_GOOD_WRT_CLASSIFICATION_TREE__CACHING_STATE_, $int$5000, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym33$CLEAR_TERM_GOOD_WRT_CLASSIFICATION_TREE_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, v_decision_tree, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (v_decision_tree.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(term_good_wrt_classification_treeP_internal(v_term, v_decision_tree, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, v_decision_tree, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject declare_term_classification_tree_file_alt() {
        declareFunction("create_term_classification_tree_collections", "CREATE-TERM-CLASSIFICATION-TREE-COLLECTIONS", 1, 0, false);
        declareFunction("initialize_term_classification_tree_collections", "INITIALIZE-TERM-CLASSIFICATION-TREE-COLLECTIONS", 0, 0, false);
        declareFunction("constant_from_tree_term", "CONSTANT-FROM-TREE-TERM", 1, 0, false);
        declareFunction("tree_term_from_constant", "TREE-TERM-FROM-CONSTANT", 1, 0, false);
        declareFunction("term_classification_tree_mt", "TERM-CLASSIFICATION-TREE-MT", 0, 0, false);
        declareFunction("set_term_classification_tree_mt", "SET-TERM-CLASSIFICATION-TREE-MT", 1, 0, false);
        declareFunction("initialize_term_classification_tree", "INITIALIZE-TERM-CLASSIFICATION-TREE", 1, 0, false);
        declareFunction("reset_term_classification_tree", "RESET-TERM-CLASSIFICATION-TREE", 0, 0, false);
        declareFunction("clear_term_good_wrt_classification_treeP", "CLEAR-TERM-GOOD-WRT-CLASSIFICATION-TREE?", 0, 0, false);
        declareFunction("remove_term_good_wrt_classification_treeP", "REMOVE-TERM-GOOD-WRT-CLASSIFICATION-TREE?", 2, 0, false);
        declareFunction("term_good_wrt_classification_treeP_internal", "TERM-GOOD-WRT-CLASSIFICATION-TREE?-INTERNAL", 2, 0, false);
        declareFunction("term_good_wrt_classification_treeP", "TERM-GOOD-WRT-CLASSIFICATION-TREE?", 2, 0, false);
        return NIL;
    }

    public static SubLObject declare_term_classification_tree_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("create_term_classification_tree_collections", "CREATE-TERM-CLASSIFICATION-TREE-COLLECTIONS", 1, 0, false);
            declareFunction("initialize_term_classification_tree_collections", "INITIALIZE-TERM-CLASSIFICATION-TREE-COLLECTIONS", 0, 0, false);
            declareFunction("constant_from_tree_term", "CONSTANT-FROM-TREE-TERM", 1, 0, false);
            declareFunction("tree_term_from_constant", "TREE-TERM-FROM-CONSTANT", 1, 0, false);
            declareFunction("term_classification_tree_mt", "TERM-CLASSIFICATION-TREE-MT", 0, 0, false);
            declareFunction("set_term_classification_tree_mt", "SET-TERM-CLASSIFICATION-TREE-MT", 1, 0, false);
            declareFunction("initialize_term_classification_tree", "INITIALIZE-TERM-CLASSIFICATION-TREE", 1, 0, false);
            declareFunction("reset_term_classification_tree", "RESET-TERM-CLASSIFICATION-TREE", 0, 0, false);
            declareFunction("clear_term_good_wrt_classification_treeP", "CLEAR-TERM-GOOD-WRT-CLASSIFICATION-TREE?", 0, 0, false);
            declareFunction("remove_term_good_wrt_classification_treeP", "REMOVE-TERM-GOOD-WRT-CLASSIFICATION-TREE?", 2, 1, false);
            declareFunction("term_good_wrt_classification_treeP_internal", "TERM-GOOD-WRT-CLASSIFICATION-TREE?-INTERNAL", 3, 0, false);
            declareFunction("term_good_wrt_classification_treeP", "TERM-GOOD-WRT-CLASSIFICATION-TREE?", 2, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("remove_term_good_wrt_classification_treeP", "REMOVE-TERM-GOOD-WRT-CLASSIFICATION-TREE?", 2, 0, false);
            declareFunction("term_good_wrt_classification_treeP_internal", "TERM-GOOD-WRT-CLASSIFICATION-TREE?-INTERNAL", 2, 0, false);
            declareFunction("term_good_wrt_classification_treeP", "TERM-GOOD-WRT-CLASSIFICATION-TREE?", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_term_classification_tree_file_Previous() {
        declareFunction("create_term_classification_tree_collections", "CREATE-TERM-CLASSIFICATION-TREE-COLLECTIONS", 1, 0, false);
        declareFunction("initialize_term_classification_tree_collections", "INITIALIZE-TERM-CLASSIFICATION-TREE-COLLECTIONS", 0, 0, false);
        declareFunction("constant_from_tree_term", "CONSTANT-FROM-TREE-TERM", 1, 0, false);
        declareFunction("tree_term_from_constant", "TREE-TERM-FROM-CONSTANT", 1, 0, false);
        declareFunction("term_classification_tree_mt", "TERM-CLASSIFICATION-TREE-MT", 0, 0, false);
        declareFunction("set_term_classification_tree_mt", "SET-TERM-CLASSIFICATION-TREE-MT", 1, 0, false);
        declareFunction("initialize_term_classification_tree", "INITIALIZE-TERM-CLASSIFICATION-TREE", 1, 0, false);
        declareFunction("reset_term_classification_tree", "RESET-TERM-CLASSIFICATION-TREE", 0, 0, false);
        declareFunction("clear_term_good_wrt_classification_treeP", "CLEAR-TERM-GOOD-WRT-CLASSIFICATION-TREE?", 0, 0, false);
        declareFunction("remove_term_good_wrt_classification_treeP", "REMOVE-TERM-GOOD-WRT-CLASSIFICATION-TREE?", 2, 1, false);
        declareFunction("term_good_wrt_classification_treeP_internal", "TERM-GOOD-WRT-CLASSIFICATION-TREE?-INTERNAL", 3, 0, false);
        declareFunction("term_good_wrt_classification_treeP", "TERM-GOOD-WRT-CLASSIFICATION-TREE?", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_term_classification_tree_file() {
        defparameter("*TERM-CLASSIFICATION-TREE-COLLECTIONS*", NIL);
        defparameter("*TERM-CLASSIFICATION-TREE-MT*", $const18$CurrentWorldDataCollectorMt_NonHo);
        defparameter("*TERM-CLASSIFICATION-TREE*", NIL);
        deflexical("*TERM-GOOD-WRT-CLASSIFICATION-TREE?-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_term_classification_tree_file() {
        register_external_symbol(TERM_CLASSIFICATION_TREE_MT);
        register_external_symbol(SET_TERM_CLASSIFICATION_TREE_MT);
        register_external_symbol(RESET_TERM_CLASSIFICATION_TREE);
        memoization_state.note_globally_cached_function($sym24$TERM_GOOD_WRT_CLASSIFICATION_TREE_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_term_classification_tree_file();
    }

    @Override
    public void initializeVariables() {
        init_term_classification_tree_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_term_classification_tree_file();
    }

    static private final SubLString $str_alt1$ISA_ = makeString("ISA_");

    static {
    }

    static private final SubLString $str_alt2$QUOTEDISA_ = makeString("QUOTEDISA_");

    static private final SubLString $str_alt3$GENLS_ = makeString("GENLS_");

    static private final SubLString $str_alt4$Unexpected_term_classification_tr = makeString("Unexpected term classification tree property ~s");

    static private final SubLString $str_alt5$Creation_of_collections_from_a_Te = makeString("Creation of collections from a Term Classification Tree failed due to the following errors: ~%~A~%");

    static private final SubLString $str_alt6$CU2FN_ = makeString("CU2FN_");

    static private final SubLList $list_alt7 = list(CHAR_underbar);

    static private final SubLString $str_alt11$CU3FN_ = makeString("CU3FN_");

    static private final SubLString $str_alt12$Unable_to_find_a_constant_when_ex = makeString("Unable to find a constant when executing (CONSTANT-FROM-TREE-TERM ~S)");

    static private final SubLString $str_alt13$CU2FN_1 = makeString("CU2FN_1");

    static private final SubLString $str_alt14$_2 = makeString("_2");

    static private final SubLString $str_alt15$CU3FN_1 = makeString("CU3FN_1");

    static private final SubLString $str_alt16$_3 = makeString("_3");

    static private final SubLString $str_alt17$Invalid_NAT_being_converted_to_tr = makeString("Invalid NAT being converted to tree-term: ~S");

    static private final SubLString $str_alt30$Unexpected_term_classification_tr = makeString("Unexpected term classification tree evaluation ~s");

    public static final SubLSymbol $kw34$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
}

/**
 * Total time: 93 ms
 */
