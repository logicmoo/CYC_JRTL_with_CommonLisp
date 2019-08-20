/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.possibly_nat_p;
import static com.cyc.cycjava.cycl.html_macros.$html_attribute_class$;
import static com.cyc.cycjava.cycl.html_macros.$html_body_bgcolor$;
import static com.cyc.cycjava.cycl.html_macros.$html_body_class$;
import static com.cyc.cycjava.cycl.html_macros.$html_body_head$;
import static com.cyc.cycjava.cycl.html_macros.$html_body_tail$;
import static com.cyc.cycjava.cycl.html_macros.$html_default_bgcolor$;
import static com.cyc.cycjava.cycl.html_macros.$html_form_action$;
import static com.cyc.cycjava.cycl.html_macros.$html_form_field_uniquifier_code$;
import static com.cyc.cycjava.cycl.html_macros.$html_form_head$;
import static com.cyc.cycjava.cycl.html_macros.$html_form_method$;
import static com.cyc.cycjava.cycl.html_macros.$html_form_method_post$;
import static com.cyc.cycjava.cycl.html_macros.$html_form_tail$;
import static com.cyc.cycjava.cycl.html_macros.$html_form_target$;
import static com.cyc.cycjava.cycl.html_macros.$html_head_head$;
import static com.cyc.cycjava.cycl.html_macros.$html_head_tail$;
import static com.cyc.cycjava.cycl.html_macros.$html_heading_head$;
import static com.cyc.cycjava.cycl.html_macros.$html_heading_tail$;
import static com.cyc.cycjava.cycl.html_macros.$html_html_head$;
import static com.cyc.cycjava.cycl.html_macros.$html_html_tail$;
import static com.cyc.cycjava.cycl.html_macros.$html_id_space_id_generator$;
import static com.cyc.cycjava.cycl.html_macros.$html_inside_bodyP$;
import static com.cyc.cycjava.cycl.html_macros.$html_option_head$;
import static com.cyc.cycjava.cycl.html_macros.$html_option_tail$;
import static com.cyc.cycjava.cycl.html_macros.$html_option_value$;
import static com.cyc.cycjava.cycl.html_macros.$html_paragraph_head$;
import static com.cyc.cycjava.cycl.html_macros.$html_paragraph_tail$;
import static com.cyc.cycjava.cycl.html_macros.$html_safe_print$;
import static com.cyc.cycjava.cycl.html_macros.$html_select_head$;
import static com.cyc.cycjava.cycl.html_macros.$html_select_name$;
import static com.cyc.cycjava.cycl.html_macros.$html_select_size$;
import static com.cyc.cycjava.cycl.html_macros.$html_select_tail$;
import static com.cyc.cycjava.cycl.html_macros.$html_span_head$;
import static com.cyc.cycjava.cycl.html_macros.$html_span_tail$;
import static com.cyc.cycjava.cycl.html_macros.$html_stream$;
import static com.cyc.cycjava.cycl.html_macros.$html_style_head$;
import static com.cyc.cycjava.cycl.html_macros.$html_style_tail$;
import static com.cyc.cycjava.cycl.html_macros.$html_table_wrap$;
import static com.cyc.cycjava.cycl.html_macros.$html_textarea_cols$;
import static com.cyc.cycjava.cycl.html_macros.$html_textarea_head$;
import static com.cyc.cycjava.cycl.html_macros.$html_textarea_name$;
import static com.cyc.cycjava.cycl.html_macros.$html_textarea_rows$;
import static com.cyc.cycjava.cycl.html_macros.$html_textarea_tail$;
import static com.cyc.cycjava.cycl.html_macros.$html_title_head$;
import static com.cyc.cycjava.cycl.html_macros.$html_title_tail$;
import static com.cyc.cycjava.cycl.html_macros.$within_html_form$;
import static com.cyc.cycjava.cycl.html_macros.embed_form_field_code;
import static com.cyc.cycjava.cycl.html_macros.html_head_content_type;
import static com.cyc.cycjava.cycl.html_macros.next_html_form_field_uniquifier_code;
import static com.cyc.cycjava.cycl.html_macros.note_handler_mime_type;
import static com.cyc.cycjava.cycl.html_macros.note_html_handler_function;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_checkbox_input;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_cyclified_sexpr;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input_values;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_sexpr;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.cycjava.cycl.html_utilities.html_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_text_input;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write_to_string;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.creduce;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_eval$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.nl.document_disambiguation;
import com.cyc.cycjava.cycl.owl.owl_cycl_to_xml;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CONCEPT-TAGGER
 * source file: /cyc/top/cycl/concept-tagger.lisp
 * created:     2019/07/03 17:38:53
 */
