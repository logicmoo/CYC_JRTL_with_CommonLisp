/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.rtp;


import static com.cyc.cycjava.cycl.assertion_handles.assertion_p;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg;
import static com.cyc.cycjava.cycl.iteration.new_iterator;
import static com.cyc.cycjava.cycl.list_utilities.lengthG;
import static com.cyc.cycjava.cycl.list_utilities.remove_if_not;
import static com.cyc.cycjava.cycl.memoization_state.$memoization_state$;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_original_process;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_possibly_clear_original_process;
import static com.cyc.cycjava.cycl.memoization_state.new_memoization_state;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$mt$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mt_function$;
import static com.cyc.cycjava.cycl.parsing_utilities.result_of_parsing_span_wXo_thelist;
import static com.cyc.cycjava.cycl.parsing_vars.$rkf_template_wff_filter_level$;
import static com.cyc.cycjava.cycl.queues.create_queue;
import static com.cyc.cycjava.cycl.queues.dequeue;
import static com.cyc.cycjava.cycl.queues.enqueue;
import static com.cyc.cycjava.cycl.queues.queue_empty_p;
import static com.cyc.cycjava.cycl.rkf_formula_optimizer.rkf_reformulate_into_many;
import static com.cyc.cycjava.cycl.rkf_text_processors.$rkf_text_proc_resolve_parses$;
import static com.cyc.cycjava.cycl.rkf_text_processors.rkf_utterance_reader;
import static com.cyc.cycjava.cycl.rkf_text_processors.top_level_parses;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.$resourced_sbhl_marking_space_limit$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.$resourced_sbhl_marking_spaces$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.determine_marking_space_limit;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.new_sbhl_marking_space_resource;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.parsing_utilities;
import com.cyc.cycjava.cycl.parsing_vars;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.rkf_formula_optimizer;
import com.cyc.cycjava.cycl.rkf_text_processors;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RTP-ITERATORS
 * source file: /cyc/top/cycl/rtp/rtp-iterators.lisp
 * created:     2019/07/03 17:38:39
 */
