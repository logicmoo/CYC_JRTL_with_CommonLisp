/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.copy_expression;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.nreplace_formula_arg;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.gensym;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.rtp.iterative_template_parser;
import com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders;
import com.cyc.cycjava.cycl.rtp.rtp_initialize;
import com.cyc.cycjava.cycl.rtp.rtp_iterators;
import com.cyc.cycjava.cycl.rtp.rtp_type_checkers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RKF-TEXT-PROCESSORS
 * source file: /cyc/top/cycl/rkf-text-processors.lisp
 * created:     2019/07/03 17:38:01
 */
public final class rkf_text_processors extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rkf_text_processors();

 public static final String myName = "com.cyc.cycjava.cycl.rkf_text_processors";


    // defparameter
    // Should all #$TheResultOfParsing NAUTs be resolved before returning?
    /**
     * Should all #$TheResultOfParsing NAUTs be resolved before returning?
     */
    @LispMethod(comment = "Should all #$TheResultOfParsing NAUTs be resolved before returning?\ndefparameter")
    public static final SubLSymbol $rkf_text_proc_resolve_parses$ = makeSymbol("*RKF-TEXT-PROC-RESOLVE-PARSES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $resolve_parse_interpretation_max_depth$ = makeSymbol("*RESOLVE-PARSE-INTERPRETATION-MAX-DEPTH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $resolve_parse_recursion_depth$ = makeSymbol("*RESOLVE-PARSE-RECURSION-DEPTH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $resolve_parse_recursion_show_warningsP$ = makeSymbol("*RESOLVE-PARSE-RECURSION-SHOW-WARNINGS?*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_parse_result$ = makeSymbol("*DTP-PARSE-RESULT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rkf_textproc_print_parse_result_tersely$ = makeSymbol("*RKF-TEXTPROC-PRINT-PARSE-RESULT-TERSELY*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rkf_uttrdr_allow_nltagsP$ = makeSymbol("*RKF-UTTRDR-ALLOW-NLTAGS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rkf_uttrdr_full_spans_onlyP$ = makeSymbol("*RKF-UTTRDR-FULL-SPANS-ONLY?*");

    // defconstant
    // How do we try to parse phrases that we don't know the category of?
    /**
     * How do we try to parse phrases that we don't know the category of?
     */
    @LispMethod(comment = "How do we try to parse phrases that we don\'t know the category of?\ndefconstant")
    private static final SubLSymbol $rkf_term_reader_default_templates$ = makeSymbol("*RKF-TERM-READER-DEFAULT-TEMPLATES*");

    // deflexical
    /**
     * an ALIST that contains the mappings from CycL term types to template
     * categories.
     */
    @LispMethod(comment = "an ALIST that contains the mappings from CycL term types to template\r\ncategories.\ndeflexical\nan ALIST that contains the mappings from CycL term types to template\ncategories.")
    private static final SubLSymbol $rkf_term_reader_cycl_template_mappings$ = makeSymbol("*RKF-TERM-READER-CYCL-TEMPLATE-MAPPINGS*");

    // deflexical
    /**
     * a dictionary containing the mappings between arg-types and Template
     * Categories
     */
    @LispMethod(comment = "a dictionary containing the mappings between arg-types and Template\r\nCategories\ndeflexical\na dictionary containing the mappings between arg-types and Template\nCategories")
    private static final SubLSymbol $rkf_uttrdr_arg_type_to_template_categories$ = makeSymbol("*RKF-UTTRDR-ARG-TYPE-TO-TEMPLATE-CATEGORIES*");

    // defparameter
    /**
     * what type of ordering should be preferred. Known values include nil and
     * :quality
     */
    @LispMethod(comment = "what type of ordering should be preferred. Known values include nil and\r\n:quality\ndefparameter\nwhat type of ordering should be preferred. Known values include nil and\n:quality")
    public static final SubLSymbol $pmg_ordering$ = makeSymbol("*PMG-ORDERING*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_parse_module_definition$ = makeSymbol("*DTP-PARSE-MODULE-DEFINITION*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rkf_uttrdr_default_cost$ = makeSymbol("*RKF-UTTRDR-DEFAULT-COST*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rkf_uttrdr_default_expected_expansions$ = makeSymbol("*RKF-UTTRDR-DEFAULT-EXPECTED-EXPANSIONS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_parse_module_group$ = makeSymbol("*DTP-PARSE-MODULE-GROUP*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rkf_uttrdr_resolvables$ = makeSymbol("*RKF-UTTRDR-RESOLVABLES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rkf_uttrdr_known_parsers_lock$ = makeSymbol("*RKF-UTTRDR-KNOWN-PARSERS-LOCK*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rkf_uttrdr_use_vpp_in_itp$ = makeSymbol("*RKF-UTTRDR-USE-VPP-IN-ITP*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rkf_uttrdr_marker$ = makeSymbol("*RKF-UTTRDR-MARKER*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("SPAN"), makeSymbol("INTERPRETATIONS"));

    static private final SubLList $list2 = list(list(makeSymbol("*RKF-TEXT-PROC-RESOLVE-PARSES*"), T));

    private static final SubLSymbol RKF_UTTRDR_ORDER_PARSES = makeSymbol("RKF-UTTRDR-ORDER-PARSES");

    static private final SubLString $str4$Exceeded_recursion_depth__S_for_R = makeString("Exceeded recursion depth ~S for RESOLVE-PARSE-INTERPRETATION while parsing~% ~S");

    static private final SubLList $list6 = cons(makeSymbol("OUT"), makeSymbol("IN"));

    private static final SubLSymbol PARSE_RESULT = makeSymbol("PARSE-RESULT");

    private static final SubLSymbol PARSE_RESULT_P = makeSymbol("PARSE-RESULT-P");

    static private final SubLList $list9 = list(makeSymbol("ORIGINAL"), makeSymbol("CONSTITUENTS"), makeSymbol("ELIMINATED"), makeSymbol("PROBLEMS"), makeSymbol("SOLUTIONS"));

    static private final SubLList $list10 = list(makeKeyword("ORIGINAL"), makeKeyword("CONSTITUENTS"), makeKeyword("ELIMINATED"), makeKeyword("PROBLEMS"), makeKeyword("SOLUTIONS"));

    static private final SubLList $list11 = list(makeSymbol("PARSE-RESULT-ORIGINAL"), makeSymbol("PARSE-RESULT-CONSTITUENTS"), makeSymbol("PARSE-RESULT-ELIMINATED"), makeSymbol("PARSE-RESULT-PROBLEMS"), makeSymbol("PARSE-RESULT-SOLUTIONS"));

    static private final SubLList $list12 = list(makeSymbol("_CSETF-PARSE-RESULT-ORIGINAL"), makeSymbol("_CSETF-PARSE-RESULT-CONSTITUENTS"), makeSymbol("_CSETF-PARSE-RESULT-ELIMINATED"), makeSymbol("_CSETF-PARSE-RESULT-PROBLEMS"), makeSymbol("_CSETF-PARSE-RESULT-SOLUTIONS"));

    private static final SubLSymbol PRINT_PARSE_RESULT = makeSymbol("PRINT-PARSE-RESULT");

    private static final SubLSymbol PARSE_RESULT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PARSE-RESULT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list15 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PARSE-RESULT-P"));

    private static final SubLSymbol PARSE_RESULT_ORIGINAL = makeSymbol("PARSE-RESULT-ORIGINAL");

    private static final SubLSymbol _CSETF_PARSE_RESULT_ORIGINAL = makeSymbol("_CSETF-PARSE-RESULT-ORIGINAL");

    private static final SubLSymbol PARSE_RESULT_CONSTITUENTS = makeSymbol("PARSE-RESULT-CONSTITUENTS");

    private static final SubLSymbol _CSETF_PARSE_RESULT_CONSTITUENTS = makeSymbol("_CSETF-PARSE-RESULT-CONSTITUENTS");

    private static final SubLSymbol PARSE_RESULT_ELIMINATED = makeSymbol("PARSE-RESULT-ELIMINATED");

    private static final SubLSymbol _CSETF_PARSE_RESULT_ELIMINATED = makeSymbol("_CSETF-PARSE-RESULT-ELIMINATED");

    private static final SubLSymbol PARSE_RESULT_PROBLEMS = makeSymbol("PARSE-RESULT-PROBLEMS");

    private static final SubLSymbol _CSETF_PARSE_RESULT_PROBLEMS = makeSymbol("_CSETF-PARSE-RESULT-PROBLEMS");

    private static final SubLSymbol PARSE_RESULT_SOLUTIONS = makeSymbol("PARSE-RESULT-SOLUTIONS");

    private static final SubLSymbol _CSETF_PARSE_RESULT_SOLUTIONS = makeSymbol("_CSETF-PARSE-RESULT-SOLUTIONS");

    private static final SubLString $str31$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_PARSE_RESULT = makeSymbol("MAKE-PARSE-RESULT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PARSE_RESULT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PARSE-RESULT-METHOD");

    private static final SubLList $list37 = list(list(makeSymbol("*RKF-TEXTPROC-PRINT-PARSE-RESULT-TERSELY*"), NIL));



    private static final SubLString $str39$__Original______S__ = makeString("~&Original:~%  ~S~%");

    private static final SubLString $$$Constituents = makeString("Constituents");

    private static final SubLString $$$Eliminations = makeString("Eliminations");

    private static final SubLString $$$Open_Issues = makeString("Open Issues");

    private static final SubLString $$$Issue_Resolutions = makeString("Issue Resolutions");

    private static final SubLString $str44$___A___ = makeString("~&~A:~%");

    private static final SubLString $str45$__none____ = makeString("  none~%~%");

    private static final SubLString $str46$___S______S____ = makeString("  ~S~%   ~S~%~%");

    private static final SubLList $list47 = list(list(makeSymbol("*RKF-UTTRDR-ALLOW-NLTAGS?*"), NIL));

    private static final SubLList $list48 = list(list(makeSymbol("*RKF-UTTRDR-FULL-SPANS-ONLY?*"), T));

    private static final SubLList $list49 = list(list(makeSymbol("*RKF-UTTRDR-FULL-SPANS-ONLY?*"), NIL));







    private static final SubLString $$$Parsing_Pipeline = makeString("Parsing Pipeline");

    private static final SubLSymbol STORE_RTP_PARSES_IN_PIPELINE = makeSymbol("STORE-RTP-PARSES-IN-PIPELINE");



    static private final SubLList $list57 = list(reader_make_constant_shell("NPTemplate"), reader_make_constant_shell("NBarTemplate"), reader_make_constant_shell("AdjPTemplate"));

    private static final SubLList $list58 = list(list(reader_make_constant_shell("CycLSentence-Assertible"), reader_make_constant_shell("STemplate")), list(reader_make_constant_shell("SubLString"), reader_make_constant_shell("StringTemplate")), list(reader_make_constant_shell("ScalarInterval"), reader_make_constant_shell("NPTemplate")), list(reader_make_constant_shell("Plan-ExpectedSituationType"), reader_make_constant_shell("InfinitivalVPTemplate"), reader_make_constant_shell("InfinitivalVBarTemplate"), reader_make_constant_shell("NBarTemplate"), reader_make_constant_shell("NPTemplate")));

    private static final SubLList $list60 = list(list(makeSymbol("*PMG-ORDERING*"), makeKeyword("QUALITY")));



    private static final SubLSymbol $sym63$TIME_INTERVAL_ = makeSymbol("TIME-INTERVAL?");





    private static final SubLSymbol $rkf_terms_forager_lock$ = makeSymbol("*RKF-TERMS-FORAGER-LOCK*");

    private static final SubLString $$$Terms_Forager = makeString("Terms Forager");

    static private final SubLList $list69 = list(makeSymbol("RKF-CH-NOUN-COMPOUND-PHRASES"), makeSymbol("RKF-CH-MULTI-WORD-DENOTATION"), makeSymbol("RKF-CH-DENOTS-OF-STRING"));

    private static final SubLSymbol PARSE_MODULE_DEFINITION = makeSymbol("PARSE-MODULE-DEFINITION");

    private static final SubLSymbol PARSE_MODULE_DEFINITION_P = makeSymbol("PARSE-MODULE-DEFINITION-P");

    static private final SubLList $list72 = list(makeSymbol("NAME"), makeSymbol("CATEGORY"), makeSymbol("QUALITY"), makeSymbol("ENTRY-POINT"), makeSymbol("COST"), makeSymbol("EXPECTED-EXPANSIONS"), makeSymbol("SUPPLANTS"));

    private static final SubLList $list73 = list($NAME, makeKeyword("CATEGORY"), makeKeyword("QUALITY"), makeKeyword("ENTRY-POINT"), $COST, makeKeyword("EXPECTED-EXPANSIONS"), makeKeyword("SUPPLANTS"));

    private static final SubLList $list74 = list(makeSymbol("PMD-NAME"), makeSymbol("PMD-CATEGORY"), makeSymbol("PMD-QUALITY"), makeSymbol("PMD-ENTRY-POINT"), makeSymbol("PMD-COST"), makeSymbol("PMD-EXPECTED-EXPANSIONS"), makeSymbol("PMD-SUPPLANTS"));

    private static final SubLList $list75 = list(makeSymbol("_CSETF-PMD-NAME"), makeSymbol("_CSETF-PMD-CATEGORY"), makeSymbol("_CSETF-PMD-QUALITY"), makeSymbol("_CSETF-PMD-ENTRY-POINT"), makeSymbol("_CSETF-PMD-COST"), makeSymbol("_CSETF-PMD-EXPECTED-EXPANSIONS"), makeSymbol("_CSETF-PMD-SUPPLANTS"));

    private static final SubLSymbol PMD_PRINT = makeSymbol("PMD-PRINT");

    private static final SubLSymbol PARSE_MODULE_DEFINITION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PARSE-MODULE-DEFINITION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list78 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PARSE-MODULE-DEFINITION-P"));

    private static final SubLSymbol PMD_NAME = makeSymbol("PMD-NAME");

    private static final SubLSymbol _CSETF_PMD_NAME = makeSymbol("_CSETF-PMD-NAME");

    private static final SubLSymbol PMD_CATEGORY = makeSymbol("PMD-CATEGORY");

    private static final SubLSymbol _CSETF_PMD_CATEGORY = makeSymbol("_CSETF-PMD-CATEGORY");

    private static final SubLSymbol PMD_QUALITY = makeSymbol("PMD-QUALITY");

    private static final SubLSymbol _CSETF_PMD_QUALITY = makeSymbol("_CSETF-PMD-QUALITY");

    private static final SubLSymbol PMD_ENTRY_POINT = makeSymbol("PMD-ENTRY-POINT");

    private static final SubLSymbol _CSETF_PMD_ENTRY_POINT = makeSymbol("_CSETF-PMD-ENTRY-POINT");

    private static final SubLSymbol PMD_COST = makeSymbol("PMD-COST");

    private static final SubLSymbol _CSETF_PMD_COST = makeSymbol("_CSETF-PMD-COST");

    private static final SubLSymbol PMD_EXPECTED_EXPANSIONS = makeSymbol("PMD-EXPECTED-EXPANSIONS");

    private static final SubLSymbol _CSETF_PMD_EXPECTED_EXPANSIONS = makeSymbol("_CSETF-PMD-EXPECTED-EXPANSIONS");

    private static final SubLSymbol PMD_SUPPLANTS = makeSymbol("PMD-SUPPLANTS");

    private static final SubLSymbol _CSETF_PMD_SUPPLANTS = makeSymbol("_CSETF-PMD-SUPPLANTS");

    private static final SubLSymbol MAKE_PARSE_MODULE_DEFINITION = makeSymbol("MAKE-PARSE-MODULE-DEFINITION");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PARSE_MODULE_DEFINITION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PARSE-MODULE-DEFINITION-METHOD");

    private static final SubLString $str101$_PARSE_MODULE_DEFINITION__S_ = makeString("<PARSE-MODULE-DEFINITION ~S>");

    private static final SubLString $str102$Can_t_resolve_quality_of__S_ = makeString("Can't resolve quality of ~S.");

    private static final SubLString $str103$Parser__S_for__S__Func___S_Heur__ = makeString("Parser ~S for ~S  Func: ~S Heur: ");

    private static final SubLString $str104$___Suppl__S_ = makeString("// Suppl ~S ");

    private static final SubLString $str105$Class__D____Qual__D____Cost__D___ = makeString("Class ~D // Qual ~D // Cost ~D // Expn ~D ");

    private static final SubLSymbol PARSE_MODULE_GROUP = makeSymbol("PARSE-MODULE-GROUP");

    private static final SubLSymbol PARSE_MODULE_GROUP_P = makeSymbol("PARSE-MODULE-GROUP-P");

    private static final SubLList $list109 = list(makeSymbol("CATEGORY"), makeSymbol("TOOLS"));

    private static final SubLList $list110 = list(makeKeyword("CATEGORY"), makeKeyword("TOOLS"));

    private static final SubLList $list111 = list(makeSymbol("PMG-CATEGORY"), makeSymbol("PMG-TOOLS"));

    private static final SubLList $list112 = list(makeSymbol("_CSETF-PMG-CATEGORY"), makeSymbol("_CSETF-PMG-TOOLS"));

    private static final SubLSymbol PARSE_MODULE_GROUP_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PARSE-MODULE-GROUP-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list115 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PARSE-MODULE-GROUP-P"));

    private static final SubLSymbol PMG_CATEGORY = makeSymbol("PMG-CATEGORY");

    private static final SubLSymbol _CSETF_PMG_CATEGORY = makeSymbol("_CSETF-PMG-CATEGORY");

    private static final SubLSymbol PMG_TOOLS = makeSymbol("PMG-TOOLS");

    private static final SubLSymbol _CSETF_PMG_TOOLS = makeSymbol("_CSETF-PMG-TOOLS");

    private static final SubLSymbol MAKE_PARSE_MODULE_GROUP = makeSymbol("MAKE-PARSE-MODULE-GROUP");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PARSE_MODULE_GROUP_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PARSE-MODULE-GROUP-METHOD");

    private static final SubLSymbol $sym123$PMD_EXPECTED_EXPANSIONS_ = makeSymbol("PMD-EXPECTED-EXPANSIONS<");

    private static final SubLSymbol $sym124$PMD_COST_ = makeSymbol("PMD-COST<");

    private static final SubLSymbol $sym125$PMD_QUALITY_ = makeSymbol("PMD-QUALITY<");

    private static final SubLString $str126$__Parse_Group_for__S___ = makeString("~&Parse Group for ~S.~%");

    private static final SubLString $str127$Tools__in_order______ = makeString("Tools (in order):~%  ");

    private static final SubLSymbol $rkf_uttrdr_known_parsers$ = makeSymbol("*RKF-UTTRDR-KNOWN-PARSERS*");

    public static final SubLSymbol $rkf_uttrdr_psp_return_mode$ = makeSymbol("*RKF-UTTRDR-PSP-RETURN-MODE*");

    private static final SubLString $$$Known_Parsers = makeString("Known Parsers");

    private static final SubLList $list133 = list(makeSymbol("*RKF-UTTRDR-KNOWN-PARSERS-LOCK*"));

    private static final SubLSymbol $sym134$RKF_UTTRDR_PMD_ORDERED_ = makeSymbol("RKF-UTTRDR-PMD-ORDERED?");

    private static final SubLString $str135$No_known_parsers_for_category__S_ = makeString("No known parsers for category ~S.~%");

    private static final SubLList $list137 = list(makeSymbol("KEYS"));

    private static final SubLSymbol $sym138$PMD = makeUninternedSymbol("PMD");

    private static final SubLSymbol $sym139$CURR = makeUninternedSymbol("CURR");

    private static final SubLSymbol $sym140$KEY = makeUninternedSymbol("KEY");

    private static final SubLSymbol $sym141$VALUE = makeUninternedSymbol("VALUE");

    private static final SubLSymbol $sym142$NAME = makeUninternedSymbol("NAME");

    private static final SubLSymbol $sym143$CATEGORY = makeUninternedSymbol("CATEGORY");

    private static final SubLSymbol $sym144$ENTRY_POINT = makeUninternedSymbol("ENTRY-POINT");

    private static final SubLSymbol $sym145$DOCSTRING = makeUninternedSymbol("DOCSTRING");

    private static final SubLSymbol $sym146$COST = makeUninternedSymbol("COST");

    private static final SubLSymbol $sym147$QUALITY = makeUninternedSymbol("QUALITY");

    private static final SubLSymbol $sym148$EXPECTED_EXPANSIONS = makeUninternedSymbol("EXPECTED-EXPANSIONS");

    private static final SubLSymbol $sym149$SUPPLANTS = makeUninternedSymbol("SUPPLANTS");

    private static final SubLString $str158$Invalid_key__S_in_parser_module_r = makeString("Invalid key ~S in parser-module-registration.");

    private static final SubLSymbol NEW_PARSE_MODULE_DEFINITION = makeSymbol("NEW-PARSE-MODULE-DEFINITION");

    private static final SubLSymbol RKF_UTTRDR_REGISTER_PARSER = makeSymbol("RKF-UTTRDR-REGISTER-PARSER");

    static private final SubLList $list161 = list(makeUninternedSymbol("KEY"), makeUninternedSymbol("VALUE"));

    static private final SubLList $list162 = list(list($NAME, makeKeyword("TEMPLATE-PARSE")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("STemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), list(makeKeyword("DOC"), makeString("The preferred parser for all sentence level constructions.")), list(makeKeyword("QUALITY"), ONE_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), list(makeKeyword("NPP"), makeKeyword("VPP"))));

    static private final SubLList $list163 = list(list($NAME, makeKeyword("TEMPLATE-PARSE")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("ImperativeTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), list(makeKeyword("DOC"), makeString("The preferred parser for all sentence level constructions.")), list(makeKeyword("QUALITY"), ONE_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), list(makeKeyword("NPP"), makeKeyword("VPP"))));

    static private final SubLList $list164 = list(list($NAME, makeKeyword("TEMPLATE-PARSE")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("TemporalModifierTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), list(makeKeyword("DOC"), makeString("interpretations of temporal modifiers")), list(makeKeyword("QUALITY"), ONE_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list165 = list(list($NAME, makeKeyword("TEMPLATE-PARSER")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("NPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), list(makeKeyword("DOC"), makeString("Handles some NPPs in templates and calls through to :npp where needed.")), list(makeKeyword("QUALITY"), TEN_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list166 = list(list($NAME, makeKeyword("TEMPLATE-PARSER")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("PossessiveTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), list(makeKeyword("DOC"), makeString("Handles some NPPs in templates and calls through to :npp where needed.")), list(makeKeyword("QUALITY"), TEN_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list167 = list(list($NAME, makeKeyword("TEMPLATE-PARSER")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("DateTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), list(makeKeyword("DOC"), makeString("Handles some NPPs in templates and calls through to :npp where \nneeded.")), list(makeKeyword("QUALITY"), TEN_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list168 = list(list($NAME, makeKeyword("NPP")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("NPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-NOUN-PHRASE-PARSER")), list(makeKeyword("DOC"), makeString("does all real noun phrases, but will not get nbars")), list(makeKeyword("QUALITY"), makeSymbol("PMD-NPP-QUALITY")), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list169 = list(list($NAME, makeKeyword("NCP")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("NBarTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-NOUN-COMPOUND-PARSER")), list(makeKeyword("DOC"), makeString("gets noun compound nbars as well")), list(makeKeyword("QUALITY"), TEN_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list170 = list(list($NAME, makeKeyword("NCLEX")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("NPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-NOUN-COMPOUND-LEXICON")), list(makeKeyword("DOC"), makeString("looks up noun compounds in the lexicon")), list(makeKeyword("QUALITY"), ONE_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list171 = list(list($NAME, makeKeyword("MWD")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("NPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-MULTI-WORD-DENOTATIONS")), list(makeKeyword("DOC"), makeString("uses multi-word denotations to interpret parse results")), list(makeKeyword("QUALITY"), TWO_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list172 = list(list($NAME, makeKeyword("DENOTS")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("NPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-DENOTS-OF-STRING")), list(makeKeyword("DOC"), makeString("uses string denotation assertions to interpret parse results")), list(makeKeyword("QUALITY"), FIVE_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), SIX_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list173 = list(list($NAME, makeKeyword("NUMBERS")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("NPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-NUMBER-PARSER")), list(makeKeyword("DOC"), makeString("uses number parser to interpret parse results")), list(makeKeyword("QUALITY"), TWO_INTEGER), list($COST, TWENTY_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list174 = list(list($NAME, makeKeyword("LISP-TERM-READ")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("NPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-READ-CYCL-TERM-FROM-STRING")), list(makeKeyword("DOC"), makeString("uses lisp 'read' to read a CycL term")), list(makeKeyword("QUALITY"), THREE_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), ONE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list175 = list(list($NAME, makeKeyword("STRING-READ")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("StringTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-READ-AS-STRING")), list(makeKeyword("DOC"), makeString("returns the string you sent in")), list(makeKeyword("QUALITY"), TEN_INTEGER), list($COST, ONE_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), ONE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    private static final SubLList $list176 = list(list($NAME, makeKeyword("PSP")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("InfinitivalVBarTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-PARSE-INF-VBAR")), list(makeKeyword("DOC"), makeString("uses PSP to parse infinitival vbars like 'eat doughnuts'")), list(makeKeyword("QUALITY"), TEN_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    private static final SubLList $list177 = list(list($NAME, makeKeyword("PSP")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("InfinitivalVPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-PARSE-INF-VBAR")), list(makeKeyword("DOC"), makeString("uses PSP to parse infinitival VPs like 'eat doughnuts'")), list(makeKeyword("QUALITY"), TEN_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    private static final SubLList $list178 = list(list($NAME, makeKeyword("DENOTS")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("AdjPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-DENOTS-OF-STRING")), list(makeKeyword("DOC"), makeString("uses string denotation assertions to interpret parse results")), list(makeKeyword("QUALITY"), TWO_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    private static final SubLList $list179 = list(list($NAME, makeKeyword("NCLEX")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("AdjPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-NOUN-COMPOUND-LEXICON")), list(makeKeyword("DOC"), makeString("looks up noun compounds in the lexicon")), list(makeKeyword("QUALITY"), THREE_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    private static final SubLList $list180 = list(list($NAME, makeKeyword("MWD")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("AdjPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-MULTI-WORD-DENOTATIONS")), list(makeKeyword("DOC"), makeString("uses multi-word denotations to interpret parse results")), list(makeKeyword("QUALITY"), FOUR_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    private static final SubLList $list181 = list(list($NAME, makeKeyword("LISP-TERM-READ")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("AdjPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-READ-CYCL-TERM-FROM-STRING")), list(makeKeyword("DOC"), makeString("uses lisp 'read' to read a CycL term")), list(makeKeyword("QUALITY"), THREE_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), ONE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list182 = list(list($NAME, makeKeyword("TEMPLATE-PARSE")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("AdjPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), list(makeKeyword("DOC"), makeString("The preferred parser for all sentence level constructions.")), list(makeKeyword("QUALITY"), FIVE_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    private static final SubLList $list183 = list(list($NAME, makeKeyword("TEMPLATE-PARSE")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("QuestionTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), list(makeKeyword("DOC"), makeString("The preferred parser for all sentence level constructions.")), list(makeKeyword("QUALITY"), ONE_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), list(makeKeyword("NPP"), makeKeyword("VPP"))));

    private static final SubLList $list184 = list(list($NAME, makeKeyword("TEMPLATE-PARSE")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("ScenarioTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), list(makeKeyword("DOC"), makeString("The preferred parser for all scenario descriptions")), list(makeKeyword("QUALITY"), ONE_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), list(makeKeyword("NPP"), makeKeyword("VPP"))));



    private static final SubLSymbol RKF_CH_NOUN_COMPOUND_PHRASE_PARSER = makeSymbol("RKF-CH-NOUN-COMPOUND-PHRASE-PARSER");

    private static final SubLSymbol RKF_CH_DENOTATIONS_FROM_MULTI_WORD_STRING = makeSymbol("RKF-CH-DENOTATIONS-FROM-MULTI-WORD-STRING");

    private static final SubLSymbol RKF_CH_DENOTATIONS_FOR_STRING = makeSymbol("RKF-CH-DENOTATIONS-FOR-STRING");

    private static final SubLSymbol RKF_TERM_FROM_STRING = makeSymbol("RKF-TERM-FROM-STRING");

    private static final SubLList $list191 = list(makeSymbol("PARSE-SPAN"), makeSymbol("INTERPRETATION"));

    private static final SubLSymbol RKF_NUMBER_PARSER = makeSymbol("RKF-NUMBER-PARSER");

    private static final SubLString $str193$RKF_UTTRDR_MARKER = makeString("RKF-UTTRDR-MARKER");





    private static final SubLObject $$NLQuantFn_3 = reader_make_constant_shell("NLQuantFn-3");

    private static final SubLObject $$NumericalQuant_NLAttrFn = reader_make_constant_shell("NumericalQuant-NLAttrFn");



    private static final SubLList $list199 = list(makeSymbol("RELATIVE-SPAN"), makeSymbol("INTERPRETATIONS"));

    private static final SubLSymbol $sym200$IS_THIS_A_NUMERIC_SPAN_ = makeSymbol("IS-THIS-A-NUMERIC-SPAN?");

    private static final SubLSymbol $sym201$IS_THIS_A_QUANT_FN_ = makeSymbol("IS-THIS-A-QUANT-FN?");

    private static final SubLList $list202 = list(makeSymbol("SPAN"), makeSymbol("PROBLEMS"));

    private static final SubLList $list203 = list(makeSymbol("SURROGATE"), makeSymbol("INTERPRETATION"));

    private static final SubLSymbol RKF_CH_PARSING_SURROGATE_P = makeSymbol("RKF-CH-PARSING-SURROGATE-P");

    private static final SubLList $list205 = list(makeSymbol("FUNCTOR"), makeSymbol("STRING"), makeSymbol("SPAN"), makeSymbol("CATEGORY"), makeSymbol("CONSTRAINT"));

    private static final SubLList $list206 = list(makeSymbol("INTERPRETATION"), makeSymbol("SPAN"));

    private static final SubLSymbol $sym207$HLMT_ = makeSymbol("HLMT?");

    private static final SubLSymbol $kw211$WFF_CHECK_ = makeKeyword("WFF-CHECK?");

    private static final SubLSymbol PARSE_A_SENTENCE_COMPLETELY = makeSymbol("PARSE-A-SENTENCE-COMPLETELY");

    private static final SubLList $list218 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("PROPERTIES"));

    private static final SubLString $str219$This_function_returns_all_the_dec = makeString("This function returns all the declarative (statement) parses for a given sentence.  It returns full \n   CycL sentences, but does no wff-checking of the results.\n   @param SENTENCE string\n   @param MT microtheory\n   @param PROPERTIES property-listp");

    private static final SubLList $list220 = list(list(makeSymbol("SENTENCE"), makeSymbol("STRINGP")), list(makeSymbol("MT"), makeSymbol("HLMT?")), list(makeSymbol("PROPERTIES"), makeSymbol("PROPERTY-LIST-P")));

    private static final SubLList $list221 = list(makeSymbol("LISTP"));

    private static final SubLString $str222$_ = makeString("?");

    private static final SubLSymbol PARSE_A_QUESTION_COMPLETELY = makeSymbol("PARSE-A-QUESTION-COMPLETELY");

    private static final SubLString $str225$This_function_returns_all_the_que = makeString("This function returns all the question parses for a given sentence.  It returns full CycL sentences,\n   but does no wff-checking of the results.\n   @param SENTENCE string\n   @param MT microtheory\n   @param PROPERTIES property-list-p");

    private static final SubLString $str226$RTP_is_not_initialized___So__test = makeString("RTP is not initialized.  So, tests for PARSE-A-SENTENCE-COMPLETELY will not be run.");

    private static final SubLString $str227$RTP_is_not_initialized___So__test = makeString("RTP is not initialized.  So, tests for PARSE-A-QUESTION-COMPLETELY will not be run.");

    // Definitions
    /**
     * Utility for easier processing of parse results.
     */
    @LispMethod(comment = "Utility for easier processing of parse results.")
    public static final SubLObject rkf_textproc_parse_to_dictionary_alt(SubLObject parses, SubLObject v_dictionary) {
        if (v_dictionary == UNPROVIDED) {
            v_dictionary = NIL;
        }
        if (NIL == dictionary.dictionary_p(v_dictionary)) {
            v_dictionary = dictionary.new_dictionary(EQUALP, UNPROVIDED);
        }
        {
            SubLObject cdolist_list_var = parses;
            SubLObject constituent = NIL;
            for (constituent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constituent = cdolist_list_var.first()) {
                {
                    SubLObject datum = constituent;
                    SubLObject current = datum;
                    SubLObject span = NIL;
                    SubLObject interpretations = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    span = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    interpretations = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject processed_interpretations = rkf_textproc_preprocess_interps(interpretations);
                            dictionary.dictionary_enter(v_dictionary, span, processed_interpretations);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            }
        }
        return v_dictionary;
    }

    // Definitions
    /**
     * Utility for easier processing of parse results.
     */
    @LispMethod(comment = "Utility for easier processing of parse results.")
    public static SubLObject rkf_textproc_parse_to_dictionary(final SubLObject parses, SubLObject v_dictionary) {
        if (v_dictionary == UNPROVIDED) {
            v_dictionary = NIL;
        }
        if (NIL == dictionary.dictionary_p(v_dictionary)) {
            v_dictionary = dictionary.new_dictionary(EQUALP, UNPROVIDED);
        }
        SubLObject cdolist_list_var = parses;
        SubLObject constituent = NIL;
        constituent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = constituent;
            SubLObject span = NIL;
            SubLObject interpretations = NIL;
            destructuring_bind_must_consp(current, datum, $list0);
            span = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list0);
            interpretations = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject processed_interpretations = rkf_textproc_preprocess_interps(interpretations);
                dictionary.dictionary_enter(v_dictionary, span, processed_interpretations);
            } else {
                cdestructuring_bind_error(datum, $list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constituent = cdolist_list_var.first();
        } 
        return v_dictionary;
    }

    public static final SubLObject rkf_textproc_preprocess_interps_alt(SubLObject interps) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = interps;
            SubLObject interp = NIL;
            for (interp = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , interp = cdolist_list_var.first()) {
                result = cons(parsing_utilities.possibly_uniquify_variablefn(interp), result);
            }
            return nreverse(result);
        }
    }

    public static SubLObject rkf_textproc_preprocess_interps(final SubLObject interps) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = interps;
        SubLObject interp = NIL;
        interp = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(parsing_utilities.possibly_uniquify_variablefn(interp), result);
            cdolist_list_var = cdolist_list_var.rest();
            interp = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject with_fully_resolved_parses_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt2, append(body, NIL));
        }
    }

    public static SubLObject with_fully_resolved_parses(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list2, append(body, NIL));
    }

    public static final SubLObject rkf_textproc_dictionary_to_parse_alt(SubLObject v_dictionary) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $rkf_text_proc_resolve_parses$.getDynamicValue(thread)) {
                return rkf_textproc_dictionary_to_resolved_parse(v_dictionary);
            } else {
                return rkf_textproc_dictionary_to_parse_wXsurrogates(v_dictionary);
            }
        }
    }

    public static SubLObject rkf_textproc_dictionary_to_parse(final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $rkf_text_proc_resolve_parses$.getDynamicValue(thread)) {
            return rkf_textproc_dictionary_to_resolved_parse(v_dictionary);
        }
        return rkf_textproc_dictionary_to_parse_wXsurrogates(v_dictionary);
    }

    public static final SubLObject rkf_textproc_dictionary_to_parse_wXsurrogates_alt(SubLObject v_dictionary) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject parse = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject interpretations = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        parse = cons(list(span, interpretations), parse);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return Sort.sort(parse, RKF_UTTRDR_ORDER_PARSES, UNPROVIDED);
            }
        }
    }

    public static SubLObject rkf_textproc_dictionary_to_parse_wXsurrogates(final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parse = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject interpretations = thread.secondMultipleValue();
            thread.resetMultipleValues();
            parse = cons(list(span, interpretations), parse);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return Sort.sort(parse, RKF_UTTRDR_ORDER_PARSES, UNPROVIDED);
    }

    /**
     *
     *
     * @param DICTIONARY
     * 		dictionary; a dictionary contianing lists of cycl indexed off of the spans where they were found
     * @return list; the parse results, in standard parse-result format, but will all #$TheResultOfParsing answers resolved
    into whatever they will resolve into, if anything. If they don't resolve to anything, they are not returned.
     */
    @LispMethod(comment = "@param DICTIONARY\r\n\t\tdictionary; a dictionary contianing lists of cycl indexed off of the spans where they were found\r\n@return list; the parse results, in standard parse-result format, but will all #$TheResultOfParsing answers resolved\r\ninto whatever they will resolve into, if anything. If they don\'t resolve to anything, they are not returned.")
    public static final SubLObject rkf_textproc_dictionary_to_resolved_parse_alt(SubLObject v_dictionary) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject parse = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject interpretations = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject result_interps = NIL;
                            SubLObject cdolist_list_var = interpretations;
                            SubLObject interpretation = NIL;
                            for (interpretation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , interpretation = cdolist_list_var.first()) {
                                if (NIL != parsing_utilities.formula_contains_result_of_parsingP(interpretation)) {
                                    {
                                        SubLObject resolved_interpretations = resolve_parse_interpretation(interpretation, span, v_dictionary);
                                        if (NIL != resolved_interpretations) {
                                            result_interps = cconcatenate(result_interps, resolved_interpretations);
                                        }
                                    }
                                } else {
                                    {
                                        SubLObject item_var = interpretation;
                                        if (NIL == member(item_var, result_interps, EQUALP, symbol_function(IDENTITY))) {
                                            result_interps = cons(item_var, result_interps);
                                        }
                                    }
                                }
                            }
                            parse = cons(list(span, result_interps), parse);
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return Sort.sort(parse, RKF_UTTRDR_ORDER_PARSES, UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @param DICTIONARY
     * 		dictionary; a dictionary contianing lists of cycl indexed off of the spans where they were found
     * @return list; the parse results, in standard parse-result format, but will all #$TheResultOfParsing answers resolved
    into whatever they will resolve into, if anything. If they don't resolve to anything, they are not returned.
     */
    @LispMethod(comment = "@param DICTIONARY\r\n\t\tdictionary; a dictionary contianing lists of cycl indexed off of the spans where they were found\r\n@return list; the parse results, in standard parse-result format, but will all #$TheResultOfParsing answers resolved\r\ninto whatever they will resolve into, if anything. If they don\'t resolve to anything, they are not returned.")
    public static SubLObject rkf_textproc_dictionary_to_resolved_parse(final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parse = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject interpretations = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject result_interps = NIL;
            SubLObject cdolist_list_var = interpretations;
            SubLObject interpretation = NIL;
            interpretation = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != parsing_utilities.formula_contains_result_of_parsingP(interpretation)) {
                    final SubLObject resolved_interpretations = resolve_parse_interpretation(interpretation, span, v_dictionary);
                    if (NIL != resolved_interpretations) {
                        result_interps = cconcatenate(result_interps, resolved_interpretations);
                    }
                } else {
                    final SubLObject item_var = interpretation;
                    if (NIL == member(item_var, result_interps, EQUALP, symbol_function(IDENTITY))) {
                        result_interps = cons(item_var, result_interps);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                interpretation = cdolist_list_var.first();
            } 
            parse = cons(list(span, result_interps), parse);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return Sort.sort(parse, RKF_UTTRDR_ORDER_PARSES, UNPROVIDED);
    }

    /**
     *
     *
     * @param CYCL
    formula
     * 		
     * @param SPAN
    list
     * 		
     * @param DICTIONARY
     * 		dictionary; contains all the parses
     * @return list; a list of formulas with all TheResultOfParsing NAT
    completely resolved
     */
    @LispMethod(comment = "@param CYCL\nformula\r\n\t\t\r\n@param SPAN\nlist\r\n\t\t\r\n@param DICTIONARY\r\n\t\tdictionary; contains all the parses\r\n@return list; a list of formulas with all TheResultOfParsing NAT\r\ncompletely resolved")
    public static final SubLObject resolve_parse_interpretation_alt(SubLObject cycl, SubLObject span, SubLObject v_dictionary) {
        if (NIL != parsing_utilities.result_of_parsing_formulaP(cycl)) {
            return maybe_resolve_result_of_parsing_naut(cycl, span, v_dictionary);
        } else {
            if (NIL == parsing_utilities.formula_contains_result_of_parsingP(cycl)) {
                return list(cycl);
            } else {
                return resolve_parse_interpretation_args(cycl, span, v_dictionary);
            }
        }
    }

    /**
     *
     *
     * @param CYCL
    formula
     * 		
     * @param SPAN
    list
     * 		
     * @param DICTIONARY
     * 		dictionary; contains all the parses
     * @return list; a list of formulas with all TheResultOfParsing NAT
    completely resolved
     */
    @LispMethod(comment = "@param CYCL\nformula\r\n\t\t\r\n@param SPAN\nlist\r\n\t\t\r\n@param DICTIONARY\r\n\t\tdictionary; contains all the parses\r\n@return list; a list of formulas with all TheResultOfParsing NAT\r\ncompletely resolved")
    public static SubLObject resolve_parse_interpretation(final SubLObject cycl, final SubLObject span, final SubLObject v_dictionary) {
        if (NIL != parsing_utilities.result_of_parsing_formulaP(cycl)) {
            return maybe_resolve_result_of_parsing_naut(cycl, span, v_dictionary);
        }
        if (NIL == parsing_utilities.formula_contains_result_of_parsingP(cycl)) {
            return list(cycl);
        }
        return resolve_parse_interpretation_args(cycl, span, v_dictionary);
    }

    /**
     *
     *
     * @param ROP-NAUT;
     * 		a #$TheResultOfParsing NAUT.
     * @return LISTP; of fully resolved CycL formulas for ROP-NAUT from DICTIONARY.
     */
    @LispMethod(comment = "@param ROP-NAUT;\r\n\t\ta #$TheResultOfParsing NAUT.\r\n@return LISTP; of fully resolved CycL formulas for ROP-NAUT from DICTIONARY.")
    public static final SubLObject maybe_resolve_result_of_parsing_naut_alt(SubLObject rop_naut, SubLObject matrix_span, SubLObject v_dictionary) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject span = parsing_utilities.result_of_parsing_span_wXo_thelist(rop_naut);
                {
                    SubLObject _prev_bind_0 = $resolve_parse_recursion_depth$.currentBinding(thread);
                    try {
                        $resolve_parse_recursion_depth$.bind(span.equal(matrix_span) ? ((SubLObject) (number_utilities.f_1X($resolve_parse_recursion_depth$.getDynamicValue(thread)))) : ZERO_INTEGER, thread);
                        if ($resolve_parse_recursion_depth$.getDynamicValue(thread).numLE($resolve_parse_interpretation_max_depth$.getGlobalValue())) {
                            result = resolve_result_of_parsing_naut(rop_naut, span, v_dictionary);
                        } else {
                            if (NIL != $resolve_parse_recursion_show_warningsP$.getDynamicValue(thread)) {
                                Errors.warn($str_alt4$Exceeded_recursion_depth__S_for_R, $resolve_parse_interpretation_max_depth$.getGlobalValue(), rop_naut);
                            }
                        }
                    } finally {
                        $resolve_parse_recursion_depth$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param ROP-NAUT;
     * 		a #$TheResultOfParsing NAUT.
     * @return LISTP; of fully resolved CycL formulas for ROP-NAUT from DICTIONARY.
     */
    @LispMethod(comment = "@param ROP-NAUT;\r\n\t\ta #$TheResultOfParsing NAUT.\r\n@return LISTP; of fully resolved CycL formulas for ROP-NAUT from DICTIONARY.")
    public static SubLObject maybe_resolve_result_of_parsing_naut(final SubLObject rop_naut, final SubLObject matrix_span, final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject span = parsing_utilities.result_of_parsing_span_wXo_thelist(rop_naut);
        final SubLObject _prev_bind_0 = $resolve_parse_recursion_depth$.currentBinding(thread);
        try {
            $resolve_parse_recursion_depth$.bind(span.equal(matrix_span) ? number_utilities.f_1X($resolve_parse_recursion_depth$.getDynamicValue(thread)) : ZERO_INTEGER, thread);
            if ($resolve_parse_recursion_depth$.getDynamicValue(thread).numLE($resolve_parse_interpretation_max_depth$.getGlobalValue())) {
                result = resolve_result_of_parsing_naut(rop_naut, span, v_dictionary);
            } else
                if (NIL != $resolve_parse_recursion_show_warningsP$.getDynamicValue(thread)) {
                    Errors.warn($str4$Exceeded_recursion_depth__S_for_R, $resolve_parse_interpretation_max_depth$.getGlobalValue(), rop_naut);
                }

        } finally {
            $resolve_parse_recursion_depth$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @param ROP-NAUT;
     * 		a #$TheResultOfParsing NAUT.
     * @return LISTP; of fully resolved CycL formulas for ROP-NAUT from DICTIONARY.
     */
    @LispMethod(comment = "@param ROP-NAUT;\r\n\t\ta #$TheResultOfParsing NAUT.\r\n@return LISTP; of fully resolved CycL formulas for ROP-NAUT from DICTIONARY.")
    public static final SubLObject resolve_result_of_parsing_naut_alt(SubLObject rop_naut, SubLObject span, SubLObject v_dictionary) {
        {
            SubLObject span_parses = dictionary.dictionary_lookup(v_dictionary, span, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = span_parses;
            SubLObject span_parse = NIL;
            for (span_parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , span_parse = cdolist_list_var.first()) {
                if (NIL == cycl_utilities.expression_find(rop_naut, span_parse, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    if (!((NIL != parsing_utilities.result_of_parsing_formulaP(span_parse)) && span.equal(parsing_utilities.result_of_parsing_span_wXo_thelist(span_parse)))) {
                        {
                            SubLObject cdolist_list_var_1 = resolve_parse_interpretation(span_parse, span, v_dictionary);
                            SubLObject resolved_parse = NIL;
                            for (resolved_parse = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , resolved_parse = cdolist_list_var_1.first()) {
                                {
                                    SubLObject item_var = resolved_parse;
                                    if (NIL == member(item_var, result, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        result = cons(item_var, result);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @param ROP-NAUT;
     * 		a #$TheResultOfParsing NAUT.
     * @return LISTP; of fully resolved CycL formulas for ROP-NAUT from DICTIONARY.
     */
    @LispMethod(comment = "@param ROP-NAUT;\r\n\t\ta #$TheResultOfParsing NAUT.\r\n@return LISTP; of fully resolved CycL formulas for ROP-NAUT from DICTIONARY.")
    public static SubLObject resolve_result_of_parsing_naut(final SubLObject rop_naut, final SubLObject span, final SubLObject v_dictionary) {
        final SubLObject span_parses = dictionary.dictionary_lookup(v_dictionary, span, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = span_parses;
        SubLObject span_parse = NIL;
        span_parse = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == cycl_utilities.expression_find(rop_naut, span_parse, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && ((NIL == parsing_utilities.result_of_parsing_formulaP(span_parse)) || (!span.equal(parsing_utilities.result_of_parsing_span_wXo_thelist(span_parse))))) {
                SubLObject cdolist_list_var_$1 = resolve_parse_interpretation(span_parse, span, v_dictionary);
                SubLObject resolved_parse = NIL;
                resolved_parse = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    final SubLObject item_var = resolved_parse;
                    if (NIL == member(item_var, result, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        result = cons(item_var, result);
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    resolved_parse = cdolist_list_var_$1.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            span_parse = cdolist_list_var.first();
        } 
        return result;
    }

    /**
     *
     *
     * @param CYCL;
     * 		a CycL formula that contains, but is not itself, a #$TheResultOfParsing NAUT.
     * @return LISTP; of fully resolved CycL formulas for CYCL from DICTIONARY, made by
    resolving the #$TheResultOfParsing NAUTs inside CYCL.
     */
    @LispMethod(comment = "@param CYCL;\r\n\t\ta CycL formula that contains, but is not itself, a #$TheResultOfParsing NAUT.\r\n@return LISTP; of fully resolved CycL formulas for CYCL from DICTIONARY, made by\r\nresolving the #$TheResultOfParsing NAUTs inside CYCL.")
    public static final SubLObject resolve_parse_interpretation_args_alt(SubLObject cycl, SubLObject span, SubLObject v_dictionary) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject template = rkf_parse_wff_check_template(cycl);
                SubLObject rop_argnums = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject arg_binding_lists = NIL;
                    SubLObject result = NIL;
                    {
                        SubLObject argnum = ZERO_INTEGER;
                        SubLObject args = cycl_utilities.formula_args(cycl, $IGNORE);
                        SubLObject cdolist_list_var = args;
                        SubLObject arg = NIL;
                        for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                            argnum = add(argnum, ONE_INTEGER);
                            if (NIL != subl_promotions.memberP(argnum, rop_argnums, UNPROVIDED, UNPROVIDED)) {
                                {
                                    SubLObject generic_arg = at_utilities.get_generic_arg(argnum);
                                    SubLObject arg_bindings = NIL;
                                    SubLObject cdolist_list_var_2 = resolve_parse_interpretation(arg, span, v_dictionary);
                                    SubLObject interp = NIL;
                                    for (interp = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , interp = cdolist_list_var_2.first()) {
                                        arg_bindings = cons(cons(generic_arg, interp), arg_bindings);
                                    }
                                    arg_binding_lists = cons(arg_bindings, arg_binding_lists);
                                }
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = list_utilities.cartesian_product(arg_binding_lists, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject formula_binding_list = NIL;
                        for (formula_binding_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula_binding_list = cdolist_list_var.first()) {
                            if (NIL != rkf_parse_bindings_wffP(template, formula_binding_list)) {
                                result = cons(rkf_parse_subst_bindings(template, formula_binding_list), result);
                            }
                        }
                    }
                    return result;
                }
            }
        }
    }

    /**
     *
     *
     * @param CYCL;
     * 		a CycL formula that contains, but is not itself, a #$TheResultOfParsing NAUT.
     * @return LISTP; of fully resolved CycL formulas for CYCL from DICTIONARY, made by
    resolving the #$TheResultOfParsing NAUTs inside CYCL.
     */
    @LispMethod(comment = "@param CYCL;\r\n\t\ta CycL formula that contains, but is not itself, a #$TheResultOfParsing NAUT.\r\n@return LISTP; of fully resolved CycL formulas for CYCL from DICTIONARY, made by\r\nresolving the #$TheResultOfParsing NAUTs inside CYCL.")
    public static SubLObject resolve_parse_interpretation_args(final SubLObject cycl, final SubLObject span, final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject template = rkf_parse_wff_check_template(cycl);
        final SubLObject rop_argnums = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject arg_binding_lists = NIL;
        SubLObject result = NIL;
        SubLObject argnum = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(cycl, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            argnum = add(argnum, ONE_INTEGER);
            if (NIL != subl_promotions.memberP(argnum, rop_argnums, UNPROVIDED, UNPROVIDED)) {
                final SubLObject generic_arg = at_utilities.get_generic_arg(argnum);
                SubLObject arg_bindings = NIL;
                SubLObject cdolist_list_var_$2 = resolve_parse_interpretation(arg, span, v_dictionary);
                SubLObject interp = NIL;
                interp = cdolist_list_var_$2.first();
                while (NIL != cdolist_list_var_$2) {
                    arg_bindings = cons(cons(generic_arg, interp), arg_bindings);
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    interp = cdolist_list_var_$2.first();
                } 
                arg_binding_lists = cons(arg_bindings, arg_binding_lists);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        SubLObject cdolist_list_var2 = list_utilities.cartesian_product(arg_binding_lists, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject formula_binding_list = NIL;
        formula_binding_list = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL != rkf_parse_bindings_wffP(template, formula_binding_list)) {
                result = cons(rkf_parse_subst_bindings(template, formula_binding_list), result);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            formula_binding_list = cdolist_list_var2.first();
        } 
        return result;
    }

    public static final SubLObject rkf_parse_bindings_wffP_alt(SubLObject template, SubLObject formula_binding_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject badP = NIL;
                if (parsing_vars.$rkf_template_wff_filter_level$.getDynamicValue(thread).numG(ONE_INTEGER) && (NIL == rbp_wff.rbp_wf_template_argsP(template, formula_binding_list, TWO_INTEGER))) {
                    badP = T;
                } else {
                    if (parsing_vars.$rkf_template_wff_filter_level$.getDynamicValue(thread).numG(ZERO_INTEGER) && (NIL == rbp_wff.rbp_wf_template_argsP(template, formula_binding_list, ONE_INTEGER))) {
                        badP = T;
                    }
                }
                return makeBoolean(NIL == badP);
            }
        }
    }

    public static SubLObject rkf_parse_bindings_wffP(final SubLObject template, final SubLObject formula_binding_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject badP = NIL;
        if (parsing_vars.$rkf_template_wff_filter_level$.getDynamicValue(thread).numG(ONE_INTEGER) && (NIL == rbp_wff.rbp_wf_template_argsP(template, formula_binding_list, TWO_INTEGER))) {
            badP = T;
        } else
            if (parsing_vars.$rkf_template_wff_filter_level$.getDynamicValue(thread).numG(ZERO_INTEGER) && (NIL == rbp_wff.rbp_wf_template_argsP(template, formula_binding_list, ONE_INTEGER))) {
                badP = T;
            }

        return makeBoolean(NIL == badP);
    }

    public static final SubLObject rkf_parse_subst_bindings_alt(SubLObject template, SubLObject formula_binding_list) {
        {
            SubLObject result = copy_expression(template);
            SubLObject cdolist_list_var = formula_binding_list;
            SubLObject cons = NIL;
            for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                {
                    SubLObject datum = cons;
                    SubLObject current = datum;
                    SubLObject out = NIL;
                    SubLObject in = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    out = current.first();
                    current = current.rest();
                    in = current;
                    result = cycl_utilities.expression_nsubst(in, out, result, UNPROVIDED, UNPROVIDED);
                }
            }
            return result;
        }
    }

    public static SubLObject rkf_parse_subst_bindings(final SubLObject template, final SubLObject formula_binding_list) {
        SubLObject result = copy_expression(template);
        SubLObject cdolist_list_var = formula_binding_list;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject out = NIL;
            SubLObject in = NIL;
            destructuring_bind_must_consp(current, datum, $list6);
            out = current.first();
            current = in = current.rest();
            result = cycl_utilities.expression_nsubst(in, out, result, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return result;
    }

    /**
     *
     *
     * @return 0 CycL expression; a copy of CYCL with result-of-parsing args replaced
    with generic args.
     * @return 1 listp; of argnums thus replaced
     */
    @LispMethod(comment = "@return 0 CycL expression; a copy of CYCL with result-of-parsing args replaced\r\nwith generic args.\r\n@return 1 listp; of argnums thus replaced")
    public static final SubLObject rkf_parse_wff_check_template_alt(SubLObject cycl) {
        {
            SubLObject template = copy_expression(cycl);
            SubLObject argnums = NIL;
            if (NIL != el_formula_p(cycl)) {
                {
                    SubLObject argnum = ZERO_INTEGER;
                    SubLObject args = cycl_utilities.formula_args(cycl, $IGNORE);
                    SubLObject cdolist_list_var = args;
                    SubLObject arg = NIL;
                    for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                        argnum = add(argnum, ONE_INTEGER);
                        if (NIL != parsing_utilities.formula_contains_result_of_parsingP(arg)) {
                            {
                                SubLObject var = at_utilities.get_generic_arg(argnum);
                                nreplace_formula_arg(argnum, var, template);
                            }
                            argnums = cons(argnum, argnums);
                        }
                    }
                }
            }
            return values(template, argnums);
        }
    }

    /**
     *
     *
     * @return 0 CycL expression; a copy of CYCL with result-of-parsing args replaced
    with generic args.
     * @return 1 listp; of argnums thus replaced
     */
    @LispMethod(comment = "@return 0 CycL expression; a copy of CYCL with result-of-parsing args replaced\r\nwith generic args.\r\n@return 1 listp; of argnums thus replaced")
    public static SubLObject rkf_parse_wff_check_template(final SubLObject cycl) {
        final SubLObject template = copy_expression(cycl);
        SubLObject argnums = NIL;
        if (NIL != el_formula_p(cycl)) {
            SubLObject argnum = ZERO_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(cycl, $IGNORE);
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                argnum = add(argnum, ONE_INTEGER);
                if (NIL != parsing_utilities.formula_contains_result_of_parsingP(arg)) {
                    final SubLObject var = at_utilities.get_generic_arg(argnum);
                    nreplace_formula_arg(argnum, var, template);
                    argnums = cons(argnum, argnums);
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
        }
        return values(template, argnums);
    }

    public static final SubLObject rkf_textproc_interpret_nlterm_alt(SubLObject nlterm, SubLObject mt) {
        return rkf_uttrdr_interpret_nltagfn_term(nlterm, mt);
    }

    public static SubLObject rkf_textproc_interpret_nlterm(final SubLObject nlterm, final SubLObject mt) {
        return rkf_uttrdr_interpret_nltagfn_term(nlterm, mt);
    }

    public static final SubLObject rkf_textproc_interpret_nlterms_alt(SubLObject nlterms, SubLObject mt) {
        return rkf_uttrdr_interpret_nltagfn_terms(nlterms, mt);
    }

    public static SubLObject rkf_textproc_interpret_nlterms(final SubLObject nlterms, final SubLObject mt) {
        return rkf_uttrdr_interpret_nltagfn_terms(nlterms, mt);
    }

    public static final SubLObject parse_result_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_parse_result(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject parse_result_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_parse_result(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject parse_result_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_text_processors.$parse_result_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject parse_result_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_text_processors.$parse_result_native.class ? T : NIL;
    }

    public static final SubLObject parse_result_original_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PARSE_RESULT_P);
        return v_object.getField2();
    }

    public static SubLObject parse_result_original(final SubLObject v_object) {
        assert NIL != parse_result_p(v_object) : "! rkf_text_processors.parse_result_p(v_object) " + "rkf_text_processors.parse_result_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject parse_result_constituents_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PARSE_RESULT_P);
        return v_object.getField3();
    }

    public static SubLObject parse_result_constituents(final SubLObject v_object) {
        assert NIL != parse_result_p(v_object) : "! rkf_text_processors.parse_result_p(v_object) " + "rkf_text_processors.parse_result_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject parse_result_eliminated_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PARSE_RESULT_P);
        return v_object.getField4();
    }

    public static SubLObject parse_result_eliminated(final SubLObject v_object) {
        assert NIL != parse_result_p(v_object) : "! rkf_text_processors.parse_result_p(v_object) " + "rkf_text_processors.parse_result_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject parse_result_problems_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PARSE_RESULT_P);
        return v_object.getField5();
    }

    public static SubLObject parse_result_problems(final SubLObject v_object) {
        assert NIL != parse_result_p(v_object) : "! rkf_text_processors.parse_result_p(v_object) " + "rkf_text_processors.parse_result_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject parse_result_solutions_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PARSE_RESULT_P);
        return v_object.getField6();
    }

    public static SubLObject parse_result_solutions(final SubLObject v_object) {
        assert NIL != parse_result_p(v_object) : "! rkf_text_processors.parse_result_p(v_object) " + "rkf_text_processors.parse_result_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_parse_result_original_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PARSE_RESULT_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_parse_result_original(final SubLObject v_object, final SubLObject value) {
        assert NIL != parse_result_p(v_object) : "! rkf_text_processors.parse_result_p(v_object) " + "rkf_text_processors.parse_result_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_parse_result_constituents_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PARSE_RESULT_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_parse_result_constituents(final SubLObject v_object, final SubLObject value) {
        assert NIL != parse_result_p(v_object) : "! rkf_text_processors.parse_result_p(v_object) " + "rkf_text_processors.parse_result_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_parse_result_eliminated_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PARSE_RESULT_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_parse_result_eliminated(final SubLObject v_object, final SubLObject value) {
        assert NIL != parse_result_p(v_object) : "! rkf_text_processors.parse_result_p(v_object) " + "rkf_text_processors.parse_result_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_parse_result_problems_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PARSE_RESULT_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_parse_result_problems(final SubLObject v_object, final SubLObject value) {
        assert NIL != parse_result_p(v_object) : "! rkf_text_processors.parse_result_p(v_object) " + "rkf_text_processors.parse_result_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_parse_result_solutions_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PARSE_RESULT_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_parse_result_solutions(final SubLObject v_object, final SubLObject value) {
        assert NIL != parse_result_p(v_object) : "! rkf_text_processors.parse_result_p(v_object) " + "rkf_text_processors.parse_result_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_parse_result_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rkf_text_processors.$parse_result_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ORIGINAL)) {
                        _csetf_parse_result_original(v_new, current_value);
                    } else {
                        if (pcase_var.eql($CONSTITUENTS)) {
                            _csetf_parse_result_constituents(v_new, current_value);
                        } else {
                            if (pcase_var.eql($ELIMINATED)) {
                                _csetf_parse_result_eliminated(v_new, current_value);
                            } else {
                                if (pcase_var.eql($PROBLEMS)) {
                                    _csetf_parse_result_problems(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($SOLUTIONS)) {
                                        _csetf_parse_result_solutions(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt30$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_parse_result(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rkf_text_processors.$parse_result_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ORIGINAL)) {
                _csetf_parse_result_original(v_new, current_value);
            } else
                if (pcase_var.eql($CONSTITUENTS)) {
                    _csetf_parse_result_constituents(v_new, current_value);
                } else
                    if (pcase_var.eql($ELIMINATED)) {
                        _csetf_parse_result_eliminated(v_new, current_value);
                    } else
                        if (pcase_var.eql($PROBLEMS)) {
                            _csetf_parse_result_problems(v_new, current_value);
                        } else
                            if (pcase_var.eql($SOLUTIONS)) {
                                _csetf_parse_result_solutions(v_new, current_value);
                            } else {
                                Errors.error($str31$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_parse_result(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PARSE_RESULT, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ORIGINAL, parse_result_original(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTITUENTS, parse_result_constituents(obj));
        funcall(visitor_fn, obj, $SLOT, $ELIMINATED, parse_result_eliminated(obj));
        funcall(visitor_fn, obj, $SLOT, $PROBLEMS, parse_result_problems(obj));
        funcall(visitor_fn, obj, $SLOT, $SOLUTIONS, parse_result_solutions(obj));
        funcall(visitor_fn, obj, $END, MAKE_PARSE_RESULT, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_parse_result_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_parse_result(obj, visitor_fn);
    }

    public static final SubLObject print_parse_result_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $rkf_textproc_print_parse_result_tersely$.getDynamicValue(thread)) {
                if (NIL != $print_readably$.getDynamicValue(thread)) {
                    print_not_readable(v_object, stream);
                } else {
                    {
                        SubLObject v_object_3 = v_object;
                        SubLObject stream_4 = stream;
                        write_string($str_alt31$__, stream_4, UNPROVIDED, UNPROVIDED);
                        write(type_of(v_object_3), new SubLObject[]{ $STREAM, stream_4 });
                        write_char(CHAR_space, stream_4);
                        write(pointer(v_object_3), new SubLObject[]{ $STREAM, stream_4, $BASE, SIXTEEN_INTEGER });
                        write_char(CHAR_greater, stream_4);
                    }
                }
            } else {
                debug_display_parse_result(v_object, stream);
            }
            return v_object;
        }
    }

    public static SubLObject print_parse_result(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $rkf_textproc_print_parse_result_tersely$.getDynamicValue(thread)) {
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                print_macros.print_unreadable_object_preamble(stream, v_object, T, NIL);
                print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
            }
        } else {
            debug_display_parse_result(v_object, stream);
        }
        return v_object;
    }

    public static final SubLObject with_verbose_rkf_textproc_parse_result_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt34, append(body, NIL));
        }
    }

    public static SubLObject with_verbose_rkf_textproc_parse_result(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list37, append(body, NIL));
    }

    public static final SubLObject new_parse_result_alt(SubLObject parses) {
        {
            SubLObject parse = make_parse_result(UNPROVIDED);
            _csetf_parse_result_original(parse, copy_tree(parses));
            _csetf_parse_result_constituents(parse, dictionary.new_dictionary(EQUALP, UNPROVIDED));
            _csetf_parse_result_eliminated(parse, dictionary.new_dictionary(EQUALP, UNPROVIDED));
            _csetf_parse_result_problems(parse, dictionary.new_dictionary(EQUALP, UNPROVIDED));
            _csetf_parse_result_solutions(parse, dictionary.new_dictionary(EQUALP, UNPROVIDED));
            seed_parse_result_constituents(parse);
            return parse;
        }
    }

    public static SubLObject new_parse_result(final SubLObject parses) {
        final SubLObject parse = make_parse_result(UNPROVIDED);
        _csetf_parse_result_original(parse, copy_tree(parses));
        _csetf_parse_result_constituents(parse, dictionary.new_dictionary(EQUALP, UNPROVIDED));
        _csetf_parse_result_eliminated(parse, dictionary.new_dictionary(EQUALP, UNPROVIDED));
        _csetf_parse_result_problems(parse, dictionary.new_dictionary(EQUALP, UNPROVIDED));
        _csetf_parse_result_solutions(parse, dictionary.new_dictionary(EQUALP, UNPROVIDED));
        seed_parse_result_constituents(parse);
        return parse;
    }

    public static final SubLObject seed_parse_result_constituents_alt(SubLObject parse_result) {
        {
            SubLObject parses = parse_result_original(parse_result);
            SubLObject v_dictionary = parse_result_constituents(parse_result);
            rkf_textproc_parse_to_dictionary(parses, v_dictionary);
        }
        return parse_result;
    }

    public static SubLObject seed_parse_result_constituents(final SubLObject parse_result) {
        final SubLObject parses = parse_result_original(parse_result);
        final SubLObject v_dictionary = parse_result_constituents(parse_result);
        rkf_textproc_parse_to_dictionary(parses, v_dictionary);
        return parse_result;
    }

    public static final SubLObject debug_reset_parse_results_alt(SubLObject parse_result) {
        dictionary.clear_dictionary(parse_result_constituents(parse_result));
        dictionary.clear_dictionary(parse_result_eliminated(parse_result));
        dictionary.clear_dictionary(parse_result_problems(parse_result));
        dictionary.clear_dictionary(parse_result_solutions(parse_result));
        seed_parse_result_constituents(parse_result);
        return parse_result;
    }

    public static SubLObject debug_reset_parse_results(final SubLObject parse_result) {
        dictionary.clear_dictionary(parse_result_constituents(parse_result));
        dictionary.clear_dictionary(parse_result_eliminated(parse_result));
        dictionary.clear_dictionary(parse_result_problems(parse_result));
        dictionary.clear_dictionary(parse_result_solutions(parse_result));
        seed_parse_result_constituents(parse_result);
        return parse_result;
    }

    public static final SubLObject parse_result_emptyP_alt(SubLObject parse_result) {
        SubLTrampolineFile.checkType(parse_result, PARSE_RESULT_P);
        return dictionary.dictionary_empty_p(parse_result_constituents(parse_result));
    }

    public static SubLObject parse_result_emptyP(final SubLObject parse_result) {
        assert NIL != parse_result_p(parse_result) : "! rkf_text_processors.parse_result_p(parse_result) " + ("rkf_text_processors.parse_result_p(parse_result) " + "CommonSymbols.NIL != rkf_text_processors.parse_result_p(parse_result) ") + parse_result;
        return dictionary.dictionary_empty_p(parse_result_constituents(parse_result));
    }

    public static final SubLObject parse_result_open_issuesP_alt(SubLObject parse_result) {
        SubLTrampolineFile.checkType(parse_result, PARSE_RESULT_P);
        return makeBoolean(NIL == dictionary.dictionary_empty_p(parse_result_problems(parse_result)));
    }

    public static SubLObject parse_result_open_issuesP(final SubLObject parse_result) {
        assert NIL != parse_result_p(parse_result) : "! rkf_text_processors.parse_result_p(parse_result) " + ("rkf_text_processors.parse_result_p(parse_result) " + "CommonSymbols.NIL != rkf_text_processors.parse_result_p(parse_result) ") + parse_result;
        return makeBoolean(NIL == dictionary.dictionary_empty_p(parse_result_problems(parse_result)));
    }

    public static final SubLObject parse_result_known_solutionsP_alt(SubLObject parse_result) {
        SubLTrampolineFile.checkType(parse_result, PARSE_RESULT_P);
        return makeBoolean(NIL == dictionary.dictionary_empty_p(parse_result_solutions(parse_result)));
    }

    public static SubLObject parse_result_known_solutionsP(final SubLObject parse_result) {
        assert NIL != parse_result_p(parse_result) : "! rkf_text_processors.parse_result_p(parse_result) " + ("rkf_text_processors.parse_result_p(parse_result) " + "CommonSymbols.NIL != rkf_text_processors.parse_result_p(parse_result) ") + parse_result;
        return makeBoolean(NIL == dictionary.dictionary_empty_p(parse_result_solutions(parse_result)));
    }

    public static final SubLObject parse_result_known_constituentP_alt(SubLObject parse_result, SubLObject span) {
        {
            SubLObject parse_span = span;
            if (parse_span.first() == $$TheList) {
                parse_span = parse_span.rest();
            }
            return dictionary.dictionary_lookup(parse_result_constituents(parse_result), parse_span, UNPROVIDED);
        }
    }

    public static SubLObject parse_result_known_constituentP(final SubLObject parse_result, final SubLObject span) {
        SubLObject parse_span = span;
        if (parse_span.first().eql($$TheList)) {
            parse_span = parse_span.rest();
        }
        return dictionary.dictionary_lookup(parse_result_constituents(parse_result), parse_span, UNPROVIDED);
    }

    public static final SubLObject debug_display_parse_result_alt(SubLObject parse_result, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str_alt36$__Original______S__, parse_result_original(parse_result));
        debug_display_one_parts_dictionary(parse_result_constituents(parse_result), $$$Constituents, UNPROVIDED);
        debug_display_one_parts_dictionary(parse_result_eliminated(parse_result), $$$Eliminations, UNPROVIDED);
        debug_display_one_parts_dictionary(parse_result_problems(parse_result), $$$Open_Issues, UNPROVIDED);
        debug_display_one_parts_dictionary(parse_result_solutions(parse_result), $$$Issue_Resolutions, UNPROVIDED);
        return parse_result;
    }

    public static SubLObject debug_display_parse_result(final SubLObject parse_result, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str39$__Original______S__, parse_result_original(parse_result));
        debug_display_one_parts_dictionary(parse_result_constituents(parse_result), $$$Constituents, UNPROVIDED);
        debug_display_one_parts_dictionary(parse_result_eliminated(parse_result), $$$Eliminations, UNPROVIDED);
        debug_display_one_parts_dictionary(parse_result_problems(parse_result), $$$Open_Issues, UNPROVIDED);
        debug_display_one_parts_dictionary(parse_result_solutions(parse_result), $$$Issue_Resolutions, UNPROVIDED);
        return parse_result;
    }

    public static final SubLObject debug_display_one_parts_dictionary_alt(SubLObject v_dictionary, SubLObject name, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            format(stream, $str_alt41$___A___, name);
            if (NIL != dictionary.dictionary_empty_p(v_dictionary)) {
                format(stream, $str_alt42$__none____);
                return v_dictionary;
            }
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject interpretations = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        format(stream, $str_alt43$___S______S____, span, interpretations);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return v_dictionary;
        }
    }

    public static SubLObject debug_display_one_parts_dictionary(final SubLObject v_dictionary, final SubLObject name, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(stream, $str44$___A___, name);
        if (NIL != dictionary.dictionary_empty_p(v_dictionary)) {
            format(stream, $str45$__none____);
            return v_dictionary;
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject interpretations = thread.secondMultipleValue();
            thread.resetMultipleValues();
            format(stream, $str46$___S______S____, span, interpretations);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return v_dictionary;
    }

    /**
     * destined to become obsolete once the reformulator is integrated into this system
     */
    @LispMethod(comment = "destined to become obsolete once the reformulator is integrated into this system")
    public static final SubLObject without_nltags_returned_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt44, append(body, NIL));
        }
    }

    /**
     * destined to become obsolete once the reformulator is integrated into this system
     */
    @LispMethod(comment = "destined to become obsolete once the reformulator is integrated into this system")
    public static SubLObject without_nltags_returned(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list47, append(body, NIL));
    }

    public static final SubLObject rkf_uttrdr_are_nltags_allowedP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $rkf_uttrdr_allow_nltagsP$.getDynamicValue(thread);
        }
    }

    public static SubLObject rkf_uttrdr_are_nltags_allowedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $rkf_uttrdr_allow_nltagsP$.getDynamicValue(thread);
    }

    public static final SubLObject with_full_spans_only_returned_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt45, append(body, NIL));
        }
    }

    public static SubLObject with_full_spans_only_returned(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list48, append(body, NIL));
    }

    public static final SubLObject with_subspans_returned_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt46, append(body, NIL));
        }
    }

    public static SubLObject with_subspans_returned(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list49, append(body, NIL));
    }

    public static final SubLObject rkf_uttrdr_full_spans_onlyP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $rkf_uttrdr_full_spans_onlyP$.getDynamicValue(thread);
        }
    }

    public static SubLObject rkf_uttrdr_full_spans_onlyP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $rkf_uttrdr_full_spans_onlyP$.getDynamicValue(thread);
    }

    public static final SubLObject rkf_utterance_reader_alt(SubLObject text, SubLObject category, SubLObject parsing_mt, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject parses = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$exclude_vulgaritiesP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = lexicon_vars.$exclude_slangP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = lexicon_vars.$exclude_archaic_speechP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = parsing_vars.$variable_uniquification_store$.currentBinding(thread);
                    try {
                        lexicon_vars.$exclude_vulgaritiesP$.bind(T, thread);
                        lexicon_vars.$exclude_slangP$.bind(T, thread);
                        lexicon_vars.$exclude_archaic_speechP$.bind(T, thread);
                        parsing_vars.$variable_uniquification_store$.bind(dictionary.new_dictionary(EQUALP, UNPROVIDED), thread);
                        parses = rkf_uttrdr_perform_parsing(text, category, parsing_mt, domain_mt);
                    } finally {
                        parsing_vars.$variable_uniquification_store$.rebind(_prev_bind_3, thread);
                        lexicon_vars.$exclude_archaic_speechP$.rebind(_prev_bind_2, thread);
                        lexicon_vars.$exclude_slangP$.rebind(_prev_bind_1, thread);
                        lexicon_vars.$exclude_vulgaritiesP$.rebind(_prev_bind_0, thread);
                    }
                }
                if ((NIL != rkf_formula_optimizer.$rkf_late_pronoun_substitutionP$.getDynamicValue(thread)) && (NIL != rkf_formula_optimizer.$rkf_reformulator_replace_pronounsP$.getDynamicValue(thread))) {
                    parses = rkf_uttrdr_replace_pronouns(parses);
                }
                return parses;
            }
        }
    }

    public static SubLObject rkf_utterance_reader(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parses = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$exclude_vulgaritiesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = lexicon_vars.$exclude_slangP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = lexicon_vars.$exclude_archaic_speechP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = parsing_vars.$variable_uniquification_store$.currentBinding(thread);
        try {
            lexicon_vars.$exclude_vulgaritiesP$.bind(T, thread);
            lexicon_vars.$exclude_slangP$.bind(T, thread);
            lexicon_vars.$exclude_archaic_speechP$.bind(T, thread);
            parsing_vars.$variable_uniquification_store$.bind(dictionary.new_dictionary(EQUALP, UNPROVIDED), thread);
            parses = rkf_uttrdr_perform_parsing(text, category, parsing_mt, domain_mt);
        } finally {
            parsing_vars.$variable_uniquification_store$.rebind(_prev_bind_4, thread);
            lexicon_vars.$exclude_archaic_speechP$.rebind(_prev_bind_3, thread);
            lexicon_vars.$exclude_slangP$.rebind(_prev_bind_2, thread);
            lexicon_vars.$exclude_vulgaritiesP$.rebind(_prev_bind_0, thread);
        }
        if ((NIL != rkf_formula_optimizer.$rkf_late_pronoun_substitutionP$.getDynamicValue(thread)) && (NIL != rkf_formula_optimizer.$rkf_reformulator_replace_pronounsP$.getDynamicValue(thread))) {
            parses = rkf_uttrdr_replace_pronouns(parses);
        }
        return parses;
    }

    /**
     *
     *
     * @unknown this should really iterate through all the parses and do the replacement on the cycls of each one, then build the structure back up
     */
    @LispMethod(comment = "@unknown this should really iterate through all the parses and do the replacement on the cycls of each one, then build the structure back up")
    public static final SubLObject rkf_uttrdr_replace_pronouns_alt(SubLObject parses) {
        return rkf_formula_optimizer.replace_pronouns_in_cycl(parses);
    }

    /**
     *
     *
     * @unknown this should really iterate through all the parses and do the replacement on the cycls of each one, then build the structure back up
     */
    @LispMethod(comment = "@unknown this should really iterate through all the parses and do the replacement on the cycls of each one, then build the structure back up")
    public static SubLObject rkf_uttrdr_replace_pronouns(final SubLObject parses) {
        return rkf_formula_optimizer.replace_pronouns_in_cycl(parses);
    }

    public static final SubLObject rkf_imperative_reader_alt(SubLObject text, SubLObject parsing_mt, SubLObject domain_mt) {
        {
            SubLObject result = rkf_utterance_reader(text, $$ImperativeTemplate, parsing_mt, domain_mt);
            rkf_store_rtp_parses_in_pipeline(text, result, parsing_mt, $$STemplate);
            return result;
        }
    }

    public static SubLObject rkf_imperative_reader(final SubLObject text, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLObject result = rkf_utterance_reader(text, $$ImperativeTemplate, parsing_mt, domain_mt);
        return result;
    }

    public static final SubLObject rkf_sentence_reader_alt(SubLObject text, SubLObject parsing_mt, SubLObject domain_mt) {
        {
            SubLObject result = rkf_utterance_reader(text, $$STemplate, parsing_mt, domain_mt);
            rkf_store_rtp_parses_in_pipeline(text, result, parsing_mt, $$STemplate);
            return result;
        }
    }

    public static SubLObject rkf_sentence_reader(final SubLObject text, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLObject result = rkf_utterance_reader(text, $$STemplate, parsing_mt, domain_mt);
        return result;
    }

    public static final SubLObject rkf_question_reader_alt(SubLObject text, SubLObject parsing_mt, SubLObject domain_mt) {
        {
            SubLObject result = rkf_utterance_reader(text, $$QuestionTemplate, parsing_mt, domain_mt);
            rkf_store_rtp_parses_in_pipeline(text, result, parsing_mt, $$STemplate);
            return result;
        }
    }

    public static SubLObject rkf_question_reader(final SubLObject text, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLObject result = rkf_utterance_reader(text, $$QuestionTemplate, parsing_mt, domain_mt);
        return result;
    }

    /**
     * Store RESULT in the parsing pipeline.
     *
     * @unknown - Uses a separate thread, because the RKF readers don't need to wait for this
    to finish.
     */
    @LispMethod(comment = "Store RESULT in the parsing pipeline.\r\n\r\n@unknown - Uses a separate thread, because the RKF readers don\'t need to wait for this\r\nto finish.")
    public static final SubLObject rkf_store_rtp_parses_in_pipeline_alt(SubLObject text, SubLObject result, SubLObject parsing_mt, SubLObject template) {
        subl_promotions.make_process_with_args($$$Parsing_Pipeline, STORE_RTP_PARSES_IN_PIPELINE, list(text, result, parsing_mt, template, $$CycRecursiveTemplateParser));
        return $FORKED;
    }

    /**
     * Store RESULT in the parsing pipeline.
     *
     * @unknown - Uses a separate thread, because the RKF readers don't need to wait for this
    to finish.
     */
    @LispMethod(comment = "Store RESULT in the parsing pipeline.\r\n\r\n@unknown - Uses a separate thread, because the RKF readers don\'t need to wait for this\r\nto finish.")
    public static SubLObject rkf_store_rtp_parses_in_pipeline(final SubLObject text, final SubLObject result, final SubLObject parsing_mt, final SubLObject template) {
        subl_promotions.make_process_with_args($$$Parsing_Pipeline, STORE_RTP_PARSES_IN_PIPELINE, list(text, result, parsing_mt, template, $$CycRecursiveTemplateParser));
        return $FORKED;
    }

    public static final SubLObject rkf_phrase_reader_alt(SubLObject text, SubLObject parsing_mt, SubLObject domain_mt, SubLObject parse_templates) {
        if (parse_templates == UNPROVIDED) {
            parse_templates = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == parse_templates) {
                parse_templates = $rkf_term_reader_default_templates$.getGlobalValue();
            }
            {
                SubLObject results = NIL;
                {
                    SubLObject _prev_bind_0 = parsing_vars.$parsing_domain_mt$.currentBinding(thread);
                    try {
                        parsing_vars.$parsing_domain_mt$.bind(domain_mt, thread);
                        {
                            SubLObject cdolist_list_var = parse_templates;
                            SubLObject parse_template = NIL;
                            for (parse_template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse_template = cdolist_list_var.first()) {
                                results = rkf_uttrdr_merge_parse_results(results, rkf_utterance_reader(text, parse_template, parsing_mt, domain_mt));
                            }
                        }
                    } finally {
                        parsing_vars.$parsing_domain_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != rkf_uttrdr_full_spans_onlyP()) {
                    results = rkf_uttrdr_remove_sub_parses(results, text);
                }
                return results;
            }
        }
    }

    public static SubLObject rkf_phrase_reader(final SubLObject text, final SubLObject parsing_mt, final SubLObject domain_mt, SubLObject parse_templates) {
        if (parse_templates == UNPROVIDED) {
            parse_templates = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == parse_templates) {
            parse_templates = $rkf_term_reader_default_templates$.getGlobalValue();
        }
        SubLObject results = NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$parsing_domain_mt$.currentBinding(thread);
        try {
            parsing_vars.$parsing_domain_mt$.bind(domain_mt, thread);
            SubLObject cdolist_list_var = parse_templates;
            SubLObject parse_template = NIL;
            parse_template = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                results = rkf_uttrdr_merge_parse_results(results, rkf_utterance_reader(text, parse_template, parsing_mt, domain_mt));
                cdolist_list_var = cdolist_list_var.rest();
                parse_template = cdolist_list_var.first();
            } 
        } finally {
            parsing_vars.$parsing_domain_mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL != rkf_uttrdr_full_spans_onlyP()) {
            results = rkf_uttrdr_remove_sub_parses(results, text);
        }
        return results;
    }

    public static final SubLObject rkf_uttrdr_maybe_initialize_arg_type_template_categories_alt() {
        if (NIL == dictionary.dictionary_p($rkf_uttrdr_arg_type_to_template_categories$.getGlobalValue())) {
            rkf_uttrdr_initialize_arg_type_template_categories();
        }
        return $rkf_uttrdr_arg_type_to_template_categories$.getGlobalValue();
    }

    public static SubLObject rkf_uttrdr_maybe_initialize_arg_type_template_categories() {
        if (NIL == dictionary.dictionary_p($rkf_uttrdr_arg_type_to_template_categories$.getGlobalValue())) {
            rkf_uttrdr_initialize_arg_type_template_categories();
        }
        return $rkf_uttrdr_arg_type_to_template_categories$.getGlobalValue();
    }

    public static final SubLObject rkf_uttrdr_initialize_arg_type_template_categories_alt() {
        $rkf_uttrdr_arg_type_to_template_categories$.setGlobalValue(dictionary.new_dictionary(EQUALP, UNPROVIDED));
        {
            SubLObject cdolist_list_var = $rkf_term_reader_cycl_template_mappings$.getGlobalValue();
            SubLObject mapping = NIL;
            for (mapping = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mapping = cdolist_list_var.first()) {
                dictionary.dictionary_enter($rkf_uttrdr_arg_type_to_template_categories$.getGlobalValue(), mapping.first(), mapping.rest());
            }
        }
        return $rkf_uttrdr_arg_type_to_template_categories$.getGlobalValue();
    }

    public static SubLObject rkf_uttrdr_initialize_arg_type_template_categories() {
        $rkf_uttrdr_arg_type_to_template_categories$.setGlobalValue(dictionary.new_dictionary(EQUALP, UNPROVIDED));
        SubLObject cdolist_list_var = $rkf_term_reader_cycl_template_mappings$.getGlobalValue();
        SubLObject mapping = NIL;
        mapping = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dictionary.dictionary_enter($rkf_uttrdr_arg_type_to_template_categories$.getGlobalValue(), mapping.first(), mapping.rest());
            cdolist_list_var = cdolist_list_var.rest();
            mapping = cdolist_list_var.first();
        } 
        return $rkf_uttrdr_arg_type_to_template_categories$.getGlobalValue();
    }

    /**
     *
     *
     * @param ARG-TYPE
     * 		a single CycL term (the argIsa that's know for an argument-slot)
     * @return list; a list of template-categories that might be useful in searching for a term of type ARG-TYPE
     */
    @LispMethod(comment = "@param ARG-TYPE\r\n\t\ta single CycL term (the argIsa that\'s know for an argument-slot)\r\n@return list; a list of template-categories that might be useful in searching for a term of type ARG-TYPE")
    public static final SubLObject rkf_uttrdr_templates_for_arg_type_alt(SubLObject v_arg_type, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg_type_spec_set = NIL;
                SubLObject result_template_types = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        arg_type_spec_set = set_utilities.construct_set_from_list(genls.all_genls(v_arg_type, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                rkf_uttrdr_maybe_initialize_arg_type_template_categories();
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($rkf_uttrdr_arg_type_to_template_categories$.getGlobalValue()));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject v_arg_type_5 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject template_cats = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != set.set_memberP(v_arg_type_5, arg_type_spec_set)) {
                                {
                                    SubLObject cdolist_list_var = template_cats;
                                    SubLObject template_cat = NIL;
                                    for (template_cat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_cat = cdolist_list_var.first()) {
                                        {
                                            SubLObject item_var = template_cat;
                                            if (NIL == member(item_var, result_template_types, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                result_template_types = cons(item_var, result_template_types);
                                            }
                                        }
                                    }
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                if (NIL == result_template_types) {
                    result_template_types = $rkf_term_reader_default_templates$.getGlobalValue();
                }
                return result_template_types;
            }
        }
    }

    /**
     *
     *
     * @param ARG-TYPE
     * 		a single CycL term (the argIsa that's know for an argument-slot)
     * @return list; a list of template-categories that might be useful in searching for a term of type ARG-TYPE
     */
    @LispMethod(comment = "@param ARG-TYPE\r\n\t\ta single CycL term (the argIsa that\'s know for an argument-slot)\r\n@return list; a list of template-categories that might be useful in searching for a term of type ARG-TYPE")
    public static SubLObject rkf_uttrdr_templates_for_arg_type(final SubLObject v_arg_type, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg_type_spec_set = NIL;
        SubLObject result_template_types = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            arg_type_spec_set = set_utilities.construct_set_from_list(genls.all_genls(v_arg_type, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        rkf_uttrdr_maybe_initialize_arg_type_template_categories();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($rkf_uttrdr_arg_type_to_template_categories$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject v_arg_type_$3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject template_cats = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != set.set_memberP(v_arg_type_$3, arg_type_spec_set)) {
                SubLObject cdolist_list_var = template_cats;
                SubLObject template_cat = NIL;
                template_cat = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject item_var = template_cat;
                    if (NIL == member(item_var, result_template_types, symbol_function(EQL), symbol_function(IDENTITY))) {
                        result_template_types = cons(item_var, result_template_types);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    template_cat = cdolist_list_var.first();
                } 
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if (NIL == result_template_types) {
            result_template_types = $rkf_term_reader_default_templates$.getGlobalValue();
        }
        return result_template_types;
    }

    public static final SubLObject rkf_uttrdr_remove_sub_parses_alt(SubLObject parses, SubLObject text_string) {
        {
            SubLObject span_iterator = rtp_iterators.new_itp_result_iterator(parses, UNPROVIDED, UNPROVIDED);
            SubLObject string_length = length(rkf_concept_harvester.rkf_ch_string_tokenize(text_string));
            SubLObject top_level_span = parsing_utilities.token_list_from_span(ZERO_INTEGER, string_length);
            SubLObject result = NIL;
            SubLObject parse_iterator = NIL;
            while (NIL == rtp_iterators.itp_result_iterator_doneP(span_iterator)) {
                parse_iterator = rtp_iterators.itp_result_iterator_curr(span_iterator);
                if (top_level_span.equal(rtp_iterators.itp_section_iterator_span(parse_iterator))) {
                    result = cons(list(rtp_iterators.itp_section_iterator_span(parse_iterator), rtp_iterators.itp_section_iterator_section(parse_iterator)), result);
                }
                rtp_iterators.itp_result_iterator_next(span_iterator);
            } 
            return result;
        }
    }

    public static SubLObject rkf_uttrdr_remove_sub_parses(final SubLObject parses, final SubLObject text_string) {
        final SubLObject span_iterator = rtp_iterators.new_itp_result_iterator(parses, UNPROVIDED, UNPROVIDED);
        final SubLObject string_length = length(rkf_concept_harvester.rkf_ch_string_tokenize(text_string));
        final SubLObject top_level_span = parsing_utilities.token_list_from_span(ZERO_INTEGER, string_length);
        SubLObject result = NIL;
        SubLObject parse_iterator = NIL;
        while (NIL == rtp_iterators.itp_result_iterator_doneP(span_iterator)) {
            parse_iterator = rtp_iterators.itp_result_iterator_curr(span_iterator);
            if (top_level_span.equal(rtp_iterators.itp_section_iterator_span(parse_iterator))) {
                result = cons(list(rtp_iterators.itp_section_iterator_span(parse_iterator), rtp_iterators.itp_section_iterator_section(parse_iterator)), result);
            }
            rtp_iterators.itp_result_iterator_next(span_iterator);
        } 
        return result;
    }

    public static final SubLObject with_parsers_ordered_by_quality_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt57, append(body, NIL));
        }
    }

    public static SubLObject with_parsers_ordered_by_quality(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list60, append(body, NIL));
    }

    public static final SubLObject template_category_from_parse_spec_alt(SubLObject parse_spec, SubLObject parsing_mt) {
        if (NIL == parse_spec) {
            return $rkf_term_reader_default_templates$.getGlobalValue();
        } else {
            if (NIL != rtp_type_checkers.rtp_template_categoryP(parse_spec, parsing_mt)) {
                return list(parse_spec);
            } else {
                return rkf_uttrdr_templates_for_arg_type(parse_spec, parsing_mt);
            }
        }
    }

    public static SubLObject template_category_from_parse_spec(final SubLObject parse_spec, final SubLObject parsing_mt) {
        if (NIL == parse_spec) {
            return $rkf_term_reader_default_templates$.getGlobalValue();
        }
        if (NIL != rtp_type_checkers.rtp_template_categoryP(parse_spec, parsing_mt)) {
            return list(parse_spec);
        }
        return rkf_uttrdr_templates_for_arg_type(parse_spec, parsing_mt);
    }

    /**
     *
     *
     * @param PARSE-SPECIFICATION
     * 		either a template category or an isa for what the term should be
     * 		in cases where PARSE-SPECIFICATION is an arg-constraint, that arg-constraint will be
     * 		used to determine what template category should be used during parsing, but that constraint
     * 		will not be used to filter outputs
     */
    @LispMethod(comment = "@param PARSE-SPECIFICATION\r\n\t\teither a template category or an isa for what the term should be\r\n\t\tin cases where PARSE-SPECIFICATION is an arg-constraint, that arg-constraint will be\r\n\t\tused to determine what template category should be used during parsing, but that constraint\r\n\t\twill not be used to filter outputs")
    public static final SubLObject rkf_term_reader_alt(SubLObject text, SubLObject parsing_mt, SubLObject domain_mt, SubLObject parse_specification) {
        if (parse_specification == UNPROVIDED) {
            parse_specification = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject template_categories = template_category_from_parse_spec(parse_specification, parsing_mt);
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $rkf_uttrdr_full_spans_onlyP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $rkf_text_proc_resolve_parses$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $rkf_uttrdr_allow_nltagsP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $pmg_ordering$.currentBinding(thread);
                    try {
                        $rkf_uttrdr_full_spans_onlyP$.bind(T, thread);
                        $rkf_text_proc_resolve_parses$.bind(T, thread);
                        $rkf_uttrdr_allow_nltagsP$.bind(NIL, thread);
                        $pmg_ordering$.bind($QUALITY, thread);
                        result = rkf_phrase_reader(text, parsing_mt, domain_mt, template_categories);
                    } finally {
                        $pmg_ordering$.rebind(_prev_bind_3, thread);
                        $rkf_uttrdr_allow_nltagsP$.rebind(_prev_bind_2, thread);
                        $rkf_text_proc_resolve_parses$.rebind(_prev_bind_1, thread);
                        $rkf_uttrdr_full_spans_onlyP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param PARSE-SPECIFICATION
     * 		either a template category or an isa for what the term should be
     * 		in cases where PARSE-SPECIFICATION is an arg-constraint, that arg-constraint will be
     * 		used to determine what template category should be used during parsing, but that constraint
     * 		will not be used to filter outputs
     */
    @LispMethod(comment = "@param PARSE-SPECIFICATION\r\n\t\teither a template category or an isa for what the term should be\r\n\t\tin cases where PARSE-SPECIFICATION is an arg-constraint, that arg-constraint will be\r\n\t\tused to determine what template category should be used during parsing, but that constraint\r\n\t\twill not be used to filter outputs")
    public static SubLObject rkf_term_reader(final SubLObject text, final SubLObject parsing_mt, final SubLObject domain_mt, SubLObject parse_specification) {
        if (parse_specification == UNPROVIDED) {
            parse_specification = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template_categories = template_category_from_parse_spec(parse_specification, parsing_mt);
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $rkf_uttrdr_full_spans_onlyP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $rkf_text_proc_resolve_parses$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $rkf_uttrdr_allow_nltagsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $pmg_ordering$.currentBinding(thread);
        try {
            $rkf_uttrdr_full_spans_onlyP$.bind(T, thread);
            $rkf_text_proc_resolve_parses$.bind(T, thread);
            $rkf_uttrdr_allow_nltagsP$.bind(NIL, thread);
            $pmg_ordering$.bind($QUALITY, thread);
            result = rkf_phrase_reader(text, parsing_mt, domain_mt, template_categories);
        } finally {
            $pmg_ordering$.rebind(_prev_bind_4, thread);
            $rkf_uttrdr_allow_nltagsP$.rebind(_prev_bind_3, thread);
            $rkf_text_proc_resolve_parses$.rebind(_prev_bind_2, thread);
            $rkf_uttrdr_full_spans_onlyP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject rkf_term_in_sentence_reader_alt(SubLObject text, SubLObject parsing_mt, SubLObject domain_mt, SubLObject parse_specification) {
        if (parse_specification == UNPROVIDED) {
            parse_specification = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject template_categories = template_category_from_parse_spec(parse_specification, parsing_mt);
                {
                    SubLObject _prev_bind_0 = $rkf_uttrdr_full_spans_onlyP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $rkf_text_proc_resolve_parses$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $pmg_ordering$.currentBinding(thread);
                    try {
                        $rkf_uttrdr_full_spans_onlyP$.bind(T, thread);
                        $rkf_text_proc_resolve_parses$.bind(T, thread);
                        $pmg_ordering$.bind($QUALITY, thread);
                        result = rkf_phrase_reader(text, parsing_mt, domain_mt, template_categories);
                    } finally {
                        $pmg_ordering$.rebind(_prev_bind_2, thread);
                        $rkf_text_proc_resolve_parses$.rebind(_prev_bind_1, thread);
                        $rkf_uttrdr_full_spans_onlyP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject rkf_term_in_sentence_reader(final SubLObject text, final SubLObject parsing_mt, final SubLObject domain_mt, SubLObject parse_specification) {
        if (parse_specification == UNPROVIDED) {
            parse_specification = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject template_categories = template_category_from_parse_spec(parse_specification, parsing_mt);
        final SubLObject _prev_bind_0 = $rkf_uttrdr_full_spans_onlyP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $rkf_text_proc_resolve_parses$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $pmg_ordering$.currentBinding(thread);
        try {
            $rkf_uttrdr_full_spans_onlyP$.bind(T, thread);
            $rkf_text_proc_resolve_parses$.bind(T, thread);
            $pmg_ordering$.bind($QUALITY, thread);
            result = rkf_phrase_reader(text, parsing_mt, domain_mt, template_categories);
        } finally {
            $pmg_ordering$.rebind(_prev_bind_3, thread);
            $rkf_text_proc_resolve_parses$.rebind(_prev_bind_2, thread);
            $rkf_uttrdr_full_spans_onlyP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject rkf_assertion_reader_alt(SubLObject text, SubLObject parsing_mt, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $rkf_uttrdr_allow_nltagsP$.currentBinding(thread);
                    try {
                        $rkf_uttrdr_allow_nltagsP$.bind(NIL, thread);
                        result = rkf_sentence_reader(text, parsing_mt, domain_mt);
                    } finally {
                        $rkf_uttrdr_allow_nltagsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject rkf_assertion_reader(final SubLObject text, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $rkf_uttrdr_allow_nltagsP$.currentBinding(thread);
        try {
            $rkf_uttrdr_allow_nltagsP$.bind(NIL, thread);
            result = rkf_sentence_reader(text, parsing_mt, domain_mt);
        } finally {
            $rkf_uttrdr_allow_nltagsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject rkf_query_reader_alt(SubLObject text, SubLObject parsing_mt, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $rkf_uttrdr_allow_nltagsP$.currentBinding(thread);
                    try {
                        $rkf_uttrdr_allow_nltagsP$.bind(NIL, thread);
                        result = rkf_question_reader(text, parsing_mt, domain_mt);
                    } finally {
                        $rkf_uttrdr_allow_nltagsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject rkf_query_reader(final SubLObject text, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $rkf_uttrdr_allow_nltagsP$.currentBinding(thread);
        try {
            $rkf_uttrdr_allow_nltagsP$.bind(NIL, thread);
            result = rkf_question_reader(text, parsing_mt, domain_mt);
        } finally {
            $rkf_uttrdr_allow_nltagsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject rkf_scenario_reader_alt(SubLObject text, SubLObject parsing_mt, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $rkf_uttrdr_allow_nltagsP$.currentBinding(thread);
                    try {
                        $rkf_uttrdr_allow_nltagsP$.bind(NIL, thread);
                        result = rkf_utterance_reader(text, $$ScenarioTemplate, parsing_mt, domain_mt);
                    } finally {
                        $rkf_uttrdr_allow_nltagsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject rkf_scenario_reader(final SubLObject text, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $rkf_uttrdr_allow_nltagsP$.currentBinding(thread);
        try {
            $rkf_uttrdr_allow_nltagsP$.bind(NIL, thread);
            result = rkf_utterance_reader(text, $$ScenarioTemplate, parsing_mt, domain_mt);
        } finally {
            $rkf_uttrdr_allow_nltagsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @unknown pace
     */
    @LispMethod(comment = "@unknown pace")
    public static final SubLObject rkf_parse_date_unambiguously_from_string_alt(SubLObject string) {
        {
            SubLObject result = NIL;
            result = find_if($sym60$TIME_INTERVAL_, simple_rkf_date_reader(string, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return result;
        }
    }

    /**
     *
     *
     * @unknown pace
     */
    @LispMethod(comment = "@unknown pace")
    public static SubLObject rkf_parse_date_unambiguously_from_string(final SubLObject string) {
        SubLObject result = NIL;
        result = find_if($sym63$TIME_INTERVAL_, simple_rkf_date_reader(string, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }

    /**
     *
     *
     * @param TEXT
    string
     * 		
     * @param PARSING-MT
    microtheory
     * 		
     * @param DOMAIN-MT
    microtheory
     * 		
     * @return list; a list of dates that can be parsed from TEXT
     */
    @LispMethod(comment = "@param TEXT\nstring\r\n\t\t\r\n@param PARSING-MT\nmicrotheory\r\n\t\t\r\n@param DOMAIN-MT\nmicrotheory\r\n\t\t\r\n@return list; a list of dates that can be parsed from TEXT")
    public static final SubLObject simple_rkf_date_reader_alt(SubLObject text, SubLObject parsing_mt, SubLObject domain_mt) {
        if (parsing_mt == UNPROVIDED) {
            parsing_mt = $$RKFParsingMt;
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = $$RKFParsingMt;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $rkf_text_proc_resolve_parses$.currentBinding(thread);
                    try {
                        $rkf_text_proc_resolve_parses$.bind(T, thread);
                        result = top_level_parses(rkf_date_reader(text, parsing_mt, domain_mt));
                    } finally {
                        $rkf_text_proc_resolve_parses$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param TEXT
    string
     * 		
     * @param PARSING-MT
    microtheory
     * 		
     * @param DOMAIN-MT
    microtheory
     * 		
     * @return list; a list of dates that can be parsed from TEXT
     */
    @LispMethod(comment = "@param TEXT\nstring\r\n\t\t\r\n@param PARSING-MT\nmicrotheory\r\n\t\t\r\n@param DOMAIN-MT\nmicrotheory\r\n\t\t\r\n@return list; a list of dates that can be parsed from TEXT")
    public static SubLObject simple_rkf_date_reader(final SubLObject text, SubLObject parsing_mt, SubLObject domain_mt) {
        if (parsing_mt == UNPROVIDED) {
            parsing_mt = $$RKFParsingMt;
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = $$RKFParsingMt;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $rkf_text_proc_resolve_parses$.currentBinding(thread);
        try {
            $rkf_text_proc_resolve_parses$.bind(T, thread);
            result = top_level_parses(rkf_date_reader(text, parsing_mt, domain_mt));
        } finally {
            $rkf_text_proc_resolve_parses$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject rkf_date_reader_alt(SubLObject text, SubLObject parsing_mt, SubLObject domain_mt) {
        return rkf_term_reader(text, parsing_mt, domain_mt, $$DateTemplate);
    }

    public static SubLObject rkf_date_reader(final SubLObject text, final SubLObject parsing_mt, final SubLObject domain_mt) {
        return rkf_term_reader(text, parsing_mt, domain_mt, $$DateTemplate);
    }

    public static final SubLObject rkf_text_processor_reset_caches_alt() {
        return $DONE;
    }

    public static SubLObject rkf_text_processor_reset_caches() {
        return $DONE;
    }

    /**
     * Harvest as many chunks as you can obtain.
     */
    @LispMethod(comment = "Harvest as many chunks as you can obtain.")
    public static final SubLObject rkf_terms_forager_alt(SubLObject text, SubLObject parsing_mt, SubLObject domain_mt) {
        {
            SubLObject result = NIL;
            SubLObject lock = $rkf_terms_forager_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject current = rkf_concept_harvester.rkf_active_concept_harvester_methods();
                    rkf_concept_harvester.rkf_set_active_concept_harvester_methods($list_alt66);
                    result = rkf_concept_harvester.rkf_concept_harvester(text);
                    rkf_concept_harvester.rkf_set_active_concept_harvester_methods(current);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return result;
        }
    }

    /**
     * Harvest as many chunks as you can obtain.
     */
    @LispMethod(comment = "Harvest as many chunks as you can obtain.")
    public static SubLObject rkf_terms_forager(final SubLObject text, final SubLObject parsing_mt, final SubLObject domain_mt) {
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($rkf_terms_forager_lock$.getGlobalValue());
            final SubLObject current = rkf_concept_harvester.rkf_active_concept_harvester_methods();
            rkf_concept_harvester.rkf_set_active_concept_harvester_methods($list69);
            result = rkf_concept_harvester.rkf_concept_harvester(text);
            rkf_concept_harvester.rkf_set_active_concept_harvester_methods(current);
        } finally {
            if (NIL != release) {
                release_lock($rkf_terms_forager_lock$.getGlobalValue());
            }
        }
        return result;
    }

    public static final SubLObject parse_module_definition_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        pmd_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject parse_module_definition_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pmd_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject parse_module_definition_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_text_processors.$parse_module_definition_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject parse_module_definition_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_text_processors.$parse_module_definition_native.class ? T : NIL;
    }

    public static final SubLObject pmd_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PARSE_MODULE_DEFINITION_P);
        return v_object.getField2();
    }

    public static SubLObject pmd_name(final SubLObject v_object) {
        assert NIL != parse_module_definition_p(v_object) : "! rkf_text_processors.parse_module_definition_p(v_object) " + "rkf_text_processors.parse_module_definition_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject pmd_category_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PARSE_MODULE_DEFINITION_P);
        return v_object.getField3();
    }

    public static SubLObject pmd_category(final SubLObject v_object) {
        assert NIL != parse_module_definition_p(v_object) : "! rkf_text_processors.parse_module_definition_p(v_object) " + "rkf_text_processors.parse_module_definition_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject pmd_quality_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PARSE_MODULE_DEFINITION_P);
        return v_object.getField4();
    }

    public static SubLObject pmd_quality(final SubLObject v_object) {
        assert NIL != parse_module_definition_p(v_object) : "! rkf_text_processors.parse_module_definition_p(v_object) " + "rkf_text_processors.parse_module_definition_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject pmd_entry_point_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PARSE_MODULE_DEFINITION_P);
        return v_object.getField5();
    }

    public static SubLObject pmd_entry_point(final SubLObject v_object) {
        assert NIL != parse_module_definition_p(v_object) : "! rkf_text_processors.parse_module_definition_p(v_object) " + "rkf_text_processors.parse_module_definition_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject pmd_cost_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PARSE_MODULE_DEFINITION_P);
        return v_object.getField6();
    }

    public static SubLObject pmd_cost(final SubLObject v_object) {
        assert NIL != parse_module_definition_p(v_object) : "! rkf_text_processors.parse_module_definition_p(v_object) " + "rkf_text_processors.parse_module_definition_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject pmd_expected_expansions_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PARSE_MODULE_DEFINITION_P);
        return v_object.getField7();
    }

    public static SubLObject pmd_expected_expansions(final SubLObject v_object) {
        assert NIL != parse_module_definition_p(v_object) : "! rkf_text_processors.parse_module_definition_p(v_object) " + "rkf_text_processors.parse_module_definition_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject pmd_supplants_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PARSE_MODULE_DEFINITION_P);
        return v_object.getField8();
    }

    public static SubLObject pmd_supplants(final SubLObject v_object) {
        assert NIL != parse_module_definition_p(v_object) : "! rkf_text_processors.parse_module_definition_p(v_object) " + "rkf_text_processors.parse_module_definition_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject _csetf_pmd_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PARSE_MODULE_DEFINITION_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_pmd_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != parse_module_definition_p(v_object) : "! rkf_text_processors.parse_module_definition_p(v_object) " + "rkf_text_processors.parse_module_definition_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_pmd_category_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PARSE_MODULE_DEFINITION_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_pmd_category(final SubLObject v_object, final SubLObject value) {
        assert NIL != parse_module_definition_p(v_object) : "! rkf_text_processors.parse_module_definition_p(v_object) " + "rkf_text_processors.parse_module_definition_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_pmd_quality_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PARSE_MODULE_DEFINITION_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_pmd_quality(final SubLObject v_object, final SubLObject value) {
        assert NIL != parse_module_definition_p(v_object) : "! rkf_text_processors.parse_module_definition_p(v_object) " + "rkf_text_processors.parse_module_definition_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_pmd_entry_point_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PARSE_MODULE_DEFINITION_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_pmd_entry_point(final SubLObject v_object, final SubLObject value) {
        assert NIL != parse_module_definition_p(v_object) : "! rkf_text_processors.parse_module_definition_p(v_object) " + "rkf_text_processors.parse_module_definition_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_pmd_cost_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PARSE_MODULE_DEFINITION_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_pmd_cost(final SubLObject v_object, final SubLObject value) {
        assert NIL != parse_module_definition_p(v_object) : "! rkf_text_processors.parse_module_definition_p(v_object) " + "rkf_text_processors.parse_module_definition_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_pmd_expected_expansions_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PARSE_MODULE_DEFINITION_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_pmd_expected_expansions(final SubLObject v_object, final SubLObject value) {
        assert NIL != parse_module_definition_p(v_object) : "! rkf_text_processors.parse_module_definition_p(v_object) " + "rkf_text_processors.parse_module_definition_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_pmd_supplants_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PARSE_MODULE_DEFINITION_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_pmd_supplants(final SubLObject v_object, final SubLObject value) {
        assert NIL != parse_module_definition_p(v_object) : "! rkf_text_processors.parse_module_definition_p(v_object) " + "rkf_text_processors.parse_module_definition_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject make_parse_module_definition_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rkf_text_processors.$parse_module_definition_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NAME)) {
                        _csetf_pmd_name(v_new, current_value);
                    } else {
                        if (pcase_var.eql($CATEGORY)) {
                            _csetf_pmd_category(v_new, current_value);
                        } else {
                            if (pcase_var.eql($QUALITY)) {
                                _csetf_pmd_quality(v_new, current_value);
                            } else {
                                if (pcase_var.eql($ENTRY_POINT)) {
                                    _csetf_pmd_entry_point(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        _csetf_pmd_cost(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            _csetf_pmd_expected_expansions(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                _csetf_pmd_supplants(v_new, current_value);
                                            } else {
                                                Errors.error($str_alt30$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_parse_module_definition(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rkf_text_processors.$parse_module_definition_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_pmd_name(v_new, current_value);
            } else
                if (pcase_var.eql($CATEGORY)) {
                    _csetf_pmd_category(v_new, current_value);
                } else
                    if (pcase_var.eql($QUALITY)) {
                        _csetf_pmd_quality(v_new, current_value);
                    } else
                        if (pcase_var.eql($ENTRY_POINT)) {
                            _csetf_pmd_entry_point(v_new, current_value);
                        } else
                            if (pcase_var.eql($COST)) {
                                _csetf_pmd_cost(v_new, current_value);
                            } else
                                if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                    _csetf_pmd_expected_expansions(v_new, current_value);
                                } else
                                    if (pcase_var.eql($SUPPLANTS)) {
                                        _csetf_pmd_supplants(v_new, current_value);
                                    } else {
                                        Errors.error($str31$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_parse_module_definition(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PARSE_MODULE_DEFINITION, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, pmd_name(obj));
        funcall(visitor_fn, obj, $SLOT, $CATEGORY, pmd_category(obj));
        funcall(visitor_fn, obj, $SLOT, $QUALITY, pmd_quality(obj));
        funcall(visitor_fn, obj, $SLOT, $ENTRY_POINT, pmd_entry_point(obj));
        funcall(visitor_fn, obj, $SLOT, $COST, pmd_cost(obj));
        funcall(visitor_fn, obj, $SLOT, $EXPECTED_EXPANSIONS, pmd_expected_expansions(obj));
        funcall(visitor_fn, obj, $SLOT, $SUPPLANTS, pmd_supplants(obj));
        funcall(visitor_fn, obj, $END, MAKE_PARSE_MODULE_DEFINITION, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_parse_module_definition_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_parse_module_definition(obj, visitor_fn);
    }

    public static final SubLObject pmd_print_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt95$_PARSE_MODULE_DEFINITION__S_, pmd_name(v_object));
        return v_object;
    }

    public static SubLObject pmd_print(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str101$_PARSE_MODULE_DEFINITION__S_, pmd_name(v_object));
        return v_object;
    }

    public static final SubLObject new_parse_module_definition_alt(SubLObject name, SubLObject category, SubLObject quality, SubLObject entry_point, SubLObject cost, SubLObject expected_expansions, SubLObject supplants) {
        if (cost == UNPROVIDED) {
            cost = $rkf_uttrdr_default_cost$.getGlobalValue();
        }
        if (expected_expansions == UNPROVIDED) {
            expected_expansions = $rkf_uttrdr_default_expected_expansions$.getGlobalValue();
        }
        if (supplants == UNPROVIDED) {
            supplants = NIL;
        }
        {
            SubLObject pmd = make_parse_module_definition(UNPROVIDED);
            _csetf_pmd_name(pmd, name);
            _csetf_pmd_category(pmd, category);
            _csetf_pmd_quality(pmd, quality);
            _csetf_pmd_entry_point(pmd, entry_point);
            _csetf_pmd_cost(pmd, cost);
            _csetf_pmd_expected_expansions(pmd, expected_expansions);
            _csetf_pmd_supplants(pmd, supplants);
            return pmd;
        }
    }

    public static SubLObject new_parse_module_definition(final SubLObject name, final SubLObject category, final SubLObject quality, final SubLObject entry_point, SubLObject cost, SubLObject expected_expansions, SubLObject supplants) {
        if (cost == UNPROVIDED) {
            cost = $rkf_uttrdr_default_cost$.getGlobalValue();
        }
        if (expected_expansions == UNPROVIDED) {
            expected_expansions = $rkf_uttrdr_default_expected_expansions$.getGlobalValue();
        }
        if (supplants == UNPROVIDED) {
            supplants = NIL;
        }
        final SubLObject pmd = make_parse_module_definition(UNPROVIDED);
        _csetf_pmd_name(pmd, name);
        _csetf_pmd_category(pmd, category);
        _csetf_pmd_quality(pmd, quality);
        _csetf_pmd_entry_point(pmd, entry_point);
        _csetf_pmd_cost(pmd, cost);
        _csetf_pmd_expected_expansions(pmd, expected_expansions);
        _csetf_pmd_supplants(pmd, supplants);
        return pmd;
    }

    public static final SubLObject rkf_uttrdr_copy_pmd_alt(SubLObject source, SubLObject target) {
        _csetf_pmd_name(target, pmd_name(source));
        _csetf_pmd_category(target, pmd_category(source));
        _csetf_pmd_quality(target, pmd_quality(source));
        _csetf_pmd_entry_point(target, pmd_entry_point(source));
        _csetf_pmd_cost(target, pmd_cost(source));
        _csetf_pmd_expected_expansions(target, pmd_expected_expansions(source));
        _csetf_pmd_supplants(target, pmd_supplants(source));
        return target;
    }

    public static SubLObject rkf_uttrdr_copy_pmd(SubLObject source, final SubLObject target) {
        _csetf_pmd_name(target, pmd_name(source));
        _csetf_pmd_category(target, pmd_category(source));
        _csetf_pmd_quality(target, pmd_quality(source));
        _csetf_pmd_entry_point(target, pmd_entry_point(source));
        _csetf_pmd_cost(target, pmd_cost(source));
        _csetf_pmd_expected_expansions(target, pmd_expected_expansions(source));
        _csetf_pmd_supplants(target, pmd_supplants(source));
        return target;
    }

    public static final SubLObject rkf_uttrdr_pmd_classify_alt(SubLObject pmd) {
        if (NIL != parse_module_definition_p(pmd)) {
            return multiply(pmd_resolved_quality(pmd), pmd_cost(pmd), pmd_expected_expansions(pmd));
        }
        return $most_positive_fixnum$.getGlobalValue();
    }

    public static SubLObject rkf_uttrdr_pmd_classify(final SubLObject pmd) {
        if (NIL != parse_module_definition_p(pmd)) {
            return multiply(pmd_resolved_quality(pmd), pmd_cost(pmd), pmd_expected_expansions(pmd));
        }
        return $most_positive_fixnum$.getGlobalValue();
    }

    public static final SubLObject rkf_uttrdr_pmd_choose_better_alt(SubLObject pmd_a, SubLObject pmd_b) {
        {
            SubLObject classify_a = rkf_uttrdr_pmd_classify(pmd_a);
            SubLObject classify_b = rkf_uttrdr_pmd_classify(pmd_b);
            return classify_a.numL(classify_b) ? ((SubLObject) (pmd_a)) : pmd_b;
        }
    }

    public static SubLObject rkf_uttrdr_pmd_choose_better(final SubLObject pmd_a, final SubLObject pmd_b) {
        final SubLObject classify_a = rkf_uttrdr_pmd_classify(pmd_a);
        final SubLObject classify_b = rkf_uttrdr_pmd_classify(pmd_b);
        return classify_a.numL(classify_b) ? pmd_a : pmd_b;
    }

    /**
     *
     *
     * @return NUMBERP; The quality of PMD. Sometimes this needs to be computed
    on the basis of current values of globals.
     */
    @LispMethod(comment = "@return NUMBERP; The quality of PMD. Sometimes this needs to be computed\r\non the basis of current values of globals.")
    public static final SubLObject pmd_resolved_quality_alt(SubLObject pmd) {
        {
            SubLObject slot_value = pmd_quality(pmd);
            if (slot_value.isFunctionSpec()) {
                return funcall(slot_value);
            } else {
                if (slot_value.isNumber()) {
                    return slot_value;
                } else {
                    Errors.warn($str_alt96$Can_t_resolve_quality_of__S_, pmd);
                    return ZERO_INTEGER;
                }
            }
        }
    }

    /**
     *
     *
     * @return NUMBERP; The quality of PMD. Sometimes this needs to be computed
    on the basis of current values of globals.
     */
    @LispMethod(comment = "@return NUMBERP; The quality of PMD. Sometimes this needs to be computed\r\non the basis of current values of globals.")
    public static SubLObject pmd_resolved_quality(final SubLObject pmd) {
        final SubLObject slot_value = pmd_quality(pmd);
        if (slot_value.isFunctionSpec()) {
            return funcall(slot_value);
        }
        if (slot_value.isNumber()) {
            return slot_value;
        }
        Errors.warn($str102$Can_t_resolve_quality_of__S_, pmd);
        return ZERO_INTEGER;
    }

    public static final SubLObject rkf_uttrdr_pmd_orderedP_alt(SubLObject pmd_a, SubLObject pmd_b) {
        return eq(pmd_a, rkf_uttrdr_pmd_choose_better(pmd_a, pmd_b));
    }

    public static SubLObject rkf_uttrdr_pmd_orderedP(final SubLObject pmd_a, final SubLObject pmd_b) {
        return eq(pmd_a, rkf_uttrdr_pmd_choose_better(pmd_a, pmd_b));
    }

    public static final SubLObject rkf_uttrdr_explain_pmd_alt(SubLObject pmd) {
        if (NIL != parse_module_definition_p(pmd)) {
            format(T, $str_alt97$Parser__S_for__S__Func___S_Heur__, new SubLObject[]{ pmd_name(pmd), pmd_category(pmd), pmd_entry_point(pmd) });
            if (NIL != pmd_supplants(pmd)) {
                format(T, $str_alt98$___Suppl__S_, pmd_supplants(pmd));
            }
            format(T, $str_alt99$Class__D____Qual__D____Cost__D___, new SubLObject[]{ rkf_uttrdr_pmd_classify(pmd), pmd_resolved_quality(pmd), pmd_cost(pmd), pmd_expected_expansions(pmd) });
            terpri(UNPROVIDED);
        }
        return pmd;
    }

    public static SubLObject rkf_uttrdr_explain_pmd(final SubLObject pmd) {
        if (NIL != parse_module_definition_p(pmd)) {
            format(T, $str103$Parser__S_for__S__Func___S_Heur__, new SubLObject[]{ pmd_name(pmd), pmd_category(pmd), pmd_entry_point(pmd) });
            if (NIL != pmd_supplants(pmd)) {
                format(T, $str104$___Suppl__S_, pmd_supplants(pmd));
            }
            format(T, $str105$Class__D____Qual__D____Cost__D___, new SubLObject[]{ rkf_uttrdr_pmd_classify(pmd), pmd_resolved_quality(pmd), pmd_cost(pmd), pmd_expected_expansions(pmd) });
            terpri(UNPROVIDED);
        }
        return pmd;
    }

    public static final SubLObject rkf_uttrdr_pmd_supplantsP_alt(SubLObject pmd, SubLObject name) {
        {
            SubLObject supplants = pmd_supplants(pmd);
            if (NIL == supplants) {
                return NIL;
            } else {
                if (supplants.isList()) {
                    return subl_promotions.memberP(name, supplants, UNPROVIDED, UNPROVIDED);
                } else {
                    return eq(supplants, name);
                }
            }
        }
    }

    public static SubLObject rkf_uttrdr_pmd_supplantsP(final SubLObject pmd, final SubLObject name) {
        final SubLObject supplants = pmd_supplants(pmd);
        if (NIL == supplants) {
            return NIL;
        }
        if (supplants.isList()) {
            return subl_promotions.memberP(name, supplants, UNPROVIDED, UNPROVIDED);
        }
        return eq(supplants, name);
    }

    public static final SubLObject rkf_uttrdr_invoke_pmd_alt(SubLObject pmd, SubLObject text, SubLObject category, SubLObject parsing_mt, SubLObject domain_mt) {
        {
            SubLObject error = NIL;
            SubLObject result = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            result = funcall(pmd_entry_point(pmd), text, category, parsing_mt, domain_mt);
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
            return result;
        }
    }

    public static SubLObject rkf_uttrdr_invoke_pmd(final SubLObject pmd, final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = NIL;
        SubLObject result = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = funcall(pmd_entry_point(pmd), text, category, parsing_mt, domain_mt);
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
        return result;
    }

    public static final SubLObject parse_module_group_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject parse_module_group_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject parse_module_group_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_text_processors.$parse_module_group_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject parse_module_group_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_text_processors.$parse_module_group_native.class ? T : NIL;
    }

    public static final SubLObject pmg_category_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PARSE_MODULE_GROUP_P);
        return v_object.getField2();
    }

    public static SubLObject pmg_category(final SubLObject v_object) {
        assert NIL != parse_module_group_p(v_object) : "! rkf_text_processors.parse_module_group_p(v_object) " + "rkf_text_processors.parse_module_group_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject pmg_tools_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PARSE_MODULE_GROUP_P);
        return v_object.getField3();
    }

    public static SubLObject pmg_tools(final SubLObject v_object) {
        assert NIL != parse_module_group_p(v_object) : "! rkf_text_processors.parse_module_group_p(v_object) " + "rkf_text_processors.parse_module_group_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_pmg_category_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PARSE_MODULE_GROUP_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_pmg_category(final SubLObject v_object, final SubLObject value) {
        assert NIL != parse_module_group_p(v_object) : "! rkf_text_processors.parse_module_group_p(v_object) " + "rkf_text_processors.parse_module_group_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_pmg_tools_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PARSE_MODULE_GROUP_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_pmg_tools(final SubLObject v_object, final SubLObject value) {
        assert NIL != parse_module_group_p(v_object) : "! rkf_text_processors.parse_module_group_p(v_object) " + "rkf_text_processors.parse_module_group_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_parse_module_group_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rkf_text_processors.$parse_module_group_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CATEGORY)) {
                        _csetf_pmg_category(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TOOLS)) {
                            _csetf_pmg_tools(v_new, current_value);
                        } else {
                            Errors.error($str_alt30$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_parse_module_group(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rkf_text_processors.$parse_module_group_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CATEGORY)) {
                _csetf_pmg_category(v_new, current_value);
            } else
                if (pcase_var.eql($TOOLS)) {
                    _csetf_pmg_tools(v_new, current_value);
                } else {
                    Errors.error($str31$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_parse_module_group(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PARSE_MODULE_GROUP, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CATEGORY, pmg_category(obj));
        funcall(visitor_fn, obj, $SLOT, $TOOLS, pmg_tools(obj));
        funcall(visitor_fn, obj, $END, MAKE_PARSE_MODULE_GROUP, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_parse_module_group_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_parse_module_group(obj, visitor_fn);
    }

    public static final SubLObject pmg_ordered_tools_alt(SubLObject pmg) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = $pmg_ordering$.getDynamicValue(thread);
                if (pcase_var.eql($QUALITY)) {
                    return sorted_by_quality(pmg_tools(pmg));
                } else {
                    return pmg_tools(pmg);
                }
            }
        }
    }

    public static SubLObject pmg_ordered_tools(final SubLObject pmg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = $pmg_ordering$.getDynamicValue(thread);
        if (pcase_var.eql($QUALITY)) {
            return sorted_by_quality(pmg_tools(pmg));
        }
        return pmg_tools(pmg);
    }

    public static final SubLObject sorted_by_quality_alt(SubLObject tool_list) {
        {
            SubLObject result = NIL;
            SubLObject temp_tool_list = copy_list(tool_list);
            result = Sort.stable_sort(temp_tool_list, $sym114$PMD_EXPECTED_EXPANSIONS_, UNPROVIDED);
            result = Sort.stable_sort(result, $sym115$PMD_COST_, UNPROVIDED);
            result = Sort.stable_sort(result, $sym116$PMD_QUALITY_, UNPROVIDED);
            return result;
        }
    }

    public static SubLObject sorted_by_quality(final SubLObject tool_list) {
        SubLObject result = NIL;
        final SubLObject temp_tool_list = copy_list(tool_list);
        result = Sort.stable_sort(temp_tool_list, $sym123$PMD_EXPECTED_EXPANSIONS_, UNPROVIDED);
        result = Sort.stable_sort(result, $sym124$PMD_COST_, UNPROVIDED);
        result = Sort.stable_sort(result, $sym125$PMD_QUALITY_, UNPROVIDED);
        return result;
    }

    public static final SubLObject pmd_expected_expansionsL_alt(SubLObject pmd1, SubLObject pmd2) {
        return numG(pmd_expected_expansions(pmd1), pmd_expected_expansions(pmd2));
    }

    public static SubLObject pmd_expected_expansionsL(final SubLObject pmd1, final SubLObject pmd2) {
        return numG(pmd_expected_expansions(pmd1), pmd_expected_expansions(pmd2));
    }

    public static final SubLObject pmd_costL_alt(SubLObject pmd1, SubLObject pmd2) {
        return numG(pmd_cost(pmd1), pmd_cost(pmd2));
    }

    public static SubLObject pmd_costL(final SubLObject pmd1, final SubLObject pmd2) {
        return numG(pmd_cost(pmd1), pmd_cost(pmd2));
    }

    public static final SubLObject pmd_qualityL_alt(SubLObject pmd1, SubLObject pmd2) {
        return numG(pmd_resolved_quality(pmd1), pmd_resolved_quality(pmd2));
    }

    public static SubLObject pmd_qualityL(final SubLObject pmd1, final SubLObject pmd2) {
        return numG(pmd_resolved_quality(pmd1), pmd_resolved_quality(pmd2));
    }

    public static final SubLObject new_parse_module_group_alt(SubLObject category) {
        {
            SubLObject pmg = make_parse_module_group(UNPROVIDED);
            _csetf_pmg_category(pmg, category);
            _csetf_pmg_tools(pmg, NIL);
            return pmg;
        }
    }

    public static SubLObject new_parse_module_group(final SubLObject category) {
        final SubLObject pmg = make_parse_module_group(UNPROVIDED);
        _csetf_pmg_category(pmg, category);
        _csetf_pmg_tools(pmg, NIL);
        return pmg;
    }

    public static final SubLObject rkf_uttrdr_explain_pmg_alt(SubLObject pmg) {
        format(T, $str_alt117$__Parse_Group_for__S___, pmg_category(pmg));
        format(T, $str_alt118$Tools__in_order______);
        {
            SubLObject cdolist_list_var = pmg_tools(pmg);
            SubLObject tool = NIL;
            for (tool = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tool = cdolist_list_var.first()) {
                rkf_uttrdr_explain_pmd(tool);
            }
        }
        terpri(UNPROVIDED);
        return pmg;
    }

    public static SubLObject rkf_uttrdr_explain_pmg(final SubLObject pmg) {
        format(T, $str126$__Parse_Group_for__S___, pmg_category(pmg));
        format(T, $str127$Tools__in_order______);
        SubLObject cdolist_list_var = pmg_tools(pmg);
        SubLObject tool = NIL;
        tool = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_uttrdr_explain_pmd(tool);
            cdolist_list_var = cdolist_list_var.rest();
            tool = cdolist_list_var.first();
        } 
        terpri(UNPROVIDED);
        return pmg;
    }

    public static final SubLObject with_known_parsers_lock_held_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_LOCK_HELD, $list_alt124, append(body, NIL));
        }
    }

    public static SubLObject with_known_parsers_lock_held(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_LOCK_HELD, $list133, append(body, NIL));
    }

    public static final SubLObject rkf_uttrdr_pmg_find_pmd_by_name_alt(SubLObject list, SubLObject name) {
        return find(name, list, EQ, PMD_NAME, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_uttrdr_pmg_find_pmd_by_name(final SubLObject list, final SubLObject name) {
        return find(name, list, EQ, PMD_NAME, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rkf_uttrdr_pmg_find_pmd_alt(SubLObject list, SubLObject pmd) {
        return rkf_uttrdr_pmg_find_pmd_by_name(list, pmd_name(pmd));
    }

    public static SubLObject rkf_uttrdr_pmg_find_pmd(final SubLObject list, final SubLObject pmd) {
        return rkf_uttrdr_pmg_find_pmd_by_name(list, pmd_name(pmd));
    }

    public static final SubLObject rkf_uttrdr_pmg_add_tool_alt(SubLObject pmg, SubLObject pmd) {
        {
            SubLObject lock = $rkf_uttrdr_known_parsers_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject tools = pmg_tools(pmg);
                    SubLObject item_var = pmd;
                    if (NIL == member(item_var, tools, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                        tools = cons(item_var, tools);
                    }
                    _csetf_pmg_tools(pmg, Sort.sort(tools, $sym125$RKF_UTTRDR_PMD_ORDERED_, UNPROVIDED));
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return pmg;
    }

    public static SubLObject rkf_uttrdr_pmg_add_tool(final SubLObject pmg, final SubLObject pmd) {
        SubLObject release = NIL;
        try {
            release = seize_lock($rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            SubLObject tools = pmg_tools(pmg);
            if (NIL == member(pmd, tools, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                tools = cons(pmd, tools);
            }
            _csetf_pmg_tools(pmg, Sort.sort(tools, $sym134$RKF_UTTRDR_PMD_ORDERED_, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            }
        }
        return pmg;
    }

    public static final SubLObject rkf_uttrdr_pmg_locate_pmd_alt(SubLObject pmg, SubLObject name) {
        {
            SubLObject result = NIL;
            SubLObject lock = $rkf_uttrdr_known_parsers_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL != pmg_tools(pmg)) {
                    {
                        SubLObject pmd = rkf_uttrdr_pmg_find_pmd_by_name(pmg_tools(pmg), name);
                        if (NIL != pmd) {
                            result = pmd;
                        }
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return values(result);
        }
    }

    public static SubLObject rkf_uttrdr_pmg_locate_pmd(final SubLObject pmg, final SubLObject name) {
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            if (NIL != pmg_tools(pmg)) {
                final SubLObject pmd = rkf_uttrdr_pmg_find_pmd_by_name(pmg_tools(pmg), name);
                if (NIL != pmd) {
                    result = pmd;
                }
            }
        } finally {
            if (NIL != release) {
                release_lock($rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            }
        }
        return values(result);
    }

    public static final SubLObject rkf_uttrdr_pmg_is_knownP_alt(SubLObject pmg, SubLObject pmd) {
        {
            SubLObject result = NIL;
            SubLObject lock = $rkf_uttrdr_known_parsers_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                result = rkf_uttrdr_pmg_locate_pmd(pmg, pmd_name(pmd));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return result;
        }
    }

    public static SubLObject rkf_uttrdr_pmg_is_knownP(final SubLObject pmg, final SubLObject pmd) {
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            result = rkf_uttrdr_pmg_locate_pmd(pmg, pmd_name(pmd));
        } finally {
            if (NIL != release) {
                release_lock($rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            }
        }
        return result;
    }

    public static final SubLObject rkf_uttrdr_pmg_update_pmd_alt(SubLObject pmg, SubLObject pmd) {
        {
            SubLObject lock = $rkf_uttrdr_known_parsers_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject old_pmd = NIL;
                    old_pmd = rkf_uttrdr_pmg_locate_pmd(pmg, pmd_name(pmd));
                    rkf_uttrdr_copy_pmd(pmd, old_pmd);
                    {
                        SubLObject tools = pmg_tools(pmg);
                        _csetf_pmg_tools(pmg, Sort.sort(tools, $sym125$RKF_UTTRDR_PMD_ORDERED_, UNPROVIDED));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return pmg;
    }

    public static SubLObject rkf_uttrdr_pmg_update_pmd(final SubLObject pmg, final SubLObject pmd) {
        SubLObject release = NIL;
        try {
            release = seize_lock($rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            SubLObject old_pmd = NIL;
            old_pmd = rkf_uttrdr_pmg_locate_pmd(pmg, pmd_name(pmd));
            rkf_uttrdr_copy_pmd(pmd, old_pmd);
            final SubLObject tools = pmg_tools(pmg);
            _csetf_pmg_tools(pmg, Sort.sort(tools, $sym134$RKF_UTTRDR_PMD_ORDERED_, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            }
        }
        return pmg;
    }

    public static final SubLObject rkf_uttrdr_pmg_classify_pmd_alt(SubLObject pmg, SubLObject pmd) {
        {
            SubLObject lock = $rkf_uttrdr_known_parsers_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL != rkf_uttrdr_pmg_is_knownP(pmg, pmd)) {
                    rkf_uttrdr_pmg_update_pmd(pmg, pmd);
                } else {
                    rkf_uttrdr_pmg_add_tool(pmg, pmd);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return pmg;
    }

    public static SubLObject rkf_uttrdr_pmg_classify_pmd(final SubLObject pmg, final SubLObject pmd) {
        SubLObject release = NIL;
        try {
            release = seize_lock($rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            if (NIL != rkf_uttrdr_pmg_is_knownP(pmg, pmd)) {
                rkf_uttrdr_pmg_update_pmd(pmg, pmd);
            } else {
                rkf_uttrdr_pmg_add_tool(pmg, pmd);
            }
        } finally {
            if (NIL != release) {
                release_lock($rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            }
        }
        return pmg;
    }

    public static final SubLObject rkf_uttrdr_find_parse_module_group_alt(SubLObject category) {
        {
            SubLObject pmg = NIL;
            SubLObject lock = $rkf_uttrdr_known_parsers_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL == $rkf_uttrdr_known_parsers$.getGlobalValue()) {
                    pmg = NIL;
                } else {
                    pmg = find(category, $rkf_uttrdr_known_parsers$.getGlobalValue(), EQL, PMG_CATEGORY, UNPROVIDED, UNPROVIDED);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return pmg;
        }
    }

    public static SubLObject rkf_uttrdr_find_parse_module_group(final SubLObject category) {
        SubLObject pmg = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            if (NIL == $rkf_uttrdr_known_parsers$.getGlobalValue()) {
                pmg = NIL;
            } else {
                pmg = find(category, $rkf_uttrdr_known_parsers$.getGlobalValue(), EQL, PMG_CATEGORY, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            if (NIL != release) {
                release_lock($rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            }
        }
        return pmg;
    }

    public static final SubLObject rkf_uttrdr_give_parse_module_group_alt(SubLObject category) {
        {
            SubLObject pmg = rkf_uttrdr_find_parse_module_group(category);
            if (NIL == pmg) {
                pmg = new_parse_module_group(category);
                {
                    SubLObject lock = $rkf_uttrdr_known_parsers_lock$.getGlobalValue();
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        $rkf_uttrdr_known_parsers$.setGlobalValue(cons(pmg, $rkf_uttrdr_known_parsers$.getGlobalValue()));
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            }
            return pmg;
        }
    }

    public static SubLObject rkf_uttrdr_give_parse_module_group(final SubLObject category) {
        SubLObject pmg = rkf_uttrdr_find_parse_module_group(category);
        if (NIL == pmg) {
            pmg = new_parse_module_group(category);
            SubLObject release = NIL;
            try {
                release = seize_lock($rkf_uttrdr_known_parsers_lock$.getGlobalValue());
                $rkf_uttrdr_known_parsers$.setGlobalValue(cons(pmg, $rkf_uttrdr_known_parsers$.getGlobalValue()));
            } finally {
                if (NIL != release) {
                    release_lock($rkf_uttrdr_known_parsers_lock$.getGlobalValue());
                }
            }
        }
        return pmg;
    }

    public static final SubLObject rkf_uttrdr_show_parsers_alt(SubLObject category) {
        {
            SubLObject pmg = rkf_uttrdr_give_parse_module_group(category);
            if (NIL == pmg) {
                format(T, $str_alt126$No_known_parsers_for_category__S_, category);
            } else {
                rkf_uttrdr_explain_pmg(pmg);
            }
        }
        return category;
    }

    public static SubLObject rkf_uttrdr_show_parsers(final SubLObject category) {
        final SubLObject pmg = rkf_uttrdr_give_parse_module_group(category);
        if (NIL == pmg) {
            format(T, $str135$No_known_parsers_for_category__S_, category);
        } else {
            rkf_uttrdr_explain_pmg(pmg);
        }
        return category;
    }

    public static final SubLObject rkf_uttrdr_all_supported_categories_alt() {
        if (NIL == $rkf_uttrdr_resolvables$.getGlobalValue()) {
            rkf_uttrdr_reset_all_supported_categories();
        }
        return $rkf_uttrdr_resolvables$.getGlobalValue();
    }

    public static SubLObject rkf_uttrdr_all_supported_categories() {
        if (NIL == $rkf_uttrdr_resolvables$.getGlobalValue()) {
            rkf_uttrdr_reset_all_supported_categories();
        }
        return $rkf_uttrdr_resolvables$.getGlobalValue();
    }

    public static final SubLObject rkf_uttrdr_reset_all_supported_categories_alt() {
        $rkf_uttrdr_resolvables$.setGlobalValue(rkf_uttrdr_all_supported_categories_internal());
        return $rkf_uttrdr_resolvables$.getGlobalValue();
    }

    public static SubLObject rkf_uttrdr_reset_all_supported_categories() {
        $rkf_uttrdr_resolvables$.setGlobalValue(rkf_uttrdr_all_supported_categories_internal());
        return $rkf_uttrdr_resolvables$.getGlobalValue();
    }

    public static final SubLObject rkf_uttrdr_all_supported_categories_internal_alt() {
        {
            SubLObject categories = NIL;
            SubLObject lock = $rkf_uttrdr_known_parsers_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject cdolist_list_var = $rkf_uttrdr_known_parsers$.getGlobalValue();
                    SubLObject pmg = NIL;
                    for (pmg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pmg = cdolist_list_var.first()) {
                        categories = cons(pmg_category(pmg), categories);
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return categories;
        }
    }

    public static SubLObject rkf_uttrdr_all_supported_categories_internal() {
        SubLObject categories = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            SubLObject cdolist_list_var = $rkf_uttrdr_known_parsers$.getGlobalValue();
            SubLObject pmg = NIL;
            pmg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                categories = cons(pmg_category(pmg), categories);
                cdolist_list_var = cdolist_list_var.rest();
                pmg = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock($rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            }
        }
        return categories;
    }

    public static final SubLObject rkf_uttrdr_register_parser_alt(SubLObject category, SubLObject pmd) {
        {
            SubLObject pmg = rkf_uttrdr_give_parse_module_group(category);
            rkf_uttrdr_pmg_classify_pmd(pmg, pmd);
            rkf_uttrdr_reset_all_supported_categories();
            return pmg;
        }
    }

    public static SubLObject rkf_uttrdr_register_parser(final SubLObject category, final SubLObject pmd) {
        final SubLObject pmg = rkf_uttrdr_give_parse_module_group(category);
        rkf_uttrdr_pmg_classify_pmd(pmg, pmd);
        rkf_uttrdr_reset_all_supported_categories();
        return pmg;
    }

    public static final SubLObject rkf_uttrdr_deregister_all_parsers_alt() {
        $rkf_uttrdr_known_parsers$.setGlobalValue(NIL);
        return $CLEARED;
    }

    public static SubLObject rkf_uttrdr_deregister_all_parsers() {
        $rkf_uttrdr_known_parsers$.setGlobalValue(NIL);
        return $CLEARED;
    }

    public static final SubLObject register_known_parser_module_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject keys = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt128);
            keys = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pmd = $sym129$PMD;
                    SubLObject curr = $sym130$CURR;
                    SubLObject key = $sym131$KEY;
                    SubLObject value = $sym132$VALUE;
                    SubLObject name = $sym133$NAME;
                    SubLObject category = $sym134$CATEGORY;
                    SubLObject entry_point = $sym135$ENTRY_POINT;
                    SubLObject docstring = $sym136$DOCSTRING;
                    SubLObject cost = $sym137$COST;
                    SubLObject quality = $sym138$QUALITY;
                    SubLObject expected_expansions = $sym139$EXPECTED_EXPANSIONS;
                    SubLObject supplants = $sym140$SUPPLANTS;
                    return list(CLET, list(name, category, entry_point, docstring, cost, quality, expected_expansions, supplants), list(IGNORE, docstring), list(CDOLIST, list(curr, keys), list(CDESTRUCTURING_BIND, list(key, value), curr, list(new SubLObject[]{ PCASE, key, list($NAME, list(CSETQ, name, value)), list($CATEGORY, list(CSETQ, category, value)), list($ENTRY_POINT, list(CSETQ, entry_point, value)), list($DOC, list(CSETQ, docstring, value)), list($QUALITY, list(CSETQ, quality, value)), list($COST, list(CSETQ, cost, value)), list($EXPECTED_EXPANSIONS, list(CSETQ, expected_expansions, value)), list($SUPPLANTS, list(CSETQ, supplants, value)), list(OTHERWISE, list(ERROR, $str_alt149$Invalid_key__S_in_parser_module_r, key)) }))), list(CLET, list(list(pmd, list(NEW_PARSE_MODULE_DEFINITION, name, category, quality, entry_point, cost, expected_expansions, supplants))), list(RKF_UTTRDR_REGISTER_PARSER, category, pmd)));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt128);
            }
        }
        return NIL;
    }

    public static SubLObject register_known_parser_module(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject keys = NIL;
        destructuring_bind_must_consp(current, datum, $list137);
        keys = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pmd = $sym138$PMD;
            final SubLObject curr = $sym139$CURR;
            final SubLObject key = $sym140$KEY;
            final SubLObject value = $sym141$VALUE;
            final SubLObject name = $sym142$NAME;
            final SubLObject category = $sym143$CATEGORY;
            final SubLObject entry_point = $sym144$ENTRY_POINT;
            final SubLObject docstring = $sym145$DOCSTRING;
            final SubLObject cost = $sym146$COST;
            final SubLObject quality = $sym147$QUALITY;
            final SubLObject expected_expansions = $sym148$EXPECTED_EXPANSIONS;
            final SubLObject supplants = $sym149$SUPPLANTS;
            return list(CLET, list(name, category, entry_point, docstring, cost, quality, expected_expansions, supplants), list(IGNORE, docstring), list(CDOLIST, list(curr, keys), list(CDESTRUCTURING_BIND, list(key, value), curr, list(new SubLObject[]{ PCASE, key, list($NAME, list(CSETQ, name, value)), list($CATEGORY, list(CSETQ, category, value)), list($ENTRY_POINT, list(CSETQ, entry_point, value)), list($DOC, list(CSETQ, docstring, value)), list($QUALITY, list(CSETQ, quality, value)), list($COST, list(CSETQ, cost, value)), list($EXPECTED_EXPANSIONS, list(CSETQ, expected_expansions, value)), list($SUPPLANTS, list(CSETQ, supplants, value)), list(OTHERWISE, list(ERROR, $str158$Invalid_key__S_in_parser_module_r, key)) }))), list(CLET, list(list(pmd, list(NEW_PARSE_MODULE_DEFINITION, name, category, quality, entry_point, cost, expected_expansions, supplants))), list(RKF_UTTRDR_REGISTER_PARSER, category, pmd)));
        }
        cdestructuring_bind_error(datum, $list137);
        return NIL;
    }

    public static final SubLObject pmd_npp_quality_alt() {
        return TEN_INTEGER;
    }

    public static SubLObject pmd_npp_quality() {
        return TEN_INTEGER;
    }

    public static final SubLObject rkf_uttrdr_use_template_parser_alt(SubLObject text, SubLObject category, SubLObject parsing_mt, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject parses = NIL;
                {
                    SubLObject _prev_bind_0 = parsing_vars.$perform_vp_parser_expansion$.currentBinding(thread);
                    SubLObject _prev_bind_1 = parsing_vars.$psp_return_mode$.currentBinding(thread);
                    try {
                        parsing_vars.$perform_vp_parser_expansion$.bind($rkf_uttrdr_use_vpp_in_itp$.getDynamicValue(thread), thread);
                        parsing_vars.$psp_return_mode$.bind($rkf_uttrdr_psp_return_mode$.getDynamicValue(thread), thread);
                        parses = iterative_template_parser.itp_sequel(text, category, parsing_mt, domain_mt);
                    } finally {
                        parsing_vars.$psp_return_mode$.rebind(_prev_bind_1, thread);
                        parsing_vars.$perform_vp_parser_expansion$.rebind(_prev_bind_0, thread);
                    }
                }
                return parses;
            }
        }
    }

    public static SubLObject rkf_uttrdr_use_template_parser(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parses = NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$perform_vp_parser_expansion$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$psp_return_mode$.currentBinding(thread);
        try {
            parsing_vars.$perform_vp_parser_expansion$.bind($rkf_uttrdr_use_vpp_in_itp$.getDynamicValue(thread), thread);
            parsing_vars.$psp_return_mode$.bind($rkf_uttrdr_psp_return_mode$.getDynamicValue(thread), thread);
            parses = iterative_template_parser.itp_sequel(text, category, parsing_mt, domain_mt);
        } finally {
            parsing_vars.$psp_return_mode$.rebind(_prev_bind_2, thread);
            parsing_vars.$perform_vp_parser_expansion$.rebind(_prev_bind_0, thread);
        }
        return parses;
    }

    public static final SubLObject rkf_uttrdr_parse_inf_vbar_alt(SubLObject text, SubLObject category, SubLObject parsing_mt, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject tokenization = rkf_concept_harvester.rkf_ch_string_tokenize(text);
                SubLObject token_count = length(tokenization);
                {
                    SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
                    try {
                        parsing_vars.$psp_return_mode$.bind($rkf_uttrdr_psp_return_mode$.getDynamicValue(thread), thread);
                        {
                            SubLObject lexicon = psp_lexicon.get_default_psp_lexicon(parsing_mt, UNPROVIDED, UNPROVIDED);
                            if (NIL != rkf_uttrdr_full_spans_onlyP()) {
                                {
                                    SubLObject parses = psp_main.ps_parse_vbar(text, $$infinitive, lexicon, UNPROVIDED);
                                    if (NIL != parses) {
                                        {
                                            SubLObject span = parsing_utilities.token_list_from_span(ZERO_INTEGER, token_count);
                                            SubLObject span_harvest = list(span, parses);
                                            result = list(span_harvest);
                                        }
                                    }
                                }
                            } else {
                                result = psp_main.ps_harvest_nps(text, NIL, lexicon);
                            }
                        }
                    } finally {
                        parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject rkf_uttrdr_parse_inf_vbar(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject tokenization = rkf_concept_harvester.rkf_ch_string_tokenize(text);
        final SubLObject token_count = length(tokenization);
        final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
        try {
            parsing_vars.$psp_return_mode$.bind($rkf_uttrdr_psp_return_mode$.getDynamicValue(thread), thread);
            final SubLObject lexicon = psp_lexicon.get_default_psp_lexicon(parsing_mt, UNPROVIDED, UNPROVIDED);
            if (NIL != rkf_uttrdr_full_spans_onlyP()) {
                final SubLObject parses = psp_main.ps_parse_vbar(text, $$infinitive, lexicon, UNPROVIDED);
                if (NIL != parses) {
                    final SubLObject span = parsing_utilities.token_list_from_span(ZERO_INTEGER, token_count);
                    final SubLObject span_harvest = list(span, parses);
                    result = list(span_harvest);
                }
            } else {
                result = psp_main.ps_harvest_nps(text, NIL, lexicon);
            }
        } finally {
            parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject rkf_uttrdr_use_noun_phrase_parser_alt(SubLObject text, SubLObject category, SubLObject parsing_mt, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject tokenization = rkf_concept_harvester.rkf_ch_string_tokenize(text);
                SubLObject token_count = length(tokenization);
                {
                    SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
                    try {
                        parsing_vars.$psp_return_mode$.bind($rkf_uttrdr_psp_return_mode$.getDynamicValue(thread), thread);
                        {
                            SubLObject lexicon = psp_lexicon.get_default_psp_lexicon(parsing_mt, UNPROVIDED, UNPROVIDED);
                            if (NIL != rkf_uttrdr_full_spans_onlyP()) {
                                {
                                    SubLObject parses = psp_main.ps_get_cycls_for_np(text, NIL, lexicon, UNPROVIDED);
                                    if (NIL != parses) {
                                        {
                                            SubLObject span = parsing_utilities.token_list_from_span(ZERO_INTEGER, token_count);
                                            SubLObject span_harvest = list(span, parses);
                                            result = list(span_harvest);
                                        }
                                    }
                                }
                            } else {
                                result = psp_main.ps_harvest_nps(text, NIL, lexicon);
                            }
                        }
                    } finally {
                        parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject rkf_uttrdr_use_noun_phrase_parser(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject tokenization = rkf_concept_harvester.rkf_ch_string_tokenize(text);
        final SubLObject token_count = length(tokenization);
        final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
        try {
            parsing_vars.$psp_return_mode$.bind($rkf_uttrdr_psp_return_mode$.getDynamicValue(thread), thread);
            final SubLObject lexicon = psp_lexicon.get_default_psp_lexicon(parsing_mt, UNPROVIDED, UNPROVIDED);
            if (NIL != rkf_uttrdr_full_spans_onlyP()) {
                final SubLObject parses = psp_main.ps_get_cycls_for_np(text, NIL, lexicon, UNPROVIDED);
                if (NIL != parses) {
                    final SubLObject span = parsing_utilities.token_list_from_span(ZERO_INTEGER, token_count);
                    final SubLObject span_harvest = list(span, parses);
                    result = list(span_harvest);
                }
            } else {
                result = psp_main.ps_harvest_nps(text, NIL, lexicon);
            }
        } finally {
            parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject rkf_uttrdr_use_noun_compound_parser_alt(SubLObject text, SubLObject category, SubLObject parsing_mt, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject tokenization = rkf_concept_harvester.rkf_ch_string_tokenize(text);
                SubLObject token_count = length(tokenization);
                {
                    SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
                    try {
                        parsing_vars.$psp_return_mode$.bind($rkf_uttrdr_psp_return_mode$.getDynamicValue(thread), thread);
                        if (token_count.numG(ONE_INTEGER)) {
                            {
                                SubLObject non_trivialP = rkf_uttrdr_full_spans_onlyP();
                                SubLObject harvest = psp_main.ps_harvest_nbars(text, non_trivialP, psp_lexicon.get_default_psp_lexicon(parsing_mt, UNPROVIDED, UNPROVIDED));
                                if (NIL != rkf_uttrdr_full_spans_onlyP()) {
                                    {
                                        SubLObject cdolist_list_var = harvest;
                                        SubLObject part = NIL;
                                        for (part = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , part = cdolist_list_var.first()) {
                                            {
                                                SubLObject datum = part;
                                                SubLObject current = datum;
                                                SubLObject span = NIL;
                                                SubLObject interpretations = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt0);
                                                span = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt0);
                                                interpretations = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    if (NIL != list_utilities.lengthE(span, token_count, UNPROVIDED)) {
                                                        result = list(part);
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum, $list_alt0);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    result = harvest;
                                }
                            }
                        }
                    } finally {
                        parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject rkf_uttrdr_use_noun_compound_parser(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject tokenization = rkf_concept_harvester.rkf_ch_string_tokenize(text);
        final SubLObject token_count = length(tokenization);
        final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
        try {
            parsing_vars.$psp_return_mode$.bind($rkf_uttrdr_psp_return_mode$.getDynamicValue(thread), thread);
            if (token_count.numG(ONE_INTEGER)) {
                final SubLObject non_trivialP = rkf_uttrdr_full_spans_onlyP();
                final SubLObject harvest = psp_main.ps_harvest_nbars(text, non_trivialP, psp_lexicon.get_default_psp_lexicon(parsing_mt, UNPROVIDED, UNPROVIDED));
                if (NIL != rkf_uttrdr_full_spans_onlyP()) {
                    SubLObject cdolist_list_var = harvest;
                    SubLObject part = NIL;
                    part = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = part;
                        SubLObject span = NIL;
                        SubLObject interpretations = NIL;
                        destructuring_bind_must_consp(current, datum, $list0);
                        span = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list0);
                        interpretations = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != list_utilities.lengthE(span, token_count, UNPROVIDED)) {
                                result = list(part);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list0);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        part = cdolist_list_var.first();
                    } 
                } else {
                    result = harvest;
                }
            }
        } finally {
            parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject rkf_uttrdr_use_noun_compound_lexicon_alt(SubLObject text, SubLObject category, SubLObject parsing_mt, SubLObject domain_mt) {
        return rkf_uttrdr_generic_lexical_parser(RKF_CH_NOUN_COMPOUND_PHRASE_PARSER, text, category, parsing_mt, domain_mt);
    }

    public static SubLObject rkf_uttrdr_use_noun_compound_lexicon(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        return rkf_uttrdr_generic_lexical_parser(RKF_CH_NOUN_COMPOUND_PHRASE_PARSER, text, category, parsing_mt, domain_mt);
    }

    public static final SubLObject rkf_uttrdr_use_multi_word_denotations_alt(SubLObject text, SubLObject category, SubLObject parsing_mt, SubLObject domain_mt) {
        return rkf_uttrdr_generic_lexical_parser(RKF_CH_DENOTATIONS_FROM_MULTI_WORD_STRING, text, category, parsing_mt, domain_mt);
    }

    public static SubLObject rkf_uttrdr_use_multi_word_denotations(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        return rkf_uttrdr_generic_lexical_parser(RKF_CH_DENOTATIONS_FROM_MULTI_WORD_STRING, text, category, parsing_mt, domain_mt);
    }

    public static final SubLObject rkf_uttrdr_use_denots_of_string_alt(SubLObject text, SubLObject category, SubLObject parsing_mt, SubLObject domain_mt) {
        return rkf_uttrdr_generic_lexical_parser(RKF_CH_DENOTATIONS_FOR_STRING, text, category, parsing_mt, domain_mt);
    }

    public static SubLObject rkf_uttrdr_use_denots_of_string(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        return rkf_uttrdr_generic_lexical_parser(RKF_CH_DENOTATIONS_FOR_STRING, text, category, parsing_mt, domain_mt);
    }

    public static final SubLObject rkf_uttrdr_read_as_string_alt(SubLObject text, SubLObject category, SubLObject parsing_mt, SubLObject domain_mt) {
        {
            SubLObject word_count = length(rkf_concept_harvester.rkf_ch_string_tokenize(text));
            return list(list(parsing_utilities.token_list_from_span(ZERO_INTEGER, word_count), list(text)));
        }
    }

    public static SubLObject rkf_uttrdr_read_as_string(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLObject word_count = length(rkf_concept_harvester.rkf_ch_string_tokenize(text));
        return list(list(parsing_utilities.token_list_from_span(ZERO_INTEGER, word_count), list(text)));
    }

    public static final SubLObject rkf_uttrdr_read_cycl_term_from_string_alt(SubLObject text, SubLObject category, SubLObject parsing_mt, SubLObject domain_mt) {
        return rkf_uttrdr_generic_lexical_parser(RKF_TERM_FROM_STRING, text, category, parsing_mt, domain_mt);
    }

    public static SubLObject rkf_uttrdr_read_cycl_term_from_string(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        return rkf_uttrdr_generic_lexical_parser(RKF_TERM_FROM_STRING, text, category, parsing_mt, domain_mt);
    }

    public static final SubLObject rkf_term_from_string_alt(SubLObject text, SubLObject parsing_mt, SubLObject pos) {
        if (pos == UNPROVIDED) {
            pos = NIL;
        }
        SubLTrampolineFile.checkType(text, STRINGP);
        {
            SubLObject result = NIL;
            SubLObject tokens = rkf_concept_harvester.rkf_ch_string_tokenize(text);
            SubLObject index = ZERO_INTEGER;
            SubLObject cdolist_list_var = tokens;
            SubLObject token = NIL;
            for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token = cdolist_list_var.first()) {
                {
                    SubLObject cycl_candidate_parse = NIL;
                    if (NIL != string_utilities.string_starts_with_constant_reader_prefix_p(token)) {
                        cycl_candidate_parse = read_from_string_ignoring_errors(token, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != cycl_candidate_parse) {
                            {
                                SubLObject item_var = list(list(index), list(cycl_candidate_parse));
                                if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    result = cons(item_var, result);
                                }
                            }
                        }
                    }
                    index = add(index, ONE_INTEGER);
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject rkf_term_from_string(final SubLObject text, final SubLObject parsing_mt, SubLObject pos) {
        if (pos == UNPROVIDED) {
            pos = NIL;
        }
        assert NIL != stringp(text) : "! stringp(text) " + ("Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) ") + text;
        SubLObject result = NIL;
        final SubLObject tokens = rkf_concept_harvester.rkf_ch_string_tokenize(text);
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = NIL;
        token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cycl_candidate_parse = NIL;
            if (NIL != string_utilities.string_starts_with_constant_reader_prefix_p(token)) {
                cycl_candidate_parse = read_from_string_ignoring_errors(token, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != cycl_candidate_parse) {
                    final SubLObject item_var = list(list(index), list(cycl_candidate_parse));
                    if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                        result = cons(item_var, result);
                    }
                }
            }
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject rkf_uttrdr_generic_lexical_parser_alt(SubLObject function, SubLObject text, SubLObject category, SubLObject parsing_mt, SubLObject domain_mt) {
        {
            SubLObject pos = iterative_template_parser.pos_for_rtp_cat(category);
            SubLObject result = NIL;
            SubLObject tokenization = rkf_concept_harvester.rkf_ch_string_tokenize(text);
            SubLObject span = rkf_uttrdr_turn_tokens_into_span(tokenization);
            SubLObject parses = (NIL != pos) ? ((SubLObject) (funcall(function, text, parsing_mt, pos))) : funcall(function, text, parsing_mt);
            if (NIL != parses) {
                {
                    SubLObject top_parse = parses.first();
                    SubLObject datum = top_parse;
                    SubLObject current = datum;
                    SubLObject parse_span = NIL;
                    SubLObject interpretation = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt182);
                    parse_span = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt182);
                    interpretation = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (length(parse_span).numE(length(span))) {
                            result = list(top_parse);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt182);
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject rkf_uttrdr_generic_lexical_parser(final SubLObject function, final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLObject pos = iterative_template_parser.pos_for_rtp_cat(category);
        SubLObject result = NIL;
        final SubLObject tokenization = rkf_concept_harvester.rkf_ch_string_tokenize(text);
        final SubLObject span = rkf_uttrdr_turn_tokens_into_span(tokenization);
        final SubLObject parses = (NIL != pos) ? funcall(function, text, parsing_mt, pos) : funcall(function, text, parsing_mt);
        if (NIL != parses) {
            final SubLObject top_parse = parses.first();
            SubLObject current;
            final SubLObject datum = current = top_parse;
            SubLObject parse_span = NIL;
            SubLObject interpretation = NIL;
            destructuring_bind_must_consp(current, datum, $list191);
            parse_span = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list191);
            interpretation = current.first();
            current = current.rest();
            if (NIL == current) {
                if (length(parse_span).numE(length(span))) {
                    result = list(top_parse);
                }
            } else {
                cdestructuring_bind_error(datum, $list191);
            }
        }
        return result;
    }

    public static final SubLObject rkf_uttrdr_use_number_parser_alt(SubLObject text, SubLObject category, SubLObject parsing_mt, SubLObject domain_mt) {
        return rkf_uttrdr_generic_lexical_parser(RKF_NUMBER_PARSER, text, category, parsing_mt, domain_mt);
    }

    public static SubLObject rkf_uttrdr_use_number_parser(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        return rkf_uttrdr_generic_lexical_parser(RKF_NUMBER_PARSER, text, category, parsing_mt, domain_mt);
    }

    public static final SubLObject rkf_number_parser_alt(SubLObject string, SubLObject mt, SubLObject pos) {
        if (pos == UNPROVIDED) {
            pos = NIL;
        }
        {
            SubLObject tokens = rkf_concept_harvester.rkf_ch_string_tokenize(string);
            SubLObject token_list = rkf_uttrdr_turn_tokens_into_span(tokens);
            SubLObject number = numeral_parser.string_to_interval(string);
            if (NIL != number) {
                return list(list(token_list, list(number)));
            }
        }
        return NIL;
    }

    public static SubLObject rkf_number_parser(final SubLObject string, final SubLObject mt, SubLObject pos) {
        if (pos == UNPROVIDED) {
            pos = NIL;
        }
        final SubLObject tokens = rkf_concept_harvester.rkf_ch_string_tokenize(string);
        final SubLObject token_list = rkf_uttrdr_turn_tokens_into_span(tokens);
        final SubLObject number = numeral_parser.string_to_interval(string);
        if (NIL != number) {
            return list(list(token_list, list(number)));
        }
        return NIL;
    }

    public static final SubLObject rkf_uttrdr_turn_terms_into_parse_result_alt(SubLObject terms, SubLObject tokenization, SubLObject domain_mt) {
        if (NIL != terms) {
            if (NIL == rkf_uttrdr_are_nltags_allowedP()) {
                terms = rkf_uttrdr_interpret_nltagfn_terms(terms, domain_mt);
            }
            {
                SubLObject span = rkf_uttrdr_turn_tokens_into_span(tokenization);
                return list(list(nreverse(span), terms));
            }
        }
        return NIL;
    }

    public static SubLObject rkf_uttrdr_turn_terms_into_parse_result(SubLObject terms, final SubLObject tokenization, final SubLObject domain_mt) {
        if (NIL != terms) {
            if (NIL == rkf_uttrdr_are_nltags_allowedP()) {
                terms = rkf_uttrdr_interpret_nltagfn_terms(terms, domain_mt);
            }
            final SubLObject span = rkf_uttrdr_turn_tokens_into_span(tokenization);
            return list(list(nreverse(span), terms));
        }
        return NIL;
    }

    public static final SubLObject rkf_uttrdr_turn_tokens_into_span_alt(SubLObject tokenization) {
        {
            SubLObject span = NIL;
            SubLObject list_var = NIL;
            SubLObject token = NIL;
            SubLObject count = NIL;
            for (list_var = tokenization, token = list_var.first(), count = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , token = list_var.first() , count = add(ONE_INTEGER, count)) {
                span = cons(count, span);
            }
            return nreverse(span);
        }
    }

    public static SubLObject rkf_uttrdr_turn_tokens_into_span(final SubLObject tokenization) {
        SubLObject span = NIL;
        SubLObject list_var = NIL;
        SubLObject token = NIL;
        SubLObject count = NIL;
        list_var = tokenization;
        token = list_var.first();
        for (count = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , token = list_var.first() , count = add(ONE_INTEGER, count)) {
            span = cons(count, span);
        }
        return nreverse(span);
    }

    public static final SubLObject rkf_uttrdr_interpret_nltagfn_terms_alt(SubLObject terms, SubLObject domain_mt) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                {
                    SubLObject reformulated = reformulator_hub.reformulate_cycl(v_term, domain_mt, UNPROVIDED);
                    SubLObject interpreted = rkf_uttrdr_interpret_nltagfn_term(reformulated, domain_mt);
                    SubLObject item_var = interpreted;
                    if (NIL == member(item_var, result, EQUALP, symbol_function(IDENTITY))) {
                        result = cons(item_var, result);
                    }
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject rkf_uttrdr_interpret_nltagfn_terms(final SubLObject terms, final SubLObject domain_mt) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject reformulated = reformulator_hub.reformulate_cycl(v_term, domain_mt, UNPROVIDED);
            final SubLObject item_var;
            final SubLObject interpreted = item_var = rkf_uttrdr_interpret_nltagfn_term(reformulated, domain_mt);
            if (NIL == member(item_var, result, EQUALP, symbol_function(IDENTITY))) {
                result = cons(item_var, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject rkf_uttrdr_interpret_nltagfn_term_alt(SubLObject v_term, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != constant_p(v_term)) {
                return v_term;
            }
            {
                SubLObject representation = NIL;
                SubLObject interpretation = NIL;
                SubLObject components = NIL;
                SubLObject done = NIL;
                if (NIL != nart_handles.nart_p(v_term)) {
                    representation = narts_high.nart_el_formula(v_term);
                } else {
                    representation = v_term;
                }
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(domain_mt, thread);
                        while (NIL == done) {
                            {
                                SubLObject functor = (representation.isList()) ? ((SubLObject) (representation.first())) : representation;
                                if (functor == $$NLNumberFn) {
                                    representation = cycl_utilities.formula_arg2(representation, UNPROVIDED);
                                } else {
                                    if ((functor == $$NLQuantFn) || (functor == $$NLQuantFn_3)) {
                                        if (cycl_utilities.formula_arg1(representation, UNPROVIDED).isList() && (cycl_utilities.formula_arg0(cycl_utilities.formula_arg1(representation, UNPROVIDED)) == $$NumericalQuant_NLAttrFn)) {
                                            {
                                                SubLObject number = cycl_utilities.formula_arg1(cycl_utilities.formula_arg1(representation, UNPROVIDED), UNPROVIDED);
                                                components = cons(list($$GroupOfCardinalityFn, $rkf_uttrdr_marker$.getGlobalValue(), number), components);
                                            }
                                        }
                                        representation = cycl_utilities.formula_arg2(representation, UNPROVIDED);
                                    } else {
                                        if (NIL != parsing_utilities.nl_tag_fnP(functor, UNPROVIDED)) {
                                            representation = cycl_utilities.formula_arg2(representation, UNPROVIDED);
                                        } else {
                                            components = cons(representation, components);
                                            done = T;
                                        }
                                    }
                                }
                            }
                        } 
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                while (NIL != components) {
                    {
                        SubLObject item = components.first();
                        if (NIL != interpretation) {
                            interpretation = subst(interpretation, $rkf_uttrdr_marker$.getGlobalValue(), item, UNPROVIDED, UNPROVIDED);
                        } else {
                            interpretation = item;
                        }
                        components = components.rest();
                    }
                } 
                return interpretation;
            }
        }
    }

    public static SubLObject rkf_uttrdr_interpret_nltagfn_term(final SubLObject v_term, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != constant_p(v_term)) {
            return v_term;
        }
        SubLObject representation = NIL;
        SubLObject interpretation = NIL;
        SubLObject components = NIL;
        SubLObject done = NIL;
        if (NIL != nart_handles.nart_p(v_term)) {
            representation = narts_high.nart_el_formula(v_term);
        } else {
            representation = v_term;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(domain_mt, thread);
            while (NIL == done) {
                final SubLObject functor = (representation.isList()) ? representation.first() : representation;
                if (functor.eql($$NLNumberFn)) {
                    representation = cycl_utilities.formula_arg2(representation, UNPROVIDED);
                } else
                    if (functor.eql($$NLQuantFn) || functor.eql($$NLQuantFn_3)) {
                        if (cycl_utilities.formula_arg1(representation, UNPROVIDED).isList() && cycl_utilities.formula_arg0(cycl_utilities.formula_arg1(representation, UNPROVIDED)).eql($$NumericalQuant_NLAttrFn)) {
                            final SubLObject number = cycl_utilities.formula_arg1(cycl_utilities.formula_arg1(representation, UNPROVIDED), UNPROVIDED);
                            components = cons(list($$GroupOfCardinalityFn, $rkf_uttrdr_marker$.getGlobalValue(), number), components);
                        }
                        representation = cycl_utilities.formula_arg2(representation, UNPROVIDED);
                    } else
                        if (NIL != parsing_utilities.nl_tag_fnP(functor, UNPROVIDED)) {
                            representation = cycl_utilities.formula_arg2(representation, UNPROVIDED);
                        } else {
                            components = cons(representation, components);
                            done = T;
                        }


            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        while (NIL != components) {
            final SubLObject item = components.first();
            if (NIL != interpretation) {
                interpretation = subst(interpretation, $rkf_uttrdr_marker$.getGlobalValue(), item, UNPROVIDED, UNPROVIDED);
            } else {
                interpretation = item;
            }
            components = components.rest();
        } 
        return interpretation;
    }

    public static final SubLObject rkf_uttrdr_perform_parsing_alt(SubLObject text, SubLObject category, SubLObject parsing_mt, SubLObject domain_mt) {
        {
            SubLObject pmg = rkf_uttrdr_find_parse_module_group(category);
            SubLObject parse_result = NIL;
            SubLObject parses = NIL;
            if (NIL != pmg) {
                parse_result = rkf_uttrdr_parsing_in_category(text, pmg, parsing_mt, domain_mt);
                if (NIL == rkf_uttrdr_are_nltags_allowedP()) {
                    rkf_uttrdr_reconsider_parse_result_semantics(parse_result, domain_mt);
                }
                parses = rkf_uttrdr_generate_parse_from_parse_result(parse_result);
            }
            return parses;
        }
    }

    public static SubLObject rkf_uttrdr_perform_parsing(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLObject pmg = rkf_uttrdr_find_parse_module_group(category);
        SubLObject parse_result = NIL;
        SubLObject parses = NIL;
        if (NIL != pmg) {
            parse_result = rkf_uttrdr_parsing_in_category(text, pmg, parsing_mt, domain_mt);
            if (NIL == rkf_uttrdr_are_nltags_allowedP()) {
                rkf_uttrdr_reconsider_parse_result_semantics(parse_result, domain_mt);
            }
            parses = rkf_uttrdr_generate_parse_from_parse_result(parse_result);
        }
        return parses;
    }

    /**
     * Given that we are after maximally terse expression, see if we can eliminate anything else
     * on semantic grounds.
     *
     * @unknown Do better here.
     */
    @LispMethod(comment = "Given that we are after maximally terse expression, see if we can eliminate anything else\r\non semantic grounds.\r\n\r\n@unknown Do better here.\nGiven that we are after maximally terse expression, see if we can eliminate anything else\non semantic grounds.")
    public static final SubLObject rkf_uttrdr_reconsider_parse_result_semantics_alt(SubLObject parse_result, SubLObject domain_mt) {
        return parse_result;
    }

    @LispMethod(comment = "Given that we are after maximally terse expression, see if we can eliminate anything else\r\non semantic grounds.\r\n\r\n@unknown Do better here.\nGiven that we are after maximally terse expression, see if we can eliminate anything else\non semantic grounds.")
    public static SubLObject rkf_uttrdr_reconsider_parse_result_semantics(final SubLObject parse_result, final SubLObject domain_mt) {
        return parse_result;
    }

    public static final SubLObject rkf_uttrdr_parsing_in_category_alt(SubLObject text, SubLObject pmg, SubLObject parsing_mt, SubLObject domain_mt) {
        {
            SubLObject category = pmg_category(pmg);
            SubLObject parses = NIL;
            SubLObject tokenization = rkf_concept_harvester.rkf_ch_string_tokenize(text);
            SubLObject span = rkf_uttrdr_turn_tokens_into_span(tokenization);
            SubLObject full_span = cons($$TheList, span);
            parses = rkf_uttrd_parse_with_assistants(text, full_span, category, parsing_mt, domain_mt);
            if (NIL != parses) {
                {
                    SubLObject parse_result = new_parse_result(parses);
                    rkf_uttrdr_triage_results(parse_result, parsing_mt, domain_mt);
                    if (NIL == parse_result_emptyP(parse_result)) {
                        rkf_uttrdr_incomplete_constituents(parse_result, parsing_mt, domain_mt);
                        if (NIL == parse_result_emptyP(parse_result)) {
                            rkf_uttrdr_augment_constitutents(parse_result, domain_mt);
                            return parse_result;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject rkf_uttrdr_parsing_in_category(final SubLObject text, final SubLObject pmg, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLObject category = pmg_category(pmg);
        SubLObject parses = NIL;
        final SubLObject tokenization = rkf_concept_harvester.rkf_ch_string_tokenize(text);
        final SubLObject span = rkf_uttrdr_turn_tokens_into_span(tokenization);
        final SubLObject full_span = cons($$TheList, span);
        parses = rkf_uttrd_parse_with_assistants(text, full_span, category, parsing_mt, domain_mt);
        if (NIL != parses) {
            final SubLObject parse_result = new_parse_result(parses);
            rkf_uttrdr_triage_results(parse_result, parsing_mt, domain_mt);
            if (NIL == parse_result_emptyP(parse_result)) {
                rkf_uttrdr_incomplete_constituents(parse_result, parsing_mt, domain_mt);
                if (NIL == parse_result_emptyP(parse_result)) {
                    rkf_uttrdr_augment_constitutents(parse_result, domain_mt);
                    return parse_result;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject rkf_uttrd_parse_with_assistants_alt(SubLObject string, SubLObject span, SubLObject category, SubLObject parsing_mt, SubLObject domain_mt) {
        {
            SubLObject pmg = rkf_uttrdr_find_parse_module_group(category);
            SubLObject span_numbers = span.rest();
            SubLObject ranking = $most_positive_fixnum$.getGlobalValue();
            SubLObject parses = NIL;
            SubLObject doneP = NIL;
            if (NIL == pmg) {
                return NIL;
            }
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = rkf_uttrdr_compute_applicable_asisstants(pmg);
                    SubLObject pmd = NIL;
                    for (pmd = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pmd = csome_list_var.first()) {
                        if ((NIL != parses) && ranking.numL(pmd_resolved_quality(pmd))) {
                            doneP = T;
                        } else {
                            if ((NIL == parses) || ranking.numE(pmd_resolved_quality(pmd))) {
                                ranking = pmd_resolved_quality(pmd);
                                {
                                    SubLObject attempt = rkf_uttrdr_invoke_pmd(pmd, string, category, parsing_mt, domain_mt);
                                    if (NIL != attempt) {
                                        parses = rkf_uttrdr_merge_parse_results(parses, attempt);
                                    }
                                }
                            } else {
                                doneP = T;
                            }
                        }
                    }
                }
            }
            if (NIL != parses) {
                {
                    SubLObject result = NIL;
                    SubLObject cdolist_list_var = parses;
                    SubLObject parse = NIL;
                    for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse = cdolist_list_var.first()) {
                        {
                            SubLObject datum = parse;
                            SubLObject current = datum;
                            SubLObject relative_span = NIL;
                            SubLObject interpretations = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt190);
                            relative_span = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt190);
                            interpretations = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject new_span = iterative_template_parser.adjust_the_spans(relative_span, span_numbers, $sym191$IS_THIS_A_NUMERIC_SPAN_);
                                    SubLObject new_interps = iterative_template_parser.adjust_the_spans(interpretations, span_numbers, $sym192$IS_THIS_A_QUANT_FN_);
                                    SubLObject new_parse = list(new_span, new_interps);
                                    result = cons(new_parse, result);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt190);
                            }
                        }
                    }
                    parses = nreverse(result);
                }
            }
            return parses;
        }
    }

    public static SubLObject rkf_uttrd_parse_with_assistants(final SubLObject string, final SubLObject span, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLObject pmg = rkf_uttrdr_find_parse_module_group(category);
        final SubLObject span_numbers = span.rest();
        SubLObject ranking = $most_positive_fixnum$.getGlobalValue();
        SubLObject parses = NIL;
        SubLObject doneP = NIL;
        if (NIL == pmg) {
            return NIL;
        }
        if (NIL == doneP) {
            SubLObject csome_list_var = rkf_uttrdr_compute_applicable_asisstants(pmg);
            SubLObject pmd = NIL;
            pmd = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                if ((NIL != parses) && ranking.numL(pmd_resolved_quality(pmd))) {
                    doneP = T;
                } else
                    if ((NIL == parses) || ranking.numE(pmd_resolved_quality(pmd))) {
                        ranking = pmd_resolved_quality(pmd);
                        final SubLObject attempt = rkf_uttrdr_invoke_pmd(pmd, string, category, parsing_mt, domain_mt);
                        if (NIL != attempt) {
                            parses = rkf_uttrdr_merge_parse_results(parses, attempt);
                        }
                    } else {
                        doneP = T;
                    }

                csome_list_var = csome_list_var.rest();
                pmd = csome_list_var.first();
            } 
        }
        if (NIL != parses) {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = parses;
            SubLObject parse = NIL;
            parse = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = parse;
                SubLObject relative_span = NIL;
                SubLObject interpretations = NIL;
                destructuring_bind_must_consp(current, datum, $list199);
                relative_span = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list199);
                interpretations = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject new_span = iterative_template_parser.adjust_the_spans(relative_span, span_numbers, $sym200$IS_THIS_A_NUMERIC_SPAN_);
                    final SubLObject new_interps = iterative_template_parser.adjust_the_spans(interpretations, span_numbers, $sym201$IS_THIS_A_QUANT_FN_);
                    final SubLObject new_parse = list(new_span, new_interps);
                    result = cons(new_parse, result);
                } else {
                    cdestructuring_bind_error(datum, $list199);
                }
                cdolist_list_var = cdolist_list_var.rest();
                parse = cdolist_list_var.first();
            } 
            parses = nreverse(result);
        }
        return parses;
    }

    public static final SubLObject rkf_uttrdr_merge_parse_results_alt(SubLObject old_parses, SubLObject new_attempt) {
        if (NIL == old_parses) {
            return new_attempt;
        }
        {
            SubLObject table = dictionary.new_dictionary(EQUALP, UNPROVIDED);
            {
                SubLObject cdolist_list_var = new_attempt;
                SubLObject subpart = NIL;
                for (subpart = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subpart = cdolist_list_var.first()) {
                    {
                        SubLObject datum = subpart;
                        SubLObject current = datum;
                        SubLObject span = NIL;
                        SubLObject interpretations = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt0);
                        span = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt0);
                        interpretations = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            dictionary.dictionary_enter(table, span, interpretations);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = old_parses;
                SubLObject subpart = NIL;
                for (subpart = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subpart = cdolist_list_var.first()) {
                    {
                        SubLObject datum = subpart;
                        SubLObject current = datum;
                        SubLObject span = NIL;
                        SubLObject interpretations = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt0);
                        span = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt0);
                        interpretations = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject new_interpretations = dictionary.dictionary_lookup(table, span, UNPROVIDED);
                                if (NIL != new_interpretations) {
                                    {
                                        SubLObject cdolist_list_var_6 = new_interpretations;
                                        SubLObject interpretation = NIL;
                                        for (interpretation = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , interpretation = cdolist_list_var_6.first()) {
                                            {
                                                SubLObject item_var = interpretation;
                                                if (NIL == member(item_var, interpretations, EQUALP, symbol_function(IDENTITY))) {
                                                    interpretations = cons(item_var, interpretations);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            dictionary.dictionary_enter(table, span, interpretations);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                    }
                }
            }
            return rkf_textproc_dictionary_to_parse(table);
        }
    }

    public static SubLObject rkf_uttrdr_merge_parse_results(final SubLObject old_parses, final SubLObject new_attempt) {
        if (NIL == old_parses) {
            return new_attempt;
        }
        final SubLObject table = dictionary.new_dictionary(EQUALP, UNPROVIDED);
        SubLObject cdolist_list_var = new_attempt;
        SubLObject subpart = NIL;
        subpart = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = subpart;
            SubLObject span = NIL;
            SubLObject interpretations = NIL;
            destructuring_bind_must_consp(current, datum, $list0);
            span = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list0);
            interpretations = current.first();
            current = current.rest();
            if (NIL == current) {
                dictionary.dictionary_enter(table, span, interpretations);
            } else {
                cdestructuring_bind_error(datum, $list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subpart = cdolist_list_var.first();
        } 
        cdolist_list_var = old_parses;
        subpart = NIL;
        subpart = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = subpart;
            SubLObject span = NIL;
            SubLObject interpretations = NIL;
            destructuring_bind_must_consp(current, datum, $list0);
            span = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list0);
            interpretations = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject new_interpretations = dictionary.dictionary_lookup(table, span, UNPROVIDED);
                if (NIL != new_interpretations) {
                    SubLObject cdolist_list_var_$4 = new_interpretations;
                    SubLObject interpretation = NIL;
                    interpretation = cdolist_list_var_$4.first();
                    while (NIL != cdolist_list_var_$4) {
                        final SubLObject item_var = interpretation;
                        if (NIL == member(item_var, interpretations, EQUALP, symbol_function(IDENTITY))) {
                            interpretations = cons(item_var, interpretations);
                        }
                        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                        interpretation = cdolist_list_var_$4.first();
                    } 
                }
                dictionary.dictionary_enter(table, span, interpretations);
            } else {
                cdestructuring_bind_error(datum, $list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subpart = cdolist_list_var.first();
        } 
        return rkf_textproc_dictionary_to_parse(table);
    }

    public static final SubLObject rkf_uttrdr_compute_applicable_asisstants_alt(SubLObject pmg) {
        return pmg_ordered_tools(pmg);
    }

    public static SubLObject rkf_uttrdr_compute_applicable_asisstants(final SubLObject pmg) {
        return pmg_ordered_tools(pmg);
    }

    public static final SubLObject rkf_uttrdr_triage_results_alt(SubLObject parse_result, SubLObject parsing_mt, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constituents = parse_result_constituents(parse_result);
                SubLObject eliminations = parse_result_eliminated(parse_result);
                SubLObject issues = parse_result_problems(parse_result);
                thread.resetMultipleValues();
                {
                    SubLObject modifications = rkf_uttrdr_separate_wheat_and_chaffe(parse_result, domain_mt);
                    SubLObject dead_ends = thread.secondMultipleValue();
                    SubLObject open_issues = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject cdolist_list_var = dead_ends;
                        SubLObject dead_end = NIL;
                        for (dead_end = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dead_end = cdolist_list_var.first()) {
                            {
                                SubLObject datum = dead_end;
                                SubLObject current = datum;
                                SubLObject span = NIL;
                                SubLObject interpretations = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt0);
                                span = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt0);
                                interpretations = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    dictionary.dictionary_enter(eliminations, span, interpretations);
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt0);
                                }
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = modifications;
                        SubLObject modification = NIL;
                        for (modification = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , modification = cdolist_list_var.first()) {
                            {
                                SubLObject datum = modification;
                                SubLObject current = datum;
                                SubLObject span = NIL;
                                SubLObject interpretations = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt0);
                                span = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt0);
                                interpretations = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL == interpretations) {
                                        dictionary.dictionary_remove(constituents, span);
                                    } else {
                                        dictionary.dictionary_enter(constituents, span, interpretations);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt0);
                                }
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = open_issues;
                        SubLObject open_issue = NIL;
                        for (open_issue = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , open_issue = cdolist_list_var.first()) {
                            {
                                SubLObject datum = open_issue;
                                SubLObject current = datum;
                                SubLObject span = NIL;
                                SubLObject problems = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt193);
                                span = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt193);
                                problems = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    {
                                        SubLObject cdolist_list_var_7 = problems;
                                        SubLObject problem = NIL;
                                        for (problem = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , problem = cdolist_list_var_7.first()) {
                                            {
                                                SubLObject cdolist_list_var_8 = problem;
                                                SubLObject issue = NIL;
                                                for (issue = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , issue = cdolist_list_var_8.first()) {
                                                    {
                                                        SubLObject datum_9 = issue;
                                                        SubLObject current_10 = datum_9;
                                                        SubLObject surrogate = NIL;
                                                        SubLObject interpretation = NIL;
                                                        destructuring_bind_must_consp(current_10, datum_9, $list_alt194);
                                                        surrogate = current_10.first();
                                                        current_10 = current_10.rest();
                                                        destructuring_bind_must_consp(current_10, datum_9, $list_alt194);
                                                        interpretation = current_10.first();
                                                        current_10 = current_10.rest();
                                                        if (NIL == current_10) {
                                                            {
                                                                SubLObject known = dictionary.dictionary_lookup(issues, surrogate, UNPROVIDED);
                                                                known = cons(list(interpretation, span), known);
                                                                dictionary.dictionary_enter(issues, surrogate, known);
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum_9, $list_alt194);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt193);
                                }
                            }
                        }
                    }
                }
                return parse_result;
            }
        }
    }

    public static SubLObject rkf_uttrdr_triage_results(final SubLObject parse_result, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constituents = parse_result_constituents(parse_result);
        final SubLObject eliminations = parse_result_eliminated(parse_result);
        final SubLObject issues = parse_result_problems(parse_result);
        thread.resetMultipleValues();
        final SubLObject modifications = rkf_uttrdr_separate_wheat_and_chaffe(parse_result, domain_mt);
        final SubLObject dead_ends = thread.secondMultipleValue();
        final SubLObject open_issues = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = dead_ends;
        SubLObject dead_end = NIL;
        dead_end = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = dead_end;
            SubLObject span = NIL;
            SubLObject interpretations = NIL;
            destructuring_bind_must_consp(current, datum, $list0);
            span = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list0);
            interpretations = current.first();
            current = current.rest();
            if (NIL == current) {
                dictionary.dictionary_enter(eliminations, span, interpretations);
            } else {
                cdestructuring_bind_error(datum, $list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            dead_end = cdolist_list_var.first();
        } 
        cdolist_list_var = modifications;
        SubLObject modification = NIL;
        modification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = modification;
            SubLObject span = NIL;
            SubLObject interpretations = NIL;
            destructuring_bind_must_consp(current, datum, $list0);
            span = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list0);
            interpretations = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == interpretations) {
                    dictionary.dictionary_remove(constituents, span);
                } else {
                    dictionary.dictionary_enter(constituents, span, interpretations);
                }
            } else {
                cdestructuring_bind_error(datum, $list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            modification = cdolist_list_var.first();
        } 
        cdolist_list_var = open_issues;
        SubLObject open_issue = NIL;
        open_issue = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = open_issue;
            SubLObject span = NIL;
            SubLObject problems = NIL;
            destructuring_bind_must_consp(current, datum, $list202);
            span = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list202);
            problems = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$5 = problems;
                SubLObject problem = NIL;
                problem = cdolist_list_var_$5.first();
                while (NIL != cdolist_list_var_$5) {
                    SubLObject cdolist_list_var_$6 = problem;
                    SubLObject issue = NIL;
                    issue = cdolist_list_var_$6.first();
                    while (NIL != cdolist_list_var_$6) {
                        SubLObject current_$8;
                        final SubLObject datum_$7 = current_$8 = issue;
                        SubLObject surrogate = NIL;
                        SubLObject interpretation = NIL;
                        destructuring_bind_must_consp(current_$8, datum_$7, $list203);
                        surrogate = current_$8.first();
                        current_$8 = current_$8.rest();
                        destructuring_bind_must_consp(current_$8, datum_$7, $list203);
                        interpretation = current_$8.first();
                        current_$8 = current_$8.rest();
                        if (NIL == current_$8) {
                            SubLObject known = dictionary.dictionary_lookup(issues, surrogate, UNPROVIDED);
                            known = cons(list(interpretation, span), known);
                            dictionary.dictionary_enter(issues, surrogate, known);
                        } else {
                            cdestructuring_bind_error(datum_$7, $list203);
                        }
                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                        issue = cdolist_list_var_$6.first();
                    } 
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    problem = cdolist_list_var_$5.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list202);
            }
            cdolist_list_var = cdolist_list_var.rest();
            open_issue = cdolist_list_var.first();
        } 
        return parse_result;
    }

    /**
     * Moving through the parse results, sort out the cases where there is no way that
     * the continuation of the parsing can lead to any results. Divy up those that have
     * and can be amended and remember any other manipulations on the parse tree.
     */
    @LispMethod(comment = "Moving through the parse results, sort out the cases where there is no way that\r\nthe continuation of the parsing can lead to any results. Divy up those that have\r\nand can be amended and remember any other manipulations on the parse tree.\nMoving through the parse results, sort out the cases where there is no way that\nthe continuation of the parsing can lead to any results. Divy up those that have\nand can be amended and remember any other manipulations on the parse tree.")
    public static final SubLObject rkf_uttrdr_separate_wheat_and_chaffe_alt(SubLObject parse_result, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject modifications = NIL;
                SubLObject dead_ends = NIL;
                SubLObject open_issues = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(parse_result_constituents(parse_result)));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject interpretations = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject keepers = NIL;
                            SubLObject weepers = NIL;
                            SubLObject problems = NIL;
                            SubLObject cdolist_list_var = interpretations;
                            SubLObject interpretation = NIL;
                            for (interpretation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , interpretation = cdolist_list_var.first()) {
                                {
                                    SubLObject surrogates = list_utilities.tree_gather(interpretation, RKF_CH_PARSING_SURROGATE_P, EQUALP, UNPROVIDED, UNPROVIDED);
                                    SubLObject doneP = NIL;
                                    SubLObject problem = NIL;
                                    doneP = NIL;
                                    problem = NIL;
                                    if (NIL == doneP) {
                                        {
                                            SubLObject csome_list_var = surrogates;
                                            SubLObject surrogate = NIL;
                                            for (surrogate = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , surrogate = csome_list_var.first()) {
                                                {
                                                    SubLObject datum = surrogate;
                                                    SubLObject current = datum;
                                                    SubLObject functor = NIL;
                                                    SubLObject string = NIL;
                                                    SubLObject span_11 = NIL;
                                                    SubLObject category = NIL;
                                                    SubLObject constraint = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt196);
                                                    functor = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt196);
                                                    string = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt196);
                                                    span_11 = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt196);
                                                    category = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt196);
                                                    constraint = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        if (NIL != parse_result_known_constituentP(parse_result, span_11)) {
                                                            if (NIL == rkf_uttrdr_sanity_check_arg(interpretation, surrogate, parse_result, domain_mt)) {
                                                                doneP = T;
                                                            }
                                                        } else {
                                                            if (NIL != iterative_template_parser.nominal_categoryP(category)) {
                                                            } else {
                                                                if (NIL != subl_promotions.memberP(category, rkf_uttrdr_all_supported_categories(), UNPROVIDED, UNPROVIDED)) {
                                                                    problem = cons(list(surrogate, interpretation), problem);
                                                                } else {
                                                                    doneP = T;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt196);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (NIL != doneP) {
                                        weepers = cons(interpretation, weepers);
                                    } else {
                                        if (NIL != problem) {
                                            problems = cons(problem, problems);
                                        } else {
                                            keepers = cons(interpretation, keepers);
                                        }
                                    }
                                }
                            }
                            if (NIL != problems) {
                                open_issues = cons(list(span, problems), open_issues);
                            }
                            if (NIL != weepers) {
                                dead_ends = cons(list(span, weepers), dead_ends);
                                modifications = cons(list(span, keepers), modifications);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return values(modifications, dead_ends, open_issues);
            }
        }
    }

    @LispMethod(comment = "Moving through the parse results, sort out the cases where there is no way that\r\nthe continuation of the parsing can lead to any results. Divy up those that have\r\nand can be amended and remember any other manipulations on the parse tree.\nMoving through the parse results, sort out the cases where there is no way that\nthe continuation of the parsing can lead to any results. Divy up those that have\nand can be amended and remember any other manipulations on the parse tree.")
    public static SubLObject rkf_uttrdr_separate_wheat_and_chaffe(final SubLObject parse_result, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject modifications = NIL;
        SubLObject dead_ends = NIL;
        SubLObject open_issues = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(parse_result_constituents(parse_result))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject interpretations = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject keepers = NIL;
            SubLObject weepers = NIL;
            SubLObject problems = NIL;
            SubLObject cdolist_list_var = interpretations;
            SubLObject interpretation = NIL;
            interpretation = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject surrogates = list_utilities.tree_gather(interpretation, RKF_CH_PARSING_SURROGATE_P, EQUALP, UNPROVIDED, UNPROVIDED);
                SubLObject doneP = NIL;
                SubLObject problem = NIL;
                doneP = NIL;
                problem = NIL;
                if (NIL == doneP) {
                    SubLObject csome_list_var = surrogates;
                    SubLObject surrogate = NIL;
                    surrogate = csome_list_var.first();
                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                        SubLObject current;
                        final SubLObject datum = current = surrogate;
                        SubLObject functor = NIL;
                        SubLObject string = NIL;
                        SubLObject span_$9 = NIL;
                        SubLObject category = NIL;
                        SubLObject constraint = NIL;
                        destructuring_bind_must_consp(current, datum, $list205);
                        functor = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list205);
                        string = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list205);
                        span_$9 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list205);
                        category = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list205);
                        constraint = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != parse_result_known_constituentP(parse_result, span_$9)) {
                                if (NIL == rkf_uttrdr_sanity_check_arg(interpretation, surrogate, parse_result, domain_mt)) {
                                    doneP = T;
                                }
                            } else
                                if (NIL == iterative_template_parser.nominal_categoryP(category)) {
                                    if (NIL != subl_promotions.memberP(category, rkf_uttrdr_all_supported_categories(), UNPROVIDED, UNPROVIDED)) {
                                        problem = cons(list(surrogate, interpretation), problem);
                                    } else {
                                        doneP = T;
                                    }
                                }

                        } else {
                            cdestructuring_bind_error(datum, $list205);
                        }
                        csome_list_var = csome_list_var.rest();
                        surrogate = csome_list_var.first();
                    } 
                }
                if (NIL != doneP) {
                    weepers = cons(interpretation, weepers);
                } else
                    if (NIL != problem) {
                        problems = cons(problem, problems);
                    } else {
                        keepers = cons(interpretation, keepers);
                    }

                cdolist_list_var = cdolist_list_var.rest();
                interpretation = cdolist_list_var.first();
            } 
            if (NIL != problems) {
                open_issues = cons(list(span, problems), open_issues);
            }
            if (NIL != weepers) {
                dead_ends = cons(list(span, weepers), dead_ends);
                modifications = cons(list(span, keepers), modifications);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return values(modifications, dead_ends, open_issues);
    }

    /**
     * stronger validity tests could go here
     */
    @LispMethod(comment = "stronger validity tests could go here")
    public static final SubLObject rkf_uttrdr_sanity_check_arg_alt(SubLObject interpretation, SubLObject surrogate, SubLObject parse_result, SubLObject domain_mt) {
        return T;
    }

    @LispMethod(comment = "stronger validity tests could go here")
    public static SubLObject rkf_uttrdr_sanity_check_arg(final SubLObject interpretation, final SubLObject surrogate, final SubLObject parse_result, final SubLObject domain_mt) {
        return T;
    }

    public static final SubLObject rkf_uttrdr_incomplete_constituents_alt(SubLObject parse_result, SubLObject parsing_mt, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == parse_result_open_issuesP(parse_result)) {
                return parse_result;
            }
            {
                SubLObject problems = parse_result_problems(parse_result);
                SubLObject solutions = parse_result_solutions(parse_result);
                SubLObject failures = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(problems));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject surrogate = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject occurrences = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject datum = surrogate;
                            SubLObject current = datum;
                            SubLObject functor = NIL;
                            SubLObject string = NIL;
                            SubLObject span = NIL;
                            SubLObject category = NIL;
                            SubLObject constraint = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt196);
                            functor = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt196);
                            string = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt196);
                            span = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt196);
                            category = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt196);
                            constraint = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject results = rkf_uttrd_parse_with_assistants(string, span, category, parsing_mt, domain_mt);
                                    if (NIL != results) {
                                        {
                                            SubLObject adjusted_result = NIL;
                                            SubLObject cdolist_list_var = results;
                                            SubLObject result = NIL;
                                            for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                                                {
                                                    SubLObject result_w_adjusted_spans = iterative_template_parser.adjust_the_spans(result, span, UNPROVIDED);
                                                    SubLObject result_w_adjusted_quants = iterative_template_parser.adjust_the_spans(result_w_adjusted_spans, span, $sym192$IS_THIS_A_QUANT_FN_);
                                                    SubLObject item_var = result_w_adjusted_quants;
                                                    if (NIL == member(item_var, adjusted_result, EQUALP, symbol_function(IDENTITY))) {
                                                        adjusted_result = cons(item_var, adjusted_result);
                                                    }
                                                }
                                            }
                                            dictionary.dictionary_enter(solutions, surrogate, adjusted_result);
                                        }
                                    } else {
                                        failures = cons(surrogate, failures);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt196);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                rkf_uttrdr_remove_incomplete_failed(parse_result, failures);
            }
            return parse_result;
        }
    }

    public static SubLObject rkf_uttrdr_incomplete_constituents(final SubLObject parse_result, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == parse_result_open_issuesP(parse_result)) {
            return parse_result;
        }
        final SubLObject problems = parse_result_problems(parse_result);
        final SubLObject solutions = parse_result_solutions(parse_result);
        SubLObject failures = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(problems)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject surrogate = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject occurrences = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject current;
            final SubLObject datum = current = surrogate;
            SubLObject functor = NIL;
            SubLObject string = NIL;
            SubLObject span = NIL;
            SubLObject category = NIL;
            SubLObject constraint = NIL;
            destructuring_bind_must_consp(current, datum, $list205);
            functor = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list205);
            string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list205);
            span = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list205);
            category = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list205);
            constraint = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject results = rkf_uttrd_parse_with_assistants(string, span, category, parsing_mt, domain_mt);
                if (NIL != results) {
                    SubLObject adjusted_result = NIL;
                    SubLObject cdolist_list_var = results;
                    SubLObject result = NIL;
                    result = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject result_w_adjusted_spans = iterative_template_parser.adjust_the_spans(result, span, UNPROVIDED);
                        final SubLObject item_var;
                        final SubLObject result_w_adjusted_quants = item_var = iterative_template_parser.adjust_the_spans(result_w_adjusted_spans, span, $sym201$IS_THIS_A_QUANT_FN_);
                        if (NIL == member(item_var, adjusted_result, EQUALP, symbol_function(IDENTITY))) {
                            adjusted_result = cons(item_var, adjusted_result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        result = cdolist_list_var.first();
                    } 
                    dictionary.dictionary_enter(solutions, surrogate, adjusted_result);
                } else {
                    failures = cons(surrogate, failures);
                }
            } else {
                cdestructuring_bind_error(datum, $list205);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        rkf_uttrdr_remove_incomplete_failed(parse_result, failures);
        return parse_result;
    }

    public static final SubLObject rkf_uttrdr_remove_incomplete_failed_alt(SubLObject parse_result, SubLObject failures) {
        {
            SubLObject problems = parse_result_problems(parse_result);
            SubLObject eliminations = parse_result_eliminated(parse_result);
            SubLObject cdolist_list_var = failures;
            SubLObject failure = NIL;
            for (failure = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , failure = cdolist_list_var.first()) {
                {
                    SubLObject occurences = dictionary.dictionary_lookup(problems, failure, UNPROVIDED);
                    SubLObject cdolist_list_var_12 = occurences;
                    SubLObject occurrence = NIL;
                    for (occurrence = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , occurrence = cdolist_list_var_12.first()) {
                        {
                            SubLObject datum = occurrence;
                            SubLObject current = datum;
                            SubLObject interpretation = NIL;
                            SubLObject span = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt197);
                            interpretation = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt197);
                            span = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject goners = dictionary.dictionary_lookup(eliminations, span, UNPROVIDED);
                                    SubLObject item_var = interpretation;
                                    if (NIL == member(item_var, goners, EQUAL, symbol_function(IDENTITY))) {
                                        goners = cons(item_var, goners);
                                    }
                                    dictionary.dictionary_enter(eliminations, span, goners);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt197);
                            }
                        }
                    }
                }
                dictionary.dictionary_remove(problems, failure);
            }
        }
        return parse_result;
    }

    public static SubLObject rkf_uttrdr_remove_incomplete_failed(final SubLObject parse_result, final SubLObject failures) {
        final SubLObject problems = parse_result_problems(parse_result);
        final SubLObject eliminations = parse_result_eliminated(parse_result);
        SubLObject cdolist_list_var = failures;
        SubLObject failure = NIL;
        failure = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$10;
            final SubLObject occurences = cdolist_list_var_$10 = dictionary.dictionary_lookup(problems, failure, UNPROVIDED);
            SubLObject occurrence = NIL;
            occurrence = cdolist_list_var_$10.first();
            while (NIL != cdolist_list_var_$10) {
                SubLObject current;
                final SubLObject datum = current = occurrence;
                SubLObject interpretation = NIL;
                SubLObject span = NIL;
                destructuring_bind_must_consp(current, datum, $list206);
                interpretation = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list206);
                span = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject goners = dictionary.dictionary_lookup(eliminations, span, UNPROVIDED);
                    final SubLObject item_var = interpretation;
                    if (NIL == member(item_var, goners, EQUAL, symbol_function(IDENTITY))) {
                        goners = cons(item_var, goners);
                    }
                    dictionary.dictionary_enter(eliminations, span, goners);
                } else {
                    cdestructuring_bind_error(datum, $list206);
                }
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                occurrence = cdolist_list_var_$10.first();
            } 
            dictionary.dictionary_remove(problems, failure);
            cdolist_list_var = cdolist_list_var.rest();
            failure = cdolist_list_var.first();
        } 
        return parse_result;
    }

    public static final SubLObject rkf_uttrdr_augment_constitutents_alt(SubLObject parse_result, SubLObject domain_mt) {
        rkf_uttrdr_apply_solutions_to_constituents(parse_result);
        rkf_uttrdr_potentially_resolve_icycl(parse_result, domain_mt);
        return parse_result;
    }

    public static SubLObject rkf_uttrdr_augment_constitutents(final SubLObject parse_result, final SubLObject domain_mt) {
        rkf_uttrdr_apply_solutions_to_constituents(parse_result);
        rkf_uttrdr_potentially_resolve_icycl(parse_result, domain_mt);
        return parse_result;
    }

    public static final SubLObject rkf_uttrdr_apply_solutions_to_constituents_alt(SubLObject parse_result) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != parse_result_known_solutionsP(parse_result)) {
                {
                    SubLObject solutions = parse_result_solutions(parse_result);
                    SubLObject constituents = parse_result_constituents(parse_result);
                    SubLObject problems = parse_result_problems(parse_result);
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(solutions));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject surrogate = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject parses = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            dictionary.dictionary_remove(problems, surrogate);
                            {
                                SubLObject cdolist_list_var = parses;
                                SubLObject parse = NIL;
                                for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse = cdolist_list_var.first()) {
                                    {
                                        SubLObject datum = parse;
                                        SubLObject current = datum;
                                        SubLObject span = NIL;
                                        SubLObject interpretations = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt0);
                                        span = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt0);
                                        interpretations = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            {
                                                SubLObject existing = dictionary.dictionary_lookup(constituents, span, UNPROVIDED);
                                                SubLObject cdolist_list_var_13 = interpretations;
                                                SubLObject interpretation = NIL;
                                                for (interpretation = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , interpretation = cdolist_list_var_13.first()) {
                                                    {
                                                        SubLObject item_var = interpretation;
                                                        if (NIL == member(item_var, existing, EQUALP, symbol_function(IDENTITY))) {
                                                            existing = cons(item_var, existing);
                                                        }
                                                    }
                                                }
                                                dictionary.dictionary_enter(constituents, span, existing);
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt0);
                                        }
                                    }
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    dictionary.clear_dictionary(parse_result_solutions(parse_result));
                }
            }
            return parse_result;
        }
    }

    public static SubLObject rkf_uttrdr_apply_solutions_to_constituents(final SubLObject parse_result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != parse_result_known_solutionsP(parse_result)) {
            final SubLObject solutions = parse_result_solutions(parse_result);
            final SubLObject constituents = parse_result_constituents(parse_result);
            final SubLObject problems = parse_result_problems(parse_result);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(solutions)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject surrogate = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject parses = thread.secondMultipleValue();
                thread.resetMultipleValues();
                dictionary.dictionary_remove(problems, surrogate);
                SubLObject cdolist_list_var = parses;
                SubLObject parse = NIL;
                parse = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = parse;
                    SubLObject span = NIL;
                    SubLObject interpretations = NIL;
                    destructuring_bind_must_consp(current, datum, $list0);
                    span = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list0);
                    interpretations = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject existing = dictionary.dictionary_lookup(constituents, span, UNPROVIDED);
                        SubLObject cdolist_list_var_$11 = interpretations;
                        SubLObject interpretation = NIL;
                        interpretation = cdolist_list_var_$11.first();
                        while (NIL != cdolist_list_var_$11) {
                            final SubLObject item_var = interpretation;
                            if (NIL == member(item_var, existing, EQUALP, symbol_function(IDENTITY))) {
                                existing = cons(item_var, existing);
                            }
                            cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                            interpretation = cdolist_list_var_$11.first();
                        } 
                        dictionary.dictionary_enter(constituents, span, existing);
                    } else {
                        cdestructuring_bind_error(datum, $list0);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    parse = cdolist_list_var.first();
                } 
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            dictionary.clear_dictionary(parse_result_solutions(parse_result));
        }
        return parse_result;
    }

    public static final SubLObject rkf_uttrdr_potentially_resolve_icycl_alt(SubLObject parse_result, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == rkf_uttrdr_are_nltags_allowedP()) {
                {
                    SubLObject solutions = parse_result_solutions(parse_result);
                    SubLObject constituents = parse_result_constituents(parse_result);
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(constituents));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject interpretations = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                dictionary.dictionary_enter(solutions, span, rkf_uttrdr_interpret_nltagfn_terms(interpretations, domain_mt));
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(solutions));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject interpretations = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                dictionary.dictionary_enter(constituents, span, interpretations);
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                }
            }
            return parse_result;
        }
    }

    public static SubLObject rkf_uttrdr_potentially_resolve_icycl(final SubLObject parse_result, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == rkf_uttrdr_are_nltags_allowedP()) {
            final SubLObject solutions = parse_result_solutions(parse_result);
            final SubLObject constituents = parse_result_constituents(parse_result);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(constituents)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject interpretations = thread.secondMultipleValue();
                thread.resetMultipleValues();
                dictionary.dictionary_enter(solutions, span, rkf_uttrdr_interpret_nltagfn_terms(interpretations, domain_mt));
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(solutions)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject interpretations = thread.secondMultipleValue();
                thread.resetMultipleValues();
                dictionary.dictionary_enter(constituents, span, interpretations);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return parse_result;
    }

    public static final SubLObject rkf_uttrdr_generate_parse_from_parse_result_alt(SubLObject parse_result) {
        if (NIL != parse_result) {
            {
                SubLObject constituents = parse_result_constituents(parse_result);
                if (NIL != dictionary.dictionary_p(constituents)) {
                    return rkf_textproc_dictionary_to_parse(constituents);
                }
            }
        }
        return NIL;
    }

    public static SubLObject rkf_uttrdr_generate_parse_from_parse_result(final SubLObject parse_result) {
        if (NIL != parse_result) {
            final SubLObject constituents = parse_result_constituents(parse_result);
            if (NIL != dictionary.dictionary_p(constituents)) {
                return rkf_textproc_dictionary_to_parse(constituents);
            }
        }
        return NIL;
    }

    public static final SubLObject rkf_uttrdr_order_parses_alt(SubLObject item_a, SubLObject item_b) {
        {
            SubLObject span_a = item_a.first();
            SubLObject span_b = item_b.first();
            SubLObject length_a = length(span_a);
            SubLObject length_b = length(span_b);
            if (length_a.numL(length_b)) {
                return NIL;
            } else {
                if (length_a.numG(length_b)) {
                    return T;
                }
            }
            {
                SubLObject elem_a = NIL;
                SubLObject elem_b = NIL;
                for (elem_a = span_a.first(), elem_b = span_b.first(); true; elem_a = span_a.first() , elem_b = span_b.first()) {
                    if (elem_a.numL(elem_b)) {
                        return T;
                    } else {
                        if (elem_a.numG(elem_b)) {
                            return NIL;
                        }
                    }
                    span_a = span_a.rest();
                    span_b = span_b.rest();
                }
            }
        }
    }

    public static SubLObject rkf_uttrdr_order_parses(final SubLObject item_a, final SubLObject item_b) {
        SubLObject span_a = item_a.first();
        SubLObject span_b = item_b.first();
        final SubLObject length_a = length(span_a);
        final SubLObject length_b = length(span_b);
        if (length_a.numL(length_b)) {
            return NIL;
        }
        if (length_a.numG(length_b)) {
            return T;
        }
        SubLObject elem_a;
        SubLObject elem_b;
        for (elem_a = NIL, elem_b = NIL, elem_a = span_a.first(), elem_b = span_b.first(); !elem_a.numL(elem_b); elem_a = span_a.first() , elem_b = span_b.first()) {
            if (elem_a.numG(elem_b)) {
                return NIL;
            }
            span_a = span_a.rest();
            span_b = span_b.rest();
        }
        return T;
    }

    public static final SubLObject cycl_of_possibly_itp_semantics_alt(SubLObject v_term) {
        return NIL != rtp_constituent_weeders.itp_semantics_p(v_term) ? ((SubLObject) (rtp_constituent_weeders.itp_semantics_cycl(v_term))) : v_term;
    }

    public static SubLObject cycl_of_possibly_itp_semantics(final SubLObject v_term) {
        return NIL != rtp_constituent_weeders.itp_semantics_p(v_term) ? rtp_constituent_weeders.itp_semantics_cycl(v_term) : v_term;
    }

    /**
     * This function returns all the declarative (statement) parses for a given sentence.  It returns full
     * CycL sentences, but does no wff-checking of the results.
     *
     * @param SENTENCE
    string
     * 		
     * @param MT
    microtheory
     * 		
     * @param PROPERTIES
    property-listp
     * 		
     */
    @LispMethod(comment = "This function returns all the declarative (statement) parses for a given sentence.  It returns full\r\nCycL sentences, but does no wff-checking of the results.\r\n\r\n@param SENTENCE\nstring\r\n\t\t\r\n@param MT\nmicrotheory\r\n\t\t\r\n@param PROPERTIES\nproperty-listp\nThis function returns all the declarative (statement) parses for a given sentence.  It returns full\nCycL sentences, but does no wff-checking of the results.")
    public static final SubLObject parse_a_sentence_completely_alt(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sentence, STRINGP);
            SubLTrampolineFile.checkType(mt, $sym198$HLMT_);
            SubLTrampolineFile.checkType(v_properties, PROPERTY_LIST_P);
            v_properties = list_utilities.maybe_putf(v_properties, $STRENGTHEN_, T);
            v_properties = list_utilities.maybe_putf(v_properties, $MULTIPLE_QUANTIFICATIONS, NIL);
            v_properties = list_utilities.maybe_putf(v_properties, $kw202$WFF_CHECK_, NIL);
            v_properties = list_utilities.maybe_putf(v_properties, $SEMANTIC_MT, mt);
            v_properties = list_utilities.maybe_putf(v_properties, $PARSING_MT, mt);
            v_properties = putf(v_properties, $FORCE, $DECLARATIVE);
            {
                SubLObject iterator = parsing_utilities.new_parse_iterator(sentence, v_properties);
                SubLObject result = NIL;
                SubLObject v_memoization_state = reformulator_datastructures.find_or_create_reformulator_memoization_state();
                SubLTrampolineFile.checkType(v_memoization_state, MEMOIZATION_STATE_P);
                {
                    SubLObject _prev_bind_0 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding(thread);
                    try {
                        reformulator_datastructures.$reformulator_memoization_state$.bind(v_memoization_state, thread);
                        {
                            SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue(thread);
                            {
                                SubLObject _prev_bind_0_14 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                        Errors.error($str_alt208$Invalid_attempt_to_reuse_memoizat);
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            while (NIL == iteration.iteration_done(iterator)) {
                                                {
                                                    SubLObject parse_result = iteration.iteration_next(iterator);
                                                    if (NIL != cycl_grammar.cycl_sentence_p(parse_result)) {
                                                        result = cons(parse_result, result);
                                                    }
                                                }
                                            } 
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_15, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_14, thread);
                                }
                            }
                        }
                    } finally {
                        reformulator_datastructures.$reformulator_memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "This function returns all the declarative (statement) parses for a given sentence.  It returns full\r\nCycL sentences, but does no wff-checking of the results.\r\n\r\n@param SENTENCE\n\t\tstring\r\n\t\t\r\n@param MT\n\t\tmicrotheory\r\n\t\t\r\n@param PROPERTIES\n\t\tproperty-listp\nThis function returns all the declarative (statement) parses for a given sentence.  It returns full\nCycL sentences, but does no wff-checking of the results.")
    public static SubLObject parse_a_sentence_completely(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = $$RKFParsingMt;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(sentence, STRINGP);
        SubLTrampolineFile.enforceType(mt, $sym207$HLMT_);
        SubLTrampolineFile.enforceType(v_properties, PROPERTY_LIST_P);
        v_properties = list_utilities.maybe_putf(v_properties, $STRENGTHEN_, T);
        v_properties = list_utilities.maybe_putf(v_properties, $MULTIPLE_QUANTIFICATIONS, NIL);
        v_properties = list_utilities.maybe_putf(v_properties, $kw211$WFF_CHECK_, NIL);
        v_properties = list_utilities.maybe_putf(v_properties, $SEMANTIC_MT, mt);
        v_properties = list_utilities.maybe_putf(v_properties, $PARSING_MT, mt);
        v_properties = putf(v_properties, $FORCE, $DECLARATIVE);
        final SubLObject iterator = parsing_utilities.new_parse_iterator(sentence, v_properties);
        SubLObject result = NIL;
        final SubLObject v_memoization_state = reformulator_datastructures.find_or_create_reformulator_memoization_state();
        assert NIL != memoization_state.memoization_state_p(v_memoization_state) : "! memoization_state.memoization_state_p(v_memoization_state) " + ("memoization_state.memoization_state_p(v_memoization_state) " + "CommonSymbols.NIL != memoization_state.memoization_state_p(v_memoization_state) ") + v_memoization_state;
        final SubLObject _prev_bind_0 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding(thread);
        try {
            reformulator_datastructures.$reformulator_memoization_state$.bind(v_memoization_state, thread);
            final SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$12 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    while (NIL == iteration.iteration_done(iterator)) {
                        final SubLObject parse_result = iteration.iteration_next(iterator);
                        if (NIL != cycl_grammar.cycl_sentence_p(parse_result)) {
                            result = cons(parse_result, result);
                        }
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$12, thread);
            }
        } finally {
            reformulator_datastructures.$reformulator_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Returns all wff assert parses for a sentence.  Returns all the wf-sentences produced by @xref parse-a-sentence-completely
     */
    @LispMethod(comment = "Returns all wff assert parses for a sentence.  Returns all the wf-sentences produced by @xref parse-a-sentence-completely")
    public static final SubLObject parse_a_sentence_completely_wff_alt(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        v_properties = putf(v_properties, $kw202$WFF_CHECK_, T);
        return parse_a_sentence_completely(sentence, mt, v_properties);
    }

    @LispMethod(comment = "Returns all wff assert parses for a sentence.  Returns all the wf-sentences produced by @xref parse-a-sentence-completely")
    public static SubLObject parse_a_sentence_completely_wff(final SubLObject sentence, final SubLObject mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        v_properties = putf(v_properties, $kw211$WFF_CHECK_, T);
        return parse_a_sentence_completely(sentence, mt, v_properties);
    }

    /**
     * This function returns all the question parses for a given sentence.  It returns full CycL sentences,
     * but does no wff-checking of the results.
     *
     * @param SENTENCE
    string
     * 		
     * @param MT
    microtheory
     * 		
     * @param PROPERTIES
    property-list-p
     * 		
     */
    @LispMethod(comment = "This function returns all the question parses for a given sentence.  It returns full CycL sentences,\r\nbut does no wff-checking of the results.\r\n\r\n@param SENTENCE\nstring\r\n\t\t\r\n@param MT\nmicrotheory\r\n\t\t\r\n@param PROPERTIES\nproperty-list-p\nThis function returns all the question parses for a given sentence.  It returns full CycL sentences,\nbut does no wff-checking of the results.")
    public static final SubLObject parse_a_question_completely_alt(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sentence, STRINGP);
            SubLTrampolineFile.checkType(mt, $sym198$HLMT_);
            SubLTrampolineFile.checkType(v_properties, PROPERTY_LIST_P);
            if (NIL == string_utilities.ends_with(sentence, $str_alt214$_, UNPROVIDED)) {
                if (NIL != string_utilities.ends_with_punctuation_p(sentence)) {
                    sentence = cconcatenate(format_nil.format_nil_a_no_copy(string_utilities.strip_final(sentence, UNPROVIDED)), $str_alt214$_);
                } else {
                    sentence = cconcatenate(format_nil.format_nil_a_no_copy(sentence), $str_alt214$_);
                }
            }
            v_properties = list_utilities.maybe_putf(v_properties, $STRENGTHEN_, T);
            v_properties = list_utilities.maybe_putf(v_properties, $MULTIPLE_QUANTIFICATIONS, NIL);
            v_properties = list_utilities.maybe_putf(v_properties, $kw202$WFF_CHECK_, NIL);
            v_properties = list_utilities.maybe_putf(v_properties, $SEMANTIC_MT, mt);
            v_properties = list_utilities.maybe_putf(v_properties, $PARSING_MT, mt);
            v_properties = putf(v_properties, $FORCE, $QUERY);
            {
                SubLObject iterator = parsing_utilities.new_parse_iterator(sentence, v_properties);
                SubLObject result = NIL;
                SubLObject v_memoization_state = reformulator_datastructures.find_or_create_reformulator_memoization_state();
                SubLTrampolineFile.checkType(v_memoization_state, MEMOIZATION_STATE_P);
                {
                    SubLObject _prev_bind_0 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding(thread);
                    try {
                        reformulator_datastructures.$reformulator_memoization_state$.bind(v_memoization_state, thread);
                        {
                            SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue(thread);
                            {
                                SubLObject _prev_bind_0_16 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                        Errors.error($str_alt208$Invalid_attempt_to_reuse_memoizat);
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            while (NIL == iteration.iteration_done(iterator)) {
                                                {
                                                    SubLObject parse_result = iteration.iteration_next(iterator);
                                                    if (NIL != cycl_grammar.cycl_sentence_p(parse_result)) {
                                                        result = cons(parse_result, result);
                                                    }
                                                }
                                            } 
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_17, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_16, thread);
                                }
                            }
                        }
                    } finally {
                        reformulator_datastructures.$reformulator_memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "This function returns all the question parses for a given sentence.  It returns full CycL sentences,\r\nbut does no wff-checking of the results.\r\n\r\n@param SENTENCE\n\t\tstring\r\n\t\t\r\n@param MT\n\t\tmicrotheory\r\n\t\t\r\n@param PROPERTIES\n\t\tproperty-list-p\nThis function returns all the question parses for a given sentence.  It returns full CycL sentences,\nbut does no wff-checking of the results.")
    public static SubLObject parse_a_question_completely(SubLObject sentence, final SubLObject mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(sentence, STRINGP);
        SubLTrampolineFile.enforceType(mt, $sym207$HLMT_);
        SubLTrampolineFile.enforceType(v_properties, PROPERTY_LIST_P);
        if (NIL == string_utilities.ends_with(sentence, $str222$_, UNPROVIDED)) {
            if (NIL != string_utilities.ends_with_punctuation_p(sentence)) {
                sentence = cconcatenate(format_nil.format_nil_a_no_copy(string_utilities.strip_final(sentence, UNPROVIDED)), $str222$_);
            } else {
                sentence = cconcatenate(format_nil.format_nil_a_no_copy(sentence), $str222$_);
            }
        }
        v_properties = list_utilities.maybe_putf(v_properties, $STRENGTHEN_, T);
        v_properties = list_utilities.maybe_putf(v_properties, $MULTIPLE_QUANTIFICATIONS, NIL);
        v_properties = list_utilities.maybe_putf(v_properties, $kw211$WFF_CHECK_, NIL);
        v_properties = list_utilities.maybe_putf(v_properties, $SEMANTIC_MT, mt);
        v_properties = list_utilities.maybe_putf(v_properties, $PARSING_MT, mt);
        v_properties = putf(v_properties, $FORCE, $QUERY);
        final SubLObject iterator = parsing_utilities.new_parse_iterator(sentence, v_properties);
        SubLObject result = NIL;
        final SubLObject v_memoization_state = reformulator_datastructures.find_or_create_reformulator_memoization_state();
        assert NIL != memoization_state.memoization_state_p(v_memoization_state) : "! memoization_state.memoization_state_p(v_memoization_state) " + ("memoization_state.memoization_state_p(v_memoization_state) " + "CommonSymbols.NIL != memoization_state.memoization_state_p(v_memoization_state) ") + v_memoization_state;
        final SubLObject _prev_bind_0 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding(thread);
        try {
            reformulator_datastructures.$reformulator_memoization_state$.bind(v_memoization_state, thread);
            final SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$14 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    while (NIL == iteration.iteration_done(iterator)) {
                        final SubLObject parse_result = iteration.iteration_next(iterator);
                        if (NIL != cycl_grammar.cycl_sentence_p(parse_result)) {
                            result = cons(parse_result, result);
                        }
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$14, thread);
            }
        } finally {
            reformulator_datastructures.$reformulator_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Returns all wff question parses for a sentence.  Returns all the wf-sentences produced by
     *
     * @unknown parse-a-sentence-completely
     */
    @LispMethod(comment = "Returns all wff question parses for a sentence.  Returns all the wf-sentences produced by\r\n\r\n@unknown parse-a-sentence-completely")
    public static final SubLObject parse_a_question_completely_wff_alt(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        v_properties = putf(v_properties, $kw202$WFF_CHECK_, T);
        return parse_a_question_completely(sentence, mt, v_properties);
    }

    @LispMethod(comment = "Returns all wff question parses for a sentence.  Returns all the wf-sentences produced by\r\n\r\n@unknown parse-a-sentence-completely")
    public static SubLObject parse_a_question_completely_wff(final SubLObject sentence, final SubLObject mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        v_properties = putf(v_properties, $kw211$WFF_CHECK_, T);
        return parse_a_question_completely(sentence, mt, v_properties);
    }/**
     * Returns all wff question parses for a sentence.  Returns all the wf-sentences produced by
     *
     * @unknown parse-a-sentence-completely
     */


    public static final SubLObject top_level_parses_alt(SubLObject raw_parses) {
        {
            SubLObject span_iterator = rtp_iterators.new_itp_result_iterator(raw_parses, UNPROVIDED, UNPROVIDED);
            SubLObject parse_iterator = rtp_iterators.itp_result_iterator_curr(span_iterator);
            SubLObject result = NIL;
            while (NIL == rtp_iterators.itp_section_iterator_doneP(parse_iterator)) {
                result = cons(rtp_iterators.itp_section_iterator_curr_cycl(parse_iterator), result);
                rtp_iterators.itp_section_iterator_next(parse_iterator);
            } 
            return nreverse(delete_duplicates(result, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
    }

    public static SubLObject top_level_parses(final SubLObject raw_parses) {
        final SubLObject span_iterator = rtp_iterators.new_itp_result_iterator(raw_parses, UNPROVIDED, UNPROVIDED);
        final SubLObject parse_iterator = rtp_iterators.itp_result_iterator_curr(span_iterator);
        SubLObject result = NIL;
        while (NIL == rtp_iterators.itp_section_iterator_doneP(parse_iterator)) {
            result = cons(rtp_iterators.itp_section_iterator_curr_cycl(parse_iterator), result);
            rtp_iterators.itp_section_iterator_next(parse_iterator);
        } 
        return nreverse(delete_duplicates(result, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     * Wrapper function used to test PARSE-A-SENTENCE-COMPLETELY.  If RTP is not
     * initialized, it returns T so that the test-case-table tests succeed.
     */
    @LispMethod(comment = "Wrapper function used to test PARSE-A-SENTENCE-COMPLETELY.  If RTP is not\r\ninitialized, it returns T so that the test-case-table tests succeed.\nWrapper function used to test PARSE-A-SENTENCE-COMPLETELY.  If RTP is not\ninitialized, it returns T so that the test-case-table tests succeed.")
    public static final SubLObject parse_a_sentence_completely_tct_alt(SubLObject sentence, SubLObject mt, SubLObject expected_ans, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (NIL == rtp_initialize.rtp_initializedP()) {
            Errors.warn($str_alt218$RTP_is_not_initialized___So__test);
            return T;
        }
        return subl_promotions.memberP(narts_high.nart_substitute(expected_ans), parse_a_sentence_completely(sentence, mt, v_properties), EQUAL, UNPROVIDED);
    }

    @LispMethod(comment = "Wrapper function used to test PARSE-A-SENTENCE-COMPLETELY.  If RTP is not\r\ninitialized, it returns T so that the test-case-table tests succeed.\nWrapper function used to test PARSE-A-SENTENCE-COMPLETELY.  If RTP is not\ninitialized, it returns T so that the test-case-table tests succeed.")
    public static SubLObject parse_a_sentence_completely_tct(final SubLObject sentence, final SubLObject mt, final SubLObject expected_ans, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (NIL == rtp_initialize.rtp_initializedP()) {
            Errors.warn($str226$RTP_is_not_initialized___So__test);
            return T;
        }
        return subl_promotions.memberP(narts_high.nart_substitute(expected_ans), parse_a_sentence_completely(sentence, mt, v_properties), EQUAL, UNPROVIDED);
    }/**
     * Wrapper function used to test PARSE-A-SENTENCE-COMPLETELY.  If RTP is not
     * initialized, it returns T so that the test-case-table tests succeed.
     */


    /**
     * Wrapper function used to test PARSE-A-QUESTION-COMPLETELY.  If RTP is not
     * initialized, it returns T so that the test-case-table tests succeed.
     */
    @LispMethod(comment = "Wrapper function used to test PARSE-A-QUESTION-COMPLETELY.  If RTP is not\r\ninitialized, it returns T so that the test-case-table tests succeed.\nWrapper function used to test PARSE-A-QUESTION-COMPLETELY.  If RTP is not\ninitialized, it returns T so that the test-case-table tests succeed.")
    public static final SubLObject parse_a_question_completely_tct_alt(SubLObject v_question, SubLObject mt, SubLObject expected_ans, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (NIL == rtp_initialize.rtp_initializedP()) {
            Errors.warn($str_alt219$RTP_is_not_initialized___So__test);
            return T;
        }
        return subl_promotions.memberP(narts_high.nart_substitute(expected_ans), parse_a_question_completely(v_question, mt, v_properties), EQUAL, UNPROVIDED);
    }

    @LispMethod(comment = "Wrapper function used to test PARSE-A-QUESTION-COMPLETELY.  If RTP is not\r\ninitialized, it returns T so that the test-case-table tests succeed.\nWrapper function used to test PARSE-A-QUESTION-COMPLETELY.  If RTP is not\ninitialized, it returns T so that the test-case-table tests succeed.")
    public static SubLObject parse_a_question_completely_tct(final SubLObject v_question, final SubLObject mt, final SubLObject expected_ans, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (NIL == rtp_initialize.rtp_initializedP()) {
            Errors.warn($str227$RTP_is_not_initialized___So__test);
            return T;
        }
        return subl_promotions.memberP(narts_high.nart_substitute(expected_ans), parse_a_question_completely(v_question, mt, v_properties), EQUAL, UNPROVIDED);
    }/**
     * Wrapper function used to test PARSE-A-QUESTION-COMPLETELY.  If RTP is not
     * initialized, it returns T so that the test-case-table tests succeed.
     */


    public static final SubLObject declare_rkf_text_processors_file_alt() {
        declareFunction("rkf_textproc_parse_to_dictionary", "RKF-TEXTPROC-PARSE-TO-DICTIONARY", 1, 1, false);
        declareFunction("rkf_textproc_preprocess_interps", "RKF-TEXTPROC-PREPROCESS-INTERPS", 1, 0, false);
        declareMacro("with_fully_resolved_parses", "WITH-FULLY-RESOLVED-PARSES");
        declareFunction("rkf_textproc_dictionary_to_parse", "RKF-TEXTPROC-DICTIONARY-TO-PARSE", 1, 0, false);
        declareFunction("rkf_textproc_dictionary_to_parse_wXsurrogates", "RKF-TEXTPROC-DICTIONARY-TO-PARSE-W/SURROGATES", 1, 0, false);
        declareFunction("rkf_textproc_dictionary_to_resolved_parse", "RKF-TEXTPROC-DICTIONARY-TO-RESOLVED-PARSE", 1, 0, false);
        declareFunction("resolve_parse_interpretation", "RESOLVE-PARSE-INTERPRETATION", 3, 0, false);
        declareFunction("maybe_resolve_result_of_parsing_naut", "MAYBE-RESOLVE-RESULT-OF-PARSING-NAUT", 3, 0, false);
        declareFunction("resolve_result_of_parsing_naut", "RESOLVE-RESULT-OF-PARSING-NAUT", 3, 0, false);
        declareFunction("resolve_parse_interpretation_args", "RESOLVE-PARSE-INTERPRETATION-ARGS", 3, 0, false);
        declareFunction("rkf_parse_bindings_wffP", "RKF-PARSE-BINDINGS-WFF?", 2, 0, false);
        declareFunction("rkf_parse_subst_bindings", "RKF-PARSE-SUBST-BINDINGS", 2, 0, false);
        declareFunction("rkf_parse_wff_check_template", "RKF-PARSE-WFF-CHECK-TEMPLATE", 1, 0, false);
        declareFunction("rkf_textproc_interpret_nlterm", "RKF-TEXTPROC-INTERPRET-NLTERM", 2, 0, false);
        declareFunction("rkf_textproc_interpret_nlterms", "RKF-TEXTPROC-INTERPRET-NLTERMS", 2, 0, false);
        declareFunction("parse_result_print_function_trampoline", "PARSE-RESULT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("parse_result_p", "PARSE-RESULT-P", 1, 0, false);
        new com.cyc.cycjava.cycl.rkf_text_processors.$parse_result_p$UnaryFunction();
        declareFunction("parse_result_original", "PARSE-RESULT-ORIGINAL", 1, 0, false);
        declareFunction("parse_result_constituents", "PARSE-RESULT-CONSTITUENTS", 1, 0, false);
        declareFunction("parse_result_eliminated", "PARSE-RESULT-ELIMINATED", 1, 0, false);
        declareFunction("parse_result_problems", "PARSE-RESULT-PROBLEMS", 1, 0, false);
        declareFunction("parse_result_solutions", "PARSE-RESULT-SOLUTIONS", 1, 0, false);
        declareFunction("_csetf_parse_result_original", "_CSETF-PARSE-RESULT-ORIGINAL", 2, 0, false);
        declareFunction("_csetf_parse_result_constituents", "_CSETF-PARSE-RESULT-CONSTITUENTS", 2, 0, false);
        declareFunction("_csetf_parse_result_eliminated", "_CSETF-PARSE-RESULT-ELIMINATED", 2, 0, false);
        declareFunction("_csetf_parse_result_problems", "_CSETF-PARSE-RESULT-PROBLEMS", 2, 0, false);
        declareFunction("_csetf_parse_result_solutions", "_CSETF-PARSE-RESULT-SOLUTIONS", 2, 0, false);
        declareFunction("make_parse_result", "MAKE-PARSE-RESULT", 0, 1, false);
        declareFunction("print_parse_result", "PRINT-PARSE-RESULT", 3, 0, false);
        declareMacro("with_verbose_rkf_textproc_parse_result", "WITH-VERBOSE-RKF-TEXTPROC-PARSE-RESULT");
        declareFunction("new_parse_result", "NEW-PARSE-RESULT", 1, 0, false);
        declareFunction("seed_parse_result_constituents", "SEED-PARSE-RESULT-CONSTITUENTS", 1, 0, false);
        declareFunction("debug_reset_parse_results", "DEBUG-RESET-PARSE-RESULTS", 1, 0, false);
        declareFunction("parse_result_emptyP", "PARSE-RESULT-EMPTY?", 1, 0, false);
        declareFunction("parse_result_open_issuesP", "PARSE-RESULT-OPEN-ISSUES?", 1, 0, false);
        declareFunction("parse_result_known_solutionsP", "PARSE-RESULT-KNOWN-SOLUTIONS?", 1, 0, false);
        declareFunction("parse_result_known_constituentP", "PARSE-RESULT-KNOWN-CONSTITUENT?", 2, 0, false);
        declareFunction("debug_display_parse_result", "DEBUG-DISPLAY-PARSE-RESULT", 1, 1, false);
        declareFunction("debug_display_one_parts_dictionary", "DEBUG-DISPLAY-ONE-PARTS-DICTIONARY", 2, 1, false);
        declareMacro("without_nltags_returned", "WITHOUT-NLTAGS-RETURNED");
        declareFunction("rkf_uttrdr_are_nltags_allowedP", "RKF-UTTRDR-ARE-NLTAGS-ALLOWED?", 0, 0, false);
        declareMacro("with_full_spans_only_returned", "WITH-FULL-SPANS-ONLY-RETURNED");
        declareMacro("with_subspans_returned", "WITH-SUBSPANS-RETURNED");
        declareFunction("rkf_uttrdr_full_spans_onlyP", "RKF-UTTRDR-FULL-SPANS-ONLY?", 0, 0, false);
        declareFunction("rkf_utterance_reader", "RKF-UTTERANCE-READER", 4, 0, false);
        declareFunction("rkf_uttrdr_replace_pronouns", "RKF-UTTRDR-REPLACE-PRONOUNS", 1, 0, false);
        declareFunction("rkf_imperative_reader", "RKF-IMPERATIVE-READER", 3, 0, false);
        declareFunction("rkf_sentence_reader", "RKF-SENTENCE-READER", 3, 0, false);
        declareFunction("rkf_question_reader", "RKF-QUESTION-READER", 3, 0, false);
        declareFunction("rkf_store_rtp_parses_in_pipeline", "RKF-STORE-RTP-PARSES-IN-PIPELINE", 4, 0, false);
        declareFunction("rkf_phrase_reader", "RKF-PHRASE-READER", 3, 1, false);
        declareFunction("rkf_uttrdr_maybe_initialize_arg_type_template_categories", "RKF-UTTRDR-MAYBE-INITIALIZE-ARG-TYPE-TEMPLATE-CATEGORIES", 0, 0, false);
        declareFunction("rkf_uttrdr_initialize_arg_type_template_categories", "RKF-UTTRDR-INITIALIZE-ARG-TYPE-TEMPLATE-CATEGORIES", 0, 0, false);
        declareFunction("rkf_uttrdr_templates_for_arg_type", "RKF-UTTRDR-TEMPLATES-FOR-ARG-TYPE", 2, 0, false);
        declareFunction("rkf_uttrdr_remove_sub_parses", "RKF-UTTRDR-REMOVE-SUB-PARSES", 2, 0, false);
        declareMacro("with_parsers_ordered_by_quality", "WITH-PARSERS-ORDERED-BY-QUALITY");
        declareFunction("template_category_from_parse_spec", "TEMPLATE-CATEGORY-FROM-PARSE-SPEC", 2, 0, false);
        declareFunction("rkf_term_reader", "RKF-TERM-READER", 3, 1, false);
        declareFunction("rkf_term_in_sentence_reader", "RKF-TERM-IN-SENTENCE-READER", 3, 1, false);
        declareFunction("rkf_assertion_reader", "RKF-ASSERTION-READER", 3, 0, false);
        declareFunction("rkf_query_reader", "RKF-QUERY-READER", 3, 0, false);
        declareFunction("rkf_scenario_reader", "RKF-SCENARIO-READER", 3, 0, false);
        declareFunction("rkf_parse_date_unambiguously_from_string", "RKF-PARSE-DATE-UNAMBIGUOUSLY-FROM-STRING", 1, 0, false);
        declareFunction("simple_rkf_date_reader", "SIMPLE-RKF-DATE-READER", 1, 2, false);
        declareFunction("rkf_date_reader", "RKF-DATE-READER", 3, 0, false);
        declareFunction("rkf_text_processor_reset_caches", "RKF-TEXT-PROCESSOR-RESET-CACHES", 0, 0, false);
        declareFunction("rkf_terms_forager", "RKF-TERMS-FORAGER", 3, 0, false);
        declareFunction("parse_module_definition_print_function_trampoline", "PARSE-MODULE-DEFINITION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("parse_module_definition_p", "PARSE-MODULE-DEFINITION-P", 1, 0, false);
        new com.cyc.cycjava.cycl.rkf_text_processors.$parse_module_definition_p$UnaryFunction();
        declareFunction("pmd_name", "PMD-NAME", 1, 0, false);
        declareFunction("pmd_category", "PMD-CATEGORY", 1, 0, false);
        declareFunction("pmd_quality", "PMD-QUALITY", 1, 0, false);
        declareFunction("pmd_entry_point", "PMD-ENTRY-POINT", 1, 0, false);
        declareFunction("pmd_cost", "PMD-COST", 1, 0, false);
        declareFunction("pmd_expected_expansions", "PMD-EXPECTED-EXPANSIONS", 1, 0, false);
        declareFunction("pmd_supplants", "PMD-SUPPLANTS", 1, 0, false);
        declareFunction("_csetf_pmd_name", "_CSETF-PMD-NAME", 2, 0, false);
        declareFunction("_csetf_pmd_category", "_CSETF-PMD-CATEGORY", 2, 0, false);
        declareFunction("_csetf_pmd_quality", "_CSETF-PMD-QUALITY", 2, 0, false);
        declareFunction("_csetf_pmd_entry_point", "_CSETF-PMD-ENTRY-POINT", 2, 0, false);
        declareFunction("_csetf_pmd_cost", "_CSETF-PMD-COST", 2, 0, false);
        declareFunction("_csetf_pmd_expected_expansions", "_CSETF-PMD-EXPECTED-EXPANSIONS", 2, 0, false);
        declareFunction("_csetf_pmd_supplants", "_CSETF-PMD-SUPPLANTS", 2, 0, false);
        declareFunction("make_parse_module_definition", "MAKE-PARSE-MODULE-DEFINITION", 0, 1, false);
        declareFunction("pmd_print", "PMD-PRINT", 3, 0, false);
        declareFunction("new_parse_module_definition", "NEW-PARSE-MODULE-DEFINITION", 4, 3, false);
        declareFunction("rkf_uttrdr_copy_pmd", "RKF-UTTRDR-COPY-PMD", 2, 0, false);
        declareFunction("rkf_uttrdr_pmd_classify", "RKF-UTTRDR-PMD-CLASSIFY", 1, 0, false);
        declareFunction("rkf_uttrdr_pmd_choose_better", "RKF-UTTRDR-PMD-CHOOSE-BETTER", 2, 0, false);
        declareFunction("pmd_resolved_quality", "PMD-RESOLVED-QUALITY", 1, 0, false);
        declareFunction("rkf_uttrdr_pmd_orderedP", "RKF-UTTRDR-PMD-ORDERED?", 2, 0, false);
        declareFunction("rkf_uttrdr_explain_pmd", "RKF-UTTRDR-EXPLAIN-PMD", 1, 0, false);
        declareFunction("rkf_uttrdr_pmd_supplantsP", "RKF-UTTRDR-PMD-SUPPLANTS?", 2, 0, false);
        declareFunction("rkf_uttrdr_invoke_pmd", "RKF-UTTRDR-INVOKE-PMD", 5, 0, false);
        declareFunction("parse_module_group_print_function_trampoline", "PARSE-MODULE-GROUP-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("parse_module_group_p", "PARSE-MODULE-GROUP-P", 1, 0, false);
        new com.cyc.cycjava.cycl.rkf_text_processors.$parse_module_group_p$UnaryFunction();
        declareFunction("pmg_category", "PMG-CATEGORY", 1, 0, false);
        declareFunction("pmg_tools", "PMG-TOOLS", 1, 0, false);
        declareFunction("_csetf_pmg_category", "_CSETF-PMG-CATEGORY", 2, 0, false);
        declareFunction("_csetf_pmg_tools", "_CSETF-PMG-TOOLS", 2, 0, false);
        declareFunction("make_parse_module_group", "MAKE-PARSE-MODULE-GROUP", 0, 1, false);
        declareFunction("pmg_ordered_tools", "PMG-ORDERED-TOOLS", 1, 0, false);
        declareFunction("sorted_by_quality", "SORTED-BY-QUALITY", 1, 0, false);
        declareFunction("pmd_expected_expansionsL", "PMD-EXPECTED-EXPANSIONS<", 2, 0, false);
        declareFunction("pmd_costL", "PMD-COST<", 2, 0, false);
        declareFunction("pmd_qualityL", "PMD-QUALITY<", 2, 0, false);
        declareFunction("new_parse_module_group", "NEW-PARSE-MODULE-GROUP", 1, 0, false);
        declareFunction("rkf_uttrdr_explain_pmg", "RKF-UTTRDR-EXPLAIN-PMG", 1, 0, false);
        declareMacro("with_known_parsers_lock_held", "WITH-KNOWN-PARSERS-LOCK-HELD");
        declareFunction("rkf_uttrdr_pmg_find_pmd_by_name", "RKF-UTTRDR-PMG-FIND-PMD-BY-NAME", 2, 0, false);
        declareFunction("rkf_uttrdr_pmg_find_pmd", "RKF-UTTRDR-PMG-FIND-PMD", 2, 0, false);
        declareFunction("rkf_uttrdr_pmg_add_tool", "RKF-UTTRDR-PMG-ADD-TOOL", 2, 0, false);
        declareFunction("rkf_uttrdr_pmg_locate_pmd", "RKF-UTTRDR-PMG-LOCATE-PMD", 2, 0, false);
        declareFunction("rkf_uttrdr_pmg_is_knownP", "RKF-UTTRDR-PMG-IS-KNOWN?", 2, 0, false);
        declareFunction("rkf_uttrdr_pmg_update_pmd", "RKF-UTTRDR-PMG-UPDATE-PMD", 2, 0, false);
        declareFunction("rkf_uttrdr_pmg_classify_pmd", "RKF-UTTRDR-PMG-CLASSIFY-PMD", 2, 0, false);
        declareFunction("rkf_uttrdr_find_parse_module_group", "RKF-UTTRDR-FIND-PARSE-MODULE-GROUP", 1, 0, false);
        declareFunction("rkf_uttrdr_give_parse_module_group", "RKF-UTTRDR-GIVE-PARSE-MODULE-GROUP", 1, 0, false);
        declareFunction("rkf_uttrdr_show_parsers", "RKF-UTTRDR-SHOW-PARSERS", 1, 0, false);
        declareFunction("rkf_uttrdr_all_supported_categories", "RKF-UTTRDR-ALL-SUPPORTED-CATEGORIES", 0, 0, false);
        declareFunction("rkf_uttrdr_reset_all_supported_categories", "RKF-UTTRDR-RESET-ALL-SUPPORTED-CATEGORIES", 0, 0, false);
        declareFunction("rkf_uttrdr_all_supported_categories_internal", "RKF-UTTRDR-ALL-SUPPORTED-CATEGORIES-INTERNAL", 0, 0, false);
        declareFunction("rkf_uttrdr_register_parser", "RKF-UTTRDR-REGISTER-PARSER", 2, 0, false);
        declareFunction("rkf_uttrdr_deregister_all_parsers", "RKF-UTTRDR-DEREGISTER-ALL-PARSERS", 0, 0, false);
        declareMacro("register_known_parser_module", "REGISTER-KNOWN-PARSER-MODULE");
        declareFunction("pmd_npp_quality", "PMD-NPP-QUALITY", 0, 0, false);
        declareFunction("rkf_uttrdr_use_template_parser", "RKF-UTTRDR-USE-TEMPLATE-PARSER", 4, 0, false);
        declareFunction("rkf_uttrdr_parse_inf_vbar", "RKF-UTTRDR-PARSE-INF-VBAR", 4, 0, false);
        declareFunction("rkf_uttrdr_use_noun_phrase_parser", "RKF-UTTRDR-USE-NOUN-PHRASE-PARSER", 4, 0, false);
        declareFunction("rkf_uttrdr_use_noun_compound_parser", "RKF-UTTRDR-USE-NOUN-COMPOUND-PARSER", 4, 0, false);
        declareFunction("rkf_uttrdr_use_noun_compound_lexicon", "RKF-UTTRDR-USE-NOUN-COMPOUND-LEXICON", 4, 0, false);
        declareFunction("rkf_uttrdr_use_multi_word_denotations", "RKF-UTTRDR-USE-MULTI-WORD-DENOTATIONS", 4, 0, false);
        declareFunction("rkf_uttrdr_use_denots_of_string", "RKF-UTTRDR-USE-DENOTS-OF-STRING", 4, 0, false);
        declareFunction("rkf_uttrdr_read_as_string", "RKF-UTTRDR-READ-AS-STRING", 4, 0, false);
        declareFunction("rkf_uttrdr_read_cycl_term_from_string", "RKF-UTTRDR-READ-CYCL-TERM-FROM-STRING", 4, 0, false);
        declareFunction("rkf_term_from_string", "RKF-TERM-FROM-STRING", 2, 1, false);
        declareFunction("rkf_uttrdr_generic_lexical_parser", "RKF-UTTRDR-GENERIC-LEXICAL-PARSER", 5, 0, false);
        declareFunction("rkf_uttrdr_use_number_parser", "RKF-UTTRDR-USE-NUMBER-PARSER", 4, 0, false);
        declareFunction("rkf_number_parser", "RKF-NUMBER-PARSER", 2, 1, false);
        declareFunction("rkf_uttrdr_turn_terms_into_parse_result", "RKF-UTTRDR-TURN-TERMS-INTO-PARSE-RESULT", 3, 0, false);
        declareFunction("rkf_uttrdr_turn_tokens_into_span", "RKF-UTTRDR-TURN-TOKENS-INTO-SPAN", 1, 0, false);
        declareFunction("rkf_uttrdr_interpret_nltagfn_terms", "RKF-UTTRDR-INTERPRET-NLTAGFN-TERMS", 2, 0, false);
        declareFunction("rkf_uttrdr_interpret_nltagfn_term", "RKF-UTTRDR-INTERPRET-NLTAGFN-TERM", 2, 0, false);
        declareFunction("rkf_uttrdr_perform_parsing", "RKF-UTTRDR-PERFORM-PARSING", 4, 0, false);
        declareFunction("rkf_uttrdr_reconsider_parse_result_semantics", "RKF-UTTRDR-RECONSIDER-PARSE-RESULT-SEMANTICS", 2, 0, false);
        declareFunction("rkf_uttrdr_parsing_in_category", "RKF-UTTRDR-PARSING-IN-CATEGORY", 4, 0, false);
        declareFunction("rkf_uttrd_parse_with_assistants", "RKF-UTTRD-PARSE-WITH-ASSISTANTS", 5, 0, false);
        declareFunction("rkf_uttrdr_merge_parse_results", "RKF-UTTRDR-MERGE-PARSE-RESULTS", 2, 0, false);
        declareFunction("rkf_uttrdr_compute_applicable_asisstants", "RKF-UTTRDR-COMPUTE-APPLICABLE-ASISSTANTS", 1, 0, false);
        declareFunction("rkf_uttrdr_triage_results", "RKF-UTTRDR-TRIAGE-RESULTS", 3, 0, false);
        declareFunction("rkf_uttrdr_separate_wheat_and_chaffe", "RKF-UTTRDR-SEPARATE-WHEAT-AND-CHAFFE", 2, 0, false);
        declareFunction("rkf_uttrdr_sanity_check_arg", "RKF-UTTRDR-SANITY-CHECK-ARG", 4, 0, false);
        declareFunction("rkf_uttrdr_incomplete_constituents", "RKF-UTTRDR-INCOMPLETE-CONSTITUENTS", 3, 0, false);
        declareFunction("rkf_uttrdr_remove_incomplete_failed", "RKF-UTTRDR-REMOVE-INCOMPLETE-FAILED", 2, 0, false);
        declareFunction("rkf_uttrdr_augment_constitutents", "RKF-UTTRDR-AUGMENT-CONSTITUTENTS", 2, 0, false);
        declareFunction("rkf_uttrdr_apply_solutions_to_constituents", "RKF-UTTRDR-APPLY-SOLUTIONS-TO-CONSTITUENTS", 1, 0, false);
        declareFunction("rkf_uttrdr_potentially_resolve_icycl", "RKF-UTTRDR-POTENTIALLY-RESOLVE-ICYCL", 2, 0, false);
        declareFunction("rkf_uttrdr_generate_parse_from_parse_result", "RKF-UTTRDR-GENERATE-PARSE-FROM-PARSE-RESULT", 1, 0, false);
        declareFunction("rkf_uttrdr_order_parses", "RKF-UTTRDR-ORDER-PARSES", 2, 0, false);
        declareFunction("cycl_of_possibly_itp_semantics", "CYCL-OF-POSSIBLY-ITP-SEMANTICS", 1, 0, false);
        declareFunction("parse_a_sentence_completely", "PARSE-A-SENTENCE-COMPLETELY", 2, 1, false);
        declareFunction("parse_a_sentence_completely_wff", "PARSE-A-SENTENCE-COMPLETELY-WFF", 2, 1, false);
        declareFunction("parse_a_question_completely", "PARSE-A-QUESTION-COMPLETELY", 2, 1, false);
        declareFunction("parse_a_question_completely_wff", "PARSE-A-QUESTION-COMPLETELY-WFF", 2, 1, false);
        declareFunction("top_level_parses", "TOP-LEVEL-PARSES", 1, 0, false);
        declareFunction("parse_a_sentence_completely_tct", "PARSE-A-SENTENCE-COMPLETELY-TCT", 3, 1, false);
        declareFunction("parse_a_question_completely_tct", "PARSE-A-QUESTION-COMPLETELY-TCT", 3, 1, false);
        return NIL;
    }

    public static SubLObject declare_rkf_text_processors_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("rkf_textproc_parse_to_dictionary", "RKF-TEXTPROC-PARSE-TO-DICTIONARY", 1, 1, false);
            declareFunction("rkf_textproc_preprocess_interps", "RKF-TEXTPROC-PREPROCESS-INTERPS", 1, 0, false);
            declareMacro("with_fully_resolved_parses", "WITH-FULLY-RESOLVED-PARSES");
            declareFunction("rkf_textproc_dictionary_to_parse", "RKF-TEXTPROC-DICTIONARY-TO-PARSE", 1, 0, false);
            declareFunction("rkf_textproc_dictionary_to_parse_wXsurrogates", "RKF-TEXTPROC-DICTIONARY-TO-PARSE-W/SURROGATES", 1, 0, false);
            declareFunction("rkf_textproc_dictionary_to_resolved_parse", "RKF-TEXTPROC-DICTIONARY-TO-RESOLVED-PARSE", 1, 0, false);
            declareFunction("resolve_parse_interpretation", "RESOLVE-PARSE-INTERPRETATION", 3, 0, false);
            declareFunction("maybe_resolve_result_of_parsing_naut", "MAYBE-RESOLVE-RESULT-OF-PARSING-NAUT", 3, 0, false);
            declareFunction("resolve_result_of_parsing_naut", "RESOLVE-RESULT-OF-PARSING-NAUT", 3, 0, false);
            declareFunction("resolve_parse_interpretation_args", "RESOLVE-PARSE-INTERPRETATION-ARGS", 3, 0, false);
            declareFunction("rkf_parse_bindings_wffP", "RKF-PARSE-BINDINGS-WFF?", 2, 0, false);
            declareFunction("rkf_parse_subst_bindings", "RKF-PARSE-SUBST-BINDINGS", 2, 0, false);
            declareFunction("rkf_parse_wff_check_template", "RKF-PARSE-WFF-CHECK-TEMPLATE", 1, 0, false);
            declareFunction("rkf_textproc_interpret_nlterm", "RKF-TEXTPROC-INTERPRET-NLTERM", 2, 0, false);
            declareFunction("rkf_textproc_interpret_nlterms", "RKF-TEXTPROC-INTERPRET-NLTERMS", 2, 0, false);
            declareFunction("parse_result_print_function_trampoline", "PARSE-RESULT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("parse_result_p", "PARSE-RESULT-P", 1, 0, false);
            new rkf_text_processors.$parse_result_p$UnaryFunction();
            declareFunction("parse_result_original", "PARSE-RESULT-ORIGINAL", 1, 0, false);
            declareFunction("parse_result_constituents", "PARSE-RESULT-CONSTITUENTS", 1, 0, false);
            declareFunction("parse_result_eliminated", "PARSE-RESULT-ELIMINATED", 1, 0, false);
            declareFunction("parse_result_problems", "PARSE-RESULT-PROBLEMS", 1, 0, false);
            declareFunction("parse_result_solutions", "PARSE-RESULT-SOLUTIONS", 1, 0, false);
            declareFunction("_csetf_parse_result_original", "_CSETF-PARSE-RESULT-ORIGINAL", 2, 0, false);
            declareFunction("_csetf_parse_result_constituents", "_CSETF-PARSE-RESULT-CONSTITUENTS", 2, 0, false);
            declareFunction("_csetf_parse_result_eliminated", "_CSETF-PARSE-RESULT-ELIMINATED", 2, 0, false);
            declareFunction("_csetf_parse_result_problems", "_CSETF-PARSE-RESULT-PROBLEMS", 2, 0, false);
            declareFunction("_csetf_parse_result_solutions", "_CSETF-PARSE-RESULT-SOLUTIONS", 2, 0, false);
            declareFunction("make_parse_result", "MAKE-PARSE-RESULT", 0, 1, false);
            declareFunction("visit_defstruct_parse_result", "VISIT-DEFSTRUCT-PARSE-RESULT", 2, 0, false);
            declareFunction("visit_defstruct_object_parse_result_method", "VISIT-DEFSTRUCT-OBJECT-PARSE-RESULT-METHOD", 2, 0, false);
            declareFunction("print_parse_result", "PRINT-PARSE-RESULT", 3, 0, false);
            declareMacro("with_verbose_rkf_textproc_parse_result", "WITH-VERBOSE-RKF-TEXTPROC-PARSE-RESULT");
            declareFunction("new_parse_result", "NEW-PARSE-RESULT", 1, 0, false);
            declareFunction("seed_parse_result_constituents", "SEED-PARSE-RESULT-CONSTITUENTS", 1, 0, false);
            declareFunction("debug_reset_parse_results", "DEBUG-RESET-PARSE-RESULTS", 1, 0, false);
            declareFunction("parse_result_emptyP", "PARSE-RESULT-EMPTY?", 1, 0, false);
            declareFunction("parse_result_open_issuesP", "PARSE-RESULT-OPEN-ISSUES?", 1, 0, false);
            declareFunction("parse_result_known_solutionsP", "PARSE-RESULT-KNOWN-SOLUTIONS?", 1, 0, false);
            declareFunction("parse_result_known_constituentP", "PARSE-RESULT-KNOWN-CONSTITUENT?", 2, 0, false);
            declareFunction("debug_display_parse_result", "DEBUG-DISPLAY-PARSE-RESULT", 1, 1, false);
            declareFunction("debug_display_one_parts_dictionary", "DEBUG-DISPLAY-ONE-PARTS-DICTIONARY", 2, 1, false);
            declareMacro("without_nltags_returned", "WITHOUT-NLTAGS-RETURNED");
            declareFunction("rkf_uttrdr_are_nltags_allowedP", "RKF-UTTRDR-ARE-NLTAGS-ALLOWED?", 0, 0, false);
            declareMacro("with_full_spans_only_returned", "WITH-FULL-SPANS-ONLY-RETURNED");
            declareMacro("with_subspans_returned", "WITH-SUBSPANS-RETURNED");
            declareFunction("rkf_uttrdr_full_spans_onlyP", "RKF-UTTRDR-FULL-SPANS-ONLY?", 0, 0, false);
            declareFunction("rkf_utterance_reader", "RKF-UTTERANCE-READER", 4, 0, false);
            declareFunction("rkf_uttrdr_replace_pronouns", "RKF-UTTRDR-REPLACE-PRONOUNS", 1, 0, false);
            declareFunction("rkf_imperative_reader", "RKF-IMPERATIVE-READER", 3, 0, false);
            declareFunction("rkf_sentence_reader", "RKF-SENTENCE-READER", 3, 0, false);
            declareFunction("rkf_question_reader", "RKF-QUESTION-READER", 3, 0, false);
            declareFunction("rkf_store_rtp_parses_in_pipeline", "RKF-STORE-RTP-PARSES-IN-PIPELINE", 4, 0, false);
            declareFunction("rkf_phrase_reader", "RKF-PHRASE-READER", 3, 1, false);
            declareFunction("rkf_uttrdr_maybe_initialize_arg_type_template_categories", "RKF-UTTRDR-MAYBE-INITIALIZE-ARG-TYPE-TEMPLATE-CATEGORIES", 0, 0, false);
            declareFunction("rkf_uttrdr_initialize_arg_type_template_categories", "RKF-UTTRDR-INITIALIZE-ARG-TYPE-TEMPLATE-CATEGORIES", 0, 0, false);
            declareFunction("rkf_uttrdr_templates_for_arg_type", "RKF-UTTRDR-TEMPLATES-FOR-ARG-TYPE", 2, 0, false);
            declareFunction("rkf_uttrdr_remove_sub_parses", "RKF-UTTRDR-REMOVE-SUB-PARSES", 2, 0, false);
            declareMacro("with_parsers_ordered_by_quality", "WITH-PARSERS-ORDERED-BY-QUALITY");
            declareFunction("template_category_from_parse_spec", "TEMPLATE-CATEGORY-FROM-PARSE-SPEC", 2, 0, false);
            declareFunction("rkf_term_reader", "RKF-TERM-READER", 3, 1, false);
            declareFunction("rkf_term_in_sentence_reader", "RKF-TERM-IN-SENTENCE-READER", 3, 1, false);
            declareFunction("rkf_assertion_reader", "RKF-ASSERTION-READER", 3, 0, false);
            declareFunction("rkf_query_reader", "RKF-QUERY-READER", 3, 0, false);
            declareFunction("rkf_scenario_reader", "RKF-SCENARIO-READER", 3, 0, false);
            declareFunction("rkf_parse_date_unambiguously_from_string", "RKF-PARSE-DATE-UNAMBIGUOUSLY-FROM-STRING", 1, 0, false);
            declareFunction("simple_rkf_date_reader", "SIMPLE-RKF-DATE-READER", 1, 2, false);
            declareFunction("rkf_date_reader", "RKF-DATE-READER", 3, 0, false);
            declareFunction("rkf_text_processor_reset_caches", "RKF-TEXT-PROCESSOR-RESET-CACHES", 0, 0, false);
            declareFunction("rkf_terms_forager", "RKF-TERMS-FORAGER", 3, 0, false);
            declareFunction("parse_module_definition_print_function_trampoline", "PARSE-MODULE-DEFINITION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("parse_module_definition_p", "PARSE-MODULE-DEFINITION-P", 1, 0, false);
            new rkf_text_processors.$parse_module_definition_p$UnaryFunction();
            declareFunction("pmd_name", "PMD-NAME", 1, 0, false);
            declareFunction("pmd_category", "PMD-CATEGORY", 1, 0, false);
            declareFunction("pmd_quality", "PMD-QUALITY", 1, 0, false);
            declareFunction("pmd_entry_point", "PMD-ENTRY-POINT", 1, 0, false);
            declareFunction("pmd_cost", "PMD-COST", 1, 0, false);
            declareFunction("pmd_expected_expansions", "PMD-EXPECTED-EXPANSIONS", 1, 0, false);
            declareFunction("pmd_supplants", "PMD-SUPPLANTS", 1, 0, false);
            declareFunction("_csetf_pmd_name", "_CSETF-PMD-NAME", 2, 0, false);
            declareFunction("_csetf_pmd_category", "_CSETF-PMD-CATEGORY", 2, 0, false);
            declareFunction("_csetf_pmd_quality", "_CSETF-PMD-QUALITY", 2, 0, false);
            declareFunction("_csetf_pmd_entry_point", "_CSETF-PMD-ENTRY-POINT", 2, 0, false);
            declareFunction("_csetf_pmd_cost", "_CSETF-PMD-COST", 2, 0, false);
            declareFunction("_csetf_pmd_expected_expansions", "_CSETF-PMD-EXPECTED-EXPANSIONS", 2, 0, false);
            declareFunction("_csetf_pmd_supplants", "_CSETF-PMD-SUPPLANTS", 2, 0, false);
            declareFunction("make_parse_module_definition", "MAKE-PARSE-MODULE-DEFINITION", 0, 1, false);
            declareFunction("visit_defstruct_parse_module_definition", "VISIT-DEFSTRUCT-PARSE-MODULE-DEFINITION", 2, 0, false);
            declareFunction("visit_defstruct_object_parse_module_definition_method", "VISIT-DEFSTRUCT-OBJECT-PARSE-MODULE-DEFINITION-METHOD", 2, 0, false);
            declareFunction("pmd_print", "PMD-PRINT", 3, 0, false);
            declareFunction("new_parse_module_definition", "NEW-PARSE-MODULE-DEFINITION", 4, 3, false);
            declareFunction("rkf_uttrdr_copy_pmd", "RKF-UTTRDR-COPY-PMD", 2, 0, false);
            declareFunction("rkf_uttrdr_pmd_classify", "RKF-UTTRDR-PMD-CLASSIFY", 1, 0, false);
            declareFunction("rkf_uttrdr_pmd_choose_better", "RKF-UTTRDR-PMD-CHOOSE-BETTER", 2, 0, false);
            declareFunction("pmd_resolved_quality", "PMD-RESOLVED-QUALITY", 1, 0, false);
            declareFunction("rkf_uttrdr_pmd_orderedP", "RKF-UTTRDR-PMD-ORDERED?", 2, 0, false);
            declareFunction("rkf_uttrdr_explain_pmd", "RKF-UTTRDR-EXPLAIN-PMD", 1, 0, false);
            declareFunction("rkf_uttrdr_pmd_supplantsP", "RKF-UTTRDR-PMD-SUPPLANTS?", 2, 0, false);
            declareFunction("rkf_uttrdr_invoke_pmd", "RKF-UTTRDR-INVOKE-PMD", 5, 0, false);
            declareFunction("parse_module_group_print_function_trampoline", "PARSE-MODULE-GROUP-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("parse_module_group_p", "PARSE-MODULE-GROUP-P", 1, 0, false);
            new rkf_text_processors.$parse_module_group_p$UnaryFunction();
            declareFunction("pmg_category", "PMG-CATEGORY", 1, 0, false);
            declareFunction("pmg_tools", "PMG-TOOLS", 1, 0, false);
            declareFunction("_csetf_pmg_category", "_CSETF-PMG-CATEGORY", 2, 0, false);
            declareFunction("_csetf_pmg_tools", "_CSETF-PMG-TOOLS", 2, 0, false);
            declareFunction("make_parse_module_group", "MAKE-PARSE-MODULE-GROUP", 0, 1, false);
            declareFunction("visit_defstruct_parse_module_group", "VISIT-DEFSTRUCT-PARSE-MODULE-GROUP", 2, 0, false);
            declareFunction("visit_defstruct_object_parse_module_group_method", "VISIT-DEFSTRUCT-OBJECT-PARSE-MODULE-GROUP-METHOD", 2, 0, false);
            declareFunction("pmg_ordered_tools", "PMG-ORDERED-TOOLS", 1, 0, false);
            declareFunction("sorted_by_quality", "SORTED-BY-QUALITY", 1, 0, false);
            declareFunction("pmd_expected_expansionsL", "PMD-EXPECTED-EXPANSIONS<", 2, 0, false);
            declareFunction("pmd_costL", "PMD-COST<", 2, 0, false);
            declareFunction("pmd_qualityL", "PMD-QUALITY<", 2, 0, false);
            declareFunction("new_parse_module_group", "NEW-PARSE-MODULE-GROUP", 1, 0, false);
            declareFunction("rkf_uttrdr_explain_pmg", "RKF-UTTRDR-EXPLAIN-PMG", 1, 0, false);
            declareMacro("with_known_parsers_lock_held", "WITH-KNOWN-PARSERS-LOCK-HELD");
            declareFunction("rkf_uttrdr_pmg_find_pmd_by_name", "RKF-UTTRDR-PMG-FIND-PMD-BY-NAME", 2, 0, false);
            declareFunction("rkf_uttrdr_pmg_find_pmd", "RKF-UTTRDR-PMG-FIND-PMD", 2, 0, false);
            declareFunction("rkf_uttrdr_pmg_add_tool", "RKF-UTTRDR-PMG-ADD-TOOL", 2, 0, false);
            declareFunction("rkf_uttrdr_pmg_locate_pmd", "RKF-UTTRDR-PMG-LOCATE-PMD", 2, 0, false);
            declareFunction("rkf_uttrdr_pmg_is_knownP", "RKF-UTTRDR-PMG-IS-KNOWN?", 2, 0, false);
            declareFunction("rkf_uttrdr_pmg_update_pmd", "RKF-UTTRDR-PMG-UPDATE-PMD", 2, 0, false);
            declareFunction("rkf_uttrdr_pmg_classify_pmd", "RKF-UTTRDR-PMG-CLASSIFY-PMD", 2, 0, false);
            declareFunction("rkf_uttrdr_find_parse_module_group", "RKF-UTTRDR-FIND-PARSE-MODULE-GROUP", 1, 0, false);
            declareFunction("rkf_uttrdr_give_parse_module_group", "RKF-UTTRDR-GIVE-PARSE-MODULE-GROUP", 1, 0, false);
            declareFunction("rkf_uttrdr_show_parsers", "RKF-UTTRDR-SHOW-PARSERS", 1, 0, false);
            declareFunction("rkf_uttrdr_all_supported_categories", "RKF-UTTRDR-ALL-SUPPORTED-CATEGORIES", 0, 0, false);
            declareFunction("rkf_uttrdr_reset_all_supported_categories", "RKF-UTTRDR-RESET-ALL-SUPPORTED-CATEGORIES", 0, 0, false);
            declareFunction("rkf_uttrdr_all_supported_categories_internal", "RKF-UTTRDR-ALL-SUPPORTED-CATEGORIES-INTERNAL", 0, 0, false);
            declareFunction("rkf_uttrdr_register_parser", "RKF-UTTRDR-REGISTER-PARSER", 2, 0, false);
            declareFunction("rkf_uttrdr_deregister_all_parsers", "RKF-UTTRDR-DEREGISTER-ALL-PARSERS", 0, 0, false);
            declareMacro("register_known_parser_module", "REGISTER-KNOWN-PARSER-MODULE");
            declareFunction("pmd_npp_quality", "PMD-NPP-QUALITY", 0, 0, false);
            declareFunction("rkf_uttrdr_use_template_parser", "RKF-UTTRDR-USE-TEMPLATE-PARSER", 4, 0, false);
            declareFunction("rkf_uttrdr_parse_inf_vbar", "RKF-UTTRDR-PARSE-INF-VBAR", 4, 0, false);
            declareFunction("rkf_uttrdr_use_noun_phrase_parser", "RKF-UTTRDR-USE-NOUN-PHRASE-PARSER", 4, 0, false);
            declareFunction("rkf_uttrdr_use_noun_compound_parser", "RKF-UTTRDR-USE-NOUN-COMPOUND-PARSER", 4, 0, false);
            declareFunction("rkf_uttrdr_use_noun_compound_lexicon", "RKF-UTTRDR-USE-NOUN-COMPOUND-LEXICON", 4, 0, false);
            declareFunction("rkf_uttrdr_use_multi_word_denotations", "RKF-UTTRDR-USE-MULTI-WORD-DENOTATIONS", 4, 0, false);
            declareFunction("rkf_uttrdr_use_denots_of_string", "RKF-UTTRDR-USE-DENOTS-OF-STRING", 4, 0, false);
            declareFunction("rkf_uttrdr_read_as_string", "RKF-UTTRDR-READ-AS-STRING", 4, 0, false);
            declareFunction("rkf_uttrdr_read_cycl_term_from_string", "RKF-UTTRDR-READ-CYCL-TERM-FROM-STRING", 4, 0, false);
            declareFunction("rkf_term_from_string", "RKF-TERM-FROM-STRING", 2, 1, false);
            declareFunction("rkf_uttrdr_generic_lexical_parser", "RKF-UTTRDR-GENERIC-LEXICAL-PARSER", 5, 0, false);
            declareFunction("rkf_uttrdr_use_number_parser", "RKF-UTTRDR-USE-NUMBER-PARSER", 4, 0, false);
            declareFunction("rkf_number_parser", "RKF-NUMBER-PARSER", 2, 1, false);
            declareFunction("rkf_uttrdr_turn_terms_into_parse_result", "RKF-UTTRDR-TURN-TERMS-INTO-PARSE-RESULT", 3, 0, false);
            declareFunction("rkf_uttrdr_turn_tokens_into_span", "RKF-UTTRDR-TURN-TOKENS-INTO-SPAN", 1, 0, false);
            declareFunction("rkf_uttrdr_interpret_nltagfn_terms", "RKF-UTTRDR-INTERPRET-NLTAGFN-TERMS", 2, 0, false);
            declareFunction("rkf_uttrdr_interpret_nltagfn_term", "RKF-UTTRDR-INTERPRET-NLTAGFN-TERM", 2, 0, false);
            declareFunction("rkf_uttrdr_perform_parsing", "RKF-UTTRDR-PERFORM-PARSING", 4, 0, false);
            declareFunction("rkf_uttrdr_reconsider_parse_result_semantics", "RKF-UTTRDR-RECONSIDER-PARSE-RESULT-SEMANTICS", 2, 0, false);
            declareFunction("rkf_uttrdr_parsing_in_category", "RKF-UTTRDR-PARSING-IN-CATEGORY", 4, 0, false);
            declareFunction("rkf_uttrd_parse_with_assistants", "RKF-UTTRD-PARSE-WITH-ASSISTANTS", 5, 0, false);
            declareFunction("rkf_uttrdr_merge_parse_results", "RKF-UTTRDR-MERGE-PARSE-RESULTS", 2, 0, false);
            declareFunction("rkf_uttrdr_compute_applicable_asisstants", "RKF-UTTRDR-COMPUTE-APPLICABLE-ASISSTANTS", 1, 0, false);
            declareFunction("rkf_uttrdr_triage_results", "RKF-UTTRDR-TRIAGE-RESULTS", 3, 0, false);
            declareFunction("rkf_uttrdr_separate_wheat_and_chaffe", "RKF-UTTRDR-SEPARATE-WHEAT-AND-CHAFFE", 2, 0, false);
            declareFunction("rkf_uttrdr_sanity_check_arg", "RKF-UTTRDR-SANITY-CHECK-ARG", 4, 0, false);
            declareFunction("rkf_uttrdr_incomplete_constituents", "RKF-UTTRDR-INCOMPLETE-CONSTITUENTS", 3, 0, false);
            declareFunction("rkf_uttrdr_remove_incomplete_failed", "RKF-UTTRDR-REMOVE-INCOMPLETE-FAILED", 2, 0, false);
            declareFunction("rkf_uttrdr_augment_constitutents", "RKF-UTTRDR-AUGMENT-CONSTITUTENTS", 2, 0, false);
            declareFunction("rkf_uttrdr_apply_solutions_to_constituents", "RKF-UTTRDR-APPLY-SOLUTIONS-TO-CONSTITUENTS", 1, 0, false);
            declareFunction("rkf_uttrdr_potentially_resolve_icycl", "RKF-UTTRDR-POTENTIALLY-RESOLVE-ICYCL", 2, 0, false);
            declareFunction("rkf_uttrdr_generate_parse_from_parse_result", "RKF-UTTRDR-GENERATE-PARSE-FROM-PARSE-RESULT", 1, 0, false);
            declareFunction("rkf_uttrdr_order_parses", "RKF-UTTRDR-ORDER-PARSES", 2, 0, false);
            declareFunction("cycl_of_possibly_itp_semantics", "CYCL-OF-POSSIBLY-ITP-SEMANTICS", 1, 0, false);
            declareFunction("parse_a_sentence_completely", "PARSE-A-SENTENCE-COMPLETELY", 1, 2, false);
            declareFunction("parse_a_sentence_completely_wff", "PARSE-A-SENTENCE-COMPLETELY-WFF", 2, 1, false);
            declareFunction("parse_a_question_completely", "PARSE-A-QUESTION-COMPLETELY", 2, 1, false);
            declareFunction("parse_a_question_completely_wff", "PARSE-A-QUESTION-COMPLETELY-WFF", 2, 1, false);
            declareFunction("top_level_parses", "TOP-LEVEL-PARSES", 1, 0, false);
            declareFunction("parse_a_sentence_completely_tct", "PARSE-A-SENTENCE-COMPLETELY-TCT", 3, 1, false);
            declareFunction("parse_a_question_completely_tct", "PARSE-A-QUESTION-COMPLETELY-TCT", 3, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("parse_a_sentence_completely", "PARSE-A-SENTENCE-COMPLETELY", 2, 1, false);
        }
        return NIL;
    }

    public static SubLObject declare_rkf_text_processors_file_Previous() {
        declareFunction("rkf_textproc_parse_to_dictionary", "RKF-TEXTPROC-PARSE-TO-DICTIONARY", 1, 1, false);
        declareFunction("rkf_textproc_preprocess_interps", "RKF-TEXTPROC-PREPROCESS-INTERPS", 1, 0, false);
        declareMacro("with_fully_resolved_parses", "WITH-FULLY-RESOLVED-PARSES");
        declareFunction("rkf_textproc_dictionary_to_parse", "RKF-TEXTPROC-DICTIONARY-TO-PARSE", 1, 0, false);
        declareFunction("rkf_textproc_dictionary_to_parse_wXsurrogates", "RKF-TEXTPROC-DICTIONARY-TO-PARSE-W/SURROGATES", 1, 0, false);
        declareFunction("rkf_textproc_dictionary_to_resolved_parse", "RKF-TEXTPROC-DICTIONARY-TO-RESOLVED-PARSE", 1, 0, false);
        declareFunction("resolve_parse_interpretation", "RESOLVE-PARSE-INTERPRETATION", 3, 0, false);
        declareFunction("maybe_resolve_result_of_parsing_naut", "MAYBE-RESOLVE-RESULT-OF-PARSING-NAUT", 3, 0, false);
        declareFunction("resolve_result_of_parsing_naut", "RESOLVE-RESULT-OF-PARSING-NAUT", 3, 0, false);
        declareFunction("resolve_parse_interpretation_args", "RESOLVE-PARSE-INTERPRETATION-ARGS", 3, 0, false);
        declareFunction("rkf_parse_bindings_wffP", "RKF-PARSE-BINDINGS-WFF?", 2, 0, false);
        declareFunction("rkf_parse_subst_bindings", "RKF-PARSE-SUBST-BINDINGS", 2, 0, false);
        declareFunction("rkf_parse_wff_check_template", "RKF-PARSE-WFF-CHECK-TEMPLATE", 1, 0, false);
        declareFunction("rkf_textproc_interpret_nlterm", "RKF-TEXTPROC-INTERPRET-NLTERM", 2, 0, false);
        declareFunction("rkf_textproc_interpret_nlterms", "RKF-TEXTPROC-INTERPRET-NLTERMS", 2, 0, false);
        declareFunction("parse_result_print_function_trampoline", "PARSE-RESULT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("parse_result_p", "PARSE-RESULT-P", 1, 0, false);
        new rkf_text_processors.$parse_result_p$UnaryFunction();
        declareFunction("parse_result_original", "PARSE-RESULT-ORIGINAL", 1, 0, false);
        declareFunction("parse_result_constituents", "PARSE-RESULT-CONSTITUENTS", 1, 0, false);
        declareFunction("parse_result_eliminated", "PARSE-RESULT-ELIMINATED", 1, 0, false);
        declareFunction("parse_result_problems", "PARSE-RESULT-PROBLEMS", 1, 0, false);
        declareFunction("parse_result_solutions", "PARSE-RESULT-SOLUTIONS", 1, 0, false);
        declareFunction("_csetf_parse_result_original", "_CSETF-PARSE-RESULT-ORIGINAL", 2, 0, false);
        declareFunction("_csetf_parse_result_constituents", "_CSETF-PARSE-RESULT-CONSTITUENTS", 2, 0, false);
        declareFunction("_csetf_parse_result_eliminated", "_CSETF-PARSE-RESULT-ELIMINATED", 2, 0, false);
        declareFunction("_csetf_parse_result_problems", "_CSETF-PARSE-RESULT-PROBLEMS", 2, 0, false);
        declareFunction("_csetf_parse_result_solutions", "_CSETF-PARSE-RESULT-SOLUTIONS", 2, 0, false);
        declareFunction("make_parse_result", "MAKE-PARSE-RESULT", 0, 1, false);
        declareFunction("visit_defstruct_parse_result", "VISIT-DEFSTRUCT-PARSE-RESULT", 2, 0, false);
        declareFunction("visit_defstruct_object_parse_result_method", "VISIT-DEFSTRUCT-OBJECT-PARSE-RESULT-METHOD", 2, 0, false);
        declareFunction("print_parse_result", "PRINT-PARSE-RESULT", 3, 0, false);
        declareMacro("with_verbose_rkf_textproc_parse_result", "WITH-VERBOSE-RKF-TEXTPROC-PARSE-RESULT");
        declareFunction("new_parse_result", "NEW-PARSE-RESULT", 1, 0, false);
        declareFunction("seed_parse_result_constituents", "SEED-PARSE-RESULT-CONSTITUENTS", 1, 0, false);
        declareFunction("debug_reset_parse_results", "DEBUG-RESET-PARSE-RESULTS", 1, 0, false);
        declareFunction("parse_result_emptyP", "PARSE-RESULT-EMPTY?", 1, 0, false);
        declareFunction("parse_result_open_issuesP", "PARSE-RESULT-OPEN-ISSUES?", 1, 0, false);
        declareFunction("parse_result_known_solutionsP", "PARSE-RESULT-KNOWN-SOLUTIONS?", 1, 0, false);
        declareFunction("parse_result_known_constituentP", "PARSE-RESULT-KNOWN-CONSTITUENT?", 2, 0, false);
        declareFunction("debug_display_parse_result", "DEBUG-DISPLAY-PARSE-RESULT", 1, 1, false);
        declareFunction("debug_display_one_parts_dictionary", "DEBUG-DISPLAY-ONE-PARTS-DICTIONARY", 2, 1, false);
        declareMacro("without_nltags_returned", "WITHOUT-NLTAGS-RETURNED");
        declareFunction("rkf_uttrdr_are_nltags_allowedP", "RKF-UTTRDR-ARE-NLTAGS-ALLOWED?", 0, 0, false);
        declareMacro("with_full_spans_only_returned", "WITH-FULL-SPANS-ONLY-RETURNED");
        declareMacro("with_subspans_returned", "WITH-SUBSPANS-RETURNED");
        declareFunction("rkf_uttrdr_full_spans_onlyP", "RKF-UTTRDR-FULL-SPANS-ONLY?", 0, 0, false);
        declareFunction("rkf_utterance_reader", "RKF-UTTERANCE-READER", 4, 0, false);
        declareFunction("rkf_uttrdr_replace_pronouns", "RKF-UTTRDR-REPLACE-PRONOUNS", 1, 0, false);
        declareFunction("rkf_imperative_reader", "RKF-IMPERATIVE-READER", 3, 0, false);
        declareFunction("rkf_sentence_reader", "RKF-SENTENCE-READER", 3, 0, false);
        declareFunction("rkf_question_reader", "RKF-QUESTION-READER", 3, 0, false);
        declareFunction("rkf_store_rtp_parses_in_pipeline", "RKF-STORE-RTP-PARSES-IN-PIPELINE", 4, 0, false);
        declareFunction("rkf_phrase_reader", "RKF-PHRASE-READER", 3, 1, false);
        declareFunction("rkf_uttrdr_maybe_initialize_arg_type_template_categories", "RKF-UTTRDR-MAYBE-INITIALIZE-ARG-TYPE-TEMPLATE-CATEGORIES", 0, 0, false);
        declareFunction("rkf_uttrdr_initialize_arg_type_template_categories", "RKF-UTTRDR-INITIALIZE-ARG-TYPE-TEMPLATE-CATEGORIES", 0, 0, false);
        declareFunction("rkf_uttrdr_templates_for_arg_type", "RKF-UTTRDR-TEMPLATES-FOR-ARG-TYPE", 2, 0, false);
        declareFunction("rkf_uttrdr_remove_sub_parses", "RKF-UTTRDR-REMOVE-SUB-PARSES", 2, 0, false);
        declareMacro("with_parsers_ordered_by_quality", "WITH-PARSERS-ORDERED-BY-QUALITY");
        declareFunction("template_category_from_parse_spec", "TEMPLATE-CATEGORY-FROM-PARSE-SPEC", 2, 0, false);
        declareFunction("rkf_term_reader", "RKF-TERM-READER", 3, 1, false);
        declareFunction("rkf_term_in_sentence_reader", "RKF-TERM-IN-SENTENCE-READER", 3, 1, false);
        declareFunction("rkf_assertion_reader", "RKF-ASSERTION-READER", 3, 0, false);
        declareFunction("rkf_query_reader", "RKF-QUERY-READER", 3, 0, false);
        declareFunction("rkf_scenario_reader", "RKF-SCENARIO-READER", 3, 0, false);
        declareFunction("rkf_parse_date_unambiguously_from_string", "RKF-PARSE-DATE-UNAMBIGUOUSLY-FROM-STRING", 1, 0, false);
        declareFunction("simple_rkf_date_reader", "SIMPLE-RKF-DATE-READER", 1, 2, false);
        declareFunction("rkf_date_reader", "RKF-DATE-READER", 3, 0, false);
        declareFunction("rkf_text_processor_reset_caches", "RKF-TEXT-PROCESSOR-RESET-CACHES", 0, 0, false);
        declareFunction("rkf_terms_forager", "RKF-TERMS-FORAGER", 3, 0, false);
        declareFunction("parse_module_definition_print_function_trampoline", "PARSE-MODULE-DEFINITION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("parse_module_definition_p", "PARSE-MODULE-DEFINITION-P", 1, 0, false);
        new rkf_text_processors.$parse_module_definition_p$UnaryFunction();
        declareFunction("pmd_name", "PMD-NAME", 1, 0, false);
        declareFunction("pmd_category", "PMD-CATEGORY", 1, 0, false);
        declareFunction("pmd_quality", "PMD-QUALITY", 1, 0, false);
        declareFunction("pmd_entry_point", "PMD-ENTRY-POINT", 1, 0, false);
        declareFunction("pmd_cost", "PMD-COST", 1, 0, false);
        declareFunction("pmd_expected_expansions", "PMD-EXPECTED-EXPANSIONS", 1, 0, false);
        declareFunction("pmd_supplants", "PMD-SUPPLANTS", 1, 0, false);
        declareFunction("_csetf_pmd_name", "_CSETF-PMD-NAME", 2, 0, false);
        declareFunction("_csetf_pmd_category", "_CSETF-PMD-CATEGORY", 2, 0, false);
        declareFunction("_csetf_pmd_quality", "_CSETF-PMD-QUALITY", 2, 0, false);
        declareFunction("_csetf_pmd_entry_point", "_CSETF-PMD-ENTRY-POINT", 2, 0, false);
        declareFunction("_csetf_pmd_cost", "_CSETF-PMD-COST", 2, 0, false);
        declareFunction("_csetf_pmd_expected_expansions", "_CSETF-PMD-EXPECTED-EXPANSIONS", 2, 0, false);
        declareFunction("_csetf_pmd_supplants", "_CSETF-PMD-SUPPLANTS", 2, 0, false);
        declareFunction("make_parse_module_definition", "MAKE-PARSE-MODULE-DEFINITION", 0, 1, false);
        declareFunction("visit_defstruct_parse_module_definition", "VISIT-DEFSTRUCT-PARSE-MODULE-DEFINITION", 2, 0, false);
        declareFunction("visit_defstruct_object_parse_module_definition_method", "VISIT-DEFSTRUCT-OBJECT-PARSE-MODULE-DEFINITION-METHOD", 2, 0, false);
        declareFunction("pmd_print", "PMD-PRINT", 3, 0, false);
        declareFunction("new_parse_module_definition", "NEW-PARSE-MODULE-DEFINITION", 4, 3, false);
        declareFunction("rkf_uttrdr_copy_pmd", "RKF-UTTRDR-COPY-PMD", 2, 0, false);
        declareFunction("rkf_uttrdr_pmd_classify", "RKF-UTTRDR-PMD-CLASSIFY", 1, 0, false);
        declareFunction("rkf_uttrdr_pmd_choose_better", "RKF-UTTRDR-PMD-CHOOSE-BETTER", 2, 0, false);
        declareFunction("pmd_resolved_quality", "PMD-RESOLVED-QUALITY", 1, 0, false);
        declareFunction("rkf_uttrdr_pmd_orderedP", "RKF-UTTRDR-PMD-ORDERED?", 2, 0, false);
        declareFunction("rkf_uttrdr_explain_pmd", "RKF-UTTRDR-EXPLAIN-PMD", 1, 0, false);
        declareFunction("rkf_uttrdr_pmd_supplantsP", "RKF-UTTRDR-PMD-SUPPLANTS?", 2, 0, false);
        declareFunction("rkf_uttrdr_invoke_pmd", "RKF-UTTRDR-INVOKE-PMD", 5, 0, false);
        declareFunction("parse_module_group_print_function_trampoline", "PARSE-MODULE-GROUP-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("parse_module_group_p", "PARSE-MODULE-GROUP-P", 1, 0, false);
        new rkf_text_processors.$parse_module_group_p$UnaryFunction();
        declareFunction("pmg_category", "PMG-CATEGORY", 1, 0, false);
        declareFunction("pmg_tools", "PMG-TOOLS", 1, 0, false);
        declareFunction("_csetf_pmg_category", "_CSETF-PMG-CATEGORY", 2, 0, false);
        declareFunction("_csetf_pmg_tools", "_CSETF-PMG-TOOLS", 2, 0, false);
        declareFunction("make_parse_module_group", "MAKE-PARSE-MODULE-GROUP", 0, 1, false);
        declareFunction("visit_defstruct_parse_module_group", "VISIT-DEFSTRUCT-PARSE-MODULE-GROUP", 2, 0, false);
        declareFunction("visit_defstruct_object_parse_module_group_method", "VISIT-DEFSTRUCT-OBJECT-PARSE-MODULE-GROUP-METHOD", 2, 0, false);
        declareFunction("pmg_ordered_tools", "PMG-ORDERED-TOOLS", 1, 0, false);
        declareFunction("sorted_by_quality", "SORTED-BY-QUALITY", 1, 0, false);
        declareFunction("pmd_expected_expansionsL", "PMD-EXPECTED-EXPANSIONS<", 2, 0, false);
        declareFunction("pmd_costL", "PMD-COST<", 2, 0, false);
        declareFunction("pmd_qualityL", "PMD-QUALITY<", 2, 0, false);
        declareFunction("new_parse_module_group", "NEW-PARSE-MODULE-GROUP", 1, 0, false);
        declareFunction("rkf_uttrdr_explain_pmg", "RKF-UTTRDR-EXPLAIN-PMG", 1, 0, false);
        declareMacro("with_known_parsers_lock_held", "WITH-KNOWN-PARSERS-LOCK-HELD");
        declareFunction("rkf_uttrdr_pmg_find_pmd_by_name", "RKF-UTTRDR-PMG-FIND-PMD-BY-NAME", 2, 0, false);
        declareFunction("rkf_uttrdr_pmg_find_pmd", "RKF-UTTRDR-PMG-FIND-PMD", 2, 0, false);
        declareFunction("rkf_uttrdr_pmg_add_tool", "RKF-UTTRDR-PMG-ADD-TOOL", 2, 0, false);
        declareFunction("rkf_uttrdr_pmg_locate_pmd", "RKF-UTTRDR-PMG-LOCATE-PMD", 2, 0, false);
        declareFunction("rkf_uttrdr_pmg_is_knownP", "RKF-UTTRDR-PMG-IS-KNOWN?", 2, 0, false);
        declareFunction("rkf_uttrdr_pmg_update_pmd", "RKF-UTTRDR-PMG-UPDATE-PMD", 2, 0, false);
        declareFunction("rkf_uttrdr_pmg_classify_pmd", "RKF-UTTRDR-PMG-CLASSIFY-PMD", 2, 0, false);
        declareFunction("rkf_uttrdr_find_parse_module_group", "RKF-UTTRDR-FIND-PARSE-MODULE-GROUP", 1, 0, false);
        declareFunction("rkf_uttrdr_give_parse_module_group", "RKF-UTTRDR-GIVE-PARSE-MODULE-GROUP", 1, 0, false);
        declareFunction("rkf_uttrdr_show_parsers", "RKF-UTTRDR-SHOW-PARSERS", 1, 0, false);
        declareFunction("rkf_uttrdr_all_supported_categories", "RKF-UTTRDR-ALL-SUPPORTED-CATEGORIES", 0, 0, false);
        declareFunction("rkf_uttrdr_reset_all_supported_categories", "RKF-UTTRDR-RESET-ALL-SUPPORTED-CATEGORIES", 0, 0, false);
        declareFunction("rkf_uttrdr_all_supported_categories_internal", "RKF-UTTRDR-ALL-SUPPORTED-CATEGORIES-INTERNAL", 0, 0, false);
        declareFunction("rkf_uttrdr_register_parser", "RKF-UTTRDR-REGISTER-PARSER", 2, 0, false);
        declareFunction("rkf_uttrdr_deregister_all_parsers", "RKF-UTTRDR-DEREGISTER-ALL-PARSERS", 0, 0, false);
        declareMacro("register_known_parser_module", "REGISTER-KNOWN-PARSER-MODULE");
        declareFunction("pmd_npp_quality", "PMD-NPP-QUALITY", 0, 0, false);
        declareFunction("rkf_uttrdr_use_template_parser", "RKF-UTTRDR-USE-TEMPLATE-PARSER", 4, 0, false);
        declareFunction("rkf_uttrdr_parse_inf_vbar", "RKF-UTTRDR-PARSE-INF-VBAR", 4, 0, false);
        declareFunction("rkf_uttrdr_use_noun_phrase_parser", "RKF-UTTRDR-USE-NOUN-PHRASE-PARSER", 4, 0, false);
        declareFunction("rkf_uttrdr_use_noun_compound_parser", "RKF-UTTRDR-USE-NOUN-COMPOUND-PARSER", 4, 0, false);
        declareFunction("rkf_uttrdr_use_noun_compound_lexicon", "RKF-UTTRDR-USE-NOUN-COMPOUND-LEXICON", 4, 0, false);
        declareFunction("rkf_uttrdr_use_multi_word_denotations", "RKF-UTTRDR-USE-MULTI-WORD-DENOTATIONS", 4, 0, false);
        declareFunction("rkf_uttrdr_use_denots_of_string", "RKF-UTTRDR-USE-DENOTS-OF-STRING", 4, 0, false);
        declareFunction("rkf_uttrdr_read_as_string", "RKF-UTTRDR-READ-AS-STRING", 4, 0, false);
        declareFunction("rkf_uttrdr_read_cycl_term_from_string", "RKF-UTTRDR-READ-CYCL-TERM-FROM-STRING", 4, 0, false);
        declareFunction("rkf_term_from_string", "RKF-TERM-FROM-STRING", 2, 1, false);
        declareFunction("rkf_uttrdr_generic_lexical_parser", "RKF-UTTRDR-GENERIC-LEXICAL-PARSER", 5, 0, false);
        declareFunction("rkf_uttrdr_use_number_parser", "RKF-UTTRDR-USE-NUMBER-PARSER", 4, 0, false);
        declareFunction("rkf_number_parser", "RKF-NUMBER-PARSER", 2, 1, false);
        declareFunction("rkf_uttrdr_turn_terms_into_parse_result", "RKF-UTTRDR-TURN-TERMS-INTO-PARSE-RESULT", 3, 0, false);
        declareFunction("rkf_uttrdr_turn_tokens_into_span", "RKF-UTTRDR-TURN-TOKENS-INTO-SPAN", 1, 0, false);
        declareFunction("rkf_uttrdr_interpret_nltagfn_terms", "RKF-UTTRDR-INTERPRET-NLTAGFN-TERMS", 2, 0, false);
        declareFunction("rkf_uttrdr_interpret_nltagfn_term", "RKF-UTTRDR-INTERPRET-NLTAGFN-TERM", 2, 0, false);
        declareFunction("rkf_uttrdr_perform_parsing", "RKF-UTTRDR-PERFORM-PARSING", 4, 0, false);
        declareFunction("rkf_uttrdr_reconsider_parse_result_semantics", "RKF-UTTRDR-RECONSIDER-PARSE-RESULT-SEMANTICS", 2, 0, false);
        declareFunction("rkf_uttrdr_parsing_in_category", "RKF-UTTRDR-PARSING-IN-CATEGORY", 4, 0, false);
        declareFunction("rkf_uttrd_parse_with_assistants", "RKF-UTTRD-PARSE-WITH-ASSISTANTS", 5, 0, false);
        declareFunction("rkf_uttrdr_merge_parse_results", "RKF-UTTRDR-MERGE-PARSE-RESULTS", 2, 0, false);
        declareFunction("rkf_uttrdr_compute_applicable_asisstants", "RKF-UTTRDR-COMPUTE-APPLICABLE-ASISSTANTS", 1, 0, false);
        declareFunction("rkf_uttrdr_triage_results", "RKF-UTTRDR-TRIAGE-RESULTS", 3, 0, false);
        declareFunction("rkf_uttrdr_separate_wheat_and_chaffe", "RKF-UTTRDR-SEPARATE-WHEAT-AND-CHAFFE", 2, 0, false);
        declareFunction("rkf_uttrdr_sanity_check_arg", "RKF-UTTRDR-SANITY-CHECK-ARG", 4, 0, false);
        declareFunction("rkf_uttrdr_incomplete_constituents", "RKF-UTTRDR-INCOMPLETE-CONSTITUENTS", 3, 0, false);
        declareFunction("rkf_uttrdr_remove_incomplete_failed", "RKF-UTTRDR-REMOVE-INCOMPLETE-FAILED", 2, 0, false);
        declareFunction("rkf_uttrdr_augment_constitutents", "RKF-UTTRDR-AUGMENT-CONSTITUTENTS", 2, 0, false);
        declareFunction("rkf_uttrdr_apply_solutions_to_constituents", "RKF-UTTRDR-APPLY-SOLUTIONS-TO-CONSTITUENTS", 1, 0, false);
        declareFunction("rkf_uttrdr_potentially_resolve_icycl", "RKF-UTTRDR-POTENTIALLY-RESOLVE-ICYCL", 2, 0, false);
        declareFunction("rkf_uttrdr_generate_parse_from_parse_result", "RKF-UTTRDR-GENERATE-PARSE-FROM-PARSE-RESULT", 1, 0, false);
        declareFunction("rkf_uttrdr_order_parses", "RKF-UTTRDR-ORDER-PARSES", 2, 0, false);
        declareFunction("cycl_of_possibly_itp_semantics", "CYCL-OF-POSSIBLY-ITP-SEMANTICS", 1, 0, false);
        declareFunction("parse_a_sentence_completely", "PARSE-A-SENTENCE-COMPLETELY", 1, 2, false);
        declareFunction("parse_a_sentence_completely_wff", "PARSE-A-SENTENCE-COMPLETELY-WFF", 2, 1, false);
        declareFunction("parse_a_question_completely", "PARSE-A-QUESTION-COMPLETELY", 2, 1, false);
        declareFunction("parse_a_question_completely_wff", "PARSE-A-QUESTION-COMPLETELY-WFF", 2, 1, false);
        declareFunction("top_level_parses", "TOP-LEVEL-PARSES", 1, 0, false);
        declareFunction("parse_a_sentence_completely_tct", "PARSE-A-SENTENCE-COMPLETELY-TCT", 3, 1, false);
        declareFunction("parse_a_question_completely_tct", "PARSE-A-QUESTION-COMPLETELY-TCT", 3, 1, false);
        return NIL;
    }

    public static final SubLObject init_rkf_text_processors_file_alt() {
        defparameter("*RKF-TEXT-PROC-RESOLVE-PARSES*", NIL);
        deflexical("*RESOLVE-PARSE-INTERPRETATION-MAX-DEPTH*", FIVE_INTEGER);
        defparameter("*RESOLVE-PARSE-RECURSION-DEPTH*", ZERO_INTEGER);
        defparameter("*RESOLVE-PARSE-RECURSION-SHOW-WARNINGS?*", NIL);
        defconstant("*DTP-PARSE-RESULT*", PARSE_RESULT);
        defparameter("*RKF-TEXTPROC-PRINT-PARSE-RESULT-TERSELY*", T);
        defparameter("*RKF-UTTRDR-ALLOW-NLTAGS?*", T);
        defparameter("*RKF-UTTRDR-FULL-SPANS-ONLY?*", NIL);
        defconstant("*RKF-TERM-READER-DEFAULT-TEMPLATES*", $list_alt54);
        deflexical("*RKF-TERM-READER-CYCL-TEMPLATE-MAPPINGS*", $list_alt55);
        deflexical("*RKF-UTTRDR-ARG-TYPE-TO-TEMPLATE-CATEGORIES*", NIL);
        defparameter("*PMG-ORDERING*", NIL);
        deflexical("*RKF-TERMS-FORAGER-LOCK*", NIL != boundp($rkf_terms_forager_lock$) ? ((SubLObject) ($rkf_terms_forager_lock$.getGlobalValue())) : make_lock($$$Terms_Forager));
        defconstant("*DTP-PARSE-MODULE-DEFINITION*", PARSE_MODULE_DEFINITION);
        deflexical("*RKF-UTTRDR-DEFAULT-COST*", TEN_INTEGER);
        deflexical("*RKF-UTTRDR-DEFAULT-EXPECTED-EXPANSIONS*", FIVE_INTEGER);
        defconstant("*DTP-PARSE-MODULE-GROUP*", PARSE_MODULE_GROUP);
        deflexical("*RKF-UTTRDR-KNOWN-PARSERS*", NIL != boundp($rkf_uttrdr_known_parsers$) ? ((SubLObject) ($rkf_uttrdr_known_parsers$.getGlobalValue())) : NIL);
        deflexical("*RKF-UTTRDR-RESOLVABLES*", NIL);
        defparameter("*RKF-UTTRDR-PSP-RETURN-MODE*", $BEST_ONLY);
        deflexical("*RKF-UTTRDR-KNOWN-PARSERS-LOCK*", make_lock($$$Known_Parsers));
        defparameter("*RKF-UTTRDR-USE-VPP-IN-ITP*", T);
        deflexical("*RKF-UTTRDR-MARKER*", gensym($str_alt184$RKF_UTTRDR_MARKER));
        return NIL;
    }

    public static SubLObject init_rkf_text_processors_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*RKF-TEXT-PROC-RESOLVE-PARSES*", NIL);
            deflexical("*RESOLVE-PARSE-INTERPRETATION-MAX-DEPTH*", FIVE_INTEGER);
            defparameter("*RESOLVE-PARSE-RECURSION-DEPTH*", ZERO_INTEGER);
            defparameter("*RESOLVE-PARSE-RECURSION-SHOW-WARNINGS?*", NIL);
            defconstant("*DTP-PARSE-RESULT*", PARSE_RESULT);
            defparameter("*RKF-TEXTPROC-PRINT-PARSE-RESULT-TERSELY*", T);
            defparameter("*RKF-UTTRDR-ALLOW-NLTAGS?*", T);
            defparameter("*RKF-UTTRDR-FULL-SPANS-ONLY?*", NIL);
            defconstant("*RKF-TERM-READER-DEFAULT-TEMPLATES*", $list57);
            deflexical("*RKF-TERM-READER-CYCL-TEMPLATE-MAPPINGS*", $list58);
            deflexical("*RKF-UTTRDR-ARG-TYPE-TO-TEMPLATE-CATEGORIES*", NIL);
            defparameter("*PMG-ORDERING*", NIL);
            deflexical("*RKF-TERMS-FORAGER-LOCK*", SubLTrampolineFile.maybeDefault($rkf_terms_forager_lock$, $rkf_terms_forager_lock$, () -> make_lock($$$Terms_Forager)));
            defconstant("*DTP-PARSE-MODULE-DEFINITION*", PARSE_MODULE_DEFINITION);
            deflexical("*RKF-UTTRDR-DEFAULT-COST*", TEN_INTEGER);
            deflexical("*RKF-UTTRDR-DEFAULT-EXPECTED-EXPANSIONS*", FIVE_INTEGER);
            defconstant("*DTP-PARSE-MODULE-GROUP*", PARSE_MODULE_GROUP);
            deflexical("*RKF-UTTRDR-KNOWN-PARSERS*", SubLTrampolineFile.maybeDefault($rkf_uttrdr_known_parsers$, $rkf_uttrdr_known_parsers$, NIL));
            deflexical("*RKF-UTTRDR-RESOLVABLES*", NIL);
            defparameter("*RKF-UTTRDR-PSP-RETURN-MODE*", $BEST_ONLY);
            deflexical("*RKF-UTTRDR-KNOWN-PARSERS-LOCK*", make_lock($$$Known_Parsers));
            defparameter("*RKF-UTTRDR-USE-VPP-IN-ITP*", T);
            deflexical("*RKF-UTTRDR-MARKER*", gensym($str193$RKF_UTTRDR_MARKER));
        }
        if (SubLFiles.USE_V2) {
            defconstant("*RKF-TERM-READER-DEFAULT-TEMPLATES*", $list_alt54);
            deflexical("*RKF-TERM-READER-CYCL-TEMPLATE-MAPPINGS*", $list_alt55);
            deflexical("*RKF-TERMS-FORAGER-LOCK*", NIL != boundp($rkf_terms_forager_lock$) ? ((SubLObject) ($rkf_terms_forager_lock$.getGlobalValue())) : make_lock($$$Terms_Forager));
            deflexical("*RKF-UTTRDR-KNOWN-PARSERS*", NIL != boundp($rkf_uttrdr_known_parsers$) ? ((SubLObject) ($rkf_uttrdr_known_parsers$.getGlobalValue())) : NIL);
            deflexical("*RKF-UTTRDR-MARKER*", gensym($str_alt184$RKF_UTTRDR_MARKER));
        }
        return NIL;
    }

    public static SubLObject init_rkf_text_processors_file_Previous() {
        defparameter("*RKF-TEXT-PROC-RESOLVE-PARSES*", NIL);
        deflexical("*RESOLVE-PARSE-INTERPRETATION-MAX-DEPTH*", FIVE_INTEGER);
        defparameter("*RESOLVE-PARSE-RECURSION-DEPTH*", ZERO_INTEGER);
        defparameter("*RESOLVE-PARSE-RECURSION-SHOW-WARNINGS?*", NIL);
        defconstant("*DTP-PARSE-RESULT*", PARSE_RESULT);
        defparameter("*RKF-TEXTPROC-PRINT-PARSE-RESULT-TERSELY*", T);
        defparameter("*RKF-UTTRDR-ALLOW-NLTAGS?*", T);
        defparameter("*RKF-UTTRDR-FULL-SPANS-ONLY?*", NIL);
        defconstant("*RKF-TERM-READER-DEFAULT-TEMPLATES*", $list57);
        deflexical("*RKF-TERM-READER-CYCL-TEMPLATE-MAPPINGS*", $list58);
        deflexical("*RKF-UTTRDR-ARG-TYPE-TO-TEMPLATE-CATEGORIES*", NIL);
        defparameter("*PMG-ORDERING*", NIL);
        deflexical("*RKF-TERMS-FORAGER-LOCK*", SubLTrampolineFile.maybeDefault($rkf_terms_forager_lock$, $rkf_terms_forager_lock$, () -> make_lock($$$Terms_Forager)));
        defconstant("*DTP-PARSE-MODULE-DEFINITION*", PARSE_MODULE_DEFINITION);
        deflexical("*RKF-UTTRDR-DEFAULT-COST*", TEN_INTEGER);
        deflexical("*RKF-UTTRDR-DEFAULT-EXPECTED-EXPANSIONS*", FIVE_INTEGER);
        defconstant("*DTP-PARSE-MODULE-GROUP*", PARSE_MODULE_GROUP);
        deflexical("*RKF-UTTRDR-KNOWN-PARSERS*", SubLTrampolineFile.maybeDefault($rkf_uttrdr_known_parsers$, $rkf_uttrdr_known_parsers$, NIL));
        deflexical("*RKF-UTTRDR-RESOLVABLES*", NIL);
        defparameter("*RKF-UTTRDR-PSP-RETURN-MODE*", $BEST_ONLY);
        deflexical("*RKF-UTTRDR-KNOWN-PARSERS-LOCK*", make_lock($$$Known_Parsers));
        defparameter("*RKF-UTTRDR-USE-VPP-IN-ITP*", T);
        deflexical("*RKF-UTTRDR-MARKER*", gensym($str193$RKF_UTTRDR_MARKER));
        return NIL;
    }

    public static final SubLObject setup_rkf_text_processors_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_parse_result$.getGlobalValue(), symbol_function(PARSE_RESULT_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(PARSE_RESULT_ORIGINAL, _CSETF_PARSE_RESULT_ORIGINAL);
        def_csetf(PARSE_RESULT_CONSTITUENTS, _CSETF_PARSE_RESULT_CONSTITUENTS);
        def_csetf(PARSE_RESULT_ELIMINATED, _CSETF_PARSE_RESULT_ELIMINATED);
        def_csetf(PARSE_RESULT_PROBLEMS, _CSETF_PARSE_RESULT_PROBLEMS);
        def_csetf(PARSE_RESULT_SOLUTIONS, _CSETF_PARSE_RESULT_SOLUTIONS);
        identity(PARSE_RESULT);
        declare_defglobal($rkf_terms_forager_lock$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_parse_module_definition$.getGlobalValue(), symbol_function(PARSE_MODULE_DEFINITION_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(PMD_NAME, _CSETF_PMD_NAME);
        def_csetf(PMD_CATEGORY, _CSETF_PMD_CATEGORY);
        def_csetf(PMD_QUALITY, _CSETF_PMD_QUALITY);
        def_csetf(PMD_ENTRY_POINT, _CSETF_PMD_ENTRY_POINT);
        def_csetf(PMD_COST, _CSETF_PMD_COST);
        def_csetf(PMD_EXPECTED_EXPANSIONS, _CSETF_PMD_EXPECTED_EXPANSIONS);
        def_csetf(PMD_SUPPLANTS, _CSETF_PMD_SUPPLANTS);
        identity(PARSE_MODULE_DEFINITION);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_parse_module_group$.getGlobalValue(), symbol_function(PARSE_MODULE_GROUP_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(PMG_CATEGORY, _CSETF_PMG_CATEGORY);
        def_csetf(PMG_TOOLS, _CSETF_PMG_TOOLS);
        identity(PARSE_MODULE_GROUP);
        declare_defglobal($rkf_uttrdr_known_parsers$);
        register_html_state_variable($rkf_uttrdr_psp_return_mode$);
        rkf_uttrdr_deregister_all_parsers();
        {
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list_alt153;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                {
                    SubLObject datum = curr;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = key;
                            if (pcase_var.eql($NAME)) {
                                name = value;
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    category = value;
                                } else {
                                    if (pcase_var.eql($ENTRY_POINT)) {
                                        entry_point = value;
                                    } else {
                                        if (pcase_var.eql($DOC)) {
                                            docstring = value;
                                        } else {
                                            if (pcase_var.eql($QUALITY)) {
                                                quality = value;
                                            } else {
                                                if (pcase_var.eql($COST)) {
                                                    cost = value;
                                                } else {
                                                    if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                        expected_expansions = value;
                                                    } else {
                                                        if (pcase_var.eql($SUPPLANTS)) {
                                                            supplants = value;
                                                        } else {
                                                            Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
            {
                SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                rkf_uttrdr_register_parser(category, pmd);
            }
        }
        {
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list_alt154;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                {
                    SubLObject datum = curr;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = key;
                            if (pcase_var.eql($NAME)) {
                                name = value;
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    category = value;
                                } else {
                                    if (pcase_var.eql($ENTRY_POINT)) {
                                        entry_point = value;
                                    } else {
                                        if (pcase_var.eql($DOC)) {
                                            docstring = value;
                                        } else {
                                            if (pcase_var.eql($QUALITY)) {
                                                quality = value;
                                            } else {
                                                if (pcase_var.eql($COST)) {
                                                    cost = value;
                                                } else {
                                                    if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                        expected_expansions = value;
                                                    } else {
                                                        if (pcase_var.eql($SUPPLANTS)) {
                                                            supplants = value;
                                                        } else {
                                                            Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
            {
                SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                rkf_uttrdr_register_parser(category, pmd);
            }
        }
        {
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list_alt155;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                {
                    SubLObject datum = curr;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = key;
                            if (pcase_var.eql($NAME)) {
                                name = value;
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    category = value;
                                } else {
                                    if (pcase_var.eql($ENTRY_POINT)) {
                                        entry_point = value;
                                    } else {
                                        if (pcase_var.eql($DOC)) {
                                            docstring = value;
                                        } else {
                                            if (pcase_var.eql($QUALITY)) {
                                                quality = value;
                                            } else {
                                                if (pcase_var.eql($COST)) {
                                                    cost = value;
                                                } else {
                                                    if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                        expected_expansions = value;
                                                    } else {
                                                        if (pcase_var.eql($SUPPLANTS)) {
                                                            supplants = value;
                                                        } else {
                                                            Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
            {
                SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                rkf_uttrdr_register_parser(category, pmd);
            }
        }
        {
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list_alt156;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                {
                    SubLObject datum = curr;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = key;
                            if (pcase_var.eql($NAME)) {
                                name = value;
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    category = value;
                                } else {
                                    if (pcase_var.eql($ENTRY_POINT)) {
                                        entry_point = value;
                                    } else {
                                        if (pcase_var.eql($DOC)) {
                                            docstring = value;
                                        } else {
                                            if (pcase_var.eql($QUALITY)) {
                                                quality = value;
                                            } else {
                                                if (pcase_var.eql($COST)) {
                                                    cost = value;
                                                } else {
                                                    if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                        expected_expansions = value;
                                                    } else {
                                                        if (pcase_var.eql($SUPPLANTS)) {
                                                            supplants = value;
                                                        } else {
                                                            Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
            {
                SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                rkf_uttrdr_register_parser(category, pmd);
            }
        }
        {
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list_alt157;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                {
                    SubLObject datum = curr;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = key;
                            if (pcase_var.eql($NAME)) {
                                name = value;
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    category = value;
                                } else {
                                    if (pcase_var.eql($ENTRY_POINT)) {
                                        entry_point = value;
                                    } else {
                                        if (pcase_var.eql($DOC)) {
                                            docstring = value;
                                        } else {
                                            if (pcase_var.eql($QUALITY)) {
                                                quality = value;
                                            } else {
                                                if (pcase_var.eql($COST)) {
                                                    cost = value;
                                                } else {
                                                    if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                        expected_expansions = value;
                                                    } else {
                                                        if (pcase_var.eql($SUPPLANTS)) {
                                                            supplants = value;
                                                        } else {
                                                            Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
            {
                SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                rkf_uttrdr_register_parser(category, pmd);
            }
        }
        {
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list_alt158;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                {
                    SubLObject datum = curr;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = key;
                            if (pcase_var.eql($NAME)) {
                                name = value;
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    category = value;
                                } else {
                                    if (pcase_var.eql($ENTRY_POINT)) {
                                        entry_point = value;
                                    } else {
                                        if (pcase_var.eql($DOC)) {
                                            docstring = value;
                                        } else {
                                            if (pcase_var.eql($QUALITY)) {
                                                quality = value;
                                            } else {
                                                if (pcase_var.eql($COST)) {
                                                    cost = value;
                                                } else {
                                                    if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                        expected_expansions = value;
                                                    } else {
                                                        if (pcase_var.eql($SUPPLANTS)) {
                                                            supplants = value;
                                                        } else {
                                                            Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
            {
                SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                rkf_uttrdr_register_parser(category, pmd);
            }
        }
        {
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list_alt159;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                {
                    SubLObject datum = curr;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = key;
                            if (pcase_var.eql($NAME)) {
                                name = value;
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    category = value;
                                } else {
                                    if (pcase_var.eql($ENTRY_POINT)) {
                                        entry_point = value;
                                    } else {
                                        if (pcase_var.eql($DOC)) {
                                            docstring = value;
                                        } else {
                                            if (pcase_var.eql($QUALITY)) {
                                                quality = value;
                                            } else {
                                                if (pcase_var.eql($COST)) {
                                                    cost = value;
                                                } else {
                                                    if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                        expected_expansions = value;
                                                    } else {
                                                        if (pcase_var.eql($SUPPLANTS)) {
                                                            supplants = value;
                                                        } else {
                                                            Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
            {
                SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                rkf_uttrdr_register_parser(category, pmd);
            }
        }
        {
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list_alt160;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                {
                    SubLObject datum = curr;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = key;
                            if (pcase_var.eql($NAME)) {
                                name = value;
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    category = value;
                                } else {
                                    if (pcase_var.eql($ENTRY_POINT)) {
                                        entry_point = value;
                                    } else {
                                        if (pcase_var.eql($DOC)) {
                                            docstring = value;
                                        } else {
                                            if (pcase_var.eql($QUALITY)) {
                                                quality = value;
                                            } else {
                                                if (pcase_var.eql($COST)) {
                                                    cost = value;
                                                } else {
                                                    if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                        expected_expansions = value;
                                                    } else {
                                                        if (pcase_var.eql($SUPPLANTS)) {
                                                            supplants = value;
                                                        } else {
                                                            Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
            {
                SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                rkf_uttrdr_register_parser(category, pmd);
            }
        }
        {
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list_alt161;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                {
                    SubLObject datum = curr;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = key;
                            if (pcase_var.eql($NAME)) {
                                name = value;
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    category = value;
                                } else {
                                    if (pcase_var.eql($ENTRY_POINT)) {
                                        entry_point = value;
                                    } else {
                                        if (pcase_var.eql($DOC)) {
                                            docstring = value;
                                        } else {
                                            if (pcase_var.eql($QUALITY)) {
                                                quality = value;
                                            } else {
                                                if (pcase_var.eql($COST)) {
                                                    cost = value;
                                                } else {
                                                    if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                        expected_expansions = value;
                                                    } else {
                                                        if (pcase_var.eql($SUPPLANTS)) {
                                                            supplants = value;
                                                        } else {
                                                            Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
            {
                SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                rkf_uttrdr_register_parser(category, pmd);
            }
        }
        {
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list_alt162;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                {
                    SubLObject datum = curr;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = key;
                            if (pcase_var.eql($NAME)) {
                                name = value;
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    category = value;
                                } else {
                                    if (pcase_var.eql($ENTRY_POINT)) {
                                        entry_point = value;
                                    } else {
                                        if (pcase_var.eql($DOC)) {
                                            docstring = value;
                                        } else {
                                            if (pcase_var.eql($QUALITY)) {
                                                quality = value;
                                            } else {
                                                if (pcase_var.eql($COST)) {
                                                    cost = value;
                                                } else {
                                                    if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                        expected_expansions = value;
                                                    } else {
                                                        if (pcase_var.eql($SUPPLANTS)) {
                                                            supplants = value;
                                                        } else {
                                                            Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
            {
                SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                rkf_uttrdr_register_parser(category, pmd);
            }
        }
        {
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list_alt163;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                {
                    SubLObject datum = curr;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = key;
                            if (pcase_var.eql($NAME)) {
                                name = value;
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    category = value;
                                } else {
                                    if (pcase_var.eql($ENTRY_POINT)) {
                                        entry_point = value;
                                    } else {
                                        if (pcase_var.eql($DOC)) {
                                            docstring = value;
                                        } else {
                                            if (pcase_var.eql($QUALITY)) {
                                                quality = value;
                                            } else {
                                                if (pcase_var.eql($COST)) {
                                                    cost = value;
                                                } else {
                                                    if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                        expected_expansions = value;
                                                    } else {
                                                        if (pcase_var.eql($SUPPLANTS)) {
                                                            supplants = value;
                                                        } else {
                                                            Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
            {
                SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                rkf_uttrdr_register_parser(category, pmd);
            }
        }
        {
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list_alt164;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                {
                    SubLObject datum = curr;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = key;
                            if (pcase_var.eql($NAME)) {
                                name = value;
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    category = value;
                                } else {
                                    if (pcase_var.eql($ENTRY_POINT)) {
                                        entry_point = value;
                                    } else {
                                        if (pcase_var.eql($DOC)) {
                                            docstring = value;
                                        } else {
                                            if (pcase_var.eql($QUALITY)) {
                                                quality = value;
                                            } else {
                                                if (pcase_var.eql($COST)) {
                                                    cost = value;
                                                } else {
                                                    if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                        expected_expansions = value;
                                                    } else {
                                                        if (pcase_var.eql($SUPPLANTS)) {
                                                            supplants = value;
                                                        } else {
                                                            Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
            {
                SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                rkf_uttrdr_register_parser(category, pmd);
            }
        }
        {
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list_alt165;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                {
                    SubLObject datum = curr;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = key;
                            if (pcase_var.eql($NAME)) {
                                name = value;
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    category = value;
                                } else {
                                    if (pcase_var.eql($ENTRY_POINT)) {
                                        entry_point = value;
                                    } else {
                                        if (pcase_var.eql($DOC)) {
                                            docstring = value;
                                        } else {
                                            if (pcase_var.eql($QUALITY)) {
                                                quality = value;
                                            } else {
                                                if (pcase_var.eql($COST)) {
                                                    cost = value;
                                                } else {
                                                    if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                        expected_expansions = value;
                                                    } else {
                                                        if (pcase_var.eql($SUPPLANTS)) {
                                                            supplants = value;
                                                        } else {
                                                            Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
            {
                SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                rkf_uttrdr_register_parser(category, pmd);
            }
        }
        {
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list_alt166;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                {
                    SubLObject datum = curr;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = key;
                            if (pcase_var.eql($NAME)) {
                                name = value;
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    category = value;
                                } else {
                                    if (pcase_var.eql($ENTRY_POINT)) {
                                        entry_point = value;
                                    } else {
                                        if (pcase_var.eql($DOC)) {
                                            docstring = value;
                                        } else {
                                            if (pcase_var.eql($QUALITY)) {
                                                quality = value;
                                            } else {
                                                if (pcase_var.eql($COST)) {
                                                    cost = value;
                                                } else {
                                                    if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                        expected_expansions = value;
                                                    } else {
                                                        if (pcase_var.eql($SUPPLANTS)) {
                                                            supplants = value;
                                                        } else {
                                                            Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
            {
                SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                rkf_uttrdr_register_parser(category, pmd);
            }
        }
        {
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list_alt167;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                {
                    SubLObject datum = curr;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = key;
                            if (pcase_var.eql($NAME)) {
                                name = value;
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    category = value;
                                } else {
                                    if (pcase_var.eql($ENTRY_POINT)) {
                                        entry_point = value;
                                    } else {
                                        if (pcase_var.eql($DOC)) {
                                            docstring = value;
                                        } else {
                                            if (pcase_var.eql($QUALITY)) {
                                                quality = value;
                                            } else {
                                                if (pcase_var.eql($COST)) {
                                                    cost = value;
                                                } else {
                                                    if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                        expected_expansions = value;
                                                    } else {
                                                        if (pcase_var.eql($SUPPLANTS)) {
                                                            supplants = value;
                                                        } else {
                                                            Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
            {
                SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                rkf_uttrdr_register_parser(category, pmd);
            }
        }
        {
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list_alt168;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                {
                    SubLObject datum = curr;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = key;
                            if (pcase_var.eql($NAME)) {
                                name = value;
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    category = value;
                                } else {
                                    if (pcase_var.eql($ENTRY_POINT)) {
                                        entry_point = value;
                                    } else {
                                        if (pcase_var.eql($DOC)) {
                                            docstring = value;
                                        } else {
                                            if (pcase_var.eql($QUALITY)) {
                                                quality = value;
                                            } else {
                                                if (pcase_var.eql($COST)) {
                                                    cost = value;
                                                } else {
                                                    if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                        expected_expansions = value;
                                                    } else {
                                                        if (pcase_var.eql($SUPPLANTS)) {
                                                            supplants = value;
                                                        } else {
                                                            Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
            {
                SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                rkf_uttrdr_register_parser(category, pmd);
            }
        }
        {
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list_alt169;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                {
                    SubLObject datum = curr;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = key;
                            if (pcase_var.eql($NAME)) {
                                name = value;
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    category = value;
                                } else {
                                    if (pcase_var.eql($ENTRY_POINT)) {
                                        entry_point = value;
                                    } else {
                                        if (pcase_var.eql($DOC)) {
                                            docstring = value;
                                        } else {
                                            if (pcase_var.eql($QUALITY)) {
                                                quality = value;
                                            } else {
                                                if (pcase_var.eql($COST)) {
                                                    cost = value;
                                                } else {
                                                    if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                        expected_expansions = value;
                                                    } else {
                                                        if (pcase_var.eql($SUPPLANTS)) {
                                                            supplants = value;
                                                        } else {
                                                            Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
            {
                SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                rkf_uttrdr_register_parser(category, pmd);
            }
        }
        {
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list_alt170;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                {
                    SubLObject datum = curr;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = key;
                            if (pcase_var.eql($NAME)) {
                                name = value;
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    category = value;
                                } else {
                                    if (pcase_var.eql($ENTRY_POINT)) {
                                        entry_point = value;
                                    } else {
                                        if (pcase_var.eql($DOC)) {
                                            docstring = value;
                                        } else {
                                            if (pcase_var.eql($QUALITY)) {
                                                quality = value;
                                            } else {
                                                if (pcase_var.eql($COST)) {
                                                    cost = value;
                                                } else {
                                                    if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                        expected_expansions = value;
                                                    } else {
                                                        if (pcase_var.eql($SUPPLANTS)) {
                                                            supplants = value;
                                                        } else {
                                                            Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
            {
                SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                rkf_uttrdr_register_parser(category, pmd);
            }
        }
        {
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list_alt171;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                {
                    SubLObject datum = curr;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = key;
                            if (pcase_var.eql($NAME)) {
                                name = value;
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    category = value;
                                } else {
                                    if (pcase_var.eql($ENTRY_POINT)) {
                                        entry_point = value;
                                    } else {
                                        if (pcase_var.eql($DOC)) {
                                            docstring = value;
                                        } else {
                                            if (pcase_var.eql($QUALITY)) {
                                                quality = value;
                                            } else {
                                                if (pcase_var.eql($COST)) {
                                                    cost = value;
                                                } else {
                                                    if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                        expected_expansions = value;
                                                    } else {
                                                        if (pcase_var.eql($SUPPLANTS)) {
                                                            supplants = value;
                                                        } else {
                                                            Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
            {
                SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                rkf_uttrdr_register_parser(category, pmd);
            }
        }
        {
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list_alt172;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                {
                    SubLObject datum = curr;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = key;
                            if (pcase_var.eql($NAME)) {
                                name = value;
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    category = value;
                                } else {
                                    if (pcase_var.eql($ENTRY_POINT)) {
                                        entry_point = value;
                                    } else {
                                        if (pcase_var.eql($DOC)) {
                                            docstring = value;
                                        } else {
                                            if (pcase_var.eql($QUALITY)) {
                                                quality = value;
                                            } else {
                                                if (pcase_var.eql($COST)) {
                                                    cost = value;
                                                } else {
                                                    if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                        expected_expansions = value;
                                                    } else {
                                                        if (pcase_var.eql($SUPPLANTS)) {
                                                            supplants = value;
                                                        } else {
                                                            Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
            {
                SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                rkf_uttrdr_register_parser(category, pmd);
            }
        }
        {
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list_alt173;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                {
                    SubLObject datum = curr;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = key;
                            if (pcase_var.eql($NAME)) {
                                name = value;
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    category = value;
                                } else {
                                    if (pcase_var.eql($ENTRY_POINT)) {
                                        entry_point = value;
                                    } else {
                                        if (pcase_var.eql($DOC)) {
                                            docstring = value;
                                        } else {
                                            if (pcase_var.eql($QUALITY)) {
                                                quality = value;
                                            } else {
                                                if (pcase_var.eql($COST)) {
                                                    cost = value;
                                                } else {
                                                    if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                        expected_expansions = value;
                                                    } else {
                                                        if (pcase_var.eql($SUPPLANTS)) {
                                                            supplants = value;
                                                        } else {
                                                            Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
            {
                SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                rkf_uttrdr_register_parser(category, pmd);
            }
        }
        {
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list_alt174;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                {
                    SubLObject datum = curr;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = key;
                            if (pcase_var.eql($NAME)) {
                                name = value;
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    category = value;
                                } else {
                                    if (pcase_var.eql($ENTRY_POINT)) {
                                        entry_point = value;
                                    } else {
                                        if (pcase_var.eql($DOC)) {
                                            docstring = value;
                                        } else {
                                            if (pcase_var.eql($QUALITY)) {
                                                quality = value;
                                            } else {
                                                if (pcase_var.eql($COST)) {
                                                    cost = value;
                                                } else {
                                                    if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                        expected_expansions = value;
                                                    } else {
                                                        if (pcase_var.eql($SUPPLANTS)) {
                                                            supplants = value;
                                                        } else {
                                                            Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
            {
                SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                rkf_uttrdr_register_parser(category, pmd);
            }
        }
        {
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list_alt175;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                {
                    SubLObject datum = curr;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = key;
                            if (pcase_var.eql($NAME)) {
                                name = value;
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    category = value;
                                } else {
                                    if (pcase_var.eql($ENTRY_POINT)) {
                                        entry_point = value;
                                    } else {
                                        if (pcase_var.eql($DOC)) {
                                            docstring = value;
                                        } else {
                                            if (pcase_var.eql($QUALITY)) {
                                                quality = value;
                                            } else {
                                                if (pcase_var.eql($COST)) {
                                                    cost = value;
                                                } else {
                                                    if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                        expected_expansions = value;
                                                    } else {
                                                        if (pcase_var.eql($SUPPLANTS)) {
                                                            supplants = value;
                                                        } else {
                                                            Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
            {
                SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                rkf_uttrdr_register_parser(category, pmd);
            }
        }
        register_cyc_api_function(PARSE_A_SENTENCE_COMPLETELY, $list_alt210, $str_alt211$This_function_returns_all_the_dec, $list_alt212, $list_alt213);
        register_cyc_api_function(PARSE_A_QUESTION_COMPLETELY, $list_alt210, $str_alt217$This_function_returns_all_the_que, $list_alt212, $list_alt213);
        return NIL;
    }

    public static SubLObject setup_rkf_text_processors_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_parse_result$.getGlobalValue(), symbol_function(PARSE_RESULT_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list15);
            def_csetf(PARSE_RESULT_ORIGINAL, _CSETF_PARSE_RESULT_ORIGINAL);
            def_csetf(PARSE_RESULT_CONSTITUENTS, _CSETF_PARSE_RESULT_CONSTITUENTS);
            def_csetf(PARSE_RESULT_ELIMINATED, _CSETF_PARSE_RESULT_ELIMINATED);
            def_csetf(PARSE_RESULT_PROBLEMS, _CSETF_PARSE_RESULT_PROBLEMS);
            def_csetf(PARSE_RESULT_SOLUTIONS, _CSETF_PARSE_RESULT_SOLUTIONS);
            identity(PARSE_RESULT);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_parse_result$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PARSE_RESULT_METHOD));
            declare_defglobal($rkf_terms_forager_lock$);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_parse_module_definition$.getGlobalValue(), symbol_function(PARSE_MODULE_DEFINITION_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list78);
            def_csetf(PMD_NAME, _CSETF_PMD_NAME);
            def_csetf(PMD_CATEGORY, _CSETF_PMD_CATEGORY);
            def_csetf(PMD_QUALITY, _CSETF_PMD_QUALITY);
            def_csetf(PMD_ENTRY_POINT, _CSETF_PMD_ENTRY_POINT);
            def_csetf(PMD_COST, _CSETF_PMD_COST);
            def_csetf(PMD_EXPECTED_EXPANSIONS, _CSETF_PMD_EXPECTED_EXPANSIONS);
            def_csetf(PMD_SUPPLANTS, _CSETF_PMD_SUPPLANTS);
            identity(PARSE_MODULE_DEFINITION);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_parse_module_definition$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PARSE_MODULE_DEFINITION_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), $dtp_parse_module_group$.getGlobalValue(), symbol_function(PARSE_MODULE_GROUP_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list115);
            def_csetf(PMG_CATEGORY, _CSETF_PMG_CATEGORY);
            def_csetf(PMG_TOOLS, _CSETF_PMG_TOOLS);
            identity(PARSE_MODULE_GROUP);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_parse_module_group$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PARSE_MODULE_GROUP_METHOD));
            declare_defglobal($rkf_uttrdr_known_parsers$);
            register_html_state_variable($rkf_uttrdr_psp_return_mode$);
            rkf_uttrdr_deregister_all_parsers();
            SubLObject name = NIL;
            SubLObject category = NIL;
            SubLObject entry_point = NIL;
            SubLObject docstring = NIL;
            SubLObject cost = NIL;
            SubLObject quality = NIL;
            SubLObject expected_expansions = NIL;
            SubLObject supplants = NIL;
            SubLObject cdolist_list_var = $list162;
            SubLObject curr = NIL;
            curr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = curr;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list161);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list161);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = key;
                    if (pcase_var.eql($NAME)) {
                        name = value;
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            category = value;
                        } else
                            if (pcase_var.eql($ENTRY_POINT)) {
                                entry_point = value;
                            } else
                                if (pcase_var.eql($DOC)) {
                                    docstring = value;
                                } else
                                    if (pcase_var.eql($QUALITY)) {
                                        quality = value;
                                    } else
                                        if (pcase_var.eql($COST)) {
                                            cost = value;
                                        } else
                                            if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                expected_expansions = value;
                                            } else
                                                if (pcase_var.eql($SUPPLANTS)) {
                                                    supplants = value;
                                                } else {
                                                    Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                                }







                } else {
                    cdestructuring_bind_error(datum, $list161);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            } 
            SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
            rkf_uttrdr_register_parser(category, pmd);
            name = NIL;
            category = NIL;
            entry_point = NIL;
            docstring = NIL;
            cost = NIL;
            quality = NIL;
            expected_expansions = NIL;
            supplants = NIL;
            cdolist_list_var = $list163;
            curr = NIL;
            curr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = curr;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list161);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list161);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = key;
                    if (pcase_var.eql($NAME)) {
                        name = value;
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            category = value;
                        } else
                            if (pcase_var.eql($ENTRY_POINT)) {
                                entry_point = value;
                            } else
                                if (pcase_var.eql($DOC)) {
                                    docstring = value;
                                } else
                                    if (pcase_var.eql($QUALITY)) {
                                        quality = value;
                                    } else
                                        if (pcase_var.eql($COST)) {
                                            cost = value;
                                        } else
                                            if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                expected_expansions = value;
                                            } else
                                                if (pcase_var.eql($SUPPLANTS)) {
                                                    supplants = value;
                                                } else {
                                                    Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                                }







                } else {
                    cdestructuring_bind_error(datum, $list161);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            } 
            pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
            rkf_uttrdr_register_parser(category, pmd);
            name = NIL;
            category = NIL;
            entry_point = NIL;
            docstring = NIL;
            cost = NIL;
            quality = NIL;
            expected_expansions = NIL;
            supplants = NIL;
            cdolist_list_var = $list164;
            curr = NIL;
            curr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = curr;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list161);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list161);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = key;
                    if (pcase_var.eql($NAME)) {
                        name = value;
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            category = value;
                        } else
                            if (pcase_var.eql($ENTRY_POINT)) {
                                entry_point = value;
                            } else
                                if (pcase_var.eql($DOC)) {
                                    docstring = value;
                                } else
                                    if (pcase_var.eql($QUALITY)) {
                                        quality = value;
                                    } else
                                        if (pcase_var.eql($COST)) {
                                            cost = value;
                                        } else
                                            if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                expected_expansions = value;
                                            } else
                                                if (pcase_var.eql($SUPPLANTS)) {
                                                    supplants = value;
                                                } else {
                                                    Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                                }







                } else {
                    cdestructuring_bind_error(datum, $list161);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            } 
            pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
            rkf_uttrdr_register_parser(category, pmd);
            name = NIL;
            category = NIL;
            entry_point = NIL;
            docstring = NIL;
            cost = NIL;
            quality = NIL;
            expected_expansions = NIL;
            supplants = NIL;
            cdolist_list_var = $list165;
            curr = NIL;
            curr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = curr;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list161);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list161);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = key;
                    if (pcase_var.eql($NAME)) {
                        name = value;
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            category = value;
                        } else
                            if (pcase_var.eql($ENTRY_POINT)) {
                                entry_point = value;
                            } else
                                if (pcase_var.eql($DOC)) {
                                    docstring = value;
                                } else
                                    if (pcase_var.eql($QUALITY)) {
                                        quality = value;
                                    } else
                                        if (pcase_var.eql($COST)) {
                                            cost = value;
                                        } else
                                            if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                expected_expansions = value;
                                            } else
                                                if (pcase_var.eql($SUPPLANTS)) {
                                                    supplants = value;
                                                } else {
                                                    Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                                }







                } else {
                    cdestructuring_bind_error(datum, $list161);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            } 
            pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
            rkf_uttrdr_register_parser(category, pmd);
            name = NIL;
            category = NIL;
            entry_point = NIL;
            docstring = NIL;
            cost = NIL;
            quality = NIL;
            expected_expansions = NIL;
            supplants = NIL;
            cdolist_list_var = $list166;
            curr = NIL;
            curr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = curr;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list161);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list161);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = key;
                    if (pcase_var.eql($NAME)) {
                        name = value;
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            category = value;
                        } else
                            if (pcase_var.eql($ENTRY_POINT)) {
                                entry_point = value;
                            } else
                                if (pcase_var.eql($DOC)) {
                                    docstring = value;
                                } else
                                    if (pcase_var.eql($QUALITY)) {
                                        quality = value;
                                    } else
                                        if (pcase_var.eql($COST)) {
                                            cost = value;
                                        } else
                                            if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                expected_expansions = value;
                                            } else
                                                if (pcase_var.eql($SUPPLANTS)) {
                                                    supplants = value;
                                                } else {
                                                    Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                                }







                } else {
                    cdestructuring_bind_error(datum, $list161);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            } 
            pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
            rkf_uttrdr_register_parser(category, pmd);
            name = NIL;
            category = NIL;
            entry_point = NIL;
            docstring = NIL;
            cost = NIL;
            quality = NIL;
            expected_expansions = NIL;
            supplants = NIL;
            cdolist_list_var = $list167;
            curr = NIL;
            curr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = curr;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list161);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list161);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = key;
                    if (pcase_var.eql($NAME)) {
                        name = value;
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            category = value;
                        } else
                            if (pcase_var.eql($ENTRY_POINT)) {
                                entry_point = value;
                            } else
                                if (pcase_var.eql($DOC)) {
                                    docstring = value;
                                } else
                                    if (pcase_var.eql($QUALITY)) {
                                        quality = value;
                                    } else
                                        if (pcase_var.eql($COST)) {
                                            cost = value;
                                        } else
                                            if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                expected_expansions = value;
                                            } else
                                                if (pcase_var.eql($SUPPLANTS)) {
                                                    supplants = value;
                                                } else {
                                                    Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                                }







                } else {
                    cdestructuring_bind_error(datum, $list161);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            } 
            pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
            rkf_uttrdr_register_parser(category, pmd);
            name = NIL;
            category = NIL;
            entry_point = NIL;
            docstring = NIL;
            cost = NIL;
            quality = NIL;
            expected_expansions = NIL;
            supplants = NIL;
            cdolist_list_var = $list168;
            curr = NIL;
            curr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = curr;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list161);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list161);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = key;
                    if (pcase_var.eql($NAME)) {
                        name = value;
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            category = value;
                        } else
                            if (pcase_var.eql($ENTRY_POINT)) {
                                entry_point = value;
                            } else
                                if (pcase_var.eql($DOC)) {
                                    docstring = value;
                                } else
                                    if (pcase_var.eql($QUALITY)) {
                                        quality = value;
                                    } else
                                        if (pcase_var.eql($COST)) {
                                            cost = value;
                                        } else
                                            if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                expected_expansions = value;
                                            } else
                                                if (pcase_var.eql($SUPPLANTS)) {
                                                    supplants = value;
                                                } else {
                                                    Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                                }







                } else {
                    cdestructuring_bind_error(datum, $list161);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            } 
            pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
            rkf_uttrdr_register_parser(category, pmd);
            name = NIL;
            category = NIL;
            entry_point = NIL;
            docstring = NIL;
            cost = NIL;
            quality = NIL;
            expected_expansions = NIL;
            supplants = NIL;
            cdolist_list_var = $list169;
            curr = NIL;
            curr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = curr;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list161);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list161);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = key;
                    if (pcase_var.eql($NAME)) {
                        name = value;
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            category = value;
                        } else
                            if (pcase_var.eql($ENTRY_POINT)) {
                                entry_point = value;
                            } else
                                if (pcase_var.eql($DOC)) {
                                    docstring = value;
                                } else
                                    if (pcase_var.eql($QUALITY)) {
                                        quality = value;
                                    } else
                                        if (pcase_var.eql($COST)) {
                                            cost = value;
                                        } else
                                            if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                expected_expansions = value;
                                            } else
                                                if (pcase_var.eql($SUPPLANTS)) {
                                                    supplants = value;
                                                } else {
                                                    Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                                }







                } else {
                    cdestructuring_bind_error(datum, $list161);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            } 
            pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
            rkf_uttrdr_register_parser(category, pmd);
            name = NIL;
            category = NIL;
            entry_point = NIL;
            docstring = NIL;
            cost = NIL;
            quality = NIL;
            expected_expansions = NIL;
            supplants = NIL;
            cdolist_list_var = $list170;
            curr = NIL;
            curr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = curr;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list161);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list161);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = key;
                    if (pcase_var.eql($NAME)) {
                        name = value;
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            category = value;
                        } else
                            if (pcase_var.eql($ENTRY_POINT)) {
                                entry_point = value;
                            } else
                                if (pcase_var.eql($DOC)) {
                                    docstring = value;
                                } else
                                    if (pcase_var.eql($QUALITY)) {
                                        quality = value;
                                    } else
                                        if (pcase_var.eql($COST)) {
                                            cost = value;
                                        } else
                                            if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                expected_expansions = value;
                                            } else
                                                if (pcase_var.eql($SUPPLANTS)) {
                                                    supplants = value;
                                                } else {
                                                    Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                                }







                } else {
                    cdestructuring_bind_error(datum, $list161);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            } 
            pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
            rkf_uttrdr_register_parser(category, pmd);
            name = NIL;
            category = NIL;
            entry_point = NIL;
            docstring = NIL;
            cost = NIL;
            quality = NIL;
            expected_expansions = NIL;
            supplants = NIL;
            cdolist_list_var = $list171;
            curr = NIL;
            curr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = curr;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list161);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list161);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = key;
                    if (pcase_var.eql($NAME)) {
                        name = value;
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            category = value;
                        } else
                            if (pcase_var.eql($ENTRY_POINT)) {
                                entry_point = value;
                            } else
                                if (pcase_var.eql($DOC)) {
                                    docstring = value;
                                } else
                                    if (pcase_var.eql($QUALITY)) {
                                        quality = value;
                                    } else
                                        if (pcase_var.eql($COST)) {
                                            cost = value;
                                        } else
                                            if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                expected_expansions = value;
                                            } else
                                                if (pcase_var.eql($SUPPLANTS)) {
                                                    supplants = value;
                                                } else {
                                                    Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                                }







                } else {
                    cdestructuring_bind_error(datum, $list161);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            } 
            pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
            rkf_uttrdr_register_parser(category, pmd);
            name = NIL;
            category = NIL;
            entry_point = NIL;
            docstring = NIL;
            cost = NIL;
            quality = NIL;
            expected_expansions = NIL;
            supplants = NIL;
            cdolist_list_var = $list172;
            curr = NIL;
            curr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = curr;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list161);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list161);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = key;
                    if (pcase_var.eql($NAME)) {
                        name = value;
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            category = value;
                        } else
                            if (pcase_var.eql($ENTRY_POINT)) {
                                entry_point = value;
                            } else
                                if (pcase_var.eql($DOC)) {
                                    docstring = value;
                                } else
                                    if (pcase_var.eql($QUALITY)) {
                                        quality = value;
                                    } else
                                        if (pcase_var.eql($COST)) {
                                            cost = value;
                                        } else
                                            if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                expected_expansions = value;
                                            } else
                                                if (pcase_var.eql($SUPPLANTS)) {
                                                    supplants = value;
                                                } else {
                                                    Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                                }







                } else {
                    cdestructuring_bind_error(datum, $list161);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            } 
            pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
            rkf_uttrdr_register_parser(category, pmd);
            name = NIL;
            category = NIL;
            entry_point = NIL;
            docstring = NIL;
            cost = NIL;
            quality = NIL;
            expected_expansions = NIL;
            supplants = NIL;
            cdolist_list_var = $list173;
            curr = NIL;
            curr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = curr;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list161);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list161);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = key;
                    if (pcase_var.eql($NAME)) {
                        name = value;
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            category = value;
                        } else
                            if (pcase_var.eql($ENTRY_POINT)) {
                                entry_point = value;
                            } else
                                if (pcase_var.eql($DOC)) {
                                    docstring = value;
                                } else
                                    if (pcase_var.eql($QUALITY)) {
                                        quality = value;
                                    } else
                                        if (pcase_var.eql($COST)) {
                                            cost = value;
                                        } else
                                            if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                expected_expansions = value;
                                            } else
                                                if (pcase_var.eql($SUPPLANTS)) {
                                                    supplants = value;
                                                } else {
                                                    Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                                }







                } else {
                    cdestructuring_bind_error(datum, $list161);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            } 
            pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
            rkf_uttrdr_register_parser(category, pmd);
            name = NIL;
            category = NIL;
            entry_point = NIL;
            docstring = NIL;
            cost = NIL;
            quality = NIL;
            expected_expansions = NIL;
            supplants = NIL;
            cdolist_list_var = $list174;
            curr = NIL;
            curr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = curr;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list161);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list161);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = key;
                    if (pcase_var.eql($NAME)) {
                        name = value;
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            category = value;
                        } else
                            if (pcase_var.eql($ENTRY_POINT)) {
                                entry_point = value;
                            } else
                                if (pcase_var.eql($DOC)) {
                                    docstring = value;
                                } else
                                    if (pcase_var.eql($QUALITY)) {
                                        quality = value;
                                    } else
                                        if (pcase_var.eql($COST)) {
                                            cost = value;
                                        } else
                                            if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                expected_expansions = value;
                                            } else
                                                if (pcase_var.eql($SUPPLANTS)) {
                                                    supplants = value;
                                                } else {
                                                    Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                                }







                } else {
                    cdestructuring_bind_error(datum, $list161);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            } 
            pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
            rkf_uttrdr_register_parser(category, pmd);
            name = NIL;
            category = NIL;
            entry_point = NIL;
            docstring = NIL;
            cost = NIL;
            quality = NIL;
            expected_expansions = NIL;
            supplants = NIL;
            cdolist_list_var = $list175;
            curr = NIL;
            curr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = curr;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list161);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list161);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = key;
                    if (pcase_var.eql($NAME)) {
                        name = value;
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            category = value;
                        } else
                            if (pcase_var.eql($ENTRY_POINT)) {
                                entry_point = value;
                            } else
                                if (pcase_var.eql($DOC)) {
                                    docstring = value;
                                } else
                                    if (pcase_var.eql($QUALITY)) {
                                        quality = value;
                                    } else
                                        if (pcase_var.eql($COST)) {
                                            cost = value;
                                        } else
                                            if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                expected_expansions = value;
                                            } else
                                                if (pcase_var.eql($SUPPLANTS)) {
                                                    supplants = value;
                                                } else {
                                                    Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                                }







                } else {
                    cdestructuring_bind_error(datum, $list161);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            } 
            pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
            rkf_uttrdr_register_parser(category, pmd);
            name = NIL;
            category = NIL;
            entry_point = NIL;
            docstring = NIL;
            cost = NIL;
            quality = NIL;
            expected_expansions = NIL;
            supplants = NIL;
            cdolist_list_var = $list176;
            curr = NIL;
            curr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = curr;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list161);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list161);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = key;
                    if (pcase_var.eql($NAME)) {
                        name = value;
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            category = value;
                        } else
                            if (pcase_var.eql($ENTRY_POINT)) {
                                entry_point = value;
                            } else
                                if (pcase_var.eql($DOC)) {
                                    docstring = value;
                                } else
                                    if (pcase_var.eql($QUALITY)) {
                                        quality = value;
                                    } else
                                        if (pcase_var.eql($COST)) {
                                            cost = value;
                                        } else
                                            if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                expected_expansions = value;
                                            } else
                                                if (pcase_var.eql($SUPPLANTS)) {
                                                    supplants = value;
                                                } else {
                                                    Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                                }







                } else {
                    cdestructuring_bind_error(datum, $list161);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            } 
            pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
            rkf_uttrdr_register_parser(category, pmd);
            name = NIL;
            category = NIL;
            entry_point = NIL;
            docstring = NIL;
            cost = NIL;
            quality = NIL;
            expected_expansions = NIL;
            supplants = NIL;
            cdolist_list_var = $list177;
            curr = NIL;
            curr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = curr;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list161);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list161);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = key;
                    if (pcase_var.eql($NAME)) {
                        name = value;
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            category = value;
                        } else
                            if (pcase_var.eql($ENTRY_POINT)) {
                                entry_point = value;
                            } else
                                if (pcase_var.eql($DOC)) {
                                    docstring = value;
                                } else
                                    if (pcase_var.eql($QUALITY)) {
                                        quality = value;
                                    } else
                                        if (pcase_var.eql($COST)) {
                                            cost = value;
                                        } else
                                            if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                expected_expansions = value;
                                            } else
                                                if (pcase_var.eql($SUPPLANTS)) {
                                                    supplants = value;
                                                } else {
                                                    Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                                }







                } else {
                    cdestructuring_bind_error(datum, $list161);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            } 
            pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
            rkf_uttrdr_register_parser(category, pmd);
            name = NIL;
            category = NIL;
            entry_point = NIL;
            docstring = NIL;
            cost = NIL;
            quality = NIL;
            expected_expansions = NIL;
            supplants = NIL;
            cdolist_list_var = $list178;
            curr = NIL;
            curr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = curr;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list161);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list161);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = key;
                    if (pcase_var.eql($NAME)) {
                        name = value;
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            category = value;
                        } else
                            if (pcase_var.eql($ENTRY_POINT)) {
                                entry_point = value;
                            } else
                                if (pcase_var.eql($DOC)) {
                                    docstring = value;
                                } else
                                    if (pcase_var.eql($QUALITY)) {
                                        quality = value;
                                    } else
                                        if (pcase_var.eql($COST)) {
                                            cost = value;
                                        } else
                                            if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                expected_expansions = value;
                                            } else
                                                if (pcase_var.eql($SUPPLANTS)) {
                                                    supplants = value;
                                                } else {
                                                    Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                                }







                } else {
                    cdestructuring_bind_error(datum, $list161);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            } 
            pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
            rkf_uttrdr_register_parser(category, pmd);
            name = NIL;
            category = NIL;
            entry_point = NIL;
            docstring = NIL;
            cost = NIL;
            quality = NIL;
            expected_expansions = NIL;
            supplants = NIL;
            cdolist_list_var = $list179;
            curr = NIL;
            curr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = curr;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list161);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list161);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = key;
                    if (pcase_var.eql($NAME)) {
                        name = value;
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            category = value;
                        } else
                            if (pcase_var.eql($ENTRY_POINT)) {
                                entry_point = value;
                            } else
                                if (pcase_var.eql($DOC)) {
                                    docstring = value;
                                } else
                                    if (pcase_var.eql($QUALITY)) {
                                        quality = value;
                                    } else
                                        if (pcase_var.eql($COST)) {
                                            cost = value;
                                        } else
                                            if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                expected_expansions = value;
                                            } else
                                                if (pcase_var.eql($SUPPLANTS)) {
                                                    supplants = value;
                                                } else {
                                                    Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                                }







                } else {
                    cdestructuring_bind_error(datum, $list161);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            } 
            pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
            rkf_uttrdr_register_parser(category, pmd);
            name = NIL;
            category = NIL;
            entry_point = NIL;
            docstring = NIL;
            cost = NIL;
            quality = NIL;
            expected_expansions = NIL;
            supplants = NIL;
            cdolist_list_var = $list180;
            curr = NIL;
            curr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = curr;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list161);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list161);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = key;
                    if (pcase_var.eql($NAME)) {
                        name = value;
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            category = value;
                        } else
                            if (pcase_var.eql($ENTRY_POINT)) {
                                entry_point = value;
                            } else
                                if (pcase_var.eql($DOC)) {
                                    docstring = value;
                                } else
                                    if (pcase_var.eql($QUALITY)) {
                                        quality = value;
                                    } else
                                        if (pcase_var.eql($COST)) {
                                            cost = value;
                                        } else
                                            if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                expected_expansions = value;
                                            } else
                                                if (pcase_var.eql($SUPPLANTS)) {
                                                    supplants = value;
                                                } else {
                                                    Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                                }







                } else {
                    cdestructuring_bind_error(datum, $list161);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            } 
            pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
            rkf_uttrdr_register_parser(category, pmd);
            name = NIL;
            category = NIL;
            entry_point = NIL;
            docstring = NIL;
            cost = NIL;
            quality = NIL;
            expected_expansions = NIL;
            supplants = NIL;
            cdolist_list_var = $list181;
            curr = NIL;
            curr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = curr;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list161);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list161);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = key;
                    if (pcase_var.eql($NAME)) {
                        name = value;
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            category = value;
                        } else
                            if (pcase_var.eql($ENTRY_POINT)) {
                                entry_point = value;
                            } else
                                if (pcase_var.eql($DOC)) {
                                    docstring = value;
                                } else
                                    if (pcase_var.eql($QUALITY)) {
                                        quality = value;
                                    } else
                                        if (pcase_var.eql($COST)) {
                                            cost = value;
                                        } else
                                            if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                expected_expansions = value;
                                            } else
                                                if (pcase_var.eql($SUPPLANTS)) {
                                                    supplants = value;
                                                } else {
                                                    Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                                }







                } else {
                    cdestructuring_bind_error(datum, $list161);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            } 
            pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
            rkf_uttrdr_register_parser(category, pmd);
            name = NIL;
            category = NIL;
            entry_point = NIL;
            docstring = NIL;
            cost = NIL;
            quality = NIL;
            expected_expansions = NIL;
            supplants = NIL;
            cdolist_list_var = $list182;
            curr = NIL;
            curr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = curr;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list161);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list161);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = key;
                    if (pcase_var.eql($NAME)) {
                        name = value;
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            category = value;
                        } else
                            if (pcase_var.eql($ENTRY_POINT)) {
                                entry_point = value;
                            } else
                                if (pcase_var.eql($DOC)) {
                                    docstring = value;
                                } else
                                    if (pcase_var.eql($QUALITY)) {
                                        quality = value;
                                    } else
                                        if (pcase_var.eql($COST)) {
                                            cost = value;
                                        } else
                                            if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                expected_expansions = value;
                                            } else
                                                if (pcase_var.eql($SUPPLANTS)) {
                                                    supplants = value;
                                                } else {
                                                    Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                                }







                } else {
                    cdestructuring_bind_error(datum, $list161);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            } 
            pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
            rkf_uttrdr_register_parser(category, pmd);
            name = NIL;
            category = NIL;
            entry_point = NIL;
            docstring = NIL;
            cost = NIL;
            quality = NIL;
            expected_expansions = NIL;
            supplants = NIL;
            cdolist_list_var = $list183;
            curr = NIL;
            curr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = curr;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list161);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list161);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = key;
                    if (pcase_var.eql($NAME)) {
                        name = value;
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            category = value;
                        } else
                            if (pcase_var.eql($ENTRY_POINT)) {
                                entry_point = value;
                            } else
                                if (pcase_var.eql($DOC)) {
                                    docstring = value;
                                } else
                                    if (pcase_var.eql($QUALITY)) {
                                        quality = value;
                                    } else
                                        if (pcase_var.eql($COST)) {
                                            cost = value;
                                        } else
                                            if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                expected_expansions = value;
                                            } else
                                                if (pcase_var.eql($SUPPLANTS)) {
                                                    supplants = value;
                                                } else {
                                                    Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                                }







                } else {
                    cdestructuring_bind_error(datum, $list161);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            } 
            pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
            rkf_uttrdr_register_parser(category, pmd);
            name = NIL;
            category = NIL;
            entry_point = NIL;
            docstring = NIL;
            cost = NIL;
            quality = NIL;
            expected_expansions = NIL;
            supplants = NIL;
            cdolist_list_var = $list184;
            curr = NIL;
            curr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = curr;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list161);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list161);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = key;
                    if (pcase_var.eql($NAME)) {
                        name = value;
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            category = value;
                        } else
                            if (pcase_var.eql($ENTRY_POINT)) {
                                entry_point = value;
                            } else
                                if (pcase_var.eql($DOC)) {
                                    docstring = value;
                                } else
                                    if (pcase_var.eql($QUALITY)) {
                                        quality = value;
                                    } else
                                        if (pcase_var.eql($COST)) {
                                            cost = value;
                                        } else
                                            if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                expected_expansions = value;
                                            } else
                                                if (pcase_var.eql($SUPPLANTS)) {
                                                    supplants = value;
                                                } else {
                                                    Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                                }







                } else {
                    cdestructuring_bind_error(datum, $list161);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr = cdolist_list_var.first();
            } 
            pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
            rkf_uttrdr_register_parser(category, pmd);
            register_cyc_api_function(PARSE_A_SENTENCE_COMPLETELY, $list218, $str219$This_function_returns_all_the_dec, $list220, $list221);
            register_cyc_api_function(PARSE_A_QUESTION_COMPLETELY, $list218, $str225$This_function_returns_all_the_que, $list220, $list221);
        }
        if (SubLFiles.USE_V2) {
            {
                SubLObject name = NIL;
                SubLObject category = NIL;
                SubLObject entry_point = NIL;
                SubLObject docstring = NIL;
                SubLObject cost = NIL;
                SubLObject quality = NIL;
                SubLObject expected_expansions = NIL;
                SubLObject supplants = NIL;
                SubLObject cdolist_list_var = $list_alt153;
                SubLObject curr = NIL;
                for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                    {
                        SubLObject datum = curr;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NAME)) {
                                    name = value;
                                } else {
                                    if (pcase_var.eql($CATEGORY)) {
                                        category = value;
                                    } else {
                                        if (pcase_var.eql($ENTRY_POINT)) {
                                            entry_point = value;
                                        } else {
                                            if (pcase_var.eql($DOC)) {
                                                docstring = value;
                                            } else {
                                                if (pcase_var.eql($QUALITY)) {
                                                    quality = value;
                                                } else {
                                                    if (pcase_var.eql($COST)) {
                                                        cost = value;
                                                    } else {
                                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                            expected_expansions = value;
                                                        } else {
                                                            if (pcase_var.eql($SUPPLANTS)) {
                                                                supplants = value;
                                                            } else {
                                                                Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt152);
                        }
                    }
                }
                {
                    SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                    rkf_uttrdr_register_parser(category, pmd);
                }
            }
            {
                SubLObject name = NIL;
                SubLObject category = NIL;
                SubLObject entry_point = NIL;
                SubLObject docstring = NIL;
                SubLObject cost = NIL;
                SubLObject quality = NIL;
                SubLObject expected_expansions = NIL;
                SubLObject supplants = NIL;
                SubLObject cdolist_list_var = $list_alt154;
                SubLObject curr = NIL;
                for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                    {
                        SubLObject datum = curr;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NAME)) {
                                    name = value;
                                } else {
                                    if (pcase_var.eql($CATEGORY)) {
                                        category = value;
                                    } else {
                                        if (pcase_var.eql($ENTRY_POINT)) {
                                            entry_point = value;
                                        } else {
                                            if (pcase_var.eql($DOC)) {
                                                docstring = value;
                                            } else {
                                                if (pcase_var.eql($QUALITY)) {
                                                    quality = value;
                                                } else {
                                                    if (pcase_var.eql($COST)) {
                                                        cost = value;
                                                    } else {
                                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                            expected_expansions = value;
                                                        } else {
                                                            if (pcase_var.eql($SUPPLANTS)) {
                                                                supplants = value;
                                                            } else {
                                                                Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt152);
                        }
                    }
                }
                {
                    SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                    rkf_uttrdr_register_parser(category, pmd);
                }
            }
            {
                SubLObject name = NIL;
                SubLObject category = NIL;
                SubLObject entry_point = NIL;
                SubLObject docstring = NIL;
                SubLObject cost = NIL;
                SubLObject quality = NIL;
                SubLObject expected_expansions = NIL;
                SubLObject supplants = NIL;
                SubLObject cdolist_list_var = $list_alt155;
                SubLObject curr = NIL;
                for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                    {
                        SubLObject datum = curr;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NAME)) {
                                    name = value;
                                } else {
                                    if (pcase_var.eql($CATEGORY)) {
                                        category = value;
                                    } else {
                                        if (pcase_var.eql($ENTRY_POINT)) {
                                            entry_point = value;
                                        } else {
                                            if (pcase_var.eql($DOC)) {
                                                docstring = value;
                                            } else {
                                                if (pcase_var.eql($QUALITY)) {
                                                    quality = value;
                                                } else {
                                                    if (pcase_var.eql($COST)) {
                                                        cost = value;
                                                    } else {
                                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                            expected_expansions = value;
                                                        } else {
                                                            if (pcase_var.eql($SUPPLANTS)) {
                                                                supplants = value;
                                                            } else {
                                                                Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt152);
                        }
                    }
                }
                {
                    SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                    rkf_uttrdr_register_parser(category, pmd);
                }
            }
            {
                SubLObject name = NIL;
                SubLObject category = NIL;
                SubLObject entry_point = NIL;
                SubLObject docstring = NIL;
                SubLObject cost = NIL;
                SubLObject quality = NIL;
                SubLObject expected_expansions = NIL;
                SubLObject supplants = NIL;
                SubLObject cdolist_list_var = $list_alt156;
                SubLObject curr = NIL;
                for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                    {
                        SubLObject datum = curr;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NAME)) {
                                    name = value;
                                } else {
                                    if (pcase_var.eql($CATEGORY)) {
                                        category = value;
                                    } else {
                                        if (pcase_var.eql($ENTRY_POINT)) {
                                            entry_point = value;
                                        } else {
                                            if (pcase_var.eql($DOC)) {
                                                docstring = value;
                                            } else {
                                                if (pcase_var.eql($QUALITY)) {
                                                    quality = value;
                                                } else {
                                                    if (pcase_var.eql($COST)) {
                                                        cost = value;
                                                    } else {
                                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                            expected_expansions = value;
                                                        } else {
                                                            if (pcase_var.eql($SUPPLANTS)) {
                                                                supplants = value;
                                                            } else {
                                                                Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt152);
                        }
                    }
                }
                {
                    SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                    rkf_uttrdr_register_parser(category, pmd);
                }
            }
            {
                SubLObject name = NIL;
                SubLObject category = NIL;
                SubLObject entry_point = NIL;
                SubLObject docstring = NIL;
                SubLObject cost = NIL;
                SubLObject quality = NIL;
                SubLObject expected_expansions = NIL;
                SubLObject supplants = NIL;
                SubLObject cdolist_list_var = $list_alt157;
                SubLObject curr = NIL;
                for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                    {
                        SubLObject datum = curr;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NAME)) {
                                    name = value;
                                } else {
                                    if (pcase_var.eql($CATEGORY)) {
                                        category = value;
                                    } else {
                                        if (pcase_var.eql($ENTRY_POINT)) {
                                            entry_point = value;
                                        } else {
                                            if (pcase_var.eql($DOC)) {
                                                docstring = value;
                                            } else {
                                                if (pcase_var.eql($QUALITY)) {
                                                    quality = value;
                                                } else {
                                                    if (pcase_var.eql($COST)) {
                                                        cost = value;
                                                    } else {
                                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                            expected_expansions = value;
                                                        } else {
                                                            if (pcase_var.eql($SUPPLANTS)) {
                                                                supplants = value;
                                                            } else {
                                                                Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt152);
                        }
                    }
                }
                {
                    SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                    rkf_uttrdr_register_parser(category, pmd);
                }
            }
            {
                SubLObject name = NIL;
                SubLObject category = NIL;
                SubLObject entry_point = NIL;
                SubLObject docstring = NIL;
                SubLObject cost = NIL;
                SubLObject quality = NIL;
                SubLObject expected_expansions = NIL;
                SubLObject supplants = NIL;
                SubLObject cdolist_list_var = $list_alt158;
                SubLObject curr = NIL;
                for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                    {
                        SubLObject datum = curr;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NAME)) {
                                    name = value;
                                } else {
                                    if (pcase_var.eql($CATEGORY)) {
                                        category = value;
                                    } else {
                                        if (pcase_var.eql($ENTRY_POINT)) {
                                            entry_point = value;
                                        } else {
                                            if (pcase_var.eql($DOC)) {
                                                docstring = value;
                                            } else {
                                                if (pcase_var.eql($QUALITY)) {
                                                    quality = value;
                                                } else {
                                                    if (pcase_var.eql($COST)) {
                                                        cost = value;
                                                    } else {
                                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                            expected_expansions = value;
                                                        } else {
                                                            if (pcase_var.eql($SUPPLANTS)) {
                                                                supplants = value;
                                                            } else {
                                                                Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt152);
                        }
                    }
                }
                {
                    SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                    rkf_uttrdr_register_parser(category, pmd);
                }
            }
            {
                SubLObject name = NIL;
                SubLObject category = NIL;
                SubLObject entry_point = NIL;
                SubLObject docstring = NIL;
                SubLObject cost = NIL;
                SubLObject quality = NIL;
                SubLObject expected_expansions = NIL;
                SubLObject supplants = NIL;
                SubLObject cdolist_list_var = $list_alt159;
                SubLObject curr = NIL;
                for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                    {
                        SubLObject datum = curr;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NAME)) {
                                    name = value;
                                } else {
                                    if (pcase_var.eql($CATEGORY)) {
                                        category = value;
                                    } else {
                                        if (pcase_var.eql($ENTRY_POINT)) {
                                            entry_point = value;
                                        } else {
                                            if (pcase_var.eql($DOC)) {
                                                docstring = value;
                                            } else {
                                                if (pcase_var.eql($QUALITY)) {
                                                    quality = value;
                                                } else {
                                                    if (pcase_var.eql($COST)) {
                                                        cost = value;
                                                    } else {
                                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                            expected_expansions = value;
                                                        } else {
                                                            if (pcase_var.eql($SUPPLANTS)) {
                                                                supplants = value;
                                                            } else {
                                                                Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt152);
                        }
                    }
                }
                {
                    SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                    rkf_uttrdr_register_parser(category, pmd);
                }
            }
            {
                SubLObject name = NIL;
                SubLObject category = NIL;
                SubLObject entry_point = NIL;
                SubLObject docstring = NIL;
                SubLObject cost = NIL;
                SubLObject quality = NIL;
                SubLObject expected_expansions = NIL;
                SubLObject supplants = NIL;
                SubLObject cdolist_list_var = $list_alt160;
                SubLObject curr = NIL;
                for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                    {
                        SubLObject datum = curr;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NAME)) {
                                    name = value;
                                } else {
                                    if (pcase_var.eql($CATEGORY)) {
                                        category = value;
                                    } else {
                                        if (pcase_var.eql($ENTRY_POINT)) {
                                            entry_point = value;
                                        } else {
                                            if (pcase_var.eql($DOC)) {
                                                docstring = value;
                                            } else {
                                                if (pcase_var.eql($QUALITY)) {
                                                    quality = value;
                                                } else {
                                                    if (pcase_var.eql($COST)) {
                                                        cost = value;
                                                    } else {
                                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                            expected_expansions = value;
                                                        } else {
                                                            if (pcase_var.eql($SUPPLANTS)) {
                                                                supplants = value;
                                                            } else {
                                                                Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt152);
                        }
                    }
                }
                {
                    SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                    rkf_uttrdr_register_parser(category, pmd);
                }
            }
            {
                SubLObject name = NIL;
                SubLObject category = NIL;
                SubLObject entry_point = NIL;
                SubLObject docstring = NIL;
                SubLObject cost = NIL;
                SubLObject quality = NIL;
                SubLObject expected_expansions = NIL;
                SubLObject supplants = NIL;
                SubLObject cdolist_list_var = $list_alt161;
                SubLObject curr = NIL;
                for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                    {
                        SubLObject datum = curr;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NAME)) {
                                    name = value;
                                } else {
                                    if (pcase_var.eql($CATEGORY)) {
                                        category = value;
                                    } else {
                                        if (pcase_var.eql($ENTRY_POINT)) {
                                            entry_point = value;
                                        } else {
                                            if (pcase_var.eql($DOC)) {
                                                docstring = value;
                                            } else {
                                                if (pcase_var.eql($QUALITY)) {
                                                    quality = value;
                                                } else {
                                                    if (pcase_var.eql($COST)) {
                                                        cost = value;
                                                    } else {
                                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                            expected_expansions = value;
                                                        } else {
                                                            if (pcase_var.eql($SUPPLANTS)) {
                                                                supplants = value;
                                                            } else {
                                                                Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt152);
                        }
                    }
                }
                {
                    SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                    rkf_uttrdr_register_parser(category, pmd);
                }
            }
            {
                SubLObject name = NIL;
                SubLObject category = NIL;
                SubLObject entry_point = NIL;
                SubLObject docstring = NIL;
                SubLObject cost = NIL;
                SubLObject quality = NIL;
                SubLObject expected_expansions = NIL;
                SubLObject supplants = NIL;
                SubLObject cdolist_list_var = $list_alt162;
                SubLObject curr = NIL;
                for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                    {
                        SubLObject datum = curr;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NAME)) {
                                    name = value;
                                } else {
                                    if (pcase_var.eql($CATEGORY)) {
                                        category = value;
                                    } else {
                                        if (pcase_var.eql($ENTRY_POINT)) {
                                            entry_point = value;
                                        } else {
                                            if (pcase_var.eql($DOC)) {
                                                docstring = value;
                                            } else {
                                                if (pcase_var.eql($QUALITY)) {
                                                    quality = value;
                                                } else {
                                                    if (pcase_var.eql($COST)) {
                                                        cost = value;
                                                    } else {
                                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                            expected_expansions = value;
                                                        } else {
                                                            if (pcase_var.eql($SUPPLANTS)) {
                                                                supplants = value;
                                                            } else {
                                                                Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt152);
                        }
                    }
                }
                {
                    SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                    rkf_uttrdr_register_parser(category, pmd);
                }
            }
            {
                SubLObject name = NIL;
                SubLObject category = NIL;
                SubLObject entry_point = NIL;
                SubLObject docstring = NIL;
                SubLObject cost = NIL;
                SubLObject quality = NIL;
                SubLObject expected_expansions = NIL;
                SubLObject supplants = NIL;
                SubLObject cdolist_list_var = $list_alt163;
                SubLObject curr = NIL;
                for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                    {
                        SubLObject datum = curr;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NAME)) {
                                    name = value;
                                } else {
                                    if (pcase_var.eql($CATEGORY)) {
                                        category = value;
                                    } else {
                                        if (pcase_var.eql($ENTRY_POINT)) {
                                            entry_point = value;
                                        } else {
                                            if (pcase_var.eql($DOC)) {
                                                docstring = value;
                                            } else {
                                                if (pcase_var.eql($QUALITY)) {
                                                    quality = value;
                                                } else {
                                                    if (pcase_var.eql($COST)) {
                                                        cost = value;
                                                    } else {
                                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                            expected_expansions = value;
                                                        } else {
                                                            if (pcase_var.eql($SUPPLANTS)) {
                                                                supplants = value;
                                                            } else {
                                                                Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt152);
                        }
                    }
                }
                {
                    SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                    rkf_uttrdr_register_parser(category, pmd);
                }
            }
            {
                SubLObject name = NIL;
                SubLObject category = NIL;
                SubLObject entry_point = NIL;
                SubLObject docstring = NIL;
                SubLObject cost = NIL;
                SubLObject quality = NIL;
                SubLObject expected_expansions = NIL;
                SubLObject supplants = NIL;
                SubLObject cdolist_list_var = $list_alt164;
                SubLObject curr = NIL;
                for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                    {
                        SubLObject datum = curr;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NAME)) {
                                    name = value;
                                } else {
                                    if (pcase_var.eql($CATEGORY)) {
                                        category = value;
                                    } else {
                                        if (pcase_var.eql($ENTRY_POINT)) {
                                            entry_point = value;
                                        } else {
                                            if (pcase_var.eql($DOC)) {
                                                docstring = value;
                                            } else {
                                                if (pcase_var.eql($QUALITY)) {
                                                    quality = value;
                                                } else {
                                                    if (pcase_var.eql($COST)) {
                                                        cost = value;
                                                    } else {
                                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                            expected_expansions = value;
                                                        } else {
                                                            if (pcase_var.eql($SUPPLANTS)) {
                                                                supplants = value;
                                                            } else {
                                                                Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt152);
                        }
                    }
                }
                {
                    SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                    rkf_uttrdr_register_parser(category, pmd);
                }
            }
            {
                SubLObject name = NIL;
                SubLObject category = NIL;
                SubLObject entry_point = NIL;
                SubLObject docstring = NIL;
                SubLObject cost = NIL;
                SubLObject quality = NIL;
                SubLObject expected_expansions = NIL;
                SubLObject supplants = NIL;
                SubLObject cdolist_list_var = $list_alt165;
                SubLObject curr = NIL;
                for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                    {
                        SubLObject datum = curr;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NAME)) {
                                    name = value;
                                } else {
                                    if (pcase_var.eql($CATEGORY)) {
                                        category = value;
                                    } else {
                                        if (pcase_var.eql($ENTRY_POINT)) {
                                            entry_point = value;
                                        } else {
                                            if (pcase_var.eql($DOC)) {
                                                docstring = value;
                                            } else {
                                                if (pcase_var.eql($QUALITY)) {
                                                    quality = value;
                                                } else {
                                                    if (pcase_var.eql($COST)) {
                                                        cost = value;
                                                    } else {
                                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                            expected_expansions = value;
                                                        } else {
                                                            if (pcase_var.eql($SUPPLANTS)) {
                                                                supplants = value;
                                                            } else {
                                                                Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt152);
                        }
                    }
                }
                {
                    SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                    rkf_uttrdr_register_parser(category, pmd);
                }
            }
            {
                SubLObject name = NIL;
                SubLObject category = NIL;
                SubLObject entry_point = NIL;
                SubLObject docstring = NIL;
                SubLObject cost = NIL;
                SubLObject quality = NIL;
                SubLObject expected_expansions = NIL;
                SubLObject supplants = NIL;
                SubLObject cdolist_list_var = $list_alt166;
                SubLObject curr = NIL;
                for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                    {
                        SubLObject datum = curr;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NAME)) {
                                    name = value;
                                } else {
                                    if (pcase_var.eql($CATEGORY)) {
                                        category = value;
                                    } else {
                                        if (pcase_var.eql($ENTRY_POINT)) {
                                            entry_point = value;
                                        } else {
                                            if (pcase_var.eql($DOC)) {
                                                docstring = value;
                                            } else {
                                                if (pcase_var.eql($QUALITY)) {
                                                    quality = value;
                                                } else {
                                                    if (pcase_var.eql($COST)) {
                                                        cost = value;
                                                    } else {
                                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                            expected_expansions = value;
                                                        } else {
                                                            if (pcase_var.eql($SUPPLANTS)) {
                                                                supplants = value;
                                                            } else {
                                                                Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt152);
                        }
                    }
                }
                {
                    SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                    rkf_uttrdr_register_parser(category, pmd);
                }
            }
            {
                SubLObject name = NIL;
                SubLObject category = NIL;
                SubLObject entry_point = NIL;
                SubLObject docstring = NIL;
                SubLObject cost = NIL;
                SubLObject quality = NIL;
                SubLObject expected_expansions = NIL;
                SubLObject supplants = NIL;
                SubLObject cdolist_list_var = $list_alt167;
                SubLObject curr = NIL;
                for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                    {
                        SubLObject datum = curr;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NAME)) {
                                    name = value;
                                } else {
                                    if (pcase_var.eql($CATEGORY)) {
                                        category = value;
                                    } else {
                                        if (pcase_var.eql($ENTRY_POINT)) {
                                            entry_point = value;
                                        } else {
                                            if (pcase_var.eql($DOC)) {
                                                docstring = value;
                                            } else {
                                                if (pcase_var.eql($QUALITY)) {
                                                    quality = value;
                                                } else {
                                                    if (pcase_var.eql($COST)) {
                                                        cost = value;
                                                    } else {
                                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                            expected_expansions = value;
                                                        } else {
                                                            if (pcase_var.eql($SUPPLANTS)) {
                                                                supplants = value;
                                                            } else {
                                                                Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt152);
                        }
                    }
                }
                {
                    SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                    rkf_uttrdr_register_parser(category, pmd);
                }
            }
            {
                SubLObject name = NIL;
                SubLObject category = NIL;
                SubLObject entry_point = NIL;
                SubLObject docstring = NIL;
                SubLObject cost = NIL;
                SubLObject quality = NIL;
                SubLObject expected_expansions = NIL;
                SubLObject supplants = NIL;
                SubLObject cdolist_list_var = $list_alt168;
                SubLObject curr = NIL;
                for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                    {
                        SubLObject datum = curr;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NAME)) {
                                    name = value;
                                } else {
                                    if (pcase_var.eql($CATEGORY)) {
                                        category = value;
                                    } else {
                                        if (pcase_var.eql($ENTRY_POINT)) {
                                            entry_point = value;
                                        } else {
                                            if (pcase_var.eql($DOC)) {
                                                docstring = value;
                                            } else {
                                                if (pcase_var.eql($QUALITY)) {
                                                    quality = value;
                                                } else {
                                                    if (pcase_var.eql($COST)) {
                                                        cost = value;
                                                    } else {
                                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                            expected_expansions = value;
                                                        } else {
                                                            if (pcase_var.eql($SUPPLANTS)) {
                                                                supplants = value;
                                                            } else {
                                                                Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt152);
                        }
                    }
                }
                {
                    SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                    rkf_uttrdr_register_parser(category, pmd);
                }
            }
            {
                SubLObject name = NIL;
                SubLObject category = NIL;
                SubLObject entry_point = NIL;
                SubLObject docstring = NIL;
                SubLObject cost = NIL;
                SubLObject quality = NIL;
                SubLObject expected_expansions = NIL;
                SubLObject supplants = NIL;
                SubLObject cdolist_list_var = $list_alt169;
                SubLObject curr = NIL;
                for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                    {
                        SubLObject datum = curr;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NAME)) {
                                    name = value;
                                } else {
                                    if (pcase_var.eql($CATEGORY)) {
                                        category = value;
                                    } else {
                                        if (pcase_var.eql($ENTRY_POINT)) {
                                            entry_point = value;
                                        } else {
                                            if (pcase_var.eql($DOC)) {
                                                docstring = value;
                                            } else {
                                                if (pcase_var.eql($QUALITY)) {
                                                    quality = value;
                                                } else {
                                                    if (pcase_var.eql($COST)) {
                                                        cost = value;
                                                    } else {
                                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                            expected_expansions = value;
                                                        } else {
                                                            if (pcase_var.eql($SUPPLANTS)) {
                                                                supplants = value;
                                                            } else {
                                                                Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt152);
                        }
                    }
                }
                {
                    SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                    rkf_uttrdr_register_parser(category, pmd);
                }
            }
            {
                SubLObject name = NIL;
                SubLObject category = NIL;
                SubLObject entry_point = NIL;
                SubLObject docstring = NIL;
                SubLObject cost = NIL;
                SubLObject quality = NIL;
                SubLObject expected_expansions = NIL;
                SubLObject supplants = NIL;
                SubLObject cdolist_list_var = $list_alt170;
                SubLObject curr = NIL;
                for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                    {
                        SubLObject datum = curr;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NAME)) {
                                    name = value;
                                } else {
                                    if (pcase_var.eql($CATEGORY)) {
                                        category = value;
                                    } else {
                                        if (pcase_var.eql($ENTRY_POINT)) {
                                            entry_point = value;
                                        } else {
                                            if (pcase_var.eql($DOC)) {
                                                docstring = value;
                                            } else {
                                                if (pcase_var.eql($QUALITY)) {
                                                    quality = value;
                                                } else {
                                                    if (pcase_var.eql($COST)) {
                                                        cost = value;
                                                    } else {
                                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                            expected_expansions = value;
                                                        } else {
                                                            if (pcase_var.eql($SUPPLANTS)) {
                                                                supplants = value;
                                                            } else {
                                                                Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt152);
                        }
                    }
                }
                {
                    SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                    rkf_uttrdr_register_parser(category, pmd);
                }
            }
            {
                SubLObject name = NIL;
                SubLObject category = NIL;
                SubLObject entry_point = NIL;
                SubLObject docstring = NIL;
                SubLObject cost = NIL;
                SubLObject quality = NIL;
                SubLObject expected_expansions = NIL;
                SubLObject supplants = NIL;
                SubLObject cdolist_list_var = $list_alt171;
                SubLObject curr = NIL;
                for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                    {
                        SubLObject datum = curr;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NAME)) {
                                    name = value;
                                } else {
                                    if (pcase_var.eql($CATEGORY)) {
                                        category = value;
                                    } else {
                                        if (pcase_var.eql($ENTRY_POINT)) {
                                            entry_point = value;
                                        } else {
                                            if (pcase_var.eql($DOC)) {
                                                docstring = value;
                                            } else {
                                                if (pcase_var.eql($QUALITY)) {
                                                    quality = value;
                                                } else {
                                                    if (pcase_var.eql($COST)) {
                                                        cost = value;
                                                    } else {
                                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                            expected_expansions = value;
                                                        } else {
                                                            if (pcase_var.eql($SUPPLANTS)) {
                                                                supplants = value;
                                                            } else {
                                                                Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt152);
                        }
                    }
                }
                {
                    SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                    rkf_uttrdr_register_parser(category, pmd);
                }
            }
            {
                SubLObject name = NIL;
                SubLObject category = NIL;
                SubLObject entry_point = NIL;
                SubLObject docstring = NIL;
                SubLObject cost = NIL;
                SubLObject quality = NIL;
                SubLObject expected_expansions = NIL;
                SubLObject supplants = NIL;
                SubLObject cdolist_list_var = $list_alt172;
                SubLObject curr = NIL;
                for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                    {
                        SubLObject datum = curr;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NAME)) {
                                    name = value;
                                } else {
                                    if (pcase_var.eql($CATEGORY)) {
                                        category = value;
                                    } else {
                                        if (pcase_var.eql($ENTRY_POINT)) {
                                            entry_point = value;
                                        } else {
                                            if (pcase_var.eql($DOC)) {
                                                docstring = value;
                                            } else {
                                                if (pcase_var.eql($QUALITY)) {
                                                    quality = value;
                                                } else {
                                                    if (pcase_var.eql($COST)) {
                                                        cost = value;
                                                    } else {
                                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                            expected_expansions = value;
                                                        } else {
                                                            if (pcase_var.eql($SUPPLANTS)) {
                                                                supplants = value;
                                                            } else {
                                                                Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt152);
                        }
                    }
                }
                {
                    SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                    rkf_uttrdr_register_parser(category, pmd);
                }
            }
            {
                SubLObject name = NIL;
                SubLObject category = NIL;
                SubLObject entry_point = NIL;
                SubLObject docstring = NIL;
                SubLObject cost = NIL;
                SubLObject quality = NIL;
                SubLObject expected_expansions = NIL;
                SubLObject supplants = NIL;
                SubLObject cdolist_list_var = $list_alt173;
                SubLObject curr = NIL;
                for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                    {
                        SubLObject datum = curr;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NAME)) {
                                    name = value;
                                } else {
                                    if (pcase_var.eql($CATEGORY)) {
                                        category = value;
                                    } else {
                                        if (pcase_var.eql($ENTRY_POINT)) {
                                            entry_point = value;
                                        } else {
                                            if (pcase_var.eql($DOC)) {
                                                docstring = value;
                                            } else {
                                                if (pcase_var.eql($QUALITY)) {
                                                    quality = value;
                                                } else {
                                                    if (pcase_var.eql($COST)) {
                                                        cost = value;
                                                    } else {
                                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                            expected_expansions = value;
                                                        } else {
                                                            if (pcase_var.eql($SUPPLANTS)) {
                                                                supplants = value;
                                                            } else {
                                                                Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt152);
                        }
                    }
                }
                {
                    SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                    rkf_uttrdr_register_parser(category, pmd);
                }
            }
            {
                SubLObject name = NIL;
                SubLObject category = NIL;
                SubLObject entry_point = NIL;
                SubLObject docstring = NIL;
                SubLObject cost = NIL;
                SubLObject quality = NIL;
                SubLObject expected_expansions = NIL;
                SubLObject supplants = NIL;
                SubLObject cdolist_list_var = $list_alt174;
                SubLObject curr = NIL;
                for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                    {
                        SubLObject datum = curr;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NAME)) {
                                    name = value;
                                } else {
                                    if (pcase_var.eql($CATEGORY)) {
                                        category = value;
                                    } else {
                                        if (pcase_var.eql($ENTRY_POINT)) {
                                            entry_point = value;
                                        } else {
                                            if (pcase_var.eql($DOC)) {
                                                docstring = value;
                                            } else {
                                                if (pcase_var.eql($QUALITY)) {
                                                    quality = value;
                                                } else {
                                                    if (pcase_var.eql($COST)) {
                                                        cost = value;
                                                    } else {
                                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                            expected_expansions = value;
                                                        } else {
                                                            if (pcase_var.eql($SUPPLANTS)) {
                                                                supplants = value;
                                                            } else {
                                                                Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt152);
                        }
                    }
                }
                {
                    SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                    rkf_uttrdr_register_parser(category, pmd);
                }
            }
            {
                SubLObject name = NIL;
                SubLObject category = NIL;
                SubLObject entry_point = NIL;
                SubLObject docstring = NIL;
                SubLObject cost = NIL;
                SubLObject quality = NIL;
                SubLObject expected_expansions = NIL;
                SubLObject supplants = NIL;
                SubLObject cdolist_list_var = $list_alt175;
                SubLObject curr = NIL;
                for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                    {
                        SubLObject datum = curr;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt152);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = key;
                                if (pcase_var.eql($NAME)) {
                                    name = value;
                                } else {
                                    if (pcase_var.eql($CATEGORY)) {
                                        category = value;
                                    } else {
                                        if (pcase_var.eql($ENTRY_POINT)) {
                                            entry_point = value;
                                        } else {
                                            if (pcase_var.eql($DOC)) {
                                                docstring = value;
                                            } else {
                                                if (pcase_var.eql($QUALITY)) {
                                                    quality = value;
                                                } else {
                                                    if (pcase_var.eql($COST)) {
                                                        cost = value;
                                                    } else {
                                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                                            expected_expansions = value;
                                                        } else {
                                                            if (pcase_var.eql($SUPPLANTS)) {
                                                                supplants = value;
                                                            } else {
                                                                Errors.error($str_alt149$Invalid_key__S_in_parser_module_r, key);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt152);
                        }
                    }
                }
                {
                    SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
                    rkf_uttrdr_register_parser(category, pmd);
                }
            }
            register_cyc_api_function(PARSE_A_SENTENCE_COMPLETELY, $list_alt210, $str_alt211$This_function_returns_all_the_dec, $list_alt212, $list_alt213);
            register_cyc_api_function(PARSE_A_QUESTION_COMPLETELY, $list_alt210, $str_alt217$This_function_returns_all_the_que, $list_alt212, $list_alt213);
        }
        return NIL;
    }

    public static SubLObject setup_rkf_text_processors_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_parse_result$.getGlobalValue(), symbol_function(PARSE_RESULT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list15);
        def_csetf(PARSE_RESULT_ORIGINAL, _CSETF_PARSE_RESULT_ORIGINAL);
        def_csetf(PARSE_RESULT_CONSTITUENTS, _CSETF_PARSE_RESULT_CONSTITUENTS);
        def_csetf(PARSE_RESULT_ELIMINATED, _CSETF_PARSE_RESULT_ELIMINATED);
        def_csetf(PARSE_RESULT_PROBLEMS, _CSETF_PARSE_RESULT_PROBLEMS);
        def_csetf(PARSE_RESULT_SOLUTIONS, _CSETF_PARSE_RESULT_SOLUTIONS);
        identity(PARSE_RESULT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_parse_result$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PARSE_RESULT_METHOD));
        declare_defglobal($rkf_terms_forager_lock$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_parse_module_definition$.getGlobalValue(), symbol_function(PARSE_MODULE_DEFINITION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list78);
        def_csetf(PMD_NAME, _CSETF_PMD_NAME);
        def_csetf(PMD_CATEGORY, _CSETF_PMD_CATEGORY);
        def_csetf(PMD_QUALITY, _CSETF_PMD_QUALITY);
        def_csetf(PMD_ENTRY_POINT, _CSETF_PMD_ENTRY_POINT);
        def_csetf(PMD_COST, _CSETF_PMD_COST);
        def_csetf(PMD_EXPECTED_EXPANSIONS, _CSETF_PMD_EXPECTED_EXPANSIONS);
        def_csetf(PMD_SUPPLANTS, _CSETF_PMD_SUPPLANTS);
        identity(PARSE_MODULE_DEFINITION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_parse_module_definition$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PARSE_MODULE_DEFINITION_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_parse_module_group$.getGlobalValue(), symbol_function(PARSE_MODULE_GROUP_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list115);
        def_csetf(PMG_CATEGORY, _CSETF_PMG_CATEGORY);
        def_csetf(PMG_TOOLS, _CSETF_PMG_TOOLS);
        identity(PARSE_MODULE_GROUP);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_parse_module_group$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PARSE_MODULE_GROUP_METHOD));
        declare_defglobal($rkf_uttrdr_known_parsers$);
        register_html_state_variable($rkf_uttrdr_psp_return_mode$);
        rkf_uttrdr_deregister_all_parsers();
        SubLObject name = NIL;
        SubLObject category = NIL;
        SubLObject entry_point = NIL;
        SubLObject docstring = NIL;
        SubLObject cost = NIL;
        SubLObject quality = NIL;
        SubLObject expected_expansions = NIL;
        SubLObject supplants = NIL;
        SubLObject cdolist_list_var = $list162;
        SubLObject curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list161);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list161);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql($NAME)) {
                    name = value;
                } else {
                    if (pcase_var.eql($CATEGORY)) {
                        category = value;
                    } else {
                        if (pcase_var.eql($ENTRY_POINT)) {
                            entry_point = value;
                        } else {
                            if (pcase_var.eql($DOC)) {
                                docstring = value;
                            } else {
                                if (pcase_var.eql($QUALITY)) {
                                    quality = value;
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        cost = value;
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            expected_expansions = value;
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                supplants = value;
                                            } else {
                                                Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = NIL;
        category = NIL;
        entry_point = NIL;
        docstring = NIL;
        cost = NIL;
        quality = NIL;
        expected_expansions = NIL;
        supplants = NIL;
        cdolist_list_var = $list163;
        curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list161);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list161);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql($NAME)) {
                    name = value;
                } else {
                    if (pcase_var.eql($CATEGORY)) {
                        category = value;
                    } else {
                        if (pcase_var.eql($ENTRY_POINT)) {
                            entry_point = value;
                        } else {
                            if (pcase_var.eql($DOC)) {
                                docstring = value;
                            } else {
                                if (pcase_var.eql($QUALITY)) {
                                    quality = value;
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        cost = value;
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            expected_expansions = value;
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                supplants = value;
                                            } else {
                                                Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = NIL;
        category = NIL;
        entry_point = NIL;
        docstring = NIL;
        cost = NIL;
        quality = NIL;
        expected_expansions = NIL;
        supplants = NIL;
        cdolist_list_var = $list164;
        curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list161);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list161);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql($NAME)) {
                    name = value;
                } else {
                    if (pcase_var.eql($CATEGORY)) {
                        category = value;
                    } else {
                        if (pcase_var.eql($ENTRY_POINT)) {
                            entry_point = value;
                        } else {
                            if (pcase_var.eql($DOC)) {
                                docstring = value;
                            } else {
                                if (pcase_var.eql($QUALITY)) {
                                    quality = value;
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        cost = value;
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            expected_expansions = value;
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                supplants = value;
                                            } else {
                                                Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = NIL;
        category = NIL;
        entry_point = NIL;
        docstring = NIL;
        cost = NIL;
        quality = NIL;
        expected_expansions = NIL;
        supplants = NIL;
        cdolist_list_var = $list165;
        curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list161);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list161);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql($NAME)) {
                    name = value;
                } else {
                    if (pcase_var.eql($CATEGORY)) {
                        category = value;
                    } else {
                        if (pcase_var.eql($ENTRY_POINT)) {
                            entry_point = value;
                        } else {
                            if (pcase_var.eql($DOC)) {
                                docstring = value;
                            } else {
                                if (pcase_var.eql($QUALITY)) {
                                    quality = value;
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        cost = value;
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            expected_expansions = value;
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                supplants = value;
                                            } else {
                                                Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = NIL;
        category = NIL;
        entry_point = NIL;
        docstring = NIL;
        cost = NIL;
        quality = NIL;
        expected_expansions = NIL;
        supplants = NIL;
        cdolist_list_var = $list166;
        curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list161);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list161);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql($NAME)) {
                    name = value;
                } else {
                    if (pcase_var.eql($CATEGORY)) {
                        category = value;
                    } else {
                        if (pcase_var.eql($ENTRY_POINT)) {
                            entry_point = value;
                        } else {
                            if (pcase_var.eql($DOC)) {
                                docstring = value;
                            } else {
                                if (pcase_var.eql($QUALITY)) {
                                    quality = value;
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        cost = value;
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            expected_expansions = value;
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                supplants = value;
                                            } else {
                                                Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = NIL;
        category = NIL;
        entry_point = NIL;
        docstring = NIL;
        cost = NIL;
        quality = NIL;
        expected_expansions = NIL;
        supplants = NIL;
        cdolist_list_var = $list167;
        curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list161);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list161);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql($NAME)) {
                    name = value;
                } else {
                    if (pcase_var.eql($CATEGORY)) {
                        category = value;
                    } else {
                        if (pcase_var.eql($ENTRY_POINT)) {
                            entry_point = value;
                        } else {
                            if (pcase_var.eql($DOC)) {
                                docstring = value;
                            } else {
                                if (pcase_var.eql($QUALITY)) {
                                    quality = value;
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        cost = value;
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            expected_expansions = value;
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                supplants = value;
                                            } else {
                                                Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = NIL;
        category = NIL;
        entry_point = NIL;
        docstring = NIL;
        cost = NIL;
        quality = NIL;
        expected_expansions = NIL;
        supplants = NIL;
        cdolist_list_var = $list168;
        curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list161);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list161);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql($NAME)) {
                    name = value;
                } else {
                    if (pcase_var.eql($CATEGORY)) {
                        category = value;
                    } else {
                        if (pcase_var.eql($ENTRY_POINT)) {
                            entry_point = value;
                        } else {
                            if (pcase_var.eql($DOC)) {
                                docstring = value;
                            } else {
                                if (pcase_var.eql($QUALITY)) {
                                    quality = value;
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        cost = value;
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            expected_expansions = value;
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                supplants = value;
                                            } else {
                                                Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = NIL;
        category = NIL;
        entry_point = NIL;
        docstring = NIL;
        cost = NIL;
        quality = NIL;
        expected_expansions = NIL;
        supplants = NIL;
        cdolist_list_var = $list169;
        curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list161);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list161);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql($NAME)) {
                    name = value;
                } else {
                    if (pcase_var.eql($CATEGORY)) {
                        category = value;
                    } else {
                        if (pcase_var.eql($ENTRY_POINT)) {
                            entry_point = value;
                        } else {
                            if (pcase_var.eql($DOC)) {
                                docstring = value;
                            } else {
                                if (pcase_var.eql($QUALITY)) {
                                    quality = value;
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        cost = value;
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            expected_expansions = value;
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                supplants = value;
                                            } else {
                                                Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = NIL;
        category = NIL;
        entry_point = NIL;
        docstring = NIL;
        cost = NIL;
        quality = NIL;
        expected_expansions = NIL;
        supplants = NIL;
        cdolist_list_var = $list170;
        curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list161);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list161);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql($NAME)) {
                    name = value;
                } else {
                    if (pcase_var.eql($CATEGORY)) {
                        category = value;
                    } else {
                        if (pcase_var.eql($ENTRY_POINT)) {
                            entry_point = value;
                        } else {
                            if (pcase_var.eql($DOC)) {
                                docstring = value;
                            } else {
                                if (pcase_var.eql($QUALITY)) {
                                    quality = value;
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        cost = value;
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            expected_expansions = value;
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                supplants = value;
                                            } else {
                                                Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = NIL;
        category = NIL;
        entry_point = NIL;
        docstring = NIL;
        cost = NIL;
        quality = NIL;
        expected_expansions = NIL;
        supplants = NIL;
        cdolist_list_var = $list171;
        curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list161);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list161);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql($NAME)) {
                    name = value;
                } else {
                    if (pcase_var.eql($CATEGORY)) {
                        category = value;
                    } else {
                        if (pcase_var.eql($ENTRY_POINT)) {
                            entry_point = value;
                        } else {
                            if (pcase_var.eql($DOC)) {
                                docstring = value;
                            } else {
                                if (pcase_var.eql($QUALITY)) {
                                    quality = value;
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        cost = value;
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            expected_expansions = value;
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                supplants = value;
                                            } else {
                                                Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = NIL;
        category = NIL;
        entry_point = NIL;
        docstring = NIL;
        cost = NIL;
        quality = NIL;
        expected_expansions = NIL;
        supplants = NIL;
        cdolist_list_var = $list172;
        curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list161);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list161);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql($NAME)) {
                    name = value;
                } else {
                    if (pcase_var.eql($CATEGORY)) {
                        category = value;
                    } else {
                        if (pcase_var.eql($ENTRY_POINT)) {
                            entry_point = value;
                        } else {
                            if (pcase_var.eql($DOC)) {
                                docstring = value;
                            } else {
                                if (pcase_var.eql($QUALITY)) {
                                    quality = value;
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        cost = value;
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            expected_expansions = value;
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                supplants = value;
                                            } else {
                                                Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = NIL;
        category = NIL;
        entry_point = NIL;
        docstring = NIL;
        cost = NIL;
        quality = NIL;
        expected_expansions = NIL;
        supplants = NIL;
        cdolist_list_var = $list173;
        curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list161);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list161);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql($NAME)) {
                    name = value;
                } else {
                    if (pcase_var.eql($CATEGORY)) {
                        category = value;
                    } else {
                        if (pcase_var.eql($ENTRY_POINT)) {
                            entry_point = value;
                        } else {
                            if (pcase_var.eql($DOC)) {
                                docstring = value;
                            } else {
                                if (pcase_var.eql($QUALITY)) {
                                    quality = value;
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        cost = value;
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            expected_expansions = value;
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                supplants = value;
                                            } else {
                                                Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = NIL;
        category = NIL;
        entry_point = NIL;
        docstring = NIL;
        cost = NIL;
        quality = NIL;
        expected_expansions = NIL;
        supplants = NIL;
        cdolist_list_var = $list174;
        curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list161);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list161);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql($NAME)) {
                    name = value;
                } else {
                    if (pcase_var.eql($CATEGORY)) {
                        category = value;
                    } else {
                        if (pcase_var.eql($ENTRY_POINT)) {
                            entry_point = value;
                        } else {
                            if (pcase_var.eql($DOC)) {
                                docstring = value;
                            } else {
                                if (pcase_var.eql($QUALITY)) {
                                    quality = value;
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        cost = value;
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            expected_expansions = value;
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                supplants = value;
                                            } else {
                                                Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = NIL;
        category = NIL;
        entry_point = NIL;
        docstring = NIL;
        cost = NIL;
        quality = NIL;
        expected_expansions = NIL;
        supplants = NIL;
        cdolist_list_var = $list175;
        curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list161);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list161);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql($NAME)) {
                    name = value;
                } else {
                    if (pcase_var.eql($CATEGORY)) {
                        category = value;
                    } else {
                        if (pcase_var.eql($ENTRY_POINT)) {
                            entry_point = value;
                        } else {
                            if (pcase_var.eql($DOC)) {
                                docstring = value;
                            } else {
                                if (pcase_var.eql($QUALITY)) {
                                    quality = value;
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        cost = value;
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            expected_expansions = value;
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                supplants = value;
                                            } else {
                                                Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = NIL;
        category = NIL;
        entry_point = NIL;
        docstring = NIL;
        cost = NIL;
        quality = NIL;
        expected_expansions = NIL;
        supplants = NIL;
        cdolist_list_var = $list176;
        curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list161);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list161);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql($NAME)) {
                    name = value;
                } else {
                    if (pcase_var.eql($CATEGORY)) {
                        category = value;
                    } else {
                        if (pcase_var.eql($ENTRY_POINT)) {
                            entry_point = value;
                        } else {
                            if (pcase_var.eql($DOC)) {
                                docstring = value;
                            } else {
                                if (pcase_var.eql($QUALITY)) {
                                    quality = value;
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        cost = value;
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            expected_expansions = value;
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                supplants = value;
                                            } else {
                                                Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = NIL;
        category = NIL;
        entry_point = NIL;
        docstring = NIL;
        cost = NIL;
        quality = NIL;
        expected_expansions = NIL;
        supplants = NIL;
        cdolist_list_var = $list177;
        curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list161);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list161);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql($NAME)) {
                    name = value;
                } else {
                    if (pcase_var.eql($CATEGORY)) {
                        category = value;
                    } else {
                        if (pcase_var.eql($ENTRY_POINT)) {
                            entry_point = value;
                        } else {
                            if (pcase_var.eql($DOC)) {
                                docstring = value;
                            } else {
                                if (pcase_var.eql($QUALITY)) {
                                    quality = value;
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        cost = value;
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            expected_expansions = value;
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                supplants = value;
                                            } else {
                                                Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = NIL;
        category = NIL;
        entry_point = NIL;
        docstring = NIL;
        cost = NIL;
        quality = NIL;
        expected_expansions = NIL;
        supplants = NIL;
        cdolist_list_var = $list178;
        curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list161);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list161);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql($NAME)) {
                    name = value;
                } else {
                    if (pcase_var.eql($CATEGORY)) {
                        category = value;
                    } else {
                        if (pcase_var.eql($ENTRY_POINT)) {
                            entry_point = value;
                        } else {
                            if (pcase_var.eql($DOC)) {
                                docstring = value;
                            } else {
                                if (pcase_var.eql($QUALITY)) {
                                    quality = value;
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        cost = value;
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            expected_expansions = value;
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                supplants = value;
                                            } else {
                                                Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = NIL;
        category = NIL;
        entry_point = NIL;
        docstring = NIL;
        cost = NIL;
        quality = NIL;
        expected_expansions = NIL;
        supplants = NIL;
        cdolist_list_var = $list179;
        curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list161);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list161);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql($NAME)) {
                    name = value;
                } else {
                    if (pcase_var.eql($CATEGORY)) {
                        category = value;
                    } else {
                        if (pcase_var.eql($ENTRY_POINT)) {
                            entry_point = value;
                        } else {
                            if (pcase_var.eql($DOC)) {
                                docstring = value;
                            } else {
                                if (pcase_var.eql($QUALITY)) {
                                    quality = value;
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        cost = value;
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            expected_expansions = value;
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                supplants = value;
                                            } else {
                                                Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = NIL;
        category = NIL;
        entry_point = NIL;
        docstring = NIL;
        cost = NIL;
        quality = NIL;
        expected_expansions = NIL;
        supplants = NIL;
        cdolist_list_var = $list180;
        curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list161);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list161);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql($NAME)) {
                    name = value;
                } else {
                    if (pcase_var.eql($CATEGORY)) {
                        category = value;
                    } else {
                        if (pcase_var.eql($ENTRY_POINT)) {
                            entry_point = value;
                        } else {
                            if (pcase_var.eql($DOC)) {
                                docstring = value;
                            } else {
                                if (pcase_var.eql($QUALITY)) {
                                    quality = value;
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        cost = value;
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            expected_expansions = value;
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                supplants = value;
                                            } else {
                                                Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = NIL;
        category = NIL;
        entry_point = NIL;
        docstring = NIL;
        cost = NIL;
        quality = NIL;
        expected_expansions = NIL;
        supplants = NIL;
        cdolist_list_var = $list181;
        curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list161);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list161);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql($NAME)) {
                    name = value;
                } else {
                    if (pcase_var.eql($CATEGORY)) {
                        category = value;
                    } else {
                        if (pcase_var.eql($ENTRY_POINT)) {
                            entry_point = value;
                        } else {
                            if (pcase_var.eql($DOC)) {
                                docstring = value;
                            } else {
                                if (pcase_var.eql($QUALITY)) {
                                    quality = value;
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        cost = value;
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            expected_expansions = value;
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                supplants = value;
                                            } else {
                                                Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = NIL;
        category = NIL;
        entry_point = NIL;
        docstring = NIL;
        cost = NIL;
        quality = NIL;
        expected_expansions = NIL;
        supplants = NIL;
        cdolist_list_var = $list182;
        curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list161);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list161);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql($NAME)) {
                    name = value;
                } else {
                    if (pcase_var.eql($CATEGORY)) {
                        category = value;
                    } else {
                        if (pcase_var.eql($ENTRY_POINT)) {
                            entry_point = value;
                        } else {
                            if (pcase_var.eql($DOC)) {
                                docstring = value;
                            } else {
                                if (pcase_var.eql($QUALITY)) {
                                    quality = value;
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        cost = value;
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            expected_expansions = value;
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                supplants = value;
                                            } else {
                                                Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = NIL;
        category = NIL;
        entry_point = NIL;
        docstring = NIL;
        cost = NIL;
        quality = NIL;
        expected_expansions = NIL;
        supplants = NIL;
        cdolist_list_var = $list183;
        curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list161);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list161);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql($NAME)) {
                    name = value;
                } else {
                    if (pcase_var.eql($CATEGORY)) {
                        category = value;
                    } else {
                        if (pcase_var.eql($ENTRY_POINT)) {
                            entry_point = value;
                        } else {
                            if (pcase_var.eql($DOC)) {
                                docstring = value;
                            } else {
                                if (pcase_var.eql($QUALITY)) {
                                    quality = value;
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        cost = value;
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            expected_expansions = value;
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                supplants = value;
                                            } else {
                                                Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = NIL;
        category = NIL;
        entry_point = NIL;
        docstring = NIL;
        cost = NIL;
        quality = NIL;
        expected_expansions = NIL;
        supplants = NIL;
        cdolist_list_var = $list184;
        curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list161);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list161);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql($NAME)) {
                    name = value;
                } else {
                    if (pcase_var.eql($CATEGORY)) {
                        category = value;
                    } else {
                        if (pcase_var.eql($ENTRY_POINT)) {
                            entry_point = value;
                        } else {
                            if (pcase_var.eql($DOC)) {
                                docstring = value;
                            } else {
                                if (pcase_var.eql($QUALITY)) {
                                    quality = value;
                                } else {
                                    if (pcase_var.eql($COST)) {
                                        cost = value;
                                    } else {
                                        if (pcase_var.eql($EXPECTED_EXPANSIONS)) {
                                            expected_expansions = value;
                                        } else {
                                            if (pcase_var.eql($SUPPLANTS)) {
                                                supplants = value;
                                            } else {
                                                Errors.error($str158$Invalid_key__S_in_parser_module_r, key);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        register_cyc_api_function(PARSE_A_SENTENCE_COMPLETELY, $list218, $str219$This_function_returns_all_the_dec, $list220, $list221);
        register_cyc_api_function(PARSE_A_QUESTION_COMPLETELY, $list218, $str225$This_function_returns_all_the_que, $list220, $list221);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_text_processors_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_text_processors_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_text_processors_file();
    }

    

    public static final class $parse_result_native extends SubLStructNative {
        public SubLObject $original;

        public SubLObject $constituents;

        public SubLObject $eliminated;

        public SubLObject $problems;

        public SubLObject $solutions;

        private static final SubLStructDeclNative structDecl;

        public $parse_result_native() {
            rkf_text_processors.$parse_result_native.this.$original = Lisp.NIL;
            rkf_text_processors.$parse_result_native.this.$constituents = Lisp.NIL;
            rkf_text_processors.$parse_result_native.this.$eliminated = Lisp.NIL;
            rkf_text_processors.$parse_result_native.this.$problems = Lisp.NIL;
            rkf_text_processors.$parse_result_native.this.$solutions = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return rkf_text_processors.$parse_result_native.this.$original;
        }

        @Override
        public SubLObject getField3() {
            return rkf_text_processors.$parse_result_native.this.$constituents;
        }

        @Override
        public SubLObject getField4() {
            return rkf_text_processors.$parse_result_native.this.$eliminated;
        }

        @Override
        public SubLObject getField5() {
            return rkf_text_processors.$parse_result_native.this.$problems;
        }

        @Override
        public SubLObject getField6() {
            return rkf_text_processors.$parse_result_native.this.$solutions;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return rkf_text_processors.$parse_result_native.this.$original = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return rkf_text_processors.$parse_result_native.this.$constituents = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return rkf_text_processors.$parse_result_native.this.$eliminated = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return rkf_text_processors.$parse_result_native.this.$problems = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return rkf_text_processors.$parse_result_native.this.$solutions = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rkf_text_processors.$parse_result_native.class, PARSE_RESULT, PARSE_RESULT_P, $list9, $list10, new String[]{ "$original", "$constituents", "$eliminated", "$problems", "$solutions" }, $list11, $list12, PRINT_PARSE_RESULT);
        }
    }

    public static final class $parse_result_p$UnaryFunction extends UnaryFunction {
        public $parse_result_p$UnaryFunction() {
            super(extractFunctionNamed("PARSE-RESULT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return parse_result_p(arg1);
        }
    }

    public static final class $parse_module_definition_native extends SubLStructNative {
        public SubLObject $name;

        public SubLObject $category;

        public SubLObject $quality;

        public SubLObject $entry_point;

        public SubLObject $cost;

        public SubLObject $expected_expansions;

        public SubLObject $supplants;

        private static final SubLStructDeclNative structDecl;

        public $parse_module_definition_native() {
            rkf_text_processors.$parse_module_definition_native.this.$name = Lisp.NIL;
            rkf_text_processors.$parse_module_definition_native.this.$category = Lisp.NIL;
            rkf_text_processors.$parse_module_definition_native.this.$quality = Lisp.NIL;
            rkf_text_processors.$parse_module_definition_native.this.$entry_point = Lisp.NIL;
            rkf_text_processors.$parse_module_definition_native.this.$cost = Lisp.NIL;
            rkf_text_processors.$parse_module_definition_native.this.$expected_expansions = Lisp.NIL;
            rkf_text_processors.$parse_module_definition_native.this.$supplants = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return rkf_text_processors.$parse_module_definition_native.this.$name;
        }

        @Override
        public SubLObject getField3() {
            return rkf_text_processors.$parse_module_definition_native.this.$category;
        }

        @Override
        public SubLObject getField4() {
            return rkf_text_processors.$parse_module_definition_native.this.$quality;
        }

        @Override
        public SubLObject getField5() {
            return rkf_text_processors.$parse_module_definition_native.this.$entry_point;
        }

        @Override
        public SubLObject getField6() {
            return rkf_text_processors.$parse_module_definition_native.this.$cost;
        }

        @Override
        public SubLObject getField7() {
            return rkf_text_processors.$parse_module_definition_native.this.$expected_expansions;
        }

        @Override
        public SubLObject getField8() {
            return rkf_text_processors.$parse_module_definition_native.this.$supplants;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return rkf_text_processors.$parse_module_definition_native.this.$name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return rkf_text_processors.$parse_module_definition_native.this.$category = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return rkf_text_processors.$parse_module_definition_native.this.$quality = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return rkf_text_processors.$parse_module_definition_native.this.$entry_point = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return rkf_text_processors.$parse_module_definition_native.this.$cost = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return rkf_text_processors.$parse_module_definition_native.this.$expected_expansions = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return rkf_text_processors.$parse_module_definition_native.this.$supplants = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rkf_text_processors.$parse_module_definition_native.class, PARSE_MODULE_DEFINITION, PARSE_MODULE_DEFINITION_P, $list72, $list73, new String[]{ "$name", "$category", "$quality", "$entry_point", "$cost", "$expected_expansions", "$supplants" }, $list74, $list75, PMD_PRINT);
        }
    }

    public static final class $parse_module_definition_p$UnaryFunction extends UnaryFunction {
        public $parse_module_definition_p$UnaryFunction() {
            super(extractFunctionNamed("PARSE-MODULE-DEFINITION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return parse_module_definition_p(arg1);
        }
    }

    public static final class $parse_module_group_native extends SubLStructNative {
        public SubLObject $category;

        public SubLObject $tools;

        private static final SubLStructDeclNative structDecl;

        public $parse_module_group_native() {
            rkf_text_processors.$parse_module_group_native.this.$category = Lisp.NIL;
            rkf_text_processors.$parse_module_group_native.this.$tools = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return rkf_text_processors.$parse_module_group_native.this.$category;
        }

        @Override
        public SubLObject getField3() {
            return rkf_text_processors.$parse_module_group_native.this.$tools;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return rkf_text_processors.$parse_module_group_native.this.$category = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return rkf_text_processors.$parse_module_group_native.this.$tools = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rkf_text_processors.$parse_module_group_native.class, PARSE_MODULE_GROUP, PARSE_MODULE_GROUP_P, $list109, $list110, new String[]{ "$category", "$tools" }, $list111, $list112, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $parse_module_group_p$UnaryFunction extends UnaryFunction {
        public $parse_module_group_p$UnaryFunction() {
            super(extractFunctionNamed("PARSE-MODULE-GROUP-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return parse_module_group_p(arg1);
        }
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("SPAN"), makeSymbol("INTERPRETATIONS"));

    static private final SubLList $list_alt2 = list(list(makeSymbol("*RKF-TEXT-PROC-RESOLVE-PARSES*"), T));

    static private final SubLString $str_alt4$Exceeded_recursion_depth__S_for_R = makeString("Exceeded recursion depth ~S for RESOLVE-PARSE-INTERPRETATION while parsing~% ~S");

    static private final SubLList $list_alt6 = cons(makeSymbol("OUT"), makeSymbol("IN"));

    static private final SubLList $list_alt9 = list(makeSymbol("ORIGINAL"), makeSymbol("CONSTITUENTS"), makeSymbol("ELIMINATED"), makeSymbol("PROBLEMS"), makeSymbol("SOLUTIONS"));

    static private final SubLList $list_alt10 = list(makeKeyword("ORIGINAL"), makeKeyword("CONSTITUENTS"), makeKeyword("ELIMINATED"), makeKeyword("PROBLEMS"), makeKeyword("SOLUTIONS"));

    static private final SubLList $list_alt11 = list(makeSymbol("PARSE-RESULT-ORIGINAL"), makeSymbol("PARSE-RESULT-CONSTITUENTS"), makeSymbol("PARSE-RESULT-ELIMINATED"), makeSymbol("PARSE-RESULT-PROBLEMS"), makeSymbol("PARSE-RESULT-SOLUTIONS"));

    static private final SubLList $list_alt12 = list(makeSymbol("_CSETF-PARSE-RESULT-ORIGINAL"), makeSymbol("_CSETF-PARSE-RESULT-CONSTITUENTS"), makeSymbol("_CSETF-PARSE-RESULT-ELIMINATED"), makeSymbol("_CSETF-PARSE-RESULT-PROBLEMS"), makeSymbol("_CSETF-PARSE-RESULT-SOLUTIONS"));

    static private final SubLString $str_alt30$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt31$__ = makeString("#<");

    static private final SubLList $list_alt34 = list(list(makeSymbol("*RKF-TEXTPROC-PRINT-PARSE-RESULT-TERSELY*"), NIL));

    static private final SubLString $str_alt36$__Original______S__ = makeString("~&Original:~%  ~S~%");

    static private final SubLString $str_alt41$___A___ = makeString("~&~A:~%");

    static private final SubLString $str_alt42$__none____ = makeString("  none~%~%");

    static private final SubLString $str_alt43$___S______S____ = makeString("  ~S~%   ~S~%~%");

    static private final SubLList $list_alt44 = list(list(makeSymbol("*RKF-UTTRDR-ALLOW-NLTAGS?*"), NIL));

    static private final SubLList $list_alt45 = list(list(makeSymbol("*RKF-UTTRDR-FULL-SPANS-ONLY?*"), T));

    static private final SubLList $list_alt46 = list(list(makeSymbol("*RKF-UTTRDR-FULL-SPANS-ONLY?*"), NIL));

    static private final SubLList $list_alt54 = list(reader_make_constant_shell("NPTemplate"), reader_make_constant_shell("NBarTemplate"), reader_make_constant_shell("AdjPTemplate"));

    static private final SubLList $list_alt55 = list(list(reader_make_constant_shell("CycLSentence-Assertible"), reader_make_constant_shell("STemplate")), list(reader_make_constant_shell("SubLString"), reader_make_constant_shell("StringTemplate")), list(reader_make_constant_shell("ScalarInterval"), reader_make_constant_shell("NPTemplate")), list(reader_make_constant_shell("Plan-ExpectedSituationType"), reader_make_constant_shell("InfinitivalVPTemplate"), reader_make_constant_shell("InfinitivalVBarTemplate"), reader_make_constant_shell("NBarTemplate"), reader_make_constant_shell("NPTemplate")));

    static private final SubLList $list_alt57 = list(list(makeSymbol("*PMG-ORDERING*"), makeKeyword("QUALITY")));

    static private final SubLSymbol $sym60$TIME_INTERVAL_ = makeSymbol("TIME-INTERVAL?");

    static private final SubLList $list_alt66 = list(makeSymbol("RKF-CH-NOUN-COMPOUND-PHRASES"), makeSymbol("RKF-CH-MULTI-WORD-DENOTATION"), makeSymbol("RKF-CH-DENOTS-OF-STRING"));

    static private final SubLList $list_alt69 = list(makeSymbol("NAME"), makeSymbol("CATEGORY"), makeSymbol("QUALITY"), makeSymbol("ENTRY-POINT"), makeSymbol("COST"), makeSymbol("EXPECTED-EXPANSIONS"), makeSymbol("SUPPLANTS"));

    static private final SubLList $list_alt70 = list($NAME, makeKeyword("CATEGORY"), makeKeyword("QUALITY"), makeKeyword("ENTRY-POINT"), $COST, makeKeyword("EXPECTED-EXPANSIONS"), makeKeyword("SUPPLANTS"));

    static private final SubLList $list_alt71 = list(makeSymbol("PMD-NAME"), makeSymbol("PMD-CATEGORY"), makeSymbol("PMD-QUALITY"), makeSymbol("PMD-ENTRY-POINT"), makeSymbol("PMD-COST"), makeSymbol("PMD-EXPECTED-EXPANSIONS"), makeSymbol("PMD-SUPPLANTS"));

    static private final SubLList $list_alt72 = list(makeSymbol("_CSETF-PMD-NAME"), makeSymbol("_CSETF-PMD-CATEGORY"), makeSymbol("_CSETF-PMD-QUALITY"), makeSymbol("_CSETF-PMD-ENTRY-POINT"), makeSymbol("_CSETF-PMD-COST"), makeSymbol("_CSETF-PMD-EXPECTED-EXPANSIONS"), makeSymbol("_CSETF-PMD-SUPPLANTS"));

    static private final SubLString $str_alt95$_PARSE_MODULE_DEFINITION__S_ = makeString("<PARSE-MODULE-DEFINITION ~S>");

    static private final SubLString $str_alt96$Can_t_resolve_quality_of__S_ = makeString("Can't resolve quality of ~S.");

    static private final SubLString $str_alt97$Parser__S_for__S__Func___S_Heur__ = makeString("Parser ~S for ~S  Func: ~S Heur: ");

    static private final SubLString $str_alt98$___Suppl__S_ = makeString("// Suppl ~S ");

    static private final SubLString $str_alt99$Class__D____Qual__D____Cost__D___ = makeString("Class ~D // Qual ~D // Cost ~D // Expn ~D ");

    static private final SubLList $list_alt103 = list(makeSymbol("CATEGORY"), makeSymbol("TOOLS"));

    static private final SubLList $list_alt104 = list(makeKeyword("CATEGORY"), makeKeyword("TOOLS"));

    static private final SubLList $list_alt105 = list(makeSymbol("PMG-CATEGORY"), makeSymbol("PMG-TOOLS"));

    static private final SubLList $list_alt106 = list(makeSymbol("_CSETF-PMG-CATEGORY"), makeSymbol("_CSETF-PMG-TOOLS"));

    static private final SubLSymbol $sym114$PMD_EXPECTED_EXPANSIONS_ = makeSymbol("PMD-EXPECTED-EXPANSIONS<");

    static private final SubLSymbol $sym115$PMD_COST_ = makeSymbol("PMD-COST<");

    static private final SubLSymbol $sym116$PMD_QUALITY_ = makeSymbol("PMD-QUALITY<");

    static private final SubLString $str_alt117$__Parse_Group_for__S___ = makeString("~&Parse Group for ~S.~%");

    static private final SubLString $str_alt118$Tools__in_order______ = makeString("Tools (in order):~%  ");

    static private final SubLList $list_alt124 = list(makeSymbol("*RKF-UTTRDR-KNOWN-PARSERS-LOCK*"));

    static private final SubLSymbol $sym125$RKF_UTTRDR_PMD_ORDERED_ = makeSymbol("RKF-UTTRDR-PMD-ORDERED?");

    static private final SubLString $str_alt126$No_known_parsers_for_category__S_ = makeString("No known parsers for category ~S.~%");

    static private final SubLList $list_alt128 = list(makeSymbol("KEYS"));

    static private final SubLSymbol $sym129$PMD = makeUninternedSymbol("PMD");

    static private final SubLSymbol $sym130$CURR = makeUninternedSymbol("CURR");

    static private final SubLSymbol $sym131$KEY = makeUninternedSymbol("KEY");

    static private final SubLSymbol $sym132$VALUE = makeUninternedSymbol("VALUE");

    static private final SubLSymbol $sym133$NAME = makeUninternedSymbol("NAME");

    static private final SubLSymbol $sym134$CATEGORY = makeUninternedSymbol("CATEGORY");

    static private final SubLSymbol $sym135$ENTRY_POINT = makeUninternedSymbol("ENTRY-POINT");

    static private final SubLSymbol $sym136$DOCSTRING = makeUninternedSymbol("DOCSTRING");

    static private final SubLSymbol $sym137$COST = makeUninternedSymbol("COST");

    static private final SubLSymbol $sym138$QUALITY = makeUninternedSymbol("QUALITY");

    static private final SubLSymbol $sym139$EXPECTED_EXPANSIONS = makeUninternedSymbol("EXPECTED-EXPANSIONS");

    static private final SubLSymbol $sym140$SUPPLANTS = makeUninternedSymbol("SUPPLANTS");

    static private final SubLString $str_alt149$Invalid_key__S_in_parser_module_r = makeString("Invalid key ~S in parser-module-registration.");

    static private final SubLList $list_alt152 = list(makeUninternedSymbol("KEY"), makeUninternedSymbol("VALUE"));

    static private final SubLList $list_alt153 = list(list($NAME, makeKeyword("TEMPLATE-PARSE")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("STemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), list(makeKeyword("DOC"), makeString("The preferred parser for all sentence level constructions.")), list(makeKeyword("QUALITY"), ONE_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), list(makeKeyword("NPP"), makeKeyword("VPP"))));

    static private final SubLList $list_alt154 = list(list($NAME, makeKeyword("TEMPLATE-PARSE")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("ImperativeTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), list(makeKeyword("DOC"), makeString("The preferred parser for all sentence level constructions.")), list(makeKeyword("QUALITY"), ONE_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), list(makeKeyword("NPP"), makeKeyword("VPP"))));

    static private final SubLList $list_alt155 = list(list($NAME, makeKeyword("TEMPLATE-PARSE")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("TemporalModifierTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), list(makeKeyword("DOC"), makeString("interpretations of temporal modifiers")), list(makeKeyword("QUALITY"), ONE_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list_alt156 = list(list($NAME, makeKeyword("TEMPLATE-PARSER")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("NPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), list(makeKeyword("DOC"), makeString("Handles some NPPs in templates and calls through to :npp where needed.")), list(makeKeyword("QUALITY"), TEN_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list_alt157 = list(list($NAME, makeKeyword("TEMPLATE-PARSER")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("PossessiveTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), list(makeKeyword("DOC"), makeString("Handles some NPPs in templates and calls through to :npp where needed.")), list(makeKeyword("QUALITY"), TEN_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list_alt158 = list(list($NAME, makeKeyword("TEMPLATE-PARSER")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("DateTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), list(makeKeyword("DOC"), makeString("Handles some NPPs in templates and calls through to :npp where \nneeded.")), list(makeKeyword("QUALITY"), TEN_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list_alt159 = list(list($NAME, makeKeyword("NPP")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("NPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-NOUN-PHRASE-PARSER")), list(makeKeyword("DOC"), makeString("does all real noun phrases, but will not get nbars")), list(makeKeyword("QUALITY"), makeSymbol("PMD-NPP-QUALITY")), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list_alt160 = list(list($NAME, makeKeyword("NCP")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("NBarTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-NOUN-COMPOUND-PARSER")), list(makeKeyword("DOC"), makeString("gets noun compound nbars as well")), list(makeKeyword("QUALITY"), TEN_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list_alt161 = list(list($NAME, makeKeyword("NCLEX")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("NPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-NOUN-COMPOUND-LEXICON")), list(makeKeyword("DOC"), makeString("looks up noun compounds in the lexicon")), list(makeKeyword("QUALITY"), ONE_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list_alt162 = list(list($NAME, makeKeyword("MWD")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("NPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-MULTI-WORD-DENOTATIONS")), list(makeKeyword("DOC"), makeString("uses multi-word denotations to interpret parse results")), list(makeKeyword("QUALITY"), TWO_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list_alt163 = list(list($NAME, makeKeyword("DENOTS")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("NPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-DENOTS-OF-STRING")), list(makeKeyword("DOC"), makeString("uses string denotation assertions to interpret parse results")), list(makeKeyword("QUALITY"), FIVE_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), SIX_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list_alt164 = list(list($NAME, makeKeyword("NUMBERS")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("NPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-NUMBER-PARSER")), list(makeKeyword("DOC"), makeString("uses number parser to interpret parse results")), list(makeKeyword("QUALITY"), TWO_INTEGER), list($COST, TWENTY_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list_alt165 = list(list($NAME, makeKeyword("LISP-TERM-READ")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("NPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-READ-CYCL-TERM-FROM-STRING")), list(makeKeyword("DOC"), makeString("uses lisp 'read' to read a CycL term")), list(makeKeyword("QUALITY"), THREE_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), ONE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list_alt166 = list(list($NAME, makeKeyword("STRING-READ")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("StringTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-READ-AS-STRING")), list(makeKeyword("DOC"), makeString("returns the string you sent in")), list(makeKeyword("QUALITY"), TEN_INTEGER), list($COST, ONE_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), ONE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list_alt167 = list(list($NAME, makeKeyword("PSP")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("InfinitivalVBarTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-PARSE-INF-VBAR")), list(makeKeyword("DOC"), makeString("uses PSP to parse infinitival vbars like 'eat doughnuts'")), list(makeKeyword("QUALITY"), TEN_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list_alt168 = list(list($NAME, makeKeyword("PSP")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("InfinitivalVPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-PARSE-INF-VBAR")), list(makeKeyword("DOC"), makeString("uses PSP to parse infinitival VPs like 'eat doughnuts'")), list(makeKeyword("QUALITY"), TEN_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list_alt169 = list(list($NAME, makeKeyword("DENOTS")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("AdjPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-DENOTS-OF-STRING")), list(makeKeyword("DOC"), makeString("uses string denotation assertions to interpret parse results")), list(makeKeyword("QUALITY"), TWO_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list_alt170 = list(list($NAME, makeKeyword("NCLEX")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("AdjPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-NOUN-COMPOUND-LEXICON")), list(makeKeyword("DOC"), makeString("looks up noun compounds in the lexicon")), list(makeKeyword("QUALITY"), THREE_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list_alt171 = list(list($NAME, makeKeyword("MWD")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("AdjPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-MULTI-WORD-DENOTATIONS")), list(makeKeyword("DOC"), makeString("uses multi-word denotations to interpret parse results")), list(makeKeyword("QUALITY"), FOUR_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list_alt172 = list(list($NAME, makeKeyword("LISP-TERM-READ")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("AdjPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-READ-CYCL-TERM-FROM-STRING")), list(makeKeyword("DOC"), makeString("uses lisp 'read' to read a CycL term")), list(makeKeyword("QUALITY"), THREE_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), ONE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list_alt173 = list(list($NAME, makeKeyword("TEMPLATE-PARSE")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("AdjPTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), list(makeKeyword("DOC"), makeString("The preferred parser for all sentence level constructions.")), list(makeKeyword("QUALITY"), FIVE_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), NIL));

    static private final SubLList $list_alt174 = list(list($NAME, makeKeyword("TEMPLATE-PARSE")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("QuestionTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), list(makeKeyword("DOC"), makeString("The preferred parser for all sentence level constructions.")), list(makeKeyword("QUALITY"), ONE_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), list(makeKeyword("NPP"), makeKeyword("VPP"))));

    static private final SubLList $list_alt175 = list(list($NAME, makeKeyword("TEMPLATE-PARSE")), list(makeKeyword("CATEGORY"), reader_make_constant_shell("ScenarioTemplate")), list(makeKeyword("ENTRY-POINT"), makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), list(makeKeyword("DOC"), makeString("The preferred parser for all scenario descriptions")), list(makeKeyword("QUALITY"), ONE_INTEGER), list($COST, TEN_INTEGER), list(makeKeyword("EXPECTED-EXPANSIONS"), THREE_INTEGER), list(makeKeyword("SUPPLANTS"), list(makeKeyword("NPP"), makeKeyword("VPP"))));

    static private final SubLList $list_alt182 = list(makeSymbol("PARSE-SPAN"), makeSymbol("INTERPRETATION"));

    static private final SubLString $str_alt184$RKF_UTTRDR_MARKER = makeString("RKF-UTTRDR-MARKER");

    static private final SubLList $list_alt190 = list(makeSymbol("RELATIVE-SPAN"), makeSymbol("INTERPRETATIONS"));

    static private final SubLSymbol $sym191$IS_THIS_A_NUMERIC_SPAN_ = makeSymbol("IS-THIS-A-NUMERIC-SPAN?");

    static private final SubLSymbol $sym192$IS_THIS_A_QUANT_FN_ = makeSymbol("IS-THIS-A-QUANT-FN?");

    static private final SubLList $list_alt193 = list(makeSymbol("SPAN"), makeSymbol("PROBLEMS"));

    static private final SubLList $list_alt194 = list(makeSymbol("SURROGATE"), makeSymbol("INTERPRETATION"));

    static private final SubLList $list_alt196 = list(makeSymbol("FUNCTOR"), makeSymbol("STRING"), makeSymbol("SPAN"), makeSymbol("CATEGORY"), makeSymbol("CONSTRAINT"));

    static private final SubLList $list_alt197 = list(makeSymbol("INTERPRETATION"), makeSymbol("SPAN"));

    static private final SubLSymbol $sym198$HLMT_ = makeSymbol("HLMT?");

    public static final SubLSymbol $kw202$WFF_CHECK_ = makeKeyword("WFF-CHECK?");

    static private final SubLString $str_alt208$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLList $list_alt210 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("PROPERTIES"));

    static private final SubLString $str_alt211$This_function_returns_all_the_dec = makeString("This function returns all the declarative (statement) parses for a given sentence.  It returns full \n   CycL sentences, but does no wff-checking of the results.\n   @param SENTENCE string\n   @param MT microtheory\n   @param PROPERTIES property-listp");

    static private final SubLList $list_alt212 = list(list(makeSymbol("SENTENCE"), makeSymbol("STRINGP")), list(makeSymbol("MT"), makeSymbol("HLMT?")), list(makeSymbol("PROPERTIES"), makeSymbol("PROPERTY-LIST-P")));

    static private final SubLList $list_alt213 = list(makeSymbol("LISTP"));

    static private final SubLString $str_alt214$_ = makeString("?");

    static private final SubLString $str_alt217$This_function_returns_all_the_que = makeString("This function returns all the question parses for a given sentence.  It returns full CycL sentences,\n   but does no wff-checking of the results.\n   @param SENTENCE string\n   @param MT microtheory\n   @param PROPERTIES property-list-p");

    static private final SubLString $str_alt218$RTP_is_not_initialized___So__test = makeString("RTP is not initialized.  So, tests for PARSE-A-SENTENCE-COMPLETELY will not be run.");

    static private final SubLString $str_alt219$RTP_is_not_initialized___So__test = makeString("RTP is not initialized.  So, tests for PARSE-A-QUESTION-COMPLETELY will not be run.");
}

/**
 * Total time: 1876 ms
 */