public final class concept_tagger extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt37$ = makeString("");

    public static final class $tag_concepts_iterator_state_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.concept_tagger.$tag_concepts_iterator_state_native.this.$sentences_to_do;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.concept_tagger.$tag_concepts_iterator_state_native.this.$document;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.concept_tagger.$tag_concepts_iterator_state_native.this.$lexicon;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.concept_tagger.$tag_concepts_iterator_state_native.this.$sense_tagger;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.concept_tagger.$tag_concepts_iterator_state_native.this.$filter;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.concept_tagger.$tag_concepts_iterator_state_native.this.$output_spec;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.concept_tagger.$tag_concepts_iterator_state_native.this.$prepared_sentence_output;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.concept_tagger.$tag_concepts_iterator_state_native.this.$sentences_to_do = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.concept_tagger.$tag_concepts_iterator_state_native.this.$document = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.concept_tagger.$tag_concepts_iterator_state_native.this.$lexicon = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.concept_tagger.$tag_concepts_iterator_state_native.this.$sense_tagger = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.concept_tagger.$tag_concepts_iterator_state_native.this.$filter = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.concept_tagger.$tag_concepts_iterator_state_native.this.$output_spec = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.concept_tagger.$tag_concepts_iterator_state_native.this.$prepared_sentence_output = value;
        }

        public SubLObject $sentences_to_do = Lisp.NIL;

        public SubLObject $document = Lisp.NIL;

        public SubLObject $lexicon = Lisp.NIL;

        public SubLObject $sense_tagger = Lisp.NIL;

        public SubLObject $filter = Lisp.NIL;

        public SubLObject $output_spec = Lisp.NIL;

        public SubLObject $prepared_sentence_output = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.concept_tagger.$tag_concepts_iterator_state_native.class, TAG_CONCEPTS_ITERATOR_STATE, TAG_CONCEPTS_ITERATOR_STATE_P, $list_alt83, $list_alt84, new String[]{ "$sentences_to_do", "$document", "$lexicon", "$sense_tagger", "$filter", "$output_spec", "$prepared_sentence_output" }, $list_alt85, $list_alt86, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final class $concept_tagger_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.concept_tagger.$concept_tagger_native.this.$name;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.concept_tagger.$concept_tagger_native.this.$tag_method;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.concept_tagger.$concept_tagger_native.this.$lexicon_method;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.concept_tagger.$concept_tagger_native.this.$name = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.concept_tagger.$concept_tagger_native.this.$tag_method = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.concept_tagger.$concept_tagger_native.this.$lexicon_method = value;
        }

        public SubLObject $name = Lisp.NIL;

        public SubLObject $tag_method = Lisp.NIL;

        public SubLObject $lexicon_method = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.concept_tagger.$concept_tagger_native.class, CONCEPT_TAGGER, CONCEPT_TAGGER_P, $list_alt127, $list_alt128, new String[]{ "$name", "$tag_method", "$lexicon_method" }, $list_alt129, $list_alt130, PRINT_CONCEPT_TAGGER);
    }

    public static final SubLFile me = new concept_tagger();



    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $default_sentence_string_lexicon$ = makeSymbol("*DEFAULT-SENTENCE-STRING-LEXICON*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $default_sentence_string_parser$ = makeSymbol("*DEFAULT-SENTENCE-STRING-PARSER*");

    // defparameter
    /**
     * Terms with generality estimates higher than this aren't worth showing to a user
     */
    @LispMethod(comment = "Terms with generality estimates higher than this aren\'t worth showing to a user\ndefparameter")
    private static final SubLSymbol $concept_tagger_lexical_generality_cutoff$ = makeSymbol("*CONCEPT-TAGGER-LEXICAL-GENERALITY-CUTOFF*");

    // deflexical
    // a list of concept filters to be used by the HTML code in this file
    /**
     * a list of concept filters to be used by the HTML code in this file
     */
    @LispMethod(comment = "a list of concept filters to be used by the HTML code in this file\ndeflexical")
    private static final SubLSymbol $html_concept_filters$ = makeSymbol("*HTML-CONCEPT-FILTERS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $doc_tagger_default_style$ = makeSymbol("*DOC-TAGGER-DEFAULT-STYLE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $browser_tagging_lexicons$ = makeSymbol("*BROWSER-TAGGING-LEXICONS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $cb_tag_document_to_html$ = makeSymbol("*CB-TAG-DOCUMENT-TO-HTML*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $cb_tag_document_to_xml$ = makeSymbol("*CB-TAG-DOCUMENT-TO-XML*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_tag_concepts_iterator_state$ = makeSymbol("*DTP-TAG-CONCEPTS-ITERATOR-STATE*");

    // defparameter
    /**
     * if set to NIL, use a syntactic parser to try to get better concept-tagging
     * results
     */
    @LispMethod(comment = "if set to NIL, use a syntactic parser to try to get better concept-tagging\r\nresults\ndefparameter\nif set to NIL, use a syntactic parser to try to get better concept-tagging\nresults")
    private static final SubLSymbol $tag_concepts_quicklyP$ = makeSymbol("*TAG-CONCEPTS-QUICKLY?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $registered_concept_taggers$ = makeSymbol("*REGISTERED-CONCEPT-TAGGERS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_concept_tagger$ = makeSymbol("*DTP-CONCEPT-TAGGER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $concept_tagger_test_docs$ = makeSymbol("*CONCEPT-TAGGER-TEST-DOCS*");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLInteger $int$400000 = makeInteger(400000);

    private static final SubLSymbol TAG_CONCEPTS = makeSymbol("TAG-CONCEPTS");

    private static final SubLSymbol DOCUMENT_P = makeSymbol("DOCUMENT-P");

    private static final SubLSymbol TAG_CONCEPTS_OPTIONAL_ARGS_P = makeSymbol("TAG-CONCEPTS-OPTIONAL-ARGS-P");

    private static final SubLSymbol TAG_CONCEPTS_ITERATOR_STATE_DONE_P = makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-DONE-P");

    private static final SubLSymbol TAG_CONCEPTS_ITERATOR_STATE_NEXT = makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-NEXT");

    static private final SubLList $list6 = list(makeKeyword("LEXICON"), makeKeyword("OUTPUT-SPEC"), makeKeyword("FILTER"), makeKeyword("SENSE-TAGGER"), makeKeyword("TIMEOUT"));

    private static final SubLSymbol GET_NEXT_SENTENCE_ANNOTATION = makeSymbol("GET-NEXT-SENTENCE-ANNOTATION");

    private static final SubLSymbol ITERATOR_P = makeSymbol("ITERATOR-P");

    static private final SubLSymbol $sym11$ANNOTATION_COMPLETE_ = makeSymbol("ANNOTATION-COMPLETE?");

    static private final SubLList $list12 = list(list(makeSymbol("RESULT"), makeSymbol("DOCUMENT"), makeSymbol("&OPTIONAL"), makeSymbol("OPTIONAL-ARG-PLIST")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym13$ITER = makeUninternedSymbol("ITER");

    private static final SubLSymbol WITH_SBHL_RESOURCED_MARKING_SPACES = makeSymbol("WITH-SBHL-RESOURCED-MARKING-SPACES");

    private static final SubLSymbol WITH_POSSIBLY_NEW_MEMOIZATION_STATE = makeSymbol("WITH-POSSIBLY-NEW-MEMOIZATION-STATE");

    private static final SubLSymbol WITH_NEW_CONCEPT_FILTER_MEMOIZATION_STATE = makeSymbol("WITH-NEW-CONCEPT-FILTER-MEMOIZATION-STATE");

    private static final SubLSymbol ALL_TAGGED_CONCEPTS = makeSymbol("ALL-TAGGED-CONCEPTS");

    private static final SubLString $str20$d__ = makeString("d~%");

    private static final SubLString $str21$p__ = makeString("p~%");

    private static final SubLString $str22$s__ = makeString("s~%");

    private static final SubLString $str23$w_A_A_A_A__A = makeString("w~A~A~A~A ~A");

    private static final SubLString $str24$_A_A = makeString("~A~A");

    private static final SubLString $str25$__ = makeString("~%");

    private static final SubLList $list26 = list(list(makeString("6"), makeString("The Cyc Commonsense Ontology"), list(reader_make_constant_shell("ConceptFilterSpecificationFn"), reader_make_constant_shell("TaxonomyOfEasilyUnderstandableConcepts"), reader_make_constant_shell("ConceptOnlyFilterParameter"), reader_make_constant_shell("TriggerFromConcept"))), list(makeString("0"), makeString("Entire Cyc KB"), list(reader_make_constant_shell("ConceptFilterSpecificationFn"), reader_make_constant_shell("TheCycOntology"), reader_make_constant_shell("ConceptOnlyFilterParameter"), reader_make_constant_shell("TriggerFromConcept"))), list(makeString("1"), makeString("Medical Filter"), list(reader_make_constant_shell("ConceptFilterSpecificationFn"), reader_make_constant_shell("CAEMedicalResearchFilterTree"), reader_make_constant_shell("ConceptAndInstancesFilterParameter"), reader_make_constant_shell("TriggerFromConceptSpecOrInstance"))), list(makeString("2"), makeString("Military Taxonomy"), list(reader_make_constant_shell("ConceptFilterSpecificationFn"), list(reader_make_constant_shell("ConceptNodesForTaxonFn"), reader_make_constant_shell("MilitaryThingTaxonomy")), reader_make_constant_shell("ConceptAndInstancesFilterParameter"), reader_make_constant_shell("TriggerFromConceptSpecOrInstance"))), list(makeString("3"), makeString("Terrorism Filter"), list(reader_make_constant_shell("ConceptFilterSpecificationFn"), list(reader_make_constant_shell("ConceptNodesForTaskTypeFn"), reader_make_constant_shell("IntelligenceAnalysisTask-Allotment")), reader_make_constant_shell("ConceptAndInstancesFilterParameter"), reader_make_constant_shell("TriggerFromConceptSpecOrInstance"))), list(makeString("4"), makeString("Food & Drink Taxonomy"), list(reader_make_constant_shell("ConceptFilterSpecificationFn"), reader_make_constant_shell("FoodAndDrinkTaxonomy"), reader_make_constant_shell("ConceptAndInstancesFilterParameter"), reader_make_constant_shell("TriggerFromConceptSpecOrInstance"))), list(makeString("5"), makeString("Investment Taxonomy"), list(reader_make_constant_shell("ConceptFilterSpecificationFn"), reader_make_constant_shell("InvestmentRelatedThingTaxonomy"), reader_make_constant_shell("ConceptAndInstancesFilterParameter"), reader_make_constant_shell("TriggerFromConceptSpecOrInstance"))));

    private static final SubLSymbol XML_TAG_DOCUMENT = makeSymbol("XML-TAG-DOCUMENT");

    private static final SubLSymbol TAG_DOCUMENT_XML = makeSymbol("TAG-DOCUMENT-XML");

    private static final SubLString $str30$utf_8 = makeString("utf-8");

    private static final SubLString $$$document = makeString("document");

    private static final SubLString $$$xmlns = makeString("xmlns");

    private static final SubLString $str33$http___ws_opencyc_org_xsd_TextPro = makeString("http://ws.opencyc.org/xsd/TextProcessing");

    private static final SubLString $$$meta = makeString("meta");

    private static final SubLString $$$title = makeString("title");

    private static final SubLString $$$uri = makeString("uri");

    private static final SubLString $$$tagset = makeString("tagset");

    private static final SubLString $$$element = makeString("element");

    private static final SubLString $$$start = makeString("start");

    private static final SubLString $$$source = makeString("source");

    private static final SubLString $str42$___CDATA__A___ = makeString("<![CDATA[~A]]>");

    private static final SubLSymbol SERIALIZE_XML_SENSE_TAG_FOR_CYCL_TERM = makeSymbol("SERIALIZE-XML-SENSE-TAG-FOR-CYCL-TERM");

    private static final SubLString $$$sense = makeString("sense");

    private static final SubLString $str45$xmlns_concepts = makeString("xmlns:concepts");

    private static final SubLString $str46$http___ws_opencyc_org_xsd_CycConc = makeString("http://ws.opencyc.org/xsd/CycConcepts");

    private static final SubLString $$$concept = makeString("concept");

    private static final SubLString $str48$concepts_externalId = makeString("concepts:externalId");

    private static final SubLString $str49$concepts_preferredNl = makeString("concepts:preferredNl");

    private static final SubLString $str50$xml_lang = makeString("xml:lang");

    private static final SubLString $$$en = makeString("en");

    private static final SubLString $str52$concepts_cycl = makeString("concepts:cycl");

    private static final SubLString $$$Predicate = makeString("Predicate");

    private static final SubLString $$$Collection = makeString("Collection");

    private static final SubLString $$$Individual = makeString("Individual");

    private static final SubLString $str56$concepts_conceptType = makeString("concepts:conceptType");

    private static final SubLString $$$type = makeString("type");

    private static final SubLString $str58$_cycl__font_family__sans_serif__c = makeString(".cycl {font-family: sans-serif; color: #0000FF; font-size: smaller}\n     .weight {font-family: sans-serif; color: #AA00EE; font-size: smaller}");

    private static final SubLString $str59$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str60$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLString $str61$ = makeString("");

    private static final SubLSymbol MAYBE_HTML_EXTRACT_FROM_DOCUMENT = makeSymbol("MAYBE-HTML-EXTRACT-FROM-DOCUMENT");

    private static final SubLSymbol HTML_TAG_DOCUMENT = makeSymbol("HTML-TAG-DOCUMENT");

    private static final SubLSymbol HTML_TAG_DOCUMENT_INT = makeSymbol("HTML-TAG-DOCUMENT-INT");

    private static final SubLString $str66$_A = makeString("~A");

    private static final SubLString $str67$__ = makeString(" (");

    private static final SubLSymbol $sym68$WEIGHT_ = makeSymbol("WEIGHT>");

    private static final SubLSymbol GET_NL_INTERP_WEIGHT = makeSymbol("GET-NL-INTERP-WEIGHT");

    private static final SubLSymbol GET_NL_INTERP_CYCL = makeSymbol("GET-NL-INTERP-CYCL");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $$$cycl = makeString("cycl");

    private static final SubLString $str73$_S = makeString("~S");

    private static final SubLString $$$weight = makeString("weight");

    private static final SubLString $str75$__A = makeString(" ~A");

    private static final SubLString $str76$_ = makeString(")");

    private static final SubLString $str77$filter_id = makeString("filter-id");

    private static final SubLList $list78 = list(reader_make_constant_shell("ConceptFilterSpecificationFn"), reader_make_constant_shell("TheCycOntology"), reader_make_constant_shell("ConceptOnlyFilterParameter"), reader_make_constant_shell("TriggerFromConcept"));

    private static final SubLSymbol SET_LEARNERS = makeSymbol("SET-LEARNERS");

    private static final SubLSymbol ADD_CONCEPT_FILTER_SPEC = makeSymbol("ADD-CONCEPT-FILTER-SPEC");

    private static final SubLSymbol SET_BASE_MT = makeSymbol("SET-BASE-MT");

    private static final SubLSymbol GET_TAGGED_DOCUMENT_FROM_PARAMS = makeSymbol("GET-TAGGED-DOCUMENT-FROM-PARAMS");

    private static final SubLString $$$NIL = makeString("NIL");

    private static final SubLSymbol $IGNORE_POS_TAGGER = makeKeyword("IGNORE-POS-TAGGER");

    private static final SubLList $list100 = list(list(reader_make_constant_shell("ConceptFilterSpecificationFn"), reader_make_constant_shell("TheCycOntology"), reader_make_constant_shell("ConceptOnlyFilterParameter"), reader_make_constant_shell("TriggerFromConcept")));

    private static final SubLSymbol $MIN_LEXICAL_STRENGTH = makeKeyword("MIN-LEXICAL-STRENGTH");

    private static final SubLList $list104 = list(makeKeyword("MINIMAL"), makeKeyword("CONTEXT-SENSITIVE"));

    private static final SubLObject $const105$ContextuallyDependentLexicalMappi = reader_make_constant_shell("ContextuallyDependentLexicalMapping");

    private static final SubLList $list106 = list(makeKeyword("PRIMARY"));



    private static final SubLString $$$inputText = makeString("inputText");

    private static final SubLString $str110$use_ner = makeString("use-ner");

    private static final SubLString $str111$exhaustive_tagging = makeString("exhaustive-tagging");

    private static final SubLString $str112$ignore_pos_tagger = makeString("ignore-pos-tagger");

    private static final SubLString $$$sentencify = makeString("sentencify");

    private static final SubLString $$$lexicalMt = makeString("lexicalMt");

    private static final SubLSymbol NEW_ADHOC_GENLS_CONCEPT_FILTER_SPEC = makeSymbol("NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC");

    private static final SubLSymbol NEW_ADHOC_ISA_CONCEPT_FILTER_SPEC = makeSymbol("NEW-ADHOC-ISA-CONCEPT-FILTER-SPEC");

    private static final SubLSymbol EXHAUSTIVE_CONCEPT_TAGGER = makeSymbol("EXHAUSTIVE-CONCEPT-TAGGER");

    private static final SubLSymbol SIMPLE_CONCEPT_TAGGER = makeSymbol("SIMPLE-CONCEPT-TAGGER");

    private static final SubLSymbol POS_TAGGING_EXHAUSTIVE_CONCEPT_TAGGER = makeSymbol("POS-TAGGING-EXHAUSTIVE-CONCEPT-TAGGER");

    private static final SubLSymbol POS_TAGGING_CONCEPT_TAGGER = makeSymbol("POS-TAGGING-CONCEPT-TAGGER");

    private static final SubLString $$$disambiguate = makeString("disambiguate");

    private static final SubLString $$$lexicalStrength = makeString("lexicalStrength");

    private static final SubLList $list123 = list(makeString("rule"), makeString("true"), makeString("maximal"));

    private static final SubLList $list124 = list(makeString("minimal"), makeString("context_sensitive"));

    private static final SubLList $list125 = list(makeString("primary"));

    private static final SubLString $str126$vanishingly_rare = makeString("vanishingly_rare");

    private static final SubLString $$$allowSpecs = makeString("allowSpecs");

    private static final SubLSymbol READ_MULTIPLE_TERMS_FROM_STRING = makeSymbol("READ-MULTIPLE-TERMS-FROM-STRING");

    private static final SubLString $$$allowInstances = makeString("allowInstances");

    private static final SubLSymbol CB_GUESS_TERM = makeSymbol("CB-GUESS-TERM");

    private static final SubLString $$$caseSensitivity = makeString("caseSensitivity");

    private static final SubLString $$$preferred = makeString("preferred");

    private static final SubLList $list133 = list(makeString("on"), makeString("t"));

    private static final SubLList $list135 = list(makeString("off"), makeString("f"));

    private static final SubLList $list136 = list(makeString("preferred"), makeString(":preferred"));

    private static final SubLString $str137$Invalid_argument_for_case_sensiti = makeString("Invalid argument for case-sensitivity ~S");

    private static final SubLString $str138$text_html = makeString("text/html");

    private static final SubLString $str139$text_xml = makeString("text/xml");

    private static final SubLSymbol CB_TAG_DOCUMENT_HANDLER = makeSymbol("CB-TAG-DOCUMENT-HANDLER");

    private static final SubLSymbol CB_XML_TAG_DOCUMENT = makeSymbol("CB-XML-TAG-DOCUMENT");

    private static final SubLString $$$Concept_Tagger_Web_Service = makeString("Concept Tagger Web Service");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    private static final SubLString $str146$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str152$cb_tag_document_handler = makeString("cb-tag-document-handler");

    private static final SubLString $$$virtual = makeString("virtual");

    private static final SubLString $str155$Tag_to__ = makeString("Tag to: ");

    private static final SubLList $list156 = list(makeSymbol("ID-NUM"), makeSymbol("DISPLAY-STRING"), makeSymbol("CYCL"));

    private static final SubLString $str157$Lexical_Mt__optional_ = makeString("Lexical Mt (optional)");

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLString $$$_Use_Named_Entity_Recognizer = makeString(" Use Named Entity Recognizer");

    private static final SubLString $$$t = makeString("t");

    private static final SubLString $str161$_Ignore_Part_of_speech_tagger = makeString(" Ignore Part-of-speech tagger");

    private static final SubLString $str162$_Obey_computed_sentence_boundarie = makeString(" Obey computed sentence boundaries?");

    private static final SubLString $str163$Should_complex_phrases_also_get_i = makeString("Should complex phrases also get interpretations for the simpler words contained within them?");

    private static final SubLString $$$_Tag_Exhaustively = makeString(" Tag Exhaustively");

    private static final SubLString $str165$_Disambiguation__ = makeString(" Disambiguation: ");

    private static final SubLString $$$rule = makeString("rule");

    private static final SubLString $$$Maximal = makeString("Maximal");

    private static final SubLString $$$none = makeString("none");

    private static final SubLString $$$None = makeString("None");

    private static final SubLString $str172$_Minimum_Lexical_Strength__ = makeString(" Minimum Lexical Strength: ");

    private static final SubLString $$$primary = makeString("primary");

    private static final SubLString $$$Use_only_primary_mappings = makeString("Use only primary mappings");

    private static final SubLString $str175$context_sensitive = makeString("context_sensitive");

    private static final SubLString $$$Exclude_vanishingly_rare_mappings = makeString("Exclude vanishingly rare mappings");

    private static final SubLString $$$Use_all_lexical_mappings = makeString("Use all lexical mappings");

    private static final SubLString $str178$_Extract_Propositional_Informatio = makeString(" Extract Propositional Information (HTML-only)");

    private static final SubLString $str179$extract_info = makeString("extract-info");

    private static final SubLString $$$Tag_to_XML = makeString("Tag to XML");

    private static final SubLString $$$Tag_to_HTML = makeString("Tag to HTML");

    private static final SubLSymbol TAG_CONCEPTS_ITERATOR_STATE = makeSymbol("TAG-CONCEPTS-ITERATOR-STATE");

    private static final SubLSymbol TAG_CONCEPTS_ITERATOR_STATE_P = makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-P");

    private static final SubLList $list184 = list(makeSymbol("SENTENCES-TO-DO"), makeSymbol("DOCUMENT"), makeSymbol("LEXICON"), makeSymbol("SENSE-TAGGER"), makeSymbol("FILTER"), makeSymbol("OUTPUT-SPEC"), makeSymbol("PREPARED-SENTENCE-OUTPUT"));

    static private final SubLList $list185 = list(makeKeyword("SENTENCES-TO-DO"), makeKeyword("DOCUMENT"), makeKeyword("LEXICON"), makeKeyword("SENSE-TAGGER"), makeKeyword("FILTER"), makeKeyword("OUTPUT-SPEC"), makeKeyword("PREPARED-SENTENCE-OUTPUT"));

    static private final SubLList $list186 = list(makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO"), makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT"), makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-LEXICON"), makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER"), makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-FILTER"), makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC"), makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT"));

    static private final SubLList $list187 = list(makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO"), makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT"), makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-LEXICON"), makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER"), makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-FILTER"), makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC"), makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT"));

    private static final SubLSymbol TAG_CONCEPTS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list190 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-P"));

    private static final SubLSymbol TAG_CONCEPTS_ITERATOR_STATE_SENTENCES_TO_DO = makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO");

    private static final SubLSymbol _CSETF_TAG_CONCEPTS_ITERATOR_STATE_SENTENCES_TO_DO = makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO");

    private static final SubLSymbol TAG_CONCEPTS_ITERATOR_STATE_DOCUMENT = makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT");

    private static final SubLSymbol _CSETF_TAG_CONCEPTS_ITERATOR_STATE_DOCUMENT = makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT");

    private static final SubLSymbol TAG_CONCEPTS_ITERATOR_STATE_LEXICON = makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-LEXICON");

    private static final SubLSymbol _CSETF_TAG_CONCEPTS_ITERATOR_STATE_LEXICON = makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-LEXICON");

    private static final SubLSymbol TAG_CONCEPTS_ITERATOR_STATE_SENSE_TAGGER = makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER");

    private static final SubLSymbol _CSETF_TAG_CONCEPTS_ITERATOR_STATE_SENSE_TAGGER = makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER");

    private static final SubLSymbol TAG_CONCEPTS_ITERATOR_STATE_FILTER = makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-FILTER");

    private static final SubLSymbol _CSETF_TAG_CONCEPTS_ITERATOR_STATE_FILTER = makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-FILTER");

    private static final SubLSymbol TAG_CONCEPTS_ITERATOR_STATE_OUTPUT_SPEC = makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC");

    private static final SubLSymbol _CSETF_TAG_CONCEPTS_ITERATOR_STATE_OUTPUT_SPEC = makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC");

    private static final SubLSymbol TAG_CONCEPTS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT = makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT");

    private static final SubLSymbol _CSETF_TAG_CONCEPTS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT = makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT");

    private static final SubLSymbol $SENTENCES_TO_DO = makeKeyword("SENTENCES-TO-DO");

    private static final SubLSymbol $PREPARED_SENTENCE_OUTPUT = makeKeyword("PREPARED-SENTENCE-OUTPUT");

    private static final SubLString $str210$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_TAG_CONCEPTS_ITERATOR_STATE = makeSymbol("MAKE-TAG-CONCEPTS-ITERATOR-STATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TAG_CONCEPTS_ITERATOR_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TAG-CONCEPTS-ITERATOR-STATE-METHOD");

    private static final SubLString $str230$_______________Error_____________ = makeString("***************Error*****************");

    private static final SubLString $str231$Caught__S_while_processing__S__ = makeString("Caught ~S while processing ~S~%");

    private static final SubLSymbol CONCEPT_TAGGER = makeSymbol("CONCEPT-TAGGER");

    private static final SubLSymbol CONCEPT_TAGGER_P = makeSymbol("CONCEPT-TAGGER-P");

    private static final SubLList $list234 = list(makeSymbol("NAME"), makeSymbol("TAG-METHOD"), makeSymbol("LEXICON-METHOD"));

    private static final SubLList $list235 = list($NAME, makeKeyword("TAG-METHOD"), makeKeyword("LEXICON-METHOD"));

    private static final SubLList $list236 = list(makeSymbol("CONCEPT-TAGGER-NAME"), makeSymbol("CONCEPT-TAGGER-TAG-METHOD"), makeSymbol("CONCEPT-TAGGER-LEXICON-METHOD"));

    private static final SubLList $list237 = list(makeSymbol("_CSETF-CONCEPT-TAGGER-NAME"), makeSymbol("_CSETF-CONCEPT-TAGGER-TAG-METHOD"), makeSymbol("_CSETF-CONCEPT-TAGGER-LEXICON-METHOD"));

    private static final SubLSymbol PRINT_CONCEPT_TAGGER = makeSymbol("PRINT-CONCEPT-TAGGER");

    private static final SubLSymbol CONCEPT_TAGGER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CONCEPT-TAGGER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list240 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CONCEPT-TAGGER-P"));

    private static final SubLSymbol CONCEPT_TAGGER_NAME = makeSymbol("CONCEPT-TAGGER-NAME");

    private static final SubLSymbol _CSETF_CONCEPT_TAGGER_NAME = makeSymbol("_CSETF-CONCEPT-TAGGER-NAME");

    private static final SubLSymbol CONCEPT_TAGGER_TAG_METHOD = makeSymbol("CONCEPT-TAGGER-TAG-METHOD");

    private static final SubLSymbol _CSETF_CONCEPT_TAGGER_TAG_METHOD = makeSymbol("_CSETF-CONCEPT-TAGGER-TAG-METHOD");

    private static final SubLSymbol CONCEPT_TAGGER_LEXICON_METHOD = makeSymbol("CONCEPT-TAGGER-LEXICON-METHOD");

    private static final SubLSymbol _CSETF_CONCEPT_TAGGER_LEXICON_METHOD = makeSymbol("_CSETF-CONCEPT-TAGGER-LEXICON-METHOD");

    private static final SubLSymbol MAKE_CONCEPT_TAGGER = makeSymbol("MAKE-CONCEPT-TAGGER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CONCEPT_TAGGER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CONCEPT-TAGGER-METHOD");

    private static final SubLString $str252$__Concept_Tagger__A_ = makeString("#<Concept-Tagger:~A>");

    private static final SubLString $str253$_S_is_not_a_registered_concept_ta = makeString("~S is not a registered concept-tagger");

    private static final SubLString $str254$_S_is_not_a_registered_concept_ta = makeString("~S is not a registered concept tagger");

    private static final SubLSymbol LEXIFY_SENTENCE_EXHAUSTIVELY = makeSymbol("LEXIFY-SENTENCE-EXHAUSTIVELY");

    private static final SubLSymbol GET_CONCEPT_FILTER_SPECS = makeSymbol("GET-CONCEPT-FILTER-SPECS");

    private static final SubLSymbol TAG_CONCEPTS_USING_POS_TAGS = makeSymbol("TAG-CONCEPTS-USING-POS-TAGS");

    private static final SubLSymbol NEW_TERM_LEXICON = makeSymbol("NEW-TERM-LEXICON");

    private static final SubLSymbol TAG_CONCEPTS_EXHAUSTIVELY_USING_POS_TAGS = makeSymbol("TAG-CONCEPTS-EXHAUSTIVELY-USING-POS-TAGS");

    private static final SubLSymbol TAG_CONCEPTS_FAST = makeSymbol("TAG-CONCEPTS-FAST");

    private static final SubLSymbol TAG_CONCEPTS_FAST_EXHAUSTIVELY = makeSymbol("TAG-CONCEPTS-FAST-EXHAUSTIVELY");









    private static final SubLSymbol STANFORD_NER_DATE_LEARN = makeSymbol("STANFORD-NER-DATE-LEARN");

    private static final SubLList $list275 = list(makeKeyword("DEFAULT"));



    private static final SubLSymbol $sym282$PARSING_REWRITE_OF_INVERSE_ = makeSymbol("PARSING-REWRITE-OF-INVERSE?");







    private static final SubLString $$$T = makeString("T");

    private static final SubLList $list294 = list(makeString("doc-string"), makeString("Bananas and kiwis are fruit"));

    private static final SubLList $list295 = list(makeString("submit-button"), makeString("Display as HTML"));

    private static final SubLString $str296$doc_string = makeString("doc-string");

    private static final SubLList $list297 = list(makeString("sumbit-button"), makeString("Display as HTML"));

    private static final SubLSymbol FORGET = makeSymbol("FORGET");

    private static final SubLString $str300$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLList $list301 = list(makeString("NEWS & NOTES\n\nThe San Francisco Chronicle reports this week on new measures that Whole Foods plans to take to increase its commitment to sustainable agriculture and local produce, including a requirement that all Whole Foods stores buy from at least four individual local farms, a pledge of $10 million a year in donations to small farms, and Sunday Farmers Markets in Whole Foods parking lots.\n\nThe Agriculture Department is proposing new legislation that would loosen the standards for what is classified as grass-fed, reports The New York Times. Under the proposed rule, it is possible that animals that were not raised on a pasture and were given antibiotics and hormones could still be considered grass-fed.\n\nGothamist provides tips on how to prepare and store lettuce, which they like to get from Gorzynski Organic Farm at the Union Square Greenmarket.\n\nGET OUT OF TOWN\n\nThe New York Times has a series of articles this week on road trips to various farms, purveyors, and eateries in Columbia County, NY, Long Beach Island, NJ, Litchfield County, CT, and North Folk, NY. If you\'re looking for more ideas, several Greenmarket farms offer \"pick-your-own\" or \"make-your-own\" activities:\n\n    * You can pick-your-own fruit at Phillips Farms in Milford, NJ every day except for Tuesdays, from 8:00 a.m. to 8:00 p.m. Go now and catch the tail end of the blueberry season. Peaches, raspberries, and blackberries are also ready to be picked (or will be shortly). Call 908.995.0022 for more information.\n    * Prospect Hill Orchards offers seasonal pick-your-own weekends (9:00 a.m. to 4:00 p.m.). Right now, peaches (donut, yellow, and white) are ripe and ready. Nectarines can be picked starting the second weekend of August. Come mid-September, apples, pears, and pumpkins will be available. Contact Steve, Judy, or Brad Clarke at 845.795.2383 for more information.\n    * Learn old-fashioned cheesemaking at Valley Shepherd Creamery in Long Valley, NJ. You\'ll get to make your own cheese wheel, which you leave in the Creamery\'s hillside aging cave and pick up when it\'s ready in 60 to 75 days. The next cheesemaking class is September 17th. It costs $129 and includes the cheese class, cheese tasting, a tour, luncheon, and the wheel of cheese. Call 908.876.3200 for more information.\n\nWHAT\'S IN, WHAT\'S OUT\n\nBaby organic carrots ($1.50/bunch) and hot peppers (6/$1.00) from HydroGarden Farm...hyssop tea (\"licorice flavor, heals the lungs\") and lemon verbena tea ($1.00) from Berried Treasures...cranberry beans ($3.00/lb.) and yellow plum tomatoes ($2.50/lb) at Migliorelli Farm...blackberries ($4.00/half pint) from Locust Grove and Breezy Hill Orchard...early red free apples ($1.50) from Oak Grove Plantation...more varieties of apples from Caradonna, including red delicious, pristine, golden delicious, empire, mutsu, and cameo ($.75 to $1.25/lb.)...cubanelles ($2.40/lb.) from Keith\'s.\n\nDue to popular demand, Lynnhaven now has feta in brine (which gives it its characteristic saltiness). Feta crumbles not in brine are still available ($5.00).\n\nTamarack Hollow Farm is now taking orders for holiday ham, duck, goose, and suckling pig.\n\nRhubarb and fava beans are essentially gone...cherries are becoming less abundant...only tri-star strawberries are left.\n\nFOCUS ON: Just Rugelach\n\nRugelach Although the labels on their goods and the sign on their stand say \"Just Rugelach,\" perhaps the name on their CENY placard - \"Not Just Rugelach\" - is more apt. In addition to the traditional Jewish treat, they sell a wide array of baked goods: everything from muffins, strudels, bread, and cookies to more uncommon items. Take the roast pork buns: Roselie Halik, who runs the company with her husband Tom, explains that when she was pregnant she was craving them and Tom developed the recipe for her. They liked it so much that they kept it around and sell it at market to this day. Both times I visited them at the Tribeca Greenmarket, numerous patrons came just for these doughy delicacies, which they sell for $1.00 each.\n\nTom Halik started the company in 1995 after attending culinary school in Paris and working at the 5th Avenue Epicure in New York (where he met Roselie). He has come to be known as \"the rugelach man\" in Kearny, NJ, where they are based.  Everything is made from scratch, every day, and Tom is always working to improve his recipes: \"constantly developing,\" Roselie says. She tries all the recipes as her husband works on them, offering advice how they might be tweaked before they are finalized. \"I\'m his biggest critic,\" she says with a laugh.\n\nDespite the array of baked goods they sell, Roselie says that \"people always come for the rugelach.\" Right now they offer four different flavors: walnut raison apricot, walnut raisin raspberry, chocolate hazelnut, and cinnamon raisin. She says they try to make seasonal varieties, but always keep their standbys, like the classic walnut raisin apricot. Their rugelach can be bought wholesale or through mail order and at any of their Greenmarket locations throughout the city (see FARMER INFORMATION). Rugelach is 50 cents a piece or $2.00/quarter pound.\n\nFARMER INFORMATION\n\n    * Berried Treasures, Cooks Falls, NY. At the Union Square Greenmarket Wednesdays and Fridays.\n    * Breezy Hill Orchard, Staatsburg, NY. At the Union Square Greenmarket Wednesdays and Saturdays and the Orchard Street Market on Sundays (845.266.3979).\n    * Caradonna, at the Union Square Greenmarket Wednesdays and Saturdays.\n    * Hydro Garden Farm, Yaphank, NY. At the Union Square Greenmarket Mondays, Wednesdays, Fridays, and Saturdays (631.286.3423).\n    * Just Rugelach, Kearny, NJ. At the Tribeca Greenmarket Wednesdays and Saturdays, Brooklyn Borough Hall Greenmarket Tuesdays and Saturdays, UN Plaza Greenmarket on Wednesdays,  Bowling Green Greenmarket on Thursdays, and 77th Street Greenmarket and Jackson Heights Greenmarket on Sundays (201.246.9211).\n    * Keith\'s Farm, Westtown, NY. At the Union Square Greenmarket Wednesdays and Saturdays (845.856.4955).\n    * Locust Grove, Milton, NY. At the Union Square Greenmarket Wednesdays and Saturdays (845.795.5194).\n    * Lynnhaven, Pine Bush, NY. At the Union Square Greenmarket on Wednesdays (845.744.6089).\n    * Migliorelli Farm, Tivoli, NY. At the Union Square Greenmarket Wednesdays, Fridays, and Saturdays.\n    * Oak Grove Plantation, at the Union Square Greenmarket Fridays and Saturdays.\n    * Phillips Farms, Milford, NJ. At the Union Square Greenmarket Mondays, Wednesdays, Fridays, and Saturdays (908.995.0022).\n    * Prospect Hill Orchards, Milton, NY. At the Tribeca Greenmarket Saturdays (845.795.2383).\n    * Tamarack Hollow Farm, Corinth, VT. At the Union Square Greenmarket on Wednesdays (802.439.5078)\n    * Valley Shepherd Creamery, Long Valley, NJ. At the Union Square Greenmarket Wednesdays and Saturdays and the Tribeca Greenmarket on Wednesdays (908.876.3200)."), makeString("Cheap Fun Wines\nCheap Fun Wines.com is on a mission to find the most luscious wines on the planet for under $20.\n\nLeather Wine ToteThere are some days when it\'s fine to be swinging your bottles around in a nylon wine tote, but sometimes you need to class things up a bit. Enter the leather wine carrier from Wine Enthusiast, available at Amazon - it holds two bottles and your opening gear, and it makes you look a little less K-Mart and a little more J. Peterman.\n\n    Product Description\n\nWhen an invitation restaurant or learned palate requires you to \'bring your own\' you can do so at last with classic style and good taste. Our two-bottle wine tote is crafted of beautifully thick and supple nubuck with a warm brown finish that is smooth natural and surprisingly rugged. Features a zippered compartment to keep your corkscrew and antique-finished brass hardware for a handsome conclusion to this superior piece. Also holds champagne.from Amazon"), makeString("Vagablond - Stylish Travel, Food & Wine Blog\nThe globetrotter\'s guide to fashionable travel, wine, and food.\n\nI\'ve bought $100 bottles of wine and $10 bottles. Mostly the latter. But to some, $500 for 25.6 ounces of fermented grape juice and yeast is a price well worth paying. These are the \"baseball card collectors\" of wine who buy some to save, some to trade and some to sell.\n\nAccording to an article, \"Worth Its Weight In Gold?\" in today\'s SF Chronicle, \"$100 is a midrange price for a top-notch Napa Valley Cabernet Sauvignon, and with the price of Screaming Eagle Cabernet soaring to $500 with the October release of the 2003 vintage, expect others to follow along.\""), makeString("Accidental Hedonist\n\nIn writing about the French restaurants, I came to question just exactly where the idea of \"restaurants\" comes from. As per usual, I\'ve discovered something that I have previously did not know.\n\nThe word itself provides a fair amount of clues...restaurant comes from the Old French term restaurateur, which meant someone who provides (i.e. sells) restaurer. Restauarer means \"to restore\". In other words - a \"restorative\".\n\nIf one were to look back in the history books for the word \"restaurant\", the first appearance shows up in the 15th century as a recipe. In this recipe, a capon is rendered in a glass kettle along with gold or gems. This itself also help evolve into the idea that chicken soup can cures what ails.\n\nOver the course of years, restaurants evolved from gold laden rendered chicken, into soups and broths which were sold to the public by specific people. Much like other food producers, restaurateurs had their own guild and were able to sell the broth, much like charcutiers sold sausages and rotisseurs sold fresh game.\n\nIt was this collection of different vendors and sellers of food that allowed restaurateurs to flourish. The French Revolution helped take down, not just a monarchy, but the economic system of guilds that sometimes prevented one food producer from selling products that were typically the \"responsibility\" of another. Additionally the bourgeoisie became a viable economic force as tradesmen and artisans started to travel to other areas of France to find new markets for their wares. These traveling businessmen looked for places to eat which offered a variety of foods in a comforting atmosphere that reflected their own station in life. These were variables that inns and taverns (the initial purveyors of food to travelers) could not meet on a regular basis.\n\nRestaurants filled this void nicely, first by selling varieties of bouillon. Then, as the guikld system slowly dissolved away, they started offering other foodstuffs, such as soups, meats and pastries. This eventually (and quickly) evolved into businesses that resemble the restaurants we know of today.\n\nWho would have thought that the creation of restaurants was so involved?\n\nTechnorati Tags: Restaurants, Food, Food+History "), makeString("Wine Camp\nA wine blog with a terroir-ist twist.\n\nmikerichmond.jpgBouchaine is a winery that seemed always to be around, but was never exciting. While one of the founders of Carneros as a top pinot noir region, Bouchaine always remained in the shadow of its neighbors Acacia and Saintsbury. While some good wines were made at Bouchaine, other wineries rode the Carneros wave to the top.\n\nNow things are turned around and the same thing that took Acacia to the top is now powering Bouchaine, which has finally taken its place on the \"A\" team of Carneros producers. What made the wines of Acacia compelling was the talent, intelligence and passion of winemaker Mike Richmond, who has now taken his considerable talents to Bouchaine. \n\nMeanwhile the once revered Acacia winery has been turned into an industrial production line of plonk pinot by alcoholic beverage super-giant Diageo and now Acacia is involved in hand-to-hand combat with Sanford Winery and other corporate pinot noir producers to see who can sell the most boxes of indistinguishable pinot noir. If you are trying to decide between which of these labels to buy you should flip a coin or buy the cheapest because what\'s in the bottle is of little consequence or interest.\n\nAt this year\'s International Pinot Noir Celebration (IPNC), Mike Richmond presented his first Bouchaine Pinot Noir that he was responsible for from start to finish and a very nice wine it is. The 2004 Bouchaine Carneros Estate Pinot Noir is a lovely wine with a graceful balance and an intriguing subtle character. It certainly shows the richer characteristics of California, but is still restrained and complex with a lingering, not heavy finish.\n\nThe emergence of Bouchaine as a first class Carneros pinot noir producer reminds us that while great wines are made in the vineyard, you have to know what to do with those grapes when you get them. Mike Richmond obviously knows what to do and, perhaps more importantly when it comes to pinot noir - what not to do. "));

    private static final SubLSymbol GET_TAGGED_DOCUMENT_FROM_HTML_ARGS = makeSymbol("GET-TAGGED-DOCUMENT-FROM-HTML-ARGS");

    private static final SubLSymbol TERM_ABSENT_FROM_DOC_INTERPS = makeSymbol("TERM-ABSENT-FROM-DOC-INTERPS");

    private static final SubLList $list310 = list(list(list(list(makeString("T"), list(makeString("inputText"), makeString("an iranian")), list(makeString("filter-id"), makeString("6")), list(makeString("ignore-pos-tagger"), makeString("t")), list(makeString("disambiguate"), makeString("none")), list(makeString("lexicalStrength"), makeString("context_sensitive")), list(makeString("return-mime-type:text/html"), makeString("Tag to HTML")), list(makeString("uniquifier-code"), makeString("378")))), reader_make_constant_shell("AndamanAndNicobarIslands-UnionTerritoryIndia")), list(list(list(makeString("T"), list(makeString("inputText"), makeString("an iranian")), list(makeString("filter-id"), makeString("6")), list(makeString("ignore-pos-tagger"), makeString("t")), list(makeString("disambiguate"), makeString("maximal")), list(makeString("lexicalStrength"), makeString("primary")), list(makeString("return-mime-type:text/html"), makeString("Tag to HTML")), list(makeString("uniquifier-code"), makeString("378")))), reader_make_constant_shell("AndamanAndNicobarIslands-UnionTerritoryIndia")), list(list(list(makeString("T"), list(makeString("inputText"), makeString("an iranian")), list(makeString("filter-id"), makeString("6")), list(makeString("ignore-pos-tagger"), makeString("t")), list(makeString("disambiguate"), makeString("maximal")), list(makeString("lexicalStrength"), makeString("primary")), list(makeString("return-mime-type:text/html"), makeString("Tag to HTML")), list(makeString("uniquifier-code"), makeString("378")))), reader_make_constant_shell("TerroristOrganization-Aryan-Nations")));

    private static final SubLSymbol GET_TAGGED_DOCUMENT_FROM_HTML_ARGS_POS = makeSymbol("GET-TAGGED-DOCUMENT-FROM-HTML-ARGS-POS");

    private static final SubLSymbol TERM_IN_DOC_INTERPS = makeSymbol("TERM-IN-DOC-INTERPS");

    private static final SubLList $list313 = list(list(list(list(makeString("T"), list(makeString("inputText"), makeString("an iranian")), list(makeString("filter-id"), makeString("6")), list(makeString("ignore-pos-tagger"), makeString("t")), list(makeString("disambiguate"), makeString("none")), list(makeString("lexicalStrength"), makeString("vanishingly_rare")), list(makeString("return-mime-type:text/html"), makeString("Tag to HTML")), list(makeString("uniquifier-code"), makeString("378")))), reader_make_constant_shell("AndamanAndNicobarIslands-UnionTerritoryIndia")), list(list(list(makeString("T"), list(makeString("inputText"), makeString("an iranian")), list(makeString("filter-id"), makeString("6")), list(makeString("ignore-pos-tagger"), makeString("t")), list(makeString("disambiguate"), makeString("maximal")), list(makeString("lexicalStrength"), makeString("vanishingly_rare")), list(makeString("return-mime-type:text/html"), makeString("Tag to HTML")), list(makeString("uniquifier-code"), makeString("378")))), reader_make_constant_shell("TerroristOrganization-Aryan-Nations")));

    private static final SubLList $list315 = list(list(list(list(reader_make_constant_shell("DeltaOnQuantitySlotFn"), reader_make_constant_shell("gibbsFreeEnergyOfSystem"), reader_make_constant_shell("situationConcernsThermodynamicSystem"))), T));

    private static final SubLList $list316 = list(list(list(makeString("an iranian"), list(QUOTE, list(makeKeyword("FILTER-ID"), list(reader_make_constant_shell("ConceptFilterSpecificationFn"), reader_make_constant_shell("TaxonomyOfEasilyUnderstandableConcepts"), reader_make_constant_shell("ConceptOnlyFilterParameter"), reader_make_constant_shell("TriggerFromConcept")), makeKeyword("IGNORE-POS-TAGGER"), T, makeKeyword("MIN-LEXICAL-STRENGTH"), makeKeyword("CONTEXT-SENSITIVE")))), reader_make_constant_shell("AndamanAndNicobarIslands-UnionTerritoryIndia")), list(list(makeString("an iranian"), list(QUOTE, list(makeKeyword("FILTER-ID"), list(reader_make_constant_shell("ConceptFilterSpecificationFn"), reader_make_constant_shell("TaxonomyOfEasilyUnderstandableConcepts"), reader_make_constant_shell("ConceptOnlyFilterParameter"), reader_make_constant_shell("TriggerFromConcept")), makeKeyword("IGNORE-POS-TAGGER"), T, makeKeyword("MIN-LEXICAL-STRENGTH"), makeKeyword("PRIMARY")))), reader_make_constant_shell("AndamanAndNicobarIslands-UnionTerritoryIndia")), list(list(makeString("an iranian"), list(QUOTE, list(makeKeyword("FILTER-ID"), list(reader_make_constant_shell("ConceptFilterSpecificationFn"), reader_make_constant_shell("TaxonomyOfEasilyUnderstandableConcepts"), reader_make_constant_shell("ConceptOnlyFilterParameter"), reader_make_constant_shell("TriggerFromConcept")), makeKeyword("IGNORE-POS-TAGGER"), T, makeKeyword("MIN-LEXICAL-STRENGTH"), makeKeyword("PRIMARY")))), reader_make_constant_shell("TerroristOrganization-Aryan-Nations")));

    /**
     * Returns an iterator that iterates through sentences in DOCUMENT, returning the concepts mentioned in that document.
     * The specific format of the return values is controlled by OUTPUT-SPEC
     */
    @LispMethod(comment = "Returns an iterator that iterates through sentences in DOCUMENT, returning the concepts mentioned in that document.\r\nThe specific format of the return values is controlled by OUTPUT-SPEC\nReturns an iterator that iterates through sentences in DOCUMENT, returning the concepts mentioned in that document.\nThe specific format of the return values is controlled by OUTPUT-SPEC")
    public static final SubLObject tag_concepts_alt(SubLObject v_document, SubLObject optional_arg_plist) {
        if (optional_arg_plist == UNPROVIDED) {
            optional_arg_plist = NIL;
        }
        SubLTrampolineFile.checkType(v_document, DOCUMENT_P);
        SubLTrampolineFile.checkType(optional_arg_plist, TAG_CONCEPTS_OPTIONAL_ARGS_P);
        {
            SubLObject augmented_plist = augment_tag_concepts_optional_arg_plist_with_defaults(optional_arg_plist);
            SubLObject v_pos_tagger = pos_tagger.get_tagger();
            SubLObject sentences = NIL;
            pos_tagger.tagger_tag_document(v_pos_tagger, v_document);
            {
                SubLObject vector_var = document.document_paragraphs(v_document);
                SubLObject backwardP_var = NIL;
                SubLObject length = length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    {
                        SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                        SubLObject paragraph = aref(vector_var, element_num);
                        SubLObject vector_var_1 = document.paragraph_sentences(paragraph);
                        SubLObject backwardP_var_2 = NIL;
                        SubLObject length_3 = length(vector_var_1);
                        SubLObject v_iteration_4 = NIL;
                        for (v_iteration_4 = ZERO_INTEGER; v_iteration_4.numL(length_3); v_iteration_4 = add(v_iteration_4, ONE_INTEGER)) {
                            {
                                SubLObject element_num_5 = (NIL != backwardP_var_2) ? ((SubLObject) (subtract(length_3, v_iteration_4, ONE_INTEGER))) : v_iteration_4;
                                SubLObject sentence = aref(vector_var_1, element_num_5);
                                sentences = cons(sentence, sentences);
                            }
                        }
                    }
                }
            }
            sentences = nreverse(sentences);
            return iteration.new_iterator(new_tag_concepts_iterator_state(sentences, v_document, augmented_plist), TAG_CONCEPTS_ITERATOR_STATE_DONE_P, TAG_CONCEPTS_ITERATOR_STATE_NEXT, UNPROVIDED);
        }
    }

    /**
     * Returns an iterator that iterates through sentences in DOCUMENT, returning the concepts mentioned in that document.
     * The specific format of the return values is controlled by OUTPUT-SPEC
     */
    @LispMethod(comment = "Returns an iterator that iterates through sentences in DOCUMENT, returning the concepts mentioned in that document.\r\nThe specific format of the return values is controlled by OUTPUT-SPEC\nReturns an iterator that iterates through sentences in DOCUMENT, returning the concepts mentioned in that document.\nThe specific format of the return values is controlled by OUTPUT-SPEC")
    public static SubLObject tag_concepts(final SubLObject v_document, SubLObject optional_arg_plist) {
        if (optional_arg_plist == UNPROVIDED) {
            optional_arg_plist = NIL;
        }
        SubLTrampolineFile.enforceType(v_document, DOCUMENT_P);
        SubLTrampolineFile.enforceType(optional_arg_plist, TAG_CONCEPTS_OPTIONAL_ARGS_P);
        final SubLObject augmented_plist = augment_tag_concepts_optional_arg_plist_with_defaults(optional_arg_plist);
        SubLObject sentences = NIL;
        final SubLObject vector_var = document.document_paragraphs(v_document);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$1;
        SubLObject backwardP_var_$2;
        SubLObject length_$3;
        SubLObject v_iteration_$4;
        SubLObject element_num_$5;
        SubLObject sentence;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$1 = document.paragraph_sentences(paragraph);
            backwardP_var_$2 = NIL;
            for (length_$3 = length(vector_var_$1), v_iteration_$4 = NIL, v_iteration_$4 = ZERO_INTEGER; v_iteration_$4.numL(length_$3); v_iteration_$4 = add(v_iteration_$4, ONE_INTEGER)) {
                element_num_$5 = (NIL != backwardP_var_$2) ? subtract(length_$3, v_iteration_$4, ONE_INTEGER) : v_iteration_$4;
                sentence = aref(vector_var_$1, element_num_$5);
                sentences = cons(sentence, sentences);
            }
        }
        sentences = nreverse(sentences);
        return iteration.new_iterator(new_tag_concepts_iterator_state(sentences, v_document, augmented_plist), TAG_CONCEPTS_ITERATOR_STATE_DONE_P, TAG_CONCEPTS_ITERATOR_STATE_NEXT, UNPROVIDED);
    }

    /**
     * Is OBJ an acceptable optional-arg-list for TAG-CONCEPTS?
     */
    @LispMethod(comment = "Is OBJ an acceptable optional-arg-list for TAG-CONCEPTS?")
    public static final SubLObject tag_concepts_optional_args_p_alt(SubLObject obj) {
        if (NIL == list_utilities.plist_restricted_to_indicatorsP(obj, $list_alt6)) {
            return NIL;
        } else {
            if (NIL == list_utilities.plist_has_keyP(obj, $LEXICON)) {
                return T;
            } else {
                if (NIL == term_lexicon.term_lexicon_p(getf(obj, $LEXICON, UNPROVIDED))) {
                    return NIL;
                } else {
                    if (NIL != list_utilities.plist_has_keyP(obj, $FILTER)) {
                        return NIL;
                    } else {
                        return T;
                    }
                }
            }
        }
    }

    /**
     * Is OBJ an acceptable optional-arg-list for TAG-CONCEPTS?
     */
    @LispMethod(comment = "Is OBJ an acceptable optional-arg-list for TAG-CONCEPTS?")
    public static SubLObject tag_concepts_optional_args_p(final SubLObject obj) {
        if (NIL == list_utilities.plist_restricted_to_indicatorsP(obj, $list6)) {
            return NIL;
        }
        if (NIL == list_utilities.plist_has_keyP(obj, $LEXICON)) {
            return T;
        }
        if (NIL == term_lexicon.term_lexicon_p(getf(obj, $LEXICON, UNPROVIDED))) {
            return NIL;
        }
        if (NIL != list_utilities.plist_has_keyP(obj, $FILTER)) {
            return NIL;
        }
        return T;
    }

    /**
     * Advance the iterator by one sentence, returning the semantic-annotations for the next sentence
     */
    @LispMethod(comment = "Advance the iterator by one sentence, returning the semantic-annotations for the next sentence")
    public static final SubLObject get_next_sentence_annotation_alt(SubLObject iterator) {
        SubLTrampolineFile.checkType(iterator, ITERATOR_P);
        return iteration.iteration_next(iterator);
    }

    /**
     * Advance the iterator by one sentence, returning the semantic-annotations for the next sentence
     */
    @LispMethod(comment = "Advance the iterator by one sentence, returning the semantic-annotations for the next sentence")
    public static SubLObject get_next_sentence_annotation(final SubLObject iterator) {
        SubLTrampolineFile.enforceType(iterator, ITERATOR_P);
        return iteration.iteration_next(iterator);
    }

    /**
     * Is there anything left to iterate over in iterator?
     */
    @LispMethod(comment = "Is there anything left to iterate over in iterator?")
    public static final SubLObject annotation_completeP_alt(SubLObject iterator) {
        SubLTrampolineFile.checkType(iterator, ITERATOR_P);
        return iteration.iteration_done(iterator);
    }

    /**
     * Is there anything left to iterate over in iterator?
     */
    @LispMethod(comment = "Is there anything left to iterate over in iterator?")
    public static SubLObject annotation_completeP(final SubLObject iterator) {
        SubLTrampolineFile.enforceType(iterator, ITERATOR_P);
        return iteration.iteration_done(iterator);
    }

    public static final SubLObject do_tagged_concepts_results_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt12);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject result = NIL;
                    SubLObject v_document = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    result = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    v_document = current.first();
                    current = current.rest();
                    {
                        SubLObject optional_arg_plist = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt12);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject iter = $sym13$ITER;
                                return list(CLET, list(list(iter, list(TAG_CONCEPTS, v_document, optional_arg_plist))), list(WITH_SBHL_RESOURCED_MARKING_SPACES, SIX_INTEGER, list(WITH_POSSIBLY_NEW_MEMOIZATION_STATE, list(WITH_NEW_CONCEPT_FILTER_MEMOIZATION_STATE, listS(DO_ITERATOR, list(result, iter), append(body, NIL))))));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt12);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_tagged_concepts_results(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject result = NIL;
        SubLObject v_document = NIL;
        destructuring_bind_must_consp(current, datum, $list12);
        result = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        v_document = current.first();
        current = current.rest();
        final SubLObject optional_arg_plist = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list12);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject iter = $sym13$ITER;
            return list(CLET, list(list(iter, list(TAG_CONCEPTS, v_document, optional_arg_plist))), list(WITH_SBHL_RESOURCED_MARKING_SPACES, SIX_INTEGER, list(WITH_POSSIBLY_NEW_MEMOIZATION_STATE, list(WITH_NEW_CONCEPT_FILTER_MEMOIZATION_STATE, listS(DO_ITERATOR, list(result, iter), append(body, NIL))))));
        }
        cdestructuring_bind_error(datum, $list12);
        return NIL;
    }

    /**
     * For any given document, return just the CycL concepts mentioned in the document.  OPTIONAL-ARG-PLIST follows
     * the same conventions as TAG-CONCEPTS, which this function is a wrapper for
     */
    @LispMethod(comment = "For any given document, return just the CycL concepts mentioned in the document.  OPTIONAL-ARG-PLIST follows\r\nthe same conventions as TAG-CONCEPTS, which this function is a wrapper for\nFor any given document, return just the CycL concepts mentioned in the document.  OPTIONAL-ARG-PLIST follows\nthe same conventions as TAG-CONCEPTS, which this function is a wrapper for")
    public static final SubLObject all_tagged_concepts_alt(SubLObject v_document, SubLObject optional_arg_plist) {
        if (optional_arg_plist == UNPROVIDED) {
            optional_arg_plist = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_document, DOCUMENT_P);
            SubLTrampolineFile.checkType(optional_arg_plist, TAG_CONCEPTS_OPTIONAL_ARGS_P);
            {
                SubLObject result = NIL;
                SubLObject iter = tag_concepts(v_document, optional_arg_plist);
                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        {
                            SubLObject state = memoization_state.possibly_new_memoization_state();
                            SubLObject local_state = state;
                            {
                                SubLObject _prev_bind_0_6 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    {
                                        SubLObject original_memoization_process = NIL;
                                        if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                            original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                            {
                                                SubLObject current_proc = current_process();
                                                if (NIL == original_memoization_process) {
                                                    memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                } else {
                                                    if (original_memoization_process != current_proc) {
                                                        Errors.error($str_alt20$Invalid_attempt_to_reuse_memoizat);
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            {
                                                SubLObject _prev_bind_0_7 = concept_filter.$concept_filter_memoization_state$.currentBinding(thread);
                                                try {
                                                    concept_filter.$concept_filter_memoization_state$.bind(memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                                                    {
                                                        SubLObject done_var = NIL;
                                                        while (NIL == done_var) {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject return_value = iteration.iteration_next(iter);
                                                                SubLObject valid = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != valid) {
                                                                    {
                                                                        SubLObject cdolist_list_var = extract_cycl_from_concept_tagger_output(return_value);
                                                                        SubLObject cycl = NIL;
                                                                        for (cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl = cdolist_list_var.first()) {
                                                                            {
                                                                                SubLObject item_var = cycl;
                                                                                if (NIL == member(item_var, result, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                                    result = cons(item_var, result);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                done_var = makeBoolean(NIL == valid);
                                                            }
                                                        } 
                                                    }
                                                } finally {
                                                    concept_filter.$concept_filter_memoization_state$.rebind(_prev_bind_0_7, thread);
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_6, thread);
                                }
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * For any given document, return just the CycL concepts mentioned in the document.  OPTIONAL-ARG-PLIST follows
     * the same conventions as TAG-CONCEPTS, which this function is a wrapper for
     */
    @LispMethod(comment = "For any given document, return just the CycL concepts mentioned in the document.  OPTIONAL-ARG-PLIST follows\r\nthe same conventions as TAG-CONCEPTS, which this function is a wrapper for\nFor any given document, return just the CycL concepts mentioned in the document.  OPTIONAL-ARG-PLIST follows\nthe same conventions as TAG-CONCEPTS, which this function is a wrapper for")
    public static SubLObject all_tagged_concepts(final SubLObject v_document, SubLObject optional_arg_plist) {
        if (optional_arg_plist == UNPROVIDED) {
            optional_arg_plist = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(v_document, DOCUMENT_P);
        SubLTrampolineFile.enforceType(optional_arg_plist, TAG_CONCEPTS_OPTIONAL_ARGS_P);
        SubLObject result = NIL;
        final SubLObject iter = tag_concepts(v_document, optional_arg_plist);
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0_$6 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject _prev_bind_0_$7 = concept_filter.$concept_filter_memoization_state$.currentBinding(thread);
                    try {
                        concept_filter.$concept_filter_memoization_state$.bind(memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        SubLObject valid;
                        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                            thread.resetMultipleValues();
                            final SubLObject return_value = iteration.iteration_next(iter);
                            valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                SubLObject cdolist_list_var = extract_cycl_from_concept_tagger_output(return_value);
                                SubLObject cycl = NIL;
                                cycl = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    final SubLObject item_var = cycl;
                                    if (NIL == member(item_var, result, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        result = cons(item_var, result);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    cycl = cdolist_list_var.first();
                                } 
                            }
                        }
                    } finally {
                        concept_filter.$concept_filter_memoization_state$.rebind(_prev_bind_0_$7, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$6, thread);
            }
        } finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * extracts the CycL terms mentioned in the output of a single return-value of the iterator returned by tag-concepts
     * Currently, that output is a list of words, but it need not stay that way...
     */
    @LispMethod(comment = "extracts the CycL terms mentioned in the output of a single return-value of the iterator returned by tag-concepts\r\nCurrently, that output is a list of words, but it need not stay that way...\nextracts the CycL terms mentioned in the output of a single return-value of the iterator returned by tag-concepts\nCurrently, that output is a list of words, but it need not stay that way...")
    public static final SubLObject extract_cycl_from_concept_tagger_output_alt(SubLObject concept_tagger_output) {
        {
            SubLObject result = NIL;
            SubLObject vector_var = document.sentence_yield(concept_tagger_output);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject word = aref(vector_var, element_num);
                    result = cconcatenate(document.word_cycls(word), result);
                }
            }
            return nreverse(result);
        }
    }

    /**
     * extracts the CycL terms mentioned in the output of a single return-value of the iterator returned by tag-concepts
     * Currently, that output is a list of words, but it need not stay that way...
     */
    @LispMethod(comment = "extracts the CycL terms mentioned in the output of a single return-value of the iterator returned by tag-concepts\r\nCurrently, that output is a list of words, but it need not stay that way...\nextracts the CycL terms mentioned in the output of a single return-value of the iterator returned by tag-concepts\nCurrently, that output is a list of words, but it need not stay that way...")
    public static SubLObject extract_cycl_from_concept_tagger_output(final SubLObject concept_tagger_output) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(concept_tagger_output);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cconcatenate(document.word_cycls(word), result);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    /**
     * a function to produce output specifically designed for use by Cyc's statistical disambiguator.  Not expected to be
     * used any more generally than that.
     */
    @LispMethod(comment = "a function to produce output specifically designed for use by Cyc\'s statistical disambiguator.  Not expected to be\r\nused any more generally than that.\na function to produce output specifically designed for use by Cyc\'s statistical disambiguator.  Not expected to be\nused any more generally than that.")
    public static final SubLObject tagged_concepts_for_disambiguator_alt(SubLObject v_document, SubLObject optional_arg_plist) {
        if (optional_arg_plist == UNPROVIDED) {
            optional_arg_plist = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject output_string = NIL;
                SubLObject s = NIL;
                try {
                    s = make_private_string_output_stream();
                    {
                        SubLObject iter = tag_concepts(v_document, optional_arg_plist);
                        SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                        {
                            SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                            SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                {
                                    SubLObject state = memoization_state.possibly_new_memoization_state();
                                    SubLObject local_state = state;
                                    {
                                        SubLObject _prev_bind_0_9 = memoization_state.$memoization_state$.currentBinding(thread);
                                        try {
                                            memoization_state.$memoization_state$.bind(local_state, thread);
                                            {
                                                SubLObject original_memoization_process = NIL;
                                                if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                                    original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                                    {
                                                        SubLObject current_proc = current_process();
                                                        if (NIL == original_memoization_process) {
                                                            memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                        } else {
                                                            if (original_memoization_process != current_proc) {
                                                                Errors.error($str_alt20$Invalid_attempt_to_reuse_memoizat);
                                                            }
                                                        }
                                                    }
                                                }
                                                try {
                                                    format(s, $str_alt21$d__);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            {
                                                                SubLObject done_var = NIL;
                                                                while (NIL == done_var) {
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject sentence = iteration.iteration_next(iter);
                                                                        SubLObject valid = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != valid) {
                                                                            {
                                                                                SubLObject paragraph = document.sentence_mother(sentence);
                                                                                if (document.paragraph_get(paragraph, ZERO_INTEGER) == sentence) {
                                                                                    format(s, $str_alt22$p__);
                                                                                }
                                                                            }
                                                                            format(s, $str_alt23$s__);
                                                                            {
                                                                                SubLObject vector_var = document.sentence_yield(sentence);
                                                                                SubLObject backwardP_var = NIL;
                                                                                SubLObject length = length(vector_var);
                                                                                SubLObject v_iteration = NIL;
                                                                                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                                                    {
                                                                                        SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                                                        SubLObject word = aref(vector_var, element_num);
                                                                                        format(s, $str_alt24$w_A_A_A_A__A, new SubLObject[]{ CHAR_tab, document.word_string(word), CHAR_tab, document.word_category(word), CHAR_tab });
                                                                                        {
                                                                                            SubLObject cdolist_list_var = document.word_cycls(word);
                                                                                            SubLObject cycl = NIL;
                                                                                            for (cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl = cdolist_list_var.first()) {
                                                                                                format(s, $str_alt25$_A_A, cycl, CHAR_tab);
                                                                                            }
                                                                                        }
                                                                                        format(s, $str_alt26$__);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        done_var = makeBoolean(NIL == valid);
                                                                    }
                                                                } 
                                                            }
                                                            if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_9, thread);
                                        }
                                    }
                                }
                            } finally {
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    output_string = get_output_stream_string(s);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(s, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return output_string;
            }
        }
    }

    /**
     * a function to produce output specifically designed for use by Cyc's statistical disambiguator.  Not expected to be
     * used any more generally than that.
     */
    @LispMethod(comment = "a function to produce output specifically designed for use by Cyc\'s statistical disambiguator.  Not expected to be\r\nused any more generally than that.\na function to produce output specifically designed for use by Cyc\'s statistical disambiguator.  Not expected to be\nused any more generally than that.")
    public static SubLObject tagged_concepts_for_disambiguator(final SubLObject v_document, SubLObject optional_arg_plist) {
        if (optional_arg_plist == UNPROVIDED) {
            optional_arg_plist = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject output_string = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            final SubLObject iter = tag_concepts(v_document, optional_arg_plist);
            final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                final SubLObject local_state;
                final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                final SubLObject _prev_bind_0_$9 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        format(s, $str20$d__);
                        SubLObject valid;
                        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                            thread.resetMultipleValues();
                            final SubLObject sentence = iteration.iteration_next(iter);
                            valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                final SubLObject paragraph = document.sentence_mother(sentence);
                                if (document.paragraph_get(paragraph, ZERO_INTEGER).eql(sentence)) {
                                    format(s, $str21$p__);
                                }
                                format(s, $str22$s__);
                                SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                                SubLObject word = NIL;
                                word = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    format(s, $str23$w_A_A_A_A__A, new SubLObject[]{ CHAR_tab, document.word_string(word), CHAR_tab, document.word_category(word), CHAR_tab });
                                    SubLObject cdolist_list_var_$10 = document.word_cycls(word);
                                    SubLObject cycl = NIL;
                                    cycl = cdolist_list_var_$10.first();
                                    while (NIL != cdolist_list_var_$10) {
                                        format(s, $str24$_A_A, cycl, CHAR_tab);
                                        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                                        cycl = cdolist_list_var_$10.first();
                                    } 
                                    format(s, $str25$__);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    word = cdolist_list_var.first();
                                } 
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                        }
                    }
                } finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$9, thread);
                }
            } finally {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
            }
            output_string = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return output_string;
    }

    /**
     * A simple web-service api into the API function TAG-DOCUMENTS.
     */
    @LispMethod(comment = "A simple web-service api into the API function TAG-DOCUMENTS.")
    public static final SubLObject xml_tag_document_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject doc = get_tagged_document_from_html_args(args);
            return xml_tag_document_int(doc);
        }
    }

    /**
     * A simple web-service api into the API function TAG-DOCUMENTS.
     */
    @LispMethod(comment = "A simple web-service api into the API function TAG-DOCUMENTS.")
    public static SubLObject xml_tag_document(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLObject doc = get_tagged_document_from_html_args(args);
        return xml_tag_document_int(doc);
    }

    public static SubLObject tag_document_xml(final SubLObject text, SubLObject params) {
        if (params == UNPROVIDED) {
            params = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject doc = get_tagged_document_from_params(unicode_nauts.convert_unicode_nauts_to_utf8_strings(text), params);
        SubLObject xml_string = NIL;
        final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
        try {
            html_macros.$html_stream$.bind(NIL, thread);
            try {
                html_macros.$html_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                xml_tag_document_int(doc);
                xml_string = get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
            } finally {
                final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                }
            }
        } finally {
            html_macros.$html_stream$.rebind(_prev_bind_0, thread);
        }
        return xml_string;
    }

    /**
     * A simple web-service api into the API function TAG-DOCUMENTS.
     */
    @LispMethod(comment = "A simple web-service api into the API function TAG-DOCUMENTS.")
    public static final SubLObject xml_tag_document_int_alt(SubLObject doc) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assumed_validP$.currentBinding(thread);
                SubLObject _prev_bind_1 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    lexicon_macros.$nl_trie_assumed_validP$.bind(T, thread);
                    xml_vars.$xml_stream$.bind($html_stream$.getDynamicValue(thread), thread);
                    {
                        SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                        {
                            SubLObject _prev_bind_0_11 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                            SubLObject _prev_bind_1_12 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                {
                                    SubLObject state = memoization_state.possibly_new_memoization_state();
                                    SubLObject local_state = state;
                                    {
                                        SubLObject _prev_bind_0_13 = memoization_state.$memoization_state$.currentBinding(thread);
                                        try {
                                            memoization_state.$memoization_state$.bind(local_state, thread);
                                            {
                                                SubLObject original_memoization_process = NIL;
                                                if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                                    original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                                    {
                                                        SubLObject current_proc = current_process();
                                                        if (NIL == original_memoization_process) {
                                                            memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                        } else {
                                                            if (original_memoization_process != current_proc) {
                                                                Errors.error($str_alt20$Invalid_attempt_to_reuse_memoizat);
                                                            }
                                                        }
                                                    }
                                                }
                                                try {
                                                    {
                                                        SubLObject _prev_bind_0_14 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_15 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$document, NIL, NIL);
                                                            {
                                                                SubLObject vector_var = document.document_paragraphs(doc);
                                                                SubLObject backwardP_var = NIL;
                                                                SubLObject length = length(vector_var);
                                                                SubLObject v_iteration = NIL;
                                                                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                                    {
                                                                        SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                                        SubLObject paragraph = aref(vector_var, element_num);
                                                                        SubLObject vector_var_16 = document.paragraph_sentences(paragraph);
                                                                        SubLObject backwardP_var_17 = NIL;
                                                                        SubLObject length_18 = length(vector_var_16);
                                                                        SubLObject v_iteration_19 = NIL;
                                                                        for (v_iteration_19 = ZERO_INTEGER; v_iteration_19.numL(length_18); v_iteration_19 = add(v_iteration_19, ONE_INTEGER)) {
                                                                            {
                                                                                SubLObject element_num_20 = (NIL != backwardP_var_17) ? ((SubLObject) (subtract(length_18, v_iteration_19, ONE_INTEGER))) : v_iteration_19;
                                                                                SubLObject sentence = aref(vector_var_16, element_num_20);
                                                                                SubLObject paragraph_21 = document.sentence_mother(sentence);
                                                                                {
                                                                                    SubLObject _prev_bind_0_22 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_23 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                    try {
                                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                        xml_utilities.xml_start_tag_internal($$$sentence, NIL, NIL);
                                                                                        {
                                                                                            SubLObject vector_var_24 = document.sentence_yield(sentence);
                                                                                            SubLObject backwardP_var_25 = NIL;
                                                                                            SubLObject length_26 = length(vector_var_24);
                                                                                            SubLObject v_iteration_27 = NIL;
                                                                                            for (v_iteration_27 = ZERO_INTEGER; v_iteration_27.numL(length_26); v_iteration_27 = add(v_iteration_27, ONE_INTEGER)) {
                                                                                                {
                                                                                                    SubLObject element_num_28 = (NIL != backwardP_var_25) ? ((SubLObject) (subtract(length_26, v_iteration_27, ONE_INTEGER))) : v_iteration_27;
                                                                                                    SubLObject word = aref(vector_var_24, element_num_28);
                                                                                                    SubLObject attrs = list($$$string, document.word_string(word));
                                                                                                    attrs = cconcatenate(attrs, list($$$offset, document.word_offset(word)));
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_29 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                        SubLObject _prev_bind_1_30 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                        try {
                                                                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                            xml_utilities.xml_start_tag_internal($$$word, attrs, NIL);
                                                                                                            {
                                                                                                                SubLObject cdolist_list_var = document.word_interps(word);
                                                                                                                SubLObject interp = NIL;
                                                                                                                for (interp = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , interp = cdolist_list_var.first()) {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_31 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                                        SubLObject _prev_bind_1_32 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                                            xml_utilities.xml_start_tag_internal($$$interpretation, list(EMPTY_SUBL_OBJECT_ARRAY), NIL);
                                                                                                                            misc_kb_utilities.serialize_external_xml_tag_for_cycl_term(nl_api_datastructures.get_nl_interp_cycl(interp));
                                                                                                                        } finally {
                                                                                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_32, thread);
                                                                                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_31, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    xml_utilities.xml_terpri();
                                                                                                                    xml_utilities.xml_end_tag_internal($$$interpretation);
                                                                                                                }
                                                                                                            }
                                                                                                        } finally {
                                                                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_30, thread);
                                                                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_29, thread);
                                                                                                        }
                                                                                                    }
                                                                                                    xml_utilities.xml_terpri();
                                                                                                    xml_utilities.xml_end_tag_internal($$$word);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_23, thread);
                                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_22, thread);
                                                                                    }
                                                                                }
                                                                                xml_utilities.xml_terpri();
                                                                                xml_utilities.xml_end_tag_internal($$$sentence);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_15, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_14, thread);
                                                        }
                                                    }
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$document);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_33, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_13, thread);
                                        }
                                    }
                                }
                            } finally {
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_12, thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_11, thread);
                            }
                        }
                    }
                } finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_1, thread);
                    lexicon_macros.$nl_trie_assumed_validP$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * A simple web-service api into the API function TAG-DOCUMENTS.
     */
    @LispMethod(comment = "A simple web-service api into the API function TAG-DOCUMENTS.")
    public static SubLObject xml_tag_document_int(final SubLObject doc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assumed_validP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            lexicon_macros.$nl_trie_assumed_validP$.bind(T, thread);
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            xml_utilities.xml_header(xml_utilities.$xml_version$.getDynamicValue(thread), $str30$utf_8, UNPROVIDED);
            xml_utilities.xml_terpri();
            final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$13 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
            final SubLObject _prev_bind_1_$14 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                final SubLObject local_state;
                final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                final SubLObject _prev_bind_0_$14 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        try {
                            final SubLObject _prev_bind_0_$15 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$15 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$document, list($$$xmlns, $str33$http___ws_opencyc_org_xsd_TextPro), NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$16 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    try {
                                        final SubLObject _prev_bind_0_$17 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$16 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$meta, NIL, NIL, NIL, $UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$18 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                final SubLObject _prev_bind_0_$19 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$17 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$title, NIL, T, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$20 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$20, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$17, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$19, thread);
                                                }
                                                final SubLObject _prev_bind_0_$21 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$18 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$uri, NIL, T, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$22 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$22, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$18, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$21, thread);
                                                }
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$18, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$16, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$17, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            xml_utilities.xml_terpri();
                                            xml_utilities.xml_end_tag_internal($$$meta);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                                        }
                                    }
                                    try {
                                        final SubLObject _prev_bind_0_$24 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$19 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$tagset, NIL, NIL, NIL, $UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$25 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                xml_utilities.xml_terpri();
                                                final SubLObject vector_var = document.document_paragraphs(doc);
                                                final SubLObject backwardP_var = NIL;
                                                SubLObject length;
                                                SubLObject v_iteration;
                                                SubLObject element_num;
                                                SubLObject paragraph;
                                                SubLObject vector_var_$32;
                                                SubLObject backwardP_var_$33;
                                                SubLObject length_$34;
                                                SubLObject v_iteration_$35;
                                                SubLObject element_num_$36;
                                                SubLObject sentence;
                                                SubLObject cdolist_list_var;
                                                SubLObject word;
                                                SubLObject _prev_bind_0_$26;
                                                SubLObject _prev_bind_1_$20;
                                                SubLObject _prev_bind_0_$27;
                                                SubLObject source_attrs;
                                                SubLObject _prev_bind_0_$28;
                                                SubLObject _prev_bind_1_$21;
                                                SubLObject _prev_bind_0_$29;
                                                SubLObject _prev_bind_0_$30;
                                                SubLObject _values2;
                                                SubLObject cdolist_list_var_$44;
                                                SubLObject interp;
                                                SubLObject _prev_bind_0_$31;
                                                SubLObject _values3;
                                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                                    paragraph = aref(vector_var, element_num);
                                                    vector_var_$32 = document.paragraph_sentences(paragraph);
                                                    backwardP_var_$33 = NIL;
                                                    for (length_$34 = length(vector_var_$32), v_iteration_$35 = NIL, v_iteration_$35 = ZERO_INTEGER; v_iteration_$35.numL(length_$34); v_iteration_$35 = add(v_iteration_$35, ONE_INTEGER)) {
                                                        element_num_$36 = (NIL != backwardP_var_$33) ? subtract(length_$34, v_iteration_$35, ONE_INTEGER) : v_iteration_$35;
                                                        sentence = aref(vector_var_$32, element_num_$36);
                                                        cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                                                        word = NIL;
                                                        word = cdolist_list_var.first();
                                                        while (NIL != cdolist_list_var) {
                                                            try {
                                                                _prev_bind_0_$26 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                _prev_bind_1_$20 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($$$element, NIL, NIL, NIL, $UNINITIALIZED);
                                                                    _prev_bind_0_$27 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                        xml_utilities.xml_terpri();
                                                                        source_attrs = list($$$start, document.word_offset(word));
                                                                        try {
                                                                            _prev_bind_0_$28 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                            _prev_bind_1_$21 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                            try {
                                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                xml_utilities.xml_start_tag_internal($$$source, source_attrs, NIL, NIL, $UNINITIALIZED);
                                                                                _prev_bind_0_$29 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                try {
                                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str42$___CDATA__A___, document.word_string(word));
                                                                                } finally {
                                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$29, thread);
                                                                                }
                                                                            } finally {
                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$21, thread);
                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$28, thread);
                                                                            }
                                                                        } finally {
                                                                            _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                _values2 = getValuesAsVector();
                                                                                xml_utilities.xml_end_tag_internal($$$source);
                                                                                restoreValuesFromVector(_values2);
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                                                                            }
                                                                        }
                                                                        xml_utilities.xml_terpri();
                                                                        cdolist_list_var_$44 = document.word_interps(word);
                                                                        interp = NIL;
                                                                        interp = cdolist_list_var_$44.first();
                                                                        while (NIL != cdolist_list_var_$44) {
                                                                            serialize_xml_sense_tag_for_cycl_term(nl_api_datastructures.get_nl_interp_cycl(interp));
                                                                            cdolist_list_var_$44 = cdolist_list_var_$44.rest();
                                                                            interp = cdolist_list_var_$44.first();
                                                                        } 
                                                                    } finally {
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$27, thread);
                                                                    }
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$20, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$26, thread);
                                                                }
                                                            } finally {
                                                                _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    _values3 = getValuesAsVector();
                                                                    xml_utilities.xml_terpri();
                                                                    xml_utilities.xml_end_tag_internal($$$element);
                                                                    restoreValuesFromVector(_values3);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                                                                }
                                                            }
                                                            xml_utilities.xml_terpri();
                                                            cdolist_list_var = cdolist_list_var.rest();
                                                            word = cdolist_list_var.first();
                                                        } 
                                                    }
                                                }
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$25, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$19, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$24, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values4 = getValuesAsVector();
                                            xml_utilities.xml_terpri();
                                            xml_utilities.xml_end_tag_internal($$$tagset);
                                            restoreValuesFromVector(_values4);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                                        }
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$16, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$15, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$15, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values5 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$document);
                                restoreValuesFromVector(_values5);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values6 = getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            restoreValuesFromVector(_values6);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                        }
                    }
                } finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$14, thread);
                }
            } finally {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$14, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$13, thread);
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_2, thread);
            lexicon_macros.$nl_trie_assumed_validP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject serialize_xml_sense_tag_for_cycl_term(final SubLObject cycl_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ids = misc_kb_utilities.get_cyc_term_external_identifiers(cycl_term);
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$sense, list($str45$xmlns_concepts, $str46$http___ws_opencyc_org_xsd_CycConc), NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$49 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    xml_utilities.xml_terpri();
                    try {
                        final SubLObject _prev_bind_0_$50 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$51 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$concept, list($$$uri, owl_cycl_to_xml.owl_opencyc_latest_uri_for_term(cycl_term)), NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$51 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                xml_utilities.xml_terpri();
                                try {
                                    final SubLObject _prev_bind_0_$52 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$52 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($str48$concepts_externalId, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$53 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            xml_utilities.xml_write_wXescaped_special_chars(kb_utilities.compact_hl_external_id_string(cycl_term));
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$53, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$52, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$52, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$54 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        xml_utilities.xml_end_tag_internal($str48$concepts_externalId);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$54, thread);
                                    }
                                }
                                xml_utilities.xml_terpri();
                                try {
                                    final SubLObject _prev_bind_0_$55 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$53 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($str49$concepts_preferredNl, list($str50$xml_lang, $$$en), NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$56 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            xml_utilities.xml_write_wXescaped_special_chars(unicode_nauts.convert_unicode_nauts_to_utf8_strings(third(ids)));
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$56, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$53, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$55, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$57 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        xml_utilities.xml_end_tag_internal($str49$concepts_preferredNl);
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                                    }
                                }
                                xml_utilities.xml_terpri();
                                try {
                                    final SubLObject _prev_bind_0_$58 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$54 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($str52$concepts_cycl, list($str50$xml_lang, $$$en), NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$59 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            xml_utilities.xml_cdata(prin1_to_string(ids.first()));
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$59, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$54, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$58, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$60 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        xml_utilities.xml_end_tag_internal($str52$concepts_cycl);
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                                    }
                                }
                                xml_utilities.xml_terpri();
                                final SubLObject concept_type = (NIL != fort_types_interface.predicate_p(cycl_term)) ? $$$Predicate : NIL != fort_types_interface.collection_p(cycl_term) ? $$$Collection : $$$Individual;
                                final SubLObject _prev_bind_0_$61 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$55 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($str56$concepts_conceptType, list($$$type, concept_type), T, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$62 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$62, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$55, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$61, thread);
                                }
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$51, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$51, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$50, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$63 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values4 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$concept);
                            restoreValuesFromVector(_values4);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$63, thread);
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$49, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values5 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$sense);
                restoreValuesFromVector(_values5);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        xml_utilities.xml_terpri();
        return NIL;
    }

    public static final SubLObject html_tag_document_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup($html_html_head$.getGlobalValue());
            html_markup($html_head_head$.getGlobalValue());
            html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup($html_title_head$.getGlobalValue());
            html_princ($str_alt37$);
            html_markup($html_title_tail$.getGlobalValue());
            html_markup($html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            {
                SubLObject color_value = $html_default_bgcolor$.getDynamicValue(thread);
                {
                    SubLObject _prev_bind_0 = $html_inside_bodyP$.currentBinding(thread);
                    try {
                        $html_inside_bodyP$.bind(T, thread);
                        html_markup($html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_markup($html_body_bgcolor$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_color(color_value));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_34 = $html_safe_print$.currentBinding(thread);
                            try {
                                $html_safe_print$.bind(T, thread);
                                html_markup($html_heading_head$.getGlobalValue());
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                html_princ($str_alt37$);
                                html_markup($html_heading_tail$.getGlobalValue());
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup($html_style_head$.getGlobalValue());
                                html_princ($doc_tagger_default_style$.getDynamicValue(thread));
                                html_markup($html_style_tail$.getGlobalValue());
                                html_tag_document_int(args);
                                if (MAYBE_HTML_EXTRACT_FROM_DOCUMENT.isFunctionSpec()) {
                                    funcall(MAYBE_HTML_EXTRACT_FROM_DOCUMENT, args);
                                }
                                html_source_readability_terpri(UNPROVIDED);
                                html_copyright_notice();
                            } finally {
                                $html_safe_print$.rebind(_prev_bind_0_34, thread);
                            }
                        }
                        html_markup($html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        $html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            html_markup($html_html_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static SubLObject html_tag_document(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str59$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str60$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($str61$);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$69 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (NIL != color_value) {
                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color_value));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_princ($str61$);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_style_head$.getGlobalValue());
                    html_princ($doc_tagger_default_style$.getDynamicValue(thread));
                    html_markup(html_macros.$html_style_tail$.getGlobalValue());
                    html_tag_document_int(args);
                    if (MAYBE_HTML_EXTRACT_FROM_DOCUMENT.isFunctionSpec()) {
                        funcall(MAYBE_HTML_EXTRACT_FROM_DOCUMENT, args);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$69, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject html_tag_document_int_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject doc = get_tagged_document_from_html_args(args);
            return html_display_tagger_result(doc);
        }
    }

    public static SubLObject html_tag_document_int(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLObject doc = get_tagged_document_from_html_args(args);
        return html_display_tagger_result(doc);
    }

    public static final SubLObject html_display_tagger_result_alt(SubLObject doc) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assumed_validP$.currentBinding(thread);
                SubLObject _prev_bind_1 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    lexicon_macros.$nl_trie_assumed_validP$.bind(T, thread);
                    xml_vars.$xml_stream$.bind($html_stream$.getDynamicValue(thread), thread);
                    {
                        SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                        {
                            SubLObject _prev_bind_0_35 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                            SubLObject _prev_bind_1_36 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                {
                                    SubLObject state = memoization_state.possibly_new_memoization_state();
                                    SubLObject local_state = state;
                                    {
                                        SubLObject _prev_bind_0_37 = memoization_state.$memoization_state$.currentBinding(thread);
                                        try {
                                            memoization_state.$memoization_state$.bind(local_state, thread);
                                            {
                                                SubLObject original_memoization_process = NIL;
                                                if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                                    original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                                    {
                                                        SubLObject current_proc = current_process();
                                                        if (NIL == original_memoization_process) {
                                                            memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                        } else {
                                                            if (original_memoization_process != current_proc) {
                                                                Errors.error($str_alt20$Invalid_attempt_to_reuse_memoizat);
                                                            }
                                                        }
                                                    }
                                                }
                                                try {
                                                    {
                                                        SubLObject vector_var = document.document_paragraphs(doc);
                                                        SubLObject backwardP_var = NIL;
                                                        SubLObject length = length(vector_var);
                                                        SubLObject v_iteration = NIL;
                                                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                            {
                                                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                                SubLObject para = aref(vector_var, element_num);
                                                                html_terpri(UNPROVIDED);
                                                                html_markup($html_paragraph_head$.getGlobalValue());
                                                                html_markup($html_paragraph_tail$.getGlobalValue());
                                                                {
                                                                    SubLObject vector_var_38 = document.paragraph_sentences(para);
                                                                    SubLObject backwardP_var_39 = NIL;
                                                                    SubLObject length_40 = length(vector_var_38);
                                                                    SubLObject v_iteration_41 = NIL;
                                                                    for (v_iteration_41 = ZERO_INTEGER; v_iteration_41.numL(length_40); v_iteration_41 = add(v_iteration_41, ONE_INTEGER)) {
                                                                        {
                                                                            SubLObject element_num_42 = (NIL != backwardP_var_39) ? ((SubLObject) (subtract(length_40, v_iteration_41, ONE_INTEGER))) : v_iteration_41;
                                                                            SubLObject sentence = aref(vector_var_38, element_num_42);
                                                                            SubLObject vector_var_43 = document.sentence_yield(sentence);
                                                                            SubLObject backwardP_var_44 = NIL;
                                                                            SubLObject length_45 = length(vector_var_43);
                                                                            SubLObject v_iteration_46 = NIL;
                                                                            for (v_iteration_46 = ZERO_INTEGER; v_iteration_46.numL(length_45); v_iteration_46 = add(v_iteration_46, ONE_INTEGER)) {
                                                                                {
                                                                                    SubLObject element_num_47 = (NIL != backwardP_var_44) ? ((SubLObject) (subtract(length_45, v_iteration_46, ONE_INTEGER))) : v_iteration_46;
                                                                                    SubLObject word = aref(vector_var_43, element_num_47);
                                                                                    format($html_stream$.getDynamicValue(thread), $str_alt41$_A, document.word_string(word));
                                                                                    if (NIL != document.word_cycls(word)) {
                                                                                        html_princ($str_alt42$__);
                                                                                        {
                                                                                            SubLObject list_var = NIL;
                                                                                            SubLObject interp = NIL;
                                                                                            SubLObject interp_num = NIL;
                                                                                            for (list_var = remove_duplicates(Sort.sort(copy_list(document.word_interps(word)), $sym43$WEIGHT_, GET_NL_INTERP_WEIGHT), EQUAL, GET_NL_INTERP_CYCL, UNPROVIDED, UNPROVIDED), interp = list_var.first(), interp_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , interp = list_var.first() , interp_num = add(ONE_INTEGER, interp_num)) {
                                                                                                if (interp_num != ZERO_INTEGER) {
                                                                                                    html_princ($str_alt46$_);
                                                                                                }
                                                                                                html_markup($html_span_head$.getGlobalValue());
                                                                                                if (true) {
                                                                                                    html_markup($html_attribute_class$.getGlobalValue());
                                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                                    html_markup($$$cycl);
                                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                                }
                                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_48 = $html_safe_print$.currentBinding(thread);
                                                                                                    try {
                                                                                                        $html_safe_print$.bind(T, thread);
                                                                                                        format($html_stream$.getDynamicValue(thread), $str_alt48$_S, cycl_utilities.hl_to_el(nl_api_datastructures.get_nl_interp_cycl(interp)));
                                                                                                    } finally {
                                                                                                        $html_safe_print$.rebind(_prev_bind_0_48, thread);
                                                                                                    }
                                                                                                }
                                                                                                html_markup($html_span_tail$.getGlobalValue());
                                                                                                if (NIL != nl_api_datastructures.get_nl_interp_weight(interp)) {
                                                                                                    html_markup($html_span_head$.getGlobalValue());
                                                                                                    if (true) {
                                                                                                        html_markup($html_attribute_class$.getGlobalValue());
                                                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                                                        html_markup($$$weight);
                                                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                                                    }
                                                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_49 = $html_safe_print$.currentBinding(thread);
                                                                                                        try {
                                                                                                            $html_safe_print$.bind(T, thread);
                                                                                                            format($html_stream$.getDynamicValue(thread), $str_alt50$__A, nl_api_datastructures.get_nl_interp_weight(interp));
                                                                                                        } finally {
                                                                                                            $html_safe_print$.rebind(_prev_bind_0_49, thread);
                                                                                                        }
                                                                                                    }
                                                                                                    html_markup($html_span_tail$.getGlobalValue());
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        html_princ($str_alt51$_);
                                                                                    }
                                                                                    if (NIL == document.no_space_before_following_wordP(word)) {
                                                                                        html_princ($str_alt46$_);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_50 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_50, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_37, thread);
                                        }
                                    }
                                }
                            } finally {
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_36, thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_35, thread);
                            }
                        }
                    }
                } finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_1, thread);
                    lexicon_macros.$nl_trie_assumed_validP$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject html_display_tagger_result(final SubLObject doc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assumed_validP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            lexicon_macros.$nl_trie_assumed_validP$.bind(T, thread);
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$71 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
            final SubLObject _prev_bind_1_$72 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                final SubLObject local_state;
                final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                final SubLObject _prev_bind_0_$72 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        final SubLObject vector_var = document.document_paragraphs(doc);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject element_num;
                        SubLObject para;
                        SubLObject vector_var_$74;
                        SubLObject backwardP_var_$75;
                        SubLObject length_$76;
                        SubLObject v_iteration_$77;
                        SubLObject element_num_$78;
                        SubLObject sentence;
                        SubLObject cdolist_list_var;
                        SubLObject word;
                        SubLObject list_var;
                        SubLObject interp;
                        SubLObject interp_num;
                        SubLObject _prev_bind_0_$73;
                        SubLObject _prev_bind_0_$74;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            para = aref(vector_var, element_num);
                            html_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                            html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                            vector_var_$74 = document.paragraph_sentences(para);
                            backwardP_var_$75 = NIL;
                            for (length_$76 = length(vector_var_$74), v_iteration_$77 = NIL, v_iteration_$77 = ZERO_INTEGER; v_iteration_$77.numL(length_$76); v_iteration_$77 = add(v_iteration_$77, ONE_INTEGER)) {
                                element_num_$78 = (NIL != backwardP_var_$75) ? subtract(length_$76, v_iteration_$77, ONE_INTEGER) : v_iteration_$77;
                                sentence = aref(vector_var_$74, element_num_$78);
                                cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                                word = NIL;
                                word = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str66$_A, document.word_string(word));
                                    if (NIL != document.word_cycls(word)) {
                                        html_princ($str67$__);
                                        list_var = NIL;
                                        interp = NIL;
                                        interp_num = NIL;
                                        list_var = remove_duplicates(Sort.sort(copy_list(document.word_interps(word)), $sym68$WEIGHT_, GET_NL_INTERP_WEIGHT), EQUAL, GET_NL_INTERP_CYCL, UNPROVIDED, UNPROVIDED);
                                        interp = list_var.first();
                                        for (interp_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , interp = list_var.first() , interp_num = add(ONE_INTEGER, interp_num)) {
                                            if (!interp_num.eql(ZERO_INTEGER)) {
                                                html_princ($$$_);
                                            }
                                            html_markup(html_macros.$html_span_head$.getGlobalValue());
                                            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup($$$cycl);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str73$_S, cycl_utilities.hl_to_el(nl_api_datastructures.get_nl_interp_cycl(interp)));
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
                                            }
                                            html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                            if (NIL != nl_api_datastructures.get_nl_interp_weight(interp)) {
                                                html_markup(html_macros.$html_span_head$.getGlobalValue());
                                                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup($$$weight);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_char(CHAR_greater, UNPROVIDED);
                                                _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str75$__A, nl_api_datastructures.get_nl_interp_weight(interp));
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                                                }
                                                html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                            }
                                        }
                                        html_princ($str76$_);
                                    }
                                    if (NIL == document.no_space_before_following_wordP(word)) {
                                        html_princ($$$_);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    word = cdolist_list_var.first();
                                } 
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$75 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$75, thread);
                        }
                    }
                } finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$72, thread);
                }
            } finally {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$72, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$71, thread);
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_2, thread);
            lexicon_macros.$nl_trie_assumed_validP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject get_concept_filter_from_html_args_alt(SubLObject args) {
        {
            SubLObject filter_id = html_extract_input($str_alt52$filter_id, args);
            SubLObject filter = NIL;
            SubLObject filter_item = find(filter_id, $html_concept_filters$.getGlobalValue(), EQUALP, FIRST, UNPROVIDED, UNPROVIDED);
            if (NIL != filter_item) {
                filter = third(filter_item);
            }
            return filter;
        }
    }

    public static SubLObject get_concept_filter_from_html_args(final SubLObject args) {
        final SubLObject filter_id = html_extract_input($str77$filter_id, args);
        SubLObject filter = $list78;
        final SubLObject filter_item = find(filter_id, $html_concept_filters$.getGlobalValue(), EQUALP, FIRST, UNPROVIDED, UNPROVIDED);
        if (NIL != filter_item) {
            filter = third(filter_item);
        }
        return filter;
    }

    public static final SubLObject clear_browser_tagging_lexicons_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($browser_tagging_lexicons$.getDynamicValue(thread)));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject lexicon = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        methods.funcall_instance_method_with_0_args(lexicon, ISOLATE);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            $browser_tagging_lexicons$.setDynamicValue(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            return $browser_tagging_lexicons$.getDynamicValue(thread);
        }
    }

    public static SubLObject clear_browser_tagging_lexicons() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($browser_tagging_lexicons$.getDynamicValue(thread))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject lexicon = thread.secondMultipleValue();
            thread.resetMultipleValues();
            methods.funcall_instance_method_with_0_args(lexicon, ISOLATE);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        $browser_tagging_lexicons$.setDynamicValue(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
        return $browser_tagging_lexicons$.getDynamicValue(thread);
    }

    public static final SubLObject get_browser_tagging_lexicon(SubLObject ner, SubLObject filter_specs) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lex_dictionary_key = list(ner, filter_specs);
                SubLObject lexicon = dictionary.dictionary_lookup($browser_tagging_lexicons$.getDynamicValue(thread), lex_dictionary_key, UNPROVIDED);
                if (NIL == lexicon) {
                    lexicon = make_default_concept_tagger_lexicon();
                    methods.funcall_instance_method_with_1_args(lexicon, SET_LEARNERS, NIL != ner ? ((SubLObject) (list(STANFORD_NER_LEARN))) : NIL);
                    {
                        SubLObject cdolist_list_var = filter_specs;
                        SubLObject filter_spec = NIL;
                        for (filter_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , filter_spec = cdolist_list_var.first()) {
                            methods.funcall_instance_method_with_1_args(lexicon, ADD_CONCEPT_FILTER_SPEC, filter_spec);
                        }
                    }
                    methods.funcall_instance_method_with_0_args(lexicon, IGNORE_CACHE);
                    dictionary.dictionary_enter($browser_tagging_lexicons$.getDynamicValue(thread), lex_dictionary_key, lexicon);
                }
                return lexicon;
            }
        }
    }

    public static SubLObject get_browser_tagging_lexicon(final SubLObject ner, final SubLObject filter_specs, SubLObject case_sensitivity, SubLObject lexical_mt) {
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = $PREFERRED;
        }
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lex_dictionary_key = list(ner, filter_specs, case_sensitivity, lexical_mt);
        SubLObject lexicon = dictionary.dictionary_lookup($browser_tagging_lexicons$.getDynamicValue(thread), lex_dictionary_key, UNPROVIDED);
        if (NIL == lexicon) {
            lexicon = make_default_concept_tagger_lexicon();
            methods.funcall_instance_method_with_1_args(lexicon, SET_LEARNERS, NIL != ner ? list(STANFORD_NER_LEARN) : NIL);
            methods.funcall_instance_method_with_1_args(lexicon, ADD_LEARNER, NUMBER_LEARN);
            methods.funcall_instance_method_with_1_args(lexicon, SET_CASE_SENSITIVITY, case_sensitivity);
            SubLObject cdolist_list_var = filter_specs;
            SubLObject filter_spec = NIL;
            filter_spec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                methods.funcall_instance_method_with_1_args(lexicon, ADD_CONCEPT_FILTER_SPEC, filter_spec);
                cdolist_list_var = cdolist_list_var.rest();
                filter_spec = cdolist_list_var.first();
            } 
            methods.funcall_instance_method_with_0_args(lexicon, IGNORE_CACHE);
            if (NIL != lexical_mt) {
                methods.funcall_instance_method_with_1_args(lexicon, SET_BASE_MT, lexical_mt);
            }
            dictionary.dictionary_enter($browser_tagging_lexicons$.getDynamicValue(thread), lex_dictionary_key, lexicon);
        }
        return lexicon;
    }

    public static SubLObject get_tagged_document_from_params(final SubLObject text, final SubLObject params) {
        return get_tagged_document(text, getf(params, $USE_NER, $$$NIL), getf(params, $EXHAUSTIVE_TAGGING, T), getf(params, $IGNORE_POS_TAGGER, UNPROVIDED), getf(params, $SENTENCIFY, UNPROVIDED), getf(params, $LEXICAL_MT, UNPROVIDED), getf(params, $CASE_SENSITIVITY, $OFF), list(get_lexical_strength_disambiguator(params)), getf(params, $CONCEPT_FILTER, $list100), getf(params, $ANNOTATE_SPECS, UNPROVIDED), getf(params, $ANNOTATE_INSTANCES, UNPROVIDED));
    }

    public static SubLObject get_lexical_strength_disambiguator(final SubLObject params) {
        final SubLObject lexical_strength_value = getf(params, $MIN_LEXICAL_STRENGTH, UNPROVIDED);
        if (NIL != subl_promotions.memberP(lexical_strength_value, $list104, UNPROVIDED, UNPROVIDED)) {
            return document_disambiguation.new_simple_disambiguator($const105$ContextuallyDependentLexicalMappi);
        }
        if (NIL != subl_promotions.memberP(lexical_strength_value, $list106, UNPROVIDED, UNPROVIDED)) {
            return document_disambiguation.new_simple_disambiguator($$PrimaryLexicalMapping);
        }
        if (lexical_strength_value.equal($VANISHINGLY_RARE)) {
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject get_tagged_document_from_html_args_alt(SubLObject args) {
        {
            SubLObject doc_string = html_extract_input($str_alt59$doc_string, args);
            SubLObject nerP = html_extract_input($str_alt60$use_ner, args);
            SubLObject rdisambiguateP = html_extract_input($str_alt61$use_rdisambiguate, args);
            SubLObject filter = get_concept_filter_from_html_args(args);
            SubLObject lexicon = get_browser_tagging_lexicon(nerP, list(filter));
            SubLObject v_document = document_annotation_widgets.new_tagged_document(doc_string, lexicon, UNPROVIDED);
            if (NIL != rdisambiguateP) {
                rule_disambiguation.rdis_disambiguate(rule_disambiguation.new_rule_disambiguator(UNPROVIDED, UNPROVIDED), v_document, UNPROVIDED);
            }
            return v_document;
        }
    }

    public static SubLObject get_tagged_document_from_html_args(final SubLObject args) {
        final SubLObject doc_string = html_extract_input($$$inputText, args);
        final SubLObject nerP = html_extract_input($str110$use_ner, args);
        final SubLObject exhaustive_tagging = html_extract_sexpr($str111$exhaustive_tagging, args, UNPROVIDED);
        final SubLObject ignore_pos_tagger = html_extract_sexpr($str112$ignore_pos_tagger, args, UNPROVIDED);
        final SubLObject sentencifyP = html_extract_sexpr($$$sentencify, args, NIL);
        final SubLObject lexical_mt = html_extract_cyclified_sexpr($$$lexicalMt, args, NIL);
        final SubLObject case_sensitivity = get_case_sensitivity_value(args);
        final SubLObject disambiguators = get_disambiguators_from_html_args(args);
        final SubLObject filters = list(get_concept_filter_from_html_args(args));
        final SubLObject specs_filter_terms = get_specs_filter_terms_from_html_args(args);
        final SubLObject instance_filter_terms = get_instance_filter_terms_from_html_args(args);
        return get_tagged_document(doc_string, nerP, exhaustive_tagging, ignore_pos_tagger, sentencifyP, lexical_mt, case_sensitivity, disambiguators, filters, specs_filter_terms, instance_filter_terms);
    }

    public static SubLObject get_tagged_document(final SubLObject text, final SubLObject nerP, final SubLObject exhaustive_taggingP, final SubLObject ignore_pos_taggerP, final SubLObject sentencifyP, final SubLObject lexical_mt, final SubLObject case_sensitivity, final SubLObject disambiguators, final SubLObject filters, final SubLObject spec_filter_terms, final SubLObject instance_filter_terms) {
        final SubLObject specs_filters = Mapping.mapcar(NEW_ADHOC_GENLS_CONCEPT_FILTER_SPEC, spec_filter_terms);
        final SubLObject instance_filters = Mapping.mapcar(NEW_ADHOC_ISA_CONCEPT_FILTER_SPEC, instance_filter_terms);
        final SubLObject lexicon = get_browser_tagging_lexicon(nerP, append(filters, specs_filters, instance_filters, NIL), case_sensitivity, lexical_mt);
        final SubLObject tagger = ((NIL != ignore_pos_taggerP) && (NIL != exhaustive_taggingP)) ? EXHAUSTIVE_CONCEPT_TAGGER : NIL != ignore_pos_taggerP ? SIMPLE_CONCEPT_TAGGER : NIL != exhaustive_taggingP ? POS_TAGGING_EXHAUSTIVE_CONCEPT_TAGGER : POS_TAGGING_CONCEPT_TAGGER;
        final SubLObject v_document = document_annotation_widgets.new_tagged_document(text, lexicon, NIL, tagger, sentencifyP);
        SubLObject cdolist_list_var = disambiguators;
        SubLObject disambiguator = NIL;
        disambiguator = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            document_disambiguation.document_disambiguate(disambiguator, v_document, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            disambiguator = cdolist_list_var.first();
        } 
        return v_document;
    }

    public static SubLObject get_disambiguators_from_html_args(final SubLObject args) {
        final SubLObject disambiguate_value = html_extract_input($$$disambiguate, args);
        final SubLObject lexical_strength_value = html_extract_input($$$lexicalStrength, args);
        SubLObject disambiguators = NIL;
        if (NIL != subl_promotions.memberP(disambiguate_value, $list123, UNPROVIDED, UNPROVIDED)) {
            disambiguators = cons(rule_disambiguation.new_rule_disambiguator(UNPROVIDED, UNPROVIDED), disambiguators);
        }
        if (NIL != subl_promotions.memberP(lexical_strength_value, $list124, symbol_function(EQUALP), UNPROVIDED)) {
            disambiguators = cons(document_disambiguation.new_simple_disambiguator($const105$ContextuallyDependentLexicalMappi), disambiguators);
        } else
            if (NIL != subl_promotions.memberP(lexical_strength_value, $list125, symbol_function(EQUALP), UNPROVIDED)) {
                disambiguators = cons(document_disambiguation.new_simple_disambiguator($$PrimaryLexicalMapping), disambiguators);
            } else
                if (lexical_strength_value.equalp($str126$vanishingly_rare)) {
                }


        return disambiguators;
    }

    public static SubLObject get_specs_filters_from_html_args(final SubLObject args) {
        final SubLObject coll_strings = html_extract_input_values($$$allowSpecs, args);
        final SubLObject colls = Mapping.mapcan(READ_MULTIPLE_TERMS_FROM_STRING, coll_strings, EMPTY_SUBL_OBJECT_ARRAY);
        final SubLObject filters = Mapping.mapcar(NEW_ADHOC_GENLS_CONCEPT_FILTER_SPEC, colls);
        return filters;
    }

    public static SubLObject get_instance_filters_from_html_args(final SubLObject args) {
        final SubLObject coll_strings = html_extract_input_values($$$allowInstances, args);
        final SubLObject colls = Mapping.mapcar(CB_GUESS_TERM, coll_strings);
        final SubLObject filters = Mapping.mapcar(NEW_ADHOC_ISA_CONCEPT_FILTER_SPEC, colls);
        return filters;
    }

    public static SubLObject get_specs_filter_terms_from_html_args(final SubLObject args) {
        final SubLObject coll_strings = html_extract_input_values($$$allowSpecs, args);
        final SubLObject colls = Mapping.mapcan(READ_MULTIPLE_TERMS_FROM_STRING, coll_strings, EMPTY_SUBL_OBJECT_ARRAY);
        return colls;
    }

    public static SubLObject get_instance_filter_terms_from_html_args(final SubLObject args) {
        final SubLObject coll_strings = html_extract_input_values($$$allowInstances, args);
        final SubLObject colls = Mapping.mapcar(CB_GUESS_TERM, coll_strings);
        return colls;
    }

    public static SubLObject get_case_sensitivity_value(final SubLObject args) {
        SubLObject raw_value = html_extract_input($$$caseSensitivity, args);
        if (NIL == raw_value) {
            raw_value = $$$preferred;
        }
        if (NIL != subl_promotions.memberP(raw_value, $list133, symbol_function(EQUALP), UNPROVIDED)) {
            return $ON;
        }
        if (NIL != subl_promotions.memberP(raw_value, $list135, symbol_function(EQUALP), UNPROVIDED)) {
            return $OFF;
        }
        if (NIL != subl_promotions.memberP(raw_value, $list136, symbol_function(EQUALP), UNPROVIDED)) {
            return $PREFERRED;
        }
        Errors.error($str137$Invalid_argument_for_case_sensiti, raw_value);
        return NIL;
    }

    public static SubLObject get_rdf_tagging_lexicon() {
        return get_browser_tagging_lexicon(T, NIL, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_rdf_tagged_document(final SubLObject string, SubLObject lexicon, SubLObject disambiguateP) {
        if (lexicon == UNPROVIDED) {
            lexicon = get_rdf_tagging_lexicon();
        }
        if (disambiguateP == UNPROVIDED) {
            disambiguateP = T;
        }
        final SubLObject doc = document_annotation_widgets.new_tagged_document(string, lexicon, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != disambiguateP) {
            rule_disambiguation.rdis_disambiguate(rule_disambiguation.new_rule_disambiguator(UNPROVIDED, UNPROVIDED), doc, UNPROVIDED);
        }
        return doc;
    }

    public static final SubLObject weightG_alt(SubLObject x, SubLObject y) {
        if (x.isNumber() && y.isNumber()) {
            return numG(x, y);
        } else {
            if (x.isNumber()) {
                return T;
            } else {
                if (y.isNumber()) {
                    return NIL;
                } else {
                    return T;
                }
            }
        }
    }

    public static SubLObject weightG(final SubLObject x, final SubLObject y) {
        if (x.isNumber() && y.isNumber()) {
            return numG(x, y);
        }
        if (x.isNumber()) {
            return T;
        }
        if (y.isNumber()) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject allow_document_tagger_restricted_web_service_alt() {
        html_kernel.initialize_http_restricted_functions();
        html_kernel.http_allow_function(CB_TAG_DOCUMENT_HANDLER);
        html_kernel.http_allow_function(CB_XML_TAG_DOCUMENT);
        return NIL;
    }

    public static SubLObject allow_document_tagger_restricted_web_service() {
        html_kernel.initialize_http_restricted_functions();
        html_kernel.http_allow_function(CB_TAG_DOCUMENT_HANDLER);
        html_kernel.http_allow_function(CB_XML_TAG_DOCUMENT);
        return NIL;
    }

    public static final SubLObject cb_tag_document_handler_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject xml = html_extract_input($cb_tag_document_to_xml$.getGlobalValue(), args);
                SubLObject html = html_extract_input($cb_tag_document_to_html$.getGlobalValue(), args);
                SubLObject ret_value = NIL;
                {
                    SubLObject _prev_bind_0 = $read_eval$.currentBinding(thread);
                    try {
                        $read_eval$.bind(NIL, thread);
                        if (NIL != xml) {
                            ret_value = xml_tag_document(args);
                        } else {
                            if (NIL != html) {
                                ret_value = html_tag_document(args);
                            }
                        }
                    } finally {
                        $read_eval$.rebind(_prev_bind_0, thread);
                    }
                }
                return ret_value;
            }
        }
    }

    public static SubLObject cb_tag_document_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject xml = html_extract_input($cb_tag_document_to_xml$.getGlobalValue(), args);
        final SubLObject html = html_extract_input($cb_tag_document_to_html$.getGlobalValue(), args);
        SubLObject ret_value = NIL;
        final SubLObject _prev_bind_0 = $read_eval$.currentBinding(thread);
        try {
            $read_eval$.bind(NIL, thread);
            if (NIL != xml) {
                ret_value = xml_tag_document(args);
            } else
                if (NIL != html) {
                    ret_value = html_tag_document(args);
                }

        } finally {
            $read_eval$.rebind(_prev_bind_0, thread);
        }
        return ret_value;
    }

    public static final SubLObject cb_xml_tag_document_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $$$Concept_Tagger_Web_Service;
                {
                    SubLObject _prev_bind_0 = $html_id_space_id_generator$.currentBinding(thread);
                    try {
                        $html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p($html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) ($html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_markup($html_html_head$.getGlobalValue());
                        html_markup($html_head_head$.getGlobalValue());
                        html_head_content_type();
                        cb_head_shortcut_icon();
                        html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup($html_title_head$.getGlobalValue());
                            html_princ(title_var);
                            html_markup($html_title_tail$.getGlobalValue());
                        }
                        html_markup($html_head_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_51 = $html_inside_bodyP$.currentBinding(thread);
                            try {
                                $html_inside_bodyP$.bind(T, thread);
                                html_markup($html_body_head$.getGlobalValue());
                                if (NIL != $html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_markup($html_body_bgcolor$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color($html_default_bgcolor$.getDynamicValue(thread)));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup($html_body_class$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($str_alt68$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_52 = $html_safe_print$.currentBinding(thread);
                                    try {
                                        $html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_markup($html_heading_head$.getGlobalValue());
                                            html_markup(TWO_INTEGER);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            html_princ(title_var);
                                            html_markup($html_heading_tail$.getGlobalValue());
                                            html_markup(TWO_INTEGER);
                                            html_char(CHAR_greater, UNPROVIDED);
                                        }
                                        {
                                            SubLObject frame_name_var = cb_frame_name(NIL);
                                            html_markup($html_form_head$.getGlobalValue());
                                            html_markup($html_form_action$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != $html_form_method_post$.getGlobalValue()) {
                                                html_markup($html_form_method$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup($html_form_method_post$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (NIL != frame_name_var) {
                                                html_markup($html_form_target$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(frame_name_var);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_53 = $html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = $within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = $html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    $html_safe_print$.bind(T, thread);
                                                    $within_html_form$.bind(T, thread);
                                                    $html_form_field_uniquifier_code$.bind(next_html_form_field_uniquifier_code(), thread);
                                                    html_hidden_input($str_alt69$cb_tag_document_handler, T, UNPROVIDED);
                                                    html_markup($html_textarea_head$.getGlobalValue());
                                                    html_markup($html_textarea_name$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup($str_alt59$doc_string);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    if (true) {
                                                        html_markup($html_textarea_cols$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup($int$100);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (true) {
                                                        html_markup($html_textarea_rows$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(TWENTY_INTEGER);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_markup($html_table_wrap$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup($$$virtual);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_54 = $html_safe_print$.currentBinding(thread);
                                                        try {
                                                            $html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            $html_safe_print$.rebind(_prev_bind_0_54, thread);
                                                        }
                                                    }
                                                    html_markup($html_textarea_tail$.getGlobalValue());
                                                    html_newline(UNPROVIDED);
                                                    html_script_utilities.html_clear_input_button($str_alt59$doc_string, UNPROVIDED);
                                                    html_newline(UNPROVIDED);
                                                    html_princ($str_alt72$Tag_to__);
                                                    html_markup($html_select_head$.getGlobalValue());
                                                    html_markup($html_select_name$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup($str_alt52$filter_id);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    if (true) {
                                                        html_markup($html_select_size$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(ONE_INTEGER);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_55 = $html_safe_print$.currentBinding(thread);
                                                        try {
                                                            $html_safe_print$.bind(T, thread);
                                                            {
                                                                SubLObject cdolist_list_var = $html_concept_filters$.getGlobalValue();
                                                                SubLObject filter_spec_list = NIL;
                                                                for (filter_spec_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , filter_spec_list = cdolist_list_var.first()) {
                                                                    {
                                                                        SubLObject datum = filter_spec_list;
                                                                        SubLObject current = datum;
                                                                        SubLObject id_num = NIL;
                                                                        SubLObject display_string = NIL;
                                                                        SubLObject cycl = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list_alt73);
                                                                        id_num = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list_alt73);
                                                                        display_string = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list_alt73);
                                                                        cycl = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            html_markup($html_option_head$.getGlobalValue());
                                                                            if (NIL != id_num) {
                                                                                html_markup($html_option_value$.getGlobalValue());
                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_markup(id_num);
                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_56 = $html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    $html_safe_print$.bind(T, thread);
                                                                                    html_princ(display_string);
                                                                                } finally {
                                                                                    $html_safe_print$.rebind(_prev_bind_0_56, thread);
                                                                                }
                                                                            }
                                                                            html_markup($html_option_tail$.getGlobalValue());
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list_alt73);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            $html_safe_print$.rebind(_prev_bind_0_55, thread);
                                                        }
                                                    }
                                                    html_markup($html_select_tail$.getGlobalValue());
                                                    html_newline(UNPROVIDED);
                                                    html_checkbox_input($str_alt60$use_ner, $$$t, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_princ($str_alt75$_Use_Named_Entity_Recognizer);
                                                    html_indent(FOUR_INTEGER);
                                                    html_checkbox_input($str_alt61$use_rdisambiguate, $$$t, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_princ($str_alt76$_Perform_maximal_disambiguation);
                                                    if (MAYBE_HTML_EXTRACT_FROM_DOCUMENT.isFunctionSpec()) {
                                                        html_indent(FOUR_INTEGER);
                                                        html_checkbox_input($str_alt77$extract_info, $$$t, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        html_princ($str_alt78$_Extract_Propositional_Informatio);
                                                    }
                                                    html_newline(UNPROVIDED);
                                                    html_submit_input($$$Tag_to_XML, $cb_tag_document_to_xml$.getGlobalValue(), UNPROVIDED);
                                                    html_submit_input($$$Tag_to_HTML, $cb_tag_document_to_html$.getGlobalValue(), UNPROVIDED);
                                                    embed_form_field_code($html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    $html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    $within_html_form$.rebind(_prev_bind_1, thread);
                                                    $html_safe_print$.rebind(_prev_bind_0_53, thread);
                                                }
                                            }
                                            html_markup($html_form_tail$.getGlobalValue());
                                        }
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        $html_safe_print$.rebind(_prev_bind_0_52, thread);
                                    }
                                }
                                html_markup($html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                $html_inside_bodyP$.rebind(_prev_bind_0_51, thread);
                            }
                        }
                        html_markup($html_html_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        $html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_xml_tag_document(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ignore_pos_tagger = html_extract_sexpr($str112$ignore_pos_tagger, args, NIL);
        final SubLObject exhaustive_tagging = html_extract_sexpr($str111$exhaustive_tagging, args, NIL);
        final SubLObject sentencify = html_extract_sexpr($$$sentencify, args, NIL);
        final SubLObject use_ner = html_extract_sexpr($str110$use_ner, args, NIL);
        final SubLObject title_var = $$$Concept_Tagger_Web_Service;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str59$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str60$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$82 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$83 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str146$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_frame_name(NIL);
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$post);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(frame_name_var);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str152$cb_tag_document_handler, T, UNPROVIDED);
                            html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                            html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$inputText);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($int$100);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(TWENTY_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$virtual);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$87, thread);
                            }
                            html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_script_utilities.html_clear_input_button($$$inputText, UNPROVIDED, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str155$Tag_to__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$90, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_select_head$.getGlobalValue());
                                        html_markup(html_macros.$html_select_name$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str77$filter_id);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_select_size$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(ONE_INTEGER);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            SubLObject cdolist_list_var = $html_concept_filters$.getGlobalValue();
                                            SubLObject filter_spec_list = NIL;
                                            filter_spec_list = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                SubLObject current;
                                                final SubLObject datum = current = filter_spec_list;
                                                SubLObject id_num = NIL;
                                                SubLObject display_string = NIL;
                                                SubLObject cycl = NIL;
                                                destructuring_bind_must_consp(current, datum, $list156);
                                                id_num = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list156);
                                                display_string = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list156);
                                                cycl = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                    if (NIL != id_num) {
                                                        html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(id_num);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_princ(display_string);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$93, thread);
                                                    }
                                                    html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                } else {
                                                    cdestructuring_bind_error(datum, $list156);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                filter_spec_list = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$92, thread);
                                        }
                                        html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$91, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$89, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$94 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str157$Lexical_Mt__optional_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$95, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_text_input($$$lexicalMt, $str61$, $int$60);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$96, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$94, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$_Use_Named_Entity_Recognizer);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$98, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$99 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_checkbox_input($str110$use_ner, $$$t, use_ner, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$99, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$97, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str161$_Ignore_Part_of_speech_tagger);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$101, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_checkbox_input($str112$ignore_pos_tagger, $$$t, ignore_pos_tagger, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$102, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$100, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$103 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$104 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str162$_Obey_computed_sentence_boundarie);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$104, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_checkbox_input($$$sentencify, $$$t, sentencify, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$105, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$103, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_row_title$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($str163$Should_complex_phrases_also_get_i));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$_Tag_Exhaustively);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$107, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_checkbox_input($str111$exhaustive_tagging, $$$t, exhaustive_tagging, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$108, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$106, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str165$_Disambiguation__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$110, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$111 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_select_head$.getGlobalValue());
                                        html_markup(html_macros.$html_select_name$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($$$disambiguate);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_select_size$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(ONE_INTEGER);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_option_head$.getGlobalValue());
                                            html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                            html_markup(html_macros.$html_option_value$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup($$$rule);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$113 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($$$Maximal);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$113, thread);
                                            }
                                            html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_option_head$.getGlobalValue());
                                            html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                            html_markup(html_macros.$html_option_value$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup($$$none);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($$$None);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$114, thread);
                                            }
                                            html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$112, thread);
                                        }
                                        html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$111, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$109, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str172$_Minimum_Lexical_Strength__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$116, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_select_head$.getGlobalValue());
                                        html_markup(html_macros.$html_select_name$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($$$lexicalStrength);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_select_size$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(ONE_INTEGER);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_option_head$.getGlobalValue());
                                            html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                            html_markup(html_macros.$html_option_value$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup($$$primary);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($$$Use_only_primary_mappings);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$119, thread);
                                            }
                                            html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_option_head$.getGlobalValue());
                                            html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                            html_markup(html_macros.$html_option_value$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup($str175$context_sensitive);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($$$Exclude_vanishingly_rare_mappings);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$120, thread);
                                            }
                                            html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_option_head$.getGlobalValue());
                                            html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                            html_markup(html_macros.$html_option_value$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup($str126$vanishingly_rare);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($$$Use_all_lexical_mappings);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$121, thread);
                                            }
                                            html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$118, thread);
                                        }
                                        html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$115, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                if (MAYBE_HTML_EXTRACT_FROM_DOCUMENT.isFunctionSpec()) {
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($str178$_Extract_Propositional_Informatio);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$123, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_checkbox_input($str179$extract_info, $$$t, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$124, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$122, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$88, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_submit_input($$$Tag_to_XML, $cb_tag_document_to_xml$.getGlobalValue(), UNPROVIDED);
                            html_submit_input($$$Tag_to_HTML, $cb_tag_document_to_html$.getGlobalValue(), UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$83, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$82, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    static private final SubLList $list_alt6 = list(makeKeyword("LEXICON"), makeKeyword("OUTPUT-SPEC"), makeKeyword("FILTER"), makeKeyword("SENSE-TAGGER"), makeKeyword("TIMEOUT"));

    static private final SubLList $list_alt12 = list(list(makeSymbol("RESULT"), makeSymbol("DOCUMENT"), makeSymbol("&OPTIONAL"), makeSymbol("OPTIONAL-ARG-PLIST")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt20$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt21$d__ = makeString("d~%");

    static private final SubLString $str_alt22$p__ = makeString("p~%");

    static private final SubLString $str_alt23$s__ = makeString("s~%");

    static private final SubLString $str_alt24$w_A_A_A_A__A = makeString("w~A~A~A~A ~A");

    static private final SubLString $str_alt25$_A_A = makeString("~A~A");

    static private final SubLString $str_alt26$__ = makeString("~%");

    static private final SubLList $list_alt27 = list(list(makeString("6"), makeString("The Cyc Commonsense Ontology"), list(reader_make_constant_shell("ConceptFilterSpecificationFn"), reader_make_constant_shell("TaxonomyOfEasilyUnderstandableConcepts"), reader_make_constant_shell("ConceptOnlyFilterParameter"), reader_make_constant_shell("TriggerFromConcept"))), list(makeString("0"), makeString("Entire Cyc KB"), list(reader_make_constant_shell("ConceptFilterSpecificationFn"), reader_make_constant_shell("TheCycOntology"), reader_make_constant_shell("ConceptOnlyFilterParameter"), reader_make_constant_shell("TriggerFromConcept"))), list(makeString("1"), makeString("Medical Filter"), list(reader_make_constant_shell("ConceptFilterSpecificationFn"), reader_make_constant_shell("CAEMedicalResearchFilterTree"), reader_make_constant_shell("ConceptAndInstancesFilterParameter"), reader_make_constant_shell("TriggerFromConceptSpecOrInstance"))), list(makeString("2"), makeString("Military Taxonomy"), list(reader_make_constant_shell("ConceptFilterSpecificationFn"), list(reader_make_constant_shell("ConceptNodesForTaxonFn"), reader_make_constant_shell("MilitaryThingTaxonomy")), reader_make_constant_shell("ConceptAndInstancesFilterParameter"), reader_make_constant_shell("TriggerFromConceptSpecOrInstance"))), list(makeString("3"), makeString("Terrorism Filter"), list(reader_make_constant_shell("ConceptFilterSpecificationFn"), list(reader_make_constant_shell("ConceptNodesForTaskTypeFn"), reader_make_constant_shell("IntelligenceAnalysisTask-Allotment")), reader_make_constant_shell("ConceptAndInstancesFilterParameter"), reader_make_constant_shell("TriggerFromConceptSpecOrInstance"))), list(makeString("4"), makeString("Food & Drink Taxonomy"), list(reader_make_constant_shell("ConceptFilterSpecificationFn"), reader_make_constant_shell("FoodAndDrinkTaxonomy"), reader_make_constant_shell("ConceptAndInstancesFilterParameter"), reader_make_constant_shell("TriggerFromConceptSpecOrInstance"))), list(makeString("5"), makeString("Investment Taxonomy"), list(reader_make_constant_shell("ConceptFilterSpecificationFn"), reader_make_constant_shell("InvestmentRelatedThingTaxonomy"), reader_make_constant_shell("ConceptAndInstancesFilterParameter"), reader_make_constant_shell("TriggerFromConceptSpecOrInstance"))));

    static private final SubLString $str_alt29$text_xml = makeString("text/xml");

    static private final SubLString $$$sentence = makeString("sentence");

    static private final SubLString $$$string = makeString("string");

    static private final SubLString $$$offset = makeString("offset");

    static private final SubLString $$$word = makeString("word");

    static private final SubLString $$$interpretation = makeString("interpretation");

    static private final SubLString $str_alt36$_cycl__font_family__sans_serif__c = makeString(".cycl {font-family: sans-serif; color: #0000FF; font-size: smaller}\n     .weight {font-family: sans-serif; color: #AA00EE; font-size: smaller}");

    static private final SubLString $str_alt41$_A = makeString("~A");

    static private final SubLString $str_alt42$__ = makeString(" (");

    static private final SubLSymbol $sym43$WEIGHT_ = makeSymbol("WEIGHT>");

    static private final SubLString $str_alt46$_ = makeString(" ");

    static private final SubLString $str_alt48$_S = makeString("~S");

    static private final SubLString $str_alt50$__A = makeString(" ~A");

    static private final SubLString $str_alt51$_ = makeString(")");

    static private final SubLString $str_alt52$filter_id = makeString("filter-id");

    static private final SubLString $str_alt59$doc_string = makeString("doc-string");

    static private final SubLString $str_alt60$use_ner = makeString("use-ner");

    static private final SubLString $str_alt61$use_rdisambiguate = makeString("use-rdisambiguate");

    static private final SubLString $str_alt62$text_html = makeString("text/html");

    static private final SubLString $str_alt67$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt68$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt69$cb_tag_document_handler = makeString("cb-tag-document-handler");

    static private final SubLString $str_alt72$Tag_to__ = makeString("Tag to: ");

    static private final SubLList $list_alt73 = list(makeSymbol("ID-NUM"), makeSymbol("DISPLAY-STRING"), makeSymbol("CYCL"));

    static private final SubLString $str_alt75$_Use_Named_Entity_Recognizer = makeString(" Use Named Entity Recognizer");

    static private final SubLString $str_alt76$_Perform_maximal_disambiguation = makeString(" Perform maximal disambiguation");

    static private final SubLString $str_alt77$extract_info = makeString("extract-info");

    static private final SubLString $str_alt78$_Extract_Propositional_Informatio = makeString(" Extract Propositional Information (HTML-only)");

    static private final SubLList $list_alt83 = list(makeSymbol("SENTENCES-TO-DO"), makeSymbol("DOCUMENT"), makeSymbol("LEXICON"), makeSymbol("SENSE-TAGGER"), makeSymbol("FILTER"), makeSymbol("OUTPUT-SPEC"), makeSymbol("PREPARED-SENTENCE-OUTPUT"));

    static private final SubLList $list_alt84 = list(makeKeyword("SENTENCES-TO-DO"), makeKeyword("DOCUMENT"), makeKeyword("LEXICON"), makeKeyword("SENSE-TAGGER"), makeKeyword("FILTER"), makeKeyword("OUTPUT-SPEC"), makeKeyword("PREPARED-SENTENCE-OUTPUT"));

    static private final SubLList $list_alt85 = list(makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO"), makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT"), makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-LEXICON"), makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER"), makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-FILTER"), makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC"), makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT"));

    static private final SubLList $list_alt86 = list(makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO"), makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT"), makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-LEXICON"), makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER"), makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-FILTER"), makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC"), makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT"));

    static private final SubLString $str_alt108$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt123$_______________Error_____________ = makeString("***************Error*****************");

    static private final SubLString $str_alt124$Caught__S_while_processing__S__ = makeString("Caught ~S while processing ~S~%");

    static private final SubLList $list_alt127 = list(makeSymbol("NAME"), makeSymbol("TAG-METHOD"), makeSymbol("LEXICON-METHOD"));

    static private final SubLList $list_alt128 = list($NAME, makeKeyword("TAG-METHOD"), makeKeyword("LEXICON-METHOD"));

    static private final SubLList $list_alt129 = list(makeSymbol("CONCEPT-TAGGER-NAME"), makeSymbol("CONCEPT-TAGGER-TAG-METHOD"), makeSymbol("CONCEPT-TAGGER-LEXICON-METHOD"));

    static private final SubLList $list_alt130 = list(makeSymbol("_CSETF-CONCEPT-TAGGER-NAME"), makeSymbol("_CSETF-CONCEPT-TAGGER-TAG-METHOD"), makeSymbol("_CSETF-CONCEPT-TAGGER-LEXICON-METHOD"));

    static private final SubLString $str_alt142$__Concept_Tagger__A_ = makeString("#<Concept-Tagger:~A>");

    static private final SubLString $str_alt143$_S_is_not_a_registered_concept_ta = makeString("~S is not a registered concept-tagger");

    static private final SubLString $str_alt144$_S_is_not_a_registered_concept_ta = makeString("~S is not a registered concept tagger");

    static private final SubLList $list_alt166 = list(makeKeyword("DEFAULT"));

    static private final SubLSymbol $sym173$PARSING_REWRITE_OF_INVERSE_ = makeSymbol("PARSING-REWRITE-OF-INVERSE?");

    static private final SubLList $list_alt185 = list(makeString("doc-string"), makeString("Bananas and kiwis are fruit"));

    static private final SubLList $list_alt186 = list(makeString("submit-button"), makeString("Display as HTML"));

    static private final SubLList $list_alt187 = list(makeString("sumbit-button"), makeString("Display as HTML"));

    static private final SubLString $str_alt190$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLList $list_alt191 = list(makeString("NEWS & NOTES\n\nThe San Francisco Chronicle reports this week on new measures that Whole Foods plans to take to increase its commitment to sustainable agriculture and local produce, including a requirement that all Whole Foods stores buy from at least four individual local farms, a pledge of $10 million a year in donations to small farms, and Sunday Farmers Markets in Whole Foods parking lots.\n\nThe Agriculture Department is proposing new legislation that would loosen the standards for what is classified as grass-fed, reports The New York Times. Under the proposed rule, it is possible that animals that were not raised on a pasture and were given antibiotics and hormones could still be considered grass-fed.\n\nGothamist provides tips on how to prepare and store lettuce, which they like to get from Gorzynski Organic Farm at the Union Square Greenmarket.\n\nGET OUT OF TOWN\n\nThe New York Times has a series of articles this week on road trips to various farms, purveyors, and eateries in Columbia County, NY, Long Beach Island, NJ, Litchfield County, CT, and North Folk, NY. If you\'re looking for more ideas, several Greenmarket farms offer \"pick-your-own\" or \"make-your-own\" activities:\n\n    * You can pick-your-own fruit at Phillips Farms in Milford, NJ every day except for Tuesdays, from 8:00 a.m. to 8:00 p.m. Go now and catch the tail end of the blueberry season. Peaches, raspberries, and blackberries are also ready to be picked (or will be shortly). Call 908.995.0022 for more information.\n    * Prospect Hill Orchards offers seasonal pick-your-own weekends (9:00 a.m. to 4:00 p.m.). Right now, peaches (donut, yellow, and white) are ripe and ready. Nectarines can be picked starting the second weekend of August. Come mid-September, apples, pears, and pumpkins will be available. Contact Steve, Judy, or Brad Clarke at 845.795.2383 for more information.\n    * Learn old-fashioned cheesemaking at Valley Shepherd Creamery in Long Valley, NJ. You\'ll get to make your own cheese wheel, which you leave in the Creamery\'s hillside aging cave and pick up when it\'s ready in 60 to 75 days. The next cheesemaking class is September 17th. It costs $129 and includes the cheese class, cheese tasting, a tour, luncheon, and the wheel of cheese. Call 908.876.3200 for more information.\n\nWHAT\'S IN, WHAT\'S OUT\n\nBaby organic carrots ($1.50/bunch) and hot peppers (6/$1.00) from HydroGarden Farm...hyssop tea (\"licorice flavor, heals the lungs\") and lemon verbena tea ($1.00) from Berried Treasures...cranberry beans ($3.00/lb.) and yellow plum tomatoes ($2.50/lb) at Migliorelli Farm...blackberries ($4.00/half pint) from Locust Grove and Breezy Hill Orchard...early red free apples ($1.50) from Oak Grove Plantation...more varieties of apples from Caradonna, including red delicious, pristine, golden delicious, empire, mutsu, and cameo ($.75 to $1.25/lb.)...cubanelles ($2.40/lb.) from Keith\'s.\n\nDue to popular demand, Lynnhaven now has feta in brine (which gives it its characteristic saltiness). Feta crumbles not in brine are still available ($5.00).\n\nTamarack Hollow Farm is now taking orders for holiday ham, duck, goose, and suckling pig.\n\nRhubarb and fava beans are essentially gone...cherries are becoming less abundant...only tri-star strawberries are left.\n\nFOCUS ON: Just Rugelach\n\nRugelach Although the labels on their goods and the sign on their stand say \"Just Rugelach,\" perhaps the name on their CENY placard - \"Not Just Rugelach\" - is more apt. In addition to the traditional Jewish treat, they sell a wide array of baked goods: everything from muffins, strudels, bread, and cookies to more uncommon items. Take the roast pork buns: Roselie Halik, who runs the company with her husband Tom, explains that when she was pregnant she was craving them and Tom developed the recipe for her. They liked it so much that they kept it around and sell it at market to this day. Both times I visited them at the Tribeca Greenmarket, numerous patrons came just for these doughy delicacies, which they sell for $1.00 each.\n\nTom Halik started the company in 1995 after attending culinary school in Paris and working at the 5th Avenue Epicure in New York (where he met Roselie). He has come to be known as \"the rugelach man\" in Kearny, NJ, where they are based.  Everything is made from scratch, every day, and Tom is always working to improve his recipes: \"constantly developing,\" Roselie says. She tries all the recipes as her husband works on them, offering advice how they might be tweaked before they are finalized. \"I\'m his biggest critic,\" she says with a laugh.\n\nDespite the array of baked goods they sell, Roselie says that \"people always come for the rugelach.\" Right now they offer four different flavors: walnut raison apricot, walnut raisin raspberry, chocolate hazelnut, and cinnamon raisin. She says they try to make seasonal varieties, but always keep their standbys, like the classic walnut raisin apricot. Their rugelach can be bought wholesale or through mail order and at any of their Greenmarket locations throughout the city (see FARMER INFORMATION). Rugelach is 50 cents a piece or $2.00/quarter pound.\n\nFARMER INFORMATION\n\n    * Berried Treasures, Cooks Falls, NY. At the Union Square Greenmarket Wednesdays and Fridays.\n    * Breezy Hill Orchard, Staatsburg, NY. At the Union Square Greenmarket Wednesdays and Saturdays and the Orchard Street Market on Sundays (845.266.3979).\n    * Caradonna, at the Union Square Greenmarket Wednesdays and Saturdays.\n    * Hydro Garden Farm, Yaphank, NY. At the Union Square Greenmarket Mondays, Wednesdays, Fridays, and Saturdays (631.286.3423).\n    * Just Rugelach, Kearny, NJ. At the Tribeca Greenmarket Wednesdays and Saturdays, Brooklyn Borough Hall Greenmarket Tuesdays and Saturdays, UN Plaza Greenmarket on Wednesdays,  Bowling Green Greenmarket on Thursdays, and 77th Street Greenmarket and Jackson Heights Greenmarket on Sundays (201.246.9211).\n    * Keith\'s Farm, Westtown, NY. At the Union Square Greenmarket Wednesdays and Saturdays (845.856.4955).\n    * Locust Grove, Milton, NY. At the Union Square Greenmarket Wednesdays and Saturdays (845.795.5194).\n    * Lynnhaven, Pine Bush, NY. At the Union Square Greenmarket on Wednesdays (845.744.6089).\n    * Migliorelli Farm, Tivoli, NY. At the Union Square Greenmarket Wednesdays, Fridays, and Saturdays.\n    * Oak Grove Plantation, at the Union Square Greenmarket Fridays and Saturdays.\n    * Phillips Farms, Milford, NJ. At the Union Square Greenmarket Mondays, Wednesdays, Fridays, and Saturdays (908.995.0022).\n    * Prospect Hill Orchards, Milton, NY. At the Tribeca Greenmarket Saturdays (845.795.2383).\n    * Tamarack Hollow Farm, Corinth, VT. At the Union Square Greenmarket on Wednesdays (802.439.5078)\n    * Valley Shepherd Creamery, Long Valley, NJ. At the Union Square Greenmarket Wednesdays and Saturdays and the Tribeca Greenmarket on Wednesdays (908.876.3200)."), makeString("Cheap Fun Wines\nCheap Fun Wines.com is on a mission to find the most luscious wines on the planet for under $20.\n\nLeather Wine ToteThere are some days when it\'s fine to be swinging your bottles around in a nylon wine tote, but sometimes you need to class things up a bit. Enter the leather wine carrier from Wine Enthusiast, available at Amazon - it holds two bottles and your opening gear, and it makes you look a little less K-Mart and a little more J. Peterman.\n\n    Product Description\n\nWhen an invitation restaurant or learned palate requires you to \'bring your own\' you can do so at last with classic style and good taste. Our two-bottle wine tote is crafted of beautifully thick and supple nubuck with a warm brown finish that is smooth natural and surprisingly rugged. Features a zippered compartment to keep your corkscrew and antique-finished brass hardware for a handsome conclusion to this superior piece. Also holds champagne.from Amazon"), makeString("Vagablond - Stylish Travel, Food & Wine Blog\nThe globetrotter\'s guide to fashionable travel, wine, and food.\n\nI\'ve bought $100 bottles of wine and $10 bottles. Mostly the latter. But to some, $500 for 25.6 ounces of fermented grape juice and yeast is a price well worth paying. These are the \"baseball card collectors\" of wine who buy some to save, some to trade and some to sell.\n\nAccording to an article, \"Worth Its Weight In Gold?\" in today\'s SF Chronicle, \"$100 is a midrange price for a top-notch Napa Valley Cabernet Sauvignon, and with the price of Screaming Eagle Cabernet soaring to $500 with the October release of the 2003 vintage, expect others to follow along.\""), makeString("Accidental Hedonist\n\nIn writing about the French restaurants, I came to question just exactly where the idea of \"restaurants\" comes from. As per usual, I\'ve discovered something that I have previously did not know.\n\nThe word itself provides a fair amount of clues...restaurant comes from the Old French term restaurateur, which meant someone who provides (i.e. sells) restaurer. Restauarer means \"to restore\". In other words - a \"restorative\".\n\nIf one were to look back in the history books for the word \"restaurant\", the first appearance shows up in the 15th century as a recipe. In this recipe, a capon is rendered in a glass kettle along with gold or gems. This itself also help evolve into the idea that chicken soup can cures what ails.\n\nOver the course of years, restaurants evolved from gold laden rendered chicken, into soups and broths which were sold to the public by specific people. Much like other food producers, restaurateurs had their own guild and were able to sell the broth, much like charcutiers sold sausages and rotisseurs sold fresh game.\n\nIt was this collection of different vendors and sellers of food that allowed restaurateurs to flourish. The French Revolution helped take down, not just a monarchy, but the economic system of guilds that sometimes prevented one food producer from selling products that were typically the \"responsibility\" of another. Additionally the bourgeoisie became a viable economic force as tradesmen and artisans started to travel to other areas of France to find new markets for their wares. These traveling businessmen looked for places to eat which offered a variety of foods in a comforting atmosphere that reflected their own station in life. These were variables that inns and taverns (the initial purveyors of food to travelers) could not meet on a regular basis.\n\nRestaurants filled this void nicely, first by selling varieties of bouillon. Then, as the guikld system slowly dissolved away, they started offering other foodstuffs, such as soups, meats and pastries. This eventually (and quickly) evolved into businesses that resemble the restaurants we know of today.\n\nWho would have thought that the creation of restaurants was so involved?\n\nTechnorati Tags: Restaurants, Food, Food+History "), makeString("Wine Camp\nA wine blog with a terroir-ist twist.\n\nmikerichmond.jpgBouchaine is a winery that seemed always to be around, but was never exciting. While one of the founders of Carneros as a top pinot noir region, Bouchaine always remained in the shadow of its neighbors Acacia and Saintsbury. While some good wines were made at Bouchaine, other wineries rode the Carneros wave to the top.\n\nNow things are turned around and the same thing that took Acacia to the top is now powering Bouchaine, which has finally taken its place on the \"A\" team of Carneros producers. What made the wines of Acacia compelling was the talent, intelligence and passion of winemaker Mike Richmond, who has now taken his considerable talents to Bouchaine. \n\nMeanwhile the once revered Acacia winery has been turned into an industrial production line of plonk pinot by alcoholic beverage super-giant Diageo and now Acacia is involved in hand-to-hand combat with Sanford Winery and other corporate pinot noir producers to see who can sell the most boxes of indistinguishable pinot noir. If you are trying to decide between which of these labels to buy you should flip a coin or buy the cheapest because what\'s in the bottle is of little consequence or interest.\n\nAt this year\'s International Pinot Noir Celebration (IPNC), Mike Richmond presented his first Bouchaine Pinot Noir that he was responsible for from start to finish and a very nice wine it is. The 2004 Bouchaine Carneros Estate Pinot Noir is a lovely wine with a graceful balance and an intriguing subtle character. It certainly shows the richer characteristics of California, but is still restrained and complex with a lingering, not heavy finish.\n\nThe emergence of Bouchaine as a first class Carneros pinot noir producer reminds us that while great wines are made in the vineyard, you have to know what to do with those grapes when you get them. Mike Richmond obviously knows what to do and, perhaps more importantly when it comes to pinot noir - what not to do. "));

    public static final SubLObject tag_concepts_iterator_state_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject tag_concepts_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject tag_concepts_iterator_state_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.concept_tagger.$tag_concepts_iterator_state_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject tag_concepts_iterator_state_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.concept_tagger.$tag_concepts_iterator_state_native.class ? T : NIL;
    }

    public static final SubLObject tag_concepts_iterator_state_sentences_to_do_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TAG_CONCEPTS_ITERATOR_STATE_P);
        return v_object.getField2();
    }

    public static SubLObject tag_concepts_iterator_state_sentences_to_do(final SubLObject v_object) {
        assert NIL != tag_concepts_iterator_state_p(v_object) : "! concept_tagger.tag_concepts_iterator_state_p(v_object) " + "concept_tagger.tag_concepts_iterator_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject tag_concepts_iterator_state_document_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TAG_CONCEPTS_ITERATOR_STATE_P);
        return v_object.getField3();
    }

    public static SubLObject tag_concepts_iterator_state_document(final SubLObject v_object) {
        assert NIL != tag_concepts_iterator_state_p(v_object) : "! concept_tagger.tag_concepts_iterator_state_p(v_object) " + "concept_tagger.tag_concepts_iterator_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject tag_concepts_iterator_state_lexicon_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TAG_CONCEPTS_ITERATOR_STATE_P);
        return v_object.getField4();
    }

    public static SubLObject tag_concepts_iterator_state_lexicon(final SubLObject v_object) {
        assert NIL != tag_concepts_iterator_state_p(v_object) : "! concept_tagger.tag_concepts_iterator_state_p(v_object) " + "concept_tagger.tag_concepts_iterator_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject tag_concepts_iterator_state_sense_tagger_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TAG_CONCEPTS_ITERATOR_STATE_P);
        return v_object.getField5();
    }

    public static SubLObject tag_concepts_iterator_state_sense_tagger(final SubLObject v_object) {
        assert NIL != tag_concepts_iterator_state_p(v_object) : "! concept_tagger.tag_concepts_iterator_state_p(v_object) " + "concept_tagger.tag_concepts_iterator_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject tag_concepts_iterator_state_filter_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TAG_CONCEPTS_ITERATOR_STATE_P);
        return v_object.getField6();
    }

    public static SubLObject tag_concepts_iterator_state_filter(final SubLObject v_object) {
        assert NIL != tag_concepts_iterator_state_p(v_object) : "! concept_tagger.tag_concepts_iterator_state_p(v_object) " + "concept_tagger.tag_concepts_iterator_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject tag_concepts_iterator_state_output_spec_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TAG_CONCEPTS_ITERATOR_STATE_P);
        return v_object.getField7();
    }

    public static SubLObject tag_concepts_iterator_state_output_spec(final SubLObject v_object) {
        assert NIL != tag_concepts_iterator_state_p(v_object) : "! concept_tagger.tag_concepts_iterator_state_p(v_object) " + "concept_tagger.tag_concepts_iterator_state_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject tag_concepts_iterator_state_prepared_sentence_output_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TAG_CONCEPTS_ITERATOR_STATE_P);
        return v_object.getField8();
    }

    public static SubLObject tag_concepts_iterator_state_prepared_sentence_output(final SubLObject v_object) {
        assert NIL != tag_concepts_iterator_state_p(v_object) : "! concept_tagger.tag_concepts_iterator_state_p(v_object) " + "concept_tagger.tag_concepts_iterator_state_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject _csetf_tag_concepts_iterator_state_sentences_to_do_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TAG_CONCEPTS_ITERATOR_STATE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_tag_concepts_iterator_state_sentences_to_do(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_concepts_iterator_state_p(v_object) : "! concept_tagger.tag_concepts_iterator_state_p(v_object) " + "concept_tagger.tag_concepts_iterator_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_tag_concepts_iterator_state_document_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TAG_CONCEPTS_ITERATOR_STATE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_tag_concepts_iterator_state_document(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_concepts_iterator_state_p(v_object) : "! concept_tagger.tag_concepts_iterator_state_p(v_object) " + "concept_tagger.tag_concepts_iterator_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_tag_concepts_iterator_state_lexicon_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TAG_CONCEPTS_ITERATOR_STATE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_tag_concepts_iterator_state_lexicon(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_concepts_iterator_state_p(v_object) : "! concept_tagger.tag_concepts_iterator_state_p(v_object) " + "concept_tagger.tag_concepts_iterator_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_tag_concepts_iterator_state_sense_tagger_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TAG_CONCEPTS_ITERATOR_STATE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_tag_concepts_iterator_state_sense_tagger(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_concepts_iterator_state_p(v_object) : "! concept_tagger.tag_concepts_iterator_state_p(v_object) " + "concept_tagger.tag_concepts_iterator_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_tag_concepts_iterator_state_filter_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TAG_CONCEPTS_ITERATOR_STATE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_tag_concepts_iterator_state_filter(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_concepts_iterator_state_p(v_object) : "! concept_tagger.tag_concepts_iterator_state_p(v_object) " + "concept_tagger.tag_concepts_iterator_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_tag_concepts_iterator_state_output_spec_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TAG_CONCEPTS_ITERATOR_STATE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_tag_concepts_iterator_state_output_spec(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_concepts_iterator_state_p(v_object) : "! concept_tagger.tag_concepts_iterator_state_p(v_object) " + "concept_tagger.tag_concepts_iterator_state_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_tag_concepts_iterator_state_prepared_sentence_output_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TAG_CONCEPTS_ITERATOR_STATE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_tag_concepts_iterator_state_prepared_sentence_output(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_concepts_iterator_state_p(v_object) : "! concept_tagger.tag_concepts_iterator_state_p(v_object) " + "concept_tagger.tag_concepts_iterator_state_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject make_tag_concepts_iterator_state_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.concept_tagger.$tag_concepts_iterator_state_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SENTENCES_TO_DO)) {
                        _csetf_tag_concepts_iterator_state_sentences_to_do(v_new, current_value);
                    } else {
                        if (pcase_var.eql($DOCUMENT)) {
                            _csetf_tag_concepts_iterator_state_document(v_new, current_value);
                        } else {
                            if (pcase_var.eql($LEXICON)) {
                                _csetf_tag_concepts_iterator_state_lexicon(v_new, current_value);
                            } else {
                                if (pcase_var.eql($SENSE_TAGGER)) {
                                    _csetf_tag_concepts_iterator_state_sense_tagger(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($FILTER)) {
                                        _csetf_tag_concepts_iterator_state_filter(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($OUTPUT_SPEC)) {
                                            _csetf_tag_concepts_iterator_state_output_spec(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($PREPARED_SENTENCE_OUTPUT)) {
                                                _csetf_tag_concepts_iterator_state_prepared_sentence_output(v_new, current_value);
                                            } else {
                                                Errors.error($str_alt108$Invalid_slot__S_for_construction_, current_arg);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_tag_concepts_iterator_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.concept_tagger.$tag_concepts_iterator_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SENTENCES_TO_DO)) {
                _csetf_tag_concepts_iterator_state_sentences_to_do(v_new, current_value);
            } else
                if (pcase_var.eql($DOCUMENT)) {
                    _csetf_tag_concepts_iterator_state_document(v_new, current_value);
                } else
                    if (pcase_var.eql($LEXICON)) {
                        _csetf_tag_concepts_iterator_state_lexicon(v_new, current_value);
                    } else
                        if (pcase_var.eql($SENSE_TAGGER)) {
                            _csetf_tag_concepts_iterator_state_sense_tagger(v_new, current_value);
                        } else
                            if (pcase_var.eql($FILTER)) {
                                _csetf_tag_concepts_iterator_state_filter(v_new, current_value);
                            } else
                                if (pcase_var.eql($OUTPUT_SPEC)) {
                                    _csetf_tag_concepts_iterator_state_output_spec(v_new, current_value);
                                } else
                                    if (pcase_var.eql($PREPARED_SENTENCE_OUTPUT)) {
                                        _csetf_tag_concepts_iterator_state_prepared_sentence_output(v_new, current_value);
                                    } else {
                                        Errors.error($str210$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_tag_concepts_iterator_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TAG_CONCEPTS_ITERATOR_STATE, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SENTENCES_TO_DO, tag_concepts_iterator_state_sentences_to_do(obj));
        funcall(visitor_fn, obj, $SLOT, $DOCUMENT, tag_concepts_iterator_state_document(obj));
        funcall(visitor_fn, obj, $SLOT, $LEXICON, tag_concepts_iterator_state_lexicon(obj));
        funcall(visitor_fn, obj, $SLOT, $SENSE_TAGGER, tag_concepts_iterator_state_sense_tagger(obj));
        funcall(visitor_fn, obj, $SLOT, $FILTER, tag_concepts_iterator_state_filter(obj));
        funcall(visitor_fn, obj, $SLOT, $OUTPUT_SPEC, tag_concepts_iterator_state_output_spec(obj));
        funcall(visitor_fn, obj, $SLOT, $PREPARED_SENTENCE_OUTPUT, tag_concepts_iterator_state_prepared_sentence_output(obj));
        funcall(visitor_fn, obj, $END, MAKE_TAG_CONCEPTS_ITERATOR_STATE, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_tag_concepts_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_tag_concepts_iterator_state(obj, visitor_fn);
    }

    public static final SubLObject new_tag_concepts_iterator_state_alt(SubLObject sentences, SubLObject v_document, SubLObject optional_arg_plist) {
        {
            SubLObject iter = make_tag_concepts_iterator_state(UNPROVIDED);
            _csetf_tag_concepts_iterator_state_sentences_to_do(iter, sentences);
            _csetf_tag_concepts_iterator_state_document(iter, v_document);
            _csetf_tag_concepts_iterator_state_lexicon(iter, getf(optional_arg_plist, $LEXICON, UNPROVIDED));
            _csetf_tag_concepts_iterator_state_sense_tagger(iter, getf(optional_arg_plist, $SENSE_TAGGER, UNPROVIDED));
            _csetf_tag_concepts_iterator_state_output_spec(iter, getf(optional_arg_plist, $OUTPUT_SPEC, UNPROVIDED));
            return iter;
        }
    }

    public static SubLObject new_tag_concepts_iterator_state(final SubLObject sentences, final SubLObject v_document, final SubLObject optional_arg_plist) {
        final SubLObject iter = make_tag_concepts_iterator_state(UNPROVIDED);
        _csetf_tag_concepts_iterator_state_sentences_to_do(iter, sentences);
        _csetf_tag_concepts_iterator_state_document(iter, v_document);
        _csetf_tag_concepts_iterator_state_lexicon(iter, getf(optional_arg_plist, $LEXICON, UNPROVIDED));
        _csetf_tag_concepts_iterator_state_sense_tagger(iter, getf(optional_arg_plist, $SENSE_TAGGER, UNPROVIDED));
        _csetf_tag_concepts_iterator_state_output_spec(iter, getf(optional_arg_plist, $OUTPUT_SPEC, UNPROVIDED));
        return iter;
    }

    public static final SubLObject tag_concepts_iterator_state_done_p_alt(SubLObject state) {
        return makeBoolean(!((NIL != tag_concepts_iterator_state_prepared_sentence_output(state)) || (NIL != tag_concepts_iterator_state_sentences_to_do(state))));
    }

    public static SubLObject tag_concepts_iterator_state_done_p(final SubLObject state) {
        return makeBoolean((NIL == tag_concepts_iterator_state_prepared_sentence_output(state)) && (NIL == tag_concepts_iterator_state_sentences_to_do(state)));
    }

    /**
     *
     *
     * @unknown listp; a list of words (defstructs)
     * @unknown iterator-state
     */
    @LispMethod(comment = "@unknown listp; a list of words (defstructs)\r\n@unknown iterator-state")
    public static final SubLObject tag_concepts_iterator_state_next_alt(SubLObject state) {
        {
            SubLObject result = NIL;
            if (NIL != tag_concepts_iterator_state_prepared_sentence_output(state)) {
                result = tag_concepts_iterator_state_prepared_sentence_output(state).first();
                _csetf_tag_concepts_iterator_state_prepared_sentence_output(state, tag_concepts_iterator_state_prepared_sentence_output(state).rest());
                return values(result, state, NIL);
            }
            if (NIL == tag_concepts_iterator_state_sentences_to_do(state)) {
                return values(NIL, state, T);
            }
            {
                SubLObject sentence = tag_concepts_iterator_state_sentences_to_do(state).first();
                SubLObject lexicon = tag_concepts_iterator_state_lexicon(state);
                SubLObject output_spec = tag_concepts_iterator_state_output_spec(state);
                SubLObject learned_entries = methods.funcall_instance_method_with_1_args(lexicon, LEARN, document.sentence_string(sentence));
                SubLObject v_concept_tagger = tag_concepts_iterator_state_sense_tagger(state);
                SubLObject sentence_result = funcall(concept_tagger_get_tag_method(v_concept_tagger), sentence, lexicon, output_spec);
                _csetf_tag_concepts_iterator_state_sentences_to_do(state, tag_concepts_iterator_state_sentences_to_do(state).rest());
                _csetf_tag_concepts_iterator_state_prepared_sentence_output(state, cons(sentence_result, tag_concepts_iterator_state_prepared_sentence_output(state)));
                result = tag_concepts_iterator_state_prepared_sentence_output(state).first();
                _csetf_tag_concepts_iterator_state_prepared_sentence_output(state, tag_concepts_iterator_state_prepared_sentence_output(state).rest());
            }
            return values(result, state, NIL);
        }
    }

    /**
     *
     *
     * @unknown listp; a list of words (defstructs)
     * @unknown iterator-state
     */
    @LispMethod(comment = "@unknown listp; a list of words (defstructs)\r\n@unknown iterator-state")
    public static SubLObject tag_concepts_iterator_state_next(final SubLObject state) {
        SubLObject result = NIL;
        if (NIL != tag_concepts_iterator_state_prepared_sentence_output(state)) {
            result = tag_concepts_iterator_state_prepared_sentence_output(state).first();
            _csetf_tag_concepts_iterator_state_prepared_sentence_output(state, tag_concepts_iterator_state_prepared_sentence_output(state).rest());
            return values(result, state, NIL);
        }
        if (NIL == tag_concepts_iterator_state_sentences_to_do(state)) {
            return values(NIL, state, T);
        }
        final SubLObject sentence = tag_concepts_iterator_state_sentences_to_do(state).first();
        final SubLObject lexicon = tag_concepts_iterator_state_lexicon(state);
        final SubLObject output_spec = tag_concepts_iterator_state_output_spec(state);
        final SubLObject learned_entries = methods.funcall_instance_method_with_1_args(lexicon, LEARN, document.sentence_string(sentence));
        final SubLObject v_concept_tagger = tag_concepts_iterator_state_sense_tagger(state);
        final SubLObject sentence_result = funcall(concept_tagger_get_tag_method(v_concept_tagger), sentence, lexicon, output_spec);
        _csetf_tag_concepts_iterator_state_sentences_to_do(state, tag_concepts_iterator_state_sentences_to_do(state).rest());
        _csetf_tag_concepts_iterator_state_prepared_sentence_output(state, cons(sentence_result, tag_concepts_iterator_state_prepared_sentence_output(state)));
        result = tag_concepts_iterator_state_prepared_sentence_output(state).first();
        _csetf_tag_concepts_iterator_state_prepared_sentence_output(state, tag_concepts_iterator_state_prepared_sentence_output(state).rest());
        return values(result, state, NIL);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @param LEXICON
     * 		abstract-lexicon-p (actually, must be a term-lexicon-p)
     * @param AGGRESSIVE-RETOKENIZATION?
    boolean
     * 		
     * @param OUTPUT-SPEC
     * 		keyword-p (expected to change in the near future)
     * @param FILTER
    cycl-denotational-term-p
     * 		
     * @return listp of WORD-Ps
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@param LEXICON\r\n\t\tabstract-lexicon-p (actually, must be a term-lexicon-p)\r\n@param AGGRESSIVE-RETOKENIZATION?\nboolean\r\n\t\t\r\n@param OUTPUT-SPEC\r\n\t\tkeyword-p (expected to change in the near future)\r\n@param FILTER\ncycl-denotational-term-p\r\n\t\t\r\n@return listp of WORD-Ps")
    public static final SubLObject concept_tagger_process_sentence_with_syntactic_parser_alt(SubLObject sentence, SubLObject lexicon, SubLObject aggressive_retokenizationP, SubLObject output_spec, SubLObject filter) {
        if (output_spec == UNPROVIDED) {
            output_spec = NIL;
        }
        if (filter == UNPROVIDED) {
            filter = NIL;
        }
        {
            SubLObject sentence_result = NIL;
            SubLObject string = document.sentence_string(sentence);
            SubLObject syntax = sentence_string_denotation_mapper_get_lexified_syntax(string, lexicon, aggressive_retokenizationP);
            if (NIL != syntax) {
                {
                    SubLObject yield = methods.funcall_instance_method_with_0_args(syntax, YIELD);
                    SubLObject cdolist_list_var = yield;
                    SubLObject word = NIL;
                    for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                        {
                            SubLObject lexes = methods.funcall_instance_method_with_0_args(word, GET_LEXES);
                            SubLObject interps = remove_duplicates(concept_tagger_extract_interpretations_from_lex_entry(lexes, nl_api_datastructures.output_spec_interp_spec(output_spec), filter), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject pos = parsing_utilities.penntag_to_cycl(symbol_name(methods.funcall_instance_method_with_0_args(word, GET_CATEGORY)));
                            SubLObject new_info = (NIL != interps) ? ((SubLObject) (list($INTERPS, interps, $CYC_POS, pos, $LEX_ENTRIES, lexes))) : NIL;
                            sentence_result = cons(document.new_word(list($STRING, methods.funcall_instance_method_with_0_args(word, GET_STRING), $CATEGORY, pos, $INFO, new_info)), sentence_result);
                        }
                    }
                }
            }
            return nreverse(sentence_result);
        }
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @param LEXICON
     * 		abstract-lexicon-p (actually, must be a term-lexicon-p)
     * @param AGGRESSIVE-RETOKENIZATION?
    boolean
     * 		
     * @param OUTPUT-SPEC
     * 		keyword-p (expected to change in the near future)
     * @param FILTER
    cycl-denotational-term-p
     * 		
     * @return listp of WORD-Ps
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@param LEXICON\r\n\t\tabstract-lexicon-p (actually, must be a term-lexicon-p)\r\n@param AGGRESSIVE-RETOKENIZATION?\nboolean\r\n\t\t\r\n@param OUTPUT-SPEC\r\n\t\tkeyword-p (expected to change in the near future)\r\n@param FILTER\ncycl-denotational-term-p\r\n\t\t\r\n@return listp of WORD-Ps")
    public static SubLObject concept_tagger_process_sentence_with_syntactic_parser(final SubLObject sentence, final SubLObject lexicon, final SubLObject aggressive_retokenizationP, SubLObject output_spec, SubLObject filter) {
        if (output_spec == UNPROVIDED) {
            output_spec = NIL;
        }
        if (filter == UNPROVIDED) {
            filter = NIL;
        }
        SubLObject sentence_result = NIL;
        final SubLObject string = document.sentence_string(sentence);
        final SubLObject syntax = sentence_string_denotation_mapper_get_lexified_syntax(string, lexicon, aggressive_retokenizationP);
        if (NIL != syntax) {
            SubLObject cdolist_list_var;
            final SubLObject yield = cdolist_list_var = methods.funcall_instance_method_with_0_args(syntax, YIELD);
            SubLObject word = NIL;
            word = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject lexes = methods.funcall_instance_method_with_0_args(word, GET_LEXES);
                final SubLObject interps = remove_duplicates(concept_tagger_extract_interpretations_from_lex_entry(lexes, nl_api_datastructures.output_spec_interp_spec(output_spec), filter), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject pos = parsing_utilities.penntag_to_cycl(symbol_name(methods.funcall_instance_method_with_0_args(word, GET_CATEGORY)));
                final SubLObject new_info = (NIL != interps) ? list($INTERPS, interps, $CYC_POS, pos, $LEX_ENTRIES, lexes) : NIL;
                sentence_result = cons(document.new_word(list($STRING, methods.funcall_instance_method_with_0_args(word, GET_STRING), $CATEGORY, pos, $INFO, new_info)), sentence_result);
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            } 
        }
        return nreverse(sentence_result);
    }

    public static final SubLObject sentence_string_denotation_mapper_get_lexified_syntax_alt(SubLObject sentence_string, SubLObject lexicon, SubLObject aggressiveP) {
        {
            SubLObject syntax = NIL;
            SubLObject error = NIL;
            if (NIL != aggressiveP) {
                syntax = word_linkage.new_word_linkage(sentence_string, list($LEXICON, lexicon));
                if (NIL == syntax) {
                    {
                        SubLObject v_parser = get_default_sentence_string_parser();
                        syntax = methods.funcall_instance_method_with_1_args(v_parser, PARSE, sentence_string);
                    }
                }
            } else {
                {
                    SubLObject v_parser = get_default_sentence_string_parser();
                    syntax = methods.funcall_instance_method_with_1_args(v_parser, PARSE, sentence_string);
                }
                if (NIL == syntax) {
                    syntax = word_linkage.new_word_linkage(sentence_string, list($LEXICON, lexicon));
                }
            }
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            methods.funcall_instance_method_with_1_args(syntax, LEXIFY, lexicon);
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
                Errors.warn($str_alt123$_______________Error_____________);
                Errors.warn($str_alt124$Caught__S_while_processing__S__, error, sentence_string);
            }
            return syntax;
        }
    }

    public static SubLObject sentence_string_denotation_mapper_get_lexified_syntax(final SubLObject sentence_string, final SubLObject lexicon, final SubLObject aggressiveP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject syntax = NIL;
        SubLObject error = NIL;
        if (NIL != aggressiveP) {
            syntax = word_linkage.new_word_linkage(sentence_string, list($LEXICON, lexicon));
            if (NIL == syntax) {
                final SubLObject v_parser = get_default_sentence_string_parser();
                syntax = methods.funcall_instance_method_with_1_args(v_parser, PARSE, sentence_string);
            }
        } else {
            final SubLObject v_parser = get_default_sentence_string_parser();
            syntax = methods.funcall_instance_method_with_1_args(v_parser, PARSE, sentence_string);
            if (NIL == syntax) {
                syntax = word_linkage.new_word_linkage(sentence_string, list($LEXICON, lexicon));
            }
        }
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    methods.funcall_instance_method_with_1_args(syntax, LEXIFY, lexicon);
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
            Errors.warn($str230$_______________Error_____________);
            Errors.warn($str231$Caught__S_while_processing__S__, error, sentence_string);
        }
        return syntax;
    }

    public static final SubLObject sentence_string_denotation_mapper_aggressive_get_lexified_syntax_alt(SubLObject sentence_string, SubLObject lexicon) {
        {
            SubLObject v_linkage = word_linkage.new_word_linkage(sentence_string, list($LEXICON, lexicon));
            SubLObject error = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            methods.funcall_instance_method_with_1_args(v_linkage, LEXIFY, lexicon);
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
                Errors.warn($str_alt123$_______________Error_____________);
                Errors.warn($str_alt124$Caught__S_while_processing__S__, error, sentence_string);
            }
            return v_linkage;
        }
    }

    public static SubLObject sentence_string_denotation_mapper_aggressive_get_lexified_syntax(final SubLObject sentence_string, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_linkage = word_linkage.new_word_linkage(sentence_string, list($LEXICON, lexicon));
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    methods.funcall_instance_method_with_1_args(v_linkage, LEXIFY, lexicon);
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
            Errors.warn($str230$_______________Error_____________);
            Errors.warn($str231$Caught__S_while_processing__S__, error, sentence_string);
        }
        return v_linkage;
    }

    public static final SubLObject sentence_string_denotation_mapper_conservative_get_lexified_syntax_alt(SubLObject sentence_string, SubLObject lexicon) {
        {
            SubLObject v_parser = get_default_sentence_string_parser();
            SubLObject tree = methods.funcall_instance_method_with_1_args(v_parser, PARSE, sentence_string);
            if (NIL != parse_tree.parse_tree_p(tree)) {
                {
                    SubLObject error = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                            try {
                                bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                try {
                                    methods.funcall_instance_method_with_1_args(tree, LEXIFY, lexicon);
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
                        Errors.warn($str_alt123$_______________Error_____________);
                        Errors.warn($str_alt124$Caught__S_while_processing__S__, error, sentence_string);
                    }
                }
            }
            return tree;
        }
    }

    public static SubLObject sentence_string_denotation_mapper_conservative_get_lexified_syntax(final SubLObject sentence_string, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_parser = get_default_sentence_string_parser();
        final SubLObject tree = methods.funcall_instance_method_with_1_args(v_parser, PARSE, sentence_string);
        if (NIL != parse_tree.parse_tree_p(tree)) {
            SubLObject error = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        methods.funcall_instance_method_with_1_args(tree, LEXIFY, lexicon);
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
                Errors.warn($str230$_______________Error_____________);
                Errors.warn($str231$Caught__S_while_processing__S__, error, sentence_string);
            }
        }
        return tree;
    }

    public static final SubLObject concept_tagger_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_concept_tagger(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject concept_tagger_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_concept_tagger(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject concept_tagger_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.concept_tagger.$concept_tagger_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject concept_tagger_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.concept_tagger.$concept_tagger_native.class ? T : NIL;
    }

    public static final SubLObject concept_tagger_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CONCEPT_TAGGER_P);
        return v_object.getField2();
    }

    public static SubLObject concept_tagger_name(final SubLObject v_object) {
        assert NIL != concept_tagger_p(v_object) : "! concept_tagger.concept_tagger_p(v_object) " + "concept_tagger.concept_tagger_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject concept_tagger_tag_method_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CONCEPT_TAGGER_P);
        return v_object.getField3();
    }

    public static SubLObject concept_tagger_tag_method(final SubLObject v_object) {
        assert NIL != concept_tagger_p(v_object) : "! concept_tagger.concept_tagger_p(v_object) " + "concept_tagger.concept_tagger_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject concept_tagger_lexicon_method_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CONCEPT_TAGGER_P);
        return v_object.getField4();
    }

    public static SubLObject concept_tagger_lexicon_method(final SubLObject v_object) {
        assert NIL != concept_tagger_p(v_object) : "! concept_tagger.concept_tagger_p(v_object) " + "concept_tagger.concept_tagger_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_concept_tagger_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CONCEPT_TAGGER_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_concept_tagger_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != concept_tagger_p(v_object) : "! concept_tagger.concept_tagger_p(v_object) " + "concept_tagger.concept_tagger_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_concept_tagger_tag_method_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CONCEPT_TAGGER_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_concept_tagger_tag_method(final SubLObject v_object, final SubLObject value) {
        assert NIL != concept_tagger_p(v_object) : "! concept_tagger.concept_tagger_p(v_object) " + "concept_tagger.concept_tagger_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_concept_tagger_lexicon_method_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CONCEPT_TAGGER_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_concept_tagger_lexicon_method(final SubLObject v_object, final SubLObject value) {
        assert NIL != concept_tagger_p(v_object) : "! concept_tagger.concept_tagger_p(v_object) " + "concept_tagger.concept_tagger_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_concept_tagger_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.concept_tagger.$concept_tagger_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NAME)) {
                        _csetf_concept_tagger_name(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TAG_METHOD)) {
                            _csetf_concept_tagger_tag_method(v_new, current_value);
                        } else {
                            if (pcase_var.eql($LEXICON_METHOD)) {
                                _csetf_concept_tagger_lexicon_method(v_new, current_value);
                            } else {
                                Errors.error($str_alt108$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_concept_tagger(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.concept_tagger.$concept_tagger_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_concept_tagger_name(v_new, current_value);
            } else
                if (pcase_var.eql($TAG_METHOD)) {
                    _csetf_concept_tagger_tag_method(v_new, current_value);
                } else
                    if (pcase_var.eql($LEXICON_METHOD)) {
                        _csetf_concept_tagger_lexicon_method(v_new, current_value);
                    } else {
                        Errors.error($str210$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_concept_tagger(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CONCEPT_TAGGER, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, concept_tagger_name(obj));
        funcall(visitor_fn, obj, $SLOT, $TAG_METHOD, concept_tagger_tag_method(obj));
        funcall(visitor_fn, obj, $SLOT, $LEXICON_METHOD, concept_tagger_lexicon_method(obj));
        funcall(visitor_fn, obj, $END, MAKE_CONCEPT_TAGGER, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_concept_tagger_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_concept_tagger(obj, visitor_fn);
    }

    public static final SubLObject print_concept_tagger_alt(SubLObject ctagger, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str_alt142$__Concept_Tagger__A_, concept_tagger_name(ctagger));
        return ctagger;
    }

    public static SubLObject print_concept_tagger(final SubLObject ctagger, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str252$__Concept_Tagger__A_, concept_tagger_name(ctagger));
        return ctagger;
    }

    public static final SubLObject declare_concept_tagger_alt(SubLObject ctagger_name, SubLObject ctagger_method, SubLObject lexicon_method) {
        if (lexicon_method == UNPROVIDED) {
            lexicon_method = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ctagger = make_concept_tagger(UNPROVIDED);
                _csetf_concept_tagger_name(ctagger, ctagger_name);
                _csetf_concept_tagger_tag_method(ctagger, ctagger_method);
                _csetf_concept_tagger_lexicon_method(ctagger, lexicon_method);
                dictionary.dictionary_enter($registered_concept_taggers$.getDynamicValue(thread), ctagger_name, ctagger);
                return ctagger;
            }
        }
    }

    public static SubLObject declare_concept_tagger(final SubLObject ctagger_name, final SubLObject ctagger_method, SubLObject lexicon_method) {
        if (lexicon_method == UNPROVIDED) {
            lexicon_method = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ctagger = make_concept_tagger(UNPROVIDED);
        _csetf_concept_tagger_name(ctagger, ctagger_name);
        _csetf_concept_tagger_tag_method(ctagger, ctagger_method);
        _csetf_concept_tagger_lexicon_method(ctagger, lexicon_method);
        dictionary.dictionary_enter($registered_concept_taggers$.getDynamicValue(thread), ctagger_name, ctagger);
        return ctagger;
    }

    public static final SubLObject concept_tagger_get_tag_method_alt(SubLObject ctagger_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ctagger = dictionary.dictionary_lookup($registered_concept_taggers$.getDynamicValue(thread), ctagger_name, UNPROVIDED);
                if (NIL == ctagger) {
                    Errors.error($str_alt143$_S_is_not_a_registered_concept_ta, ctagger_name);
                }
                return concept_tagger_tag_method(ctagger);
            }
        }
    }

    public static SubLObject concept_tagger_get_tag_method(final SubLObject ctagger_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ctagger = dictionary.dictionary_lookup($registered_concept_taggers$.getDynamicValue(thread), ctagger_name, UNPROVIDED);
        if (NIL == ctagger) {
            Errors.error($str253$_S_is_not_a_registered_concept_ta, ctagger_name);
        }
        return concept_tagger_tag_method(ctagger);
    }

    public static final SubLObject concept_tagger_get_lexicon_method_alt(SubLObject ctagger_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ctagger = dictionary.dictionary_lookup($registered_concept_taggers$.getDynamicValue(thread), ctagger_name, UNPROVIDED);
                if (NIL == ctagger) {
                    Errors.error($str_alt144$_S_is_not_a_registered_concept_ta, ctagger_name);
                }
                return concept_tagger_lexicon_method(ctagger);
            }
        }
    }

    public static SubLObject concept_tagger_get_lexicon_method(final SubLObject ctagger_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ctagger = dictionary.dictionary_lookup($registered_concept_taggers$.getDynamicValue(thread), ctagger_name, UNPROVIDED);
        if (NIL == ctagger) {
            Errors.error($str254$_S_is_not_a_registered_concept_ta, ctagger_name);
        }
        return concept_tagger_lexicon_method(ctagger);
    }

    public static final SubLObject default_lexicon_for_concept_tagger_alt(SubLObject ctagger_name) {
        return funcall(concept_tagger_get_lexicon_method(ctagger_name));
    }

    public static SubLObject default_lexicon_for_concept_tagger(final SubLObject ctagger_name) {
        return funcall(concept_tagger_get_lexicon_method(ctagger_name));
    }

    public static final SubLObject default_concept_tagging_domain_mt_alt() {
        return NIL;
    }

    public static SubLObject default_concept_tagging_domain_mt() {
        return NIL;
    }

    public static final SubLObject tag_concepts_fast_alt(SubLObject sentence, SubLObject lexicon, SubLObject output_spec) {
        {
            SubLObject lexified_sentence = methods.funcall_instance_method_with_1_args(lexicon, LEXIFY_SENTENCE, pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), sentence));
            SubLObject filters = methods.funcall_instance_method_with_0_args(lexicon, GET_CONCEPT_FILTER_SPECS);
            SubLObject vector_var = document.sentence_yield(lexified_sentence);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject word = aref(vector_var, element_num);
                    SubLObject lexes = document.word_info(word);
                    SubLObject interps = remove_duplicates(concept_tagger_extract_interpretations_from_lex_entry(lexes, nl_api_datastructures.output_spec_interp_spec(output_spec), filters), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject new_info = list($INTERPS, interps, $CYC_POS, NIL != lexes ? ((SubLObject) (methods.funcall_instance_method_with_1_args(lexes.first(), GET, $CYC_POS))) : NIL, $LEX_ENTRIES, lexes);
                    document.sign_update(word, list($INFO, new_info));
                }
            }
            disambiguation.disambiguate_sentence(lexified_sentence);
            return lexified_sentence;
        }
    }

    public static SubLObject tag_concepts_fast(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec) {
        return tag_concepts_fast_int(sentence, lexicon, output_spec, LEXIFY_SENTENCE);
    }

    public static SubLObject tag_concepts_fast_exhaustively(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec) {
        return tag_concepts_fast_int(sentence, lexicon, output_spec, LEXIFY_SENTENCE_EXHAUSTIVELY);
    }

    public static SubLObject tag_concepts_fast_int(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec, final SubLObject tag_method) {
        final SubLObject lexified_sentence = methods.funcall_instance_method_with_1_args(lexicon, tag_method, sentence);
        final SubLObject filters = methods.funcall_instance_method_with_0_args(lexicon, GET_CONCEPT_FILTER_SPECS);
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(lexified_sentence);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject lexes = document.word_info(word);
            final SubLObject interps = remove_duplicates(concept_tagger_extract_interpretations_from_lex_entry(lexes, nl_api_datastructures.output_spec_interp_spec(output_spec), filters), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject new_info = list($INTERPS, interps, $CYC_POS, NIL != lexes ? methods.funcall_instance_method_with_1_args(lexes.first(), GET, $CYC_POS) : NIL, $LEX_ENTRIES, lexes);
            document.sign_update(word, list($INFO, new_info));
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        disambiguation.disambiguate_sentence(lexified_sentence);
        return lexified_sentence;
    }

    public static SubLObject tag_concepts_using_pos_tags(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec) {
        final SubLObject pos_tagged_sentence = pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), sentence);
        return tag_concepts_fast(pos_tagged_sentence, lexicon, output_spec);
    }

    public static SubLObject tag_concepts_exhaustively_using_pos_tags(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec) {
        final SubLObject pos_tagged_sentence = pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), sentence);
        return tag_concepts_fast_exhaustively(pos_tagged_sentence, lexicon, output_spec);
    }

    public static final SubLObject get_default_concept_tagger_lexicon_alt(SubLObject filter) {
        if (filter == UNPROVIDED) {
            filter = NIL;
        }
        return NIL != concept_filter.concept_filter_specification_p(filter) ? ((SubLObject) (get_default_concept_tagger_lexicon_for_filter(filter))) : get_default_sentence_string_lexicon();
    }

    public static SubLObject get_default_concept_tagger_lexicon(SubLObject filter) {
        if (filter == UNPROVIDED) {
            filter = NIL;
        }
        return NIL != concept_filter.concept_filter_specification_p(filter) ? get_default_concept_tagger_lexicon_for_filter(filter) : get_default_sentence_string_lexicon();
    }

    /**
     *
     *
     * @unknown -- Consider caching this, if we know when to clear it.
     */
    @LispMethod(comment = "@unknown -- Consider caching this, if we know when to clear it.")
    public static final SubLObject get_default_concept_tagger_lexicon_for_filter_alt(SubLObject filter) {
        {
            SubLObject lexicon = make_default_concept_tagger_lexicon();
            methods.funcall_instance_method_with_1_args(lexicon, ADD_CONCEPT_FILTER_SPEC, filter);
            return lexicon;
        }
    }

    /**
     *
     *
     * @unknown -- Consider caching this, if we know when to clear it.
     */
    @LispMethod(comment = "@unknown -- Consider caching this, if we know when to clear it.")
    public static SubLObject get_default_concept_tagger_lexicon_for_filter(final SubLObject filter) {
        final SubLObject lexicon = make_default_concept_tagger_lexicon();
        methods.funcall_instance_method_with_1_args(lexicon, ADD_CONCEPT_FILTER_SPEC, filter);
        return lexicon;
    }

    public static final SubLObject make_default_concept_tagger_lexicon_alt() {
        {
            SubLObject lexicon = object.new_class_instance(TERM_LEXICON);
            methods.funcall_instance_method_with_1_args(lexicon, SET_CASE_SENSITIVITY, $OFF);
            methods.funcall_instance_method_with_1_args(lexicon, ALLOW_PREDICATE, $$preferredNameString);
            methods.funcall_instance_method_with_1_args(lexicon, EXCLUDE_PREDICATE, $$ksTermString);
            methods.funcall_instance_method_with_1_args(lexicon, EXCLUDE_POS, $$ClosedClassWord);
            methods.funcall_instance_method_with_1_args(lexicon, ADD_LEARNER, NUMBER_LEARN);
            methods.funcall_instance_method_with_1_args(lexicon, ALLOW_MT, $$RelationParaphraseMt);
            if (NIL != named_entity_recognizer.stanford_ner_ping(UNPROVIDED, UNPROVIDED)) {
                methods.funcall_instance_method_with_1_args(lexicon, ADD_LEARNER, STANFORD_NER_DATE_LEARN);
            }
            return lexicon;
        }
    }

    public static SubLObject make_default_concept_tagger_lexicon() {
        final SubLObject lexicon = object.new_class_instance(TERM_LEXICON);
        methods.funcall_instance_method_with_1_args(lexicon, SET_CASE_SENSITIVITY, $OFF);
        methods.funcall_instance_method_with_1_args(lexicon, ALLOW_PREDICATE, $$preferredNameString);
        methods.funcall_instance_method_with_1_args(lexicon, EXCLUDE_PREDICATE, $$ksTermString);
        methods.funcall_instance_method_with_1_args(lexicon, EXCLUDE_POS, $$ClosedClassWord);
        methods.funcall_instance_method_with_1_args(lexicon, ADD_LEARNER, NUMBER_LEARN);
        methods.funcall_instance_method_with_1_args(lexicon, ALLOW_MT, $$RelationParaphraseMt);
        if (NIL != named_entity_recognizer.stanford_ner_ping(UNPROVIDED, UNPROVIDED)) {
            methods.funcall_instance_method_with_1_args(lexicon, ADD_LEARNER, STANFORD_NER_DATE_LEARN);
        }
        return lexicon;
    }

    public static final SubLObject get_default_sentence_string_lexicon_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == abstract_lexicon.abstract_lexicon_p($default_sentence_string_lexicon$.getDynamicValue(thread))) {
                $default_sentence_string_lexicon$.setDynamicValue(make_default_concept_tagger_lexicon(), thread);
            }
            return $default_sentence_string_lexicon$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_default_sentence_string_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == abstract_lexicon.abstract_lexicon_p($default_sentence_string_lexicon$.getDynamicValue(thread))) {
            $default_sentence_string_lexicon$.setDynamicValue(make_default_concept_tagger_lexicon(), thread);
        }
        return $default_sentence_string_lexicon$.getDynamicValue(thread);
    }

    public static final SubLObject get_default_sentence_string_parser_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == parser.stanford_parser_p($default_sentence_string_parser$.getDynamicValue(thread))) {
                $default_sentence_string_parser$.setDynamicValue(parser.new_stanford_parser($WARN, UNPROVIDED), thread);
            }
            return $default_sentence_string_parser$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_default_sentence_string_parser() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == parser.stanford_parser_p($default_sentence_string_parser$.getDynamicValue(thread))) {
            $default_sentence_string_parser$.setDynamicValue(parser.new_stanford_parser($WARN, UNPROVIDED), thread);
        }
        return $default_sentence_string_parser$.getDynamicValue(thread);
    }

    public static final SubLObject concept_tagger_extract_interpretations_from_lex_entry_alt(SubLObject lex_entries, SubLObject output_spec, SubLObject filters) {
        if (filters == UNPROVIDED) {
            filters = $list_alt166;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject cdolist_list_var = lex_entries;
                SubLObject raw_lex_entry = NIL;
                for (raw_lex_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , raw_lex_entry = cdolist_list_var.first()) {
                    {
                        SubLObject lex_entry = (NIL != cyclifier.ranked_lex_entry_p(raw_lex_entry)) ? ((SubLObject) (cyclifier.rle_lex(raw_lex_entry))) : raw_lex_entry;
                        SubLObject intermed_result = methods.funcall_instance_method_with_1_args(lex_entry, GET, $DENOT);
                        SubLObject intermed_results = NIL;
                        if ((NIL != filters) && (NIL == non_trie_lex_entry_p(lex_entry))) {
                            intermed_results = concept_tagger_accepted_terms(intermed_result, filters, UNPROVIDED);
                        } else {
                            intermed_results = list(intermed_result);
                        }
                        {
                            SubLObject cdolist_list_var_57 = intermed_results;
                            SubLObject intermed_result_58 = NIL;
                            for (intermed_result_58 = cdolist_list_var_57.first(); NIL != cdolist_list_var_57; cdolist_list_var_57 = cdolist_list_var_57.rest() , intermed_result_58 = cdolist_list_var_57.first()) {
                                {
                                    SubLObject new_interp = nl_api_datastructures.new_nl_interpretation(UNPROVIDED);
                                    if (NIL != nl_api_datastructures.nl_interp_spec_return_cyclP(output_spec)) {
                                        new_interp = putf(new_interp, $CYCL, intermed_result_58);
                                    }
                                    if (NIL != nl_api_datastructures.nl_interp_spec_return_phrase_typesP(output_spec)) {
                                        new_interp = putf(new_interp, $PHRASE_TYPES, list(methods.funcall_instance_method_with_1_args(lex_entry, GET, $CYC_POS)));
                                    }
                                    if (NIL != nl_api_datastructures.nl_interp_spec_return_head_inflectionsP(output_spec)) {
                                        new_interp = putf(new_interp, $INFLECTIONS, methods.funcall_instance_method_with_1_args(lex_entry, GET, $INFLECTIONS));
                                    }
                                    if ((NIL != nl_api_datastructures.nl_interp_spec_return_pragmaticsP(output_spec)) && (NIL != methods.funcall_instance_method_with_1_args(lex_entry, GET, $PRAGMATICS))) {
                                        new_interp = putf(new_interp, $PRAGMATICS, methods.funcall_instance_method_with_1_args(lex_entry, GET, $PRAGMATICS));
                                    }
                                    result = cons(new_interp, result);
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject final_result = NIL;
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$InferencePSC);
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            final_result = list_utilities.remove_subsumed_items(remove_duplicates(result, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED), $sym173$PARSING_REWRITE_OF_INVERSE_, GET_NL_INTERP_CYCL);
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return final_result;
                }
            }
        }
    }

    public static SubLObject concept_tagger_extract_interpretations_from_lex_entry(final SubLObject lex_entries, final SubLObject output_spec, SubLObject filters) {
        if (filters == UNPROVIDED) {
            filters = $list275;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject cdolist_list_var = lex_entries;
        SubLObject raw_lex_entry = NIL;
        raw_lex_entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject lex_entry = (NIL != cyclifier.ranked_lex_entry_p(raw_lex_entry)) ? cyclifier.rle_lex(raw_lex_entry) : raw_lex_entry;
            final SubLObject intermed_result = methods.funcall_instance_method_with_1_args(lex_entry, GET, $DENOT);
            SubLObject intermed_results = NIL;
            if ((NIL != filters) && (NIL == non_trie_lex_entry_p(lex_entry))) {
                intermed_results = concept_tagger_accepted_terms(intermed_result, filters, UNPROVIDED);
            } else {
                intermed_results = list(intermed_result);
            }
            SubLObject cdolist_list_var_$125 = intermed_results;
            SubLObject intermed_result_$126 = NIL;
            intermed_result_$126 = cdolist_list_var_$125.first();
            while (NIL != cdolist_list_var_$125) {
                SubLObject new_interp = nl_api_datastructures.new_nl_interpretation(UNPROVIDED);
                if (NIL != nl_api_datastructures.nl_interp_spec_return_cyclP(output_spec)) {
                    new_interp = putf(new_interp, $CYCL, intermed_result_$126);
                }
                if (NIL != nl_api_datastructures.nl_interp_spec_return_phrase_typesP(output_spec)) {
                    new_interp = putf(new_interp, $PHRASE_TYPES, list(methods.funcall_instance_method_with_1_args(lex_entry, GET, $CYC_POS)));
                }
                if (NIL != nl_api_datastructures.nl_interp_spec_return_head_inflectionsP(output_spec)) {
                    new_interp = putf(new_interp, $INFLECTIONS, methods.funcall_instance_method_with_1_args(lex_entry, GET, $INFLECTIONS));
                }
                if ((NIL != nl_api_datastructures.nl_interp_spec_return_pragmaticsP(output_spec)) && (NIL != methods.funcall_instance_method_with_1_args(lex_entry, GET, $PRAGMATICS))) {
                    new_interp = putf(new_interp, $PRAGMATICS, methods.funcall_instance_method_with_1_args(lex_entry, GET, $PRAGMATICS));
                }
                result = cons(new_interp, result);
                cdolist_list_var_$125 = cdolist_list_var_$125.rest();
                intermed_result_$126 = cdolist_list_var_$125.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            raw_lex_entry = cdolist_list_var.first();
        } 
        SubLObject final_result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$InferencePSC);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final_result = list_utilities.remove_subsumed_items(remove_duplicates(result, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED), $sym282$PARSING_REWRITE_OF_INVERSE_, GET_NL_INTERP_CYCL);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return final_result;
    }

    public static final SubLObject non_trie_lex_entry_p_alt(SubLObject entry) {
        return makeBoolean(!((NIL != abstract_lexicon.lex_entry_p(entry)) && (NIL != methods.funcall_instance_method_with_1_args(entry, GET, $TRIE_ENTRY))));
    }

    public static SubLObject non_trie_lex_entry_p(final SubLObject entry) {
        return makeBoolean((NIL == abstract_lexicon.lex_entry_p(entry)) || (NIL == methods.funcall_instance_method_with_1_args(entry, GET, $TRIE_ENTRY)));
    }

    public static final SubLObject augment_tag_concepts_optional_arg_plist_with_defaults_alt(SubLObject optional_arg_plist) {
        {
            SubLObject plist_to_return = list_utilities.augment_plist_with_defaults(optional_arg_plist, list($SENSE_TAGGER, SIMPLE_CONCEPT_TAGGER));
            if (NIL != nl_api_datastructures.nl_interpretation_spec_p(getf(optional_arg_plist, $OUTPUT_SPEC, UNPROVIDED))) {
                plist_to_return = putf(plist_to_return, $OUTPUT_SPEC, nl_api_datastructures.new_nl_output_spec($COMPLEX, getf(optional_arg_plist, $INTERP_SPEC, UNPROVIDED)));
            }
            if (NIL == list_utilities.plist_has_keyP(optional_arg_plist, $LEXICON)) {
                {
                    SubLObject filter = getf(optional_arg_plist, $FILTER, UNPROVIDED);
                    plist_to_return = putf(plist_to_return, $LEXICON, get_default_concept_tagger_lexicon(filter));
                }
            }
            if (NIL == list_utilities.plist_has_keyP(optional_arg_plist, $OUTPUT_SPEC)) {
                plist_to_return = putf(plist_to_return, $OUTPUT_SPEC, nl_api_datastructures.new_nl_output_spec($SIMPLE, nl_api_datastructures.new_nl_interpretation_spec(UNPROVIDED)));
            }
            return plist_to_return;
        }
    }

    public static SubLObject augment_tag_concepts_optional_arg_plist_with_defaults(final SubLObject optional_arg_plist) {
        SubLObject plist_to_return = list_utilities.augment_plist_with_defaults(optional_arg_plist, list($SENSE_TAGGER, POS_TAGGING_CONCEPT_TAGGER));
        if (NIL != nl_api_datastructures.nl_interpretation_spec_p(getf(optional_arg_plist, $OUTPUT_SPEC, UNPROVIDED))) {
            plist_to_return = putf(plist_to_return, $OUTPUT_SPEC, nl_api_datastructures.new_nl_output_spec($COMPLEX, getf(optional_arg_plist, $INTERP_SPEC, UNPROVIDED)));
        }
        if (NIL == list_utilities.plist_has_keyP(optional_arg_plist, $LEXICON)) {
            final SubLObject filter = getf(optional_arg_plist, $FILTER, UNPROVIDED);
            plist_to_return = putf(plist_to_return, $LEXICON, get_default_concept_tagger_lexicon(filter));
        }
        if (NIL == list_utilities.plist_has_keyP(optional_arg_plist, $OUTPUT_SPEC)) {
            plist_to_return = putf(plist_to_return, $OUTPUT_SPEC, nl_api_datastructures.new_nl_output_spec($SIMPLE, nl_api_datastructures.new_nl_interpretation_spec(UNPROVIDED)));
        }
        return plist_to_return;
    }

    public static final SubLObject concept_tagger_accepted_terms_alt(SubLObject v_term, SubLObject filters, SubLObject mt) {
        if (filters == UNPROVIDED) {
            filters = $list_alt166;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject accepted_terms = NIL;
            SubLObject cdolist_list_var = filters;
            SubLObject filter = NIL;
            for (filter = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , filter = cdolist_list_var.first()) {
                accepted_terms = cons(concept_tagger_accepted_terms_int(v_term, filter, mt), accepted_terms);
            }
            return creduce(INTERSECTION, accepted_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject concept_tagger_accepted_terms(final SubLObject v_term, SubLObject filters, SubLObject mt) {
        if (filters == UNPROVIDED) {
            filters = $list275;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject accepted_terms = NIL;
        SubLObject cdolist_list_var = filters;
        SubLObject filter = NIL;
        filter = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            accepted_terms = cons(concept_tagger_accepted_terms_int(v_term, filter, mt), accepted_terms);
            cdolist_list_var = cdolist_list_var.rest();
            filter = cdolist_list_var.first();
        } 
        return creduce(INTERSECTION, accepted_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; a list of CycL terms that should be used in the output based on TERM (they might be genls, of term, or similar)
     */
    @LispMethod(comment = "@return listp; a list of CycL terms that should be used in the output based on TERM (they might be genls, of term, or similar)")
    public static final SubLObject concept_tagger_accepted_terms_int_alt(SubLObject v_term, SubLObject filter, SubLObject mt) {
        if (filter == UNPROVIDED) {
            filter = $DEFAULT;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (filter == $DEFAULT) {
                return ((((NIL != rkf_relevance_utilities.rkf_irrelevant_term(narts_high.nart_substitute(v_term), mt)) || (NIL != isa.quoted_isaP(v_term, $$ImplementationConstant, UNPROVIDED, UNPROVIDED))) || (NIL != cycl_utilities.expression_find_if(KEYWORDP, v_term, UNPROVIDED, UNPROVIDED))) || ((NIL != possibly_nat_p(v_term)) && (cycl_utilities.nat_arg0(v_term) == $$InstanceFn))) || ((NIL != isa.isaP(v_term, $$Collection, UNPROVIDED, UNPROVIDED)) && cardinality_estimates.generality_estimate(v_term).numG($concept_tagger_lexical_generality_cutoff$.getDynamicValue(thread))) ? ((SubLObject) (NIL)) : list(v_term);
            } else {
                if (NIL != concept_filter.concept_filter_specification_p(filter)) {
                    return concept_filter.valid_concept_filter_nodes(v_term, filter);
                } else {
                    return list(v_term);
                }
            }
        }
    }

    /**
     *
     *
     * @return listp; a list of CycL terms that should be used in the output based on TERM (they might be genls, of term, or similar)
     */
    @LispMethod(comment = "@return listp; a list of CycL terms that should be used in the output based on TERM (they might be genls, of term, or similar)")
    public static SubLObject concept_tagger_accepted_terms_int(final SubLObject v_term, SubLObject filter, SubLObject mt) {
        if (filter == UNPROVIDED) {
            filter = $DEFAULT;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (filter == $DEFAULT) {
            return ((((NIL != rkf_relevance_utilities.rkf_irrelevant_term(narts_high.nart_substitute(v_term), mt)) || (NIL != isa.quoted_isaP(v_term, $$ImplementationConstant, UNPROVIDED, UNPROVIDED))) || (NIL != cycl_utilities.expression_find_if(KEYWORDP, v_term, UNPROVIDED, UNPROVIDED))) || (NIL != cycl_utilities.naut_with_functor_p(v_term, $$InstanceFn))) || ((NIL != isa.isaP(v_term, $$Collection, UNPROVIDED, UNPROVIDED)) && cardinality_estimates.generality_estimate(v_term).numG($concept_tagger_lexical_generality_cutoff$.getDynamicValue(thread))) ? NIL : list(v_term);
        }
        if (NIL != concept_filter.concept_filter_specification_p(filter)) {
            return concept_filter.valid_concept_filter_nodes(v_term, filter);
        }
        return list(v_term);
    }

    public static final SubLObject concept_tagger_irrelevant_term_alt(SubLObject v_term, SubLObject filter, SubLObject mt) {
        if (filter == UNPROVIDED) {
            filter = $DEFAULT;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (filter == $DEFAULT) {
            return rkf_relevance_utilities.rkf_irrelevant_term(narts_high.nart_substitute(v_term), mt);
        } else {
            if (NIL != concept_filter.concept_filter_specification_p(filter)) {
                return makeBoolean(NIL == concept_filter.valid_concept_filter_nodes(v_term, filter));
            }
        }
        return NIL;
    }

    public static SubLObject concept_tagger_irrelevant_term(final SubLObject v_term, SubLObject filter, SubLObject mt) {
        if (filter == UNPROVIDED) {
            filter = $DEFAULT;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (filter == $DEFAULT) {
            return rkf_relevance_utilities.rkf_irrelevant_term(narts_high.nart_substitute(v_term), mt);
        }
        if (NIL != concept_filter.concept_filter_specification_p(filter)) {
            return makeBoolean(NIL == concept_filter.valid_concept_filter_nodes(v_term, filter));
        }
        return NIL;
    }

    public static final SubLObject test_concept_tagger_speed_alt(SubLObject string_list, SubLObject filter_num, SubLObject output_file) {
        if (string_list == UNPROVIDED) {
            string_list = $concept_tagger_test_docs$.getDynamicValue();
        }
        if (filter_num == UNPROVIDED) {
            filter_num = FOUR_INTEGER;
        }
        if (output_file == UNPROVIDED) {
            output_file = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total_time = ZERO_INTEGER;
                SubLObject output_string = NIL;
                {
                    SubLObject _prev_bind_0 = $html_stream$.currentBinding(thread);
                    try {
                        $html_stream$.bind(NIL, thread);
                        try {
                            $html_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                            {
                                SubLObject _prev_bind_0_59 = $default_sentence_string_lexicon$.currentBinding(thread);
                                try {
                                    $default_sentence_string_lexicon$.bind(NIL, thread);
                                    {
                                        SubLObject warm_up_arg_list = list($$$T, $list_alt185, $list_alt186, list($str_alt52$filter_id, write_to_string(filter_num, EMPTY_SUBL_OBJECT_ARRAY)));
                                        xml_tag_document(warm_up_arg_list);
                                        Storage.gc_ephemeral();
                                        {
                                            SubLObject time_var = get_internal_real_time();
                                            {
                                                SubLObject cdolist_list_var = string_list;
                                                SubLObject doc_string = NIL;
                                                for (doc_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , doc_string = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject arg_list = list($$$T, list($str_alt59$doc_string, doc_string), $list_alt187, list($str_alt52$filter_id, write_to_string(filter_num, EMPTY_SUBL_OBJECT_ARRAY)));
                                                        xml_tag_document(arg_list);
                                                    }
                                                }
                                            }
                                            total_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                        }
                                        methods.funcall_instance_method_with_0_args($default_sentence_string_lexicon$.getDynamicValue(thread), FORGET);
                                    }
                                } finally {
                                    $default_sentence_string_lexicon$.rebind(_prev_bind_0_59, thread);
                                }
                            }
                            output_string = get_output_stream_string($html_stream$.getDynamicValue(thread));
                        } finally {
                            {
                                SubLObject _prev_bind_0_60 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    close($html_stream$.getDynamicValue(thread), UNPROVIDED);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_60, thread);
                                }
                            }
                        }
                    } finally {
                        $html_stream$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != output_file) {
                    {
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_text(output_file, $OUTPUT, NIL);
                            if (!stream.isStream()) {
                                Errors.error($str_alt190$Unable_to_open__S, output_file);
                            }
                            {
                                SubLObject f = stream;
                                princ(output_string, f);
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (stream.isStream()) {
                                        close(stream, UNPROVIDED);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return total_time;
            }
        }
    }

    public static SubLObject test_concept_tagger_speed(SubLObject string_list, SubLObject filter_num, SubLObject output_file) {
        if (string_list == UNPROVIDED) {
            string_list = $concept_tagger_test_docs$.getDynamicValue();
        }
        if (filter_num == UNPROVIDED) {
            filter_num = FOUR_INTEGER;
        }
        if (output_file == UNPROVIDED) {
            output_file = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total_time = ZERO_INTEGER;
        SubLObject output_string = NIL;
        final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
        try {
            html_macros.$html_stream$.bind(NIL, thread);
            try {
                html_macros.$html_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                final SubLObject _prev_bind_0_$127 = $default_sentence_string_lexicon$.currentBinding(thread);
                try {
                    $default_sentence_string_lexicon$.bind(NIL, thread);
                    final SubLObject warm_up_arg_list = list($$$T, $list294, $list295, list($str77$filter_id, write_to_string(filter_num, EMPTY_SUBL_OBJECT_ARRAY)));
                    xml_tag_document(warm_up_arg_list);
                    Storage.gc_ephemeral();
                    final SubLObject time_var = get_internal_real_time();
                    SubLObject cdolist_list_var = string_list;
                    SubLObject doc_string = NIL;
                    doc_string = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject arg_list = list($$$T, list($str296$doc_string, doc_string), $list297, list($str77$filter_id, write_to_string(filter_num, EMPTY_SUBL_OBJECT_ARRAY)));
                        xml_tag_document(arg_list);
                        cdolist_list_var = cdolist_list_var.rest();
                        doc_string = cdolist_list_var.first();
                    } 
                    total_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    methods.funcall_instance_method_with_0_args($default_sentence_string_lexicon$.getDynamicValue(thread), FORGET);
                } finally {
                    $default_sentence_string_lexicon$.rebind(_prev_bind_0_$127, thread);
                }
                output_string = get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
            } finally {
                final SubLObject _prev_bind_0_$128 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$128, thread);
                }
            }
        } finally {
            html_macros.$html_stream$.rebind(_prev_bind_0, thread);
        }
        if (NIL != output_file) {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(output_file, $OUTPUT);
                if (!stream.isStream()) {
                    Errors.error($str300$Unable_to_open__S, output_file);
                }
                final SubLObject f = stream;
                princ(output_string, f);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return total_time;
    }

    public static SubLObject term_absent_from_doc_interps(final SubLObject doc, final SubLObject v_term) {
        final SubLObject vector_var = document.document_paragraphs(doc);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$129;
        SubLObject backwardP_var_$130;
        SubLObject length_$131;
        SubLObject v_iteration_$132;
        SubLObject element_num_$133;
        SubLObject sentence;
        SubLObject cdolist_list_var;
        SubLObject word;
        SubLObject cdolist_list_var_$134;
        SubLObject interp;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$129 = document.paragraph_sentences(paragraph);
            backwardP_var_$130 = NIL;
            for (length_$131 = length(vector_var_$129), v_iteration_$132 = NIL, v_iteration_$132 = ZERO_INTEGER; v_iteration_$132.numL(length_$131); v_iteration_$132 = add(v_iteration_$132, ONE_INTEGER)) {
                element_num_$133 = (NIL != backwardP_var_$130) ? subtract(length_$131, v_iteration_$132, ONE_INTEGER) : v_iteration_$132;
                sentence = aref(vector_var_$129, element_num_$133);
                cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                word = NIL;
                word = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    cdolist_list_var_$134 = document.word_interps(word);
                    interp = NIL;
                    interp = cdolist_list_var_$134.first();
                    while (NIL != cdolist_list_var_$134) {
                        if (nl_api_datastructures.get_nl_interp_cycl(interp).equal(v_term)) {
                            return NIL;
                        }
                        cdolist_list_var_$134 = cdolist_list_var_$134.rest();
                        interp = cdolist_list_var_$134.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                } 
            }
        }
        return T;
    }

    public static SubLObject term_in_doc_interps(final SubLObject doc, final SubLObject v_term) {
        final SubLObject vector_var = document.document_paragraphs(doc);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$135;
        SubLObject backwardP_var_$136;
        SubLObject length_$137;
        SubLObject v_iteration_$138;
        SubLObject element_num_$139;
        SubLObject sentence;
        SubLObject cdolist_list_var;
        SubLObject word;
        SubLObject cdolist_list_var_$140;
        SubLObject interp;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$135 = document.paragraph_sentences(paragraph);
            backwardP_var_$136 = NIL;
            for (length_$137 = length(vector_var_$135), v_iteration_$138 = NIL, v_iteration_$138 = ZERO_INTEGER; v_iteration_$138.numL(length_$137); v_iteration_$138 = add(v_iteration_$138, ONE_INTEGER)) {
                element_num_$139 = (NIL != backwardP_var_$136) ? subtract(length_$137, v_iteration_$138, ONE_INTEGER) : v_iteration_$138;
                sentence = aref(vector_var_$135, element_num_$139);
                cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                word = NIL;
                word = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    cdolist_list_var_$140 = document.word_interps(word);
                    interp = NIL;
                    interp = cdolist_list_var_$140.first();
                    while (NIL != cdolist_list_var_$140) {
                        if (nl_api_datastructures.get_nl_interp_cycl(interp).equal(v_term)) {
                            return T;
                        }
                        cdolist_list_var_$140 = cdolist_list_var_$140.rest();
                        interp = cdolist_list_var_$140.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static SubLObject get_tagged_document_from_html_args_pos(final SubLObject args) {
        return get_tagged_document_from_html_args(args);
    }

    public static final SubLObject declare_concept_tagger_file_alt() {
        declareFunction("tag_concepts", "TAG-CONCEPTS", 1, 1, false);
        declareFunction("tag_concepts_optional_args_p", "TAG-CONCEPTS-OPTIONAL-ARGS-P", 1, 0, false);
        declareFunction("get_next_sentence_annotation", "GET-NEXT-SENTENCE-ANNOTATION", 1, 0, false);
        declareFunction("annotation_completeP", "ANNOTATION-COMPLETE?", 1, 0, false);
        declareMacro("do_tagged_concepts_results", "DO-TAGGED-CONCEPTS-RESULTS");
        declareFunction("all_tagged_concepts", "ALL-TAGGED-CONCEPTS", 1, 1, false);
        declareFunction("extract_cycl_from_concept_tagger_output", "EXTRACT-CYCL-FROM-CONCEPT-TAGGER-OUTPUT", 1, 0, false);
        declareFunction("tagged_concepts_for_disambiguator", "TAGGED-CONCEPTS-FOR-DISAMBIGUATOR", 1, 1, false);
        declareFunction("xml_tag_document", "XML-TAG-DOCUMENT", 0, 1, false);
        declareFunction("xml_tag_document_int", "XML-TAG-DOCUMENT-INT", 1, 0, false);
        declareFunction("html_tag_document", "HTML-TAG-DOCUMENT", 0, 1, false);
        declareFunction("html_tag_document_int", "HTML-TAG-DOCUMENT-INT", 0, 1, false);
        declareFunction("html_display_tagger_result", "HTML-DISPLAY-TAGGER-RESULT", 1, 0, false);
        declareFunction("get_concept_filter_from_html_args", "GET-CONCEPT-FILTER-FROM-HTML-ARGS", 1, 0, false);
        declareFunction("clear_browser_tagging_lexicons", "CLEAR-BROWSER-TAGGING-LEXICONS", 0, 0, false);
        declareFunction("get_browser_tagging_lexicon", "GET-BROWSER-TAGGING-LEXICON", 2, 0, false);
        declareFunction("get_tagged_document_from_html_args", "GET-TAGGED-DOCUMENT-FROM-HTML-ARGS", 1, 0, false);
        declareFunction("weightG", "WEIGHT>", 2, 0, false);
        declareFunction("allow_document_tagger_restricted_web_service", "ALLOW-DOCUMENT-TAGGER-RESTRICTED-WEB-SERVICE", 0, 0, false);
        declareFunction("cb_tag_document_handler", "CB-TAG-DOCUMENT-HANDLER", 1, 0, false);
        declareFunction("cb_xml_tag_document", "CB-XML-TAG-DOCUMENT", 1, 0, false);
        declareFunction("tag_concepts_iterator_state_print_function_trampoline", "TAG-CONCEPTS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("tag_concepts_iterator_state_p", "TAG-CONCEPTS-ITERATOR-STATE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.concept_tagger.$tag_concepts_iterator_state_p$UnaryFunction();
        declareFunction("tag_concepts_iterator_state_sentences_to_do", "TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO", 1, 0, false);
        declareFunction("tag_concepts_iterator_state_document", "TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT", 1, 0, false);
        declareFunction("tag_concepts_iterator_state_lexicon", "TAG-CONCEPTS-ITERATOR-STATE-LEXICON", 1, 0, false);
        declareFunction("tag_concepts_iterator_state_sense_tagger", "TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER", 1, 0, false);
        declareFunction("tag_concepts_iterator_state_filter", "TAG-CONCEPTS-ITERATOR-STATE-FILTER", 1, 0, false);
        declareFunction("tag_concepts_iterator_state_output_spec", "TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC", 1, 0, false);
        declareFunction("tag_concepts_iterator_state_prepared_sentence_output", "TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT", 1, 0, false);
        declareFunction("_csetf_tag_concepts_iterator_state_sentences_to_do", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO", 2, 0, false);
        declareFunction("_csetf_tag_concepts_iterator_state_document", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT", 2, 0, false);
        declareFunction("_csetf_tag_concepts_iterator_state_lexicon", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-LEXICON", 2, 0, false);
        declareFunction("_csetf_tag_concepts_iterator_state_sense_tagger", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER", 2, 0, false);
        declareFunction("_csetf_tag_concepts_iterator_state_filter", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-FILTER", 2, 0, false);
        declareFunction("_csetf_tag_concepts_iterator_state_output_spec", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC", 2, 0, false);
        declareFunction("_csetf_tag_concepts_iterator_state_prepared_sentence_output", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT", 2, 0, false);
        declareFunction("make_tag_concepts_iterator_state", "MAKE-TAG-CONCEPTS-ITERATOR-STATE", 0, 1, false);
        declareFunction("new_tag_concepts_iterator_state", "NEW-TAG-CONCEPTS-ITERATOR-STATE", 3, 0, false);
        declareFunction("tag_concepts_iterator_state_done_p", "TAG-CONCEPTS-ITERATOR-STATE-DONE-P", 1, 0, false);
        declareFunction("tag_concepts_iterator_state_next", "TAG-CONCEPTS-ITERATOR-STATE-NEXT", 1, 0, false);
        declareFunction("concept_tagger_process_sentence_with_syntactic_parser", "CONCEPT-TAGGER-PROCESS-SENTENCE-WITH-SYNTACTIC-PARSER", 3, 2, false);
        declareFunction("sentence_string_denotation_mapper_get_lexified_syntax", "SENTENCE-STRING-DENOTATION-MAPPER-GET-LEXIFIED-SYNTAX", 3, 0, false);
        declareFunction("sentence_string_denotation_mapper_aggressive_get_lexified_syntax", "SENTENCE-STRING-DENOTATION-MAPPER-AGGRESSIVE-GET-LEXIFIED-SYNTAX", 2, 0, false);
        declareFunction("sentence_string_denotation_mapper_conservative_get_lexified_syntax", "SENTENCE-STRING-DENOTATION-MAPPER-CONSERVATIVE-GET-LEXIFIED-SYNTAX", 2, 0, false);
        declareFunction("concept_tagger_print_function_trampoline", "CONCEPT-TAGGER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("concept_tagger_p", "CONCEPT-TAGGER-P", 1, 0, false);
        new com.cyc.cycjava.cycl.concept_tagger.$concept_tagger_p$UnaryFunction();
        declareFunction("concept_tagger_name", "CONCEPT-TAGGER-NAME", 1, 0, false);
        declareFunction("concept_tagger_tag_method", "CONCEPT-TAGGER-TAG-METHOD", 1, 0, false);
        declareFunction("concept_tagger_lexicon_method", "CONCEPT-TAGGER-LEXICON-METHOD", 1, 0, false);
        declareFunction("_csetf_concept_tagger_name", "_CSETF-CONCEPT-TAGGER-NAME", 2, 0, false);
        declareFunction("_csetf_concept_tagger_tag_method", "_CSETF-CONCEPT-TAGGER-TAG-METHOD", 2, 0, false);
        declareFunction("_csetf_concept_tagger_lexicon_method", "_CSETF-CONCEPT-TAGGER-LEXICON-METHOD", 2, 0, false);
        declareFunction("make_concept_tagger", "MAKE-CONCEPT-TAGGER", 0, 1, false);
        declareFunction("print_concept_tagger", "PRINT-CONCEPT-TAGGER", 1, 2, false);
        declareFunction("declare_concept_tagger", "DECLARE-CONCEPT-TAGGER", 2, 1, false);
        declareFunction("concept_tagger_get_tag_method", "CONCEPT-TAGGER-GET-TAG-METHOD", 1, 0, false);
        declareFunction("concept_tagger_get_lexicon_method", "CONCEPT-TAGGER-GET-LEXICON-METHOD", 1, 0, false);
        declareFunction("default_lexicon_for_concept_tagger", "DEFAULT-LEXICON-FOR-CONCEPT-TAGGER", 1, 0, false);
        declareFunction("default_concept_tagging_domain_mt", "DEFAULT-CONCEPT-TAGGING-DOMAIN-MT", 0, 0, false);
        declareFunction("tag_concepts_fast", "TAG-CONCEPTS-FAST", 3, 0, false);
        declareFunction("get_default_concept_tagger_lexicon", "GET-DEFAULT-CONCEPT-TAGGER-LEXICON", 0, 1, false);
        declareFunction("get_default_concept_tagger_lexicon_for_filter", "GET-DEFAULT-CONCEPT-TAGGER-LEXICON-FOR-FILTER", 1, 0, false);
        declareFunction("make_default_concept_tagger_lexicon", "MAKE-DEFAULT-CONCEPT-TAGGER-LEXICON", 0, 0, false);
        declareFunction("get_default_sentence_string_lexicon", "GET-DEFAULT-SENTENCE-STRING-LEXICON", 0, 0, false);
        declareFunction("get_default_sentence_string_parser", "GET-DEFAULT-SENTENCE-STRING-PARSER", 0, 0, false);
        declareFunction("concept_tagger_extract_interpretations_from_lex_entry", "CONCEPT-TAGGER-EXTRACT-INTERPRETATIONS-FROM-LEX-ENTRY", 2, 1, false);
        declareFunction("non_trie_lex_entry_p", "NON-TRIE-LEX-ENTRY-P", 1, 0, false);
        declareFunction("augment_tag_concepts_optional_arg_plist_with_defaults", "AUGMENT-TAG-CONCEPTS-OPTIONAL-ARG-PLIST-WITH-DEFAULTS", 1, 0, false);
        declareFunction("concept_tagger_accepted_terms", "CONCEPT-TAGGER-ACCEPTED-TERMS", 1, 2, false);
        declareFunction("concept_tagger_accepted_terms_int", "CONCEPT-TAGGER-ACCEPTED-TERMS-INT", 1, 2, false);
        declareFunction("concept_tagger_irrelevant_term", "CONCEPT-TAGGER-IRRELEVANT-TERM", 1, 2, false);
        declareFunction("test_concept_tagger_speed", "TEST-CONCEPT-TAGGER-SPEED", 0, 3, false);
        return NIL;
    }

    public static SubLObject declare_concept_tagger_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("tag_concepts", "TAG-CONCEPTS", 1, 1, false);
            declareFunction("tag_concepts_optional_args_p", "TAG-CONCEPTS-OPTIONAL-ARGS-P", 1, 0, false);
            declareFunction("get_next_sentence_annotation", "GET-NEXT-SENTENCE-ANNOTATION", 1, 0, false);
            declareFunction("annotation_completeP", "ANNOTATION-COMPLETE?", 1, 0, false);
            declareMacro("do_tagged_concepts_results", "DO-TAGGED-CONCEPTS-RESULTS");
            declareFunction("all_tagged_concepts", "ALL-TAGGED-CONCEPTS", 1, 1, false);
            declareFunction("extract_cycl_from_concept_tagger_output", "EXTRACT-CYCL-FROM-CONCEPT-TAGGER-OUTPUT", 1, 0, false);
            declareFunction("tagged_concepts_for_disambiguator", "TAGGED-CONCEPTS-FOR-DISAMBIGUATOR", 1, 1, false);
            declareFunction("xml_tag_document", "XML-TAG-DOCUMENT", 0, 1, false);
            declareFunction("tag_document_xml", "TAG-DOCUMENT-XML", 1, 1, false);
            declareFunction("xml_tag_document_int", "XML-TAG-DOCUMENT-INT", 1, 0, false);
            declareFunction("serialize_xml_sense_tag_for_cycl_term", "SERIALIZE-XML-SENSE-TAG-FOR-CYCL-TERM", 1, 0, false);
            declareFunction("html_tag_document", "HTML-TAG-DOCUMENT", 0, 1, false);
            declareFunction("html_tag_document_int", "HTML-TAG-DOCUMENT-INT", 0, 1, false);
            declareFunction("html_display_tagger_result", "HTML-DISPLAY-TAGGER-RESULT", 1, 0, false);
            declareFunction("get_concept_filter_from_html_args", "GET-CONCEPT-FILTER-FROM-HTML-ARGS", 1, 0, false);
            declareFunction("clear_browser_tagging_lexicons", "CLEAR-BROWSER-TAGGING-LEXICONS", 0, 0, false);
            declareFunction("get_browser_tagging_lexicon", "GET-BROWSER-TAGGING-LEXICON", 2, 2, false);
            declareFunction("get_tagged_document_from_params", "GET-TAGGED-DOCUMENT-FROM-PARAMS", 2, 0, false);
            declareFunction("get_lexical_strength_disambiguator", "GET-LEXICAL-STRENGTH-DISAMBIGUATOR", 1, 0, false);
            declareFunction("get_tagged_document_from_html_args", "GET-TAGGED-DOCUMENT-FROM-HTML-ARGS", 1, 0, false);
            declareFunction("get_tagged_document", "GET-TAGGED-DOCUMENT", 11, 0, false);
            declareFunction("get_disambiguators_from_html_args", "GET-DISAMBIGUATORS-FROM-HTML-ARGS", 1, 0, false);
            declareFunction("get_specs_filters_from_html_args", "GET-SPECS-FILTERS-FROM-HTML-ARGS", 1, 0, false);
            declareFunction("get_instance_filters_from_html_args", "GET-INSTANCE-FILTERS-FROM-HTML-ARGS", 1, 0, false);
            declareFunction("get_specs_filter_terms_from_html_args", "GET-SPECS-FILTER-TERMS-FROM-HTML-ARGS", 1, 0, false);
            declareFunction("get_instance_filter_terms_from_html_args", "GET-INSTANCE-FILTER-TERMS-FROM-HTML-ARGS", 1, 0, false);
            declareFunction("get_case_sensitivity_value", "GET-CASE-SENSITIVITY-VALUE", 1, 0, false);
            declareFunction("get_rdf_tagging_lexicon", "GET-RDF-TAGGING-LEXICON", 0, 0, false);
            declareFunction("get_rdf_tagged_document", "GET-RDF-TAGGED-DOCUMENT", 1, 2, false);
            declareFunction("weightG", "WEIGHT>", 2, 0, false);
            declareFunction("allow_document_tagger_restricted_web_service", "ALLOW-DOCUMENT-TAGGER-RESTRICTED-WEB-SERVICE", 0, 0, false);
            declareFunction("cb_tag_document_handler", "CB-TAG-DOCUMENT-HANDLER", 1, 0, false);
            declareFunction("cb_xml_tag_document", "CB-XML-TAG-DOCUMENT", 1, 0, false);
            declareFunction("tag_concepts_iterator_state_print_function_trampoline", "TAG-CONCEPTS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("tag_concepts_iterator_state_p", "TAG-CONCEPTS-ITERATOR-STATE-P", 1, 0, false);
            new concept_tagger.$tag_concepts_iterator_state_p$UnaryFunction();
            declareFunction("tag_concepts_iterator_state_sentences_to_do", "TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO", 1, 0, false);
            declareFunction("tag_concepts_iterator_state_document", "TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT", 1, 0, false);
            declareFunction("tag_concepts_iterator_state_lexicon", "TAG-CONCEPTS-ITERATOR-STATE-LEXICON", 1, 0, false);
            declareFunction("tag_concepts_iterator_state_sense_tagger", "TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER", 1, 0, false);
            declareFunction("tag_concepts_iterator_state_filter", "TAG-CONCEPTS-ITERATOR-STATE-FILTER", 1, 0, false);
            declareFunction("tag_concepts_iterator_state_output_spec", "TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC", 1, 0, false);
            declareFunction("tag_concepts_iterator_state_prepared_sentence_output", "TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT", 1, 0, false);
            declareFunction("_csetf_tag_concepts_iterator_state_sentences_to_do", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO", 2, 0, false);
            declareFunction("_csetf_tag_concepts_iterator_state_document", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT", 2, 0, false);
            declareFunction("_csetf_tag_concepts_iterator_state_lexicon", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-LEXICON", 2, 0, false);
            declareFunction("_csetf_tag_concepts_iterator_state_sense_tagger", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER", 2, 0, false);
            declareFunction("_csetf_tag_concepts_iterator_state_filter", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-FILTER", 2, 0, false);
            declareFunction("_csetf_tag_concepts_iterator_state_output_spec", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC", 2, 0, false);
            declareFunction("_csetf_tag_concepts_iterator_state_prepared_sentence_output", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT", 2, 0, false);
            declareFunction("make_tag_concepts_iterator_state", "MAKE-TAG-CONCEPTS-ITERATOR-STATE", 0, 1, false);
            declareFunction("visit_defstruct_tag_concepts_iterator_state", "VISIT-DEFSTRUCT-TAG-CONCEPTS-ITERATOR-STATE", 2, 0, false);
            declareFunction("visit_defstruct_object_tag_concepts_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-TAG-CONCEPTS-ITERATOR-STATE-METHOD", 2, 0, false);
            declareFunction("new_tag_concepts_iterator_state", "NEW-TAG-CONCEPTS-ITERATOR-STATE", 3, 0, false);
            declareFunction("tag_concepts_iterator_state_done_p", "TAG-CONCEPTS-ITERATOR-STATE-DONE-P", 1, 0, false);
            declareFunction("tag_concepts_iterator_state_next", "TAG-CONCEPTS-ITERATOR-STATE-NEXT", 1, 0, false);
            declareFunction("concept_tagger_process_sentence_with_syntactic_parser", "CONCEPT-TAGGER-PROCESS-SENTENCE-WITH-SYNTACTIC-PARSER", 3, 2, false);
            declareFunction("sentence_string_denotation_mapper_get_lexified_syntax", "SENTENCE-STRING-DENOTATION-MAPPER-GET-LEXIFIED-SYNTAX", 3, 0, false);
            declareFunction("sentence_string_denotation_mapper_aggressive_get_lexified_syntax", "SENTENCE-STRING-DENOTATION-MAPPER-AGGRESSIVE-GET-LEXIFIED-SYNTAX", 2, 0, false);
            declareFunction("sentence_string_denotation_mapper_conservative_get_lexified_syntax", "SENTENCE-STRING-DENOTATION-MAPPER-CONSERVATIVE-GET-LEXIFIED-SYNTAX", 2, 0, false);
            declareFunction("concept_tagger_print_function_trampoline", "CONCEPT-TAGGER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("concept_tagger_p", "CONCEPT-TAGGER-P", 1, 0, false);
            new concept_tagger.$concept_tagger_p$UnaryFunction();
            declareFunction("concept_tagger_name", "CONCEPT-TAGGER-NAME", 1, 0, false);
            declareFunction("concept_tagger_tag_method", "CONCEPT-TAGGER-TAG-METHOD", 1, 0, false);
            declareFunction("concept_tagger_lexicon_method", "CONCEPT-TAGGER-LEXICON-METHOD", 1, 0, false);
            declareFunction("_csetf_concept_tagger_name", "_CSETF-CONCEPT-TAGGER-NAME", 2, 0, false);
            declareFunction("_csetf_concept_tagger_tag_method", "_CSETF-CONCEPT-TAGGER-TAG-METHOD", 2, 0, false);
            declareFunction("_csetf_concept_tagger_lexicon_method", "_CSETF-CONCEPT-TAGGER-LEXICON-METHOD", 2, 0, false);
            declareFunction("make_concept_tagger", "MAKE-CONCEPT-TAGGER", 0, 1, false);
            declareFunction("visit_defstruct_concept_tagger", "VISIT-DEFSTRUCT-CONCEPT-TAGGER", 2, 0, false);
            declareFunction("visit_defstruct_object_concept_tagger_method", "VISIT-DEFSTRUCT-OBJECT-CONCEPT-TAGGER-METHOD", 2, 0, false);
            declareFunction("print_concept_tagger", "PRINT-CONCEPT-TAGGER", 1, 2, false);
            declareFunction("declare_concept_tagger", "DECLARE-CONCEPT-TAGGER", 2, 1, false);
            declareFunction("concept_tagger_get_tag_method", "CONCEPT-TAGGER-GET-TAG-METHOD", 1, 0, false);
            declareFunction("concept_tagger_get_lexicon_method", "CONCEPT-TAGGER-GET-LEXICON-METHOD", 1, 0, false);
            declareFunction("default_lexicon_for_concept_tagger", "DEFAULT-LEXICON-FOR-CONCEPT-TAGGER", 1, 0, false);
            declareFunction("default_concept_tagging_domain_mt", "DEFAULT-CONCEPT-TAGGING-DOMAIN-MT", 0, 0, false);
            declareFunction("tag_concepts_fast", "TAG-CONCEPTS-FAST", 3, 0, false);
            declareFunction("tag_concepts_fast_exhaustively", "TAG-CONCEPTS-FAST-EXHAUSTIVELY", 3, 0, false);
            declareFunction("tag_concepts_fast_int", "TAG-CONCEPTS-FAST-INT", 4, 0, false);
            declareFunction("tag_concepts_using_pos_tags", "TAG-CONCEPTS-USING-POS-TAGS", 3, 0, false);
            declareFunction("tag_concepts_exhaustively_using_pos_tags", "TAG-CONCEPTS-EXHAUSTIVELY-USING-POS-TAGS", 3, 0, false);
            declareFunction("get_default_concept_tagger_lexicon", "GET-DEFAULT-CONCEPT-TAGGER-LEXICON", 0, 1, false);
            declareFunction("get_default_concept_tagger_lexicon_for_filter", "GET-DEFAULT-CONCEPT-TAGGER-LEXICON-FOR-FILTER", 1, 0, false);
            declareFunction("make_default_concept_tagger_lexicon", "MAKE-DEFAULT-CONCEPT-TAGGER-LEXICON", 0, 0, false);
            declareFunction("get_default_sentence_string_lexicon", "GET-DEFAULT-SENTENCE-STRING-LEXICON", 0, 0, false);
            declareFunction("get_default_sentence_string_parser", "GET-DEFAULT-SENTENCE-STRING-PARSER", 0, 0, false);
            declareFunction("concept_tagger_extract_interpretations_from_lex_entry", "CONCEPT-TAGGER-EXTRACT-INTERPRETATIONS-FROM-LEX-ENTRY", 2, 1, false);
            declareFunction("non_trie_lex_entry_p", "NON-TRIE-LEX-ENTRY-P", 1, 0, false);
            declareFunction("augment_tag_concepts_optional_arg_plist_with_defaults", "AUGMENT-TAG-CONCEPTS-OPTIONAL-ARG-PLIST-WITH-DEFAULTS", 1, 0, false);
            declareFunction("concept_tagger_accepted_terms", "CONCEPT-TAGGER-ACCEPTED-TERMS", 1, 2, false);
            declareFunction("concept_tagger_accepted_terms_int", "CONCEPT-TAGGER-ACCEPTED-TERMS-INT", 1, 2, false);
            declareFunction("concept_tagger_irrelevant_term", "CONCEPT-TAGGER-IRRELEVANT-TERM", 1, 2, false);
            declareFunction("test_concept_tagger_speed", "TEST-CONCEPT-TAGGER-SPEED", 0, 3, false);
            declareFunction("term_absent_from_doc_interps", "TERM-ABSENT-FROM-DOC-INTERPS", 2, 0, false);
            declareFunction("term_in_doc_interps", "TERM-IN-DOC-INTERPS", 2, 0, false);
            declareFunction("get_tagged_document_from_html_args_pos", "GET-TAGGED-DOCUMENT-FROM-HTML-ARGS-POS", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("get_browser_tagging_lexicon", "GET-BROWSER-TAGGING-LEXICON", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_concept_tagger_file_Previous() {
        declareFunction("tag_concepts", "TAG-CONCEPTS", 1, 1, false);
        declareFunction("tag_concepts_optional_args_p", "TAG-CONCEPTS-OPTIONAL-ARGS-P", 1, 0, false);
        declareFunction("get_next_sentence_annotation", "GET-NEXT-SENTENCE-ANNOTATION", 1, 0, false);
        declareFunction("annotation_completeP", "ANNOTATION-COMPLETE?", 1, 0, false);
        declareMacro("do_tagged_concepts_results", "DO-TAGGED-CONCEPTS-RESULTS");
        declareFunction("all_tagged_concepts", "ALL-TAGGED-CONCEPTS", 1, 1, false);
        declareFunction("extract_cycl_from_concept_tagger_output", "EXTRACT-CYCL-FROM-CONCEPT-TAGGER-OUTPUT", 1, 0, false);
        declareFunction("tagged_concepts_for_disambiguator", "TAGGED-CONCEPTS-FOR-DISAMBIGUATOR", 1, 1, false);
        declareFunction("xml_tag_document", "XML-TAG-DOCUMENT", 0, 1, false);
        declareFunction("tag_document_xml", "TAG-DOCUMENT-XML", 1, 1, false);
        declareFunction("xml_tag_document_int", "XML-TAG-DOCUMENT-INT", 1, 0, false);
        declareFunction("serialize_xml_sense_tag_for_cycl_term", "SERIALIZE-XML-SENSE-TAG-FOR-CYCL-TERM", 1, 0, false);
        declareFunction("html_tag_document", "HTML-TAG-DOCUMENT", 0, 1, false);
        declareFunction("html_tag_document_int", "HTML-TAG-DOCUMENT-INT", 0, 1, false);
        declareFunction("html_display_tagger_result", "HTML-DISPLAY-TAGGER-RESULT", 1, 0, false);
        declareFunction("get_concept_filter_from_html_args", "GET-CONCEPT-FILTER-FROM-HTML-ARGS", 1, 0, false);
        declareFunction("clear_browser_tagging_lexicons", "CLEAR-BROWSER-TAGGING-LEXICONS", 0, 0, false);
        declareFunction("get_browser_tagging_lexicon", "GET-BROWSER-TAGGING-LEXICON", 2, 2, false);
        declareFunction("get_tagged_document_from_params", "GET-TAGGED-DOCUMENT-FROM-PARAMS", 2, 0, false);
        declareFunction("get_lexical_strength_disambiguator", "GET-LEXICAL-STRENGTH-DISAMBIGUATOR", 1, 0, false);
        declareFunction("get_tagged_document_from_html_args", "GET-TAGGED-DOCUMENT-FROM-HTML-ARGS", 1, 0, false);
        declareFunction("get_tagged_document", "GET-TAGGED-DOCUMENT", 11, 0, false);
        declareFunction("get_disambiguators_from_html_args", "GET-DISAMBIGUATORS-FROM-HTML-ARGS", 1, 0, false);
        declareFunction("get_specs_filters_from_html_args", "GET-SPECS-FILTERS-FROM-HTML-ARGS", 1, 0, false);
        declareFunction("get_instance_filters_from_html_args", "GET-INSTANCE-FILTERS-FROM-HTML-ARGS", 1, 0, false);
        declareFunction("get_specs_filter_terms_from_html_args", "GET-SPECS-FILTER-TERMS-FROM-HTML-ARGS", 1, 0, false);
        declareFunction("get_instance_filter_terms_from_html_args", "GET-INSTANCE-FILTER-TERMS-FROM-HTML-ARGS", 1, 0, false);
        declareFunction("get_case_sensitivity_value", "GET-CASE-SENSITIVITY-VALUE", 1, 0, false);
        declareFunction("get_rdf_tagging_lexicon", "GET-RDF-TAGGING-LEXICON", 0, 0, false);
        declareFunction("get_rdf_tagged_document", "GET-RDF-TAGGED-DOCUMENT", 1, 2, false);
        declareFunction("weightG", "WEIGHT>", 2, 0, false);
        declareFunction("allow_document_tagger_restricted_web_service", "ALLOW-DOCUMENT-TAGGER-RESTRICTED-WEB-SERVICE", 0, 0, false);
        declareFunction("cb_tag_document_handler", "CB-TAG-DOCUMENT-HANDLER", 1, 0, false);
        declareFunction("cb_xml_tag_document", "CB-XML-TAG-DOCUMENT", 1, 0, false);
        declareFunction("tag_concepts_iterator_state_print_function_trampoline", "TAG-CONCEPTS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("tag_concepts_iterator_state_p", "TAG-CONCEPTS-ITERATOR-STATE-P", 1, 0, false);
        new concept_tagger.$tag_concepts_iterator_state_p$UnaryFunction();
        declareFunction("tag_concepts_iterator_state_sentences_to_do", "TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO", 1, 0, false);
        declareFunction("tag_concepts_iterator_state_document", "TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT", 1, 0, false);
        declareFunction("tag_concepts_iterator_state_lexicon", "TAG-CONCEPTS-ITERATOR-STATE-LEXICON", 1, 0, false);
        declareFunction("tag_concepts_iterator_state_sense_tagger", "TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER", 1, 0, false);
        declareFunction("tag_concepts_iterator_state_filter", "TAG-CONCEPTS-ITERATOR-STATE-FILTER", 1, 0, false);
        declareFunction("tag_concepts_iterator_state_output_spec", "TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC", 1, 0, false);
        declareFunction("tag_concepts_iterator_state_prepared_sentence_output", "TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT", 1, 0, false);
        declareFunction("_csetf_tag_concepts_iterator_state_sentences_to_do", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO", 2, 0, false);
        declareFunction("_csetf_tag_concepts_iterator_state_document", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT", 2, 0, false);
        declareFunction("_csetf_tag_concepts_iterator_state_lexicon", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-LEXICON", 2, 0, false);
        declareFunction("_csetf_tag_concepts_iterator_state_sense_tagger", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER", 2, 0, false);
        declareFunction("_csetf_tag_concepts_iterator_state_filter", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-FILTER", 2, 0, false);
        declareFunction("_csetf_tag_concepts_iterator_state_output_spec", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC", 2, 0, false);
        declareFunction("_csetf_tag_concepts_iterator_state_prepared_sentence_output", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT", 2, 0, false);
        declareFunction("make_tag_concepts_iterator_state", "MAKE-TAG-CONCEPTS-ITERATOR-STATE", 0, 1, false);
        declareFunction("visit_defstruct_tag_concepts_iterator_state", "VISIT-DEFSTRUCT-TAG-CONCEPTS-ITERATOR-STATE", 2, 0, false);
        declareFunction("visit_defstruct_object_tag_concepts_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-TAG-CONCEPTS-ITERATOR-STATE-METHOD", 2, 0, false);
        declareFunction("new_tag_concepts_iterator_state", "NEW-TAG-CONCEPTS-ITERATOR-STATE", 3, 0, false);
        declareFunction("tag_concepts_iterator_state_done_p", "TAG-CONCEPTS-ITERATOR-STATE-DONE-P", 1, 0, false);
        declareFunction("tag_concepts_iterator_state_next", "TAG-CONCEPTS-ITERATOR-STATE-NEXT", 1, 0, false);
        declareFunction("concept_tagger_process_sentence_with_syntactic_parser", "CONCEPT-TAGGER-PROCESS-SENTENCE-WITH-SYNTACTIC-PARSER", 3, 2, false);
        declareFunction("sentence_string_denotation_mapper_get_lexified_syntax", "SENTENCE-STRING-DENOTATION-MAPPER-GET-LEXIFIED-SYNTAX", 3, 0, false);
        declareFunction("sentence_string_denotation_mapper_aggressive_get_lexified_syntax", "SENTENCE-STRING-DENOTATION-MAPPER-AGGRESSIVE-GET-LEXIFIED-SYNTAX", 2, 0, false);
        declareFunction("sentence_string_denotation_mapper_conservative_get_lexified_syntax", "SENTENCE-STRING-DENOTATION-MAPPER-CONSERVATIVE-GET-LEXIFIED-SYNTAX", 2, 0, false);
        declareFunction("concept_tagger_print_function_trampoline", "CONCEPT-TAGGER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("concept_tagger_p", "CONCEPT-TAGGER-P", 1, 0, false);
        new concept_tagger.$concept_tagger_p$UnaryFunction();
        declareFunction("concept_tagger_name", "CONCEPT-TAGGER-NAME", 1, 0, false);
        declareFunction("concept_tagger_tag_method", "CONCEPT-TAGGER-TAG-METHOD", 1, 0, false);
        declareFunction("concept_tagger_lexicon_method", "CONCEPT-TAGGER-LEXICON-METHOD", 1, 0, false);
        declareFunction("_csetf_concept_tagger_name", "_CSETF-CONCEPT-TAGGER-NAME", 2, 0, false);
        declareFunction("_csetf_concept_tagger_tag_method", "_CSETF-CONCEPT-TAGGER-TAG-METHOD", 2, 0, false);
        declareFunction("_csetf_concept_tagger_lexicon_method", "_CSETF-CONCEPT-TAGGER-LEXICON-METHOD", 2, 0, false);
        declareFunction("make_concept_tagger", "MAKE-CONCEPT-TAGGER", 0, 1, false);
        declareFunction("visit_defstruct_concept_tagger", "VISIT-DEFSTRUCT-CONCEPT-TAGGER", 2, 0, false);
        declareFunction("visit_defstruct_object_concept_tagger_method", "VISIT-DEFSTRUCT-OBJECT-CONCEPT-TAGGER-METHOD", 2, 0, false);
        declareFunction("print_concept_tagger", "PRINT-CONCEPT-TAGGER", 1, 2, false);
        declareFunction("declare_concept_tagger", "DECLARE-CONCEPT-TAGGER", 2, 1, false);
        declareFunction("concept_tagger_get_tag_method", "CONCEPT-TAGGER-GET-TAG-METHOD", 1, 0, false);
        declareFunction("concept_tagger_get_lexicon_method", "CONCEPT-TAGGER-GET-LEXICON-METHOD", 1, 0, false);
        declareFunction("default_lexicon_for_concept_tagger", "DEFAULT-LEXICON-FOR-CONCEPT-TAGGER", 1, 0, false);
        declareFunction("default_concept_tagging_domain_mt", "DEFAULT-CONCEPT-TAGGING-DOMAIN-MT", 0, 0, false);
        declareFunction("tag_concepts_fast", "TAG-CONCEPTS-FAST", 3, 0, false);
        declareFunction("tag_concepts_fast_exhaustively", "TAG-CONCEPTS-FAST-EXHAUSTIVELY", 3, 0, false);
        declareFunction("tag_concepts_fast_int", "TAG-CONCEPTS-FAST-INT", 4, 0, false);
        declareFunction("tag_concepts_using_pos_tags", "TAG-CONCEPTS-USING-POS-TAGS", 3, 0, false);
        declareFunction("tag_concepts_exhaustively_using_pos_tags", "TAG-CONCEPTS-EXHAUSTIVELY-USING-POS-TAGS", 3, 0, false);
        declareFunction("get_default_concept_tagger_lexicon", "GET-DEFAULT-CONCEPT-TAGGER-LEXICON", 0, 1, false);
        declareFunction("get_default_concept_tagger_lexicon_for_filter", "GET-DEFAULT-CONCEPT-TAGGER-LEXICON-FOR-FILTER", 1, 0, false);
        declareFunction("make_default_concept_tagger_lexicon", "MAKE-DEFAULT-CONCEPT-TAGGER-LEXICON", 0, 0, false);
        declareFunction("get_default_sentence_string_lexicon", "GET-DEFAULT-SENTENCE-STRING-LEXICON", 0, 0, false);
        declareFunction("get_default_sentence_string_parser", "GET-DEFAULT-SENTENCE-STRING-PARSER", 0, 0, false);
        declareFunction("concept_tagger_extract_interpretations_from_lex_entry", "CONCEPT-TAGGER-EXTRACT-INTERPRETATIONS-FROM-LEX-ENTRY", 2, 1, false);
        declareFunction("non_trie_lex_entry_p", "NON-TRIE-LEX-ENTRY-P", 1, 0, false);
        declareFunction("augment_tag_concepts_optional_arg_plist_with_defaults", "AUGMENT-TAG-CONCEPTS-OPTIONAL-ARG-PLIST-WITH-DEFAULTS", 1, 0, false);
        declareFunction("concept_tagger_accepted_terms", "CONCEPT-TAGGER-ACCEPTED-TERMS", 1, 2, false);
        declareFunction("concept_tagger_accepted_terms_int", "CONCEPT-TAGGER-ACCEPTED-TERMS-INT", 1, 2, false);
        declareFunction("concept_tagger_irrelevant_term", "CONCEPT-TAGGER-IRRELEVANT-TERM", 1, 2, false);
        declareFunction("test_concept_tagger_speed", "TEST-CONCEPT-TAGGER-SPEED", 0, 3, false);
        declareFunction("term_absent_from_doc_interps", "TERM-ABSENT-FROM-DOC-INTERPS", 2, 0, false);
        declareFunction("term_in_doc_interps", "TERM-IN-DOC-INTERPS", 2, 0, false);
        declareFunction("get_tagged_document_from_html_args_pos", "GET-TAGGED-DOCUMENT-FROM-HTML-ARGS-POS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_concept_tagger_file_alt() {
        defparameter("*DEFAULT-SENTENCE-STRING-LEXICON*", NIL);
        defparameter("*DEFAULT-SENTENCE-STRING-PARSER*", NIL);
        defparameter("*CONCEPT-TAGGER-LEXICAL-GENERALITY-CUTOFF*", $int$400000);
        deflexical("*HTML-CONCEPT-FILTERS*", $list_alt27);
        defparameter("*DOC-TAGGER-DEFAULT-STYLE*", $str_alt36$_cycl__font_family__sans_serif__c);
        defparameter("*BROWSER-TAGGING-LEXICONS*", dictionary.new_dictionary(EQUAL, UNPROVIDED));
        defconstant("*CB-TAG-DOCUMENT-TO-HTML*", cconcatenate(http_kernel.$http_return_mime_type_prefix$.getGlobalValue(), $str_alt62$text_html));
        defconstant("*CB-TAG-DOCUMENT-TO-XML*", cconcatenate(http_kernel.$http_return_mime_type_prefix$.getGlobalValue(), $str_alt29$text_xml));
        defconstant("*DTP-TAG-CONCEPTS-ITERATOR-STATE*", TAG_CONCEPTS_ITERATOR_STATE);
        defparameter("*TAG-CONCEPTS-QUICKLY?*", T);
        defparameter("*REGISTERED-CONCEPT-TAGGERS*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        defconstant("*DTP-CONCEPT-TAGGER*", CONCEPT_TAGGER);
        defparameter("*CONCEPT-TAGGER-TEST-DOCS*", $list_alt191);
        return NIL;
    }

    public static SubLObject init_concept_tagger_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*DEFAULT-SENTENCE-STRING-LEXICON*", NIL);
            defparameter("*DEFAULT-SENTENCE-STRING-PARSER*", NIL);
            defparameter("*CONCEPT-TAGGER-LEXICAL-GENERALITY-CUTOFF*", $int$400000);
            deflexical("*HTML-CONCEPT-FILTERS*", $list26);
            defparameter("*DOC-TAGGER-DEFAULT-STYLE*", $str58$_cycl__font_family__sans_serif__c);
            defparameter("*BROWSER-TAGGING-LEXICONS*", dictionary.new_dictionary(EQUAL, UNPROVIDED));
            defconstant("*CB-TAG-DOCUMENT-TO-HTML*", cconcatenate(http_kernel.$http_return_mime_type_prefix$.getGlobalValue(), $str138$text_html));
            defconstant("*CB-TAG-DOCUMENT-TO-XML*", cconcatenate(http_kernel.$http_return_mime_type_prefix$.getGlobalValue(), $str139$text_xml));
            defconstant("*DTP-TAG-CONCEPTS-ITERATOR-STATE*", TAG_CONCEPTS_ITERATOR_STATE);
            defparameter("*TAG-CONCEPTS-QUICKLY?*", T);
            defparameter("*REGISTERED-CONCEPT-TAGGERS*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            defconstant("*DTP-CONCEPT-TAGGER*", CONCEPT_TAGGER);
            defparameter("*CONCEPT-TAGGER-TEST-DOCS*", $list301);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*HTML-CONCEPT-FILTERS*", $list_alt27);
            defparameter("*DOC-TAGGER-DEFAULT-STYLE*", $str_alt36$_cycl__font_family__sans_serif__c);
            defconstant("*CB-TAG-DOCUMENT-TO-HTML*", cconcatenate(http_kernel.$http_return_mime_type_prefix$.getGlobalValue(), $str_alt62$text_html));
            defconstant("*CB-TAG-DOCUMENT-TO-XML*", cconcatenate(http_kernel.$http_return_mime_type_prefix$.getGlobalValue(), $str_alt29$text_xml));
            defparameter("*CONCEPT-TAGGER-TEST-DOCS*", $list_alt191);
        }
        return NIL;
    }

    public static SubLObject init_concept_tagger_file_Previous() {
        defparameter("*DEFAULT-SENTENCE-STRING-LEXICON*", NIL);
        defparameter("*DEFAULT-SENTENCE-STRING-PARSER*", NIL);
        defparameter("*CONCEPT-TAGGER-LEXICAL-GENERALITY-CUTOFF*", $int$400000);
        deflexical("*HTML-CONCEPT-FILTERS*", $list26);
        defparameter("*DOC-TAGGER-DEFAULT-STYLE*", $str58$_cycl__font_family__sans_serif__c);
        defparameter("*BROWSER-TAGGING-LEXICONS*", dictionary.new_dictionary(EQUAL, UNPROVIDED));
        defconstant("*CB-TAG-DOCUMENT-TO-HTML*", cconcatenate(http_kernel.$http_return_mime_type_prefix$.getGlobalValue(), $str138$text_html));
        defconstant("*CB-TAG-DOCUMENT-TO-XML*", cconcatenate(http_kernel.$http_return_mime_type_prefix$.getGlobalValue(), $str139$text_xml));
        defconstant("*DTP-TAG-CONCEPTS-ITERATOR-STATE*", TAG_CONCEPTS_ITERATOR_STATE);
        defparameter("*TAG-CONCEPTS-QUICKLY?*", T);
        defparameter("*REGISTERED-CONCEPT-TAGGERS*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        defconstant("*DTP-CONCEPT-TAGGER*", CONCEPT_TAGGER);
        defparameter("*CONCEPT-TAGGER-TEST-DOCS*", $list301);
        return NIL;
    }

    public static final SubLObject setup_concept_tagger_file_alt() {
        register_external_symbol(TAG_CONCEPTS);
        register_external_symbol(TAG_CONCEPTS_OPTIONAL_ARGS_P);
        register_external_symbol(GET_NEXT_SENTENCE_ANNOTATION);
        register_external_symbol($sym11$ANNOTATION_COMPLETE_);
        register_external_symbol(ALL_TAGGED_CONCEPTS);
        note_handler_mime_type(XML_TAG_DOCUMENT, $str_alt29$text_xml);
        note_html_handler_function(XML_TAG_DOCUMENT);
        note_html_handler_function(HTML_TAG_DOCUMENT);
        note_html_handler_function(HTML_TAG_DOCUMENT_INT);
        note_html_handler_function(CB_TAG_DOCUMENT_HANDLER);
        note_html_handler_function(CB_XML_TAG_DOCUMENT);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_tag_concepts_iterator_state$.getGlobalValue(), symbol_function(TAG_CONCEPTS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(TAG_CONCEPTS_ITERATOR_STATE_SENTENCES_TO_DO, _CSETF_TAG_CONCEPTS_ITERATOR_STATE_SENTENCES_TO_DO);
        def_csetf(TAG_CONCEPTS_ITERATOR_STATE_DOCUMENT, _CSETF_TAG_CONCEPTS_ITERATOR_STATE_DOCUMENT);
        def_csetf(TAG_CONCEPTS_ITERATOR_STATE_LEXICON, _CSETF_TAG_CONCEPTS_ITERATOR_STATE_LEXICON);
        def_csetf(TAG_CONCEPTS_ITERATOR_STATE_SENSE_TAGGER, _CSETF_TAG_CONCEPTS_ITERATOR_STATE_SENSE_TAGGER);
        def_csetf(TAG_CONCEPTS_ITERATOR_STATE_FILTER, _CSETF_TAG_CONCEPTS_ITERATOR_STATE_FILTER);
        def_csetf(TAG_CONCEPTS_ITERATOR_STATE_OUTPUT_SPEC, _CSETF_TAG_CONCEPTS_ITERATOR_STATE_OUTPUT_SPEC);
        def_csetf(TAG_CONCEPTS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT, _CSETF_TAG_CONCEPTS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT);
        identity(TAG_CONCEPTS_ITERATOR_STATE);
        note_funcall_helper_function(TAG_CONCEPTS_ITERATOR_STATE_DONE_P);
        note_funcall_helper_function(TAG_CONCEPTS_ITERATOR_STATE_NEXT);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_concept_tagger$.getGlobalValue(), symbol_function(CONCEPT_TAGGER_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(CONCEPT_TAGGER_NAME, _CSETF_CONCEPT_TAGGER_NAME);
        def_csetf(CONCEPT_TAGGER_TAG_METHOD, _CSETF_CONCEPT_TAGGER_TAG_METHOD);
        def_csetf(CONCEPT_TAGGER_LEXICON_METHOD, _CSETF_CONCEPT_TAGGER_LEXICON_METHOD);
        identity(CONCEPT_TAGGER);
        declare_concept_tagger(SIMPLE_CONCEPT_TAGGER, TAG_CONCEPTS_FAST, NEW_TERM_LEXICON);
        return NIL;
    }

    public static SubLObject setup_concept_tagger_file() {
        if (SubLFiles.USE_V1) {
            register_external_symbol(TAG_CONCEPTS);
            register_external_symbol(TAG_CONCEPTS_OPTIONAL_ARGS_P);
            register_external_symbol(GET_NEXT_SENTENCE_ANNOTATION);
            register_external_symbol($sym11$ANNOTATION_COMPLETE_);
            register_external_symbol(ALL_TAGGED_CONCEPTS);
            html_macros.note_cgi_handler_function(XML_TAG_DOCUMENT, $XML_HANDLER);
            register_external_symbol(TAG_DOCUMENT_XML);
            register_external_symbol(SERIALIZE_XML_SENSE_TAG_FOR_CYCL_TERM);
            html_macros.note_cgi_handler_function(HTML_TAG_DOCUMENT, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(HTML_TAG_DOCUMENT_INT, $HTML_HANDLER);
            register_external_symbol(GET_TAGGED_DOCUMENT_FROM_PARAMS);
            html_macros.note_cgi_handler_function(CB_TAG_DOCUMENT_HANDLER, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_XML_TAG_DOCUMENT, $HTML_HANDLER);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_tag_concepts_iterator_state$.getGlobalValue(), symbol_function(TAG_CONCEPTS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list190);
            def_csetf(TAG_CONCEPTS_ITERATOR_STATE_SENTENCES_TO_DO, _CSETF_TAG_CONCEPTS_ITERATOR_STATE_SENTENCES_TO_DO);
            def_csetf(TAG_CONCEPTS_ITERATOR_STATE_DOCUMENT, _CSETF_TAG_CONCEPTS_ITERATOR_STATE_DOCUMENT);
            def_csetf(TAG_CONCEPTS_ITERATOR_STATE_LEXICON, _CSETF_TAG_CONCEPTS_ITERATOR_STATE_LEXICON);
            def_csetf(TAG_CONCEPTS_ITERATOR_STATE_SENSE_TAGGER, _CSETF_TAG_CONCEPTS_ITERATOR_STATE_SENSE_TAGGER);
            def_csetf(TAG_CONCEPTS_ITERATOR_STATE_FILTER, _CSETF_TAG_CONCEPTS_ITERATOR_STATE_FILTER);
            def_csetf(TAG_CONCEPTS_ITERATOR_STATE_OUTPUT_SPEC, _CSETF_TAG_CONCEPTS_ITERATOR_STATE_OUTPUT_SPEC);
            def_csetf(TAG_CONCEPTS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT, _CSETF_TAG_CONCEPTS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT);
            identity(TAG_CONCEPTS_ITERATOR_STATE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_tag_concepts_iterator_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TAG_CONCEPTS_ITERATOR_STATE_METHOD));
            note_funcall_helper_function(TAG_CONCEPTS_ITERATOR_STATE_DONE_P);
            note_funcall_helper_function(TAG_CONCEPTS_ITERATOR_STATE_NEXT);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_concept_tagger$.getGlobalValue(), symbol_function(CONCEPT_TAGGER_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list240);
            def_csetf(CONCEPT_TAGGER_NAME, _CSETF_CONCEPT_TAGGER_NAME);
            def_csetf(CONCEPT_TAGGER_TAG_METHOD, _CSETF_CONCEPT_TAGGER_TAG_METHOD);
            def_csetf(CONCEPT_TAGGER_LEXICON_METHOD, _CSETF_CONCEPT_TAGGER_LEXICON_METHOD);
            identity(CONCEPT_TAGGER);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_concept_tagger$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CONCEPT_TAGGER_METHOD));
            declare_concept_tagger(POS_TAGGING_CONCEPT_TAGGER, TAG_CONCEPTS_USING_POS_TAGS, NEW_TERM_LEXICON);
            declare_concept_tagger(POS_TAGGING_EXHAUSTIVE_CONCEPT_TAGGER, TAG_CONCEPTS_EXHAUSTIVELY_USING_POS_TAGS, NEW_TERM_LEXICON);
            declare_concept_tagger(SIMPLE_CONCEPT_TAGGER, TAG_CONCEPTS_FAST, NEW_TERM_LEXICON);
            declare_concept_tagger(EXHAUSTIVE_CONCEPT_TAGGER, TAG_CONCEPTS_FAST_EXHAUSTIVELY, NEW_TERM_LEXICON);
            define_test_case_table_int(GET_TAGGED_DOCUMENT_FROM_HTML_ARGS, list(new SubLObject[]{ $TEST, TERM_ABSENT_FROM_DOC_INTERPS, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list310);
            define_test_case_table_int(GET_TAGGED_DOCUMENT_FROM_HTML_ARGS_POS, list(new SubLObject[]{ $TEST, TERM_IN_DOC_INTERPS, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list313);
            define_test_case_table_int(SERIALIZE_XML_SENSE_TAG_FOR_CYCL_TERM, list(new SubLObject[]{ $TEST, TRUE, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list315);
            define_test_case_table_int(GET_TAGGED_DOCUMENT_FROM_PARAMS, list(new SubLObject[]{ $TEST, TERM_ABSENT_FROM_DOC_INTERPS, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list316);
        }
        if (SubLFiles.USE_V2) {
            note_handler_mime_type(XML_TAG_DOCUMENT, $str_alt29$text_xml);
            note_html_handler_function(XML_TAG_DOCUMENT);
            note_html_handler_function(HTML_TAG_DOCUMENT);
            note_html_handler_function(HTML_TAG_DOCUMENT_INT);
            note_html_handler_function(CB_TAG_DOCUMENT_HANDLER);
            note_html_handler_function(CB_XML_TAG_DOCUMENT);
        }
        return NIL;
    }

    public static SubLObject setup_concept_tagger_file_Previous() {
        register_external_symbol(TAG_CONCEPTS);
        register_external_symbol(TAG_CONCEPTS_OPTIONAL_ARGS_P);
        register_external_symbol(GET_NEXT_SENTENCE_ANNOTATION);
        register_external_symbol($sym11$ANNOTATION_COMPLETE_);
        register_external_symbol(ALL_TAGGED_CONCEPTS);
        html_macros.note_cgi_handler_function(XML_TAG_DOCUMENT, $XML_HANDLER);
        register_external_symbol(TAG_DOCUMENT_XML);
        register_external_symbol(SERIALIZE_XML_SENSE_TAG_FOR_CYCL_TERM);
        html_macros.note_cgi_handler_function(HTML_TAG_DOCUMENT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(HTML_TAG_DOCUMENT_INT, $HTML_HANDLER);
        register_external_symbol(GET_TAGGED_DOCUMENT_FROM_PARAMS);
        html_macros.note_cgi_handler_function(CB_TAG_DOCUMENT_HANDLER, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_XML_TAG_DOCUMENT, $HTML_HANDLER);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_tag_concepts_iterator_state$.getGlobalValue(), symbol_function(TAG_CONCEPTS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list190);
        def_csetf(TAG_CONCEPTS_ITERATOR_STATE_SENTENCES_TO_DO, _CSETF_TAG_CONCEPTS_ITERATOR_STATE_SENTENCES_TO_DO);
        def_csetf(TAG_CONCEPTS_ITERATOR_STATE_DOCUMENT, _CSETF_TAG_CONCEPTS_ITERATOR_STATE_DOCUMENT);
        def_csetf(TAG_CONCEPTS_ITERATOR_STATE_LEXICON, _CSETF_TAG_CONCEPTS_ITERATOR_STATE_LEXICON);
        def_csetf(TAG_CONCEPTS_ITERATOR_STATE_SENSE_TAGGER, _CSETF_TAG_CONCEPTS_ITERATOR_STATE_SENSE_TAGGER);
        def_csetf(TAG_CONCEPTS_ITERATOR_STATE_FILTER, _CSETF_TAG_CONCEPTS_ITERATOR_STATE_FILTER);
        def_csetf(TAG_CONCEPTS_ITERATOR_STATE_OUTPUT_SPEC, _CSETF_TAG_CONCEPTS_ITERATOR_STATE_OUTPUT_SPEC);
        def_csetf(TAG_CONCEPTS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT, _CSETF_TAG_CONCEPTS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT);
        identity(TAG_CONCEPTS_ITERATOR_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_tag_concepts_iterator_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TAG_CONCEPTS_ITERATOR_STATE_METHOD));
        note_funcall_helper_function(TAG_CONCEPTS_ITERATOR_STATE_DONE_P);
        note_funcall_helper_function(TAG_CONCEPTS_ITERATOR_STATE_NEXT);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_concept_tagger$.getGlobalValue(), symbol_function(CONCEPT_TAGGER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list240);
        def_csetf(CONCEPT_TAGGER_NAME, _CSETF_CONCEPT_TAGGER_NAME);
        def_csetf(CONCEPT_TAGGER_TAG_METHOD, _CSETF_CONCEPT_TAGGER_TAG_METHOD);
        def_csetf(CONCEPT_TAGGER_LEXICON_METHOD, _CSETF_CONCEPT_TAGGER_LEXICON_METHOD);
        identity(CONCEPT_TAGGER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_concept_tagger$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CONCEPT_TAGGER_METHOD));
        declare_concept_tagger(POS_TAGGING_CONCEPT_TAGGER, TAG_CONCEPTS_USING_POS_TAGS, NEW_TERM_LEXICON);
        declare_concept_tagger(POS_TAGGING_EXHAUSTIVE_CONCEPT_TAGGER, TAG_CONCEPTS_EXHAUSTIVELY_USING_POS_TAGS, NEW_TERM_LEXICON);
        declare_concept_tagger(SIMPLE_CONCEPT_TAGGER, TAG_CONCEPTS_FAST, NEW_TERM_LEXICON);
        declare_concept_tagger(EXHAUSTIVE_CONCEPT_TAGGER, TAG_CONCEPTS_FAST_EXHAUSTIVELY, NEW_TERM_LEXICON);
        define_test_case_table_int(GET_TAGGED_DOCUMENT_FROM_HTML_ARGS, list(new SubLObject[]{ $TEST, TERM_ABSENT_FROM_DOC_INTERPS, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list310);
        define_test_case_table_int(GET_TAGGED_DOCUMENT_FROM_HTML_ARGS_POS, list(new SubLObject[]{ $TEST, TERM_IN_DOC_INTERPS, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list313);
        define_test_case_table_int(SERIALIZE_XML_SENSE_TAG_FOR_CYCL_TERM, list(new SubLObject[]{ $TEST, TRUE, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list315);
        define_test_case_table_int(GET_TAGGED_DOCUMENT_FROM_PARAMS, list(new SubLObject[]{ $TEST, TERM_ABSENT_FROM_DOC_INTERPS, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list316);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_concept_tagger_file();
    }

    @Override
    public void initializeVariables() {
        init_concept_tagger_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_concept_tagger_file();
    }

    static {
    }

    public static final class $tag_concepts_iterator_state_p$UnaryFunction extends UnaryFunction {
        public $tag_concepts_iterator_state_p$UnaryFunction() {
            super(extractFunctionNamed("TAG-CONCEPTS-ITERATOR-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return tag_concepts_iterator_state_p(arg1);
        }
    }

    public static final class $concept_tagger_p$UnaryFunction extends UnaryFunction {
        public $concept_tagger_p$UnaryFunction() {
            super(extractFunctionNamed("CONCEPT-TAGGER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return concept_tagger_p(arg1);
        }
    }
}

/**
 * Total time: 2749 ms
 */