public final class rtp_iterators extends SubLTranslatedFile implements V12 {
    public static final class $itp_section_iterator_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_section_iterator_native.this.$parent;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_section_iterator_native.this.$span;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_section_iterator_native.this.$section;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_section_iterator_native.this.$current;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_section_iterator_native.this.$parent = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_section_iterator_native.this.$span = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_section_iterator_native.this.$section = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_section_iterator_native.this.$current = value;
        }

        public SubLObject $parent = Lisp.NIL;

        public SubLObject $span = Lisp.NIL;

        public SubLObject $section = Lisp.NIL;

        public SubLObject $current = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_section_iterator_native.class, ITP_SECTION_ITERATOR, ITP_SECTION_ITERATOR_P, $list_alt23, $list_alt24, new String[]{ "$parent", "$span", "$section", "$current" }, $list_alt25, $list_alt26, ITP_PRINT_SECTION_ITERATOR);
    }

    // Definitions
    public static final class $itp_result_iterator_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_result_iterator_native.this.$style;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_result_iterator_native.this.$parses;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_result_iterator_native.this.$span;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_result_iterator_native.this.$section_iterator;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_result_iterator_native.this.$style = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_result_iterator_native.this.$parses = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_result_iterator_native.this.$span = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_result_iterator_native.this.$section_iterator = value;
        }

        public SubLObject $style = Lisp.NIL;

        public SubLObject $parses = Lisp.NIL;

        public SubLObject $span = Lisp.NIL;

        public SubLObject $section_iterator = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_result_iterator_native.class, ITP_RESULT_ITERATOR, ITP_RESULT_ITERATOR_P, $list_alt2, $list_alt3, new String[]{ "$style", "$parses", "$span", "$section_iterator" }, $list_alt4, $list_alt5, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final class $itp_child_iterator_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_child_iterator_native.this.$parent;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_child_iterator_native.this.$rop_formula;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_child_iterator_native.this.$section;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_child_iterator_native.this.$parent = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_child_iterator_native.this.$rop_formula = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_child_iterator_native.this.$section = value;
        }

        public SubLObject $parent = Lisp.NIL;

        public SubLObject $rop_formula = Lisp.NIL;

        public SubLObject $section = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_child_iterator_native.class, ITP_CHILD_ITERATOR, ITP_CHILD_ITERATOR_P, $list_alt43, $list_alt44, new String[]{ "$parent", "$rop_formula", "$section" }, $list_alt45, $list_alt46, ITP_PRINT_CHILD_ITERATOR);
    }

    public static final SubLFile me = new rtp_iterators();



    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_itp_result_iterator$ = makeSymbol("*DTP-ITP-RESULT-ITERATOR*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_itp_section_iterator$ = makeSymbol("*DTP-ITP-SECTION-ITERATOR*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_itp_child_iterator$ = makeSymbol("*DTP-ITP-CHILD-ITERATOR*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_rtp_iterator$ = makeSymbol("*DTP-RTP-ITERATOR*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol ITP_RESULT_ITERATOR = makeSymbol("ITP-RESULT-ITERATOR");

    private static final SubLSymbol ITP_RESULT_ITERATOR_P = makeSymbol("ITP-RESULT-ITERATOR-P");

    static private final SubLList $list2 = list(makeSymbol("STYLE"), makeSymbol("PARSES"), makeSymbol("SPAN"), makeSymbol("SECTION-ITERATOR"));

    static private final SubLList $list3 = list(makeKeyword("STYLE"), makeKeyword("PARSES"), $SPAN, makeKeyword("SECTION-ITERATOR"));

    static private final SubLList $list4 = list(makeSymbol("ITP-RESULT-ITERATOR-STYLE"), makeSymbol("ITP-RESULT-ITERATOR-PARSES"), makeSymbol("ITP-RESULT-ITERATOR-SPAN"), makeSymbol("ITP-RESULT-ITERATOR-SECTION-ITERATOR"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-ITP-RESULT-ITERATOR-STYLE"), makeSymbol("_CSETF-ITP-RESULT-ITERATOR-PARSES"), makeSymbol("_CSETF-ITP-RESULT-ITERATOR-SPAN"), makeSymbol("_CSETF-ITP-RESULT-ITERATOR-SECTION-ITERATOR"));

    private static final SubLSymbol ITP_RESULT_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ITP-RESULT-ITERATOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ITP-RESULT-ITERATOR-P"));

    private static final SubLSymbol ITP_RESULT_ITERATOR_STYLE = makeSymbol("ITP-RESULT-ITERATOR-STYLE");

    private static final SubLSymbol _CSETF_ITP_RESULT_ITERATOR_STYLE = makeSymbol("_CSETF-ITP-RESULT-ITERATOR-STYLE");

    private static final SubLSymbol ITP_RESULT_ITERATOR_PARSES = makeSymbol("ITP-RESULT-ITERATOR-PARSES");

    private static final SubLSymbol _CSETF_ITP_RESULT_ITERATOR_PARSES = makeSymbol("_CSETF-ITP-RESULT-ITERATOR-PARSES");

    private static final SubLSymbol ITP_RESULT_ITERATOR_SPAN = makeSymbol("ITP-RESULT-ITERATOR-SPAN");

    private static final SubLSymbol _CSETF_ITP_RESULT_ITERATOR_SPAN = makeSymbol("_CSETF-ITP-RESULT-ITERATOR-SPAN");

    private static final SubLSymbol ITP_RESULT_ITERATOR_SECTION_ITERATOR = makeSymbol("ITP-RESULT-ITERATOR-SECTION-ITERATOR");

    private static final SubLSymbol _CSETF_ITP_RESULT_ITERATOR_SECTION_ITERATOR = makeSymbol("_CSETF-ITP-RESULT-ITERATOR-SECTION-ITERATOR");

    private static final SubLString $str21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_ITP_RESULT_ITERATOR = makeSymbol("MAKE-ITP-RESULT-ITERATOR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ITP_RESULT_ITERATOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ITP-RESULT-ITERATOR-METHOD");

    private static final SubLSymbol ITP_SECTION_ITERATOR = makeSymbol("ITP-SECTION-ITERATOR");

    private static final SubLSymbol ITP_SECTION_ITERATOR_P = makeSymbol("ITP-SECTION-ITERATOR-P");

    private static final SubLList $list29 = list(makeSymbol("PARENT"), makeSymbol("SPAN"), makeSymbol("SECTION"), makeSymbol("CURRENT"));

    private static final SubLList $list30 = list(makeKeyword("PARENT"), $SPAN, makeKeyword("SECTION"), makeKeyword("CURRENT"));

    private static final SubLList $list31 = list(makeSymbol("ITP-SECTION-ITERATOR-PARENT"), makeSymbol("ITP-SECTION-ITERATOR-SPAN"), makeSymbol("ITP-SECTION-ITERATOR-SECTION"), makeSymbol("ITP-SECTION-ITERATOR-CURRENT"));

    private static final SubLList $list32 = list(makeSymbol("_CSETF-ITP-SECTION-ITERATOR-PARENT"), makeSymbol("_CSETF-ITP-SECTION-ITERATOR-SPAN"), makeSymbol("_CSETF-ITP-SECTION-ITERATOR-SECTION"), makeSymbol("_CSETF-ITP-SECTION-ITERATOR-CURRENT"));

    private static final SubLSymbol ITP_PRINT_SECTION_ITERATOR = makeSymbol("ITP-PRINT-SECTION-ITERATOR");

    private static final SubLSymbol ITP_SECTION_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ITP-SECTION-ITERATOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list35 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ITP-SECTION-ITERATOR-P"));

    private static final SubLSymbol ITP_SECTION_ITERATOR_PARENT = makeSymbol("ITP-SECTION-ITERATOR-PARENT");

    private static final SubLSymbol _CSETF_ITP_SECTION_ITERATOR_PARENT = makeSymbol("_CSETF-ITP-SECTION-ITERATOR-PARENT");

    private static final SubLSymbol ITP_SECTION_ITERATOR_SPAN = makeSymbol("ITP-SECTION-ITERATOR-SPAN");

    private static final SubLSymbol _CSETF_ITP_SECTION_ITERATOR_SPAN = makeSymbol("_CSETF-ITP-SECTION-ITERATOR-SPAN");

    private static final SubLSymbol ITP_SECTION_ITERATOR_SECTION = makeSymbol("ITP-SECTION-ITERATOR-SECTION");

    private static final SubLSymbol _CSETF_ITP_SECTION_ITERATOR_SECTION = makeSymbol("_CSETF-ITP-SECTION-ITERATOR-SECTION");

    private static final SubLSymbol ITP_SECTION_ITERATOR_CURRENT = makeSymbol("ITP-SECTION-ITERATOR-CURRENT");

    private static final SubLSymbol _CSETF_ITP_SECTION_ITERATOR_CURRENT = makeSymbol("_CSETF-ITP-SECTION-ITERATOR-CURRENT");

    private static final SubLSymbol MAKE_ITP_SECTION_ITERATOR = makeSymbol("MAKE-ITP-SECTION-ITERATOR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ITP_SECTION_ITERATOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ITP-SECTION-ITERATOR-METHOD");

    private static final SubLString $str49$_ITP_SECTION___S_ = makeString("<ITP-SECTION: ~S>");

    private static final SubLSymbol ITP_CHILD_ITERATOR = makeSymbol("ITP-CHILD-ITERATOR");

    private static final SubLSymbol ITP_CHILD_ITERATOR_P = makeSymbol("ITP-CHILD-ITERATOR-P");

    private static final SubLList $list52 = list(makeSymbol("PARENT"), makeSymbol("ROP-FORMULA"), makeSymbol("SECTION"));

    private static final SubLList $list53 = list(makeKeyword("PARENT"), makeKeyword("ROP-FORMULA"), makeKeyword("SECTION"));

    private static final SubLList $list54 = list(makeSymbol("ITP-CHILD-ITERATOR-PARENT"), makeSymbol("ITP-CHILD-ITERATOR-ROP-FORMULA"), makeSymbol("ITP-CHILD-ITERATOR-SECTION"));

    private static final SubLList $list55 = list(makeSymbol("_CSETF-ITP-CHILD-ITERATOR-PARENT"), makeSymbol("_CSETF-ITP-CHILD-ITERATOR-ROP-FORMULA"), makeSymbol("_CSETF-ITP-CHILD-ITERATOR-SECTION"));

    private static final SubLSymbol ITP_PRINT_CHILD_ITERATOR = makeSymbol("ITP-PRINT-CHILD-ITERATOR");

    private static final SubLSymbol ITP_CHILD_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ITP-CHILD-ITERATOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list58 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ITP-CHILD-ITERATOR-P"));

    private static final SubLSymbol ITP_CHILD_ITERATOR_PARENT = makeSymbol("ITP-CHILD-ITERATOR-PARENT");

    private static final SubLSymbol _CSETF_ITP_CHILD_ITERATOR_PARENT = makeSymbol("_CSETF-ITP-CHILD-ITERATOR-PARENT");

    private static final SubLSymbol ITP_CHILD_ITERATOR_ROP_FORMULA = makeSymbol("ITP-CHILD-ITERATOR-ROP-FORMULA");

    private static final SubLSymbol _CSETF_ITP_CHILD_ITERATOR_ROP_FORMULA = makeSymbol("_CSETF-ITP-CHILD-ITERATOR-ROP-FORMULA");

    private static final SubLSymbol ITP_CHILD_ITERATOR_SECTION = makeSymbol("ITP-CHILD-ITERATOR-SECTION");

    private static final SubLSymbol _CSETF_ITP_CHILD_ITERATOR_SECTION = makeSymbol("_CSETF-ITP-CHILD-ITERATOR-SECTION");

    private static final SubLSymbol MAKE_ITP_CHILD_ITERATOR = makeSymbol("MAKE-ITP-CHILD-ITERATOR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ITP_CHILD_ITERATOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ITP-CHILD-ITERATOR-METHOD");

    private static final SubLString $str68$_ITP_CHILD___S_ = makeString("<ITP-CHILD: ~S>");



    private static final SubLSymbol RTP_ITERATOR = makeSymbol("RTP-ITERATOR");

    private static final SubLSymbol RTP_ITERATOR_P = makeSymbol("RTP-ITERATOR-P");

    private static final SubLList $list77 = list(new SubLObject[]{ makeSymbol("STRING"), makeSymbol("PARSING-MT"), makeSymbol("SEMANTIC-MT"), makeSymbol("STRENGTHEN?"), makeSymbol("MULTIPLE-QUANTIFICATIONS?"), makeSymbol("WFF-CHECK?"), makeSymbol("FORCE"), makeSymbol("RAW-PARSES"), makeSymbol("RESULT-QUEUE"), makeSymbol("INITIALIZED"), makeSymbol("TEMPLATE-CATEGORY"), makeSymbol("MEMOIZATION-STATE"), makeSymbol("SBHL-RESOURCE") });

    private static final SubLList $list78 = list(new SubLObject[]{ makeKeyword("STRING"), makeKeyword("PARSING-MT"), makeKeyword("SEMANTIC-MT"), makeKeyword("STRENGTHEN?"), makeKeyword("MULTIPLE-QUANTIFICATIONS?"), makeKeyword("WFF-CHECK?"), makeKeyword("FORCE"), makeKeyword("RAW-PARSES"), makeKeyword("RESULT-QUEUE"), makeKeyword("INITIALIZED"), makeKeyword("TEMPLATE-CATEGORY"), makeKeyword("MEMOIZATION-STATE"), makeKeyword("SBHL-RESOURCE") });

    private static final SubLList $list79 = list(new SubLObject[]{ makeSymbol("RTP-ITERATOR-STRING"), makeSymbol("RTP-ITERATOR-PARSING-MT"), makeSymbol("RTP-ITERATOR-SEMANTIC-MT"), makeSymbol("RTP-ITERATOR-STRENGTHEN?"), makeSymbol("RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?"), makeSymbol("RTP-ITERATOR-WFF-CHECK?"), makeSymbol("RTP-ITERATOR-FORCE"), makeSymbol("RTP-ITERATOR-RAW-PARSES"), makeSymbol("RTP-ITERATOR-RESULT-QUEUE"), makeSymbol("RTP-ITERATOR-INITIALIZED"), makeSymbol("RTP-ITERATOR-TEMPLATE-CATEGORY"), makeSymbol("RTP-ITERATOR-MEMOIZATION-STATE"), makeSymbol("RTP-ITERATOR-SBHL-RESOURCE") });

    private static final SubLList $list80 = list(new SubLObject[]{ makeSymbol("_CSETF-RTP-ITERATOR-STRING"), makeSymbol("_CSETF-RTP-ITERATOR-PARSING-MT"), makeSymbol("_CSETF-RTP-ITERATOR-SEMANTIC-MT"), makeSymbol("_CSETF-RTP-ITERATOR-STRENGTHEN?"), makeSymbol("_CSETF-RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?"), makeSymbol("_CSETF-RTP-ITERATOR-WFF-CHECK?"), makeSymbol("_CSETF-RTP-ITERATOR-FORCE"), makeSymbol("_CSETF-RTP-ITERATOR-RAW-PARSES"), makeSymbol("_CSETF-RTP-ITERATOR-RESULT-QUEUE"), makeSymbol("_CSETF-RTP-ITERATOR-INITIALIZED"), makeSymbol("_CSETF-RTP-ITERATOR-TEMPLATE-CATEGORY"), makeSymbol("_CSETF-RTP-ITERATOR-MEMOIZATION-STATE"), makeSymbol("_CSETF-RTP-ITERATOR-SBHL-RESOURCE") });

    private static final SubLSymbol RTP_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RTP-ITERATOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list82 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RTP-ITERATOR-P"));

    private static final SubLSymbol RTP_ITERATOR_STRING = makeSymbol("RTP-ITERATOR-STRING");

    private static final SubLSymbol _CSETF_RTP_ITERATOR_STRING = makeSymbol("_CSETF-RTP-ITERATOR-STRING");

    private static final SubLSymbol RTP_ITERATOR_PARSING_MT = makeSymbol("RTP-ITERATOR-PARSING-MT");

    private static final SubLSymbol _CSETF_RTP_ITERATOR_PARSING_MT = makeSymbol("_CSETF-RTP-ITERATOR-PARSING-MT");

    private static final SubLSymbol RTP_ITERATOR_SEMANTIC_MT = makeSymbol("RTP-ITERATOR-SEMANTIC-MT");

    private static final SubLSymbol _CSETF_RTP_ITERATOR_SEMANTIC_MT = makeSymbol("_CSETF-RTP-ITERATOR-SEMANTIC-MT");

    private static final SubLSymbol $sym89$RTP_ITERATOR_STRENGTHEN_ = makeSymbol("RTP-ITERATOR-STRENGTHEN?");

    private static final SubLSymbol $sym90$_CSETF_RTP_ITERATOR_STRENGTHEN_ = makeSymbol("_CSETF-RTP-ITERATOR-STRENGTHEN?");

    private static final SubLSymbol $sym91$RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_ = makeSymbol("RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?");

    private static final SubLSymbol $sym92$_CSETF_RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_ = makeSymbol("_CSETF-RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?");

    private static final SubLSymbol $sym93$RTP_ITERATOR_WFF_CHECK_ = makeSymbol("RTP-ITERATOR-WFF-CHECK?");

    private static final SubLSymbol $sym94$_CSETF_RTP_ITERATOR_WFF_CHECK_ = makeSymbol("_CSETF-RTP-ITERATOR-WFF-CHECK?");

    private static final SubLSymbol RTP_ITERATOR_FORCE = makeSymbol("RTP-ITERATOR-FORCE");

    private static final SubLSymbol _CSETF_RTP_ITERATOR_FORCE = makeSymbol("_CSETF-RTP-ITERATOR-FORCE");

    private static final SubLSymbol RTP_ITERATOR_RAW_PARSES = makeSymbol("RTP-ITERATOR-RAW-PARSES");

    private static final SubLSymbol _CSETF_RTP_ITERATOR_RAW_PARSES = makeSymbol("_CSETF-RTP-ITERATOR-RAW-PARSES");

    private static final SubLSymbol RTP_ITERATOR_RESULT_QUEUE = makeSymbol("RTP-ITERATOR-RESULT-QUEUE");

    private static final SubLSymbol _CSETF_RTP_ITERATOR_RESULT_QUEUE = makeSymbol("_CSETF-RTP-ITERATOR-RESULT-QUEUE");

    private static final SubLSymbol RTP_ITERATOR_INITIALIZED = makeSymbol("RTP-ITERATOR-INITIALIZED");

    private static final SubLSymbol _CSETF_RTP_ITERATOR_INITIALIZED = makeSymbol("_CSETF-RTP-ITERATOR-INITIALIZED");

    private static final SubLSymbol RTP_ITERATOR_TEMPLATE_CATEGORY = makeSymbol("RTP-ITERATOR-TEMPLATE-CATEGORY");

    private static final SubLSymbol _CSETF_RTP_ITERATOR_TEMPLATE_CATEGORY = makeSymbol("_CSETF-RTP-ITERATOR-TEMPLATE-CATEGORY");

    private static final SubLSymbol RTP_ITERATOR_MEMOIZATION_STATE = makeSymbol("RTP-ITERATOR-MEMOIZATION-STATE");

    private static final SubLSymbol _CSETF_RTP_ITERATOR_MEMOIZATION_STATE = makeSymbol("_CSETF-RTP-ITERATOR-MEMOIZATION-STATE");

    private static final SubLSymbol RTP_ITERATOR_SBHL_RESOURCE = makeSymbol("RTP-ITERATOR-SBHL-RESOURCE");

    private static final SubLSymbol _CSETF_RTP_ITERATOR_SBHL_RESOURCE = makeSymbol("_CSETF-RTP-ITERATOR-SBHL-RESOURCE");

    private static final SubLSymbol $kw113$MULTIPLE_QUANTIFICATIONS_ = makeKeyword("MULTIPLE-QUANTIFICATIONS?");

    private static final SubLSymbol $kw114$WFF_CHECK_ = makeKeyword("WFF-CHECK?");

    private static final SubLSymbol MAKE_RTP_ITERATOR = makeSymbol("MAKE-RTP-ITERATOR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RTP_ITERATOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RTP-ITERATOR-METHOD");

    private static final SubLSymbol RTP_ITERATOR_DONE = makeSymbol("RTP-ITERATOR-DONE");

    private static final SubLSymbol RTP_ITERATOR_NEXT = makeSymbol("RTP-ITERATOR-NEXT");







    private static final SubLSymbol $sym132$EL_WFF_ = makeSymbol("EL-WFF?");

    public static final SubLObject itp_result_iterator_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject itp_result_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject itp_result_iterator_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_result_iterator_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject itp_result_iterator_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_result_iterator_native.class ? T : NIL;
    }

    public static final SubLObject itp_result_iterator_style_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_RESULT_ITERATOR_P);
        return v_object.getField2();
    }

    public static SubLObject itp_result_iterator_style(final SubLObject v_object) {
        assert NIL != rtp_iterators.itp_result_iterator_p(v_object) : "! rtp_iterators.itp_result_iterator_p(v_object) " + "rtp_iterators.itp_result_iterator_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject itp_result_iterator_parses_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_RESULT_ITERATOR_P);
        return v_object.getField3();
    }

    public static SubLObject itp_result_iterator_parses(final SubLObject v_object) {
        assert NIL != rtp_iterators.itp_result_iterator_p(v_object) : "! rtp_iterators.itp_result_iterator_p(v_object) " + "rtp_iterators.itp_result_iterator_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject itp_result_iterator_span_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_RESULT_ITERATOR_P);
        return v_object.getField4();
    }

    public static SubLObject itp_result_iterator_span(final SubLObject v_object) {
        assert NIL != rtp_iterators.itp_result_iterator_p(v_object) : "! rtp_iterators.itp_result_iterator_p(v_object) " + "rtp_iterators.itp_result_iterator_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject itp_result_iterator_section_iterator_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_RESULT_ITERATOR_P);
        return v_object.getField5();
    }

    public static SubLObject itp_result_iterator_section_iterator(final SubLObject v_object) {
        assert NIL != rtp_iterators.itp_result_iterator_p(v_object) : "! rtp_iterators.itp_result_iterator_p(v_object) " + "rtp_iterators.itp_result_iterator_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject _csetf_itp_result_iterator_style_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_RESULT_ITERATOR_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_itp_result_iterator_style(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.itp_result_iterator_p(v_object) : "! rtp_iterators.itp_result_iterator_p(v_object) " + "rtp_iterators.itp_result_iterator_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_itp_result_iterator_parses_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_RESULT_ITERATOR_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_itp_result_iterator_parses(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.itp_result_iterator_p(v_object) : "! rtp_iterators.itp_result_iterator_p(v_object) " + "rtp_iterators.itp_result_iterator_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_itp_result_iterator_span_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_RESULT_ITERATOR_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_itp_result_iterator_span(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.itp_result_iterator_p(v_object) : "! rtp_iterators.itp_result_iterator_p(v_object) " + "rtp_iterators.itp_result_iterator_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_itp_result_iterator_section_iterator_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_RESULT_ITERATOR_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_itp_result_iterator_section_iterator(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.itp_result_iterator_p(v_object) : "! rtp_iterators.itp_result_iterator_p(v_object) " + "rtp_iterators.itp_result_iterator_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject make_itp_result_iterator_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_result_iterator_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($STYLE)) {
                        com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_result_iterator_style(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PARSES)) {
                            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_result_iterator_parses(v_new, current_value);
                        } else {
                            if (pcase_var.eql($SPAN)) {
                                com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_result_iterator_span(v_new, current_value);
                            } else {
                                if (pcase_var.eql($SECTION_ITERATOR)) {
                                    com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_result_iterator_section_iterator(v_new, current_value);
                                } else {
                                    Errors.error($str_alt20$Invalid_slot__S_for_construction_, current_arg);
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_itp_result_iterator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_result_iterator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STYLE)) {
                rtp_iterators._csetf_itp_result_iterator_style(v_new, current_value);
            } else
                if (pcase_var.eql($PARSES)) {
                    rtp_iterators._csetf_itp_result_iterator_parses(v_new, current_value);
                } else
                    if (pcase_var.eql($SPAN)) {
                        rtp_iterators._csetf_itp_result_iterator_span(v_new, current_value);
                    } else
                        if (pcase_var.eql($SECTION_ITERATOR)) {
                            rtp_iterators._csetf_itp_result_iterator_section_iterator(v_new, current_value);
                        } else {
                            Errors.error(rtp_iterators.$str21$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_itp_result_iterator(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, rtp_iterators.MAKE_ITP_RESULT_ITERATOR, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STYLE, rtp_iterators.itp_result_iterator_style(obj));
        funcall(visitor_fn, obj, $SLOT, $PARSES, rtp_iterators.itp_result_iterator_parses(obj));
        funcall(visitor_fn, obj, $SLOT, $SPAN, rtp_iterators.itp_result_iterator_span(obj));
        funcall(visitor_fn, obj, $SLOT, $SECTION_ITERATOR, rtp_iterators.itp_result_iterator_section_iterator(obj));
        funcall(visitor_fn, obj, $END, rtp_iterators.MAKE_ITP_RESULT_ITERATOR, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_itp_result_iterator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return rtp_iterators.visit_defstruct_itp_result_iterator(obj, visitor_fn);
    }

    public static final SubLObject itp_section_iterator_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_print_section_iterator(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject itp_section_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        rtp_iterators.itp_print_section_iterator(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject itp_section_iterator_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_section_iterator_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject itp_section_iterator_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_section_iterator_native.class ? T : NIL;
    }

    public static final SubLObject itp_section_iterator_parent_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_SECTION_ITERATOR_P);
        return v_object.getField2();
    }

    public static SubLObject itp_section_iterator_parent(final SubLObject v_object) {
        assert NIL != rtp_iterators.itp_section_iterator_p(v_object) : "! rtp_iterators.itp_section_iterator_p(v_object) " + "rtp_iterators.itp_section_iterator_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject itp_section_iterator_span_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_SECTION_ITERATOR_P);
        return v_object.getField3();
    }

    public static SubLObject itp_section_iterator_span(final SubLObject v_object) {
        assert NIL != rtp_iterators.itp_section_iterator_p(v_object) : "! rtp_iterators.itp_section_iterator_p(v_object) " + "rtp_iterators.itp_section_iterator_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject itp_section_iterator_section_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_SECTION_ITERATOR_P);
        return v_object.getField4();
    }

    public static SubLObject itp_section_iterator_section(final SubLObject v_object) {
        assert NIL != rtp_iterators.itp_section_iterator_p(v_object) : "! rtp_iterators.itp_section_iterator_p(v_object) " + "rtp_iterators.itp_section_iterator_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject itp_section_iterator_current_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_SECTION_ITERATOR_P);
        return v_object.getField5();
    }

    public static SubLObject itp_section_iterator_current(final SubLObject v_object) {
        assert NIL != rtp_iterators.itp_section_iterator_p(v_object) : "! rtp_iterators.itp_section_iterator_p(v_object) " + "rtp_iterators.itp_section_iterator_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject _csetf_itp_section_iterator_parent_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_SECTION_ITERATOR_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_itp_section_iterator_parent(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.itp_section_iterator_p(v_object) : "! rtp_iterators.itp_section_iterator_p(v_object) " + "rtp_iterators.itp_section_iterator_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_itp_section_iterator_span_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_SECTION_ITERATOR_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_itp_section_iterator_span(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.itp_section_iterator_p(v_object) : "! rtp_iterators.itp_section_iterator_p(v_object) " + "rtp_iterators.itp_section_iterator_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_itp_section_iterator_section_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_SECTION_ITERATOR_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_itp_section_iterator_section(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.itp_section_iterator_p(v_object) : "! rtp_iterators.itp_section_iterator_p(v_object) " + "rtp_iterators.itp_section_iterator_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_itp_section_iterator_current_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_SECTION_ITERATOR_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_itp_section_iterator_current(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.itp_section_iterator_p(v_object) : "! rtp_iterators.itp_section_iterator_p(v_object) " + "rtp_iterators.itp_section_iterator_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject make_itp_section_iterator_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_section_iterator_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($PARENT)) {
                        com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_section_iterator_parent(v_new, current_value);
                    } else {
                        if (pcase_var.eql($SPAN)) {
                            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_section_iterator_span(v_new, current_value);
                        } else {
                            if (pcase_var.eql($SECTION)) {
                                com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_section_iterator_section(v_new, current_value);
                            } else {
                                if (pcase_var.eql($CURRENT)) {
                                    com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_section_iterator_current(v_new, current_value);
                                } else {
                                    Errors.error($str_alt20$Invalid_slot__S_for_construction_, current_arg);
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_itp_section_iterator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_section_iterator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PARENT)) {
                rtp_iterators._csetf_itp_section_iterator_parent(v_new, current_value);
            } else
                if (pcase_var.eql($SPAN)) {
                    rtp_iterators._csetf_itp_section_iterator_span(v_new, current_value);
                } else
                    if (pcase_var.eql($SECTION)) {
                        rtp_iterators._csetf_itp_section_iterator_section(v_new, current_value);
                    } else
                        if (pcase_var.eql($CURRENT)) {
                            rtp_iterators._csetf_itp_section_iterator_current(v_new, current_value);
                        } else {
                            Errors.error(rtp_iterators.$str21$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_itp_section_iterator(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, rtp_iterators.MAKE_ITP_SECTION_ITERATOR, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PARENT, rtp_iterators.itp_section_iterator_parent(obj));
        funcall(visitor_fn, obj, $SLOT, $SPAN, rtp_iterators.itp_section_iterator_span(obj));
        funcall(visitor_fn, obj, $SLOT, $SECTION, rtp_iterators.itp_section_iterator_section(obj));
        funcall(visitor_fn, obj, $SLOT, $CURRENT, rtp_iterators.itp_section_iterator_current(obj));
        funcall(visitor_fn, obj, $END, rtp_iterators.MAKE_ITP_SECTION_ITERATOR, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_itp_section_iterator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return rtp_iterators.visit_defstruct_itp_section_iterator(obj, visitor_fn);
    }

    public static final SubLObject itp_print_section_iterator_alt(SubLObject entry, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt40$_ITP_SECTION___S_, com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_span(entry));
        return entry;
    }

    public static SubLObject itp_print_section_iterator(final SubLObject entry, final SubLObject stream, final SubLObject depth) {
        format(stream, rtp_iterators.$str49$_ITP_SECTION___S_, rtp_iterators.itp_section_iterator_span(entry));
        return entry;
    }

    public static final SubLObject itp_child_iterator_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_print_child_iterator(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject itp_child_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        rtp_iterators.itp_print_child_iterator(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject itp_child_iterator_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_child_iterator_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject itp_child_iterator_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_child_iterator_native.class ? T : NIL;
    }

    public static final SubLObject itp_child_iterator_parent_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_CHILD_ITERATOR_P);
        return v_object.getField2();
    }

    public static SubLObject itp_child_iterator_parent(final SubLObject v_object) {
        assert NIL != rtp_iterators.itp_child_iterator_p(v_object) : "! rtp_iterators.itp_child_iterator_p(v_object) " + "rtp_iterators.itp_child_iterator_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject itp_child_iterator_rop_formula_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_CHILD_ITERATOR_P);
        return v_object.getField3();
    }

    public static SubLObject itp_child_iterator_rop_formula(final SubLObject v_object) {
        assert NIL != rtp_iterators.itp_child_iterator_p(v_object) : "! rtp_iterators.itp_child_iterator_p(v_object) " + "rtp_iterators.itp_child_iterator_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject itp_child_iterator_section_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_CHILD_ITERATOR_P);
        return v_object.getField4();
    }

    public static SubLObject itp_child_iterator_section(final SubLObject v_object) {
        assert NIL != rtp_iterators.itp_child_iterator_p(v_object) : "! rtp_iterators.itp_child_iterator_p(v_object) " + "rtp_iterators.itp_child_iterator_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_itp_child_iterator_parent_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_CHILD_ITERATOR_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_itp_child_iterator_parent(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.itp_child_iterator_p(v_object) : "! rtp_iterators.itp_child_iterator_p(v_object) " + "rtp_iterators.itp_child_iterator_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_itp_child_iterator_rop_formula_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_CHILD_ITERATOR_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_itp_child_iterator_rop_formula(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.itp_child_iterator_p(v_object) : "! rtp_iterators.itp_child_iterator_p(v_object) " + "rtp_iterators.itp_child_iterator_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_itp_child_iterator_section_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_CHILD_ITERATOR_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_itp_child_iterator_section(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.itp_child_iterator_p(v_object) : "! rtp_iterators.itp_child_iterator_p(v_object) " + "rtp_iterators.itp_child_iterator_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_itp_child_iterator_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_child_iterator_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($PARENT)) {
                        com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_child_iterator_parent(v_new, current_value);
                    } else {
                        if (pcase_var.eql($ROP_FORMULA)) {
                            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_child_iterator_rop_formula(v_new, current_value);
                        } else {
                            if (pcase_var.eql($SECTION)) {
                                com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_child_iterator_section(v_new, current_value);
                            } else {
                                Errors.error($str_alt20$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_itp_child_iterator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rtp.rtp_iterators.$itp_child_iterator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PARENT)) {
                rtp_iterators._csetf_itp_child_iterator_parent(v_new, current_value);
            } else
                if (pcase_var.eql($ROP_FORMULA)) {
                    rtp_iterators._csetf_itp_child_iterator_rop_formula(v_new, current_value);
                } else
                    if (pcase_var.eql($SECTION)) {
                        rtp_iterators._csetf_itp_child_iterator_section(v_new, current_value);
                    } else {
                        Errors.error(rtp_iterators.$str21$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_itp_child_iterator(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, rtp_iterators.MAKE_ITP_CHILD_ITERATOR, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PARENT, rtp_iterators.itp_child_iterator_parent(obj));
        funcall(visitor_fn, obj, $SLOT, $ROP_FORMULA, rtp_iterators.itp_child_iterator_rop_formula(obj));
        funcall(visitor_fn, obj, $SLOT, $SECTION, rtp_iterators.itp_child_iterator_section(obj));
        funcall(visitor_fn, obj, $END, rtp_iterators.MAKE_ITP_CHILD_ITERATOR, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_itp_child_iterator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return rtp_iterators.visit_defstruct_itp_child_iterator(obj, visitor_fn);
    }

    public static final SubLObject itp_print_child_iterator_alt(SubLObject entry, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt56$_ITP_CHILD___S_, com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_child_iterator_rop_formula(entry));
        return entry;
    }

    public static SubLObject itp_print_child_iterator(final SubLObject entry, final SubLObject stream, final SubLObject depth) {
        format(stream, rtp_iterators.$str68$_ITP_CHILD___S_, rtp_iterators.itp_child_iterator_rop_formula(entry));
        return entry;
    }

    public static final SubLObject new_itp_result_iterator_alt(SubLObject parses, SubLObject style, SubLObject string) {
        if (style == UNPROVIDED) {
            style = NIL;
        }
        if (string == UNPROVIDED) {
            string = NIL;
        }
        {
            SubLObject iterator = com.cyc.cycjava.cycl.rtp.rtp_iterators.make_itp_result_iterator(UNPROVIDED);
            if (NIL == style) {
                style = com.cyc.cycjava.cycl.rtp.rtp_iterators.determine_parse_result_style(parses);
            }
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_result_iterator_style(iterator, style);
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_result_iterator_parses(iterator, parses);
            com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_reset(iterator);
            return iterator;
        }
    }

    public static SubLObject new_itp_result_iterator(final SubLObject parses, SubLObject style, SubLObject string) {
        if (style == UNPROVIDED) {
            style = NIL;
        }
        if (string == UNPROVIDED) {
            string = NIL;
        }
        final SubLObject iterator = rtp_iterators.make_itp_result_iterator(UNPROVIDED);
        if (NIL == style) {
            style = rtp_iterators.determine_parse_result_style(parses);
        }
        rtp_iterators._csetf_itp_result_iterator_style(iterator, style);
        rtp_iterators._csetf_itp_result_iterator_parses(iterator, parses);
        rtp_iterators.itp_result_iterator_reset(iterator);
        return iterator;
    }

    public static final SubLObject determine_parse_result_style_alt(SubLObject parses) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject first_span_set = second(parses.first());
                SubLObject first_parse = first_span_set.first();
                SubLObject result = $SIMPLE;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        if (NIL != rtp_constituent_weeders.itp_semantics_p(first_parse)) {
                            result = $RANKED;
                        } else {
                            if (first_parse.isList() && (NIL != assertion_handles.assertion_p(second(first_parse)))) {
                                result = $ASSERTION;
                            } else {
                                if ((first_parse.isList() && second(first_parse).isList()) && (NIL != assertion_handles.assertion_p(second(first_parse).first()))) {
                                    result = $ASSERTION;
                                } else {
                                    result = $SIMPLE;
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject determine_parse_result_style(final SubLObject parses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject first_span_set = second(parses.first());
        final SubLObject first_parse = first_span_set.first();
        SubLObject result = $SIMPLE;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            $mt$.bind(rtp_iterators.$$EverythingPSC, thread);
            if (NIL != rtp_constituent_weeders.itp_semantics_p(first_parse)) {
                result = $RANKED;
            } else
                if (first_parse.isList() && (NIL != assertion_p(second(first_parse)))) {
                    result = $ASSERTION;
                } else
                    if ((first_parse.isList() && second(first_parse).isList()) && (NIL != assertion_p(second(first_parse).first()))) {
                        result = $ASSERTION;
                    } else {
                        result = $SIMPLE;
                    }


        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject copy_itp_result_iterator_alt(SubLObject result_iterator) {
        {
            SubLObject result = com.cyc.cycjava.cycl.rtp.rtp_iterators.make_itp_result_iterator(UNPROVIDED);
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_result_iterator_style(result, com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_style(result_iterator));
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_result_iterator_parses(result, com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_parses(result_iterator));
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_result_iterator_span(result, com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_span(result_iterator));
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_result_iterator_section_iterator(result, com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_section_iterator(result_iterator));
            return result;
        }
    }

    public static SubLObject copy_itp_result_iterator(final SubLObject result_iterator) {
        final SubLObject result = rtp_iterators.make_itp_result_iterator(UNPROVIDED);
        rtp_iterators._csetf_itp_result_iterator_style(result, rtp_iterators.itp_result_iterator_style(result_iterator));
        rtp_iterators._csetf_itp_result_iterator_parses(result, rtp_iterators.itp_result_iterator_parses(result_iterator));
        rtp_iterators._csetf_itp_result_iterator_span(result, rtp_iterators.itp_result_iterator_span(result_iterator));
        rtp_iterators._csetf_itp_result_iterator_section_iterator(result, rtp_iterators.itp_result_iterator_section_iterator(result_iterator));
        return result;
    }

    public static final SubLObject new_itp_section_iterator_alt(SubLObject parent, SubLObject span) {
        {
            SubLObject iterator = com.cyc.cycjava.cycl.rtp.rtp_iterators.make_itp_section_iterator(UNPROVIDED);
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_section_iterator_parent(iterator, parent);
            {
                SubLObject the_span = span.first();
                SubLObject the_section = second(span);
                com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_section_iterator_span(iterator, the_span);
                com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_section_iterator_section(iterator, the_section);
            }
            com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_reset(iterator);
            return iterator;
        }
    }

    public static SubLObject new_itp_section_iterator(final SubLObject parent, final SubLObject span) {
        final SubLObject iterator = rtp_iterators.make_itp_section_iterator(UNPROVIDED);
        rtp_iterators._csetf_itp_section_iterator_parent(iterator, parent);
        final SubLObject the_span = span.first();
        final SubLObject the_section = second(span);
        rtp_iterators._csetf_itp_section_iterator_span(iterator, the_span);
        rtp_iterators._csetf_itp_section_iterator_section(iterator, the_section);
        rtp_iterators.itp_section_iterator_reset(iterator);
        return iterator;
    }

    public static final SubLObject new_itp_child_iterator_alt(SubLObject parent, SubLObject rop_formula) {
        {
            SubLObject iterator = com.cyc.cycjava.cycl.rtp.rtp_iterators.make_itp_child_iterator(UNPROVIDED);
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_child_iterator_parent(iterator, parent);
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_child_iterator_rop_formula(iterator, rop_formula);
            {
                SubLObject span = parsing_utilities.result_of_parsing_span_wXo_thelist(rop_formula);
                com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_child_iterator_section(iterator, com.cyc.cycjava.cycl.rtp.rtp_iterators.find_itp_section_iterator(parent, span));
            }
            return iterator;
        }
    }

    public static SubLObject new_itp_child_iterator(final SubLObject parent, final SubLObject rop_formula) {
        final SubLObject iterator = rtp_iterators.make_itp_child_iterator(UNPROVIDED);
        rtp_iterators._csetf_itp_child_iterator_parent(iterator, parent);
        rtp_iterators._csetf_itp_child_iterator_rop_formula(iterator, rop_formula);
        final SubLObject span = result_of_parsing_span_wXo_thelist(rop_formula);
        rtp_iterators._csetf_itp_child_iterator_section(iterator, rtp_iterators.find_itp_section_iterator(parent, span));
        return iterator;
    }

    public static final SubLObject new_itp_root_children_iterator_alt(SubLObject parent) {
        {
            SubLObject iterator = com.cyc.cycjava.cycl.rtp.rtp_iterators.make_itp_child_iterator(UNPROVIDED);
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_child_iterator_parent(iterator, parent);
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_child_iterator_section(iterator, com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_curr(parent));
            return iterator;
        }
    }

    public static SubLObject new_itp_root_children_iterator(final SubLObject parent) {
        final SubLObject iterator = rtp_iterators.make_itp_child_iterator(UNPROVIDED);
        rtp_iterators._csetf_itp_child_iterator_parent(iterator, parent);
        rtp_iterators._csetf_itp_child_iterator_section(iterator, rtp_iterators.itp_result_iterator_curr(parent));
        return iterator;
    }

    public static final SubLObject is_itp_root_children_iteratorP_alt(SubLObject iterator) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_child_iterator_p(iterator)) && (NIL == com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_child_iterator_rop_formula(iterator)));
    }

    public static SubLObject is_itp_root_children_iteratorP(final SubLObject iterator) {
        return makeBoolean((NIL != rtp_iterators.itp_child_iterator_p(iterator)) && (NIL == rtp_iterators.itp_child_iterator_rop_formula(iterator)));
    }

    /**
     * Test if these are child iterators for the same area.
     */
    @LispMethod(comment = "Test if these are child iterators for the same area.")
    public static final SubLObject is_equivalent_rtp_child_iteratorP_alt(SubLObject iterator_1, SubLObject iterator_2) {
        return equalp(com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_child_iterator_rop_formula(iterator_1), com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_child_iterator_rop_formula(iterator_2));
    }

    /**
     * Test if these are child iterators for the same area.
     */
    @LispMethod(comment = "Test if these are child iterators for the same area.")
    public static SubLObject is_equivalent_rtp_child_iteratorP(final SubLObject iterator_1, final SubLObject iterator_2) {
        return equalp(rtp_iterators.itp_child_iterator_rop_formula(iterator_1), rtp_iterators.itp_child_iterator_rop_formula(iterator_2));
    }

    public static final SubLObject itp_result_iterator_reset_alt(SubLObject iterator) {
        {
            SubLObject span = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_parses(iterator);
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_result_iterator_span(iterator, span);
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.update_itp_result_section_iterator(iterator);
        }
    }

    public static SubLObject itp_result_iterator_reset(final SubLObject iterator) {
        final SubLObject span = rtp_iterators.itp_result_iterator_parses(iterator);
        rtp_iterators._csetf_itp_result_iterator_span(iterator, span);
        return rtp_iterators.update_itp_result_section_iterator(iterator);
    }

    public static final SubLObject itp_result_iterator_curr_alt(SubLObject iterator) {
        return com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_section_iterator(iterator);
    }

    public static SubLObject itp_result_iterator_curr(final SubLObject iterator) {
        return rtp_iterators.itp_result_iterator_section_iterator(iterator);
    }

    public static final SubLObject itp_section_iterator_reset_alt(SubLObject iterator) {
        {
            SubLObject current = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_section(iterator);
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_section_iterator_current(iterator, current);
            return iterator;
        }
    }

    public static SubLObject itp_section_iterator_reset(final SubLObject iterator) {
        final SubLObject current = rtp_iterators.itp_section_iterator_section(iterator);
        rtp_iterators._csetf_itp_section_iterator_current(iterator, current);
        return iterator;
    }

    /**
     * always return the first parse of the section, regardless of where the iterator is
     */
    @LispMethod(comment = "always return the first parse of the section, regardless of where the iterator is")
    public static final SubLObject itp_section_iterator_curr_alt(SubLObject iterator) {
        return com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_current(iterator).first();
    }

    /**
     * always return the first parse of the section, regardless of where the iterator is
     */
    @LispMethod(comment = "always return the first parse of the section, regardless of where the iterator is")
    public static SubLObject itp_section_iterator_curr(final SubLObject iterator) {
        return rtp_iterators.itp_section_iterator_current(iterator).first();
    }

    public static final SubLObject itp_section_iterator_set_curr_alt(SubLObject iterator, SubLObject element) {
        rplaca(com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_current(iterator), element);
        return element;
    }

    public static SubLObject itp_section_iterator_set_curr(final SubLObject iterator, final SubLObject element) {
        rplaca(rtp_iterators.itp_section_iterator_current(iterator), element);
        return element;
    }

    public static final SubLObject itp_section_iterator_curr_span_alt(SubLObject iterator) {
        return com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_span(iterator);
    }

    public static SubLObject itp_section_iterator_curr_span(final SubLObject iterator) {
        return rtp_iterators.itp_section_iterator_span(iterator);
    }

    public static final SubLObject itp_section_iterator_curr_cycl_alt(SubLObject iterator) {
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_style(com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_parent(iterator));
            if (pcase_var.eql($SIMPLE)) {
                return com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_curr(iterator);
            } else {
                if (pcase_var.eql($ASSERTION)) {
                    return com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_curr(iterator).first();
                } else {
                    if (pcase_var.eql($RANKED)) {
                        return rtp_constituent_weeders.itp_semantics_cycl(com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_curr(iterator));
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject itp_section_iterator_curr_cycl(final SubLObject iterator) {
        final SubLObject pcase_var = rtp_iterators.itp_result_iterator_style(rtp_iterators.itp_section_iterator_parent(iterator));
        if (pcase_var.eql($SIMPLE)) {
            return rtp_iterators.itp_section_iterator_curr(iterator);
        }
        if (pcase_var.eql($ASSERTION)) {
            return rtp_iterators.itp_section_iterator_curr(iterator).first();
        }
        if (pcase_var.eql($RANKED)) {
            return rtp_constituent_weeders.itp_semantics_cycl(rtp_iterators.itp_section_iterator_curr(iterator));
        }
        return NIL;
    }

    public static final SubLObject itp_section_iterator_curr_assertion_alt(SubLObject iterator) {
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_style(com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_parent(iterator));
            if (pcase_var.eql($ASSERTION)) {
                return second(com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_curr(iterator));
            } else {
                if (pcase_var.eql($RANKED)) {
                    return rtp_constituent_weeders.itp_semantics_supports(com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_curr(iterator));
                } else {
                    return $UNAVAILABLE;
                }
            }
        }
    }

    public static SubLObject itp_section_iterator_curr_assertion(final SubLObject iterator) {
        final SubLObject pcase_var = rtp_iterators.itp_result_iterator_style(rtp_iterators.itp_section_iterator_parent(iterator));
        if (pcase_var.eql($ASSERTION)) {
            return second(rtp_iterators.itp_section_iterator_curr(iterator));
        }
        if (pcase_var.eql($RANKED)) {
            return rtp_constituent_weeders.itp_semantics_supports(rtp_iterators.itp_section_iterator_curr(iterator));
        }
        return $UNAVAILABLE;
    }

    public static final SubLObject itp_section_iterator_curr_pred_alt(SubLObject iterator) {
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_style(com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_parent(iterator));
            if (pcase_var.eql($SIMPLE)) {
                return $UNAVAILABLE;
            } else {
                if (pcase_var.eql($ASSERTION)) {
                    return com.cyc.cycjava.cycl.rtp.rtp_iterators.args_from_assertions(ZERO_INTEGER, com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_curr_assertion(iterator));
                } else {
                    if (pcase_var.eql($RANKED)) {
                        return rtp_constituent_weeders.itp_semantics_force(com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_curr(iterator));
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject itp_section_iterator_curr_pred(final SubLObject iterator) {
        final SubLObject pcase_var = rtp_iterators.itp_result_iterator_style(rtp_iterators.itp_section_iterator_parent(iterator));
        if (pcase_var.eql($SIMPLE)) {
            return $UNAVAILABLE;
        }
        if (pcase_var.eql($ASSERTION)) {
            return rtp_iterators.args_from_assertions(ZERO_INTEGER, rtp_iterators.itp_section_iterator_curr_assertion(iterator));
        }
        if (pcase_var.eql($RANKED)) {
            return rtp_constituent_weeders.itp_semantics_force(rtp_iterators.itp_section_iterator_curr(iterator));
        }
        return NIL;
    }

    public static final SubLObject itp_section_iterator_curr_cat_alt(SubLObject iterator) {
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_style(com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_parent(iterator));
            if (pcase_var.eql($SIMPLE)) {
                return $UNAVAILABLE;
            } else {
                if (pcase_var.eql($ASSERTION)) {
                    return com.cyc.cycjava.cycl.rtp.rtp_iterators.args_from_assertions(ONE_INTEGER, com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_curr_assertion(iterator));
                } else {
                    if (pcase_var.eql($RANKED)) {
                        return rtp_constituent_weeders.itp_semantics_category(com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_curr(iterator));
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject itp_section_iterator_curr_cat(final SubLObject iterator) {
        final SubLObject pcase_var = rtp_iterators.itp_result_iterator_style(rtp_iterators.itp_section_iterator_parent(iterator));
        if (pcase_var.eql($SIMPLE)) {
            return $UNAVAILABLE;
        }
        if (pcase_var.eql($ASSERTION)) {
            return rtp_iterators.args_from_assertions(ONE_INTEGER, rtp_iterators.itp_section_iterator_curr_assertion(iterator));
        }
        if (pcase_var.eql($RANKED)) {
            return rtp_constituent_weeders.itp_semantics_category(rtp_iterators.itp_section_iterator_curr(iterator));
        }
        return NIL;
    }

    public static final SubLObject itp_section_iterator_curr_confidence_alt(SubLObject iterator) {
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_style(com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_parent(iterator));
            if (pcase_var.eql($RANKED)) {
                return rtp_constituent_weeders.itp_semantics_confidence(com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_curr(iterator));
            } else {
                return $UNAVAILABLE;
            }
        }
    }

    public static SubLObject itp_section_iterator_curr_confidence(final SubLObject iterator) {
        final SubLObject pcase_var = rtp_iterators.itp_result_iterator_style(rtp_iterators.itp_section_iterator_parent(iterator));
        if (pcase_var.eql($RANKED)) {
            return rtp_constituent_weeders.itp_semantics_confidence(rtp_iterators.itp_section_iterator_curr(iterator));
        }
        return $UNAVAILABLE;
    }

    public static final SubLObject args_from_assertions_alt(SubLObject arg_num, SubLObject asserts) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = asserts;
            SubLObject v_assert = NIL;
            for (v_assert = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_assert = cdolist_list_var.first()) {
                if (NIL != assertion_handles.assertion_p(v_assert)) {
                    result = cons(assertions_high.gaf_arg(v_assert, arg_num), result);
                } else {
                    result = cons(v_assert, result);
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject args_from_assertions(final SubLObject arg_num, final SubLObject asserts) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = asserts;
        SubLObject v_assert = NIL;
        v_assert = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertion_p(v_assert)) {
                result = cons(gaf_arg(v_assert, arg_num), result);
            } else {
                result = cons(v_assert, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_assert = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    /**
     *
     *
     * @return ITP-SECTION-ITERATOR that matches SPAN; nil if no match
     */
    @LispMethod(comment = "@return ITP-SECTION-ITERATOR that matches SPAN; nil if no match")
    public static final SubLObject find_itp_section_iterator_alt(SubLObject result_iterator, SubLObject span) {
        {
            SubLObject iterator = com.cyc.cycjava.cycl.rtp.rtp_iterators.copy_itp_result_iterator(result_iterator);
            SubLObject section_iterator = NIL;
            com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_reset(iterator);
            while (NIL == com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_doneP(iterator)) {
                section_iterator = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_curr(iterator);
                if (span.equal(com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_span(section_iterator))) {
                    return section_iterator;
                }
                com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_next(iterator);
            } 
            return NIL;
        }
    }

    /**
     *
     *
     * @return ITP-SECTION-ITERATOR that matches SPAN; nil if no match
     */
    @LispMethod(comment = "@return ITP-SECTION-ITERATOR that matches SPAN; nil if no match")
    public static SubLObject find_itp_section_iterator(final SubLObject result_iterator, final SubLObject span) {
        final SubLObject iterator = rtp_iterators.copy_itp_result_iterator(result_iterator);
        SubLObject section_iterator = NIL;
        rtp_iterators.itp_result_iterator_reset(iterator);
        while (NIL == rtp_iterators.itp_result_iterator_doneP(iterator)) {
            section_iterator = rtp_iterators.itp_result_iterator_curr(iterator);
            if (span.equal(rtp_iterators.itp_section_iterator_span(section_iterator))) {
                return section_iterator;
            }
            rtp_iterators.itp_result_iterator_next(iterator);
        } 
        return NIL;
    }

    public static final SubLObject itp_child_iterator_reset_alt(SubLObject iterator) {
        {
            SubLObject section_iterator = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_child_iterator_section(iterator);
            if (NIL != com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_p(section_iterator)) {
                return com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_reset(section_iterator);
            }
        }
        return iterator;
    }

    public static SubLObject itp_child_iterator_reset(final SubLObject iterator) {
        final SubLObject section_iterator = rtp_iterators.itp_child_iterator_section(iterator);
        if (NIL != rtp_iterators.itp_section_iterator_p(section_iterator)) {
            return rtp_iterators.itp_section_iterator_reset(section_iterator);
        }
        return iterator;
    }

    public static final SubLObject itp_child_iterator_curr_alt(SubLObject iterator) {
        {
            SubLObject section_iterator = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_child_iterator_section(iterator);
            if (NIL != com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_p(section_iterator)) {
                return com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_curr(section_iterator);
            }
        }
        return NIL;
    }

    public static SubLObject itp_child_iterator_curr(final SubLObject iterator) {
        final SubLObject section_iterator = rtp_iterators.itp_child_iterator_section(iterator);
        if (NIL != rtp_iterators.itp_section_iterator_p(section_iterator)) {
            return rtp_iterators.itp_section_iterator_curr(section_iterator);
        }
        return NIL;
    }

    public static final SubLObject itp_child_iterator_curr_span_alt(SubLObject iterator) {
        {
            SubLObject section_iterator = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_child_iterator_section(iterator);
            if (NIL != com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_p(section_iterator)) {
                return com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_curr_span(section_iterator);
            }
        }
        return NIL;
    }

    public static SubLObject itp_child_iterator_curr_span(final SubLObject iterator) {
        final SubLObject section_iterator = rtp_iterators.itp_child_iterator_section(iterator);
        if (NIL != rtp_iterators.itp_section_iterator_p(section_iterator)) {
            return rtp_iterators.itp_section_iterator_curr_span(section_iterator);
        }
        return NIL;
    }

    public static final SubLObject itp_child_iterator_curr_cycl_alt(SubLObject iterator) {
        {
            SubLObject section_iterator = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_child_iterator_section(iterator);
            if (NIL != com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_p(section_iterator)) {
                return com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_curr_cycl(section_iterator);
            }
        }
        return NIL;
    }

    public static SubLObject itp_child_iterator_curr_cycl(final SubLObject iterator) {
        final SubLObject section_iterator = rtp_iterators.itp_child_iterator_section(iterator);
        if (NIL != rtp_iterators.itp_section_iterator_p(section_iterator)) {
            return rtp_iterators.itp_section_iterator_curr_cycl(section_iterator);
        }
        return NIL;
    }

    public static final SubLObject itp_child_iterator_curr_assertion_alt(SubLObject iterator) {
        {
            SubLObject section_iterator = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_child_iterator_section(iterator);
            if (NIL != com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_p(section_iterator)) {
                return com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_curr_assertion(section_iterator);
            }
        }
        return NIL;
    }

    public static SubLObject itp_child_iterator_curr_assertion(final SubLObject iterator) {
        final SubLObject section_iterator = rtp_iterators.itp_child_iterator_section(iterator);
        if (NIL != rtp_iterators.itp_section_iterator_p(section_iterator)) {
            return rtp_iterators.itp_section_iterator_curr_assertion(section_iterator);
        }
        return NIL;
    }

    public static final SubLObject itp_child_iterator_curr_pred_alt(SubLObject iterator) {
        {
            SubLObject section_iterator = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_child_iterator_section(iterator);
            if (NIL != com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_p(section_iterator)) {
                return com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_curr_pred(section_iterator);
            }
        }
        return NIL;
    }

    public static SubLObject itp_child_iterator_curr_pred(final SubLObject iterator) {
        final SubLObject section_iterator = rtp_iterators.itp_child_iterator_section(iterator);
        if (NIL != rtp_iterators.itp_section_iterator_p(section_iterator)) {
            return rtp_iterators.itp_section_iterator_curr_pred(section_iterator);
        }
        return NIL;
    }

    public static final SubLObject itp_child_iterator_curr_cat_alt(SubLObject iterator) {
        {
            SubLObject section_iterator = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_child_iterator_section(iterator);
            if (NIL != com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_p(section_iterator)) {
                return com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_curr_cat(section_iterator);
            }
        }
        return NIL;
    }

    public static SubLObject itp_child_iterator_curr_cat(final SubLObject iterator) {
        final SubLObject section_iterator = rtp_iterators.itp_child_iterator_section(iterator);
        if (NIL != rtp_iterators.itp_section_iterator_p(section_iterator)) {
            return rtp_iterators.itp_section_iterator_curr_cat(section_iterator);
        }
        return NIL;
    }

    public static final SubLObject itp_child_iterator_curr_confidence_alt(SubLObject iterator) {
        {
            SubLObject section_iterator = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_child_iterator_section(iterator);
            if (NIL != com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_p(section_iterator)) {
                return com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_curr_confidence(section_iterator);
            }
        }
        return NIL;
    }

    public static SubLObject itp_child_iterator_curr_confidence(final SubLObject iterator) {
        final SubLObject section_iterator = rtp_iterators.itp_child_iterator_section(iterator);
        if (NIL != rtp_iterators.itp_section_iterator_p(section_iterator)) {
            return rtp_iterators.itp_section_iterator_curr_confidence(section_iterator);
        }
        return NIL;
    }

    public static final SubLObject itp_result_iterator_doneP_alt(SubLObject iterator) {
        return sublisp_null(com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_span(iterator));
    }

    public static SubLObject itp_result_iterator_doneP(final SubLObject iterator) {
        return sublisp_null(rtp_iterators.itp_result_iterator_span(iterator));
    }

    public static final SubLObject itp_result_iterator_next_alt(SubLObject iterator) {
        if (NIL == com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_doneP(iterator)) {
            {
                SubLObject span = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_span(iterator);
                com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_result_iterator_span(iterator, span.rest());
            }
            com.cyc.cycjava.cycl.rtp.rtp_iterators.update_itp_result_section_iterator(iterator);
        }
        return com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_curr(iterator);
    }

    public static SubLObject itp_result_iterator_next(final SubLObject iterator) {
        if (NIL == rtp_iterators.itp_result_iterator_doneP(iterator)) {
            final SubLObject span = rtp_iterators.itp_result_iterator_span(iterator);
            rtp_iterators._csetf_itp_result_iterator_span(iterator, span.rest());
            rtp_iterators.update_itp_result_section_iterator(iterator);
        }
        return rtp_iterators.itp_result_iterator_curr(iterator);
    }

    public static final SubLObject itp_result_iterator_prev_alt(SubLObject iterator) {
        {
            SubLObject span = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_span(iterator);
            SubLObject start = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_parses(iterator);
            if (span != start) {
                while (start.rest() != span) {
                    start = start.rest();
                } 
                com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_result_iterator_span(iterator, start);
            }
            com.cyc.cycjava.cycl.rtp.rtp_iterators.update_itp_result_section_iterator(iterator);
        }
        return com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_curr(iterator);
    }

    public static SubLObject itp_result_iterator_prev(final SubLObject iterator) {
        final SubLObject span = rtp_iterators.itp_result_iterator_span(iterator);
        SubLObject start = rtp_iterators.itp_result_iterator_parses(iterator);
        if (!span.eql(start)) {
            while (!start.rest().eql(span)) {
                start = start.rest();
            } 
            rtp_iterators._csetf_itp_result_iterator_span(iterator, start);
        }
        rtp_iterators.update_itp_result_section_iterator(iterator);
        return rtp_iterators.itp_result_iterator_curr(iterator);
    }

    public static final SubLObject itp_section_iterator_next_alt(SubLObject iterator) {
        if (NIL == com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_doneP(iterator)) {
            {
                SubLObject current = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_current(iterator);
                com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_section_iterator_current(iterator, current.rest());
            }
        }
        return com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_current(iterator);
    }

    public static SubLObject itp_section_iterator_next(final SubLObject iterator) {
        if (NIL == rtp_iterators.itp_section_iterator_doneP(iterator)) {
            final SubLObject current = rtp_iterators.itp_section_iterator_current(iterator);
            rtp_iterators._csetf_itp_section_iterator_current(iterator, current.rest());
        }
        return rtp_iterators.itp_section_iterator_current(iterator);
    }

    public static final SubLObject itp_section_iterator_prev_alt(SubLObject iterator) {
        {
            SubLObject current = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_current(iterator);
            SubLObject start = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_section(iterator);
            if (current != start) {
                while (start.rest() != current) {
                    start = start.rest();
                } 
                com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_section_iterator_current(iterator, start);
            }
            return com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_curr(iterator);
        }
    }

    public static SubLObject itp_section_iterator_prev(final SubLObject iterator) {
        final SubLObject current = rtp_iterators.itp_section_iterator_current(iterator);
        SubLObject start = rtp_iterators.itp_section_iterator_section(iterator);
        if (!current.eql(start)) {
            while (!start.rest().eql(current)) {
                start = start.rest();
            } 
            rtp_iterators._csetf_itp_section_iterator_current(iterator, start);
        }
        return rtp_iterators.itp_section_iterator_curr(iterator);
    }

    public static final SubLObject itp_section_iterator_doneP_alt(SubLObject iterator) {
        return sublisp_null(com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_current(iterator));
    }

    public static SubLObject itp_section_iterator_doneP(final SubLObject iterator) {
        return sublisp_null(rtp_iterators.itp_section_iterator_current(iterator));
    }

    public static final SubLObject itp_child_iterator_next_alt(SubLObject iterator) {
        {
            SubLObject section_iterator = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_child_iterator_section(iterator);
            if (NIL != com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_p(section_iterator)) {
                return com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_next(section_iterator);
            }
        }
        return NIL;
    }

    public static SubLObject itp_child_iterator_next(final SubLObject iterator) {
        final SubLObject section_iterator = rtp_iterators.itp_child_iterator_section(iterator);
        if (NIL != rtp_iterators.itp_section_iterator_p(section_iterator)) {
            return rtp_iterators.itp_section_iterator_next(section_iterator);
        }
        return NIL;
    }

    public static final SubLObject itp_child_iterator_prev_alt(SubLObject iterator) {
        {
            SubLObject section_iterator = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_child_iterator_section(iterator);
            if (NIL != com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_p(section_iterator)) {
                return com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_prev(section_iterator);
            }
        }
        return NIL;
    }

    public static SubLObject itp_child_iterator_prev(final SubLObject iterator) {
        final SubLObject section_iterator = rtp_iterators.itp_child_iterator_section(iterator);
        if (NIL != rtp_iterators.itp_section_iterator_p(section_iterator)) {
            return rtp_iterators.itp_section_iterator_prev(section_iterator);
        }
        return NIL;
    }

    public static final SubLObject itp_child_iterator_doneP_alt(SubLObject iterator) {
        {
            SubLObject section_iterator = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_child_iterator_section(iterator);
            if (NIL != com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_p(section_iterator)) {
                return com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_doneP(section_iterator);
            }
        }
        return T;
    }

    public static SubLObject itp_child_iterator_doneP(final SubLObject iterator) {
        final SubLObject section_iterator = rtp_iterators.itp_child_iterator_section(iterator);
        if (NIL != rtp_iterators.itp_section_iterator_p(section_iterator)) {
            return rtp_iterators.itp_section_iterator_doneP(section_iterator);
        }
        return T;
    }

    /**
     *
     *
     * @return 0 LISTP; of CycL interpretations for the longest parsed span of PARSES
     * @return 1 LISTP; The span corresponding to the returned CycLs.
     */
    @LispMethod(comment = "@return 0 LISTP; of CycL interpretations for the longest parsed span of PARSES\r\n@return 1 LISTP; The span corresponding to the returned CycLs.")
    public static final SubLObject itp_longest_parse_cycls_alt(SubLObject parses) {
        {
            SubLObject result_iterator = com.cyc.cycjava.cycl.rtp.rtp_iterators.new_itp_result_iterator(parses, UNPROVIDED, UNPROVIDED);
            SubLObject max_span_length = ZERO_INTEGER;
            SubLObject max_span = NIL;
            SubLObject output_cycls = NIL;
            while (NIL == com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_doneP(result_iterator)) {
                {
                    SubLObject section_iterator = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_curr(result_iterator);
                    SubLObject span = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_curr_span(section_iterator);
                    if (NIL != list_utilities.lengthG(span, max_span_length, UNPROVIDED)) {
                        max_span_length = length(span);
                        max_span = span;
                        output_cycls = NIL;
                        while (NIL == com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_doneP(section_iterator)) {
                            output_cycls = cons(com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_curr_cycl(section_iterator), output_cycls);
                            com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_section_iterator_next(section_iterator);
                        } 
                    }
                }
                com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_next(result_iterator);
            } 
            return values(nreverse(output_cycls), max_span);
        }
    }

    /**
     *
     *
     * @return 0 LISTP; of CycL interpretations for the longest parsed span of PARSES
     * @return 1 LISTP; The span corresponding to the returned CycLs.
     */
    @LispMethod(comment = "@return 0 LISTP; of CycL interpretations for the longest parsed span of PARSES\r\n@return 1 LISTP; The span corresponding to the returned CycLs.")
    public static SubLObject itp_longest_parse_cycls(final SubLObject parses) {
        final SubLObject result_iterator = rtp_iterators.new_itp_result_iterator(parses, UNPROVIDED, UNPROVIDED);
        SubLObject max_span_length = ZERO_INTEGER;
        SubLObject max_span = NIL;
        SubLObject output_cycls = NIL;
        while (NIL == rtp_iterators.itp_result_iterator_doneP(result_iterator)) {
            final SubLObject section_iterator = rtp_iterators.itp_result_iterator_curr(result_iterator);
            final SubLObject span = rtp_iterators.itp_section_iterator_curr_span(section_iterator);
            if (NIL != lengthG(span, max_span_length, UNPROVIDED)) {
                max_span_length = length(span);
                max_span = span;
                output_cycls = NIL;
                while (NIL == rtp_iterators.itp_section_iterator_doneP(section_iterator)) {
                    output_cycls = cons(rtp_iterators.itp_section_iterator_curr_cycl(section_iterator), output_cycls);
                    rtp_iterators.itp_section_iterator_next(section_iterator);
                } 
            }
            rtp_iterators.itp_result_iterator_next(result_iterator);
        } 
        return values(nreverse(output_cycls), max_span);
    }

    public static final SubLObject update_itp_result_section_iterator_alt(SubLObject iterator) {
        {
            SubLObject span = com.cyc.cycjava.cycl.rtp.rtp_iterators.itp_result_iterator_span(iterator);
            SubLObject section_iterator = NIL;
            section_iterator = com.cyc.cycjava.cycl.rtp.rtp_iterators.new_itp_section_iterator(iterator, span.first());
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_itp_result_iterator_section_iterator(iterator, section_iterator);
            return section_iterator;
        }
    }

    public static SubLObject update_itp_result_section_iterator(final SubLObject iterator) {
        final SubLObject span = rtp_iterators.itp_result_iterator_span(iterator);
        SubLObject section_iterator = NIL;
        section_iterator = rtp_iterators.new_itp_section_iterator(iterator, span.first());
        rtp_iterators._csetf_itp_result_iterator_section_iterator(iterator, section_iterator);
        return section_iterator;
    }

    public static final SubLObject rtp_iterator_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rtp_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject rtp_iterator_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.rtp_iterators.$rtp_iterator_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject rtp_iterator_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.rtp_iterators.$rtp_iterator_native.class ? T : NIL;
    }

    public static final SubLObject rtp_iterator_string_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.getField2();
    }

    public static SubLObject rtp_iterator_string(final SubLObject v_object) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject rtp_iterator_parsing_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.getField3();
    }

    public static SubLObject rtp_iterator_parsing_mt(final SubLObject v_object) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject rtp_iterator_semantic_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.getField4();
    }

    public static SubLObject rtp_iterator_semantic_mt(final SubLObject v_object) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject rtp_iterator_strengthenP_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.getField5();
    }

    public static SubLObject rtp_iterator_strengthenP(final SubLObject v_object) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject rtp_iterator_multiple_quantificationsP_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.getField6();
    }

    public static SubLObject rtp_iterator_multiple_quantificationsP(final SubLObject v_object) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject rtp_iterator_wff_checkP_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.getField7();
    }

    public static SubLObject rtp_iterator_wff_checkP(final SubLObject v_object) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject rtp_iterator_force_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.getField8();
    }

    public static SubLObject rtp_iterator_force(final SubLObject v_object) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject rtp_iterator_raw_parses_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.getField9();
    }

    public static SubLObject rtp_iterator_raw_parses(final SubLObject v_object) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject rtp_iterator_result_queue_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.getField10();
    }

    public static SubLObject rtp_iterator_result_queue(final SubLObject v_object) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject rtp_iterator_initialized_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.getField11();
    }

    public static SubLObject rtp_iterator_initialized(final SubLObject v_object) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject rtp_iterator_template_category_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.getField12();
    }

    public static SubLObject rtp_iterator_template_category(final SubLObject v_object) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject rtp_iterator_memoization_state_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.getField13();
    }

    public static SubLObject rtp_iterator_memoization_state(final SubLObject v_object) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject rtp_iterator_sbhl_resource_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.getField14();
    }

    public static SubLObject rtp_iterator_sbhl_resource(final SubLObject v_object) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField14();
    }

    public static final SubLObject _csetf_rtp_iterator_string_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rtp_iterator_string(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_rtp_iterator_parsing_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rtp_iterator_parsing_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_rtp_iterator_semantic_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rtp_iterator_semantic_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_rtp_iterator_strengthenP_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rtp_iterator_strengthenP(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_rtp_iterator_multiple_quantificationsP_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_rtp_iterator_multiple_quantificationsP(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_rtp_iterator_wff_checkP_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_rtp_iterator_wff_checkP(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_rtp_iterator_force_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_rtp_iterator_force(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_rtp_iterator_raw_parses_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_rtp_iterator_raw_parses(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_rtp_iterator_result_queue_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_rtp_iterator_result_queue(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_rtp_iterator_initialized_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_rtp_iterator_initialized(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_rtp_iterator_template_category_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_rtp_iterator_template_category(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_rtp_iterator_memoization_state_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_rtp_iterator_memoization_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject _csetf_rtp_iterator_sbhl_resource_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RTP_ITERATOR_P);
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_rtp_iterator_sbhl_resource(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterators.rtp_iterator_p(v_object) : "! rtp_iterators.rtp_iterator_p(v_object) " + "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static final SubLObject make_rtp_iterator_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rtp.rtp_iterators.$rtp_iterator_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($STRING)) {
                        com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_string(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PARSING_MT)) {
                            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_parsing_mt(v_new, current_value);
                        } else {
                            if (pcase_var.eql($SEMANTIC_MT)) {
                                com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_semantic_mt(v_new, current_value);
                            } else {
                                if (pcase_var.eql($STRENGTHEN_)) {
                                    com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_strengthenP(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($kw100$MULTIPLE_QUANTIFICATIONS_)) {
                                        com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_multiple_quantificationsP(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($kw101$WFF_CHECK_)) {
                                            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_wff_checkP(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($FORCE)) {
                                                com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_force(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($RAW_PARSES)) {
                                                    com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_raw_parses(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($RESULT_QUEUE)) {
                                                        com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_result_queue(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($INITIALIZED)) {
                                                            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_initialized(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($TEMPLATE_CATEGORY)) {
                                                                com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_template_category(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($MEMOIZATION_STATE)) {
                                                                    com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_memoization_state(v_new, current_value);
                                                                } else {
                                                                    if (pcase_var.eql($SBHL_RESOURCE)) {
                                                                        com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_sbhl_resource(v_new, current_value);
                                                                    } else {
                                                                        Errors.error($str_alt20$Invalid_slot__S_for_construction_, current_arg);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
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

    public static SubLObject make_rtp_iterator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rtp.rtp_iterators.$rtp_iterator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STRING)) {
                rtp_iterators._csetf_rtp_iterator_string(v_new, current_value);
            } else
                if (pcase_var.eql($PARSING_MT)) {
                    rtp_iterators._csetf_rtp_iterator_parsing_mt(v_new, current_value);
                } else
                    if (pcase_var.eql($SEMANTIC_MT)) {
                        rtp_iterators._csetf_rtp_iterator_semantic_mt(v_new, current_value);
                    } else
                        if (pcase_var.eql($STRENGTHEN_)) {
                            rtp_iterators._csetf_rtp_iterator_strengthenP(v_new, current_value);
                        } else
                            if (pcase_var.eql(rtp_iterators.$kw113$MULTIPLE_QUANTIFICATIONS_)) {
                                rtp_iterators._csetf_rtp_iterator_multiple_quantificationsP(v_new, current_value);
                            } else
                                if (pcase_var.eql(rtp_iterators.$kw114$WFF_CHECK_)) {
                                    rtp_iterators._csetf_rtp_iterator_wff_checkP(v_new, current_value);
                                } else
                                    if (pcase_var.eql($FORCE)) {
                                        rtp_iterators._csetf_rtp_iterator_force(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($RAW_PARSES)) {
                                            rtp_iterators._csetf_rtp_iterator_raw_parses(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($RESULT_QUEUE)) {
                                                rtp_iterators._csetf_rtp_iterator_result_queue(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($INITIALIZED)) {
                                                    rtp_iterators._csetf_rtp_iterator_initialized(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($TEMPLATE_CATEGORY)) {
                                                        rtp_iterators._csetf_rtp_iterator_template_category(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($MEMOIZATION_STATE)) {
                                                            rtp_iterators._csetf_rtp_iterator_memoization_state(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($SBHL_RESOURCE)) {
                                                                rtp_iterators._csetf_rtp_iterator_sbhl_resource(v_new, current_value);
                                                            } else {
                                                                Errors.error(rtp_iterators.$str21$Invalid_slot__S_for_construction_, current_arg);
                                                            }












        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rtp_iterator(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, rtp_iterators.MAKE_RTP_ITERATOR, THIRTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STRING, rtp_iterators.rtp_iterator_string(obj));
        funcall(visitor_fn, obj, $SLOT, $PARSING_MT, rtp_iterators.rtp_iterator_parsing_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $SEMANTIC_MT, rtp_iterators.rtp_iterator_semantic_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $STRENGTHEN_, rtp_iterators.rtp_iterator_strengthenP(obj));
        funcall(visitor_fn, obj, $SLOT, rtp_iterators.$kw113$MULTIPLE_QUANTIFICATIONS_, rtp_iterators.rtp_iterator_multiple_quantificationsP(obj));
        funcall(visitor_fn, obj, $SLOT, rtp_iterators.$kw114$WFF_CHECK_, rtp_iterators.rtp_iterator_wff_checkP(obj));
        funcall(visitor_fn, obj, $SLOT, $FORCE, rtp_iterators.rtp_iterator_force(obj));
        funcall(visitor_fn, obj, $SLOT, $RAW_PARSES, rtp_iterators.rtp_iterator_raw_parses(obj));
        funcall(visitor_fn, obj, $SLOT, $RESULT_QUEUE, rtp_iterators.rtp_iterator_result_queue(obj));
        funcall(visitor_fn, obj, $SLOT, $INITIALIZED, rtp_iterators.rtp_iterator_initialized(obj));
        funcall(visitor_fn, obj, $SLOT, $TEMPLATE_CATEGORY, rtp_iterators.rtp_iterator_template_category(obj));
        funcall(visitor_fn, obj, $SLOT, $MEMOIZATION_STATE, rtp_iterators.rtp_iterator_memoization_state(obj));
        funcall(visitor_fn, obj, $SLOT, $SBHL_RESOURCE, rtp_iterators.rtp_iterator_sbhl_resource(obj));
        funcall(visitor_fn, obj, $END, rtp_iterators.MAKE_RTP_ITERATOR, THIRTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rtp_iterator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return rtp_iterators.visit_defstruct_rtp_iterator(obj, visitor_fn);
    }

    public static final SubLObject new_rtp_iterator_alt(SubLObject string, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return iteration.new_iterator(com.cyc.cycjava.cycl.rtp.rtp_iterators.new_rtp_iterator_state(string, v_properties), RTP_ITERATOR_DONE, RTP_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject new_rtp_iterator(final SubLObject string, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return new_iterator(rtp_iterators.new_rtp_iterator_state(string, v_properties), rtp_iterators.RTP_ITERATOR_DONE, rtp_iterators.RTP_ITERATOR_NEXT, UNPROVIDED);
    }

    public static final SubLObject new_rtp_iterator_state_alt(SubLObject string, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            SubLObject iter = com.cyc.cycjava.cycl.rtp.rtp_iterators.make_rtp_iterator(UNPROVIDED);
            SubLObject parsing_mt = getf(v_properties, $PARSING_MT, $$RKFParsingMt);
            SubLObject semantic_mt = getf(v_properties, $SEMANTIC_MT, parsing_mt);
            SubLObject strengthenP = getf(v_properties, $STRENGTHEN_, T);
            SubLObject multiple_quantificationsP = getf(v_properties, $kw100$MULTIPLE_QUANTIFICATIONS_, NIL);
            SubLObject force = getf(v_properties, $FORCE, $DECLARATIVE);
            SubLObject wff_checkP = getf(v_properties, $kw101$WFF_CHECK_, T);
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_string(iter, string);
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_parsing_mt(iter, parsing_mt);
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_semantic_mt(iter, semantic_mt);
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_strengthenP(iter, strengthenP);
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_multiple_quantificationsP(iter, multiple_quantificationsP);
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_force(iter, force);
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_template_category(iter, com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iter_cat_for_force(force));
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_wff_checkP(iter, wff_checkP);
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_initialized(iter, NIL);
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_result_queue(iter, queues.create_queue());
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_memoization_state(iter, memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_sbhl_resource(iter, sbhl_marking_vars.new_sbhl_marking_space_resource(FOUR_INTEGER));
            return iter;
        }
    }

    public static SubLObject new_rtp_iterator_state(final SubLObject string, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject iter = rtp_iterators.make_rtp_iterator(UNPROVIDED);
        final SubLObject parsing_mt = getf(v_properties, $PARSING_MT, rtp_iterators.$$RKFParsingMt);
        final SubLObject semantic_mt = getf(v_properties, $SEMANTIC_MT, parsing_mt);
        final SubLObject strengthenP = getf(v_properties, $STRENGTHEN_, T);
        final SubLObject multiple_quantificationsP = getf(v_properties, rtp_iterators.$kw113$MULTIPLE_QUANTIFICATIONS_, NIL);
        final SubLObject force = getf(v_properties, $FORCE, $DECLARATIVE);
        final SubLObject wff_checkP = getf(v_properties, rtp_iterators.$kw114$WFF_CHECK_, T);
        rtp_iterators._csetf_rtp_iterator_string(iter, string);
        rtp_iterators._csetf_rtp_iterator_parsing_mt(iter, parsing_mt);
        rtp_iterators._csetf_rtp_iterator_semantic_mt(iter, semantic_mt);
        rtp_iterators._csetf_rtp_iterator_strengthenP(iter, strengthenP);
        rtp_iterators._csetf_rtp_iterator_multiple_quantificationsP(iter, multiple_quantificationsP);
        rtp_iterators._csetf_rtp_iterator_force(iter, force);
        rtp_iterators._csetf_rtp_iterator_template_category(iter, rtp_iterators.rtp_iter_cat_for_force(force));
        rtp_iterators._csetf_rtp_iterator_wff_checkP(iter, wff_checkP);
        rtp_iterators._csetf_rtp_iterator_initialized(iter, NIL);
        rtp_iterators._csetf_rtp_iterator_result_queue(iter, create_queue(UNPROVIDED));
        rtp_iterators._csetf_rtp_iterator_memoization_state(iter, new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        rtp_iterators._csetf_rtp_iterator_sbhl_resource(iter, new_sbhl_marking_space_resource(FOUR_INTEGER));
        return iter;
    }

    public static final SubLObject rtp_iter_cat_for_force_alt(SubLObject force) {
        {
            SubLObject pcase_var = force;
            if (pcase_var.eql($DECLARATIVE)) {
                return $$STemplate;
            } else {
                if (pcase_var.eql($QUERY)) {
                    return $$QuestionTemplate;
                } else {
                    if (pcase_var.eql($QUESTION)) {
                        return $$QuestionTemplate;
                    } else {
                        return $$STemplate;
                    }
                }
            }
        }
    }

    public static SubLObject rtp_iter_cat_for_force(final SubLObject force) {
        if (force.eql($DECLARATIVE)) {
            return rtp_iterators.$$STemplate;
        }
        if (force.eql($QUERY)) {
            return rtp_iterators.$$QuestionTemplate;
        }
        if (force.eql($QUESTION)) {
            return rtp_iterators.$$QuestionTemplate;
        }
        return rtp_iterators.$$STemplate;
    }

    public static final SubLObject rtp_iterator_done_alt(SubLObject iter) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == queues.queue_empty_p(com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_result_queue(iter))) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                SubLObject local_state = com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_memoization_state(iter);
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                            Errors.error($str_alt117$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                if (NIL == com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_initialized(iter)) {
                                    com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_add_raw_parse(iter);
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL == com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_raw_parses(iter)) && (NIL != queues.queue_empty_p(com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_result_queue(iter)))) {
                                            result = T;
                                        }
                                        while (!(((NIL == queues.queue_empty_p(com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_result_queue(iter))) || (NIL == com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_raw_parses(iter))) || (NIL != result))) {
                                            com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_reformulate_one_parse(iter);
                                        } 
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_1, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == result) {
                    result = queues.queue_empty_p(com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_result_queue(iter));
                }
                return result;
            }
        }
    }

    public static SubLObject rtp_iterator_done(final SubLObject iter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == queue_empty_p(rtp_iterators.rtp_iterator_result_queue(iter))) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject local_state = rtp_iterators.rtp_iterator_memoization_state(iter);
        final SubLObject _prev_bind_0 = $memoization_state$.currentBinding(thread);
        try {
            $memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state_original_process(local_state);
            try {
                if (NIL == rtp_iterators.rtp_iterator_initialized(iter)) {
                    rtp_iterators.rtp_iterator_add_raw_parse(iter);
                }
                if ((NIL == rtp_iterators.rtp_iterator_raw_parses(iter)) && (NIL != queue_empty_p(rtp_iterators.rtp_iterator_result_queue(iter)))) {
                    result = T;
                }
                while (((NIL != queue_empty_p(rtp_iterators.rtp_iterator_result_queue(iter))) && (NIL != rtp_iterators.rtp_iterator_raw_parses(iter))) && (NIL == result)) {
                    rtp_iterators.rtp_iterator_reformulate_one_parse(iter);
                } 
            } finally {
                final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            $memoization_state$.rebind(_prev_bind_0, thread);
        }
        if (NIL == result) {
            result = queue_empty_p(rtp_iterators.rtp_iterator_result_queue(iter));
        }
        return result;
    }

    public static final SubLObject rtp_iterator_reformulate_one_parse_alt(SubLObject iter) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sbhl_resource = com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_sbhl_resource(iter);
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_resource, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                        {
                            SubLObject raw_parses = com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_raw_parses(iter);
                            SubLObject first_parse = raw_parses.first();
                            SubLObject semantic_mt = com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_semantic_mt(iter);
                            SubLObject strengthenP = com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_strengthenP(iter);
                            SubLObject reformulated_parses = rkf_formula_optimizer.rkf_reformulate_into_many(first_parse, semantic_mt, strengthenP, UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(semantic_mt, thread);
                                    {
                                        SubLObject wff_parses = (NIL != com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_wff_checkP(iter)) ? ((SubLObject) (list_utilities.remove_if_not($sym118$EL_WFF_, reformulated_parses, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : reformulated_parses;
                                        com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_raw_parses(iter, raw_parses.rest());
                                        {
                                            SubLObject cdolist_list_var = wff_parses;
                                            SubLObject reformulated_parse = NIL;
                                            for (reformulated_parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , reformulated_parse = cdolist_list_var.first()) {
                                                queues.enqueue(reformulated_parse, com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_result_queue(iter));
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_2, thread);
                                }
                            }
                            sbhl_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                        }
                    } finally {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return iter;
        }
    }

    public static SubLObject rtp_iterator_reformulate_one_parse(final SubLObject iter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sbhl_resource = rtp_iterators.rtp_iterator_sbhl_resource(iter);
        final SubLObject _prev_bind_0 = $resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $resourced_sbhl_marking_space_limit$.currentBinding(thread);
        try {
            $resourced_sbhl_marking_spaces$.bind(sbhl_resource, thread);
            $resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            $resourced_sbhl_marking_space_limit$.bind(determine_marking_space_limit($resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
            try {
                final SubLObject raw_parses = rtp_iterators.rtp_iterator_raw_parses(iter);
                final SubLObject first_parse = raw_parses.first();
                final SubLObject semantic_mt = rtp_iterators.rtp_iterator_semantic_mt(iter);
                final SubLObject strengthenP = rtp_iterators.rtp_iterator_strengthenP(iter);
                final SubLObject reformulated_parses = rkf_reformulate_into_many(first_parse, semantic_mt, strengthenP, UNPROVIDED, UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = $mt$.currentBinding(thread);
                try {
                    $mt$.bind(semantic_mt, thread);
                    final SubLObject wff_parses = (NIL != rtp_iterators.rtp_iterator_wff_checkP(iter)) ? remove_if_not(rtp_iterators.$sym132$EL_WFF_, reformulated_parses, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : reformulated_parses;
                    rtp_iterators._csetf_rtp_iterator_raw_parses(iter, raw_parses.rest());
                    SubLObject cdolist_list_var = wff_parses;
                    SubLObject reformulated_parse = NIL;
                    reformulated_parse = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        enqueue(reformulated_parse, rtp_iterators.rtp_iterator_result_queue(iter));
                        cdolist_list_var = cdolist_list_var.rest();
                        reformulated_parse = cdolist_list_var.first();
                    } 
                } finally {
                    $mt$.rebind(_prev_bind_0_$2, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_resource = $resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            $resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
            $resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
            $resourced_sbhl_marking_spaces$.rebind(_prev_bind_0, thread);
        }
        return iter;
    }

    public static final SubLObject rtp_iterator_add_raw_parse_alt(SubLObject iter) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = rkf_text_processors.$rkf_text_proc_resolve_parses$.currentBinding(thread);
                try {
                    rkf_text_processors.$rkf_text_proc_resolve_parses$.bind(T, thread);
                    {
                        SubLObject rkf_return_multiple_quantifications = com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_multiple_quantificationsP(iter);
                        {
                            SubLObject _prev_bind_0_3 = parsing_vars.$rkf_template_wff_filter_level$.currentBinding(thread);
                            try {
                                parsing_vars.$rkf_template_wff_filter_level$.bind(NIL != com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_wff_checkP(iter) ? ((SubLObject) (TWO_INTEGER)) : ZERO_INTEGER, thread);
                                {
                                    SubLObject parsing_mt = com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_parsing_mt(iter);
                                    SubLObject semantic_mt = com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_semantic_mt(iter);
                                    SubLObject string = com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_string(iter);
                                    SubLObject template_category = com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_template_category(iter);
                                    SubLObject raw_parser_output = rkf_text_processors.rkf_utterance_reader(string, template_category, parsing_mt, semantic_mt);
                                    SubLObject top_level_parses = rkf_text_processors.top_level_parses(raw_parser_output);
                                    com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_raw_parses(iter, top_level_parses);
                                    com.cyc.cycjava.cycl.rtp.rtp_iterators._csetf_rtp_iterator_initialized(iter, T);
                                }
                            } finally {
                                parsing_vars.$rkf_template_wff_filter_level$.rebind(_prev_bind_0_3, thread);
                            }
                        }
                    }
                } finally {
                    rkf_text_processors.$rkf_text_proc_resolve_parses$.rebind(_prev_bind_0, thread);
                }
            }
            return iter;
        }
    }

    public static SubLObject rtp_iterator_add_raw_parse(final SubLObject iter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $rkf_text_proc_resolve_parses$.currentBinding(thread);
        try {
            $rkf_text_proc_resolve_parses$.bind(T, thread);
            final SubLObject rkf_return_multiple_quantifications = rtp_iterators.rtp_iterator_multiple_quantificationsP(iter);
            final SubLObject _prev_bind_0_$4 = $rkf_template_wff_filter_level$.currentBinding(thread);
            try {
                $rkf_template_wff_filter_level$.bind(NIL != rtp_iterators.rtp_iterator_wff_checkP(iter) ? TWO_INTEGER : ZERO_INTEGER, thread);
                final SubLObject parsing_mt = rtp_iterators.rtp_iterator_parsing_mt(iter);
                final SubLObject semantic_mt = rtp_iterators.rtp_iterator_semantic_mt(iter);
                final SubLObject string = rtp_iterators.rtp_iterator_string(iter);
                final SubLObject template_category = rtp_iterators.rtp_iterator_template_category(iter);
                final SubLObject raw_parser_output = rkf_utterance_reader(string, template_category, parsing_mt, semantic_mt);
                final SubLObject top_level_parses = top_level_parses(raw_parser_output);
                rtp_iterators._csetf_rtp_iterator_raw_parses(iter, top_level_parses);
                rtp_iterators._csetf_rtp_iterator_initialized(iter, T);
            } finally {
                $rkf_template_wff_filter_level$.rebind(_prev_bind_0_$4, thread);
            }
        } finally {
            $rkf_text_proc_resolve_parses$.rebind(_prev_bind_0, thread);
        }
        return iter;
    }

    public static final SubLObject rtp_iterator_next_alt(SubLObject iter) {
        if (NIL != com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_done(iter)) {
            return values($FAILURE, iter, NIL);
        }
        {
            SubLObject result = queues.dequeue(com.cyc.cycjava.cycl.rtp.rtp_iterators.rtp_iterator_result_queue(iter));
            return values(result, iter, NIL);
        }
    }

    public static SubLObject rtp_iterator_next(final SubLObject iter) {
        if (NIL != rtp_iterators.rtp_iterator_done(iter)) {
            return values($FAILURE, iter, NIL);
        }
        final SubLObject result = dequeue(rtp_iterators.rtp_iterator_result_queue(iter));
        return values(result, iter, NIL);
    }

    public static SubLObject declare_rtp_iterators_file() {
        declareFunction("itp_result_iterator_print_function_trampoline", "ITP-RESULT-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("itp_result_iterator_p", "ITP-RESULT-ITERATOR-P", 1, 0, false);
        new rtp_iterators.$itp_result_iterator_p$UnaryFunction();
        declareFunction("itp_result_iterator_style", "ITP-RESULT-ITERATOR-STYLE", 1, 0, false);
        declareFunction("itp_result_iterator_parses", "ITP-RESULT-ITERATOR-PARSES", 1, 0, false);
        declareFunction("itp_result_iterator_span", "ITP-RESULT-ITERATOR-SPAN", 1, 0, false);
        declareFunction("itp_result_iterator_section_iterator", "ITP-RESULT-ITERATOR-SECTION-ITERATOR", 1, 0, false);
        declareFunction("_csetf_itp_result_iterator_style", "_CSETF-ITP-RESULT-ITERATOR-STYLE", 2, 0, false);
        declareFunction("_csetf_itp_result_iterator_parses", "_CSETF-ITP-RESULT-ITERATOR-PARSES", 2, 0, false);
        declareFunction("_csetf_itp_result_iterator_span", "_CSETF-ITP-RESULT-ITERATOR-SPAN", 2, 0, false);
        declareFunction("_csetf_itp_result_iterator_section_iterator", "_CSETF-ITP-RESULT-ITERATOR-SECTION-ITERATOR", 2, 0, false);
        declareFunction("make_itp_result_iterator", "MAKE-ITP-RESULT-ITERATOR", 0, 1, false);
        declareFunction("visit_defstruct_itp_result_iterator", "VISIT-DEFSTRUCT-ITP-RESULT-ITERATOR", 2, 0, false);
        declareFunction("visit_defstruct_object_itp_result_iterator_method", "VISIT-DEFSTRUCT-OBJECT-ITP-RESULT-ITERATOR-METHOD", 2, 0, false);
        declareFunction("itp_section_iterator_print_function_trampoline", "ITP-SECTION-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("itp_section_iterator_p", "ITP-SECTION-ITERATOR-P", 1, 0, false);
        new rtp_iterators.$itp_section_iterator_p$UnaryFunction();
        declareFunction("itp_section_iterator_parent", "ITP-SECTION-ITERATOR-PARENT", 1, 0, false);
        declareFunction("itp_section_iterator_span", "ITP-SECTION-ITERATOR-SPAN", 1, 0, false);
        declareFunction("itp_section_iterator_section", "ITP-SECTION-ITERATOR-SECTION", 1, 0, false);
        declareFunction("itp_section_iterator_current", "ITP-SECTION-ITERATOR-CURRENT", 1, 0, false);
        declareFunction("_csetf_itp_section_iterator_parent", "_CSETF-ITP-SECTION-ITERATOR-PARENT", 2, 0, false);
        declareFunction("_csetf_itp_section_iterator_span", "_CSETF-ITP-SECTION-ITERATOR-SPAN", 2, 0, false);
        declareFunction("_csetf_itp_section_iterator_section", "_CSETF-ITP-SECTION-ITERATOR-SECTION", 2, 0, false);
        declareFunction("_csetf_itp_section_iterator_current", "_CSETF-ITP-SECTION-ITERATOR-CURRENT", 2, 0, false);
        declareFunction("make_itp_section_iterator", "MAKE-ITP-SECTION-ITERATOR", 0, 1, false);
        declareFunction("visit_defstruct_itp_section_iterator", "VISIT-DEFSTRUCT-ITP-SECTION-ITERATOR", 2, 0, false);
        declareFunction("visit_defstruct_object_itp_section_iterator_method", "VISIT-DEFSTRUCT-OBJECT-ITP-SECTION-ITERATOR-METHOD", 2, 0, false);
        declareFunction("itp_print_section_iterator", "ITP-PRINT-SECTION-ITERATOR", 3, 0, false);
        declareFunction("itp_child_iterator_print_function_trampoline", "ITP-CHILD-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("itp_child_iterator_p", "ITP-CHILD-ITERATOR-P", 1, 0, false);
        new rtp_iterators.$itp_child_iterator_p$UnaryFunction();
        declareFunction("itp_child_iterator_parent", "ITP-CHILD-ITERATOR-PARENT", 1, 0, false);
        declareFunction("itp_child_iterator_rop_formula", "ITP-CHILD-ITERATOR-ROP-FORMULA", 1, 0, false);
        declareFunction("itp_child_iterator_section", "ITP-CHILD-ITERATOR-SECTION", 1, 0, false);
        declareFunction("_csetf_itp_child_iterator_parent", "_CSETF-ITP-CHILD-ITERATOR-PARENT", 2, 0, false);
        declareFunction("_csetf_itp_child_iterator_rop_formula", "_CSETF-ITP-CHILD-ITERATOR-ROP-FORMULA", 2, 0, false);
        declareFunction("_csetf_itp_child_iterator_section", "_CSETF-ITP-CHILD-ITERATOR-SECTION", 2, 0, false);
        declareFunction("make_itp_child_iterator", "MAKE-ITP-CHILD-ITERATOR", 0, 1, false);
        declareFunction("visit_defstruct_itp_child_iterator", "VISIT-DEFSTRUCT-ITP-CHILD-ITERATOR", 2, 0, false);
        declareFunction("visit_defstruct_object_itp_child_iterator_method", "VISIT-DEFSTRUCT-OBJECT-ITP-CHILD-ITERATOR-METHOD", 2, 0, false);
        declareFunction("itp_print_child_iterator", "ITP-PRINT-CHILD-ITERATOR", 3, 0, false);
        declareFunction("new_itp_result_iterator", "NEW-ITP-RESULT-ITERATOR", 1, 2, false);
        declareFunction("determine_parse_result_style", "DETERMINE-PARSE-RESULT-STYLE", 1, 0, false);
        declareFunction("copy_itp_result_iterator", "COPY-ITP-RESULT-ITERATOR", 1, 0, false);
        declareFunction("new_itp_section_iterator", "NEW-ITP-SECTION-ITERATOR", 2, 0, false);
        declareFunction("new_itp_child_iterator", "NEW-ITP-CHILD-ITERATOR", 2, 0, false);
        declareFunction("new_itp_root_children_iterator", "NEW-ITP-ROOT-CHILDREN-ITERATOR", 1, 0, false);
        declareFunction("is_itp_root_children_iteratorP", "IS-ITP-ROOT-CHILDREN-ITERATOR?", 1, 0, false);
        declareFunction("is_equivalent_rtp_child_iteratorP", "IS-EQUIVALENT-RTP-CHILD-ITERATOR?", 2, 0, false);
        declareFunction("itp_result_iterator_reset", "ITP-RESULT-ITERATOR-RESET", 1, 0, false);
        declareFunction("itp_result_iterator_curr", "ITP-RESULT-ITERATOR-CURR", 1, 0, false);
        declareFunction("itp_section_iterator_reset", "ITP-SECTION-ITERATOR-RESET", 1, 0, false);
        declareFunction("itp_section_iterator_curr", "ITP-SECTION-ITERATOR-CURR", 1, 0, false);
        declareFunction("itp_section_iterator_set_curr", "ITP-SECTION-ITERATOR-SET-CURR", 2, 0, false);
        declareFunction("itp_section_iterator_curr_span", "ITP-SECTION-ITERATOR-CURR-SPAN", 1, 0, false);
        declareFunction("itp_section_iterator_curr_cycl", "ITP-SECTION-ITERATOR-CURR-CYCL", 1, 0, false);
        declareFunction("itp_section_iterator_curr_assertion", "ITP-SECTION-ITERATOR-CURR-ASSERTION", 1, 0, false);
        declareFunction("itp_section_iterator_curr_pred", "ITP-SECTION-ITERATOR-CURR-PRED", 1, 0, false);
        declareFunction("itp_section_iterator_curr_cat", "ITP-SECTION-ITERATOR-CURR-CAT", 1, 0, false);
        declareFunction("itp_section_iterator_curr_confidence", "ITP-SECTION-ITERATOR-CURR-CONFIDENCE", 1, 0, false);
        declareFunction("args_from_assertions", "ARGS-FROM-ASSERTIONS", 2, 0, false);
        declareFunction("find_itp_section_iterator", "FIND-ITP-SECTION-ITERATOR", 2, 0, false);
        declareFunction("itp_child_iterator_reset", "ITP-CHILD-ITERATOR-RESET", 1, 0, false);
        declareFunction("itp_child_iterator_curr", "ITP-CHILD-ITERATOR-CURR", 1, 0, false);
        declareFunction("itp_child_iterator_curr_span", "ITP-CHILD-ITERATOR-CURR-SPAN", 1, 0, false);
        declareFunction("itp_child_iterator_curr_cycl", "ITP-CHILD-ITERATOR-CURR-CYCL", 1, 0, false);
        declareFunction("itp_child_iterator_curr_assertion", "ITP-CHILD-ITERATOR-CURR-ASSERTION", 1, 0, false);
        declareFunction("itp_child_iterator_curr_pred", "ITP-CHILD-ITERATOR-CURR-PRED", 1, 0, false);
        declareFunction("itp_child_iterator_curr_cat", "ITP-CHILD-ITERATOR-CURR-CAT", 1, 0, false);
        declareFunction("itp_child_iterator_curr_confidence", "ITP-CHILD-ITERATOR-CURR-CONFIDENCE", 1, 0, false);
        declareFunction("itp_result_iterator_doneP", "ITP-RESULT-ITERATOR-DONE?", 1, 0, false);
        declareFunction("itp_result_iterator_next", "ITP-RESULT-ITERATOR-NEXT", 1, 0, false);
        declareFunction("itp_result_iterator_prev", "ITP-RESULT-ITERATOR-PREV", 1, 0, false);
        declareFunction("itp_section_iterator_next", "ITP-SECTION-ITERATOR-NEXT", 1, 0, false);
        declareFunction("itp_section_iterator_prev", "ITP-SECTION-ITERATOR-PREV", 1, 0, false);
        declareFunction("itp_section_iterator_doneP", "ITP-SECTION-ITERATOR-DONE?", 1, 0, false);
        declareFunction("itp_child_iterator_next", "ITP-CHILD-ITERATOR-NEXT", 1, 0, false);
        declareFunction("itp_child_iterator_prev", "ITP-CHILD-ITERATOR-PREV", 1, 0, false);
        declareFunction("itp_child_iterator_doneP", "ITP-CHILD-ITERATOR-DONE?", 1, 0, false);
        declareFunction("itp_longest_parse_cycls", "ITP-LONGEST-PARSE-CYCLS", 1, 0, false);
        declareFunction("update_itp_result_section_iterator", "UPDATE-ITP-RESULT-SECTION-ITERATOR", 1, 0, false);
        declareFunction("rtp_iterator_print_function_trampoline", "RTP-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("rtp_iterator_p", "RTP-ITERATOR-P", 1, 0, false);
        new rtp_iterators.$rtp_iterator_p$UnaryFunction();
        declareFunction("rtp_iterator_string", "RTP-ITERATOR-STRING", 1, 0, false);
        declareFunction("rtp_iterator_parsing_mt", "RTP-ITERATOR-PARSING-MT", 1, 0, false);
        declareFunction("rtp_iterator_semantic_mt", "RTP-ITERATOR-SEMANTIC-MT", 1, 0, false);
        declareFunction("rtp_iterator_strengthenP", "RTP-ITERATOR-STRENGTHEN?", 1, 0, false);
        declareFunction("rtp_iterator_multiple_quantificationsP", "RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?", 1, 0, false);
        declareFunction("rtp_iterator_wff_checkP", "RTP-ITERATOR-WFF-CHECK?", 1, 0, false);
        declareFunction("rtp_iterator_force", "RTP-ITERATOR-FORCE", 1, 0, false);
        declareFunction("rtp_iterator_raw_parses", "RTP-ITERATOR-RAW-PARSES", 1, 0, false);
        declareFunction("rtp_iterator_result_queue", "RTP-ITERATOR-RESULT-QUEUE", 1, 0, false);
        declareFunction("rtp_iterator_initialized", "RTP-ITERATOR-INITIALIZED", 1, 0, false);
        declareFunction("rtp_iterator_template_category", "RTP-ITERATOR-TEMPLATE-CATEGORY", 1, 0, false);
        declareFunction("rtp_iterator_memoization_state", "RTP-ITERATOR-MEMOIZATION-STATE", 1, 0, false);
        declareFunction("rtp_iterator_sbhl_resource", "RTP-ITERATOR-SBHL-RESOURCE", 1, 0, false);
        declareFunction("_csetf_rtp_iterator_string", "_CSETF-RTP-ITERATOR-STRING", 2, 0, false);
        declareFunction("_csetf_rtp_iterator_parsing_mt", "_CSETF-RTP-ITERATOR-PARSING-MT", 2, 0, false);
        declareFunction("_csetf_rtp_iterator_semantic_mt", "_CSETF-RTP-ITERATOR-SEMANTIC-MT", 2, 0, false);
        declareFunction("_csetf_rtp_iterator_strengthenP", "_CSETF-RTP-ITERATOR-STRENGTHEN?", 2, 0, false);
        declareFunction("_csetf_rtp_iterator_multiple_quantificationsP", "_CSETF-RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?", 2, 0, false);
        declareFunction("_csetf_rtp_iterator_wff_checkP", "_CSETF-RTP-ITERATOR-WFF-CHECK?", 2, 0, false);
        declareFunction("_csetf_rtp_iterator_force", "_CSETF-RTP-ITERATOR-FORCE", 2, 0, false);
        declareFunction("_csetf_rtp_iterator_raw_parses", "_CSETF-RTP-ITERATOR-RAW-PARSES", 2, 0, false);
        declareFunction("_csetf_rtp_iterator_result_queue", "_CSETF-RTP-ITERATOR-RESULT-QUEUE", 2, 0, false);
        declareFunction("_csetf_rtp_iterator_initialized", "_CSETF-RTP-ITERATOR-INITIALIZED", 2, 0, false);
        declareFunction("_csetf_rtp_iterator_template_category", "_CSETF-RTP-ITERATOR-TEMPLATE-CATEGORY", 2, 0, false);
        declareFunction("_csetf_rtp_iterator_memoization_state", "_CSETF-RTP-ITERATOR-MEMOIZATION-STATE", 2, 0, false);
        declareFunction("_csetf_rtp_iterator_sbhl_resource", "_CSETF-RTP-ITERATOR-SBHL-RESOURCE", 2, 0, false);
        declareFunction("make_rtp_iterator", "MAKE-RTP-ITERATOR", 0, 1, false);
        declareFunction("visit_defstruct_rtp_iterator", "VISIT-DEFSTRUCT-RTP-ITERATOR", 2, 0, false);
        declareFunction("visit_defstruct_object_rtp_iterator_method", "VISIT-DEFSTRUCT-OBJECT-RTP-ITERATOR-METHOD", 2, 0, false);
        declareFunction("new_rtp_iterator", "NEW-RTP-ITERATOR", 1, 1, false);
        declareFunction("new_rtp_iterator_state", "NEW-RTP-ITERATOR-STATE", 1, 1, false);
        declareFunction("rtp_iter_cat_for_force", "RTP-ITER-CAT-FOR-FORCE", 1, 0, false);
        declareFunction("rtp_iterator_done", "RTP-ITERATOR-DONE", 1, 0, false);
        declareFunction("rtp_iterator_reformulate_one_parse", "RTP-ITERATOR-REFORMULATE-ONE-PARSE", 1, 0, false);
        declareFunction("rtp_iterator_add_raw_parse", "RTP-ITERATOR-ADD-RAW-PARSE", 1, 0, false);
        declareFunction("rtp_iterator_next", "RTP-ITERATOR-NEXT", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("STYLE"), makeSymbol("PARSES"), makeSymbol("SPAN"), makeSymbol("SECTION-ITERATOR"));

    static private final SubLList $list_alt3 = list(makeKeyword("STYLE"), makeKeyword("PARSES"), $SPAN, makeKeyword("SECTION-ITERATOR"));

    static private final SubLList $list_alt4 = list(makeSymbol("ITP-RESULT-ITERATOR-STYLE"), makeSymbol("ITP-RESULT-ITERATOR-PARSES"), makeSymbol("ITP-RESULT-ITERATOR-SPAN"), makeSymbol("ITP-RESULT-ITERATOR-SECTION-ITERATOR"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-ITP-RESULT-ITERATOR-STYLE"), makeSymbol("_CSETF-ITP-RESULT-ITERATOR-PARSES"), makeSymbol("_CSETF-ITP-RESULT-ITERATOR-SPAN"), makeSymbol("_CSETF-ITP-RESULT-ITERATOR-SECTION-ITERATOR"));

    public static SubLObject init_rtp_iterators_file() {
        defconstant("*DTP-ITP-RESULT-ITERATOR*", rtp_iterators.ITP_RESULT_ITERATOR);
        defconstant("*DTP-ITP-SECTION-ITERATOR*", rtp_iterators.ITP_SECTION_ITERATOR);
        defconstant("*DTP-ITP-CHILD-ITERATOR*", rtp_iterators.ITP_CHILD_ITERATOR);
        defconstant("*DTP-RTP-ITERATOR*", rtp_iterators.RTP_ITERATOR);
        return NIL;
    }

    public static final SubLObject setup_rtp_iterators_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_itp_result_iterator$.getGlobalValue(), symbol_function(ITP_RESULT_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(ITP_RESULT_ITERATOR_STYLE, _CSETF_ITP_RESULT_ITERATOR_STYLE);
        def_csetf(ITP_RESULT_ITERATOR_PARSES, _CSETF_ITP_RESULT_ITERATOR_PARSES);
        def_csetf(ITP_RESULT_ITERATOR_SPAN, _CSETF_ITP_RESULT_ITERATOR_SPAN);
        def_csetf(ITP_RESULT_ITERATOR_SECTION_ITERATOR, _CSETF_ITP_RESULT_ITERATOR_SECTION_ITERATOR);
        identity(ITP_RESULT_ITERATOR);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_itp_section_iterator$.getGlobalValue(), symbol_function(ITP_SECTION_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(ITP_SECTION_ITERATOR_PARENT, _CSETF_ITP_SECTION_ITERATOR_PARENT);
        def_csetf(ITP_SECTION_ITERATOR_SPAN, _CSETF_ITP_SECTION_ITERATOR_SPAN);
        def_csetf(ITP_SECTION_ITERATOR_SECTION, _CSETF_ITP_SECTION_ITERATOR_SECTION);
        def_csetf(ITP_SECTION_ITERATOR_CURRENT, _CSETF_ITP_SECTION_ITERATOR_CURRENT);
        identity(ITP_SECTION_ITERATOR);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_itp_child_iterator$.getGlobalValue(), symbol_function(ITP_CHILD_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(ITP_CHILD_ITERATOR_PARENT, _CSETF_ITP_CHILD_ITERATOR_PARENT);
        def_csetf(ITP_CHILD_ITERATOR_ROP_FORMULA, _CSETF_ITP_CHILD_ITERATOR_ROP_FORMULA);
        def_csetf(ITP_CHILD_ITERATOR_SECTION, _CSETF_ITP_CHILD_ITERATOR_SECTION);
        identity(ITP_CHILD_ITERATOR);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rtp_iterator$.getGlobalValue(), symbol_function(RTP_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(RTP_ITERATOR_STRING, _CSETF_RTP_ITERATOR_STRING);
        def_csetf(RTP_ITERATOR_PARSING_MT, _CSETF_RTP_ITERATOR_PARSING_MT);
        def_csetf(RTP_ITERATOR_SEMANTIC_MT, _CSETF_RTP_ITERATOR_SEMANTIC_MT);
        def_csetf($sym76$RTP_ITERATOR_STRENGTHEN_, $sym77$_CSETF_RTP_ITERATOR_STRENGTHEN_);
        def_csetf($sym78$RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_, $sym79$_CSETF_RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_);
        def_csetf($sym80$RTP_ITERATOR_WFF_CHECK_, $sym81$_CSETF_RTP_ITERATOR_WFF_CHECK_);
        def_csetf(RTP_ITERATOR_FORCE, _CSETF_RTP_ITERATOR_FORCE);
        def_csetf(RTP_ITERATOR_RAW_PARSES, _CSETF_RTP_ITERATOR_RAW_PARSES);
        def_csetf(RTP_ITERATOR_RESULT_QUEUE, _CSETF_RTP_ITERATOR_RESULT_QUEUE);
        def_csetf(RTP_ITERATOR_INITIALIZED, _CSETF_RTP_ITERATOR_INITIALIZED);
        def_csetf(RTP_ITERATOR_TEMPLATE_CATEGORY, _CSETF_RTP_ITERATOR_TEMPLATE_CATEGORY);
        def_csetf(RTP_ITERATOR_MEMOIZATION_STATE, _CSETF_RTP_ITERATOR_MEMOIZATION_STATE);
        def_csetf(RTP_ITERATOR_SBHL_RESOURCE, _CSETF_RTP_ITERATOR_SBHL_RESOURCE);
        identity(RTP_ITERATOR);
        return NIL;
    }

    public static SubLObject setup_rtp_iterators_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_itp_result_iterator$.getGlobalValue(), symbol_function(rtp_iterators.ITP_RESULT_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(rtp_iterators.$list8);
            def_csetf(rtp_iterators.ITP_RESULT_ITERATOR_STYLE, rtp_iterators._CSETF_ITP_RESULT_ITERATOR_STYLE);
            def_csetf(rtp_iterators.ITP_RESULT_ITERATOR_PARSES, rtp_iterators._CSETF_ITP_RESULT_ITERATOR_PARSES);
            def_csetf(rtp_iterators.ITP_RESULT_ITERATOR_SPAN, rtp_iterators._CSETF_ITP_RESULT_ITERATOR_SPAN);
            def_csetf(rtp_iterators.ITP_RESULT_ITERATOR_SECTION_ITERATOR, rtp_iterators._CSETF_ITP_RESULT_ITERATOR_SECTION_ITERATOR);
            identity(rtp_iterators.ITP_RESULT_ITERATOR);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_itp_result_iterator$.getGlobalValue(), symbol_function(rtp_iterators.VISIT_DEFSTRUCT_OBJECT_ITP_RESULT_ITERATOR_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_itp_section_iterator$.getGlobalValue(), symbol_function(rtp_iterators.ITP_SECTION_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(rtp_iterators.$list35);
            def_csetf(rtp_iterators.ITP_SECTION_ITERATOR_PARENT, rtp_iterators._CSETF_ITP_SECTION_ITERATOR_PARENT);
            def_csetf(rtp_iterators.ITP_SECTION_ITERATOR_SPAN, rtp_iterators._CSETF_ITP_SECTION_ITERATOR_SPAN);
            def_csetf(rtp_iterators.ITP_SECTION_ITERATOR_SECTION, rtp_iterators._CSETF_ITP_SECTION_ITERATOR_SECTION);
            def_csetf(rtp_iterators.ITP_SECTION_ITERATOR_CURRENT, rtp_iterators._CSETF_ITP_SECTION_ITERATOR_CURRENT);
            identity(rtp_iterators.ITP_SECTION_ITERATOR);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_itp_section_iterator$.getGlobalValue(), symbol_function(rtp_iterators.VISIT_DEFSTRUCT_OBJECT_ITP_SECTION_ITERATOR_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_itp_child_iterator$.getGlobalValue(), symbol_function(rtp_iterators.ITP_CHILD_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(rtp_iterators.$list58);
            def_csetf(rtp_iterators.ITP_CHILD_ITERATOR_PARENT, rtp_iterators._CSETF_ITP_CHILD_ITERATOR_PARENT);
            def_csetf(rtp_iterators.ITP_CHILD_ITERATOR_ROP_FORMULA, rtp_iterators._CSETF_ITP_CHILD_ITERATOR_ROP_FORMULA);
            def_csetf(rtp_iterators.ITP_CHILD_ITERATOR_SECTION, rtp_iterators._CSETF_ITP_CHILD_ITERATOR_SECTION);
            identity(rtp_iterators.ITP_CHILD_ITERATOR);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_itp_child_iterator$.getGlobalValue(), symbol_function(rtp_iterators.VISIT_DEFSTRUCT_OBJECT_ITP_CHILD_ITERATOR_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_rtp_iterator$.getGlobalValue(), symbol_function(rtp_iterators.RTP_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(rtp_iterators.$list82);
            def_csetf(rtp_iterators.RTP_ITERATOR_STRING, rtp_iterators._CSETF_RTP_ITERATOR_STRING);
            def_csetf(rtp_iterators.RTP_ITERATOR_PARSING_MT, rtp_iterators._CSETF_RTP_ITERATOR_PARSING_MT);
            def_csetf(rtp_iterators.RTP_ITERATOR_SEMANTIC_MT, rtp_iterators._CSETF_RTP_ITERATOR_SEMANTIC_MT);
            def_csetf(rtp_iterators.$sym89$RTP_ITERATOR_STRENGTHEN_, rtp_iterators.$sym90$_CSETF_RTP_ITERATOR_STRENGTHEN_);
            def_csetf(rtp_iterators.$sym91$RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_, rtp_iterators.$sym92$_CSETF_RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_);
            def_csetf(rtp_iterators.$sym93$RTP_ITERATOR_WFF_CHECK_, rtp_iterators.$sym94$_CSETF_RTP_ITERATOR_WFF_CHECK_);
            def_csetf(rtp_iterators.RTP_ITERATOR_FORCE, rtp_iterators._CSETF_RTP_ITERATOR_FORCE);
            def_csetf(rtp_iterators.RTP_ITERATOR_RAW_PARSES, rtp_iterators._CSETF_RTP_ITERATOR_RAW_PARSES);
            def_csetf(rtp_iterators.RTP_ITERATOR_RESULT_QUEUE, rtp_iterators._CSETF_RTP_ITERATOR_RESULT_QUEUE);
            def_csetf(rtp_iterators.RTP_ITERATOR_INITIALIZED, rtp_iterators._CSETF_RTP_ITERATOR_INITIALIZED);
            def_csetf(rtp_iterators.RTP_ITERATOR_TEMPLATE_CATEGORY, rtp_iterators._CSETF_RTP_ITERATOR_TEMPLATE_CATEGORY);
            def_csetf(rtp_iterators.RTP_ITERATOR_MEMOIZATION_STATE, rtp_iterators._CSETF_RTP_ITERATOR_MEMOIZATION_STATE);
            def_csetf(rtp_iterators.RTP_ITERATOR_SBHL_RESOURCE, rtp_iterators._CSETF_RTP_ITERATOR_SBHL_RESOURCE);
            identity(rtp_iterators.RTP_ITERATOR);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_rtp_iterator$.getGlobalValue(), symbol_function(rtp_iterators.VISIT_DEFSTRUCT_OBJECT_RTP_ITERATOR_METHOD));
        }
        if (SubLFiles.USE_V2) {
            def_csetf($sym76$RTP_ITERATOR_STRENGTHEN_, $sym77$_CSETF_RTP_ITERATOR_STRENGTHEN_);
            def_csetf($sym78$RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_, $sym79$_CSETF_RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_);
            def_csetf($sym80$RTP_ITERATOR_WFF_CHECK_, $sym81$_CSETF_RTP_ITERATOR_WFF_CHECK_);
        }
        return NIL;
    }

    public static SubLObject setup_rtp_iterators_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_itp_result_iterator$.getGlobalValue(), symbol_function(rtp_iterators.ITP_RESULT_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(rtp_iterators.$list8);
        def_csetf(rtp_iterators.ITP_RESULT_ITERATOR_STYLE, rtp_iterators._CSETF_ITP_RESULT_ITERATOR_STYLE);
        def_csetf(rtp_iterators.ITP_RESULT_ITERATOR_PARSES, rtp_iterators._CSETF_ITP_RESULT_ITERATOR_PARSES);
        def_csetf(rtp_iterators.ITP_RESULT_ITERATOR_SPAN, rtp_iterators._CSETF_ITP_RESULT_ITERATOR_SPAN);
        def_csetf(rtp_iterators.ITP_RESULT_ITERATOR_SECTION_ITERATOR, rtp_iterators._CSETF_ITP_RESULT_ITERATOR_SECTION_ITERATOR);
        identity(rtp_iterators.ITP_RESULT_ITERATOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_itp_result_iterator$.getGlobalValue(), symbol_function(rtp_iterators.VISIT_DEFSTRUCT_OBJECT_ITP_RESULT_ITERATOR_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_itp_section_iterator$.getGlobalValue(), symbol_function(rtp_iterators.ITP_SECTION_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(rtp_iterators.$list35);
        def_csetf(rtp_iterators.ITP_SECTION_ITERATOR_PARENT, rtp_iterators._CSETF_ITP_SECTION_ITERATOR_PARENT);
        def_csetf(rtp_iterators.ITP_SECTION_ITERATOR_SPAN, rtp_iterators._CSETF_ITP_SECTION_ITERATOR_SPAN);
        def_csetf(rtp_iterators.ITP_SECTION_ITERATOR_SECTION, rtp_iterators._CSETF_ITP_SECTION_ITERATOR_SECTION);
        def_csetf(rtp_iterators.ITP_SECTION_ITERATOR_CURRENT, rtp_iterators._CSETF_ITP_SECTION_ITERATOR_CURRENT);
        identity(rtp_iterators.ITP_SECTION_ITERATOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_itp_section_iterator$.getGlobalValue(), symbol_function(rtp_iterators.VISIT_DEFSTRUCT_OBJECT_ITP_SECTION_ITERATOR_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_itp_child_iterator$.getGlobalValue(), symbol_function(rtp_iterators.ITP_CHILD_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(rtp_iterators.$list58);
        def_csetf(rtp_iterators.ITP_CHILD_ITERATOR_PARENT, rtp_iterators._CSETF_ITP_CHILD_ITERATOR_PARENT);
        def_csetf(rtp_iterators.ITP_CHILD_ITERATOR_ROP_FORMULA, rtp_iterators._CSETF_ITP_CHILD_ITERATOR_ROP_FORMULA);
        def_csetf(rtp_iterators.ITP_CHILD_ITERATOR_SECTION, rtp_iterators._CSETF_ITP_CHILD_ITERATOR_SECTION);
        identity(rtp_iterators.ITP_CHILD_ITERATOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_itp_child_iterator$.getGlobalValue(), symbol_function(rtp_iterators.VISIT_DEFSTRUCT_OBJECT_ITP_CHILD_ITERATOR_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_rtp_iterator$.getGlobalValue(), symbol_function(rtp_iterators.RTP_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(rtp_iterators.$list82);
        def_csetf(rtp_iterators.RTP_ITERATOR_STRING, rtp_iterators._CSETF_RTP_ITERATOR_STRING);
        def_csetf(rtp_iterators.RTP_ITERATOR_PARSING_MT, rtp_iterators._CSETF_RTP_ITERATOR_PARSING_MT);
        def_csetf(rtp_iterators.RTP_ITERATOR_SEMANTIC_MT, rtp_iterators._CSETF_RTP_ITERATOR_SEMANTIC_MT);
        def_csetf(rtp_iterators.$sym89$RTP_ITERATOR_STRENGTHEN_, rtp_iterators.$sym90$_CSETF_RTP_ITERATOR_STRENGTHEN_);
        def_csetf(rtp_iterators.$sym91$RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_, rtp_iterators.$sym92$_CSETF_RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_);
        def_csetf(rtp_iterators.$sym93$RTP_ITERATOR_WFF_CHECK_, rtp_iterators.$sym94$_CSETF_RTP_ITERATOR_WFF_CHECK_);
        def_csetf(rtp_iterators.RTP_ITERATOR_FORCE, rtp_iterators._CSETF_RTP_ITERATOR_FORCE);
        def_csetf(rtp_iterators.RTP_ITERATOR_RAW_PARSES, rtp_iterators._CSETF_RTP_ITERATOR_RAW_PARSES);
        def_csetf(rtp_iterators.RTP_ITERATOR_RESULT_QUEUE, rtp_iterators._CSETF_RTP_ITERATOR_RESULT_QUEUE);
        def_csetf(rtp_iterators.RTP_ITERATOR_INITIALIZED, rtp_iterators._CSETF_RTP_ITERATOR_INITIALIZED);
        def_csetf(rtp_iterators.RTP_ITERATOR_TEMPLATE_CATEGORY, rtp_iterators._CSETF_RTP_ITERATOR_TEMPLATE_CATEGORY);
        def_csetf(rtp_iterators.RTP_ITERATOR_MEMOIZATION_STATE, rtp_iterators._CSETF_RTP_ITERATOR_MEMOIZATION_STATE);
        def_csetf(rtp_iterators.RTP_ITERATOR_SBHL_RESOURCE, rtp_iterators._CSETF_RTP_ITERATOR_SBHL_RESOURCE);
        identity(rtp_iterators.RTP_ITERATOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_rtp_iterator$.getGlobalValue(), symbol_function(rtp_iterators.VISIT_DEFSTRUCT_OBJECT_RTP_ITERATOR_METHOD));
        return NIL;
    }

    static private final SubLString $str_alt20$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt23 = list(makeSymbol("PARENT"), makeSymbol("SPAN"), makeSymbol("SECTION"), makeSymbol("CURRENT"));

    static private final SubLList $list_alt24 = list(makeKeyword("PARENT"), $SPAN, makeKeyword("SECTION"), makeKeyword("CURRENT"));

    static private final SubLList $list_alt25 = list(makeSymbol("ITP-SECTION-ITERATOR-PARENT"), makeSymbol("ITP-SECTION-ITERATOR-SPAN"), makeSymbol("ITP-SECTION-ITERATOR-SECTION"), makeSymbol("ITP-SECTION-ITERATOR-CURRENT"));

    static private final SubLList $list_alt26 = list(makeSymbol("_CSETF-ITP-SECTION-ITERATOR-PARENT"), makeSymbol("_CSETF-ITP-SECTION-ITERATOR-SPAN"), makeSymbol("_CSETF-ITP-SECTION-ITERATOR-SECTION"), makeSymbol("_CSETF-ITP-SECTION-ITERATOR-CURRENT"));

    static private final SubLString $str_alt40$_ITP_SECTION___S_ = makeString("<ITP-SECTION: ~S>");

    static private final SubLList $list_alt43 = list(makeSymbol("PARENT"), makeSymbol("ROP-FORMULA"), makeSymbol("SECTION"));

    static private final SubLList $list_alt44 = list(makeKeyword("PARENT"), makeKeyword("ROP-FORMULA"), makeKeyword("SECTION"));

    static private final SubLList $list_alt45 = list(makeSymbol("ITP-CHILD-ITERATOR-PARENT"), makeSymbol("ITP-CHILD-ITERATOR-ROP-FORMULA"), makeSymbol("ITP-CHILD-ITERATOR-SECTION"));

    static private final SubLList $list_alt46 = list(makeSymbol("_CSETF-ITP-CHILD-ITERATOR-PARENT"), makeSymbol("_CSETF-ITP-CHILD-ITERATOR-ROP-FORMULA"), makeSymbol("_CSETF-ITP-CHILD-ITERATOR-SECTION"));

    @Override
    public void declareFunctions() {
        rtp_iterators.declare_rtp_iterators_file();
    }

    @Override
    public void initializeVariables() {
        rtp_iterators.init_rtp_iterators_file();
    }

    @Override
    public void runTopLevelForms() {
        rtp_iterators.setup_rtp_iterators_file();
    }

    static {
    }

    static private final SubLString $str_alt56$_ITP_CHILD___S_ = makeString("<ITP-CHILD: ~S>");

    static private final SubLList $list_alt65 = list(new SubLObject[]{ makeSymbol("STRING"), makeSymbol("PARSING-MT"), makeSymbol("SEMANTIC-MT"), makeSymbol("STRENGTHEN?"), makeSymbol("MULTIPLE-QUANTIFICATIONS?"), makeSymbol("WFF-CHECK?"), makeSymbol("FORCE"), makeSymbol("RAW-PARSES"), makeSymbol("RESULT-QUEUE"), makeSymbol("INITIALIZED"), makeSymbol("TEMPLATE-CATEGORY"), makeSymbol("MEMOIZATION-STATE"), makeSymbol("SBHL-RESOURCE") });

    static private final SubLList $list_alt66 = list(new SubLObject[]{ makeKeyword("STRING"), makeKeyword("PARSING-MT"), makeKeyword("SEMANTIC-MT"), makeKeyword("STRENGTHEN?"), makeKeyword("MULTIPLE-QUANTIFICATIONS?"), makeKeyword("WFF-CHECK?"), makeKeyword("FORCE"), makeKeyword("RAW-PARSES"), makeKeyword("RESULT-QUEUE"), makeKeyword("INITIALIZED"), makeKeyword("TEMPLATE-CATEGORY"), makeKeyword("MEMOIZATION-STATE"), makeKeyword("SBHL-RESOURCE") });

    static private final SubLList $list_alt67 = list(new SubLObject[]{ makeSymbol("RTP-ITERATOR-STRING"), makeSymbol("RTP-ITERATOR-PARSING-MT"), makeSymbol("RTP-ITERATOR-SEMANTIC-MT"), makeSymbol("RTP-ITERATOR-STRENGTHEN?"), makeSymbol("RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?"), makeSymbol("RTP-ITERATOR-WFF-CHECK?"), makeSymbol("RTP-ITERATOR-FORCE"), makeSymbol("RTP-ITERATOR-RAW-PARSES"), makeSymbol("RTP-ITERATOR-RESULT-QUEUE"), makeSymbol("RTP-ITERATOR-INITIALIZED"), makeSymbol("RTP-ITERATOR-TEMPLATE-CATEGORY"), makeSymbol("RTP-ITERATOR-MEMOIZATION-STATE"), makeSymbol("RTP-ITERATOR-SBHL-RESOURCE") });

    public static final class $itp_result_iterator_p$UnaryFunction extends UnaryFunction {
        public $itp_result_iterator_p$UnaryFunction() {
            super(extractFunctionNamed("ITP-RESULT-ITERATOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rtp_iterators.itp_result_iterator_p(arg1);
        }
    }

    static private final SubLList $list_alt68 = list(new SubLObject[]{ makeSymbol("_CSETF-RTP-ITERATOR-STRING"), makeSymbol("_CSETF-RTP-ITERATOR-PARSING-MT"), makeSymbol("_CSETF-RTP-ITERATOR-SEMANTIC-MT"), makeSymbol("_CSETF-RTP-ITERATOR-STRENGTHEN?"), makeSymbol("_CSETF-RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?"), makeSymbol("_CSETF-RTP-ITERATOR-WFF-CHECK?"), makeSymbol("_CSETF-RTP-ITERATOR-FORCE"), makeSymbol("_CSETF-RTP-ITERATOR-RAW-PARSES"), makeSymbol("_CSETF-RTP-ITERATOR-RESULT-QUEUE"), makeSymbol("_CSETF-RTP-ITERATOR-INITIALIZED"), makeSymbol("_CSETF-RTP-ITERATOR-TEMPLATE-CATEGORY"), makeSymbol("_CSETF-RTP-ITERATOR-MEMOIZATION-STATE"), makeSymbol("_CSETF-RTP-ITERATOR-SBHL-RESOURCE") });

    static private final SubLSymbol $sym76$RTP_ITERATOR_STRENGTHEN_ = makeSymbol("RTP-ITERATOR-STRENGTHEN?");

    static private final SubLSymbol $sym77$_CSETF_RTP_ITERATOR_STRENGTHEN_ = makeSymbol("_CSETF-RTP-ITERATOR-STRENGTHEN?");

    static private final SubLSymbol $sym78$RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_ = makeSymbol("RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?");

    static private final SubLSymbol $sym79$_CSETF_RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_ = makeSymbol("_CSETF-RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?");

    static private final SubLSymbol $sym80$RTP_ITERATOR_WFF_CHECK_ = makeSymbol("RTP-ITERATOR-WFF-CHECK?");

    static private final SubLSymbol $sym81$_CSETF_RTP_ITERATOR_WFF_CHECK_ = makeSymbol("_CSETF-RTP-ITERATOR-WFF-CHECK?");

    public static final class $itp_section_iterator_p$UnaryFunction extends UnaryFunction {
        public $itp_section_iterator_p$UnaryFunction() {
            super(extractFunctionNamed("ITP-SECTION-ITERATOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rtp_iterators.itp_section_iterator_p(arg1);
        }
    }

    public static final SubLSymbol $kw100$MULTIPLE_QUANTIFICATIONS_ = makeKeyword("MULTIPLE-QUANTIFICATIONS?");

    public static final SubLSymbol $kw101$WFF_CHECK_ = makeKeyword("WFF-CHECK?");

    public static final class $itp_child_iterator_p$UnaryFunction extends UnaryFunction {
        public $itp_child_iterator_p$UnaryFunction() {
            super(extractFunctionNamed("ITP-CHILD-ITERATOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rtp_iterators.itp_child_iterator_p(arg1);
        }
    }

    public static final class $rtp_iterator_native extends SubLStructNative {
        public SubLObject $string;

        public SubLObject $parsing_mt;

        public SubLObject $semantic_mt;

        public SubLObject $strengthenP;

        public SubLObject $multiple_quantificationsP;

        public SubLObject $wff_checkP;

        public SubLObject $force;

        public SubLObject $raw_parses;

        public SubLObject $result_queue;

        public SubLObject $initialized;

        public SubLObject $template_category;

        public SubLObject $memoization_state;

        public SubLObject $sbhl_resource;

        private static final SubLStructDeclNative structDecl;

        public $rtp_iterator_native() {
            rtp_iterators.$rtp_iterator_native.this.$string = Lisp.NIL;
            rtp_iterators.$rtp_iterator_native.this.$parsing_mt = Lisp.NIL;
            rtp_iterators.$rtp_iterator_native.this.$semantic_mt = Lisp.NIL;
            rtp_iterators.$rtp_iterator_native.this.$strengthenP = Lisp.NIL;
            rtp_iterators.$rtp_iterator_native.this.$multiple_quantificationsP = Lisp.NIL;
            rtp_iterators.$rtp_iterator_native.this.$wff_checkP = Lisp.NIL;
            rtp_iterators.$rtp_iterator_native.this.$force = Lisp.NIL;
            rtp_iterators.$rtp_iterator_native.this.$raw_parses = Lisp.NIL;
            rtp_iterators.$rtp_iterator_native.this.$result_queue = Lisp.NIL;
            rtp_iterators.$rtp_iterator_native.this.$initialized = Lisp.NIL;
            rtp_iterators.$rtp_iterator_native.this.$template_category = Lisp.NIL;
            rtp_iterators.$rtp_iterator_native.this.$memoization_state = Lisp.NIL;
            rtp_iterators.$rtp_iterator_native.this.$sbhl_resource = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return rtp_iterators.$rtp_iterator_native.this.$string;
        }

        @Override
        public SubLObject getField3() {
            return rtp_iterators.$rtp_iterator_native.this.$parsing_mt;
        }

        @Override
        public SubLObject getField4() {
            return rtp_iterators.$rtp_iterator_native.this.$semantic_mt;
        }

        @Override
        public SubLObject getField5() {
            return rtp_iterators.$rtp_iterator_native.this.$strengthenP;
        }

        @Override
        public SubLObject getField6() {
            return rtp_iterators.$rtp_iterator_native.this.$multiple_quantificationsP;
        }

        @Override
        public SubLObject getField7() {
            return rtp_iterators.$rtp_iterator_native.this.$wff_checkP;
        }

        @Override
        public SubLObject getField8() {
            return rtp_iterators.$rtp_iterator_native.this.$force;
        }

        @Override
        public SubLObject getField9() {
            return rtp_iterators.$rtp_iterator_native.this.$raw_parses;
        }

        @Override
        public SubLObject getField10() {
            return rtp_iterators.$rtp_iterator_native.this.$result_queue;
        }

        @Override
        public SubLObject getField11() {
            return rtp_iterators.$rtp_iterator_native.this.$initialized;
        }

        @Override
        public SubLObject getField12() {
            return rtp_iterators.$rtp_iterator_native.this.$template_category;
        }

        @Override
        public SubLObject getField13() {
            return rtp_iterators.$rtp_iterator_native.this.$memoization_state;
        }

        @Override
        public SubLObject getField14() {
            return rtp_iterators.$rtp_iterator_native.this.$sbhl_resource;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return rtp_iterators.$rtp_iterator_native.this.$string = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return rtp_iterators.$rtp_iterator_native.this.$parsing_mt = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return rtp_iterators.$rtp_iterator_native.this.$semantic_mt = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return rtp_iterators.$rtp_iterator_native.this.$strengthenP = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return rtp_iterators.$rtp_iterator_native.this.$multiple_quantificationsP = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return rtp_iterators.$rtp_iterator_native.this.$wff_checkP = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return rtp_iterators.$rtp_iterator_native.this.$force = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return rtp_iterators.$rtp_iterator_native.this.$raw_parses = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return rtp_iterators.$rtp_iterator_native.this.$result_queue = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return rtp_iterators.$rtp_iterator_native.this.$initialized = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return rtp_iterators.$rtp_iterator_native.this.$template_category = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return rtp_iterators.$rtp_iterator_native.this.$memoization_state = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return rtp_iterators.$rtp_iterator_native.this.$sbhl_resource = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rtp.rtp_iterators.$rtp_iterator_native.class, rtp_iterators.RTP_ITERATOR, rtp_iterators.RTP_ITERATOR_P, rtp_iterators.$list77, rtp_iterators.$list78, new String[]{ "$string", "$parsing_mt", "$semantic_mt", "$strengthenP", "$multiple_quantificationsP", "$wff_checkP", "$force", "$raw_parses", "$result_queue", "$initialized", "$template_category", "$memoization_state", "$sbhl_resource" }, rtp_iterators.$list79, rtp_iterators.$list80, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    static private final SubLString $str_alt117$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLSymbol $sym118$EL_WFF_ = makeSymbol("EL-WFF?");

    public static final class $rtp_iterator_p$UnaryFunction extends UnaryFunction {
        public $rtp_iterator_p$UnaryFunction() {
            super(extractFunctionNamed("RTP-ITERATOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rtp_iterators.rtp_iterator_p(arg1);
        }
    }
}

/**
 * Total time: 317 ms
 */
